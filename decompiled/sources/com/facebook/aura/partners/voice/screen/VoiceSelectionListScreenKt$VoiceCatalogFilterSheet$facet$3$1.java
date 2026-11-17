package com.facebook.aura.partners.voice.screen;

import X.C7438Evz;
import X.G0U;
import com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final /* synthetic */ class VoiceSelectionListScreenKt$VoiceCatalogFilterSheet$facet$3$1 extends C7438Evz implements G0U<String, Unit> {
    public VoiceSelectionListScreenKt$VoiceCatalogFilterSheet$facet$3$1(Object obj) {
        super(1, obj, VoiceSettingsListViewModel.class, "selectCatalogTone", "selectCatalogTone(Ljava/lang/String;)V", 0);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        ((VoiceSettingsListViewModel) this.receiver).selectCatalogTone(str);
    }
}
