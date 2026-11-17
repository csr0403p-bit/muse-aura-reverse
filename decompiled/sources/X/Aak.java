package X;

import X.AOd;

/* loaded from: classes4.dex */
public final class Aak<V extends AOd> implements InterfaceC1044ASn<V> {
    public V A00;
    public V A01;
    public V A02;
    public V A03;
    public Aaq A04;
    public float[] A05;
    public float[] A06;
    public float[] A07;
    public int[] A08 = Aas.A02;
    public final int A09;
    public final Ab1 A0A;
    public final Ab0<Aag<V>> A0B;
    public final C28s A0C;

    @Override // X.InterfaceC0999AOh
    public final /* synthetic */ AOd getEndVelocity(AOd aOd, AOd aOd2, AOd aOd3) {
        return getVelocityFromNanos(getDurationNanos(aOd, aOd2, aOd3), aOd, aOd2, aOd3);
    }

    private final float A00(int i, int i2, boolean z) {
        float f;
        Ab1 ab1 = this.A0A;
        if (i >= ab1.A00 - 1) {
            f = i2;
        } else {
            int iA01 = ab1.A01(i);
            int iA012 = ab1.A01(i + 1);
            if (i2 == iA01) {
                f = iA01;
            } else {
                int i3 = iA012 - iA01;
                Aag<V> aagA04 = this.A0B.A04(iA01);
                float f2 = i3;
                float fTransform = (aagA04 != null ? aagA04.A01 : this.A0C).transform((i2 - iA01) / f2);
                if (z) {
                    return fTransform;
                }
                f = (f2 * fTransform) + iA01;
            }
        }
        return f / 1000.0f;
    }

    private final int A01(int i) {
        int i2;
        Ab1 ab1 = this.A0A;
        int i3 = ab1.A00;
        int i4 = 0;
        if (0 > i3 || i3 > i3) {
            throw new IndexOutOfBoundsException(FGI.A0Z("fromIndex (", ") and toIndex (", ") must be in range 0..", 0, i3, i3));
        }
        int i5 = i3 - 1;
        while (true) {
            if (i4 <= i5) {
                i2 = (i4 + i5) >>> 1;
                int i6 = ab1.A01[i2];
                if (i6 >= i) {
                    if (i6 <= i) {
                        break;
                    }
                    i5 = i2 - 1;
                } else {
                    i4 = i2 + 1;
                }
            } else {
                i2 = -(i4 + 1);
                break;
            }
        }
        return i2 < -1 ? -(i2 + 2) : i2;
    }

