package com.facebook.aura.partners.voice.screen;

import X.C7438Evz;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class VoiceSelectionListScreenKt$VoiceSelectionListScreen$2$2$1 extends C7438Evz implements Function0<Map<HatchMetadataKey, ? extends String>> {
    public VoiceSelectionListScreenKt$VoiceSelectionListScreen$2$2$1(Object obj) {
        super(0, obj, VoiceSettingsListViewModel.class, "telemetryMetadata", "telemetryMetadata()Ljava/util/Map;", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<HatchMetadataKey, ? extends String> invoke() {
        return ((VoiceSettingsListViewModel) this.receiver).telemetryMetadata();
    }
}
