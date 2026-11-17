package com.facebook.aura.partners.voice.ui;

import X.AbstractC7559F3s;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchEmbodimentMediaKt$EmbodimentActivityVideo$7$1 extends AbstractC7559F3s implements G0U<Exception, Unit> {
    public final /* synthetic */ Function0<Unit> $onError;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchEmbodimentMediaKt$EmbodimentActivityVideo$7$1(Function0<Unit> function0) {
        super(1);
        this.$onError = function0;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Exception exc) {
        this.$onError.invoke();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Exception exc) {
        this.$onError.invoke();
    }
}
