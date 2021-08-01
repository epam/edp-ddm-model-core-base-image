package com.epam.digital.data.platform.model.core.kafka;

import java.util.Objects;

public class File {

  private String id;
  private String checksum;

  public File() {
  }

  public File(String id, String checksum) {
    this.id = id;
    this.checksum = checksum;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getChecksum() {
    return checksum;
  }

  public void setChecksum(String checksum) {
    this.checksum = checksum;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    File file = (File) o;
    return Objects.equals(id, file.id) && Objects.equals(checksum, file.checksum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, checksum);
  }

  @Override
  public String toString() {
    return "File{" + "id='" + id + '\'' + ", checksum='" + checksum + '\'' + '}';
  }
}
