package X;

import android.view.DragEvent;
import kotlin.Unit;

/* renamed from: X.AsW, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1859AsW implements InterfaceC1758AqB {
    public final /* synthetic */ G0U<C1759AqC, Unit> A00;
    public final /* synthetic */ G0U<C1759AqC, Unit> A01;
    public final /* synthetic */ G0U<C1759AqC, Unit> A02;
    public final /* synthetic */ G0U<C1759AqC, Unit> A03;
    public final /* synthetic */ G0U<AWx, Unit> A04;
    public final /* synthetic */ G0V<C1860AsY, C2131Ayz, Boolean> A05;

    @Override // X.InterfaceC1758AqB
    public final void AWC(C1759AqC c1759AqC) {
    }

    public C1859AsW(G0U g0u, G0U g0u2, G0U g0u3, G0U g0u4, G0U g0u5, G0V g0v) {
        this.A00 = g0u;
        this.A05 = g0v;
        this.A02 = g0u2;
        this.A04 = g0u3;
        this.A03 = g0u4;
        this.A01 = g0u5;
    }

    @Override // X.InterfaceC1758AqB
    public final boolean ASp(C1759AqC c1759AqC) {
        this.A00.invoke(c1759AqC);
        G0V<C1860AsY, C2131Ayz, Boolean> g0v = this.A05;
        DragEvent dragEvent = c1759AqC.A00;
        return AnonymousClass001.A1X(g0v.invoke(new C1860AsY(dragEvent.getClipData()), new C2131Ayz(dragEvent.getClipDescription())));
    }

    @Override // X.InterfaceC1758AqB
    public final void ASz(C1759AqC c1759AqC) {
        this.A01.invoke(c1759AqC);
    }

    @Override // X.InterfaceC1758AqB
    public final void AT1(C1759AqC c1759AqC) {
        this.A02.invoke(c1759AqC);
    }

    @Override // X.InterfaceC1758AqB
    public final void ATD(C1759AqC c1759AqC) {
        this.A03.invoke(c1759AqC);
    }

    @Override // X.InterfaceC1758AqB
    public final void AUD(C1759AqC c1759AqC) {
        DragEvent dragEvent = c1759AqC.A00;
        AnonymousClass006.A1T(this.A04, AnonymousClass007.A0A(dragEvent.getX(), dragEvent.getY()));
    }
}
