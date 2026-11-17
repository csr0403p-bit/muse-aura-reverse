package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class FileViewerScreenKt$FileViewerScreen$pagerState$1$1 extends AbstractC7559F3s implements Function0<Integer> {
    public final /* synthetic */ List<SlideInfo> $slidesInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileViewerScreenKt$FileViewerScreen$pagerState$1$1(List<SlideInfo> list) {
        super(0);
        this.$slidesInfo = list;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(this.$slidesInfo.size());
    }
}
