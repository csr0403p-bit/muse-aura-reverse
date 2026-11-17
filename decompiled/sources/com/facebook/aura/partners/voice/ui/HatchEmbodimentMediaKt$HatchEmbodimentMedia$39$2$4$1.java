package com.facebook.aura.partners.voice.ui;

import X.AbstractC7559F3s;
import X.C1BO;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.partners.voice.intf.VoiceStillHandoffEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchEmbodimentMediaKt$HatchEmbodimentMedia$39$2$4$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ long $callGeneration;
    public final /* synthetic */ VoiceEmbodimentMediaController $controller;
    public final /* synthetic */ C1BO<G0U<VoiceStillHandoffEvent, Unit>> $currentOnStillHandoffEvent$delegate;
    public final /* synthetic */ String $imageKey;
    public final /* synthetic */ String $incomingKey;
    public final /* synthetic */ int $retryAttempt;
    public final /* synthetic */ String $stillKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchEmbodimentMediaKt$HatchEmbodimentMedia$39$2$4$1(String str, String str2, long j, int i, String str3, C1BO<? extends G0U<? super VoiceStillHandoffEvent, Unit>> c1bo, VoiceEmbodimentMediaController voiceEmbodimentMediaController) {
        super(0);
        this.$imageKey = str;
        this.$incomingKey = str2;
        this.$callGeneration = j;
        this.$retryAttempt = i;
        this.$stillKey = str3;
        this.$currentOnStillHandoffEvent$delegate = c1bo;
        this.$controller = voiceEmbodimentMediaController;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (C7384Etj.areEqual(this.$imageKey, this.$incomingKey)) {
            C1BO.A0B(this.$currentOnStillHandoffEvent$delegate).invoke(new VoiceStillHandoffEvent.Failed(this.$callGeneration, this.$imageKey, this.$retryAttempt));
            return;
        }
        String str = this.$stillKey;
        if (str != null) {
            this.$controller.onStillPainted(str, false);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
