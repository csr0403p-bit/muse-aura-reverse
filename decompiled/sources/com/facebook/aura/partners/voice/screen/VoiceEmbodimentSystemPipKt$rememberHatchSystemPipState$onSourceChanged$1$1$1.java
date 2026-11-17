package com.facebook.aura.partners.voice.screen;

import X.AbstractC1709Aos;
import X.AbstractC7559F3s;
import X.BLU;
import X.C1BO;
import X.C3cG;
import X.C7384Etj;
import X.G0U;
import android.app.RemoteAction;
import androidx.compose.runtime.MutableState;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class VoiceEmbodimentSystemPipKt$rememberHatchSystemPipState$onSourceChanged$1$1$1 extends AbstractC7559F3s implements G0U<HatchSystemPipGeometry, Unit> {
    public final /* synthetic */ HatchSystemPipController $controller;
    public final /* synthetic */ C1BO<Boolean> $currentAvatarEnabled$delegate;
    public final /* synthetic */ C1BO<List<RemoteAction>> $currentPipActions$delegate;
    public final /* synthetic */ C1BO<Boolean> $currentSystemPipAutoEnter$delegate;
    public final /* synthetic */ MutableState<HatchSystemPipGeometry> $geometry$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSystemPipGeometry hatchSystemPipGeometry) {
        C7384Etj.A0Y(hatchSystemPipGeometry, 0);
        if (C1BO.A0F(this.$currentAvatarEnabled$delegate)) {
            this.$geometry$delegate.Af8(hatchSystemPipGeometry);
            HatchSystemPipController hatchSystemPipController = this.$controller;
            boolean zA0F = C1BO.A0F(this.$currentSystemPipAutoEnter$delegate);
            BLU blu = hatchSystemPipGeometry.sourceBounds;
            hatchSystemPipController.update(zA0F, blu != null ? AbstractC1709Aos.A00(blu) : null, C3cG.A0l(this.$currentPipActions$delegate));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VoiceEmbodimentSystemPipKt$rememberHatchSystemPipState$onSourceChanged$1$1$1(HatchSystemPipController hatchSystemPipController, C1BO<Boolean> c1bo, MutableState<HatchSystemPipGeometry> mutableState, C1BO<Boolean> c1bo2, C1BO<? extends List<RemoteAction>> c1bo3) {
        super(1);
        this.$controller = hatchSystemPipController;
        this.$currentAvatarEnabled$delegate = c1bo;
        this.$geometry$delegate = mutableState;
        this.$currentSystemPipAutoEnter$delegate = c1bo2;
        this.$currentPipActions$delegate = c1bo3;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSystemPipGeometry hatchSystemPipGeometry) {
        invoke2(hatchSystemPipGeometry);
        return Unit.INSTANCE;
    }
}
