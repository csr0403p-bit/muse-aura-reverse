package com.facebook.aura.partners.voice.screen;

import X.AbstractC7559F3s;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class VoiceGlobalEffectsKt$WeakNetworkToast$1$1 extends AbstractC7559F3s implements G0U<Unit, Boolean> {
    public final /* synthetic */ Function0<Boolean> $stillWeak;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceGlobalEffectsKt$WeakNetworkToast$1$1(Function0<Boolean> function0) {
        super(1);
        this.$stillWeak = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Boolean invoke2(Unit unit) {
        return this.$stillWeak.invoke();
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Boolean invoke(Unit unit) {
        return this.$stillWeak.invoke();
    }
}
