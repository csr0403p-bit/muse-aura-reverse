package X;

import android.view.autofill.AutofillValue;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AY0 extends AXF {
    public G0U<? super Boolean, Unit> A00;
    public boolean A01;
    public final Function0<Unit> A02;

    /* JADX WARN: Incorrect types in method signature: (ZLX/AWd;LX/3UH;ZZLX/1YD;LX/G0U<-Ljava/lang/Boolean;Lkotlin/Unit;>;)V */
    public AY0(C3UH c3uh, InterfaceC1072AWd interfaceC1072AWd, C1YD c1yd, G0U g0u, boolean z, boolean z2, boolean z3) {
        super(c3uh, interfaceC1072AWd, c1yd, null, new BT8(g0u, 1, z), z2, z3);
        this.A01 = z;
        this.A00 = g0u;
        this.A02 = C2292BSs.A00(this, 42);
    }

    @Override // X.AX2
    public final void A0O(InterfaceC0857A6e interfaceC0857A6e) {
        interfaceC0857A6e.Aca(AbstractC1671Anw.A0g, this.A01 ? AY3.A03 : AY3.A02);
        interfaceC0857A6e.Aca(AbstractC1671Anw.A02, AYA.A02);
        interfaceC0857A6e.Aca(AbstractC1671Anw.A08, new AY5(AutofillValue.forToggle(this.A01)));
        InterfaceC0857A6e.A00(AbstractC1578Alt.A0C, interfaceC0857A6e, null, C2295BSv.A00(interfaceC0857A6e, 46));
    }
}
