package X;

/* loaded from: classes5.dex */
public final class E8f implements F0T {
    public final int $t;
    public final Object A00;

    public E8f(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    @Override // X.F0T
    public final void invoke(F1G<T> f1g) {
        switch (this.$t) {
            case 0:
                C7384Etj.A0Y(f1g, 0);
                break;
            case 1:
                C7384Etj.A0Y(f1g, 0);
                HxO hxO = (HxO) this.A00;
                hxO.AhZ(new F3D(f1g));
                if (((CPX) f1g).A00.isFinal) {
                    hxO.A6R(null);
                    return;
                }
                return;
            case 2:
                C7384Etj.A0Y(f1g, 0);
                if (!((CPX) f1g).A00.isFinal) {
                    return;
                }
                break;
            default:
                C7384Etj.A0Y(f1g, 0);
                ((HxO) this.A00).AhZ(new F3D(f1g));
                return;
        }
        ((AbstractC5109DYl) this.A00).onSuccess(f1g);
    }
}
