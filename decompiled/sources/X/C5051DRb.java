package X;

import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import com.facebook.mobileconfig.MobileConfigCxxChangeListener;
import com.facebook.mobileconfig.MobileConfigEmergencyPushChangeListener;
import com.facebook.mobileconfig.MobileConfigUpdateOverridesTableCallback;
import com.facebook.mobileconfig.factory.MobileConfigUpdateConfigsCallback;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.DRb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5051DRb extends DS8 {
    public int A00 = 0;
    public F18<C3143BzU> A01;
    public C3149Bzj A02;
    public final int A03;
    public final DS4 A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final Set<DSR> A08;
    public final Set<DSR> A09;
    public final Set<Long> A0A;

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

    public C5051DRb(DS4 ds4, File file, String str, int i) throws IOException {
        String strA0d = "";
        try {
            String canonicalPath = file.getCanonicalPath();
            strA0d = FGI.A0d(canonicalPath.endsWith(CustomConnectorRegisterRepositoryKt.ROOT_PATH) ? canonicalPath : FGI.A0M(canonicalPath, CustomConnectorRegisterRepositoryKt.ROOT_PATH), "mobileconfig", "".isEmpty() ? "" : FGI.A0M("_", ""), CustomConnectorRegisterRepositoryKt.ROOT_PATH);
        } catch (IOException e) {
            CFK.A0F("MobileConfigFilesOnDiskUtils", "In getBufferPath, failed to get canonical path for data dir %s: %s", file, e);
        }
        this.A05 = strA0d;
        this.A07 = str;
        this.A03 = i;
        this.A04 = ds4;
        this.A0A = ConcurrentHashMap.newKeySet();
        this.A09 = ConcurrentHashMap.newKeySet();
        this.A08 = ConcurrentHashMap.newKeySet();
        this.A02 = null;
        this.A06 = "";
    }

    @Override // X.InterfaceC5058DRj
    public final void fetchNames(boolean z, MobileConfigUpdateConfigsCallback mobileConfigUpdateConfigsCallback) {
        CFK.A05("MobileConfigJavaManager", "fetchNames");
        if (mobileConfigUpdateConfigsCallback != null) {
            mobileConfigUpdateConfigsCallback.onNetworkComplete(false);
        }
    }

    @Override // X.InterfaceC5058DRj
    public final String getConsistencyLoggingFlagsJSON() {
        return "Internal error: MobileConfig manager not yet initialized";
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
        return this.A00;
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
    public final DSZ getLatestHandle() throws IOException {
        StringBuilder sbA0y;
        if (this.A02 == null) {
            String strA0M = this.A05;
            int i = this.A03;
            String string = this.A07;
            if (string == null) {
                string = "";
            }
            String str = this.A06;
            if (!strA0M.endsWith(CustomConnectorRegisterRepositoryKt.ROOT_PATH)) {
                strA0M = FGI.A0M(strA0M, CustomConnectorRegisterRepositoryKt.ROOT_PATH);
            }
            String strA0M2 = FGI.A0M(C8j3.A0J(str, 2) == 0 ? "" : FGI.A0M("_", str), ".data/");
            if (i == 1) {
                string = "sessionless";
            } else if (i != 2 && i != 3 && i != 4) {
                if (i == 7) {
                    sbA0y = C60O.A0y("u", i);
                } else if (i != 9 && i != 10) {
                    sbA0y = C60O.A0y("u", i);
                    sbA0y.append("_");
                    sbA0y.append(string);
                }
                string = sbA0y.toString();
            }
            String strA0M3 = FGI.A0M(strA0M, FGI.A0M(string, strA0M2));
            C7384Etj.A0Y(strA0M3, 0);
            String strA00 = A00(strA0M3);
            if (!strA00.isEmpty()) {
                this.A02 = new C3149Bzj(strA00);
            }
        }
        return this.A02;
    }

    @Override // X.InterfaceC5058DRj
    public final long getLatestTotalParamsCount() {
        return -1L;
    }

    @Override // X.InterfaceC5058DRj
    public final DS5 getOrCreateOverridesTable() {
        File fileA0K = BV5.A0K(this.A05, "mc_overrides.json");
        CA6 ca6A01 = CA6.A01(fileA0K);
        if (this.A01 != null && fileA0K.exists()) {
            ca6A01.A04(this.A01, this.A03);
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
        return true;
    }

    @Override // X.InterfaceC5058DRj
    public final void logAccessWithoutExposure(String str, String str2) {
        this.A08.add(new DSR(str, 0L, "", str2));
    }

    @Override // X.InterfaceC5058DRj
    public final void logExposure(String str, long j) {
        logExposure(str, j, "");
    }

    @Override // X.InterfaceC5058DRj
    public final String syncFetchReason() {
        return "MobileConfigJavaManager: No sync fetch was needed";
    }

    @Override // X.InterfaceC5058DRj
    public final boolean updateConfigs(DS1 ds1) {
        CFK.A05("MobileConfigJavaManager", "updateConfigs(options)");
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

    /* JADX WARN: Multi-variable type inference failed */
    public static final String A00(String str) throws IOException {
        File[] fileArrListFiles = BV4.A0G(str).listFiles(DSP.A00);
        if (fileArrListFiles != null) {
            ArrayList arrayListA0h = C3cG.A0h();
            for (File file : fileArrListFiles) {
                try {
                    AnonymousClass002.A1J(Integer.valueOf(BV7.A0J(file.getName(), 0, C7384Etj.A06(r1) - 8)), file, arrayListA0h);
                } catch (NumberFormatException e) {
                    CFK.A0D("MobileConfigPathUtils", "Unexpected mctable file: %s", e, file);
                }
            }
            if (arrayListA0h.size() > 1) {
                AbstractC06907md.A04(arrayListA0h, new C7572F4l(25));
            }
            Iterator it = arrayListA0h.iterator();
            while (it.hasNext()) {
                File file2 = (File) C60Q.A10(it).second;
                try {
                    String canonicalPath = file2.getCanonicalPath();
                    C7384Etj.A0U(canonicalPath);
                    return canonicalPath;
                } catch (IOException e2) {
                    CFK.A0D("MobileConfigPathUtils", "In findLatestFlatbufferUnderDir, fail to get canonical path for %s: %s", e2, file2, e2);
                }
            }
        }
        return "";
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
    public final void logError(String str, String str2, String str3) {
        CFK.A0F("MobileConfigJavaManager", "logError: %s,%s,%s", str, str2, str3);
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
    public final boolean containsParamsHashForPackage(String str, String str2, int i) {
        return false;
    }

    @Override // X.InterfaceC5058DRj
    public final void logExposure(String str, long j, String str2) {
        logExposure(str, j, str2, "");
    }

    @Override // X.InterfaceC5058DRj
    public final boolean updateEmergencyPushConfigs(MobileConfigUpdateConfigsCallback mobileConfigUpdateConfigsCallback, Integer num) {
        return false;
    }

    @Override // X.InterfaceC5058DRj
    public final void logConfigs(String str, EnumC7501EyH enumC7501EyH, Map<String, String> map) {
    }

    @Override // X.InterfaceC5058DRj
    public final void logExposure(String str, long j, String str2, String str3) {
        this.A09.add(new DSR(str, j, str2, str3));
    }

    @Override // X.InterfaceC5058DRj
    public final boolean updateEmergencyPushConfigs() {
        return false;
    }
}
