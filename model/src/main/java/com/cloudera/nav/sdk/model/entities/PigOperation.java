package com.cloudera.nav.sdk.model.entities;

import com.cloudera.nav.sdk.model.SourceType;
import com.cloudera.nav.sdk.model.annotations.MClass;

@MClass(model="pig_operation", validTypes = {EntityType.OPERATION})
public class PigOperation extends Entity {

  public PigOperation() {
    setSourceType(SourceType.PIG);
    setEntityType(EntityType.OPERATION);
  }

  public PigOperation(String logicalPlanHash, String jobName) {
    this();
    setLogicalPlanHash(logicalPlanHash);
    setJobName(jobName);
  }

  public PigOperation(String id) {
    this();
    setIdentity(id);
  }
}