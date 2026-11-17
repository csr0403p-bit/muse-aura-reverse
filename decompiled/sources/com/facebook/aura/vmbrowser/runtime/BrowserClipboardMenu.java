package com.facebook.aura.vmbrowser.runtime;

import X.Ab3;
import X.AbstractC7607F5u;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.BLG;
import X.C1BN;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C7384Etj;
import X.C9286GCn;
import android.R;
import android.graphics.Rect;
import android.os.Handler;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class BrowserClipboardMenu {
    public static final int $stable = 8;
    public ActionMode actionMode;
    public volatile Actions actions;
    public final BLG<Boolean> mutableShown;
    public final C1BN<Boolean> shown;
    public int shownGeneration;
    public final Handler main = C60O.A02();
    public final AtomicInteger generation = new AtomicInteger(0);

    public final class Actions {
        public final Function0<Function0<Boolean>> captureContext;
        public final Function0<Unit> copy;
        public final Function0<Boolean> isEnabled;
        public final Function0<Unit> paste;
        public final Function0<BrowserDeviceClipboardAction> pendingAction;

        public final Function0<Function0<Boolean>> getCaptureContext() {
            return this.captureContext;
        }

        public final Function0<Unit> getCopy() {
            return this.copy;
        }

        public final Function0<Unit> getPaste() {
            return this.paste;
        }

        public final Function0<BrowserDeviceClipboardAction> getPendingAction() {
            return this.pendingAction;
        }

        public final Function0<Boolean> isEnabled() {
            return this.isEnabled;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Actions(Function0<Unit> function0, Function0<Unit> function02, Function0<Boolean> function03, Function0<? extends BrowserDeviceClipboardAction> function04, Function0<? extends Function0<Boolean>> function05) {
            AnonymousClass005.A17(function0, function02, function03, function04, function05);
            this.copy = function0;
            this.paste = function02;
            this.isEnabled = function03;
            this.pendingAction = function04;
            this.captureContext = function05;
        }
    }

    public final int beginGesture() {
        Function0<Boolean> function0;
        invalidate(null);
        Actions actions = this.actions;
        if (actions == null || (function0 = actions.isEnabled) == null || !AnonymousClass003.A1Y(function0)) {
            return -1;
        }
        return this.generation.get();
    }

    public final AutoCloseable register(Function0<Unit> function0, Function0<Unit> function02, Function0<Boolean> function03, Function0<? extends BrowserDeviceClipboardAction> function04, Function0<? extends Function0<Boolean>> function05) {
        AnonymousClass005.A17(function0, function02, function03, function04, function05);
        invalidate(null);
        final Actions actions = new Actions(function0, function02, function03, function04, function05);
        this.actions = actions;
        return new AutoCloseable() { // from class: com.facebook.aura.vmbrowser.runtime.BrowserClipboardMenu$$ExternalSyntheticLambda1
            @Override // java.lang.AutoCloseable
            public final void close() {
                BrowserClipboardMenu.register$lambda$0(this.f$0, actions);
            }
        };
    }

    public final void show(View view, float f, float f2, final int i, final Function0<Boolean> function0) {
        final Function0<Boolean> function0Invoke;
        AnonymousClass002.A1C(view, 0, function0);
        final Actions actions = this.actions;
        if (actions != null) {
            if (!AnonymousClass003.A1Y(actions.isEnabled)) {
                invalidate(null);
                return;
            }
            if (i != this.generation.get() || !AnonymousClass003.A1Y(function0) || !view.isAttachedToWindow() || Math.abs(f) > Float.MAX_VALUE || Math.abs(f2) > Float.MAX_VALUE || 0.0f > f || f > 1.0f || 0.0f > f2 || f2 > 1.0f || (function0Invoke = actions.captureContext.invoke()) == null || !AnonymousClass003.A1Y(function0Invoke)) {
                return;
            }
            ActionMode actionMode = this.actionMode;
            if (actionMode != null) {
                actionMode.finish();
            }
            final int iA02 = Ab3.A02(f, AbstractC7607F5u.A02(view));
            final int iA022 = Ab3.A02(f2, AbstractC7607F5u.A03(view));
            this.shownGeneration = i;
            ActionMode actionModeStartActionMode = view.startActionMode(new ActionMode.Callback2() { // from class: com.facebook.aura.vmbrowser.runtime.BrowserClipboardMenu.show.1
                /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
                @Override // android.view.ActionMode.Callback
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public boolean onActionItemClicked(android.view.ActionMode r8, android.view.MenuItem r9) {
                    /*
                        r7 = this;
                        r6 = 0
                        boolean r5 = X.AnonymousClass002.A1a(r8, r9)
                        int r0 = r9.getItemId()
                        switch(r0) {
                            case 16908321: goto L12;
                            case 16908322: goto Ld;
                            default: goto Lc;
                        }
                    Lc:
                        return r6
                    Ld:
                        com.facebook.aura.vmbrowser.runtime.BrowserClipboardMenu$Actions r0 = r1
                        kotlin.jvm.functions.Function0<kotlin.Unit> r4 = r0.paste
                        goto L16
                    L12:
                        com.facebook.aura.vmbrowser.runtime.BrowserClipboardMenu$Actions r0 = r1
                        kotlin.jvm.functions.Function0<kotlin.Unit> r4 = r0.copy
                    L16:
                        com.facebook.aura.vmbrowser.runtime.BrowserClipboardMenu r1 = r2
                        android.view.ActionMode r0 = r1.actionMode
                        if (r0 != r8) goto L53
                        com.facebook.aura.vmbrowser.runtime.BrowserClipboardMenu$Actions r1 = r1.actions
                        com.facebook.aura.vmbrowser.runtime.BrowserClipboardMenu$Actions r0 = r1
                        if (r1 != r0) goto L53
                        com.facebook.aura.vmbrowser.runtime.BrowserClipboardMenu r0 = r2
                        java.util.concurrent.atomic.AtomicInteger r0 = r0.generation
                        int r1 = r0.get()
                        int r0 = r3
                        if (r1 != r0) goto L53
                        com.facebook.aura.vmbrowser.runtime.BrowserClipboardMenu$Actions r0 = r1
                        kotlin.jvm.functions.Function0<java.lang.Boolean> r0 = r0.isEnabled
                        boolean r0 = X.AnonymousClass003.A1Y(r0)
                        if (r0 == 0) goto L53
                        com.facebook.aura.vmbrowser.runtime.BrowserClipboardMenu$Actions r0 = r1
                        kotlin.jvm.functions.Function0<com.facebook.aura.vmbrowser.runtime.BrowserDeviceClipboardAction> r0 = r0.pendingAction
                        java.lang.Object r0 = r0.invoke()
                        if (r0 != 0) goto L53
                        kotlin.jvm.functions.Function0<java.lang.Boolean> r0 = r4
                        boolean r0 = X.AnonymousClass003.A1Y(r0)
                        if (r0 == 0) goto L53
                        kotlin.jvm.functions.Function0<java.lang.Boolean> r0 = r5
                        boolean r0 = X.AnonymousClass003.A1Y(r0)
                        r3 = 1
                        if (r0 != 0) goto L54
                    L53:
                        r3 = 0
                    L54:
                        com.facebook.aura.vmbrowser.runtime.BrowserClipboardMenu r1 = r2
                        android.view.ActionMode r0 = r1.actionMode
                        if (r0 != r8) goto L68
                        r2 = 0
                        r1.actionMode = r2
                        X.BLG<java.lang.Boolean> r1 = r1.mutableShown
                        java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
                        X.GCn r1 = (X.C9286GCn) r1
                        X.C9286GCn.A00(r2, r0, r1)
                    L68:
                        r8.finish()
                        if (r3 == 0) goto L70
                        r4.invoke()
                    L70:
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vmbrowser.runtime.BrowserClipboardMenu.AnonymousClass1.onActionItemClicked(android.view.ActionMode, android.view.MenuItem):boolean");
                }

                @Override // android.view.ActionMode.Callback
                public boolean onCreateActionMode(ActionMode actionMode2, Menu menu) {
                    C7384Etj.A0Y(menu, 1);
                    menu.add(0, R.id.copy, 0, R.string.copy).setShowAsAction(1);
                    menu.add(0, R.id.paste, 1, R.string.paste).setShowAsAction(1);
                    updateItems(menu);
                    return true;
                }

                @Override // android.view.ActionMode.Callback
                public void onDestroyActionMode(ActionMode actionMode2) {
                    C7384Etj.A0Y(actionMode2, 0);
                    BrowserClipboardMenu browserClipboardMenu = this;
                    if (browserClipboardMenu.actionMode == actionMode2) {
                        browserClipboardMenu.actionMode = null;
                        C9286GCn.A00(null, false, (C9286GCn) browserClipboardMenu.mutableShown);
                    }
                }

                @Override // android.view.ActionMode.Callback2
                public void onGetContentRect(ActionMode actionMode2, View view2, Rect rect) {
                    C7384Etj.A0Y(rect, 2);
                    int i2 = iA02;
                    int i3 = iA022;
                    rect.set(i2, i3, i2 + 1, i3 + 1);
                }

                @Override // android.view.ActionMode.Callback
                public boolean onPrepareActionMode(ActionMode actionMode2, Menu menu) {
                    C7384Etj.A0Y(menu, 1);
                    updateItems(menu);
                    return true;
                }

                private final void updateItems(Menu menu) {
                    BrowserDeviceClipboardAction browserDeviceClipboardActionInvoke = actions.pendingAction.invoke();
                    MenuItem menuItemFindItem = menu.findItem(R.id.copy);
                    if (menuItemFindItem != null) {
                        menuItemFindItem.setEnabled(AnonymousClass002.A1Y(browserDeviceClipboardActionInvoke));
                        BrowserDeviceClipboardAction browserDeviceClipboardAction = BrowserDeviceClipboardAction.COPY;
                        int i2 = R.string.copy;
                        if (browserDeviceClipboardActionInvoke == browserDeviceClipboardAction) {
                            i2 = com.facebook.aura.R.string._name_removed__res_0x7f1201cc;
                        }
                        menuItemFindItem.setTitle(i2);
                    }
                    MenuItem menuItemFindItem2 = menu.findItem(R.id.paste);
                    if (menuItemFindItem2 != null) {
                        menuItemFindItem2.setEnabled(browserDeviceClipboardActionInvoke == null);
                        BrowserDeviceClipboardAction browserDeviceClipboardAction2 = BrowserDeviceClipboardAction.PASTE;
                        int i3 = R.string.paste;
                        if (browserDeviceClipboardActionInvoke == browserDeviceClipboardAction2) {
                            i3 = com.facebook.aura.R.string._name_removed__res_0x7f1201d5;
                        }
                        menuItemFindItem2.setTitle(i3);
                    }
                }
            }, 1);
            this.actionMode = actionModeStartActionMode;
            AnonymousClass004.A1D(actionModeStartActionMode != null, this.mutableShown);
        }
    }

    public static /* synthetic */ void invalidate$default(BrowserClipboardMenu browserClipboardMenu, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        browserClipboardMenu.invalidate(num);
    }

    public static final void invalidate$lambda$0(BrowserClipboardMenu browserClipboardMenu) {
        ActionMode actionMode;
        if (browserClipboardMenu.shownGeneration == browserClipboardMenu.generation.get() || (actionMode = browserClipboardMenu.actionMode) == null) {
            return;
        }
        actionMode.finish();
    }

    public static final void refresh$lambda$0(BrowserClipboardMenu browserClipboardMenu) {
        ActionMode actionMode = browserClipboardMenu.actionMode;
        if (actionMode != null) {
            actionMode.invalidate();
        }
    }

    public static final void register$lambda$0(BrowserClipboardMenu browserClipboardMenu, Actions actions) {
        if (browserClipboardMenu.actions == actions) {
            browserClipboardMenu.actions = null;
            browserClipboardMenu.invalidate(null);
        }
    }

    public final C1BN<Boolean> getShown() {
        return this.shown;
    }

    public final void invalidate(Integer num) {
        AtomicInteger atomicInteger = this.generation;
        if (num != null) {
            int iIntValue = num.intValue();
            if (!atomicInteger.compareAndSet(iIntValue, iIntValue + 1)) {
                return;
            }
        } else {
            atomicInteger.incrementAndGet();
        }
        Runnable runnable = new Runnable() { // from class: com.facebook.aura.vmbrowser.runtime.BrowserClipboardMenu$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                BrowserClipboardMenu.invalidate$lambda$0(this.f$0);
            }
        };
        if (C3cH.A1K()) {
            runnable.run();
        } else {
            this.main.post(runnable);
        }
    }

    public final void refresh() {
        Runnable runnable = new Runnable() { // from class: com.facebook.aura.vmbrowser.runtime.BrowserClipboardMenu$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                BrowserClipboardMenu.refresh$lambda$0(this.f$0);
            }
        };
        if (C3cH.A1K()) {
            runnable.run();
        } else {
            this.main.post(runnable);
        }
    }

    public BrowserClipboardMenu() {
        C9286GCn c9286GCnA0v = AnonymousClass002.A0v(false);
        this.mutableShown = c9286GCnA0v;
        this.shown = C3cG.A11(c9286GCnA0v);
        this.shownGeneration = -1;
    }
}
