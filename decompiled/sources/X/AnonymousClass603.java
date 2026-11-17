package X;

/* renamed from: X.603, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass603 implements C20Q {
    public final int $t;
    public final Object A00;
    public final Object A01;

    public AnonymousClass603(int i, Object obj, Object obj2) {
        this.$t = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    @Override // X.C20Q
    public final Object collect(C20Z c20z, HtJ htJ) {
        C20Q[] c20qArr;
        C3rc c3rc;
        HtJ htJ2;
        Object obj;
        int i;
        Object objCollect;
        switch (this.$t) {
            case 0:
                objCollect = ((C20Q) this.A01).collect(new AnonymousClass601(0, c20z, this.A00), htJ);
                break;
            case 1:
                c20qArr = (C20Q[]) this.A00;
                c3rc = C3rc.A00;
                htJ2 = null;
                obj = this.A01;
                i = 0;
                objCollect = C4vq.A00(htJ, c3rc, new C60G(obj, htJ2, i), c20z, c20qArr);
                break;
            case 2:
                c20qArr = (C20Q[]) this.A00;
                c3rc = C3rc.A00;
                htJ2 = null;
                obj = this.A01;
                i = 1;
                objCollect = C4vq.A00(htJ, c3rc, new C60G(obj, htJ2, i), c20z, c20qArr);
                break;
            default:
                c20qArr = (C20Q[]) this.A00;
                c3rc = C3rc.A00;
                htJ2 = null;
                obj = this.A01;
                i = 2;
                objCollect = C4vq.A00(htJ, c3rc, new C60G(obj, htJ2, i), c20z, c20qArr);
                break;
        }
        return C3cG.A0U(objCollect);
    }
}
