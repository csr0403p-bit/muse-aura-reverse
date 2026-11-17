package X;

import android.view.Window;

/* renamed from: X.AxR, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2054AxR extends C2055AxS {
    @Override // X.C2055AxS, X.AbstractC0973AKh
    public final void A01(boolean z) {
        this.A01.setSystemBarsAppearance(z ? 16 : 0, 16);
    }

    @Override // X.C2055AxS, X.AbstractC0973AKh
    public final void A02(boolean z) {
        this.A01.setSystemBarsAppearance(z ? 8 : 0, 8);
    }

    @Override // X.C2055AxS, X.AbstractC0973AKh
    public final boolean A03() {
        return AnonymousClass002.A1L(this.A01.getSystemBarsAppearance() & 16);
    }

    @Override // X.C2055AxS, X.AbstractC0973AKh
    public final boolean A04() {
        return AnonymousClass002.A1L(this.A01.getSystemBarsAppearance() & 8);
    }

    public C2054AxR(Window window, C2066Axg c2066Axg, C1971Avc c1971Avc) {
        super(window, c2066Axg, c1971Avc);
    }
}
