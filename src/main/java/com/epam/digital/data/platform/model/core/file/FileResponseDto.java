/*
 * Copyright 2023 EPAM Systems.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.epam.digital.data.platform.model.core.file;

public class FileResponseDto {

  private String content;
  private String checksum;
  private String filename;

  public FileResponseDto() {
  }

  public FileResponseDto(String content, String checksum, String filename) {
    this.content = content;
    this.checksum = checksum;
    this.filename = filename;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getChecksum() {
    return checksum;
  }

  public void setChecksum(String checksum) {
    this.checksum = checksum;
  }

  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }
}
