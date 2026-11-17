package com.facebook.aura.library.model;

import X.AEs;
import X.AEu;
import X.AGI;
import X.AHD;
import X.AHI;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BLG;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C1BN;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.C9286GCn;
import X.CFK;
import X.EnumC10460Hji;
import X.FGI;
import X.G0V;
import X.HoC;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.gateway.HatchFileOperations;
import com.facebook.aura.library.repo.LoadingState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class ArtifactsViewModel extends AEs {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public static final int PAGE_SIZE = 10;
    public static final String TAG = "ArtifactsViewModel";
    public final BLG<UiState> _uiState;
    public int currentOffset;
    public HoC loadJob;
    public final C1BN<UiState> uiState;
    public final AbstractC3358CGz userSession;

    public final class Factory extends AuraViewModelFactory<ArtifactsViewModel> {
        public static final int $stable = 8;
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public /* bridge */ /* synthetic */ AEs create() {
            return new ArtifactsViewModel(this.userSession);
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public ArtifactsViewModel create() {
            return new ArtifactsViewModel(this.userSession);
        }
    }

    public final class UiState extends C06G {
        public static final int $stable = ArtifactFile.$stable;
        public final AHD<ArtifactFile> artifacts;
        public final String error;
        public final boolean hasMore;
        public final boolean isLoadingMore;
        public final LoadingState loadingState;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof UiState) {
                    UiState uiState = (UiState) obj;
                    if (this.loadingState != uiState.loadingState || !C7384Etj.areEqual(this.artifacts, uiState.artifacts) || this.hasMore != uiState.hasMore || this.isLoadingMore != uiState.isLoadingMore || !C7384Etj.areEqual(this.error, uiState.error)) {
                    }
                }
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UiState copy$default(UiState uiState, LoadingState loadingState, AHD ahd, boolean z, boolean z2, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                loadingState = uiState.loadingState;
            }
            if ((i & 2) != 0) {
                ahd = uiState.artifacts;
            }
            if ((i & 4) != 0) {
                z = uiState.hasMore;
            }
            if ((i & 8) != 0) {
                z2 = uiState.isLoadingMore;
            }
            if ((i & 16) != 0) {
                str = uiState.error;
            }
            return uiState.copy(loadingState, ahd, z, z2, str);
        }

        public final LoadingState component1() {
            return this.loadingState;
        }

        public final AHD<ArtifactFile> component2() {
            return this.artifacts;
        }

        public final boolean component3() {
            return this.hasMore;
        }

        public final boolean component4() {
            return this.isLoadingMore;
        }

        public final String component5() {
            return this.error;
        }

        public final AHD<ArtifactFile> getArtifacts() {
            return this.artifacts;
        }

        public final String getError() {
            return this.error;
        }

        public final boolean getHasMore() {
            return this.hasMore;
        }

        public final LoadingState getLoadingState() {
            return this.loadingState;
        }

        public int hashCode() {
            return C0KA.A01(C0KA.A01(AnonymousClass005.A0F(this.artifacts, AnonymousClass005.A0E(this.loadingState)), this.hasMore), this.isLoadingMore) + AnonymousClass006.A0G(this.error);
        }

        public final boolean isEmpty() {
            return this.artifacts.isEmpty();
        }

        public final boolean isLoading() {
            LoadingState loadingState = this.loadingState;
            return loadingState == LoadingState.LOADING || loadingState == LoadingState.INITIAL;
        }

        public final boolean isLoadingMore() {
            return this.isLoadingMore;
        }

        public UiState(LoadingState loadingState, AHD<ArtifactFile> ahd, boolean z, boolean z2, String str) {
            AnonymousClass003.A0u(loadingState, ahd);
            this.loadingState = loadingState;
            this.artifacts = ahd;
            this.hasMore = z;
            this.isLoadingMore = z2;
            this.error = str;
        }

        public final UiState copy(LoadingState loadingState, AHD<ArtifactFile> ahd, boolean z, boolean z2, String str) {
            AnonymousClass003.A0u(loadingState, ahd);
            return new UiState(loadingState, ahd, z, z2, str);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ UiState(LoadingState loadingState, AHD ahd, boolean z, boolean z2, String str, int i, C06H c06h) {
            this((i & 1) != 0 ? LoadingState.INITIAL : loadingState, (i & 2) != 0 ? AHI.A01 : ahd, AnonymousClass005.A1O(i, z), AnonymousClass005.A1P(i, z2), (i & 16) != 0 ? null : str);
        }

        public UiState() {
            this(LoadingState.INITIAL, AHI.A01, false, false, null);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.model.ArtifactsViewModel$loadArtifacts$1", f = "ArtifactsViewModel.kt", l = {68}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.model.ArtifactsViewModel$loadArtifacts$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ArtifactsViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ArtifactsViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            UiState value;
            UiState uiState;
            UiState value2;
            UiState uiState2;
            UiState value3;
            UiState uiState3;
            UiState value4;
            UiState uiState4;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    ArtifactsViewModel artifactsViewModel = ArtifactsViewModel.this;
                    artifactsViewModel.currentOffset = 0;
                    BLG<UiState> blg = artifactsViewModel._uiState;
                    do {
                        value2 = blg.getValue();
                        uiState2 = value2;
                    } while (!blg.A6e(value2, uiState2.copy(LoadingState.LOADING, uiState2.artifacts, uiState2.hasMore, uiState2.isLoadingMore, uiState2.error)));
                    HatchFileOperations hatchFileOperations = HatchFileOperations.INSTANCE;
                    AbstractC3358CGz abstractC3358CGz = ArtifactsViewModel.this.userSession;
                    Integer numA0R = C3cG.A0R(10);
                    this.label = 1;
                    obj = hatchFileOperations.libraryFiles("artifacts", abstractC3358CGz, numA0R, null, this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                HatchFileOperations.LibraryResult libraryResult = (HatchFileOperations.LibraryResult) obj;
                if (libraryResult instanceof HatchFileOperations.LibraryResult.Success) {
                    HatchFileOperations.LibraryResult.Success success = (HatchFileOperations.LibraryResult.Success) libraryResult;
                    List<HatchFileOperations.LibraryEntry> list = success.entries;
                    ArtifactsViewModel artifactsViewModel2 = ArtifactsViewModel.this;
                    ArrayList arrayListA0m = AnonymousClass002.A0m(list);
                    Iterator<HatchFileOperations.LibraryEntry> it = list.iterator();
                    while (it.hasNext()) {
                        arrayListA0m.add(ArtifactsViewModelKt.toArtifactFile(it.next(), artifactsViewModel2.userSession));
                    }
                    AHD<ArtifactFile> ahdA07 = AGI.A07(arrayListA0m);
                    ArtifactsViewModel.this.currentOffset = success.entries.size();
                    BLG<UiState> blg2 = ArtifactsViewModel.this._uiState;
                    do {
                        value4 = blg2.getValue();
                        uiState4 = value4;
                    } while (!blg2.A6e(value4, uiState4.copy(LoadingState.SUCCESS, ahdA07, success.hasMore, uiState4.isLoadingMore, uiState4.error)));
                } else {
                    if (!(libraryResult instanceof HatchFileOperations.LibraryResult.Failed)) {
                        throw C3cG.A0q();
                    }
                    BLG<UiState> blg3 = ArtifactsViewModel.this._uiState;
                    do {
                        value3 = blg3.getValue();
                        uiState3 = value3;
                    } while (!blg3.A6e(value3, uiState3.copy(LoadingState.SUCCESS, AHI.A01, uiState3.hasMore, uiState3.isLoadingMore, uiState3.error)));
                }
            } catch (Exception e) {
                CFK.A06(ArtifactsViewModel.TAG, FGI.A0M("Failed to load artifacts: ", e.getMessage()));
                BLG<UiState> blg4 = ArtifactsViewModel.this._uiState;
                do {
                    value = blg4.getValue();
                    uiState = value;
                } while (!blg4.A6e(value, uiState.copy(LoadingState.SUCCESS, AHI.A01, uiState.hasMore, uiState.isLoadingMore, uiState.error)));
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.library.model.ArtifactsViewModel$loadMore$1", f = "ArtifactsViewModel.kt", l = {114}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.library.model.ArtifactsViewModel$loadMore$1, reason: invalid class name and case insensitive filesystem */
    public final class C122471 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C122471(HtJ<? super C122471> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ArtifactsViewModel.this.new C122471(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ArtifactsViewModel.this.new C122471(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            UiState value;
            UiState uiState;
            UiState value2;
            UiState uiState2;
            UiState value3;
            UiState uiState3;
            UiState value4;
            UiState uiState4;
            Object objLibraryFiles = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(objLibraryFiles);
                    BLG<UiState> blg = ArtifactsViewModel.this._uiState;
                    do {
                        value2 = blg.getValue();
                        uiState2 = value2;
                    } while (!blg.A6e(value2, uiState2.copy(uiState2.loadingState, uiState2.artifacts, uiState2.hasMore, true, uiState2.error)));
                    HatchFileOperations hatchFileOperations = HatchFileOperations.INSTANCE;
                    ArtifactsViewModel artifactsViewModel = ArtifactsViewModel.this;
                    AbstractC3358CGz abstractC3358CGz = artifactsViewModel.userSession;
                    Integer numA0R = C3cG.A0R(10);
                    Integer numA0R2 = C3cG.A0R(artifactsViewModel.currentOffset);
                    this.label = 1;
                    objLibraryFiles = hatchFileOperations.libraryFiles("artifacts", abstractC3358CGz, numA0R, numA0R2, this);
                    if (objLibraryFiles == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(objLibraryFiles);
                }
                HatchFileOperations.LibraryResult libraryResult = (HatchFileOperations.LibraryResult) objLibraryFiles;
                if (libraryResult instanceof HatchFileOperations.LibraryResult.Success) {
                    HatchFileOperations.LibraryResult.Success success = (HatchFileOperations.LibraryResult.Success) libraryResult;
                    List<HatchFileOperations.LibraryEntry> list = success.entries;
                    ArtifactsViewModel artifactsViewModel2 = ArtifactsViewModel.this;
                    ArrayList arrayListA0m = AnonymousClass002.A0m(list);
                    Iterator<HatchFileOperations.LibraryEntry> it = list.iterator();
                    while (it.hasNext()) {
                        arrayListA0m.add(ArtifactsViewModelKt.toArtifactFile(it.next(), artifactsViewModel2.userSession));
                    }
                    AHD ahdA07 = AGI.A07(arrayListA0m);
                    ArtifactsViewModel.this.currentOffset += success.entries.size();
                    BLG<UiState> blg2 = ArtifactsViewModel.this._uiState;
                    do {
                        value4 = blg2.getValue();
                        uiState4 = value4;
                    } while (!blg2.A6e(value4, uiState4.copy(uiState4.loadingState, AGI.A07(AbstractC0878AGe.A0P(ahdA07, uiState4.artifacts)), success.hasMore, false, uiState4.error)));
                } else {
                    if (!(libraryResult instanceof HatchFileOperations.LibraryResult.Failed)) {
                        throw C3cG.A0q();
                    }
                    C3cG.A1G("Failed to load more artifacts: ", ((HatchFileOperations.LibraryResult.Failed) libraryResult).message, ArtifactsViewModel.TAG);
                    BLG<UiState> blg3 = ArtifactsViewModel.this._uiState;
                    do {
                        value3 = blg3.getValue();
                        uiState3 = value3;
                    } while (!blg3.A6e(value3, uiState3.copy(uiState3.loadingState, uiState3.artifacts, uiState3.hasMore, false, uiState3.error)));
                }
            } catch (Exception e) {
                C3cG.A1G("Failed to load more artifacts: ", e.getMessage(), ArtifactsViewModel.TAG);
                BLG<UiState> blg4 = ArtifactsViewModel.this._uiState;
                do {
                    value = blg4.getValue();
                    uiState = value;
                } while (!blg4.A6e(value, uiState.copy(uiState.loadingState, uiState.artifacts, uiState.hasMore, false, uiState.error)));
            }
            return Unit.INSTANCE;
        }
    }

    public ArtifactsViewModel(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.userSession = abstractC3358CGz;
        C9286GCn c9286GCnA14 = C3cG.A14(new UiState(LoadingState.INITIAL, AHI.A01, false, false, null));
        this._uiState = c9286GCnA14;
        this.uiState = C3cG.A11(c9286GCnA14);
        loadArtifacts();
    }

    public final C1BN<UiState> getUiState() {
        return this.uiState;
    }

    public final void loadArtifacts() {
        HtJ htJA13 = AnonymousClass006.A13(this.loadJob);
        this.loadJob = AnonymousClass001.A11(new AnonymousClass1(htJA13), AEu.A00(this));
    }

    public final void loadMore() {
        if (this._uiState.getValue().isLoadingMore || !this._uiState.getValue().hasMore) {
            return;
        }
        HtJ htJA13 = AnonymousClass006.A13(this.loadJob);
        this.loadJob = AnonymousClass001.A11(new C122471(htJA13), AEu.A00(this));
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final void refresh() {
        loadArtifacts();
    }
}
