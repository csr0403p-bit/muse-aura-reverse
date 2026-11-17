package X;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import java.util.List;

/* renamed from: X.Acs, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1160Acs implements InterfaceC1174Add, C16C {
    public int A00 = Integer.MIN_VALUE;
    public int A01;
    public int A02;
    public boolean A03;
    public int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final Acy<C1160Acs> A0A;
    public final Object A0B;
    public final List<AZE> A0C;
    public final boolean A0D;
    public final int[] A0E;
    public final int A0F;
    public final int A0G;
    public final long A0H;
    public final long A0I;
    public final C3TH A0J;
    public final C1AC A0K;
    public final EnumC1820Arj A0L;
    public final Object A0M;
    public final boolean A0N;

    public final void A00(int i, int i2, int i3) {
        String str;
        int i4;
        this.A02 = i;
        boolean z = this.A0D;
        int i5 = i2;
        if (z) {
            i5 = i3;
        }
        this.A00 = i5;
        List<AZE> list = this.A0C;
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            AZE aze = list.get(i6);
            int i7 = i6 * 2;
            int[] iArr = this.A0E;
            if (z) {
                C3TH c3th = this.A0J;
                if (c3th == null) {
                    str = "null horizontalAlignment when isVertical == true";
                    throw C60O.A0i(str);
                }
                iArr[i7] = c3th.A4E(this.A0L, aze.A01, i2);
                iArr[i7 + 1] = i;
                i4 = aze.A00;
                i += i4;
            } else {
                iArr[i7] = i;
                int i8 = i7 + 1;
                C1AC c1ac = this.A0K;
                if (c1ac == null) {
                    str = "null verticalAlignment when isVertical == false";
                    throw C60O.A0i(str);
                }
                iArr[i8] = c1ac.A4A(aze.A00, i3);
                i4 = aze.A01;
                i += i4;
            }
        }
        this.A04 = -this.A0F;
        this.A01 = this.A00 + this.A05;
    }

    public final void A01(AYU ayu, boolean z) {
        GraphicsLayer graphicsLayer;
        if (this.A00 == Integer.MIN_VALUE) {
            AbstractC1061ATk.A00("position() should be called first");
            throw F60.createAndThrow();
        }
        List<AZE> list = this.A0C;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AZE aze = list.get(i);
            int i2 = this.A04;
            boolean z2 = this.A0D;
            int i3 = i2 - (z2 ? aze.A00 : aze.A01);
            int i4 = this.A01;
            long jAID = AID(i);
            C1073AWe c1073AWeA07 = this.A0A.A07(this.A0B, i);
            if (c1073AWeA07 != null) {
                if (z) {
                    c1073AWeA07.A01 = jAID;
                } else {
                    if (c1073AWeA07.A01 != C1073AWe.A0I) {
                        jAID = c1073AWeA07.A01;
                    }
                    long jA02 = C2ae.A02(jAID, ((C2ae) c1073AWeA07.A0E.getValue()).A00);
                    int iA07 = C8j5.A07(jAID, z2 ? 1 : 0);
                    if (((iA07 <= i3 && C8j5.A07(jA02, z2 ? 1 : 0) <= i3) || (iA07 >= i4 && C8j5.A07(jA02, z2 ? 1 : 0) >= i4)) && MutableState.A0A(c1073AWeA07.A0D)) {
                        BU2.A0P(c1073AWeA07, c1073AWeA07.A0G, 25);
                    }
                    jAID = jA02;
                }
                graphicsLayer = c1073AWeA07.A06;
            } else {
                graphicsLayer = null;
            }
            if (this.A0N) {
                jAID = z2 ? C8j3.A0S((int) (jAID >> 32), (this.A00 - AnonymousClass002.A09(jAID)) - aze.A00) : (((this.A00 - r9) - aze.A01) << 32) | (4294967295L & AnonymousClass002.A09(jAID));
            }
            long jA022 = C2ae.A02(jAID, this.A0I);
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
        return this.A0H;
    }

    @Override // X.InterfaceC1174Add
    public final int AGt() {
        return 0;
    }

    @Override // X.InterfaceC1174Add
    public final int AHM() {
        return this.A08;
    }

    @Override // X.InterfaceC1174Add
    public final boolean AI9() {
        return this.A03;
    }

    @Override // X.InterfaceC1174Add
    public final Object AIY(int i) {
        return this.A0C.get(i).AIX();
    }

    @Override // X.InterfaceC1174Add
    public final int AIi() {
        return this.A0C.size();
    }

    @Override // X.InterfaceC1174Add
    public final int AKq() {
        return 1;
    }

    @Override // X.InterfaceC1174Add
    public final boolean APG() {
        return this.A0D;
    }

    @Override // X.InterfaceC1174Add
    public final int getIndex() {
        return this.A07;
    }

    @Override // X.InterfaceC1174Add
    public final Object getKey() {
        return this.A0B;
    }

    /* JADX WARN: Incorrect types in method signature: (ILjava/util/List<+LX/AZE;>;ZLX/3TH;LX/1AC;LX/Arj;ZIIIJLjava/lang/Object;Ljava/lang/Object;LX/Acy<LX/Acs;>;J)V */
    public C1160Acs(Acy acy, C3TH c3th, C1AC c1ac, EnumC1820Arj enumC1820Arj, Object obj, Object obj2, List list, int i, int i2, int i3, int i4, long j, long j2, boolean z, boolean z2) {
        this.A07 = i;
        this.A0C = list;
        this.A0D = z;
        this.A0J = c3th;
        this.A0K = c1ac;
        this.A0L = enumC1820Arj;
        this.A0N = z2;
        this.A0F = i2;
        this.A05 = i3;
        this.A0G = i4;
        this.A0I = j;
        this.A0B = obj;
        this.A0M = obj2;
        this.A0A = acy;
        this.A0H = j2;
        int size = list.size();
        int i5 = 0;
        int iMax = 0;
        for (int i6 = 0; i6 < size; i6++) {
            AZE aze = (AZE) list.get(i6);
            boolean z3 = this.A0D;
            i5 += z3 ? aze.A00 : aze.A01;
            iMax = Math.max(iMax, !z3 ? aze.A00 : aze.A01);
        }
        this.A09 = i5;
        int i7 = i5 + this.A0G;
        this.A08 = i7 < 0 ? 0 : i7;
        this.A06 = iMax;
        this.A0E = new int[this.A0C.size() * 2];
    }

    @Override // X.InterfaceC1174Add
    public final void Adr(boolean z) {
        this.A03 = z;
    }

    @Override // X.InterfaceC1174Add
    public final long AID(int i) {
        if (i == 0 && this.A0C.size() == 0) {
            boolean z = this.A0D;
            int i2 = this.A02;
            if (!z) {
                return i2 << 32;
            }
            return (4294967295L & i2) | (0 << 32);
        }
        return (4294967295L & r2[r0 + 1]) | (this.A0E[i * 2] << 32);
    }

    @Override // X.InterfaceC1174Add
    public final void AY8(int i, int i2, int i3, int i4) {
        A00(i, i3, i4);
    }
}
