package com.epam.digital.data.platform.model.core.xmladapter;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

class LocalDateXmlAdapterTest {

  private static final LocalDate PROCESSED_DATE =
      LocalDate.of(2021, 5, 6);
  private static final String DATE_STRING = "2021-05-06";

  private final LocalDateXmlAdapter adapter = new LocalDateXmlAdapter();

  @Test
  void shouldMarshalInFormatIfDateNotNull() {
    String actual = adapter.marshal(PROCESSED_DATE);
    assertEquals(DATE_STRING, actual);
  }

  @Test
  void shouldMarshalNullIfDateNull() {
    String actual = adapter.marshal(null);
    assertNull(actual);
  }

  @Test
  void shouldUnmarshalInFormatIfValidString() {
    LocalDate actual = adapter.unmarshal(DATE_STRING);
    assertEquals(PROCESSED_DATE, actual);
  }

  @Test
  void shouldUnmarshalNullIfDateNull() {
    LocalDate actual = adapter.unmarshal(null);
    assertNull(actual);
  }

  @Test
  void shouldThrowExceptionOnUnmarshalIfInvalidInput() {
    assertThrows(DateTimeParseException.class, () -> adapter.unmarshal("str"));
  }
}
