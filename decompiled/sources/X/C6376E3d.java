package X;

import java.util.Arrays;

/* renamed from: X.E3d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6376E3d extends AbstractC6411E4n {
    public final byte[] A00;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C6376E3d c6376E3d = (C6376E3d) obj;
                if (!super.A00.equals(((AbstractC6411E4n) c6376E3d).A00) || !Arrays.equals(this.A00, c6376E3d.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return BV8.A0B(super.A00) + Arrays.hashCode(this.A00);
    }

    public C6376E3d(String str, byte[] bArr) {
        super(str);
        this.A00 = bArr;
    }
}
