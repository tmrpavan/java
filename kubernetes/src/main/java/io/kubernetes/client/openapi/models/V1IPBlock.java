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
 * IPBlock describes a particular CIDR (Ex. \&quot;192.168.1.0/24\&quot;,\&quot;2001:db8::/64\&quot;) that is allowed to the pods matched by a NetworkPolicySpec&#39;s podSelector. The except entry describes CIDRs that should not be included within this rule.
 */
@ApiModel(description = "IPBlock describes a particular CIDR (Ex. \"192.168.1.0/24\",\"2001:db8::/64\") that is allowed to the pods matched by a NetworkPolicySpec's podSelector. The except entry describes CIDRs that should not be included within this rule.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-23T16:24:37.468Z[Etc/UTC]")
public class V1IPBlock {
  public static final String SERIALIZED_NAME_CIDR = "cidr";
  @SerializedName(SERIALIZED_NAME_CIDR)
  private String cidr;

  public static final String SERIALIZED_NAME_EXCEPT = "except";
  @SerializedName(SERIALIZED_NAME_EXCEPT)
  private List<String> except = null;


  public V1IPBlock cidr(String cidr) {

    this.cidr = cidr;
    return this;
  }

   /**
   * cidr is a string representing the IPBlock Valid examples are \&quot;192.168.1.0/24\&quot; or \&quot;2001:db8::/64\&quot;
   * @return cidr
  **/
  @ApiModelProperty(required = true, value = "cidr is a string representing the IPBlock Valid examples are \"192.168.1.0/24\" or \"2001:db8::/64\"")

  public String getCidr() {
    return cidr;
  }


  public void setCidr(String cidr) {
    this.cidr = cidr;
  }


  public V1IPBlock except(List<String> except) {

    this.except = except;
    return this;
  }

  public V1IPBlock addExceptItem(String exceptItem) {
    if (this.except == null) {
      this.except = new ArrayList<>();
    }
    this.except.add(exceptItem);
    return this;
  }

   /**
   * except is a slice of CIDRs that should not be included within an IPBlock Valid examples are \&quot;192.168.1.0/24\&quot; or \&quot;2001:db8::/64\&quot; Except values will be rejected if they are outside the cidr range
   * @return except
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "except is a slice of CIDRs that should not be included within an IPBlock Valid examples are \"192.168.1.0/24\" or \"2001:db8::/64\" Except values will be rejected if they are outside the cidr range")

  public List<String> getExcept() {
    return except;
  }


  public void setExcept(List<String> except) {
    this.except = except;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1IPBlock v1IPBlock = (V1IPBlock) o;
    return Objects.equals(this.cidr, v1IPBlock.cidr) &&
        Objects.equals(this.except, v1IPBlock.except);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cidr, except);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1IPBlock {\n");
    sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
    sb.append("    except: ").append(toIndentedString(except)).append("\n");
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
