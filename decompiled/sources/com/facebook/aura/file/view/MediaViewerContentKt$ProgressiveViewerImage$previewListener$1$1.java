package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.C00q;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class MediaViewerContentKt$ProgressiveViewerImage$previewListener$1$1 extends AbstractC7559F3s implements G0U<Float, Unit> {
    public final /* synthetic */ C00q $aspectRatio;
    public final /* synthetic */ MutableState<Boolean> $isDetailLoaded;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaViewerContentKt$ProgressiveViewerImage$previewListener$1$1(MutableState<Boolean> mutableState, C00q c00q) {
        super(1);
        this.$isDetailLoaded = mutableState;
        this.$aspectRatio = c00q;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Float f) {
        if (MutableState.A0A((MutableState) this.$isDetailLoaded) || f == null) {
            return;
        }
        this.$aspectRatio.AdS(f.floatValue());
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Float f) {
        invoke2(f);
        return Unit.INSTANCE;
    }
}
