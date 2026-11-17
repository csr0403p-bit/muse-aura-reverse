package X;

import android.view.MenuItem;

/* renamed from: X.FbK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class MenuItemOnActionExpandListenerC8295FbK implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener A00;
    public final /* synthetic */ MenuItemC8255Fab A01;

    public MenuItemOnActionExpandListenerC8295FbK(MenuItem.OnActionExpandListener onActionExpandListener, MenuItemC8255Fab menuItemC8255Fab) {
        this.A01 = menuItemC8255Fab;
        this.A00 = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.A00.onMenuItemActionCollapse(this.A01.A00(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.A00.onMenuItemActionExpand(this.A01.A00(menuItem));
    }
}
