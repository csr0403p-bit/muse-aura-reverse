package X;

import androidx.compose.ui.Alignment;

/* renamed from: X.2VG, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C2VG {
    public static final C3TH A00;
    public static final C3TH A01;
    public static final Alignment A02;
    public static final Alignment A03;
    public static final Alignment A04;
    public static final Alignment A05;

    static {
        final float f = -1.0f;
        A04 = new Alignment(f, f) { // from class: X.2VI
            public final float A00;
            public final float A01;

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C2VI) {
                        C2VI c2vi = (C2VI) obj;
                        if (Float.compare(this.A00, c2vi.A00) != 0 || Float.compare(this.A01, c2vi.A01) != 0) {
                        }
                    }
                    return false;
                }
                return true;
            }

            @Override // androidx.compose.ui.Alignment
            public final long A4F(EnumC1820Arj enumC1820Arj, long j, long j2) {
                long j3 = ((((int) (j2 >> 32)) - ((int) (j >> 32))) << 32) | ((((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) & 4294967295L);
                float f2 = (((int) (j3 >> 32)) / 2.0f) * (this.A00 + 1.0f);
                float f3 = (((int) (j3 & 4294967295L)) / 2.0f) * (1.0f + this.A01);
                return (Math.round(f2) << 32) | (Math.round(f3) & 4294967295L);
            }

            public final int hashCode() {
                return (Float.floatToIntBits(this.A00) * 31) + Float.floatToIntBits(this.A01);
            }

            public final String toString() {
                return FGI.A0P("BiasAbsoluteAlignment(horizontalBias=", ", verticalBias=", ')', this.A00, this.A01);
            }

            {
                this.A00 = f;
                this.A01 = f;
            }
        };
        final float f2 = 1.0f;
        A05 = new Alignment(f2, f) { // from class: X.2VI
            public final float A00;
            public final float A01;

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C2VI) {
                        C2VI c2vi = (C2VI) obj;
                        if (Float.compare(this.A00, c2vi.A00) != 0 || Float.compare(this.A01, c2vi.A01) != 0) {
                        }
                    }
                    return false;
                }
                return true;
            }

            @Override // androidx.compose.ui.Alignment
            public final long A4F(EnumC1820Arj enumC1820Arj, long j, long j2) {
                long j3 = ((((int) (j2 >> 32)) - ((int) (j >> 32))) << 32) | ((((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) & 4294967295L);
                float f22 = (((int) (j3 >> 32)) / 2.0f) * (this.A00 + 1.0f);
                float f3 = (((int) (j3 & 4294967295L)) / 2.0f) * (1.0f + this.A01);
                return (Math.round(f22) << 32) | (Math.round(f3) & 4294967295L);
            }

            public final int hashCode() {
                return (Float.floatToIntBits(this.A00) * 31) + Float.floatToIntBits(this.A01);
            }

            public final String toString() {
                return FGI.A0P("BiasAbsoluteAlignment(horizontalBias=", ", verticalBias=", ')', this.A00, this.A01);
            }

            {
                this.A00 = f2;
                this.A01 = f;
            }
        };
        final float f3 = 0.0f;
        A02 = new Alignment(f, f3) { // from class: X.2VI
            public final float A00;
            public final float A01;

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C2VI) {
                        C2VI c2vi = (C2VI) obj;
                        if (Float.compare(this.A00, c2vi.A00) != 0 || Float.compare(this.A01, c2vi.A01) != 0) {
                        }
                    }
                    return false;
                }
                return true;
            }

            @Override // androidx.compose.ui.Alignment
            public final long A4F(EnumC1820Arj enumC1820Arj, long j, long j2) {
                long j3 = ((((int) (j2 >> 32)) - ((int) (j >> 32))) << 32) | ((((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) & 4294967295L);
                float f22 = (((int) (j3 >> 32)) / 2.0f) * (this.A00 + 1.0f);
                float f32 = (((int) (j3 & 4294967295L)) / 2.0f) * (1.0f + this.A01);
                return (Math.round(f22) << 32) | (Math.round(f32) & 4294967295L);
            }

            public final int hashCode() {
                return (Float.floatToIntBits(this.A00) * 31) + Float.floatToIntBits(this.A01);
            }

            public final String toString() {
                return FGI.A0P("BiasAbsoluteAlignment(horizontalBias=", ", verticalBias=", ')', this.A00, this.A01);
            }

            {
                this.A00 = f;
                this.A01 = f3;
            }
        };
        A03 = new Alignment(f2, f3) { // from class: X.2VI
            public final float A00;
            public final float A01;

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C2VI) {
                        C2VI c2vi = (C2VI) obj;
                        if (Float.compare(this.A00, c2vi.A00) != 0 || Float.compare(this.A01, c2vi.A01) != 0) {
                        }
                    }
                    return false;
                }
                return true;
            }

            @Override // androidx.compose.ui.Alignment
            public final long A4F(EnumC1820Arj enumC1820Arj, long j, long j2) {
                long j3 = ((((int) (j2 >> 32)) - ((int) (j >> 32))) << 32) | ((((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) & 4294967295L);
                float f22 = (((int) (j3 >> 32)) / 2.0f) * (this.A00 + 1.0f);
                float f32 = (((int) (j3 & 4294967295L)) / 2.0f) * (1.0f + this.A01);
                return (Math.round(f22) << 32) | (Math.round(f32) & 4294967295L);
            }

            public final int hashCode() {
                return (Float.floatToIntBits(this.A00) * 31) + Float.floatToIntBits(this.A01);
            }

            public final String toString() {
                return FGI.A0P("BiasAbsoluteAlignment(horizontalBias=", ", verticalBias=", ')', this.A00, this.A01);
            }

            {
                this.A00 = f2;
                this.A01 = f3;
            }
        };
        A00 = new C3TH(f) { // from class: X.2VH
            public final float A00;

            @Override // X.C3TH
            public final int A4E(EnumC1820Arj enumC1820Arj, int i, int i2) {
                return Math.round(((i2 - i) / 2.0f) * (1.0f + this.A00));
            }

            public final boolean equals(Object obj) {
                return this == obj || ((obj instanceof C2VH) && Float.compare(this.A00, ((C2VH) obj).A00) == 0);
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
        A01 = new C3TH(f2) { // from class: X.2VH
            public final float A00;

            @Override // X.C3TH
            public final int A4E(EnumC1820Arj enumC1820Arj, int i, int i2) {
                return Math.round(((i2 - i) / 2.0f) * (1.0f + this.A00));
            }

            public final boolean equals(Object obj) {
                return this == obj || ((obj instanceof C2VH) && Float.compare(this.A00, ((C2VH) obj).A00) == 0);
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
    }
}
