package X;

import kotlin.Unit;

/* renamed from: X.60I, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C60I implements C20Q {
    public final int $t;
    public final Object A00;
    public final Object A01;
    public final Object A02;

    public C60I(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.A02 = obj3;
        this.A01 = obj;
        this.A00 = obj2;
    }

    @Override // X.C20Q
    public final Object collect(C20Z<? super R> c20z, HtJ<? super Unit> htJ) {
        Object objCollect;
        if (this.$t != 0) {
            objCollect = C4vq.A00(htJ, C3rc.A00, new C60E(this.A02, null, 1), c20z, new C20Q[]{(C20Q) this.A01, (C20Q) this.A00});
        } else {
            objCollect = ((C20Q) this.A02).collect(new F5B(this.A01, this.A00, c20z, 0), htJ);
        }
        return C3cG.A0U(objCollect);
    }
}
