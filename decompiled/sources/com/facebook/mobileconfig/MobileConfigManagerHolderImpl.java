package com.facebook.mobileconfig;

import X.BV5;
import X.C79;
import X.DS1;
import X.DS2;
import X.DS5;
import X.DS8;
import X.DSZ;
import X.ETi;
import X.EnumC7501EyH;
import com.facebook.jni.HybridData;
import com.facebook.mobileconfig.factory.MobileConfigUpdateConfigsCallback;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes5.dex */
public class MobileConfigManagerHolderImpl extends DS8 {
    public static final MobileConfigManagerHolderImpl $redex_init_class = null;
    public boolean mHasSessionId;
    public final HybridData mHybridData;
    public String mDataDirPath = "";
    public volatile MobileConfigUpdateOverridesTableCallback mOverridesTableCallback = null;
    public volatile MobileConfigExposureHandler mJavaExposureHandler = null;
    public final CountDownLatch SET_NETWORK_SERVICE_SIGNAL = BV5.A16();

    private native String copyManagerDirToNextTempDirNative();

    private native boolean finalizeCreationNative();

    private native String getAllPackageParamsMapHashInfoNative();

    private native String getBufferPathPostFixNative();

    private native int getInitStatusNative();

    private native String getNextBufferPathPostfixNative();

    private native String getPackageParamsMapAndHashParsingOrderNative();

    private native String getParamsMapParsingErrorsNative();

    private native String getSchemaHashNative();

    private native String getSchemaStringNative();

    private native boolean isValidNative();

    private native void logExposureNative(String str, long j, String str2, String str3);

    private native String saveCurrentParamsMapToDiskNative();

    private native boolean updateConfigsInternal(int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, MobileConfigUpdateConfigsCallback mobileConfigUpdateConfigsCallback, int[] iArr);

    public native void clearChangeListeners();

    @Override // X.InterfaceC5058DRj
    public native void clearCurrentUserData();

    @Override // X.InterfaceC5058DRj
    public native void clearOverrides();

    @Override // X.InterfaceC5058DRj
    public native boolean containsParamsHashForPackage(String str, String str2, int i);

    public native boolean deleteManagerDirs();

    @Override // X.InterfaceC5058DRj
    public native void deleteOldUserData(int i);

    public native void deleteTableFromStorage(String str);

    @Override // X.InterfaceC5058DRj
    public native void fetchNames(boolean z, MobileConfigUpdateConfigsCallback mobileConfigUpdateConfigsCallback);

    @Override // X.InterfaceC5058DRj
    public native String getConsistencyLoggingFlagsJSON();

    public native String getDirectoryPathForSession();

    public native String getFamilyDeviceId();

    @Override // X.InterfaceC5058DRj
    public native String getFrameworkStatus();

    @Override // X.InterfaceC5058DRj
    public native long getLastNormalUpdateTimestamp();

    public native int getLatestEPRefreshIdInternal();

    public native long getLatestFetchIntervalSecInternal();

    public native MobileConfigMmapHandleHolder getLatestHandleHolder();

    @Override // X.InterfaceC5058DRj
    public native long getLatestTotalParamsCount();

    public native MobileConfigOverridesTableHolder getOrCreateOverridesTableHolder();

    @Override // X.InterfaceC5058DRj
    public native String getParamsHashForPackage(String str);

    public native String getQueryHashString();

    public native boolean isConsistencyLoggingNeeded(int i);

    @Override // X.InterfaceC5058DRj
    public native boolean isFetchNeeded();

    public native boolean isNetworkServiceSet();

    @Override // X.InterfaceC5058DRj
    public native void logAccessWithoutExposure(String str, String str2);

    public native void logConfigs(String str, int i, Map<String, String> map);

    public native void logConfigsWithEndpoint(String str, int i, Map<String, String> map, String str2);

    @Override // X.InterfaceC5058DRj
    public native void logError(String str, String str2, String str3);

    @Override // X.InterfaceC5058DRj
    public native void logStorageConsistency();

    @Override // X.InterfaceC5058DRj
    public native boolean registerConfigChangeListener(MobileConfigCxxChangeListener mobileConfigCxxChangeListener);

    @Override // X.InterfaceC5058DRj
    public native boolean setEpHandler(MobileConfigEmergencyPushChangeListener mobileConfigEmergencyPushChangeListener);

    @Override // X.DS8, X.InterfaceC5058DRj
    public native void setFamilyDeviceId(String str);

    @Override // X.DS8, X.InterfaceC5058DRj
    public native void setResolvedParamsReceiver(MobileConfigResolvedParamsReceiver mobileConfigResolvedParamsReceiver);

    public native boolean setSandboxURL(String str);

    public native void setWaStableIdsInLookupMap(int[] iArr);

    public native boolean shouldRefetchFdidAndUpdateConfigs();

    @Override // X.InterfaceC5058DRj
    public native String syncFetchReason();

    public native MobileConfigManagerHolderImpl updateConfigsWithParamsListAndMayCreateManager(int i);

    @Override // X.InterfaceC5058DRj
    public native boolean updateEmergencyPushConfigs();

    @Override // X.InterfaceC5058DRj
    public native boolean updateEmergencyPushConfigs(MobileConfigUpdateConfigsCallback mobileConfigUpdateConfigsCallback);

