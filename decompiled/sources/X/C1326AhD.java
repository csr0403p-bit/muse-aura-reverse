package X;

/* renamed from: X.AhD, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1326AhD extends C1EQ implements APS {
    public final long A00;

    @Override // X.APS
    public final Object APb(Object obj, float f) {
        if (obj == null) {
            obj = new C1326AhD(B6A.A06);
        }
        if (obj instanceof C1326AhD) {
            return new C1326AhD(HxS.A03(this.A00, ((C1326AhD) obj).A00, f));
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1326AhD) {
                long j = this.A00;
                long j2 = ((C1326AhD) obj).A00;
                long j3 = B6A.A01;
                if (j == j2) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C1EQ
    public final void A07(InterfaceC1330AhH interfaceC1330AhH, float f, long j) {
        interfaceC1330AhH.Acj(1.0f);
        long jA04 = this.A00;
        if (f != 1.0f) {
            jA04 = HxS.A04(HDi.A0O[(int) (jA04 & 63)], B6A.A03(jA04), B6A.A02(jA04), B6A.A01(jA04), B6A.A00(jA04) * f);
        }
        interfaceC1330AhH.Ad4(jA04);
        C1776AqX c1776AqX = (C1776AqX) interfaceC1330AhH;
        if (c1776AqX.A02 != null) {
            c1776AqX.A02 = null;
            c1776AqX.A01.setShader(null);
        }
    }

    public final int hashCode() {
        long j = this.A00;
        long j2 = B6A.A01;
        return AnonymousClass002.A0A(j);
    }

    public final String toString() {
        return AnonymousClass007.A0Z(B6A.A07(this.A00), C60O.A0x("SolidColor(value="));
    }

    public C1326AhD(long j) {
        this.A00 = j;
    }
}
