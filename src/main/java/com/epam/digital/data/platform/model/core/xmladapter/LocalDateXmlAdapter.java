package com.epam.digital.data.platform.model.core.xmladapter;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateXmlAdapter extends XmlAdapter<String, LocalDate> {

  private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

  @Override
  public LocalDate unmarshal(String localDateStr) {
    return localDateStr == null ? null : LocalDate.parse(localDateStr, FORMATTER);
  }

  @Override
  public String marshal(LocalDate localDate) {
    return localDate == null ? null : localDate.format(FORMATTER);
  }
}
