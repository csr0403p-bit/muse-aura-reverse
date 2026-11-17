package com.facebook.aura.composer.camera;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchCameraLauncherKt$rememberHatchCameraLauncher$permission$1$1 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
    public final /* synthetic */ HatchCameraCaptureState $capture;
    public final /* synthetic */ Function0<Unit> $launchCamera;
    public final /* synthetic */ Function0<Unit> $onPermissionDenied;
    public final /* synthetic */ AbstractC3358CGz $session;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchCameraLauncherKt$rememberHatchCameraLauncher$permission$1$1(HatchCameraCaptureState hatchCameraCaptureState, AbstractC3358CGz abstractC3358CGz, Function0<Unit> function0, Function0<Unit> function02) {
        super(1);
        this.$capture = hatchCameraCaptureState;
        this.$session = abstractC3358CGz;
        this.$launchCamera = function0;
        this.$onPermissionDenied = function02;
    }

    public final void invoke(boolean z) {
        Function0<Unit> function0;
        if (!this.$capture.isCurrent(this.$session)) {
            this.$capture.reset();
            return;
        }
        if (z) {
            function0 = this.$launchCamera;
        } else {
            this.$capture.reset();
            function0 = this.$onPermissionDenied;
        }
        function0.invoke();
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }
}
