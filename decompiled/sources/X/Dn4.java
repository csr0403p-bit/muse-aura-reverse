package X;

import kotlin.Unit;

/* loaded from: classes5.dex */
public final class Dn4 extends AbstractC6059Duu {
    public Long A00;
    public String A01;
    public String A02;
    public String A03;
    public boolean A04;
    public final G0V<String, C5962Dsy, Unit> A05;

    public final synchronized void A01() {
        this.A03 = null;
        this.A00 = null;
        this.A02 = null;
        this.A01 = null;
        this.A04 = false;
        super.A00 = null;
    }

    public final synchronized void A02(String str, long j) {
        Long l;
        if (!str.equals(this.A03) || (l = this.A00) == null || l.longValue() != j) {
            this.A03 = str;
            this.A00 = Long.valueOf(j);
            this.A02 = null;
            this.A01 = null;
            this.A04 = false;
            super.A00 = new C5889DrT(this, str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean A03(java.lang.String r3, java.lang.String r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = r2.A03     // Catch: java.lang.Throwable -> L1b
            boolean r0 = r3.equals(r0)     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L18
            int r0 = r4.length()     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L18
            java.lang.String r0 = r2.A02     // Catch: java.lang.Throwable -> L1b
            boolean r1 = r4.equals(r0)     // Catch: java.lang.Throwable -> L1b
            r0 = 1
            if (r1 != 0) goto L19
        L18:
            r0 = 0
        L19:
            monitor-exit(r2)
            return r0
        L1b:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1b
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Dn4.A03(java.lang.String, java.lang.String):boolean");
    }

    public static final void A00(Dn4 dn4) {
        if (dn4.A04) {
            return;
        }
        dn4.A04 = true;
        C5962Dsy c5962Dsy = new C5962Dsy();
        c5962Dsy.A00.put("moq_to_pdash_fallback", true);
        InterfaceC6037DuY interfaceC6037DuY = ((AbstractC6059Duu) dn4).A00;
        if (interfaceC6037DuY != null) {
            interfaceC6037DuY.AWX(c5962Dsy);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Dn4(G0V<? super String, ? super C5962Dsy, Unit> g0v) {
        this.A05 = g0v;
    }
}
