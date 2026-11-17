package com.facebook.aura.ageverification;

import X.AbstractC7559F3s;
import X.C7OU;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.utils.HatchPermissionUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class CameraPermissionGateKt$CameraPermissionRequest$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ MutableState<Boolean> $deniedPermanently$delegate;
    public final /* synthetic */ C7OU<String, Boolean> $request;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraPermissionGateKt$CameraPermissionRequest$1$1$1(Context context, C7OU<String, Boolean> c7ou, MutableState<Boolean> mutableState) {
        super(0);
        this.$context = context;
        this.$request = c7ou;
        this.$deniedPermanently$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (MutableState.A0A((MutableState) this.$deniedPermanently$delegate)) {
            HatchPermissionUtils.INSTANCE.openAppSettings(this.$context);
        } else {
            A02("android.permission.CAMERA");
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
