package com.facebook.aura.file.view;

import X.AHD;
import X.AbstractC7559F3s;
import com.facebook.aura.file.view.api.ContentItem;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class MediaViewerContentKt$MediaViewerContent$pagerState$1$1 extends AbstractC7559F3s implements Function0<Integer> {
    public final /* synthetic */ AHD<ContentItem> $items;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaViewerContentKt$MediaViewerContent$pagerState$1$1(AHD<ContentItem> ahd) {
        super(0);
        this.$items = ahd;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(this.$items.size());
    }
}
