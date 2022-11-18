// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.devcenter.fluent.models.CatalogInner;
import java.time.OffsetDateTime;
import java.util.Map;

/** An immutable client-side representation of Catalog. */
public interface Catalog {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the provisioningState property: The provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the syncState property: The synchronization state of the catalog.
     *
     * @return the syncState value.
     */
    CatalogSyncState syncState();

    /**
     * Gets the lastSyncTime property: When the catalog was last synced.
     *
     * @return the lastSyncTime value.
     */
    OffsetDateTime lastSyncTime();

    /**
     * Gets the gitHub property: Properties for a GitHub catalog type.
     *
     * @return the gitHub value.
     */
    GitCatalog gitHub();

    /**
     * Gets the adoGit property: Properties for an Azure DevOps catalog type.
     *
     * @return the adoGit value.
     */
    GitCatalog adoGit();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.devcenter.fluent.models.CatalogInner object.
     *
     * @return the inner object.
     */
    CatalogInner innerModel();

    /** The entirety of the Catalog definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The Catalog definition stages. */
    interface DefinitionStages {
        /** The first stage of the Catalog definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the Catalog definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, devCenterName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param devCenterName The name of the devcenter.
             * @return the next definition stage.
             */
            WithCreate withExistingDevcenter(String resourceGroupName, String devCenterName);
        }
        /**
         * The stage of the Catalog definition which contains all the minimum required properties for the resource to be
         * created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithGitHub, DefinitionStages.WithAdoGit {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Catalog create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Catalog create(Context context);
        }
        /** The stage of the Catalog definition allowing to specify gitHub. */
        interface WithGitHub {
            /**
             * Specifies the gitHub property: Properties for a GitHub catalog type..
             *
             * @param gitHub Properties for a GitHub catalog type.
             * @return the next definition stage.
             */
            WithCreate withGitHub(GitCatalog gitHub);
        }
        /** The stage of the Catalog definition allowing to specify adoGit. */
        interface WithAdoGit {
            /**
             * Specifies the adoGit property: Properties for an Azure DevOps catalog type..
             *
             * @param adoGit Properties for an Azure DevOps catalog type.
             * @return the next definition stage.
             */
            WithCreate withAdoGit(GitCatalog adoGit);
        }
    }
    /**
     * Begins update for the Catalog resource.
     *
     * @return the stage of resource update.
     */
    Catalog.Update update();

    /** The template for Catalog update. */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithGitHub, UpdateStages.WithAdoGit {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Catalog apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Catalog apply(Context context);
    }
    /** The Catalog update stages. */
    interface UpdateStages {
        /** The stage of the Catalog update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the Catalog update allowing to specify gitHub. */
        interface WithGitHub {
            /**
             * Specifies the gitHub property: Properties for a GitHub catalog type..
             *
             * @param gitHub Properties for a GitHub catalog type.
             * @return the next definition stage.
             */
            Update withGitHub(GitCatalog gitHub);
        }
        /** The stage of the Catalog update allowing to specify adoGit. */
        interface WithAdoGit {
            /**
             * Specifies the adoGit property: Properties for an Azure DevOps catalog type..
             *
             * @param adoGit Properties for an Azure DevOps catalog type.
             * @return the next definition stage.
             */
            Update withAdoGit(GitCatalog adoGit);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Catalog refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Catalog refresh(Context context);

    /**
     * Syncs templates for a template source.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void sync();

    /**
     * Syncs templates for a template source.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void sync(Context context);
}
