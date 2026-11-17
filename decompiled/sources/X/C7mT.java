package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.7mT, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7mT {
    public static final C7mV A08 = new C7mY() { // from class: X.7mV
        public C7mY A00;

        @Override // X.C7mY
        public final void Ab1(String str) {
            C7mY c7mY;
            synchronized (this) {
                c7mY = this.A00;
            }
            c7mY.Ab1(str);
        }

        @Override // X.C7mY
        public final void report(String str, String str2, Throwable th) {
            C7mY c7mY;
            synchronized (this) {
                c7mY = this.A00;
            }
            c7mY.report(str, str2, th);
        }

        {
            C75I c75i = new C75I();
            synchronized (this) {
                this.A00 = c75i;
            }
        }
    };
    public static final C7mP A09 = new C7mP();
    public C7mH A00;
    public C7mK A01;
    public Map<C7381Etf, C7mX> A02;
    public C7n2 A03;
    public C7n3 A04;
    public final List A05;
    public final Map<C7381Etf, C7n0> A06;
    public final Set A07;

    public final synchronized C7n3 A01() {
        C7n3 c7n3;
        c7n3 = this.A04;
        if (c7n3 == null) {
            C7mH c7mH = this.A00;
            if (c7mH == null) {
                c7mH = new C7mH(A09, A08);
                this.A00 = c7mH;
            }
            c7n3 = new C7n3(c7mH, null, this.A05, this.A07);
            this.A04 = c7n3;
        }
        return c7n3;
    }

    public final synchronized C7n2 A02() {
        C7n2 c7n2;
        c7n2 = this.A03;
        if (c7n2 == null) {
            C7mK c7mK = this.A01;
            if (c7mK == null) {
                c7mK = new C7mK(A09, A08);
                this.A01 = c7mK;
            }
            c7n2 = new C7n2(c7mK, null, this.A05, this.A07);
            this.A03 = c7n2;
        }
        return c7n2;
    }

    public C7mT() {
        C7mZ.A00();
        Set set = C6Mr.A00;
        C7384Etj.A0U(set);
        this.A07 = set;
        C7mZ.A00();
        this.A05 = Collections.unmodifiableList(C7mW.A00);
        this.A00 = null;
        this.A01 = null;
        this.A04 = null;
        this.A03 = null;
        this.A02 = new HashMap();
        this.A06 = new HashMap();
    }
}
