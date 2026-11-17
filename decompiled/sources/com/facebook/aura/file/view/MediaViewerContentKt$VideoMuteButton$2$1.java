package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class MediaViewerContentKt$VideoMuteButton$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ boolean $isMuted;
    public final /* synthetic */ G0U<Boolean, Unit> $onMutedChanged;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MediaViewerContentKt$VideoMuteButton$2$1(G0U<? super Boolean, Unit> g0u, boolean z) {
        super(0);
        this.$onMutedChanged = g0u;
        this.$isMuted = z;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AnonymousClass001.A1K(!this.$isMuted, this.$onMutedChanged);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
