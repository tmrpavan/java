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
import io.kubernetes.client.openapi.models.V2CrossVersionObjectReference;
import io.kubernetes.client.openapi.models.V2MetricIdentifier;
import io.kubernetes.client.openapi.models.V2MetricValueStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ObjectMetricStatus indicates the current value of a metric describing a kubernetes object (for example, hits-per-second on an Ingress object).
 */
@ApiModel(description = "ObjectMetricStatus indicates the current value of a metric describing a kubernetes object (for example, hits-per-second on an Ingress object).")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-23T16:24:37.468Z[Etc/UTC]")
public class V2ObjectMetricStatus {
  public static final String SERIALIZED_NAME_CURRENT = "current";
  @SerializedName(SERIALIZED_NAME_CURRENT)
  private V2MetricValueStatus current;

  public static final String SERIALIZED_NAME_DESCRIBED_OBJECT = "describedObject";
  @SerializedName(SERIALIZED_NAME_DESCRIBED_OBJECT)
  private V2CrossVersionObjectReference describedObject;

  public static final String SERIALIZED_NAME_METRIC = "metric";
  @SerializedName(SERIALIZED_NAME_METRIC)
  private V2MetricIdentifier metric;


  public V2ObjectMetricStatus current(V2MetricValueStatus current) {

    this.current = current;
    return this;
  }

   /**
   * Get current
   * @return current
  **/
  @ApiModelProperty(required = true, value = "")

  public V2MetricValueStatus getCurrent() {
    return current;
  }


  public void setCurrent(V2MetricValueStatus current) {
    this.current = current;
  }


  public V2ObjectMetricStatus describedObject(V2CrossVersionObjectReference describedObject) {

    this.describedObject = describedObject;
    return this;
  }

   /**
   * Get describedObject
   * @return describedObject
  **/
  @ApiModelProperty(required = true, value = "")

  public V2CrossVersionObjectReference getDescribedObject() {
    return describedObject;
  }


  public void setDescribedObject(V2CrossVersionObjectReference describedObject) {
    this.describedObject = describedObject;
  }


  public V2ObjectMetricStatus metric(V2MetricIdentifier metric) {

    this.metric = metric;
    return this;
  }

   /**
   * Get metric
   * @return metric
  **/
  @ApiModelProperty(required = true, value = "")

  public V2MetricIdentifier getMetric() {
    return metric;
  }


  public void setMetric(V2MetricIdentifier metric) {
    this.metric = metric;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2ObjectMetricStatus v2ObjectMetricStatus = (V2ObjectMetricStatus) o;
    return Objects.equals(this.current, v2ObjectMetricStatus.current) &&
        Objects.equals(this.describedObject, v2ObjectMetricStatus.describedObject) &&
        Objects.equals(this.metric, v2ObjectMetricStatus.metric);
  }

  @Override
  public int hashCode() {
    return Objects.hash(current, describedObject, metric);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2ObjectMetricStatus {\n");
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    describedObject: ").append(toIndentedString(describedObject)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
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
