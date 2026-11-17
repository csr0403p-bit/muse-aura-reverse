package X;

/* loaded from: classes5.dex */
public final class Bd5 extends BdB {
    public final int A00 = -1;
    public final AbstractC2509Bcf A01;
    public final String A02;

    public Bd5(AbstractC2509Bcf abstractC2509Bcf, String str) {
        this.A02 = str;
        this.A01 = abstractC2509Bcf;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof BdB) {
                Bd5 bd5 = (Bd5) ((BdB) obj);
                if (this.A02.equals(bd5.A02) && this.A00 == bd5.A00) {
                    AbstractC2509Bcf abstractC2509Bcf = this.A01;
                    AbstractC2509Bcf abstractC2509Bcf2 = bd5.A01;
                    if (abstractC2509Bcf == null) {
                        if (abstractC2509Bcf2 == null) {
                        }
                    } else if (abstractC2509Bcf.equals(abstractC2509Bcf2)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.A02.hashCode() ^ 1000003) * 1000003) ^ this.A00) * 1000003) ^ AnonymousClass006.A0D(this.A01);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("VideoMimeInfo{mimeType=");
        sbA0x.append(this.A02);
        sbA0x.append(", profile=");
        sbA0x.append(this.A00);
        sbA0x.append(", compatibleVideoProfile=");
        return BV8.A0v(this.A01, sbA0x);
    }
}
