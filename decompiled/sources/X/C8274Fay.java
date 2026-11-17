package X;

import android.view.MenuItem;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;

/* renamed from: X.Fay, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8274Fay implements InterfaceC8322Fbo {
    public final /* synthetic */ ActionMenuView A00;

    public C8274Fay(ActionMenuView actionMenuView) {
        this.A00 = actionMenuView;
    }

    @Override // X.InterfaceC8322Fbo
    public final boolean AU9(MenuItem menuItem, C8249FaR c8249FaR) {
        InterfaceC8357FcV interfaceC8357FcV = this.A00.A05;
        if (interfaceC8357FcV == null) {
            return false;
        }
        Toolbar toolbar = ((C8314Fbg) interfaceC8357FcV).A00;
        Iterator<InterfaceC8348FcM> it = toolbar.A0e.A02.iterator();
        while (it.hasNext()) {
            if (C8421Fde.A00(it).A0v(menuItem)) {
                return true;
            }
        }
        InterfaceC8354FcS interfaceC8354FcS = toolbar.A0D;
        return interfaceC8354FcS != null && ((C8309Fbb) interfaceC8354FcS).A00.A04.onMenuItemSelected(0, menuItem);
    }

    @Override // X.InterfaceC8322Fbo
    public final void AUA(C8249FaR c8249FaR) {
        InterfaceC8322Fbo interfaceC8322Fbo = this.A00.A02;
        if (interfaceC8322Fbo != null) {
            interfaceC8322Fbo.AUA(c8249FaR);
        }
    }
}
