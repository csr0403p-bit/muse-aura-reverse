package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class MediaViewerContentKt$MediaViewerContent$13$1$3$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ boolean $isFullscreen;
    public final /* synthetic */ boolean $isVideo;
    public final /* synthetic */ boolean $lockFullscreen;
    public final /* synthetic */ G0U<Boolean, Unit> $onFullscreenChanged;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MediaViewerContentKt$MediaViewerContent$13$1$3$3$1(boolean z, boolean z2, G0U<? super Boolean, Unit> g0u, boolean z3) {
        super(0);
        this.$isVideo = z;
        this.$isFullscreen = z2;
        this.$onFullscreenChanged = g0u;
        this.$lockFullscreen = z3;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        G0U<Boolean, Unit> g0u;
        boolean z = true;
        if (this.$isVideo && !this.$isFullscreen) {
            g0u = this.$onFullscreenChanged;
        } else {
            if (this.$lockFullscreen) {
                return;
            }
            g0u = this.$onFullscreenChanged;
            z = true ^ this.$isFullscreen;
        }
        AnonymousClass001.A1K(z, g0u);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
