package X;

import androidx.compose.ui.Alignment;

/* renamed from: X.2VU, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2VU {
    public static final C3TH A00;
    public static final C3TH A01;
    public static final C3TH A02;
    public static final Alignment A06;
    public static final Alignment A07;
    public static final Alignment A08;
    public static final Alignment A09;
    public static final Alignment A0A;
    public static final Alignment A0B;
    public static final Alignment A0C;
    public static final Alignment A0D;
    public static final Alignment A0E;
    public static final /* synthetic */ C2VU A0F = new C2VU();
    public static final C1AC A05 = new C2VV(-1.0f);
    public static final C1AC A04 = new C2VV(0.0f);
    public static final C1AC A03 = new C2VV(1.0f);

    static {
        final float f = -1.0f;
        A0E = new Alignment(f, f) { // from class: X.2VT
            public final float A00;
            public final float A01;

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C2VT) {
                        C2VT c2vt = (C2VT) obj;
                        if (Float.compare(this.A00, c2vt.A00) != 0 || Float.compare(this.A01, c2vt.A01) != 0) {
                        }
                    }
                    return false;
                }
                return true;
            }

            @Override // androidx.compose.ui.Alignment
            public final long A4F(EnumC1820Arj enumC1820Arj, long j, long j2) {
                float f2 = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
                float f3 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
                EnumC1820Arj enumC1820Arj2 = EnumC1820Arj.A02;
                float f4 = this.A00;
                if (enumC1820Arj != enumC1820Arj2) {
                    f4 *= -1.0f;
                }
                float f5 = f3 * (1.0f + this.A01);
                return (Math.round(f2 * (f4 + 1.0f)) << 32) | (Math.round(f5) & 4294967295L);
            }

            public final int hashCode() {
                return (Float.floatToIntBits(this.A00) * 31) + Float.floatToIntBits(this.A01);
            }

            public final String toString() {
                return FGI.A0P("BiasAlignment(horizontalBias=", ", verticalBias=", ')', this.A00, this.A01);
            }

            {
                this.A00 = f;
                this.A01 = f;
            }
        };
        final float f2 = 0.0f;
        A0C = new Alignment(f2, f) { // from class: X.2VT
            public final float A00;
            public final float A01;

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C2VT) {
                        C2VT c2vt = (C2VT) obj;
                        if (Float.compare(this.A00, c2vt.A00) != 0 || Float.compare(this.A01, c2vt.A01) != 0) {
                        }
                    }
                    return false;
                }
                return true;
            }

            @Override // androidx.compose.ui.Alignment
            public final long A4F(EnumC1820Arj enumC1820Arj, long j, long j2) {
                float f22 = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
                float f3 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
                EnumC1820Arj enumC1820Arj2 = EnumC1820Arj.A02;
                float f4 = this.A00;
                if (enumC1820Arj != enumC1820Arj2) {
                    f4 *= -1.0f;
                }
                float f5 = f3 * (1.0f + this.A01);
                return (Math.round(f22 * (f4 + 1.0f)) << 32) | (Math.round(f5) & 4294967295L);
            }

            public final int hashCode() {
                return (Float.floatToIntBits(this.A00) * 31) + Float.floatToIntBits(this.A01);
            }

            public final String toString() {
                return FGI.A0P("BiasAlignment(horizontalBias=", ", verticalBias=", ')', this.A00, this.A01);
            }

            {
                this.A00 = f2;
                this.A01 = f;
            }
        };
        final float f3 = 1.0f;
        A0D = new Alignment(f3, f) { // from class: X.2VT
            public final float A00;
            public final float A01;

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C2VT) {
                        C2VT c2vt = (C2VT) obj;
                        if (Float.compare(this.A00, c2vt.A00) != 0 || Float.compare(this.A01, c2vt.A01) != 0) {
                        }
                    }
                    return false;
                }
                return true;
            }

            @Override // androidx.compose.ui.Alignment
            public final long A4F(EnumC1820Arj enumC1820Arj, long j, long j2) {
                float f22 = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
                float f32 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
                EnumC1820Arj enumC1820Arj2 = EnumC1820Arj.A02;
                float f4 = this.A00;
                if (enumC1820Arj != enumC1820Arj2) {
                    f4 *= -1.0f;
                }
                float f5 = f32 * (1.0f + this.A01);
                return (Math.round(f22 * (f4 + 1.0f)) << 32) | (Math.round(f5) & 4294967295L);
            }

            public final int hashCode() {
                return (Float.floatToIntBits(this.A00) * 31) + Float.floatToIntBits(this.A01);
            }

            public final String toString() {
                return FGI.A0P("BiasAlignment(horizontalBias=", ", verticalBias=", ')', this.A00, this.A01);
            }

            {
                this.A00 = f3;
                this.A01 = f;
            }
        };
        A0B = new Alignment(f, f2) { // from class: X.2VT
            public final float A00;
            public final float A01;

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C2VT) {
                        C2VT c2vt = (C2VT) obj;
                        if (Float.compare(this.A00, c2vt.A00) != 0 || Float.compare(this.A01, c2vt.A01) != 0) {
                        }
                    }
                    return false;
                }
                return true;
            }

            @Override // androidx.compose.ui.Alignment
            public final long A4F(EnumC1820Arj enumC1820Arj, long j, long j2) {
                float f22 = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
                float f32 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
                EnumC1820Arj enumC1820Arj2 = EnumC1820Arj.A02;
                float f4 = this.A00;
                if (enumC1820Arj != enumC1820Arj2) {
                    f4 *= -1.0f;
                }
                float f5 = f32 * (1.0f + this.A01);
                return (Math.round(f22 * (f4 + 1.0f)) << 32) | (Math.round(f5) & 4294967295L);
            }

            public final int hashCode() {
                return (Float.floatToIntBits(this.A00) * 31) + Float.floatToIntBits(this.A01);
            }

            public final String toString() {
                return FGI.A0P("BiasAlignment(horizontalBias=", ", verticalBias=", ')', this.A00, this.A01);
            }

            {
                this.A00 = f;
                this.A01 = f2;
            }
        };
        A09 = new Alignment(f2, f2) { // from class: X.2VT
            public final float A00;
            public final float A01;

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C2VT) {
                        C2VT c2vt = (C2VT) obj;
                        if (Float.compare(this.A00, c2vt.A00) != 0 || Float.compare(this.A01, c2vt.A01) != 0) {
                        }
                    }
                    return false;
                }
                return true;
            }

            @Override // androidx.compose.ui.Alignment
            public final long A4F(EnumC1820Arj enumC1820Arj, long j, long j2) {
                float f22 = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
                float f32 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
                EnumC1820Arj enumC1820Arj2 = EnumC1820Arj.A02;
                float f4 = this.A00;
                if (enumC1820Arj != enumC1820Arj2) {
                    f4 *= -1.0f;
                }
                float f5 = f32 * (1.0f + this.A01);
                return (Math.round(f22 * (f4 + 1.0f)) << 32) | (Math.round(f5) & 4294967295L);
            }

            public final int hashCode() {
                return (Float.floatToIntBits(this.A00) * 31) + Float.floatToIntBits(this.A01);
            }

            public final String toString() {
                return FGI.A0P("BiasAlignment(horizontalBias=", ", verticalBias=", ')', this.A00, this.A01);
            }

            {
                this.A00 = f2;
                this.A01 = f2;
            }
        };
        A0A = new Alignment(f3, f2) { // from class: X.2VT
            public final float A00;
            public final float A01;

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C2VT) {
                        C2VT c2vt = (C2VT) obj;
                        if (Float.compare(this.A00, c2vt.A00) != 0 || Float.compare(this.A01, c2vt.A01) != 0) {
                        }
                    }
                    return false;
                }
                return true;
            }

            @Override // androidx.compose.ui.Alignment
            public final long A4F(EnumC1820Arj enumC1820Arj, long j, long j2) {
                float f22 = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
                float f32 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
                EnumC1820Arj enumC1820Arj2 = EnumC1820Arj.A02;
                float f4 = this.A00;
                if (enumC1820Arj != enumC1820Arj2) {
                    f4 *= -1.0f;
                }
                float f5 = f32 * (1.0f + this.A01);
                return (Math.round(f22 * (f4 + 1.0f)) << 32) | (Math.round(f5) & 4294967295L);
            }

            public final int hashCode() {
                return (Float.floatToIntBits(this.A00) * 31) + Float.floatToIntBits(this.A01);
            }

            public final String toString() {
                return FGI.A0P("BiasAlignment(horizontalBias=", ", verticalBias=", ')', this.A00, this.A01);
            }

            {
                this.A00 = f3;
                this.A01 = f2;
            }
        };
        A08 = new Alignment(f, f3) { // from class: X.2VT
            public final float A00;
            public final float A01;

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C2VT) {
                        C2VT c2vt = (C2VT) obj;
                        if (Float.compare(this.A00, c2vt.A00) != 0 || Float.compare(this.A01, c2vt.A01) != 0) {
                        }
                    }
                    return false;
                }
                return true;
            }

            @Override // androidx.compose.ui.Alignment
            public final long A4F(EnumC1820Arj enumC1820Arj, long j, long j2) {
                float f22 = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
                float f32 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
                EnumC1820Arj enumC1820Arj2 = EnumC1820Arj.A02;
                float f4 = this.A00;
                if (enumC1820Arj != enumC1820Arj2) {
                    f4 *= -1.0f;
                }
                float f5 = f32 * (1.0f + this.A01);
                return (Math.round(f22 * (f4 + 1.0f)) << 32) | (Math.round(f5) & 4294967295L);
            }

            public final int hashCode() {
                return (Float.floatToIntBits(this.A00) * 31) + Float.floatToIntBits(this.A01);
            }

            public final String toString() {
                return FGI.A0P("BiasAlignment(horizontalBias=", ", verticalBias=", ')', this.A00, this.A01);
            }

            {
                this.A00 = f;
                this.A01 = f3;
            }
        };
        A06 = new Alignment(f2, f3) { // from class: X.2VT
            public final float A00;
            public final float A01;

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C2VT) {
                        C2VT c2vt = (C2VT) obj;
                        if (Float.compare(this.A00, c2vt.A00) != 0 || Float.compare(this.A01, c2vt.A01) != 0) {
                        }
                    }
                    return false;
                }
                return true;
            }

            @Override // androidx.compose.ui.Alignment
            public final long A4F(EnumC1820Arj enumC1820Arj, long j, long j2) {
                float f22 = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
                float f32 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
                EnumC1820Arj enumC1820Arj2 = EnumC1820Arj.A02;
                float f4 = this.A00;
                if (enumC1820Arj != enumC1820Arj2) {
                    f4 *= -1.0f;
                }
                float f5 = f32 * (1.0f + this.A01);
                return (Math.round(f22 * (f4 + 1.0f)) << 32) | (Math.round(f5) & 4294967295L);
            }

            public final int hashCode() {
                return (Float.floatToIntBits(this.A00) * 31) + Float.floatToIntBits(this.A01);
            }

            public final String toString() {
                return FGI.A0P("BiasAlignment(horizontalBias=", ", verticalBias=", ')', this.A00, this.A01);
            }

            {
                this.A00 = f2;
                this.A01 = f3;
            }
        };
        A07 = new Alignment(f3, f3) { // from class: X.2VT
            public final float A00;
            public final float A01;

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C2VT) {
                        C2VT c2vt = (C2VT) obj;
                        if (Float.compare(this.A00, c2vt.A00) != 0 || Float.compare(this.A01, c2vt.A01) != 0) {
                        }
                    }
                    return false;
                }
                return true;
            }

            @Override // androidx.compose.ui.Alignment
            public final long A4F(EnumC1820Arj enumC1820Arj, long j, long j2) {
                float f22 = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
                float f32 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
                EnumC1820Arj enumC1820Arj2 = EnumC1820Arj.A02;
                float f4 = this.A00;
                if (enumC1820Arj != enumC1820Arj2) {
                    f4 *= -1.0f;
                }
                float f5 = f32 * (1.0f + this.A01);
                return (Math.round(f22 * (f4 + 1.0f)) << 32) | (Math.round(f5) & 4294967295L);
            }

            public final int hashCode() {
                return (Float.floatToIntBits(this.A00) * 31) + Float.floatToIntBits(this.A01);
            }

            public final String toString() {
                return FGI.A0P("BiasAlignment(horizontalBias=", ", verticalBias=", ')', this.A00, this.A01);
            }

            {
                this.A00 = f3;
                this.A01 = f3;
            }
        };
        A02 = new C3TH(f) { // from class: X.2VS
            public final float A00;

            @Override // X.C3TH
            public final int A4E(EnumC1820Arj enumC1820Arj, int i, int i2) {
                float f4 = (i2 - i) / 2.0f;
                EnumC1820Arj enumC1820Arj2 = EnumC1820Arj.A02;
                float f5 = this.A00;
                if (enumC1820Arj != enumC1820Arj2) {
                    f5 *= -1.0f;
                }
                return Math.round(f4 * (1.0f + f5));
            }

            public final boolean equals(Object obj) {
                return this == obj || ((obj instanceof C2VS) && Float.compare(this.A00, ((C2VS) obj).A00) == 0);
            }

            public final int hashCode() {
                return Float.floatToIntBits(this.A00);
            }

            public final String toString() {
                return FGI.A0F("Horizontal(bias=", ')', this.A00);
            }

            {
                this.A00 = f;
            }
        };
        A00 = new C3TH(f2) { // from class: X.2VS
            public final float A00;

            @Override // X.C3TH
            public final int A4E(EnumC1820Arj enumC1820Arj, int i, int i2) {
                float f4 = (i2 - i) / 2.0f;
                EnumC1820Arj enumC1820Arj2 = EnumC1820Arj.A02;
                float f5 = this.A00;
                if (enumC1820Arj != enumC1820Arj2) {
                    f5 *= -1.0f;
                }
                return Math.round(f4 * (1.0f + f5));
            }

            public final boolean equals(Object obj) {
                return this == obj || ((obj instanceof C2VS) && Float.compare(this.A00, ((C2VS) obj).A00) == 0);
            }

            public final int hashCode() {
                return Float.floatToIntBits(this.A00);
            }

            public final String toString() {
                return FGI.A0F("Horizontal(bias=", ')', this.A00);
            }

            {
                this.A00 = f2;
            }
        };
        A01 = new C3TH(f3) { // from class: X.2VS
            public final float A00;

            @Override // X.C3TH
            public final int A4E(EnumC1820Arj enumC1820Arj, int i, int i2) {
                float f4 = (i2 - i) / 2.0f;
                EnumC1820Arj enumC1820Arj2 = EnumC1820Arj.A02;
                float f5 = this.A00;
                if (enumC1820Arj != enumC1820Arj2) {
                    f5 *= -1.0f;
                }
                return Math.round(f4 * (1.0f + f5));
            }

            public final boolean equals(Object obj) {
                return this == obj || ((obj instanceof C2VS) && Float.compare(this.A00, ((C2VS) obj).A00) == 0);
            }

            public final int hashCode() {
                return Float.floatToIntBits(this.A00);
            }

            public final String toString() {
                return FGI.A0F("Horizontal(bias=", ')', this.A00);
            }

            {
                this.A00 = f3;
            }
        };
    }
}
