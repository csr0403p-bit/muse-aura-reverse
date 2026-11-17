package com.facebook.aura.ageverification;

import X.AbstractC7559F3s;
import X.C06787bB;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC06807bD;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.utils.HatchPermissionUtils;

/* loaded from: classes.dex */
public final class CameraPermissionGateKt$CameraPermissionGate$1$1 extends AbstractC7559F3s implements G0U<C06787bB, InterfaceC06807bD> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ MutableState<Boolean> $granted$delegate;

    @Override // X.G0U
    public final InterfaceC06807bD invoke(final C06787bB c06787bB) {
        C7384Etj.A0Y(c06787bB, 0);
        MutableState.A09(HatchPermissionUtils.INSTANCE.hasPermission(this.$context, "android.permission.CAMERA"), this.$granted$delegate);
        return new InterfaceC06807bD() { // from class: com.facebook.aura.ageverification.CameraPermissionGateKt$CameraPermissionGate$1$1$invoke$$inlined$onPauseOrDispose$1
            @Override // X.InterfaceC06807bD
            public void runPauseOrOnDisposeEffect() {
            }
        };
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraPermissionGateKt$CameraPermissionGate$1$1(Context context, MutableState<Boolean> mutableState) {
        super(1);
        this.$context = context;
        this.$granted$delegate = mutableState;
    }
}
