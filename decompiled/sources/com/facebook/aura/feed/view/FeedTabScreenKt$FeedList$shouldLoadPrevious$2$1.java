package com.facebook.aura.feed.view;

import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.C1160Acs;
import X.C1161Act;
import X.C16C;
import androidx.compose.foundation.lazy.LazyListState;
import com.facebook.aura.feed.model.FeedViewModel;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class FeedTabScreenKt$FeedList$shouldLoadPrevious$2$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ LazyListState $listState;
    public final /* synthetic */ FeedViewModel.FeedUiState $uiState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedTabScreenKt$FeedList$shouldLoadPrevious$2$1(LazyListState lazyListState, FeedViewModel.FeedUiState feedUiState) {
        super(0);
        this.$listState = lazyListState;
        this.$uiState = feedUiState;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        C16C c16c = (C16C) AbstractC0878AGe.A0G(AnonymousClass003.A0j(this.$listState));
        boolean z = false;
        int i = c16c != null ? ((C1160Acs) c16c).A07 : 0;
        FeedViewModel.FeedUiState feedUiState = this.$uiState;
        if (feedUiState.hasPreviousPage && !feedUiState.isLoadingPreviousPage && !feedUiState.isRefreshing && ((C1161Act) this.$listState.A04()).A05 > 0 && i <= 2) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
