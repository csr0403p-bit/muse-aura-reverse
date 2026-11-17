package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.C1BO;
import android.app.RemoteAction;
import android.graphics.Rect;
import com.facebook.aura.partners.voice.api.HatchSystemPipPresentationState;
import com.facebook.aura.partners.voice.api.HatchSystemPipRuntime;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class VoiceEmbodimentSystemPipKt$rememberHatchSystemPipState$4$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ boolean $autoEnterArmed;
    public final /* synthetic */ boolean $isCallActive;
    public final /* synthetic */ List<RemoteAction> $pipActions;
    public final /* synthetic */ HatchSystemPipController $pipController;
    public final /* synthetic */ C1BO<HatchSystemPipPresentationState> $pipPresentationState$delegate;
    public final /* synthetic */ Rect $sourceRectHint;
    public final /* synthetic */ boolean $systemPipEnabled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VoiceEmbodimentSystemPipKt$rememberHatchSystemPipState$4$1(HatchSystemPipController hatchSystemPipController, boolean z, Rect rect, List<RemoteAction> list, boolean z2, boolean z3, C1BO<? extends HatchSystemPipPresentationState> c1bo) {
        super(0);
        this.$pipController = hatchSystemPipController;
        this.$autoEnterArmed = z;
        this.$sourceRectHint = rect;
        this.$pipActions = list;
        this.$isCallActive = z2;
        this.$systemPipEnabled = z3;
        this.$pipPresentationState$delegate = c1bo;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchSystemPipController hatchSystemPipController = this.$pipController;
        if (hatchSystemPipController != null) {
            hatchSystemPipController.update(this.$autoEnterArmed, this.$sourceRectHint, this.$pipActions);
        }
        if (this.$isCallActive && !this.$systemPipEnabled && this.$pipPresentationState$delegate.getValue() == HatchSystemPipPresentationState.ACTIVE) {
            HatchSystemPipRuntime.INSTANCE.requestHideAvatar();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
