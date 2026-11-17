package com.facebook.aura.composer.camera;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.BoY;
import X.C1BO;
import X.C1HY;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.composer.camera.HatchCameraPreviewKt$HatchCameraPreview$2$1", f = "HatchCameraPreview.kt", l = {HatchMessageShareDocumentRenderer.TABLE_MIN_ROW_HEIGHT_PX}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class HatchCameraPreviewKt$HatchCameraPreview$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ HatchCameraSession $camera;
    public final /* synthetic */ C1BO<G0U<Boolean, Unit>> $currentOnReady$delegate;
    public final /* synthetic */ C1HY $owner;
    public final /* synthetic */ BoY $view;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchCameraPreviewKt$HatchCameraPreview$2$1(HatchCameraSession hatchCameraSession, BoY boY, C1HY c1hy, C1BO<? extends G0U<? super Boolean, Unit>> c1bo, HtJ<? super HatchCameraPreviewKt$HatchCameraPreview$2$1> htJ) {
        super(2, htJ);
        this.$camera = hatchCameraSession;
        this.$view = boY;
        this.$owner = c1hy;
        this.$currentOnReady$delegate = c1bo;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchCameraPreviewKt$HatchCameraPreview$2$1(this.$camera, this.$view, this.$owner, this.$currentOnReady$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            AnonymousClass001.A1K(false, C1BO.A0B(this.$currentOnReady$delegate));
            HatchCameraSession hatchCameraSession = this.$camera;
            BoY boY = this.$view;
            C1HY c1hy = this.$owner;
            this.label = 1;
            if (hatchCameraSession.bind(boY, c1hy, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchCameraPreviewKt$HatchCameraPreview$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
