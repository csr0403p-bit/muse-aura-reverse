package X;

import android.view.DragEvent;
import kotlin.Unit;

/* renamed from: X.Asu, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1880Asu implements InterfaceC1758AqB {
    public final /* synthetic */ AbstractC1769AqM A00;
    public final /* synthetic */ G0U<C1759AqC, Unit> A01;

    @Override // X.InterfaceC1758AqB
    public final /* synthetic */ void AUD(C1759AqC c1759AqC) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1880Asu(AbstractC1769AqM abstractC1769AqM, G0U<? super C1759AqC, Unit> g0u) {
        this.A00 = abstractC1769AqM;
        this.A01 = g0u;
    }

    @Override // X.InterfaceC1758AqB
    public final boolean ASp(C1759AqC c1759AqC) {
        this.A01.invoke(c1759AqC);
        DragEvent dragEvent = c1759AqC.A00;
        C2040Ax7 c2040Ax7 = new C2040Ax7(null, new C1860AsY(dragEvent.getClipData()), new C2131Ayz(dragEvent.getClipDescription()), 1);
        return !c2040Ax7.equals(((C2035Awp) this.A00).A00.onReceive(c2040Ax7));
    }

    @Override // X.InterfaceC1758AqB
    public final void ASz(C1759AqC c1759AqC) {
        ((C2035Awp) this.A00).A00.onDragEnd();
    }

    @Override // X.InterfaceC1758AqB
    public final void AT1(C1759AqC c1759AqC) {
        ((C2035Awp) this.A00).A00.onDragEnter();
    }

    @Override // X.InterfaceC1758AqB
    public final void ATD(C1759AqC c1759AqC) {
        ((C2035Awp) this.A00).A00.onDragExit();
    }

    @Override // X.InterfaceC1758AqB
    public final void AWC(C1759AqC c1759AqC) {
        ((C2035Awp) this.A00).A00.onDragStart();
    }
}
