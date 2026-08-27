
package io.fabric8.kubernetes.api.model.resource.v1beta1;

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
import io.fabric8.kubernetes.api.model.Quantity;
import io.fabric8.kubernetes.api.model.ResourceRequirements;
import io.fabric8.kubernetes.api.model.Volume;
import io.fabric8.kubernetes.api.model.VolumeMount;
import io.sundr.builder.annotations.Buildable;
import io.sundr.builder.annotations.BuildableReference;

/**
 * NodeAllocatableResourceMapping defines the translation between the DRA device/capacity units requested to the corresponding quantity of the node allocatable resource.
 */
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "allocationMultiplier",
    "capacityKey"
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
public class NodeAllocatableResourceMapping implements Editable<NodeAllocatableResourceMappingBuilder>, KubernetesResource
{

    @JsonProperty("allocationMultiplier")
    private Quantity allocationMultiplier;
    @JsonProperty("capacityKey")
    private String capacityKey;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     */
    public NodeAllocatableResourceMapping() {
    }

    public NodeAllocatableResourceMapping(Quantity allocationMultiplier, String capacityKey) {
        super();
        this.allocationMultiplier = allocationMultiplier;
        this.capacityKey = capacityKey;
    }

    /**
     * NodeAllocatableResourceMapping defines the translation between the DRA device/capacity units requested to the corresponding quantity of the node allocatable resource.
     */
    @JsonProperty("allocationMultiplier")
    public Quantity getAllocationMultiplier() {
        return allocationMultiplier;
    }

    /**
     * NodeAllocatableResourceMapping defines the translation between the DRA device/capacity units requested to the corresponding quantity of the node allocatable resource.
     */
    @JsonProperty("allocationMultiplier")
    public void setAllocationMultiplier(Quantity allocationMultiplier) {
        this.allocationMultiplier = allocationMultiplier;
    }

    /**
     * CapacityKey references a capacity name defined as a key in the `spec.devices[&#42;].capacity` map. When this field is set, the value associated with this key in the `status.allocation.devices.results[&#42;].consumedCapacity` map (for a specific claim allocation) determines the base quantity for the node allocatable resource. If `allocationMultiplier` is also set, it is multiplied with the base quantity. For example, if `spec.devices[&#42;].capacity` has an entry "dra.example.com/memory": "128Gi", and this field is set to "dra.example.com/memory", then for a claim allocation that consumes { "dra.example.com/memory": "4Gi" } the base quantity for the node allocatable resource mapping will be "4Gi", and `allocationMultiplier` should be omitted or set to "1".
     */
    @JsonProperty("capacityKey")
    public String getCapacityKey() {
        return capacityKey;
    }

    /**
     * CapacityKey references a capacity name defined as a key in the `spec.devices[&#42;].capacity` map. When this field is set, the value associated with this key in the `status.allocation.devices.results[&#42;].consumedCapacity` map (for a specific claim allocation) determines the base quantity for the node allocatable resource. If `allocationMultiplier` is also set, it is multiplied with the base quantity. For example, if `spec.devices[&#42;].capacity` has an entry "dra.example.com/memory": "128Gi", and this field is set to "dra.example.com/memory", then for a claim allocation that consumes { "dra.example.com/memory": "4Gi" } the base quantity for the node allocatable resource mapping will be "4Gi", and `allocationMultiplier` should be omitted or set to "1".
     */
    @JsonProperty("capacityKey")
    public void setCapacityKey(String capacityKey) {
        this.capacityKey = capacityKey;
    }

    @JsonIgnore
    public NodeAllocatableResourceMappingBuilder edit() {
        return new NodeAllocatableResourceMappingBuilder(this);
    }

    @JsonIgnore
    public NodeAllocatableResourceMappingBuilder toBuilder() {
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
        if (!(o instanceof NodeAllocatableResourceMapping)) {
            return false;
        }
        NodeAllocatableResourceMapping other = (NodeAllocatableResourceMapping) o;
        if (!other.canEqual(this)) {
            return false;
        }
        Object this$allocationMultiplier = this.getAllocationMultiplier();
        Object other$allocationMultiplier = other.getAllocationMultiplier();
        if (this$allocationMultiplier == null ? other$allocationMultiplier != null : !this$allocationMultiplier.equals(other$allocationMultiplier)) {
            return false;
        }
        Object this$capacityKey = this.getCapacityKey();
        Object other$capacityKey = other.getCapacityKey();
        if (this$capacityKey == null ? other$capacityKey != null : !this$capacityKey.equals(other$capacityKey)) {
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
        return other instanceof NodeAllocatableResourceMapping;
    }

    @Override
    public int hashCode() {
        final int prime = 59;
        int result = 1;
        Object $allocationMultiplier = this.getAllocationMultiplier();
        result = result * prime + ($allocationMultiplier == null ? 43 : $allocationMultiplier.hashCode());
        Object $capacityKey = this.getCapacityKey();
        result = result * prime + ($capacityKey == null ? 43 : $capacityKey.hashCode());
        Object $additionalProperties = this.getAdditionalProperties();
        result = result * prime + ($additionalProperties == null ? 43 : $additionalProperties.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "NodeAllocatableResourceMapping(" + "allocationMultiplier=" + this.getAllocationMultiplier() + ", capacityKey=" + this.getCapacityKey() + ", additionalProperties=" + this.getAdditionalProperties() + ")";
    }

}
