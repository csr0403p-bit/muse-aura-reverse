package X;

import com.facebook.aura.perf.HatchNavTTRCSpec;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.EOg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6669EOg {
    public final C8ee<?> A00;
    public final QuickPerformanceLogger A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6669EOg) {
                C6669EOg c6669EOg = (C6669EOg) obj;
                if (!this.A00.equals(c6669EOg.A00) || !this.A01.equals(c6669EOg.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void A01(int i, int i2, String str) {
        QuickPerformanceLogger quickPerformanceLogger = this.A01;
        quickPerformanceLogger.markerStart(i, i2);
        quickPerformanceLogger.markerAnnotate(i, i2, "logging_version", "5.0");
        quickPerformanceLogger.markerAnnotate(i, i2, "log_location", str);
    }

    public final void A02(Integer num, String str, String str2, Map map, EP0 ep0, EP1 ep1) {
        EOj eOj;
        EnumC6671EOi enumC6671EOi;
        BWw bWw;
        Eu1 eu1AcquireEvent = this.A00.acquireEvent("fx_access_library");
        if (eu1AcquireEvent.isSampled()) {
            switch (num.intValue()) {
                case 0:
                    eOj = EOj.FETCH_START;
                    break;
                case 1:
                    eOj = EOj.FETCH_SUCCESS;
                    break;
                case 2:
                    eOj = EOj.FETCH_EMPTY;
                    break;
                case 3:
                    eOj = EOj.FETCH_FAILURE;
                    break;
                case 4:
                    eOj = EOj.FETCH_ITEM_SUCCESS;
                    break;
                case 5:
                    eOj = EOj.FETCH_ITEM_FAILURE;
                    break;
                case 6:
                    eOj = EOj.WRITE_START;
                    break;
                case 7:
                    eOj = EOj.WRITE_SUCCESS;
                    break;
                case 8:
                    eOj = EOj.WRITE_FAILURE;
                    break;
                case 9:
                    eOj = EOj.REMOVE_START;
                    break;
                case 10:
                    eOj = EOj.REMOVE_SUCCESS;
                    break;
                default:
                    eOj = EOj.REMOVE_FAILURE;
                    break;
            }
            eu1AcquireEvent.A3V(eOj, "event");
            switch (ep0.ordinal()) {
                case 0:
                    enumC6671EOi = EnumC6671EOi.FACEBOOK;
                    break;
                case 1:
                    enumC6671EOi = EnumC6671EOi.INSTAGRAM;
                    break;
                case 2:
                    enumC6671EOi = EnumC6671EOi.MESSENGER;
                    break;
                case 3:
                    enumC6671EOi = EnumC6671EOi.BARCELONA;
                    break;
                case 4:
                    enumC6671EOi = EnumC6671EOi.OCULUS;
                    break;
                case 5:
                    enumC6671EOi = EnumC6671EOi.VIBES;
                    break;
                case 6:
                    enumC6671EOi = EnumC6671EOi.WEARABLES;
                    break;
                case 7:
                    enumC6671EOi = EnumC6671EOi.HATCH;
                    break;
                case 8:
                    enumC6671EOi = EnumC6671EOi.FACEBOOK_LITE;
                    break;
                case 9:
                    enumC6671EOi = EnumC6671EOi.INSTAGRAM_LITE;
                    break;
                default:
                    throw C3cG.A0q();
            }
            eu1AcquireEvent.A3V(enumC6671EOi, "target_app_source");
            eu1AcquireEvent.A3y("log_location", str);
            eu1AcquireEvent.A3y("version_id", "5.0");
            if (ep1 != null) {
                int iOrdinal = ep1.ordinal();
                if (iOrdinal == 0) {
                    bWw = BWw.ACTIVE_ACCOUNT;
                } else if (iOrdinal == 1) {
                    bWw = BWw.INACTIVE_LOGGED_IN_ACCOUNT;
                } else {
                    if (iOrdinal != 2) {
                        throw C3cG.A0q();
                    }
                    bWw = BWw.SAVED_ACCOUNT;
                }
                eu1AcquireEvent.A3V(bWw, "target_credential_source");
            }
            if (str2 != null) {
                eu1AcquireEvent.A3y(HatchNavTTRCSpec.AnnotationKeys.FAILURE_REASON, str2);
            }
            if (map != null && !map.isEmpty()) {
                LinkedHashMap linkedHashMapA0I = AIW.A0I(map);
                Iterator itA0n = AnonymousClass002.A0n(map);
                while (itA0n.hasNext()) {
                    Map.Entry entryA0l = C3cH.A0l(itA0n);
                    linkedHashMapA0I.put(((EOI) entryA0l.getKey()).key, entryA0l.getValue());
                }
                eu1AcquireEvent.A3g("debug_test_data", linkedHashMapA0I);
            }
            eu1AcquireEvent.APu();
        }
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A01, AnonymousClass005.A0E(this.A00));
    }

    public final String toString() {
        return C3cJ.A0L(this.A01, ", qplLogger=", C3cG.A0f(this.A00, "AccessLibraryStructuredLogger(falcoLogger="));
    }

    public C6669EOg(C8ee<?> c8ee, QuickPerformanceLogger quickPerformanceLogger) {
        AnonymousClass003.A0u(c8ee, quickPerformanceLogger);
        this.A00 = c8ee;
        this.A01 = quickPerformanceLogger;
    }

    public static void A00(String str, String str2, C6669EOg c6669EOg, int i, int i2) {
        String strA0M = FGI.A0M(str, str2);
        C7384Etj.A0Y(strA0M, 2);
        c6669EOg.A01.markerPoint(i, i2, strA0M);
    }
}
