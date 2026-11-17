package com.facebook.traffic.nts;

/* loaded from: classes3.dex */
public interface TrafficNTSNetSeerV2ConfigInterface {
    String getBootstrapConfigString();

    int getMaxBackgroundTaskDurationSeconds();

    int getProbingIntervalMinutes();

    TrafficNTSNetSeerV2RolloutsInterface getRollouts();
}
