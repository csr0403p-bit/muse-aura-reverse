package com.facebook.aura.conversation.search;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import androidx.compose.foundation.lazy.LazyListState;
import com.facebook.aura.conversation.viewmodel.HatchSearchViewModel;

/* loaded from: classes.dex */
public final class SearchResultsListStateKt$rememberSearchResultsListState$2$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ LazyListState $listState;
    public final /* synthetic */ HatchSearchViewModel $searchViewModel;
    public final /* synthetic */ String $surfaceKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchResultsListStateKt$rememberSearchResultsListState$2$1(HatchSearchViewModel hatchSearchViewModel, String str, LazyListState lazyListState) {
        super(1);
        this.$searchViewModel = hatchSearchViewModel;
        this.$surfaceKey = str;
        this.$listState = lazyListState;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        final HatchSearchViewModel hatchSearchViewModel = this.$searchViewModel;
        final String str = this.$surfaceKey;
        final LazyListState lazyListState = this.$listState;
        return new C78g() { // from class: com.facebook.aura.conversation.search.SearchResultsListStateKt$rememberSearchResultsListState$2$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                hatchSearchViewModel.recordScrollAnchor(str, lazyListState.A02(), lazyListState.A03());
            }
        };
    }
}
