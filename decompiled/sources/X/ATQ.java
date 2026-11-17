package X;

import androidx.compose.runtime.MutableState;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class ATQ {
    public InterfaceC04911Xu A00;
    public final AT5<Float, AOW> A01 = AT8.A00(0.0f);
    public final List<InterfaceC04911Xu> A02 = C3cG.A0h();
    public final Function0<C1YV> A03;
    public final boolean A04;

    public final void A00(AT3 at3, float f, long j) {
        float fA00 = MutableState.A00(this.A01);
        if (fA00 > 0.0f) {
            long jA04 = HxS.A04(HDi.A0O[(int) (j & 63)], B6A.A03(j), B6A.A02(j), B6A.A01(j), fA00);
            if (!this.A04) {
                at3.A9N(null, C16a.A00, f, 1.0f, 3, jA04, at3.ADU());
                return;
            }
            long jAKb = at3.AKb();
            float fA03 = AnonymousClass003.A03(jAKb);
            float fA002 = AWA.A00(jAKb);
            InterfaceC1279AgP interfaceC1279AgPAEq = at3.AEq();
            AaI aaI = (AaI) interfaceC1279AgPAEq;
            AW9 aw9 = aaI.A02.A02;
            long jA00 = AW9.A00(aw9);
            try {
                aaI.A01.A6N(0.0f, 0.0f, fA03, fA002, 1);
                at3.A9N(null, C16a.A00, f, 1.0f, 3, jA04, at3.ADU());
            } finally {
                AW9.A02(aw9, interfaceC1279AgPAEq, jA00);
            }
        }
    }

    public ATQ(boolean z, Function0<C1YV> function0) {
        this.A04 = z;
        this.A03 = function0;
    }
}
