package com.facebook.aura.conversation.search;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass037;
import X.BFM;
import X.BRg;
import X.C01N;
import X.C0CD;
import X.C10G;
import X.C1BO;
import X.C3U4;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.conversation.repo.HatchSearchUiState;
import com.facebook.aura.conversation.viewmodel.HatchConversationViewModel;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ConversationScreenKey;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ConversationSearchScreenKt$ConversationSearchScreen$3$1$1 extends AbstractC7559F3s implements G0U<C0CD, Unit> {
    public final /* synthetic */ float $headerHeight;
    public final /* synthetic */ String $mainChatTitle;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ MutableState<String> $query$delegate;
    public final /* synthetic */ float $searchResultHorizontalPadding;
    public final /* synthetic */ long $searchResultSeparatorColor;
    public final /* synthetic */ AHD<com.facebook.aura.conversation.data.HatchSearchHit> $searchResults;
    public final /* synthetic */ C1BO<HatchSearchUiState> $searchUiState$delegate;
    public final /* synthetic */ String $untitledThreadTitle;
    public final /* synthetic */ HatchConversationViewModel $viewModel;

    /* renamed from: com.facebook.aura.conversation.search.ConversationSearchScreenKt$ConversationSearchScreen$3$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ float $headerHeight;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(float f) {
            super(3);
            this.$headerHeight = f;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                C01N.A08(bfm, BRg.A00, this.$headerHeight);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.conversation.search.ConversationSearchScreenKt$ConversationSearchScreen$3$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<com.facebook.aura.conversation.data.HatchSearchHit, String, String, Unit> {
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ HatchConversationViewModel $viewModel;

        /* renamed from: com.facebook.aura.conversation.search.ConversationSearchScreenKt$ConversationSearchScreen$3$1$1$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AuraNavKey, Boolean> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(1);
            }

            @Override // X.G0U
            public final Boolean invoke(AuraNavKey auraNavKey) {
                C7384Etj.A0Y(auraNavKey, 0);
                return Boolean.valueOf(auraNavKey instanceof ConversationScreenKey);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AuraNavigator auraNavigator, HatchConversationViewModel hatchConversationViewModel) {
            super(3);
            this.$navigator = auraNavigator;
            this.$viewModel = hatchConversationViewModel;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(com.facebook.aura.conversation.data.HatchSearchHit hatchSearchHit, String str, String str2) {
            invoke2(hatchSearchHit, str, str2);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(com.facebook.aura.conversation.data.HatchSearchHit hatchSearchHit, String str, String str2) {
            C7384Etj.A0Y(hatchSearchHit, 0);
            HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SEARCH, null, HatchScreen.SEARCH_RESULTS, HatchComponent.SEARCH_RESULT_ITEM, null, null, null);
            this.$navigator.back();
            if (hatchSearchHit.isThread && str != null) {
                this.$navigator.navigate((AuraNavKey) new ConversationScreenKey(str, str2, false, hatchSearchHit.messageId, hatchSearchHit.seq, false), false);
                return;
            }
            this.$navigator.popAll(AnonymousClass1.INSTANCE);
            this.$viewModel.jumpToMessage(hatchSearchHit.messageId, hatchSearchHit.seq);
            this.$viewModel.setHighlightedMessageId(hatchSearchHit.messageId);
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C0CD c0cd) {
        C7384Etj.A0Y(c0cd, 0);
        c0cd.APJ(null, null, AnonymousClass001.A0M(new AnonymousClass1(this.$headerHeight), 1582332749));
        MutableState<String> mutableState = this.$query$delegate;
        float f = ConversationSearchScreenKt.SearchFieldCornerRadius;
        if (!ConversationSearchScreenKt.searchResultStateItems(c0cd, MutableState.A05(mutableState), this.$searchUiState$delegate.getValue(), SearchResultStatePlacement.FULL_SCREEN)) {
            c0cd.APJ(null, null, ComposableSingletons$ConversationSearchScreenKt.f25lambda$256249304);
            ConversationSearchScreenKt.m508searchResultRows533V2PY(c0cd, this.$searchResults, MutableState.A05(this.$query$delegate), this.$untitledThreadTitle, this.$mainChatTitle, this.$searchResultSeparatorColor, new AnonymousClass2(this.$navigator, this.$viewModel), C3U4.A07(C10G.A02, this.$searchResultHorizontalPadding));
        }
        if (this.$searchUiState$delegate.getValue().isLoadingMore) {
            c0cd.APJ("loading-more", null, ComposableSingletons$ConversationSearchScreenKt.lambda$1166553631);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationSearchScreenKt$ConversationSearchScreen$3$1$1(float f, AHD<com.facebook.aura.conversation.data.HatchSearchHit> ahd, String str, String str2, long j, float f2, MutableState<String> mutableState, C1BO<HatchSearchUiState> c1bo, AuraNavigator auraNavigator, HatchConversationViewModel hatchConversationViewModel) {
        super(1);
        this.$searchResultHorizontalPadding = f;
        this.$searchResults = ahd;
        this.$untitledThreadTitle = str;
        this.$mainChatTitle = str2;
        this.$searchResultSeparatorColor = j;
        this.$headerHeight = f2;
        this.$query$delegate = mutableState;
        this.$searchUiState$delegate = c1bo;
        this.$navigator = auraNavigator;
        this.$viewModel = hatchConversationViewModel;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C0CD c0cd) {
        invoke2(c0cd);
        return Unit.INSTANCE;
    }
}
