package X;

/* renamed from: X.DjV, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5493DjV {
    public final String A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C5493DjV c5493DjV = (C5493DjV) obj;
                if (!C6xC.A00(this.A01, c5493DjV.A01) || !C6xC.A00(this.A02, c5493DjV.A02) || !C6xC.A00(this.A00, c5493DjV.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iA0G = (AnonymousClass001.A0G(this.A01) + BV7.A0I(this.A02)) * 31;
        String str = this.A00;
        return iA0G + (str != null ? str.hashCode() : 0);
    }

    public C5493DjV(String str, String str2, String str3) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = str3;
    }
}
