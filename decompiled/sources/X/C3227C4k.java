package X;

import com.facebook.errorreporting.field.ReportFieldBase;

/* renamed from: X.C4k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3227C4k {
    public final void A00(ReportFieldBase reportFieldBase, F18<String> f18) {
        C3226C4j c3226C4j;
        synchronized (C3226C4j.class) {
        }
        synchronized (C3226C4j.class) {
            c3226C4j = C3226C4j.A03;
            if (c3226C4j == null) {
                c3226C4j = new C3226C4j();
                C3226C4j.A03 = c3226C4j;
            }
        }
        String str = reportFieldBase.name;
        C3188C2e c3188C2e = new C3188C2e(c3226C4j, f18);
        if (!C3226C4j.A04.containsKey(str) || str.equals("mobileconfig_canary")) {
            return;
        }
        synchronized (c3226C4j.A00) {
            c3226C4j.A01.put(str, c3188C2e);
        }
    }
}
