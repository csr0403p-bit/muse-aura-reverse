package X;

/* loaded from: classes5.dex */
public final class DE7 {
    public static final DE7 A02 = new DE7();
    public byte A00;
    public boolean A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj != null && (obj instanceof DE7)) {
                DE7 de7 = (DE7) obj;
                if (this.A00 != de7.A00 || this.A01 != de7.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(new Boolean(this.A01), new Byte(this.A00).hashCode());
    }

    public DE7() {
        this.A00 = (byte) 3;
        this.A01 = true;
    }

    public DE7(byte b, boolean z) {
        this.A00 = b;
        this.A01 = z;
    }
}
