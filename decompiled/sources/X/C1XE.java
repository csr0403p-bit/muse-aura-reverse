package X;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.time.LocalDate;
import java.util.Locale;

/* renamed from: X.1XE, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1XE implements C0z3 {
    public MutableState<C04811Xk> A00;
    public MutableState<C1XY> A01;
    public MutableState<C1XX> A02;
    public final AbstractC04741Xc A03;
    public final MutableState A04;
    public final ADq A05;

    @Override // X.C0z3
    public final Long AKE() {
        C1XX value = this.A02.getValue();
        if (value != null) {
            return Long.valueOf(value.A03);
        }
        return null;
    }

    @Override // X.C0z3
    public final void AdK(long j) {
        C1XY c1xyA04 = this.A03.A04(j);
        ADq aDq = this.A05;
        int i = c1xyA04.A03;
        if (!aDq.A00(i)) {
            throw AnonymousClass007.A0Q(aDq, "The display month's year (", i);
        }
        this.A01.Af8(c1xyA04);
    }

    public C1XE(InterfaceC04801Xj interfaceC04801Xj, Long l, Long l2, Locale locale, ADq aDq, int i) {
        C1XY c1xyA00;
        this.A05 = aDq;
        C1Y1 c1y1 = new C1Y1(locale);
        this.A03 = c1y1;
        AGE ageA01 = AGF.A01();
        this.A04 = new ParcelableSnapshotMutableState(ageA01, interfaceC04801Xj);
        if (l2 != null) {
            c1xyA00 = c1y1.A04(l2.longValue());
            int i2 = c1xyA00.A03;
            if (!aDq.A00(i2)) {
                throw AnonymousClass007.A0Q(aDq, "The initial display month's year (", i2);
            }
        } else {
            C1XX c1xxA02 = c1y1.A02();
            c1xyA00 = C1Y1.A00(c1y1, LocalDate.of(c1xxA02.A02, c1xxA02.A01, 1));
        }
        this.A01 = new ParcelableSnapshotMutableState(ageA01, c1xyA00);
        C1XX c1xxA03 = null;
        if (l != null) {
            c1xxA03 = this.A03.A03(l.longValue());
            int i3 = c1xxA03.A02;
            if (!aDq.A00(i3)) {
                throw AnonymousClass007.A0Q(aDq, "The provided initial date's year (", i3);
            }
        }
        this.A02 = new ParcelableSnapshotMutableState(ageA01, c1xxA03);
        this.A00 = new ParcelableSnapshotMutableState(ageA01, new C04811Xk(i));
    }
}
