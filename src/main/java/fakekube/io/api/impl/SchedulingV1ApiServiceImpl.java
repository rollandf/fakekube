package fakekube.io.api.impl;

import fakekube.io.api.*;
import fakekube.io.model.IoK8sApiSchedulingV1PriorityClass;
import fakekube.io.model.IoK8sApiSchedulingV1PriorityClassList;
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
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;

/**
 * Kubernetes
 *
 * <p>No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 */
public class SchedulingV1ApiServiceImpl implements SchedulingV1Api {
    public Response createSchedulingV1PriorityClass(IoK8sApiSchedulingV1PriorityClass body, String pretty, String dryRun, String fieldManager) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response deleteSchedulingV1CollectionPriorityClass(String pretty, Boolean allowWatchBookmarks, IoK8sApimachineryPkgApisMetaV1DeleteOptions body, String _continue, String dryRun, String fieldSelector, Integer gracePeriodSeconds, String labelSelector, Integer limit, Boolean orphanDependents, String propagationPolicy, String resourceVersion, Integer timeoutSeconds, Boolean watch) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response deleteSchedulingV1PriorityClass(String name, String pretty, IoK8sApimachineryPkgApisMetaV1DeleteOptions body, String dryRun, Integer gracePeriodSeconds, Boolean orphanDependents, String propagationPolicy) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response getSchedulingV1APIResources() {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response listSchedulingV1PriorityClass(String pretty, Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String resourceVersion, Integer timeoutSeconds, Boolean watch) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response patchSchedulingV1PriorityClass(String name, IoK8sApimachineryPkgApisMetaV1Patch body, String pretty, String dryRun, String fieldManager, Boolean force) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response readSchedulingV1PriorityClass(String name, String pretty, Boolean exact, Boolean export) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response replaceSchedulingV1PriorityClass(String name, IoK8sApiSchedulingV1PriorityClass body, String pretty, String dryRun, String fieldManager) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response watchSchedulingV1PriorityClass(String name, Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String pretty, String resourceVersion, Integer timeoutSeconds, Boolean watch) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
    public Response watchSchedulingV1PriorityClassList(Boolean allowWatchBookmarks, String _continue, String fieldSelector, String labelSelector, Integer limit, String pretty, String resourceVersion, Integer timeoutSeconds, Boolean watch) {
        // TODO: Implement...
        
        return Response.ok().entity("magic!").build();
    }
    
}
