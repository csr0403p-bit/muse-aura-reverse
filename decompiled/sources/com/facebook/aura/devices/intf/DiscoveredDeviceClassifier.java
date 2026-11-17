package com.facebook.aura.devices.intf;

import X.BFM;
import X.BRg;
import android.content.Context;

/* loaded from: classes4.dex */
public interface DiscoveredDeviceClassifier {
    void ScanStatus(BRg bRg, BFM bfm, int i);

    boolean isEnabled();

    DiscoveryScan startScan(Context context);
}
