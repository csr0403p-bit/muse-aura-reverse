package com.facebook.aura.feed.model;

import X.AEs;
import X.AEu;
import X.AGH;
import X.AHD;
import X.AIX;
import X.AIY;
import X.ATD;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC10623Hzj;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BLG;
import X.BLL;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C10571Hud;
import X.C1BN;
import X.C20Q;
import X.C20Z;
import X.C22I;
import X.C3Em;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3pd;
import X.C60O;
import X.C60Q;
import X.C60R;
import X.C6ys;
import X.C7384Etj;
import X.C79;
import X.C9286GCn;
import X.C9290GCr;
import X.CFK;
import X.EnumC10460Hji;
import X.Ey9;
import X.F1F;
import X.FGI;
import X.G0U;
import X.G0V;
import X.GAo;
import X.HoC;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import X.HzP;
import X.HzR;
import android.os.SystemClock;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.facebook.aura.agentpermission.MC;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.appreview.HatchInAppReviewTrigger;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.common.ui.StaggeredEntranceKt;
import com.facebook.aura.feed.repo.FeedCursorPage;
import com.facebook.aura.feed.repo.FeedInstructionsCardStore;
import com.facebook.aura.feed.repo.FeedPage;
import com.facebook.aura.feed.repo.FeedPrompt;
import com.facebook.aura.feed.repo.FeedReaction;
import com.facebook.aura.feed.repo.FeedRepository;
import com.facebook.aura.feed.repo.FeedStatus;
import com.facebook.aura.feed.repo.FeedTapKind;
import com.facebook.aura.feed.repo.FeedUnit;
import com.facebook.aura.feed.repo.FeedUnitView;
import com.facebook.aura.feed.repo.FeedUnitViewportContext;
import com.facebook.aura.feed.repo.FeedUpdatedEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class FeedViewModel extends AEs {
    public static final int $stable = 8;
    public final C3Em<Unit> _editSavedToastEvents;
    public final SnapshotStateList<FeedUnit> _feedItems;
    public final C3Em<FeedFeedbackPrompt> _feedbackPromptEvents;
    public final C3Em<Unit> _openUnitErrorEvents;
    public final BLG<FeedUiState> _uiState;
    public HoC anchorJob;
    public Long awaySinceElapsedMs;
    public CursorPaginationState cursorPaginationState;
    public final Set<String> discussionMaterializationInFlight;
    public final C22I<Unit> editSavedToastEvents;
    public final Set<String> ephemeralInfiniteUnitIds;
    public final SnapshotStateList<FeedUnit> feedItems;
    public final HzR<Boolean> feedReloadRequests;
    public final C22I<FeedFeedbackPrompt> feedbackPromptEvents;
    public boolean hasSeenFirstResume;
    public final SnapshotStateList<FeedUnit> infiniteItems;
    public InfinitePaginationState infinitePaginationState;
    public final InfiniteFeedTail infiniteTail;
    public final FeedInstructionsCardStore instructionsCardStore;
    public HoC loadNextPageJob;
    public HoC loadPreviousPageJob;
    public final Map<String, FeedUnit> materializedInfiniteUnits;
    public final C22I<Unit> openUnitErrorEvents;
    public FeedPaginationMode paginationMode;
    public final List<FeedUnitView> pendingViews;
    public HoC promptSeedRetryJob;
    public final FeedRepository repository;
    public final C1BN<FeedUiState> uiState;
    public final FeedVideoPrefetcher videoPrefetcher;
    public final HashMap<String, OpenViewSegment> visibleSince;

    @DebugMetadata(c = "com.facebook.aura.feed.model.FeedViewModel$2", f = "FeedViewModel.kt", l = {243, 245}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.feed.model.FeedViewModel$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public boolean Z$0;
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return FeedViewModel.this.new AnonymousClass2(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return FeedViewModel.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0024 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0036 -> B:10:0x0018). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x003a -> B:10:0x0018). Please report as a decompilation issue!!! */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                X.Hji r5 = X.EnumC10460Hji.A02
                int r0 = r6.label
                r4 = 2
                r3 = 1
                if (r0 == 0) goto L15
                if (r0 == r3) goto L25
                if (r0 != r4) goto L10
                X.Hwg.A00(r7)     // Catch: java.lang.Exception -> L39 java.util.concurrent.CancellationException -> L43
                goto L18
            L10:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            L15:
                X.Hwg.A00(r7)
            L18:
                com.facebook.aura.feed.model.FeedViewModel r0 = com.facebook.aura.feed.model.FeedViewModel.this
                X.HzR<java.lang.Boolean> r0 = r0.feedReloadRequests
                r6.label = r3
                java.lang.Object r7 = r0.AZg(r6)
                if (r7 != r5) goto L28
                return r5
            L25:
                X.Hwg.A00(r7)
            L28:
                boolean r1 = X.AnonymousClass001.A1X(r7)
                com.facebook.aura.feed.model.FeedViewModel r0 = com.facebook.aura.feed.model.FeedViewModel.this     // Catch: java.lang.Exception -> L39 java.util.concurrent.CancellationException -> L43
                r6.Z$0 = r1     // Catch: java.lang.Exception -> L39 java.util.concurrent.CancellationException -> L43
                r6.label = r4     // Catch: java.lang.Exception -> L39 java.util.concurrent.CancellationException -> L43
                java.lang.Object r0 = com.facebook.aura.feed.model.FeedViewModel.access$performFeedLoad(r0, r1, r6)     // Catch: java.lang.Exception -> L39 java.util.concurrent.CancellationException -> L43
                if (r0 != r5) goto L18
                goto L42
            L39:
                r2 = move-exception
                java.lang.String r1 = "feed load failed"
                java.lang.String r0 = "FeedViewModel"
                X.CFK.A08(r0, r1, r2)
                goto L18
            L42:
                return r5
            L43:
                r0 = move-exception
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.feed.model.FeedViewModel.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final class Factory extends AuraViewModelFactory<FeedViewModel> {
        public static final int $stable = 8;
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public FeedViewModel create() {
            return new FeedViewModel(FeedRepository.Companion.getInstance(this.userSession), FeedInstructionsCardStore.Companion.getInstance(this.userSession), new FeedVideoPrefetcher(this.userSession));
        }
    }

    /* loaded from: classes.dex */
    public final class FeedUiState extends C06G {
        public static final int $stable = 0;
        public final String anchoredUnitId;
        public final String draftInstructions;
        public final String errorMessage;
        public final String feedLoadErrorMessage;
        public final boolean hasCompletedInitialLoad;
        public final boolean hasNextPage;
        public final boolean hasPreviousPage;
        public final boolean instructionsCardDismissed;
        public final boolean isInitialLoading;
        public final boolean isLoadingNextPage;
        public final boolean isLoadingPreviousPage;
        public final boolean isOpeningUnit;
        public final boolean isRefreshing;
        public final boolean isRegenerating;
        public final FeedPrompt prompt;
        public final int scrollToTopToken;
        public final String scrollToUnitId;
        public final int scrollToUnitToken;
        public final FeedStatus status;

        public FeedUiState() {
            this(null, "", null, true, false, false, false, false, false, false, false, null, false, null, null, 0, null, 0, false);
        }

        public final FeedUiState copy(FeedPrompt feedPrompt, String str, FeedStatus feedStatus, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, String str2, boolean z9, String str3, String str4, int i, String str5, int i2, boolean z10) {
            C7384Etj.A0Y(str, 1);
            return new FeedUiState(feedPrompt, str, feedStatus, z, z2, z3, z4, z5, z6, z7, z8, str2, z9, str3, str4, i, str5, i2, z10);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof FeedUiState) {
                    FeedUiState feedUiState = (FeedUiState) obj;
                    if (!C7384Etj.areEqual(this.prompt, feedUiState.prompt) || !C7384Etj.areEqual(this.draftInstructions, feedUiState.draftInstructions) || !C7384Etj.areEqual(this.status, feedUiState.status) || this.isInitialLoading != feedUiState.isInitialLoading || this.hasCompletedInitialLoad != feedUiState.hasCompletedInitialLoad || this.isRefreshing != feedUiState.isRefreshing || this.isRegenerating != feedUiState.isRegenerating || this.hasNextPage != feedUiState.hasNextPage || this.hasPreviousPage != feedUiState.hasPreviousPage || this.isLoadingNextPage != feedUiState.isLoadingNextPage || this.isLoadingPreviousPage != feedUiState.isLoadingPreviousPage || !C7384Etj.areEqual(this.anchoredUnitId, feedUiState.anchoredUnitId) || this.isOpeningUnit != feedUiState.isOpeningUnit || !C7384Etj.areEqual(this.errorMessage, feedUiState.errorMessage) || !C7384Etj.areEqual(this.feedLoadErrorMessage, feedUiState.feedLoadErrorMessage) || this.scrollToTopToken != feedUiState.scrollToTopToken || !C7384Etj.areEqual(this.scrollToUnitId, feedUiState.scrollToUnitId) || this.scrollToUnitToken != feedUiState.scrollToUnitToken || this.instructionsCardDismissed != feedUiState.instructionsCardDismissed) {
                    }
                }
                return false;
            }
            return true;
        }

        public final FeedPrompt component1() {
            return this.prompt;
        }

        public final boolean component10() {
            return this.isLoadingNextPage;
        }

        public final boolean component11() {
            return this.isLoadingPreviousPage;
        }

        public final String component12() {
            return this.anchoredUnitId;
        }

        public final boolean component13() {
            return this.isOpeningUnit;
        }

        public final String component14() {
            return this.errorMessage;
        }

        public final String component15() {
            return this.feedLoadErrorMessage;
        }

        public final int component16() {
            return this.scrollToTopToken;
        }

        public final String component17() {
            return this.scrollToUnitId;
        }

        public final int component18() {
            return this.scrollToUnitToken;
        }

        public final boolean component19() {
            return this.instructionsCardDismissed;
        }

        public final String component2() {
            return this.draftInstructions;
        }

        public final FeedStatus component3() {
            return this.status;
        }

        public final boolean component4() {
            return this.isInitialLoading;
        }

        public final boolean component5() {
            return this.hasCompletedInitialLoad;
        }

        public final boolean component6() {
            return this.isRefreshing;
        }

        public final boolean component7() {
            return this.isRegenerating;
        }

        public final boolean component8() {
            return this.hasNextPage;
        }

        public final boolean component9() {
            return this.hasPreviousPage;
        }

        public final String getAnchoredUnitId() {
            return this.anchoredUnitId;
        }

        public final String getDraftInstructions() {
            return this.draftInstructions;
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public final String getFeedLoadErrorMessage() {
            return this.feedLoadErrorMessage;
        }

        public final boolean getHasCompletedInitialLoad() {
            return this.hasCompletedInitialLoad;
        }

        public final boolean getHasNextPage() {
            return this.hasNextPage;
        }

        public final boolean getHasPreviousPage() {
            return this.hasPreviousPage;
        }

        public final boolean getHasPrompt() {
            return AnonymousClass002.A1X(this.prompt);
        }

        public final boolean getInstructionsCardDismissed() {
            return this.instructionsCardDismissed;
        }

        public final FeedPrompt getPrompt() {
            return this.prompt;
        }

        public final int getScrollToTopToken() {
            return this.scrollToTopToken;
        }

        public final String getScrollToUnitId() {
            return this.scrollToUnitId;
        }

        public final int getScrollToUnitToken() {
            return this.scrollToUnitToken;
        }

        public final FeedStatus getStatus() {
            return this.status;
        }

        public int hashCode() {
            return C0KA.A00((((((((((C0KA.A01((C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01((AnonymousClass005.A0I(this.draftInstructions, AnonymousClass006.A0D(this.prompt) * 31) + AnonymousClass006.A0D(this.status)) * 31, this.isInitialLoading), this.hasCompletedInitialLoad), this.isRefreshing), this.isRegenerating), this.hasNextPage), this.hasPreviousPage), this.isLoadingNextPage), this.isLoadingPreviousPage) + AnonymousClass006.A0G(this.anchoredUnitId)) * 31, this.isOpeningUnit) + AnonymousClass006.A0G(this.errorMessage)) * 31) + AnonymousClass006.A0G(this.feedLoadErrorMessage)) * 31) + this.scrollToTopToken) * 31) + AnonymousClass005.A0H(this.scrollToUnitId)) * 31) + this.scrollToUnitToken) * 31, this.instructionsCardDismissed);
        }

        public final boolean isInitialLoading() {
            return this.isInitialLoading;
        }

        public final boolean isLoadingNextPage() {
            return this.isLoadingNextPage;
        }

        public final boolean isLoadingPreviousPage() {
            return this.isLoadingPreviousPage;
        }

        public final boolean isOpeningUnit() {
            return this.isOpeningUnit;
        }

        public final boolean isRefreshing() {
            return this.isRefreshing;
        }

        public final boolean isRegenerating() {
            return this.isRegenerating;
        }

        public String toString() {
            return super.toString();
        }

        public static /* synthetic */ FeedUiState copy$default(FeedUiState feedUiState, FeedPrompt feedPrompt, String str, FeedStatus feedStatus, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, String str2, boolean z9, String str3, String str4, int i, String str5, int i2, boolean z10, int i3, Object obj) {
            FeedPrompt feedPrompt2 = feedPrompt;
            String str6 = str;
            FeedStatus feedStatus2 = feedStatus;
            boolean z11 = z;
            boolean z12 = z2;
            boolean z13 = z3;
            boolean z14 = z4;
            boolean z15 = z5;
            boolean z16 = z6;
            boolean z17 = z7;
            boolean z18 = z8;
            String str7 = str2;
            boolean z19 = z9;
            String str8 = str3;
            String str9 = str4;
            int i4 = i;
            String str10 = str5;
            int i5 = i2;
            boolean z20 = z10;
            if ((i3 & 1) != 0) {
                feedPrompt2 = feedUiState.prompt;
            }
            if ((i3 & 2) != 0) {
                str6 = feedUiState.draftInstructions;
            }
            if ((i3 & 4) != 0) {
                feedStatus2 = feedUiState.status;
            }
            if ((i3 & 8) != 0) {
                z11 = feedUiState.isInitialLoading;
            }
            if ((i3 & 16) != 0) {
                z12 = feedUiState.hasCompletedInitialLoad;
            }
            if ((i3 & 32) != 0) {
                z13 = feedUiState.isRefreshing;
            }
            if ((i3 & 64) != 0) {
                z14 = feedUiState.isRegenerating;
            }
            if ((i3 & 128) != 0) {
                z15 = feedUiState.hasNextPage;
            }
            if ((i3 & 256) != 0) {
                z16 = feedUiState.hasPreviousPage;
            }
            if ((i3 & 512) != 0) {
                z17 = feedUiState.isLoadingNextPage;
            }
            if ((i3 & 1024) != 0) {
                z18 = feedUiState.isLoadingPreviousPage;
            }
            if ((i3 & 2048) != 0) {
                str7 = feedUiState.anchoredUnitId;
            }
            if ((i3 & 4096) != 0) {
                z19 = feedUiState.isOpeningUnit;
            }
            if ((i3 & 8192) != 0) {
                str8 = feedUiState.errorMessage;
            }
            if ((i3 & 16384) != 0) {
                str9 = feedUiState.feedLoadErrorMessage;
            }
            if ((i3 & 32768) != 0) {
                i4 = feedUiState.scrollToTopToken;
            }
            if ((i3 & 65536) != 0) {
                str10 = feedUiState.scrollToUnitId;
            }
            if ((i3 & 131072) != 0) {
                i5 = feedUiState.scrollToUnitToken;
            }
            if ((i3 & 262144) != 0) {
                z20 = feedUiState.instructionsCardDismissed;
            }
            boolean z21 = z14;
            return feedUiState.copy(feedPrompt2, str6, feedStatus2, z11, z12, z13, z21, z15, z16, z17, z18, str7, z19, str8, str9, i4, str10, i5, z20);
        }

        public FeedUiState(FeedPrompt feedPrompt, String str, FeedStatus feedStatus, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, String str2, boolean z9, String str3, String str4, int i, String str5, int i2, boolean z10) {
            C7384Etj.A0Y(str, 1);
            this.prompt = feedPrompt;
            this.draftInstructions = str;
            this.status = feedStatus;
            this.isInitialLoading = z;
            this.hasCompletedInitialLoad = z2;
            this.isRefreshing = z3;
            this.isRegenerating = z4;
            this.hasNextPage = z5;
            this.hasPreviousPage = z6;
            this.isLoadingNextPage = z7;
            this.isLoadingPreviousPage = z8;
            this.anchoredUnitId = str2;
            this.isOpeningUnit = z9;
            this.errorMessage = str3;
            this.feedLoadErrorMessage = str4;
            this.scrollToTopToken = i;
            this.scrollToUnitId = str5;
            this.scrollToUnitToken = i2;
            this.instructionsCardDismissed = z10;
        }

        public /* synthetic */ FeedUiState(FeedPrompt feedPrompt, String str, FeedStatus feedStatus, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, String str2, boolean z9, String str3, String str4, int i, String str5, int i2, boolean z10, int i3, C06H c06h) {
            this((i3 & 1) != 0 ? null : feedPrompt, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? null : feedStatus, (i3 & 8) != 0 ? true : z, (i3 & 16) != 0 ? false : z2, AnonymousClass002.A1R(i3, z3), (i3 & 64) != 0 ? false : z4, (i3 & 128) != 0 ? false : z5, (i3 & 256) != 0 ? false : z6, (i3 & 512) != 0 ? false : z7, (i3 & 1024) != 0 ? false : z8, (i3 & 2048) != 0 ? null : str2, (i3 & 4096) != 0 ? false : z9, (i3 & 8192) != 0 ? null : str3, (i3 & 16384) != 0 ? null : str4, (i3 & 32768) != 0 ? 0 : i, (i3 & 65536) != 0 ? null : str5, (i3 & 131072) != 0 ? 0 : i2, C06G.A0o(i3, 262144, z10));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class PageMerge {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ PageMerge[] $VALUES;
        public static final PageMerge APPEND;
        public static final PageMerge PREPEND;
        public static final PageMerge REPLACE;

        static {
            PageMerge pageMerge = new PageMerge("REPLACE", 0);
            REPLACE = pageMerge;
            PageMerge pageMerge2 = new PageMerge("APPEND", 1);
            APPEND = pageMerge2;
            PageMerge pageMerge3 = new PageMerge("PREPEND", 2);
            PREPEND = pageMerge3;
            PageMerge[] pageMergeArr = {pageMerge, pageMerge2, pageMerge3};
            $VALUES = pageMergeArr;
            $ENTRIES = C3cG.A0w(pageMergeArr);
        }

        public static Ey9<PageMerge> getEntries() {
            return $ENTRIES;
        }

        public static PageMerge valueOf(String str) {
            return (PageMerge) Enum.valueOf(PageMerge.class, str);
        }

        public static PageMerge[] values() {
            return (PageMerge[]) $VALUES.clone();
        }

        public PageMerge(String str, int i) {
        }
    }

    @DebugMetadata(c = "com.facebook.aura.feed.model.FeedViewModel$deleteUnit$1", f = "FeedViewModel.kt", l = {642}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.feed.model.FeedViewModel$deleteUnit$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ FeedUnit $removedFeedUnit;
        public final /* synthetic */ int $removedIndex;
        public final /* synthetic */ String $unitId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, int i, FeedUnit feedUnit, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$unitId = str;
            this.$removedIndex = i;
            this.$removedFeedUnit = feedUnit;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return FeedViewModel.this.new AnonymousClass1(this.$unitId, this.$removedIndex, this.$removedFeedUnit, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM805deleteUnitgIAlus;
            BLG<FeedUiState> blg;
            FeedUiState value;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                FeedRepository feedRepository = FeedViewModel.this.repository;
                String str = this.$unitId;
                this.label = 1;
                objM805deleteUnitgIAlus = feedRepository.m805deleteUnitgIAlus(str, this);
                if (objM805deleteUnitgIAlus == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM805deleteUnitgIAlus = AnonymousClass002.A0j(obj);
            }
            FeedViewModel feedViewModel = FeedViewModel.this;
            int i2 = this.$removedIndex;
            FeedUnit feedUnit = this.$removedFeedUnit;
            String str2 = this.$unitId;
            Throwable thA00 = HsJ.A00(objM805deleteUnitgIAlus);
            if (thA00 != null) {
                SnapshotStateList<FeedUnit> snapshotStateList = feedViewModel._feedItems;
                if ((snapshotStateList instanceof Collection) && snapshotStateList.isEmpty()) {
                    SnapshotStateList<FeedUnit> snapshotStateList2 = feedViewModel._feedItems;
                    snapshotStateList2.add(ATD.A04(i2, 0, snapshotStateList2.size()), feedUnit);
                    blg = feedViewModel._uiState;
                    do {
                        value = blg.getValue();
                    } while (!AbstractC07127nr.A0J(value, value, AbstractC07127nr.A07(thA00), blg));
                } else {
                    Iterator it = snapshotStateList.iterator();
                    while (it.hasNext()) {
                        if (C7384Etj.areEqual(C60Q.A0m(it), str2)) {
                            break;
                        }
                    }
                    SnapshotStateList<FeedUnit> snapshotStateList22 = feedViewModel._feedItems;
                    snapshotStateList22.add(ATD.A04(i2, 0, snapshotStateList22.size()), feedUnit);
                    blg = feedViewModel._uiState;
                    do {
                        value = blg.getValue();
                    } while (!AbstractC07127nr.A0J(value, value, AbstractC07127nr.A07(thA00), blg));
                }
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.feed.model.FeedViewModel$loadNextCursorPage$1", f = "FeedViewModel.kt", l = {535}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.feed.model.FeedViewModel$loadNextCursorPage$1, reason: invalid class name and case insensitive filesystem */
    public final class C118641 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $cursor;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118641(String str, HtJ<? super C118641> htJ) {
            super(2, htJ);
            this.$cursor = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return FeedViewModel.this.new C118641(this.$cursor, htJ);
        }

        /* JADX WARN: Finally extract failed */
        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            FeedUiState value;
            FeedUiState value2;
            Object objM807getCursorFeed0E7RQCE;
            FeedUiState value3;
            FeedUiState value4;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    BLG<FeedUiState> blg = FeedViewModel.this._uiState;
                    do {
                        value2 = blg.getValue();
                    } while (!blg.A6e(value2, FeedUiState.copy$default(value2, null, null, null, false, false, false, false, false, false, true, false, null, false, null, null, 0, null, 0, false, 507391, null)));
                    FeedRepository feedRepository = FeedViewModel.this.repository;
                    String str = this.$cursor;
                    this.label = 1;
                    objM807getCursorFeed0E7RQCE = feedRepository.m807getCursorFeed0E7RQCE(str, null, this);
                    if (objM807getCursorFeed0E7RQCE == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    objM807getCursorFeed0E7RQCE = AnonymousClass002.A0j(obj);
                }
                FeedViewModel feedViewModel = FeedViewModel.this;
                if (!(objM807getCursorFeed0E7RQCE instanceof C10571Hud)) {
                    feedViewModel.applyCursorPage((FeedCursorPage) objM807getCursorFeed0E7RQCE, PageMerge.APPEND);
                }
                FeedViewModel feedViewModel2 = FeedViewModel.this;
                Throwable thA00 = HsJ.A00(objM807getCursorFeed0E7RQCE);
                if (thA00 != null) {
                    BLG<FeedUiState> blg2 = feedViewModel2._uiState;
                    do {
                        value4 = blg2.getValue();
                    } while (!blg2.A6e(value4, FeedUiState.copy$default(value4, null, null, null, false, false, false, false, false, false, false, false, null, false, null, AbstractC07127nr.A07(thA00), 0, null, 0, false, 507903, null)));
                }
                BLG<FeedUiState> blg3 = FeedViewModel.this._uiState;
                do {
                    value3 = blg3.getValue();
                } while (!blg3.A6e(value3, FeedUiState.copy$default(value3, null, null, null, false, false, false, false, false, false, false, false, null, false, null, null, 0, null, 0, false, 523775, null)));
                FeedViewModel.this.loadNextPageJob = null;
                return Unit.INSTANCE;
            } catch (Throwable th) {
                BLG<FeedUiState> blg4 = FeedViewModel.this._uiState;
                do {
                    value = blg4.getValue();
                } while (!blg4.A6e(value, FeedUiState.copy$default(value, null, null, null, false, false, false, false, false, false, false, false, null, false, null, null, 0, null, 0, false, 523775, null)));
                FeedViewModel.this.loadNextPageJob = null;
                throw th;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C118641) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.feed.model.FeedViewModel$loadNextInfinitePage$1", f = "FeedViewModel.kt", l = {488}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.feed.model.FeedViewModel$loadNextInfinitePage$1, reason: invalid class name and case insensitive filesystem */
    public final class C118651 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public int label;

        public C118651(HtJ<? super C118651> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return FeedViewModel.this.new C118651(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return FeedViewModel.this.new C118651(htJ).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x00e7, code lost:
        
            if (r1 == 0) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x0155, code lost:
        
            if (r1 == 0) goto L70;
         */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00e3  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00fd A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00ff  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0155  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0158  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0173 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0175  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r28) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 444
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.feed.model.FeedViewModel.C118651.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @DebugMetadata(c = "com.facebook.aura.feed.model.FeedViewModel$loadPreviousPage$1", f = "FeedViewModel.kt", l = {428}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.feed.model.FeedViewModel$loadPreviousPage$1, reason: invalid class name and case insensitive filesystem */
    public final class C118661 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $cursor;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118661(String str, HtJ<? super C118661> htJ) {
            super(2, htJ);
            this.$cursor = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return FeedViewModel.this.new C118661(this.$cursor, htJ);
        }

        /* JADX WARN: Finally extract failed */
        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            FeedUiState value;
            FeedUiState value2;
            Object objM807getCursorFeed0E7RQCE;
            FeedUiState value3;
            FeedUiState value4;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    BLG<FeedUiState> blg = FeedViewModel.this._uiState;
                    do {
                        value2 = blg.getValue();
                    } while (!blg.A6e(value2, FeedUiState.copy$default(value2, null, null, null, false, false, false, false, false, false, false, true, null, false, null, null, 0, null, 0, false, 506879, null)));
                    FeedRepository feedRepository = FeedViewModel.this.repository;
                    String str = this.$cursor;
                    this.label = 1;
                    objM807getCursorFeed0E7RQCE = feedRepository.m807getCursorFeed0E7RQCE(str, null, this);
                    if (objM807getCursorFeed0E7RQCE == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    objM807getCursorFeed0E7RQCE = AnonymousClass002.A0j(obj);
                }
                FeedViewModel feedViewModel = FeedViewModel.this;
                if (!(objM807getCursorFeed0E7RQCE instanceof C10571Hud)) {
                    feedViewModel.applyCursorPage((FeedCursorPage) objM807getCursorFeed0E7RQCE, PageMerge.PREPEND);
                }
                FeedViewModel feedViewModel2 = FeedViewModel.this;
                Throwable thA00 = HsJ.A00(objM807getCursorFeed0E7RQCE);
                if (thA00 != null) {
                    BLG<FeedUiState> blg2 = feedViewModel2._uiState;
                    do {
                        value4 = blg2.getValue();
                    } while (!blg2.A6e(value4, FeedUiState.copy$default(value4, null, null, null, false, false, false, false, false, false, false, false, null, false, null, AbstractC07127nr.A07(thA00), 0, null, 0, false, 507903, null)));
                }
                BLG<FeedUiState> blg3 = FeedViewModel.this._uiState;
                do {
                    value3 = blg3.getValue();
                } while (!blg3.A6e(value3, FeedUiState.copy$default(value3, null, null, null, false, false, false, false, false, false, false, false, null, false, null, null, 0, null, 0, false, 523263, null)));
                FeedViewModel.this.loadPreviousPageJob = null;
                return Unit.INSTANCE;
            } catch (Throwable th) {
                BLG<FeedUiState> blg4 = FeedViewModel.this._uiState;
                do {
                    value = blg4.getValue();
                } while (!blg4.A6e(value, FeedUiState.copy$default(value, null, null, null, false, false, false, false, false, false, false, false, null, false, null, null, 0, null, 0, false, 523263, null)));
                FeedViewModel.this.loadPreviousPageJob = null;
                throw th;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C118661) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.feed.model.FeedViewModel$materializeForDiscussion$2", f = "FeedViewModel.kt", l = {565}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.feed.model.FeedViewModel$materializeForDiscussion$2, reason: invalid class name and case insensitive filesystem */
    public final class C118672 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Function0<Unit> $onError;
        public final /* synthetic */ G0U<FeedUnit, Unit> $onReady;
        public final /* synthetic */ FeedUnit $unit;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C118672(FeedUnit feedUnit, Function0<Unit> function0, G0U<? super FeedUnit, Unit> g0u, HtJ<? super C118672> htJ) {
            super(2, htJ);
            this.$unit = feedUnit;
            this.$onError = function0;
            this.$onReady = g0u;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return FeedViewModel.this.new C118672(this.$unit, this.$onError, this.$onReady, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM817setReaction0E7RQCE;
            Unit unit;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    FeedRepository feedRepository = FeedViewModel.this.repository;
                    String id = this.$unit.getId();
                    FeedReaction reaction = this.$unit.getReaction();
                    this.label = 1;
                    objM817setReaction0E7RQCE = feedRepository.m817setReaction0E7RQCE(id, reaction, this);
                    if (objM817setReaction0E7RQCE == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    objM817setReaction0E7RQCE = AnonymousClass001.A0q(obj);
                }
                Function0<Unit> function0 = this.$onError;
                if (HsJ.A00(objM817setReaction0E7RQCE) == null) {
                    FeedUnit feedUnit = (FeedUnit) objM817setReaction0E7RQCE;
                    if (feedUnit != null && !C7384Etj.areEqual(feedUnit.getId(), this.$unit.getId())) {
                        FeedViewModel.this.materializedInfiniteUnits.put(this.$unit.getId(), feedUnit);
                        FeedViewModel.this.ephemeralInfiniteUnitIds.remove(this.$unit.getId());
                        int iIndexOfId = FeedViewModel.this.infiniteTail.indexOfId(this.$unit.getId());
                        if (iIndexOfId >= 0) {
                            FeedViewModel.this.infiniteTail.replaceAt(iIndexOfId, feedUnit);
                        }
                        this.$onReady.invoke(feedUnit);
                        FeedViewModel.this.discussionMaterializationInFlight.remove(this.$unit.getId());
                        return Unit.INSTANCE;
                    }
                    this.$onError.invoke();
                    unit = Unit.INSTANCE;
                } else {
                    function0.invoke();
                    unit = Unit.INSTANCE;
                }
                return unit;
            } finally {
                FeedViewModel.this.discussionMaterializationInFlight.remove(this.$unit.getId());
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C118672) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.feed.model.FeedViewModel$observeFeedUpdates$1", f = "FeedViewModel.kt", l = {1029}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.feed.model.FeedViewModel$observeFeedUpdates$1, reason: invalid class name and case insensitive filesystem */
    public final class C118681 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C118681(HtJ<? super C118681> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return FeedViewModel.this.new C118681(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return FeedViewModel.this.new C118681(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C20Q<FeedUpdatedEvent> feedUpdatedEvents = FeedViewModel.this.repository.getFeedUpdatedEvents();
                final FeedViewModel feedViewModel = FeedViewModel.this;
                C20Z<? super FeedUpdatedEvent> c20z = new C20Z() { // from class: com.facebook.aura.feed.model.FeedViewModel.observeFeedUpdates.1.1
                    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object emit(com.facebook.aura.feed.repo.FeedUpdatedEvent r4, X.HtJ<? super kotlin.Unit> r5) {
                        /*
                            r3 = this;
                            com.facebook.aura.feed.model.FeedViewModel r0 = r1
                            com.facebook.aura.feed.model.FeedViewModel$FeedUiState r0 = X.C60Q.A0H(r0)
                            com.facebook.aura.feed.repo.FeedPrompt r0 = r0.prompt
                            r2 = 0
                            if (r0 == 0) goto Ld
                            java.lang.String r2 = r0.id
                        Ld:
                            java.lang.String r1 = r4.promptId
                            if (r1 == 0) goto L1e
                            int r0 = r1.length()
                            if (r0 == 0) goto L1e
                            boolean r0 = r1.equals(r2)
                            r1 = 0
                            if (r0 == 0) goto L1f
                        L1e:
                            r1 = 1
                        L1f:
                            com.facebook.aura.feed.model.FeedViewModel r0 = r1
                            com.facebook.aura.feed.model.FeedViewModel$FeedUiState r0 = X.C60Q.A0H(r0)
                            boolean r0 = r0.isRegenerating
                            if (r1 == 0) goto L31
                            if (r0 != 0) goto L31
                            com.facebook.aura.feed.model.FeedViewModel r1 = r1
                            r0 = 0
                            r1.refreshFeed(r0)
                        L31:
                            kotlin.Unit r0 = kotlin.Unit.INSTANCE
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.feed.model.FeedViewModel.C118681.C01511.emit(com.facebook.aura.feed.repo.FeedUpdatedEvent, X.HtJ):java.lang.Object");
                    }

                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((FeedUpdatedEvent) obj2, (HtJ<? super Unit>) htJ);
                    }
                };
                this.label = 1;
                if (feedUpdatedEvents.collect(c20z, this) == enumC10460Hji) {
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
    }

    @DebugMetadata(c = "com.facebook.aura.feed.model.FeedViewModel$openFeedUnit$1", f = "FeedViewModel.kt", l = {456}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.feed.model.FeedViewModel$openFeedUnit$1, reason: invalid class name and case insensitive filesystem */
    public final class C118691 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $unitId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118691(String str, HtJ<? super C118691> htJ) {
            super(2, htJ);
            this.$unitId = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return FeedViewModel.this.new C118691(this.$unitId, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            FeedUiState value;
            FeedUiState value2;
            Object objM807getCursorFeed0E7RQCE;
            FeedUiState value3;
            FeedUiState value4;
            FeedUiState value5;
            FeedUiState feedUiState;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    BLG<FeedUiState> blg = FeedViewModel.this._uiState;
                    String str = this.$unitId;
                    do {
                        value2 = blg.getValue();
                    } while (!blg.A6e(value2, FeedUiState.copy$default(value2, null, null, null, false, false, false, false, false, false, false, false, str, true, null, null, 0, null, 0, false, 501759, null)));
                    FeedRepository feedRepository = FeedViewModel.this.repository;
                    String str2 = this.$unitId;
                    this.label = 1;
                    objM807getCursorFeed0E7RQCE = feedRepository.m807getCursorFeed0E7RQCE(null, str2, this);
                    if (objM807getCursorFeed0E7RQCE == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    objM807getCursorFeed0E7RQCE = AnonymousClass002.A0j(obj);
                }
                FeedViewModel feedViewModel = FeedViewModel.this;
                String str3 = this.$unitId;
                if (!(objM807getCursorFeed0E7RQCE instanceof C10571Hud)) {
                    FeedCursorPage feedCursorPage = (FeedCursorPage) objM807getCursorFeed0E7RQCE;
                    feedViewModel.applyCursorPage(feedCursorPage, PageMerge.REPLACE);
                    BLG<FeedUiState> blg2 = feedViewModel._uiState;
                    do {
                        value5 = blg2.getValue();
                        feedUiState = value5;
                    } while (!blg2.A6e(value5, FeedUiState.copy$default(feedUiState, null, null, null, false, true, false, false, false, false, false, false, feedCursorPage.previousCursor != null ? str3 : null, false, null, null, 0, str3, feedUiState.scrollToUnitToken + 1, false, 325615, null)));
                }
                FeedViewModel feedViewModel2 = FeedViewModel.this;
                if (HsJ.A00(objM807getCursorFeed0E7RQCE) != null) {
                    BLG<FeedUiState> blg3 = feedViewModel2._uiState;
                    do {
                        value4 = blg3.getValue();
                    } while (!blg3.A6e(value4, FeedUiState.copy$default(value4, null, null, null, false, false, false, false, false, false, false, false, null, false, null, null, 0, null, 0, false, 522239, null)));
                    C3cG.A1I(feedViewModel2._openUnitErrorEvents);
                }
                FeedViewModel feedViewModel3 = FeedViewModel.this;
                feedViewModel3.anchorJob = null;
                BLG<FeedUiState> blg4 = feedViewModel3._uiState;
                do {
                    value3 = blg4.getValue();
                } while (!blg4.A6e(value3, FeedUiState.copy$default(value3, null, null, null, false, false, false, false, false, false, false, false, null, false, null, null, 0, null, 0, false, 520191, null)));
                return Unit.INSTANCE;
            } catch (Throwable th) {
                FeedViewModel feedViewModel4 = FeedViewModel.this;
                feedViewModel4.anchorJob = null;
                BLG<FeedUiState> blg5 = feedViewModel4._uiState;
                do {
                    value = blg5.getValue();
                } while (!blg5.A6e(value, FeedUiState.copy$default(value, null, null, null, false, false, false, false, false, false, false, false, null, false, null, null, 0, null, 0, false, 520191, null)));
                throw th;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C118691) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.feed.model.FeedViewModel", f = "FeedViewModel.kt", l = {364, 369}, m = "performFeedLoad", v = 2)
    /* renamed from: com.facebook.aura.feed.model.FeedViewModel$performFeedLoad$1, reason: invalid class name and case insensitive filesystem */
    public final class C118701 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C118701(HtJ<? super C118701> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FeedViewModel.this.performFeedLoad(false, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.feed.model.FeedViewModel$performFeedLoad$4", f = "FeedViewModel.kt", l = {378, StaggeredEntranceKt.StaggeredEntranceDurationMs}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.feed.model.FeedViewModel$performFeedLoad$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HsJ<? extends InitialFeedPage>>, Object> {
        public final /* synthetic */ boolean $isPullToRefresh;
        public final /* synthetic */ F1F $loadedPage;
        public final /* synthetic */ FeedPaginationMode $mode;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(FeedPaginationMode feedPaginationMode, boolean z, F1F f1f, HtJ<? super AnonymousClass4> htJ) {
            super(2, htJ);
            this.$mode = feedPaginationMode;
            this.$isPullToRefresh = z;
            this.$loadedPage = f1f;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass4 anonymousClass4 = FeedViewModel.this.new AnonymousClass4(this.$mode, this.$isPullToRefresh, this.$loadedPage, htJ);
            anonymousClass4.L$0 = obj;
            return anonymousClass4;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r31) {
            /*
                Method dump skipped, instructions count: 369
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.feed.model.FeedViewModel.AnonymousClass4.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super HsJ<? extends InitialFeedPage>> htJ) {
            return ((AnonymousClass4) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.feed.model.FeedViewModel$prefetchVideos$1", f = "FeedViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.feed.model.FeedViewModel$prefetchVideos$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C118711 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ List<FeedUnit> $units;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C118711(List<? extends FeedUnit> list, HtJ<? super C118711> htJ) {
            super(2, htJ);
            this.$units = list;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return FeedViewModel.this.new C118711(this.$units, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            FeedViewModel.this.videoPrefetcher.prefetch(this.$units);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C118711) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.feed.model.FeedViewModel$recordTap$1", f = "FeedViewModel.kt", l = {654}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.feed.model.FeedViewModel$recordTap$1, reason: invalid class name and case insensitive filesystem */
    public final class C118721 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ FeedTapKind $kind;
        public final /* synthetic */ String $resolvedUnitId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118721(String str, FeedTapKind feedTapKind, HtJ<? super C118721> htJ) {
            super(2, htJ);
            this.$resolvedUnitId = str;
            this.$kind = feedTapKind;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return FeedViewModel.this.new C118721(this.$resolvedUnitId, this.$kind, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                FeedRepository feedRepository = FeedViewModel.this.repository;
                String str = this.$resolvedUnitId;
                FeedTapKind feedTapKind = this.$kind;
                this.label = 1;
                if (feedRepository.m813recordTap0E7RQCE(str, feedTapKind, this) == enumC10460Hji) {
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
            return ((C118721) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.feed.model.FeedViewModel$recoverIfStale$1", f = "FeedViewModel.kt", l = {785, 792, 794}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.feed.model.FeedViewModel$recoverIfStale$1, reason: invalid class name and case insensitive filesystem */
    public final class C118731 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int I$0;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        /* renamed from: com.facebook.aura.feed.model.FeedViewModel$recoverIfStale$1$WhenMappings */
        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[FeedPaginationMode.values().length];
                try {
                    AnonymousClass002.A13(FeedPaginationMode.INFINITE, iArr);
                } catch (NoSuchFieldError unused) {
                }
                try {
                    AnonymousClass002.A14(FeedPaginationMode.CURSOR, iArr);
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C118731(HtJ<? super C118731> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return FeedViewModel.this.new C118731(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return FeedViewModel.this.new C118731(htJ).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x010c  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r32) {
            /*
                Method dump skipped, instructions count: 285
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.feed.model.FeedViewModel.C118731.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.facebook.aura.feed.model.FeedViewModel$regenerateSelectedPrompt$1, reason: invalid class name and case insensitive filesystem */
    public final class C118741 extends AbstractC7559F3s implements Function0<Unit> {
        public static final C118741 INSTANCE = new C118741();

        public C118741() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* renamed from: com.facebook.aura.feed.model.FeedViewModel$regenerateSelectedPrompt$2, reason: invalid class name and case insensitive filesystem */
    public final class C118752 extends AbstractC7559F3s implements Function0<Unit> {
        public static final C118752 INSTANCE = new C118752();

        public C118752() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    @DebugMetadata(c = "com.facebook.aura.feed.model.FeedViewModel$regenerateSelectedPrompt$3", f = "FeedViewModel.kt", l = {MC.muse_checkout_promos.__CONFIG__}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.feed.model.FeedViewModel$regenerateSelectedPrompt$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Function0<Unit> $onError;
        public final /* synthetic */ Function0<Unit> $onSuccess;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Function0<Unit> function0, Function0<Unit> function02, HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
            this.$onSuccess = function0;
            this.$onError = function02;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return FeedViewModel.this.new AnonymousClass3(this.$onSuccess, this.$onError, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            FeedUiState value;
            Object objM814regenerateIoAF18A;
            FeedUiState value2;
            FeedUiState value3;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                BLG<FeedUiState> blg = FeedViewModel.this._uiState;
                do {
                    value = blg.getValue();
                } while (!blg.A6e(value, FeedUiState.copy$default(value, null, null, null, false, false, false, true, false, false, false, false, null, false, null, null, 0, null, 0, false, 516031, null)));
                FeedRepository feedRepository = FeedViewModel.this.repository;
                this.label = 1;
                objM814regenerateIoAF18A = feedRepository.m814regenerateIoAF18A(this);
                if (objM814regenerateIoAF18A == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM814regenerateIoAF18A = AnonymousClass002.A0j(obj);
            }
            FeedViewModel feedViewModel = FeedViewModel.this;
            Function0<Unit> function0 = this.$onSuccess;
            if (!(objM814regenerateIoAF18A instanceof C10571Hud)) {
                feedViewModel.recoverIfStale();
                function0.invoke();
            }
            FeedViewModel feedViewModel2 = FeedViewModel.this;
            Function0<Unit> function02 = this.$onError;
            Throwable thA00 = HsJ.A00(objM814regenerateIoAF18A);
            if (thA00 != null) {
                BLG<FeedUiState> blg2 = feedViewModel2._uiState;
                do {
                    value3 = blg2.getValue();
                } while (!AbstractC07127nr.A0J(value3, value3, AbstractC07127nr.A07(thA00), blg2));
                function02.invoke();
            }
            BLG<FeedUiState> blg3 = FeedViewModel.this._uiState;
            do {
                value2 = blg3.getValue();
            } while (!blg3.A6e(value2, FeedUiState.copy$default(value2, null, null, null, false, false, false, false, false, false, false, false, null, false, null, null, 0, null, 0, false, 524223, null)));
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass3) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.feed.model.FeedViewModel$retryUnseededPrompt$1", f = "FeedViewModel.kt", l = {1014, 1015}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.feed.model.FeedViewModel$retryUnseededPrompt$1, reason: invalid class name and case insensitive filesystem */
    public final class C118761 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public int label;

        public C118761(HtJ<? super C118761> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return FeedViewModel.this.new C118761(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return FeedViewModel.this.new C118761(htJ).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
        
            if (r1 < r5) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
        
            if (r10 != r8) goto L7;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x004a -> B:7:0x001a). Please report as a decompilation issue!!! */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r30) {
            /*
                r29 = this;
                X.Hji r8 = X.EnumC10460Hji.A02
                r9 = r29
                int r0 = r9.label
                r7 = 2
                r6 = 1
                if (r0 == 0) goto L5b
                if (r0 == r6) goto L4d
                if (r0 != r7) goto La6
                int r1 = r9.I$1
                int r5 = r9.I$0
                java.lang.Object r4 = r9.L$0
                com.facebook.aura.feed.model.FeedViewModel r4 = (com.facebook.aura.feed.model.FeedViewModel) r4
                java.lang.Object r10 = X.AnonymousClass002.A0j(r30)
            L1a:
                boolean r0 = r10 instanceof X.C10571Hud
                if (r0 == 0) goto L1f
                r10 = 0
            L1f:
                com.facebook.aura.feed.repo.FeedPrompt r10 = (com.facebook.aura.feed.repo.FeedPrompt) r10
                if (r10 != 0) goto L63
                int r1 = r1 + 1
                if (r1 >= r5) goto La3
            L27:
                r9.L$0 = r4
                r9.I$0 = r5
                r9.I$1 = r1
                r9.I$2 = r1
                r9.label = r6
                r2 = 2000(0x7d0, double:9.88E-321)
                java.lang.Object r0 = X.C7Bq.A01(r2, r9)
                if (r0 == r8) goto L4c
                r2 = r1
            L3a:
                com.facebook.aura.feed.repo.FeedRepository r0 = r4.repository
                r9.L$0 = r4
                r9.I$0 = r5
                r9.I$1 = r1
                r9.I$2 = r2
                r9.label = r7
                java.lang.Object r10 = r0.m809getPromptIoAF18A(r9)
                if (r10 != r8) goto L1a
            L4c:
                return r8
            L4d:
                int r2 = r9.I$2
                int r1 = r9.I$1
                int r5 = r9.I$0
                java.lang.Object r4 = r9.L$0
                com.facebook.aura.feed.model.FeedViewModel r4 = (com.facebook.aura.feed.model.FeedViewModel) r4
                X.Hwg.A00(r30)
                goto L3a
            L5b:
                X.Hwg.A00(r30)
                com.facebook.aura.feed.model.FeedViewModel r4 = com.facebook.aura.feed.model.FeedViewModel.this
                r1 = 0
                r5 = 3
                goto L27
            L63:
                X.BLG<com.facebook.aura.feed.model.FeedViewModel$FeedUiState> r2 = r4._uiState
            L65:
                java.lang.Object r1 = r2.getValue()
                r9 = r1
                com.facebook.aura.feed.model.FeedViewModel$FeedUiState r9 = (com.facebook.aura.feed.model.FeedViewModel.FeedUiState) r9
                java.lang.String r11 = r9.draftInstructions
                int r0 = r11.length()
                if (r0 != 0) goto L76
                java.lang.String r11 = r10.freeText
            L76:
                r29 = 524284(0x7fffc, float:7.34678E-40)
                r12 = 0
                r13 = 0
                r14 = r13
                r15 = r13
                r16 = r13
                r17 = r13
                r18 = r13
                r19 = r13
                r20 = r13
                r21 = r12
                r22 = r13
                r23 = r12
                r24 = r12
                r25 = r13
                r26 = r12
                r27 = r13
                r28 = r13
                r30 = r12
                com.facebook.aura.feed.model.FeedViewModel$FeedUiState r0 = com.facebook.aura.feed.model.FeedViewModel.FeedUiState.copy$default(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
                boolean r0 = r2.A6e(r1, r0)
                if (r0 == 0) goto L65
            La3:
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                return r8
            La6:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.feed.model.FeedViewModel.C118761.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @DebugMetadata(c = "com.facebook.aura.feed.model.FeedViewModel$returnToLiveFeed$1", f = "FeedViewModel.kt", l = {311}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.feed.model.FeedViewModel$returnToLiveFeed$1, reason: invalid class name and case insensitive filesystem */
    public final class C118771 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C118771(HtJ<? super C118771> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return FeedViewModel.this.new C118771(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return FeedViewModel.this.new C118771(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            FeedUiState value;
            Object objM807getCursorFeed0E7RQCE;
            FeedUiState value2;
            FeedUiState value3;
            FeedUiState value4;
            FeedUiState feedUiState;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                BLG<FeedUiState> blg = FeedViewModel.this._uiState;
                do {
                    value = blg.getValue();
                } while (!blg.A6e(value, FeedUiState.copy$default(value, null, null, null, false, false, true, false, false, false, false, false, null, false, null, null, 0, null, 0, false, 505823, null)));
                FeedRepository feedRepository = FeedViewModel.this.repository;
                this.label = 1;
                objM807getCursorFeed0E7RQCE = feedRepository.m807getCursorFeed0E7RQCE(null, null, this);
                if (objM807getCursorFeed0E7RQCE == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM807getCursorFeed0E7RQCE = AnonymousClass002.A0j(obj);
            }
            FeedViewModel feedViewModel = FeedViewModel.this;
            if (!(objM807getCursorFeed0E7RQCE instanceof C10571Hud)) {
                feedViewModel.applyCursorPage((FeedCursorPage) objM807getCursorFeed0E7RQCE, PageMerge.REPLACE);
                BLG<FeedUiState> blg2 = feedViewModel._uiState;
                do {
                    value4 = blg2.getValue();
                    feedUiState = value4;
                } while (!blg2.A6e(value4, FeedUiState.copy$default(feedUiState, null, null, null, false, false, false, false, false, false, false, false, null, false, null, null, feedUiState.scrollToTopToken + 1, null, 0, false, 491519, null)));
            }
            FeedViewModel feedViewModel2 = FeedViewModel.this;
            Throwable thA00 = HsJ.A00(objM807getCursorFeed0E7RQCE);
            if (thA00 != null) {
                BLG<FeedUiState> blg3 = feedViewModel2._uiState;
                do {
                    value3 = blg3.getValue();
                } while (!blg3.A6e(value3, FeedUiState.copy$default(value3, null, null, null, false, false, false, false, false, false, false, false, null, false, null, AbstractC07127nr.A07(thA00), 0, null, 0, false, 507903, null)));
            }
            BLG<FeedUiState> blg4 = FeedViewModel.this._uiState;
            do {
                value2 = blg4.getValue();
            } while (!blg4.A6e(value2, FeedUiState.copy$default(value2, null, null, null, false, false, false, false, false, false, false, false, null, false, null, null, 0, null, 0, false, 524255, null)));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.feed.model.FeedViewModel$saveFullPrompt$1", f = "FeedViewModel.kt", l = {613}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.feed.model.FeedViewModel$saveFullPrompt$1, reason: invalid class name and case insensitive filesystem */
    public final class C118781 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $fullPrompt;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118781(String str, HtJ<? super C118781> htJ) {
            super(2, htJ);
            this.$fullPrompt = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return FeedViewModel.this.new C118781(this.$fullPrompt, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM816setPromptTextgIAlus;
            FeedUiState value;
            FeedUiState value2;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                FeedRepository feedRepository = FeedViewModel.this.repository;
                String str = this.$fullPrompt;
                this.label = 1;
                objM816setPromptTextgIAlus = feedRepository.m816setPromptTextgIAlus(str, this);
                if (objM816setPromptTextgIAlus == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM816setPromptTextgIAlus = AnonymousClass002.A0j(obj);
            }
            FeedViewModel feedViewModel = FeedViewModel.this;
            if (!(objM816setPromptTextgIAlus instanceof C10571Hud)) {
                FeedPrompt feedPrompt = (FeedPrompt) objM816setPromptTextgIAlus;
                BLG<FeedUiState> blg = feedViewModel._uiState;
                do {
                    value2 = blg.getValue();
                } while (!blg.A6e(value2, FeedUiState.copy$default(value2, feedPrompt, null, null, false, false, false, false, false, false, false, false, null, false, null, null, 0, null, 0, false, 524286, null)));
            }
            FeedViewModel feedViewModel2 = FeedViewModel.this;
            Throwable thA00 = HsJ.A00(objM816setPromptTextgIAlus);
            if (thA00 != null) {
                BLG<FeedUiState> blg2 = feedViewModel2._uiState;
                do {
                    value = blg2.getValue();
                } while (!AbstractC07127nr.A0J(value, value, AbstractC07127nr.A07(thA00), blg2));
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C118781) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.feed.model.FeedViewModel$setReaction$1", f = "FeedViewModel.kt", l = {668}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.feed.model.FeedViewModel$setReaction$1, reason: invalid class name and case insensitive filesystem */
    public final class C118791 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ FeedUnit $previous;
        public final /* synthetic */ FeedReaction $reaction;
        public final /* synthetic */ String $unitId;
        public final /* synthetic */ boolean $wasEphemeral;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118791(String str, FeedReaction feedReaction, boolean z, FeedUnit feedUnit, HtJ<? super C118791> htJ) {
            super(2, htJ);
            this.$unitId = str;
            this.$reaction = feedReaction;
            this.$wasEphemeral = z;
            this.$previous = feedUnit;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return FeedViewModel.this.new C118791(this.$unitId, this.$reaction, this.$wasEphemeral, this.$previous, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM817setReaction0E7RQCE;
            FeedUiState value;
            String id;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                FeedRepository feedRepository = FeedViewModel.this.repository;
                String str = this.$unitId;
                FeedReaction feedReaction = this.$reaction;
                this.label = 1;
                objM817setReaction0E7RQCE = feedRepository.m817setReaction0E7RQCE(str, feedReaction, this);
                if (objM817setReaction0E7RQCE == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM817setReaction0E7RQCE = AnonymousClass002.A0j(obj);
            }
            FeedReaction feedReaction2 = this.$reaction;
            boolean z = this.$wasEphemeral;
            String str2 = this.$unitId;
            FeedViewModel feedViewModel = FeedViewModel.this;
            if (!(objM817setReaction0E7RQCE instanceof C10571Hud)) {
                FeedUnit feedUnit = (FeedUnit) objM817setReaction0E7RQCE;
                if (feedReaction2 == FeedReaction.LIKE) {
                    HatchInAppReviewTrigger.INSTANCE.onFeedLiked();
                }
                if (z && feedUnit != null && !C7384Etj.areEqual(feedUnit.getId(), str2)) {
                    feedViewModel.materializedInfiniteUnits.put(str2, feedUnit);
                    feedViewModel.ephemeralInfiniteUnitIds.remove(str2);
                    int iIndexOfId = feedViewModel.infiniteTail.indexOfId(str2);
                    if (iIndexOfId >= 0) {
                        feedViewModel.infiniteTail.replaceAt(iIndexOfId, feedUnit);
                    }
                }
                if (feedReaction2 == FeedReaction.DISLIKE) {
                    C3Em<FeedFeedbackPrompt> c3Em = feedViewModel._feedbackPromptEvents;
                    if (feedUnit != null && (id = feedUnit.getId()) != null) {
                        str2 = id;
                    }
                    c3Em.AhV(new FeedFeedbackPrompt(str2));
                }
            }
            FeedViewModel feedViewModel2 = FeedViewModel.this;
            FeedUnit feedUnit2 = this.$previous;
            Throwable thA00 = HsJ.A00(objM817setReaction0E7RQCE);
            if (thA00 != null) {
                feedViewModel2.replaceUnit(feedUnit2);
                BLG<FeedUiState> blg = feedViewModel2._uiState;
                do {
                    value = blg.getValue();
                } while (!AbstractC07127nr.A0J(value, value, AbstractC07127nr.A07(thA00), blg));
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C118791) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.feed.model.FeedViewModel$submitPendingViews$1", f = "FeedViewModel.kt", l = {775}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.feed.model.FeedViewModel$submitPendingViews$1, reason: invalid class name and case insensitive filesystem */
    public final class C118801 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ List<FeedUnitView> $viewings;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public final /* synthetic */ FeedViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C118801(List<FeedUnitView> list, FeedViewModel feedViewModel, HtJ<? super C118801> htJ) {
            super(2, htJ);
            this.$viewings = list;
            this.this$0 = feedViewModel;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C118801(this.$viewings, this.this$0, htJ);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Type inference failed for: r2v4, types: [java.util.Collection] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0043 -> B:6:0x0019). Please report as a decompilation issue!!! */
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
                if (r0 == 0) goto L46
                if (r0 != r5) goto L5b
                java.lang.Object r2 = r7.L$4
                java.util.Collection r2 = (java.util.Collection) r2
                java.lang.Object r4 = r7.L$2
                java.util.Iterator r4 = (java.util.Iterator) r4
                java.lang.Object r3 = r7.L$1
                com.facebook.aura.feed.model.FeedViewModel r3 = (com.facebook.aura.feed.model.FeedViewModel) r3
                java.lang.Object r0 = X.AnonymousClass001.A0q(r8)
            L19:
                java.lang.Throwable r0 = X.HsJ.A00(r0)
                if (r0 == 0) goto L24
                java.util.List<com.facebook.aura.feed.repo.FeedUnitView> r0 = r3.pendingViews
                r0.addAll(r2)
            L24:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L58
                java.lang.Object r2 = r4.next()
                java.util.List r2 = (java.util.List) r2
                com.facebook.aura.feed.repo.FeedRepository r1 = r3.repository
                r0 = 0
                r7.L$0 = r0
                r7.L$1 = r3
                r7.L$2 = r4
                r7.L$3 = r0
                r7.L$4 = r2
                r7.label = r5
                java.lang.Object r0 = r1.m812markUnitsSeengIAlus(r2, r7)
                if (r0 != r6) goto L19
                return r6
            L46:
                X.Hwg.A00(r8)
                java.util.List<com.facebook.aura.feed.repo.FeedUnitView> r1 = r7.$viewings
                r0 = 200(0xc8, float:2.8E-43)
                java.util.ArrayList r0 = X.AbstractC0878AGe.A0N(r1, r0)
                com.facebook.aura.feed.model.FeedViewModel r3 = r7.this$0
                java.util.Iterator r4 = r0.iterator()
                goto L24
            L58:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            L5b:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.feed.model.FeedViewModel.C118801.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C118801) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public FeedViewModel(FeedRepository feedRepository, FeedInstructionsCardStore feedInstructionsCardStore, FeedVideoPrefetcher feedVideoPrefetcher) {
        Object value;
        boolean zA1Z = AnonymousClass005.A1Z(feedRepository, feedInstructionsCardStore, feedVideoPrefetcher);
        this.repository = feedRepository;
        this.instructionsCardStore = feedInstructionsCardStore;
        this.videoPrefetcher = feedVideoPrefetcher;
        SnapshotStateList<FeedUnit> snapshotStateList = new SnapshotStateList();
        this._feedItems = snapshotStateList;
        this.feedItems = snapshotStateList;
        InfiniteFeedTail infiniteFeedTail = new InfiniteFeedTail();
        this.infiniteTail = infiniteFeedTail;
        this.infiniteItems = infiniteFeedTail.items;
        this.ephemeralInfiniteUnitIds = C3cG.A0k();
        this.discussionMaterializationInFlight = C3cG.A0k();
        this.materializedInfiniteUnits = C3cG.A0j();
        this.paginationMode = FeedViewModelKt.currentPaginationMode();
        this.cursorPaginationState = new CursorPaginationState(null, null, false);
        this.infinitePaginationState = new InfinitePaginationState(false);
        C9286GCn c9286GCnA14 = C3cG.A14(new FeedUiState(null, "", null, zA1Z, false, false, false, false, false, false, false, null, false, null, null, 0, null, 0, false));
        this._uiState = c9286GCnA14;
        this.uiState = C3cG.A11(c9286GCnA14);
        Integer num = C79.A00;
        C9290GCr c9290GCrA12 = C3cG.A12(num, 0, zA1Z ? 1 : 0);
        this._editSavedToastEvents = c9290GCrA12;
        this.editSavedToastEvents = C3pd.A00(c9290GCrA12);
        C9290GCr c9290GCrA122 = C3cG.A12(num, 0, zA1Z ? 1 : 0);
        this._openUnitErrorEvents = c9290GCrA122;
        this.openUnitErrorEvents = C3pd.A00(c9290GCrA122);
        C9290GCr c9290GCrA123 = C3cG.A12(num, 0, zA1Z ? 1 : 0);
        this._feedbackPromptEvents = c9290GCrA123;
        this.feedbackPromptEvents = C3pd.A00(c9290GCrA123);
        this.visibleSince = new HashMap<>();
        this.pendingViews = C3cG.A0h();
        this.feedReloadRequests = AbstractC10623Hzj.A00(num, -1);
        do {
            value = c9286GCnA14.getValue();
        } while (!c9286GCnA14.A6e(value, FeedUiState.copy$default((FeedUiState) value, null, null, null, false, false, false, false, false, false, false, false, null, false, null, null, 0, null, 0, this.instructionsCardStore.isDismissed(), 262143, null)));
        observeFeedUpdates();
        BLL bllA00 = AEu.A00(this);
        GAo.A02(num, C6ys.A00, new AnonymousClass2(null), bllA00);
        refreshFeed(false);
    }

    public final void deleteUnit(String str) {
        C7384Etj.A0Y(str, 0);
        Iterator it = this._feedItems.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (!str.equals(C60Q.A0m(it))) {
                i++;
            } else if (i >= 0) {
                FeedUnit feedUnit = (FeedUnit) this._feedItems.get(i);
                this._feedItems.remove(i);
                AnonymousClass001.A1J(new AnonymousClass1(str, i, feedUnit, null), AEu.A00(this));
                return;
            }
        }
        this.infiniteTail.removeId(str);
        this.ephemeralInfiniteUnitIds.remove(str);
        this.materializedInfiniteUnits.remove(str);
    }

    public final void materializeForDiscussion(FeedUnit feedUnit, G0U<? super FeedUnit, Unit> g0u, Function0<Unit> function0) {
        AnonymousClass005.A0x(feedUnit, g0u, function0);
        FeedUnit feedUnit2 = this.materializedInfiniteUnits.get(feedUnit.getId());
        if (feedUnit2 != null) {
            g0u.invoke(feedUnit2);
            return;
        }
        if (!this.ephemeralInfiniteUnitIds.contains(feedUnit.getId())) {
            g0u.invoke(feedUnit);
        } else if (this.discussionMaterializationInFlight.add(feedUnit.getId())) {
            AnonymousClass001.A1J(new C118672(feedUnit, function0, g0u, null), AEu.A00(this));
        }
    }

    public final void onUnitVisibilityChanged(FeedUnitViewportContext feedUnitViewportContext, boolean z) {
        C7384Etj.A0Y(feedUnitViewportContext, 0);
        String str = feedUnitViewportContext.unitId;
        if (z) {
            if (this.visibleSince.containsKey(str)) {
                return;
            }
            this.visibleSince.put(str, new OpenViewSegment(SystemClock.elapsedRealtime(), System.currentTimeMillis(), feedUnitViewportContext));
        } else {
            if (!endViewSegment(str) || this.pendingViews.size() < 100) {
                return;
            }
            submitPendingViews();
        }
    }

    public final void saveFullPrompt(String str) {
        C7384Etj.A0Y(str, 0);
        AnonymousClass001.A1J(new C118781(str, null), AEu.A00(this));
    }

    public final void setReaction(String str, FeedReaction feedReaction) {
        Object obj;
        Object next;
        C7384Etj.A0Y(str, 0);
        Iterator it = this._feedItems.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (str.equals(((FeedUnit) next).getId())) {
                    break;
                }
            }
        }
        FeedUnit feedUnit = (FeedUnit) next;
        if (feedUnit == null) {
            Iterator it2 = this.infiniteTail.items.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (str.equals(((FeedUnit) next2).getId())) {
                    obj = next2;
                    break;
                }
            }
            feedUnit = (FeedUnit) obj;
            if (feedUnit == null) {
                return;
            }
        }
        boolean zContains = this.infiniteTail.ids.contains(str);
        replaceUnit(FeedViewModelKt.withReaction(feedUnit, feedReaction));
        AnonymousClass001.A1J(new C118791(str, feedReaction, zContains, feedUnit, null), AEu.A00(this));
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[FeedPaginationMode.values().length];
            try {
                AnonymousClass005.A0v(FeedPaginationMode.INFINITE, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(FeedPaginationMode.CURSOR, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PageMerge.values().length];
            try {
                AnonymousClass005.A0v(PageMerge.REPLACE, iArr2, 1);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass005.A0v(PageMerge.APPEND, iArr2, 2);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A15(PageMerge.PREPEND, iArr2);
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyCursorPage(FeedCursorPage feedCursorPage, PageMerge pageMerge) {
        FeedUiState value;
        FeedUiState feedUiState;
        boolean zA1X;
        boolean zA1X2;
        String str;
        SnapshotStateList<FeedUnit> snapshotStateList = this._feedItems;
        HashSet hashSetA13 = C60O.A13();
        Iterator it = snapshotStateList.iterator();
        while (it.hasNext()) {
            hashSetA13.add(C60Q.A0m(it));
        }
        int iOrdinal = pageMerge.ordinal();
        if (iOrdinal == 0) {
            C60R.A18(this.cursorPaginationState, this, false);
            this._feedItems.clear();
            this._feedItems.addAll(feedCursorPage.units);
            this.infiniteTail.clear();
            this.ephemeralInfiniteUnitIds.clear();
            this.materializedInfiniteUnits.clear();
        } else if (iOrdinal == 1) {
            SnapshotStateList<FeedUnit> snapshotStateList2 = this._feedItems;
            AHD<FeedUnit> ahd = feedCursorPage.units;
            ArrayList arrayListA0h = C3cG.A0h();
            for (Object obj : ahd) {
                C60R.A1I(((FeedUnit) obj).getId(), obj, hashSetA13, arrayListA0h);
            }
            snapshotStateList2.addAll(arrayListA0h);
        } else {
            if (iOrdinal != 2) {
                throw C3cG.A0q();
            }
            if (feedCursorPage.previousCursor == null) {
                C60R.A18(this.cursorPaginationState, this, false);
            }
            SnapshotStateList<FeedUnit> snapshotStateList3 = this._feedItems;
            AHD<FeedUnit> ahd2 = feedCursorPage.units;
            ArrayList arrayListA0h2 = C3cG.A0h();
            for (Object obj2 : ahd2) {
                C60R.A1I(((FeedUnit) obj2).getId(), obj2, hashSetA13, arrayListA0h2);
            }
            snapshotStateList3.addAll(0, arrayListA0h2);
        }
        prefetchVideos(feedCursorPage.units);
        CursorPaginationState cursorPaginationState = this.cursorPaginationState;
        this.cursorPaginationState = new CursorPaginationState(pageMerge == PageMerge.PREPEND ? cursorPaginationState.nextCursor : feedCursorPage.nextCursor, pageMerge == PageMerge.APPEND ? cursorPaginationState.previousCursor : feedCursorPage.previousCursor, cursorPaginationState.pendingLiveFeedReset);
        BLG<FeedUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            feedUiState = value;
            CursorPaginationState cursorPaginationState2 = this.cursorPaginationState;
            zA1X = AnonymousClass002.A1X(cursorPaginationState2.nextCursor);
            zA1X2 = AnonymousClass002.A1X(cursorPaginationState2.previousCursor);
            str = null;
            if (iOrdinal != 0 && (iOrdinal == 1 || feedCursorPage.previousCursor != null)) {
                str = feedUiState.anchoredUnitId;
            }
        } while (!blg.A6e(value, FeedUiState.copy$default(feedUiState, null, null, null, false, false, false, false, zA1X, zA1X2, false, false, str, false, null, null, 0, null, 0, false, 521855, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void applyCursorRefreshedPage(com.facebook.aura.feed.repo.FeedCursorPage r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.feed.model.FeedViewModel.applyCursorRefreshedPage(com.facebook.aura.feed.repo.FeedCursorPage, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void applyInfinitePage(com.facebook.aura.feed.repo.FeedPage r25, boolean r26) {
        /*
            r24 = this;
            r4 = r24
            com.facebook.aura.feed.model.FeedViewModel$FeedUiState r0 = X.C60Q.A0H(r4)
            com.facebook.aura.feed.repo.FeedPrompt r0 = r0.prompt
            r6 = 0
            if (r0 == 0) goto L92
            java.lang.String r1 = r0.id
        Ld:
            r5 = r25
            java.lang.String r0 = r5.promptId
            r13 = 1
            r9 = 0
            if (r0 == 0) goto L1e
            if (r1 == 0) goto L1e
            boolean r1 = r1.equals(r0)
            r0 = 1
            if (r1 == 0) goto L1f
        L1e:
            r0 = 0
        L1f:
            if (r26 != 0) goto L24
            r2 = 0
            if (r0 == 0) goto L25
        L24:
            r2 = 1
        L25:
            androidx.compose.runtime.snapshots.SnapshotStateList<com.facebook.aura.feed.repo.FeedUnit> r0 = r4._feedItems
            r0.clear()
            androidx.compose.runtime.snapshots.SnapshotStateList<com.facebook.aura.feed.repo.FeedUnit> r1 = r4._feedItems
            X.AHD<com.facebook.aura.feed.repo.FeedUnit> r0 = r5.units
            r1.addAll(r0)
            X.AHD<com.facebook.aura.feed.repo.FeedUnit> r0 = r5.units
            r4.prefetchVideos(r0)
            if (r2 == 0) goto L74
            r4.clearInfiniteTail()
        L3b:
            com.facebook.aura.feed.model.InfinitePaginationState r0 = new com.facebook.aura.feed.model.InfinitePaginationState
            r0.<init>(r9)
            r4.infinitePaginationState = r0
            X.BLG<com.facebook.aura.feed.model.FeedViewModel$FeedUiState> r2 = r4._uiState
        L44:
            java.lang.Object r1 = r2.getValue()
            r5 = r1
            com.facebook.aura.feed.model.FeedViewModel$FeedUiState r5 = (com.facebook.aura.feed.model.FeedViewModel.FeedUiState) r5
            r25 = 521855(0x7f67f, float:7.31275E-40)
            r7 = r6
            r8 = r6
            r10 = r9
            r11 = r9
            r12 = r9
            r14 = r9
            r15 = r9
            r16 = r9
            r17 = r6
            r18 = r9
            r19 = r6
            r20 = r6
            r21 = r9
            r22 = r6
            r23 = r9
            r24 = r9
            r26 = r6
            com.facebook.aura.feed.model.FeedViewModel$FeedUiState r0 = com.facebook.aura.feed.model.FeedViewModel.FeedUiState.copy$default(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            boolean r0 = r2.A6e(r1, r0)
            if (r0 == 0) goto L44
            return
        L74:
            com.facebook.aura.feed.model.InfiniteFeedTail r3 = r4.infiniteTail
            X.AHD<com.facebook.aura.feed.repo.FeedUnit> r0 = r5.units
            java.util.HashSet r2 = X.C60O.A13()
            java.util.Iterator r1 = r0.iterator()
        L80:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L8e
            java.lang.String r0 = X.C60Q.A0m(r1)
            r2.add(r0)
            goto L80
        L8e:
            r3.removeIds(r2)
            goto L3b
        L92:
            r1 = r6
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.feed.model.FeedViewModel.applyInfinitePage(com.facebook.aura.feed.repo.FeedPage, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyInfiniteRefreshedPage(FeedPage feedPage, boolean z) {
        Long lA0X;
        Long lA0X2;
        FeedUiState value;
        FeedUiState feedUiState;
        Iterator it = feedPage.units.iterator();
        if (it.hasNext()) {
            lA0X = C60R.A0X(it);
            while (it.hasNext()) {
                Long lA0X3 = C60R.A0X(it);
                if (lA0X.compareTo(lA0X3) < 0) {
                    lA0X = lA0X3;
                }
            }
        } else {
            lA0X = null;
        }
        Iterator it2 = this._feedItems.iterator();
        if (it2.hasNext()) {
            lA0X2 = C60R.A0X(it2);
            while (it2.hasNext()) {
                Long lA0X4 = C60R.A0X(it2);
                if (lA0X2.compareTo(lA0X4) < 0) {
                    lA0X2 = lA0X4;
                }
            }
        } else {
            lA0X2 = null;
        }
        FeedUnit feedUnit = (FeedUnit) AbstractC0878AGe.A0G(this._feedItems);
        String promptId = feedUnit != null ? feedUnit.getPromptId() : null;
        if (!z && !this._feedItems.isEmpty() && C7384Etj.areEqual(promptId, feedPage.promptId) && C7384Etj.areEqual(lA0X2, lA0X)) {
            applyInteractionState(feedPage.units);
            return;
        }
        if (feedPage.units.isEmpty() && !this._feedItems.isEmpty()) {
            CFK.A06(FeedViewModelKt.TAG, FGI.A0I("discarding empty feed page; keeping ", this._feedItems.size(), " rendered unit(s)"));
            return;
        }
        AIY aiy = new AIY();
        Iterator it3 = this._feedItems.iterator();
        while (it3.hasNext()) {
            aiy.add(C60Q.A0m(it3));
        }
        Iterator it4 = this.infiniteTail.items.iterator();
        while (it4.hasNext()) {
            aiy.add(C60Q.A0m(it4));
        }
        AIY aiyA00 = AIX.A00(aiy);
        AHD<FeedUnit> ahd = feedPage.units;
        boolean z2 = false;
        if (!(ahd instanceof Collection) || !ahd.isEmpty()) {
            Iterator it5 = ahd.iterator();
            while (true) {
                if (!it5.hasNext()) {
                    break;
                } else if (!aiyA00.contains(C60Q.A0m(it5))) {
                    z2 = true;
                    break;
                }
            }
        }
        applyInfinitePage(feedPage, z);
        if (z2) {
            BLG<FeedUiState> blg = this._uiState;
            do {
                value = blg.getValue();
                feedUiState = value;
            } while (!blg.A6e(value, FeedUiState.copy$default(feedUiState, null, null, null, false, false, false, false, false, false, false, false, null, false, null, null, feedUiState.scrollToTopToken + 1, null, 0, false, 491519, null)));
        }
    }

    private final void clearInfiniteTail() {
        HoC hoC = this.loadNextPageJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        this.loadNextPageJob = null;
        this.infiniteTail.clear();
        this.ephemeralInfiniteUnitIds.clear();
        this.materializedInfiniteUnits.clear();
    }

    private final boolean endViewSegment(String str) {
        OpenViewSegment openViewSegmentRemove = this.visibleSince.remove(str);
        if (openViewSegmentRemove != null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - openViewSegmentRemove.startElapsedMs;
            if (jElapsedRealtime >= 1000) {
                logFeedCardImpression(openViewSegmentRemove, jElapsedRealtime);
                SnapshotStateList<FeedUnit> snapshotStateList = this._feedItems;
                if (!(snapshotStateList instanceof Collection) || !snapshotStateList.isEmpty()) {
                    Iterator it = snapshotStateList.iterator();
                    while (it.hasNext()) {
                        if (C7384Etj.areEqual(C60Q.A0m(it), str)) {
                            this.pendingViews.add(new FeedUnitView(str, jElapsedRealtime, openViewSegmentRemove.startEpochMs));
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0074  */
    /* renamed from: loadInitialFeedPage-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m799loadInitialFeedPagegIAlus(com.facebook.aura.feed.model.FeedPaginationMode r8, X.HtJ<? super X.HsJ<? extends com.facebook.aura.feed.model.InitialFeedPage>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.feed.model.FeedViewModel$loadInitialFeedPage$1
            if (r0 == 0) goto L4c
            r6 = r9
            com.facebook.aura.feed.model.FeedViewModel$loadInitialFeedPage$1 r6 = (com.facebook.aura.feed.model.FeedViewModel$loadInitialFeedPage$1) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4c
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r5 = r6.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r3 = 2
            r2 = 1
            r1 = 0
            if (r0 == 0) goto L33
            if (r0 == r2) goto L6a
            if (r0 != r3) goto L52
            java.lang.Object r1 = X.AnonymousClass001.A0q(r5)
        L25:
            boolean r0 = r1 instanceof X.C10571Hud
            r0 = r0 ^ 1
            if (r0 == 0) goto L7c
            com.facebook.aura.feed.repo.FeedCursorPage r1 = (com.facebook.aura.feed.repo.FeedCursorPage) r1
            com.facebook.aura.feed.model.InitialFeedPage$Cursor r0 = new com.facebook.aura.feed.model.InitialFeedPage$Cursor
            r0.<init>(r1)
            return r0
        L33:
            X.Hwg.A00(r5)
            int r0 = r8.ordinal()
            if (r0 == r1) goto L5c
            if (r0 != r2) goto L57
            com.facebook.aura.feed.repo.FeedRepository r1 = r7.repository
            r0 = 0
            r6.L$0 = r0
            r6.label = r3
            java.lang.Object r1 = r1.m807getCursorFeed0E7RQCE(r0, r0, r6)
            if (r1 != r4) goto L25
            return r4
        L4c:
            com.facebook.aura.feed.model.FeedViewModel$loadInitialFeedPage$1 r6 = new com.facebook.aura.feed.model.FeedViewModel$loadInitialFeedPage$1
            r6.<init>(r7, r9)
            goto L12
        L52:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L57:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        L5c:
            com.facebook.aura.feed.repo.FeedRepository r1 = r7.repository
            r0 = 0
            r6.L$0 = r0
            r6.label = r2
            java.lang.Object r1 = r1.m808getFeedIoAF18A(r6)
            if (r1 != r4) goto L6e
            return r4
        L6a:
            java.lang.Object r1 = X.AnonymousClass001.A0q(r5)
        L6e:
            boolean r0 = r1 instanceof X.C10571Hud
            r0 = r0 ^ 1
            if (r0 == 0) goto L7c
            com.facebook.aura.feed.repo.FeedPage r1 = (com.facebook.aura.feed.repo.FeedPage) r1
            com.facebook.aura.feed.model.InitialFeedPage$Infinite r0 = new com.facebook.aura.feed.model.InitialFeedPage$Infinite
            r0.<init>(r1)
            return r0
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.feed.model.FeedViewModel.m799loadInitialFeedPagegIAlus(com.facebook.aura.feed.model.FeedPaginationMode, X.HtJ):java.lang.Object");
    }

    private final void loadNextCursorPage() {
        String str = this.cursorPaginationState.nextCursor;
        if (str != null && C60Q.A0H(this).hasNextPage && this.loadNextPageJob == null && this.anchorJob == null) {
            this.loadNextPageJob = AnonymousClass001.A11(new C118641(str, null), AEu.A00(this));
        }
    }

    private final void loadNextInfinitePage() {
        if (this.loadNextPageJob != null || this.infinitePaginationState.isExhausted) {
            return;
        }
        this.loadNextPageJob = AnonymousClass001.A11(new C118651(null), AEu.A00(this));
    }

    private final void logFeedCardImpression(OpenViewSegment openViewSegment, long j) {
        HatchImpressionLogger hatchImpressionLogger = HatchImpressionLogger.INSTANCE;
        HatchOrigin hatchOrigin = HatchOrigin.FEED;
        HatchSurface hatchSurface = HatchSurface.FEED;
        HatchSubsurface hatchSubsurface = HatchSubsurface.FEED_WIDGET;
        HatchScreen hatchScreen = HatchScreen.FEED_HOME;
        HatchComponent hatchComponent = HatchComponent.FEED_CARD;
        Map<String, String> map = openViewSegment.context.impressionMetadata;
        String value = HatchMetadataKey.ENTER_TS.getValue();
        long j2 = openViewSegment.startEpochMs;
        hatchImpressionLogger.logImpression(hatchOrigin, hatchSurface, hatchSubsurface, hatchScreen, hatchComponent, null, AGH.A02(map, C3cH.A0m(HatchMetadataKey.DURATION_MS.getValue(), String.valueOf(j), C3cG.A0r(value, String.valueOf(j2)), C3cG.A0r(HatchMetadataKey.EXIT_TS.getValue(), String.valueOf(j2 + j)))), Integer.valueOf(openViewSegment.context.absolutePosition));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ee A[PHI: r24
  0x00ee: PHI (r24v3 boolean) = (r24v1 boolean), (r24v4 boolean) binds: [B:34:0x009c, B:32:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c8  */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.F1F, int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object performFeedLoad(boolean r39, X.HtJ<? super kotlin.Unit> r40) {
        /*
            Method dump skipped, instructions count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.feed.model.FeedViewModel.performFeedLoad(boolean, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void regenerateSelectedPrompt$default(FeedViewModel feedViewModel, Function0 function0, Function0 function02, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = C118741.INSTANCE;
        }
        if ((i & 2) != 0) {
            function02 = C118752.INSTANCE;
        }
        feedViewModel.regenerateSelectedPrompt(function0, function02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void replaceUnit(FeedUnit feedUnit) {
        Iterator it = this._feedItems.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (!C7384Etj.areEqual(C60Q.A0m(it), feedUnit.getId())) {
                i++;
            } else if (i >= 0) {
                this._feedItems.set(i, feedUnit);
                return;
            }
        }
        int iIndexOfId = this.infiniteTail.indexOfId(feedUnit.getId());
        if (iIndexOfId >= 0) {
            this.infiniteTail.replaceAt(iIndexOfId, feedUnit);
        }
    }

    private final void retryUnseededPrompt() {
        HtJ htJA13 = AnonymousClass006.A13(this.promptSeedRetryJob);
        this.promptSeedRetryJob = AnonymousClass001.A11(new C118761(htJA13), AEu.A00(this));
    }

    private final void submitPendingViews() {
        if (this.pendingViews.isEmpty()) {
            return;
        }
        List listA0X = AbstractC0878AGe.A0X(this.pendingViews);
        this.pendingViews.clear();
        AnonymousClass001.A1J(new C118801(listA0X, this, null), AEu.A00(this));
    }

    public final void clearAnchorIfAwayTooLong() {
        FeedUiState value;
        Long l = this.awaySinceElapsedMs;
        if (l != null) {
            long jLongValue = l.longValue();
            this.awaySinceElapsedMs = null;
            if (C60Q.A0H(this).anchoredUnitId == null || C3cG.A04(jLongValue) < 600000) {
                return;
            }
            C60R.A18(this.cursorPaginationState, this, true);
            BLG<FeedUiState> blg = this._uiState;
            do {
                value = blg.getValue();
            } while (!blg.A6e(value, FeedUiState.copy$default(value, null, null, null, false, false, false, false, false, false, false, false, null, false, null, null, 0, null, 0, false, 522239, null)));
        }
    }

    public final void discardDraft() {
        FeedUiState value;
        FeedUiState feedUiState;
        String str;
        BLG<FeedUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            feedUiState = value;
            FeedPrompt feedPrompt = feedUiState.prompt;
            if (feedPrompt == null || (str = feedPrompt.freeText) == null) {
                str = "";
            }
        } while (!blg.A6e(value, FeedUiState.copy$default(feedUiState, null, str, null, false, false, false, false, false, false, false, false, null, false, null, null, 0, null, 0, false, 524285, null)));
    }

    public final void dismissInstructionsCard() {
        FeedUiState value;
        if (C60Q.A0H(this).instructionsCardDismissed) {
            return;
        }
        this.instructionsCardStore.setDismissed();
        BLG<FeedUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, FeedUiState.copy$default(value, null, null, null, false, false, false, false, false, false, false, false, null, false, null, null, 0, null, 0, true, 262143, null)));
    }

    public final void flushSeenBatch() {
        Set<String> setKeySet = this.visibleSince.keySet();
        C7384Etj.A0U(setKeySet);
        Iterator it = AbstractC0878AGe.A0X(setKeySet).iterator();
        while (it.hasNext()) {
            String strA0j = AnonymousClass005.A0j(it);
            C7384Etj.A0X(strA0j);
            endViewSegment(strA0j);
        }
        submitPendingViews();
    }

    public final C22I<Unit> getEditSavedToastEvents() {
        return this.editSavedToastEvents;
    }

    public final SnapshotStateList<FeedUnit> getFeedItems() {
        return this.feedItems;
    }

    public final C22I<FeedFeedbackPrompt> getFeedbackPromptEvents() {
        return this.feedbackPromptEvents;
    }

    public final SnapshotStateList<FeedUnit> getInfiniteItems() {
        return this.infiniteItems;
    }

    public final C22I<Unit> getOpenUnitErrorEvents() {
        return this.openUnitErrorEvents;
    }

    public final C1BN<FeedUiState> getUiState() {
        return this.uiState;
    }

    public final void onAnchoredUnitScrolledAway() {
        FeedUiState value;
        if (C60Q.A0H(this).anchoredUnitId != null) {
            C60R.A18(this.cursorPaginationState, this, true);
            BLG<FeedUiState> blg = this._uiState;
            do {
                value = blg.getValue();
            } while (!blg.A6e(value, FeedUiState.copy$default(value, null, null, null, false, false, false, false, false, false, false, false, null, false, null, null, 0, null, 0, false, 522239, null)));
        }
    }

    public final void onFeedResumed() {
        if (this.hasSeenFirstResume) {
            refreshFeed(false);
        } else {
            this.hasSeenFirstResume = true;
        }
    }

    public final void refreshFeed(boolean z) {
        this.feedReloadRequests.AhZ(Boolean.valueOf(z));
    }

    public static /* synthetic */ void applyCursorRefreshedPage$default(FeedViewModel feedViewModel, FeedCursorPage feedCursorPage, boolean z, int i, Object obj) {
        feedViewModel.applyCursorRefreshedPage(feedCursorPage, AnonymousClass001.A1Q(i, z));
    }

    public static /* synthetic */ void applyInfiniteRefreshedPage$default(FeedViewModel feedViewModel, FeedPage feedPage, boolean z, int i, Object obj) {
        feedViewModel.applyInfiniteRefreshedPage(feedPage, AnonymousClass001.A1Q(i, z));
    }

    private final void applyInteractionState(List<? extends FeedUnit> list) {
        LinkedHashMap linkedHashMapA15 = C60O.A15(AnonymousClass005.A0C(list));
        for (FeedUnit feedUnit : list) {
            linkedHashMapA15.put(feedUnit.getId(), feedUnit);
        }
        applyInteractionState(this._feedItems, linkedHashMapA15);
        applyInteractionState(this.infiniteTail.items, linkedHashMapA15);
    }

    private final void observeFeedUpdates() {
        AnonymousClass001.A1J(new C118681(null), AEu.A00(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void prefetchVideos(List<? extends FeedUnit> list) {
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C118711(list, null), AEu.A00(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FeedPaginationMode updatePaginationMode() {
        FeedUiState value;
        FeedPaginationMode feedPaginationModeCurrentPaginationMode = FeedViewModelKt.currentPaginationMode();
        if (this.paginationMode != feedPaginationModeCurrentPaginationMode) {
            HoC hoC = this.loadNextPageJob;
            if (hoC != null) {
                hoC.A5w(null);
            }
            this.loadNextPageJob = null;
            HoC hoC2 = this.loadPreviousPageJob;
            if (hoC2 != null) {
                hoC2.A5w(null);
            }
            this.loadPreviousPageJob = null;
            HoC hoC3 = this.anchorJob;
            if (hoC3 != null) {
                hoC3.A5w(null);
            }
            this.anchorJob = null;
            this.paginationMode = feedPaginationModeCurrentPaginationMode;
            this.cursorPaginationState = new CursorPaginationState(null, null, false);
            this.infinitePaginationState = new InfinitePaginationState(false);
            this._feedItems.clear();
            clearInfiniteTail();
            BLG<FeedUiState> blg = this._uiState;
            do {
                value = blg.getValue();
            } while (!blg.A6e(value, FeedUiState.copy$default(value, null, null, null, false, false, false, false, false, false, false, false, null, false, null, null, 0, null, 0, false, 520319, null)));
        }
        return feedPaginationModeCurrentPaginationMode;
    }

    public final void loadNextPage() {
        FeedPaginationMode feedPaginationModeCurrentPaginationMode = FeedViewModelKt.currentPaginationMode();
        FeedPaginationMode feedPaginationMode = this.paginationMode;
        if (feedPaginationModeCurrentPaginationMode != feedPaginationMode) {
            refreshFeed(false);
            return;
        }
        int iOrdinal = feedPaginationMode.ordinal();
        if (iOrdinal == 0) {
            loadNextInfinitePage();
        } else {
            if (iOrdinal != 1) {
                throw C3cG.A0q();
            }
            loadNextCursorPage();
        }
    }

    public final void loadPreviousPage() {
        String str;
        FeedPaginationMode feedPaginationModeCurrentPaginationMode = FeedViewModelKt.currentPaginationMode();
        FeedPaginationMode feedPaginationMode = this.paginationMode;
        if (feedPaginationModeCurrentPaginationMode != feedPaginationMode) {
            refreshFeed(false);
            return;
        }
        if (feedPaginationMode == FeedPaginationMode.CURSOR && (str = this.cursorPaginationState.previousCursor) != null && C60Q.A0H(this).hasPreviousPage && this.loadPreviousPageJob == null && this.anchorJob == null) {
            this.loadPreviousPageJob = AnonymousClass001.A11(new C118661(str, null), AEu.A00(this));
        }
    }

    public final void onFeedPaused() {
        this.awaySinceElapsedMs = C3cI.A0O();
    }

    public final void openFeedUnit(String str) {
        if (C60R.A02(str) == 0 || FeedViewModelKt.currentPaginationMode() != FeedPaginationMode.CURSOR) {
            return;
        }
        updatePaginationMode();
        HoC hoC = this.anchorJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        HoC hoC2 = this.loadNextPageJob;
        if (hoC2 != null) {
            hoC2.A5w(null);
        }
        HoC hoC3 = this.loadPreviousPageJob;
        if (hoC3 != null) {
            hoC3.A5w(null);
        }
        this.anchorJob = AnonymousClass001.A11(new C118691(str, null), AEu.A00(this));
    }

    public final void recordTap(String str, FeedTapKind feedTapKind) {
        String id;
        AnonymousClass003.A0u(str, feedTapKind);
        FeedUnit feedUnit = this.materializedInfiniteUnits.get(str);
        if (feedUnit != null && (id = feedUnit.getId()) != null) {
            str = id;
        }
        AnonymousClass001.A1J(new C118721(str, feedTapKind, null), AEu.A00(this));
    }

    public final void recoverIfStale() {
        AnonymousClass001.A1J(new C118731(null), AEu.A00(this));
    }

    public final void regenerateSelectedPrompt(Function0<Unit> function0, Function0<Unit> function02) {
        AnonymousClass003.A0u(function0, function02);
        AnonymousClass001.A1J(new AnonymousClass3(function0, function02, null), AEu.A00(this));
    }

    public final void returnToLiveFeed() {
        if (C60Q.A0H(this).anchoredUnitId == null || this.paginationMode != FeedPaginationMode.CURSOR) {
            return;
        }
        HoC hoC = this.anchorJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        HoC hoC2 = this.loadNextPageJob;
        if (hoC2 != null) {
            hoC2.A5w(null);
        }
        HoC hoC3 = this.loadPreviousPageJob;
        if (hoC3 != null) {
            hoC3.A5w(null);
        }
        AnonymousClass001.A1J(new C118771(null), AEu.A00(this));
    }

    private final void applyInteractionState(SnapshotStateList<FeedUnit> snapshotStateList, Map<String, ? extends FeedUnit> map) {
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            FeedUnit feedUnit = (FeedUnit) snapshotStateList.get(i);
            FeedUnit feedUnit2 = map.get(feedUnit.getId());
            if (feedUnit2 != null && !FeedViewModelKt.hasSameInteractionState(feedUnit, feedUnit2)) {
                snapshotStateList.set(i, FeedViewModelKt.withInteractionStateFrom(feedUnit, feedUnit2));
            }
        }
    }
}
