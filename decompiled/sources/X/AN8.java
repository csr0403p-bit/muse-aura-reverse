package X;

/* loaded from: classes4.dex */
public abstract class AN8 {
    public long A00 = BDh.A00().A09();
    public AN8 A01;

    public AN8 A01() {
        if (this instanceof AMi) {
            return A00(this);
        }
        if (this instanceof C0987AMs) {
            long jA09 = BDh.A00().A09();
            AK8<K, ? extends V> ak8 = ((C0987AMs) this).A01;
            C0987AMs c0987AMs = new C0987AMs();
            ((AN8) c0987AMs).A00 = jA09;
            c0987AMs.A01 = ak8;
            return c0987AMs;
        }
        if (!(this instanceof C0994AMz)) {
            return this instanceof AN7 ? A00(this) : A00(this);
        }
        long jA092 = BDh.A00().A09();
        T t = ((C0994AMz) this).A00;
        C0994AMz c0994AMz = new C0994AMz();
        ((AN8) c0994AMz).A00 = jA092;
        c0994AMz.A00 = t;
        return c0994AMz;
    }

    public void A03(AN8 an8) {
        if (this instanceof AN5) {
            C7384Etj.A0Z(an8, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
            ((AN5) this).A00 = ((AN5) an8).A00;
        } else {
            C7384Etj.A0Z(an8, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
            ((AN7) this).A00 = ((AN7) an8).A00;
        }
    }

    public static AN8 A00(AN8 an8) {
        return an8.A02(BDh.A00().A09());
    }

    public AN8 A02(long j) {
        AN8 an8A01 = A01();
        an8A01.A00 = j;
        return an8A01;
    }
}
