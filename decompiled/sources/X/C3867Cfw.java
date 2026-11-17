package X;

import java.util.Arrays;

/* renamed from: X.Cfw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3867Cfw extends AbstractC3874Cg5 {
    public final Ce5 A00;
    public final String A01;
    public final byte[] A02;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AbstractC3874Cg5) {
                C3867Cfw c3867Cfw = (C3867Cfw) ((AbstractC3874Cg5) obj);
                if (!this.A01.equals(c3867Cfw.A01) || !Arrays.equals(this.A02, c3867Cfw.A02) || !this.A00.equals(c3867Cfw.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return BV6.A09(this.A00, (((this.A01.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.A02)) * 1000003);
    }

    public C3867Cfw(Ce5 ce5, String str, byte[] bArr) {
        this.A01 = str;
        this.A02 = bArr;
        this.A00 = ce5;
    }
}
