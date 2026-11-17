package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes6.dex */
public final class FSW {
    public static int A0A;
    public double A00;
    public C8076FSf A02;
    public FSX A03;
    public final String A08;
    public final C8077FSg A05 = new C8077FSg();
    public final C8077FSg A06 = new C8077FSg();
    public final C8077FSg A07 = new C8077FSg();
    public boolean A04 = true;
    public double A01 = 0.0d;
    public final CopyOnWriteArraySet A09 = new CopyOnWriteArraySet();

    public final void A00() {
        C8077FSg c8077FSg = this.A05;
        double d = c8077FSg.A00;
        this.A00 = d;
        this.A07.A00 = d;
        c8077FSg.A01 = 0.0d;
    }

    public final void A01(double d) {
        FSX fsx = this.A03;
        this.A05.A00 = d;
        fsx.A01(this.A08);
        Iterator it = this.A09.iterator();
        while (it.hasNext()) {
            ((FST) it.next()).A07();
        }
        A00();
    }

    public final void A02(double d) {
        if (this.A00 == d && A03()) {
            return;
        }
        FSX fsx = this.A03;
        this.A00 = d;
        fsx.A01(this.A08);
        Iterator it = this.A09.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final boolean A03() {
        C8077FSg c8077FSg = this.A05;
        if (Math.abs(c8077FSg.A01) <= 0.005d) {
            return Math.abs(this.A00 - c8077FSg.A00) <= 0.005d || this.A02.A01 == 0.0d;
        }
        return false;
    }

    public FSW(FSX fsx) {
        this.A03 = fsx;
        int i = A0A;
        A0A = i + 1;
        this.A08 = FGI.A0H("spring:", i);
        this.A02 = C8076FSf.A02;
    }
}
