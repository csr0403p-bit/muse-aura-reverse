package com.facebook.aura.common.video;

import X.AbstractC7559F3s;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchVideoPlayerComposableKt$HatchVideoPlayerComposable$7$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MediaCallbacks $mediaCallbacks;
    public final /* synthetic */ G0U<Exception, Unit> $onMediaError;
    public final /* synthetic */ Function0<Unit> $onMediaRendered;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchVideoPlayerComposableKt$HatchVideoPlayerComposable$7$1(MediaCallbacks mediaCallbacks, G0U<? super Exception, Unit> g0u, Function0<Unit> function0) {
        super(0);
        this.$mediaCallbacks = mediaCallbacks;
        this.$onMediaError = g0u;
        this.$onMediaRendered = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$mediaCallbacks.setOnError(this.$onMediaError);
        this.$mediaCallbacks.setOnRendered(this.$onMediaRendered);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
