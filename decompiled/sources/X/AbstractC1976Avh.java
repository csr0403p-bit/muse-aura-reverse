package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.Avh, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1976Avh {
    public static final long A00(float f, int i, long j, boolean z) {
        int iA01 = ((z || i == 2 || i == 4 || i == 5) && Constraints.A0A(j)) ? Constraints.A01(j) : Integer.MAX_VALUE;
        int iA03 = Constraints.A03(j);
        if (iA03 != iA01) {
            iA01 = ATD.A04(AbstractC2060AxX.A00(f), iA03, iA01);
        }
        return Constraints.A07(0, iA01, 0, Constraints.A00(j));
    }
}
