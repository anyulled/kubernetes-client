
package io.fabric8.kubernetes.api.model.scheduling.v1alpha2;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.fabric8.kubernetes.api.builder.Editable;
import io.fabric8.kubernetes.api.model.Container;
import io.fabric8.kubernetes.api.model.ContainerPort;
import io.fabric8.kubernetes.api.model.EnvVar;
import io.fabric8.kubernetes.api.model.IntOrString;
import io.fabric8.kubernetes.api.model.KubernetesResource;
import io.fabric8.kubernetes.api.model.LabelSelector;
import io.fabric8.kubernetes.api.model.LocalObjectReference;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.ObjectReference;
import io.fabric8.kubernetes.api.model.PersistentVolumeClaim;
import io.fabric8.kubernetes.api.model.PodTemplateSpec;
import io.fabric8.kubernetes.api.model.ResourceRequirements;
import io.fabric8.kubernetes.api.model.Volume;
import io.fabric8.kubernetes.api.model.VolumeMount;
import io.sundr.builder.annotations.Buildable;
import io.sundr.builder.annotations.BuildableReference;

/**
 * WorkloadPodGroupTemplateReference references the PodGroupTemplate within the Workload object.
 */
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "podGroupTemplateName",
    "workloadName"
})
@Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, lazyCollectionInitEnabled = false, builderPackage = "io.fabric8.kubernetes.api.builder", refs = {
    @BuildableReference(ObjectMeta.class),
    @BuildableReference(LabelSelector.class),
    @BuildableReference(Container.class),
    @BuildableReference(PodTemplateSpec.class),
    @BuildableReference(ResourceRequirements.class),
    @BuildableReference(IntOrString.class),
    @BuildableReference(ObjectReference.class),
    @BuildableReference(LocalObjectReference.class),
    @BuildableReference(PersistentVolumeClaim.class),
    @BuildableReference(EnvVar.class),
    @BuildableReference(ContainerPort.class),
    @BuildableReference(Volume.class),
    @BuildableReference(VolumeMount.class)
})
@Generated("io.fabric8.kubernetes.schema.generator.model.ModelGenerator")
public class WorkloadPodGroupTemplateReference implements Editable<WorkloadPodGroupTemplateReferenceBuilder>, KubernetesResource
{

    @JsonProperty("podGroupTemplateName")
    private String podGroupTemplateName;
    @JsonProperty("workloadName")
    private String workloadName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public WorkloadPodGroupTemplateReference() {
    }

    public WorkloadPodGroupTemplateReference(String podGroupTemplateName, String workloadName) {
        super();
        this.podGroupTemplateName = podGroupTemplateName;
        this.workloadName = workloadName;
    }

    /**
     * PodGroupTemplateName defines the PodGroupTemplate name within the Workload object.
     */
    @JsonProperty("podGroupTemplateName")
    public String getPodGroupTemplateName() {
        return podGroupTemplateName;
    }

    /**
     * PodGroupTemplateName defines the PodGroupTemplate name within the Workload object.
     */
    @JsonProperty("podGroupTemplateName")
    public void setPodGroupTemplateName(String podGroupTemplateName) {
        this.podGroupTemplateName = podGroupTemplateName;
    }

    /**
     * WorkloadName defines the name of the Workload object.
     */
    @JsonProperty("workloadName")
    public String getWorkloadName() {
        return workloadName;
    }

    /**
     * WorkloadName defines the name of the Workload object.
     */
    @JsonProperty("workloadName")
    public void setWorkloadName(String workloadName) {
        this.workloadName = workloadName;
    }

    @JsonIgnore
    public WorkloadPodGroupTemplateReferenceBuilder edit() {
        return new WorkloadPodGroupTemplateReferenceBuilder(this);
    }

    @JsonIgnore
    public WorkloadPodGroupTemplateReferenceBuilder toBuilder() {
        return edit();
    }

    @JsonAnyGetter
    @JsonIgnore
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }
    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof WorkloadPodGroupTemplateReference)) {
            return false;
        }
        WorkloadPodGroupTemplateReference other = (WorkloadPodGroupTemplateReference) o;
        if (!other.canEqual(this)) {
            return false;
        }
        Object this$podGroupTemplateName = this.getPodGroupTemplateName();
        Object other$podGroupTemplateName = other.getPodGroupTemplateName();
        if (this$podGroupTemplateName == null ? other$podGroupTemplateName != null : !this$podGroupTemplateName.equals(other$podGroupTemplateName)) {
            return false;
        }
        Object this$workloadName = this.getWorkloadName();
        Object other$workloadName = other.getWorkloadName();
        if (this$workloadName == null ? other$workloadName != null : !this$workloadName.equals(other$workloadName)) {
            return false;
        }
        Object this$additionalProperties = this.getAdditionalProperties();
        Object other$additionalProperties = other.getAdditionalProperties();
        if (this$additionalProperties == null ? other$additionalProperties != null : !this$additionalProperties.equals(other$additionalProperties)) {
            return false;
        }
        return true;
    }

    protected boolean canEqual(Object other) {
        return other instanceof WorkloadPodGroupTemplateReference;
    }

    @Override
    public int hashCode() {
        final int prime = 59;
        int result = 1;
        Object $podGroupTemplateName = this.getPodGroupTemplateName();
        result = result * prime + ($podGroupTemplateName == null ? 43 : $podGroupTemplateName.hashCode());
        Object $workloadName = this.getWorkloadName();
        result = result * prime + ($workloadName == null ? 43 : $workloadName.hashCode());
        Object $additionalProperties = this.getAdditionalProperties();
        result = result * prime + ($additionalProperties == null ? 43 : $additionalProperties.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "WorkloadPodGroupTemplateReference(" + "podGroupTemplateName=" + this.getPodGroupTemplateName() + ", workloadName=" + this.getWorkloadName() + ", additionalProperties=" + this.getAdditionalProperties() + ")";
    }

}
