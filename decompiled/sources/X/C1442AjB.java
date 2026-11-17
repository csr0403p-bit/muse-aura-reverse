package X;

import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.AjB, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1442AjB {
    public boolean A00;
    public final C0917AHt<InterfaceC1448AjH> A01;
    public final C0917AHt<C1506AkD> A02;
    public final InterfaceC1536Aks A03;
    public final InterfaceC1464AjX A04;

    public final void A00() {
        if (this.A00) {
            return;
        }
        InterfaceC1464AjX interfaceC1464AjX = this.A04;
        BUO buo = new BUO(this, 2);
        C0912AHo<Function0<Unit>> c0912AHo = ((AndroidComposeView) interfaceC1464AjX).A0b;
        if (c0912AHo.A02(buo) < 0) {
            c0912AHo.A09(buo);
        }
        this.A00 = true;
    }

    public C1442AjB(InterfaceC1536Aks interfaceC1536Aks, InterfaceC1464AjX interfaceC1464AjX) {
        this.A03 = interfaceC1536Aks;
        this.A04 = interfaceC1464AjX;
        C0917AHt<Object> c0917AHt = HsU.A00;
        this.A02 = new C0917AHt<>(6);
        this.A01 = new C0917AHt<>(6);
    }
}
