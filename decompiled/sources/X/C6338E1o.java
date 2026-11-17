package X;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* renamed from: X.E1o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6338E1o implements InterfaceC5403Dhw {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final String A05;
    public final String A06;
    public final byte[] A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C6338E1o c6338E1o = (C6338E1o) obj;
                if (this.A03 != c6338E1o.A03 || !this.A06.equals(c6338E1o.A06) || !this.A05.equals(c6338E1o.A05) || this.A04 != c6338E1o.A04 || this.A02 != c6338E1o.A02 || this.A01 != c6338E1o.A01 || this.A00 != c6338E1o.A00 || !Arrays.equals(this.A07, c6338E1o.A07)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC5403Dhw
    public final /* synthetic */ byte[] AMp() {
        return null;
    }

    @Override // X.InterfaceC5403Dhw
    public final /* synthetic */ C6154Dwx AMq() {
        return null;
    }

    @Override // X.InterfaceC5403Dhw
    public final void AY7(C10389Has c10389Has) {
        c10389Has.A01(this.A07, this.A03);
    }

    public final int hashCode() {
        return ((((((((AnonymousClass005.A0I(this.A05, AnonymousClass005.A0I(this.A06, (527 + this.A03) * 31)) + this.A04) * 31) + this.A02) * 31) + this.A01) * 31) + this.A00) * 31) + Arrays.hashCode(this.A07);
    }

    public final String toString() {
        return FGI.A0d("Picture: mimeType=", this.A06, ", description=", this.A05);
    }

    public C6338E1o(String str, String str2, byte[] bArr, int i, int i2, int i3, int i4, int i5) {
        this.A03 = i;
        this.A06 = str;
        this.A05 = str2;
        this.A04 = i2;
        this.A02 = i3;
        this.A01 = i4;
        this.A00 = i5;
        this.A07 = bArr;
    }

    public static C6338E1o A00(E1P e1p) {
        int iA05 = e1p.A05();
        String strA06 = AbstractC6161Dx4.A06(e1p.A0M(StandardCharsets.US_ASCII, e1p.A05()));
        String strA0M = e1p.A0M(StandardCharsets.UTF_8, e1p.A05());
        int iA052 = e1p.A05();
        int iA053 = e1p.A05();
        int iA054 = e1p.A05();
        int iA055 = e1p.A05();
        int iA056 = e1p.A05();
        byte[] bArr = new byte[iA056];
        e1p.A0U(bArr, 0, iA056);
        return new C6338E1o(strA06, strA0M, bArr, iA05, iA052, iA053, iA054, iA055);
    }
}
