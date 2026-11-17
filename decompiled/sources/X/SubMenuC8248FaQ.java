package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: X.FaQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class SubMenuC8248FaQ extends C8249FaR implements SubMenu {
    public C8249FaR A00;
    public C8252FaX A01;

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        if (i > 0) {
            super.A01 = this.A0M.getDrawable(i);
        }
        this.A02 = null;
        A0D(false);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        Resources resources = this.A0N;
        if (i > 0) {
            this.A05 = resources.getText(i);
        }
        this.A02 = null;
        A0D(false);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        if (view != null) {
            this.A02 = view;
            this.A05 = null;
            super.A01 = null;
        } else {
            this.A02 = null;
        }
        A0D(false);
        return this;
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A01;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.A01.setIcon(i);
        return this;
    }

    @Override // X.C8249FaR
    public final boolean A0H(MenuItem menuItem, C8249FaR c8249FaR) {
        return super.A0H(menuItem, c8249FaR) || this.A00.A0H(menuItem, c8249FaR);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        if (drawable != null) {
            super.A01 = drawable;
        }
        this.A02 = null;
        A0D(false);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.A05 = charSequence;
        }
        this.A02 = null;
        A0D(false);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.A01.setIcon(drawable);
        return this;
    }
}
