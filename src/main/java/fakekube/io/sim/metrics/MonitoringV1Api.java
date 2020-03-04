package fakekube.io.sim.metrics;

import fakekube.io.model.IoK8sApiAppsV1ControllerRevision;
import fakekube.io.model.IoK8sApiAppsV1ControllerRevisionList;
import fakekube.io.model.IoK8sApiAppsV1DaemonSet;
import fakekube.io.model.IoK8sApiAppsV1DaemonSetList;
import fakekube.io.model.IoK8sApiAppsV1Deployment;
import fakekube.io.model.IoK8sApiAppsV1DeploymentList;
import fakekube.io.model.IoK8sApiAppsV1ReplicaSet;
import fakekube.io.model.IoK8sApiAppsV1ReplicaSetList;
import fakekube.io.model.IoK8sApiAppsV1StatefulSet;
import fakekube.io.model.IoK8sApiAppsV1StatefulSetList;
import fakekube.io.model.IoK8sApiAutoscalingV1Scale;
import fakekube.io.model.IoK8sApimachineryPkgApisMetaV1APIResourceList;
import fakekube.io.model.IoK8sApimachineryPkgApisMetaV1DeleteOptions;
import fakekube.io.model.IoK8sApimachineryPkgApisMetaV1Patch;
import fakekube.io.model.IoK8sApimachineryPkgApisMetaV1Status;
import fakekube.io.model.IoK8sApimachineryPkgApisMetaV1WatchEvent;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Kubernetes
 *
 * <p>No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface MonitoringV1Api  {

	@GET
    @Path("/apis/monitoring.coreos.com/v1/")
    @Consumes({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" })
    @ApiOperation(value = "", tags={ "monitoring_v1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApimachineryPkgApisMetaV1APIResourceList.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response getAppsV1APIResources();

	@POST
    @Path("/apis/monitoring.coreos.com/v1/namespaces/{namespace}/prometheus")
    @Consumes({ "*/*" })
    @Produces({ "application/json", "application/yaml", "application/vnd.kubernetes.protobuf" })
    @ApiOperation(value = "", tags={ "apps_v1",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IoK8sApiMonitoringV1Prometheus.class),
        @ApiResponse(code = 201, message = "Created", response = IoK8sApiMonitoringV1Prometheus.class),
        @ApiResponse(code = 202, message = "Accepted", response = IoK8sApiMonitoringV1Prometheus.class),
        @ApiResponse(code = 401, message = "Unauthorized") })
    public Response createMonitoringV1NamespacedPrometheus(@PathParam("namespace") String namespace, @Valid IoK8sApiMonitoringV1Prometheus body);
}
