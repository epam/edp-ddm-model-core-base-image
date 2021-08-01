package com.epam.digital.data.platform.model.core.xmladapter;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeXmlAdapter extends XmlAdapter<String, LocalDateTime> {

  private static final DateTimeFormatter FORMATTER =
      DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");

  @Override
  public LocalDateTime unmarshal(String localDateTimeStr) {
    return localDateTimeStr == null ? null : LocalDateTime.parse(localDateTimeStr, FORMATTER);
  }

  @Override
  public String marshal(LocalDateTime localDateTime) {
    return localDateTime == null ? null : localDateTime.format(FORMATTER);
  }
}
