package X;

/* renamed from: X.B9c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2184B9c {
    public C2183B9b A00;
    public boolean A01;

    public void A06(boolean z) {
    }

    public final void A02() {
        C2183B9b c2183B9b = this.A00;
        if (c2183B9b == null) {
            throw C3cG.A0Q("This input is not added to any dispatcher.");
        }
        if (!this.A01) {
            c2183B9b.A01(null, this);
        }
        C2182B9a c2182B9a = c2183B9b.A00;
        if (equals(c2182B9a.A02) && -1 == c2182B9a.A00) {
            B9Z<?> b9zA00 = c2182B9a.A01;
            if (b9zA00 == null) {
                b9zA00 = C2182B9a.A00(c2182B9a, -1);
            }
            c2182B9a.A01 = null;
            c2182B9a.A00 = 0;
            c2182B9a.A02 = null;
            if (b9zA00 != null) {
                b9zA00.A02 = AMc.A00;
                b9zA00.A00();
            }
            c2182B9a.A0B.Af8(AMc.A00);
        }
        this.A01 = false;
    }

    public final void A03() {
        Runnable runnable;
        C2183B9b c2183B9b = this.A00;
        if (c2183B9b == null) {
            throw C3cG.A0Q("This input is not added to any dispatcher.");
        }
        if (!this.A01) {
            c2183B9b.A01(null, this);
        }
        C2182B9a c2182B9a = c2183B9b.A00;
        B9r b9r = c2183B9b.A01;
        if (equals(c2182B9a.A02) && -1 == c2182B9a.A00) {
            B9Z<?> b9zA00 = c2182B9a.A01;
            if (b9zA00 == null) {
                b9zA00 = C2182B9a.A00(c2182B9a, -1);
            }
            c2182B9a.A01 = null;
            c2182B9a.A00 = 0;
            c2182B9a.A02 = null;
            if (b9zA00 != null) {
                b9zA00.A02 = AMc.A00;
                if (b9zA00 instanceof B9X) {
                    B9X b9x = (B9X) b9zA00;
                    b9x.A04.invoke(((B9Z) b9x).A02);
                    b9x.A01.invoke();
                } else if (b9zA00 instanceof B9V) {
                    ((B9V) b9zA00).A00.A02();
                } else {
                    ((B9Y) b9zA00).A00.A04();
                }
            } else if (b9r != null && (runnable = ((B9o) b9r).A00.A03) != null) {
                runnable.run();
            }
            c2182B9a.A0B.Af8(AMc.A00);
        }
        this.A01 = false;
    }

    public final void A04(C2193B9y c2193B9y) {
        HzR<C2194B9z> hzR;
        C2183B9b c2183B9b = this.A00;
        if (c2183B9b == null) {
            throw C3cG.A0Q("This input is not added to any dispatcher.");
        }
        if (this.A01) {
            C2182B9a c2182B9a = c2183B9b.A00;
            if (equals(c2182B9a.A02) && -1 == c2182B9a.A00) {
                B9Z<?> b9zA00 = c2182B9a.A01;
                if (b9zA00 != null || (b9zA00 = C2182B9a.A00(c2182B9a, -1)) != null) {
                    b9zA00.A02 = new AMV(c2193B9y);
                    if (b9zA00 instanceof B9X) {
                        B9X b9x = (B9X) b9zA00;
                        b9x.A04.invoke(((B9Z) b9x).A02);
                    } else if (b9zA00 instanceof B9V) {
                        B9U b9u = ((B9V) b9zA00).A00;
                        C2194B9z c2194B9z = new C2194B9z(c2193B9y);
                        if ((b9u instanceof B86) && (hzR = ((B86) b9u).A02) != null) {
                            hzR.AhZ(c2194B9z);
                        }
                    } else {
                        ((B9Y) b9zA00).A00.A06(new C2194B9z(c2193B9y));
                    }
                }
                AnonymousClass002.A1I(c2182B9a.A0B, new AMV(c2193B9y));
            }
        }
    }

    public void A05() {
    }
}
