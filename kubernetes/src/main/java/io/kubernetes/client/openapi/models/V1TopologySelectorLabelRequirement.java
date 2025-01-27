/*
Copyright 2023 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A topology selector requirement is a selector that matches given label. This is an alpha feature and may change in the future.
 */
@ApiModel(description = "A topology selector requirement is a selector that matches given label. This is an alpha feature and may change in the future.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-23T16:24:37.468Z[Etc/UTC]")
public class V1TopologySelectorLabelRequirement {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private List<String> values = new ArrayList<>();


  public V1TopologySelectorLabelRequirement key(String key) {

    this.key = key;
    return this;
  }

   /**
   * The label key that the selector applies to.
   * @return key
  **/
  @ApiModelProperty(required = true, value = "The label key that the selector applies to.")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public V1TopologySelectorLabelRequirement values(List<String> values) {

    this.values = values;
    return this;
  }

  public V1TopologySelectorLabelRequirement addValuesItem(String valuesItem) {
    this.values.add(valuesItem);
    return this;
  }

   /**
   * An array of string values. One value must match the label to be selected. Each entry in Values is ORed.
   * @return values
  **/
  @ApiModelProperty(required = true, value = "An array of string values. One value must match the label to be selected. Each entry in Values is ORed.")

  public List<String> getValues() {
    return values;
  }


  public void setValues(List<String> values) {
    this.values = values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1TopologySelectorLabelRequirement v1TopologySelectorLabelRequirement = (V1TopologySelectorLabelRequirement) o;
    return Objects.equals(this.key, v1TopologySelectorLabelRequirement.key) &&
        Objects.equals(this.values, v1TopologySelectorLabelRequirement.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, values);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1TopologySelectorLabelRequirement {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
