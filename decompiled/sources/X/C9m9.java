package X;

/* renamed from: X.9m9, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9m9 implements C02i {
    public final float A00;
    public final float A01;
    public final C9mA A02;
    public final boolean A03;

    @Override // X.InterfaceC04981Yd
    public final void A4l(AXN axn, EnumC1820Arj enumC1820Arj, int[] iArr, int[] iArr2, int i) {
        boolean z;
        int i2;
        int length = iArr.length;
        if (length != 0) {
            int iAbr = axn.Abr(this.A00);
            if (this.A03 && enumC1820Arj == EnumC1820Arj.A03) {
                z = true;
                int i3 = 0;
                int iMin = 0;
                int i4 = 0;
                while (i3 < length) {
                    int iMax = Math.max(0, i - iArr[i3]);
                    iArr2[i4] = iMax;
                    iMin = Math.min(iAbr, iMax);
                    i = iMax - iMin;
                    i3++;
                    i4++;
                }
                i2 = i + iMin;
            } else {
                z = false;
                int i5 = 0;
                int i6 = 0;
                int iA0F = 0;
                int i7 = 0;
                while (i5 < length) {
                    int i8 = iArr[i5];
                    int iA0F2 = C8j3.A0F(i, i8, i6);
                    iArr2[i7] = iA0F2;
                    iA0F = C8j3.A0F(i - iA0F2, i8, iAbr);
                    i6 = iA0F2 + i8 + iA0F;
                    i5++;
                    i7++;
                }
                i2 = i - (i6 - iA0F);
            }
            C9mA c9mA = this.A02;
            if (c9mA == null || i2 <= 0) {
                return;
            }
            int iA4B = c9mA.A4B(enumC1820Arj, i2);
            if (z) {
                iA4B -= i2;
            }
            if (iA4B != 0) {
                int length2 = iArr2.length;
                for (int i9 = 0; i9 < length2; i9++) {
                    iArr2[i9] = iArr2[i9] + iA4B;
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9m9) {
                C9m9 c9m9 = (C9m9) obj;
                if (!C1DG.A08(this.A00, c9m9.A00) || this.A03 != c9m9.A03 || !C7384Etj.areEqual(this.A02, c9m9.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1185Ado
    public final void A4m(AXN axn, int[] iArr, int[] iArr2, int i) {
        A4l(axn, EnumC1820Arj.A02, iArr, iArr2, i);
    }

    @Override // X.InterfaceC04981Yd, X.InterfaceC1185Ado
    public final float AKp() {
        return this.A01;
    }

    public final int hashCode() {
        return C0KA.A01(C8j4.A04(this.A00), this.A03) + AnonymousClass006.A0D(this.A02);
    }

    public C9m9(C9mA c9mA, float f, boolean z) {
        this.A00 = f;
        this.A03 = z;
        this.A02 = c9mA;
        this.A01 = f;
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(this.A03 ? "" : "Absolute");
        sbA0w.append("Arrangement#spacedAligned(");
        C1DG.A07(sbA0w, this.A00);
        C8j3.A1K(sbA0w);
        return AnonymousClass007.A0Z(this.A02, sbA0w);
    }
}
