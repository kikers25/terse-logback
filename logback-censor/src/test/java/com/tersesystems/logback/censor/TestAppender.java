/*
 * SPDX-License-Identifier: CC0-1.0
 *
 * Copyright 2018-2020 Will Sargent.
 *
 * Licensed under the CC0 Public Domain Dedication;
 * You may obtain a copy of the License at
 *
 *  http://creativecommons.org/publicdomain/zero/1.0/
 */
package com.tersesystems.logback.censor;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.AppenderBase;
import ch.qos.logback.core.encoder.Encoder;
import java.util.ArrayList;
import java.util.List;

public class TestAppender extends AppenderBase<ILoggingEvent> {

  protected Encoder<ILoggingEvent> encoder;

  public static List<ILoggingEvent> events = new ArrayList<>();

  public Encoder<ILoggingEvent> getEncoder() {
    return encoder;
  }

  public void setEncoder(Encoder<ILoggingEvent> encoder) {
    this.encoder = encoder;
  }

  @Override
  protected void append(ILoggingEvent e) {
    events.add(e);
  }
}
