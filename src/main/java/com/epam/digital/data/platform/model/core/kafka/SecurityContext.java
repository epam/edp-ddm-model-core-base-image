package com.epam.digital.data.platform.model.core.kafka;

import java.util.Objects;

public class SecurityContext {

  private String accessToken;
  private String digitalSignature;
  private String digitalSignatureDerived;

  private String digitalSignatureChecksum;
  private String digitalSignatureDerivedChecksum;

  public SecurityContext(){}

  public SecurityContext(
      String accessToken,
      String digitalSignature,
      String digitalSignatureDerived) {
    this.accessToken = accessToken;
    this.digitalSignature = digitalSignature;
    this.digitalSignatureDerived = digitalSignatureDerived;
  }

  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public String getDigitalSignature() {
    return digitalSignature;
  }

  public void setDigitalSignature(String digitalSignature) {
    this.digitalSignature = digitalSignature;
  }

  public String getDigitalSignatureDerived() {
    return digitalSignatureDerived;
  }

  public void setDigitalSignatureDerived(String digitalSignatureDerived) {
    this.digitalSignatureDerived = digitalSignatureDerived;
  }

  public String getDigitalSignatureChecksum() {
    return digitalSignatureChecksum;
  }

  public void setDigitalSignatureChecksum(String digitalSignatureChecksum) {
    this.digitalSignatureChecksum = digitalSignatureChecksum;
  }

  public String getDigitalSignatureDerivedChecksum() {
    return digitalSignatureDerivedChecksum;
  }

  public void setDigitalSignatureDerivedChecksum(String digitalSignatureDerivedChecksum) {
    this.digitalSignatureDerivedChecksum = digitalSignatureDerivedChecksum;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityContext that = (SecurityContext) o;
    return Objects.equals(accessToken, that.accessToken) && Objects
        .equals(digitalSignature, that.digitalSignature) && Objects
        .equals(digitalSignatureDerived, that.digitalSignatureDerived) && Objects
        .equals(digitalSignatureChecksum, that.digitalSignatureChecksum) && Objects
        .equals(digitalSignatureDerivedChecksum, that.digitalSignatureDerivedChecksum);
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(accessToken, digitalSignature, digitalSignatureDerived, digitalSignatureChecksum,
            digitalSignatureDerivedChecksum);
  }
}
