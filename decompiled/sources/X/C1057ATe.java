package X;

import androidx.compose.runtime.snapshots.Snapshot;
import kotlin.Unit;

/* renamed from: X.ATe, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1057ATe {
    public AT7<Float, AOW> A00;
    public HoC A01;

    public final void A00() {
        AnonymousClass002.A1K(this.A01);
        this.A00 = new AT7<>(null, AVd.A02, AnonymousClass005.A0a(), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public final void A01(AXN axn, C3UX c3ux, float f) {
        if (f > axn.Ah4(1.0f)) {
            Snapshot snapshotA03 = Snapshot.A03();
            G0U<Object, Unit> g0uA0D = snapshotA03 != null ? snapshotA03.A0D() : null;
            Snapshot snapshotA04 = Snapshot.A04(snapshotA03);
            try {
                float fA07 = C8j3.A07(this.A00.A05);
                HoC hoC = this.A01;
                if (hoC != null) {
                    hoC.A5w(null);
                }
                AT7<Float, AOW> at7 = this.A00;
                if (at7.A03) {
                    this.A00 = ATB.A01(at7, fA07 - f, 0.0f, 30);
                } else {
                    this.A00 = new AT7<>(null, AVd.A02, Float.valueOf(-f), Long.MIN_VALUE, Long.MIN_VALUE, false);
                }
                this.A01 = AnonymousClass001.A11(BU2.A0O(this, null, 29), c3ux);
            } finally {
                Snapshot.A07(snapshotA03, snapshotA04, g0uA0D);
            }
        }
    }

    public C1057ATe() {
        C31w<Float, AOW> c31w = AVd.A02;
        Float fA0a = AnonymousClass005.A0a();
        this.A00 = new AT7<>((AOd) ((AOl) c31w).A01.invoke(fA0a), c31w, fA0a, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
}
