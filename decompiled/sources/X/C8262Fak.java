package X;

import android.view.Menu;
import android.view.MenuItem;

/* renamed from: X.Fak, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8262Fak implements InterfaceC8306FbY {
    public InterfaceC8306FbY A00;
    public final /* synthetic */ LayoutInflaterFactory2C8250FaT A01;

    public C8262Fak(LayoutInflaterFactory2C8250FaT layoutInflaterFactory2C8250FaT, InterfaceC8306FbY interfaceC8306FbY) {
        this.A01 = layoutInflaterFactory2C8250FaT;
        this.A00 = interfaceC8306FbY;
    }

    @Override // X.InterfaceC8306FbY
    public final boolean ARg(MenuItem menuItem, AbstractC8280Fb4 abstractC8280Fb4) {
        return this.A00.ARg(menuItem, abstractC8280Fb4);
    }

    @Override // X.InterfaceC8306FbY
    public final boolean AST(Menu menu, AbstractC8280Fb4 abstractC8280Fb4) {
        return this.A00.AST(menu, abstractC8280Fb4);
    }

    @Override // X.InterfaceC8306FbY
    public final void ASW(AbstractC8280Fb4 abstractC8280Fb4) {
        this.A00.ASW(abstractC8280Fb4);
        LayoutInflaterFactory2C8250FaT layoutInflaterFactory2C8250FaT = this.A01;
        if (layoutInflaterFactory2C8250FaT.A0A != null) {
            layoutInflaterFactory2C8250FaT.A09.getDecorView().removeCallbacks(layoutInflaterFactory2C8250FaT.A0P);
        }
        if (layoutInflaterFactory2C8250FaT.A0L != null) {
            C8093FSz c8093FSz = layoutInflaterFactory2C8250FaT.A0N;
            if (c8093FSz != null) {
                c8093FSz.A01();
            }
            C8093FSz c8093FSzA02 = AbstractC8060FRo.A02(layoutInflaterFactory2C8250FaT.A0L);
            c8093FSzA02.A02(0.0f);
            layoutInflaterFactory2C8250FaT.A0N = c8093FSzA02;
            c8093FSzA02.A04(new I0E(this, 2));
        }
        layoutInflaterFactory2C8250FaT.A0K = null;
        layoutInflaterFactory2C8250FaT.A08.requestApplyInsets();
        layoutInflaterFactory2C8250FaT.A0R();
    }

    @Override // X.InterfaceC8306FbY
    public final boolean AUt(Menu menu, AbstractC8280Fb4 abstractC8280Fb4) {
        this.A01.A08.requestApplyInsets();
        return this.A00.AUt(menu, abstractC8280Fb4);
    }
}
