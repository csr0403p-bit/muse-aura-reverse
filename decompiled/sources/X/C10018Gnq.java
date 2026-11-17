package X;

import com.fasterxml.jackson.core.JsonGenerationException;

/* renamed from: X.Gnq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10018Gnq extends AbstractC10020Gns {
    public C10086GpA A00;
    public Object A01;
    public String A02;
    public boolean A03;
    public C10018Gnq A04;
    public final C10018Gnq A05;

    public final int A04() {
        int i = super.A02;
        if (i == 2) {
            if (!this.A03) {
                return 5;
            }
            this.A03 = false;
            super.A00++;
            return 2;
        }
        int i2 = super.A00;
        if (i == 1) {
            super.A00 = i2 + 1;
            if (i2 >= 0) {
                return 1;
            }
        } else {
            int i3 = i2 + 1;
            super.A00 = i3;
            if (i3 != 0) {
                return 3;
            }
        }
        return 0;
    }

    public final int A05(String str) {
        if (super.A02 != 2 || this.A03) {
            return 4;
        }
        this.A03 = true;
        this.A02 = str;
        C10086GpA c10086GpA = this.A00;
        if (c10086GpA == null || !c10086GpA.A00(str)) {
            return super.A00 < 0 ? 0 : 1;
        }
        Object obj = c10086GpA.A03;
        throw new JsonGenerationException(obj instanceof AbstractC9919GlE ? (AbstractC9919GlE) obj : null, FGI.A0U("Duplicate field '", str, "'"));
    }

    public final C10018Gnq A06() {
        C10018Gnq c10018Gnq = this.A04;
        if (c10018Gnq == null) {
            C10018Gnq c10018Gnq2 = new C10018Gnq(AbstractC7610F5x.A0h(this.A00), this, 1);
            this.A04 = c10018Gnq2;
            return c10018Gnq2;
        }
        ((AbstractC10020Gns) c10018Gnq).A02 = 1;
        ((AbstractC10020Gns) c10018Gnq).A00 = -1;
        c10018Gnq.A02 = null;
        c10018Gnq.A03 = false;
        c10018Gnq.A01 = null;
        C10086GpA c10086GpA = c10018Gnq.A00;
        if (c10086GpA == null) {
            return c10018Gnq;
        }
        c10086GpA.A00 = null;
        c10086GpA.A01 = null;
        c10086GpA.A02 = null;
        return c10018Gnq;
    }

    public final C10018Gnq A07() {
        C10018Gnq c10018Gnq = this.A04;
        if (c10018Gnq == null) {
            C10018Gnq c10018Gnq2 = new C10018Gnq(AbstractC7610F5x.A0h(this.A00), this, 2);
            this.A04 = c10018Gnq2;
            return c10018Gnq2;
        }
        ((AbstractC10020Gns) c10018Gnq).A02 = 2;
        ((AbstractC10020Gns) c10018Gnq).A00 = -1;
        c10018Gnq.A02 = null;
        c10018Gnq.A03 = false;
        c10018Gnq.A01 = null;
        C10086GpA c10086GpA = c10018Gnq.A00;
        if (c10086GpA == null) {
            return c10018Gnq;
        }
        c10086GpA.A00 = null;
        c10086GpA.A01 = null;
        c10086GpA.A02 = null;
        return c10018Gnq;
    }

    public final C10018Gnq A08(Object obj) {
        C10018Gnq c10018Gnq = this.A04;
        if (c10018Gnq == null) {
            C10018Gnq c10018Gnq2 = new C10018Gnq(AbstractC7610F5x.A0h(this.A00), this, obj, 1);
            this.A04 = c10018Gnq2;
            return c10018Gnq2;
        }
        ((AbstractC10020Gns) c10018Gnq).A02 = 1;
        ((AbstractC10020Gns) c10018Gnq).A00 = -1;
        c10018Gnq.A02 = null;
        c10018Gnq.A03 = false;
        c10018Gnq.A01 = obj;
        C10086GpA c10086GpA = c10018Gnq.A00;
        if (c10086GpA != null) {
            c10086GpA.A00 = null;
            c10086GpA.A01 = null;
            c10086GpA.A02 = null;
        }
        return c10018Gnq;
    }

    public final C10018Gnq A09(Object obj) {
        C10018Gnq c10018Gnq = this.A04;
        if (c10018Gnq == null) {
            C10018Gnq c10018Gnq2 = new C10018Gnq(AbstractC7610F5x.A0h(this.A00), this, obj, 2);
            this.A04 = c10018Gnq2;
            return c10018Gnq2;
        }
        ((AbstractC10020Gns) c10018Gnq).A02 = 2;
        ((AbstractC10020Gns) c10018Gnq).A00 = -1;
        c10018Gnq.A02 = null;
        c10018Gnq.A03 = false;
        c10018Gnq.A01 = obj;
        C10086GpA c10086GpA = c10018Gnq.A00;
        if (c10086GpA != null) {
            c10086GpA.A00 = null;
            c10086GpA.A01 = null;
            c10086GpA.A02 = null;
        }
        return c10018Gnq;
    }

    public C10018Gnq(C10086GpA c10086GpA, C10018Gnq c10018Gnq, Object obj, int i) {
        super.A02 = i;
        this.A05 = c10018Gnq;
        super.A01 = ((AbstractC10020Gns) c10018Gnq).A01 + 1;
        this.A00 = c10086GpA;
        super.A00 = -1;
        this.A01 = obj;
    }

    public C10018Gnq(C10086GpA c10086GpA, C10018Gnq c10018Gnq, int i) {
        int i2;
        super.A02 = i;
        this.A05 = c10018Gnq;
        if (c10018Gnq == null) {
            i2 = 0;
        } else {
            i2 = ((AbstractC10020Gns) c10018Gnq).A01 + 1;
        }
        super.A01 = i2;
        this.A00 = c10086GpA;
        super.A00 = -1;
    }
}
