package X;

import androidx.compose.runtime.MutableState;

/* loaded from: classes4.dex */
public abstract class AQV {
    public static final void A00(AQU aqu, long j, long j2, long j3, boolean z) {
        MutableState mutableState = aqu.A03;
        if (AWx.A07(mutableState) != j3 || AWA.A03(aqu.A02) != j || z) {
            AWA.A05(aqu.A02, j);
            AWx.A0G(mutableState, j3);
            if (z) {
                long jA04 = AWx.A04(j2, j3);
                long jA07 = AWx.A07(aqu.A00);
                MutableState mutableState2 = aqu.A01;
                AWx.A0G(mutableState2, AWx.A04(jA04, AWx.A04(jA07, AWx.A07(mutableState2))));
            }
        }
        AWx.A0G(aqu.A00, AWx.A04(j2, j3));
    }
}
