package com.minejava.cassandra.example.exampledatastay.repository;

import com.datastax.dse.driver.api.mapper.reactive.MappedReactiveResultSet;
import com.datastax.oss.driver.api.mapper.annotations.Dao;
import com.datastax.oss.driver.api.mapper.annotations.Delete;
import com.datastax.oss.driver.api.mapper.annotations.Select;
import com.datastax.oss.driver.api.mapper.annotations.Update;
import com.minejava.cassandra.example.exampledatastay.domain.VisitEntity;
import com.datastax.dse.driver.api.core.cql.reactive.ReactiveResultSet;

import static com.minejava.cassandra.example.exampledatastay.domain.VisitEntity.VISIT_ATT_PET_ID;
import static com.minejava.cassandra.example.exampledatastay.domain.VisitEntity.VISIT_ATT_VISIT_ID;
import java.util.UUID;
/**
 * Definition of operations relative to table 'petclinic_visit_by_pet'.
 *
 * The DataStax Cassandra driver will generate the implementation at compile time.
 * More information can be found {@link https://docs.datastax.com/en/developer/java-driver/latest/manual/mapper/daos/select/#return-type}
 *
 * @author Me
 */
@Dao
public interface VisitReactiveDao {

    @Select
    MappedReactiveResultSet<VisitEntity> findAll();

    @Select(customWhereClause = VISIT_ATT_PET_ID + "= :petId")
    MappedReactiveResultSet<VisitEntity> findAllVisitsForAPet(UUID petId);

    /**
     * Find a visit from its unique identifier id.
     *
     * As pet is not the partition key and cardinality is low
     * we created a secondary index and `allowFiltering` is needed only as start up
     * before tables exist.
     */
    @Select(customWhereClause = VISIT_ATT_VISIT_ID + "= :visitId", allowFiltering = true)
    MappedReactiveResultSet<VisitEntity> findVisitById(UUID visitId);

    @Update
    ReactiveResultSet upsert(VisitEntity visit);

    @Delete
    ReactiveResultSet delete(VisitEntity visit);
}
