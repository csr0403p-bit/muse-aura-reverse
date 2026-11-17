package com.facebook.aura.composer.camera;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.auth.AuraSessionManager;
import com.facebook.aura.executors.AuraExecutors;
import java.io.File;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class HatchInAppCameraKt$HatchInAppCameraHost$2$1 extends AbstractC7559F3s implements G0U<File, Unit> {
    public final /* synthetic */ MutableState<G0U<File, Unit>> $receiver$delegate;
    public final /* synthetic */ AbstractC3358CGz $session;
    public final /* synthetic */ MutableState<Boolean> $visible$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchInAppCameraKt$HatchInAppCameraHost$2$1(AbstractC3358CGz abstractC3358CGz, MutableState<G0U<File, Unit>> mutableState, MutableState<Boolean> mutableState2) {
        super(1);
        this.$session = abstractC3358CGz;
        this.$receiver$delegate = mutableState;
        this.$visible$delegate = mutableState2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(final File file) {
        G0U<File, Unit> value = this.$receiver$delegate.getValue();
        this.$receiver$delegate.Af8(null);
        MutableState.A09(false, this.$visible$delegate);
        if (file != null) {
            if (value == null || !AuraSessionManager.INSTANCE.isCurrentSession(this.$session)) {
                AuraExecutors.INSTANCE.getIoExecutor().execute(new Runnable() { // from class: com.facebook.aura.composer.camera.HatchInAppCameraKt$HatchInAppCameraHost$2$1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        HatchCameraFiles.INSTANCE.delete$fbandroid_express_aura_java_com_facebook_aura_composer_camera_camera(file);
                    }
                });
            } else {
                value.invoke(file);
            }
        }
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(File file) {
        invoke2(file);
        return Unit.INSTANCE;
    }
}
