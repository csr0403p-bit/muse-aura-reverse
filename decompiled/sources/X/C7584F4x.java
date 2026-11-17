package X;

/* renamed from: X.F4x, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7584F4x implements E7R {
    public final int $t;
    public final int A00;

    public C7584F4x(int i, int i2) {
        this.$t = i2;
        this.A00 = i;
    }

    @Override // X.E7R
    public final void ANx(Object obj) {
        if (this.$t != 0) {
            int i = this.A00;
            C6438E5q c6438E5q = C6438E5q.$redex_init_class;
            ((E76) obj).onAudioSessionIdChanged(i);
        } else {
            int i2 = this.A00;
            C6438E5q c6438E5q2 = C6438E5q.$redex_init_class;
            ((E76) obj).onRepeatModeChanged(i2);
        }
    }
}
