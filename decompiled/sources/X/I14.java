package X;

import android.animation.Animator;
import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class I14 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public final Object A00;

    public I14(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewTreeObserver viewTreeObserver;
        switch (this.$t) {
            case 0:
                ViewOnKeyListenerC8233Fa9 viewOnKeyListenerC8233Fa9 = (ViewOnKeyListenerC8233Fa9) this.A00;
                if (viewOnKeyListenerC8233Fa9.AP1()) {
                    List<C8319Fbl> list = viewOnKeyListenerC8233Fa9.A0M;
                    if (list.size() <= 0 || ((C8319Fbl) C8j4.A0p(list)).A02.A0D) {
                        return;
                    }
                    View view = viewOnKeyListenerC8233Fa9.A06;
                    if (view == null || !view.isShown()) {
                        viewOnKeyListenerC8233Fa9.dismiss();
                        return;
                    }
                    Iterator<C8319Fbl> it = list.iterator();
                    while (it.hasNext()) {
                        it.next().A02.Afd();
                    }
                    return;
                }
                return;
            case 1:
                ViewOnKeyListenerC8234FaA viewOnKeyListenerC8234FaA = (ViewOnKeyListenerC8234FaA) this.A00;
                if (viewOnKeyListenerC8234FaA.AP1()) {
                    C8293FbI c8293FbI = viewOnKeyListenerC8234FaA.A0G;
                    if (c8293FbI.A0D) {
                        return;
                    }
                    View view2 = viewOnKeyListenerC8234FaA.A03;
                    if (view2 == null || !view2.isShown()) {
                        viewOnKeyListenerC8234FaA.dismiss();
                        return;
                    } else {
                        c8293FbI.Afd();
                        return;
                    }
                }
                return;
            case 2:
                FZY fzy = (FZY) this.A00;
                InterfaceC8216FZj interfaceC8216FZj = fzy.A02;
                if (!interfaceC8216FZj.AP1()) {
                    interfaceC8216FZj.Afe(fzy.getTextDirection(), fzy.getTextAlignment());
                }
                viewTreeObserver = fzy.getViewTreeObserver();
                if (viewTreeObserver == null) {
                    return;
                }
                break;
            case 3:
                C8208FZa c8208FZa = (C8208FZa) this.A00;
                FZY fzy2 = c8208FZa.A04;
                if (!fzy2.isAttachedToWindow() || !fzy2.getGlobalVisibleRect(c8208FZa.A03)) {
                    c8208FZa.dismiss();
                    return;
                } else {
                    c8208FZa.A01();
                    c8208FZa.Afd();
                    return;
                }
            case 4:
                C8040FQr c8040FQr = (C8040FQr) this.A00;
                if (c8040FQr.A09) {
                    int i = c8040FQr.A02;
                    Animator.AnimatorListener animatorListener = c8040FQr.A0G;
                    c8040FQr.clearAnimation();
                    c8040FQr.setScaleX(1.5f);
                    c8040FQr.setScaleY(1.5f);
                    c8040FQr.animate().setDuration(i).setInterpolator(c8040FQr.A04).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setListener(animatorListener);
                } else {
                    boolean zEquals = c8040FQr.A07.equals(C79.A00);
                    int height = c8040FQr.getHeight();
                    if (zEquals) {
                        height = -height;
                    }
                    c8040FQr.setTranslationY(height);
                    c8040FQr.A04(c8040FQr.A0G, c8040FQr.A02);
                }
                C8040FQr.A00(c8040FQr);
                viewTreeObserver = c8040FQr.getViewTreeObserver();
                break;
            default:
                Handler handler = FW1.A0H;
                return;
        }
        viewTreeObserver.removeOnGlobalLayoutListener(this);
    }
}
