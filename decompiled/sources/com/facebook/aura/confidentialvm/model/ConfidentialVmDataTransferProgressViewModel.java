package com.facebook.aura.confidentialvm.model;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass441;
import X.BLG;
import X.C1BN;
import X.C20Z;
import X.C22I;
import X.C3Ek;
import X.C3Em;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3pd;
import X.C3rb;
import X.C60I;
import X.C7384Etj;
import X.C79;
import X.C9286GCn;
import X.C9290GCr;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.analytics.hatch.HatchClientCvmEventLogger;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.confidentialvm.session.ConfidentialSessionGate;
import com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation;
import com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDowngradeOperation;
import com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationOperation;
import com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchRestartKt;
import com.facebook.aura.logout.AuraLogoutHelper;
import com.facebook.aura.navigation.key.ConfidentialVmSwitchDirection;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class ConfidentialVmDataTransferProgressViewModel extends AEs {
    public static final int $stable = 8;
    public final BLG<ConfidentialVmDataTransferUiState> _uiState;
    public final C3Em<ConfidentialVmDataTransferViewEffect> _viewEffects;
    public final ConfidentialVmSwitchDirection direction;
    public volatile boolean hasTappedLeave;
    public Boolean loggedFailed;
    public final ConfidentialVmDataTransferOperation operation;
    public final ConfidentialSessionGate sessionGate;
    public final C1BN<ConfidentialVmDataTransferUiState> uiState;
    public final C22I<ConfidentialVmDataTransferViewEffect> viewEffects;

    public final class Factory extends AuraViewModelFactory<ConfidentialVmDataTransferProgressViewModel> {
        public static final int $stable = 8;
        public final ConfidentialVmSwitchDirection direction;
        public final AbstractC3358CGz userSession;

        /* loaded from: classes.dex */
        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ConfidentialVmSwitchDirection.values().length];
                try {
                    AnonymousClass002.A13(ConfidentialVmSwitchDirection.TO_CONFIDENTIAL_VM, iArr);
                } catch (NoSuchFieldError unused) {
                }
                try {
                    AnonymousClass002.A14(ConfidentialVmSwitchDirection.TO_SECURE_VM, iArr);
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public ConfidentialVmDataTransferProgressViewModel create() {
            ConfidentialVmDataTransferOperation companion;
            ConfidentialVmSwitchDirection confidentialVmSwitchDirection = this.direction;
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int iOrdinal = confidentialVmSwitchDirection.ordinal();
            if (iOrdinal == 0) {
                companion = ConfidentialVmMigrationOperation.Companion.getInstance(this.userSession);
            } else {
                if (iOrdinal != 1) {
                    throw C3cG.A0q();
                }
                companion = ConfidentialVmDowngradeOperation.Companion.getInstance(this.userSession);
            }
            return new ConfidentialVmDataTransferProgressViewModel(companion, this.direction, ConfidentialSessionGate.Companion.getInstance(this.userSession));
        }

        public Factory(AbstractC3358CGz abstractC3358CGz, ConfidentialVmSwitchDirection confidentialVmSwitchDirection) {
            AnonymousClass003.A0u(abstractC3358CGz, confidentialVmSwitchDirection);
            this.userSession = abstractC3358CGz;
            this.direction = confidentialVmSwitchDirection;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.model.ConfidentialVmDataTransferProgressViewModel$onLeave$2", f = "ConfidentialVmDataTransferProgressViewModel.kt", l = {160, 165, 166, 167}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.model.ConfidentialVmDataTransferProgressViewModel$onLeave$2, reason: invalid class name and case insensitive filesystem */
    public final class C112032 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        /* renamed from: com.facebook.aura.confidentialvm.model.ConfidentialVmDataTransferProgressViewModel$onLeave$2$WhenMappings */
        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ConfidentialVmDataTransferOperation.AfterClear.values().length];
                try {
                    AnonymousClass002.A13(ConfidentialVmDataTransferOperation.AfterClear.RESTART, iArr);
                } catch (NoSuchFieldError unused) {
                }
                try {
                    AnonymousClass002.A14(ConfidentialVmDataTransferOperation.AfterClear.STAY, iArr);
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    AnonymousClass002.A15(ConfidentialVmDataTransferOperation.AfterClear.KEPT, iArr);
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C112032(HtJ<? super C112032> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConfidentialVmDataTransferProgressViewModel.this.new C112032(htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0094 A[RETURN] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                X.Hji r4 = X.EnumC10460Hji.A02
                int r0 = r11.label
                r5 = 4
                r6 = 3
                r3 = 2
                r7 = 0
                r2 = 1
                if (r0 == 0) goto L18
                if (r0 == r2) goto L28
                if (r0 == r3) goto L47
                if (r0 == r6) goto L95
                if (r0 == r5) goto L95
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            L18:
                X.Hwg.A00(r12)
                com.facebook.aura.confidentialvm.model.ConfidentialVmDataTransferProgressViewModel r0 = com.facebook.aura.confidentialvm.model.ConfidentialVmDataTransferProgressViewModel.this
                com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation r0 = r0.operation
                r11.label = r2
                java.lang.Object r12 = r0.resumeIfStarted(r11)
                if (r12 != r4) goto L2b
                return r4
            L28:
                X.Hwg.A00(r12)
            L2b:
                boolean r1 = X.AnonymousClass001.A1X(r12)
                com.facebook.aura.confidentialvm.model.ConfidentialVmDataTransferProgressViewModel r0 = com.facebook.aura.confidentialvm.model.ConfidentialVmDataTransferProgressViewModel.this
                if (r1 == 0) goto L3c
                r0.hasTappedLeave = r7
                com.facebook.aura.confidentialvm.model.ConfidentialVmDataTransferProgressViewModel r1 = com.facebook.aura.confidentialvm.model.ConfidentialVmDataTransferProgressViewModel.this
                r0 = 0
                com.facebook.aura.confidentialvm.model.ConfidentialVmDataTransferProgressViewModel.runMigration$default(r1, r7, r2, r0)
                goto L98
            L3c:
                com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation r0 = r0.operation
                r11.label = r3
                java.lang.Object r12 = r0.clearSavedProgress(r11)
                if (r12 != r4) goto L4a
                return r4
            L47:
                X.Hwg.A00(r12)
            L4a:
                com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation$AfterClear r12 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation.AfterClear) r12
                int r0 = r12.ordinal()
                if (r0 == r2) goto L7f
                if (r0 == r7) goto L86
                if (r0 != r3) goto L7a
                com.facebook.aura.confidentialvm.model.ConfidentialVmDataTransferProgressViewModel r0 = com.facebook.aura.confidentialvm.model.ConfidentialVmDataTransferProgressViewModel.this
                X.BLG<com.facebook.aura.confidentialvm.model.ConfidentialVmDataTransferUiState> r2 = r0._uiState
            L5a:
                java.lang.Object r1 = r2.getValue()
                r4 = r1
                com.facebook.aura.confidentialvm.model.ConfidentialVmDataTransferUiState r4 = (com.facebook.aura.confidentialvm.model.ConfidentialVmDataTransferUiState) r4
                boolean r5 = r4.isFailed
                boolean r6 = r4.canRetry
                java.lang.String r8 = r4.internalErrorDetail
                com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation$ProgressStep r9 = r4.progressStep
                boolean r10 = r4.isAwaitingStart
                boolean r11 = r4.canLeaveApp
                boolean r12 = r4.keepsScreenOn
                com.facebook.aura.confidentialvm.model.ConfidentialVmDataTransferUiState r0 = r4.copy(r5, r6, r7, r8, r9, r10, r11, r12)
                boolean r0 = r2.A6e(r1, r0)
                if (r0 == 0) goto L5a
                goto L98
            L7a:
                kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
                throw r0
            L7f:
                r11.label = r6
                java.lang.Object r0 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchRestartKt.restartIntoSwitchedVm(r11)
                goto L92
            L86:
                com.facebook.aura.confidentialvm.model.ConfidentialVmDataTransferProgressViewModel r0 = com.facebook.aura.confidentialvm.model.ConfidentialVmDataTransferProgressViewModel.this
                X.3Em<com.facebook.aura.confidentialvm.model.ConfidentialVmDataTransferViewEffect> r1 = r0._viewEffects
                com.facebook.aura.confidentialvm.model.ConfidentialVmDataTransferViewEffect$Left r0 = com.facebook.aura.confidentialvm.model.ConfidentialVmDataTransferViewEffect.Left.INSTANCE
                r11.label = r5
                java.lang.Object r0 = r1.emit(r0, r11)
            L92:
                if (r0 != r4) goto L98
                return r4
            L95:
                X.Hwg.A00(r12)
            L98:
                kotlin.Unit r4 = kotlin.Unit.INSTANCE
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.model.ConfidentialVmDataTransferProgressViewModel.C112032.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ConfidentialVmDataTransferProgressViewModel.this.new C112032(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.model.ConfidentialVmDataTransferProgressViewModel$runMigration$1", f = "ConfidentialVmDataTransferProgressViewModel.kt", l = {177, 177, 181}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.model.ConfidentialVmDataTransferProgressViewModel$runMigration$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ boolean $followStartedOnly;
        public Object L$0;
        public int label;
        public final /* synthetic */ ConfidentialVmDataTransferProgressViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, ConfidentialVmDataTransferProgressViewModel confidentialVmDataTransferProgressViewModel, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$followStartedOnly = z;
            this.this$0 = confidentialVmDataTransferProgressViewModel;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$followStartedOnly, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                boolean z = this.$followStartedOnly;
                ConfidentialVmDataTransferOperation confidentialVmDataTransferOperation = this.this$0.operation;
                if (z) {
                    this.label = 1;
                    obj = confidentialVmDataTransferOperation.followStartedTransfer(this);
                } else {
                    this.label = 2;
                    obj = confidentialVmDataTransferOperation.run(this);
                }
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1 && i != 2) {
                    if (i != 3) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    return Unit.INSTANCE;
                }
                Hwg.A00(obj);
            }
            ConfidentialVmDataTransferOperation.Outcome outcome = (ConfidentialVmDataTransferOperation.Outcome) obj;
            if (C7384Etj.areEqual(outcome, ConfidentialVmDataTransferOperation.Outcome.Completed.INSTANCE)) {
                ConfidentialVmAnalytics.INSTANCE.logTransferRunCompleted(this.this$0.direction);
                this.L$0 = null;
                this.label = 3;
                if (ConfidentialVmSwitchRestartKt.restartIntoSwitchedVm(this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (!(outcome instanceof ConfidentialVmDataTransferOperation.Outcome.Failed)) {
                    throw C3cG.A0q();
                }
                ConfidentialVmAnalytics confidentialVmAnalytics = ConfidentialVmAnalytics.INSTANCE;
                ConfidentialVmDataTransferProgressViewModel confidentialVmDataTransferProgressViewModel = this.this$0;
                confidentialVmAnalytics.logTransferRunFailed(confidentialVmDataTransferProgressViewModel.direction, confidentialVmDataTransferProgressViewModel.sessionGate.isConfidentialVm());
                ConfidentialVmDataTransferOperation.Outcome.Failed failed = (ConfidentialVmDataTransferOperation.Outcome.Failed) outcome;
                AnonymousClass001.A1E(this.this$0._uiState, null, new ConfidentialVmDataTransferUiState(true, failed.reason.isRetryable(), false, null, ConfidentialVmDataTransferOperation.ProgressStep.PREPARING, false, false, false));
                ConfidentialVmDataTransferOperation.Progress progress = failed.progress;
                if (progress != null) {
                    this.this$0.operation.clearFailedProgress(progress);
                }
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public ConfidentialVmDataTransferProgressViewModel(ConfidentialVmDataTransferOperation confidentialVmDataTransferOperation, ConfidentialVmSwitchDirection confidentialVmSwitchDirection, ConfidentialSessionGate confidentialSessionGate) {
        boolean zA1Z = AnonymousClass005.A1Z(confidentialVmDataTransferOperation, confidentialVmSwitchDirection, confidentialSessionGate);
        this.operation = confidentialVmDataTransferOperation;
        this.direction = confidentialVmSwitchDirection;
        this.sessionGate = confidentialSessionGate;
        C9286GCn c9286GCnA14 = C3cG.A14(new ConfidentialVmDataTransferUiState(false, false, false, null, ConfidentialVmDataTransferOperation.ProgressStep.PREPARING, false, false, false));
        this._uiState = c9286GCnA14;
        C60I c60iA03 = C3rb.A03(new ConfidentialVmDataTransferProgressViewModel$uiState$1(this), c9286GCnA14, confidentialVmDataTransferOperation.getProgress());
        this.uiState = AnonymousClass441.A00(withOperationState((ConfidentialVmDataTransferUiState) c9286GCnA14.getValue(), confidentialVmDataTransferOperation.getProgress().getValue()), AEu.A00(this), c60iA03, C3Ek.A00);
        C9290GCr c9290GCrA12 = C3cG.A12(C79.A00, 0, zA1Z ? 1 : 0);
        this._viewEffects = c9290GCrA12;
        this.viewEffects = C3pd.A00(c9290GCrA12);
        runMigration(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void runMigration(boolean z) {
        AnonymousClass001.A1E(this._uiState, null, new ConfidentialVmDataTransferUiState(false, false, false, null, ConfidentialVmDataTransferOperation.ProgressStep.PREPARING, false, false, false));
        ConfidentialVmAnalytics.INSTANCE.logTransferRunStarted(this.direction);
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new AnonymousClass1(z, this, null), AEu.A00(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0027 A[PHI: r7
  0x0027: PHI (r7v2 boolean) = (r7v0 boolean), (r7v0 boolean), (r7v0 boolean), (r7v3 boolean) binds: [B:12:0x001e, B:13:0x0020, B:15:0x0025, B:10:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.confidentialvm.model.ConfidentialVmDataTransferUiState withOperationState(com.facebook.aura.confidentialvm.model.ConfidentialVmDataTransferUiState r9, com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation.Progress r10) {
        /*
            r8 = this;
            com.facebook.aura.navigation.key.ConfidentialVmSwitchDirection r1 = r8.direction
            com.facebook.aura.navigation.key.ConfidentialVmSwitchDirection r0 = com.facebook.aura.navigation.key.ConfidentialVmSwitchDirection.TO_CONFIDENTIAL_VM
            boolean r2 = X.AnonymousClass002.A1Z(r1, r0)
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation$ProgressStep r6 = r10.step
            boolean r0 = r10.isTransferStarted
            if (r0 == 0) goto L13
            boolean r0 = r10.isWaitingOnLockedDestination
            r1 = 0
            if (r0 == 0) goto L14
        L13:
            r1 = 1
        L14:
            if (r2 == 0) goto L1d
            if (r1 == 0) goto L1d
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation$ProgressStep r0 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation.ProgressStep.PREPARING
            r7 = 1
            if (r6 == r0) goto L27
        L1d:
            r7 = 0
            if (r2 == 0) goto L27
            if (r1 != 0) goto L27
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation$ProgressStep r0 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation.ProgressStep.PREPARING
            r8 = 1
            if (r6 == r0) goto L28
        L27:
            r8 = 0
        L28:
            r1 = r9
            boolean r2 = r9.isFailed
            if (r2 != 0) goto L32
            com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation$ProgressStep r0 = com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation.ProgressStep.SWITCHING
            r9 = 1
            if (r6 == r0) goto L33
        L32:
            r9 = 0
        L33:
            boolean r3 = r1.canRetry
            boolean r4 = r1.isLeaving
            java.lang.String r5 = r1.internalErrorDetail
            com.facebook.aura.confidentialvm.model.ConfidentialVmDataTransferUiState r0 = r1.copy(r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.model.ConfidentialVmDataTransferProgressViewModel.withOperationState(com.facebook.aura.confidentialvm.model.ConfidentialVmDataTransferUiState, com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmDataTransferOperation$Progress):com.facebook.aura.confidentialvm.model.ConfidentialVmDataTransferUiState");
    }

    public final Object collectUpgradePushRetries(HtJ<? super Unit> htJ) {
        return C3cG.A0U(this.operation.getRetryRequests().collect(new C20Z() { // from class: com.facebook.aura.confidentialvm.model.ConfidentialVmDataTransferProgressViewModel.collectUpgradePushRetries.2
            @Override // X.C20Z
            public /* bridge */ /* synthetic */ Object emit(Object obj, HtJ htJ2) {
                return emit((Unit) obj, (HtJ<? super Unit>) htJ2);
            }

            public final Object emit(Unit unit, HtJ<? super Unit> htJ2) {
                ConfidentialVmDataTransferUiState value = ConfidentialVmDataTransferProgressViewModel.this._uiState.getValue();
                if (value.isFailed && value.canRetry && !value.isLeaving && !ConfidentialVmDataTransferProgressViewModel.this.hasTappedLeave) {
                    ConfidentialVmAnalytics.INSTANCE.logUpgradePushRetry();
                    ConfidentialVmDataTransferProgressViewModel.this.runMigration(true);
                }
                return Unit.INSTANCE;
            }
        }, htJ));
    }

    public final C1BN<ConfidentialVmDataTransferUiState> getUiState() {
        return this.uiState;
    }

    public final C22I<ConfidentialVmDataTransferViewEffect> getViewEffects() {
        return this.viewEffects;
    }

    public final void onLeave() {
        ConfidentialVmDataTransferUiState value;
        ConfidentialVmDataTransferUiState confidentialVmDataTransferUiState;
        if (!this._uiState.getValue().isFailed || this._uiState.getValue().isLeaving) {
            return;
        }
        this.hasTappedLeave = true;
        ConfidentialVmAnalytics.INSTANCE.logSwitchTap(HatchScreen.CVM_TRANSFER_PROGRESS, this._uiState.getValue().canRetry ? HatchComponent.CANCEL_BUTTON : HatchComponent.CLOSE_BUTTON, null, this.direction, null);
        BLG<ConfidentialVmDataTransferUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            confidentialVmDataTransferUiState = value;
        } while (!blg.A6e(value, confidentialVmDataTransferUiState.copy(confidentialVmDataTransferUiState.isFailed, confidentialVmDataTransferUiState.canRetry, true, confidentialVmDataTransferUiState.internalErrorDetail, confidentialVmDataTransferUiState.progressStep, confidentialVmDataTransferUiState.isAwaitingStart, confidentialVmDataTransferUiState.canLeaveApp, confidentialVmDataTransferUiState.keepsScreenOn)));
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C112032(null), AEu.A00(this));
    }

    public final void onLogOutClick() {
        AuraLogoutHelper auraLogoutHelper = AuraLogoutHelper.INSTANCE;
        if (C3cH.A1R(AuraLogoutHelper.isLoggingOut)) {
            return;
        }
        ConfidentialVmAnalytics confidentialVmAnalytics = ConfidentialVmAnalytics.INSTANCE;
        HatchClientCvmEventLogger.INSTANCE.logLogoutClick();
        confidentialVmAnalytics.logMenuTap(HatchScreen.CVM_TRANSFER_PROGRESS, HatchComponent.LOGOUT_BUTTON, this.direction);
        this.operation.clearUserData();
        auraLogoutHelper.performLogout();
    }

    public final void onMenuClick() {
        ConfidentialVmAnalytics.INSTANCE.logMenuOpen(HatchScreen.CVM_TRANSFER_PROGRESS, this.direction);
    }

    public final void onReportIssueClick() {
        ConfidentialVmAnalytics confidentialVmAnalytics = ConfidentialVmAnalytics.INSTANCE;
        confidentialVmAnalytics.logCvmHelpTap();
        confidentialVmAnalytics.logMenuTap(HatchScreen.CVM_TRANSFER_PROGRESS, HatchComponent.REPORT_PROBLEM_BUTTON, this.direction);
    }

    public final void onShown(boolean z) {
        Boolean bool = this.loggedFailed;
        Boolean boolValueOf = Boolean.valueOf(z);
        if (boolValueOf.equals(bool)) {
            return;
        }
        this.loggedFailed = boolValueOf;
        ConfidentialVmAnalytics.INSTANCE.logProgressShown(HatchScreen.CVM_TRANSFER_PROGRESS, z, this.direction);
    }

    public final void onTryAgain() {
        if (this._uiState.getValue().isFailed && this._uiState.getValue().canRetry) {
            this.hasTappedLeave = false;
            runMigration(false);
        }
    }

    public static /* synthetic */ void runMigration$default(ConfidentialVmDataTransferProgressViewModel confidentialVmDataTransferProgressViewModel, boolean z, int i, Object obj) {
        confidentialVmDataTransferProgressViewModel.runMigration(AnonymousClass001.A1P(i, z));
    }
}
