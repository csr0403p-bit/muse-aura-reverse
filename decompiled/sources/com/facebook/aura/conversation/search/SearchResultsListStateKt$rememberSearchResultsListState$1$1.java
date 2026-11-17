package com.facebook.aura.conversation.search;

import X.AFs;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.foundation.lazy.LazyListState;
import com.facebook.aura.conversation.viewmodel.HatchSearchViewModel;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

@DebugMetadata(c = "com.facebook.aura.conversation.search.SearchResultsListStateKt$rememberSearchResultsListState$1$1", f = "SearchResultsListState.kt", l = {R.styleable.maplibre_MapView_maplibre_uiLogoGravity}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class SearchResultsListStateKt$rememberSearchResultsListState$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ LazyListState $listState;
    public final /* synthetic */ String $query;
    public final /* synthetic */ HatchSearchViewModel $searchViewModel;
    public final /* synthetic */ String $surfaceKey;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchResultsListStateKt$rememberSearchResultsListState$1$1(HatchSearchViewModel hatchSearchViewModel, String str, String str2, LazyListState lazyListState, HtJ<? super SearchResultsListStateKt$rememberSearchResultsListState$1$1> htJ) {
        super(2, htJ);
        this.$searchViewModel = hatchSearchViewModel;
        this.$surfaceKey = str;
        this.$query = str2;
        this.$listState = lazyListState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new SearchResultsListStateKt$rememberSearchResultsListState$1$1(this.$searchViewModel, this.$surfaceKey, this.$query, this.$listState, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (this.$searchViewModel.scrollAnchorFor(this.$surfaceKey, this.$query) == null) {
                LazyListState lazyListState = this.$listState;
                this.label = 1;
                AFs<LazyListState, ?> aFs = LazyListState.A0Q;
                if (lazyListState.A06(0, 0, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((SearchResultsListStateKt$rememberSearchResultsListState$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
