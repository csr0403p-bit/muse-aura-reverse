package X;

import java.util.Arrays;

/* renamed from: X.E2p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6363E2p extends AbstractC6411E4n {
    public final int A00;
    public final String A01;
    public final String A02;
    public final byte[] A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C6363E2p c6363E2p = (C6363E2p) obj;
                if (this.A00 != c6363E2p.A00 || !C6xC.A00(this.A02, c6363E2p.A02) || !C6xC.A00(this.A01, c6363E2p.A01) || !Arrays.equals(this.A03, c6363E2p.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public C6363E2p(String str, String str2, byte[] bArr, int i) {
        super("APIC");
        this.A02 = str;
        this.A01 = str2;
        this.A00 = i;
        this.A03 = bArr;
    }

    public final int hashCode() {
        int iA0I = (((527 + this.A00) * 31) + BV7.A0I(this.A02)) * 31;
        String str = this.A01;
        return ((iA0I + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.A03);
    }

    @Override // X.AbstractC6411E4n
    public final String toString() {
        return FGI.A0h(super.A00, ": mimeType=", this.A02, ", description=", this.A01);
    }
}
