package com.bnpinnovation.dragoon.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

public interface JacketDto {
    @Getter
    @ToString
    class GasDetails {
        @JsonUnwrapped
        private Identity identity;
        private List<GasData> datas;
    }

    @Getter
    @ToString
    class SOSDetails {
        @JsonUnwrapped
        private Identity identity;
        private List<SOSData> datas;
    }


    @Getter
    @ToString
    class RentalDetails {
        @JsonUnwrapped
        private Identity identity;
        private List<RentalData> datas;
    }

    @Getter
    @ToString
    class GasData {
        @JsonProperty("AP_ID")
        private String apId;
        @JsonProperty("SENSOR_ID")
        private String sensorId;
        @JsonProperty("SENSING_DATE")
        private String sensingDate;
        @JsonProperty("USER_ID")
        private String userId;

        @JsonProperty("CO_DATA")
        private Float coData;
        @JsonProperty("H2S_DATA")
        private Float h2sData;
        @JsonProperty("O2_DATA")
        private Float o2Data;
        @JsonProperty("SENSOR_STATUS")
        private String sensorStatus;
    }

    @Getter
    @ToString
    class SOSData {
        @JsonProperty("AP_ID")
        private String apId;
        @JsonProperty("TAG_ID")
        private String tagId;
        @JsonProperty("SENSING_DATE")
        private String sensingDate;
        @JsonProperty("USER_ID")
        private String userId;
        @JsonProperty("EMERGENCY")
        private Float emergency;
    }

    @Getter
    @ToString
    class RentalData {
        @JsonProperty("AP_ID")
        private String apId;
        @JsonProperty("TAG_ID")
        private String tagId;
        @JsonProperty("SENSING_DATE")
        private String sensingDate;
        @JsonProperty("USER_ID")
        private String userId;
        @JsonProperty("RENTAL")
        private String rental;
    }

    @Getter
    @ToString
    class Identity {
        @JsonProperty("TASK_CODE")
        private String taskCode;
        @JsonProperty("DEV_TYPE")
        private String devType;
        @JsonProperty("FIELD_CD")
        private String fieldCode;
    }
}
