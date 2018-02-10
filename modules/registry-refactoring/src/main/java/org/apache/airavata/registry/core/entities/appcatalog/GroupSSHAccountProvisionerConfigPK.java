package org.apache.airavata.registry.core.entities.appcatalog;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by skariyat on 2/9/18.
 */
public class GroupSSHAccountProvisionerConfigPK implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "GATEWAY_ID")
    private String gatewayId;

    @Id
    @Column(name = "RESOURCE_ID")
    private String resourceId;

    @Id
    @Column(name = "GROUP_RESOURCE_PROFILE_ID")
    private String groupResourceProfileId;

    @Id
    @Column(name = "CONFIG_NAME")
    private String configName;


    public GroupSSHAccountProvisionerConfigPK() {
    }

    public GroupSSHAccountProvisionerConfigPK(String gatewayId, String resourceId, String groupResourceProfileId, String configName) {
        this.gatewayId = gatewayId;
        this.resourceId = resourceId;
        this.groupResourceProfileId = groupResourceProfileId;
        this.configName = configName;
    }

    public String getGatewayId() {
        return gatewayId;
    }

    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public String getGroupResourceProfileId() {
        return groupResourceProfileId;
    }

    public void setGroupResourceProfileId(String groupResourceProfileId) {
        this.groupResourceProfileId = groupResourceProfileId;
    }

    public String getConfigName() {
        return configName;
    }

    public void setConfigName(String configName) {
        this.configName = configName;
    }
}
