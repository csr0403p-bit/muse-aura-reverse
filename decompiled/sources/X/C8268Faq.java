package X;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: X.Faq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8268Faq implements InterfaceMenuItemC8267Fap {
    public int A00;
    public int A01;
    public int A02;
    public Context A03;
    public ColorStateList A04;
    public PorterDuff.Mode A05;
    public CharSequence A06;
    public CharSequence A07;
    public CharSequence A08;
    public boolean A09;
    public boolean A0A;
    public char A0B;
    public char A0C;
    public Intent A0D;
    public Drawable A0E;
    public MenuItem.OnMenuItemClickListener A0F;
    public CharSequence A0G;

    private void A00() {
        Drawable drawable = this.A0E;
        if (drawable != null) {
            if (this.A09 || this.A0A) {
                this.A0E = drawable;
                Drawable drawableMutate = drawable.mutate();
                this.A0E = drawableMutate;
                if (this.A09) {
                    drawableMutate.setTintList(this.A04);
                }
                if (this.A0A) {
                    this.A0E.setTintMode(this.A05);
                }
            }
        }
    }

    @Override // X.InterfaceMenuItemC8267Fap
    public final AbstractC8327Fbt ALI() {
        return null;
    }

    @Override // X.InterfaceMenuItemC8267Fap
    public final void Ad9(CharSequence charSequence) {
        this.A06 = charSequence;
    }

    @Override // X.InterfaceMenuItemC8267Fap
    public final void Af1(CharSequence charSequence) {
        this.A08 = charSequence;
    }

    @Override // X.InterfaceMenuItemC8267Fap, android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // X.InterfaceMenuItemC8267Fap, android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // X.InterfaceMenuItemC8267Fap, android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // X.InterfaceMenuItemC8267Fap, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.A01;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.A0B;
    }

    @Override // X.InterfaceMenuItemC8267Fap, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.A06;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.A0E;
    }

    @Override // X.InterfaceMenuItemC8267Fap, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.A04;
    }

    @Override // X.InterfaceMenuItemC8267Fap, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.A05;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.A0D;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // X.InterfaceMenuItemC8267Fap, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.A02;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.A0C;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.A07;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.A0G;
        return charSequence == null ? this.A07 : charSequence;
    }

    @Override // X.InterfaceMenuItemC8267Fap, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.A08;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // X.InterfaceMenuItemC8267Fap, android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.A00 & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return AnonymousClass002.A1L(this.A00 & 2);
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return AnonymousClass002.A1L(this.A00 & 16);
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return AnonymousClass002.A1M(this.A00 & 8);
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.A00 = (z ? 1 : 0) | (this.A00 & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        this.A00 = (z ? 2 : 0) | (this.A00 & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        this.A06 = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.A00 = (z ? 16 : 0) | (this.A00 & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.A0E = this.A03.getDrawable(i);
        A00();
        return this;
    }

    @Override // X.InterfaceMenuItemC8267Fap, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.A04 = colorStateList;
        this.A09 = true;
        A00();
        return this;
    }

    @Override // X.InterfaceMenuItemC8267Fap, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.A05 = mode;
        this.A0A = true;
        A00();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.A0D = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.A0C = c;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.A0F = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.A0C = c;
        this.A0B = Character.toLowerCase(c2);
        return this;
    }

    @Override // X.InterfaceMenuItemC8267Fap, android.view.MenuItem
    public final void setShowAsAction(int i) {
    }

    @Override // X.InterfaceMenuItemC8267Fap, android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.A07 = this.A03.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.A0G = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        this.A08 = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        this.A00 = (this.A00 & 8) | (z ? 0 : 8);
        return this;
    }

    @Override // X.InterfaceMenuItemC8267Fap
    public final void Aet(AbstractC8327Fbt abstractC8327Fbt) {
        throw C8j3.A17();
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw C8j3.A17();
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw C8j3.A17();
    }

    @Override // X.InterfaceMenuItemC8267Fap, android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setActionView(int i) {
        throw C8j3.A17();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.A0B = Character.toLowerCase(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw C8j3.A17();
    }

    @Override // X.InterfaceMenuItemC8267Fap, android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        throw C8j3.A17();
    }

    @Override // X.InterfaceMenuItemC8267Fap, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.A0B = Character.toLowerCase(c);
        this.A01 = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.A0E = drawable;
        A00();
        return this;
    }

    @Override // X.InterfaceMenuItemC8267Fap, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        this.A0C = c;
        this.A02 = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // X.InterfaceMenuItemC8267Fap, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.A0C = c;
        this.A02 = KeyEvent.normalizeMetaState(i);
        this.A0B = Character.toLowerCase(c2);
        this.A01 = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.A07 = charSequence;
        return this;
    }
}
