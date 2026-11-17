package X;

import android.view.MenuItem;

/* renamed from: X.FbO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class MenuItemOnMenuItemClickListenerC8298FbO implements MenuItem.OnMenuItemClickListener {
    public final MenuItem.OnMenuItemClickListener A00;
    public final /* synthetic */ MenuItemC8255Fab A01;

    public MenuItemOnMenuItemClickListenerC8298FbO(MenuItem.OnMenuItemClickListener onMenuItemClickListener, MenuItemC8255Fab menuItemC8255Fab) {
        this.A01 = menuItemC8255Fab;
        this.A00 = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.A00.onMenuItemClick(this.A01.A00(menuItem));
    }
}
