package com.facebook.aura.partners.voice.screen;

import X.AHD;
import X.AnonymousClass005;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.navigation.key.VoiceCatalogFilterKind;
import com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class VoiceCatalogFacet {
    public final VoiceCatalogFilterKind kind;
    public final String label;
    public final G0U<String, Unit> onSelect;
    public final AHD<VoiceSettingsListViewModel.CatalogFilterOption> options;
    public final String selectedValue;

    public final VoiceCatalogFilterKind getKind() {
        return this.kind;
    }

    public final String getLabel() {
        return this.label;
    }

    public final G0U<String, Unit> getOnSelect() {
        return this.onSelect;
    }

    public final AHD<VoiceSettingsListViewModel.CatalogFilterOption> getOptions() {
        return this.options;
    }

    public final String getSelectedValue() {
        return this.selectedValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VoiceCatalogFacet(VoiceCatalogFilterKind voiceCatalogFilterKind, String str, AHD<VoiceSettingsListViewModel.CatalogFilterOption> ahd, String str2, G0U<? super String, Unit> g0u) {
        AnonymousClass005.A0x(voiceCatalogFilterKind, str, ahd);
        C7384Etj.A0Y(g0u, 4);
        this.kind = voiceCatalogFilterKind;
        this.label = str;
        this.options = ahd;
        this.selectedValue = str2;
        this.onSelect = g0u;
    }
}
