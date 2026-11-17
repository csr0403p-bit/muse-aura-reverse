package com.facebook.aura.localbrowser;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C7384Etj;
import X.G0U;
import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.facebook.aura.localbrowser.LocalBrowserTarget;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class LocalBrowserViewportContainer extends FrameLayout {
    public G0U<? super LocalBrowserTarget.HostLease, Boolean> acceptsUserInput;
    public LocalBrowserTarget.HostLease lease;
    public G0U<? super LocalBrowserTarget.HostLease, Unit> onHostChanged;
    public Function0<Unit> onUserInteraction;
    public LocalBrowserTarget.HostSlot slot;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalBrowserViewportContainer(Context context) {
        super(context);
        C7384Etj.A0Y(context, 0);
        this.onHostChanged = new G0U() { // from class: com.facebook.aura.localbrowser.LocalBrowserViewportContainer$$ExternalSyntheticLambda0
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return Unit.INSTANCE;
            }
        };
        this.acceptsUserInput = new G0U() { // from class: com.facebook.aura.localbrowser.LocalBrowserViewportContainer$$ExternalSyntheticLambda1
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return AnonymousClass001.A0h();
            }
        };
        this.onUserInteraction = new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserViewportContainer$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        };
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        C7384Etj.A0Y(windowInsets, 0);
        LocalBrowserTarget.HostSlot hostSlot = this.slot;
        if ((hostSlot != null ? hostSlot.kind : null) != LocalBrowserHostKind.PRESENTATION) {
            return windowInsets;
        }
        WindowInsets windowInsetsDispatchApplyWindowInsets = super.dispatchApplyWindowInsets(windowInsets);
        C7384Etj.A0U(windowInsetsDispatchApplyWindowInsets);
        return windowInsetsDispatchApplyWindowInsets;
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        C7384Etj.A0Y(motionEvent, 0);
        if (!AnonymousClass003.A1X(this.lease, this.acceptsUserInput)) {
            return true;
        }
        this.onUserInteraction.invoke();
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C7384Etj.A0Y(keyEvent, 0);
        if (keyEvent.getKeyCode() == 4) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (!AnonymousClass003.A1X(this.lease, this.acceptsUserInput)) {
            return true;
        }
        this.onUserInteraction.invoke();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C7384Etj.A0Y(motionEvent, 0);
        if (!AnonymousClass003.A1X(this.lease, this.acceptsUserInput)) {
            return true;
        }
        this.onUserInteraction.invoke();
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setAcceptsUserInput(G0U<? super LocalBrowserTarget.HostLease, Boolean> g0u) {
        C7384Etj.A0Y(g0u, 0);
        this.acceptsUserInput = g0u;
    }

    public final void setOnHostChanged(G0U<? super LocalBrowserTarget.HostLease, Unit> g0u) {
        C7384Etj.A0Y(g0u, 0);
        this.onHostChanged = g0u;
    }

    public final void setOnUserInteraction(Function0<Unit> function0) {
        C7384Etj.A0Y(function0, 0);
        this.onUserInteraction = function0;
    }

    public static final boolean acceptsUserInput$lambda$0(LocalBrowserTarget.HostLease hostLease) {
        return false;
    }

    public final G0U<LocalBrowserTarget.HostLease, Boolean> getAcceptsUserInput() {
        return this.acceptsUserInput;
    }

    public final LocalBrowserTarget.HostLease getLease() {
        return this.lease;
    }

    public final G0U<LocalBrowserTarget.HostLease, Unit> getOnHostChanged() {
        return this.onHostChanged;
    }

    public final Function0<Unit> getOnUserInteraction() {
        return this.onUserInteraction;
    }

    public final LocalBrowserTarget.HostSlot getSlot() {
        return this.slot;
    }

    public final void setLease(LocalBrowserTarget.HostLease hostLease) {
        this.lease = hostLease;
    }

    public final void setSlot(LocalBrowserTarget.HostSlot hostSlot) {
        this.slot = hostSlot;
    }
}
