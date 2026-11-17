package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class MediaViewerContentKt$MediaViewerContent$10$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Function0<Unit> $dismissFromClose;
    public final /* synthetic */ boolean $isFullscreen;
    public final /* synthetic */ boolean $lockFullscreen;
    public final /* synthetic */ G0U<Boolean, Unit> $onFullscreenChanged;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MediaViewerContentKt$MediaViewerContent$10$1(boolean z, boolean z2, G0U<? super Boolean, Unit> g0u, Function0<Unit> function0) {
        super(0);
        this.$isFullscreen = z;
        this.$lockFullscreen = z2;
        this.$onFullscreenChanged = g0u;
        this.$dismissFromClose = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (!this.$isFullscreen || this.$lockFullscreen) {
            this.$dismissFromClose.invoke();
        } else {
            AnonymousClass001.A1K(false, this.$onFullscreenChanged);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
