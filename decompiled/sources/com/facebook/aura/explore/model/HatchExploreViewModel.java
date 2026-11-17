package com.facebook.aura.explore.model;

import X.AEs;
import X.AEu;
import X.AGI;
import X.AHD;
import X.AHI;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.BLG;
import X.BO6;
import X.C06G;
import X.C06H;
import X.C0953AJg;
import X.C0KA;
import X.C1BN;
import X.C20Z;
import X.C22I;
import X.C3Em;
import X.C3Pi;
import X.C3UX;
import X.C3pd;
import X.C7384Etj;
import X.C79;
import X.C7BY;
import X.C9286GCn;
import X.C9290GCr;
import X.C9oY;
import X.EnumC10460Hji;
import X.G0V;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.HxE;
import com.facebook.aura.appreview.HatchInAppReviewTrigger;
import com.facebook.aura.commands.photos.PhotosSearchHandlerKt;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.explore.repo.ExploreLoadingState;
import com.facebook.aura.explore.repo.IdeaCard;
import com.facebook.aura.explore.repo.IdeaCardDetailOrigin;
import com.facebook.aura.explore.repo.IdeaCardExecutionState;
import com.facebook.aura.explore.repo.IdeaCardSection;
import com.facebook.aura.explore.repo.IdeaCardsDataSource;
import com.facebook.aura.explore.repo.IdeaFeedback;
import com.facebook.aura.explore.repo.IdeaFeedbackResult;
import com.facebook.aura.explore.repo.IdeasFeedState;
import com.facebook.aura.model.HatchEngagementEventType;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes.dex */
public final class HatchExploreViewModel extends AEs {
    public static final String CLICK_INTERACTION_SOURCE = "android_tap";
    public static final Companion Companion = new Companion();
    public static final String ENGAGEMENT_SURFACE = "explore_feed";
    public static final String VIEWPORT_IMPRESSION_SOURCE = "android_viewport";
    public final C3Em<IdeasEffect> _ideasEffect;
    public final BLG<IdeasUiState> _ideasUiState;
    public final IdeaCardsDataSource ideaCardsDataSource;
    public final C22I<IdeasEffect> ideasEffect;
    public HoC ideasLoadJob;
    public HoC ideasLoadMoreJob;
    public final C1BN<IdeasUiState> ideasUiState;
    public final Set<String> impressedIdeaCardIDs;

    public final class Factory extends AuraViewModelFactory<HatchExploreViewModel> {
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public HatchExploreViewModel create() {
            return new HatchExploreViewModel(IdeaCardsDataSource.Companion.getInstance(this.userSession));
        }
    }

    public interface IdeasEffect {

        public final class DismissChatDetail extends C06G implements IdeasEffect {
            public final String chatDetailDismissKey;

            public DismissChatDetail(String str) {
                C7384Etj.A0Y(str, 0);
                this.chatDetailDismissKey = str;
            }

            public final DismissChatDetail copy(String str) {
                C7384Etj.A0Y(str, 0);
                return new DismissChatDetail(str);
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof DismissChatDetail) && C7384Etj.areEqual(this.chatDetailDismissKey, ((DismissChatDetail) obj).chatDetailDismissKey));
            }

