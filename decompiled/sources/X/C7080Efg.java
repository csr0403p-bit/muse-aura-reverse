package X;

import java.util.Map;

/* renamed from: X.Efg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7080Efg {
    public Map<CCV, C6988Edo> A00 = BV4.A0u();

    public final synchronized C6988Edo A00(CCV ccv) {
        ccv.getClass();
        Map<CCV, C6988Edo> map = this.A00;
        C6988Edo c6988EdoA01 = map.get(ccv);
        if (c6988EdoA01 != null) {
            synchronized (c6988EdoA01) {
                if (!c6988EdoA01.A09()) {
                    map.remove(ccv);
                    AbstractC3422CMk.A02(C7080Efg.class, "Found closed reference %d for key %s (%d)", BV7.A0n(c6988EdoA01), ccv.AMJ(), BV7.A0n(ccv));
                    return null;
                }
                c6988EdoA01 = C6988Edo.A01(c6988EdoA01);
            }
        }
        return c6988EdoA01;
    }

    public final void A01(CCV ccv) {
        C6988Edo c6988EdoRemove;
        synchronized (this) {
            c6988EdoRemove = this.A00.remove(ccv);
        }
        if (c6988EdoRemove != null) {
            try {
                c6988EdoRemove.A09();
            } finally {
                c6988EdoRemove.close();
            }
        }
    }

    public final synchronized void A02(CCV ccv, C6988Edo c6988Edo) {
        CVn.A02(c6988Edo.A09());
        Map<CCV, C6988Edo> map = this.A00;
        C6988Edo c6988Edo2 = map.get(ccv);
        if (c6988Edo2 != null) {
            EfF efF = c6988Edo2.A0C;
            EfF efFA03 = efF != null ? efF.A03() : null;
            EfF efF2 = c6988Edo.A0C;
            EfF efFA032 = efF2 != null ? efF2.A03() : null;
            if (efFA03 != null) {
                if (efFA032 != null) {
                    try {
                        if (efFA03.A04() == efFA032.A04()) {
                            map.remove(ccv);
                            efFA032.close();
                            efFA03.close();
                            c6988Edo2.close();
                            try {
                                map.size();
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        efFA032.close();
                        efFA03.close();
                        c6988Edo2.close();
                        throw th2;
                    }
                }
                efFA03.close();
                c6988Edo2.close();
            } else {
                if (efFA032 != null) {
                }
                c6988Edo2.close();
            }
            efFA032.close();
            if (efFA03 != null) {
                efFA03.close();
            }
            c6988Edo2.close();
        }
    }
}
