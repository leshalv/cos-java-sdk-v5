package com.qcloud.cos.model.ciModel.job;

import com.qcloud.cos.internal.CIServiceRequest;
import com.qcloud.cos.model.ciModel.common.MediaInputObject;
import com.qcloud.cos.model.ciModel.common.MediaOutputObject;

import javax.print.attribute.standard.Media;

/**
 * 文件处理请求类
 */
public class FileProcessRequest extends CIServiceRequest {
    private FileProcessJobType tag;
    private String queueId;
    private String callBackFormat;
    private String callBackType;
    private String callBack;
    private String callBackMqConfig;
    private MediaInputObject input;
    private MediaOutputObject output;
    private FileProcessOperation operation;

    public FileProcessJobType getTag() {
        return tag;
    }

    public void setTag(FileProcessJobType tag) {
        this.tag = tag;
    }

    public String getQueueId() {
        return queueId;
    }

    public void setQueueId(String queueId) {
        this.queueId = queueId;
    }

    public String getCallBackFormat() {
        return callBackFormat;
    }

    public void setCallBackFormat(String callBackFormat) {
        this.callBackFormat = callBackFormat;
    }

    public String getCallBackType() {
        return callBackType;
    }

    public void setCallBackType(String callBackType) {
        this.callBackType = callBackType;
    }

    public String getCallBack() {
        return callBack;
    }

    public void setCallBack(String callBack) {
        this.callBack = callBack;
    }

    public String getCallBackMqConfig() {
        return callBackMqConfig;
    }

    public void setCallBackMqConfig(String callBackMqConfig) {
        this.callBackMqConfig = callBackMqConfig;
    }

    public FileProcessOperation getOperation() {
        if (operation == null) {
            operation = new FileProcessOperation();
        }
        return operation;
    }

    public void setOperation(FileProcessOperation operation) {
        this.operation = operation;
    }

    public MediaInputObject getInput() {
        if (input == null) {
            input = new MediaInputObject();
        }
        return input;
    }

    public void setInput(MediaInputObject input) {
        this.input = input;
    }

    public MediaOutputObject getOutput() {
        if (output == null) {
            output = new MediaOutputObject();
        }
        return output;
    }

    public void setOutput(MediaOutputObject out) {
        this.output = out;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("FileProcessRequest{");
        sb.append("tag=").append(tag);
        sb.append(", queueId='").append(queueId).append('\'');
        sb.append(", callBackFormat='").append(callBackFormat).append('\'');
        sb.append(", callBackType='").append(callBackType).append('\'');
        sb.append(", callBack='").append(callBack).append('\'');
        sb.append(", callBackMqConfig='").append(callBackMqConfig).append('\'');
        sb.append(", operation=").append(operation);
        sb.append('}');
        return sb.toString();
    }
}
