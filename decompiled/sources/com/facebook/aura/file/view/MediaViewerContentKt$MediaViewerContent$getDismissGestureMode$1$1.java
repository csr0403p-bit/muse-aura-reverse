package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.C1BO;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class MediaViewerContentKt$MediaViewerContent$getDismissGestureMode$1$1 extends AbstractC7559F3s implements Function0<MediaViewerDismissGestureMode> {
    public final /* synthetic */ C1BO<MediaViewerDismissGestureMode> $currentDismissGestureMode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MediaViewerContentKt$MediaViewerContent$getDismissGestureMode$1$1(C1BO<? extends MediaViewerDismissGestureMode> c1bo) {
        super(0);
        this.$currentDismissGestureMode = c1bo;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final MediaViewerDismissGestureMode invoke() {
        return this.$currentDismissGestureMode.getValue();
    }
}
