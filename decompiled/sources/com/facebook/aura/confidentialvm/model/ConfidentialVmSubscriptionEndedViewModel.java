package com.facebook.aura.confidentialvm.model;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC10623Hzj;
import X.AbstractC3358CGz;
import X.AbstractC9777Gfy;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass441;
import X.BLG;
import X.BLL;
import X.C06H;
import X.C1BN;
import X.C20Q;
import X.C3Es;
import X.C3Pi;
import X.C3UX;
import X.C3rb;
import X.C60I;
import X.C7384Etj;
import X.C79;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.Ey9;
import X.F3w;
import X.G0V;
import X.G0W;
import X.GAo;
import X.GCV;
import X.HtJ;
import X.Hu1;
import X.Hwg;
import X.HzR;
import com.facebook.aura.analytics.hatch.HatchClientCvmEventLogger;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.commands.sms.MessageDraftSenderKt;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.gateway.HatchVmRepository;
import com.facebook.aura.gateway.VmFetchSource;
import com.facebook.aura.logout.AuraLogoutHelper;
import com.facebook.aura.navigation.key.ConfidentialVmSwitchDirection;
import com.facebook.aura.navigation.key.ConfidentialVmSwitchEntryPoint;
import com.facebook.aura.subscription.repo.AuraSubscriptionRepository;
import com.facebook.aura.subscription.repo.AuraSubscriptionRepositoryKt;
import com.facebook.aura.subscription.repo.SubscriptionDetails;
import com.facebook.aura.subscription.repo.SubscriptionDetailsState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class ConfidentialVmSubscriptionEndedViewModel extends AEs {
    public static final int $stable = 8;
    public final BLG<ContinueCheck> _continueCheck;
    public final HzR<Integer> _continueConfirmed;
    public final C1BN<ContinueCheck> continueCheck;
    public final C20Q<Integer> continueConfirmed;
    public int continueGeneration;
    public final ConfidentialVmEligibility eligibility;
    public final BLG<Boolean> isRenewRequested;
    public final AuraSubscriptionRepository subscriptionRepository;
    public final C1BN<Long> topupBalance;
    public final AbstractC3358CGz userSession;
    public static final Companion Companion = new Companion();
    public static final HatchScreen SCREEN = HatchScreen.CVM_SUBSCRIPTION_ENDED;
    public static final ConfidentialVmSwitchEntryPoint ENTRY_POINT = ConfidentialVmSwitchEntryPoint.SUBSCRIPTION_ENDED;
    public static final ConfidentialVmSwitchDirection DIRECTION = ConfidentialVmSwitchDirection.TO_SECURE_VM;

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.model.ConfidentialVmSubscriptionEndedViewModel$1", f = "ConfidentialVmSubscriptionEndedViewModel.kt", l = {MessageDraftSenderKt.UNICODE_SINGLE_PART_CHARS, 71}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.model.ConfidentialVmSubscriptionEndedViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        @DebugMetadata(c = "com.facebook.aura.confidentialvm.model.ConfidentialVmSubscriptionEndedViewModel$1$1", f = "ConfidentialVmSubscriptionEndedViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.confidentialvm.model.ConfidentialVmSubscriptionEndedViewModel$1$1, reason: invalid class name and collision with other inner class name */
        public final class C00831 extends AbstractC07127nr implements G0W<Boolean, SubscriptionDetailsState, HtJ<? super Boolean>, Object> {
            public /* synthetic */ Object L$0;
            public /* synthetic */ boolean Z$0;
            public int label;
            public final /* synthetic */ ConfidentialVmSubscriptionEndedViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00831(ConfidentialVmSubscriptionEndedViewModel confidentialVmSubscriptionEndedViewModel, HtJ<? super C00831> htJ) {
                super(3, htJ);
                this.this$0 = confidentialVmSubscriptionEndedViewModel;
            }

            /* JADX WARN: Removed duplicated region for block: B:12:0x0021  */
            @Override // X.AbstractC8884Fsp
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r4) {
                /*
                    r3 = this;
                    boolean r2 = r3.Z$0
                    java.lang.Object r1 = r3.L$0
                    com.facebook.aura.subscription.repo.SubscriptionDetailsState r1 = (com.facebook.aura.subscription.repo.SubscriptionDetailsState) r1
                    int r0 = r3.label
                    if (r0 != 0) goto L23
                    X.Hwg.A00(r4)
                    if (r2 == 0) goto L21
                    com.facebook.aura.confidentialvm.model.ConfidentialVmSubscriptionEndedViewModel r0 = r3.this$0
                    com.facebook.aura.subscription.repo.SubscriptionDetails r0 = com.facebook.aura.confidentialvm.model.ConfidentialVmSubscriptionEndedViewModel.access$details(r0, r1)
                    if (r0 == 0) goto L21
                    boolean r1 = r0.isPaidTier
                    r0 = 1
                    if (r1 != r0) goto L21
                L1c:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                    return r0
                L21:
                    r0 = 0
                    goto L1c
                L23:
                    java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.model.ConfidentialVmSubscriptionEndedViewModel.AnonymousClass1.C00831.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // X.G0W
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, SubscriptionDetailsState subscriptionDetailsState, HtJ<? super Boolean> htJ) {
                return invoke(AnonymousClass001.A1X(bool), subscriptionDetailsState, htJ);
            }

            public final Object invoke(boolean z, SubscriptionDetailsState subscriptionDetailsState, HtJ<? super Boolean> htJ) {
                C00831 c00831 = new C00831(this.this$0, htJ);
                c00831.Z$0 = z;
                c00831.L$0 = subscriptionDetailsState;
                return c00831.invokeSuspend(Unit.INSTANCE);
            }
        }

        @DebugMetadata(c = "com.facebook.aura.confidentialvm.model.ConfidentialVmSubscriptionEndedViewModel$1$2", f = "ConfidentialVmSubscriptionEndedViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.confidentialvm.model.ConfidentialVmSubscriptionEndedViewModel$1$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC07127nr implements G0V<Boolean, HtJ<? super Boolean>, Object> {
            public /* synthetic */ boolean Z$0;
            public int label;

            public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
                super(2, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(htJ);
                anonymousClass2.Z$0 = AnonymousClass001.A1X(obj);
                return anonymousClass2;
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                boolean z = this.Z$0;
                if (this.label == 0) {
                    return AnonymousClass001.A0k(obj, z);
                }
                throw AnonymousClass001.A0n();
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, HtJ<? super Boolean> htJ) {
                return invoke(AnonymousClass001.A1X(bool), htJ);
            }

            public final Object invoke(boolean z, HtJ<? super Boolean> htJ) {
                return ((AnonymousClass2) AnonymousClass002.A0r(htJ, this, z)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConfidentialVmSubscriptionEndedViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                ConfidentialVmSubscriptionEndedViewModel confidentialVmSubscriptionEndedViewModel = ConfidentialVmSubscriptionEndedViewModel.this;
                int i2 = ConfidentialVmSubscriptionEndedViewModel.$stable;
                C60I c60iA03 = C3rb.A03(new C00831(confidentialVmSubscriptionEndedViewModel, null), confidentialVmSubscriptionEndedViewModel.isRenewRequested, confidentialVmSubscriptionEndedViewModel.subscriptionRepository.subscriptionDetailsState);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(null);
                this.label = 1;
                if (AbstractC9777Gfy.A00(this, anonymousClass2, c60iA03) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    return Unit.INSTANCE;
                }
                Hwg.A00(obj);
            }
            HatchVmRepository hatchVmRepository = HatchVmRepository.INSTANCE;
            ConfidentialVmSubscriptionEndedViewModel confidentialVmSubscriptionEndedViewModel2 = ConfidentialVmSubscriptionEndedViewModel.this;
            int i3 = ConfidentialVmSubscriptionEndedViewModel.$stable;
            AbstractC3358CGz abstractC3358CGz = confidentialVmSubscriptionEndedViewModel2.userSession;
            VmFetchSource vmFetchSource = VmFetchSource.CVM_SUBSCRIPTION_RENEWED;
            this.label = 2;
            if (hatchVmRepository.fetchAndCacheExistingVm(abstractC3358CGz, vmFetchSource, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ConfidentialVmSubscriptionEndedViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final class Companion {
        public final ConfidentialVmSwitchDirection getDIRECTION() {
            return ConfidentialVmSubscriptionEndedViewModel.DIRECTION;
        }

        public final ConfidentialVmSwitchEntryPoint getENTRY_POINT() {
            return ConfidentialVmSubscriptionEndedViewModel.ENTRY_POINT;
        }

        public final HatchScreen getSCREEN() {
            return ConfidentialVmSubscriptionEndedViewModel.SCREEN;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class ContinueCheck {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ ContinueCheck[] $VALUES;
        public static final ContinueCheck CHECKING;
        public static final ContinueCheck FAILED;
        public static final ContinueCheck IDLE;

        static {
            ContinueCheck continueCheck = new ContinueCheck("IDLE", 0);
            IDLE = continueCheck;
            ContinueCheck continueCheck2 = new ContinueCheck("CHECKING", 1);
            CHECKING = continueCheck2;
            ContinueCheck continueCheck3 = new ContinueCheck(CvmMigrationStatusJson.STAGE_FAILED, 2);
            FAILED = continueCheck3;
            ContinueCheck[] continueCheckArr = {continueCheck, continueCheck2, continueCheck3};
            $VALUES = continueCheckArr;
            $ENTRIES = new F3w(continueCheckArr);
        }

        public static Ey9<ContinueCheck> getEntries() {
            return $ENTRIES;
        }

        public static ContinueCheck valueOf(String str) {
            return (ContinueCheck) Enum.valueOf(ContinueCheck.class, str);
        }

        public static ContinueCheck[] values() {
            return (ContinueCheck[]) $VALUES.clone();
        }

        public ContinueCheck(String str, int i) {
        }
    }

    public final class Factory extends AuraViewModelFactory<ConfidentialVmSubscriptionEndedViewModel> {
        public static final int $stable = 8;
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public /* bridge */ /* synthetic */ AEs create() {
            return new ConfidentialVmSubscriptionEndedViewModel(this.userSession);
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public ConfidentialVmSubscriptionEndedViewModel create() {
            return new ConfidentialVmSubscriptionEndedViewModel(this.userSession);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.model.ConfidentialVmSubscriptionEndedViewModel$onContinueClick$1", f = "ConfidentialVmSubscriptionEndedViewModel.kt", l = {93, 113}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.model.ConfidentialVmSubscriptionEndedViewModel$onContinueClick$1, reason: invalid class name and case insensitive filesystem */
    public final class C112091 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ int $generation;
        public int I$0;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public int label;
        public final /* synthetic */ ConfidentialVmSubscriptionEndedViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C112091(int i, ConfidentialVmSubscriptionEndedViewModel confidentialVmSubscriptionEndedViewModel, HtJ<? super C112091> htJ) {
            super(2, htJ);
            this.$generation = i;
            this.this$0 = confidentialVmSubscriptionEndedViewModel;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C112091 c112091 = new C112091(this.$generation, this.this$0, htJ);
            c112091.L$0 = obj;
            return c112091;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r7 = r8.L$0
                X.3UX r7 = (X.C3UX) r7
                X.Hji r4 = X.EnumC10460Hji.A02
                int r0 = r8.label
                r6 = 0
                r5 = 2
                r2 = 1
                if (r0 == 0) goto L17
                if (r0 == r2) goto L30
                if (r0 != r5) goto L99
                X.Hwg.A00(r9)
            L14:
                kotlin.Unit r4 = kotlin.Unit.INSTANCE
                return r4
            L17:
                X.Hwg.A00(r9)
                X.78T r3 = X.AnonymousClass001.A0y()     // Catch: java.util.concurrent.CancellationException -> L37
                com.facebook.aura.confidentialvm.model.ConfidentialVmSubscriptionEndedViewModel r1 = r8.this$0     // Catch: java.util.concurrent.CancellationException -> L37
                com.facebook.aura.confidentialvm.model.ConfidentialVmSubscriptionEndedViewModel$onContinueClick$1$result$1 r0 = new com.facebook.aura.confidentialvm.model.ConfidentialVmSubscriptionEndedViewModel$onContinueClick$1$result$1     // Catch: java.util.concurrent.CancellationException -> L37
                r0.<init>(r1, r6)     // Catch: java.util.concurrent.CancellationException -> L37
                r8.L$0 = r7     // Catch: java.util.concurrent.CancellationException -> L37
                r8.label = r2     // Catch: java.util.concurrent.CancellationException -> L37
                java.lang.Object r9 = X.GAo.A00(r8, r3, r0)     // Catch: java.util.concurrent.CancellationException -> L37
                if (r9 != r4) goto L33
                goto L9e
            L30:
                X.Hwg.A00(r9)     // Catch: java.util.concurrent.CancellationException -> L37
            L33:
                com.facebook.aura.gateway.HatchVmRepository$FetchAndCacheLeasedVmResult r9 = (com.facebook.aura.gateway.HatchVmRepository.FetchAndCacheLeasedVmResult) r9     // Catch: java.util.concurrent.CancellationException -> L37
                r6 = r9
                goto L3e
            L37:
                X.78T r0 = r7.AEA()
                X.HzS.A05(r0)
            L3e:
                int r1 = r8.$generation
                com.facebook.aura.confidentialvm.model.ConfidentialVmSubscriptionEndedViewModel r3 = r8.this$0
                int r0 = com.facebook.aura.confidentialvm.model.ConfidentialVmSubscriptionEndedViewModel.$stable
                int r0 = r3.continueGeneration
                if (r1 != r0) goto L14
                boolean r0 = r6 instanceof com.facebook.aura.gateway.HatchVmRepository.FetchAndCacheLeasedVmResult.Success
                if (r0 == 0) goto L53
                com.facebook.aura.gateway.HatchVmRepository$FetchAndCacheLeasedVmResult$Success r6 = (com.facebook.aura.gateway.HatchVmRepository.FetchAndCacheLeasedVmResult.Success) r6
                java.lang.String r0 = r6.fallbackBackendErrorCode
                r6 = 1
                if (r0 == 0) goto L54
            L53:
                r6 = 0
            L54:
                X.BLG<com.facebook.aura.confidentialvm.model.ConfidentialVmSubscriptionEndedViewModel$ContinueCheck> r1 = r3._continueCheck
                if (r6 != 0) goto L96
                com.facebook.aura.confidentialvm.model.ConfidentialVmEligibility r0 = r3.eligibility
                X.1BN<java.lang.Boolean> r0 = r0.isNotEligibleOnCvm
                java.lang.Object r0 = r0.getValue()
                boolean r0 = X.AnonymousClass001.A1X(r0)
                if (r0 == 0) goto L96
                com.facebook.aura.confidentialvm.model.ConfidentialVmSubscriptionEndedViewModel$ContinueCheck r0 = com.facebook.aura.confidentialvm.model.ConfidentialVmSubscriptionEndedViewModel.ContinueCheck.FAILED
            L68:
                X.GCn r1 = (X.C9286GCn) r1
                r3 = 0
                X.C9286GCn.A00(r3, r0, r1)
                if (r6 == 0) goto L14
                com.facebook.aura.confidentialvm.model.ConfidentialVmSubscriptionEndedViewModel r0 = r8.this$0
                com.facebook.aura.confidentialvm.model.ConfidentialVmEligibility r0 = r0.eligibility
                java.lang.Boolean r0 = r0.isLiveNotEligible
                boolean r0 = X.AnonymousClass002.A1b(r0, r2)
                if (r0 == 0) goto L14
                com.facebook.aura.confidentialvm.model.ConfidentialVmSubscriptionEndedViewModel r0 = r8.this$0
                X.HzR<java.lang.Integer> r2 = r0._continueConfirmed
                int r1 = r8.$generation
                java.lang.Integer r0 = new java.lang.Integer
                r0.<init>(r1)
                r8.L$0 = r3
                r8.L$1 = r3
                r8.I$0 = r6
                r8.label = r5
                java.lang.Object r0 = r2.AcU(r0, r8)
                if (r0 != r4) goto L14
                return r4
            L96:
                com.facebook.aura.confidentialvm.model.ConfidentialVmSubscriptionEndedViewModel$ContinueCheck r0 = com.facebook.aura.confidentialvm.model.ConfidentialVmSubscriptionEndedViewModel.ContinueCheck.IDLE
                goto L68
            L99:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            L9e:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.model.ConfidentialVmSubscriptionEndedViewModel.C112091.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C112091) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public ConfidentialVmSubscriptionEndedViewModel(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.userSession = abstractC3358CGz;
        AuraSubscriptionRepository companion = AuraSubscriptionRepository.Companion.getInstance(abstractC3358CGz);
        this.subscriptionRepository = companion;
        ConfidentialVmSubscriptionEndedViewModel$special$$inlined$map$1 confidentialVmSubscriptionEndedViewModel$special$$inlined$map$1 = new ConfidentialVmSubscriptionEndedViewModel$special$$inlined$map$1(companion.subscriptionDetailsState, this);
        BLL bllA00 = AEu.A00(this);
        C3Es c3Es = new C3Es(5000L, LinkEncryptedPairingKt.LINK_COUNTER_MAX);
        SubscriptionDetails currentSubscriptionDetails = companion.getCurrentSubscriptionDetails();
        this.topupBalance = AnonymousClass441.A00(Long.valueOf(currentSubscriptionDetails != null ? currentSubscriptionDetails.topupBalance : 0L), bllA00, confidentialVmSubscriptionEndedViewModel$special$$inlined$map$1, c3Es);
        this.eligibility = ConfidentialVmEligibility.Companion.getInstance(abstractC3358CGz);
        Integer num = C79.A00;
        GCV gcvA00 = AbstractC10623Hzj.A00(num, -2);
        this._continueConfirmed = gcvA00;
        this.continueConfirmed = Hu1.A01(gcvA00);
        C9286GCn c9286GCn = new C9286GCn(ContinueCheck.IDLE);
        this._continueCheck = c9286GCn;
        this.continueCheck = new C3Pi(null, c9286GCn);
        this.isRenewRequested = AnonymousClass002.A0v(false);
        companion.m2262refreshIfStaleLRDsOJo(AuraSubscriptionRepositoryKt.DEFAULT_SUBSCRIPTION_FRESHNESS);
        GAo.A02(num, AnonymousClass001.A0y(), new AnonymousClass1(null), AEu.A00(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SubscriptionDetails details(SubscriptionDetailsState subscriptionDetailsState) {
        SubscriptionDetailsState.Success success;
        if (!(subscriptionDetailsState instanceof SubscriptionDetailsState.Success) || (success = (SubscriptionDetailsState.Success) subscriptionDetailsState) == null) {
            return null;
        }
        return success.details;
    }

    public final void cancelContinue() {
        this.continueGeneration++;
        AnonymousClass002.A1I(this._continueCheck, ContinueCheck.IDLE);
    }

    public final boolean claimContinue(int i) {
        if (i != this.continueGeneration || !AnonymousClass002.A1b(this.eligibility.isLiveNotEligible, true)) {
            return false;
        }
        this.continueGeneration++;
        return true;
    }

    public final C1BN<ContinueCheck> getContinueCheck() {
        return this.continueCheck;
    }

    public final C20Q<Integer> getContinueConfirmed() {
        return this.continueConfirmed;
    }

    public final C1BN<Long> getTopupBalance() {
        return this.topupBalance;
    }

    public final void onContinueClick() {
        ConfidentialVmAnalytics.INSTANCE.logSwitchTap(SCREEN, HatchComponent.CONTINUE_BUTTON, ENTRY_POINT, DIRECTION, null);
        HatchClientCvmEventLogger.INSTANCE.logSubscriptionEndedContinueClick();
        int i = this.continueGeneration + 1;
        this.continueGeneration = i;
        AnonymousClass001.A1E(this._continueCheck, null, ContinueCheck.CHECKING);
        AnonymousClass001.A1J(new C112091(i, this, null), AEu.A00(this));
    }

    public final void onLogOutClick() {
        AuraLogoutHelper auraLogoutHelper = AuraLogoutHelper.INSTANCE;
        if (AnonymousClass001.A1X(AuraLogoutHelper.isLoggingOut.getValue())) {
            return;
        }
        cancelContinue();
        ConfidentialVmAnalytics confidentialVmAnalytics = ConfidentialVmAnalytics.INSTANCE;
        HatchClientCvmEventLogger.INSTANCE.logLogoutClick();
        confidentialVmAnalytics.logSwitchTap(SCREEN, HatchComponent.LOGOUT_BUTTON, ENTRY_POINT, DIRECTION, HatchSubsurface.DOT_MENU);
        auraLogoutHelper.performLogout();
    }

    public final void onMenuClick() {
        ConfidentialVmAnalytics.INSTANCE.logSwitchTap(SCREEN, HatchComponent.THREE_DOTS_MENU, ENTRY_POINT, DIRECTION, null);
    }

    public final void onShown() {
        ConfidentialVmAnalytics.INSTANCE.logSwitchScreenView(SCREEN, ENTRY_POINT, DIRECTION);
        HatchClientCvmEventLogger.INSTANCE.logSubscriptionEndedView();
    }

    public final void onRenewClick() {
        cancelContinue();
        C9286GCn.A00(null, AnonymousClass001.A0i(), (C9286GCn) this.isRenewRequested);
        ConfidentialVmAnalytics confidentialVmAnalytics = ConfidentialVmAnalytics.INSTANCE;
        HatchClientCvmEventLogger.INSTANCE.logSubscriptionEndedRenewClick();
        confidentialVmAnalytics.logSwitchTap(SCREEN, HatchComponent.RESUBSCRIBE_BUTTON, ENTRY_POINT, DIRECTION, null);
    }

    public final void onReportIssueClick() {
        cancelContinue();
        ConfidentialVmAnalytics confidentialVmAnalytics = ConfidentialVmAnalytics.INSTANCE;
        HatchClientCvmEventLogger.INSTANCE.logHelpClick();
        confidentialVmAnalytics.logSwitchTap(SCREEN, HatchComponent.REPORT_PROBLEM_BUTTON, ENTRY_POINT, DIRECTION, HatchSubsurface.DOT_MENU);
    }
}
