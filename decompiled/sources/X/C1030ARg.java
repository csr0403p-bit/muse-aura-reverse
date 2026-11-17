package X;

import androidx.compose.animation.SizeAnimationModifierNode$animateTo$data$1$1;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Alignment;

/* renamed from: X.ARg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1030ARg extends AQX {
    public AOc<BL4> A01;
    public Alignment A02;
    public boolean A03;
    public long A04 = AbstractC05192Wm.A00;
    public long A00 = AYL.A06(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
    public final MutableState A05 = AbstractC1798ArH.A06(null);

    @Override // X.AbstractC1439Aj8
    public final void onReset() {
        this.A05.Af8(null);
    }

    @Override // X.InterfaceC1356Ahh
    public final InterfaceC1134Abi AQV(AXY axy, C3TG c3tg, long j) {
        AZE azeAQW;
        long jA09;
        if (axy.AOh()) {
            this.A00 = j;
            this.A03 = true;
            azeAQW = c3tg.AQW(j);
        } else {
            long j2 = j;
            if (this.A03) {
                j2 = this.A00;
            }
            azeAQW = c3tg.AQW(j2);
        }
        long j3 = (azeAQW.A01 << 32) | (azeAQW.A00 & 4294967295L);
        if (axy.AOh()) {
            this.A04 = j3;
            jA09 = j3;
        } else {
            long j4 = this.A04;
            if (j4 == AbstractC05192Wm.A00) {
                j4 = j3;
            }
            MutableState mutableState = this.A05;
            ARj aRj = (ARj) mutableState.getValue();
            if (aRj != null) {
                AT5<BL4, ARY> at5 = aRj.A01;
                MutableState mutableState2 = at5.A04.A05;
                boolean z = (j4 == ((BL4) mutableState2.getValue()).A00 || MutableState.A0A(at5.A0A)) ? false : true;
                if (j4 != ((BL4) at5.A0B.getValue()).A00 || z) {
                    aRj.A00 = ((BL4) mutableState2.getValue()).A00;
                    AnonymousClass001.A1J(new SizeAnimationModifierNode$animateTo$data$1$1(aRj, this, null, j4), getCoroutineScope());
                }
            } else {
                aRj = new ARj(new AT5(AVd.A04, BL4.A00(j4), BL4.A00(1 | (1 << 32))), j4);
            }
            mutableState.Af8(aRj);
            jA09 = AYL.A09(j, ((BL4) aRj.A01.A04.A05.getValue()).A00);
        }
        int i = (int) (jA09 >> 32);
        int i2 = (int) (jA09 & 4294967295L);
        return AXY.A01(axy, new C1031ARk(this, axy, azeAQW, i, i2, j3), i, i2);
    }

    @Override // X.AbstractC1439Aj8
    public final void onAttach() {
        this.A04 = AbstractC05192Wm.A00;
        this.A03 = false;
    }

    public C1030ARg(AOc aOc, Alignment alignment) {
        this.A01 = aOc;
        this.A02 = alignment;
    }
}
