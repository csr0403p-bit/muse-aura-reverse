package com.facebook.aura.partners.voice.screen;

import X.ADq;
import X.AbstractC0885AGm;
import X.AbstractC1709Aos;
import X.AnonymousClass007;
import X.BLU;
import X.BNt;
import X.C06H;
import X.C0881AGi;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.CFK;
import android.app.Activity;
import android.app.AppOpsManager;
import android.app.PictureInPictureParams;
import android.app.RemoteAction;
import android.graphics.Rect;
import android.os.Process;
import android.view.View;
import com.facebook.aura.lifecycle.AuraPictureInPicture;
import com.facebook.aura.partners.voice.api.VoiceSystemPipEvent;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchSystemPipController {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();

    @Deprecated
    public static final String TAG = "HatchSystemPip";
    public final Activity activity;
    public AppliedParams applied;
    public final Function0<Unit> callEndDismissHandler;
    public final Function0<Boolean> hideAvatarHandler;
    public boolean paramsStateUnknown;

    public final class AppliedParams {
        public final List<RemoteAction> actions;
        public final boolean autoEnter;
        public final Rect sourceRect;

        public AppliedParams(boolean z, Rect rect, List<RemoteAction> list) {
            C7384Etj.A0Y(list, 2);
            this.autoEnter = z;
            this.sourceRect = rect;
            this.actions = list;
        }

        public final List<RemoteAction> getActions() {
            return this.actions;
        }

        public final boolean getAutoEnter() {
            return this.autoEnter;
        }

        public final Rect getSourceRect() {
            return this.sourceRect;
        }
    }

    public HatchSystemPipController(Activity activity) {
        C7384Etj.A0Y(activity, 0);
        this.activity = activity;
        this.hideAvatarHandler = new HatchSystemPipController$hideAvatarHandler$1(this);
        this.callEndDismissHandler = new HatchSystemPipController$callEndDismissHandler$1(this);
    }

    private final void applyPipParams(boolean z, Rect rect, List<RemoteAction> list, boolean z2) {
        try {
            PictureInPictureParams pictureInPictureParamsBuildHatchSystemPipParams = HatchSystemPipControllerKt.buildHatchSystemPipParams(z, rect, list);
            if (z) {
                AuraPictureInPicture.INSTANCE.arm(this, this.activity, pictureInPictureParamsBuildHatchSystemPipParams, true);
            } else {
                AuraPictureInPicture.INSTANCE.disarm(this, this.activity, pictureInPictureParamsBuildHatchSystemPipParams);
            }
            AppliedParams appliedParams = null;
            if (z2) {
                appliedParams = new AppliedParams(z, rect != null ? new Rect(rect) : null, list);
            }
            this.applied = appliedParams;
            this.paramsStateUnknown = false;
        } catch (RuntimeException e) {
            this.paramsStateUnknown = true;
            CFK.A0A(TAG, "Failed to apply PiP params", e);
        }
    }

    private final boolean haveSameActions(List<RemoteAction> list, List<RemoteAction> list2) {
        if (list != list2) {
            if (list.size() != list2.size()) {
                return false;
            }
            ADq aDqA12 = AbstractC0885AGm.A12(list);
            if (!(aDqA12 instanceof Collection) || !C3cG.A1N(aDqA12)) {
                Iterator<Integer> it = aDqA12.iterator();
                while (it.hasNext()) {
                    int iA00 = ((BNt) it).A00();
                    RemoteAction remoteAction = list.get(iA00);
                    RemoteAction remoteAction2 = list2.get(iA00);
                    if (!C7384Etj.areEqual(remoteAction.getTitle().toString(), remoteAction2.getTitle().toString()) || !C7384Etj.areEqual(remoteAction.getContentDescription().toString(), remoteAction2.getContentDescription().toString()) || !C7384Etj.areEqual(remoteAction.getActionIntent(), remoteAction2.getActionIntent())) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void update(boolean r4, android.graphics.Rect r5, java.util.List<android.app.RemoteAction> r6) {
        /*
            r3 = this;
            r0 = 2
            X.C7384Etj.A0Y(r6, r0)
            android.app.Activity r0 = r3.activity
            boolean r1 = r0.isInPictureInPictureMode()
            if (r4 != 0) goto L16
            if (r1 == 0) goto L12
            com.facebook.aura.partners.voice.screen.HatchSystemPipController$AppliedParams r0 = r3.applied
            if (r0 != 0) goto L16
        L12:
            r3.disable()
        L15:
            return
        L16:
            r2 = 0
            if (r1 == 0) goto L3c
            com.facebook.aura.partners.voice.screen.HatchSystemPipController$AppliedParams r0 = r3.applied
            if (r0 == 0) goto L1f
            android.graphics.Rect r2 = r0.sourceRect
        L1f:
            com.facebook.aura.partners.voice.screen.HatchSystemPipController$AppliedParams r1 = r3.applied
            if (r1 == 0) goto L63
            boolean r0 = r3.paramsStateUnknown
            if (r0 != 0) goto L63
            boolean r0 = r1.autoEnter
            if (r0 != r4) goto L63
            android.graphics.Rect r0 = r1.sourceRect
            boolean r0 = X.C7384Etj.areEqual(r0, r2)
            if (r0 == 0) goto L63
            java.util.List<android.app.RemoteAction> r0 = r1.actions
            boolean r0 = r3.haveSameActions(r0, r6)
            if (r0 == 0) goto L63
            return
        L3c:
            if (r5 != 0) goto L49
            android.graphics.Rect r2 = r3.iconEntrySourceRect()
            boolean r0 = r3.isInsideWindow(r2)
            if (r0 == 0) goto L5a
            goto L1f
        L49:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L5a
            boolean r0 = r3.isInsideWindow(r5)
            if (r0 == 0) goto L5a
            android.graphics.Rect r2 = r3.withMinimumSourceSize(r5)
            goto L1f
        L5a:
            com.facebook.aura.partners.voice.screen.HatchSystemPipController$AppliedParams r0 = r3.applied
            if (r0 == 0) goto L15
            android.graphics.Rect r2 = r0.sourceRect
            if (r2 != 0) goto L1f
            return
        L63:
            r0 = 1
            r3.applyPipParams(r4, r2, r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.HatchSystemPipController.update(boolean, android.graphics.Rect, java.util.List):void");
    }

    private final Rect iconEntrySourceRect() {
        View decorView = this.activity.getWindow().getDecorView();
        C7384Etj.A0U(decorView);
        int i = (int) (48.0f * this.activity.getResources().getDisplayMetrics().density);
        int width = decorView.getWidth() / 2;
        int height = decorView.getHeight() / 2;
        return new Rect(width - i, height - i, width + i, height + i);
    }

    private final boolean isInsideWindow(Rect rect) {
        View decorView = this.activity.getWindow().getDecorView();
        C7384Etj.A0U(decorView);
        return new Rect(0, 0, decorView.getWidth(), decorView.getHeight()).contains(rect);
    }

    private final void setAutoEnter(boolean z) {
        AppliedParams appliedParams = this.applied;
        if (appliedParams == null) {
            disable();
        } else if (appliedParams.autoEnter != z || this.paramsStateUnknown) {
            applyPipParams(z, appliedParams.sourceRect, appliedParams.actions, true);
        }
    }

    private final Rect withMinimumSourceSize(Rect rect) {
        View decorView = this.activity.getWindow().getDecorView();
        C7384Etj.A0U(decorView);
        return AbstractC1709Aos.A00(HatchSystemPipGeometryKt.m1736pipSourceSquareJVtK1S4(new BLU(rect.left, rect.top, rect.right, rect.bottom), AnonymousClass007.A0C(decorView.getWidth(), decorView.getHeight()), this.activity.getResources().getDisplayMetrics().density));
    }

    public final VoiceSystemPipEvent autoEnterPauseEvent() {
        if (this.paramsStateUnknown) {
            return VoiceSystemPipEvent.PAUSED_PARAMS_FAILED;
        }
        AppliedParams appliedParams = this.applied;
        if (appliedParams == null || !appliedParams.autoEnter) {
            return VoiceSystemPipEvent.PAUSED_NOT_ARMED;
        }
        try {
            AppOpsManager appOpsManager = (AppOpsManager) this.activity.getSystemService(AppOpsManager.class);
            if (appOpsManager != null) {
                int iUnsafeCheckOpNoThrow = appOpsManager.unsafeCheckOpNoThrow("android:picture_in_picture", Process.myUid(), this.activity.getPackageName());
                if (iUnsafeCheckOpNoThrow == 0 || iUnsafeCheckOpNoThrow == 3) {
                    return VoiceSystemPipEvent.PAUSED_READY;
                }
                if (iUnsafeCheckOpNoThrow == 1 || iUnsafeCheckOpNoThrow == 2) {
                    return VoiceSystemPipEvent.PAUSED_PERMISSION_DENIED;
                }
            }
        } catch (RuntimeException unused) {
        }
        return VoiceSystemPipEvent.PAUSED_PERMISSION_UNKNOWN;
    }

    public final void disable() {
        if (this.applied != null || this.paramsStateUnknown) {
            applyPipParams(false, null, C0881AGi.A00, false);
        }
    }

    public final Function0<Unit> getCallEndDismissHandler$fbandroid_express_aura_java_com_facebook_aura_partners_voice_screen_screen() {
        return this.callEndDismissHandler;
    }

    public final Function0<Boolean> getHideAvatarHandler$fbandroid_express_aura_java_com_facebook_aura_partners_voice_screen_screen() {
        return this.hideAvatarHandler;
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean moveTaskToBack() {
        boolean zMoveTaskToBack = false;
        if (C3cH.A1K()) {
            AppliedParams appliedParams = this.applied;
            Boolean boolValueOf = appliedParams != null ? Boolean.valueOf(appliedParams.autoEnter) : null;
            try {
                try {
                    setAutoEnter(false);
                    zMoveTaskToBack = this.activity.moveTaskToBack(true);
                } catch (RuntimeException e) {
                    CFK.A0A(TAG, "Failed to hide system PiP", e);
                }
                if (!zMoveTaskToBack) {
                    if (boolValueOf != null) {
                        setAutoEnter(boolValueOf.booleanValue());
                        return zMoveTaskToBack;
                    }
                }
            } catch (Throwable th) {
                if (boolValueOf != null) {
                    setAutoEnter(boolValueOf.booleanValue());
                }
                throw th;
            }
        } else {
            CFK.A06(TAG, "Cannot hide system PiP off the main thread");
        }
        return zMoveTaskToBack;
    }
}
