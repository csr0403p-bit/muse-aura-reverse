package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.partners.voice.api.VoicePipelineProfile;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class VoiceInternalSettingsScreenKt$VoicePipelineSection$2$1$3$1$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<Boolean> $expanded$delegate;
    public final /* synthetic */ G0U<String, Unit> $onSelect;
    public final /* synthetic */ VoicePipelineProfile $profile;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VoiceInternalSettingsScreenKt$VoicePipelineSection$2$1$3$1$2$1(G0U<? super String, Unit> g0u, VoicePipelineProfile voicePipelineProfile, MutableState<Boolean> mutableState) {
        super(0);
        this.$onSelect = g0u;
        this.$profile = voicePipelineProfile;
        this.$expanded$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MutableState.A09(false, this.$expanded$delegate);
        this.$onSelect.invoke(this.$profile.id);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
