package com.facebook.aura.spaces.preload;

import X.AbstractC7559F3s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class SpacesTtsBridge$speak$1$action$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $lang;
    public final /* synthetic */ float $pitch;
    public final /* synthetic */ float $rate;
    public final /* synthetic */ String $text;
    public final /* synthetic */ String $utteranceId;
    public final /* synthetic */ String $voiceName;
    public final /* synthetic */ float $volume;
    public final /* synthetic */ SpacesTtsBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpacesTtsBridge$speak$1$action$1(SpacesTtsBridge spacesTtsBridge, String str, String str2, String str3, String str4, float f, float f2, float f3) {
        super(0);
        this.this$0 = spacesTtsBridge;
        this.$utteranceId = str;
        this.$text = str2;
        this.$lang = str3;
        this.$voiceName = str4;
        this.$rate = f;
        this.$pitch = f2;
        this.$volume = f3;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.doSpeak(this.$utteranceId, this.$text, this.$lang, this.$voiceName, this.$rate, this.$pitch, this.$volume);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
