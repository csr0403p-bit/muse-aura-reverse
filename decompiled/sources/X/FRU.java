package X;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.facebook.rendercore.text.RCTextView;
import java.util.List;

/* loaded from: classes6.dex */
public final class FRU extends ActionMode.Callback2 {
    public final Path A00 = AbstractC7607F5u.A0V();
    public final RectF A01 = AbstractC7607F5u.A0Y();
    public final /* synthetic */ FRD A02;

    public FRU(FRD frd) {
        this.A02 = frd;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        FRD frd = this.A02;
        int i = FRD.A0J;
        if (!FRV.A01(menuItem.getIntent(), frd.A0H)) {
            int itemId = menuItem.getItemId();
            if (itemId == 16908321) {
                frd.A0B();
            } else if (itemId == 16908319) {
                Spannable spannable = frd.A02;
                if (spannable != null) {
                    Selection.setSelection(spannable, 0, spannable.length());
                    frd.A0D();
                    return true;
                }
            } else {
                if (itemId != FRD.A0J) {
                    return false;
                }
                if (frd.A02 != null) {
                    int iA03 = frd.A03();
                    int iA02 = frd.A02();
                    if (iA03 > iA02) {
                        iA02 = iA03;
                        iA03 = iA02;
                    }
                    if (iA03 >= 0 && iA02 >= 0 && iA03 != iA02) {
                        String string = frd.A02.subSequence(iA03, iA02).toString();
                        if (string.length() > 260000) {
                            string = BV4.A0j(string, 260000);
                        }
                        Intent intent = new Intent(AnonymousClass000.A00(12));
                        intent.setType("text/plain");
                        String strA00 = C60N.A00(20);
                        intent.removeExtra(strA00);
                        intent.putExtra(strA00, string);
                        frd.A0F.getContext().startActivity(Intent.createChooser(intent, null));
                    }
                }
            }
            actionMode.finish();
        }
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        FRD frd = this.A02;
        int i = FRD.A0J;
        actionMode.setTitle((CharSequence) null);
        actionMode.setSubtitle((CharSequence) null);
        actionMode.setTitleOptionalHint(true);
        menu.add(0, R.id.copy, 0, R.string.copy).setAlphabeticShortcut('c').setShowAsAction(2);
        if (frd.A02 != null) {
            int iA03 = frd.A03();
            int iA02 = frd.A02();
            if (iA03 > 0 || iA02 < frd.A02.length()) {
                menu.add(0, R.id.selectAll, 1, R.string.selectAll).setShowAsAction(1);
            }
        }
        RCTextView rCTextView = frd.A0F;
        Context context = rCTextView.getContext();
        int identifier = context.getResources().getIdentifier("share", "string", "android");
        menu.add(0, FRD.A0J, 2, identifier != 0 ? context.getString(identifier) : "Share").setShowAsAction(1);
        FRV frv = frd.A0H;
        FRV.A00(frv);
        List<ResolveInfo> list = frv.A04;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ResolveInfo resolveInfo = list.get(i2);
            MenuItem menuItemAdd = menu.add(0, 0, i2 + 100, resolveInfo.loadLabel(frv.A01));
            Intent intentPutExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", true);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            menuItemAdd.setIntent(intentPutExtra.setClassName(((PackageItemInfo) activityInfo).packageName, ((PackageItemInfo) activityInfo).name)).setShowAsAction(0);
        }
        if (frd.A0G() && !rCTextView.hasTransientState()) {
            rCTextView.setHasTransientState(true);
        }
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        int iA02;
        FRD frd = this.A02;
        int i = FRD.A0J;
        frd.A03 = null;
        if (!frd.A09 && frd.A02 != null && (iA02 = frd.A02()) >= 0) {
            Selection.setSelection(frd.A02, iA02);
        }
        FRF frf = frd.A04;
        if (frf != null) {
            frf.A04();
        }
        frd.A0F.setHasTransientState(false);
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        FRD frd = this.A02;
        int i = FRD.A0J;
        RCTextView rCTextView = frd.A0F;
        if (!view.equals(rCTextView) || rCTextView.A06 == null) {
            super.onGetContentRect(actionMode, view, rect);
            return;
        }
        int iA03 = frd.A03();
        int iA02 = frd.A02();
        if (iA03 < 0 || iA02 < 0) {
            super.onGetContentRect(actionMode, view, rect);
            return;
        }
        Layout layout = rCTextView.A06;
        Path path = this.A00;
        path.reset();
        layout.getSelectionPath(iA03, iA02, path);
        RectF rectF = this.A01;
        path.computeBounds(rectF, true);
        rect.set((int) Math.floor(rectF.left + r6), (int) Math.floor(rectF.top + r3), AbstractC7607F5u.A08(rectF.right + (rCTextView.getTotalPaddingLeft() - rCTextView.getScrollX())), AbstractC7607F5u.A08(rectF.bottom + (rCTextView.getTotalPaddingTop() - rCTextView.getScrollY())));
        FRD.A01(frd);
        Drawable drawable = frd.A00;
        FRD.A01(frd);
        Drawable drawable2 = frd.A01;
        if (drawable == null || drawable2 == null) {
            return;
        }
        rect.bottom += Math.max(drawable.getMinimumHeight(), drawable2.getMinimumHeight());
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // android.view.ActionMode.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onPrepareActionMode(android.view.ActionMode r2, android.view.Menu r3) {
        /*
            r1 = this;
            X.FRD r1 = r1.A02
            int r0 = X.FRD.A0J
            r0 = 16908319(0x102001f, float:2.3877316E-38)
            android.view.MenuItem r3 = r3.findItem(r0)
            android.text.Spannable r0 = r1.A02
            if (r0 == 0) goto L28
            if (r3 == 0) goto L28
            int r0 = r1.A03()
            int r2 = r1.A02()
            if (r0 > 0) goto L24
            android.text.Spannable r0 = r1.A02
            int r1 = r0.length()
            r0 = 0
            if (r2 >= r1) goto L25
        L24:
            r0 = 1
        L25:
            r3.setVisible(r0)
        L28:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FRU.onPrepareActionMode(android.view.ActionMode, android.view.Menu):boolean");
    }
}
