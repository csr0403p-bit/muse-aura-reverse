package com.facebook.aura.composer.camera;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.composer.camera.HatchCameraCaptureState$takeResult$4$1", f = "HatchCameraCaptureState.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchCameraCaptureState$takeResult$4$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ File $photo;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchCameraCaptureState$takeResult$4$1(File file, HtJ<? super HatchCameraCaptureState$takeResult$4$1> htJ) {
        super(2, htJ);
        this.$photo = file;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchCameraCaptureState$takeResult$4$1(this.$photo, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        HatchCameraFiles.INSTANCE.delete$fbandroid_express_aura_java_com_facebook_aura_composer_camera_camera(this.$photo);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return new HatchCameraCaptureState$takeResult$4$1(this.$photo, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
