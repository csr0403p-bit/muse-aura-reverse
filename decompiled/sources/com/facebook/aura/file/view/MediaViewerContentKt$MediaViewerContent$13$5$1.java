package com.facebook.aura.file.view;

import X.AHD;
import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.G0U;
import androidx.compose.foundation.pager.PagerState;
import com.facebook.aura.file.view.api.ContentItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class MediaViewerContentKt$MediaViewerContent$13$5$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AHD<ContentItem> $items;
    public final /* synthetic */ G0U<ContentItem, Unit> $onCopyClick;
    public final /* synthetic */ PagerState $pagerState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MediaViewerContentKt$MediaViewerContent$13$5$1(AHD<ContentItem> ahd, PagerState pagerState, G0U<? super ContentItem, Unit> g0u) {
        super(0);
        this.$items = ahd;
        this.$pagerState = pagerState;
        this.$onCopyClick = g0u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Object objA0A = AbstractC0878AGe.A0A(this.$pagerState.A07(), this.$items);
        if (objA0A != null) {
            this.$onCopyClick.invoke(objA0A);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
