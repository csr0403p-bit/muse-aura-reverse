package X;

/* renamed from: X.F4z, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7586F4z implements E7R {
    public final int $t;
    public final int A00;
    public final Object A01;

    public C7586F4z(C6202Dxm c6202Dxm, int i) {
        this.$t = 2;
        this.A01 = c6202Dxm;
        this.A00 = i;
    }

    @Override // X.E7R
    public final void ANx(Object obj) {
        switch (this.$t) {
            case 0:
                E60 e60 = (E60) this.A01;
                int i = this.A00;
                C6438E5q c6438E5q = C6438E5q.$redex_init_class;
                ((E76) obj).onTimelineChanged(e60.A06, i);
                break;
            case 1:
                C5704Dnm c5704Dnm = (C5704Dnm) this.A01;
                int i2 = this.A00;
                C6438E5q c6438E5q2 = C6438E5q.$redex_init_class;
                ((E76) obj).onMediaItemTransition(c5704Dnm, i2);
                break;
            default:
                ((InterfaceC6481E7w) obj).ASr(this.A00);
                break;
        }
    }

    public C7586F4z(Object obj, int i, int i2) {
        this.$t = i2;
        this.A01 = obj;
        this.A00 = i;
    }
}
