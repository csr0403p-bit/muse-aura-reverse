package X;

import androidx.compose.runtime.snapshots.Snapshot;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class BBP<T> extends AbstractC1798ArH implements BCS<T> {
    public BBX<T> A00;
    public final ATF<T> A01;
    public final Function0<T> A02;

    public static BBP A0A(Function0 function0) {
        return new BBP(null, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BBX A09(X.BBX r19, X.BBP r20, androidx.compose.runtime.snapshots.Snapshot r21, kotlin.jvm.functions.Function0 r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BBP.A09(X.BBX, X.BBP, androidx.compose.runtime.snapshots.Snapshot, kotlin.jvm.functions.Function0, boolean):X.BBX");
    }

    @Override // X.BDs
    public final AN8 AFh() {
        return this.A00;
    }

    @Override // X.BDs
    public final void AYT(AN8 an8) {
        C7384Etj.A0Z(an8, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.A00 = (BBX) an8;
    }

    public final String toString() {
        BDh.A08(this.A00);
        BBX bbx = (BBX) BDh.A08(this.A00);
        return FGI.A0V("DerivedState(value=", bbx.A05(BDh.A00()) ? String.valueOf(bbx.A04) : "<Not calculated>", ")@", hashCode());
    }

    /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/functions/Function0<+TT;>;LX/ATF<TT;>;)V */
    public BBP(ATF atf, Function0 function0) {
        this.A02 = function0;
        this.A01 = atf;
        long jA09 = BDh.A00().A09();
        BBX<T> bbx = new BBX();
        ((AN8) bbx).A00 = jA09;
        bbx.A03 = AbstractC1189Ads.A00;
        bbx.A04 = BBX.A05;
        this.A00 = bbx;
    }

    @Override // X.BCS
    public final BBX AEX() {
        Snapshot snapshotA00 = BDh.A00();
        return A09((BBX) BDh.A04(snapshotA00, this.A00), this, snapshotA00, this.A02, false);
    }

    @Override // X.C1BO
    public final T getValue() {
        G0U<Object, Unit> g0uA0D = BDh.A00().A0D();
        if (g0uA0D != null) {
            g0uA0D.invoke(this);
        }
        Snapshot snapshotA00 = BDh.A00();
        return (T) A09((BBX) BDh.A04(snapshotA00, this.A00), this, snapshotA00, this.A02, true).A04;
    }
}
