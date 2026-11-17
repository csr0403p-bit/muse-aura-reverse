package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import com.facebook.aura.partners.voice.intf.CaptionEntry;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class VoiceCallCurrentCaptionKt$VoiceCallCurrentCaption$7$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ CaptionEntry $caption;
    public final /* synthetic */ CaptionHolder $previousCaption;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceCallCurrentCaptionKt$VoiceCallCurrentCaption$7$1(CaptionHolder captionHolder, CaptionEntry captionEntry) {
        super(0);
        this.$previousCaption = captionHolder;
        this.$caption = captionEntry;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$previousCaption.caption = this.$caption;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
