package com.minejava.cassandra.example.exampledatastay.config;

import org.springframework.context.annotation.Configuration;



@Configuration
public class CassandraDaoConfig {

    /**
     * Initialized {@link VisitReactiveDao} as a Spring Singleton.
     * It will hold the implementations of access to Cassandra DB
     */
    /*  @Bean
    public VisitReactiveDao visitDao(CqlSession cqlSession) {
        VisitReactiveDaoMapper visitMapper = new VisitReactiveDaoMapperBuilder(cqlSession).build();
        visitMapper.createSchema(cqlSession);
        VisitReactiveDao visitDao = visitMapper.visitDao(cqlSession.getKeyspace().get());
        return visitDao;
    } */
}
