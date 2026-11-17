package com.facebook.aura.activation.model;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BLG;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C1BN;
import X.C3Pi;
import X.C3UX;
import X.C7384Etj;
import X.C7BY;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.subscription.repo.AuraSubscriptionRepository;
import com.facebook.aura.subscription.repo.SaveViewerNameResult;
import com.facebook.aura.user.provider.AuraViewerDataProvider;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class AuraConfirmNameViewModel extends AEs {
    public final BLG<UiState> _uiState;
    public final AuraSubscriptionRepository subscriptionRepository;
    public final C1BN<UiState> uiState;
    public final AuraViewerDataProvider viewerDataProvider;

    public interface ConfirmNameError {

        public final class Generic implements ConfirmNameError {
            public static final Generic INSTANCE = new Generic();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Generic);
            }

            public String toString() {
                return "Generic";
            }

            public int hashCode() {
                return -1695310037;
            }
        }

        public final class Server extends C06G implements ConfirmNameError {
            public final String detail;

            public Server(String str) {
                C7384Etj.A0Y(str, 0);
                this.detail = str;
            }

            public final Server copy(String str) {
                C7384Etj.A0Y(str, 0);
                return new Server(str);
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof Server) && C7384Etj.areEqual(this.detail, ((Server) obj).detail));
            }

            public static /* synthetic */ Server copy$default(Server server, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = server.detail;
                }
                C7384Etj.A0Y(str, 0);
                return new Server(str);
            }

            public final String component1() {
                return this.detail;
            }

            public final String getDetail() {
                return this.detail;
            }

            public int hashCode() {
                return this.detail.hashCode();
            }

            public String toString() {
                return super.toString();
            }
        }
    }

    public final class Factory extends AuraViewModelFactory<AuraConfirmNameViewModel> {
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public AuraConfirmNameViewModel create() {
            return new AuraConfirmNameViewModel(AuraSubscriptionRepository.Companion.getInstance(this.userSession), AuraViewerDataProvider.Companion.getInstance(this.userSession));
        }
    }

    public final class UiState extends C06G {
        public final ConfirmNameError error;
        public final String firstName;
        public final boolean isContinueEnabled;
        public final boolean isSaving;
        public final String lastName;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof UiState) {
                    UiState uiState = (UiState) obj;
                    if (!C7384Etj.areEqual(this.firstName, uiState.firstName) || !C7384Etj.areEqual(this.lastName, uiState.lastName) || this.isSaving != uiState.isSaving || this.isContinueEnabled != uiState.isContinueEnabled || !C7384Etj.areEqual(this.error, uiState.error)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ UiState copy$default(UiState uiState, String str, String str2, boolean z, boolean z2, ConfirmNameError confirmNameError, int i, Object obj) {
            if ((i & 1) != 0) {
                str = uiState.firstName;
            }
            if ((i & 2) != 0) {
                str2 = uiState.lastName;
            }
            if ((i & 4) != 0) {
                z = uiState.isSaving;
            }
            if ((i & 8) != 0) {
                z2 = uiState.isContinueEnabled;
            }
            if ((i & 16) != 0) {
                confirmNameError = uiState.error;
            }
            return uiState.copy(str, str2, z, z2, confirmNameError);
        }

        public final String component1() {
            return this.firstName;
        }

        public final String component2() {
            return this.lastName;
        }

        public final boolean component3() {
            return this.isSaving;
        }

        public final boolean component4() {
            return this.isContinueEnabled;
        }

        public final ConfirmNameError component5() {
            return this.error;
        }

        public final ConfirmNameError getError() {
            return this.error;
        }

        public final String getFirstName() {
            return this.firstName;
        }

        public final String getLastName() {
            return this.lastName;
        }

        public int hashCode() {
            return C0KA.A01(C0KA.A01(AnonymousClass005.A0I(this.lastName, AnonymousClass001.A0G(this.firstName)), this.isSaving), this.isContinueEnabled) + AnonymousClass006.A0D(this.error);
        }

        public final boolean isContinueEnabled() {
            return this.isContinueEnabled;
        }

        public final boolean isSaving() {
            return this.isSaving;
        }

        public UiState(String str, String str2, boolean z, boolean z2, ConfirmNameError confirmNameError) {
            AnonymousClass003.A0u(str, str2);
            this.firstName = str;
            this.lastName = str2;
            this.isSaving = z;
            this.isContinueEnabled = z2;
            this.error = confirmNameError;
        }

        public final UiState copy(String str, String str2, boolean z, boolean z2, ConfirmNameError confirmNameError) {
            AnonymousClass003.A0u(str, str2);
            return new UiState(str, str2, z, z2, confirmNameError);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ UiState(String str, String str2, boolean z, boolean z2, ConfirmNameError confirmNameError, int i, C06H c06h) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, AnonymousClass005.A1O(i, z), AnonymousClass005.A1P(i, z2), (i & 16) != 0 ? null : confirmNameError);
        }

        public UiState() {
            this("", "", false, false, null);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.activation.model.AuraConfirmNameViewModel$onContinue$2", f = "AuraConfirmNameViewModel.kt", l = {61}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.activation.model.AuraConfirmNameViewModel$onContinue$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ UiState $state;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(UiState uiState, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$state = uiState;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return AuraConfirmNameViewModel.this.new AnonymousClass2(this.$state, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            AuraConfirmNameViewModel auraConfirmNameViewModel;
            String str;
            ConfirmNameError confirmNameError;
            UiState value;
            UiState uiState;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                AuraSubscriptionRepository auraSubscriptionRepository = AuraConfirmNameViewModel.this.subscriptionRepository;
                String strA0l = AnonymousClass002.A0l(this.$state.firstName);
                String strA0l2 = AnonymousClass002.A0l(this.$state.lastName);
                this.label = 1;
                obj = auraSubscriptionRepository.saveViewerName(strA0l, strA0l2, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            SaveViewerNameResult saveViewerNameResult = (SaveViewerNameResult) obj;
            if (C7384Etj.areEqual(saveViewerNameResult, SaveViewerNameResult.Success.INSTANCE)) {
                AuraConfirmNameViewModel.this.subscriptionRepository.markNameSatisfied();
                AuraConfirmNameViewModel.this.viewerDataProvider.atomicUpdate(AuraConfirmNameViewModel$onContinue$2$error$1.INSTANCE);
                confirmNameError = null;
            } else {
                if (saveViewerNameResult instanceof SaveViewerNameResult.InvalidName) {
                    auraConfirmNameViewModel = AuraConfirmNameViewModel.this;
                    str = ((SaveViewerNameResult.InvalidName) saveViewerNameResult).detail;
                } else {
                    if (!(saveViewerNameResult instanceof SaveViewerNameResult.Failed)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    auraConfirmNameViewModel = AuraConfirmNameViewModel.this;
                    str = ((SaveViewerNameResult.Failed) saveViewerNameResult).detail;
                }
                confirmNameError = auraConfirmNameViewModel.confirmNameError(str);
            }
            AuraConfirmNameViewModel auraConfirmNameViewModel2 = AuraConfirmNameViewModel.this;
            BLG<UiState> blg = auraConfirmNameViewModel2._uiState;
            do {
                value = blg.getValue();
                uiState = value;
            } while (!blg.A6e(value, auraConfirmNameViewModel2.withContinueEnabled(uiState.copy(uiState.firstName, uiState.lastName, false, uiState.isContinueEnabled, confirmNameError))));
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.activation.model.AuraConfirmNameViewModel.UiState withContinueEnabled(com.facebook.aura.activation.model.AuraConfirmNameViewModel.UiState r6) {
        /*
            r5 = this;
            r1 = r6
            boolean r0 = r6.isSaving
            if (r0 != 0) goto L16
            java.lang.String r0 = r6.firstName
            boolean r0 = X.C7BY.A0j(r0)
            if (r0 != 0) goto L16
            java.lang.String r0 = r6.lastName
            boolean r0 = X.C7BY.A0j(r0)
            r5 = 1
            if (r0 == 0) goto L17
        L16:
            r5 = 0
        L17:
            java.lang.String r2 = r6.firstName
            java.lang.String r3 = r6.lastName
            boolean r4 = r6.isSaving
            com.facebook.aura.activation.model.AuraConfirmNameViewModel$ConfirmNameError r6 = r6.error
            com.facebook.aura.activation.model.AuraConfirmNameViewModel$UiState r0 = r1.copy(r2, r3, r4, r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.activation.model.AuraConfirmNameViewModel.withContinueEnabled(com.facebook.aura.activation.model.AuraConfirmNameViewModel$UiState):com.facebook.aura.activation.model.AuraConfirmNameViewModel$UiState");
    }

    public final void onFirstNameChange(String str) {
        UiState value;
        UiState uiState;
        C7384Etj.A0Y(str, 0);
        BLG<UiState> blg = this._uiState;
        do {
            value = blg.getValue();
            uiState = value;
        } while (!blg.A6e(value, withContinueEnabled(uiState.copy(str, uiState.lastName, uiState.isSaving, uiState.isContinueEnabled, null))));
    }

    public final void onLastNameChange(String str) {
        UiState value;
        UiState uiState;
        C7384Etj.A0Y(str, 0);
        BLG<UiState> blg = this._uiState;
        do {
            value = blg.getValue();
            uiState = value;
        } while (!blg.A6e(value, withContinueEnabled(uiState.copy(uiState.firstName, str, uiState.isSaving, uiState.isContinueEnabled, null))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ConfirmNameError confirmNameError(String str) {
        return (str == null || C7BY.A0j(str)) ? ConfirmNameError.Generic.INSTANCE : new ConfirmNameError.Server(str);
    }

    public final C1BN<UiState> getUiState() {
        return this.uiState;
    }

    public final void onContinue() {
        UiState value;
        UiState uiState;
        UiState value2 = this._uiState.getValue();
        if (value2.isContinueEnabled) {
            BLG<UiState> blg = this._uiState;
            do {
                value = blg.getValue();
                uiState = value;
            } while (!blg.A6e(value, uiState.copy(uiState.firstName, uiState.lastName, true, false, null)));
            AnonymousClass001.A1I(AnonymousClass001.A0y(), new AnonymousClass2(value2, null), AEu.A00(this));
        }
    }

    public AuraConfirmNameViewModel(AuraSubscriptionRepository auraSubscriptionRepository, AuraViewerDataProvider auraViewerDataProvider) {
        boolean zA1b = AnonymousClass004.A1b(auraSubscriptionRepository, auraViewerDataProvider);
        this.subscriptionRepository = auraSubscriptionRepository;
        this.viewerDataProvider = auraViewerDataProvider;
        C9286GCn c9286GCn = new C9286GCn(new UiState("", "", zA1b, zA1b, null));
        this._uiState = c9286GCn;
        this.uiState = new C3Pi(null, c9286GCn);
    }
}
