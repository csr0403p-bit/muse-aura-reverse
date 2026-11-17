package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.unit.Constraints;
import java.util.List;

/* renamed from: X.Acw, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1163Acw extends AbstractC1164Acx<C1160Acs> {
    public final long A00;
    public final Ae2 A01;
    public final InterfaceC1126Aba A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ int A05;
    public final /* synthetic */ int A06;
    public final /* synthetic */ long A07;
    public final /* synthetic */ LazyListState A08;
    public final /* synthetic */ InterfaceC1126Aba A09;
    public final /* synthetic */ C3TH A0A;
    public final /* synthetic */ C1AC A0B;
    public final /* synthetic */ boolean A0C;
    public final /* synthetic */ boolean A0D;

    public C1163Acw(Ae2 ae2, LazyListState lazyListState, InterfaceC1126Aba interfaceC1126Aba, C3TH c3th, C1AC c1ac, int i, int i2, int i3, int i4, long j, long j2, boolean z, boolean z2) {
        int iA01;
        int iA00;
        this.A0C = z;
        this.A09 = interfaceC1126Aba;
        this.A05 = i;
        this.A06 = i2;
        this.A0A = c3th;
        this.A0B = c1ac;
        this.A0D = z2;
        this.A04 = i3;
        this.A03 = i4;
        this.A07 = j2;
        this.A08 = lazyListState;
        this.A01 = ae2;
        this.A02 = interfaceC1126Aba;
        if (z) {
            iA01 = Constraints.A01(j);
            iA00 = Integer.MAX_VALUE;
        } else {
            iA01 = Integer.MAX_VALUE;
            iA00 = Constraints.A00(j);
        }
        this.A00 = AYL.A05(0, iA01, 0, iA00);
    }

    public static final C1160Acs A00(C1163Acw c1163Acw, int i, long j) {
        Ae2 ae2 = c1163Acw.A01;
        Object objAGm = ae2.AGm(i);
        Object objAE6 = ae2.AE6(i);
        List<AZE> listA01 = c1163Acw.A01(c1163Acw.A02, i, j);
        int i2 = i == c1163Acw.A05 + (-1) ? 0 : c1163Acw.A06;
        boolean z = c1163Acw.A0C;
        return new C1160Acs(c1163Acw.A08.A0E, c1163Acw.A0A, c1163Acw.A0B, c1163Acw.A09.getLayoutDirection(), objAGm, objAE6, listA01, i, c1163Acw.A04, c1163Acw.A03, i2, c1163Acw.A07, j, z, c1163Acw.A0D);
    }
}
