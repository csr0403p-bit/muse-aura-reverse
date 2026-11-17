package X;

import kotlin.Unit;

/* loaded from: classes4.dex */
public final class B86 extends B9U {
    public G0V<? super C20Q<C2194B9z>, ? super HtJ<? super Unit>, ? extends Object> A00;
    public HoC A01;
    public HzR<C2194B9z> A02;
    public boolean A03;
    public final C3UX A04;

    public static final void A00(B86 b86) {
        Integer num = C79.A00;
        b86.A02 = AbstractC10623Hzj.A00(num, -2);
        C3UX c3ux = b86.A04;
        b86.A01 = GAo.A02(num, C6ys.A00, new BU6(b86, null, 0), c3ux);
    }

    @Override // X.B9U
    public final void A04(boolean z) {
        HoC hoC;
        if (!z && super.A00.A00 && super.A01.A05 && (hoC = this.A01) != null && !hoC.isActive()) {
            A01();
        }
        super.A04(z);
    }

    public B86(ANK ank, C3UX c3ux) {
        super(ank);
        this.A04 = c3ux;
        this.A00 = new C3bg(0, null);
    }
}
