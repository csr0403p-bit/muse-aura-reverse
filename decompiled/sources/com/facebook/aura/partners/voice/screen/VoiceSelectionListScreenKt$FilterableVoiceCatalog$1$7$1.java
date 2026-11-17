package com.facebook.aura.partners.voice.screen;

import X.C7438Evz;
import com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class VoiceSelectionListScreenKt$FilterableVoiceCatalog$1$7$1 extends C7438Evz implements Function0<Unit> {
    public VoiceSelectionListScreenKt$FilterableVoiceCatalog$1$7$1(Object obj) {
        super(0, obj, VoiceSettingsListViewModel.class, "retryCatalog", "retryCatalog()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((VoiceSettingsListViewModel) this.receiver).retryCatalog();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
