package com.minejava.cassandra.example.exampledatastay.domain;

import java.io.Serializable;
import java.util.UUID;

import com.datastax.oss.driver.api.mapper.annotations.CqlName;
import com.datastax.oss.driver.api.mapper.annotations.Entity;
import com.datastax.oss.driver.api.mapper.annotations.PartitionKey;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@CqlName(VisitEntity.VISIT_TABLE)
public class VisitEntity implements Serializable {

     /** Serial. */
    private static final long serialVersionUID = -4289614095154632364L;

     /** Group constants. */
    public static final String VISIT_TABLE           = "petclinic_visit_by_pet";
    public static final String VISIT_ATT_PET_ID      = "pet_id";
    public static final String VISIT_ATT_VISIT_ID    = "visit_id";
    public static final String VISIT_ATT_DESCRIPTION = "description";
    public static final String VISIT_IDX_VISITID     = "petclinic_visit_by_pet_idx_visitid";


    @PartitionKey
    @CqlName(VISIT_ATT_PET_ID)
    private UUID petId;

    @PartitionKey
    @CqlName(VISIT_ATT_VISIT_ID)
    private UUID visitId;

    @PartitionKey
    @CqlName(VISIT_ATT_DESCRIPTION)
    private String description;

     /** Constructor for PetId and visitId */
    public VisitEntity(UUID visitId, UUID petId) {
        this.petId = petId;
        this.visitId = visitId;
    }

    public VisitEntity(String petId, String visitId) {
        this(UUID.fromString(petId), UUID.fromString(visitId));
    }

    /**
     * Getter accessor for attribute 'petId'.
     *
     * @return
     *       current value of 'petId'
     */
    public UUID getPetId() {
        return petId;
    }

    /**
     * Setter accessor for attribute 'petId'.
     * @param petId
     * 		new value for 'petId '
     */
    public void setPetId(UUID petId) {
        this.petId = petId;
    }

    /**
     * Getter accessor for attribute 'visitId'.
     *
     * @return
     *       current value of 'visitId'
     */
    public UUID getVisitId() {
        return visitId;
    }

    /**
     * Setter accessor for attribute 'visitId'.
     * @param visitId
     * 		new value for 'visitId '
     */
    public void setVisitId(UUID visitId) {
        this.visitId = visitId;
    }

    /**
     * Getter accessor for attribute 'description'.
     *
     * @return
     *       current value of 'description'
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter accessor for attribute 'description'.
     * @param description
     * 		new value for 'description '
     */
    public void setDescription(String description) {
        this.description = description;
    }


}
