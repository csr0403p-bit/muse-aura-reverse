package X;

/* loaded from: classes5.dex */
public abstract class CRF {
    public void A01(CRG crg, CRG crg2) {
        if (this instanceof CRE) {
            crg.b = crg2;
        } else {
            CRC.A01.lazySet(crg, crg2);
        }
    }

    public void A02(CRG crg, Thread thread) {
        if (this instanceof CRE) {
            crg.a = thread;
        } else {
            CRC.A00.lazySet(crg, thread);
        }
    }

    public boolean A03(CRJ crj, CRJ crj2, CR8 cr8) {
        if (!(this instanceof CRE)) {
            return AbstractC5217DdT.A00(cr8, crj, crj2, CRC.A03);
        }
        synchronized (cr8) {
            if (cr8.b != crj) {
                return false;
            }
            cr8.b = crj2;
            return true;
        }
    }

    public boolean A04(CRG crg, CRG crg2, CR9 cr9) {
        if (!(this instanceof CRE)) {
            return AbstractC5217DdT.A00(cr9, crg, crg2, CRC.A02);
        }
        synchronized (cr9) {
            if (cr9.c != crg) {
                return false;
            }
            cr9.c = crg2;
            return true;
        }
    }

    public boolean A05(CR9 cr9, Object obj, Object obj2) {
        if (!(this instanceof CRE)) {
            return AbstractC5217DdT.A00(cr9, obj, obj2, CRC.A04);
        }
        synchronized (cr9) {
            if (cr9.a != obj) {
                return false;
            }
            cr9.a = obj2;
            return true;
        }
    }
}
