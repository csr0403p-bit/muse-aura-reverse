package X;

import java.io.File;

/* renamed from: X.Bhj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2686Bhj extends AbstractC2850Bmv {
    public final long A00 = 20971520;
    public final File A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AbstractC2850Bmv) {
                C2686Bhj c2686Bhj = (C2686Bhj) ((AbstractC2850Bmv) obj);
                if (this.A00 != c2686Bhj.A00 || !this.A01.equals(c2686Bhj.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A01.hashCode() ^ (((((((int) this.A00) ^ 1000003) * 1000003) ^ ((int) (0 >>> 32))) * 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("FileOutputOptionsInternal{fileSizeLimit=");
        sbA0x.append(this.A00);
        sbA0x.append(", durationLimitMillis=");
        sbA0x.append(0L);
        sbA0x.append(", location=");
        sbA0x.append((Object) null);
        sbA0x.append(", file=");
        return BV8.A0v(this.A01, sbA0x);
    }

    public C2686Bhj(File file) {
        this.A01 = file;
    }
}
