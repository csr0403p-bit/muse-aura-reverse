package X;

import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.text.TextUtils;
import com.facebook.aura.analytics.waterfall.HatchPriceImpressionEventDataKt;
import com.facebook.common.build.BuildConstants;
import com.facebook.errorreporting.field.ReportFieldBase;
import com.facebook.errorreporting.field.ReportFieldString;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class C6E {
    public static C6E A03;
    public static boolean A04;
    public static final Object A05 = C3cG.A0T();
    public C3280C7k A00;
    public String A01;
    public Executor A02;

    public final synchronized void A04(Map map) {
        Executor executorA00 = this.A02;
        if (executorA00 == null) {
            executorA00 = C51.A00();
            this.A02 = executorA00;
        }
        executorA00.execute(new C6K(this, map));
    }

    public static C6E A00() {
        C6E c6e;
        synchronized (A05) {
            c6e = A03;
            if (c6e == null) {
                String string = AbstractC3285C9b.A00("mobile", "reliability_event_log_upload").toString();
                c6e = new C6E();
                c6e.A01 = string;
                c6e.A00 = null;
                A03 = c6e;
            }
        }
        return c6e;
    }

    public static void A01(ReportFieldBase reportFieldBase, String str, Map<String, String> map) {
        synchronized (A05) {
            if (TextUtils.isEmpty(str)) {
                map.remove(reportFieldBase.name);
            } else if (TextUtils.isEmpty(map.get(reportFieldBase.name))) {
                map.put(reportFieldBase.name, str);
            }
        }
    }

    public static void A02(String str, String str2, String str3, Map map) {
        ReportFieldString reportFieldString;
        long totalBytes;
        Object obj = A05;
        synchronized (obj) {
            if (!A04) {
                A04 = true;
            }
        }
        long jA02 = C3cI.A02();
        C3221C4e c3221C4e = C6B.A3w;
        String string = Long.toString(jA02);
        A01(c3221C4e, string, map);
        A01(C6B.A1m, string, map);
        if (str != null) {
            A01(C6B.AAv, str, map);
        } else {
            CFK.A06(C9Y.TAG, "User Id missing. Direct reports use 0 as user id.");
            A01(C6B.AAv, HatchPriceImpressionEventDataKt.NO_DISCOUNT, map);
        }
        if (str2 != null) {
            reportFieldString = C6B.A4Q;
        } else {
            CFK.A06(C9Y.TAG, "ACTOR_ID missing. Direct reports use 0 as id.");
            reportFieldString = C6B.A4Q;
            str2 = "-6";
        }
        A01(reportFieldString, str2, map);
        if (str3 != null) {
            A01(C6B.A4L, str3, map);
        } else {
            CFK.A06(C9Y.TAG, "ACTING_ACCOUNT_ID missing. Direct reports use 0 as id.");
            A01(C6B.A4L, HatchPriceImpressionEventDataKt.NO_DISCOUNT, map);
        }
        A01(C6B.A6Z, "lacrima_direct_report", map);
        A01(C6B.A5U, "lacrima_direct_report", map);
        A01(C6B.AA7, "lacrima_direct_report", map);
        C3221C4e c3221C4e2 = C6B.A49;
        synchronized (C3262C6f.class) {
            totalBytes = C3262C6f.A00;
            if (totalBytes == 1) {
                totalBytes = new StatFs(Environment.getDataDirectory().getPath()).getTotalBytes();
                C3262C6f.A00 = totalBytes;
            }
        }
        A01(c3221C4e2, Long.toString(totalBytes), map);
        A01(C6B.A23, Long.toString(C3262C6f.A00()), map);
        A01(C6B.A5I, "r", map);
        C3221C4e c3221C4e3 = C6B.A3W;
        BuildConstants.A01();
        String string2 = Long.toString(1114131228L);
        A01(c3221C4e3, string2, map);
        synchronized (obj) {
            A01(C6B.A53, HatchPriceImpressionEventDataKt.NO_DISCOUNT, map);
            A01(C6B.A6L, HatchPriceImpressionEventDataKt.NO_DISCOUNT, map);
            A01(C6B.A5P, HatchPriceImpressionEventDataKt.NO_DISCOUNT, map);
        }
        A01(C6B.A0G, Boolean.toString(BuildConstants.A03()), map);
        A01(C6B.A3F, Long.toString(Process.myPid()), map);
        A01(C6B.A0W, Boolean.toString(BuildConstants.A04()), map);
        A01(C6B.A6N, Build.MODEL, map);
        A01(C6B.A6O, Build.DEVICE, map);
        A01(C6B.A6J, Build.BRAND, map);
        A01(C6B.A6Q, Build.VERSION.RELEASE, map);
        A01(C6B.A6T, "true", map);
        if (Build.VERSION.SDK_INT >= 30) {
            JSONObject jSONObjectA00 = C2N.A00();
            if (jSONObjectA00.length() > 0) {
                A01(C6B.AAF, jSONObjectA00.toString(), map);
            }
        }
        ReportFieldString reportFieldString2 = C6B.A9y;
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(Math.random());
        sbA0w.append("-");
        A01(reportFieldString2, BV4.A0m(sbA0w, System.currentTimeMillis()), map);
        BuildConstants.A01();
        A01(C6B.A1j, string2, map);
        A01(C6B.A2q, string2, map);
        A01(C6B.A8o, "16.0.0.11.159", map);
        A01(C6B.A0B, Boolean.toString(true), map);
    }

    public static void A03(String str, String str2, Map<String, String> map) {
        A01(C6B.A5v, "soft_error", map);
        A01(C6B.A5K, "i", map);
        A01(C6B.AAN, str, map);
        A01(C6B.AAO, str2, map);
        synchronized (A05) {
            if (TextUtils.isEmpty(map.get("cause"))) {
                A01(C6B.A5w, C6Q.A01(BV4.A0d(FGI.A0U(str, " | ", str2), null)), map);
            }
        }
    }
}
