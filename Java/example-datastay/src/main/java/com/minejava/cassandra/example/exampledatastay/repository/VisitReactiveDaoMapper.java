package com.minejava.cassandra.example.exampledatastay.repository;

import com.datastax.oss.driver.api.core.CqlIdentifier;
import com.datastax.oss.driver.api.core.CqlSession;
import com.datastax.oss.driver.api.core.type.DataTypes;
import com.datastax.oss.driver.api.mapper.annotations.DaoFactory;
import com.datastax.oss.driver.api.mapper.annotations.DaoKeyspace;
import com.datastax.oss.driver.api.mapper.annotations.Mapper;
import static com.datastax.oss.driver.api.querybuilder.SchemaBuilder.createTable;
import static com.datastax.oss.driver.api.querybuilder.SchemaBuilder.createIndex;
import static com.minejava.cassandra.example.exampledatastay.domain.VisitEntity.VISIT_ATT_DESCRIPTION;
import static com.minejava.cassandra.example.exampledatastay.domain.VisitEntity.VISIT_ATT_PET_ID;
import static com.minejava.cassandra.example.exampledatastay.domain.VisitEntity.VISIT_ATT_VISIT_ID;
import static com.minejava.cassandra.example.exampledatastay.domain.VisitEntity.VISIT_TABLE;
import static com.minejava.cassandra.example.exampledatastay.domain.VisitEntity.VISIT_IDX_VISITID;
@Mapper
public interface VisitReactiveDaoMapper {
    @DaoFactory
    VisitReactiveDao visitDao(@DaoKeyspace CqlIdentifier keyspace);

    /**
     * Creating objects Table,Index for Visits.
     */
    default void createSchema(CqlSession cqlSession) {

        /**
         * CREATE TABLE IF NOT EXISTS petclinic_visit_by_pet (
         *  pet_id      uuid,
         *  visit_id    uuid,
         *  visit_date date,
         *  description text,
         *  PRIMARY KEY ((pet_id), visit_id));
         **/
        cqlSession.execute(
                createTable(VISIT_TABLE).ifNotExists()
                .withPartitionKey(VISIT_ATT_PET_ID, DataTypes.UUID)
                .withClusteringColumn(VISIT_ATT_VISIT_ID, DataTypes.UUID)
                .withColumn(VISIT_ATT_DESCRIPTION, DataTypes.TEXT)
                .build());

        /** Create a secondary index on visitId as cardinality is low. */
        cqlSession.execute(createIndex(VISIT_IDX_VISITID).ifNotExists()
                .onTable(VISIT_TABLE)
                .andColumn(VISIT_ATT_VISIT_ID)
                .build());
    }
}
