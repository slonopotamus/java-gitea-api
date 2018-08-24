/*
 * Gitea API.
 * This documentation describes the Gitea API.
 *
 * OpenAPI spec version: 1.1.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.gitea.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.gitea.model.PayloadCommitVerification;
import io.gitea.model.PayloadUser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * PayloadCommit represents a commit
 */
@ApiModel(description = "PayloadCommit represents a commit")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-24T21:18:13.192+01:00")
public class PayloadCommit {
  @SerializedName("author")
  private PayloadUser author = null;

  @SerializedName("committer")
  private PayloadUser committer = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("timestamp")
  private OffsetDateTime timestamp = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("verification")
  private PayloadCommitVerification verification = null;

  public PayloadCommit author(PayloadUser author) {
    this.author = author;
    return this;
  }

   /**
   * Get author
   * @return author
  **/
  @ApiModelProperty(value = "")
  public PayloadUser getAuthor() {
    return author;
  }

  public void setAuthor(PayloadUser author) {
    this.author = author;
  }

  public PayloadCommit committer(PayloadUser committer) {
    this.committer = committer;
    return this;
  }

   /**
   * Get committer
   * @return committer
  **/
  @ApiModelProperty(value = "")
  public PayloadUser getCommitter() {
    return committer;
  }

  public void setCommitter(PayloadUser committer) {
    this.committer = committer;
  }

  public PayloadCommit id(String id) {
    this.id = id;
    return this;
  }

   /**
   * sha1 hash of the commit
   * @return id
  **/
  @ApiModelProperty(value = "sha1 hash of the commit")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PayloadCommit message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public PayloadCommit timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  public PayloadCommit url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public PayloadCommit verification(PayloadCommitVerification verification) {
    this.verification = verification;
    return this;
  }

   /**
   * Get verification
   * @return verification
  **/
  @ApiModelProperty(value = "")
  public PayloadCommitVerification getVerification() {
    return verification;
  }

  public void setVerification(PayloadCommitVerification verification) {
    this.verification = verification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayloadCommit payloadCommit = (PayloadCommit) o;
    return Objects.equals(this.author, payloadCommit.author) &&
        Objects.equals(this.committer, payloadCommit.committer) &&
        Objects.equals(this.id, payloadCommit.id) &&
        Objects.equals(this.message, payloadCommit.message) &&
        Objects.equals(this.timestamp, payloadCommit.timestamp) &&
        Objects.equals(this.url, payloadCommit.url) &&
        Objects.equals(this.verification, payloadCommit.verification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, committer, id, message, timestamp, url, verification);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayloadCommit {\n");
    
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    committer: ").append(toIndentedString(committer)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    verification: ").append(toIndentedString(verification)).append("\n");
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