            public static /* synthetic */ DismissChatDetail copy$default(DismissChatDetail dismissChatDetail, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = dismissChatDetail.chatDetailDismissKey;
                }
                C7384Etj.A0Y(str, 0);
                return new DismissChatDetail(str);
            }

            public final String component1() {
                return this.chatDetailDismissKey;
            }

            public final String getChatDetailDismissKey() {
                return this.chatDetailDismissKey;
            }

            public int hashCode() {
                return this.chatDetailDismissKey.hashCode();
            }

            public String toString() {
                return super.toString();
            }
        }

        public final class ExecutionFailed implements IdeasEffect {
            public static final ExecutionFailed INSTANCE = new ExecutionFailed();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof ExecutionFailed);
            }

            public String toString() {
                return "ExecutionFailed";
            }

            public int hashCode() {
                return -1693691289;
            }
        }

        public final class FeedbackFailed implements IdeasEffect {
            public static final FeedbackFailed INSTANCE = new FeedbackFailed();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof FeedbackFailed);
            }

            public String toString() {
                return "FeedbackFailed";
            }

            public int hashCode() {
                return -573598480;
            }
        }

        public final class FeedbackSubmitted extends C06G implements IdeasEffect {
            public final IdeaFeedback feedback;

            public FeedbackSubmitted(IdeaFeedback ideaFeedback) {
                C7384Etj.A0Y(ideaFeedback, 0);
                this.feedback = ideaFeedback;
            }

            public final FeedbackSubmitted copy(IdeaFeedback ideaFeedback) {
                C7384Etj.A0Y(ideaFeedback, 0);
                return new FeedbackSubmitted(ideaFeedback);
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof FeedbackSubmitted) && this.feedback == ((FeedbackSubmitted) obj).feedback);
            }

            public static /* synthetic */ FeedbackSubmitted copy$default(FeedbackSubmitted feedbackSubmitted, IdeaFeedback ideaFeedback, int i, Object obj) {
                if ((i & 1) != 0) {
                    ideaFeedback = feedbackSubmitted.feedback;
                }
                C7384Etj.A0Y(ideaFeedback, 0);
                return new FeedbackSubmitted(ideaFeedback);
            }

            public final IdeaFeedback component1() {
                return this.feedback;
            }

            public final IdeaFeedback getFeedback() {
                return this.feedback;
            }

            public int hashCode() {
                return this.feedback.hashCode();
            }

            public String toString() {
                return super.toString();
            }
        }

        public final class IdeaRejected extends C06G implements IdeasEffect {
            public final String ideaCardId;

            public IdeaRejected(String str) {
                C7384Etj.A0Y(str, 0);
                this.ideaCardId = str;
            }

            public final IdeaRejected copy(String str) {
                C7384Etj.A0Y(str, 0);
                return new IdeaRejected(str);
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof IdeaRejected) && C7384Etj.areEqual(this.ideaCardId, ((IdeaRejected) obj).ideaCardId));
            }

            public static /* synthetic */ IdeaRejected copy$default(IdeaRejected ideaRejected, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = ideaRejected.ideaCardId;
                }
                C7384Etj.A0Y(str, 0);
                return new IdeaRejected(str);
            }

            public final String component1() {
                return this.ideaCardId;
            }

            public final String getIdeaCardId() {
                return this.ideaCardId;
            }

            public int hashCode() {
                return this.ideaCardId.hashCode();
            }

            public String toString() {
                return super.toString();
            }
        }

        public final class NavigateToChat implements IdeasEffect {
            public static final NavigateToChat INSTANCE = new NavigateToChat();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof NavigateToChat);
            }

            public String toString() {
                return "NavigateToChat";
            }

            public int hashCode() {
                return 613079570;
            }
        }
    }

    public final class IdeasUiState extends C06G {
        public final BO6<String, IdeaCardExecutionState> executionStatuses;
        public final boolean hasBuiltIdea;
        public final boolean hasMore;
        public final int imageRetryNonce;
        public final ExploreLoadingState loadingState;
        public final AHD<IdeaCardSection> sections;

        public static /* synthetic */ IdeasUiState copy$default(IdeasUiState ideasUiState, ExploreLoadingState exploreLoadingState, AHD ahd, BO6 bo6, boolean z, boolean z2, int i, int i2, Object obj) {
            ExploreLoadingState exploreLoadingState2 = exploreLoadingState;
            AHD ahd2 = ahd;
            BO6 bo62 = bo6;
            boolean z3 = z;
            boolean z4 = z2;
            int i3 = i;
            if ((i2 & 1) != 0) {
                exploreLoadingState2 = ideasUiState.loadingState;
            }
            if ((i2 & 2) != 0) {
                ahd2 = ideasUiState.sections;
            }
            if ((i2 & 4) != 0) {
                bo62 = ideasUiState.executionStatuses;
            }
            if ((i2 & 8) != 0) {
                z3 = ideasUiState.hasBuiltIdea;
            }
            if ((i2 & 16) != 0) {
                z4 = ideasUiState.hasMore;
            }
            if ((i2 & 32) != 0) {
                i3 = ideasUiState.imageRetryNonce;
            }
            AnonymousClass005.A0x(exploreLoadingState2, ahd2, bo62);
            return new IdeasUiState(exploreLoadingState2, ahd2, bo62, z3, z4, i3);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof IdeasUiState) {
                    IdeasUiState ideasUiState = (IdeasUiState) obj;
                    if (this.loadingState != ideasUiState.loadingState || !C7384Etj.areEqual(this.sections, ideasUiState.sections) || !C7384Etj.areEqual(this.executionStatuses, ideasUiState.executionStatuses) || this.hasBuiltIdea != ideasUiState.hasBuiltIdea || this.hasMore != ideasUiState.hasMore || this.imageRetryNonce != ideasUiState.imageRetryNonce) {
                    }
                }
                return false;
            }
            return true;
        }

        public IdeasUiState() {
            this(ExploreLoadingState.INITIAL, AHI.A01, C0953AJg.A00(), false, false, 0);
        }

        public final ExploreLoadingState component1() {
            return this.loadingState;
        }

        public final AHD<IdeaCardSection> component2() {
            return this.sections;
        }

        public final BO6<String, IdeaCardExecutionState> component3() {
            return this.executionStatuses;
        }

        public final boolean component4() {
            return this.hasBuiltIdea;
        }

        public final boolean component5() {
            return this.hasMore;
        }

        public final int component6() {
            return this.imageRetryNonce;
        }

        public final BO6<String, IdeaCardExecutionState> getExecutionStatuses() {
            return this.executionStatuses;
        }

        public final boolean getHasBuiltIdea() {
            return this.hasBuiltIdea;
        }

        public final boolean getHasMore() {
            return this.hasMore;
        }

        public final int getImageRetryNonce() {
            return this.imageRetryNonce;
        }

        public final ExploreLoadingState getLoadingState() {
            return this.loadingState;
        }

        public final AHD<IdeaCardSection> getSections() {
            return this.sections;
        }

        public int hashCode() {
            return C0KA.A01(C0KA.A01(AnonymousClass005.A0F(this.executionStatuses, AnonymousClass005.A0F(this.sections, AnonymousClass005.A0E(this.loadingState))), this.hasBuiltIdea), this.hasMore) + this.imageRetryNonce;
        }

        public final IdeasUiState copy(ExploreLoadingState exploreLoadingState, AHD<IdeaCardSection> ahd, BO6<String, ? extends IdeaCardExecutionState> bo6, boolean z, boolean z2, int i) {
            AnonymousClass005.A0x(exploreLoadingState, ahd, bo6);
            return new IdeasUiState(exploreLoadingState, ahd, bo6, z, z2, i);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ IdeasUiState(ExploreLoadingState exploreLoadingState, AHD ahd, BO6 bo6, boolean z, boolean z2, int i, int i2, C06H c06h) {
            this((i2 & 1) != 0 ? ExploreLoadingState.INITIAL : exploreLoadingState, (i2 & 2) != 0 ? AHI.A01 : ahd, (i2 & 4) != 0 ? C0953AJg.A00() : bo6, AnonymousClass005.A1P(i2, z), AnonymousClass005.A1Q(i2, z2), (i2 & 32) != 0 ? 0 : i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public IdeasUiState(ExploreLoadingState exploreLoadingState, AHD<IdeaCardSection> ahd, BO6<String, ? extends IdeaCardExecutionState> bo6, boolean z, boolean z2, int i) {
            AnonymousClass005.A0x(exploreLoadingState, ahd, bo6);
            this.loadingState = exploreLoadingState;
            this.sections = ahd;
            this.executionStatuses = bo6;
            this.hasBuiltIdea = z;
            this.hasMore = z2;
            this.imageRetryNonce = i;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.explore.model.HatchExploreViewModel$executeCard$2", f = "HatchExploreViewModel.kt", l = {211}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.explore.model.HatchExploreViewModel$executeCard$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $chatDetailDismissKey;
        public final /* synthetic */ String $ideaCardId;
        public final /* synthetic */ IdeaCardDetailOrigin $origin;
        public final /* synthetic */ List<String> $selectedItemIds;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, List<String> list, IdeaCardDetailOrigin ideaCardDetailOrigin, String str2, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$ideaCardId = str;
            this.$selectedItemIds = list;
            this.$origin = ideaCardDetailOrigin;
            this.$chatDetailDismissKey = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchExploreViewModel.this.new AnonymousClass2(this.$ideaCardId, this.$selectedItemIds, this.$origin, this.$chatDetailDismissKey, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            IdeasUiState value;
            BO6 bo6A08;
            ExploreLoadingState exploreLoadingState;
            AHD<IdeaCardSection> ahd;
            boolean z;
            boolean z2;
            int i;
            C3Em<IdeasEffect> c3Em;
            IdeasEffect dismissChatDetail;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i2 = this.label;
            if (i2 == 0) {
                Hwg.A00(obj);
                IdeaCardsDataSource ideaCardsDataSource = HatchExploreViewModel.this.ideaCardsDataSource;
                String str = this.$ideaCardId;
                List<String> list = this.$selectedItemIds;
                this.label = 1;
                obj = ideaCardsDataSource.executeCard(str, list, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i2 != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            IdeaCardExecutionState ideaCardExecutionState = obj != null ? IdeaCardExecutionState.SUCCESS : IdeaCardExecutionState.FAILED;
            BLG<IdeasUiState> blg = HatchExploreViewModel.this._ideasUiState;
            String str2 = this.$ideaCardId;
            do {
                value = blg.getValue();
                IdeasUiState ideasUiState = value;
                bo6A08 = AGI.A08(AnonymousClass006.A11(str2, ideaCardExecutionState, ideasUiState.executionStatuses));
                exploreLoadingState = ideasUiState.loadingState;
                ahd = ideasUiState.sections;
                z = ideasUiState.hasBuiltIdea;
                z2 = ideasUiState.hasMore;
                i = ideasUiState.imageRetryNonce;
                AnonymousClass005.A0x(exploreLoadingState, ahd, bo6A08);
            } while (!blg.A6e(value, new IdeasUiState(exploreLoadingState, ahd, bo6A08, z, z2, i)));
            if (ideaCardExecutionState == IdeaCardExecutionState.SUCCESS) {
                HatchInAppReviewTrigger.INSTANCE.onIdeaCreated();
                if (this.$origin == IdeaCardDetailOrigin.FEED) {
                    HatchExploreViewModel.this._ideasEffect.AhV(IdeasEffect.NavigateToChat.INSTANCE);
                    HatchExploreViewModel.refreshIdeas$default(HatchExploreViewModel.this, ExploreLoadingState.REFRESH_SILENTLY, false, false, 4, null);
                } else {
                    String str3 = this.$chatDetailDismissKey;
                    if (str3 != null) {
                        c3Em = HatchExploreViewModel.this._ideasEffect;
                        dismissChatDetail = new IdeasEffect.DismissChatDetail(str3);
                    }
                }
                return Unit.INSTANCE;
            }
            c3Em = HatchExploreViewModel.this._ideasEffect;
            dismissChatDetail = IdeasEffect.ExecutionFailed.INSTANCE;
            c3Em.AhV(dismissChatDetail);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.explore.model.HatchExploreViewModel$loadIdeasIfNeeded$2", f = "HatchExploreViewModel.kt", l = {116}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.explore.model.HatchExploreViewModel$loadIdeasIfNeeded$2, reason: invalid class name and case insensitive filesystem */
    public final class C118422 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C118422(HtJ<? super C118422> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchExploreViewModel.this.new C118422(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            IdeasUiState value;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                IdeaCardsDataSource ideaCardsDataSource = HatchExploreViewModel.this.ideaCardsDataSource;
                this.label = 1;
                obj = ideaCardsDataSource.loadFeed(false, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            boolean zA1X = AnonymousClass001.A1X(obj);
            BLG<IdeasUiState> blg = HatchExploreViewModel.this._ideasUiState;
            do {
                value = blg.getValue();
            } while (!C06G.A0r(value, zA1X ? ExploreLoadingState.LOADED : ExploreLoadingState.ERROR, value, blg));
            HatchExploreViewModel.this.ideasLoadJob = null;
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchExploreViewModel.this.new C118422(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.explore.model.HatchExploreViewModel$loadMoreIdeas$2", f = "HatchExploreViewModel.kt", l = {187}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.explore.model.HatchExploreViewModel$loadMoreIdeas$2, reason: invalid class name and case insensitive filesystem */
    public final class C118432 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C118432(HtJ<? super C118432> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchExploreViewModel.this.new C118432(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            IdeasUiState value;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                IdeaCardsDataSource ideaCardsDataSource = HatchExploreViewModel.this.ideaCardsDataSource;
                this.label = 1;
                if (ideaCardsDataSource.loadNext(this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            BLG<IdeasUiState> blg = HatchExploreViewModel.this._ideasUiState;
            do {
                value = blg.getValue();
            } while (!C06G.A0r(value, ExploreLoadingState.LOADED, value, blg));
            HatchExploreViewModel.this.ideasLoadMoreJob = null;
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchExploreViewModel.this.new C118432(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.explore.model.HatchExploreViewModel$observeIdeasDataSource$1", f = "HatchExploreViewModel.kt", l = {323}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.explore.model.HatchExploreViewModel$observeIdeasDataSource$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchExploreViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final HatchExploreViewModel hatchExploreViewModel = HatchExploreViewModel.this;
                C1BN<IdeasFeedState> c1bn = hatchExploreViewModel.ideaCardsDataSource.feedState;
                C20Z<? super IdeasFeedState> c20z = new C20Z() { // from class: com.facebook.aura.explore.model.HatchExploreViewModel.observeIdeasDataSource.1.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((IdeasFeedState) obj2, (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(IdeasFeedState ideasFeedState, HtJ<? super Unit> htJ) {
                        IdeasUiState value;
                        ExploreLoadingState exploreLoadingState;
                        AHD<IdeaCardSection> ahd;
                        boolean z;
                        boolean z2;
                        BO6<String, IdeaCardExecutionState> bo6;
                        int i2;
                        BLG<IdeasUiState> blg = hatchExploreViewModel._ideasUiState;
                        do {
                            value = blg.getValue();
                            IdeasUiState ideasUiState = value;
                            ExploreLoadingState exploreLoadingState2 = ideasFeedState.loadingState;
                            exploreLoadingState = ExploreLoadingState.REFRESH_SILENTLY;
                            if (exploreLoadingState2 != exploreLoadingState && exploreLoadingState2 != (exploreLoadingState = ExploreLoadingState.LOADED) && exploreLoadingState2 != (exploreLoadingState = ExploreLoadingState.ERROR)) {
                                if (!ideasFeedState.sections.isEmpty() && ideasUiState.loadingState == ExploreLoadingState.LOADING) {
                                    exploreLoadingState = ExploreLoadingState.LOADING_MORE;
                                } else {
                                    exploreLoadingState = ideasUiState.loadingState;
                                }
                            }
                            ahd = ideasFeedState.sections;
                            z = ideasFeedState.hasBuiltIdea;
                            z2 = ideasFeedState.hasNextPage;
                            bo6 = ideasUiState.executionStatuses;
                            i2 = ideasUiState.imageRetryNonce;
                            AnonymousClass005.A0x(exploreLoadingState, ahd, bo6);
                        } while (!blg.A6e(value, new IdeasUiState(exploreLoadingState, ahd, bo6, z, z2, i2)));
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (c1bn.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchExploreViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.explore.model.HatchExploreViewModel$recordIdeaCardClick$1", f = "HatchExploreViewModel.kt", l = {305}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.explore.model.HatchExploreViewModel$recordIdeaCardClick$1, reason: invalid class name and case insensitive filesystem */
    public final class C118441 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $cardType;
        public final /* synthetic */ String $ideaCardID;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118441(String str, String str2, HtJ<? super C118441> htJ) {
            super(2, htJ);
            this.$ideaCardID = str;
            this.$cardType = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchExploreViewModel.this.new C118441(this.$ideaCardID, this.$cardType, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchExploreViewModel hatchExploreViewModel = HatchExploreViewModel.this;
                IdeaCardsDataSource ideaCardsDataSource = hatchExploreViewModel.ideaCardsDataSource;
                String str = this.$ideaCardID;
                HatchEngagementEventType hatchEngagementEventType = HatchEngagementEventType.CLICK;
                JsonObject jsonObjectEngagementMetadata = hatchExploreViewModel.engagementMetadata("android_tap", this.$cardType);
                this.label = 1;
                if (ideaCardsDataSource.recordIdeaEngagement(str, hatchEngagementEventType, HatchExploreViewModel.ENGAGEMENT_SURFACE, null, null, null, null, jsonObjectEngagementMetadata, this) == enumC10460Hji) {
                    return enumC10460Hji;
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
            return ((C118441) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.explore.model.HatchExploreViewModel$recordIdeaCardImpression$1", f = "HatchExploreViewModel.kt", l = {293}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.explore.model.HatchExploreViewModel$recordIdeaCardImpression$1, reason: invalid class name and case insensitive filesystem */
    public final class C118451 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $cardType;
        public final /* synthetic */ String $ideaCardID;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118451(String str, String str2, HtJ<? super C118451> htJ) {
            super(2, htJ);
            this.$ideaCardID = str;
            this.$cardType = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchExploreViewModel.this.new C118451(this.$ideaCardID, this.$cardType, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchExploreViewModel hatchExploreViewModel = HatchExploreViewModel.this;
                IdeaCardsDataSource ideaCardsDataSource = hatchExploreViewModel.ideaCardsDataSource;
                String str = this.$ideaCardID;
                HatchEngagementEventType hatchEngagementEventType = HatchEngagementEventType.IMPRESSION;
                JsonObject jsonObjectEngagementMetadata = hatchExploreViewModel.engagementMetadata(HatchExploreViewModel.VIEWPORT_IMPRESSION_SOURCE, this.$cardType);
                this.label = 1;
                if (ideaCardsDataSource.recordIdeaEngagement(str, hatchEngagementEventType, HatchExploreViewModel.ENGAGEMENT_SURFACE, null, null, null, null, jsonObjectEngagementMetadata, this) == enumC10460Hji) {
                    return enumC10460Hji;
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
            return ((C118451) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.explore.model.HatchExploreViewModel$refreshIdeas$2", f = "HatchExploreViewModel.kt", l = {154}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.explore.model.HatchExploreViewModel$refreshIdeas$2, reason: invalid class name and case insensitive filesystem */
    public final class C118462 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C118462(HtJ<? super C118462> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchExploreViewModel.this.new C118462(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            IdeasUiState value;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                IdeaCardsDataSource ideaCardsDataSource = HatchExploreViewModel.this.ideaCardsDataSource;
                this.label = 1;
                obj = ideaCardsDataSource.loadFeed(false, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            boolean zA1X = AnonymousClass001.A1X(obj);
            BLG<IdeasUiState> blg = HatchExploreViewModel.this._ideasUiState;
            do {
                value = blg.getValue();
            } while (!C06G.A0r(value, zA1X ? ExploreLoadingState.LOADED : ExploreLoadingState.ERROR, value, blg));
            HatchExploreViewModel.this.ideasLoadJob = null;
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchExploreViewModel.this.new C118462(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.explore.model.HatchExploreViewModel$submitFeedback$1", f = "HatchExploreViewModel.kt", l = {257}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.explore.model.HatchExploreViewModel$submitFeedback$1, reason: invalid class name and case insensitive filesystem */
    public final class C118471 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ IdeaFeedback $feedback;
        public final /* synthetic */ String $ideaCardId;
        public final /* synthetic */ boolean $isBareDismissal;
        public final /* synthetic */ String $reason;
        public int label;

        /* renamed from: com.facebook.aura.explore.model.HatchExploreViewModel$submitFeedback$1$WhenMappings */
        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[IdeaFeedbackResult.values().length];
                try {
                    AnonymousClass002.A13(IdeaFeedbackResult.SUCCESS, iArr);
                } catch (NoSuchFieldError unused) {
                }
                try {
                    AnonymousClass002.A14(IdeaFeedbackResult.NOT_FOUND, iArr);
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    AnonymousClass002.A15(IdeaFeedbackResult.FAILED, iArr);
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118471(String str, IdeaFeedback ideaFeedback, String str2, boolean z, HtJ<? super C118471> htJ) {
            super(2, htJ);
            this.$ideaCardId = str;
            this.$feedback = ideaFeedback;
            this.$reason = str2;
            this.$isBareDismissal = z;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchExploreViewModel.this.new C118471(this.$ideaCardId, this.$feedback, this.$reason, this.$isBareDismissal, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                X.Hji r6 = X.EnumC10460Hji.A02
                int r0 = r7.label
                r5 = 1
                r4 = 0
                if (r0 == 0) goto L44
                if (r0 != r5) goto L60
                X.Hwg.A00(r8)
            Ld:
                com.facebook.aura.explore.repo.IdeaFeedbackResult r8 = (com.facebook.aura.explore.repo.IdeaFeedbackResult) r8
                int r1 = r8.ordinal()
                if (r1 == r4) goto L31
                if (r1 == r5) goto L29
                r0 = 2
                if (r1 != r0) goto L5a
                com.facebook.aura.explore.model.HatchExploreViewModel r0 = com.facebook.aura.explore.model.HatchExploreViewModel.this
                X.3Em<com.facebook.aura.explore.model.HatchExploreViewModel$IdeasEffect> r1 = r0._ideasEffect
                com.facebook.aura.explore.model.HatchExploreViewModel$IdeasEffect$FeedbackFailed r0 = com.facebook.aura.explore.model.HatchExploreViewModel.IdeasEffect.FeedbackFailed.INSTANCE
                r1.AhV(r0)
                com.facebook.aura.explore.repo.IdeaFeedback r1 = r7.$feedback
                com.facebook.aura.explore.repo.IdeaFeedback r0 = com.facebook.aura.explore.repo.IdeaFeedback.DOWN
                if (r1 != r0) goto L2e
            L29:
                com.facebook.aura.explore.model.HatchExploreViewModel r0 = com.facebook.aura.explore.model.HatchExploreViewModel.this
                com.facebook.aura.explore.model.HatchExploreViewModel.access$refreshIdeasAfterFeedback(r0)
            L2e:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            L31:
                boolean r0 = r7.$isBareDismissal
                if (r0 != 0) goto L2e
                com.facebook.aura.explore.model.HatchExploreViewModel r0 = com.facebook.aura.explore.model.HatchExploreViewModel.this
                X.3Em<com.facebook.aura.explore.model.HatchExploreViewModel$IdeasEffect> r2 = r0._ideasEffect
                com.facebook.aura.explore.repo.IdeaFeedback r1 = r7.$feedback
                com.facebook.aura.explore.model.HatchExploreViewModel$IdeasEffect$FeedbackSubmitted r0 = new com.facebook.aura.explore.model.HatchExploreViewModel$IdeasEffect$FeedbackSubmitted
                r0.<init>(r1)
                r2.AhV(r0)
                goto L2e
            L44:
                X.Hwg.A00(r8)
                com.facebook.aura.explore.model.HatchExploreViewModel r0 = com.facebook.aura.explore.model.HatchExploreViewModel.this
                com.facebook.aura.explore.repo.IdeaCardsDataSource r3 = r0.ideaCardsDataSource
                java.lang.String r2 = r7.$ideaCardId
                com.facebook.aura.explore.repo.IdeaFeedback r1 = r7.$feedback
                java.lang.String r0 = r7.$reason
                r7.label = r5
                java.lang.Object r8 = r3.submitFeedback(r2, r1, r0, r7)
                if (r8 != r6) goto Ld
                return r6
            L5a:
                kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
                r0.<init>()
                throw r0
            L60:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.explore.model.HatchExploreViewModel.C118471.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C118471) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public HatchExploreViewModel(IdeaCardsDataSource ideaCardsDataSource) {
        C7384Etj.A0Y(ideaCardsDataSource, 0);
        this.ideaCardsDataSource = ideaCardsDataSource;
        C9286GCn c9286GCn = new C9286GCn(new IdeasUiState(ExploreLoadingState.INITIAL, AHI.A01, C0953AJg.A00(), false, false, 0));
        this._ideasUiState = c9286GCn;
        this.ideasUiState = new C3Pi(null, c9286GCn);
        C9290GCr c9290GCr = new C9290GCr(C79.A01, 0, 4);
        this._ideasEffect = c9290GCr;
        this.ideasEffect = new C3pd(c9290GCr);
        this.impressedIdeaCardIDs = new LinkedHashSet();
        observeIdeasDataSource();
    }

    public final void executeCard(String str, List<String> list, IdeaCardDetailOrigin ideaCardDetailOrigin, String str2) {
        IdeasUiState value;
        BO6 bo6A08;
        ExploreLoadingState exploreLoadingState;
        AHD<IdeaCardSection> ahd;
        boolean z;
        boolean z2;
        int i;
        AnonymousClass003.A0v(str, ideaCardDetailOrigin);
        IdeaCardExecutionState ideaCardExecutionState = this._ideasUiState.getValue().executionStatuses.get(str);
        if (ideaCardExecutionState == null) {
            ideaCardExecutionState = IdeaCardExecutionState.IDLE;
        }
        if (ideaCardExecutionState == IdeaCardExecutionState.IDLE || ideaCardExecutionState == IdeaCardExecutionState.FAILED) {
            BLG<IdeasUiState> blg = this._ideasUiState;
            do {
                value = blg.getValue();
                IdeasUiState ideasUiState = value;
                bo6A08 = AGI.A08(AnonymousClass006.A11(str, IdeaCardExecutionState.EXECUTING, ideasUiState.executionStatuses));
                exploreLoadingState = ideasUiState.loadingState;
                ahd = ideasUiState.sections;
                z = ideasUiState.hasBuiltIdea;
                z2 = ideasUiState.hasMore;
                i = ideasUiState.imageRetryNonce;
                AnonymousClass005.A0x(exploreLoadingState, ahd, bo6A08);
            } while (!blg.A6e(value, new IdeasUiState(exploreLoadingState, ahd, bo6A08, z, z2, i)));
            AnonymousClass001.A1J(new AnonymousClass2(str, list, ideaCardDetailOrigin, str2, null), AEu.A00(this));
        }
    }

    public final void removeIdea(String str) {
        C7384Etj.A0Y(str, 0);
        this.ideaCardsDataSource.removeCard(str);
    }

    public final void submitFeedback(String str, IdeaFeedback ideaFeedback, String str2) {
        boolean z;
        AnonymousClass003.A0u(str, ideaFeedback);
        if (str.length() != 0) {
            if (ideaFeedback == IdeaFeedback.DOWN && (str2 == null || C7BY.A0j(str2))) {
                z = true;
                this._ideasEffect.AhV(new IdeasEffect.IdeaRejected(str));
            } else {
                z = false;
            }
            AnonymousClass001.A1J(new C118471(str, ideaFeedback, str2, z, null), AEu.A00(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonObject engagementMetadata(String str, String str2) {
        return new JsonObject(AnonymousClass007.A0d("card_type", C9oY.A07(str2), new HxE(PhotosSearchHandlerKt.PARAM_SOURCE, C9oY.A07(str))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void executeCard$default(HatchExploreViewModel hatchExploreViewModel, String str, List list, IdeaCardDetailOrigin ideaCardDetailOrigin, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            list = null;
        }
        if ((i & 4) != 0) {
            ideaCardDetailOrigin = IdeaCardDetailOrigin.FEED;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        hatchExploreViewModel.executeCard(str, list, ideaCardDetailOrigin, str2);
    }

    private final void refreshIdeas(ExploreLoadingState exploreLoadingState, boolean z, boolean z2) {
        IdeasUiState value;
        BO6 bo6A00;
        int i;
        AHD<IdeaCardSection> ahd;
        boolean z3;
        boolean z4;
        HoC hoC = this.ideasLoadJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        this.ideasLoadJob = null;
        HoC hoC2 = this.ideasLoadMoreJob;
        if (hoC2 != null) {
            hoC2.A5w(null);
        }
        this.ideasLoadMoreJob = null;
        this.impressedIdeaCardIDs.clear();
        BLG<IdeasUiState> blg = this._ideasUiState;
        do {
            value = blg.getValue();
            IdeasUiState ideasUiState = value;
            bo6A00 = z2 ? C0953AJg.A00() : ideasUiState.executionStatuses;
            i = ideasUiState.imageRetryNonce;
            if (z) {
                i++;
            }
            ahd = ideasUiState.sections;
            z3 = ideasUiState.hasBuiltIdea;
            z4 = ideasUiState.hasMore;
            AnonymousClass005.A0x(exploreLoadingState, ahd, bo6A00);
        } while (!blg.A6e(value, new IdeasUiState(exploreLoadingState, ahd, bo6A00, z3, z4, i)));
        this.ideasLoadJob = AnonymousClass001.A11(new C118462(null), AEu.A00(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshIdeasAfterFeedback() {
        refreshIdeas(ExploreLoadingState.REFRESH_SILENTLY, false, false);
    }

    public final C22I<IdeasEffect> getIdeasEffect() {
        return this.ideasEffect;
    }

    public final C1BN<IdeasUiState> getIdeasUiState() {
        return this.ideasUiState;
    }

    public final void loadIdeasIfNeeded() {
        IdeasUiState value;
        if (this.ideasLoadJob == null && this._ideasUiState.getValue().sections.isEmpty()) {
            BLG<IdeasUiState> blg = this._ideasUiState;
            do {
                value = blg.getValue();
            } while (!C06G.A0r(value, ExploreLoadingState.LOADING, value, blg));
            this.ideasLoadJob = AnonymousClass001.A11(new C118422(null), AEu.A00(this));
        }
    }

    public final void loadMoreIdeas() {
        ExploreLoadingState exploreLoadingState;
        ExploreLoadingState exploreLoadingState2;
        IdeasUiState value;
        HoC hoC = this.ideasLoadMoreJob;
        if (hoC == null || !hoC.isActive()) {
            IdeasUiState value2 = this._ideasUiState.getValue();
            if (!value2.hasMore || (exploreLoadingState = value2.loadingState) == ExploreLoadingState.LOADING || exploreLoadingState == ExploreLoadingState.REFRESHING || exploreLoadingState == ExploreLoadingState.REFRESH_SILENTLY || exploreLoadingState == (exploreLoadingState2 = ExploreLoadingState.LOADING_MORE)) {
                return;
            }
            BLG<IdeasUiState> blg = this._ideasUiState;
            do {
                value = blg.getValue();
            } while (!C06G.A0r(value, exploreLoadingState2, value, blg));
            this.ideasLoadMoreJob = AnonymousClass001.A11(new C118432(null), AEu.A00(this));
        }
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    private final void observeIdeasDataSource() {
        AnonymousClass001.A1J(new AnonymousClass1(null), AEu.A00(this));
    }

    public static /* synthetic */ void refreshIdeas$default(HatchExploreViewModel hatchExploreViewModel, ExploreLoadingState exploreLoadingState, boolean z, boolean z2, int i, Object obj) {
        hatchExploreViewModel.refreshIdeas(exploreLoadingState, z, AnonymousClass005.A1O(i, z2));
    }

    public final void recordIdeaCardClick(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        if (str.length() != 0) {
            AnonymousClass001.A1I(AnonymousClass001.A0y(), new C118441(str, str2, null), AEu.A00(this));
        }
    }

    public final void recordIdeaCardImpression(IdeaCard ideaCard, String str) {
        AnonymousClass003.A0u(ideaCard, str);
        String str2 = ideaCard.ideaCardId;
        if (str2.length() == 0 || !this.impressedIdeaCardIDs.add(str2)) {
            return;
        }
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C118451(str2, str, null), AEu.A00(this));
    }

    public final void refreshIdeas() {
        refreshIdeas(ExploreLoadingState.REFRESHING, true, true);
    }
}
