package com.facebook.aura.composer.camera;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.C7384Etj;
import X.CFK;
import X.G0U;
import com.facebook.aura.auth.AuraSessionManager;
import com.facebook.aura.toast.api.ToastApi;
import java.util.concurrent.CancellationException;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class HatchCameraLauncherKt$rememberHatchCameraLauncher$onFailure$1$1 extends AbstractC7559F3s implements G0U<Exception, Unit> {
    public final /* synthetic */ HatchCameraCaptureState $capture;
    public final /* synthetic */ String $failureMessage;
    public final /* synthetic */ AbstractC3358CGz $session;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Exception exc) throws Exception {
        C7384Etj.A0Y(exc, 0);
        if (exc instanceof CancellationException) {
            throw exc;
        }
        this.$capture.reset();
        CFK.A08("HatchCameraLauncher", "Could not capture photo", exc);
        if (AuraSessionManager.INSTANCE.isCurrentSession(this.$session)) {
            ToastApi.INSTANCE.showToast(this.$failureMessage);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchCameraLauncherKt$rememberHatchCameraLauncher$onFailure$1$1(HatchCameraCaptureState hatchCameraCaptureState, AbstractC3358CGz abstractC3358CGz, String str) {
        super(1);
        this.$capture = hatchCameraCaptureState;
        this.$session = abstractC3358CGz;
        this.$failureMessage = str;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Exception exc) throws Exception {
        invoke2(exc);
        return Unit.INSTANCE;
    }
}
