package fakekube.io.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Subject contains a reference to the object or user identities a role binding applies to.  This can either hold a direct API object reference, or a value for non-objects such as user and group names.
 **/
@ApiModel(description="Subject contains a reference to the object or user identities a role binding applies to.  This can either hold a direct API object reference, or a value for non-objects such as user and group names.")
public class IoK8sApiRbacV1alpha1Subject  {
  
  @ApiModelProperty(value = "APIVersion holds the API group and version of the referenced subject. Defaults to \"v1\" for ServiceAccount subjects. Defaults to \"rbac.authorization.k8s.io/v1alpha1\" for User and Group subjects.")
 /**
   * APIVersion holds the API group and version of the referenced subject. Defaults to \"v1\" for ServiceAccount subjects. Defaults to \"rbac.authorization.k8s.io/v1alpha1\" for User and Group subjects.
  **/
  private String apiVersion = null;

  @ApiModelProperty(required = true, value = "Kind of object being referenced. Values defined by this API group are \"User\", \"Group\", and \"ServiceAccount\". If the Authorizer does not recognized the kind value, the Authorizer should report an error.")
 /**
   * Kind of object being referenced. Values defined by this API group are \"User\", \"Group\", and \"ServiceAccount\". If the Authorizer does not recognized the kind value, the Authorizer should report an error.
  **/
  private String kind = null;

  @ApiModelProperty(required = true, value = "Name of the object being referenced.")
 /**
   * Name of the object being referenced.
  **/
  private String name = null;

  @ApiModelProperty(value = "Namespace of the referenced object.  If the object kind is non-namespace, such as \"User\" or \"Group\", and this value is not empty the Authorizer should report an error.")
 /**
   * Namespace of the referenced object.  If the object kind is non-namespace, such as \"User\" or \"Group\", and this value is not empty the Authorizer should report an error.
  **/
  private String namespace = null;
 /**
   * APIVersion holds the API group and version of the referenced subject. Defaults to \&quot;v1\&quot; for ServiceAccount subjects. Defaults to \&quot;rbac.authorization.k8s.io/v1alpha1\&quot; for User and Group subjects.
   * @return apiVersion
  **/
  @JsonProperty("apiVersion")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public IoK8sApiRbacV1alpha1Subject apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

 /**
   * Kind of object being referenced. Values defined by this API group are \&quot;User\&quot;, \&quot;Group\&quot;, and \&quot;ServiceAccount\&quot;. If the Authorizer does not recognized the kind value, the Authorizer should report an error.
   * @return kind
  **/
  @JsonProperty("kind")
  @NotNull
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public IoK8sApiRbacV1alpha1Subject kind(String kind) {
    this.kind = kind;
    return this;
  }

 /**
   * Name of the object being referenced.
   * @return name
  **/
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IoK8sApiRbacV1alpha1Subject name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Namespace of the referenced object.  If the object kind is non-namespace, such as \&quot;User\&quot; or \&quot;Group\&quot;, and this value is not empty the Authorizer should report an error.
   * @return namespace
  **/
  @JsonProperty("namespace")
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public IoK8sApiRbacV1alpha1Subject namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiRbacV1alpha1Subject {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

