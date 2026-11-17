package com.facebook.aura.composer.camera;

import X.AOW;
import X.ASj;
import X.AT5;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C1BO;
import X.C2HU;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.composer.camera.HatchCameraDialogKt$HatchCameraDialog$1$1", f = "HatchCameraDialog.kt", l = {40}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchCameraDialogKt$HatchCameraDialog$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ HatchCameraSession $camera;
    public final /* synthetic */ MutableState<Boolean> $closing$delegate;
    public final /* synthetic */ C1BO<G0U<File, Unit>> $currentOnFinished$delegate;
    public final /* synthetic */ AT5<Float, AOW> $progress;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchCameraDialogKt$HatchCameraDialog$1$1(AT5<Float, AOW> at5, MutableState<Boolean> mutableState, HatchCameraSession hatchCameraSession, C1BO<? extends G0U<? super File, Unit>> c1bo, HtJ<? super HatchCameraDialogKt$HatchCameraDialog$1$1> htJ) {
        super(2, htJ);
        this.$progress = at5;
        this.$closing$delegate = mutableState;
        this.$camera = hatchCameraSession;
        this.$currentOnFinished$delegate = c1bo;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchCameraDialogKt$HatchCameraDialog$1$1(this.$progress, this.$closing$delegate, this.$camera, this.$currentOnFinished$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            AT5<Float, AOW> at5 = this.$progress;
            Float f = new Float(this.$closing$delegate.getValue() == null ? 1.0f : 0.0f);
            ASj aSjA0J = AnonymousClass002.A0J(C2HU.A01, this.$closing$delegate.getValue() == null ? 300 : 220);
            this.label = 1;
            if (AnonymousClass002.A0i(at5, aSjA0J, f, this, null) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        Boolean value = this.$closing$delegate.getValue();
        if (value != null) {
            HatchCameraSession hatchCameraSession = this.$camera;
            C1BO.A0B(this.$currentOnFinished$delegate).invoke(value.booleanValue() ? hatchCameraSession.takeResult() : null);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchCameraDialogKt$HatchCameraDialog$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
