package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0U;
import X.G0V;
import X.G0W;
import com.facebook.aura.model.VoiceOptionData;
import com.facebook.aura.model.VoiceOptionsWidgetData;
import com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchVoiceOptionsWidgetKt$VoiceOptionSpeakers$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ boolean $acceptsSelection;
    public final /* synthetic */ float $columnSpacing;
    public final /* synthetic */ String $confirmedVoiceId;
    public final /* synthetic */ VoiceOptionsWidgetData $data;
    public final /* synthetic */ float $glyphSize;
    public final /* synthetic */ int $labelMaxLines;
    public final /* synthetic */ VoiceControlsViewModel.UiState.Loaded $loaded;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<VoiceOptionData, Unit> $onPreview;
    public final /* synthetic */ String $pendingVoiceId;
    public final /* synthetic */ int $playGlyph;
    public final /* synthetic */ float $speakerSize;
    public final /* synthetic */ int $speakersPerRow;
    public final /* synthetic */ G0W<BRg, BFM, Integer, Unit> $trailingItem;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchVoiceOptionsWidgetKt$VoiceOptionSpeakers$2(VoiceOptionsWidgetData voiceOptionsWidgetData, VoiceControlsViewModel.UiState.Loaded loaded, String str, String str2, boolean z, G0U<? super VoiceOptionData, Unit> g0u, BRg bRg, float f, float f2, int i, int i2, int i3, float f3, G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w, int i4, int i5, int i6) {
        super(2);
        this.$data = voiceOptionsWidgetData;
        this.$loaded = loaded;
        this.$pendingVoiceId = str;
        this.$confirmedVoiceId = str2;
        this.$acceptsSelection = z;
        this.$onPreview = g0u;
        this.$modifier = bRg;
        this.$speakerSize = f;
        this.$glyphSize = f2;
        this.$playGlyph = i;
        this.$labelMaxLines = i2;
        this.$speakersPerRow = i3;
        this.$columnSpacing = f3;
        this.$trailingItem = g0w;
        this.$$changed = i4;
        this.$$changed1 = i5;
        this.$$default = i6;
    }

    public final void invoke(BFM bfm, int i) {
        HatchVoiceOptionsWidgetKt.m1744VoiceOptionSpeakersDepgYg8(this.$data, this.$loaded, this.$pendingVoiceId, this.$confirmedVoiceId, this.$acceptsSelection, this.$onPreview, this.$modifier, this.$speakerSize, this.$glyphSize, this.$playGlyph, this.$labelMaxLines, this.$speakersPerRow, this.$columnSpacing, this.$trailingItem, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
