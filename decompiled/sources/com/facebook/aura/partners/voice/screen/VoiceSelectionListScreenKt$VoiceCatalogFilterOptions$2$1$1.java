package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class VoiceSelectionListScreenKt$VoiceCatalogFilterOptions$2$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ VoiceCatalogFacet $facet;
    public final /* synthetic */ Function0<Unit> $onSelected;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceSelectionListScreenKt$VoiceCatalogFilterOptions$2$1$1(VoiceCatalogFacet voiceCatalogFacet, Function0<Unit> function0) {
        super(0);
        this.$facet = voiceCatalogFacet;
        this.$onSelected = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$facet.onSelect.invoke(null);
        this.$onSelected.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
