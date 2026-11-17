package com.facebook.aura.partners.voice.api;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.BLG;
import X.C1BN;
import X.C3cG;
import X.C7384Etj;
import X.C9286GCn;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchSystemPipRuntime {
    public static final int $stable = 0;
    public static final HatchSystemPipRuntime INSTANCE = new HatchSystemPipRuntime();
    public static final BLG<Boolean> _isPipStashed;
    public static final BLG<HatchSystemPipPresentationState> _presentationState;
    public static VoiceCallManager activeManager;
    public static Function0<Unit> callEndDismissHandler;
    public static boolean callEndDismissRequested;
    public static Function0<Boolean> hideAvatarHandler;
    public static boolean hideAvatarOnTaskRemoval;
    public static boolean hideAvatarRequested;
    public static boolean isPipActive;
    public static final C1BN<Boolean> isPipStashed;
    public static final C1BN<HatchSystemPipPresentationState> presentationState;

    private final synchronized void revertHideAvatarRequest() {
        if (hideAvatarRequested) {
            hideAvatarRequested = false;
            isPipActive = true;
        }
    }

    public final synchronized void cancelPipTransition() {
        resetPipSession();
    }

    public final synchronized boolean consumeCallEndDismissRequest() {
        boolean z;
        z = callEndDismissRequested;
        consumeSession(z);
        return z;
    }

    public final synchronized boolean consumeHideAvatarRequest() {
        boolean z;
        z = hideAvatarRequested;
        consumeSession(z);
        return z;
    }

    public final synchronized boolean consumePipDismissal() {
        boolean z;
        z = isPipActive;
        consumeSession(z);
        return z;
    }

    public final void dismissForCallEnd() {
        synchronized (this) {
            hideAvatarOnTaskRemoval = false;
            if (isPipActive || _presentationState.getValue() != HatchSystemPipPresentationState.IN_APP || callEndDismissRequested) {
                callEndDismissRequested = true;
                hideAvatarRequested = false;
                isPipActive = false;
                Function0<Unit> function0 = callEndDismissHandler;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        }
    }

    public final synchronized VoiceCallManager getCurrentManager() {
        return activeManager;
    }

    public final synchronized boolean getShouldHideAvatarOnTaskRemoval() {
        return hideAvatarOnTaskRemoval;
    }

    public final synchronized boolean hasCallEndDismissRequest() {
        return callEndDismissRequested;
    }

    public final synchronized void markAppForegrounded() {
        hideAvatarOnTaskRemoval = false;
    }

    public final synchronized void markPipActive() {
        if (!hideAvatarRequested) {
            isPipActive = true;
            hideAvatarOnTaskRemoval = true;
            AnonymousClass002.A1I(_presentationState, HatchSystemPipPresentationState.ACTIVE);
        }
    }

    public final synchronized void markPipEntering() {
        BLG<HatchSystemPipPresentationState> blg = _presentationState;
        if (blg.getValue() == HatchSystemPipPresentationState.IN_APP) {
            AnonymousClass002.A1I(blg, HatchSystemPipPresentationState.ENTERING);
            VoiceCallManager voiceCallManager = activeManager;
            if (voiceCallManager != null) {
                voiceCallManager.logSystemPipEvent(VoiceSystemPipEvent.TRANSITION_STARTED);
            }
        }
    }

    public final synchronized void markPipExiting() {
        BLG<HatchSystemPipPresentationState> blg = _presentationState;
        if (blg.getValue() == HatchSystemPipPresentationState.ACTIVE) {
            AnonymousClass002.A1I(blg, HatchSystemPipPresentationState.EXITING);
        }
    }

    public final synchronized void markPipExpanded() {
        resetPipSession();
    }

    public final void registerCallEndDismissHandler(Function0<Unit> function0) {
        boolean z;
        C7384Etj.A0Y(function0, 0);
        synchronized (this) {
            callEndDismissHandler = function0;
            z = callEndDismissRequested;
        }
        if (z) {
            function0.invoke();
        }
    }

    public final synchronized void registerHideAvatarHandler(Function0<Boolean> function0) {
        C7384Etj.A0Y(function0, 0);
        hideAvatarHandler = function0;
    }

    public final synchronized void registerManager(VoiceCallManager voiceCallManager) {
        C7384Etj.A0Y(voiceCallManager, 0);
        activeManager = voiceCallManager;
    }

    public final boolean requestHideAvatar() {
        Function0<Boolean> function0;
        synchronized (this) {
            if (!isPipActive || (function0 = hideAvatarHandler) == null) {
                return false;
            }
            hideAvatarRequested = true;
            isPipActive = false;
            try {
                boolean zA1X = AnonymousClass001.A1X(function0.invoke());
                if (!zA1X) {
                    INSTANCE.revertHideAvatarRequest();
                }
                return zA1X;
            } catch (RuntimeException e) {
                revertHideAvatarRequest();
                throw e;
            }
        }
    }

    public final synchronized void setPipUiState(boolean z, boolean z2) {
        AnonymousClass004.A1D(z2, _isPipStashed);
        if (z) {
            markPipEntering();
        }
    }

    public final synchronized boolean unregisterCallEndDismissHandler(Function0<Unit> function0, boolean z) {
        C7384Etj.A0Y(function0, 0);
        if (callEndDismissHandler != function0) {
            return false;
        }
        if (z && callEndDismissRequested) {
            resetPipSession();
        }
        callEndDismissHandler = null;
        return true;
    }

    public final synchronized void unregisterHideAvatarHandler(Function0<Boolean> function0) {
        C7384Etj.A0Y(function0, 0);
        if (hideAvatarHandler == function0) {
            hideAvatarHandler = null;
        }
    }

    public final synchronized void unregisterManager(VoiceCallManager voiceCallManager) {
        C7384Etj.A0Y(voiceCallManager, 0);
        if (activeManager == voiceCallManager) {
            activeManager = null;
        }
    }

    static {
        C9286GCn c9286GCnA14 = C3cG.A14(HatchSystemPipPresentationState.IN_APP);
        _presentationState = c9286GCnA14;
        presentationState = C3cG.A11(c9286GCnA14);
        C9286GCn c9286GCnA0v = AnonymousClass002.A0v(false);
        _isPipStashed = c9286GCnA0v;
        isPipStashed = C3cG.A11(c9286GCnA0v);
    }

    private final boolean consumeSession(boolean z) {
        if (z) {
            resetPipSession();
        }
        return z;
    }

    private final void resetPipSession() {
        C3cG.A0V(_presentationState, HatchSystemPipPresentationState.IN_APP);
        isPipActive = false;
        AnonymousClass003.A14(_isPipStashed, false);
        hideAvatarRequested = false;
        callEndDismissRequested = false;
    }

    public final C1BN<HatchSystemPipPresentationState> getPresentationState() {
        return presentationState;
    }

    public final C1BN<Boolean> isPipStashed() {
        return isPipStashed;
    }
}
