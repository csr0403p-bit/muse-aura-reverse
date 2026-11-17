package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.AkZ;
import X.C1BO;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class VoiceAvatarTakeoverKt$statusFocusTarget$3$1 extends AbstractC7559F3s implements G0U<AkZ, Unit> {
    public final /* synthetic */ C1BO<Boolean> $isCallActive$delegate;
    public final /* synthetic */ VoiceCallStateHolder $stateHolder;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AkZ akZ) {
        C7384Etj.A0Y(akZ, 0);
        C1BO<Boolean> c1bo = this.$isCallActive$delegate;
        float f = VoiceAvatarTakeoverKt.CallAvatarFullFrameAspectRatio;
        if (C1BO.A0F(c1bo) || this.$stateHolder.pendingCallStart.getValue() != null) {
            akZ.Ad0(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceAvatarTakeoverKt$statusFocusTarget$3$1(VoiceCallStateHolder voiceCallStateHolder, C1BO<Boolean> c1bo) {
        super(1);
        this.$stateHolder = voiceCallStateHolder;
        this.$isCallActive$delegate = c1bo;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AkZ akZ) {
        invoke2(akZ);
        return Unit.INSTANCE;
    }
}
