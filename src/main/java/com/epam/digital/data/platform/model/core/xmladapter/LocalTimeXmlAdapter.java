package com.epam.digital.data.platform.model.core.xmladapter;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeXmlAdapter extends XmlAdapter<String, LocalTime> {

  private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("HH:mm:ss");

  @Override
  public LocalTime unmarshal(String localTimeStr) {
    return localTimeStr == null ? null : LocalTime.parse(localTimeStr, FORMATTER);
  }

  @Override
  public String marshal(LocalTime localTime) {
    return localTime == null ? null : localTime.format(FORMATTER);
  }
}
