// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.netapp.models.AvsDataStore;
import com.azure.resourcemanager.netapp.models.EnableSubvolumes;
import com.azure.resourcemanager.netapp.models.EncryptionKeySource;
import com.azure.resourcemanager.netapp.models.NetworkFeatures;
import com.azure.resourcemanager.netapp.models.PlacementKeyValuePairs;
import com.azure.resourcemanager.netapp.models.SecurityStyle;
import com.azure.resourcemanager.netapp.models.ServiceLevel;
import com.azure.resourcemanager.netapp.models.VolumePropertiesDataProtection;
import com.azure.resourcemanager.netapp.models.VolumePropertiesExportPolicy;
import com.azure.resourcemanager.netapp.models.VolumeStorageToNetworkProximity;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Volume resource. */
@Fluent
public final class VolumeInner extends Resource {
    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Availability Zone
     */
    @JsonProperty(value = "zones")
    private List<String> zones;

    /*
     * Volume properties
     */
    @JsonProperty(value = "properties", required = true)
    private VolumeProperties innerProperties = new VolumeProperties();

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy
     * information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the zones property: Availability Zone.
     *
     * @return the zones value.
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Set the zones property: Availability Zone.
     *
     * @param zones the zones value to set.
     * @return the VolumeInner object itself.
     */
    public VolumeInner withZones(List<String> zones) {
        this.zones = zones;
        return this;
    }

    /**
     * Get the innerProperties property: Volume properties.
     *
     * @return the innerProperties value.
     */
    private VolumeProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /** {@inheritDoc} */
    @Override
    public VolumeInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VolumeInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the fileSystemId property: FileSystem ID Unique FileSystem Identifier.
     *
     * @return the fileSystemId value.
     */
    public String fileSystemId() {
        return this.innerProperties() == null ? null : this.innerProperties().fileSystemId();
    }

    /**
     * Get the creationToken property: Creation Token or File Path A unique file path for the volume. Used when creating
     * mount targets.
     *
     * @return the creationToken value.
     */
    public String creationToken() {
        return this.innerProperties() == null ? null : this.innerProperties().creationToken();
    }

