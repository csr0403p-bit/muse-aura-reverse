package com.facebook.aura.partners.voice.screen;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0U;
import X.G0V;
import com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class VoiceSelectionListScreenKt$VoiceCatalogControls$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ AHD<VoiceCatalogFacet> $facets;
    public final /* synthetic */ boolean $filtersFailed;
    public final /* synthetic */ boolean $filtersLoading;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onClearAll;
    public final /* synthetic */ G0U<String, Unit> $onQueryChange;
    public final /* synthetic */ Function0<Unit> $onRetryFilters;
    public final /* synthetic */ String $query;
    public final /* synthetic */ VoiceSettingsListViewModel $settingsViewModel;
    public final /* synthetic */ float $topPadding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VoiceSelectionListScreenKt$VoiceCatalogControls$2(VoiceSettingsListViewModel voiceSettingsListViewModel, String str, G0U<? super String, Unit> g0u, AHD<VoiceCatalogFacet> ahd, Function0<Unit> function0, boolean z, boolean z2, Function0<Unit> function02, float f, BRg bRg, int i, int i2) {
        super(2);
        this.$settingsViewModel = voiceSettingsListViewModel;
        this.$query = str;
        this.$onQueryChange = g0u;
        this.$facets = ahd;
        this.$onClearAll = function0;
        this.$filtersLoading = z;
        this.$filtersFailed = z2;
        this.$onRetryFilters = function02;
        this.$topPadding = f;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(BFM bfm, int i) {
        VoiceSelectionListScreenKt.m1782VoiceCatalogControlstJlDC5Y(this.$settingsViewModel, this.$query, this.$onQueryChange, this.$facets, this.$onClearAll, this.$filtersLoading, this.$filtersFailed, this.$onRetryFilters, this.$topPadding, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
