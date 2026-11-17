package X;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/* loaded from: classes4.dex */
public final class Ar8 extends ActionMode.Callback2 implements ActionMode.Callback {
    public final BNM A00;

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        C7do.A00(menu, (C7do) this.A00);
        return AnonymousClass002.A1N(menu.size());
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        ((C7do) this.A00).A01.close();
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        AaC aaCInvoke = ((C7do) this.A00).A00.invoke();
        rect.set(Math.round(aaCInvoke.A01), Math.round(aaCInvoke.A03), Math.round(aaCInvoke.A02), Math.round(aaCInvoke.A00));
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return C7do.A00(menu, (C7do) this.A00);
    }

    public Ar8(BNM bnm) {
        this.A00 = bnm;
    }
}