    /**
     * Set the creationToken property: Creation Token or File Path A unique file path for the volume. Used when creating
     * mount targets.
     *
     * @param creationToken the creationToken value to set.
     * @return the VolumeInner object itself.
     */
    public VolumeInner withCreationToken(String creationToken) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VolumeProperties();
        }
        this.innerProperties().withCreationToken(creationToken);
        return this;
    }

    /**
     * Get the serviceLevel property: serviceLevel The service level of the file system.
     *
     * @return the serviceLevel value.
     */
    public ServiceLevel serviceLevel() {
        return this.innerProperties() == null ? null : this.innerProperties().serviceLevel();
    }

    /**
     * Set the serviceLevel property: serviceLevel The service level of the file system.
     *
     * @param serviceLevel the serviceLevel value to set.
     * @return the VolumeInner object itself.
     */
    public VolumeInner withServiceLevel(ServiceLevel serviceLevel) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VolumeProperties();
        }
        this.innerProperties().withServiceLevel(serviceLevel);
        return this;
    }

    /**
     * Get the usageThreshold property: usageThreshold Maximum storage quota allowed for a file system in bytes. This is
     * a soft quota used for alerting only. Minimum size is 100 GiB. Upper limit is 100TiB. Specified in bytes.
     *
     * @return the usageThreshold value.
     */
    public long usageThreshold() {
        return this.innerProperties() == null ? 0L : this.innerProperties().usageThreshold();
    }

    /**
     * Set the usageThreshold property: usageThreshold Maximum storage quota allowed for a file system in bytes. This is
     * a soft quota used for alerting only. Minimum size is 100 GiB. Upper limit is 100TiB. Specified in bytes.
     *
     * @param usageThreshold the usageThreshold value to set.
     * @return the VolumeInner object itself.
     */
    public VolumeInner withUsageThreshold(long usageThreshold) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VolumeProperties();
        }
        this.innerProperties().withUsageThreshold(usageThreshold);
        return this;
    }

    /**
     * Get the exportPolicy property: exportPolicy Set of export policy rules.
     *
     * @return the exportPolicy value.
     */
    public VolumePropertiesExportPolicy exportPolicy() {
        return this.innerProperties() == null ? null : this.innerProperties().exportPolicy();
    }

    /**
     * Set the exportPolicy property: exportPolicy Set of export policy rules.
     *
     * @param exportPolicy the exportPolicy value to set.
     * @return the VolumeInner object itself.
     */
    public VolumeInner withExportPolicy(VolumePropertiesExportPolicy exportPolicy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VolumeProperties();
        }
        this.innerProperties().withExportPolicy(exportPolicy);
        return this;
    }

    /**
     * Get the protocolTypes property: protocolTypes Set of protocol types, default NFSv3, CIFS for SMB protocol.
     *
     * @return the protocolTypes value.
     */
    public List<String> protocolTypes() {
        return this.innerProperties() == null ? null : this.innerProperties().protocolTypes();
    }

    /**
     * Set the protocolTypes property: protocolTypes Set of protocol types, default NFSv3, CIFS for SMB protocol.
     *
     * @param protocolTypes the protocolTypes value to set.
     * @return the VolumeInner object itself.
     */
    public VolumeInner withProtocolTypes(List<String> protocolTypes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VolumeProperties();
        }
        this.innerProperties().withProtocolTypes(protocolTypes);
        return this;
    }

    /**
     * Get the provisioningState property: Azure lifecycle management.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the snapshotId property: Snapshot ID UUID v4 or resource identifier used to identify the Snapshot.
     *
     * @return the snapshotId value.
     */
    public String snapshotId() {
        return this.innerProperties() == null ? null : this.innerProperties().snapshotId();
    }

    /**
     * Set the snapshotId property: Snapshot ID UUID v4 or resource identifier used to identify the Snapshot.
     *
     * @param snapshotId the snapshotId value to set.
     * @return the VolumeInner object itself.
     */
    public VolumeInner withSnapshotId(String snapshotId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VolumeProperties();
        }
        this.innerProperties().withSnapshotId(snapshotId);
        return this;
    }

    /**
     * Get the backupId property: Backup ID UUID v4 or resource identifier used to identify the Backup.
     *
     * @return the backupId value.
     */
    public String backupId() {
        return this.innerProperties() == null ? null : this.innerProperties().backupId();
    }

    /**
     * Set the backupId property: Backup ID UUID v4 or resource identifier used to identify the Backup.
     *
     * @param backupId the backupId value to set.
     * @return the VolumeInner object itself.
     */
    public VolumeInner withBackupId(String backupId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VolumeProperties();
        }
        this.innerProperties().withBackupId(backupId);
        return this;
    }

    /**
     * Get the baremetalTenantId property: Baremetal Tenant ID Unique Baremetal Tenant Identifier.
     *
     * @return the baremetalTenantId value.
     */
    public String baremetalTenantId() {
        return this.innerProperties() == null ? null : this.innerProperties().baremetalTenantId();
    }

    /**
     * Get the subnetId property: The Azure Resource URI for a delegated subnet. Must have the delegation
     * Microsoft.NetApp/volumes.
     *
     * @return the subnetId value.
     */
    public String subnetId() {
        return this.innerProperties() == null ? null : this.innerProperties().subnetId();
    }

    /**
     * Set the subnetId property: The Azure Resource URI for a delegated subnet. Must have the delegation
     * Microsoft.NetApp/volumes.
     *
     * @param subnetId the subnetId value to set.
     * @return the VolumeInner object itself.
     */
    public VolumeInner withSubnetId(String subnetId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VolumeProperties();
        }
        this.innerProperties().withSubnetId(subnetId);
        return this;
    }

    /**
     * Get the networkFeatures property: Network features Basic network, or Standard features available to the volume.
     *
     * @return the networkFeatures value.
     */
    public NetworkFeatures networkFeatures() {
        return this.innerProperties() == null ? null : this.innerProperties().networkFeatures();
    }

    /**
     * Set the networkFeatures property: Network features Basic network, or Standard features available to the volume.
     *
     * @param networkFeatures the networkFeatures value to set.
     * @return the VolumeInner object itself.
     */
    public VolumeInner withNetworkFeatures(NetworkFeatures networkFeatures) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VolumeProperties();
        }
        this.innerProperties().withNetworkFeatures(networkFeatures);
        return this;
    }

    /**
     * Get the networkSiblingSetId property: Network Sibling Set ID Network Sibling Set ID for the the group of volumes
     * sharing networking resources.
     *
     * @return the networkSiblingSetId value.
     */
    public String networkSiblingSetId() {
        return this.innerProperties() == null ? null : this.innerProperties().networkSiblingSetId();
    }

    /**
     * Get the storageToNetworkProximity property: Storage to Network Proximity Provides storage to network proximity
     * information for the volume.
     *
     * @return the storageToNetworkProximity value.
     */
    public VolumeStorageToNetworkProximity storageToNetworkProximity() {
        return this.innerProperties() == null ? null : this.innerProperties().storageToNetworkProximity();
    }

    /**
     * Get the mountTargets property: mountTargets List of mount targets.
     *
     * @return the mountTargets value.
     */
    public List<MountTargetProperties> mountTargets() {
        return this.innerProperties() == null ? null : this.innerProperties().mountTargets();
    }

    /**
     * Get the volumeType property: What type of volume is this. For destination volumes in Cross Region Replication,
     * set type to DataProtection.
     *
     * @return the volumeType value.
     */
    public String volumeType() {
        return this.innerProperties() == null ? null : this.innerProperties().volumeType();
    }

    /**
     * Set the volumeType property: What type of volume is this. For destination volumes in Cross Region Replication,
     * set type to DataProtection.
     *
     * @param volumeType the volumeType value to set.
     * @return the VolumeInner object itself.
     */
    public VolumeInner withVolumeType(String volumeType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VolumeProperties();
        }
        this.innerProperties().withVolumeType(volumeType);
        return this;
    }

    /**
     * Get the dataProtection property: DataProtection DataProtection type volumes include an object containing details
     * of the replication.
     *
     * @return the dataProtection value.
     */
    public VolumePropertiesDataProtection dataProtection() {
        return this.innerProperties() == null ? null : this.innerProperties().dataProtection();
    }

    /**
     * Set the dataProtection property: DataProtection DataProtection type volumes include an object containing details
     * of the replication.
     *
     * @param dataProtection the dataProtection value to set.
     * @return the VolumeInner object itself.
     */
    public VolumeInner withDataProtection(VolumePropertiesDataProtection dataProtection) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VolumeProperties();
        }
        this.innerProperties().withDataProtection(dataProtection);
        return this;
    }

    /**
     * Get the isRestoring property: Restoring.
     *
     * @return the isRestoring value.
     */
    public Boolean isRestoring() {
        return this.innerProperties() == null ? null : this.innerProperties().isRestoring();
    }

    /**
     * Set the isRestoring property: Restoring.
     *
     * @param isRestoring the isRestoring value to set.
     * @return the VolumeInner object itself.
     */
    public VolumeInner withIsRestoring(Boolean isRestoring) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VolumeProperties();
        }
        this.innerProperties().withIsRestoring(isRestoring);
        return this;
    }

    /**
     * Get the snapshotDirectoryVisible property: If enabled (true) the volume will contain a read-only snapshot
     * directory which provides access to each of the volume's snapshots (default to true).
     *
     * @return the snapshotDirectoryVisible value.
     */
    public Boolean snapshotDirectoryVisible() {
        return this.innerProperties() == null ? null : this.innerProperties().snapshotDirectoryVisible();
    }

    /**
     * Set the snapshotDirectoryVisible property: If enabled (true) the volume will contain a read-only snapshot
     * directory which provides access to each of the volume's snapshots (default to true).
     *
     * @param snapshotDirectoryVisible the snapshotDirectoryVisible value to set.
     * @return the VolumeInner object itself.
     */
    public VolumeInner withSnapshotDirectoryVisible(Boolean snapshotDirectoryVisible) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VolumeProperties();
        }
        this.innerProperties().withSnapshotDirectoryVisible(snapshotDirectoryVisible);
        return this;
    }

    /**
     * Get the kerberosEnabled property: Describe if a volume is KerberosEnabled. To be use with swagger version
     * 2020-05-01 or later.
     *
     * @return the kerberosEnabled value.
     */
    public Boolean kerberosEnabled() {
        return this.innerProperties() == null ? null : this.innerProperties().kerberosEnabled();
    }

    /**
     * Set the kerberosEnabled property: Describe if a volume is KerberosEnabled. To be use with swagger version
     * 2020-05-01 or later.
     *
     * @param kerberosEnabled the kerberosEnabled value to set.
     * @return the VolumeInner object itself.
     */
    public VolumeInner withKerberosEnabled(Boolean kerberosEnabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VolumeProperties();
        }
        this.innerProperties().withKerberosEnabled(kerberosEnabled);
        return this;
    }

    /**
     * Get the securityStyle property: The security style of volume, default unix, defaults to ntfs for dual protocol or
     * CIFS protocol.
     *
     * @return the securityStyle value.
     */
    public SecurityStyle securityStyle() {
        return this.innerProperties() == null ? null : this.innerProperties().securityStyle();
    }

    /**
     * Set the securityStyle property: The security style of volume, default unix, defaults to ntfs for dual protocol or
     * CIFS protocol.
     *
     * @param securityStyle the securityStyle value to set.
     * @return the VolumeInner object itself.
     */
    public VolumeInner withSecurityStyle(SecurityStyle securityStyle) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VolumeProperties();
        }
        this.innerProperties().withSecurityStyle(securityStyle);
        return this;
    }

    /**
     * Get the smbEncryption property: Enables encryption for in-flight smb3 data. Only applicable for SMB/DualProtocol
     * volume. To be used with swagger version 2020-08-01 or later.
     *
     * @return the smbEncryption value.
     */
    public Boolean smbEncryption() {
        return this.innerProperties() == null ? null : this.innerProperties().smbEncryption();
    }

    /**
     * Set the smbEncryption property: Enables encryption for in-flight smb3 data. Only applicable for SMB/DualProtocol
     * volume. To be used with swagger version 2020-08-01 or later.
     *
     * @param smbEncryption the smbEncryption value to set.
     * @return the VolumeInner object itself.
     */
    public VolumeInner withSmbEncryption(Boolean smbEncryption) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VolumeProperties();
        }
        this.innerProperties().withSmbEncryption(smbEncryption);
        return this;
    }

    /**
     * Get the smbContinuouslyAvailable property: Enables continuously available share property for smb volume. Only
     * applicable for SMB volume.
     *
     * @return the smbContinuouslyAvailable value.
     */
    public Boolean smbContinuouslyAvailable() {
        return this.innerProperties() == null ? null : this.innerProperties().smbContinuouslyAvailable();
    }

    /**
     * Set the smbContinuouslyAvailable property: Enables continuously available share property for smb volume. Only
     * applicable for SMB volume.
     *
     * @param smbContinuouslyAvailable the smbContinuouslyAvailable value to set.
     * @return the VolumeInner object itself.
     */
    public VolumeInner withSmbContinuouslyAvailable(Boolean smbContinuouslyAvailable) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VolumeProperties();
        }
        this.innerProperties().withSmbContinuouslyAvailable(smbContinuouslyAvailable);
        return this;
    }

    /**
     * Get the throughputMibps property: Maximum throughput in Mibps that can be achieved by this volume and this will
     * be accepted as input only for manual qosType volume.
     *
     * @return the throughputMibps value.
     */
    public Float throughputMibps() {
        return this.innerProperties() == null ? null : this.innerProperties().throughputMibps();
    }

    /**
     * Set the throughputMibps property: Maximum throughput in Mibps that can be achieved by this volume and this will
     * be accepted as input only for manual qosType volume.
     *
     * @param throughputMibps the throughputMibps value to set.
     * @return the VolumeInner object itself.
     */
    public VolumeInner withThroughputMibps(Float throughputMibps) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VolumeProperties();
        }
        this.innerProperties().withThroughputMibps(throughputMibps);
        return this;
    }

    /**
     * Get the encryptionKeySource property: Source of key used to encrypt data in volume. Possible values
     * (case-insensitive) are: 'Microsoft.NetApp'.
     *
     * @return the encryptionKeySource value.
     */
    public EncryptionKeySource encryptionKeySource() {
        return this.innerProperties() == null ? null : this.innerProperties().encryptionKeySource();
    }

    /**
     * Set the encryptionKeySource property: Source of key used to encrypt data in volume. Possible values
     * (case-insensitive) are: 'Microsoft.NetApp'.
     *
     * @param encryptionKeySource the encryptionKeySource value to set.
     * @return the VolumeInner object itself.
     */
    public VolumeInner withEncryptionKeySource(EncryptionKeySource encryptionKeySource) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VolumeProperties();
        }
        this.innerProperties().withEncryptionKeySource(encryptionKeySource);
        return this;
    }

    /**
     * Get the ldapEnabled property: Specifies whether LDAP is enabled or not for a given NFS volume.
     *
     * @return the ldapEnabled value.
     */
    public Boolean ldapEnabled() {
        return this.innerProperties() == null ? null : this.innerProperties().ldapEnabled();
    }

    /**
     * Set the ldapEnabled property: Specifies whether LDAP is enabled or not for a given NFS volume.
     *
     * @param ldapEnabled the ldapEnabled value to set.
     * @return the VolumeInner object itself.
     */
    public VolumeInner withLdapEnabled(Boolean ldapEnabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VolumeProperties();
        }
        this.innerProperties().withLdapEnabled(ldapEnabled);
        return this;
    }

    /**
     * Get the coolAccess property: Specifies whether Cool Access(tiering) is enabled for the volume.
     *
     * @return the coolAccess value.
     */
    public Boolean coolAccess() {
        return this.innerProperties() == null ? null : this.innerProperties().coolAccess();
    }

    /**
     * Set the coolAccess property: Specifies whether Cool Access(tiering) is enabled for the volume.
     *
     * @param coolAccess the coolAccess value to set.
     * @return the VolumeInner object itself.
     */
    public VolumeInner withCoolAccess(Boolean coolAccess) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VolumeProperties();
        }
        this.innerProperties().withCoolAccess(coolAccess);
        return this;
    }

    /**
     * Get the coolnessPeriod property: Specifies the number of days after which data that is not accessed by clients
     * will be tiered.
     *
     * @return the coolnessPeriod value.
     */
    public Integer coolnessPeriod() {
        return this.innerProperties() == null ? null : this.innerProperties().coolnessPeriod();
    }

    /**
     * Set the coolnessPeriod property: Specifies the number of days after which data that is not accessed by clients
     * will be tiered.
     *
     * @param coolnessPeriod the coolnessPeriod value to set.
     * @return the VolumeInner object itself.
     */
    public VolumeInner withCoolnessPeriod(Integer coolnessPeriod) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VolumeProperties();
        }
        this.innerProperties().withCoolnessPeriod(coolnessPeriod);
        return this;
    }

    /**
     * Get the unixPermissions property: UNIX permissions for NFS volume accepted in octal 4 digit format. First digit
     * selects the set user ID(4), set group ID (2) and sticky (1) attributes. Second digit selects permission for the
     * owner of the file: read (4), write (2) and execute (1). Third selects permissions for other users in the same
     * group. the fourth for other users not in the group. 0755 - gives read/write/execute permissions to owner and
     * read/execute to group and other users.
     *
     * @return the unixPermissions value.
     */
    public String unixPermissions() {
        return this.innerProperties() == null ? null : this.innerProperties().unixPermissions();
    }

    /**
     * Set the unixPermissions property: UNIX permissions for NFS volume accepted in octal 4 digit format. First digit
     * selects the set user ID(4), set group ID (2) and sticky (1) attributes. Second digit selects permission for the
     * owner of the file: read (4), write (2) and execute (1). Third selects permissions for other users in the same
     * group. the fourth for other users not in the group. 0755 - gives read/write/execute permissions to owner and
     * read/execute to group and other users.
     *
     * @param unixPermissions the unixPermissions value to set.
     * @return the VolumeInner object itself.
     */
    public VolumeInner withUnixPermissions(String unixPermissions) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VolumeProperties();
        }
        this.innerProperties().withUnixPermissions(unixPermissions);
        return this;
    }

    /**
     * Get the cloneProgress property: When a volume is being restored from another volume's snapshot, will show the
     * percentage completion of this cloning process. When this value is empty/null there is no cloning process
     * currently happening on this volume. This value will update every 5 minutes during cloning.
     *
     * @return the cloneProgress value.
     */
    public Integer cloneProgress() {
        return this.innerProperties() == null ? null : this.innerProperties().cloneProgress();
    }

    /**
     * Get the avsDataStore property: avsDataStore Specifies whether the volume is enabled for Azure VMware Solution
     * (AVS) datastore purpose.
     *
     * @return the avsDataStore value.
     */
    public AvsDataStore avsDataStore() {
        return this.innerProperties() == null ? null : this.innerProperties().avsDataStore();
    }

    /**
     * Set the avsDataStore property: avsDataStore Specifies whether the volume is enabled for Azure VMware Solution
     * (AVS) datastore purpose.
     *
     * @param avsDataStore the avsDataStore value to set.
     * @return the VolumeInner object itself.
     */
    public VolumeInner withAvsDataStore(AvsDataStore avsDataStore) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VolumeProperties();
        }
        this.innerProperties().withAvsDataStore(avsDataStore);
        return this;
    }

    /**
     * Get the isDefaultQuotaEnabled property: Specifies if default quota is enabled for the volume.
     *
     * @return the isDefaultQuotaEnabled value.
     */
    public Boolean isDefaultQuotaEnabled() {
        return this.innerProperties() == null ? null : this.innerProperties().isDefaultQuotaEnabled();
    }

    /**
     * Set the isDefaultQuotaEnabled property: Specifies if default quota is enabled for the volume.
     *
     * @param isDefaultQuotaEnabled the isDefaultQuotaEnabled value to set.
     * @return the VolumeInner object itself.
     */
    public VolumeInner withIsDefaultQuotaEnabled(Boolean isDefaultQuotaEnabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VolumeProperties();
        }
        this.innerProperties().withIsDefaultQuotaEnabled(isDefaultQuotaEnabled);
        return this;
    }

    /**
     * Get the defaultUserQuotaInKiBs property: Default user quota for volume in KiBs. If isDefaultQuotaEnabled is set,
     * the minimum value of 4 KiBs applies .
     *
     * @return the defaultUserQuotaInKiBs value.
     */
    public Long defaultUserQuotaInKiBs() {
        return this.innerProperties() == null ? null : this.innerProperties().defaultUserQuotaInKiBs();
    }

    /**
     * Set the defaultUserQuotaInKiBs property: Default user quota for volume in KiBs. If isDefaultQuotaEnabled is set,
     * the minimum value of 4 KiBs applies .
     *
     * @param defaultUserQuotaInKiBs the defaultUserQuotaInKiBs value to set.
     * @return the VolumeInner object itself.
     */
    public VolumeInner withDefaultUserQuotaInKiBs(Long defaultUserQuotaInKiBs) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VolumeProperties();
        }
        this.innerProperties().withDefaultUserQuotaInKiBs(defaultUserQuotaInKiBs);
        return this;
    }

    /**
     * Get the defaultGroupQuotaInKiBs property: Default group quota for volume in KiBs. If isDefaultQuotaEnabled is
     * set, the minimum value of 4 KiBs applies.
     *
     * @return the defaultGroupQuotaInKiBs value.
     */
    public Long defaultGroupQuotaInKiBs() {
        return this.innerProperties() == null ? null : this.innerProperties().defaultGroupQuotaInKiBs();
    }

    /**
     * Set the defaultGroupQuotaInKiBs property: Default group quota for volume in KiBs. If isDefaultQuotaEnabled is
     * set, the minimum value of 4 KiBs applies.
     *
     * @param defaultGroupQuotaInKiBs the defaultGroupQuotaInKiBs value to set.
     * @return the VolumeInner object itself.
     */
    public VolumeInner withDefaultGroupQuotaInKiBs(Long defaultGroupQuotaInKiBs) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VolumeProperties();
        }
        this.innerProperties().withDefaultGroupQuotaInKiBs(defaultGroupQuotaInKiBs);
        return this;
    }

    /**
     * Get the maximumNumberOfFiles property: Maximum number of files allowed. Needs a service request in order to be
     * changed. Only allowed to be changed if volume quota is more than 4TiB.
     *
     * @return the maximumNumberOfFiles value.
     */
    public Long maximumNumberOfFiles() {
        return this.innerProperties() == null ? null : this.innerProperties().maximumNumberOfFiles();
    }

    /**
     * Get the volumeGroupName property: Volume Group Name.
     *
     * @return the volumeGroupName value.
     */
    public String volumeGroupName() {
        return this.innerProperties() == null ? null : this.innerProperties().volumeGroupName();
    }

    /**
     * Get the capacityPoolResourceId property: Pool Resource Id used in case of creating a volume through volume group.
     *
     * @return the capacityPoolResourceId value.
     */
    public String capacityPoolResourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().capacityPoolResourceId();
    }

    /**
     * Set the capacityPoolResourceId property: Pool Resource Id used in case of creating a volume through volume group.
     *
     * @param capacityPoolResourceId the capacityPoolResourceId value to set.
     * @return the VolumeInner object itself.
     */
    public VolumeInner withCapacityPoolResourceId(String capacityPoolResourceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VolumeProperties();
        }
        this.innerProperties().withCapacityPoolResourceId(capacityPoolResourceId);
        return this;
    }

    /**
     * Get the proximityPlacementGroup property: Proximity placement group associated with the volume.
     *
     * @return the proximityPlacementGroup value.
     */
    public String proximityPlacementGroup() {
        return this.innerProperties() == null ? null : this.innerProperties().proximityPlacementGroup();
    }

    /**
     * Set the proximityPlacementGroup property: Proximity placement group associated with the volume.
     *
     * @param proximityPlacementGroup the proximityPlacementGroup value to set.
     * @return the VolumeInner object itself.
     */
    public VolumeInner withProximityPlacementGroup(String proximityPlacementGroup) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VolumeProperties();
        }
        this.innerProperties().withProximityPlacementGroup(proximityPlacementGroup);
        return this;
    }

    /**
     * Get the t2Network property: T2 network information.
     *
     * @return the t2Network value.
     */
    public String t2Network() {
        return this.innerProperties() == null ? null : this.innerProperties().t2Network();
    }

    /**
     * Get the volumeSpecName property: Volume spec name is the application specific designation or identifier for the
     * particular volume in a volume group for e.g. data, log.
     *
     * @return the volumeSpecName value.
     */
    public String volumeSpecName() {
        return this.innerProperties() == null ? null : this.innerProperties().volumeSpecName();
    }

    /**
     * Set the volumeSpecName property: Volume spec name is the application specific designation or identifier for the
     * particular volume in a volume group for e.g. data, log.
     *
     * @param volumeSpecName the volumeSpecName value to set.
     * @return the VolumeInner object itself.
     */
    public VolumeInner withVolumeSpecName(String volumeSpecName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VolumeProperties();
        }
        this.innerProperties().withVolumeSpecName(volumeSpecName);
        return this;
    }

    /**
     * Get the encrypted property: Specifies if the volume is encrypted or not. Only available on volumes created or
     * updated after 2022-01-01.
     *
     * @return the encrypted value.
     */
    public Boolean encrypted() {
        return this.innerProperties() == null ? null : this.innerProperties().encrypted();
    }

    /**
     * Get the placementRules property: Volume placement rules Application specific placement rules for the particular
     * volume.
     *
     * @return the placementRules value.
     */
    public List<PlacementKeyValuePairs> placementRules() {
        return this.innerProperties() == null ? null : this.innerProperties().placementRules();
    }

    /**
     * Set the placementRules property: Volume placement rules Application specific placement rules for the particular
     * volume.
     *
     * @param placementRules the placementRules value to set.
     * @return the VolumeInner object itself.
     */
    public VolumeInner withPlacementRules(List<PlacementKeyValuePairs> placementRules) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VolumeProperties();
        }
        this.innerProperties().withPlacementRules(placementRules);
        return this;
    }

    /**
     * Get the enableSubvolumes property: Flag indicating whether subvolume operations are enabled on the volume.
     *
     * @return the enableSubvolumes value.
     */
    public EnableSubvolumes enableSubvolumes() {
        return this.innerProperties() == null ? null : this.innerProperties().enableSubvolumes();
    }

    /**
     * Set the enableSubvolumes property: Flag indicating whether subvolume operations are enabled on the volume.
     *
     * @param enableSubvolumes the enableSubvolumes value to set.
     * @return the VolumeInner object itself.
     */
    public VolumeInner withEnableSubvolumes(EnableSubvolumes enableSubvolumes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VolumeProperties();
        }
        this.innerProperties().withEnableSubvolumes(enableSubvolumes);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property innerProperties in model VolumeInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(VolumeInner.class);
}
