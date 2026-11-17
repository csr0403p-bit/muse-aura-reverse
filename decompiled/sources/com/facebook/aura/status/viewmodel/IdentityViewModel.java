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
import X.C10649I0t;
import X.C1BN;
import X.C20Z;
import X.C3UX;
import X.C3cG;
import X.C4JM;
import X.C7384Etj;
import X.C7BY;
import X.C9286GCn;
import X.CFK;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HzP;
import android.icu.text.DateFormat;
import com.facebook.aura.R;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.gateway.HatchFileOperations;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.gateway.service.HatchGatewayServiceManager;
import com.facebook.aura.identity.provider.HatchIdentityProvider;
import com.facebook.aura.model.AiIdentity;
import com.facebook.aura.status.repo.LoadingState;
import com.facebook.aura.status.repo.StatusError;
import java.time.Instant;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes6.dex */
public final class IdentityViewModel extends AEs {
    public final BLG<UiState> _uiState;
    public final HatchGatewayConnection gateway;
    public boolean hasSkippedFirstOnResume;
    public final HatchIdentityProvider identityProvider;
    public String originalContent;
    public final C1BN<UiState> uiState;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.status.viewmodel.IdentityViewModel$2", f = "IdentityViewModel.kt", l = {79}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.status.viewmodel.IdentityViewModel$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return IdentityViewModel.this.new AnonymousClass2(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return IdentityViewModel.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final IdentityViewModel identityViewModel = IdentityViewModel.this;
                C10649I0t c10649I0t = new C10649I0t(identityViewModel.identityProvider.aiIdentity, 2);
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.status.viewmodel.IdentityViewModel.2.1
                    public final Object emit(AiIdentity aiIdentity, HtJ<? super Unit> htJ) {
                        UiState value;
                        BLG<UiState> blg = identityViewModel._uiState;
                        do {
                            value = blg.getValue();
                        } while (!blg.A6e(value, UiState.copy$default(value, null, null, aiIdentity, false, false, null, false, false, null, null, 1019, null)));
                        return Unit.INSTANCE;
                    }

                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((AiIdentity) obj2, (HtJ<? super Unit>) htJ);
                    }
                };
                this.label = 1;
                if (c10649I0t.collect(c20z, this) == enumC10460Hji) {
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

    /* loaded from: classes.dex */
    public final class Factory extends AuraViewModelFactory<IdentityViewModel> {
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public /* bridge */ /* synthetic */ AEs create() {
            return new IdentityViewModel(this.userSession);
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public IdentityViewModel create() {
            return new IdentityViewModel(this.userSession);
        }
    }

    public final class UiState extends C06G {
        public final String content;
        public final StatusError error;
        public final boolean hasUnsavedChanges;
        public final AiIdentity identity;
        public final boolean isEditing;
        public final boolean isSaving;
        public final LoadingState loadingState;
        public final String memoryModifiedDate;
        public final boolean showReviewSheet;
        public final String soulModifiedDate;

        public UiState() {
            this(LoadingState.INITIAL, "", null, false, false, null, false, false, null, null);
        }

        public static /* synthetic */ UiState copy$default(UiState uiState, LoadingState loadingState, String str, AiIdentity aiIdentity, boolean z, boolean z2, StatusError statusError, boolean z3, boolean z4, String str2, String str3, int i, Object obj) {
            LoadingState loadingState2 = loadingState;
            String str4 = str;
            AiIdentity aiIdentity2 = aiIdentity;
            boolean z5 = z;
            boolean z6 = z2;
            StatusError statusError2 = statusError;
            boolean z7 = z3;
            boolean z8 = z4;
            String str5 = str2;
            String str6 = str3;
            if ((i & 1) != 0) {
                loadingState2 = uiState.loadingState;
            }
            if ((i & 2) != 0) {
                str4 = uiState.content;
            }
            if ((i & 4) != 0) {
                aiIdentity2 = uiState.identity;
            }
            if ((i & 8) != 0) {
                z5 = uiState.isSaving;
            }
            if ((i & 16) != 0) {
                z6 = uiState.hasUnsavedChanges;
            }
            if ((i & 32) != 0) {
                statusError2 = uiState.error;
            }
            if ((i & 64) != 0) {
                z7 = uiState.isEditing;
            }
            if ((i & 128) != 0) {
                z8 = uiState.showReviewSheet;
            }
            if ((i & 256) != 0) {
                str5 = uiState.soulModifiedDate;
            }
            if ((i & 512) != 0) {
                str6 = uiState.memoryModifiedDate;
            }
            AnonymousClass003.A0u(loadingState2, str4);
            return new UiState(loadingState2, str4, aiIdentity2, z5, z6, statusError2, z7, z8, str5, str6);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof UiState) {
                    UiState uiState = (UiState) obj;
                    if (this.loadingState != uiState.loadingState || !C7384Etj.areEqual(this.content, uiState.content) || !C7384Etj.areEqual(this.identity, uiState.identity) || this.isSaving != uiState.isSaving || this.hasUnsavedChanges != uiState.hasUnsavedChanges || !C7384Etj.areEqual(this.error, uiState.error) || this.isEditing != uiState.isEditing || this.showReviewSheet != uiState.showReviewSheet || !C7384Etj.areEqual(this.soulModifiedDate, uiState.soulModifiedDate) || !C7384Etj.areEqual(this.memoryModifiedDate, uiState.memoryModifiedDate)) {
                    }
                }
                return false;
            }
            return true;
        }

        public final LoadingState component1() {
            return this.loadingState;
        }

        public final String component10() {
            return this.memoryModifiedDate;
        }

        public final String component2() {
            return this.content;
        }

        public final AiIdentity component3() {
            return this.identity;
        }

        public final boolean component4() {
            return this.isSaving;
        }

        public final boolean component5() {
            return this.hasUnsavedChanges;
        }

        public final StatusError component6() {
            return this.error;
        }

        public final boolean component7() {
            return this.isEditing;
        }

        public final boolean component8() {
            return this.showReviewSheet;
        }

        public final String component9() {
            return this.soulModifiedDate;
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

        public final AiIdentity getIdentity() {
            return this.identity;
        }

        public final LoadingState getLoadingState() {
            return this.loadingState;
        }

        public final String getMemoryModifiedDate() {
            return this.memoryModifiedDate;
        }

        public final boolean getShowReviewSheet() {
            return this.showReviewSheet;
        }

        public final String getSoulModifiedDate() {
            return this.soulModifiedDate;
        }

        public int hashCode() {
            return ((C0KA.A01(C0KA.A01((C0KA.A01(C0KA.A01((AnonymousClass005.A0I(this.content, AnonymousClass005.A0E(this.loadingState)) + AnonymousClass006.A0D(this.identity)) * 31, this.isSaving), this.hasUnsavedChanges) + AnonymousClass006.A0D(this.error)) * 31, this.isEditing), this.showReviewSheet) + AnonymousClass006.A0G(this.soulModifiedDate)) * 31) + AnonymousClass005.A0H(this.memoryModifiedDate);
        }

        public final boolean isEditing() {
            return this.isEditing;
        }

        public final boolean isSaving() {
            return this.isSaving;
        }

        public final UiState copy(LoadingState loadingState, String str, AiIdentity aiIdentity, boolean z, boolean z2, StatusError statusError, boolean z3, boolean z4, String str2, String str3) {
            AnonymousClass003.A0u(loadingState, str);
            return new UiState(loadingState, str, aiIdentity, z, z2, statusError, z3, z4, str2, str3);
        }

        public String toString() {
            return super.toString();
        }

        public UiState(LoadingState loadingState, String str, AiIdentity aiIdentity, boolean z, boolean z2, StatusError statusError, boolean z3, boolean z4, String str2, String str3) {
            AnonymousClass003.A0u(loadingState, str);
            this.loadingState = loadingState;
            this.content = str;
            this.identity = aiIdentity;
            this.isSaving = z;
            this.hasUnsavedChanges = z2;
            this.error = statusError;
            this.isEditing = z3;
            this.showReviewSheet = z4;
            this.soulModifiedDate = str2;
            this.memoryModifiedDate = str3;
        }

        public /* synthetic */ UiState(LoadingState loadingState, String str, AiIdentity aiIdentity, boolean z, boolean z2, StatusError statusError, boolean z3, boolean z4, String str2, String str3, int i, C06H c06h) {
            this((i & 1) != 0 ? LoadingState.INITIAL : loadingState, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : aiIdentity, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? null : statusError, (i & 64) != 0 ? false : z3, (i & 128) != 0 ? false : z4, (i & 256) != 0 ? null : str2, (i & 512) != 0 ? null : str3);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.status.viewmodel.IdentityViewModel$fetchFileDates$1", f = "IdentityViewModel.kt", l = {169}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.status.viewmodel.IdentityViewModel$fetchFileDates$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return IdentityViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return IdentityViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                IdentityViewModel identityViewModel = IdentityViewModel.this;
                this.label = 1;
                if (identityViewModel.fetchFileDatesInternal(this) == enumC10460Hji) {
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

    @DebugMetadata(c = "com.facebook.aura.status.viewmodel.IdentityViewModel", f = "IdentityViewModel.kt", l = {173, 174}, m = "fetchFileDatesInternal", v = 2)
    /* renamed from: com.facebook.aura.status.viewmodel.IdentityViewModel$fetchFileDatesInternal$1, reason: invalid class name and case insensitive filesystem */
    public final class C141011 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C141011(HtJ<? super C141011> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return IdentityViewModel.this.fetchFileDatesInternal(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.status.viewmodel.IdentityViewModel$loadContent$1", f = "IdentityViewModel.kt", l = {107}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.status.viewmodel.IdentityViewModel$loadContent$1, reason: invalid class name and case insensitive filesystem */
    public final class C141021 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C141021(HtJ<? super C141021> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return IdentityViewModel.this.new C141021(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return IdentityViewModel.this.new C141021(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            UiState value;
            UiState value2;
            UiState uiState;
            UiState value3;
            LoadingState loadingState;
            AiIdentity aiIdentity;
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            String str;
            String str2;
            Object file = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(file);
                BLG<UiState> blg = IdentityViewModel.this._uiState;
                do {
                    value = blg.getValue();
                } while (!blg.A6e(value, UiState.copy$default(value, LoadingState.LOADING, null, null, false, false, null, false, false, null, null, 990, null)));
                HatchFileOperations hatchFileOperations = HatchFileOperations.INSTANCE;
                AbstractC3358CGz abstractC3358CGz = IdentityViewModel.this.userSession;
                this.label = 1;
                file = hatchFileOperations.readFile(IdentityViewModelKt.IDENTITY_FILE_PATH, abstractC3358CGz, this);
                if (file == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(file);
            }
            String str3 = (String) file;
            IdentityViewModel identityViewModel = IdentityViewModel.this;
            if (str3 != null) {
                identityViewModel.originalContent = str3;
                BLG<UiState> blg2 = identityViewModel._uiState;
                do {
                    value3 = blg2.getValue();
                    UiState uiState2 = value3;
                    loadingState = LoadingState.SUCCESS;
                    aiIdentity = uiState2.identity;
                    z = uiState2.isSaving;
                    z2 = uiState2.hasUnsavedChanges;
                    z3 = uiState2.isEditing;
                    z4 = uiState2.showReviewSheet;
                    str = uiState2.soulModifiedDate;
                    str2 = uiState2.memoryModifiedDate;
                    AnonymousClass003.A0u(loadingState, str3);
                } while (!blg2.A6e(value3, new UiState(loadingState, str3, aiIdentity, z, z2, null, z3, z4, str, str2)));
            } else {
                BLG<UiState> blg3 = identityViewModel._uiState;
                do {
                    value2 = blg3.getValue();
                    uiState = value2;
                } while (!blg3.A6e(value2, UiState.copy$default(uiState, uiState.content.length() > 0 ? LoadingState.SUCCESS : LoadingState.ERROR, null, null, false, false, uiState.content.length() == 0 ? new StatusError.ApiError(C4JM.A00().getString(R.string._name_removed__res_0x7f120250)) : null, false, false, null, null, 990, null)));
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.status.viewmodel.IdentityViewModel$refresh$1", f = "IdentityViewModel.kt", l = {147}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.status.viewmodel.IdentityViewModel$refresh$1, reason: invalid class name and case insensitive filesystem */
    public final class C141031 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C141031(HtJ<? super C141031> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return IdentityViewModel.this.new C141031(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return IdentityViewModel.this.new C141031(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            UiState value;
            UiState uiState;
            UiState value2;
            UiState value3;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    BLG<UiState> blg = IdentityViewModel.this._uiState;
                    do {
                        value2 = blg.getValue();
                    } while (!blg.A6e(value2, UiState.copy$default(value2, LoadingState.REFRESHING, null, null, false, false, null, false, false, null, null, 990, null)));
                    IdentityViewModel.this.gateway.refreshIdentity();
                    IdentityViewModel identityViewModel = IdentityViewModel.this;
                    this.label = 1;
                    if (identityViewModel.fetchFileDatesInternal(this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                BLG<UiState> blg2 = IdentityViewModel.this._uiState;
                do {
                    value3 = blg2.getValue();
                } while (!blg2.A6e(value3, UiState.copy$default(value3, LoadingState.SUCCESS, null, null, false, false, null, false, false, null, null, 1022, null)));
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                CFK.A08(IdentityViewModelKt.TAG, "Identity refresh failed", e2);
                BLG<UiState> blg3 = IdentityViewModel.this._uiState;
                do {
                    value = blg3.getValue();
                    uiState = value;
                } while (!blg3.A6e(value, UiState.copy$default(uiState, uiState.content.length() > 0 ? LoadingState.SUCCESS : LoadingState.ERROR, null, null, false, false, new StatusError.ApiError(C4JM.A00().getString(R.string._name_removed__res_0x7f120250)), false, false, null, null, 990, null)));
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.status.viewmodel.IdentityViewModel$saveContent$1", f = "IdentityViewModel.kt", l = {208}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.status.viewmodel.IdentityViewModel$saveContent$1, reason: invalid class name and case insensitive filesystem */
    public final class C141041 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public int label;

        public C141041(HtJ<? super C141041> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return IdentityViewModel.this.new C141041(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return IdentityViewModel.this.new C141041(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            UiState value;
            String str;
            UiState value2;
            UiState value3;
            LoadingState loadingState;
            String str2;
            AiIdentity aiIdentity;
            String str3;
            String str4;
            Object objWriteFile = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(objWriteFile);
                BLG<UiState> blg = IdentityViewModel.this._uiState;
                do {
                    value = blg.getValue();
                } while (!blg.A6e(value, UiState.copy$default(value, null, null, null, true, false, null, false, false, null, null, 983, null)));
                str = IdentityViewModel.this._uiState.getValue().content;
                HatchFileOperations hatchFileOperations = HatchFileOperations.INSTANCE;
                AbstractC3358CGz abstractC3358CGz = IdentityViewModel.this.userSession;
                this.L$0 = str;
                this.label = 1;
                objWriteFile = hatchFileOperations.writeFile(IdentityViewModelKt.IDENTITY_FILE_PATH, str, abstractC3358CGz, true, false, true, null, this);
                if (objWriteFile == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                str = (String) this.L$0;
                Hwg.A00(objWriteFile);
            }
            HatchFileOperations.WriteResult writeResult = (HatchFileOperations.WriteResult) objWriteFile;
            if (writeResult instanceof HatchFileOperations.WriteResult.Success) {
                IdentityViewModel identityViewModel = IdentityViewModel.this;
                identityViewModel.originalContent = str;
                BLG<UiState> blg2 = identityViewModel._uiState;
                do {
                    value3 = blg2.getValue();
                    UiState uiState = value3;
                    loadingState = uiState.loadingState;
                    str2 = uiState.content;
                    aiIdentity = uiState.identity;
                    str3 = uiState.soulModifiedDate;
                    str4 = uiState.memoryModifiedDate;
                    AnonymousClass003.A0u(loadingState, str2);
                } while (!blg2.A6e(value3, new UiState(loadingState, str2, aiIdentity, false, false, null, false, false, str3, str4)));
                IdentityViewModel.this.gateway.refreshIdentity();
            } else {
                if (!(writeResult instanceof HatchFileOperations.WriteResult.Failed)) {
                    throw C3cG.A0q();
                }
                BLG<UiState> blg3 = IdentityViewModel.this._uiState;
                do {
                    value2 = blg3.getValue();
                } while (!blg3.A6e(value2, UiState.copy$default(value2, null, null, null, false, false, new StatusError.SaveError(((HatchFileOperations.WriteResult.Failed) writeResult).message), false, false, null, null, 983, null)));
            }
            return Unit.INSTANCE;
        }
    }

    public IdentityViewModel(AbstractC3358CGz abstractC3358CGz) {
        Object value;
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.userSession = abstractC3358CGz;
        boolean z = HatchGatewayServiceManager.signOutCallbackRegistered;
        this.gateway = HatchGatewayConnection.Companion.getInstance(abstractC3358CGz);
        HatchIdentityProvider companion = HatchIdentityProvider.Companion.getInstance(abstractC3358CGz);
        this.identityProvider = companion;
        C9286GCn c9286GCnA14 = C3cG.A14(new UiState(LoadingState.INITIAL, "", null, false, false, null, false, false, null, null));
        this._uiState = c9286GCnA14;
        this.uiState = C3cG.A11(c9286GCnA14);
        this.originalContent = "";
        AiIdentity value2 = companion.aiIdentity.getValue();
        if (value2 != null) {
            do {
                value = c9286GCnA14.getValue();
            } while (!c9286GCnA14.A6e(value, UiState.copy$default((UiState) value, null, null, value2, false, false, null, false, false, null, null, 1019, null)));
        }
        AnonymousClass001.A1J(new AnonymousClass2(null), AEu.A00(this));
        loadContent();
        fetchFileDates();
    }

    private final String formatModifiedDate(String str) {
        if (str != null && !C7BY.A0j(str)) {
            try {
                return DateFormat.getDateInstance(3, Locale.getDefault()).format(Date.from(Instant.parse(str)));
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final void updateContent(String str) {
        UiState value;
        C7384Etj.A0Y(str, 0);
        BLG<UiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, UiState.copy$default(value, null, str, null, false, !str.equals(this.originalContent), null, false, false, null, null, 1005, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchFileDatesInternal(X.HtJ<? super kotlin.Unit> r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof com.facebook.aura.status.viewmodel.IdentityViewModel.C141011
            if (r0 == 0) goto L9f
            r6 = r15
            com.facebook.aura.status.viewmodel.IdentityViewModel$fetchFileDatesInternal$1 r6 = (com.facebook.aura.status.viewmodel.IdentityViewModel.C141011) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9f
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r4 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r1 = r6.label
            r3 = 2
            r0 = 1
            if (r1 == 0) goto L75
            if (r1 == r0) goto L87
            if (r1 != r3) goto La6
            java.lang.Object r1 = r6.L$0
            com.facebook.aura.gateway.HatchFileOperations$StatResult r1 = (com.facebook.aura.gateway.HatchFileOperations.StatResult) r1
            X.Hwg.A00(r4)
        L27:
            com.facebook.aura.gateway.HatchFileOperations$StatResult r4 = (com.facebook.aura.gateway.HatchFileOperations.StatResult) r4
            boolean r0 = r1 instanceof com.facebook.aura.gateway.HatchFileOperations.StatResult.Success
            r13 = 0
            if (r0 == 0) goto L73
            com.facebook.aura.gateway.HatchFileOperations$StatResult$Success r1 = (com.facebook.aura.gateway.HatchFileOperations.StatResult.Success) r1
            if (r1 == 0) goto L73
            com.facebook.aura.gateway.HatchFileOperations$FileEntry r0 = r1.entry
            if (r0 == 0) goto L73
            java.lang.String r0 = r0.modifiedAt
            if (r0 == 0) goto L73
            java.lang.String r12 = r14.formatModifiedDate(r0)
        L3e:
            boolean r0 = r4 instanceof com.facebook.aura.gateway.HatchFileOperations.StatResult.Success
            if (r0 == 0) goto L52
            com.facebook.aura.gateway.HatchFileOperations$StatResult$Success r4 = (com.facebook.aura.gateway.HatchFileOperations.StatResult.Success) r4
            if (r4 == 0) goto L52
            com.facebook.aura.gateway.HatchFileOperations$FileEntry r0 = r4.entry
            if (r0 == 0) goto L52
            java.lang.String r0 = r0.modifiedAt
            if (r0 == 0) goto L52
            java.lang.String r13 = r14.formatModifiedDate(r0)
        L52:
            X.BLG<com.facebook.aura.status.viewmodel.IdentityViewModel$UiState> r2 = r14._uiState
        L54:
            java.lang.Object r1 = r2.getValue()
            r3 = r1
            com.facebook.aura.status.viewmodel.IdentityViewModel$UiState r3 = (com.facebook.aura.status.viewmodel.IdentityViewModel.UiState) r3
            r14 = 255(0xff, float:3.57E-43)
            r4 = 0
            r7 = 0
            r5 = r4
            r6 = r4
            r8 = r7
            r9 = r4
            r10 = r7
            r11 = r7
            r15 = r4
            com.facebook.aura.status.viewmodel.IdentityViewModel$UiState r0 = com.facebook.aura.status.viewmodel.IdentityViewModel.UiState.copy$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            boolean r0 = r2.A6e(r1, r0)
            if (r0 == 0) goto L54
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
        L72:
            return r5
        L73:
            r12 = r13
            goto L3e
        L75:
            X.Hwg.A00(r4)
            com.facebook.aura.gateway.HatchFileOperations r2 = com.facebook.aura.gateway.HatchFileOperations.INSTANCE
            X.CGz r1 = r14.userSession
            r6.label = r0
            java.lang.String r0 = "SOUL.md"
            java.lang.Object r4 = r2.statFile(r0, r1, r6)
            if (r4 != r5) goto L8a
            return r5
        L87:
            X.Hwg.A00(r4)
        L8a:
            com.facebook.aura.gateway.HatchFileOperations$StatResult r4 = (com.facebook.aura.gateway.HatchFileOperations.StatResult) r4
            com.facebook.aura.gateway.HatchFileOperations r2 = com.facebook.aura.gateway.HatchFileOperations.INSTANCE
            X.CGz r1 = r14.userSession
            r6.L$0 = r4
            r6.label = r3
            java.lang.String r0 = "MEMORY.md"
            java.lang.Object r0 = r2.statFile(r0, r1, r6)
            if (r0 == r5) goto L72
            r1 = r4
            r4 = r0
            goto L27
        L9f:
            com.facebook.aura.status.viewmodel.IdentityViewModel$fetchFileDatesInternal$1 r6 = new com.facebook.aura.status.viewmodel.IdentityViewModel$fetchFileDatesInternal$1
            r6.<init>(r15)
            goto L12
        La6:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.status.viewmodel.IdentityViewModel.fetchFileDatesInternal(X.HtJ):java.lang.Object");
    }

    public final void discardChanges() {
        UiState value;
        BLG<UiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, UiState.copy$default(value, null, this.originalContent, null, false, false, null, false, false, null, null, 1005, null)));
    }

    public final String getOriginalContent() {
        return this.originalContent;
    }

    public final C1BN<UiState> getUiState() {
        return this.uiState;
    }

    public final void onResume() {
        if (this.hasSkippedFirstOnResume) {
            loadContent();
        } else {
            this.hasSkippedFirstOnResume = true;
        }
    }

    public final void refresh() {
        if (this._uiState.getValue().loadingState != LoadingState.REFRESHING) {
            AnonymousClass001.A1J(new C141031(null), AEu.A00(this));
        }
    }

    public final void startEditing() {
        UiState value;
        BLG<UiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, UiState.copy$default(value, null, null, null, false, false, null, true, false, null, null, 959, null)));
    }

    private final void fetchFileDates() {
        AnonymousClass001.A1J(new AnonymousClass1(null), AEu.A00(this));
    }

    public final void loadContent() {
        AnonymousClass001.A1J(new C141021(null), AEu.A00(this));
    }

    public final void saveContent() {
        AnonymousClass001.A1J(new C141041(null), AEu.A00(this));
    }
}
