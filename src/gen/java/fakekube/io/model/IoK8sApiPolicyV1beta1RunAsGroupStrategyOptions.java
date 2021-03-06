package fakekube.io.model;

import fakekube.io.model.IoK8sApiPolicyV1beta1IDRange;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.List;
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
  * RunAsGroupStrategyOptions defines the strategy type and any options used to create the strategy.
 **/
@ApiModel(description="RunAsGroupStrategyOptions defines the strategy type and any options used to create the strategy.")
public class IoK8sApiPolicyV1beta1RunAsGroupStrategyOptions  {
  
  @ApiModelProperty(value = "ranges are the allowed ranges of gids that may be used. If you would like to force a single gid then supply a single range with the same start and end. Required for MustRunAs.")
  @Valid
 /**
   * ranges are the allowed ranges of gids that may be used. If you would like to force a single gid then supply a single range with the same start and end. Required for MustRunAs.
  **/
  private List<IoK8sApiPolicyV1beta1IDRange> ranges = null;

  @ApiModelProperty(required = true, value = "rule is the strategy that will dictate the allowable RunAsGroup values that may be set.")
 /**
   * rule is the strategy that will dictate the allowable RunAsGroup values that may be set.
  **/
  private String rule = null;
 /**
   * ranges are the allowed ranges of gids that may be used. If you would like to force a single gid then supply a single range with the same start and end. Required for MustRunAs.
   * @return ranges
  **/
  @JsonProperty("ranges")
  public List<IoK8sApiPolicyV1beta1IDRange> getRanges() {
    return ranges;
  }

  public void setRanges(List<IoK8sApiPolicyV1beta1IDRange> ranges) {
    this.ranges = ranges;
  }

  public IoK8sApiPolicyV1beta1RunAsGroupStrategyOptions ranges(List<IoK8sApiPolicyV1beta1IDRange> ranges) {
    this.ranges = ranges;
    return this;
  }

  public IoK8sApiPolicyV1beta1RunAsGroupStrategyOptions addRangesItem(IoK8sApiPolicyV1beta1IDRange rangesItem) {
    this.ranges.add(rangesItem);
    return this;
  }

 /**
   * rule is the strategy that will dictate the allowable RunAsGroup values that may be set.
   * @return rule
  **/
  @JsonProperty("rule")
  @NotNull
  public String getRule() {
    return rule;
  }

  public void setRule(String rule) {
    this.rule = rule;
  }

  public IoK8sApiPolicyV1beta1RunAsGroupStrategyOptions rule(String rule) {
    this.rule = rule;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiPolicyV1beta1RunAsGroupStrategyOptions {\n");
    
    sb.append("    ranges: ").append(toIndentedString(ranges)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
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

