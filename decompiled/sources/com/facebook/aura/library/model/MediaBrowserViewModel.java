package com.facebook.aura.library.model;

import X.AEs;
import X.AEu;
import X.AHD;
import X.AHI;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass603;
import X.BLG;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C1BN;
import X.C20Z;
import X.C3UX;
import X.C3cG;
import X.C3rb;
import X.C7384Etj;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0V;
import X.G2k;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.gateway.VmAuthTokenKt;
import com.facebook.aura.installsource.AuraInstallSourceDetector;
import com.facebook.aura.library.repo.LoadingState;
import com.facebook.aura.library.repo.ThingsAndMediaDataSource;
import com.facebook.aura.library.repo.WorkspaceBrowseError;
import com.facebook.aura.library.repo.WorkspaceEntry;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class MediaBrowserViewModel extends AEs {
    public static final int $stable = 8;
    public final BLG<UiState> _uiState;
    public final ThingsAndMediaDataSource feed;
    public final C1BN<UiState> uiState;
    public final AbstractC3358CGz userSession;

    public final class Factory extends AuraViewModelFactory<MediaBrowserViewModel> {
        public static final int $stable = 8;
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public MediaBrowserViewModel create() {
            return new MediaBrowserViewModel(ThingsAndMediaDataSource.Companion.getInstance(this.userSession), this.userSession);
        }
    }

    public final class MediaFeedSnapshot extends C06G {
        public final AHD<WorkspaceEntry> entries;
        public final boolean hasMore;
        public final boolean isLoadingMore;
        public final boolean loading;

        public MediaFeedSnapshot(AHD<WorkspaceEntry> ahd, boolean z, boolean z2, boolean z3) {
            C7384Etj.A0Y(ahd, 0);
            this.entries = ahd;
            this.loading = z;
            this.hasMore = z2;
            this.isLoadingMore = z3;
        }

        public final MediaFeedSnapshot copy(AHD<WorkspaceEntry> ahd, boolean z, boolean z2, boolean z3) {
            C7384Etj.A0Y(ahd, 0);
            return new MediaFeedSnapshot(ahd, z, z2, z3);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof MediaFeedSnapshot) {
                    MediaFeedSnapshot mediaFeedSnapshot = (MediaFeedSnapshot) obj;
                    if (!C7384Etj.areEqual(this.entries, mediaFeedSnapshot.entries) || this.loading != mediaFeedSnapshot.loading || this.hasMore != mediaFeedSnapshot.hasMore || this.isLoadingMore != mediaFeedSnapshot.isLoadingMore) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ MediaFeedSnapshot copy$default(MediaFeedSnapshot mediaFeedSnapshot, AHD ahd, boolean z, boolean z2, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                ahd = mediaFeedSnapshot.entries;
            }
            if ((i & 2) != 0) {
                z = mediaFeedSnapshot.loading;
            }
            if ((i & 4) != 0) {
                z2 = mediaFeedSnapshot.hasMore;
            }
            if ((i & 8) != 0) {
                z3 = mediaFeedSnapshot.isLoadingMore;
            }
            C7384Etj.A0Y(ahd, 0);
            return new MediaFeedSnapshot(ahd, z, z2, z3);
        }

        public final AHD<WorkspaceEntry> component1() {
            return this.entries;
        }

        public final boolean component2() {
            return this.loading;
        }

        public final boolean component3() {
            return this.hasMore;
        }

        public final boolean component4() {
            return this.isLoadingMore;
        }

        public final AHD<WorkspaceEntry> getEntries() {
            return this.entries;
        }

        public final boolean getHasMore() {
            return this.hasMore;
        }

        public final boolean getLoading() {
            return this.loading;
        }

        public int hashCode() {
            return C0KA.A00(C0KA.A01(C0KA.A01(AnonymousClass005.A0E(this.entries), this.loading), this.hasMore), this.isLoadingMore);
        }

        public final boolean isLoadingMore() {
            return this.isLoadingMore;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class UiState extends C06G {
        public static final int $stable = 8;
        public final AHD<MediaEntryUiModel> entries;
        public final WorkspaceBrowseError error;
        public final boolean hasMore;
        public final boolean isLoadingMore;
        public final LoadingState loadingState;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof UiState) {
                    UiState uiState = (UiState) obj;
                    if (this.loadingState != uiState.loadingState || !C7384Etj.areEqual(this.entries, uiState.entries) || this.hasMore != uiState.hasMore || this.isLoadingMore != uiState.isLoadingMore || !C7384Etj.areEqual(this.error, uiState.error)) {
                    }
                }
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UiState copy$default(UiState uiState, LoadingState loadingState, AHD ahd, boolean z, boolean z2, WorkspaceBrowseError workspaceBrowseError, int i, Object obj) {
            if ((i & 1) != 0) {
                loadingState = uiState.loadingState;
            }
            if ((i & 2) != 0) {
                ahd = uiState.entries;
            }
            if ((i & 4) != 0) {
                z = uiState.hasMore;
            }
            if ((i & 8) != 0) {
                z2 = uiState.isLoadingMore;
            }
            if ((i & 16) != 0) {
                workspaceBrowseError = uiState.error;
            }
            return uiState.copy(loadingState, ahd, z, z2, workspaceBrowseError);
        }

        public final LoadingState component1() {
            return this.loadingState;
        }

        public final AHD<MediaEntryUiModel> component2() {
            return this.entries;
        }

        public final boolean component3() {
            return this.hasMore;
        }

        public final boolean component4() {
            return this.isLoadingMore;
        }

        public final WorkspaceBrowseError component5() {
            return this.error;
        }

        public final AHD<MediaEntryUiModel> getEntries() {
            return this.entries;
        }

        public final WorkspaceBrowseError getError() {
            return this.error;
        }

        public final boolean getHasMore() {
            return this.hasMore;
        }

        public final LoadingState getLoadingState() {
            return this.loadingState;
        }

        public int hashCode() {
            return C0KA.A01(C0KA.A01(AnonymousClass005.A0F(this.entries, AnonymousClass005.A0E(this.loadingState)), this.hasMore), this.isLoadingMore) + AnonymousClass006.A0D(this.error);
        }

        public final boolean isLoading() {
            LoadingState loadingState = this.loadingState;
            return loadingState == LoadingState.LOADING || loadingState == LoadingState.INITIAL;
        }

        public final boolean isLoadingMore() {
            return this.isLoadingMore;
        }

        public UiState(LoadingState loadingState, AHD<MediaEntryUiModel> ahd, boolean z, boolean z2, WorkspaceBrowseError workspaceBrowseError) {
            AnonymousClass003.A0u(loadingState, ahd);
            this.loadingState = loadingState;
            this.entries = ahd;
            this.hasMore = z;
            this.isLoadingMore = z2;
            this.error = workspaceBrowseError;
        }

        public final UiState copy(LoadingState loadingState, AHD<MediaEntryUiModel> ahd, boolean z, boolean z2, WorkspaceBrowseError workspaceBrowseError) {
            AnonymousClass003.A0u(loadingState, ahd);
            return new UiState(loadingState, ahd, z, z2, workspaceBrowseError);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ UiState(LoadingState loadingState, AHD ahd, boolean z, boolean z2, WorkspaceBrowseError workspaceBrowseError, int i, C06H c06h) {
            this((i & 1) != 0 ? LoadingState.INITIAL : loadingState, (i & 2) != 0 ? AHI.A01 : ahd, AnonymousClass005.A1O(i, z), AnonymousClass005.A1P(i, z2), (i & 16) != 0 ? null : workspaceBrowseError);
        }

        public UiState() {
            this(LoadingState.INITIAL, AHI.A01, false, false, null);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.model.MediaBrowserViewModel$loadMore$1", f = "MediaBrowserViewModel.kt", l = {AuraInstallSourceDetector.SYSTEM_IMAGE_FLAGS}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.model.MediaBrowserViewModel$loadMore$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return MediaBrowserViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return MediaBrowserViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                ThingsAndMediaDataSource thingsAndMediaDataSource = MediaBrowserViewModel.this.feed;
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
    }

    @DebugMetadata(c = "com.facebook.aura.library.model.MediaBrowserViewModel$observeFeed$1", f = "MediaBrowserViewModel.kt", l = {64}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.model.MediaBrowserViewModel$observeFeed$1, reason: invalid class name and case insensitive filesystem */
    public final class C122721 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        @DebugMetadata(c = "com.facebook.aura.library.model.MediaBrowserViewModel$observeFeed$1$2", f = "MediaBrowserViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.library.model.MediaBrowserViewModel$observeFeed$1$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC07127nr implements G2k<AHD<? extends WorkspaceEntry>, Boolean, Boolean, Boolean, HtJ<? super MediaFeedSnapshot>, Object> {
            public /* synthetic */ Object L$0;
            public /* synthetic */ boolean Z$0;
            public /* synthetic */ boolean Z$1;
            public /* synthetic */ boolean Z$2;
            public int label;

            public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
                super(5, htJ);
            }

            @Override // X.G2k
            public /* bridge */ /* synthetic */ Object invoke(AHD<? extends WorkspaceEntry> ahd, Boolean bool, Boolean bool2, Boolean bool3, HtJ<? super MediaFeedSnapshot> htJ) {
                return invoke((AHD<WorkspaceEntry>) ahd, AnonymousClass001.A1X(bool), AnonymousClass001.A1X(bool2), AnonymousClass001.A1X(bool3), htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                AHD ahd = (AHD) this.L$0;
                boolean z = this.Z$0;
                boolean z2 = this.Z$1;
                boolean z3 = this.Z$2;
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return new MediaFeedSnapshot(ahd, z, z2, z3);
            }

            public final Object invoke(AHD<WorkspaceEntry> ahd, boolean z, boolean z2, boolean z3, HtJ<? super MediaFeedSnapshot> htJ) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(htJ);
                anonymousClass2.L$0 = ahd;
                anonymousClass2.Z$0 = z;
                anonymousClass2.Z$1 = z2;
                anonymousClass2.Z$2 = z3;
                return anonymousClass2.invokeSuspend(Unit.INSTANCE);
            }
        }

        public C122721(HtJ<? super C122721> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return MediaBrowserViewModel.this.new C122721(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return MediaBrowserViewModel.this.new C122721(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                ThingsAndMediaDataSource thingsAndMediaDataSource = MediaBrowserViewModel.this.feed;
                AnonymousClass603 anonymousClass603A01 = C3rb.A01(new AnonymousClass2(null), thingsAndMediaDataSource.media, new MediaBrowserViewModel$observeFeed$1$invokeSuspend$$inlined$map$1(thingsAndMediaDataSource.loadingState), thingsAndMediaDataSource.mediaHasMoreFlow, thingsAndMediaDataSource.isLoadingMoreMedia);
                final MediaBrowserViewModel mediaBrowserViewModel = MediaBrowserViewModel.this;
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.library.model.MediaBrowserViewModel.observeFeed.1.3
                    /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object emit(com.facebook.aura.library.model.MediaBrowserViewModel.MediaFeedSnapshot r20, X.HtJ<? super kotlin.Unit> r21) {
                        /*
                            r19 = this;
                            r0 = r19
                            com.facebook.aura.library.model.MediaBrowserViewModel r3 = r1
                            X.BLG<com.facebook.aura.library.model.MediaBrowserViewModel$UiState> r2 = r3._uiState
                        L6:
                            java.lang.Object r4 = r2.getValue()
                            r5 = r4
                            com.facebook.aura.library.model.MediaBrowserViewModel$UiState r5 = (com.facebook.aura.library.model.MediaBrowserViewModel.UiState) r5
                            r0 = r20
                            X.AHD<com.facebook.aura.library.repo.WorkspaceEntry> r1 = r0.entries
                            java.util.ArrayList r7 = X.AnonymousClass003.A0i(r1)
                            java.util.Iterator r11 = r1.iterator()
                        L19:
                            boolean r1 = r11.hasNext()
                            if (r1 == 0) goto L7f
                            java.lang.Object r8 = r11.next()
                            com.facebook.aura.library.repo.WorkspaceEntry r8 = (com.facebook.aura.library.repo.WorkspaceEntry) r8
                            java.util.Set<java.lang.String> r6 = com.facebook.aura.file.utils.HatchFileUIUtils.FileExtensions.VIDEO
                            java.lang.String r1 = r8.getFileExtension()
                            boolean r1 = X.AbstractC0878AGe.A0k(r6, r1)
                            if (r1 != 0) goto L3f
                            java.util.Set<java.lang.String> r6 = com.facebook.aura.file.utils.HatchFileUIUtils.FileExtensions.AUDIO
                            java.lang.String r1 = r8.getFileExtension()
                            boolean r1 = X.AbstractC0878AGe.A0k(r6, r1)
                            r18 = 0
                            if (r1 == 0) goto L41
                        L3f:
                            r18 = 1
                        L41:
                            java.lang.String r13 = r8.name
                            java.lang.String r14 = r8.relativePath
                            com.facebook.aura.gateway.WorkspaceUriResolver r9 = com.facebook.aura.gateway.WorkspaceUriResolver.INSTANCE
                            X.CGz r1 = r3.userSession
                            java.lang.String r15 = r9.resolveRawAssetUrl(r14, r1)
                            if (r18 == 0) goto L68
                            r16 = 0
                            r17 = 0
                            com.facebook.aura.gateway.HatchFileOperations r9 = com.facebook.aura.gateway.HatchFileOperations.INSTANCE
                            java.lang.String r8 = r8.relativePath
                            X.CGz r6 = r3.userSession
                            com.facebook.aura.gateway.HatchThumbnailDisplaySize r1 = com.facebook.aura.gateway.HatchThumbnailDisplaySize.SMALL
                            java.util.List r19 = r9.buildAuthenticatedVideoThumbnailUrls(r8, r6, r1)
                        L5f:
                            com.facebook.aura.library.model.MediaEntryUiModel r12 = new com.facebook.aura.library.model.MediaEntryUiModel
                            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
                            r7.add(r12)
                            goto L19
                        L68:
                            java.lang.String r10 = r8.relativePath
                            X.CGz r6 = r3.userSession
                            com.facebook.aura.gateway.HatchThumbnailDisplaySize r1 = com.facebook.aura.gateway.HatchThumbnailDisplaySize.SMALL
                            java.lang.String r16 = r9.resolveThumbnailUrl(r10, r6, r1)
                            java.lang.String r8 = r8.relativePath
                            X.CGz r6 = r3.userSession
                            com.facebook.aura.gateway.HatchThumbnailDisplaySize r1 = com.facebook.aura.gateway.HatchThumbnailDisplaySize.MEDIUM
                            java.lang.String r17 = r9.resolveThumbnailUrl(r8, r6, r1)
                            X.AGi r19 = X.C0881AGi.A00
                            goto L5f
                        L7f:
                            X.AHD r9 = X.AGI.A07(r7)
                            boolean r1 = r0.loading
                            if (r1 == 0) goto La0
                            com.facebook.aura.library.repo.LoadingState r8 = com.facebook.aura.library.repo.LoadingState.LOADING
                        L89:
                            boolean r6 = r0.hasMore
                            boolean r1 = r0.isLoadingMore
                            com.facebook.aura.library.repo.WorkspaceBrowseError r0 = r5.error
                            r7 = r5
                            r10 = r6
                            r11 = r1
                            r12 = r0
                            com.facebook.aura.library.model.MediaBrowserViewModel$UiState r0 = r7.copy(r8, r9, r10, r11, r12)
                            boolean r0 = r2.A6e(r4, r0)
                            if (r0 == 0) goto L6
                            kotlin.Unit r0 = kotlin.Unit.INSTANCE
                            return r0
                        La0:
                            com.facebook.aura.library.repo.LoadingState r8 = com.facebook.aura.library.repo.LoadingState.SUCCESS
                            goto L89
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.model.MediaBrowserViewModel.C122721.AnonymousClass3.emit(com.facebook.aura.library.model.MediaBrowserViewModel$MediaFeedSnapshot, X.HtJ):java.lang.Object");
                    }

                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((MediaFeedSnapshot) obj2, (HtJ<? super Unit>) htJ);
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
    }

    @DebugMetadata(c = "com.facebook.aura.library.model.MediaBrowserViewModel$refresh$1", f = "MediaBrowserViewModel.kt", l = {145}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.model.MediaBrowserViewModel$refresh$1, reason: invalid class name and case insensitive filesystem */
    public final class C122731 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C122731(HtJ<? super C122731> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return MediaBrowserViewModel.this.new C122731(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return MediaBrowserViewModel.this.new C122731(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                ThingsAndMediaDataSource thingsAndMediaDataSource = MediaBrowserViewModel.this.feed;
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
    }

    public final int getEntryIndex(MediaEntryUiModel mediaEntryUiModel) {
        C7384Etj.A0Y(mediaEntryUiModel, 0);
        return this._uiState.getValue().entries.indexOf(mediaEntryUiModel);
    }

    public final void clearData() {
        this.feed.clearData();
        AnonymousClass001.A1E(this._uiState, null, new UiState(LoadingState.INITIAL, AHI.A01, false, false, null));
    }

    public final String getAuthToken() {
        return VmAuthTokenKt.vmBoundAuthToken(this.userSession);
    }

    public final C1BN<UiState> getUiState() {
        return this.uiState;
    }

    public final void loadEntries() {
        this.feed.start();
    }

    public final void loadMore() {
        if (this._uiState.getValue().isLoadingMore || !this._uiState.getValue().hasMore) {
            return;
        }
        AnonymousClass001.A1J(new AnonymousClass1(null), AEu.A00(this));
    }

    public MediaBrowserViewModel(ThingsAndMediaDataSource thingsAndMediaDataSource, AbstractC3358CGz abstractC3358CGz) {
        boolean zA1b = AnonymousClass004.A1b(thingsAndMediaDataSource, abstractC3358CGz);
        this.feed = thingsAndMediaDataSource;
        this.userSession = abstractC3358CGz;
        C9286GCn c9286GCnA14 = C3cG.A14(new UiState(LoadingState.INITIAL, AHI.A01, zA1b, zA1b, null));
        this._uiState = c9286GCnA14;
        this.uiState = C3cG.A11(c9286GCnA14);
        observeFeed();
        thingsAndMediaDataSource.start();
    }

    private final void observeFeed() {
        AnonymousClass001.A1J(new C122721(null), AEu.A00(this));
    }

    public final void refresh() {
        AnonymousClass001.A1J(new C122731(null), AEu.A00(this));
    }
}
