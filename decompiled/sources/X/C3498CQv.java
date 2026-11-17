package X;

/* renamed from: X.CQv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3498CQv {
    public CR5 A00 = new CR5();
    public C3497CQu A01;
    public Object A02;
    public boolean A03;

    public final void A00(Object obj) {
        this.A03 = true;
        C3497CQu c3497CQu = this.A01;
        if (c3497CQu != null) {
            C3499CQw c3499CQw = c3497CQu.A00;
            c3499CQw.getClass();
            if (obj == null) {
                obj = AbstractC3496CQt.A01;
            }
            if (AbstractC3496CQt.A00.A02(c3499CQw, obj)) {
                AbstractC3496CQt.A02(c3499CQw);
                this.A02 = null;
                this.A01 = null;
                this.A00 = null;
            }
        }
    }

    public final void finalize() {
        CR5 cr5;
        C3497CQu c3497CQu = this.A01;
        if (c3497CQu != null && !c3497CQu.A00.isDone()) {
            c3497CQu.A00.A03(new CR6(C8j3.A14(this.A02, C60O.A0x("The completer object was garbage collected - this future would otherwise never complete. The tag was: "))));
        }
        if (this.A03 || (cr5 = this.A00) == null) {
            return;
        }
        if (AbstractC3496CQt.A00.A02(cr5, AbstractC3496CQt.A01)) {
            AbstractC3496CQt.A02(cr5);
        }
    }
}
