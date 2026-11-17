package X;

/* loaded from: classes4.dex */
public final class AN3 extends AN8 {
    public int A00;

    @Override // X.AN8
    public final AN8 A02(long j) {
        int i = this.A00;
        AN3 an3 = new AN3();
        ((AN8) an3).A00 = j;
        an3.A00 = i;
        return an3;
    }

    @Override // X.AN8
    public final void A03(AN8 an8) {
        C7384Etj.A0Z(an8, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableIntStateImpl.IntStateStateRecord");
        this.A00 = ((AN3) an8).A00;
    }
}
