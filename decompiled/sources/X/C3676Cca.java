package X;

/* renamed from: X.Cca, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3676Cca extends AbstractC3743Cdg {
    public final String A01 = "play-services-mlkit-image-labeling";
    public final boolean A02 = true;
    public final int A00 = 1;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AbstractC3743Cdg) {
                C3676Cca c3676Cca = (C3676Cca) ((AbstractC3743Cdg) obj);
                if (!this.A01.equals(c3676Cca.A01) || this.A02 != c3676Cca.A02 || this.A00 != c3676Cca.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.A01.hashCode() ^ 1000003) * 1000003) ^ (true != this.A02 ? 1237 : 1231)) * 1000003) ^ this.A00;
    }

    public final String toString() {
        String str = this.A01;
        boolean z = this.A02;
        int i = this.A00;
        StringBuilder sbA0x = C3cI.A0x("MLKitLoggingOptions{libraryName=", str);
        sbA0x.append(", enableFirelog=");
        sbA0x.append(z);
        sbA0x.append(", firelogEventType=");
        return BV8.A0z(sbA0x, i);
    }
}
