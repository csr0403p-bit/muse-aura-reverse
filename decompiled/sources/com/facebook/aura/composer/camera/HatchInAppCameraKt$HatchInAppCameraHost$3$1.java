package com.facebook.aura.composer.camera;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import androidx.compose.runtime.MutableState;
import java.io.File;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class HatchInAppCameraKt$HatchInAppCameraHost$3$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ MutableState<G0U<File, Unit>> $receiver$delegate;
    public final /* synthetic */ MutableState<Boolean> $visible$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchInAppCameraKt$HatchInAppCameraHost$3$1(MutableState<G0U<File, Unit>> mutableState, MutableState<Boolean> mutableState2) {
        super(1);
        this.$receiver$delegate = mutableState;
        this.$visible$delegate = mutableState2;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        final MutableState<G0U<File, Unit>> mutableState = this.$receiver$delegate;
        final MutableState<Boolean> mutableState2 = this.$visible$delegate;
        return new C78g() { // from class: com.facebook.aura.composer.camera.HatchInAppCameraKt$HatchInAppCameraHost$3$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                mutableState.Af8(null);
                MutableState.A09(false, mutableState2);
            }
        };
    }
}
