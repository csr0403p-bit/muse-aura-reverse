package com.facebook.aura.status.viewmodel;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
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
import X.C3pU;
import X.C7384Etj;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.status.repo.LoadingState;
import com.facebook.aura.status.repo.MemoryData;
import com.facebook.aura.status.repo.MemoryDataSource;
import com.facebook.aura.status.repo.StatusError;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes6.dex */
public final class MemoryViewModel extends AEs {
    public final BLG<UiState> _uiState;
    public final MemoryDataSource dataSource;
    public Long lastKnownServerUpdateTime;
    public String originalContent;
    public final C1BN<UiState> uiState;

    public final class Factory extends AuraViewModelFactory<MemoryViewModel> {
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public MemoryViewModel create() {
            return new MemoryViewModel(MemoryDataSource.Companion.getInstance(this.userSession));
        }
    }

    public final class UiState extends C06G {
        public final String content;
        public final StatusError error;
        public final boolean hasUnsavedChanges;
        public final boolean isConnected;
        public final boolean isEditing;
        public final boolean isSaving;
        public final LoadingState loadingState;
        public final boolean showReviewSheet;

        public UiState() {
            this(LoadingState.INITIAL, "", false, false, null, true, false, false);
        }

        public static /* synthetic */ UiState copy$default(UiState uiState, LoadingState loadingState, String str, boolean z, boolean z2, StatusError statusError, boolean z3, boolean z4, boolean z5, int i, Object obj) {
            LoadingState loadingState2 = loadingState;
            String str2 = str;
            boolean z6 = z;
            boolean z7 = z2;
            StatusError statusError2 = statusError;
            boolean z8 = z3;
            boolean z9 = z4;
            boolean z10 = z5;
            if ((i & 1) != 0) {
                loadingState2 = uiState.loadingState;
            }
            if ((i & 2) != 0) {
                str2 = uiState.content;
            }
            if ((i & 4) != 0) {
                z6 = uiState.isSaving;
            }
            if ((i & 8) != 0) {
                z7 = uiState.hasUnsavedChanges;
            }
            if ((i & 16) != 0) {
                statusError2 = uiState.error;
            }
            if ((i & 32) != 0) {
                z8 = uiState.isConnected;
            }
            if ((i & 64) != 0) {
                z9 = uiState.isEditing;
            }
            if ((i & 128) != 0) {
                z10 = uiState.showReviewSheet;
            }
            AnonymousClass003.A0u(loadingState2, str2);
            return new UiState(loadingState2, str2, z6, z7, statusError2, z8, z9, z10);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof UiState) {
                    UiState uiState = (UiState) obj;
                    if (this.loadingState != uiState.loadingState || !C7384Etj.areEqual(this.content, uiState.content) || this.isSaving != uiState.isSaving || this.hasUnsavedChanges != uiState.hasUnsavedChanges || !C7384Etj.areEqual(this.error, uiState.error) || this.isConnected != uiState.isConnected || this.isEditing != uiState.isEditing || this.showReviewSheet != uiState.showReviewSheet) {
                    }
                }
                return false;
            }
            return true;
        }

        public final LoadingState component1() {
            return this.loadingState;
        }

        public final String component2() {
            return this.content;
        }

        public final boolean component3() {
            return this.isSaving;
        }

        public final boolean component4() {
            return this.hasUnsavedChanges;
        }

        public final StatusError component5() {
            return this.error;
        }

        public final boolean component6() {
            return this.isConnected;
        }

        public final boolean component7() {
            return this.isEditing;
        }

        public final boolean component8() {
            return this.showReviewSheet;
        }

        public final String getContent() {
            return this.content;
        }

        public final StatusError getError() {
            return this.error;
        }

        public final boolean getHasUnsavedChanges() {
            return this.hasUnsavedChanges;
        }

        public final LoadingState getLoadingState() {
            return this.loadingState;
        }

        public final boolean getShowReviewSheet() {
            return this.showReviewSheet;
        }

        public int hashCode() {
            return C0KA.A00(C0KA.A01(C0KA.A01((C0KA.A01(C0KA.A01(AnonymousClass005.A0I(this.content, AnonymousClass005.A0E(this.loadingState)), this.isSaving), this.hasUnsavedChanges) + AnonymousClass006.A0D(this.error)) * 31, this.isConnected), this.isEditing), this.showReviewSheet);
        }

        public final boolean isConnected() {
            return this.isConnected;
        }

        public final boolean isEditing() {
            return this.isEditing;
        }

        public final boolean isSaving() {
            return this.isSaving;
        }

        public final UiState copy(LoadingState loadingState, String str, boolean z, boolean z2, StatusError statusError, boolean z3, boolean z4, boolean z5) {
            AnonymousClass003.A0u(loadingState, str);
            return new UiState(loadingState, str, z, z2, statusError, z3, z4, z5);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ UiState(LoadingState loadingState, String str, boolean z, boolean z2, StatusError statusError, boolean z3, boolean z4, boolean z5, int i, C06H c06h) {
            this((i & 1) != 0 ? LoadingState.INITIAL : loadingState, (i & 2) != 0 ? "" : str, AnonymousClass005.A1O(i, z), (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : statusError, (i & 32) != 0 ? true : z3, (i & 64) != 0 ? false : z4, C3cG.A1K(i & 128, z5));
        }

        public UiState(LoadingState loadingState, String str, boolean z, boolean z2, StatusError statusError, boolean z3, boolean z4, boolean z5) {
            AnonymousClass003.A0u(loadingState, str);
            this.loadingState = loadingState;
            this.content = str;
            this.isSaving = z;
            this.hasUnsavedChanges = z2;
            this.error = statusError;
            this.isConnected = z3;
            this.isEditing = z4;
            this.showReviewSheet = z5;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.status.viewmodel.MemoryViewModel$loadContent$1", f = "MemoryViewModel.kt", l = {86}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.status.viewmodel.MemoryViewModel$loadContent$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return MemoryViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return MemoryViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                MemoryDataSource memoryDataSource = MemoryViewModel.this.dataSource;
                this.label = 1;
                if (memoryDataSource.loadContent(false, this) == enumC10460Hji) {
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

    @DebugMetadata(c = "com.facebook.aura.status.viewmodel.MemoryViewModel$observeDataSource$1", f = "MemoryViewModel.kt", l = {158}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.status.viewmodel.MemoryViewModel$observeDataSource$1, reason: invalid class name and case insensitive filesystem */
    public final class C141051 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public Object L$1;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.status.viewmodel.MemoryViewModel$observeDataSource$1$1", f = "MemoryViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.status.viewmodel.MemoryViewModel$observeDataSource$1$1, reason: invalid class name and collision with other inner class name */
        public final class C04001 extends AbstractC07127nr implements G0V<MemoryData, HtJ<? super Unit>, Object> {
            public /* synthetic */ Object L$0;
            public int label;
            public final /* synthetic */ MemoryViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04001(MemoryViewModel memoryViewModel, HtJ<? super C04001> htJ) {
                super(2, htJ);
                this.this$0 = memoryViewModel;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                C04001 c04001 = new C04001(this.this$0, htJ);
                c04001.L$0 = obj;
                return c04001;
            }

            /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
            @Override // X.AbstractC8884Fsp
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r14) {
                /*
                    r13 = this;
                    java.lang.Object r2 = r13.L$0
                    com.facebook.aura.status.repo.MemoryData r2 = (com.facebook.aura.status.repo.MemoryData) r2
                    int r0 = r13.label
                    if (r0 != 0) goto L75
                    X.Hwg.A00(r14)
                    java.lang.Long r1 = r2.lastUpdated
                    if (r1 == 0) goto L1a
                    com.facebook.aura.status.viewmodel.MemoryViewModel r0 = r13.this$0
                    java.lang.Long r0 = r0.lastKnownServerUpdateTime
                    boolean r0 = r1.equals(r0)
                    r1 = 1
                    if (r0 == 0) goto L1b
                L1a:
                    r1 = 0
                L1b:
                    boolean r0 = r2.isLoading
                    if (r0 != 0) goto L2f
                    com.facebook.aura.status.repo.StatusError r0 = r2.error
                    if (r0 != 0) goto L2f
                    if (r1 == 0) goto L2f
                    com.facebook.aura.status.viewmodel.MemoryViewModel r1 = r13.this$0
                    java.lang.String r0 = r2.content
                    r1.originalContent = r0
                    java.lang.Long r0 = r2.lastUpdated
                    r1.lastKnownServerUpdateTime = r0
                L2f:
                    com.facebook.aura.status.viewmodel.MemoryViewModel r3 = r13.this$0
                    X.BLG<com.facebook.aura.status.viewmodel.MemoryViewModel$UiState> r1 = r3._uiState
                L33:
                    java.lang.Object r4 = r1.getValue()
                    r6 = r4
                    com.facebook.aura.status.viewmodel.MemoryViewModel$UiState r6 = (com.facebook.aura.status.viewmodel.MemoryViewModel.UiState) r6
                    java.lang.String r8 = r2.content
                    boolean r9 = r2.isSaving
                    com.facebook.aura.status.repo.StatusError r11 = r2.error
                    com.facebook.aura.status.repo.MemoryDataSource r0 = r3.dataSource
                    boolean r12 = r0.isConnected()
                    boolean r0 = r2.isLoading
                    if (r0 == 0) goto L6b
                    com.facebook.aura.status.repo.LoadingState r7 = com.facebook.aura.status.repo.LoadingState.LOADING
                L4c:
                    java.lang.String r5 = r2.content
                    java.lang.String r0 = r3.originalContent
                    boolean r0 = X.C7384Etj.areEqual(r5, r0)
                    r10 = r0 ^ 1
                    boolean r13 = r6.isEditing
                    boolean r14 = r6.showReviewSheet
                    X.AnonymousClass003.A0u(r7, r8)
                    com.facebook.aura.status.viewmodel.MemoryViewModel$UiState r6 = new com.facebook.aura.status.viewmodel.MemoryViewModel$UiState
                    r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
                    boolean r0 = r1.A6e(r4, r6)
                    if (r0 == 0) goto L33
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    return r0
                L6b:
                    com.facebook.aura.status.repo.StatusError r0 = r2.error
                    if (r0 == 0) goto L72
                    com.facebook.aura.status.repo.LoadingState r7 = com.facebook.aura.status.repo.LoadingState.ERROR
                    goto L4c
                L72:
                    com.facebook.aura.status.repo.LoadingState r7 = com.facebook.aura.status.repo.LoadingState.SUCCESS
                    goto L4c
                L75:
                    java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.status.viewmodel.MemoryViewModel.C141051.C04001.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // X.G0V
            public final Object invoke(MemoryData memoryData, HtJ<? super Unit> htJ) {
                return ((C04001) create(memoryData, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public C141051(HtJ<? super C141051> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return MemoryViewModel.this.new C141051(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return MemoryViewModel.this.new C141051(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                MemoryViewModel memoryViewModel = MemoryViewModel.this;
                C1BN<MemoryData> c1bn = memoryViewModel.dataSource.data;
                C04001 c04001 = new C04001(memoryViewModel, null);
                C7384Etj.A0Z(c1bn, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.FlowKt__CollectKt.collectLatest>");
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                if (C3pU.A00(this, c04001, c1bn) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw C3cG.A0Q("SharedFlow never completes, this call should never return.");
        }
    }

    @DebugMetadata(c = "com.facebook.aura.status.viewmodel.MemoryViewModel$refresh$1", f = "MemoryViewModel.kt", l = {91}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.status.viewmodel.MemoryViewModel$refresh$1, reason: invalid class name and case insensitive filesystem */
    public final class C141061 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C141061(HtJ<? super C141061> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return MemoryViewModel.this.new C141061(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return MemoryViewModel.this.new C141061(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                MemoryDataSource memoryDataSource = MemoryViewModel.this.dataSource;
                this.label = 1;
                if (memoryDataSource.refresh(this) == enumC10460Hji) {
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

    @DebugMetadata(c = "com.facebook.aura.status.viewmodel.MemoryViewModel$saveContent$1", f = "MemoryViewModel.kt", l = {102}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.status.viewmodel.MemoryViewModel$saveContent$1, reason: invalid class name and case insensitive filesystem */
    public final class C141071 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public int label;

        public C141071(HtJ<? super C141071> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return MemoryViewModel.this.new C141071(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return MemoryViewModel.this.new C141071(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            String str;
            UiState value;
            LoadingState loadingState;
            String str2;
            boolean z;
            StatusError statusError;
            boolean z2;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                str = MemoryViewModel.this._uiState.getValue().content;
                MemoryDataSource memoryDataSource = MemoryViewModel.this.dataSource;
                this.L$0 = str;
                this.label = 1;
                obj = memoryDataSource.saveContent(str, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                str = (String) this.L$0;
                Hwg.A00(obj);
            }
            if (AnonymousClass001.A1X(obj)) {
                MemoryViewModel memoryViewModel = MemoryViewModel.this;
                memoryViewModel.originalContent = str;
                BLG<UiState> blg = memoryViewModel._uiState;
                do {
                    value = blg.getValue();
                    UiState uiState = value;
                    loadingState = uiState.loadingState;
                    str2 = uiState.content;
                    z = uiState.isSaving;
                    statusError = uiState.error;
                    z2 = uiState.isConnected;
                    AnonymousClass003.A0u(loadingState, str2);
                } while (!blg.A6e(value, new UiState(loadingState, str2, z, false, statusError, z2, false, false)));
            }
            return Unit.INSTANCE;
        }
    }

    public MemoryViewModel(MemoryDataSource memoryDataSource) {
        C7384Etj.A0Y(memoryDataSource, 0);
        this.dataSource = memoryDataSource;
        C9286GCn c9286GCnA14 = C3cG.A14(new UiState(LoadingState.INITIAL, "", false, false, null, true, false, false));
        this._uiState = c9286GCnA14;
        this.uiState = C3cG.A11(c9286GCnA14);
        this.originalContent = "";
        observeDataSource();
        loadContent();
    }

    public final void updateContent(String str) {
        UiState value;
        boolean z;
        LoadingState loadingState;
        boolean z2;
        StatusError statusError;
        boolean z3;
        boolean z4;
        boolean z5;
        C7384Etj.A0Y(str, 0);
        this.dataSource.updateLocalContent(str);
        BLG<UiState> blg = this._uiState;
        do {
            value = blg.getValue();
            UiState uiState = value;
            z = !str.equals(this.originalContent);
            loadingState = uiState.loadingState;
            z2 = uiState.isSaving;
            statusError = uiState.error;
            z3 = uiState.isConnected;
            z4 = uiState.isEditing;
            z5 = uiState.showReviewSheet;
            AnonymousClass003.A0u(loadingState, str);
        } while (!blg.A6e(value, new UiState(loadingState, str, z2, z, statusError, z3, z4, z5)));
    }

    public final void discardChanges() {
        UiState value;
        String str;
        LoadingState loadingState;
        boolean z;
        StatusError statusError;
        boolean z2;
        boolean z3;
        boolean z4;
        this.dataSource.updateLocalContent(this.originalContent);
        BLG<UiState> blg = this._uiState;
        do {
            value = blg.getValue();
            UiState uiState = value;
            str = this.originalContent;
            loadingState = uiState.loadingState;
            z = uiState.isSaving;
            statusError = uiState.error;
            z2 = uiState.isConnected;
            z3 = uiState.isEditing;
            z4 = uiState.showReviewSheet;
            AnonymousClass003.A0u(loadingState, str);
        } while (!blg.A6e(value, new UiState(loadingState, str, z, false, statusError, z2, z3, z4)));
    }

    public final String getOriginalContent() {
        return this.originalContent;
    }

    public final C1BN<UiState> getUiState() {
        return this.uiState;
    }

    public final void hideReviewSheet() {
        UiState value;
        LoadingState loadingState;
        String str;
        boolean z;
        boolean z2;
        StatusError statusError;
        boolean z3;
        boolean z4;
        BLG<UiState> blg = this._uiState;
        do {
            value = blg.getValue();
            UiState uiState = value;
            loadingState = uiState.loadingState;
            str = uiState.content;
            z = uiState.isSaving;
            z2 = uiState.hasUnsavedChanges;
            statusError = uiState.error;
            z3 = uiState.isConnected;
            z4 = uiState.isEditing;
            AnonymousClass003.A0u(loadingState, str);
        } while (!blg.A6e(value, new UiState(loadingState, str, z, z2, statusError, z3, z4, false)));
    }

    public final boolean isConnected() {
        return this.dataSource.isConnected();
    }

    public final void showReviewSheet() {
        UiState value;
        LoadingState loadingState;
        String str;
        boolean z;
        boolean z2;
        StatusError statusError;
        boolean z3;
        boolean z4;
        BLG<UiState> blg = this._uiState;
        do {
            value = blg.getValue();
            UiState uiState = value;
            loadingState = uiState.loadingState;
            str = uiState.content;
            z = uiState.isSaving;
            z2 = uiState.hasUnsavedChanges;
            statusError = uiState.error;
            z3 = uiState.isConnected;
            z4 = uiState.isEditing;
            AnonymousClass003.A0u(loadingState, str);
        } while (!blg.A6e(value, new UiState(loadingState, str, z, z2, statusError, z3, z4, true)));
    }

    public final void startEditing() {
        UiState value;
        LoadingState loadingState;
        String str;
        boolean z;
        boolean z2;
        StatusError statusError;
        boolean z3;
        boolean z4;
        BLG<UiState> blg = this._uiState;
        do {
            value = blg.getValue();
            UiState uiState = value;
            loadingState = uiState.loadingState;
            str = uiState.content;
            z = uiState.isSaving;
            z2 = uiState.hasUnsavedChanges;
            statusError = uiState.error;
            z3 = uiState.isConnected;
            z4 = uiState.showReviewSheet;
            AnonymousClass003.A0u(loadingState, str);
        } while (!blg.A6e(value, new UiState(loadingState, str, z, z2, statusError, z3, true, z4)));
    }

    public final void stopEditing() {
        UiState value;
        LoadingState loadingState;
        String str;
        boolean z;
        boolean z2;
        StatusError statusError;
        boolean z3;
        boolean z4;
        BLG<UiState> blg = this._uiState;
        do {
            value = blg.getValue();
            UiState uiState = value;
            loadingState = uiState.loadingState;
            str = uiState.content;
            z = uiState.isSaving;
            z2 = uiState.hasUnsavedChanges;
            statusError = uiState.error;
            z3 = uiState.isConnected;
            z4 = uiState.showReviewSheet;
            AnonymousClass003.A0u(loadingState, str);
        } while (!blg.A6e(value, new UiState(loadingState, str, z, z2, statusError, z3, false, z4)));
    }

    private final void observeDataSource() {
        AnonymousClass001.A1J(new C141051(null), AEu.A00(this));
    }

    public final void loadContent() {
        AnonymousClass001.A1J(new AnonymousClass1(null), AEu.A00(this));
    }

    public final void refresh() {
        AnonymousClass001.A1J(new C141061(null), AEu.A00(this));
    }

    public final void saveContent() {
        AnonymousClass001.A1J(new C141071(null), AEu.A00(this));
    }
}
