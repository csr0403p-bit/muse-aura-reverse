package X;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* renamed from: X.9zn, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9zn implements Comparable<C9zn>, Serializable {
    public static final C9zn A00 = new C9zn(0, 0);
    public final long leastSignificantBits;
    public final long mostSignificantBits;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9zn) {
                C9zn c9zn = (C9zn) obj;
                if (this.mostSignificantBits != c9zn.mostSignificantBits || this.leastSignificantBits != c9zn.leastSignificantBits) {
                }
            }
            return false;
        }
        return true;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        long j = this.mostSignificantBits;
        long j2 = this.leastSignificantBits;
        C9zo c9zo = new C9zo();
        c9zo.mostSignificantBits = j;
        c9zo.leastSignificantBits = j2;
        return c9zo;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(C9zn c9zn) {
        C9zn c9zn2 = c9zn;
        C7384Etj.A0Y(c9zn2, 0);
        long j = this.mostSignificantBits;
        long j2 = c9zn2.mostSignificantBits;
        if (j == j2) {
            j = this.leastSignificantBits;
            j2 = c9zn2.leastSignificantBits;
        }
        return BMp.A01(j, j2);
    }

    public final int hashCode() {
        return AnonymousClass002.A0A(this.mostSignificantBits ^ this.leastSignificantBits);
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        long j = this.mostSignificantBits;
        C9zm.A00(j, 0, 0, bArr, 4);
        bArr[8] = 45;
        C9zm.A00(j, 9, 4, bArr, 6);
        bArr[13] = 45;
        C9zm.A00(j, 14, 6, bArr, 8);
        bArr[18] = 45;
        long j2 = this.leastSignificantBits;
        C9zm.A00(j2, 19, 0, bArr, 2);
        bArr[23] = 45;
        C9zm.A00(j2, 24, 2, bArr, 8);
        return new String(bArr, DCl.A05);
    }

    public C9zn(long j, long j2) {
        this.mostSignificantBits = j;
        this.leastSignificantBits = j2;
    }
}
