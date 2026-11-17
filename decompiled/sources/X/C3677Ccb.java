package X;

/* renamed from: X.Ccb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3677Ccb extends AbstractC3744Cdh {
    public final String A01 = "common";
    public final boolean A02 = true;
    public final int A00 = 1;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AbstractC3744Cdh) {
                C3677Ccb c3677Ccb = (C3677Ccb) ((AbstractC3744Cdh) obj);
                if (!this.A01.equals(c3677Ccb.A01) || this.A02 != c3677Ccb.A02 || this.A00 != c3677Ccb.A00) {
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
        StringBuilder sbA0x = C60O.A0x("MLKitLoggingOptions{libraryName=");
        sbA0x.append(this.A01);
        sbA0x.append(", enableFirelog=");
        sbA0x.append(this.A02);
        sbA0x.append(", firelogEventType=");
        return BV8.A0z(sbA0x, this.A00);
    }
}
