package com.facebook.aura.composer.camera;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass000;
import X.C7OU;
import X.G0U;
import android.content.Context;
import com.facebook.aura.utils.HatchPermissionUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchCameraLauncherKt$rememberHatchCameraLauncher$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchCameraCaptureState $capture;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ Function0<Unit> $launchCamera;
    public final /* synthetic */ G0U<Exception, Unit> $onFailure;
    public final /* synthetic */ C7OU<String, Boolean> $permission;
    public final /* synthetic */ AbstractC3358CGz $session;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchCameraLauncherKt$rememberHatchCameraLauncher$3$1(HatchCameraCaptureState hatchCameraCaptureState, AbstractC3358CGz abstractC3358CGz, Context context, Function0<Unit> function0, C7OU<String, Boolean> c7ou, G0U<? super Exception, Unit> g0u) {
        super(0);
        this.$capture = hatchCameraCaptureState;
        this.$session = abstractC3358CGz;
        this.$context = context;
        this.$launchCamera = function0;
        this.$permission = c7ou;
        this.$onFailure = g0u;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        String strA00 = AnonymousClass000.A00(27);
        if (this.$capture.begin(this.$session)) {
            try {
                if (HatchPermissionUtils.INSTANCE.hasPermission(this.$context, strA00)) {
                    this.$launchCamera.invoke();
                } else {
                    A02(strA00);
                }
            } catch (RuntimeException e) {
                this.$onFailure.invoke(e);
            }
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
