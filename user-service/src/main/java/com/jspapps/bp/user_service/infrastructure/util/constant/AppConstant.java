package com.jspapps.bp.user_service.infrastructure.util.constant;

public class AppConstant {

    // Kafka configuration properties
    public static final String KAFKA_BOOTSTRAP_SERVERS = "kafka:9092";
    public static final String KAFKA_GROUP = "bankConsumer";
    public static final String KAFKA_AUTO_OFFSET_RESET_CONFIG = "earliest";
    public static final String KAFKA_TYPE_MAPPING =
            "createAccountCommand:com.jspapps.bp.user_service.domain.model.CreateAccountCommand," +
                    "accountVerifiedCommand:com.jspapps.bp.user_service.domain.model.AccountVerifiedCommand";


}
