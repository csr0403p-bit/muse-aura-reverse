package X;

/* loaded from: classes5.dex */
public final class F57 implements CPS {
    public final int $t;
    public final Object A00;

    public F57(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    @Override // X.CPS
    public final void invoke(Throwable th) {
        int i = this.$t;
        C7384Etj.A0Y(th, 0);
        switch (i) {
            case 1:
                HxO hxO = (HxO) this.A00;
                hxO.AhZ(new C7541F0t(th));
                hxO.A6R(null);
                break;
            case 2:
            default:
                ((AbstractC5109DYl) this.A00).onFailure(th);
                break;
            case 3:
                ((HxO) this.A00).AhZ(new C7541F0t(th));
                break;
        }
    }
}
