package X;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* renamed from: X.Faj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8261Faj extends AbstractC8280Fb4 implements InterfaceC8322Fbo {
    public Context A00;
    public InterfaceC8306FbY A01;
    public C8249FaR A02;
    public ActionBarContextView A03;
    public WeakReference<View> A04;
    public boolean A05;

    @Override // X.InterfaceC8322Fbo
    public final boolean AU9(MenuItem menuItem, C8249FaR c8249FaR) {
        return this.A01.ARg(menuItem, this);
    }

    @Override // X.InterfaceC8322Fbo
    public final void AUA(C8249FaR c8249FaR) {
        A01();
        C8243FaJ c8243FaJ = this.A03.A05;
        if (c8243FaJ != null) {
            c8243FaJ.A04();
        }
    }
}
