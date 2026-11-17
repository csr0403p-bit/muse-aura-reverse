package com.facebook.aura.conversation.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.C0CD;
import X.C10G;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import com.facebook.aura.conversation.data.HatchSearchHit;
import com.facebook.aura.conversation.repo.HatchSearchUiState;
import com.facebook.aura.conversation.search.ConversationSearchScreenKt;
import com.facebook.aura.conversation.search.SearchResultStatePlacement;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchConversationHistorySidePanelKt$SearchConversationHistoryResults$2$1$1 extends AbstractC7559F3s implements G0U<C0CD, Unit> {
    public final /* synthetic */ String $mainChatTitle;
    public final /* synthetic */ G0W<HatchSearchHit, String, String, Unit> $onResultClick;
    public final /* synthetic */ String $query;
    public final /* synthetic */ AHD<HatchSearchHit> $searchResults;
    public final /* synthetic */ HatchSearchUiState $searchUiState;
    public final /* synthetic */ long $separatorColor;
    public final /* synthetic */ String $untitledThreadTitle;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C0CD c0cd) {
        C7384Etj.A0Y(c0cd, 0);
        if (!ConversationSearchScreenKt.searchResultStateItems(c0cd, this.$query, this.$searchUiState, SearchResultStatePlacement.CENTERED)) {
            ConversationSearchScreenKt.m508searchResultRows533V2PY(c0cd, this.$searchResults, this.$query, this.$untitledThreadTitle, this.$mainChatTitle, this.$separatorColor, this.$onResultClick, C10G.A02);
        }
        if (this.$searchUiState.isLoadingMore) {
            c0cd.APJ("loading-more", null, ComposableSingletons$HatchConversationHistorySidePanelKt.f27lambda$1121687333);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationHistorySidePanelKt$SearchConversationHistoryResults$2$1$1(String str, HatchSearchUiState hatchSearchUiState, AHD<HatchSearchHit> ahd, String str2, String str3, long j, G0W<? super HatchSearchHit, ? super String, ? super String, Unit> g0w) {
        super(1);
        this.$query = str;
        this.$searchUiState = hatchSearchUiState;
        this.$searchResults = ahd;
        this.$untitledThreadTitle = str2;
        this.$mainChatTitle = str3;
        this.$separatorColor = j;
        this.$onResultClick = g0w;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C0CD c0cd) {
        invoke2(c0cd);
        return Unit.INSTANCE;
    }
}
