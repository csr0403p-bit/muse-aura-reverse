package com.facebook.aura.activation.model;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC10623Hzj;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BLG;
import X.C06H;
import X.C1BN;
import X.C20Q;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.C79;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.Ey9;
import X.G0V;
import X.GAo;
import X.GCV;
import X.HtJ;
import X.Hu1;
import X.Hwg;
import X.HzP;
import X.HzR;
import com.facebook.aura.activation.data.HatchTosMetadata;
import com.facebook.aura.activation.repo.AuraActivationRepository;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.confidentialvm.ConfidentialVmSetupGate;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmEnrollmentStep;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository;
import com.facebook.aura.navigation.key.SubscriptionPaywallEntryPoint;
import com.facebook.aura.subscription.repo.AuraSubscriptionRepository;
import com.facebook.aura.subscription.repo.SubscriptionDetailsState;
import com.facebook.aura.user.provider.AuraUserData;
import com.facebook.aura.user.provider.AuraViewerDataProvider;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class AuraActivationPlanFinishViewModel extends AEs {
    public static final Companion Companion = new Companion();

    @Deprecated
    public static final String TAG = "AuraActivationPlanFinishViewModel";
    public final BLG<Boolean> _isFinishing;
    public final BLG<Page> _page;
    public final HzR<ViewEffect> _viewEffects;
    public final AuraActivationRepository activationRepository;
    public final ConfidentialVmRepository confidentialVmRepository;
    public final C1BN<Boolean> isFinishing;
    public final C1BN<Page> page;
    public final ConfidentialVmSetupGate setupGate;
    public final AuraSubscriptionRepository subscriptionRepository;
    public final C20Q<ViewEffect> viewEffects;
    public final AuraViewerDataProvider viewerDataProvider;

    /* loaded from: classes.dex */
    public final class Factory extends AuraViewModelFactory<AuraActivationPlanFinishViewModel> {
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public AuraActivationPlanFinishViewModel create() {
            return new AuraActivationPlanFinishViewModel(AuraActivationRepository.Companion.getInstance(this.userSession), ConfidentialVmRepository.Companion.getInstance(this.userSession), ConfidentialVmSetupGate.Companion.getInstance(this.userSession), AuraSubscriptionRepository.Companion.getInstance(this.userSession), AuraViewerDataProvider.Companion.getInstance(this.userSession));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Page {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ Page[] $VALUES;
        public static final Page CONFIDENTIAL_VM_OFFER;
        public static final Page LOADING;
        public static final Page LOAD_FAILED;
        public static final Page PLANS;

        static {
            Page page = new Page("LOADING", 0);
            LOADING = page;
            Page page2 = new Page("LOAD_FAILED", 1);
            LOAD_FAILED = page2;
            Page page3 = new Page("PLANS", 2);
            PLANS = page3;
            Page page4 = new Page("CONFIDENTIAL_VM_OFFER", 3);
            CONFIDENTIAL_VM_OFFER = page4;
            Page[] pageArr = {page, page2, page3, page4};
            $VALUES = pageArr;
            $ENTRIES = C3cG.A0w(pageArr);
        }

        public static Ey9<Page> getEntries() {
            return $ENTRIES;
        }

        public static Page valueOf(String str) {
            return (Page) Enum.valueOf(Page.class, str);
        }

        public static Page[] values() {
            return (Page[]) $VALUES.clone();
        }

        public Page(String str, int i) {
        }
    }

    public interface ViewEffect {

        public final class CreatePin implements ViewEffect {
            public static final CreatePin INSTANCE = new CreatePin();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof CreatePin);
            }

            public String toString() {
                return "CreatePin";
            }

            public int hashCode() {
                return -976019379;
            }
        }

        public final class EnterExistingPin implements ViewEffect {
            public static final EnterExistingPin INSTANCE = new EnterExistingPin();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof EnterExistingPin);
            }

            public String toString() {
                return "EnterExistingPin";
            }

            public int hashCode() {
                return -2054676930;
            }
        }

        public final class Finished implements ViewEffect {
            public static final Finished INSTANCE = new Finished();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Finished);
            }

            public String toString() {
                return "Finished";
            }

            public int hashCode() {
                return -1832825698;
            }
        }

        public final class ReturnToActivation implements ViewEffect {
            public static final ReturnToActivation INSTANCE = new ReturnToActivation();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof ReturnToActivation);
            }

            public String toString() {
                return "ReturnToActivation";
            }

            public int hashCode() {
                return -1672192915;
            }
        }

        public final class TermsFailed implements ViewEffect {
            public static final TermsFailed INSTANCE = new TermsFailed();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof TermsFailed);
            }

            public String toString() {
                return "TermsFailed";
            }

            public int hashCode() {
                return 371997944;
            }
        }
    }

    @DebugMetadata(c = "com.facebook.aura.activation.model.AuraActivationPlanFinishViewModel$acceptTerms$2", f = "AuraActivationPlanFinishViewModel.kt", l = {153, 154}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.activation.model.AuraActivationPlanFinishViewModel$acceptTerms$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ HatchTosMetadata $displayedTosMetadata;
        public final /* synthetic */ String $fallbackDisclosureText;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchTosMetadata hatchTosMetadata, String str, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$displayedTosMetadata = hatchTosMetadata;
            this.$fallbackDisclosureText = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return AuraActivationPlanFinishViewModel.this.new AnonymousClass2(this.$displayedTosMetadata, this.$fallbackDisclosureText, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
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
                if (r0 == 0) goto L1b
                if (r0 == r3) goto L2b
                if (r0 != r4) goto L48
                X.Hwg.A00(r7)
            Lf:
                boolean r0 = X.AnonymousClass001.A1X(r7)
                if (r0 != 0) goto L16
                r3 = 0
            L16:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
                return r0
            L1b:
                X.Hwg.A00(r7)
                com.facebook.aura.activation.model.AuraActivationPlanFinishViewModel r0 = com.facebook.aura.activation.model.AuraActivationPlanFinishViewModel.this
                com.facebook.aura.activation.repo.AuraActivationRepository r0 = r0.activationRepository
                r6.label = r3
                java.lang.Object r7 = r0.fetchTosMetadata(r6)
                if (r7 != r5) goto L2e
                return r5
            L2b:
                X.Hwg.A00(r7)
            L2e:
                com.facebook.aura.activation.data.HatchTosMetadata r7 = (com.facebook.aura.activation.data.HatchTosMetadata) r7
                if (r7 == 0) goto L37
                boolean r0 = r7.hasAcceptedTos
                if (r0 != r3) goto L37
                goto L16
            L37:
                com.facebook.aura.activation.model.AuraActivationPlanFinishViewModel r0 = com.facebook.aura.activation.model.AuraActivationPlanFinishViewModel.this
                com.facebook.aura.activation.repo.AuraActivationRepository r2 = r0.activationRepository
                com.facebook.aura.activation.data.HatchTosMetadata r1 = r6.$displayedTosMetadata
                java.lang.String r0 = r6.$fallbackDisclosureText
                r6.label = r4
                java.lang.Object r7 = com.facebook.aura.activation.model.TosConsentKt.submitTosConsent(r2, r1, r0, r6)
                if (r7 != r5) goto Lf
                return r5
            L48:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.activation.model.AuraActivationPlanFinishViewModel.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.activation.model.AuraActivationPlanFinishViewModel$loadPage$1", f = "AuraActivationPlanFinishViewModel.kt", l = {87}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.activation.model.AuraActivationPlanFinishViewModel$loadPage$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return AuraActivationPlanFinishViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return AuraActivationPlanFinishViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            AuraUserData value;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                AuraSubscriptionRepository auraSubscriptionRepository = AuraActivationPlanFinishViewModel.this.subscriptionRepository;
                this.label = 1;
                obj = auraSubscriptionRepository.fetchSubscriptionDetailsState(this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            SubscriptionDetailsState.Success success = obj instanceof SubscriptionDetailsState.Success ? (SubscriptionDetailsState.Success) obj : null;
            AuraActivationPlanFinishViewModel auraActivationPlanFinishViewModel = AuraActivationPlanFinishViewModel.this;
            AnonymousClass002.A1I(auraActivationPlanFinishViewModel._page, success == null ? Page.LOAD_FAILED : (success.details.isPaidTier && (value = auraActivationPlanFinishViewModel.viewerDataProvider.userData.getValue()) != null && AnonymousClass002.A1b(value.isVmTypeSelectionRequired, true)) ? Page.CONFIDENTIAL_VM_OFFER : Page.PLANS);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.activation.model.AuraActivationPlanFinishViewModel$onPurchaseConfirmed$1", f = "AuraActivationPlanFinishViewModel.kt", l = {114, 115, 119}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.activation.model.AuraActivationPlanFinishViewModel$onPurchaseConfirmed$1, reason: invalid class name and case insensitive filesystem */
    public final class C106611 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchTosMetadata $displayedTosMetadata;
        public final /* synthetic */ String $fallbackDisclosureText;
        public final /* synthetic */ boolean $usesConfidentialVm;
        public Object L$0;
        public int label;
        public final /* synthetic */ AuraActivationPlanFinishViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C106611(boolean z, AuraActivationPlanFinishViewModel auraActivationPlanFinishViewModel, HatchTosMetadata hatchTosMetadata, String str, HtJ<? super C106611> htJ) {
            super(2, htJ);
            this.$usesConfidentialVm = z;
            this.this$0 = auraActivationPlanFinishViewModel;
            this.$displayedTosMetadata = hatchTosMetadata;
            this.$fallbackDisclosureText = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C106611(this.$usesConfidentialVm, this.this$0, this.$displayedTosMetadata, this.$fallbackDisclosureText, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0059 A[RETURN] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                X.Hji r3 = X.EnumC10460Hji.A02
                int r0 = r7.label
                r4 = 3
                r6 = 2
                r5 = 1
                if (r0 == 0) goto L19
                if (r0 == r5) goto L38
                if (r0 == r6) goto L15
                if (r0 != r4) goto L6c
                X.Hwg.A00(r8)
            L12:
                kotlin.Unit r3 = kotlin.Unit.INSTANCE
                return r3
            L15:
                X.Hwg.A00(r8)
                goto L43
            L19:
                X.Hwg.A00(r8)
                boolean r0 = r7.$usesConfidentialVm
                if (r0 != 0) goto L29
                com.facebook.aura.activation.model.AuraActivationPlanFinishViewModel r0 = r7.this$0
                com.facebook.aura.confidentialvm.ConfidentialVmSetupGate r1 = r0.setupGate
                com.facebook.aura.gateway.HatchlingVmType r0 = com.facebook.aura.gateway.HatchlingVmType.HATCH_VM
                r1.markSelected(r0)
            L29:
                com.facebook.aura.activation.model.AuraActivationPlanFinishViewModel r2 = r7.this$0
                com.facebook.aura.activation.data.HatchTosMetadata r1 = r7.$displayedTosMetadata
                java.lang.String r0 = r7.$fallbackDisclosureText
                r7.label = r5
                java.lang.Object r8 = com.facebook.aura.activation.model.AuraActivationPlanFinishViewModel.access$acceptTerms(r2, r1, r0, r7)
                if (r8 != r3) goto L3b
                return r3
            L38:
                X.Hwg.A00(r8)
            L3b:
                boolean r0 = X.AnonymousClass001.A1X(r8)
                if (r0 != 0) goto L5a
                com.facebook.aura.activation.model.AuraActivationPlanFinishViewModel$ViewEffect$TermsFailed r8 = com.facebook.aura.activation.model.AuraActivationPlanFinishViewModel.ViewEffect.TermsFailed.INSTANCE
            L43:
                com.facebook.aura.activation.model.AuraActivationPlanFinishViewModel$ViewEffect r8 = (com.facebook.aura.activation.model.AuraActivationPlanFinishViewModel.ViewEffect) r8
                com.facebook.aura.activation.model.AuraActivationPlanFinishViewModel r0 = r7.this$0
                com.facebook.aura.activation.model.AuraActivationPlanFinishViewModel.access$logConfidentialVmOfferError(r0, r8)
                com.facebook.aura.activation.model.AuraActivationPlanFinishViewModel r0 = r7.this$0
                X.HzR<com.facebook.aura.activation.model.AuraActivationPlanFinishViewModel$ViewEffect> r1 = r0._viewEffects
                r0 = 0
                r7.L$0 = r0
                r7.label = r4
                java.lang.Object r0 = r1.AcU(r8, r7)
                if (r0 != r3) goto L12
                return r3
            L5a:
                boolean r0 = r7.$usesConfidentialVm
                if (r0 == 0) goto L69
                com.facebook.aura.activation.model.AuraActivationPlanFinishViewModel r0 = r7.this$0
                r7.label = r6
                java.lang.Object r8 = com.facebook.aura.activation.model.AuraActivationPlanFinishViewModel.access$resolveConfidentialVmEffect(r0, r7)
                if (r8 != r3) goto L43
                return r3
            L69:
                com.facebook.aura.activation.model.AuraActivationPlanFinishViewModel$ViewEffect$Finished r8 = com.facebook.aura.activation.model.AuraActivationPlanFinishViewModel.ViewEffect.Finished.INSTANCE
                goto L43
            L6c:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.activation.model.AuraActivationPlanFinishViewModel.C106611.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C106611) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.activation.model.AuraActivationPlanFinishViewModel", f = "AuraActivationPlanFinishViewModel.kt", l = {160}, m = "resolveConfidentialVmEffect", v = 2)
    /* renamed from: com.facebook.aura.activation.model.AuraActivationPlanFinishViewModel$resolveConfidentialVmEffect$1, reason: invalid class name and case insensitive filesystem */
    public final class C106621 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public C106621(HtJ<? super C106621> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraActivationPlanFinishViewModel.this.resolveConfidentialVmEffect(this);
        }
    }

    public AuraActivationPlanFinishViewModel(AuraActivationRepository auraActivationRepository, ConfidentialVmRepository confidentialVmRepository, ConfidentialVmSetupGate confidentialVmSetupGate, AuraSubscriptionRepository auraSubscriptionRepository, AuraViewerDataProvider auraViewerDataProvider) {
        C7384Etj.A0Y(auraActivationRepository, 0);
        AnonymousClass005.A11(confidentialVmRepository, confidentialVmSetupGate, auraSubscriptionRepository, 1);
        C7384Etj.A0Y(auraViewerDataProvider, 4);
        this.activationRepository = auraActivationRepository;
        this.confidentialVmRepository = confidentialVmRepository;
        this.setupGate = confidentialVmSetupGate;
        this.subscriptionRepository = auraSubscriptionRepository;
        this.viewerDataProvider = auraViewerDataProvider;
        GCV gcvA00 = AbstractC10623Hzj.A00(C79.A00, -2);
        this._viewEffects = gcvA00;
        this.viewEffects = Hu1.A01(gcvA00);
        C9286GCn c9286GCnA14 = C3cG.A14(false);
        this._isFinishing = c9286GCnA14;
        this.isFinishing = C3cG.A11(c9286GCnA14);
        C9286GCn c9286GCnA142 = C3cG.A14(Page.LOADING);
        this._page = c9286GCnA142;
        this.page = C3cG.A11(c9286GCnA142);
        loadPage();
    }

    public final void onPurchaseConfirmed(boolean z, HatchTosMetadata hatchTosMetadata, String str) {
        C7384Etj.A0Y(str, 2);
        if (C9286GCn.A00(AnonymousClass001.A0h(), AnonymousClass001.A0i(), (C9286GCn) this._isFinishing)) {
            AnonymousClass001.A1J(new C106611(z, this, hatchTosMetadata, str, null), AEu.A00(this));
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConfidentialVmEnrollmentStep.values().length];
            try {
                AnonymousClass002.A13(ConfidentialVmEnrollmentStep.USE_STORED_SECRET, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ConfidentialVmEnrollmentStep.ENTER_EXISTING_PIN, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(ConfidentialVmEnrollmentStep.CREATE_PIN, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(ConfidentialVmEnrollmentStep.UNAVAILABLE, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logConfidentialVmOfferError(ViewEffect viewEffect) {
        if (this._page.getValue() == Page.CONFIDENTIAL_VM_OFFER) {
            if (C7384Etj.areEqual(viewEffect, ViewEffect.TermsFailed.INSTANCE) || C7384Etj.areEqual(viewEffect, ViewEffect.ReturnToActivation.INSTANCE)) {
                HatchImpressionLogger.INSTANCE.logImpression(HatchOrigin.ONBOARDING, HatchSurface.ONBOARDING, HatchSubsurface.ONBOARDING_POST_AUTH, HatchScreen.ONBOARDING_CVM_OFFER, HatchComponent.CVM_ERROR_STATE, null, AnonymousClass006.A10(HatchMetadataKey.ENTRY_POINT.getValue(), SubscriptionPaywallEntryPoint.ACTIVATION.getValue()), null);
            } else if (!C7384Etj.areEqual(viewEffect, ViewEffect.EnterExistingPin.INSTANCE) && !C7384Etj.areEqual(viewEffect, ViewEffect.CreatePin.INSTANCE) && !C7384Etj.areEqual(viewEffect, ViewEffect.Finished.INSTANCE)) {
                throw C3cG.A0q();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object resolveConfidentialVmEffect(X.HtJ<? super com.facebook.aura.activation.model.AuraActivationPlanFinishViewModel.ViewEffect> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.facebook.aura.activation.model.AuraActivationPlanFinishViewModel.C106621
            if (r0 == 0) goto L1f
            r5 = r7
            com.facebook.aura.activation.model.AuraActivationPlanFinishViewModel$resolveConfidentialVmEffect$1 r5 = (com.facebook.aura.activation.model.AuraActivationPlanFinishViewModel.C106621) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1f
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r2 = r5.result
            X.Hji r1 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L2a
            if (r0 != r4) goto L25
            goto L38
        L1f:
            com.facebook.aura.activation.model.AuraActivationPlanFinishViewModel$resolveConfidentialVmEffect$1 r5 = new com.facebook.aura.activation.model.AuraActivationPlanFinishViewModel$resolveConfidentialVmEffect$1
            r5.<init>(r7)
            goto L12
        L25:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2a:
            X.Hwg.A00(r2)
            com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository r0 = r6.confidentialVmRepository     // Catch: java.lang.Exception -> L3e java.util.concurrent.CancellationException -> L6f
            r5.label = r4     // Catch: java.lang.Exception -> L3e java.util.concurrent.CancellationException -> L6f
            java.lang.Object r2 = r0.resolveEnrollmentStep(r5)     // Catch: java.lang.Exception -> L3e java.util.concurrent.CancellationException -> L6f
            if (r2 != r1) goto L3b
            return r1
        L38:
            X.Hwg.A00(r2)     // Catch: java.lang.Exception -> L3e java.util.concurrent.CancellationException -> L6f
        L3b:
            com.facebook.aura.confidentialvm.repository.ConfidentialVmEnrollmentStep r2 = (com.facebook.aura.confidentialvm.repository.ConfidentialVmEnrollmentStep) r2     // Catch: java.lang.Exception -> L3e java.util.concurrent.CancellationException -> L6f
            goto L48
        L3e:
            r2 = move-exception
            java.lang.String r1 = "Failed to resolve confidential VM enrollment after purchase"
            java.lang.String r0 = "AuraActivationPlanFinishViewModel"
            X.CFK.A08(r0, r1, r2)
            com.facebook.aura.confidentialvm.repository.ConfidentialVmEnrollmentStep r2 = com.facebook.aura.confidentialvm.repository.ConfidentialVmEnrollmentStep.UNAVAILABLE
        L48:
            int r1 = r2.ordinal()
            if (r1 == r3) goto L61
            if (r1 == r4) goto L5e
            r0 = 2
            if (r1 == r0) goto L5b
            r0 = 3
            if (r1 == r0) goto L6c
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        L5b:
            com.facebook.aura.activation.model.AuraActivationPlanFinishViewModel$ViewEffect$CreatePin r0 = com.facebook.aura.activation.model.AuraActivationPlanFinishViewModel.ViewEffect.CreatePin.INSTANCE
            return r0
        L5e:
            com.facebook.aura.activation.model.AuraActivationPlanFinishViewModel$ViewEffect$EnterExistingPin r0 = com.facebook.aura.activation.model.AuraActivationPlanFinishViewModel.ViewEffect.EnterExistingPin.INSTANCE
            return r0
        L61:
            com.facebook.aura.confidentialvm.ConfidentialVmSetupGate r0 = r6.setupGate
            boolean r0 = r0.commitCvmSelectionAfterEscrow()
            if (r0 == 0) goto L6c
            com.facebook.aura.activation.model.AuraActivationPlanFinishViewModel$ViewEffect$Finished r0 = com.facebook.aura.activation.model.AuraActivationPlanFinishViewModel.ViewEffect.Finished.INSTANCE
            return r0
        L6c:
            com.facebook.aura.activation.model.AuraActivationPlanFinishViewModel$ViewEffect$ReturnToActivation r0 = com.facebook.aura.activation.model.AuraActivationPlanFinishViewModel.ViewEffect.ReturnToActivation.INSTANCE
            return r0
        L6f:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.activation.model.AuraActivationPlanFinishViewModel.resolveConfidentialVmEffect(X.HtJ):java.lang.Object");
    }

    public final C1BN<Page> getPage() {
        return this.page;
    }

    public final C20Q<ViewEffect> getViewEffects() {
        return this.viewEffects;
    }

    public final C1BN<Boolean> isFinishing() {
        return this.isFinishing;
    }

    public final void loadPage() {
        C9286GCn.A00(null, Page.LOADING, (C9286GCn) this._page);
        AnonymousClass001.A1J(new AnonymousClass1(null), AEu.A00(this));
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object acceptTerms(HatchTosMetadata hatchTosMetadata, String str, HtJ<? super Boolean> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(hatchTosMetadata, str, null));
    }
}
