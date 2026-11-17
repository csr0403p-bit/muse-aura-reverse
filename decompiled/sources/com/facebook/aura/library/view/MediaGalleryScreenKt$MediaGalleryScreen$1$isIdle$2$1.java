package com.facebook.aura.library.view;

import X.AbstractC7559F3s;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class MediaGalleryScreenKt$MediaGalleryScreen$1$isIdle$2$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ LazyGridState $gridState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaGalleryScreenKt$MediaGalleryScreen$1$isIdle$2$1(LazyGridState lazyGridState) {
        super(0);
        this.$gridState = lazyGridState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(!this.$gridState.AOz());
    }
}
