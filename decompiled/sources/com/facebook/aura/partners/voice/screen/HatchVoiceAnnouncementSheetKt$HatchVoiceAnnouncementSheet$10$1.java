package com.facebook.aura.partners.voice.screen;

import X.C7438Evz;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final /* synthetic */ class HatchVoiceAnnouncementSheetKt$HatchVoiceAnnouncementSheet$10$1 extends C7438Evz implements Function0<Unit> {
    public HatchVoiceAnnouncementSheetKt$HatchVoiceAnnouncementSheet$10$1(Object obj) {
        super(0, obj, VoiceAnnouncementViewModel.class, "onVoiceNuxContinue", "onVoiceNuxContinue()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((VoiceAnnouncementViewModel) this.receiver).onVoiceNuxContinue();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
