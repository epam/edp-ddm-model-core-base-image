package com.epam.digital.data.platform.model.core.kafka;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

public class Request<T> {

  @JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, property = "@class")
  private T payload;
  private RequestContext requestContext;
  private SecurityContext securityContext;

  public Request() {
  }

  public Request(T payload, SecurityContext securityContext) {
    this.payload = payload;
    this.securityContext = securityContext;
  }

  public Request(T payload,
      RequestContext requestContext,
      SecurityContext securityContext) {
    this.payload = payload;
    this.requestContext = requestContext;
    this.securityContext = securityContext;
  }

  public T getPayload() {
    return payload;
  }

  public void setPayload(T payload) {
    this.payload = payload;
  }

  public RequestContext getRequestContext() {
    return requestContext;
  }

  public void setRequestContext(RequestContext requestContext) {
    this.requestContext = requestContext;
  }

  public SecurityContext getSecurityContext() {
    return securityContext;
  }

  public void setSecurityContext(SecurityContext securityContext) {
    this.securityContext = securityContext;
  }
}
