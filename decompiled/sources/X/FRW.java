package X;

import android.content.Context;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import com.facebook.aura.R;

/* loaded from: classes6.dex */
public final class FRW extends C8117FUh implements InterfaceC8057FRl {
    public final FRX A00;

    /* JADX WARN: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    @Override // X.C8117FUh, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r8) {
        /*
            r7 = this;
            r2 = 0
            if (r8 != 0) goto L4
            return r2
        L4:
            int r1 = r8.getAction()
            r0 = 1
            if (r1 != r0) goto La2
            int r1 = r8.getKeyCode()
            r0 = 285(0x11d, float:4.0E-43)
            if (r1 != r0) goto La2
            android.view.View r0 = r7.getFocusedChild()
            if (r0 == 0) goto L1d
            boolean r2 = r0.dispatchKeyEvent(r8)
        L1d:
            X.FRX r0 = r7.A00
            r7 = 0
            if (r2 != 0) goto L48
            X.FRd r5 = r0.A06
            int r1 = r8.getAction()
            r6 = 0
            r0 = 1
            if (r1 == 0) goto L4a
            if (r1 != r0) goto L49
            int r1 = r8.getKeyCode()
            java.lang.Integer r0 = r5.A01
            if (r0 == 0) goto L49
            int r0 = r0.intValue()
            if (r1 != r0) goto L49
            long r3 = r8.getDownTime()
            long r1 = r5.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L49
            r5.A01 = r6
        L48:
            r7 = 1
        L49:
            return r7
        L4a:
            int r0 = r8.getRepeatCount()
            int r1 = r8.getKeyCode()
            if (r0 <= 0) goto L69
            java.lang.Integer r0 = r5.A01
            if (r0 == 0) goto L49
            int r0 = r0.intValue()
            if (r1 != r0) goto L49
            long r3 = r8.getDownTime()
            long r1 = r5.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L49
            goto L48
        L69:
            r0 = 46
            if (r1 == r0) goto L7b
            r0 = 135(0x87, float:1.89E-43)
            if (r1 == r0) goto L76
            r0 = 285(0x11d, float:4.0E-43)
            if (r1 == r0) goto L83
            return r7
        L76:
            boolean r0 = r8.hasNoModifiers()
            goto L81
        L7b:
            r0 = 4096(0x1000, float:5.74E-42)
            boolean r0 = r8.hasModifiers(r0)
        L81:
            if (r0 == 0) goto L49
        L83:
            r5.A01 = r6
            kotlin.jvm.functions.Function0<java.lang.Boolean> r0 = r5.A02
            boolean r0 = X.AnonymousClass003.A1Y(r0)
            if (r0 == 0) goto L9d
            int r0 = r8.getKeyCode()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A01 = r0
            long r0 = r8.getDownTime()
            r5.A00 = r0
        L9d:
            java.lang.Integer r0 = r5.A01
            if (r0 == 0) goto L49
            goto L48
        La2:
            boolean r2 = super.dispatchKeyEvent(r8)
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FRW.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequenceA00;
        C7384Etj.A0Y(accessibilityNodeInfo, 0);
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        FRX frx = this.A00;
        if (frx.A04 == null || !AnonymousClass003.A1Y(frx.A07) || (charSequenceA00 = FRX.A00(frx)) == null) {
            return;
        }
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(R.id.keyboard_refresh_accessibility_action, charSequenceA00));
    }

    public final FRX getKeyboardRefresh$fbandroid_libraries_bloks_components_bk_components_pulltorefreshcontainer_bk_components_pulltorefreshcontainer() {
        return this.A00;
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        FRX frx = this.A00;
        return (i == R.id.keyboard_refresh_accessibility_action && frx.A04 != null && AnonymousClass003.A1Y(frx.A07) && FRX.A00(frx) != null && frx.A01()) || super.performAccessibilityAction(i, bundle);
    }

    public FRW(Context context) {
        super(context);
        this.A00 = new FRX(new FZP(this, 22));
        addOnAttachStateChangeListener(new I0S(0));
        if (isAttachedToWindow()) {
            HlL.A00.add(this);
        }
    }
}
