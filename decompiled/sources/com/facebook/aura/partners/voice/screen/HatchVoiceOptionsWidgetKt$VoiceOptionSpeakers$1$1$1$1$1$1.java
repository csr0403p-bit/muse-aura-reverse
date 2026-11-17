package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.G0U;
import com.facebook.aura.model.VoiceOptionData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchVoiceOptionsWidgetKt$VoiceOptionSpeakers$1$1$1$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0U<VoiceOptionData, Unit> $onPreview;
    public final /* synthetic */ VoiceOptionData $option;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchVoiceOptionsWidgetKt$VoiceOptionSpeakers$1$1$1$1$1$1(G0U<? super VoiceOptionData, Unit> g0u, VoiceOptionData voiceOptionData) {
        super(0);
        this.$onPreview = g0u;
        this.$option = voiceOptionData;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onPreview.invoke(this.$option);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
