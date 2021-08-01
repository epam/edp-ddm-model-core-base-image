package com.epam.digital.data.platform.model.core.kafka;

import java.util.Objects;
import java.util.UUID;

public class EntityId {

  private UUID id;

  public EntityId() {
  }

  public EntityId(UUID id) {
    this.id = id;
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    var entityId = (EntityId) o;
    return Objects.equals(id, entityId.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
}
