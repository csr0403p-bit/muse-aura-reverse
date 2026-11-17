package X;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class BTV implements Ht9, G0U {
    public final int $t;
    public final Object A00;
    public final Object A01;
    public final Object A02;
    public final boolean A03;

    @Override // X.G0U
    public final Object invoke(Object obj) {
        MutableState mutableState;
        switch (this.$t) {
            case 0:
                mutableState = (MutableState) this.A00;
                AYU ayu = (AYU) obj;
                BTJ btj = new BTJ(this.A01, this.A02, 0, this.A03);
                ayu.A00 = true;
                btj.invoke(ayu);
                ayu.A00 = false;
                mutableState.getValue();
                return Unit.INSTANCE;
            case 1:
                mutableState = (MutableState) this.A00;
                AYU ayu2 = (AYU) obj;
                BTJ btj2 = new BTJ(this.A01, this.A02, 1, this.A03);
                ayu2.A00 = true;
                btj2.invoke(ayu2);
                ayu2.A00 = false;
                mutableState.getValue();
                return Unit.INSTANCE;
            default:
                Function0 function0 = (Function0) this.A00;
                boolean z = this.A03;
                InterfaceC2178B0w interfaceC2178B0w = (InterfaceC2178B0w) this.A01;
                C1423Ais c1423Ais = (C1423Ais) this.A02;
                C16Z c16z = (C16Z) obj;
                c16z.A9O();
                if (AnonymousClass003.A1Y(function0)) {
                    if (z) {
                        long jADU = c16z.ADU();
                        InterfaceC1279AgP interfaceC1279AgPAEq = c16z.AEq();
                        AaI aaI = (AaI) interfaceC1279AgPAEq;
                        AW9 aw9 = aaI.A02.A02;
                        long jA00 = AW9.A00(aw9);
                        try {
                            aaI.A01.Ac6(-1.0f, 1.0f, jADU);
                            c16z.A9S(c1423Ais, interfaceC2178B0w, C16a.A00, 1.0f, 3, 0L);
                        } finally {
                            AW9.A02(aw9, interfaceC1279AgPAEq, jA00);
                        }
                    } else {
                        c16z.A9S(c1423Ais, interfaceC2178B0w, C16a.A00, 1.0f, 3, 0L);
                    }
                }
                return Unit.INSTANCE;
        }
    }

    public BTV(Object obj, Object obj2, Object obj3, int i, boolean z) {
        this.$t = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = z;
    }
}
