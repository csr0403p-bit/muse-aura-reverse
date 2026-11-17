package X;

import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.Aod, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1698Aod extends ClickableSpan {
    public final AbstractC1699Aoe A00;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        AbstractC1699Aoe abstractC1699Aoe = this.A00;
        InterfaceC1702Aoh interfaceC1702AohA00 = abstractC1699Aoe.A00();
        if (interfaceC1702AohA00 != null) {
            interfaceC1702AohA00.onClick(abstractC1699Aoe);
        }
    }

    public C1698Aod(AbstractC1699Aoe abstractC1699Aoe) {
        this.A00 = abstractC1699Aoe;
    }
}
