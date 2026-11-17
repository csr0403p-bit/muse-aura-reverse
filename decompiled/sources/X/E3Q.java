package X;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class E3Q extends AbstractC6411E4n {
    public final String A00;
    public final byte[] A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                E3Q e3q = (E3Q) obj;
                if (!C6xC.A00(this.A00, e3q.A00) || !Arrays.equals(this.A01, e3q.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public E3Q(String str, byte[] bArr) {
        super("PRIV");
        this.A00 = str;
        this.A01 = bArr;
    }

    public final int hashCode() {
        return BV8.A0B(this.A00) + Arrays.hashCode(this.A01);
    }

    @Override // X.AbstractC6411E4n
    public final String toString() {
        return FGI.A0U(super.A00, ": owner=", this.A00);
    }
}
