package X;

import android.graphics.Rect;
import android.graphics.Region;

/* renamed from: X.Aln, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1573Aln implements InterfaceC1574Alo {
    public final Region A00 = new Region();

    @Override // X.InterfaceC1574Alo
    public final BLU AD2() {
        Rect bounds = this.A00.getBounds();
        return new BLU(bounds.left, bounds.top, bounds.right, bounds.bottom);
    }

    @Override // X.InterfaceC1574Alo
    public final void Acb(BLU blu) {
        this.A00.set(blu.A01, blu.A03, blu.A02, blu.A00);
    }
}
