package X;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import java.util.List;

/* renamed from: X.Faf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8259Faf extends AbstractWindowCallbackC8263Fal {
    public InterfaceC8353FcR A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final /* synthetic */ LayoutInflaterFactory2C8250FaT A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8259Faf(Window.Callback callback, LayoutInflaterFactory2C8250FaT layoutInflaterFactory2C8250FaT) {
        super(callback);
        this.A04 = layoutInflaterFactory2C8250FaT;
    }

    public static void A00(LayoutInflaterFactory2C8250FaT layoutInflaterFactory2C8250FaT) {
        C8259Faf c8259Faf = layoutInflaterFactory2C8250FaT.A0E;
        Window.Callback callback = layoutInflaterFactory2C8250FaT.A09.getCallback();
        try {
            c8259Faf.A02 = true;
            callback.onContentChanged();
        } finally {
            c8259Faf.A02 = false;
        }
    }

    @Override // X.AbstractWindowCallbackC8263Fal, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.A01 ? super.A00.dispatchKeyEvent(keyEvent) : this.A04.A0X(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // X.AbstractWindowCallbackC8263Fal, android.view.Window.Callback
    public final void onContentChanged() {
        if (this.A02) {
            super.A00.onContentChanged();
        }
    }

    @Override // X.AbstractWindowCallbackC8263Fal, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof C8249FaR)) {
            return super.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // X.AbstractWindowCallbackC8263Fal, android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        InterfaceC8353FcR interfaceC8353FcR = this.A00;
        if (interfaceC8353FcR != null) {
            C8310Fbc c8310Fbc = (C8310Fbc) interfaceC8353FcR;
            if (i == 0) {
                return new View(((C8254Faa) c8310Fbc.A00.A06).A09.getContext());
            }
        }
        return super.onCreatePanelView(i);
    }

    @Override // X.AbstractWindowCallbackC8263Fal, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.A03) {
            super.A00.onPanelClosed(i, menu);
            return;
        }
        super.onPanelClosed(i, menu);
        LayoutInflaterFactory2C8250FaT layoutInflaterFactory2C8250FaT = this.A04;
        if (i == 108) {
            LayoutInflaterFactory2C8250FaT.A0F(layoutInflaterFactory2C8250FaT);
            AbstractC8276Fb0 abstractC8276Fb0 = layoutInflaterFactory2C8250FaT.A0D;
            if (abstractC8276Fb0 != null) {
                abstractC8276Fb0.A05(false);
                return;
            }
            return;
        }
        if (i == 0) {
            C8278Fb2 c8278Fb2A0P = layoutInflaterFactory2C8250FaT.A0P(i);
            if (c8278Fb2A0P.A0C) {
                layoutInflaterFactory2C8250FaT.A0U(c8278Fb2A0P, false);
            }
        }
    }

    @Override // X.AbstractWindowCallbackC8263Fal, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        C8249FaR c8249FaR = menu instanceof C8249FaR ? (C8249FaR) menu : null;
        if (i == 0 && c8249FaR == null) {
            return false;
        }
        if (c8249FaR != null) {
            c8249FaR.A0C = true;
        }
        InterfaceC8353FcR interfaceC8353FcR = this.A00;
        if (interfaceC8353FcR != null) {
            C8310Fbc c8310Fbc = (C8310Fbc) interfaceC8353FcR;
            if (i == 0) {
                C8256Fac c8256Fac = c8310Fbc.A00;
                if (!c8256Fac.A02) {
                    ((C8254Faa) c8256Fac.A06).A0D = true;
                    c8256Fac.A02 = true;
                }
            }
        }
        boolean zOnPreparePanel = super.onPreparePanel(i, view, menu);
        if (c8249FaR != null) {
            c8249FaR.A0C = false;
        }
        return zOnPreparePanel;
    }

    @Override // X.AbstractWindowCallbackC8263Fal, android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
        C8249FaR c8249FaR = this.A04.A0P(0).A0A;
        if (c8249FaR != null) {
            super.onProvideKeyboardShortcuts(list, c8249FaR, i);
        } else {
            super.onProvideKeyboardShortcuts(list, menu, i);
        }
    }

    @Override // X.AbstractWindowCallbackC8263Fal, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        LayoutInflaterFactory2C8250FaT layoutInflaterFactory2C8250FaT = this.A04;
        if (!layoutInflaterFactory2C8250FaT.A0W || i != 0) {
            return super.onWindowStartingActionMode(callback, i);
        }
        C8265Fan c8265Fan = new C8265Fan(layoutInflaterFactory2C8250FaT.A0k, callback);
        AbstractC8280Fb4 abstractC8280Fb4A0I = layoutInflaterFactory2C8250FaT.A0I(c8265Fan);
        if (abstractC8280Fb4A0I != null) {
            return c8265Fan.A00(abstractC8280Fb4A0I);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    @Override // X.AbstractWindowCallbackC8263Fal, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r7) {
        /*
            r6 = this;
            boolean r0 = super.dispatchKeyShortcutEvent(r7)
            if (r0 != 0) goto L3c
            X.FaT r5 = r6.A04
            int r6 = r7.getKeyCode()
            X.LayoutInflaterFactory2C8250FaT.A0F(r5)
            X.Fb0 r1 = r5.A0D
            r4 = 1
            if (r1 == 0) goto L5f
            boolean r0 = r1 instanceof X.C8251FaW
            if (r0 == 0) goto L3e
            X.FaW r1 = (X.C8251FaW) r1
            X.Fae r0 = r1.A04
            r3 = 0
            if (r0 == 0) goto L5f
            X.FaR r2 = r0.A03
            if (r2 == 0) goto L5f
            int r0 = r7.getDeviceId()
            android.view.KeyCharacterMap r0 = android.view.KeyCharacterMap.load(r0)
            int r1 = r0.getKeyboardType()
            r0 = 1
            if (r1 != r4) goto L33
            r0 = 0
        L33:
            r2.setQwertyMode(r0)
            boolean r0 = r2.performShortcut(r6, r7, r3)
        L3a:
            if (r0 == 0) goto L5f
        L3c:
            r0 = 1
            return r0
        L3e:
            X.Fac r1 = (X.C8256Fac) r1
            android.view.Menu r3 = X.C8256Fac.A00(r1)
            r2 = 0
            if (r3 == 0) goto L5f
            int r0 = r7.getDeviceId()
            android.view.KeyCharacterMap r0 = android.view.KeyCharacterMap.load(r0)
            int r1 = r0.getKeyboardType()
            r0 = 1
            if (r1 != r4) goto L57
            r0 = 0
        L57:
            r3.setQwertyMode(r0)
            boolean r0 = r3.performShortcut(r6, r7, r2)
            goto L3a
        L5f:
            X.Fb2 r2 = r5.A0H
            if (r2 == 0) goto L88
            int r1 = r7.getKeyCode()
            boolean r0 = r7.isSystem()
            if (r0 != 0) goto L88
            boolean r0 = r2.A0D
            if (r0 != 0) goto L77
            boolean r0 = X.LayoutInflaterFactory2C8250FaT.A0H(r7, r2, r5)
            if (r0 == 0) goto L88
        L77:
            X.FaR r0 = r2.A0A
            if (r0 == 0) goto L88
            boolean r0 = r0.performShortcut(r1, r7, r4)
            if (r0 == 0) goto L88
            X.Fb2 r0 = r5.A0H
            if (r0 == 0) goto L3c
            r0.A0B = r4
            goto L3c
        L88:
            X.Fb2 r0 = r5.A0H
            r6 = 0
            if (r0 != 0) goto Lb6
            X.Fb2 r3 = r5.A0P(r6)
            X.LayoutInflaterFactory2C8250FaT.A0H(r7, r3, r5)
            int r2 = r7.getKeyCode()
            boolean r0 = r7.isSystem()
            r1 = 0
            if (r0 != 0) goto Lb1
            boolean r0 = r3.A0D
            if (r0 != 0) goto La9
            boolean r0 = X.LayoutInflaterFactory2C8250FaT.A0H(r7, r3, r5)
            if (r0 == 0) goto Lb1
        La9:
            X.FaR r0 = r3.A0A
            if (r0 == 0) goto Lb1
            boolean r1 = r0.performShortcut(r2, r7, r4)
        Lb1:
            r3.A0D = r6
            if (r1 == 0) goto Lb6
            goto L3c
        Lb6:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8259Faf.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
    }

    @Override // X.AbstractWindowCallbackC8263Fal, android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        super.onMenuOpened(i, menu);
        LayoutInflaterFactory2C8250FaT layoutInflaterFactory2C8250FaT = this.A04;
        if (i != 108) {
            return true;
        }
        LayoutInflaterFactory2C8250FaT.A0F(layoutInflaterFactory2C8250FaT);
        AbstractC8276Fb0 abstractC8276Fb0 = layoutInflaterFactory2C8250FaT.A0D;
        if (abstractC8276Fb0 == null) {
            return true;
        }
        abstractC8276Fb0.A05(true);
        return true;
    }
}
