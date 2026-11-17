package X;

import androidx.compose.runtime.MutableState;

/* renamed from: X.BUf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2331BUf extends AbstractC7559F3s implements G0U {
    public final int $t;
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2331BUf(Object obj, int i, int i2) {
        super(1);
        this.$t = i2;
        this.A01 = obj;
        this.A00 = i;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Boolean, java.lang.Object] */
    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean zAb9;
        float fA03;
        switch (this.$t) {
            case 0:
                C10543Hqv c10543Hqv = (C10543Hqv) this.A01;
                ?? ValueOf = Boolean.valueOf(((C1506AkD) obj).Ab9(this.A00));
                c10543Hqv.element = ValueOf;
                return ValueOf;
            case 1:
                ((F1F) this.A01).element = true;
                zAb9 = ((C1506AkD) obj).Ab9(this.A00);
                break;
            default:
                long jA05 = C3cG.A05(obj);
                B33 b33 = (B33) this.A01;
                int i = this.A00;
                C6837Eap c6837Eap = (C6837Eap) b33.A02.getValue();
                zAb9 = true;
                if (c6837Eap != null) {
                    MutableState mutableState = b33.A06;
                    long jA052 = C3cG.A05(mutableState.getValue()) == Long.MIN_VALUE ? 0L : jA05 - C3cG.A05(mutableState.getValue());
                    mutableState.Af8(Long.valueOf(jA05));
                    MutableState mutableState2 = b33.A01;
                    B3E b3e = (B3E) mutableState2.getValue();
                    float f = b3e == null ? 0.0f : ((B39) b3e).A01;
                    B3E b3e2 = (B3E) mutableState2.getValue();
                    float f2 = b3e2 == null ? 1.0f : ((B39) b3e2).A00;
                    float fA00 = (jA052 / 1000000) / c6837Eap.A00();
                    C1BO c1bo = b33.A0D;
                    float fA01 = fA00 * C1BO.A01(c1bo);
                    float fA012 = C1BO.A01(c1bo);
                    MutableState mutableState3 = b33.A08;
                    float fA06 = C8j3.A06(mutableState3) + fA01;
                    float f3 = fA012 < 0.0f ? f - fA06 : fA06 - f2;
                    if (f3 < 0.0f) {
                        fA03 = ATD.A03(C8j3.A06(mutableState3), f, f2) + fA01;
                    } else {
                        float f4 = f2 - f;
                        int i2 = (int) (f3 / f4);
                        int i3 = i2 + 1;
                        MutableState mutableState4 = b33.A04;
                        if (MutableState.A02(mutableState4) + i3 > i) {
                            B33.A00(b33, C1BO.A01(b33.A0C));
                            MutableState.A07(i, mutableState4);
                            zAb9 = false;
                            break;
                        } else {
                            MutableState.A07(MutableState.A02(mutableState4) + i3, mutableState4);
                            float f5 = f3 - (i2 * f4);
                            fA03 = C1BO.A01(c1bo) < 0.0f ? f2 - f5 : f + f5;
                        }
                    }
                    B33.A00(b33, fA03);
                    break;
                }
                break;
        }
        return Boolean.valueOf(zAb9);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2331BUf(B33 b33) {
        super(1);
        this.$t = 2;
        this.A01 = b33;
        this.A00 = Integer.MAX_VALUE;
    }
}
