package X;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.util.List;

/* loaded from: classes4.dex */
public final class AWx {
    public final long A00;

    public static AWx A0C(long j, long j2) {
        return new AWx(j | j2);
    }

    public static /* synthetic */ long A01(float f, float f2, int i, long j) {
        if ((i & 1) != 0) {
            f = AnonymousClass003.A03(j);
        }
        if ((i & 2) != 0) {
            f2 = C8j5.A03(j);
        }
        return AnonymousClass007.A0A(f, f2);
    }

    public static long A08(C1299Agk c1299Agk) {
        return A04(c1299Agk.A0A, c1299Agk.A0B);
    }

    public static ParcelableSnapshotMutableState A0A(ATF atf, long j) {
        return new ParcelableSnapshotMutableState(atf, new AWx(j));
    }

    public static AWx A0B(long j) {
        return new AWx(j);
    }

    public static void A0F(TextFieldSelectionManager textFieldSelectionManager, long j) {
        textFieldSelectionManager.A01 = j;
        textFieldSelectionManager.A0N.Af8(new AWx(j));
        textFieldSelectionManager.A02 = 0L;
    }

    public static void A0G(MutableState mutableState, long j) {
        mutableState.Af8(new AWx(j));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AWx) && this.A00 == ((AWx) obj).A00;
    }

    public final int hashCode() {
        return AnonymousClass002.A0A(this.A00);
    }

    public final String toString() {
        return A0D(this.A00);
    }

    public /* synthetic */ AWx(long j) {
        this.A00 = j;
    }

    public static final float A00(long j) {
        float fA03 = AnonymousClass003.A03(j);
        float fA00 = AnonymousClass004.A00(j);
        return (float) Math.sqrt((fA03 * fA03) + (fA00 * fA00));
    }

    public static final long A02(long j, float f) {
        return AnonymousClass005.A0L(C8j4.A00(j, f), AnonymousClass001.A01(j, 4294967295L) * f);
    }

    public static long A03(long j, float f, long j2) {
        return A05(j2, A02(j, f));
    }

    public static final long A04(long j, long j2) {
        return AnonymousClass005.A0L(AnonymousClass001.A00(j) - AnonymousClass001.A00(j2), AnonymousClass001.A01(j, 4294967295L) - AnonymousClass001.A01(j2, 4294967295L));
    }

    public static final long A05(long j, long j2) {
        return AnonymousClass005.A0L(AnonymousClass001.A00(j) + AnonymousClass001.A00(j2), AnonymousClass001.A01(j, 4294967295L) + AnonymousClass001.A01(j2, 4294967295L));
    }

    public static long A06(MutableState mutableState) {
        AWx aWx = (AWx) mutableState.getValue();
        C7384Etj.A0X(aWx);
        return aWx.A00;
    }

    public static long A07(MutableState mutableState) {
        return ((AWx) mutableState.getValue()).A00;
    }

    public static long A09(List list, int i) {
        return ((AWx) list.get(i)).A00;
    }

    public static void A0E(long j, StringBuilder sb) {
        sb.append((Object) A0D(j));
    }

    public static String A0D(long j) {
        return (9223372034707292159L & j) != 9205357640488583168L ? FGI.A0e("Offset(", AW8.A00(AnonymousClass003.A03(j)), ", ", AW8.A00(AnonymousClass004.A00(j)), ')') : "Offset.Unspecified";
    }
}
