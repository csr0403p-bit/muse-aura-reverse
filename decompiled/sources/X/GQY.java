package X;

/* loaded from: classes6.dex */
public final class GQY {
    public final String A00;
    public final InterfaceC10526Hou A01;

    public final boolean equals(Object obj) {
        if (obj instanceof GQY) {
            GQY gqy = (GQY) obj;
            if (this.A01 == gqy.A01 && C7384Etj.areEqual(this.A00, gqy.A00)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AnonymousClass001.A0H(this.A00, System.identityHashCode(this.A01) * 31);
    }

    public GQY(InterfaceC10526Hou interfaceC10526Hou, String str) {
        this.A01 = interfaceC10526Hou;
        this.A00 = str;
    }
}
