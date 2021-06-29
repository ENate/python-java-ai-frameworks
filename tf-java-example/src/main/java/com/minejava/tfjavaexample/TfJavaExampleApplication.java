package com.minejava.tfjavaexample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.tensorflow.ConcreteFunction;
import org.tensorflow.Signature;
import org.tensorflow.Tensor;
import org.tensorflow.TensorFlow;
import org.tensorflow.op.Ops;
import org.tensorflow.op.core.Placeholder;
import org.tensorflow.types.TInt32;
import org.tensorflow.op.math.Add;

@SpringBootApplication
public class TfJavaExampleApplication {

	private static final Logger logger = LoggerFactory.getLogger(TfJavaExampleApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(TfJavaExampleApplication.class, args);
		logger.info("TENSORFLOW VERSION {}", (Object) TensorFlow.version());
		try (ConcreteFunction dbl = ConcreteFunction.create(TfJavaExampleApplication::dbl);
				TInt32 x = TInt32.scalarOf(10);
				Tensor dblX = dbl.call(x)) {
			logger.info("Doubling the value of x gives: {}", (Object) x.getInt());
			logger.info("{}", (Object) ((TInt32) dblX).getInt());
		}

	}

	private static Signature dbl(Ops tf) {
		Placeholder<TInt32> x = tf.placeholder(TInt32.class);
		Add<TInt32> dblX = tf.math.add(x, x);
		return Signature.builder().input("x", x).output("dbl", dblX).build();
	}

}
