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
import X.C1BN;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.analytics.hatch.HatchClientCvmEventLogger;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchOperation;
import com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmSwitchRestartKt;
import com.facebook.aura.gateway.HatchlingVmType;
import com.facebook.aura.logout.AuraLogoutHelper;
import com.facebook.aura.navigation.key.ConfidentialVmSwitchDirection;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class ConfidentialVmSwitchProgressViewModel extends AEs {
    public static final int $stable = 8;
    public final BLG<Boolean> _isFailed;
    public final BLG<Boolean> _isRefused;
    public final ConfidentialVmSwitchDirection direction;
    public final C1BN<Boolean> isFailed;
    public final C1BN<Boolean> isRefused;
    public Boolean loggedFailed;
    public final ConfidentialVmSwitchOperation operation;

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchProgressViewModel$1", f = "ConfidentialVmSwitchProgressViewModel.kt", l = {40, 40}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchProgressViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0U<HtJ<? super ConfidentialVmSwitchOperation.Outcome>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(1, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return ConfidentialVmSwitchProgressViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super ConfidentialVmSwitchOperation.Outcome> htJ) {
            return ConfidentialVmSwitchProgressViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                ConfidentialVmSwitchOperation confidentialVmSwitchOperation = ConfidentialVmSwitchProgressViewModel.this.operation;
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
                    return obj;
                }
                Hwg.A00(obj);
            }
            if (obj == null) {
                ConfidentialVmSwitchProgressViewModel confidentialVmSwitchProgressViewModel = ConfidentialVmSwitchProgressViewModel.this;
                ConfidentialVmSwitchOperation confidentialVmSwitchOperation2 = confidentialVmSwitchProgressViewModel.operation;
                HatchlingVmType targetVmType = ConfidentialVmSwitchProgressViewModelKt.getTargetVmType(confidentialVmSwitchProgressViewModel.direction);
                this.label = 2;
                obj = confidentialVmSwitchOperation2.switchTo(targetVmType, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            return obj;
        }
    }

    public final class Factory extends AuraViewModelFactory<ConfidentialVmSwitchProgressViewModel> {
        public static final int $stable = 8;
        public final ConfidentialVmSwitchDirection direction;
        public final AbstractC3358CGz userSession;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public ConfidentialVmSwitchProgressViewModel create() {
            return new ConfidentialVmSwitchProgressViewModel(this.userSession, this.direction);
        }

        public Factory(AbstractC3358CGz abstractC3358CGz, ConfidentialVmSwitchDirection confidentialVmSwitchDirection) {
            AnonymousClass003.A0u(abstractC3358CGz, confidentialVmSwitchDirection);
            this.userSession = abstractC3358CGz;
            this.direction = confidentialVmSwitchDirection;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchProgressViewModel$onTryAgain$1", f = "ConfidentialVmSwitchProgressViewModel.kt", l = {88, 88}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchProgressViewModel$onTryAgain$1, reason: invalid class name and case insensitive filesystem */
    public final class C112101 extends AbstractC07127nr implements G0U<HtJ<? super ConfidentialVmSwitchOperation.Outcome>, Object> {
        public int label;

        public C112101(HtJ<? super C112101> htJ) {
            super(1, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return ConfidentialVmSwitchProgressViewModel.this.new C112101(htJ);
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super ConfidentialVmSwitchOperation.Outcome> htJ) {
            return ConfidentialVmSwitchProgressViewModel.this.new C112101(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                ConfidentialVmSwitchOperation confidentialVmSwitchOperation = ConfidentialVmSwitchProgressViewModel.this.operation;
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
                    return obj;
                }
                Hwg.A00(obj);
            }
            if (obj == null) {
                ConfidentialVmSwitchProgressViewModel confidentialVmSwitchProgressViewModel = ConfidentialVmSwitchProgressViewModel.this;
                ConfidentialVmSwitchOperation confidentialVmSwitchOperation2 = confidentialVmSwitchProgressViewModel.operation;
                HatchlingVmType targetVmType = ConfidentialVmSwitchProgressViewModelKt.getTargetVmType(confidentialVmSwitchProgressViewModel.direction);
                this.label = 2;
                obj = confidentialVmSwitchOperation2.switchTo(targetVmType, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            return obj;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchProgressViewModel$runSwitch$1", f = "ConfidentialVmSwitchProgressViewModel.kt", l = {103, 106}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.model.ConfidentialVmSwitchProgressViewModel$runSwitch$1, reason: invalid class name and case insensitive filesystem */
    public final class C112111 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ G0U<HtJ<? super ConfidentialVmSwitchOperation.Outcome>, Object> $switch;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C112111(G0U<? super HtJ<? super ConfidentialVmSwitchOperation.Outcome>, ? extends Object> g0u, HtJ<? super C112111> htJ) {
            super(2, htJ);
            this.$switch = g0u;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConfidentialVmSwitchProgressViewModel.this.new C112111(this.$switch, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                ConfidentialVmAnalytics.INSTANCE.logStartFreshRunStarted(ConfidentialVmSwitchProgressViewModel.this.direction);
                G0U<HtJ<? super ConfidentialVmSwitchOperation.Outcome>, Object> g0u = this.$switch;
                this.label = 1;
                obj = g0u.invoke(this);
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
                Hwg.A00(obj);
            }
            ConfidentialVmSwitchOperation.Outcome outcome = (ConfidentialVmSwitchOperation.Outcome) obj;
            if (outcome instanceof ConfidentialVmSwitchOperation.Outcome.Switched) {
                ConfidentialVmAnalytics.INSTANCE.logStartFreshRunCompleted(ConfidentialVmSwitchProgressViewModel.this.direction);
                this.L$0 = null;
                this.label = 2;
                if (ConfidentialVmSwitchRestartKt.restartIntoSwitchedVm(this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (!(outcome instanceof ConfidentialVmSwitchOperation.Outcome.Failed)) {
                    throw C3cG.A0q();
                }
                boolean zA1Z = AnonymousClass002.A1Z(((ConfidentialVmSwitchOperation.Outcome.Failed) outcome).reason, ConfidentialVmSwitchOperation.FailureReason.REPLACE_REFUSED);
                ConfidentialVmAnalytics.INSTANCE.logStartFreshRunFailed(ConfidentialVmSwitchProgressViewModel.this.direction, zA1Z);
                C3cJ.A0C(ConfidentialVmSwitchProgressViewModel.this._isRefused, zA1Z);
                AnonymousClass003.A14(ConfidentialVmSwitchProgressViewModel.this._isFailed, true);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C112111) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final C1BN<Boolean> isFailed() {
        return this.isFailed;
    }

    public final C1BN<Boolean> isRefused() {
        return this.isRefused;
    }

    public final void onLeave() {
        ConfidentialVmAnalytics.INSTANCE.logSwitchTap(HatchScreen.CVM_SWITCH_PROGRESS, HatchComponent.CANCEL_BUTTON, null, this.direction, null);
    }

    public final void onLogOutClick() {
        AuraLogoutHelper auraLogoutHelper = AuraLogoutHelper.INSTANCE;
        if (C3cH.A1R(AuraLogoutHelper.isLoggingOut)) {
            return;
        }
        ConfidentialVmAnalytics confidentialVmAnalytics = ConfidentialVmAnalytics.INSTANCE;
        HatchClientCvmEventLogger.INSTANCE.logLogoutClick();
        confidentialVmAnalytics.logMenuTap(HatchScreen.CVM_SWITCH_PROGRESS, HatchComponent.LOGOUT_BUTTON, this.direction);
        this.operation.clearUserData();
        auraLogoutHelper.performLogout();
    }

    public final void onMenuClick() {
        ConfidentialVmAnalytics.INSTANCE.logMenuOpen(HatchScreen.CVM_SWITCH_PROGRESS, this.direction);
    }

    public final void onReportIssueClick() {
        ConfidentialVmAnalytics confidentialVmAnalytics = ConfidentialVmAnalytics.INSTANCE;
        confidentialVmAnalytics.logCvmHelpTap();
        confidentialVmAnalytics.logMenuTap(HatchScreen.CVM_SWITCH_PROGRESS, HatchComponent.REPORT_PROBLEM_BUTTON, this.direction);
    }

    public final void onShown(boolean z) {
        Boolean bool = this.loggedFailed;
        Boolean boolValueOf = Boolean.valueOf(z);
        if (boolValueOf.equals(bool)) {
            return;
        }
        this.loggedFailed = boolValueOf;
        ConfidentialVmAnalytics.INSTANCE.logProgressShown(HatchScreen.CVM_SWITCH_PROGRESS, z, this.direction);
    }

    public final void onTryAgain() {
        if (AnonymousClass003.A1Z(this._isFailed)) {
            BLG<Boolean> blg = this._isFailed;
            Boolean boolA0h = AnonymousClass001.A0h();
            HtJ htJA14 = C3cI.A14(blg, boolA0h);
            AnonymousClass001.A1E(this._isRefused, htJA14, boolA0h);
            runSwitch(new C112101(htJA14));
        }
    }

    public ConfidentialVmSwitchProgressViewModel(AbstractC3358CGz abstractC3358CGz, ConfidentialVmSwitchDirection confidentialVmSwitchDirection) {
        boolean zA1b = AnonymousClass004.A1b(abstractC3358CGz, confidentialVmSwitchDirection);
        this.direction = confidentialVmSwitchDirection;
        this.operation = ConfidentialVmSwitchOperation.Companion.getInstance(abstractC3358CGz);
        Boolean boolValueOf = Boolean.valueOf(zA1b);
        C9286GCn c9286GCnA14 = C3cG.A14(boolValueOf);
        this._isFailed = c9286GCnA14;
        this.isFailed = C3cG.A11(c9286GCnA14);
        C9286GCn c9286GCnA142 = C3cG.A14(boolValueOf);
        this._isRefused = c9286GCnA142;
        this.isRefused = C3cG.A11(c9286GCnA142);
        runSwitch(new AnonymousClass1(null));
    }

    private final void runSwitch(G0U<? super HtJ<? super ConfidentialVmSwitchOperation.Outcome>, ? extends Object> g0u) {
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C112111(g0u, null), AEu.A00(this));
    }
}
