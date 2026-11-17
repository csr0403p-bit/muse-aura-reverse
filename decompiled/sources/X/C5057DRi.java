package X;

import com.facebook.mobileconfig.MobileConfigCxxChangeListener;
import com.facebook.mobileconfig.MobileConfigEmergencyPushChangeListener;
import com.facebook.mobileconfig.MobileConfigManagerHolderImpl;
import com.facebook.mobileconfig.MobileConfigResolvedParamsReceiver;
import com.facebook.mobileconfig.MobileConfigUpdateOverridesTableCallback;
import com.facebook.mobileconfig.factory.MobileConfigUpdateConfigsCallback;
import java.util.Map;
import java.util.Set;

/* renamed from: X.DRi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5057DRi extends DS8 {
    public DRX A01 = null;
    public MobileConfigResolvedParamsReceiver A00 = null;
    public volatile InterfaceC5058DRj A02 = new C5055DRf();

    public final synchronized InterfaceC5058DRj A01() {
        return this.A02;
    }

    @Override // X.DS8, X.InterfaceC5058DRj
    public final synchronized void setResolvedParamsReceiver(MobileConfigResolvedParamsReceiver mobileConfigResolvedParamsReceiver) {
        this.A00 = mobileConfigResolvedParamsReceiver;
        this.A02.setResolvedParamsReceiver(mobileConfigResolvedParamsReceiver);
    }

    public static MobileConfigManagerHolderImpl A00(InterfaceC5058DRj interfaceC5058DRj) {
        while (interfaceC5058DRj instanceof C5057DRi) {
            interfaceC5058DRj = ((C5057DRi) interfaceC5058DRj).A01();
        }
        if (!(interfaceC5058DRj instanceof MobileConfigManagerHolderImpl)) {
            interfaceC5058DRj = null;
        }
        return (MobileConfigManagerHolderImpl) interfaceC5058DRj;
    }

    @Override // X.InterfaceC5058DRj
    public final void clearCurrentUserData() {
        this.A02.clearCurrentUserData();
    }

    @Override // X.InterfaceC5058DRj
    public final void clearOverrides() {
        this.A02.clearOverrides();
    }

    @Override // X.InterfaceC5058DRj
    public final boolean containsParamsHashForPackage(String str, String str2, int i) {
        return this.A02.containsParamsHashForPackage(str, str2, i);
    }

    @Override // X.InterfaceC5058DRj
    public final void deleteOldUserData(int i) {
        this.A02.deleteOldUserData(i);
    }

    @Override // X.InterfaceC5058DRj
    public final void fetchNames(boolean z, MobileConfigUpdateConfigsCallback mobileConfigUpdateConfigsCallback) {
        this.A02.fetchNames(z, mobileConfigUpdateConfigsCallback);
    }

    @Override // X.InterfaceC5058DRj
    public final String getConsistencyLoggingFlagsJSON() {
        return this.A02.getConsistencyLoggingFlagsJSON();
    }

    @Override // X.InterfaceC5058DRj
    public final String getDataDirPath() {
        return this.A02.getDataDirPath();
    }

    @Override // X.InterfaceC5058DRj
    public final String getFrameworkStatus() {
        return this.A02.getFrameworkStatus();
    }

    @Override // X.InterfaceC5058DRj
    public final int getInitStatus() {
        return this.A02.getInitStatus();
    }

    @Override // X.InterfaceC5058DRj
    public final long getLastNormalUpdateTimestamp() {
        return this.A02.getLastNormalUpdateTimestamp();
    }

    @Override // X.InterfaceC5058DRj
    public final Integer getLatestEPRefreshId() {
        return this.A02.getLatestEPRefreshId();
    }

    @Override // X.InterfaceC5058DRj
    public final Long getLatestFetchIntervalSec() {
        return this.A02.getLatestFetchIntervalSec();
    }

    @Override // X.InterfaceC5058DRj
    public final DSZ getLatestHandle() {
        return this.A02.getLatestHandle();
    }

    @Override // X.InterfaceC5058DRj
    public final long getLatestTotalParamsCount() {
        return this.A02.getLatestTotalParamsCount();
    }

    @Override // X.InterfaceC5058DRj
    public final DS5 getOrCreateOverridesTable() {
        return this.A02.getOrCreateOverridesTable();
    }

    @Override // X.InterfaceC5058DRj
    public final String getParamsHashForPackage(String str) {
        return this.A02.getParamsHashForPackage(str);
    }

    @Override // X.InterfaceC5058DRj
    public final String getSchemaString() {
        return this.A02.getSchemaString();
    }

    @Override // X.InterfaceC5058DRj
    public final boolean isConsistencyLoggingNeeded(EnumC7501EyH enumC7501EyH) {
        return this.A02.isConsistencyLoggingNeeded(enumC7501EyH);
    }

    @Override // X.InterfaceC5058DRj
    public final boolean isFetchNeeded() {
        return this.A02.isFetchNeeded();
    }

    @Override // X.InterfaceC5058DRj
    public final boolean isValid() {
        return this.A02.isValid();
    }

    @Override // X.InterfaceC5058DRj
    public final void logAccessWithoutExposure(String str, String str2) {
        this.A02.logAccessWithoutExposure(str, str2);
    }

    @Override // X.InterfaceC5058DRj
    public final void logConfigs(String str, EnumC7501EyH enumC7501EyH, Map<String, String> map, String str2) {
        this.A02.logConfigs(str, enumC7501EyH, map, str2);
    }

    @Override // X.InterfaceC5058DRj
    public final void logError(String str, String str2, String str3) {
        this.A02.logError(str, str2, str3);
    }

    @Override // X.InterfaceC5058DRj
    public final void logExposure(String str, long j) {
        logExposure(str, j, "");
    }

    @Override // X.InterfaceC5058DRj
    public final void logStorageConsistency() {
        this.A02.logStorageConsistency();
    }

    @Override // X.InterfaceC5058DRj
    public final boolean registerConfigChangeListener(MobileConfigCxxChangeListener mobileConfigCxxChangeListener) {
        return this.A02.registerConfigChangeListener(mobileConfigCxxChangeListener);
    }

    @Override // X.InterfaceC5058DRj
    public final boolean setEpHandler(MobileConfigEmergencyPushChangeListener mobileConfigEmergencyPushChangeListener) {
        return this.A02.setEpHandler(mobileConfigEmergencyPushChangeListener);
    }

    @Override // X.InterfaceC5058DRj
    public final String syncFetchReason() {
        return this.A02.syncFetchReason();
    }

    @Override // X.DS8, X.InterfaceC5058DRj
    public final Set<String> tryLogExposuresInJava(Set<String> set) {
        return this.A02.tryLogExposuresInJava(set);
    }

    @Override // X.InterfaceC5058DRj
    public final boolean tryUpdateConfigsSynchronously(int i) {
        return this.A02.tryUpdateConfigsSynchronously(i);
    }

    @Override // X.InterfaceC5058DRj
    public final boolean updateConfigs(DS1 ds1) {
        return this.A02.updateConfigs(ds1);
    }

    @Override // X.InterfaceC5058DRj
    public final boolean updateEmergencyPushConfigs(MobileConfigUpdateConfigsCallback mobileConfigUpdateConfigsCallback) {
        return this.A02.updateEmergencyPushConfigs(mobileConfigUpdateConfigsCallback);
    }

    @Override // X.InterfaceC5058DRj
    public final boolean updateEmergencyPushConfigsSynchronously(int i) {
        return this.A02.updateEmergencyPushConfigsSynchronously(i);
    }

    @Override // X.InterfaceC5058DRj
    public final boolean usePartialAndFullSyncFetch() {
        return this.A02.usePartialAndFullSyncFetch();
    }

    @Override // X.InterfaceC5058DRj
    public final void setOverridesTableCallback(MobileConfigUpdateOverridesTableCallback mobileConfigUpdateOverridesTableCallback) {
    }

    @Override // X.InterfaceC5058DRj
    public final void logConfigs(String str, EnumC7501EyH enumC7501EyH, Map<String, String> map) {
        this.A02.logConfigs(str, enumC7501EyH, map);
    }

    @Override // X.InterfaceC5058DRj
    public final void logExposure(String str, long j, String str2) {
        this.A02.logExposure(str, j, str2);
    }

    @Override // X.InterfaceC5058DRj
    public final boolean updateEmergencyPushConfigs(MobileConfigUpdateConfigsCallback mobileConfigUpdateConfigsCallback, Integer num) {
        return this.A02.updateEmergencyPushConfigs(mobileConfigUpdateConfigsCallback, num);
    }

    @Override // X.InterfaceC5058DRj
    public final void logExposure(String str, long j, String str2, String str3) {
        this.A02.logExposure(str, j, str2, str3);
    }

    @Override // X.InterfaceC5058DRj
    public final boolean updateEmergencyPushConfigs() {
        return this.A02.updateEmergencyPushConfigs();
    }
}
