package com.facebook.aura.library.model;

import X.AEs;
import X.AEu;
import X.AGH;
import X.AGI;
import X.AHD;
import X.AHI;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass603;
import X.BLG;
import X.BLL;
import X.BzK;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C0KA;
import X.C1BN;
import X.C20Z;
import X.C3Pi;
import X.C3UX;
import X.C3rb;
import X.C4oT;
import X.C6ys;
import X.C7384Etj;
import X.C79;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0V;
import X.G2k;
import X.G2l;
import X.GAo;
import X.HtJ;
import X.Hwg;
import X.HxE;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.common.prefs.HatchPrefsStore;
import com.facebook.aura.file.utils.HatchFileUIUtils;
import com.facebook.aura.gateway.HatchFileOperations;
import com.facebook.aura.gateway.HatchThumbnailDisplaySize;
import com.facebook.aura.gateway.WorkspaceUriResolver;
import com.facebook.aura.library.repo.ArtifactSortMode;
import com.facebook.aura.library.repo.ArtifactSource;
import com.facebook.aura.library.repo.ArtifactsDataSource;
import com.facebook.aura.library.repo.LoadingState;
import com.facebook.aura.library.repo.ThingsAndMediaDataSource;
import com.facebook.aura.library.repo.UnifiedArtifact;
import com.facebook.aura.library.repo.UnifiedArtifactsRepository;
import com.facebook.aura.library.repo.WorkspaceEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class HatchLibraryViewModel extends AEs {
    public static final int $stable = 8;
    public final BLG<UiState> _uiState;
    public final UnifiedArtifactsRepository artifacts;
    public volatile Map<String, UnifiedArtifact> artifactsById;
    public final ThingsAndMediaDataSource feed;
    public final ArtifactsDataSource pinning;
    public final C4oT prefs;
    public final C1BN<UiState> uiState;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.library.model.HatchLibraryViewModel$1", f = "HatchLibraryViewModel.kt", l = {82}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.model.HatchLibraryViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchLibraryViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchLibraryViewModel hatchLibraryViewModel = HatchLibraryViewModel.this;
                UnifiedArtifactsRepository unifiedArtifactsRepository = hatchLibraryViewModel.artifacts;
                ArtifactSortMode persistedSort = hatchLibraryViewModel.readPersistedSort();
                this.label = 1;
                if (unifiedArtifactsRepository.ensureLoaded(persistedSort, this) == enumC10460Hji) {
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
            return HatchLibraryViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final class Factory extends AuraViewModelFactory<HatchLibraryViewModel> {
        public static final int $stable = 8;
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public HatchLibraryViewModel create() {
            return new HatchLibraryViewModel(ThingsAndMediaDataSource.Companion.getInstance(this.userSession), UnifiedArtifactsRepository.Companion.getInstance(this.userSession), ArtifactsDataSource.Companion.getInstance(this.userSession), this.userSession);
        }
    }

    public final class UiState extends C06G {
        public static final int $stable = ArtifactFile.$stable;
        public final AHD<ArtifactFile> artifacts;
        public final boolean artifactsHasMore;
        public final boolean artifactsLoadFailed;
        public final boolean isLoadingMoreArtifacts;
        public final boolean isLoadingMoreMedia;
        public final LoadingState loadingState;
        public final AHD<MediaEntryUiModel> mediaEntries;
        public final boolean mediaHasMore;
        public final boolean mediaLoadFailed;
        public final boolean showPinnedSections;
        public final ArtifactSortMode sortMode;

        public UiState(LoadingState loadingState, boolean z, boolean z2, AHD<MediaEntryUiModel> ahd, AHD<ArtifactFile> ahd2, boolean z3, ArtifactSortMode artifactSortMode, boolean z4, boolean z5, boolean z6, boolean z7) {
            AnonymousClass005.A12(loadingState, ahd, ahd2, 0);
            C7384Etj.A0Y(artifactSortMode, 6);
            this.loadingState = loadingState;
            this.artifactsLoadFailed = z;
            this.mediaLoadFailed = z2;
            this.mediaEntries = ahd;
            this.artifacts = ahd2;
            this.showPinnedSections = z3;
            this.sortMode = artifactSortMode;
            this.mediaHasMore = z4;
            this.isLoadingMoreMedia = z5;
            this.artifactsHasMore = z6;
            this.isLoadingMoreArtifacts = z7;
        }

        public final UiState copy(LoadingState loadingState, boolean z, boolean z2, AHD<MediaEntryUiModel> ahd, AHD<ArtifactFile> ahd2, boolean z3, ArtifactSortMode artifactSortMode, boolean z4, boolean z5, boolean z6, boolean z7) {
            AnonymousClass005.A12(loadingState, ahd, ahd2, 0);
            C7384Etj.A0Y(artifactSortMode, 6);
            return new UiState(loadingState, z, z2, ahd, ahd2, z3, artifactSortMode, z4, z5, z6, z7);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof UiState) {
                    UiState uiState = (UiState) obj;
                    if (this.loadingState != uiState.loadingState || this.artifactsLoadFailed != uiState.artifactsLoadFailed || this.mediaLoadFailed != uiState.mediaLoadFailed || !C7384Etj.areEqual(this.mediaEntries, uiState.mediaEntries) || !C7384Etj.areEqual(this.artifacts, uiState.artifacts) || this.showPinnedSections != uiState.showPinnedSections || this.sortMode != uiState.sortMode || this.mediaHasMore != uiState.mediaHasMore || this.isLoadingMoreMedia != uiState.isLoadingMoreMedia || this.artifactsHasMore != uiState.artifactsHasMore || this.isLoadingMoreArtifacts != uiState.isLoadingMoreArtifacts) {
                    }
                }
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UiState copy$default(UiState uiState, LoadingState loadingState, boolean z, boolean z2, AHD ahd, AHD ahd2, boolean z3, ArtifactSortMode artifactSortMode, boolean z4, boolean z5, boolean z6, boolean z7, int i, Object obj) {
            if ((i & 1) != 0) {
                loadingState = uiState.loadingState;
            }
            if ((i & 2) != 0) {
                z = uiState.artifactsLoadFailed;
            }
            if ((i & 4) != 0) {
                z2 = uiState.mediaLoadFailed;
            }
            if ((i & 8) != 0) {
                ahd = uiState.mediaEntries;
            }
            if ((i & 16) != 0) {
                ahd2 = uiState.artifacts;
            }
            if ((i & 32) != 0) {
                z3 = uiState.showPinnedSections;
            }
            if ((i & 64) != 0) {
                artifactSortMode = uiState.sortMode;
            }
            if ((i & 128) != 0) {
                z4 = uiState.mediaHasMore;
            }
            if ((i & 256) != 0) {
                z5 = uiState.isLoadingMoreMedia;
            }
            if ((i & 512) != 0) {
                z6 = uiState.artifactsHasMore;
            }
            if ((i & 1024) != 0) {
                z7 = uiState.isLoadingMoreArtifacts;
            }
            return uiState.copy(loadingState, z, z2, ahd, ahd2, z3, artifactSortMode, z4, z5, z6, z7);
        }

        public final LoadingState component1() {
            return this.loadingState;
        }

        public final boolean component10() {
            return this.artifactsHasMore;
        }

        public final boolean component11() {
            return this.isLoadingMoreArtifacts;
        }

        public final boolean component2() {
            return this.artifactsLoadFailed;
        }

        public final boolean component3() {
            return this.mediaLoadFailed;
        }

        public final AHD<MediaEntryUiModel> component4() {
            return this.mediaEntries;
        }

        public final AHD<ArtifactFile> component5() {
            return this.artifacts;
        }

        public final boolean component6() {
            return this.showPinnedSections;
        }

        public final ArtifactSortMode component7() {
            return this.sortMode;
        }

        public final boolean component8() {
            return this.mediaHasMore;
        }

        public final boolean component9() {
            return this.isLoadingMoreMedia;
        }

        public final AHD<ArtifactFile> getArtifacts() {
            return this.artifacts;
        }

        public final boolean getArtifactsHasMore() {
            return this.artifactsHasMore;
        }

        public final boolean getArtifactsLoadFailed() {
            return this.artifactsLoadFailed;
        }

        public final LoadingState getLoadingState() {
            return this.loadingState;
        }

        public final AHD<MediaEntryUiModel> getMediaEntries() {
            return this.mediaEntries;
        }

        public final boolean getMediaHasMore() {
            return this.mediaHasMore;
        }

        public final boolean getMediaLoadFailed() {
            return this.mediaLoadFailed;
        }

        public final boolean getShowPinnedSections() {
            return this.showPinnedSections;
        }

        public final ArtifactSortMode getSortMode() {
            return this.sortMode;
        }

        public int hashCode() {
            return C0KA.A00(C0KA.A01(C0KA.A01(C0KA.A01(AnonymousClass005.A0F(this.sortMode, C0KA.A01(AnonymousClass005.A0F(this.artifacts, AnonymousClass005.A0F(this.mediaEntries, C0KA.A01(C0KA.A01(AnonymousClass005.A0E(this.loadingState), this.artifactsLoadFailed), this.mediaLoadFailed))), this.showPinnedSections)), this.mediaHasMore), this.isLoadingMoreMedia), this.artifactsHasMore), this.isLoadingMoreArtifacts);
        }

        public final boolean isLoadingMoreArtifacts() {
            return this.isLoadingMoreArtifacts;
        }

        public final boolean isLoadingMoreMedia() {
            return this.isLoadingMoreMedia;
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ UiState(LoadingState loadingState, boolean z, boolean z2, AHD ahd, AHD ahd2, boolean z3, ArtifactSortMode artifactSortMode, boolean z4, boolean z5, boolean z6, boolean z7, int i, C06H c06h) {
            this((i & 1) != 0 ? LoadingState.INITIAL : loadingState, AnonymousClass001.A1Q(i, z), AnonymousClass005.A1O(i, z2), (i & 8) != 0 ? AHI.A01 : ahd, (i & 16) != 0 ? AHI.A01 : ahd2, (i & 32) != 0 ? false : z3, (i & 64) != 0 ? ArtifactSortMode.LAST_MODIFIED : artifactSortMode, (i & 128) != 0 ? false : z4, (i & 256) != 0 ? false : z5, (i & 512) != 0 ? false : z6, (i & 1024) != 0 ? false : z7);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public UiState() {
            LoadingState loadingState = LoadingState.INITIAL;
            AHI ahi = AHI.A01;
            this(loadingState, false, false, ahi, ahi, false, ArtifactSortMode.LAST_MODIFIED, false, false, false, false);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.model.HatchLibraryViewModel$loadMoreArtifacts$1", f = "HatchLibraryViewModel.kt", l = {231}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.model.HatchLibraryViewModel$loadMoreArtifacts$1, reason: invalid class name and case insensitive filesystem */
    public final class C122621 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C122621(HtJ<? super C122621> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchLibraryViewModel.this.new C122621(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                UnifiedArtifactsRepository unifiedArtifactsRepository = HatchLibraryViewModel.this.artifacts;
                this.label = 1;
                if (unifiedArtifactsRepository.loadMore(this) == enumC10460Hji) {
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
            return HatchLibraryViewModel.this.new C122621(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.model.HatchLibraryViewModel$loadMoreMedia$1", f = "HatchLibraryViewModel.kt", l = {226}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.model.HatchLibraryViewModel$loadMoreMedia$1, reason: invalid class name and case insensitive filesystem */
    public final class C122631 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C122631(HtJ<? super C122631> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchLibraryViewModel.this.new C122631(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                ThingsAndMediaDataSource thingsAndMediaDataSource = HatchLibraryViewModel.this.feed;
                this.label = 1;
                if (thingsAndMediaDataSource.loadMoreMedia(this) == enumC10460Hji) {
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
            return HatchLibraryViewModel.this.new C122631(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.model.HatchLibraryViewModel$observeFeed$1", f = "HatchLibraryViewModel.kt", l = {104}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.model.HatchLibraryViewModel$observeFeed$1, reason: invalid class name and case insensitive filesystem */
    public final class C122641 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        @DebugMetadata(c = "com.facebook.aura.library.model.HatchLibraryViewModel$observeFeed$1$1", f = "HatchLibraryViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.library.model.HatchLibraryViewModel$observeFeed$1$1, reason: invalid class name and collision with other inner class name */
        public final class C01891 extends AbstractC07127nr implements G2l<AHD<? extends WorkspaceEntry>, LoadingState, AHD<? extends UnifiedArtifact>, LoadingState, ArtifactSortMode, HtJ<? super FeedSnapshot>, Object> {
            public /* synthetic */ Object L$0;
            public /* synthetic */ Object L$1;
            public /* synthetic */ Object L$2;
            public /* synthetic */ Object L$3;
            public /* synthetic */ Object L$4;
            public int label;

            public C01891(HtJ<? super C01891> htJ) {
                super(6, htJ);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(AHD<WorkspaceEntry> ahd, LoadingState loadingState, AHD<UnifiedArtifact> ahd2, LoadingState loadingState2, ArtifactSortMode artifactSortMode, HtJ<? super FeedSnapshot> htJ) {
                C01891 c01891 = new C01891(htJ);
                c01891.L$0 = ahd;
                c01891.L$1 = loadingState;
                c01891.L$2 = ahd2;
                c01891.L$3 = loadingState2;
                c01891.L$4 = artifactSortMode;
                return c01891.invokeSuspend(Unit.INSTANCE);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                AHD ahd = (AHD) this.L$0;
                LoadingState loadingState = (LoadingState) this.L$1;
                AHD ahd2 = (AHD) this.L$2;
                LoadingState loadingState2 = (LoadingState) this.L$3;
                ArtifactSortMode artifactSortMode = (ArtifactSortMode) this.L$4;
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return new FeedSnapshot(ahd, loadingState, ahd2, loadingState2, artifactSortMode);
            }

            @Override // X.G2l
            public /* bridge */ /* synthetic */ Object invoke(AHD<? extends WorkspaceEntry> ahd, LoadingState loadingState, AHD<? extends UnifiedArtifact> ahd2, LoadingState loadingState2, ArtifactSortMode artifactSortMode, HtJ<? super FeedSnapshot> htJ) {
                return invoke2((AHD<WorkspaceEntry>) ahd, loadingState, (AHD<UnifiedArtifact>) ahd2, loadingState2, artifactSortMode, htJ);
            }
        }

        /* renamed from: com.facebook.aura.library.model.HatchLibraryViewModel$observeFeed$1$2, reason: invalid class name */
        public final class AnonymousClass2<T> implements C20Z {
            public final /* synthetic */ HatchLibraryViewModel this$0;

            @DebugMetadata(c = "com.facebook.aura.library.model.HatchLibraryViewModel$observeFeed$1$2$1", f = "HatchLibraryViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
            /* renamed from: com.facebook.aura.library.model.HatchLibraryViewModel$observeFeed$1$2$1, reason: invalid class name and collision with other inner class name */
            public final class C01901 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HxE<? extends AHD<? extends MediaEntryUiModel>, ? extends AHD<? extends ArtifactFile>>>, Object> {
                public final /* synthetic */ AHD<UnifiedArtifact> $artifactItems;
                public final /* synthetic */ AHD<WorkspaceEntry> $mediaSnapshot;
                public int label;
                public final /* synthetic */ HatchLibraryViewModel this$0;

                @Override // X.AbstractC8884Fsp
                public final Object invokeSuspend(Object obj) {
                    String strResolveThumbnailUrl;
                    if (this.label != 0) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    AHD<WorkspaceEntry> ahd = this.$mediaSnapshot;
                    HatchLibraryViewModel hatchLibraryViewModel = this.this$0;
                    ArrayList arrayListA0m = AnonymousClass002.A0m(ahd);
                    for (WorkspaceEntry workspaceEntry : ahd) {
                        boolean zA0k = AbstractC0878AGe.A0k(HatchFileUIUtils.FileExtensions.VIDEO, workspaceEntry.getFileExtension());
                        String str = workspaceEntry.name;
                        String str2 = workspaceEntry.relativePath;
                        WorkspaceUriResolver workspaceUriResolver = WorkspaceUriResolver.INSTANCE;
                        String strResolveRawAssetUrl = workspaceUriResolver.resolveRawAssetUrl(str2, hatchLibraryViewModel.userSession);
                        String strResolveThumbnailUrl2 = null;
                        if (zA0k) {
                            strResolveThumbnailUrl = null;
                        } else {
                            strResolveThumbnailUrl = workspaceUriResolver.resolveThumbnailUrl(workspaceEntry.relativePath, hatchLibraryViewModel.userSession, HatchThumbnailDisplaySize.SMALL);
                            strResolveThumbnailUrl2 = workspaceUriResolver.resolveThumbnailUrl(workspaceEntry.relativePath, hatchLibraryViewModel.userSession, HatchThumbnailDisplaySize.MEDIUM);
                        }
                        arrayListA0m.add(new MediaEntryUiModel(str, str2, strResolveRawAssetUrl, strResolveThumbnailUrl, strResolveThumbnailUrl2, zA0k, zA0k ? HatchFileOperations.INSTANCE.buildAuthenticatedVideoThumbnailUrls(workspaceEntry.relativePath, hatchLibraryViewModel.userSession, HatchThumbnailDisplaySize.SMALL) : C0881AGi.A00));
                    }
                    AHD ahdA07 = AGI.A07(arrayListA0m);
                    AHD<UnifiedArtifact> ahd2 = this.$artifactItems;
                    HatchLibraryViewModel hatchLibraryViewModel2 = this.this$0;
                    ArrayList arrayListA0m2 = AnonymousClass002.A0m(ahd2);
                    Iterator it = ahd2.iterator();
                    while (it.hasNext()) {
                        arrayListA0m2.add(HatchLibraryViewModelKt.toArtifactFile((UnifiedArtifact) it.next(), hatchLibraryViewModel2.userSession));
                    }
                    return new HxE(ahdA07, AGI.A07(arrayListA0m2));
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C01901(AHD<WorkspaceEntry> ahd, AHD<UnifiedArtifact> ahd2, HatchLibraryViewModel hatchLibraryViewModel, HtJ<? super C01901> htJ) {
                    super(2, htJ);
                    this.$mediaSnapshot = ahd;
                    this.$artifactItems = ahd2;
                    this.this$0 = hatchLibraryViewModel;
                }

                @Override // X.AbstractC8884Fsp
                public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                    return new C01901(this.$mediaSnapshot, this.$artifactItems, this.this$0, htJ);
                }

                @Override // X.G0V
                public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HxE<? extends AHD<? extends MediaEntryUiModel>, ? extends AHD<? extends ArtifactFile>>> htJ) {
                    return invoke2(c3ux, (HtJ<? super HxE<? extends AHD<MediaEntryUiModel>, ? extends AHD<ArtifactFile>>>) htJ);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(C3UX c3ux, HtJ<? super HxE<? extends AHD<MediaEntryUiModel>, ? extends AHD<ArtifactFile>>> htJ) {
                    return ((C01901) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
                }
            }

            public AnonymousClass2(HatchLibraryViewModel hatchLibraryViewModel) {
                this.this$0 = hatchLibraryViewModel;
            }

            @Override // X.C20Z
            public /* bridge */ /* synthetic */ Object emit(Object obj, HtJ htJ) {
                return emit((FeedSnapshot) obj, (HtJ<? super Unit>) htJ);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0096  */
            /* JADX WARN: Type inference failed for: r7v5, types: [java.util.List] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(com.facebook.aura.library.model.FeedSnapshot r15, X.HtJ<? super kotlin.Unit> r16) {
                /*
                    Method dump skipped, instructions count: 244
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.model.HatchLibraryViewModel.C122641.AnonymousClass2.emit(com.facebook.aura.library.model.FeedSnapshot, X.HtJ):java.lang.Object");
            }
        }

        public C122641(HtJ<? super C122641> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchLibraryViewModel.this.new C122641(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchLibraryViewModel hatchLibraryViewModel = HatchLibraryViewModel.this;
                ThingsAndMediaDataSource thingsAndMediaDataSource = hatchLibraryViewModel.feed;
                C1BN<AHD<WorkspaceEntry>> c1bn = thingsAndMediaDataSource.media;
                C1BN<LoadingState> c1bn2 = thingsAndMediaDataSource.loadingState;
                UnifiedArtifactsRepository unifiedArtifactsRepository = hatchLibraryViewModel.artifacts;
                AnonymousClass603 anonymousClass603A02 = C3rb.A02(new C01891(null), c1bn, c1bn2, unifiedArtifactsRepository.items, unifiedArtifactsRepository.loadingState, unifiedArtifactsRepository.sort);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(HatchLibraryViewModel.this);
                this.label = 1;
                if (anonymousClass603A02.collect(anonymousClass2, this) == enumC10460Hji) {
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
            return HatchLibraryViewModel.this.new C122641(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.model.HatchLibraryViewModel$observeMediaLoadFailure$1", f = "HatchLibraryViewModel.kt", l = {218}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.model.HatchLibraryViewModel$observeMediaLoadFailure$1, reason: invalid class name and case insensitive filesystem */
    public final class C122651 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C122651(HtJ<? super C122651> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchLibraryViewModel.this.new C122651(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final HatchLibraryViewModel hatchLibraryViewModel = HatchLibraryViewModel.this;
                C1BN<Boolean> c1bn = hatchLibraryViewModel.feed.mediaLoadFailed;
                C20Z<? super Boolean> c20z = new C20Z() { // from class: com.facebook.aura.library.model.HatchLibraryViewModel.observeMediaLoadFailure.1.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit(AnonymousClass001.A1X(obj2), (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                        UiState value;
                        BLG<UiState> blg = hatchLibraryViewModel._uiState;
                        do {
                            value = blg.getValue();
                        } while (!blg.A6e(value, UiState.copy$default(value, null, false, z, null, null, false, null, false, false, false, false, 2043, null)));
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
            return HatchLibraryViewModel.this.new C122651(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.model.HatchLibraryViewModel$observePagination$1", f = "HatchLibraryViewModel.kt", l = {212}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.model.HatchLibraryViewModel$observePagination$1, reason: invalid class name and case insensitive filesystem */
    public final class C122661 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        @DebugMetadata(c = "com.facebook.aura.library.model.HatchLibraryViewModel$observePagination$1$1", f = "HatchLibraryViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.library.model.HatchLibraryViewModel$observePagination$1$1, reason: invalid class name and collision with other inner class name */
        public final class C01921 extends AbstractC07127nr implements G2k<Boolean, Boolean, Boolean, Boolean, HtJ<? super Unit>, Object> {
            public /* synthetic */ boolean Z$0;
            public /* synthetic */ boolean Z$1;
            public /* synthetic */ boolean Z$2;
            public /* synthetic */ boolean Z$3;
            public int label;
            public final /* synthetic */ HatchLibraryViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01921(HatchLibraryViewModel hatchLibraryViewModel, HtJ<? super C01921> htJ) {
                super(5, htJ);
                this.this$0 = hatchLibraryViewModel;
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                UiState value;
                UiState uiState;
                boolean z = this.Z$0;
                boolean z2 = this.Z$1;
                boolean z3 = this.Z$2;
                boolean z4 = this.Z$3;
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                BLG<UiState> blg = this.this$0._uiState;
                do {
                    value = blg.getValue();
                    uiState = value;
                } while (!blg.A6e(value, uiState.copy(uiState.loadingState, uiState.artifactsLoadFailed, uiState.mediaLoadFailed, uiState.mediaEntries, uiState.artifacts, uiState.showPinnedSections, uiState.sortMode, z, z2, z3, z4)));
                return Unit.INSTANCE;
            }

            @Override // X.G2k
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, HtJ<? super Unit> htJ) {
                return invoke(AnonymousClass001.A1X(bool), AnonymousClass001.A1X(bool2), AnonymousClass001.A1X(bool3), AnonymousClass001.A1X(bool4), htJ);
            }

            public final Object invoke(boolean z, boolean z2, boolean z3, boolean z4, HtJ<? super Unit> htJ) {
                C01921 c01921 = new C01921(this.this$0, htJ);
                c01921.Z$0 = z;
                c01921.Z$1 = z2;
                c01921.Z$2 = z3;
                c01921.Z$3 = z4;
                return c01921.invokeSuspend(Unit.INSTANCE);
            }
        }

        public C122661(HtJ<? super C122661> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchLibraryViewModel.this.new C122661(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchLibraryViewModel hatchLibraryViewModel = HatchLibraryViewModel.this;
                ThingsAndMediaDataSource thingsAndMediaDataSource = hatchLibraryViewModel.feed;
                C1BN<Boolean> c1bn = thingsAndMediaDataSource.mediaHasMoreFlow;
                C1BN<Boolean> c1bn2 = thingsAndMediaDataSource.isLoadingMoreMedia;
                UnifiedArtifactsRepository unifiedArtifactsRepository = hatchLibraryViewModel.artifacts;
                AnonymousClass603 anonymousClass603A01 = C3rb.A01(new C01921(hatchLibraryViewModel, null), c1bn, c1bn2, unifiedArtifactsRepository.hasNextPage, unifiedArtifactsRepository.isLoadingMore);
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.library.model.HatchLibraryViewModel.observePagination.1.2
                    public final Object emit(Unit unit, HtJ<? super Unit> htJ) {
                        return Unit.INSTANCE;
                    }

                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (anonymousClass603A01.collect(c20z, this) == enumC10460Hji) {
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
            return HatchLibraryViewModel.this.new C122661(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.model.HatchLibraryViewModel$onSelectSort$1", f = "HatchLibraryViewModel.kt", l = {245}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.model.HatchLibraryViewModel$onSelectSort$1, reason: invalid class name and case insensitive filesystem */
    public final class C122671 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ ArtifactSortMode $mode;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C122671(ArtifactSortMode artifactSortMode, HtJ<? super C122671> htJ) {
            super(2, htJ);
            this.$mode = artifactSortMode;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchLibraryViewModel.this.new C122671(this.$mode, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                UnifiedArtifactsRepository unifiedArtifactsRepository = HatchLibraryViewModel.this.artifacts;
                ArtifactSortMode artifactSortMode = this.$mode;
                this.label = 1;
                if (unifiedArtifactsRepository.setSort(artifactSortMode, this) == enumC10460Hji) {
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
            return ((C122671) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.model.HatchLibraryViewModel$onTogglePin$1", f = "HatchLibraryViewModel.kt", l = {238, 239}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.model.HatchLibraryViewModel$onTogglePin$1, reason: invalid class name and case insensitive filesystem */
    public final class C122681 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ UnifiedArtifact $item;
        public int label;
        public final /* synthetic */ HatchLibraryViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C122681(UnifiedArtifact unifiedArtifact, HatchLibraryViewModel hatchLibraryViewModel, HtJ<? super C122681> htJ) {
            super(2, htJ);
            this.$item = unifiedArtifact;
            this.this$0 = hatchLibraryViewModel;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C122681(this.$item, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objPinToTop;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                UnifiedArtifact unifiedArtifact = this.$item;
                boolean z = unifiedArtifact.isPinned;
                ArtifactsDataSource artifactsDataSource = this.this$0.pinning;
                ArtifactSource artifactSource = unifiedArtifact.source;
                String str = unifiedArtifact.itemKey;
                if (z) {
                    this.label = 1;
                    objPinToTop = artifactsDataSource.unpin(artifactSource, str, this);
                } else {
                    this.label = 2;
                    objPinToTop = artifactsDataSource.pinToTop(artifactSource, str, this);
                }
                if (objPinToTop == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1 && i != 2) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C122681) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.model.HatchLibraryViewModel$refresh$1", f = "HatchLibraryViewModel.kt", l = {251}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.model.HatchLibraryViewModel$refresh$1, reason: invalid class name and case insensitive filesystem */
    public final class C122691 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C122691(HtJ<? super C122691> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchLibraryViewModel.this.new C122691(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                ThingsAndMediaDataSource thingsAndMediaDataSource = HatchLibraryViewModel.this.feed;
                this.label = 1;
                if (thingsAndMediaDataSource.refresh(false, this) == enumC10460Hji) {
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
            return HatchLibraryViewModel.this.new C122691(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.model.HatchLibraryViewModel$refresh$2", f = "HatchLibraryViewModel.kt", l = {252}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.model.HatchLibraryViewModel$refresh$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchLibraryViewModel.this.new AnonymousClass2(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                UnifiedArtifactsRepository unifiedArtifactsRepository = HatchLibraryViewModel.this.artifacts;
                this.label = 1;
                if (unifiedArtifactsRepository.refresh(false, this) == enumC10460Hji) {
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
            return HatchLibraryViewModel.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.model.HatchLibraryViewModel$refreshSilently$1", f = "HatchLibraryViewModel.kt", l = {258}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.model.HatchLibraryViewModel$refreshSilently$1, reason: invalid class name and case insensitive filesystem */
    public final class C122701 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C122701(HtJ<? super C122701> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchLibraryViewModel.this.new C122701(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                ThingsAndMediaDataSource thingsAndMediaDataSource = HatchLibraryViewModel.this.feed;
                this.label = 1;
                if (thingsAndMediaDataSource.refresh(true, this) == enumC10460Hji) {
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
            return HatchLibraryViewModel.this.new C122701(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.model.HatchLibraryViewModel$refreshSilently$2", f = "HatchLibraryViewModel.kt", l = {259}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.model.HatchLibraryViewModel$refreshSilently$2, reason: invalid class name and case insensitive filesystem */
    public final class C122712 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C122712(HtJ<? super C122712> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchLibraryViewModel.this.new C122712(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                UnifiedArtifactsRepository unifiedArtifactsRepository = HatchLibraryViewModel.this.artifacts;
                this.label = 1;
                if (unifiedArtifactsRepository.refresh(true, this) == enumC10460Hji) {
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
            return HatchLibraryViewModel.this.new C122712(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public HatchLibraryViewModel(ThingsAndMediaDataSource thingsAndMediaDataSource, UnifiedArtifactsRepository unifiedArtifactsRepository, ArtifactsDataSource artifactsDataSource, AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(thingsAndMediaDataSource, 0);
        AnonymousClass005.A11(unifiedArtifactsRepository, artifactsDataSource, abstractC3358CGz, 1);
        this.feed = thingsAndMediaDataSource;
        this.artifacts = unifiedArtifactsRepository;
        this.pinning = artifactsDataSource;
        this.userSession = abstractC3358CGz;
        LoadingState loadingState = LoadingState.INITIAL;
        AHI ahi = AHI.A01;
        C9286GCn c9286GCn = new C9286GCn(new UiState(loadingState, false, false, ahi, ahi, false, ArtifactSortMode.LAST_MODIFIED, false, false, false, false));
        this._uiState = c9286GCn;
        this.uiState = new C3Pi(null, c9286GCn);
        this.artifactsById = AGH.A0E();
        this.prefs = HatchPrefsStore.INSTANCE.userPrefs(abstractC3358CGz);
        observeFeed();
        observePagination();
        observeMediaLoadFailure();
        thingsAndMediaDataSource.start();
        AnonymousClass001.A1J(new AnonymousClass1(null), AEu.A00(this));
    }

    public final void onSelectSort(ArtifactSortMode artifactSortMode) {
        C7384Etj.A0Y(artifactSortMode, 0);
        BzK bzKA9q = this.prefs.A9q();
        bzKA9q.AYr(HatchLibraryViewModelKt.LIBRARY_SORT_MODE_PREF_KEY, artifactSortMode.name());
        bzKA9q.apply();
        AnonymousClass001.A1J(new C122671(artifactSortMode, null), AEu.A00(this));
    }

    public final void onTogglePin(ArtifactFile artifactFile) {
        C7384Etj.A0Y(artifactFile, 0);
        UnifiedArtifact unifiedArtifact = this.artifactsById.get(artifactFile.id);
        if (unifiedArtifact != null) {
            AnonymousClass001.A1J(new C122681(unifiedArtifact, this, null), AEu.A00(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        return com.facebook.aura.library.repo.ArtifactSortMode.TITLE;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.library.repo.ArtifactSortMode readPersistedSort() {
        /*
            r2 = this;
            X.4oT r2 = r2.prefs
            java.lang.String r1 = "library_sort_mode"
            r0 = 0
            java.lang.String r2 = r2.getString(r1, r0)
            if (r2 == 0) goto L26
            int r1 = r2.hashCode()
            r0 = -1889256910(0xffffffff8f643a32, float:-1.1252476E-29)
            if (r1 == r0) goto L34
            r0 = 2388619(0x24728b, float:3.347168E-39)
            if (r1 == r0) goto L29
            r0 = 79833656(0x4c22a38, float:4.5647953E-36)
            if (r1 != r0) goto L26
            java.lang.String r0 = "TITLE"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L31
        L26:
            com.facebook.aura.library.repo.ArtifactSortMode r0 = com.facebook.aura.library.repo.ArtifactSortMode.LAST_MODIFIED
            return r0
        L29:
            java.lang.String r0 = "NAME"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L26
        L31:
            com.facebook.aura.library.repo.ArtifactSortMode r0 = com.facebook.aura.library.repo.ArtifactSortMode.TITLE
            return r0
        L34:
            java.lang.String r0 = "LAST_OPENED"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L26
            com.facebook.aura.library.repo.ArtifactSortMode r0 = com.facebook.aura.library.repo.ArtifactSortMode.LAST_OPENED
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.model.HatchLibraryViewModel.readPersistedSort():com.facebook.aura.library.repo.ArtifactSortMode");
    }

    public final void clearData() {
        this.feed.clearData();
        BLG<UiState> blg = this._uiState;
        LoadingState loadingState = LoadingState.INITIAL;
        AHI ahi = AHI.A01;
        AnonymousClass001.A1E(blg, null, new UiState(loadingState, false, false, ahi, ahi, false, ArtifactSortMode.LAST_MODIFIED, false, false, false, false));
    }

    public final C1BN<UiState> getUiState() {
        return this.uiState;
    }

    private final void observeFeed() {
        AnonymousClass001.A1J(new C122641(null), AEu.A00(this));
    }

    private final void observeMediaLoadFailure() {
        AnonymousClass001.A1J(new C122651(null), AEu.A00(this));
    }

    private final void observePagination() {
        AnonymousClass001.A1J(new C122661(null), AEu.A00(this));
    }

    public final void loadMoreArtifacts() {
        AnonymousClass001.A1J(new C122621(null), AEu.A00(this));
    }

    public final void loadMoreMedia() {
        AnonymousClass001.A1J(new C122631(null), AEu.A00(this));
    }

    public final void refresh() {
        BLL bllA00 = AEu.A00(this);
        C122691 c122691 = new C122691(null);
        C6ys c6ys = C6ys.A00;
        Integer num = C79.A00;
        GAo.A02(num, c6ys, new AnonymousClass2(null), AnonymousClass001.A0e(this, num, c6ys, c122691, bllA00));
    }

    public final void refreshSilently() {
        BLL bllA00 = AEu.A00(this);
        C122701 c122701 = new C122701(null);
        C6ys c6ys = C6ys.A00;
        Integer num = C79.A00;
        GAo.A02(num, c6ys, new C122712(null), AnonymousClass001.A0e(this, num, c6ys, c122701, bllA00));
    }
}
