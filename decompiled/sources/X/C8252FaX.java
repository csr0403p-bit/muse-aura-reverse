package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* renamed from: X.FaX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8252FaX implements InterfaceMenuItemC8267Fap {
    public char A00;
    public char A01;
    public int A05;
    public Intent A06;
    public MenuItem.OnMenuItemClickListener A09;
    public View A0A;
    public C8249FaR A0B;
    public SubMenuC8248FaQ A0C;
    public AbstractC8327Fbt A0D;
    public Drawable A0J;
    public MenuItem.OnActionExpandListener A0K;
    public CharSequence A0L;
    public CharSequence A0M;
    public CharSequence A0N;
    public CharSequence A0O;
    public final int A0P;
    public final int A0Q;
    public final int A0R;
    public final int A0S;
    public int A04 = 4096;
    public int A03 = 4096;
    public int A0I = 0;
    public ColorStateList A07 = null;
    public PorterDuff.Mode A08 = null;
    public boolean A0E = false;
    public boolean A0F = false;
    public boolean A0H = false;
    public int A02 = 16;
    public boolean A0G = false;

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.A0I = 0;
        this.A0J = drawable;
        this.A0H = true;
        this.A0B.A0D(false);
        return this;
    }

    public static void A00(C8252FaX c8252FaX) {
        c8252FaX.A0B.A0D(false);
    }

    public final boolean A01() {
        AbstractC8327Fbt abstractC8327Fbt;
        if ((this.A05 & 8) == 0) {
            return false;
        }
        View viewOnCreateActionView = this.A0A;
        if (viewOnCreateActionView == null && (abstractC8327Fbt = this.A0D) != null) {
            viewOnCreateActionView = ((ActionProviderVisibilityListenerC8285Fb9) abstractC8327Fbt).A01.onCreateActionView(this);
            this.A0A = viewOnCreateActionView;
        }
        return viewOnCreateActionView != null;
    }

    @Override // X.InterfaceMenuItemC8267Fap
    public final AbstractC8327Fbt ALI() {
        return this.A0D;
    }

    @Override // X.InterfaceMenuItemC8267Fap
    public final void Ad9(CharSequence charSequence) {
        this.A0L = charSequence;
        A00(this);
    }

    @Override // X.InterfaceMenuItemC8267Fap
    public final void Aet(AbstractC8327Fbt abstractC8327Fbt) {
        AbstractC8327Fbt abstractC8327Fbt2 = this.A0D;
        if (abstractC8327Fbt2 != null) {
            abstractC8327Fbt2.A00 = null;
        }
        this.A0A = null;
        this.A0D = abstractC8327Fbt;
        this.A0B.A0D(true);
        AbstractC8327Fbt abstractC8327Fbt3 = this.A0D;
        if (abstractC8327Fbt3 != null) {
            ActionProviderVisibilityListenerC8285Fb9 actionProviderVisibilityListenerC8285Fb9 = (ActionProviderVisibilityListenerC8285Fb9) abstractC8327Fbt3;
            actionProviderVisibilityListenerC8285Fb9.A00 = new C8312Fbe(this);
            actionProviderVisibilityListenerC8285Fb9.A01.setVisibilityListener(actionProviderVisibilityListenerC8285Fb9);
        }
    }

    @Override // X.InterfaceMenuItemC8267Fap
    public final void Af1(CharSequence charSequence) {
        this.A0O = charSequence;
        A00(this);
    }

    @Override // X.InterfaceMenuItemC8267Fap, android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.A05 & 8) == 0) {
            return false;
        }
        if (this.A0A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.A0K;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.A0B.A0J(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw C8j3.A18("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // X.InterfaceMenuItemC8267Fap, android.view.MenuItem
    public final View getActionView() {
        View view = this.A0A;
        if (view != null) {
            return view;
        }
        AbstractC8327Fbt abstractC8327Fbt = this.A0D;
        if (abstractC8327Fbt == null) {
            return null;
        }
        View viewOnCreateActionView = ((ActionProviderVisibilityListenerC8285Fb9) abstractC8327Fbt).A01.onCreateActionView(this);
        this.A0A = viewOnCreateActionView;
        return viewOnCreateActionView;
    }

    @Override // X.InterfaceMenuItemC8267Fap, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.A03;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.A00;
    }

    @Override // X.InterfaceMenuItemC8267Fap, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.A0L;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.A0S;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawableMutate = this.A0J;
        if (drawableMutate == null) {
            int i = this.A0I;
            if (i == 0) {
                return null;
            }
            drawableMutate = FWf.A00(this.A0B.A0M, i);
            this.A0I = 0;
            this.A0J = drawableMutate;
        }
        if (drawableMutate != null && this.A0H && (this.A0E || this.A0F)) {
            drawableMutate = drawableMutate.mutate();
            if (this.A0E) {
                drawableMutate.setTintList(this.A07);
            }
            if (this.A0F) {
                drawableMutate.setTintMode(this.A08);
            }
            this.A0H = false;
        }
        return drawableMutate;
    }

    @Override // X.InterfaceMenuItemC8267Fap, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.A07;
    }

    @Override // X.InterfaceMenuItemC8267Fap, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.A08;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.A06;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.A0P;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // X.InterfaceMenuItemC8267Fap, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.A04;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.A01;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.A0R;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.A0C;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.A0M;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.A0N;
        return charSequence == null ? this.A0M : charSequence;
    }

    @Override // X.InterfaceMenuItemC8267Fap, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.A0O;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return AnonymousClass002.A1X(this.A0C);
    }

    @Override // X.InterfaceMenuItemC8267Fap, android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.A0G;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.A02 & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return AnonymousClass002.A1Q(this.A02 & 2, 2);
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return AnonymousClass002.A1L(this.A02 & 16);
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        AbstractC8327Fbt abstractC8327Fbt = this.A0D;
        if (abstractC8327Fbt == null || !((ActionProviderVisibilityListenerC8285Fb9) abstractC8327Fbt).A01.overridesItemVisibility()) {
            if ((this.A02 & 8) == 0) {
                return true;
            }
        } else if ((this.A02 & 8) == 0 && ((ActionProviderVisibilityListenerC8285Fb9) this.A0D).A01.isVisible()) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw C8j3.A18("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // X.InterfaceMenuItemC8267Fap, android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setActionView(int i) {
        int i2;
        C8249FaR c8249FaR = this.A0B;
        Context context = c8249FaR.A0M;
        View viewInflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.A0A = viewInflate;
        this.A0D = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i2 = this.A0P) > 0) {
            viewInflate.setId(i2);
        }
        c8249FaR.A0A = true;
        c8249FaR.A0D(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.A00 != c) {
            this.A00 = Character.toLowerCase(c);
            A00(this);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i = this.A02;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.A02 = i2;
        if (i != i2) {
            A00(this);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        int i = this.A02;
        if ((i & 4) == 0) {
            int i2 = (z ? 2 : 0) | (i & (-3));
            this.A02 = i2;
            if (i != i2) {
                this.A0B.A0D(false);
            }
            return this;
        }
        C8249FaR c8249FaR = this.A0B;
        int groupId = getGroupId();
        ArrayList<C8252FaX> arrayList = c8249FaR.A07;
        int size = arrayList.size();
        c8249FaR.A07();
        for (int i3 = 0; i3 < size; i3++) {
            C8252FaX c8252FaXA0g = AbstractC7607F5u.A0g(arrayList, i3);
            if (c8252FaXA0g.getGroupId() == groupId && (c8252FaXA0g.A02 & 4) != 0 && c8252FaXA0g.isCheckable()) {
                boolean zA1Z = AnonymousClass002.A1Z(c8252FaXA0g, this);
                int i4 = c8252FaXA0g.A02;
                int i5 = (zA1Z ? 2 : 0) | (i4 & (-3));
                c8252FaXA0g.A02 = i5;
                if (i4 != i5) {
                    c8252FaXA0g.A0B.A0D(false);
                }
            }
        }
        c8249FaR.A06();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        int i = this.A02;
        int i2 = i & (-17);
        if (z) {
            i2 = i | 16;
        }
        this.A02 = i2;
        A00(this);
        return this;
    }

    @Override // X.InterfaceMenuItemC8267Fap, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.A07 = colorStateList;
        this.A0E = true;
        this.A0H = true;
        A00(this);
        return this;
    }

    @Override // X.InterfaceMenuItemC8267Fap, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.A08 = mode;
        this.A0F = true;
        this.A0H = true;
        A00(this);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.A06 = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.A01 != c) {
            this.A01 = c;
            A00(this);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.A0K = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.A09 = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.A01 = c;
        this.A00 = Character.toLowerCase(c2);
        A00(this);
        return this;
    }

    @Override // X.InterfaceMenuItemC8267Fap, android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw C60O.A0i("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.A05 = i;
        C8249FaR c8249FaR = this.A0B;
        c8249FaR.A0A = true;
        c8249FaR.A0D(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.A0M = charSequence;
        A00(this);
        SubMenuC8248FaQ subMenuC8248FaQ = this.A0C;
        if (subMenuC8248FaQ != null) {
            subMenuC8248FaQ.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.A0N = charSequence;
        A00(this);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        int i = this.A02;
        int iA06 = AbstractC7609F5w.A06(z ? 1 : 0) | (i & (-9));
        this.A02 = iA06;
        if (i != iA06) {
            C8249FaR c8249FaR = this.A0B;
            c8249FaR.A0B = true;
            c8249FaR.A0D(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.A0M;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public C8252FaX(C8249FaR c8249FaR, CharSequence charSequence, int i, int i2, int i3, int i4, int i5) {
        this.A0B = c8249FaR;
        this.A0P = i2;
        this.A0S = i;
        this.A0R = i3;
        this.A0Q = i4;
        this.A0M = charSequence;
        this.A05 = i5;
    }

    @Override // X.InterfaceMenuItemC8267Fap, android.view.MenuItem
    public final boolean expandActionView() {
        if (!A01()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.A0K;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.A0B.A0K(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        Ad9(charSequence);
        return this;
    }

    @Override // X.InterfaceMenuItemC8267Fap, android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        Af1(charSequence);
        return this;
    }

    @Override // X.InterfaceMenuItemC8267Fap, android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        int i;
        this.A0A = view;
        this.A0D = null;
        if (view != null && view.getId() == -1 && (i = this.A0P) > 0) {
            view.setId(i);
        }
        C8249FaR c8249FaR = this.A0B;
        c8249FaR.A0A = true;
        c8249FaR.A0D(true);
        return this;
    }

    @Override // X.InterfaceMenuItemC8267Fap, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.A00 == c && this.A03 == i) {
            return this;
        }
        this.A00 = Character.toLowerCase(c);
        this.A03 = KeyEvent.normalizeMetaState(i);
        A00(this);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.A0J = null;
        this.A0I = i;
        this.A0H = true;
        A00(this);
        return this;
    }

    @Override // X.InterfaceMenuItemC8267Fap, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.A01 == c && this.A04 == i) {
            return this;
        }
        this.A01 = c;
        this.A04 = KeyEvent.normalizeMetaState(i);
        A00(this);
        return this;
    }

    @Override // X.InterfaceMenuItemC8267Fap, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.A01 = c;
        this.A04 = KeyEvent.normalizeMetaState(i);
        this.A00 = Character.toLowerCase(c2);
        this.A03 = KeyEvent.normalizeMetaState(i2);
        A00(this);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.A0B.A0M.getString(i));
        return this;
    }
}
