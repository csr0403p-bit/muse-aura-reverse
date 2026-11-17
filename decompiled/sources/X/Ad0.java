package X;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import java.util.List;

/* loaded from: classes4.dex */
public final class Ad0 implements InterfaceC1174Add, Ae6 {
    public int A00;
    public int A01 = Integer.MIN_VALUE;
    public int A02;
    public int A03;
    public long A04;
    public boolean A05;
    public int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final long A0B;
    public final Acy<Ad0> A0C;
    public final Object A0D;
    public final List<AZE> A0E;
    public final boolean A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final long A0K;
    public final long A0L;
    public final EnumC1820Arj A0M;
    public final Object A0N;
    public final boolean A0O;

    @Override // X.InterfaceC1174Add
    public final void AY8(int i, int i2, int i3, int i4) {
        A00(i, i2, i3, i4, -1, -1);
    }

    public final void A00(int i, int i2, int i3, int i4, int i5, int i6) {
        long jA0S;
        boolean z = this.A0F;
        if (!z) {
            i4 = i3;
        }
        this.A01 = i4;
        if (z) {
            if (this.A0M == EnumC1820Arj.A03) {
                i2 = (i3 - i2) - this.A0H;
            }
            jA0S = (i2 << 32) | (4294967295L & i);
        } else {
            jA0S = C8j3.A0S(i, i2);
        }
        this.A04 = jA0S;
        this.A03 = i5;
        this.A00 = i6;
        this.A06 = -this.A0G;
        this.A02 = i4 + this.A07;
    }

    public final void A01(AYU ayu, boolean z) {
        GraphicsLayer graphicsLayer;
        int iA09;
        if (this.A01 == Integer.MIN_VALUE) {
            AbstractC1061ATk.A00("position() should be called first");
            throw F60.createAndThrow();
        }
        List<AZE> list = this.A0E;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AZE aze = list.get(i);
            int i2 = this.A06;
            boolean z2 = this.A0F;
            int i3 = i2 - (z2 ? aze.A00 : aze.A01);
            int i4 = this.A02;
            long jA02 = this.A04;
            long jA0G = jA02;
            C1073AWe c1073AWeA07 = this.A0C.A07(this.A0D, i);
            if (c1073AWeA07 != null) {
                if (z) {
                    c1073AWeA07.A01 = jA02;
                } else {
                    if (c1073AWeA07.A01 != C1073AWe.A0I) {
                        jA02 = c1073AWeA07.A01;
                    }
                    jA02 = C2ae.A02(jA02, ((C2ae) c1073AWeA07.A0E.getValue()).A00);
                    int iA07 = C8j5.A07(jA0G, z2 ? 1 : 0);
                    if (((iA07 <= i3 && C8j5.A07(jA02, z2 ? 1 : 0) <= i3) || (iA07 >= i4 && C8j5.A07(jA02, z2 ? 1 : 0) >= i4)) && MutableState.A0A(c1073AWeA07.A0D)) {
                        BU2.A0P(c1073AWeA07, c1073AWeA07.A0G, 25);
                    }
                    jA0G = jA02;
                }
                graphicsLayer = c1073AWeA07.A06;
            } else {
                graphicsLayer = null;
            }
            if (this.A0O) {
                int i5 = (int) (jA02 >> 32);
                if (z2) {
                    iA09 = (this.A01 - AnonymousClass002.A09(jA02)) - aze.A00;
                } else {
                    i5 = (this.A01 - i5) - aze.A01;
                    iA09 = AnonymousClass002.A09(jA02);
                }
                jA0G = AnonymousClass002.A0G(iA09, i5 << 32);
            }
            long jA022 = C2ae.A02(jA0G, this.A0L);
            if (!z && c1073AWeA07 != null) {
                c1073AWeA07.A00 = jA022;
            }
            if (z2) {
                if (graphicsLayer != null) {
                    aze.A0a(graphicsLayer, 0.0f, AYU.A00(ayu, aze, jA022));
                } else {
                    aze.A0b(AZF.A01, 0.0f, AYU.A00(ayu, aze, jA022));
                }
            } else if (graphicsLayer != null) {
                AYU.A01(graphicsLayer, ayu, aze, jA022);
            } else {
                AYU.A06(ayu, aze, AZF.A01, jA022);
            }
        }
    }

    @Override // X.InterfaceC1174Add
    public final long ADz() {
        return this.A0K;
    }

    @Override // X.InterfaceC1174Add
    public final int AGt() {
        return this.A0I;
    }

    @Override // X.InterfaceC1174Add
    public final int AHM() {
        return this.A0A;
    }

    @Override // X.InterfaceC1174Add
    public final boolean AI9() {
        return this.A05;
    }

    @Override // X.InterfaceC1174Add
    public final Object AIY(int i) {
        return this.A0E.get(i).AIX();
    }

    @Override // X.InterfaceC1174Add
    public final int AIi() {
        return this.A0E.size();
    }

    @Override // X.InterfaceC1174Add
    public final int AKq() {
        return this.A0J;
    }

    @Override // X.InterfaceC1174Add
    public final boolean APG() {
        return this.A0F;
    }

    @Override // X.InterfaceC1174Add
    public final int getIndex() {
        return this.A08;
    }

    @Override // X.InterfaceC1174Add
    public final Object getKey() {
        return this.A0D;
    }

    /* JADX WARN: Incorrect types in method signature: (ILjava/lang/Object;ZIIZLX/Arj;IILjava/util/List<+LX/AZE;>;JLjava/lang/Object;LX/Acy<LX/Ad0;>;JII)V */
    public Ad0(Acy acy, EnumC1820Arj enumC1820Arj, Object obj, Object obj2, List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, long j2, boolean z, boolean z2) {
        long j3;
        long j4;
        this.A08 = i;
        this.A0D = obj;
        this.A0F = z;
        this.A0H = i2;
        this.A0O = z2;
        this.A0M = enumC1820Arj;
        this.A0G = i4;
        this.A07 = i5;
        this.A0E = list;
        this.A0L = j;
        this.A0N = obj2;
        this.A0C = acy;
        this.A0K = j2;
        this.A0I = i6;
        this.A0J = i7;
        int size = list.size();
        int iMax = 0;
        for (int i8 = 0; i8 < size; i8++) {
            AZE aze = (AZE) list.get(i8);
            iMax = Math.max(iMax, this.A0F ? aze.A00 : aze.A01);
        }
        this.A09 = iMax;
        int i9 = i3 + iMax;
        this.A0A = i9 < 0 ? 0 : i9;
        boolean z3 = this.A0F;
        int i10 = this.A0H;
        if (z3) {
            j4 = i10 << 32;
            j3 = iMax & 4294967295L;
        } else {
            j3 = iMax << 32;
            j4 = i10 & 4294967295L;
        }
        this.A0B = j4 | j3;
        this.A04 = 0L;
        this.A03 = -1;
        this.A00 = -1;
    }

    @Override // X.InterfaceC1174Add
    public final long AID(int i) {
        return this.A04;
    }

    @Override // X.InterfaceC1174Add
    public final void Adr(boolean z) {
        this.A05 = z;
    }
}
