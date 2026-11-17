package X;

import android.content.Context;
import android.view.MenuItem;

/* renamed from: X.FbD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8289FbD {
    public DQZ<InterfaceMenuItemC8267Fap, MenuItem> A00;
    public final Context A01;

    public final MenuItem A00(MenuItem menuItem) {
        if (!(menuItem instanceof InterfaceMenuItemC8267Fap)) {
            return menuItem;
        }
        InterfaceMenuItemC8267Fap interfaceMenuItemC8267Fap = (InterfaceMenuItemC8267Fap) menuItem;
        DQZ<InterfaceMenuItemC8267Fap, MenuItem> dqz = this.A00;
        if (dqz == null) {
            dqz = new DQZ<>(0);
            this.A00 = dqz;
        }
        MenuItem menuItem2 = dqz.get(interfaceMenuItemC8267Fap);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC8255Fab menuItemC8255Fab = new MenuItemC8255Fab(this.A01, interfaceMenuItemC8267Fap);
        this.A00.put(interfaceMenuItemC8267Fap, menuItemC8255Fab);
        return menuItemC8255Fab;
    }

    public AbstractC8289FbD(Context context) {
        this.A01 = context;
    }
}
