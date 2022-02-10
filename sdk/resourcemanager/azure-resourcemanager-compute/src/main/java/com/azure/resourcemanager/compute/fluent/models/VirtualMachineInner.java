// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.models.AdditionalCapabilities;
import com.azure.resourcemanager.compute.models.ApplicationProfile;
import com.azure.resourcemanager.compute.models.BillingProfile;
import com.azure.resourcemanager.compute.models.CapacityReservationProfile;
import com.azure.resourcemanager.compute.models.DiagnosticsProfile;
import com.azure.resourcemanager.compute.models.ExtendedLocation;
import com.azure.resourcemanager.compute.models.HardwareProfile;
import com.azure.resourcemanager.compute.models.NetworkProfile;
import com.azure.resourcemanager.compute.models.OSProfile;
import com.azure.resourcemanager.compute.models.Plan;
import com.azure.resourcemanager.compute.models.ScheduledEventsProfile;
import com.azure.resourcemanager.compute.models.SecurityProfile;
import com.azure.resourcemanager.compute.models.StorageProfile;
import com.azure.resourcemanager.compute.models.VirtualMachineEvictionPolicyTypes;
import com.azure.resourcemanager.compute.models.VirtualMachineIdentity;
import com.azure.resourcemanager.compute.models.VirtualMachinePriorityTypes;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** Describes a Virtual Machine. */
@Fluent
public final class VirtualMachineInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualMachineInner.class);

    /*
     * Specifies information about the marketplace image used to create the
     * virtual machine. This element is only used for marketplace images.
     * Before you can use a marketplace image from an API, you must enable the
     * image for programmatic use.  In the Azure portal, find the marketplace
     * image that you want to use and then click **Want to deploy
     * programmatically, Get Started ->**. Enter any required information and
     * then click **Save**.
     */
    @JsonProperty(value = "plan")
    private Plan plan;

    /*
     * Describes the properties of a Virtual Machine.
     */
    @JsonProperty(value = "properties")
    private VirtualMachinePropertiesInner innerProperties;

    /*
     * The virtual machine child extension resources.
     */
    @JsonProperty(value = "resources", access = JsonProperty.Access.WRITE_ONLY)
    private List<VirtualMachineExtensionInner> resources;

    /*
     * The identity of the virtual machine, if configured.
     */
    @JsonProperty(value = "identity")
    private VirtualMachineIdentity identity;

    /*
     * The virtual machine zones.
     */
    @JsonProperty(value = "zones")
    private List<String> zones;

    /*
     * The extended location of the Virtual Machine.
     */
    @JsonProperty(value = "extendedLocation")
    private ExtendedLocation extendedLocation;

    /**
     * Get the plan property: Specifies information about the marketplace image used to create the virtual machine. This
     * element is only used for marketplace images. Before you can use a marketplace image from an API, you must enable
     * the image for programmatic use. In the Azure portal, find the marketplace image that you want to use and then
     * click **Want to deploy programmatically, Get Started -&gt;**. Enter any required information and then click
     * **Save**.
     *
     * @return the plan value.
     */
    public Plan plan() {
        return this.plan;
    }

    /**
     * Set the plan property: Specifies information about the marketplace image used to create the virtual machine. This
     * element is only used for marketplace images. Before you can use a marketplace image from an API, you must enable
     * the image for programmatic use. In the Azure portal, find the marketplace image that you want to use and then
     * click **Want to deploy programmatically, Get Started -&gt;**. Enter any required information and then click
     * **Save**.
     *
     * @param plan the plan value to set.
     * @return the VirtualMachineInner object itself.
     */
    public VirtualMachineInner withPlan(Plan plan) {
        this.plan = plan;
        return this;
    }

    /**
     * Get the innerProperties property: Describes the properties of a Virtual Machine.
     *
     * @return the innerProperties value.
     */
    private VirtualMachinePropertiesInner innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the resources property: The virtual machine child extension resources.
     *
     * @return the resources value.
     */
    public List<VirtualMachineExtensionInner> resources() {
        return this.resources;
    }

    /**
     * Get the identity property: The identity of the virtual machine, if configured.
     *
     * @return the identity value.
     */
    public VirtualMachineIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identity of the virtual machine, if configured.
     *
     * @param identity the identity value to set.
     * @return the VirtualMachineInner object itself.
     */
    public VirtualMachineInner withIdentity(VirtualMachineIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the zones property: The virtual machine zones.
     *
     * @return the zones value.
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Set the zones property: The virtual machine zones.
     *
     * @param zones the zones value to set.
     * @return the VirtualMachineInner object itself.
     */
    public VirtualMachineInner withZones(List<String> zones) {
        this.zones = zones;
        return this;
    }

    /**
     * Get the extendedLocation property: The extended location of the Virtual Machine.
     *
     * @return the extendedLocation value.
     */
    public ExtendedLocation extendedLocation() {
        return this.extendedLocation;
    }

    /**
     * Set the extendedLocation property: The extended location of the Virtual Machine.
     *
     * @param extendedLocation the extendedLocation value to set.
     * @return the VirtualMachineInner object itself.
     */
    public VirtualMachineInner withExtendedLocation(ExtendedLocation extendedLocation) {
        this.extendedLocation = extendedLocation;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VirtualMachineInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VirtualMachineInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the hardwareProfile property: Specifies the hardware settings for the virtual machine.
     *
     * @return the hardwareProfile value.
     */
    public HardwareProfile hardwareProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().hardwareProfile();
    }

    /**
     * Set the hardwareProfile property: Specifies the hardware settings for the virtual machine.
     *
     * @param hardwareProfile the hardwareProfile value to set.
     * @return the VirtualMachineInner object itself.
     */
    public VirtualMachineInner withHardwareProfile(HardwareProfile hardwareProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachinePropertiesInner();
        }
        this.innerProperties().withHardwareProfile(hardwareProfile);
        return this;
    }

    /**
     * Get the storageProfile property: Specifies the storage settings for the virtual machine disks.
     *
     * @return the storageProfile value.
     */
    public StorageProfile storageProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().storageProfile();
    }

    /**
     * Set the storageProfile property: Specifies the storage settings for the virtual machine disks.
     *
     * @param storageProfile the storageProfile value to set.
     * @return the VirtualMachineInner object itself.
     */
    public VirtualMachineInner withStorageProfile(StorageProfile storageProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachinePropertiesInner();
        }
        this.innerProperties().withStorageProfile(storageProfile);
        return this;
    }

    /**
     * Get the additionalCapabilities property: Specifies additional capabilities enabled or disabled on the virtual
     * machine.
     *
     * @return the additionalCapabilities value.
     */
    public AdditionalCapabilities additionalCapabilities() {
        return this.innerProperties() == null ? null : this.innerProperties().additionalCapabilities();
    }

    /**
     * Set the additionalCapabilities property: Specifies additional capabilities enabled or disabled on the virtual
     * machine.
     *
     * @param additionalCapabilities the additionalCapabilities value to set.
     * @return the VirtualMachineInner object itself.
     */
    public VirtualMachineInner withAdditionalCapabilities(AdditionalCapabilities additionalCapabilities) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachinePropertiesInner();
        }
        this.innerProperties().withAdditionalCapabilities(additionalCapabilities);
        return this;
    }

    /**
     * Get the osProfile property: Specifies the operating system settings used while creating the virtual machine. Some
     * of the settings cannot be changed once VM is provisioned.
     *
     * @return the osProfile value.
     */
    public OSProfile osProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().osProfile();
    }

    /**
     * Set the osProfile property: Specifies the operating system settings used while creating the virtual machine. Some
     * of the settings cannot be changed once VM is provisioned.
     *
     * @param osProfile the osProfile value to set.
     * @return the VirtualMachineInner object itself.
     */
    public VirtualMachineInner withOsProfile(OSProfile osProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachinePropertiesInner();
        }
        this.innerProperties().withOsProfile(osProfile);
        return this;
    }

    /**
     * Get the networkProfile property: Specifies the network interfaces of the virtual machine.
     *
     * @return the networkProfile value.
     */
    public NetworkProfile networkProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().networkProfile();
    }

    /**
     * Set the networkProfile property: Specifies the network interfaces of the virtual machine.
     *
     * @param networkProfile the networkProfile value to set.
     * @return the VirtualMachineInner object itself.
     */
    public VirtualMachineInner withNetworkProfile(NetworkProfile networkProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachinePropertiesInner();
        }
        this.innerProperties().withNetworkProfile(networkProfile);
        return this;
    }

    /**
     * Get the securityProfile property: Specifies the Security related profile settings for the virtual machine.
     *
     * @return the securityProfile value.
     */
    public SecurityProfile securityProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().securityProfile();
    }

    /**
     * Set the securityProfile property: Specifies the Security related profile settings for the virtual machine.
     *
     * @param securityProfile the securityProfile value to set.
     * @return the VirtualMachineInner object itself.
     */
    public VirtualMachineInner withSecurityProfile(SecurityProfile securityProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachinePropertiesInner();
        }
        this.innerProperties().withSecurityProfile(securityProfile);
        return this;
    }

    /**
     * Get the diagnosticsProfile property: Specifies the boot diagnostic settings state. &lt;br&gt;&lt;br&gt;Minimum
     * api-version: 2015-06-15.
     *
     * @return the diagnosticsProfile value.
     */
    public DiagnosticsProfile diagnosticsProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().diagnosticsProfile();
    }

    /**
     * Set the diagnosticsProfile property: Specifies the boot diagnostic settings state. &lt;br&gt;&lt;br&gt;Minimum
     * api-version: 2015-06-15.
     *
     * @param diagnosticsProfile the diagnosticsProfile value to set.
     * @return the VirtualMachineInner object itself.
     */
    public VirtualMachineInner withDiagnosticsProfile(DiagnosticsProfile diagnosticsProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachinePropertiesInner();
        }
        this.innerProperties().withDiagnosticsProfile(diagnosticsProfile);
        return this;
    }

    /**
     * Get the availabilitySet property: Specifies information about the availability set that the virtual machine
     * should be assigned to. Virtual machines specified in the same availability set are allocated to different nodes
     * to maximize availability. For more information about availability sets, see [Availability sets
     * overview](https://docs.microsoft.com/azure/virtual-machines/availability-set-overview). &lt;br&gt;&lt;br&gt; For
     * more information on Azure planned maintenance, see [Maintenance and updates for Virtual Machines in
     * Azure](https://docs.microsoft.com/azure/virtual-machines/maintenance-and-updates) &lt;br&gt;&lt;br&gt; Currently,
     * a VM can only be added to availability set at creation time. The availability set to which the VM is being added
     * should be under the same resource group as the availability set resource. An existing VM cannot be added to an
     * availability set. &lt;br&gt;&lt;br&gt;This property cannot exist along with a non-null
     * properties.virtualMachineScaleSet reference.
     *
     * @return the availabilitySet value.
     */
    public SubResource availabilitySet() {
        return this.innerProperties() == null ? null : this.innerProperties().availabilitySet();
    }

    /**
     * Set the availabilitySet property: Specifies information about the availability set that the virtual machine
     * should be assigned to. Virtual machines specified in the same availability set are allocated to different nodes
     * to maximize availability. For more information about availability sets, see [Availability sets
     * overview](https://docs.microsoft.com/azure/virtual-machines/availability-set-overview). &lt;br&gt;&lt;br&gt; For
     * more information on Azure planned maintenance, see [Maintenance and updates for Virtual Machines in
     * Azure](https://docs.microsoft.com/azure/virtual-machines/maintenance-and-updates) &lt;br&gt;&lt;br&gt; Currently,
     * a VM can only be added to availability set at creation time. The availability set to which the VM is being added
     * should be under the same resource group as the availability set resource. An existing VM cannot be added to an
     * availability set. &lt;br&gt;&lt;br&gt;This property cannot exist along with a non-null
     * properties.virtualMachineScaleSet reference.
     *
     * @param availabilitySet the availabilitySet value to set.
     * @return the VirtualMachineInner object itself.
     */
    public VirtualMachineInner withAvailabilitySet(SubResource availabilitySet) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachinePropertiesInner();
        }
        this.innerProperties().withAvailabilitySet(availabilitySet);
        return this;
    }

    /**
     * Get the virtualMachineScaleSet property: Specifies information about the virtual machine scale set that the
     * virtual machine should be assigned to. Virtual machines specified in the same virtual machine scale set are
     * allocated to different nodes to maximize availability. Currently, a VM can only be added to virtual machine scale
     * set at creation time. An existing VM cannot be added to a virtual machine scale set. &lt;br&gt;&lt;br&gt;This
     * property cannot exist along with a non-null properties.availabilitySet reference. &lt;br&gt;&lt;br&gt;Minimum
     * api‐version: 2019‐03‐01.
     *
     * @return the virtualMachineScaleSet value.
     */
    public SubResource virtualMachineScaleSet() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualMachineScaleSet();
    }

    /**
     * Set the virtualMachineScaleSet property: Specifies information about the virtual machine scale set that the
     * virtual machine should be assigned to. Virtual machines specified in the same virtual machine scale set are
     * allocated to different nodes to maximize availability. Currently, a VM can only be added to virtual machine scale
     * set at creation time. An existing VM cannot be added to a virtual machine scale set. &lt;br&gt;&lt;br&gt;This
     * property cannot exist along with a non-null properties.availabilitySet reference. &lt;br&gt;&lt;br&gt;Minimum
     * api‐version: 2019‐03‐01.
     *
     * @param virtualMachineScaleSet the virtualMachineScaleSet value to set.
     * @return the VirtualMachineInner object itself.
     */
    public VirtualMachineInner withVirtualMachineScaleSet(SubResource virtualMachineScaleSet) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachinePropertiesInner();
        }
        this.innerProperties().withVirtualMachineScaleSet(virtualMachineScaleSet);
        return this;
    }

    /**
     * Get the proximityPlacementGroup property: Specifies information about the proximity placement group that the
     * virtual machine should be assigned to. &lt;br&gt;&lt;br&gt;Minimum api-version: 2018-04-01.
     *
     * @return the proximityPlacementGroup value.
     */
    public SubResource proximityPlacementGroup() {
        return this.innerProperties() == null ? null : this.innerProperties().proximityPlacementGroup();
    }

    /**
     * Set the proximityPlacementGroup property: Specifies information about the proximity placement group that the
     * virtual machine should be assigned to. &lt;br&gt;&lt;br&gt;Minimum api-version: 2018-04-01.
     *
     * @param proximityPlacementGroup the proximityPlacementGroup value to set.
     * @return the VirtualMachineInner object itself.
     */
    public VirtualMachineInner withProximityPlacementGroup(SubResource proximityPlacementGroup) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachinePropertiesInner();
        }
        this.innerProperties().withProximityPlacementGroup(proximityPlacementGroup);
        return this;
    }

    /**
     * Get the priority property: Specifies the priority for the virtual machine. &lt;br&gt;&lt;br&gt;Minimum
     * api-version: 2019-03-01.
     *
     * @return the priority value.
     */
    public VirtualMachinePriorityTypes priority() {
        return this.innerProperties() == null ? null : this.innerProperties().priority();
    }

    /**
     * Set the priority property: Specifies the priority for the virtual machine. &lt;br&gt;&lt;br&gt;Minimum
     * api-version: 2019-03-01.
     *
     * @param priority the priority value to set.
     * @return the VirtualMachineInner object itself.
     */
    public VirtualMachineInner withPriority(VirtualMachinePriorityTypes priority) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachinePropertiesInner();
        }
        this.innerProperties().withPriority(priority);
        return this;
    }

    /**
     * Get the evictionPolicy property: Specifies the eviction policy for the Azure Spot virtual machine and Azure Spot
     * scale set. &lt;br&gt;&lt;br&gt;For Azure Spot virtual machines, both 'Deallocate' and 'Delete' are supported and
     * the minimum api-version is 2019-03-01. &lt;br&gt;&lt;br&gt;For Azure Spot scale sets, both 'Deallocate' and
     * 'Delete' are supported and the minimum api-version is 2017-10-30-preview.
     *
     * @return the evictionPolicy value.
     */
    public VirtualMachineEvictionPolicyTypes evictionPolicy() {
        return this.innerProperties() == null ? null : this.innerProperties().evictionPolicy();
    }

    /**
     * Set the evictionPolicy property: Specifies the eviction policy for the Azure Spot virtual machine and Azure Spot
     * scale set. &lt;br&gt;&lt;br&gt;For Azure Spot virtual machines, both 'Deallocate' and 'Delete' are supported and
     * the minimum api-version is 2019-03-01. &lt;br&gt;&lt;br&gt;For Azure Spot scale sets, both 'Deallocate' and
     * 'Delete' are supported and the minimum api-version is 2017-10-30-preview.
     *
     * @param evictionPolicy the evictionPolicy value to set.
     * @return the VirtualMachineInner object itself.
     */
    public VirtualMachineInner withEvictionPolicy(VirtualMachineEvictionPolicyTypes evictionPolicy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachinePropertiesInner();
        }
        this.innerProperties().withEvictionPolicy(evictionPolicy);
        return this;
    }

    /**
     * Get the billingProfile property: Specifies the billing related details of a Azure Spot virtual machine.
     * &lt;br&gt;&lt;br&gt;Minimum api-version: 2019-03-01.
     *
     * @return the billingProfile value.
     */
    public BillingProfile billingProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().billingProfile();
    }

    /**
     * Set the billingProfile property: Specifies the billing related details of a Azure Spot virtual machine.
     * &lt;br&gt;&lt;br&gt;Minimum api-version: 2019-03-01.
     *
     * @param billingProfile the billingProfile value to set.
     * @return the VirtualMachineInner object itself.
     */
    public VirtualMachineInner withBillingProfile(BillingProfile billingProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachinePropertiesInner();
        }
        this.innerProperties().withBillingProfile(billingProfile);
        return this;
    }

    /**
     * Get the host property: Specifies information about the dedicated host that the virtual machine resides in.
     * &lt;br&gt;&lt;br&gt;Minimum api-version: 2018-10-01.
     *
     * @return the host value.
     */
    public SubResource host() {
        return this.innerProperties() == null ? null : this.innerProperties().host();
    }

    /**
     * Set the host property: Specifies information about the dedicated host that the virtual machine resides in.
     * &lt;br&gt;&lt;br&gt;Minimum api-version: 2018-10-01.
     *
     * @param host the host value to set.
     * @return the VirtualMachineInner object itself.
     */
    public VirtualMachineInner withHost(SubResource host) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachinePropertiesInner();
        }
        this.innerProperties().withHost(host);
        return this;
    }

    /**
     * Get the hostGroup property: Specifies information about the dedicated host group that the virtual machine resides
     * in. &lt;br&gt;&lt;br&gt;Minimum api-version: 2020-06-01. &lt;br&gt;&lt;br&gt;NOTE: User cannot specify both host
     * and hostGroup properties.
     *
     * @return the hostGroup value.
     */
    public SubResource hostGroup() {
        return this.innerProperties() == null ? null : this.innerProperties().hostGroup();
    }

    /**
     * Set the hostGroup property: Specifies information about the dedicated host group that the virtual machine resides
     * in. &lt;br&gt;&lt;br&gt;Minimum api-version: 2020-06-01. &lt;br&gt;&lt;br&gt;NOTE: User cannot specify both host
     * and hostGroup properties.
     *
     * @param hostGroup the hostGroup value to set.
     * @return the VirtualMachineInner object itself.
     */
    public VirtualMachineInner withHostGroup(SubResource hostGroup) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachinePropertiesInner();
        }
        this.innerProperties().withHostGroup(hostGroup);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state, which only appears in the response.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the instanceView property: The virtual machine instance view.
     *
     * @return the instanceView value.
     */
    public VirtualMachineInstanceViewInner instanceView() {
        return this.innerProperties() == null ? null : this.innerProperties().instanceView();
    }

    /**
     * Get the licenseType property: Specifies that the image or disk that is being used was licensed on-premises.
     * &lt;br&gt;&lt;br&gt; Possible values for Windows Server operating system are: &lt;br&gt;&lt;br&gt; Windows_Client
     * &lt;br&gt;&lt;br&gt; Windows_Server &lt;br&gt;&lt;br&gt; Possible values for Linux Server operating system are:
     * &lt;br&gt;&lt;br&gt; RHEL_BYOS (for RHEL) &lt;br&gt;&lt;br&gt; SLES_BYOS (for SUSE) &lt;br&gt;&lt;br&gt; For more
     * information, see [Azure Hybrid Use Benefit for Windows
     * Server](https://docs.microsoft.com/azure/virtual-machines/windows/hybrid-use-benefit-licensing)
     * &lt;br&gt;&lt;br&gt; [Azure Hybrid Use Benefit for Linux
     * Server](https://docs.microsoft.com/azure/virtual-machines/linux/azure-hybrid-benefit-linux) &lt;br&gt;&lt;br&gt;
     * Minimum api-version: 2015-06-15.
     *
     * @return the licenseType value.
     */
    public String licenseType() {
        return this.innerProperties() == null ? null : this.innerProperties().licenseType();
    }

    /**
     * Set the licenseType property: Specifies that the image or disk that is being used was licensed on-premises.
     * &lt;br&gt;&lt;br&gt; Possible values for Windows Server operating system are: &lt;br&gt;&lt;br&gt; Windows_Client
     * &lt;br&gt;&lt;br&gt; Windows_Server &lt;br&gt;&lt;br&gt; Possible values for Linux Server operating system are:
     * &lt;br&gt;&lt;br&gt; RHEL_BYOS (for RHEL) &lt;br&gt;&lt;br&gt; SLES_BYOS (for SUSE) &lt;br&gt;&lt;br&gt; For more
     * information, see [Azure Hybrid Use Benefit for Windows
     * Server](https://docs.microsoft.com/azure/virtual-machines/windows/hybrid-use-benefit-licensing)
     * &lt;br&gt;&lt;br&gt; [Azure Hybrid Use Benefit for Linux
     * Server](https://docs.microsoft.com/azure/virtual-machines/linux/azure-hybrid-benefit-linux) &lt;br&gt;&lt;br&gt;
     * Minimum api-version: 2015-06-15.
     *
     * @param licenseType the licenseType value to set.
     * @return the VirtualMachineInner object itself.
     */
    public VirtualMachineInner withLicenseType(String licenseType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachinePropertiesInner();
        }
        this.innerProperties().withLicenseType(licenseType);
        return this;
    }

    /**
     * Get the vmId property: Specifies the VM unique ID which is a 128-bits identifier that is encoded and stored in
     * all Azure IaaS VMs SMBIOS and can be read using platform BIOS commands.
     *
     * @return the vmId value.
     */
    public String vmId() {
        return this.innerProperties() == null ? null : this.innerProperties().vmId();
    }

    /**
     * Get the extensionsTimeBudget property: Specifies the time alloted for all extensions to start. The time duration
     * should be between 15 minutes and 120 minutes (inclusive) and should be specified in ISO 8601 format. The default
     * value is 90 minutes (PT1H30M). &lt;br&gt;&lt;br&gt; Minimum api-version: 2020-06-01.
     *
     * @return the extensionsTimeBudget value.
     */
    public String extensionsTimeBudget() {
        return this.innerProperties() == null ? null : this.innerProperties().extensionsTimeBudget();
    }

    /**
     * Set the extensionsTimeBudget property: Specifies the time alloted for all extensions to start. The time duration
     * should be between 15 minutes and 120 minutes (inclusive) and should be specified in ISO 8601 format. The default
     * value is 90 minutes (PT1H30M). &lt;br&gt;&lt;br&gt; Minimum api-version: 2020-06-01.
     *
     * @param extensionsTimeBudget the extensionsTimeBudget value to set.
     * @return the VirtualMachineInner object itself.
     */
    public VirtualMachineInner withExtensionsTimeBudget(String extensionsTimeBudget) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachinePropertiesInner();
        }
        this.innerProperties().withExtensionsTimeBudget(extensionsTimeBudget);
        return this;
    }

    /**
     * Get the platformFaultDomain property: Specifies the scale set logical fault domain into which the Virtual Machine
     * will be created. By default, the Virtual Machine will by automatically assigned to a fault domain that best
     * maintains balance across available fault domains.&lt;br&gt;&lt;li&gt;This is applicable only if the
     * 'virtualMachineScaleSet' property of this Virtual Machine is set.&lt;li&gt;The Virtual Machine Scale Set that is
     * referenced, must have 'platformFaultDomainCount' &amp;gt; 1.&lt;li&gt;This property cannot be updated once the
     * Virtual Machine is created.&lt;li&gt;Fault domain assignment can be viewed in the Virtual Machine Instance
     * View.&lt;br&gt;&lt;br&gt;Minimum api‐version: 2020‐12‐01.
     *
     * @return the platformFaultDomain value.
     */
    public Integer platformFaultDomain() {
        return this.innerProperties() == null ? null : this.innerProperties().platformFaultDomain();
    }

    /**
     * Set the platformFaultDomain property: Specifies the scale set logical fault domain into which the Virtual Machine
     * will be created. By default, the Virtual Machine will by automatically assigned to a fault domain that best
     * maintains balance across available fault domains.&lt;br&gt;&lt;li&gt;This is applicable only if the
     * 'virtualMachineScaleSet' property of this Virtual Machine is set.&lt;li&gt;The Virtual Machine Scale Set that is
     * referenced, must have 'platformFaultDomainCount' &amp;gt; 1.&lt;li&gt;This property cannot be updated once the
     * Virtual Machine is created.&lt;li&gt;Fault domain assignment can be viewed in the Virtual Machine Instance
     * View.&lt;br&gt;&lt;br&gt;Minimum api‐version: 2020‐12‐01.
     *
     * @param platformFaultDomain the platformFaultDomain value to set.
     * @return the VirtualMachineInner object itself.
     */
    public VirtualMachineInner withPlatformFaultDomain(Integer platformFaultDomain) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachinePropertiesInner();
        }
        this.innerProperties().withPlatformFaultDomain(platformFaultDomain);
        return this;
    }

    /**
     * Get the scheduledEventsProfile property: Specifies Scheduled Event related configurations.
     *
     * @return the scheduledEventsProfile value.
     */
    public ScheduledEventsProfile scheduledEventsProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().scheduledEventsProfile();
    }

    /**
     * Set the scheduledEventsProfile property: Specifies Scheduled Event related configurations.
     *
     * @param scheduledEventsProfile the scheduledEventsProfile value to set.
     * @return the VirtualMachineInner object itself.
     */
    public VirtualMachineInner withScheduledEventsProfile(ScheduledEventsProfile scheduledEventsProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachinePropertiesInner();
        }
        this.innerProperties().withScheduledEventsProfile(scheduledEventsProfile);
        return this;
    }

    /**
     * Get the userData property: UserData for the VM, which must be base-64 encoded. Customer should not pass any
     * secrets in here. &lt;br&gt;&lt;br&gt;Minimum api-version: 2021-03-01.
     *
     * @return the userData value.
     */
    public String userData() {
        return this.innerProperties() == null ? null : this.innerProperties().userData();
    }

    /**
     * Set the userData property: UserData for the VM, which must be base-64 encoded. Customer should not pass any
     * secrets in here. &lt;br&gt;&lt;br&gt;Minimum api-version: 2021-03-01.
     *
     * @param userData the userData value to set.
     * @return the VirtualMachineInner object itself.
     */
    public VirtualMachineInner withUserData(String userData) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachinePropertiesInner();
        }
        this.innerProperties().withUserData(userData);
        return this;
    }

    /**
     * Get the capacityReservation property: Specifies information about the capacity reservation that is used to
     * allocate virtual machine. &lt;br&gt;&lt;br&gt;Minimum api-version: 2021-04-01.
     *
     * @return the capacityReservation value.
     */
    public CapacityReservationProfile capacityReservation() {
        return this.innerProperties() == null ? null : this.innerProperties().capacityReservation();
    }

    /**
     * Set the capacityReservation property: Specifies information about the capacity reservation that is used to
     * allocate virtual machine. &lt;br&gt;&lt;br&gt;Minimum api-version: 2021-04-01.
     *
     * @param capacityReservation the capacityReservation value to set.
     * @return the VirtualMachineInner object itself.
     */
    public VirtualMachineInner withCapacityReservation(CapacityReservationProfile capacityReservation) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachinePropertiesInner();
        }
        this.innerProperties().withCapacityReservation(capacityReservation);
        return this;
    }

    /**
     * Get the applicationProfile property: Specifies the gallery applications that should be made available to the
     * VM/VMSS.
     *
     * @return the applicationProfile value.
     */
    public ApplicationProfile applicationProfile() {
        return this.innerProperties() == null ? null : this.innerProperties().applicationProfile();
    }

    /**
     * Set the applicationProfile property: Specifies the gallery applications that should be made available to the
     * VM/VMSS.
     *
     * @param applicationProfile the applicationProfile value to set.
     * @return the VirtualMachineInner object itself.
     */
    public VirtualMachineInner withApplicationProfile(ApplicationProfile applicationProfile) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachinePropertiesInner();
        }
        this.innerProperties().withApplicationProfile(applicationProfile);
        return this;
    }

    /**
     * Get the timeCreated property: Specifies the time at which the Virtual Machine resource was
     * created.&lt;br&gt;&lt;br&gt;Minimum api-version: 2021-11-01.
     *
     * @return the timeCreated value.
     */
    public OffsetDateTime timeCreated() {
        return this.innerProperties() == null ? null : this.innerProperties().timeCreated();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (plan() != null) {
            plan().validate();
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
        if (resources() != null) {
            resources().forEach(e -> e.validate());
        }
        if (identity() != null) {
            identity().validate();
        }
        if (extendedLocation() != null) {
            extendedLocation().validate();
        }
    }
}
