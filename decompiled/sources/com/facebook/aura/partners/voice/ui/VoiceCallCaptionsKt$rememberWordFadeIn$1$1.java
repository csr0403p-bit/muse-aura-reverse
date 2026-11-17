package com.facebook.aura.partners.voice.ui;

import X.ADq;
import X.AbstractC7559F3s;
import com.facebook.aura.markdown.render.reveal.WordRevealController;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class VoiceCallCaptionsKt$rememberWordFadeIn$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ WordRevealController $controller;
    public final /* synthetic */ List<ADq> $words;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceCallCaptionsKt$rememberWordFadeIn$1$1(WordRevealController wordRevealController, List<ADq> list) {
        super(0);
        this.$controller = wordRevealController;
        this.$words = list;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$controller.setRenderedTotal(this.$words.size());
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
