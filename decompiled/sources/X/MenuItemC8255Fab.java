package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Method;

/* renamed from: X.Fab, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class MenuItemC8255Fab extends AbstractC8289FbD implements MenuItem {
    public Method A00;
    public final InterfaceMenuItemC8267Fap A01;

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return this.A01.collapseActionView();
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return this.A01.expandActionView();
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        AbstractC8327Fbt abstractC8327FbtALI = this.A01.ALI();
        if (abstractC8327FbtALI instanceof ActionProviderVisibilityListenerC8285Fb9) {
            return ((ActionProviderVisibilityListenerC8285Fb9) abstractC8327FbtALI).A01;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View actionView = this.A01.getActionView();
        return actionView instanceof C8294FbJ ? (View) ((C8294FbJ) actionView).A00 : actionView;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.A01.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.A01.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.A01.getContentDescription();
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.A01.getGroupId();
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.A01.getIcon();
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.A01.getIconTintList();
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.A01.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.A01.getIntent();
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.A01.getItemId();
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.A01.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.A01.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.A01.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.A01.getOrder();
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.A01.getSubMenu();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.A01.getTitle();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        return this.A01.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.A01.getTooltipText();
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.A01.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.A01.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return this.A01.isCheckable();
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return this.A01.isChecked();
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return this.A01.isEnabled();
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return this.A01.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        ActionProviderVisibilityListenerC8285Fb9 actionProviderVisibilityListenerC8285Fb9 = new ActionProviderVisibilityListenerC8285Fb9(super.A01, actionProvider, this);
        InterfaceMenuItemC8267Fap interfaceMenuItemC8267Fap = this.A01;
        if (actionProvider == null) {
            actionProviderVisibilityListenerC8285Fb9 = null;
        }
        interfaceMenuItemC8267Fap.Aet(actionProviderVisibilityListenerC8285Fb9);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        InterfaceMenuItemC8267Fap interfaceMenuItemC8267Fap = this.A01;
        interfaceMenuItemC8267Fap.setActionView(i);
        View actionView = interfaceMenuItemC8267Fap.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            interfaceMenuItemC8267Fap.setActionView(new C8294FbJ(actionView));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.A01.setAlphabeticShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.A01.setCheckable(z);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        this.A01.setChecked(z);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.A01.Ad9(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.A01.setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.A01.setIcon(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.A01.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.A01.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.A01.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.A01.setNumericShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.A01.setOnActionExpandListener(onActionExpandListener != null ? new MenuItemOnActionExpandListenerC8295FbK(onActionExpandListener, this) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.A01.setOnMenuItemClickListener(onMenuItemClickListener != null ? new MenuItemOnMenuItemClickListenerC8298FbO(onMenuItemClickListener, this) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.A01.setShortcut(c, c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        this.A01.setShowAsAction(i);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        this.A01.setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.A01.setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.A01.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.A01.Af1(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        return this.A01.setVisible(z);
    }

    public MenuItemC8255Fab(Context context, InterfaceMenuItemC8267Fap interfaceMenuItemC8267Fap) {
        super(context);
        if (interfaceMenuItemC8267Fap == null) {
            throw C60O.A0i("Wrapped Object can not be null.");
        }
        this.A01 = interfaceMenuItemC8267Fap;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C8294FbJ(view);
        }
        this.A01.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.A01.setAlphabeticShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.A01.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        this.A01.setNumericShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.A01.setShortcut(c, c2, i, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.A01.setTitle(charSequence);
        return this;
    }
}
