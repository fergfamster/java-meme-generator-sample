/*
 * Copyright 2012-2013 Amazon Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.memes;

import java.util.Date;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.amazonaws.services.dynamodbv2.datamodeling.S3Link;

/**
 * Data model class for an image macro stored in Amazon DynamoDB.
 */
@DynamoDBTable(tableName = "reinvent-memes")
public class ImageMacro {

    private String id;
    private String topCaption;
    private String bottomCaption;
    private String status;
    private String createdBy;
    private S3Link startingImageLink;
    private S3Link finishedImageLink;
    private Date creationTime;
    private Date updateTime;

    public static final String NEW_STATUS     = "New";
    public static final String WORKING_STATUS = "Working";
    public static final String DONE_STATUS    = "Done";
    public static final String FAILED_STATUS  = "Failed";

    public ImageMacro() {
        status = NEW_STATUS;
    }

    @DynamoDBHashKey
    @DynamoDBAutoGeneratedKey
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public S3Link getStartingImageLink() {
        return startingImageLink;
    }

    public void setStartingImageLink(S3Link startingImageLink) {
        this.startingImageLink = startingImageLink;
    }

    public String getTopCaption() {
        return topCaption;
    }

    public void setTopCaption(String topCaption) {
        this.topCaption = topCaption;
    }

    public String getBottomCaption() {
        return bottomCaption;
    }

    public void setBottomCaption(String bottomCaption) {
        this.bottomCaption = bottomCaption;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public S3Link getFinishedImageLink() {
        return finishedImageLink;
    }

    public void setFinishedImageLink(S3Link finishedImageLink) {
        this.finishedImageLink = finishedImageLink;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
}