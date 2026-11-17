package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.C1BO;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class VoiceControlsSettingsScreenKt$VoiceControlsSettingsScreen$2$1 extends AbstractC7559F3s implements Function0<Map<HatchMetadataKey, ? extends String>> {
    public final /* synthetic */ C1BO<Map<HatchMetadataKey, String>> $pageMetadata$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VoiceControlsSettingsScreenKt$VoiceControlsSettingsScreen$2$1(C1BO<? extends Map<HatchMetadataKey, String>> c1bo) {
        super(0);
        this.$pageMetadata$delegate = c1bo;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<HatchMetadataKey, ? extends String> invoke() {
        return this.$pageMetadata$delegate.getValue();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Map<HatchMetadataKey, ? extends String> invoke() {
        return this.$pageMetadata$delegate.getValue();
    }
}
