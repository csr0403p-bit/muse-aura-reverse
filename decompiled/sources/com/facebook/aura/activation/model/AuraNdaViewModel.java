package com.facebook.aura.activation.model;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.BLG;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C1BN;
import X.C22I;
import X.C3Em;
import X.C3UX;
import X.C3cG;
import X.C3pd;
import X.C7384Etj;
import X.C79;
import X.C9286GCn;
import X.C9290GCr;
import X.CFK;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.activation.data.HatchNdaAgreement;
import com.facebook.aura.activation.repo.AuraActivationRepository;
import com.facebook.aura.activation.view.AuraWaitlistConfettiKt;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.perf.HatchActivationQplLogger;
import com.facebook.aura.user.provider.AuraUserData;
import com.facebook.aura.user.provider.AuraViewerDataProvider;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class AuraNdaViewModel extends AEs {
    public final BLG<UiState> _uiState;
    public final C3Em<ViewEffect> _viewEffect;
    public final AuraActivationRepository activationRepository;
    public final C1BN<UiState> uiState;
    public final C22I<ViewEffect> viewEffect;

    public final class Factory extends AuraViewModelFactory<AuraNdaViewModel> {
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public AuraNdaViewModel create() {
            String str;
            AuraUserData value = AuraViewerDataProvider.Companion.getInstance(this.userSession).userData.getValue();
            AuraActivationRepository companion = AuraActivationRepository.Companion.getInstance(this.userSession);
            String str2 = null;
            if (value != null) {
                str = value.namePrefill;
                str2 = value.emailPrefill;
            } else {
                str = null;
            }
            return new AuraNdaViewModel(companion, str, str2);
        }
    }

    public final class UiState extends C06G {
        public final HatchNdaAgreement agreement;
        public final String email;
        public final boolean isFetching;
        public final boolean isLoading;
        public final String name;

        public UiState(boolean z, boolean z2, HatchNdaAgreement hatchNdaAgreement, String str, String str2) {
            AnonymousClass002.A1C(str, 3, str2);
            this.isLoading = z;
            this.isFetching = z2;
            this.agreement = hatchNdaAgreement;
            this.name = str;
            this.email = str2;
        }

        public final UiState copy(boolean z, boolean z2, HatchNdaAgreement hatchNdaAgreement, String str, String str2) {
            AnonymousClass002.A1C(str, 3, str2);
            return new UiState(z, z2, hatchNdaAgreement, str, str2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof UiState) {
                    UiState uiState = (UiState) obj;
                    if (this.isLoading != uiState.isLoading || this.isFetching != uiState.isFetching || !C7384Etj.areEqual(this.agreement, uiState.agreement) || !C7384Etj.areEqual(this.name, uiState.name) || !C7384Etj.areEqual(this.email, uiState.email)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ UiState copy$default(UiState uiState, boolean z, boolean z2, HatchNdaAgreement hatchNdaAgreement, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = uiState.isLoading;
            }
            if ((i & 2) != 0) {
                z2 = uiState.isFetching;
            }
            if ((i & 4) != 0) {
                hatchNdaAgreement = uiState.agreement;
            }
            if ((i & 8) != 0) {
                str = uiState.name;
            }
            if ((i & 16) != 0) {
                str2 = uiState.email;
            }
            return uiState.copy(z, z2, hatchNdaAgreement, str, str2);
        }

        public final boolean component1() {
            return this.isLoading;
        }

        public final boolean component2() {
            return this.isFetching;
        }

        public final HatchNdaAgreement component3() {
            return this.agreement;
        }

        public final String component4() {
            return this.name;
        }

        public final String component5() {
            return this.email;
        }

        public final HatchNdaAgreement getAgreement() {
            return this.agreement;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x001e A[PHI: r1
  0x001e: PHI (r1v8 boolean) = (r1v2 boolean), (r1v9 boolean) binds: [B:38:0x006c, B:12:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0025 A[PHI: r1
  0x0025: PHI (r1v3 boolean) = (r1v8 boolean), (r1v9 boolean) binds: [B:14:0x0023, B:12:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean getCanSubmit() {
            /*
                r8 = this;
                com.facebook.aura.activation.data.HatchNdaAgreement r1 = r8.agreement
                r7 = 0
                if (r1 == 0) goto L6f
                boolean r0 = r8.isLoading
                if (r0 != 0) goto L6f
                java.util.List<java.lang.String> r6 = r1.requiredFields
                boolean r0 = r6 instanceof java.util.Collection
                java.lang.String r5 = "email"
                java.lang.String r4 = "name"
                r3 = 1
                if (r0 == 0) goto L4c
                boolean r0 = r6.isEmpty()
                if (r0 == 0) goto L4c
            L1a:
                r2 = 0
            L1b:
                r1 = 1
                if (r2 == 0) goto L25
            L1e:
                boolean r0 = r6.contains(r5)
                r2 = 0
                if (r0 == 0) goto L26
            L25:
                r2 = 1
            L26:
                if (r1 == 0) goto L31
                java.lang.String r0 = r8.name
                boolean r0 = X.C7BY.A0j(r0)
                r1 = 0
                if (r0 != 0) goto L32
            L31:
                r1 = 1
            L32:
                if (r2 == 0) goto L44
                java.lang.String r0 = r8.email
                boolean r0 = X.C7BY.A0j(r0)
                if (r0 != 0) goto L4a
                java.lang.String r0 = r8.email
                boolean r0 = com.facebook.aura.activation.model.AuraNdaViewModelKt.isValidEmail(r0)
                if (r0 == 0) goto L4a
            L44:
                r0 = 1
            L45:
                if (r1 == 0) goto L6f
                if (r0 == 0) goto L6f
                return r3
            L4a:
                r0 = 0
                goto L45
            L4c:
                java.util.Iterator r2 = r6.iterator()
            L50:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L1a
                java.lang.Object r1 = r2.next()
                boolean r0 = r4.equals(r1)
                if (r0 != 0) goto L66
                boolean r0 = r5.equals(r1)
                if (r0 == 0) goto L50
            L66:
                r2 = 1
                boolean r0 = r6.contains(r4)
                r1 = 0
                if (r0 == 0) goto L1e
                goto L1b
            L6f:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.activation.model.AuraNdaViewModel.UiState.getCanSubmit():boolean");
        }

        public final String getEmail() {
            return this.email;
        }

        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.email, AnonymousClass005.A0I(this.name, (C0KA.A01(C0KA.A02(this.isLoading), this.isFetching) + AnonymousClass006.A0D(this.agreement)) * 31));
        }

        public final boolean isFetching() {
            return this.isFetching;
        }

        public final boolean isLoading() {
            return this.isLoading;
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ UiState(boolean z, boolean z2, HatchNdaAgreement hatchNdaAgreement, String str, String str2, int i, C06H c06h) {
            this(AnonymousClass001.A1P(i, z), C3cG.A1J(i, z2), (i & 4) != 0 ? null : hatchNdaAgreement, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? "" : str2);
        }

        public UiState() {
            this(false, true, null, "", "");
        }
    }

    public interface ViewEffect {

        public final class AcceptFailed implements ViewEffect {
            public static final AcceptFailed INSTANCE = new AcceptFailed();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof AcceptFailed);
            }

            public String toString() {
                return "AcceptFailed";
            }

            public int hashCode() {
                return 832128568;
            }
        }

        public final class Accepted implements ViewEffect {
            public static final Accepted INSTANCE = new Accepted();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Accepted);
            }

            public String toString() {
                return "Accepted";
            }

            public int hashCode() {
                return 67696634;
            }
        }
    }

    @DebugMetadata(c = "com.facebook.aura.activation.model.AuraNdaViewModel$fetchAgreement$1", f = "AuraNdaViewModel.kt", l = {87, AuraWaitlistConfettiKt.StandardParticleCount}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.activation.model.AuraNdaViewModel$fetchAgreement$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int I$0;
        public Object L$0;
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return AuraNdaViewModel.this.new AnonymousClass1(htJ);
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        
            if (r4 >= 3) goto L25;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0036 -> B:7:0x0015). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0044 -> B:7:0x0015). Please report as a decompilation issue!!! */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                X.Hji r3 = X.EnumC10460Hji.A02
                int r0 = r11.label
                r2 = 2
                r7 = 1
                if (r0 == 0) goto L47
                if (r0 == r7) goto L2c
                if (r0 != r2) goto L69
                int r4 = r11.I$0
                java.lang.Object r10 = r11.L$0
                com.facebook.aura.activation.data.HatchNdaAgreement r10 = (com.facebook.aura.activation.data.HatchNdaAgreement) r10
                X.Hwg.A00(r12)
            L15:
                int r4 = r4 + 1
                r0 = 3
                if (r4 >= r0) goto L6e
            L1a:
                com.facebook.aura.activation.model.AuraNdaViewModel r0 = com.facebook.aura.activation.model.AuraNdaViewModel.this
                com.facebook.aura.activation.repo.AuraActivationRepository r1 = r0.activationRepository
                r0 = 0
                r11.L$0 = r0
                r11.I$0 = r4
                r11.label = r7
                java.lang.Object r12 = r1.fetchNdaAgreement(r11)
                if (r12 != r3) goto L31
                return r3
            L2c:
                int r4 = r11.I$0
                X.Hwg.A00(r12)
            L31:
                r10 = r12
                com.facebook.aura.activation.data.HatchNdaAgreement r10 = (com.facebook.aura.activation.data.HatchNdaAgreement) r10
                if (r10 != 0) goto L6e
                if (r4 >= r2) goto L15
                r11.L$0 = r10
                r11.I$0 = r4
                r11.label = r2
                r0 = 1500(0x5dc, double:7.41E-321)
                java.lang.Object r0 = X.C7Bq.A01(r0, r11)
                if (r0 != r3) goto L15
                return r3
            L47:
                X.Hwg.A00(r12)
                com.facebook.aura.activation.model.AuraNdaViewModel r0 = com.facebook.aura.activation.model.AuraNdaViewModel.this
                X.BLG<com.facebook.aura.activation.model.AuraNdaViewModel$UiState> r4 = r0._uiState
            L4e:
                java.lang.Object r1 = r4.getValue()
                r5 = r1
                com.facebook.aura.activation.model.AuraNdaViewModel$UiState r5 = (com.facebook.aura.activation.model.AuraNdaViewModel.UiState) r5
                boolean r6 = r5.isLoading
                com.facebook.aura.activation.data.HatchNdaAgreement r8 = r5.agreement
                java.lang.String r9 = r5.name
                java.lang.String r10 = r5.email
                com.facebook.aura.activation.model.AuraNdaViewModel$UiState r0 = r5.copy(r6, r7, r8, r9, r10)
                boolean r0 = r4.A6e(r1, r0)
                if (r0 == 0) goto L4e
                r4 = 1
                goto L1a
            L69:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            L6e:
                com.facebook.aura.activation.model.AuraNdaViewModel r0 = com.facebook.aura.activation.model.AuraNdaViewModel.this
                com.facebook.aura.activation.model.AuraNdaViewModel.access$logUnhandledRequiredFields(r0, r10)
                com.facebook.aura.activation.model.AuraNdaViewModel r0 = com.facebook.aura.activation.model.AuraNdaViewModel.this
                X.BLG<com.facebook.aura.activation.model.AuraNdaViewModel$UiState> r3 = r0._uiState
            L77:
                java.lang.Object r2 = r3.getValue()
                r4 = r2
                com.facebook.aura.activation.model.AuraNdaViewModel$UiState r4 = (com.facebook.aura.activation.model.AuraNdaViewModel.UiState) r4
                if (r10 != 0) goto L95
                r7 = 0
                r6 = 0
                boolean r5 = r4.isLoading
                java.lang.String r8 = r4.name
                java.lang.String r9 = r4.email
                com.facebook.aura.activation.model.AuraNdaViewModel$UiState r0 = r4.copy(r5, r6, r7, r8, r9)
            L8c:
                boolean r0 = r3.A6e(r2, r0)
                if (r0 == 0) goto L77
                kotlin.Unit r3 = kotlin.Unit.INSTANCE
                return r3
            L95:
                java.lang.String r11 = r4.name
                boolean r0 = X.C7BY.A0j(r11)
                java.lang.String r1 = ""
                if (r0 == 0) goto La4
                java.lang.String r11 = r10.name
                if (r11 != 0) goto La4
                r11 = r1
            La4:
                java.lang.String r12 = r4.email
                boolean r0 = X.C7BY.A0j(r12)
                if (r0 == 0) goto Lb2
                java.lang.String r0 = r10.email
                if (r0 == 0) goto Lb1
                r1 = r0
            Lb1:
                r12 = r1
            Lb2:
                r9 = 0
                boolean r8 = r4.isLoading
                r7 = r4
                com.facebook.aura.activation.model.AuraNdaViewModel$UiState r0 = r7.copy(r8, r9, r10, r11, r12)
                goto L8c
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.activation.model.AuraNdaViewModel.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return AuraNdaViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.activation.model.AuraNdaViewModel$onAccept$1", f = "AuraNdaViewModel.kt", l = {135, 139, 146}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.activation.model.AuraNdaViewModel$onAccept$1, reason: invalid class name and case insensitive filesystem */
    public final class C106771 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ UiState $state;
        public boolean Z$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C106771(UiState uiState, HtJ<? super C106771> htJ) {
            super(2, htJ);
            this.$state = uiState;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return AuraNdaViewModel.this.new C106771(this.$state, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            UiState value;
            UiState uiState;
            UiState value2;
            UiState uiState2;
            C3Em<ViewEffect> c3Em;
            ViewEffect viewEffect;
            Object objAcceptNdaAgreement = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(objAcceptNdaAgreement);
                BLG<UiState> blg = AuraNdaViewModel.this._uiState;
                do {
                    value = blg.getValue();
                    uiState = value;
                } while (!blg.A6e(value, uiState.copy(true, uiState.isFetching, uiState.agreement, uiState.name, uiState.email)));
                HatchActivationQplLogger.INSTANCE.pointFlow("nda_submitted");
                AuraActivationRepository auraActivationRepository = AuraNdaViewModel.this.activationRepository;
                String strA0l = AnonymousClass002.A0l(this.$state.name);
                String strA0l2 = AnonymousClass002.A0l(this.$state.email);
                this.label = 1;
                objAcceptNdaAgreement = auraActivationRepository.acceptNdaAgreement(strA0l, strA0l2, this);
                if (objAcceptNdaAgreement == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i != 2 && i != 3) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(objAcceptNdaAgreement);
                    return Unit.INSTANCE;
                }
                Hwg.A00(objAcceptNdaAgreement);
            }
            boolean zA1X = AnonymousClass001.A1X(objAcceptNdaAgreement);
            BLG<UiState> blg2 = AuraNdaViewModel.this._uiState;
            do {
                value2 = blg2.getValue();
                uiState2 = value2;
            } while (!blg2.A6e(value2, uiState2.copy(false, uiState2.isFetching, uiState2.agreement, uiState2.name, uiState2.email)));
            if (zA1X) {
                HatchActivationQplLogger.INSTANCE.pointFlow("nda_accepted");
                c3Em = AuraNdaViewModel.this._viewEffect;
                viewEffect = ViewEffect.Accepted.INSTANCE;
                this.Z$0 = zA1X;
                this.label = 2;
            } else {
                HatchActivationQplLogger.INSTANCE.pointActivationStepFailed("nda_accept", "mutation_error", "false_result", null, null);
                c3Em = AuraNdaViewModel.this._viewEffect;
                viewEffect = ViewEffect.AcceptFailed.INSTANCE;
                this.Z$0 = zA1X;
                this.label = 3;
            }
            if (c3Em.emit(viewEffect, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C106771) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public AuraNdaViewModel(AuraActivationRepository auraActivationRepository, String str, String str2) {
        String str3 = str;
        String str4 = str2;
        C7384Etj.A0Y(auraActivationRepository, 0);
        this.activationRepository = auraActivationRepository;
        C9290GCr c9290GCr = new C9290GCr(C79.A00, 0, 0);
        this._viewEffect = c9290GCr;
        this.viewEffect = C3pd.A00(c9290GCr);
        C9286GCn c9286GCnA14 = C3cG.A14(new UiState(false, true, null, str == null ? "" : str3, str2 == null ? "" : str4));
        this._uiState = c9286GCnA14;
        this.uiState = C3cG.A11(c9286GCnA14);
        fetchAgreement();
    }

    public final void onEmailChange(String str) {
        UiState value;
        UiState uiState;
        C7384Etj.A0Y(str, 0);
        BLG<UiState> blg = this._uiState;
        do {
            value = blg.getValue();
            uiState = value;
        } while (!blg.A6e(value, uiState.copy(uiState.isLoading, uiState.isFetching, uiState.agreement, uiState.name, str)));
    }

    public final void onNameChange(String str) {
        UiState value;
        UiState uiState;
        C7384Etj.A0Y(str, 0);
        BLG<UiState> blg = this._uiState;
        do {
            value = blg.getValue();
            uiState = value;
        } while (!blg.A6e(value, uiState.copy(uiState.isLoading, uiState.isFetching, uiState.agreement, str, uiState.email)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logUnhandledRequiredFields(HatchNdaAgreement hatchNdaAgreement) {
        List<String> list;
        if (hatchNdaAgreement == null || (list = hatchNdaAgreement.requiredFields) == null) {
            return;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        for (String str : list) {
            if (!"name".equals(str) && !"email".equals(str)) {
                arrayListA0h.add(str);
            }
        }
        if (arrayListA0h.isEmpty()) {
            return;
        }
        CFK.A06(AuraNdaViewModelKt.TAG, AnonymousClass007.A0a("NDA agreement declares unhandled required fields: ", arrayListA0h));
    }

    public final C1BN<UiState> getUiState() {
        return this.uiState;
    }

    public final C22I<ViewEffect> getViewEffect() {
        return this.viewEffect;
    }

    public final void onAccept() {
        UiState value = this._uiState.getValue();
        if (value.getCanSubmit()) {
            AnonymousClass001.A1I(AnonymousClass001.A0y(), new C106771(value, null), AEu.A00(this));
        }
    }

    private final void fetchAgreement() {
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new AnonymousClass1(null), AEu.A00(this));
    }

    public /* synthetic */ AuraNdaViewModel(AuraActivationRepository auraActivationRepository, String str, String str2, int i, C06H c06h) {
        this(auraActivationRepository, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
