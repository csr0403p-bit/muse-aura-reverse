package com.facebook.aura.ageverification;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C7VR;
import X.G0U;
import android.app.Activity;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class CameraPermissionGateKt$CameraPermissionRequest$request$1$1 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
    public final /* synthetic */ Activity $activity;
    public final /* synthetic */ MutableState<Boolean> $deniedPermanently$delegate;
    public final /* synthetic */ Function0<Unit> $onGranted;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraPermissionGateKt$CameraPermissionRequest$request$1$1(Function0<Unit> function0, Activity activity, MutableState<Boolean> mutableState) {
        super(1);
        this.$onGranted = function0;
        this.$activity = activity;
        this.$deniedPermanently$delegate = mutableState;
    }

    public final void invoke(boolean z) {
        if (z) {
            this.$onGranted.invoke();
            return;
        }
        Activity activity = this.$activity;
        if (activity == null || C7VR.A01(activity, "android.permission.CAMERA")) {
            return;
        }
        MutableState.A09(true, this.$deniedPermanently$delegate);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }
}
