package X;

/* renamed from: X.Bqg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2978Bqg extends AbstractC2979Bqh {
    public final int A00;
    public final int A01;
    public final C3010Brs<Void> A02;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AbstractC2979Bqh) {
                C2978Bqg c2978Bqg = (C2978Bqg) ((AbstractC2979Bqh) obj);
                if (this.A00 != c2978Bqg.A00 || this.A01 != c2978Bqg.A01 || !this.A02.equals(c2978Bqg.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return BV6.A09(this.A02, (((this.A00 ^ 1000003) * 1000003) ^ this.A01) * 1000003);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("PendingSnapshot{jpegQuality=");
        sbA0x.append(this.A00);
        sbA0x.append(", rotationDegrees=");
        sbA0x.append(this.A01);
        sbA0x.append(", completer=");
        return BV8.A0v(this.A02, sbA0x);
    }

    /* JADX WARN: Incorrect types in method signature: (IILX/Brs<Ljava/lang/Void;>;)V */
    public C2978Bqg(C3010Brs c3010Brs, int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        if (c3010Brs == null) {
            throw BV4.A0a("Null completer");
        }
        this.A02 = c3010Brs;
    }
}
