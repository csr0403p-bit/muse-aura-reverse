package X;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.unit.Constraints;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AQP extends AbstractC1439Aj8 implements InterfaceC1356Ahh {
    public long A00;
    public Constraints A01;
    public final MutableState A02;
    public final MutableState A03;

    public AQP(APN apn, Function0<Boolean> function0) {
        AGE age = AGE.A00;
        this.A03 = C3cG.A08(age, apn);
        this.A02 = C3cG.A08(age, function0);
        this.A00 = AbstractC05192Wm.A00;
    }

    @Override // X.InterfaceC1356Ahh
    public final int AQN(C3Tr c3Tr, C3TF c3tf, int i) {
        if (!c3tf.AOh()) {
            long j = this.A00;
            if (j != AbstractC05192Wm.A00) {
                return AnonymousClass002.A09(j);
            }
        }
        return c3Tr.AQM(i);
    }

    @Override // X.InterfaceC1356Ahh
    public final int AQP(C3Tr c3Tr, C3TF c3tf, int i) {
        if (!c3tf.AOh()) {
            long j = this.A00;
            if (j != AbstractC05192Wm.A00) {
                return C8j3.A0G(j);
            }
        }
        return c3Tr.AQO(i);
    }

    @Override // X.InterfaceC1356Ahh
    public final InterfaceC1134Abi AQV(AXY axy, C3TG c3tg, long j) {
        AZE azeAQW;
        int i;
        int i2;
        G0U aqo;
        if (axy.AOh()) {
            this.A01 = new Constraints(j);
        }
        if (AnonymousClass003.A1Y((Function0) this.A02.getValue())) {
            if (axy.AOh()) {
                azeAQW = c3tg.AQW(j);
                this.A00 = C8j3.A0R(azeAQW.A01, azeAQW.A00);
            } else {
                Constraints constraints = this.A01;
                C7384Etj.A0X(constraints);
                azeAQW = c3tg.AQW(constraints.A00);
            }
            long jA09 = AYL.A09(j, this.A00);
            i = (int) (jA09 >> 32);
            i2 = (int) (4294967295L & jA09);
            aqo = new AQO(this, axy, azeAQW, jA09);
        } else {
            AZE azeAQW2 = c3tg.AQW(j);
            i = azeAQW2.A01;
            i2 = azeAQW2.A00;
            aqo = BUX.A00(azeAQW2, 10);
        }
        return AXY.A01(axy, aqo, i, i2);
    }

    @Override // X.InterfaceC1356Ahh
    public final int AQp(C3Tr c3Tr, C3TF c3tf, int i) {
        if (!c3tf.AOh()) {
            long j = this.A00;
            if (j != AbstractC05192Wm.A00) {
                return AnonymousClass002.A09(j);
            }
        }
        return c3Tr.AQo(i);
    }

    @Override // X.InterfaceC1356Ahh
    public final int AQr(C3Tr c3Tr, C3TF c3tf, int i) {
        if (!c3tf.AOh()) {
            long j = this.A00;
            if (j != AbstractC05192Wm.A00) {
                return C8j3.A0G(j);
            }
        }
        return c3Tr.AQq(i);
    }
}
