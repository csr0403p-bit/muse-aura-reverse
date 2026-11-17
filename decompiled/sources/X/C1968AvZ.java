package X;

/* renamed from: X.AvZ, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1968AvZ {
    public final int A00;
    public final int A01;
    public final C1835Arz A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1968AvZ) {
                C1968AvZ c1968AvZ = (C1968AvZ) obj;
                if (!this.A02.equals(c1968AvZ.A02) || this.A00 != c1968AvZ.A00 || this.A01 != c1968AvZ.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass005.A0E(this.A02) + this.A00) * 31) + this.A01;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("BulletSpanWithLevel(bullet=");
        sbA0x.append(this.A02);
        sbA0x.append(", indentationLevel=");
        sbA0x.append(this.A00);
        sbA0x.append(", start=");
        return C8j5.A0X(sbA0x, this.A01);
    }

    public C1968AvZ(C1835Arz c1835Arz, int i, int i2) {
        this.A02 = c1835Arz;
        this.A00 = i;
        this.A01 = i2;
    }
}
