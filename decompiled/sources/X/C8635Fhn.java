package X;

import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;

/* renamed from: X.Fhn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8635Fhn extends C06G implements InterfaceC8639Fhr {
    public final long A00;
    public final long A01;
    public final Shader.TileMode A02;
    public final C7911FKj A03;
    public final C3054BtW A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8635Fhn) {
                C8635Fhn c8635Fhn = (C8635Fhn) obj;
                if (!C7384Etj.areEqual(this.A03, c8635Fhn.A03) || this.A01 != c8635Fhn.A01 || this.A00 != c8635Fhn.A00 || this.A02 != c8635Fhn.A02 || !C7384Etj.areEqual(this.A04, c8635Fhn.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC8639Fhr
    public final Shader Ah5() {
        Matrix matrixA08;
        C7911FKj c7911FKj = this.A03;
        C8638Fhq c8638FhqA01 = AbstractC8636Fho.A01(c7911FKj);
        C3054BtW c3054BtW = this.A04;
        if (c3054BtW != null) {
            matrixA08 = BV4.A08();
            c3054BtW.A4b(matrixA08);
        } else {
            matrixA08 = null;
        }
        if (c8638FhqA01 != null && (matrixA08 == null || AbstractC8636Fho.A03(matrixA08))) {
            long j = this.A01;
            if (AbstractC8636Fho.A02(j)) {
                long j2 = this.A00;
                if (AbstractC8636Fho.A02(j2)) {
                    float fA00 = AnonymousClass001.A00(j2);
                    float fA002 = AnonymousClass001.A00(j);
                    float fA003 = AnonymousClass004.A00(j2);
                    float fA004 = AnonymousClass004.A00(j);
                    float fHypot = (float) Math.hypot(fA00 - fA002, fA003 - fA004);
                    if (Math.abs(fHypot) <= Float.MAX_VALUE && fHypot > 3.0517578E-5f && !(!AbstractC8636Fho.A04(new float[]{fA002, fA004, fA00, fA003}, fHypot))) {
                        LinearGradient linearGradient = new LinearGradient(fA002, fA004, fA00, fA003, c8638FhqA01.A01, c8638FhqA01.A00, this.A02);
                        if (matrixA08 == null) {
                            return linearGradient;
                        }
                        linearGradient.setLocalMatrix(matrixA08);
                        return linearGradient;
                    }
                }
            }
        }
        int iA00 = AbstractC8636Fho.A00(c7911FKj);
        return new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, iA00, iA00, Shader.TileMode.CLAMP);
    }

    public final int hashCode() {
        return AnonymousClass005.A0F(this.A02, AnonymousClass006.A06(this.A00, AnonymousClass006.A06(this.A01, AnonymousClass005.A0E(this.A03)))) + AnonymousClass006.A0D(this.A04);
    }

    public C8635Fhn(Shader.TileMode tileMode, C7911FKj c7911FKj, C3054BtW c3054BtW, long j, long j2) {
        this.A03 = c7911FKj;
        this.A01 = j;
        this.A00 = j2;
        this.A02 = tileMode;
        this.A04 = c3054BtW;
    }
}
