package com.facebook.aura.partners.voice.screen;

import X.BeM;
import X.C3cH;
import X.C5303Dfm;
import X.Dg3;
import X.EnumC10573Huf;
import X.HqA;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.partners.voice.api.HatchSystemPipRuntime;
import com.facebook.aura.partners.voice.api.VoiceCallManager;
import com.facebook.aura.partners.voice.api.VoiceSystemPipEvent;
import com.facebook.aura.partners.voice.background.VoiceCallForegroundService;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class SystemPipModeObserver {
    public final ComponentActivity activity;
    public final SystemPipExpansionLayout expansionLayout;
    public final MutableState isInPictureInPictureMode$delegate;
    public boolean isInSystemPip;
    public final Dg3 lifecycleObserver;
    public final BeM<HqA> listener;
    public final Function0<Unit> onAvatarRestored;
    public boolean pendingExitResolution;
    public final VoiceCallStateHolder stateHolder;

    /* JADX INFO: Access modifiers changed from: private */
    public final void endCallIfUnreachable() {
        VoiceCallForegroundService.Companion.endCallIfNotificationHidden(this.activity, this.stateHolder);
    }

    private final boolean isResumedOutsideSystemPip() {
        return !this.activity.isFinishing() && ((C5303Dfm) this.activity.getLifecycle()).A01 == EnumC10573Huf.A05;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resolveExpandedPipIfResumed() {
        if (C3cH.A1P(this.stateHolder) && isResumedOutsideSystemPip()) {
            this.pendingExitResolution = false;
            restoreAvatarIfResumed();
            VoiceCallManager currentManager = HatchSystemPipRuntime.INSTANCE.getCurrentManager();
            if (currentManager != null) {
                currentManager.logSystemPipEvent(VoiceSystemPipEvent.EXITED);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setInPictureInPictureMode(boolean z) {
        MutableState.A09(z, this.isInPictureInPictureMode$delegate);
    }

    public final void dispose() {
        this.expansionLayout.cancel();
        this.activity.removeOnPictureInPictureModeChangedListener(this.listener);
        this.activity.getLifecycle().A05(this.lifecycleObserver);
    }

    public final boolean isInPictureInPictureMode() {
        return MutableState.A0A(this.isInPictureInPictureMode$delegate);
    }

    public final void reconcileForeground() {
        setInPictureInPictureMode(VoiceEmbodimentSystemPipKt.isInPipWindow(this.activity));
        if (isResumedOutsideSystemPip()) {
            HatchSystemPipRuntime hatchSystemPipRuntime = HatchSystemPipRuntime.INSTANCE;
            hatchSystemPipRuntime.markAppForegrounded();
            restoreAvatarIfResumed();
            if (hatchSystemPipRuntime.hasCallEndDismissRequest()) {
                this.isInSystemPip = false;
                this.pendingExitResolution = false;
                this.expansionLayout.cancel();
            } else if (this.pendingExitResolution) {
                resolveExpandedPipIfResumed();
                return;
            } else if (this.isInSystemPip || this.expansionLayout.pending) {
                return;
            }
            VoiceEmbodimentSystemPipKt.cancelFailedPipTransition();
        }
    }

    public final void register() {
        this.activity.getLifecycle().A04(this.lifecycleObserver);
        this.activity.addOnPictureInPictureModeChangedListener(this.listener);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SystemPipModeObserver(androidx.activity.ComponentActivity r3, com.facebook.aura.partners.voice.intf.VoiceCallStateHolder r4, kotlin.jvm.functions.Function0<kotlin.Unit> r5) {
        /*
            r2 = this;
            X.AnonymousClass005.A0x(r3, r4, r5)
            r2.<init>()
            r2.activity = r3
            r2.stateHolder = r4
            r2.onAvatarRestored = r5
            boolean r0 = com.facebook.aura.partners.voice.screen.VoiceEmbodimentSystemPipKt.isInPipWindow(r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = X.AnonymousClass002.A0P(r0)
            r2.isInPictureInPictureMode$delegate = r0
            boolean r0 = androidx.compose.runtime.MutableState.A0A(r0)
            if (r0 == 0) goto L27
            boolean r1 = X.C3cH.A1P(r4)
            r0 = 1
            if (r1 != 0) goto L28
        L27:
            r0 = 0
        L28:
            r2.isInSystemPip = r0
            com.facebook.aura.partners.voice.screen.SystemPipExpansionLayout r0 = new com.facebook.aura.partners.voice.screen.SystemPipExpansionLayout
            r0.<init>(r3)
            r2.expansionLayout = r0
            com.facebook.aura.partners.voice.screen.SystemPipModeObserver$lifecycleObserver$1 r0 = new com.facebook.aura.partners.voice.screen.SystemPipModeObserver$lifecycleObserver$1
            r0.<init>()
            r2.lifecycleObserver = r0
            com.facebook.aura.partners.voice.screen.SystemPipModeObserver$listener$1 r0 = new com.facebook.aura.partners.voice.screen.SystemPipModeObserver$listener$1
            r0.<init>()
            r2.listener = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.SystemPipModeObserver.<init>(androidx.activity.ComponentActivity, com.facebook.aura.partners.voice.intf.VoiceCallStateHolder, kotlin.jvm.functions.Function0):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void restoreAvatarIfResumed() {
        if (isResumedOutsideSystemPip() && this.stateHolder.restoreEmbodimentOnForeground()) {
            this.onAvatarRestored.invoke();
        }
    }
}
