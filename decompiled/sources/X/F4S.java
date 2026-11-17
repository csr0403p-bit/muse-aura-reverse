package X;

import android.app.Application;

/* loaded from: classes5.dex */
public final class F4S implements C5E {
    public final int $t;
    public final Object A00;

    @Override // X.C5E
    /* renamed from: create */
    public final /* bridge */ /* synthetic */ Object create2(C3241C4y c3241C4y) {
        switch (this.$t) {
            case 0:
                throw C3cG.A0Q("Missing ConfigFactory<Detector> implementation");
            case 1:
                return new C60(c3241C4y.A00, BeS.A01(c3241C4y), (F18) this.A00);
            case 2:
                C54 c54A01 = BeS.A01(c3241C4y);
                return new C64(new C3242C4z(c3241C4y, true), c3241C4y.A00, new C58((Application) this.A00), c54A01, c3241C4y.A0Q.AMN(), c3241C4y.A0X, c3241C4y.A0N, c3241C4y.A0M);
            default:
                return new C6C((Application) this.A00, (C6S) c3241C4y.A0W.AMN(), c3241C4y, c3241C4y.A03(), this);
        }
    }

    public F4S(Application application, int i) {
        this.$t = i;
        this.A00 = application;
    }

    public F4S(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }
}
