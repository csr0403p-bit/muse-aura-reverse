package X;

import java.util.List;
import java.util.logging.Logger;

/* renamed from: X.EcT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6920EcT {
    public static final Logger A07;
    public static final C6920EcT A08;
    public long A00;
    public boolean A01;
    public final C3600CWk A06;
    public int A02 = 10000;
    public final List<C6922EcV> A04 = C3cG.A0h();
    public final List<C6922EcV> A05 = C3cG.A0h();
    public final Runnable A03 = new RunnableC6921EcU(this);

    public final C6922EcV A01() {
        int i;
        synchronized (this) {
            i = this.A02;
            this.A02 = i + 1;
        }
        return new C6922EcV(AnonymousClass006.A0y(Integer.valueOf(i), "Q", C60O.A0w()), this);
    }

    static {
        String strA0y = AnonymousClass006.A0y(" TaskRunner", AbstractC6843Eav.A00, C60O.A0w());
        C7384Etj.A0Y(strA0y, 0);
        A08 = new C6920EcT(new C3600CWk(new EcI(strA0y, true)));
        Logger loggerA1B = BV5.A1B(C6920EcT.class);
        C7384Etj.A0U(loggerA1B);
        A07 = loggerA1B;
    }

    public static final void A00(AbstractC6924EcX abstractC6924EcX, C6920EcT c6920EcT, long j) {
        byte[] bArr = AbstractC6843Eav.A06;
        C6922EcV c6922EcV = abstractC6924EcX.A01;
        C7384Etj.A0X(c6922EcV);
        if (c6922EcV.A00 != abstractC6924EcX) {
            throw BV4.A0S();
        }
        boolean z = c6922EcV.A01;
        c6922EcV.A01 = false;
        c6922EcV.A00 = null;
        c6920EcT.A04.remove(c6922EcV);
        if (j != -1 && !z && !c6922EcV.A02) {
            c6922EcV.A04(abstractC6924EcX, j, true);
        }
        if (c6922EcV.A04.isEmpty()) {
            return;
        }
        c6920EcT.A05.add(c6922EcV);
    }

    public final void A02(C6922EcV c6922EcV) {
        byte[] bArr = AbstractC6843Eav.A06;
        if (c6922EcV.A00 == null) {
            boolean zIsEmpty = c6922EcV.A04.isEmpty();
            List<C6922EcV> list = this.A05;
            if (zIsEmpty) {
                list.remove(c6922EcV);
            } else if (!list.contains(c6922EcV)) {
                list.add(c6922EcV);
            }
        }
        boolean z = this.A01;
        C3600CWk c3600CWk = this.A06;
        if (z) {
            notify();
            return;
        }
        Runnable runnable = this.A03;
        C7384Etj.A0Y(runnable, 0);
        c3600CWk.A00.execute(runnable);
    }

    public C6920EcT(C3600CWk c3600CWk) {
        this.A06 = c3600CWk;
    }
}
