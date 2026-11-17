package X;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* renamed from: X.17s, reason: invalid class name */
/* loaded from: classes.dex */
public final class C17s {
    public final MutableState A00;
    public final MutableState A01;
    public final MutableState A02;
    public final MutableState A03;
    public final MutableState A04;
    public final MutableState A05;
    public final MutableState A06;
    public final MutableState A07;
    public final MutableState A08;
    public final MutableState A09;
    public final MutableState A0A;
    public final MutableState A0B;
    public final MutableState A0C;

    public C17s(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        B6A b6a = new B6A(j);
        AGE ageA01 = AGF.A01();
        this.A08 = new ParcelableSnapshotMutableState(ageA01, b6a);
        this.A09 = A03(ageA01, j2);
        this.A0A = A03(ageA01, j3);
        this.A0B = A03(ageA01, j4);
        this.A00 = A03(ageA01, j5);
        this.A0C = A03(ageA01, j6);
        this.A01 = A03(ageA01, j7);
        this.A05 = A03(ageA01, j8);
        this.A06 = A03(ageA01, j9);
        this.A03 = A03(ageA01, j10);
        this.A07 = A03(ageA01, j11);
        this.A04 = A03(ageA01, j12);
        this.A02 = new ParcelableSnapshotMutableState(ageA01, true);
    }

    public static ParcelableSnapshotMutableState A03(ATF atf, long j) {
        return new ParcelableSnapshotMutableState(atf, new B6A(j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Colors(primary=");
        A04(this.A08, sb);
        sb.append(", primaryVariant=");
        A04(this.A09, sb);
        sb.append(", secondary=");
        A04(this.A0A, sb);
        sb.append(", secondaryVariant=");
        A04(this.A0B, sb);
        sb.append(", background=");
        A04(this.A00, sb);
        sb.append(", surface=");
        A04(this.A0C, sb);
        sb.append(", error=");
        A04(this.A01, sb);
        sb.append(", onPrimary=");
        A04(this.A05, sb);
        sb.append(", onSecondary=");
        A04(this.A06, sb);
        sb.append(", onBackground=");
        A04(this.A03, sb);
        sb.append(", onSurface=");
        A04(this.A07, sb);
        sb.append(", onError=");
        A04(this.A04, sb);
        sb.append(", isLight=");
        sb.append(MutableState.A0A(this.A02));
        return AnonymousClass006.A0z(sb);
    }

    public static long A00(BFM bfm, AKN akn) {
        return ((B6A) ((C17s) bfm.A6v(akn)).A01.getValue()).A00;
    }

    public static long A01(BFM bfm, AKN akn) {
        return ((B6A) ((C17s) bfm.A6v(akn)).A07.getValue()).A00;
    }

    public static long A02(BFM bfm, AKN akn) {
        return ((B6A) ((C17s) bfm.A6v(akn)).A08.getValue()).A00;
    }

    public static void A04(MutableState mutableState, StringBuilder sb) {
        sb.append((Object) B6A.A07(((B6A) mutableState.getValue()).A00));
    }
}
