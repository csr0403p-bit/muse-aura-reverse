package X;

import java.nio.ByteBuffer;
import java.util.Locale;

/* renamed from: X.DIp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4962DIp implements DJK {
    public int A00;
    public int A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4962DIp)) {
            return false;
        }
        C4962DIp c4962DIp = (C4962DIp) obj;
        return this.A01 == c4962DIp.A01 && this.A00 == c4962DIp.A00;
    }

    public final int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    @Override // X.DJK
    public final boolean isEmpty() {
        return this.A01 == 0 && this.A00 == 0;
    }

    public final String toString() {
        return String.format(Locale.ENGLISH, "%d,%d", BV5.A1a(Integer.valueOf(this.A01), this.A00));
    }

    @Override // X.DJK
    public final void AZ8(ByteBuffer byteBuffer) {
        this.A01 = byteBuffer.getInt();
        this.A00 = byteBuffer.getInt();
    }
}
