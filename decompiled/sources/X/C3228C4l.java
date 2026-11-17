package X;

import com.facebook.errorreporting.field.ReportFieldBase;
import com.facebook.errorreporting.field.ReportFieldString;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

/* renamed from: X.C4l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3228C4l {
    public Throwable A00;
    public final Map<C3218C4a, Boolean> A01;
    public final Map<String, String> A02;
    public final Map<String, String> A03;
    public final Map<String, String> A04;
    public final Map A05;
    public final Map<C3221C4e, Long> A06;
    public final Map<ReportFieldString, String> A07;

    public static C3228C4l A00() {
        return new C3228C4l(null);
    }

    public final void A02(C3218C4a c3218C4a, boolean z) {
        this.A01.put(c3218C4a, Boolean.valueOf(z));
    }

    public final void A03(ReportFieldString reportFieldString, String str) {
        Map<ReportFieldString, String> map = this.A07;
        if (str == null) {
            str = "unknown";
        }
        map.put(reportFieldString, str);
    }

    public final void A04(C5Q c5q, EnumC3223C4g enumC3223C4g, File file) {
        Map<String, String> map;
        StringBuilder sbA0w;
        String str;
        String strA0v;
        if (enumC3223C4g == EnumC3223C4g.CRITICAL_REPORT) {
            map = this.A02;
            str = c5q.A01;
            if (str.equals("__")) {
                strA0v = c5q.A00;
                map.put(strA0v, file.getPath());
            }
            sbA0w = C60O.A0w();
        } else {
            map = this.A04;
            sbA0w = C60O.A0w();
            str = c5q.A01;
        }
        sbA0w.append(str);
        strA0v = AnonymousClass001.A0v(c5q.A00, sbA0w);
        map.put(strA0v, file.getPath());
    }

    public final void A05(Properties properties) {
        properties.putAll(this.A03);
        Iterator itA0n = AnonymousClass002.A0n(this.A07);
        while (itA0n.hasNext()) {
            Map.Entry entry = (Map.Entry) itA0n.next();
            properties.put(((ReportFieldBase) entry.getKey()).name, entry.getValue());
        }
        Iterator itA0n2 = AnonymousClass002.A0n(this.A06);
        while (itA0n2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) itA0n2.next();
            properties.put(((ReportFieldBase) entry2.getKey()).name, entry2.getValue().toString());
        }
        Iterator itA0n3 = AnonymousClass002.A0n(this.A01);
        while (itA0n3.hasNext()) {
            Map.Entry entry3 = (Map.Entry) itA0n3.next();
            properties.put(((ReportFieldBase) entry3.getKey()).name, entry3.getValue().toString());
        }
        Iterator itA0n4 = AnonymousClass002.A0n(this.A05);
        if (itA0n4.hasNext()) {
            C3cH.A0l(itA0n4).getKey();
            throw BV4.A0a("getName");
        }
    }

    public C3228C4l(Throwable th) {
        this.A03 = new HashMap();
        this.A07 = new HashMap();
        this.A06 = new HashMap();
        this.A01 = new HashMap();
        this.A05 = new HashMap();
        this.A02 = new HashMap();
        this.A04 = new HashMap();
        this.A00 = th;
    }

    public static void A01(C3221C4e c3221C4e, C3228C4l c3228C4l, long j) {
        c3228C4l.A06.put(c3221C4e, Long.valueOf(j));
    }

    public C3228C4l() {
        this(null);
    }
}
