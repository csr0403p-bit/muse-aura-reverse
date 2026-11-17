package com.facebook.mobileconfig;

import X.ETi;
import X.EnumC7514Eye;
import X.F34;
import X.F35;
import com.facebook.jni.HybridData;

/* loaded from: classes5.dex */
public class MobileConfigManagerParamsHolder {
    public static final String SERVICE_MANAGER_NAME = "service_manager";
    public final HybridData mHybridData;
    public final String mParamsMapPath;
    public int mUnitType;
    public final String mUserId;

    public static native HybridData initHybrid();

    private native void setBoolFlagInternal(int i, boolean z);

    private native boolean setInstaCrashRecoveryModeInternal(int i);

    private native void setStackTargetsInternal(int[] iArr);

    public native String getBufferDirName();

    public native String getBufferPathPostfix();

    public native String getFamilyDeviceId();

    public native boolean getShouldSortPackageParamsMaps();

    public native void setAdditionalParamsMapDirs(String str);

    public native void setAvoidRenamingCachesOnStart(boolean z);

    public native void setBufferDirName(String str);

    public native void setBufferPathPostfix(String str);

    public native void setConsistencyLoggingEnabled(boolean z);

    public native void setConsistencyLoggingEveryNSec(long j);

    public native void setConsistencyLoggingIntervalForBatchApi(long j);

    public native void setDirectReadCacheFile(boolean z);

    public native void setEnableBlnSchema(boolean z);

    public native void setEnableCacheRenameRetry(boolean z);

    public native void setEnableCacheRenameTableFirst(boolean z);

    public native void setEnableClientCanary(boolean z);

    public native void setEnableTieredMobileConfig(boolean z);

    public native void setEnableVirtualGK(boolean z);

    public native void setExposureLoggingUniverse(String str);

    public native void setFamilyDeviceId(String str);

    public native void setInstagramFlags(boolean z, int i);

    public native void setIsMobileConfigService(boolean z);

    public native void setManagerName(String str);

    public native void setOTAAddedParamsPath(String str);

    public native void setOTAOneQueryHashPath(String str);

    public native void setQueryHashOptimization(boolean z);

    public native void setShouldForceConfigTableUpgrades(boolean z);

    public native void setShouldIncludeStableSpecWithExposure(boolean z);

    public native void setShouldLogAccessWithoutExposures(boolean z);

    public native void setShouldNotifyOnlyEpConfigsWithNewerVersions(boolean z);

    public native void setShouldSendQueryHashFromRequestData(boolean z);

    public native void setShouldSendQueryStringsInEpFetch(boolean z);

    public native void setShouldSortPackageParamsMaps(boolean z);

    public native void setShouldUseOTAResource(boolean z);

    public void setStackTargets(F34... f34Arr) {
        int length = f34Arr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = f34Arr[i].value;
        }
        setStackTargetsInternal(iArr);
    }

    public native boolean setUniverseType(int i);

    public native boolean setUseCase(int i);

    public native void setUseFileRepo(boolean z);

    public native void setUseParamsMapV4(boolean z);

    public native void setUsePartialAndFullSyncFetch(boolean z);

    public native void setUsePlatformEpHandler(boolean z);

    public native void setUsingSafeStack(boolean z);

    public native void setUsingTigonMobileConfig(boolean z);

    static {
        ETi.loadLibrary("mobileconfig-jni");
    }

    public String getParamsMapPath() {
        return this.mParamsMapPath;
    }

    public int getUnitType() {
        return this.mUnitType;
    }

    public String getUserId() {
        return this.mUserId;
    }

    public void setBoolFlag(F35 f35, boolean z) {
        setBoolFlagInternal(f35.value, z);
    }

    public boolean setInstaCrashRecoveryMode(EnumC7514Eye enumC7514Eye) {
        return setInstaCrashRecoveryModeInternal(enumC7514Eye.value);
    }

    public MobileConfigManagerParamsHolder() {
        this.mUnitType = 1;
        this.mHybridData = initHybrid();
        this.mUserId = "";
        this.mParamsMapPath = "";
    }

    public MobileConfigManagerParamsHolder(String str, String str2, String str3, int i, String str4, boolean z, boolean z2) {
        this.mUnitType = 1;
        this.mHybridData = initHybrid();
        this.mUserId = str;
        setBufferPathPostfix(str2);
        if (str3 != null) {
            setBufferDirName(str3);
        }
        this.mUnitType = i;
        this.mParamsMapPath = str4;
        setShouldSortPackageParamsMaps(z);
        setShouldForceConfigTableUpgrades(z2);
        setEnableTieredMobileConfig(false);
    }
}
