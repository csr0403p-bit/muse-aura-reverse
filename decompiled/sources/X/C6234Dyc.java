package X;

/* renamed from: X.Dyc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6234Dyc {
    public final int A00;
    public final C6202Dxm A01;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C6234Dyc c6234Dyc = (C6234Dyc) obj;
            if (this.A00 == c6234Dyc.A00) {
                return this.A01.equals(c6234Dyc.A01);
            }
        }
        return false;
    }

    public final int hashCode() {
        return AnonymousClass005.A0E(this.A01) + this.A00;
    }

    public C6234Dyc(C6202Dxm c6202Dxm, int i) {
        this.A01 = c6202Dxm;
        this.A00 = i;
    }
}
