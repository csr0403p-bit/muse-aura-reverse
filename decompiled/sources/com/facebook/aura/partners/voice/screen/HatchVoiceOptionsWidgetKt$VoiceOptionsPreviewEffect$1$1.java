package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel;
import java.util.List;

/* loaded from: classes4.dex */
public final class HatchVoiceOptionsWidgetKt$VoiceOptionsPreviewEffect$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ boolean $acceptsSelection;
    public final /* synthetic */ String $hostMessageId;
    public final /* synthetic */ boolean $isLoaded;
    public final /* synthetic */ String $previewFallback;
    public final /* synthetic */ VoiceControlsViewModel $viewModel;
    public final /* synthetic */ List<String> $voiceIds;
    public final /* synthetic */ String $widgetId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchVoiceOptionsWidgetKt$VoiceOptionsPreviewEffect$1$1(boolean z, VoiceControlsViewModel voiceControlsViewModel, boolean z2, String str, String str2, List<String> list, String str3) {
        super(1);
        this.$acceptsSelection = z;
        this.$viewModel = voiceControlsViewModel;
        this.$isLoaded = z2;
        this.$hostMessageId = str;
        this.$widgetId = str2;
        this.$voiceIds = list;
        this.$previewFallback = str3;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (!this.$acceptsSelection) {
            this.$viewModel.stopPreview();
        } else if (this.$isLoaded) {
            this.$viewModel.prefetchWidgetPreviews(this.$hostMessageId, this.$widgetId, this.$voiceIds, this.$previewFallback);
        }
        return new C78g() { // from class: com.facebook.aura.partners.voice.screen.HatchVoiceOptionsWidgetKt$VoiceOptionsPreviewEffect$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
