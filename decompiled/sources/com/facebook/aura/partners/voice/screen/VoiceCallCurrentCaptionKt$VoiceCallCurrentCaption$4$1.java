package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1BO;
import X.C78g;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class VoiceCallCurrentCaptionKt$VoiceCallCurrentCaption$4$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ C1BO<Function0<Unit>> $currentOnCaptionHidden$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VoiceCallCurrentCaptionKt$VoiceCallCurrentCaption$4$1(C1BO<? extends Function0<Unit>> c1bo) {
        super(1);
        this.$currentOnCaptionHidden$delegate = c1bo;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final C78g invoke2(C0Yr c0Yr) {
        return new VoiceCallCurrentCaptionKt$VoiceCallCurrentCaption$4$1$invoke$$inlined$onDispose$1(this.$currentOnCaptionHidden$delegate);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ C78g invoke(C0Yr c0Yr) {
        return new VoiceCallCurrentCaptionKt$VoiceCallCurrentCaption$4$1$invoke$$inlined$onDispose$1(this.$currentOnCaptionHidden$delegate);
    }
}
