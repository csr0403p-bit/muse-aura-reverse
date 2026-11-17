package X;

import android.view.Menu;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* renamed from: X.Fac, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8256Fac extends AbstractC8276Fb0 {
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final Window.Callback A04;
    public final InterfaceC8353FcR A05;
    public final InterfaceC8333Fc0 A06;
    public final InterfaceC8354FcS A08;
    public ArrayList A00 = C3cG.A0h();
    public final Runnable A07 = new RunnableC8286FbA(this);

    public static Menu A00(C8256Fac c8256Fac) {
        if (!c8256Fac.A03) {
            InterfaceC8333Fc0 interfaceC8333Fc0 = c8256Fac.A06;
            ((C8254Faa) interfaceC8333Fc0).A09.setMenuCallbacks(new C8277Fb1(c8256Fac), new C8273Fav(c8256Fac));
            c8256Fac.A03 = true;
        }
        return ((C8254Faa) c8256Fac.A06).A09.getMenu();
    }

    public C8256Fac(Window.Callback callback, Toolbar toolbar, CharSequence charSequence) {
        C8309Fbb c8309Fbb = new C8309Fbb(this);
        this.A08 = c8309Fbb;
        C8254Faa c8254Faa = new C8254Faa(toolbar, false);
        this.A06 = c8254Faa;
        callback.getClass();
        this.A04 = callback;
        c8254Faa.A07 = callback;
        toolbar.A0D = c8309Fbb;
        c8254Faa.setWindowTitle(charSequence);
        this.A05 = new C8310Fbc(this);
    }
}
