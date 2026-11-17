package com.facebook.traffic.nts;

import com.facebook.traffic.nts.providers.radiosignal.SignalAggregationType;

/* loaded from: classes3.dex */
public interface RadioSignalProviderConfigInterface {
    boolean getEnableRadioSignalProviderXplatUpdates();

    boolean getEnableRadioSignalWifiMetrics();

    double getRadioSignalAggregationParameter();

    SignalAggregationType getRadioSignalAggregationType();

    int getRadioSignalProviderUpdateIntervalSec();
}
