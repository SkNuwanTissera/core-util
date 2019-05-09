package com.wso2telco.core.dbutils.util;

/**
 * Copyright (c) 2016, WSO2.Telco Inc. (http://www.wso2telco.com) All Rights Reserved.
 * <p>
 * WSO2.Telco Inc. licences this file to you under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "taskId",
        "taskType",
        "appId",
        "apiName",
        "description",
        "selectedTier",
        "status",
        "creditPlan",
        "selectedRate"
})
public class ApprovalRequest {

    @JsonProperty("taskId")
    private String taskId;
    @JsonProperty("taskType")
    private String taskType;
    @JsonProperty("appId")
    private String appId;
    @JsonProperty("apiName")
    private String apiName;
    @JsonProperty("description")
    private String description;
    @JsonProperty("selectedTier")
    private String selectedTier;
    @JsonProperty("status")
    private String status;
    @JsonProperty("creditPlan")
    private String creditPlan;
    @JsonProperty("selectedRate")
    private String selectedRate;

    @JsonProperty("taskId")
    public String getTaskId() {
        return taskId;
    }

    @JsonProperty("taskId")
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("selectedTier")
    public String getSelectedTier() {
        return selectedTier;
    }

    @JsonProperty("selectedTier")
    public void setSelectedTier(String selectedTier) {
        this.selectedTier = selectedTier;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("creditPlan")
    public String getCreditPlan() {
        return creditPlan;
    }

    @JsonProperty("creditPlan")
    public void setCreditPlan(String creditPlan) {
        this.creditPlan = creditPlan;
    }

    @JsonProperty("selectedRate")
    public String getSelectedRate() {
        return selectedRate;
    }

    @JsonProperty("selectedRate")
    public void setSelectedRate(String selectedRate) {
        this.selectedRate = selectedRate;
    }

    @JsonProperty("taskType")
    public String getTaskType() {
        return taskType;
    }

    @JsonProperty("taskType")
    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    @JsonProperty("appId")
    public String getAppId() {
        return appId;
    }

    @JsonProperty("appId")
    public void setAppId(String appId) {
        this.appId = appId;
    }

    @JsonProperty("apiName")
    public String getApiName() {
        return apiName;
    }

    @JsonProperty("apiName")
    public void setApiName(String apiName) {
        this.apiName = apiName;
    }
}
