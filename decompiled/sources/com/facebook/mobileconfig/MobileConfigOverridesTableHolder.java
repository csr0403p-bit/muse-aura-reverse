package com.facebook.mobileconfig;

import X.DS5;
import com.facebook.jni.HybridData;

/* loaded from: classes5.dex */
public class MobileConfigOverridesTableHolder implements DS5 {
    public final HybridData mHybridData;

    @Override // X.DS5
    public native boolean boolOverrideForParam(long j, boolean z);

    @Override // X.DS5
    public native double doubleOverrideForParam(long j, double d);

    @Override // X.DS5
    public native String experimentOverrideForUniverse(String str);

    @Override // X.DS5
    public native String groupOverrideForUniverse(String str);

    @Override // X.DS5
    public native boolean hasBoolOverrideForParam(long j);

    @Override // X.DS5
    public native boolean hasDoubleOverrideForParam(long j);

    @Override // X.DS5
    public native boolean hasIntOverrideForParam(long j);

    @Override // X.DS5
    public native boolean hasNullOverrideForParam(long j);

    @Override // X.DS5
    public native boolean hasOverrideForUniverse(String str);

    @Override // X.DS5
    public native boolean hasOverridesFile();

    @Override // X.DS5
    public native boolean hasStringOverrideForParam(long j);

    @Override // X.DS5
    public native long intOverrideForParam(long j, long j2);

    public native void reload();

    @Override // X.DS5
    public native void removeAllOverrides();

    @Override // X.DS5
    public native void removeOverrideForParam(long j);

    @Override // X.DS5
    public native void removeOverridesForQEUniverse(String str);

    public native void setOverridesFileUpdatedCallback(MobileConfigUpdateOverridesTableCallback mobileConfigUpdateOverridesTableCallback);

    @Override // X.DS5
    public native String stringOverrideForParam(long j, String str);

    public native void updateOverrideForBool(long j, boolean z);

    public native void updateOverrideForDouble(long j, double d);

    public native void updateOverrideForInt(long j, long j2);

    @Override // X.DS5
    public native void updateOverrideForQE(String str, String str2, String str3);

    public native void updateOverrideForString(long j, String str);

    public MobileConfigOverridesTableHolder(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    @Override // X.DS5
    public void updateOverrideForParam(long j, double d) {
        updateOverrideForDouble(j, d);
    }

    @Override // X.DS5
    public void updateOverrideForParam(long j, long j2) {
        updateOverrideForInt(j, j2);
    }

    @Override // X.DS5
    public void updateOverrideForParam(long j, String str) {
        updateOverrideForString(j, str);
    }

    @Override // X.DS5
    public void updateOverrideForParam(long j, boolean z) {
        updateOverrideForBool(j, z);
    }
}
