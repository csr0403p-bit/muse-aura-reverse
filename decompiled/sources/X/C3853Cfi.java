package X;

import java.util.Arrays;

/* renamed from: X.Cfi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3853Cfi {
    public final Ce6 A00;
    public final byte[] A01;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3853Cfi) {
            C3853Cfi c3853Cfi = (C3853Cfi) obj;
            if (this.A00.equals(c3853Cfi.A00)) {
                return Arrays.equals(this.A01, c3853Cfi.A01);
            }
        }
        return false;
    }

    public final int hashCode() {
        return BV8.A0A(this.A00) ^ Arrays.hashCode(this.A01);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("EncodedPayload{encoding=");
        sbA0x.append(this.A00);
        return AnonymousClass001.A0v(", bytes=[...]}", sbA0x);
    }

    public C3853Cfi(Ce6 ce6, byte[] bArr) {
        if (bArr == null) {
            throw BV4.A0a("bytes is null");
        }
        this.A00 = ce6;
        this.A01 = bArr;
    }
}
