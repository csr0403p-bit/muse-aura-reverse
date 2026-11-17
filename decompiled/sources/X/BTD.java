package X;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class BTD implements Ht9, G0W {
    public final int $t;
    public final Object A00;
    public final Object A01;

    public BTD(int i, Object obj, Object obj2) {
        this.$t = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    @Override // X.G0W
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float fA05;
        if (this.$t != 0) {
            BQw bQw = (BQw) this.A00;
            Object obj4 = this.A01;
            BFM bfm = (BFM) obj2;
            int iA0F = AnonymousClass001.A0F(obj3);
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0F & 17, 16), bfm, iA0F)) {
                AnonymousClass001.A1G(obj4, bfm, bQw.decorate, 0);
            } else {
                bfm.Afo();
            }
            return Unit.INSTANCE;
        }
        PagerState pagerState = (PagerState) this.A00;
        Object obj5 = this.A01;
        float fA02 = AnonymousClass001.A02(obj);
        float fA022 = AnonymousClass001.A02(obj2);
        float fA023 = AnonymousClass001.A02(obj3);
        boolean zA00 = AbJ.A00(pagerState, fA02);
        MutableState<C1133Abh> mutableState = pagerState.A0A;
        if (C8j4.A0V(mutableState).A09 != EnumC1108AYu.A03 && obj5 != EnumC1820Arj.A02) {
            zA00 = AnonymousClass002.A1M(zA00 ? 1 : 0);
        }
        int i = C8j4.A0V(mutableState).A04;
        if (i == 0) {
            fA05 = 0.0f;
        } else {
            fA05 = C8j3.A05(C8j5.A0E(AWx.A07(pagerState.A0V), C8j4.A0V(pagerState.A0A).A09, EnumC1108AYu.A02)) / i;
        }
        float f = fA05 - ((int) fA05);
        if (Math.abs(fA02) >= pagerState.A0B.Ah4(400.0f) ? fA02 <= 0.0f : Math.abs(f) <= 0.5f ? !(Math.abs(fA05) < Math.abs(pagerState.A05()) ? Math.abs(fA022) >= Math.abs(fA023) : !zA00) : !zA00) {
            fA023 = fA022;
        }
        return Float.valueOf(fA023);
    }
}
