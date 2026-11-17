package X;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;

/* renamed from: X.Fb7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8283Fb7 implements InterfaceC8322Fbo {
    public final /* synthetic */ Toolbar A00;

    public C8283Fb7(Toolbar toolbar) {
        this.A00 = toolbar;
    }

    @Override // X.InterfaceC8322Fbo
    public final boolean AU9(MenuItem menuItem, C8249FaR c8249FaR) {
        InterfaceC8322Fbo interfaceC8322Fbo = this.A00.A09;
        return interfaceC8322Fbo != null && interfaceC8322Fbo.AU9(menuItem, c8249FaR);
    }

    @Override // X.InterfaceC8322Fbo
    public final void AUA(C8249FaR c8249FaR) {
        Toolbar toolbar = this.A00;
        C8243FaJ c8243FaJ = toolbar.A0A.A04;
        if (c8243FaJ == null || !c8243FaJ.A03()) {
            Iterator<InterfaceC8348FcM> it = toolbar.A0e.A02.iterator();
            while (it.hasNext()) {
                C8421Fde.A00(it).A0t(c8249FaR);
            }
        }
        InterfaceC8322Fbo interfaceC8322Fbo = toolbar.A09;
        if (interfaceC8322Fbo != null) {
            interfaceC8322Fbo.AUA(c8249FaR);
        }
    }
}
