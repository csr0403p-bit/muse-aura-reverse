package X;

import android.graphics.Matrix;

/* renamed from: X.Bne, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2871Bne extends AbstractC2880Bnn {
    public final int A00;
    public final long A01;
    public final Matrix A02;
    public final BhZ A03;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AbstractC2880Bnn) {
                C2871Bne c2871Bne = (C2871Bne) ((AbstractC2880Bnn) obj);
                if (!this.A03.equals(c2871Bne.A03) || this.A01 != c2871Bne.A01 || this.A00 != c2871Bne.A00 || !this.A02.equals(c2871Bne.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC2886Bnt
    public final int AJr() {
        return this.A00;
    }

    @Override // X.InterfaceC2886Bnt
    public final BhZ ALU() {
        return this.A03;
    }

    @Override // X.InterfaceC2886Bnt
    public final long getTimestamp() {
        return this.A01;
    }

    public final int hashCode() {
        return BV6.A09(this.A02, (((((this.A03.hashCode() ^ 1000003) * 1000003) ^ AnonymousClass002.A0A(this.A01)) * 1000003) ^ this.A00) * 1000003);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("ImmutableImageInfo{tagBundle=");
        sbA0x.append(this.A03);
        sbA0x.append(", timestamp=");
        sbA0x.append(this.A01);
        sbA0x.append(", rotationDegrees=");
        sbA0x.append(this.A00);
        sbA0x.append(", sensorToBufferTransformMatrix=");
        return BV8.A0v(this.A02, sbA0x);
    }

    public C2871Bne(Matrix matrix, BhZ bhZ, int i, long j) {
        if (bhZ == null) {
            throw BV4.A0a("Null tagBundle");
        }
        this.A03 = bhZ;
        this.A01 = j;
        this.A00 = i;
        if (matrix == null) {
            throw BV4.A0a("Null sensorToBufferTransformMatrix");
        }
        this.A02 = matrix;
    }
}
