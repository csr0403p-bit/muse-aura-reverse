package com.facebook.aura.partners.voice.ui;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.InterfaceC2178B0w;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchEmbodimentMediaKt$HatchEmbodimentMedia$28$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ VoiceEmbodimentMediaController $controller;
    public final /* synthetic */ AtomicReference<String> $reportedStill;
    public final /* synthetic */ InterfaceC2178B0w $stillFrame;
    public final /* synthetic */ String $stillKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchEmbodimentMediaKt$HatchEmbodimentMedia$28$1(String str, AtomicReference<String> atomicReference, VoiceEmbodimentMediaController voiceEmbodimentMediaController, InterfaceC2178B0w interfaceC2178B0w) {
        super(0);
        this.$stillKey = str;
        this.$reportedStill = atomicReference;
        this.$controller = voiceEmbodimentMediaController;
        this.$stillFrame = interfaceC2178B0w;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        String str = this.$stillKey;
        if (str == null || this.$stillFrame == null || C7384Etj.areEqual(this.$reportedStill.getAndSet(str), str)) {
            return;
        }
        this.$controller.onStillPainted(str, true);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
