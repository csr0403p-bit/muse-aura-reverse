package X;

import android.content.Context;
import android.view.ActionProvider;

/* renamed from: X.Fb9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ActionProviderVisibilityListenerC8285Fb9 extends AbstractC8327Fbt implements ActionProvider.VisibilityListener {
    public InterfaceC8347FcL A00;
    public final ActionProvider A01;
    public final /* synthetic */ MenuItemC8255Fab A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionProviderVisibilityListenerC8285Fb9(Context context, ActionProvider actionProvider, MenuItemC8255Fab menuItemC8255Fab) {
        super(context);
        this.A02 = menuItemC8255Fab;
        this.A01 = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        InterfaceC8347FcL interfaceC8347FcL = this.A00;
        if (interfaceC8347FcL != null) {
            C8249FaR c8249FaR = ((C8312Fbe) interfaceC8347FcL).A00.A0B;
            c8249FaR.A0B = true;
            c8249FaR.A0D(true);
        }
    }
}
