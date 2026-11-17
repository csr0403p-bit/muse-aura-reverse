package X;

import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* loaded from: classes6.dex */
public abstract class FYM implements View.OnAttachStateChangeListener, View.OnTouchListener {
    public int A00;
    public Runnable A01;
    public Runnable A02;
    public boolean A03;
    public final float A04;
    public final int A05;
    public final int A06;
    public final View A07;
    public final int[] A08 = new int[2];

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.A03 = false;
        this.A00 = -1;
        Runnable runnable = this.A01;
        if (runnable != null) {
            this.A07.removeCallbacks(runnable);
        }
    }

    public static void A00(FYM fym) {
        Runnable runnable = fym.A02;
        if (runnable != null) {
            fym.A07.removeCallbacks(runnable);
        }
        Runnable runnable2 = fym.A01;
        if (runnable2 != null) {
            fym.A07.removeCallbacks(runnable2);
        }
    }

    private final FZD A01() {
        C8236FaC c8236FaC;
        if (this instanceof C8217FZk) {
            return ((C8217FZk) this).A00;
        }
        if (this instanceof C8244FaM) {
            c8236FaC = ((C8244FaM) this).A00.A00.A0D;
            if (c8236FaC == null) {
                return null;
            }
        } else {
            AbstractC8356FcU abstractC8356FcU = ((C8239FaF) this).A00.A00;
            if (abstractC8356FcU == null || (c8236FaC = ((C8313Fbf) abstractC8356FcU).A00.A09) == null) {
                return null;
            }
        }
        return c8236FaC.A00();
    }

    public final boolean A02() {
        FZD fzdA01;
        if (this instanceof C8217FZk) {
            FZY fzy = ((C8217FZk) this).A01;
            InterfaceC8216FZj interfaceC8216FZj = fzy.A02;
            if (!interfaceC8216FZj.AP1()) {
                interfaceC8216FZj.Afe(fzy.getTextDirection(), fzy.getTextAlignment());
            }
        } else if (this instanceof C8244FaM) {
            ((C8244FaM) this).A00.A00.A04();
        } else {
            C8239FaF c8239FaF = (C8239FaF) this;
            ActionMenuItemView actionMenuItemView = c8239FaF.A00;
            InterfaceC8336Fc3 interfaceC8336Fc3 = actionMenuItemView.A01;
            if (interfaceC8336Fc3 == null || !interfaceC8336Fc3.AO1(actionMenuItemView.A02) || (fzdA01 = c8239FaF.A01()) == null || !fzdA01.AP1()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0104  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r15, android.view.MotionEvent r16) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FYM.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    public FYM(View view) {
        this.A07 = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.A04 = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.A06 = tapTimeout;
        this.A05 = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }
}
