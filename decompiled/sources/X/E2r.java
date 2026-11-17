package X;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class E2r extends AbstractC6411E4n {
    public final String A00;
    public final String A01;
    public final String A02;
    public final byte[] A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                E2r e2r = (E2r) obj;
                if (!C6xC.A00(this.A02, e2r.A02) || !C6xC.A00(this.A01, e2r.A01) || !C6xC.A00(this.A00, e2r.A00) || !Arrays.equals(this.A03, e2r.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public E2r(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.A02 = str;
        this.A01 = str2;
        this.A00 = str3;
        this.A03 = bArr;
    }

    public final int hashCode() {
        return AnonymousClass005.A0I(this.A00, AnonymousClass005.A0I(this.A01, (527 + BV7.A0I(this.A02)) * 31)) + Arrays.hashCode(this.A03);
    }

    @Override // X.AbstractC6411E4n
    public final String toString() {
        return FGI.A0k(super.A00, ": mimeType=", this.A02, ", filename=", this.A01, ", description=", this.A00);
    }
}
