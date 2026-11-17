package X;

import java.util.concurrent.CancellationException;

/* loaded from: classes4.dex */
public abstract class B9U {
    public final AbstractC2185B9e A00 = new BSB(this);
    public final B9Z<AMZ> A01;
    public final AMZ A02;

    public final void A01() {
        if (this instanceof B86) {
            B86 b86 = (B86) this;
            HzR<C2194B9z> hzR = b86.A02;
            if (hzR != null) {
                hzR.A5w(new CancellationException("onBack cancelled"));
            }
            HoC hoC = b86.A01;
            if (hoC != null) {
                hoC.A5w(null);
            }
            b86.A02 = null;
            b86.A01 = null;
            b86.A03 = false;
        }
    }

    public final void A02() {
        if (!(this instanceof B86)) {
            ((B84) this).A00.invoke();
            return;
        }
        B86 b86 = (B86) this;
        if (b86.A02 != null && !b86.A03) {
            b86.A01();
        }
        if (b86.A02 == null) {
            b86.A03 = false;
            B86.A00(b86);
        }
        HzR<C2194B9z> hzR = b86.A02;
        if (hzR != null) {
            hzR.A6R(null);
        }
        b86.A03 = false;
    }

    public final void A03() {
        if (this instanceof B86) {
            B86 b86 = (B86) this;
            b86.A01();
            if (((B9U) b86).A00.A00 && ((B9U) b86).A01.A05) {
                b86.A03 = true;
                B86.A00(b86);
            }
        }
    }

    public void A04(boolean z) {
        this.A00.A02(z);
        this.A01.A02(z);
    }

    public B9U(AMZ amz) {
        this.A02 = amz;
        this.A01 = new B9V(this, amz);
    }
}
