#ifndef BUBBLESORTALG_H
#define BUBBLESORTALG_H

namespace bubblesortalg {

    class BubbleSortAlg {

        private:
            int arrLength;
        public:
            BubbleSortAlg() = default;
            BubbleSortAlg(int arrLenArg);
            void mulArray(int* piStart);

    };
}

#endif