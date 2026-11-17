package X;

import com.facebook.acra.util.JavaProcFileReader;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;

/* renamed from: X.Auk, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1946Auk implements InterfaceC1961AvD {
    public final int A00;
    public final int A01;
    public final Av4 A02;
    public final C1940Aud A03;
    public final List<AvA> A04;
    public final boolean A05;

    /* JADX WARN: Incorrect types in method signature: (LX/AXI<LX/Aud;>;LX/Aud;LX/AvA;II)V */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0027 A[PHI: r1 r3
  0x0027: PHI (r1v1 X.AvE) = (r1v0 X.AvE), (r1v4 X.AvE) binds: [B:12:0x0024, B:5:0x000c] A[DONT_GENERATE, DONT_INLINE]
  0x0027: PHI (r3v1 X.AvE) = (r3v0 X.AvE), (r3v4 X.AvE) binds: [B:12:0x0024, B:5:0x000c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000e A[PHI: r1 r3
  0x000e: PHI (r1v3 X.AvE) = (r1v0 X.AvE), (r1v4 X.AvE) binds: [B:12:0x0024, B:5:0x000c] A[DONT_GENERATE, DONT_INLINE]
  0x000e: PHI (r3v3 X.AvE) = (r3v0 X.AvE), (r3v4 X.AvE) binds: [B:12:0x0024, B:5:0x000c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.AXI r4, X.AvA r5, X.C1940Aud r6, int r7, int r8) {
        /*
            boolean r0 = r6.A02
            if (r0 == 0) goto L1c
            X.AvE r3 = r5.A00(r8)
            X.AvE r1 = r5.A00(r7)
            if (r8 <= r7) goto L27
        Le:
            r0 = 1
        Lf:
            X.Aud r2 = new X.Aud
            r2.<init>(r3, r1, r0)
            if (r7 > r8) goto L29
            long r0 = r5.A04
            r4.A0B(r2, r0)
            return
        L1c:
            X.AvE r3 = r5.A00(r7)
            X.AvE r1 = r5.A00(r8)
            if (r7 <= r8) goto L27
            goto Le
        L27:
            r0 = 0
            goto Lf
        L29:
            java.lang.String r0 = "minOffset should be less than or equal to maxOffset: "
            java.lang.String r0 = X.AnonymousClass007.A0a(r0, r2)
            java.lang.IllegalStateException r0 = X.C3cG.A0Q(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1946Auk.A00(X.AXI, X.AvA, X.Aud, int, int):void");
    }

    @Override // X.InterfaceC1961AvD
    public final AXH<C1940Aud> A82(C1940Aud c1940Aud) {
        C1962AvE c1962AvE = c1940Aud.A01;
        long j = c1962AvE.A01;
        C1962AvE c1962AvE2 = c1940Aud.A00;
        if (j == c1962AvE2.A01) {
            if (!c1940Aud.A02 ? c1962AvE.A00 <= c1962AvE2.A00 : c1962AvE.A00 >= c1962AvE2.A00) {
                throw C3cG.A0Q(AnonymousClass007.A0a("unexpectedly miss-crossed selection: ", c1940Aud));
            }
            AXI axi = AXJ.A00;
            AXI axi2 = new AXI();
            C0918AHu c0918AHu = AbstractC0977AKq.A00;
            AXI.A04(axi2, 6);
            axi2.A0A(j, c1940Aud);
            return axi2;
        }
        AXI axiA00 = AXJ.A00();
        boolean z = c1940Aud.A02;
        C1962AvE c1962AvE3 = c1962AvE;
        if (z) {
            c1962AvE3 = c1962AvE2;
        }
        A00(axiA00, AFe(), c1940Aud, c1962AvE3.A00, C8j3.A0I(AFe().A05.A04.A03));
        ABk(new BTL(c1940Aud, this, axiA00, 8));
        if (z) {
            c1962AvE2 = c1962AvE;
        }
        A00(axiA00, AEE() == C79.A00 ? AKw() : AF9(), c1940Aud, 0, c1962AvE2.A00);
        return axiA00;
    }

    @Override // X.InterfaceC1961AvD
    public final Integer AEE() {
        int i = this.A01;
        int i2 = this.A00;
        if (i >= i2) {
            if (i <= i2) {
                AvA avA = this.A04.get(i / 2);
                int i3 = avA.A02;
                int i4 = avA.A00;
                if (i3 >= i4) {
                    if (i3 <= i4) {
                        return C79.A0C;
                    }
                }
            }
            return C79.A00;
        }
        return C79.A01;
    }

    @Override // X.InterfaceC1961AvD
    public final AvA AER() {
        return this.A05 ? AKw() : AF9();
    }

    @Override // X.InterfaceC1961AvD
    public final AvA AF9() {
        List<AvA> list = this.A04;
        int i = this.A00;
        int i2 = 0;
        int iIntValue = AEE().intValue();
        if (iIntValue == 2) {
            i2 = 1;
        } else if (iIntValue != 1) {
            if (iIntValue != 0) {
                throw C3cG.A0q();
            }
            i2 = 1;
        }
        return list.get((i - (i2 ^ 1)) / 2);
    }

    @Override // X.InterfaceC1961AvD
    public final int AFB() {
        return this.A00;
    }

    @Override // X.InterfaceC1961AvD
    public final C1940Aud AJ1() {
        return this.A03;
    }

    @Override // X.InterfaceC1961AvD
    public final AvA AKw() {
        List<AvA> list = this.A04;
        int i = this.A01;
        int i2 = 1;
        int iIntValue = AEE().intValue();
        if (iIntValue != 2 && iIntValue != 1) {
            if (iIntValue != 0) {
                throw C3cG.A0q();
            }
            i2 = 0;
        }
        return list.get((i - (i2 ^ 1)) / 2);
    }

    @Override // X.InterfaceC1961AvD
    public final int AKx() {
        return this.A01;
    }

    @Override // X.InterfaceC1961AvD
    public final boolean AP5() {
        return this.A05;
    }

    @Override // X.InterfaceC1961AvD
    public final boolean AfY(InterfaceC1961AvD interfaceC1961AvD) {
        if (this.A03 == null || interfaceC1961AvD == null || !(interfaceC1961AvD instanceof C1946Auk)) {
            return true;
        }
        C1946Auk c1946Auk = (C1946Auk) interfaceC1961AvD;
        if (this.A05 != c1946Auk.A05 || this.A01 != c1946Auk.A01 || this.A00 != c1946Auk.A00) {
            return true;
        }
        List<AvA> list = this.A04;
        int size = list.size();
        List<AvA> list2 = c1946Auk.A04;
        if (size != list2.size()) {
            return true;
        }
        int size2 = list.size();
        for (int i = 0; i < size2; i++) {
            AvA avA = list.get(i);
            AvA avA2 = list2.get(i);
            if (avA.A04 != avA2.A04 || avA.A02 != avA2.A02 || avA.A00 != avA2.A00) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC1961AvD
    public final int getSize() {
        return this.A04.size();
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("MultiSelectionLayout(isStartHandle=");
        sbA0x.append(this.A05);
        sbA0x.append(", startPosition=");
        boolean z = true;
        sbA0x.append((this.A01 + 1) / 2.0f);
        sbA0x.append(", endPosition=");
        sbA0x.append((this.A00 + 1) / 2.0f);
        sbA0x.append(", crossed=");
        sbA0x.append(AbstractC2092AyH.A00(AEE()));
        sbA0x.append(", infos=");
        StringBuilder sbA0x2 = C60O.A0x("[\n\t");
        List<AvA> list = this.A04;
        int size = list.size();
        int i = 0;
        while (i < size) {
            AvA avA = list.get(i);
            if (z) {
                z = false;
            } else {
                sbA0x2.append(",\n\t");
            }
            StringBuilder sbA0w = C60O.A0w();
            i++;
            sbA0w.append(i);
            sbA0x2.append(AnonymousClass006.A0y(avA, JavaProcFileReader.LS_SYMLINK_ARROW, sbA0w));
        }
        sbA0x.append(AnonymousClass001.A0v("\n]", sbA0x2));
        return AnonymousClass006.A0z(sbA0x);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Av4;Ljava/util/List<LX/AvA;>;IIZLX/Aud;)V */
    public C1946Auk(Av4 av4, C1940Aud c1940Aud, List list, int i, int i2, boolean z) {
        this.A02 = av4;
        this.A04 = list;
        this.A01 = i;
        this.A00 = i2;
        this.A05 = z;
        this.A03 = c1940Aud;
        if (list.size() <= 1) {
            throw C3cG.A0Q(FGI.A0G("MultiSelectionLayout requires an infoList size greater than 1, was ", '.', list.size()));
        }
    }

    @Override // X.InterfaceC1961AvD
    public final void ABk(G0U<? super AvA, Unit> g0u) {
        long j = AFe().A04;
        try {
            Av4 av4 = this.A02;
            int iA03 = av4.A03(j);
            long j2 = (AEE() == C79.A00 ? AKw() : AF9()).A04;
            try {
                int iA032 = av4.A03(j2);
                int i = iA03 + 1;
                if (i >= iA032) {
                    return;
                }
                while (i < iA032) {
                    g0u.invoke(this.A04.get(i));
                    i++;
                }
            } catch (NoSuchElementException e) {
                throw new IllegalStateException(FGI.A0B(j2, "Invalid selectableId: "), e);
            }
        } catch (NoSuchElementException e2) {
            throw new IllegalStateException(FGI.A0B(j, "Invalid selectableId: "), e2);
        }
    }

    @Override // X.InterfaceC1961AvD
    public final AvA AFe() {
        return AEE() == C79.A00 ? AF9() : AKw();
    }
}
