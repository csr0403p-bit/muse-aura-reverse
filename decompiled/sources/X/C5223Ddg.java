package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Ddg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5223Ddg {
    public static final Set<Integer> A01;
    public final QuickPerformanceLogger A00;

    public static final int A00(Map<String, String> map) {
        String strA0p;
        if (map == null || (strA0p = C60O.A0p("instance_key", map)) == null) {
            return -1;
        }
        return Integer.parseInt(strA0p);
    }

    static {
        Set<Integer> setA18 = C60O.A18();
        C7384Etj.A0U(setA18);
        A01 = setA18;
    }

    public C5223Ddg(QuickPerformanceLogger quickPerformanceLogger) {
        this.A00 = quickPerformanceLogger;
    }

    /* JADX WARN: Incorrect types in method signature: (ILjava/util/Map<Ljava/lang/String;Ljava/lang/String;>;I)V */
    public static final void A01(Map map, C5223Ddg c5223Ddg, int i) {
        String str;
        QuickPerformanceLogger quickPerformanceLogger;
        if (map != null) {
            Iterator itA0n = AnonymousClass002.A0n(map);
            while (itA0n.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0n);
                Integer[] numArrA00 = C79.A00(4);
                int length = numArrA00.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        switch (numArrA00[i2].intValue()) {
                            case 1:
                                str = "CALLER_NAME";
                                break;
                            case 2:
                                str = "FAILURE_REASON";
                                break;
                            case 3:
                                str = "TARGET_APP_FETCH_RESULT";
                                break;
                            default:
                                str = "RESOLVER_NAME";
                                break;
                        }
                        if (!AnonymousClass001.A0u(str).equals(entryA0l.getKey())) {
                            i2++;
                        } else if (((CharSequence) entryA0l.getValue()).length() > 0 && (quickPerformanceLogger = c5223Ddg.A00) != null) {
                            quickPerformanceLogger.markerAnnotate(857814189, i, C60O.A0t(entryA0l), (String) entryA0l.getValue());
                        }
                    }
                }
            }
        }
    }

    public final void A02(String str, String str2, Map map) {
        int iA00 = A00(map);
        QuickPerformanceLogger quickPerformanceLogger = this.A00;
        if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerPoint(857814189, iA00, str);
            if (str2 == null) {
                str2 = "";
            }
            quickPerformanceLogger.markerAnnotate(857814189, iA00, "credential_source", str2);
        }
        A01(map, this, iA00);
    }
}
