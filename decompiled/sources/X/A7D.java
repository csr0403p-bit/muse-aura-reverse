package X;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class A7D {
    public final long A00;
    public final byte[] A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof A7D) {
                A7D a7d = (A7D) obj;
                if (!this.A01.equals(a7d.A01) || this.A00 != a7d.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass006.A05(this.A00, Arrays.hashCode(this.A01) * 31);
    }

    public final String toString() {
        return FGI.A0g("TimestampedSecret(secret=", Arrays.toString(this.A01), ", updatedAtMillis=", ")", this.A00);
    }

    public A7D(byte[] bArr, long j) {
        this.A01 = bArr;
        this.A00 = j;
    }
}
