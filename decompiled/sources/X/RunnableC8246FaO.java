package X;

import android.view.MenuItem;

/* renamed from: X.FaO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC8246FaO implements Runnable {
    public static final String __redex_internal_original_name = "CascadingMenuPopup$3$1";
    public final /* synthetic */ MenuItem A00;
    public final /* synthetic */ C8241FaH A01;
    public final /* synthetic */ C8319Fbl A02;
    public final /* synthetic */ C8249FaR A03;

    public RunnableC8246FaO(MenuItem menuItem, C8241FaH c8241FaH, C8319Fbl c8319Fbl, C8249FaR c8249FaR) {
        this.A01 = c8241FaH;
        this.A02 = c8319Fbl;
        this.A00 = menuItem;
        this.A03 = c8249FaR;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8319Fbl c8319Fbl = this.A02;
        if (c8319Fbl != null) {
            ViewOnKeyListenerC8233Fa9 viewOnKeyListenerC8233Fa9 = this.A01.A00;
            viewOnKeyListenerC8233Fa9.A0C = true;
            c8319Fbl.A01.A0C(false);
            viewOnKeyListenerC8233Fa9.A0C = false;
        }
        MenuItem menuItem = this.A00;
        if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
            this.A03.A0I(menuItem, null, 4);
        }
    }
}
