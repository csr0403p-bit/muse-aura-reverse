package com.meta.maps.core;

import X.AnonymousClass005;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class DeviceInfo {
    public String brand;
    public String device;
    public boolean isPhysicalDevice;
    public String model;
    public DeviceOS os;
    public String osApiLevel;
    public String osVersion;

    public DeviceInfo(DeviceOS deviceOS, String str, String str2, String str3, String str4, String str5, boolean z) {
        AnonymousClass005.A17(deviceOS, str, str2, str3, str4);
        C7384Etj.A0Y(str5, 5);
        this.os = deviceOS;
        this.brand = str;
        this.model = str2;
        this.device = str3;
        this.osVersion = str4;
        this.osApiLevel = str5;
        this.isPhysicalDevice = z;
    }
}
