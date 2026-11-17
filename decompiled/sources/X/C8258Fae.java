package X;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: X.Fae, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8258Fae extends AbstractC8280Fb4 implements InterfaceC8322Fbo {
    public InterfaceC8306FbY A00;
    public WeakReference<View> A01;
    public final Context A02;
    public final C8249FaR A03;
    public final /* synthetic */ C8251FaW A04;

    public C8258Fae(Context context, C8251FaW c8251FaW, InterfaceC8306FbY interfaceC8306FbY) {
        this.A04 = c8251FaW;
        this.A02 = context;
        this.A00 = interfaceC8306FbY;
        C8249FaR c8249FaR = new C8249FaR(context);
        c8249FaR.A00 = 1;
        this.A03 = c8249FaR;
        c8249FaR.A03 = this;
    }

    @Override // X.InterfaceC8322Fbo
    public final boolean AU9(MenuItem menuItem, C8249FaR c8249FaR) {
        InterfaceC8306FbY interfaceC8306FbY = this.A00;
        if (interfaceC8306FbY != null) {
            return interfaceC8306FbY.ARg(menuItem, this);
        }
        return false;
    }

    @Override // X.InterfaceC8322Fbo
    public final void AUA(C8249FaR c8249FaR) {
        if (this.A00 != null) {
            A01();
            C8243FaJ c8243FaJ = this.A04.A09.A05;
            if (c8243FaJ != null) {
                c8243FaJ.A04();
            }
        }
    }
}
