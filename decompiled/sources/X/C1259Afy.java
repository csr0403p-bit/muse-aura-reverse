package X;

import androidx.compose.foundation.gestures.ScrollingLogic;

/* renamed from: X.Afy, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1259Afy implements InterfaceC1258Afu {
    public final /* synthetic */ ScrollingLogic A00;

    public C1259Afy(ScrollingLogic scrollingLogic) {
        this.A00 = scrollingLogic;
    }

    @Override // X.InterfaceC1258Afu
    public final long AcH(long j, int i) {
        ScrollingLogic scrollingLogic = this.A00;
        scrollingLogic.A00 = i;
        InterfaceC1260Afz interfaceC1260Afz = scrollingLogic.A01;
        if (interfaceC1260Afz == null || !(scrollingLogic.A05.ADO() || scrollingLogic.A05.ADN())) {
            return ScrollingLogic.A01(scrollingLogic.A04, scrollingLogic, i, j);
        }
        return interfaceC1260Afz.A4f(scrollingLogic.A0C, scrollingLogic.A00, j);
    }
}
