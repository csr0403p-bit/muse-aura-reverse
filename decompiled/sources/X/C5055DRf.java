package X;

import com.facebook.mobileconfig.MobileConfigCxxChangeListener;
import com.facebook.mobileconfig.MobileConfigEmergencyPushChangeListener;
import com.facebook.mobileconfig.MobileConfigUpdateOverridesTableCallback;
import com.facebook.mobileconfig.factory.MobileConfigUpdateConfigsCallback;
import java.io.File;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.DRf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5055DRf extends DS8 {
    public AtomicReference<String> A00;
    public F18<C3143BzU> A01;
    public final int A02;
    public final String A03;

    @Override // X.InterfaceC5058DRj
    public final void clearCurrentUserData() {
    }

    @Override // X.InterfaceC5058DRj
    public final void clearOverrides() {
    }

    @Override // X.InterfaceC5058DRj
    public final void logConfigs(String str, EnumC7501EyH enumC7501EyH, Map<String, String> map, String str2) {
    }

    @Override // X.InterfaceC5058DRj
    public final void logStorageConsistency() {
    }

    @Override // X.InterfaceC5058DRj
    public final void fetchNames(boolean z, MobileConfigUpdateConfigsCallback mobileConfigUpdateConfigsCallback) {
        CFK.A05("MobileConfigManagerHolderNoop", "fetchNames");
        if (mobileConfigUpdateConfigsCallback != null) {
            mobileConfigUpdateConfigsCallback.onNetworkComplete(false);
        }
    }

    @Override // X.InterfaceC5058DRj
    public final String getConsistencyLoggingFlagsJSON() {
        return "MobileConfigManagerHolderNoop: MobileConfig manager not yet initialized";
    }

    @Override // X.InterfaceC5058DRj
    public final String getDataDirPath() {
        return "";
    }

    @Override // X.InterfaceC5058DRj
    public final String getFrameworkStatus() {
        return "UNINITIALIZED";
    }

    @Override // X.InterfaceC5058DRj
    public final int getInitStatus() {
        return 0;
    }

    @Override // X.InterfaceC5058DRj
    public final long getLastNormalUpdateTimestamp() {
        return 0L;
    }

    @Override // X.InterfaceC5058DRj
    public final Integer getLatestEPRefreshId() {
        return null;
    }

    @Override // X.InterfaceC5058DRj
    public final Long getLatestFetchIntervalSec() {
        return null;
    }

    @Override // X.InterfaceC5058DRj
    public final /* bridge */ /* synthetic */ DSZ getLatestHandle() {
        return null;
    }

    @Override // X.InterfaceC5058DRj
    public final long getLatestTotalParamsCount() {
        return -1L;
    }

    @Override // X.InterfaceC5058DRj
    public final DS5 getOrCreateOverridesTable() {
        F18<C3143BzU> f18;
        String str = this.A03;
        File fileA0K = BV5.A0K(str, "mc_overrides.json");
        CA6 ca6A01 = CA6.A01(fileA0K);
        if (str != null && (f18 = this.A01) != null && fileA0K.exists()) {
            ca6A01.A04(f18, this.A02);
        }
        return ca6A01;
    }

    @Override // X.InterfaceC5058DRj
    public final String getSchemaString() {
        return "";
    }

    @Override // X.InterfaceC5058DRj
    public final boolean isFetchNeeded() {
        return false;
    }

    @Override // X.InterfaceC5058DRj
    public final boolean isValid() {
        return false;
    }

    @Override // X.InterfaceC5058DRj
    public final String syncFetchReason() {
        return FGI.A0M("MobileConfigManagerHolderNoop: ", this.A00.get());
    }

    @Override // X.InterfaceC5058DRj
    public final boolean updateConfigs(DS1 ds1) {
        CFK.A05("MobileConfigManagerHolderNoop", "updateConfigs(options)");
        MobileConfigUpdateConfigsCallback mobileConfigUpdateConfigsCallback = ds1.A01;
        if (mobileConfigUpdateConfigsCallback != null) {
            mobileConfigUpdateConfigsCallback.onNetworkComplete(false);
        }
        return false;
    }

    @Override // X.InterfaceC5058DRj
    public final boolean usePartialAndFullSyncFetch() {
        return false;
    }

    public C5055DRf() {
        this.A00 = BV4.A16("");
        this.A03 = null;
        this.A02 = 0;
        this.A01 = null;
    }

    @Override // X.InterfaceC5058DRj
    public final void deleteOldUserData(int i) {
    }

    @Override // X.InterfaceC5058DRj
    public final String getParamsHashForPackage(String str) {
        return "";
    }

    @Override // X.InterfaceC5058DRj
    public final boolean isConsistencyLoggingNeeded(EnumC7501EyH enumC7501EyH) {
        return false;
    }

    @Override // X.InterfaceC5058DRj
    public final boolean registerConfigChangeListener(MobileConfigCxxChangeListener mobileConfigCxxChangeListener) {
        return false;
    }

    @Override // X.InterfaceC5058DRj
    public final boolean setEpHandler(MobileConfigEmergencyPushChangeListener mobileConfigEmergencyPushChangeListener) {
        return false;
    }

    @Override // X.InterfaceC5058DRj
    public final void setOverridesTableCallback(MobileConfigUpdateOverridesTableCallback mobileConfigUpdateOverridesTableCallback) {
    }

    @Override // X.InterfaceC5058DRj
    public final boolean tryUpdateConfigsSynchronously(int i) {
        return false;
    }

    @Override // X.InterfaceC5058DRj
    public final boolean updateEmergencyPushConfigs(MobileConfigUpdateConfigsCallback mobileConfigUpdateConfigsCallback) {
        return false;
    }

    @Override // X.InterfaceC5058DRj
    public final boolean updateEmergencyPushConfigsSynchronously(int i) {
        return false;
    }

    @Override // X.InterfaceC5058DRj
    public final void logAccessWithoutExposure(String str, String str2) {
    }

    @Override // X.InterfaceC5058DRj
    public final void logExposure(String str, long j) {
    }

    @Override // X.InterfaceC5058DRj
    public final boolean containsParamsHashForPackage(String str, String str2, int i) {
        return false;
    }

    @Override // X.InterfaceC5058DRj
    public final void logError(String str, String str2, String str3) {
    }

    /* JADX WARN: Incorrect types in method signature: (ILjava/io/File;LX/F18<LX/BzU;>;)V */
    public C5055DRf(File file, F18 f18, int i) {
        this.A00 = BV4.A16("");
        this.A02 = i;
        this.A03 = FGI.A0M(file.getAbsolutePath(), "/mobileconfig/");
        this.A01 = f18;
    }

    @Override // X.InterfaceC5058DRj
    public final boolean updateEmergencyPushConfigs(MobileConfigUpdateConfigsCallback mobileConfigUpdateConfigsCallback, Integer num) {
        return false;
    }

    @Override // X.InterfaceC5058DRj
    public final void logConfigs(String str, EnumC7501EyH enumC7501EyH, Map<String, String> map) {
    }

    @Override // X.InterfaceC5058DRj
    public final void logExposure(String str, long j, String str2) {
    }

    @Override // X.InterfaceC5058DRj
    public final boolean updateEmergencyPushConfigs() {
        return false;
    }

    @Override // X.InterfaceC5058DRj
    public final void logExposure(String str, long j, String str2, String str3) {
    }
}
