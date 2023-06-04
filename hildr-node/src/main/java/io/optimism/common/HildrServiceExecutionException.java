/*
 * Copyright 2023 281165273grape@gmail.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package io.optimism.common;

/**
 * The type HildrServiceExecutionException.
 *
 * @author grapebaba
 * @since 0.1.0
 */
public class HildrServiceExecutionException extends RuntimeException {

  /**
   * Instantiates a new Hildr service execution exception.
   *
   * @param message the message
   */
  public HildrServiceExecutionException(String message) {
    super(message);
  }

  /**
   * Instantiates a new Hildr service execution exception.
   *
   * @param message the message
   * @param cause the cause
   */
  public HildrServiceExecutionException(String message, Throwable cause) {
    super(message, cause);
  }

  /**
   * Instantiates a new Hildr service execution exception.
   *
   * @param cause the cause
   */
  public HildrServiceExecutionException(Throwable cause) {
    super(cause);
  }
}
