package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.VoiceCatalogFilterKind;
import com.facebook.aura.navigation.key.VoiceCatalogFilterSheetKey;
import com.facebook.aura.navigation.key.VoiceEntryPoint;
import com.facebook.aura.navigation.key.VoiceSelectionListScreenKey;
import com.facebook.aura.navigation.key.VoiceSelectionListSheetKey;
import com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class VoiceSelectionListScreenKt$VoiceCatalogFilterButton$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ VoiceCatalogFacet $facet;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ VoiceSettingsListViewModel $settingsViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceSelectionListScreenKt$VoiceCatalogFilterButton$2$1(AuraNavigator auraNavigator, VoiceCatalogFacet voiceCatalogFacet, VoiceSettingsListViewModel voiceSettingsListViewModel) {
        super(0);
        this.$navigator = auraNavigator;
        this.$facet = voiceCatalogFacet;
        this.$settingsViewModel = voiceSettingsListViewModel;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        VoiceCatalogFilterSheetKey.Companion companion;
        VoiceCatalogFilterKind voiceCatalogFilterKind;
        String str;
        VoiceEntryPoint voiceEntryPoint;
        AuraNavKey auraNavKeyCurrentKey = this.$navigator.currentKey(true);
        if (auraNavKeyCurrentKey instanceof VoiceSelectionListScreenKey) {
            companion = VoiceCatalogFilterSheetKey.Companion;
            voiceCatalogFilterKind = this.$facet.kind;
            VoiceSelectionListScreenKey voiceSelectionListScreenKey = (VoiceSelectionListScreenKey) auraNavKeyCurrentKey;
            str = voiceSelectionListScreenKey.contentKey;
            voiceEntryPoint = voiceSelectionListScreenKey.entryPoint;
        } else {
            if (!(auraNavKeyCurrentKey instanceof VoiceSelectionListSheetKey)) {
                return;
            }
            companion = VoiceCatalogFilterSheetKey.Companion;
            voiceCatalogFilterKind = this.$facet.kind;
            VoiceSelectionListSheetKey voiceSelectionListSheetKey = (VoiceSelectionListSheetKey) auraNavKeyCurrentKey;
            str = voiceSelectionListSheetKey.contentKey;
            voiceEntryPoint = voiceSelectionListSheetKey.entryPoint;
        }
        VoiceCatalogFilterSheetKey voiceCatalogFilterSheetKeyInvoke = companion.invoke(voiceCatalogFilterKind, str, voiceEntryPoint);
        if (voiceCatalogFilterSheetKeyInvoke != null) {
            this.$settingsViewModel.onOpenFilter(this.$facet.kind);
            this.$navigator.navigate((AuraNavKey) voiceCatalogFilterSheetKeyInvoke, false);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
