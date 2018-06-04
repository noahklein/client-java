/*
 * Grafeas API
 * An API to insert and retrieve annotations on cloud artifacts.
 *
 * OpenAPI spec version: v1alpha1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.grafeas.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.grafeas.model.ApiProjectRepoId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A unique identifier for a Cloud Repo.
 */
@ApiModel(description = "A unique identifier for a Cloud Repo.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-04T13:20:14.121-07:00")
public class ApiRepoId {
  @SerializedName("project_repo_id")
  private ApiProjectRepoId projectRepoId = null;

  @SerializedName("uid")
  private String uid = null;

  public ApiRepoId projectRepoId(ApiProjectRepoId projectRepoId) {
    this.projectRepoId = projectRepoId;
    return this;
  }

   /**
   * A combination of a project ID and a repo name.
   * @return projectRepoId
  **/
  @ApiModelProperty(value = "A combination of a project ID and a repo name.")
  public ApiProjectRepoId getProjectRepoId() {
    return projectRepoId;
  }

  public void setProjectRepoId(ApiProjectRepoId projectRepoId) {
    this.projectRepoId = projectRepoId;
  }

  public ApiRepoId uid(String uid) {
    this.uid = uid;
    return this;
  }

   /**
   * A server-assigned, globally unique identifier.
   * @return uid
  **/
  @ApiModelProperty(value = "A server-assigned, globally unique identifier.")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiRepoId apiRepoId = (ApiRepoId) o;
    return Objects.equals(this.projectRepoId, apiRepoId.projectRepoId) &&
        Objects.equals(this.uid, apiRepoId.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectRepoId, uid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiRepoId {\n");
    
    sb.append("    projectRepoId: ").append(toIndentedString(projectRepoId)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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
