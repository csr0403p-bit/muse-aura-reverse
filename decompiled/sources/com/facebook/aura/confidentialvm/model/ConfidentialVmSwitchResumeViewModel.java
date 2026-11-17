package com.facebook.aura.confidentialvm.model;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.BLG;
import X.BLL;
import X.C1BN;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3rb;
import X.C7384Etj;
import X.C78T;
import X.C79;
import X.C9286GCn;
import X.CH0;
import X.EnumC10460Hji;
import X.G0V;
import X.G0W;
import X.GAo;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.analytics.hatch.HatchClientCvmEventLogger;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation;
import com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchRestartKt;
import com.facebook.aura.executors.AuraDispatchers;
import com.facebook.aura.gateway.HatchlingVmType;
import com.facebook.aura.gateway.store.HatchVmTypeSwitchCheckpointStore;
import com.facebook.aura.installsource.AuraInstallSourceDetector;
import com.facebook.aura.logout.AuraLogoutHelper;
import com.facebook.aura.navigation.key.ConfidentialVmSwitchDirection;
import com.facebook.aura.navigation.key.ConfidentialVmSwitchResumeOverlayScreenKey;
import com.facebook.aura.overlay.api.OverlayApi;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class ConfidentialVmSwitchResumeViewModel extends AEs {
    public static final int $stable = 8;
    public final BLG<ConfidentialVmSwitchDirection> _direction;
    public final BLG<Boolean> _isFailed;
    public final BLG<Boolean> _isRefused;
    public final HatchVmTypeSwitchCheckpointStore checkpointStore;
    public final C1BN<ConfidentialVmSwitchDirection> direction;
    public final C1BN<Boolean> isFailed;
    public final C1BN<Boolean> isRefused;
    public final BLG<Boolean> isSuppressed;
    public Boolean loggedFailed;
    public final ConfidentialVmSwitchOperation operation;
    public final OverlayApi overlayApi;
    public final AbstractC3358CGz userSession;
    public final BLG<Boolean> wantsOverlay;

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchResumeViewModel$1", f = "ConfidentialVmSwitchResumeViewModel.kt", l = {52}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchResumeViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        @DebugMetadata(c = "com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchResumeViewModel$1$1", f = "ConfidentialVmSwitchResumeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchResumeViewModel$1$1, reason: invalid class name and collision with other inner class name */
        public final class C00841 extends AbstractC07127nr implements G0W<Boolean, Boolean, HtJ<? super Boolean>, Object> {
            public /* synthetic */ boolean Z$0;
            public /* synthetic */ boolean Z$1;
            public int label;

            public C00841(HtJ<? super C00841> htJ) {
                super(3, htJ);
            }

            public final Object invoke(boolean z, boolean z2, HtJ<? super Boolean> htJ) {
                C00841 c00841 = new C00841(htJ);
                c00841.Z$0 = z;
                c00841.Z$1 = z2;
                return c00841.invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:8:0x0010  */
            @Override // X.AbstractC8884Fsp
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r4) {
                /*
                    r3 = this;
                    boolean r2 = r3.Z$0
                    boolean r1 = r3.Z$1
                    int r0 = r3.label
                    if (r0 != 0) goto L16
                    X.Hwg.A00(r4)
                    if (r2 == 0) goto L10
                    r0 = 1
                    if (r1 == 0) goto L11
                L10:
                    r0 = 0
                L11:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                    return r0
                L16:
                    java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchResumeViewModel.AnonymousClass1.C00841.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // X.G0W
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, HtJ<? super Boolean> htJ) {
                return invoke(AnonymousClass001.A1X(bool), AnonymousClass001.A1X(bool2), htJ);
            }
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConfidentialVmSwitchResumeViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                ConfidentialVmSwitchResumeViewModel confidentialVmSwitchResumeViewModel = ConfidentialVmSwitchResumeViewModel.this;
                C20Q c20qA04 = C3rb.A04(new C00841(null), confidentialVmSwitchResumeViewModel.wantsOverlay, confidentialVmSwitchResumeViewModel.isSuppressed);
                final ConfidentialVmSwitchResumeViewModel confidentialVmSwitchResumeViewModel2 = ConfidentialVmSwitchResumeViewModel.this;
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchResumeViewModel.1.2
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit(AnonymousClass001.A1X(obj2), (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                        OverlayApi overlayApi = confidentialVmSwitchResumeViewModel2.overlayApi;
                        ConfidentialVmSwitchResumeOverlayScreenKey confidentialVmSwitchResumeOverlayScreenKey = ConfidentialVmSwitchResumeOverlayScreenKey.INSTANCE;
                        if (z) {
                            overlayApi.showOverlay(confidentialVmSwitchResumeOverlayScreenKey);
                        } else {
                            overlayApi.hideOverlay(confidentialVmSwitchResumeOverlayScreenKey);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (c20qA04.collect(c20z, this) == enumC10460Hji) {
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
            return ConfidentialVmSwitchResumeViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchResumeViewModel$2", f = "ConfidentialVmSwitchResumeViewModel.kt", l = {69, 69}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchResumeViewModel$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public Object L$1;
        public int label;

        /* renamed from: com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchResumeViewModel$2$WhenMappings */
        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[HatchlingVmType.values().length];
                try {
                    AnonymousClass002.A13(HatchlingVmType.HATCH_CVM, iArr);
                } catch (NoSuchFieldError unused) {
                }
                try {
                    AnonymousClass002.A14(HatchlingVmType.HATCH_VM, iArr);
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConfidentialVmSwitchResumeViewModel.this.new AnonymousClass2(htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0074 A[RETURN] */
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
                r4 = 2
                r6 = 0
                r5 = 1
                if (r0 == 0) goto L13
                if (r0 == r5) goto L5e
                if (r0 != r4) goto L75
                X.Hwg.A00(r8)
            L10:
                kotlin.Unit r3 = kotlin.Unit.INSTANCE
                return r3
            L13:
                X.Hwg.A00(r8)
                com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchResumeViewModel r0 = com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchResumeViewModel.this
                com.facebook.aura.gateway.store.HatchVmTypeSwitchCheckpointStore r0 = r0.checkpointStore
                com.facebook.aura.gateway.store.HatchVmTypeSwitchCheckpoint r2 = r0.read()
                if (r2 == 0) goto L10
                com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchResumeViewModel r0 = com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchResumeViewModel.this
                X.BLG<com.facebook.aura.navigation.key.ConfidentialVmSwitchDirection> r1 = r0._direction
                com.facebook.aura.gateway.HatchlingVmType r0 = r2.targetVmType
                int r0 = r0.ordinal()
                if (r0 == r5) goto L5b
                if (r0 != r6) goto L7a
                com.facebook.aura.navigation.key.ConfidentialVmSwitchDirection r0 = com.facebook.aura.navigation.key.ConfidentialVmSwitchDirection.TO_SECURE_VM
            L30:
                java.lang.Object r2 = X.C3cG.A0V(r1, r0)
                com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchResumeViewModel r0 = com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchResumeViewModel.this
                X.BLG<java.lang.Boolean> r0 = r0.wantsOverlay
                X.AnonymousClass003.A14(r0, r5)
                com.facebook.aura.confidentialvm.model.ConfidentialVmAnalytics r1 = com.facebook.aura.confidentialvm.model.ConfidentialVmAnalytics.INSTANCE
                com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchResumeViewModel r0 = com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchResumeViewModel.this
                X.BLG<com.facebook.aura.navigation.key.ConfidentialVmSwitchDirection> r0 = r0._direction
                java.lang.Object r0 = r0.getValue()
                com.facebook.aura.navigation.key.ConfidentialVmSwitchDirection r0 = (com.facebook.aura.navigation.key.ConfidentialVmSwitchDirection) r0
                r1.logStartFreshRunStarted(r0)
                com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchResumeViewModel r1 = com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchResumeViewModel.this
                com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation r0 = r1.operation
                r7.L$0 = r2
                r7.L$1 = r1
                r7.label = r5
                java.lang.Object r8 = r0.resume(r7)
                if (r8 != r3) goto L65
                return r3
            L5b:
                com.facebook.aura.navigation.key.ConfidentialVmSwitchDirection r0 = com.facebook.aura.navigation.key.ConfidentialVmSwitchDirection.TO_CONFIDENTIAL_VM
                goto L30
            L5e:
                java.lang.Object r1 = r7.L$1
                com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchResumeViewModel r1 = (com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchResumeViewModel) r1
                X.Hwg.A00(r8)
            L65:
                com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation$Outcome r8 = (com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation.Outcome) r8
                r0 = 0
                r7.L$0 = r0
                r7.L$1 = r0
                r7.label = r4
                java.lang.Object r0 = com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchResumeViewModel.access$handle(r1, r8, r7)
                if (r0 != r3) goto L10
                return r3
            L75:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            L7a:
                kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchResumeViewModel.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ConfidentialVmSwitchResumeViewModel.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final class Factory extends AuraViewModelFactory<ConfidentialVmSwitchResumeViewModel> {
        public static final int $stable = 8;
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public /* bridge */ /* synthetic */ AEs create() {
            return new ConfidentialVmSwitchResumeViewModel(this.userSession);
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public ConfidentialVmSwitchResumeViewModel create() {
            return new ConfidentialVmSwitchResumeViewModel(this.userSession);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchResumeViewModel$onTryAgain$1", f = "ConfidentialVmSwitchResumeViewModel.kt", l = {AuraInstallSourceDetector.SYSTEM_IMAGE_FLAGS, AuraInstallSourceDetector.SYSTEM_IMAGE_FLAGS}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchResumeViewModel$onTryAgain$1, reason: invalid class name and case insensitive filesystem */
    public final class C112121 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public int label;

        public C112121(HtJ<? super C112121> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConfidentialVmSwitchResumeViewModel.this.new C112121(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            ConfidentialVmSwitchResumeViewModel confidentialVmSwitchResumeViewModel;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                if (ConfidentialVmSwitchResumeViewModel.this.checkpointStore.read() != null) {
                    ConfidentialVmAnalytics.INSTANCE.logStartFreshRunStarted(ConfidentialVmSwitchResumeViewModel.this._direction.getValue());
                }
                confidentialVmSwitchResumeViewModel = ConfidentialVmSwitchResumeViewModel.this;
                ConfidentialVmSwitchOperation confidentialVmSwitchOperation = confidentialVmSwitchResumeViewModel.operation;
                this.L$0 = confidentialVmSwitchResumeViewModel;
                this.label = 1;
                obj = confidentialVmSwitchOperation.resume(this);
                if (obj == enumC10460Hji) {
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
                confidentialVmSwitchResumeViewModel = (ConfidentialVmSwitchResumeViewModel) this.L$0;
                Hwg.A00(obj);
            }
            this.L$0 = null;
            this.label = 2;
            if (confidentialVmSwitchResumeViewModel.handle((ConfidentialVmSwitchOperation.Outcome) obj, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ConfidentialVmSwitchResumeViewModel.this.new C112121(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public ConfidentialVmSwitchResumeViewModel(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.userSession = abstractC3358CGz;
        this.operation = ConfidentialVmSwitchOperation.Companion.getInstance(abstractC3358CGz);
        this.checkpointStore = new HatchVmTypeSwitchCheckpointStore(((CH0) abstractC3358CGz).A01);
        this.overlayApi = OverlayApi.Companion.getInstance(abstractC3358CGz);
        this.wantsOverlay = C3cG.A14(false);
        this.isSuppressed = C3cG.A14(false);
        C9286GCn c9286GCnA14 = C3cG.A14(false);
        this._isFailed = c9286GCnA14;
        this.isFailed = C3cG.A11(c9286GCnA14);
        C9286GCn c9286GCnA142 = C3cG.A14(false);
        this._isRefused = c9286GCnA142;
        this.isRefused = C3cG.A11(c9286GCnA142);
        C9286GCn c9286GCnA143 = C3cG.A14(ConfidentialVmSwitchDirection.TO_CONFIDENTIAL_VM);
        this._direction = c9286GCnA143;
        this.direction = C3cG.A11(c9286GCnA143);
        BLL bllA00 = AEu.A00(this);
        AuraDispatchers auraDispatchers = AuraDispatchers.INSTANCE;
        C78T c78tM764default = auraDispatchers.m764default();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
        Integer num = C79.A00;
        GAo.A02(num, auraDispatchers.io(), new AnonymousClass2(null), AnonymousClass001.A0e(this, num, c78tM764default, anonymousClass1, bllA00));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handle(ConfidentialVmSwitchOperation.Outcome outcome, HtJ<? super Unit> htJ) {
        BLG<Boolean> blg;
        if (outcome == null) {
            blg = this.wantsOverlay;
        } else {
            if (outcome instanceof ConfidentialVmSwitchOperation.Outcome.Switched) {
                ConfidentialVmAnalytics.INSTANCE.logStartFreshRunCompleted(this._direction.getValue());
                Object objRestartIntoSwitchedVm = ConfidentialVmSwitchRestartKt.restartIntoSwitchedVm(htJ);
                if (objRestartIntoSwitchedVm == EnumC10460Hji.A02) {
                    return objRestartIntoSwitchedVm;
                }
                return Unit.INSTANCE;
            }
            if (!(outcome instanceof ConfidentialVmSwitchOperation.Outcome.Failed)) {
                throw C3cG.A0q();
            }
            z = ((ConfidentialVmSwitchOperation.Outcome.Failed) outcome).reason == ConfidentialVmSwitchOperation.FailureReason.REPLACE_REFUSED;
            ConfidentialVmAnalytics.INSTANCE.logStartFreshRunFailed(this._direction.getValue(), z);
            AnonymousClass004.A1D(z, this._isRefused);
            blg = this._isFailed;
            z = true;
        }
        AnonymousClass004.A1D(z, blg);
        return Unit.INSTANCE;
    }

    public final C1BN<ConfidentialVmSwitchDirection> getDirection() {
        return this.direction;
    }

    public final C1BN<Boolean> isFailed() {
        return this.isFailed;
    }

    public final C1BN<Boolean> isRefused() {
        return this.isRefused;
    }

    public final void onLeave() {
        AnonymousClass004.A1D(false, this.wantsOverlay);
    }

    public final void onLogOutClick() {
        AuraLogoutHelper auraLogoutHelper = AuraLogoutHelper.INSTANCE;
        if (C3cH.A1R(AuraLogoutHelper.isLoggingOut)) {
            return;
        }
        ConfidentialVmAnalytics confidentialVmAnalytics = ConfidentialVmAnalytics.INSTANCE;
        HatchClientCvmEventLogger.INSTANCE.logLogoutClick();
        confidentialVmAnalytics.logMenuTap(HatchScreen.CVM_SWITCH_PROGRESS, HatchComponent.LOGOUT_BUTTON, this._direction.getValue());
        this.operation.clearUserData();
        auraLogoutHelper.performLogout();
    }

    public final void onMenuClick() {
        ConfidentialVmAnalytics.INSTANCE.logMenuOpen(HatchScreen.CVM_SWITCH_PROGRESS, this._direction.getValue());
    }

    public final void onReportIssueClick() {
        ConfidentialVmAnalytics confidentialVmAnalytics = ConfidentialVmAnalytics.INSTANCE;
        confidentialVmAnalytics.logCvmHelpTap();
        confidentialVmAnalytics.logMenuTap(HatchScreen.CVM_SWITCH_PROGRESS, HatchComponent.REPORT_PROBLEM_BUTTON, this._direction.getValue());
    }

    public final void onShown(boolean z) {
        Boolean bool = this.loggedFailed;
        Boolean boolValueOf = Boolean.valueOf(z);
        if (boolValueOf.equals(bool)) {
            return;
        }
        this.loggedFailed = boolValueOf;
        ConfidentialVmAnalytics.INSTANCE.logProgressShown(HatchScreen.CVM_SWITCH_PROGRESS, z, this._direction.getValue());
    }

    public final void onSuppressionChanged(boolean z) {
        AnonymousClass004.A1D(z, this.isSuppressed);
    }

    public final void onTryAgain() {
        if (AnonymousClass003.A1Z(this._isFailed)) {
            HtJ htJA14 = C3cI.A14(this._isFailed, AnonymousClass001.A0h());
            AnonymousClass001.A1I(AnonymousClass001.A0y(), new C112121(htJA14), AEu.A00(this));
        }
    }
}
