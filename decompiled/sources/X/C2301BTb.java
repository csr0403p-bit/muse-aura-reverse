package X;

import androidx.compose.foundation.gestures.MouseWheelScrollingLogic;
import androidx.compose.foundation.gestures.NonTouchScrollingLogic;
import androidx.compose.foundation.gestures.ScrollingLogic;
import androidx.compose.ui.text.input.ImeAction;
import java.util.List;
import java.util.Set;
import kotlin.Unit;

/* renamed from: X.BTb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2301BTb implements Ht9, G0U {
    public final int $t;
    public final Object A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C2301BTb(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$t = i;
        this.A00 = obj;
        this.A01 = obj5;
        this.A02 = obj4;
        this.A03 = obj2;
        this.A04 = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [T, X.AgE] */
    @Override // X.G0U
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                MouseWheelScrollingLogic mouseWheelScrollingLogic = (MouseWheelScrollingLogic) this.A00;
                C10543Hqv c10543Hqv = (C10543Hqv) this.A01;
                C1051ASv c1051ASv = (C1051ASv) this.A02;
                ScrollingLogic scrollingLogic = (ScrollingLogic) this.A03;
                F1F f1f = (F1F) this.A04;
                float fA02 = AnonymousClass001.A02(obj);
                C1269AgE c1269AgEA01 = MouseWheelScrollingLogic.A01(mouseWheelScrollingLogic.A01);
                boolean z = true;
                if (c1269AgEA01 != null) {
                    ((NonTouchScrollingLogic) mouseWheelScrollingLogic).A02.A00(c1269AgEA01.A00, c1269AgEA01.A01);
                    ?? A00 = ((C1269AgE) c10543Hqv.element).A00(c1269AgEA01);
                    c10543Hqv.element = A00;
                    c1051ASv.element = scrollingLogic.A03(scrollingLogic.A05(A00.A01));
                    f1f.element = !AbstractC1252Afl.A00(r0 - fA02);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                BPp bPp = (BPp) this.A00;
                InterfaceC2128Ayu interfaceC2128Ayu = (InterfaceC2128Ayu) this.A01;
                C1805ArO c1805ArO = (C1805ArO) this.A02;
                C1897AtH c1897AtH = (C1897AtH) this.A03;
                C1EQ c1eq = (C1EQ) this.A04;
                C16Z c16z = (C16Z) obj;
                c16z.A9O();
                float fAFn = bPp.A01.AFn();
                if (fAFn != 0.0f) {
                    int iOriginalToTransformed = interfaceC2128Ayu.originalToTransformed((int) (c1805ArO.A00 >> 32));
                    C1924Atl c1924AtlA00 = C1897AtH.A00(c1897AtH);
                    AaC aaCA06 = c1924AtlA00 != null ? c1924AtlA00.A02.A06(iOriginalToTransformed) : new AaC(0.0f, 0.0f, 0.0f, 0.0f);
                    float fFloor = (float) Math.floor(c16z.Ah4(2.0f));
                    if (fFloor < 1.0f) {
                        fFloor = 1.0f;
                    }
                    float f = fFloor / 2.0f;
                    float f2 = aaCA06.A01 + f;
                    float fA00 = AnonymousClass001.A00(c16z.AKb()) - f;
                    if (f2 > fA00) {
                        f2 = fA00;
                    }
                    if (f2 < f) {
                        f2 = f;
                    }
                    double d = f2;
                    float fFloor2 = ((int) fFloor) % 2 == 1 ? ((float) Math.floor(d)) + 0.5f : (float) Math.rint(d);
                    float f3 = aaCA06.A03;
                    long jA0P = C8j3.A0P(fFloor2) << 32;
                    c16z.A9W(c1eq, null, null, fFloor, fAFn, 0, 3, (C8j3.A0P(f3) & 4294967295L) | jA0P, (C8j3.A0P(aaCA06.A00) & 4294967295L) | jA0P);
                    break;
                }
                break;
            case 2:
                C1805ArO c1805ArO2 = (C1805ArO) this.A00;
                AuP auP = (AuP) this.A01;
                AuI auI = (AuI) this.A02;
                G0U<? super List<? extends AzK>, Unit> g0u = (G0U) this.A03;
                G0U<? super ImeAction, Unit> g0u2 = (G0U) this.A04;
                AuT auT = (AuT) obj;
                InterfaceC1766AqJ interfaceC1766AqJ = auP.A00;
                auT.A05 = c1805ArO2;
                auT.A04 = auI;
                auT.A07 = g0u;
                auT.A08 = g0u2;
                auT.A01 = interfaceC1766AqJ != null ? ((AuZ) interfaceC1766AqJ).A00 : null;
                auT.A02 = interfaceC1766AqJ != null ? ((AuZ) interfaceC1766AqJ).A02 : null;
                auT.A03 = interfaceC1766AqJ != null ? ARZ.A00((AuZ) interfaceC1766AqJ) : null;
                break;
            default:
                return new BPV((C1BO) this.A03, (C1BO) this.A04, this.A00, (Set) this.A01, (Set) this.A02);
        }
        return Unit.INSTANCE;
    }
}
