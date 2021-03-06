package fakekube.io.model;

import fakekube.io.model.IoK8sApimachineryPkgApisMetaV1ObjectMeta;
import fakekube.io.model.IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIServiceSpec;
import fakekube.io.model.IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIServiceStatus;
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
  * APIService represents a server for a particular GroupVersion. Name must be \"version.group\".
 **/
@ApiModel(description="APIService represents a server for a particular GroupVersion. Name must be \"version.group\".")
public class IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIService  {
  
  @ApiModelProperty(value = "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources")
 /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
  **/
  private String apiVersion = null;

  @ApiModelProperty(value = "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds")
 /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
  **/
  private String kind = null;

  @ApiModelProperty(value = "")
  @Valid
  private IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata = null;

  @ApiModelProperty(value = "Spec contains information for locating and communicating with a server")
  @Valid
 /**
   * Spec contains information for locating and communicating with a server
  **/
  private IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIServiceSpec spec = null;

  @ApiModelProperty(value = "Status contains derived information about an API server")
  @Valid
 /**
   * Status contains derived information about an API server
  **/
  private IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIServiceStatus status = null;
 /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   * @return apiVersion
  **/
  @JsonProperty("apiVersion")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIService apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

 /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   * @return kind
  **/
  @JsonProperty("kind")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIService kind(String kind) {
    this.kind = kind;
    return this;
  }

 /**
   * Get metadata
   * @return metadata
  **/
  @JsonProperty("metadata")
  public IoK8sApimachineryPkgApisMetaV1ObjectMeta getMetadata() {
    return metadata;
  }

  public void setMetadata(IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata) {
    this.metadata = metadata;
  }

  public IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIService metadata(IoK8sApimachineryPkgApisMetaV1ObjectMeta metadata) {
    this.metadata = metadata;
    return this;
  }

 /**
   * Spec contains information for locating and communicating with a server
   * @return spec
  **/
  @JsonProperty("spec")
  public IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIServiceSpec getSpec() {
    return spec;
  }

  public void setSpec(IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIServiceSpec spec) {
    this.spec = spec;
  }

  public IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIService spec(IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIServiceSpec spec) {
    this.spec = spec;
    return this;
  }

 /**
   * Status contains derived information about an API server
   * @return status
  **/
  @JsonProperty("status")
  public IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIServiceStatus getStatus() {
    return status;
  }

  public void setStatus(IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIServiceStatus status) {
    this.status = status;
  }

  public IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIService status(IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIServiceStatus status) {
    this.status = status;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sKubeAggregatorPkgApisApiregistrationV1beta1APIService {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