    private final void A02(V v, V v2, V v3) {
        float[] fArr;
        Aaq aaq = this.A04;
        Aaq aaq2 = Aas.A00;
        boolean zA1Z = AnonymousClass006.A1Z(aaq, aaq2);
        if (this.A02 == null) {
            this.A02 = (V) v.A03();
            this.A03 = (V) v3.A03();
            Ab1 ab1 = this.A0A;
            int i = ab1.A00;
            float[] fArr2 = new float[i];
            for (int i2 = 0; i2 < i; i2++) {
                fArr2[i2] = ab1.A01(i2) / 1000.0f;
            }
            this.A07 = fArr2;
            int i3 = ab1.A00;
            int[] iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                ab1.A01(i4);
                iArr[i4] = 0;
            }
            this.A08 = iArr;
        }
        if (zA1Z) {
            if (this.A04 != aaq2 && C7384Etj.areEqual(this.A00, v) && C7384Etj.areEqual(this.A01, v2)) {
                return;
            }
            this.A00 = v;
            this.A01 = v2;
            int iA02 = v.A02();
            int i5 = (iA02 % 2) + iA02;
            this.A05 = new float[i5];
            this.A06 = new float[i5];
            Ab1 ab12 = this.A0A;
            int i6 = ab12.A00;
            float[][] fArr3 = new float[i6][];
            for (int i7 = 0; i7 < i6; i7++) {
                int iA01 = ab12.A01(i7);
                Aag<V> aagA04 = this.A0B.A04(iA01);
                if (iA01 == 0 && aagA04 == null) {
                    fArr = new float[i5];
                    for (int i8 = 0; i8 < i5; i8++) {
                        fArr[i8] = v.A01(i8);
                    }
                } else if (iA01 == this.A09 && aagA04 == null) {
                    fArr = new float[i5];
                    for (int i9 = 0; i9 < i5; i9++) {
                        fArr[i9] = v2.A01(i9);
                    }
                } else {
                    C7384Etj.A0X(aagA04);
                    V v4 = aagA04.A00;
                    fArr = new float[i5];
                    for (int i10 = 0; i10 < i5; i10++) {
                        fArr[i10] = v4.A01(i10);
                    }
                }
                fArr3[i7] = fArr;
            }
            this.A04 = new Aaq(this.A07, this.A08, fArr3);
        }
    }

    @Override // X.InterfaceC1044ASn
    public final int AEl() {
        return 0;
    }

    @Override // X.InterfaceC1044ASn
    public final int AEr() {
        return this.A09;
    }

    @Override // X.InterfaceC0999AOh
    public final /* synthetic */ long getDurationNanos(AOd aOd, AOd aOd2, AOd aOd3) {
        return this.A09 * 1000000;
    }

    @Override // X.InterfaceC0999AOh
    public final V getValueFromNanos(long j, V v, V v2, V v3) {
        V v4;
        V v5;
        int i;
        float f;
        float f2;
        int i2;
        float f3;
        V v6 = v;
        V v7 = v2;
        long j2 = j / 1000000;
        Aaq aaq = Aas.A00;
        int i3 = this.A09;
        long j3 = i3;
        if (j2 < 0) {
            j2 = 0;
        }
        if (j2 <= j3) {
            j3 = j2;
        }
        int i4 = (int) j3;
        Ab0<Aag<V>> ab0 = this.A0B;
        Aag<V> aagA04 = ab0.A04(i4);
        if (aagA04 != null) {
            return aagA04.A00;
        }
        if (i4 >= i3) {
            return v2;
        }
        if (i4 <= 0) {
            return v;
        }
        A02(v6, v7, v3);
        V v8 = this.A02;
        C7384Etj.A0X(v8);
        int i5 = 0;
        if (this.A04 != Aas.A00) {
            float fA00 = A00(A01(i4), i4, false);
            float[] fArr = this.A05;
            C1120Aal[][] c1120AalArr = this.A04.A00;
            int length = c1120AalArr.length - 1;
            int i6 = 0;
            float f4 = c1120AalArr[0][0].A09;
            float f5 = c1120AalArr[length][0].A0A;
            int length2 = fArr.length;
            if (fA00 >= f4 && fA00 <= f5) {
                boolean z = false;
                for (C1120Aal[] c1120AalArr2 : c1120AalArr) {
                    int i7 = 0;
                    int i8 = 0;
                    while (i7 < length2 - 1) {
                        C1120Aal c1120Aal = c1120AalArr2[i8];
                        if (fA00 <= c1120Aal.A0A) {
                            if (c1120Aal.A0G) {
                                float f6 = (fA00 - c1120Aal.A09) * c1120Aal.A08;
                                float f7 = c1120Aal.A0C;
                                fArr[i7] = f7 + ((c1120Aal.A0D - f7) * f6);
                                i2 = i7 + 1;
                                float f8 = c1120Aal.A0E;
                                f3 = f8 + (f6 * (c1120Aal.A0F - f8));
                            } else {
                                c1120Aal.A00(fA00);
                                fArr[i7] = c1120Aal.A06 + (c1120Aal.A04 * c1120Aal.A02);
                                i2 = i7 + 1;
                                f3 = c1120Aal.A07 + (c1120Aal.A05 * c1120Aal.A01);
                            }
                            fArr[i2] = f3;
                            z = true;
                        }
                        i7 += 2;
                        i8++;
                    }
                    if (z) {
                        break;
                    }
                }
            } else {
                if (fA00 > f5) {
                    f4 = f5;
                } else {
                    length = 0;
                }
                float f9 = fA00 - f4;
                int i9 = 0;
                while (i6 < length2 - 1) {
                    C1120Aal c1120Aal2 = c1120AalArr[length][i9];
                    if (c1120Aal2.A0G) {
                        float f10 = (f4 - c1120Aal2.A09) * c1120Aal2.A08;
                        float f11 = c1120Aal2.A0C;
                        fArr[i6] = f11 + ((c1120Aal2.A0D - f11) * f10) + (c1120Aal2.A06 * f9);
                        i = i6 + 1;
                        float f12 = c1120Aal2.A0E;
                        f = f12 + (f10 * (c1120Aal2.A0F - f12));
                        f2 = c1120Aal2.A07;
                    } else {
                        c1120Aal2.A00(f4);
                        float f13 = c1120Aal2.A06;
                        float f14 = c1120Aal2.A04;
                        float f15 = c1120Aal2.A02;
                        float f16 = f13 + (f14 * f15);
                        float f17 = c1120Aal2.A01;
                        float f18 = f14 * f17;
                        float f19 = c1120Aal2.A05;
                        float f20 = (-f19) * f15;
                        float fHypot = c1120Aal2.A03 / ((float) Math.hypot(f18, f20));
                        float f21 = c1120Aal2.A0B;
                        fArr[i6] = f16 + (f18 * f21 * fHypot * f9);
                        i = i6 + 1;
                        f = c1120Aal2.A07 + (f19 * f17);
                        f2 = f20 * f21 * fHypot;
                    }
                    fArr[i] = f + (f2 * f9);
                    i6 += 2;
                    i9++;
                }
            }
            while (i5 < length2) {
                v8.A05(i5, fArr[i5]);
                i5++;
            }
        } else {
            int iA01 = A01(i4);
            float fA002 = A00(iA01, i4, true);
            Ab1 ab1 = this.A0A;
            Aag<V> aagA042 = ab0.A04(ab1.A01(iA01));
            if (aagA042 != null && (v5 = aagA042.A00) != null) {
                v6 = v5;
            }
            Aag<V> aagA043 = ab0.A04(ab1.A01(iA01 + 1));
            if (aagA043 != null && (v4 = aagA043.A00) != null) {
                v7 = v4;
            }
            int iA02 = v8.A02();
            while (i5 < iA02) {
                v8.A05(i5, C8j3.A03(v6.A01(i5), 1.0f - fA002, v7.A01(i5), fA002));
                i5++;
            }
        }
        return v8;
    }

    @Override // X.InterfaceC0999AOh
    public final /* synthetic */ boolean isInfinite() {
        return false;
    }

    public Aak(Ab1 ab1, Ab0 ab0, C28s c28s, int i) {
        this.A0A = ab1;
        this.A0B = ab0;
        this.A09 = i;
        this.A0C = c28s;
        float[] fArr = Aas.A01;
        this.A07 = fArr;
        this.A05 = fArr;
        this.A06 = fArr;
        this.A04 = Aas.A00;
    }

    @Override // X.InterfaceC0999AOh
    public final V getVelocityFromNanos(long j, V v, V v2, V v3) {
        int i;
        float f;
        long j2 = j / 1000000;
        Aaq aaq = Aas.A00;
        long j3 = this.A09;
        if (j2 < 0) {
            j2 = 0;
        }
        if (j2 <= j3) {
            j3 = j2;
        }
        if (j3 < 0) {
            return v3;
        }
        A02(v, v2, v3);
        V v4 = this.A03;
        C7384Etj.A0X(v4);
        int i2 = 0;
        if (this.A04 != Aas.A00) {
            int i3 = (int) j3;
            float fA00 = A00(A01(i3), i3, false);
            float[] fArr = this.A06;
            C1120Aal[][] c1120AalArr = this.A04.A00;
            float f2 = c1120AalArr[0][0].A09;
            float f3 = c1120AalArr[c1120AalArr.length - 1][0].A0A;
            if (fA00 < f2) {
                fA00 = f2;
            }
            if (fA00 <= f3) {
                f3 = fA00;
            }
            int length = fArr.length;
            boolean z = false;
            for (C1120Aal[] c1120AalArr2 : c1120AalArr) {
                int i4 = 0;
                int i5 = 0;
                while (i4 < length - 1) {
                    C1120Aal c1120Aal = c1120AalArr2[i5];
                    if (f3 <= c1120Aal.A0A) {
                        if (c1120Aal.A0G) {
                            fArr[i4] = c1120Aal.A06;
                            i = i4 + 1;
                            f = c1120Aal.A07;
                        } else {
                            c1120Aal.A00(f3);
                            float f4 = c1120Aal.A04 * c1120Aal.A01;
                            float f5 = (-c1120Aal.A05) * c1120Aal.A02;
                            float fHypot = c1120Aal.A03 / ((float) Math.hypot(f4, f5));
                            float f6 = c1120Aal.A0B;
                            fArr[i4] = f4 * f6 * fHypot;
                            i = i4 + 1;
                            f = f5 * f6 * fHypot;
                        }
                        fArr[i] = f;
                        z = true;
                    }
                    i4 += 2;
                    i5++;
                }
                if (z) {
                    break;
                }
            }
            while (i2 < length) {
                v4.A05(i2, fArr[i2]);
                i2++;
            }
        } else {
            AOd valueFromNanos = getValueFromNanos((j3 - 1) * 1000000, v, v2, v3);
            AOd valueFromNanos2 = getValueFromNanos(j3 * 1000000, v, v2, v3);
            int iA02 = valueFromNanos.A02();
            while (i2 < iA02) {
                v4.A05(i2, (valueFromNanos.A01(i2) - valueFromNanos2.A01(i2)) * 1000.0f);
                i2++;
            }
        }
        return v4;
    }
}
