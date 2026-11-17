package com.facebook.aura.feed.view;

import X.AbstractC7559F3s;
import androidx.compose.foundation.lazy.LazyListState;
import com.facebook.aura.feed.model.FeedViewModel;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class FeedTabScreenKt$FeedList$shouldLoadNext$2$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ LazyListState $listState;
    public final /* synthetic */ FeedViewModel.FeedUiState $uiState;
    public final /* synthetic */ int $unitCount;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedTabScreenKt$FeedList$shouldLoadNext$2$1(LazyListState lazyListState, int i, FeedViewModel.FeedUiState feedUiState) {
        super(0);
        this.$listState = lazyListState;
        this.$unitCount = i;
        this.$uiState = feedUiState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean invoke() {
        /*
            r4 = this;
            androidx.compose.foundation.lazy.LazyListState r0 = r4.$listState
            java.util.List r0 = X.AnonymousClass003.A0j(r0)
            java.lang.Object r0 = X.AbstractC0878AGe.A0I(r0)
            X.16C r0 = (X.C16C) r0
            r3 = 0
            if (r0 == 0) goto L3f
            X.Acs r0 = (X.C1160Acs) r0
            int r1 = r0.A07
        L13:
            androidx.compose.foundation.lazy.LazyListState r0 = r4.$listState
            X.2A9 r0 = r0.A04()
            X.Act r0 = (X.C1161Act) r0
            int r0 = r0.A05
            if (r0 <= 0) goto L24
            int r0 = r0 + (-3)
            r2 = 1
            if (r1 >= r0) goto L25
        L24:
            r2 = 0
        L25:
            int r0 = r4.$unitCount
            if (r0 <= 0) goto L3a
            com.facebook.aura.feed.model.FeedViewModel$FeedUiState r1 = r4.$uiState
            boolean r0 = r1.hasNextPage
            if (r0 == 0) goto L3a
            boolean r0 = r1.isLoadingNextPage
            if (r0 != 0) goto L3a
            boolean r0 = r1.isRefreshing
            if (r0 != 0) goto L3a
            if (r2 == 0) goto L3a
            r3 = 1
        L3a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L3f:
            r1 = 0
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.feed.view.FeedTabScreenKt$FeedList$shouldLoadNext$2$1.invoke():java.lang.Boolean");
    }
}
