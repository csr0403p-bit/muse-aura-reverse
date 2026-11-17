package com.facebook.aura.localbrowser;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C60P;
import X.C7384Etj;
import android.R;
import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class LocalBrowserAutofillActionMode extends ActionMode.Callback2 {
    public final Function0<Boolean> acceptsAutofill;
    public final ActionMode.Callback callback;

    @Override // android.view.ActionMode.Callback
    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        boolean zA1a = AnonymousClass002.A1a(actionMode, menu);
        if (!this.callback.onCreateActionMode(actionMode, menu)) {
            return false;
        }
        configureAutofill(menu);
        return zA1a;
    }

    @Override // android.view.ActionMode.Callback
    public void onDestroyActionMode(ActionMode actionMode) {
        C7384Etj.A0Y(actionMode, 0);
        this.callback.onDestroyActionMode(actionMode);
    }

    @Override // android.view.ActionMode.Callback
    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        boolean zA1a = AnonymousClass002.A1a(actionMode, menu);
        boolean zOnPrepareActionMode = this.callback.onPrepareActionMode(actionMode, menu);
        if (configureAutofill(menu) || zOnPrepareActionMode) {
            return zA1a;
        }
        return false;
    }

    public LocalBrowserAutofillActionMode(ActionMode.Callback callback, Function0<Boolean> function0) {
        AnonymousClass003.A0u(callback, function0);
        this.callback = callback;
        this.acceptsAutofill = function0;
    }

    private final boolean configureAutofill(Menu menu) {
        MenuItem menuItemFindItem = menu.findItem(R.id.autofill);
        if (menuItemFindItem == null) {
            return false;
        }
        menuItemFindItem.setVisible(AnonymousClass003.A1Y(this.acceptsAutofill));
        menuItemFindItem.setShowAsAction(5);
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return (menuItem.getItemId() != 16908355 || AnonymousClass003.A1Y(this.acceptsAutofill)) ? this.callback.onActionItemClicked(actionMode, menuItem) : C60P.A1Y(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback2
    public void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        AnonymousClass005.A0x(actionMode, view, rect);
        ActionMode.Callback callback = this.callback;
        if (callback instanceof ActionMode.Callback2) {
            ((ActionMode.Callback2) callback).onGetContentRect(actionMode, view, rect);
        } else {
            super.onGetContentRect(actionMode, view, rect);
        }
    }
}