    @Override // X.InterfaceC5058DRj
    public native boolean updateEmergencyPushConfigs(MobileConfigUpdateConfigsCallback mobileConfigUpdateConfigsCallback, Integer num);

    @Override // X.InterfaceC5058DRj
    public native boolean updateEmergencyPushConfigsSynchronously(int i);

    @Override // X.InterfaceC5058DRj
    public native boolean usePartialAndFullSyncFetch();

    static {
        ETi.loadLibrary("mobileconfig-jni");
    }

    @Override // X.InterfaceC5058DRj
    public String getDataDirPath() {
        return this.mDataDirPath;
    }

    @Override // X.InterfaceC5058DRj
    public boolean isConsistencyLoggingNeeded(EnumC7501EyH enumC7501EyH) {
        return isConsistencyLoggingNeeded(enumC7501EyH.mValue);
    }

    @Override // X.InterfaceC5058DRj
    public void logConfigs(String str, EnumC7501EyH enumC7501EyH, Map<String, String> map, String str2) {
        logConfigsWithEndpoint(str, enumC7501EyH.mValue, map, str2);
    }

    @Override // X.InterfaceC5058DRj
    public void logExposure(String str, long j) {
        logExposure(str, j, "");
    }

    @Override // X.DS8, X.InterfaceC5058DRj
    public Set<String> tryLogExposuresInJava(Set<String> set) {
        MobileConfigExposureHandler mobileConfigExposureHandler = this.mJavaExposureHandler;
        return mobileConfigExposureHandler != null ? mobileConfigExposureHandler.logExposures(set) : set;
    }

    @Override // X.InterfaceC5058DRj
    public boolean tryUpdateConfigsSynchronously(int i) {
        DS1 ds1 = new DS1();
        ds1.A00 = i;
        ds1.A02 = usePartialAndFullSyncFetch() ? C79.A0P : C79.A0C;
        ds1.A07 = true;
        ds1.A05 = true;
        return updateConfigs(ds1);
    }

    @Override // X.InterfaceC5058DRj
    public boolean updateConfigs(DS1 ds1) {
        int[] iArr;
        Set<Integer> set = ds1.A03;
        if (set != null) {
            iArr = new int[set.size()];
            Iterator<Integer> it = set.iterator();
            int i = 0;
            while (it.hasNext()) {
                iArr[i] = it.next().intValue();
                i++;
            }
        } else {
            iArr = null;
        }
        return updateConfigsInternal(2 - ds1.A02.intValue() != 0 ? 3 : 1, ds1.A00, 0, ds1.A04, ds1.A06, ds1.A07, ds1.A05, new DS2(this, ds1), iArr);
    }

    public MobileConfigManagerHolderImpl(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    @Override // X.InterfaceC5058DRj
    public int getInitStatus() {
        return getInitStatusNative();
    }

    @Override // X.InterfaceC5058DRj
    public Integer getLatestEPRefreshId() {
        return Integer.valueOf(getLatestEPRefreshIdInternal());
    }

    @Override // X.InterfaceC5058DRj
    public Long getLatestFetchIntervalSec() {
        return Long.valueOf(getLatestFetchIntervalSecInternal());
    }

    @Override // X.InterfaceC5058DRj
    public DSZ getLatestHandle() {
        MobileConfigMmapHandleHolder latestHandleHolder = getLatestHandleHolder();
        if (latestHandleHolder == null) {
            return null;
        }
        return latestHandleHolder;
    }

    @Override // X.InterfaceC5058DRj
    public DS5 getOrCreateOverridesTable() {
        MobileConfigOverridesTableHolder orCreateOverridesTableHolder = getOrCreateOverridesTableHolder();
        if (this.mOverridesTableCallback != null) {
            orCreateOverridesTableHolder.setOverridesFileUpdatedCallback(this.mOverridesTableCallback);
        }
        return orCreateOverridesTableHolder;
    }

    @Override // X.InterfaceC5058DRj
    public String getSchemaString() {
        return getSchemaStringNative();
    }

    @Override // X.InterfaceC5058DRj
    public boolean isValid() {
        return isValidNative();
    }

    @Override // X.InterfaceC5058DRj
    public void setOverridesTableCallback(MobileConfigUpdateOverridesTableCallback mobileConfigUpdateOverridesTableCallback) {
        this.mOverridesTableCallback = mobileConfigUpdateOverridesTableCallback;
    }

    @Override // X.InterfaceC5058DRj
    public void logConfigs(String str, EnumC7501EyH enumC7501EyH, Map<String, String> map) {
        logConfigs(str, enumC7501EyH.mValue, map);
    }

    @Override // X.InterfaceC5058DRj
    public void logExposure(String str, long j, String str2) {
        logExposure(str, j, str2, "");
    }

    @Override // X.InterfaceC5058DRj
    public void logExposure(String str, long j, String str2, String str3) {
        MobileConfigExposureHandler mobileConfigExposureHandler = this.mJavaExposureHandler;
        if (mobileConfigExposureHandler != null && mobileConfigExposureHandler.logExposure(str)) {
            return;
        }
        logExposureNative(str, j, str2, str3);
    }
}
