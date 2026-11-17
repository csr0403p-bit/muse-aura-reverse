package X;

import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.Unit;

/* renamed from: X.AjR, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1458AjR implements InterfaceC1435Aj4 {
    public long A00;
    public long A01 = Long.MIN_VALUE;
    public long A02 = -1;
    public long A03;
    public C1458AjR A04;
    public final long A05;
    public final long A06;
    public final C1Z3 A07;
    public final int A08;
    public final G0U<C2LD, Unit> A09;
    public final /* synthetic */ C1466AjZ A0A;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0005: IPUT (r6 I:int), (r2 I:X.AjR) (LINE:5) X.AjR.A08 int, block:B:2:0x0000 */
    public C1458AjR(C1Z3 c1z3, int i, long j, long j2, C1Z3 c1z32, G0U<? super C2LD, Unit> g0u) {
        int i2;
        this.A0A = i;
        this.A08 = i2;
        this.A06 = j2;
        this.A05 = c1z32;
        this.A07 = c1z3;
        this.A09 = j;
    }

    public final void A00(float[] fArr, long j, long j2, long j3, long j4) {
        C2LD c2ld;
        C1Z3 c1z3 = this.A07;
        long j5 = this.A0A.A03;
        AbstractC1387AiH abstractC1387AiHA06 = AbstractC1414Aij.A06(c1z3, 2);
        C1453AjM c1453AjMA04 = AbstractC1414Aij.A04(c1z3);
        if (c1453AjMA04.A0d.A0G.A0G) {
            AbstractC1387AiH abstractC1387AiH = c1453AjMA04.A0f.A04;
            if (abstractC1387AiH != abstractC1387AiHA06) {
                float fA09 = AnonymousClass002.A09(j);
                long jFloatToRawIntBits = (Float.floatToRawIntBits((int) (j >> 32)) << 32) | (Float.floatToRawIntBits(fA09) & 4294967295L);
                long j6 = ((AZE) abstractC1387AiHA06).A03;
                c2ld = new C2LD(c1z3, fArr, AbstractC1017AQa.A00(abstractC1387AiH.APn(abstractC1387AiHA06, jFloatToRawIntBits, true)), ((((int) (r15 >> 32)) + ((int) (j6 >> 32))) << 32) | (4294967295L & (AnonymousClass002.A09(r15) + ((int) (j6 & 4294967295L)))), j3, j4, j5);
            } else {
                c2ld = new C2LD(c1z3, fArr, j, j2, j3, j4, j5);
            }
            this.A09.invoke(c2ld);
        }
    }

    @Override // X.InterfaceC1435Aj4
    public final void Ahh() {
        C1458AjR c1458AjR;
        C1466AjZ c1466AjZ = this.A0A;
        Ab2<C1458AjR> ab2 = c1466AjZ.A06;
        int i = this.A08;
        C1458AjR c1458AjRA07 = ab2.A07(i);
        if (c1458AjRA07 != null) {
            if (c1458AjRA07.equals(this)) {
                C1458AjR c1458AjR2 = this.A04;
                this.A04 = null;
                if (c1458AjR2 != null) {
                    ab2.A0A(i, c1458AjR2);
                    return;
                }
                C1453AjM c1453AjMA04 = AbstractC1414Aij.A04(((AbstractC1439Aj8) this.A07).node);
                if (c1453AjMA04.A0L) {
                    ((AndroidComposeView) AbstractC1333AhK.A00(c1453AjMA04)).A12.A07.A01(c1453AjMA04.A02, false);
                    return;
                }
                return;
            }
            ab2.A0A(i, c1458AjRA07);
            do {
                C1458AjR c1458AjR3 = c1458AjRA07.A04;
                if (c1458AjR3 != null) {
                    if (c1458AjR3 == this) {
                        c1458AjRA07.A04 = this.A04;
                        this.A04 = null;
                        return;
                    }
                    c1458AjRA07 = c1458AjRA07.A04;
                }
            } while (c1458AjRA07 != null);
            return;
        }
        C1458AjR c1458AjR4 = c1466AjZ.A04;
        if (c1458AjR4 == this) {
            c1466AjZ.A04 = c1458AjR4.A04;
        } else {
            if (c1458AjR4 == null) {
                return;
            }
            do {
                c1458AjR = c1458AjR4;
                c1458AjR4 = c1458AjR4.A04;
                if (c1458AjR4 == null) {
                    return;
                }
            } while (c1458AjR4 != this);
            c1458AjR.A04 = c1458AjR4.A04;
        }
        this.A04 = null;
    }
}
