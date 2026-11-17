package com.facebook.aura.messenger.skills.read.viewmodel;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.BLG;
import X.C06H;
import X.C1BN;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0V;
import X.HnJ;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import com.facebook.aura.analytics.hatch.HatchSkillOAuthOrigin;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.messenger.skills.read.repo.MessengerReadSkillRepository;
import com.facebook.aura.messenger.skills.read.repo.PinUnlockResult;
import com.facebook.aura.messenger.skills.read.viewmodel.MessengerPinState;
import com.facebook.aura.messenger.utils.MessengerLauncherKt;
import com.facebook.aura.navigation.key.MessengerPinLockoutReason;
import com.facebook.aura.perf.HatchConnectorQplLogger;
import com.facebook.aura.skills.repo.HatchConnectorCatalogRepository;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class MessengerConnectorViewModel extends AEs {
    public static final Companion Companion = new Companion();
    public static final int MAX_FAILED_ATTEMPTS = 3;
    public final BLG<MessengerPinState> _pinState;
    public final BLG<Boolean> _showTroubleshooting;
    public final String connectorId;
    public final HatchConnectorCatalogRepository connectorRepository;
    public int failedAttempts;
    public final HatchSkillOAuthOrigin origin;
    public final C1BN<MessengerPinState> pinState;
    public final MessengerReadSkillRepository repository;
    public final C1BN<Boolean> showTroubleshooting;
    public final AbstractC3358CGz userSession;

    public final class Factory extends AuraViewModelFactory<MessengerConnectorViewModel> {
        public final String connectorId;
        public final HatchSkillOAuthOrigin origin;
        public final AbstractC3358CGz userSession;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public MessengerConnectorViewModel create() {
            return new MessengerConnectorViewModel(this.userSession, this.connectorId, this.origin, new MessengerReadSkillRepository());
        }

        public Factory(AbstractC3358CGz abstractC3358CGz, String str, HatchSkillOAuthOrigin hatchSkillOAuthOrigin) {
            AnonymousClass005.A0x(abstractC3358CGz, str, hatchSkillOAuthOrigin);
            this.userSession = abstractC3358CGz;
            this.connectorId = str;
            this.origin = hatchSkillOAuthOrigin;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.messenger.skills.read.viewmodel.MessengerConnectorViewModel$checkPinStatus$1", f = "MessengerConnectorViewModel.kt", l = {LinkEncryptedPairingKt.LINK_PUBLIC_KEY_SIZE}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.messenger.skills.read.viewmodel.MessengerConnectorViewModel$checkPinStatus$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return MessengerConnectorViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return MessengerConnectorViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            BLG<MessengerPinState> blg;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                MessengerConnectorViewModel messengerConnectorViewModel = MessengerConnectorViewModel.this;
                blg = messengerConnectorViewModel._pinState;
                MessengerReadSkillRepository messengerReadSkillRepository = messengerConnectorViewModel.repository;
                AbstractC3358CGz abstractC3358CGz = messengerConnectorViewModel.userSession;
                this.L$0 = blg;
                this.label = 1;
                obj = messengerReadSkillRepository.getPinStatus(abstractC3358CGz, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                blg = (BLG) this.L$0;
                Hwg.A00(obj);
            }
            blg.Af8(C3cG.A1P(obj, false) ? new MessengerPinState.LockedOut(MessengerPinLockoutReason.NO_PIN) : MessengerPinState.Idle.INSTANCE);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.messenger.skills.read.viewmodel.MessengerConnectorViewModel$submitPin$1", f = "MessengerConnectorViewModel.kt", l = {82}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.messenger.skills.read.viewmodel.MessengerConnectorViewModel$submitPin$1, reason: invalid class name and case insensitive filesystem */
    public final class C126901 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $pin;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126901(String str, HtJ<? super C126901> htJ) {
            super(2, htJ);
            this.$pin = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return MessengerConnectorViewModel.this.new C126901(this.$pin, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            BLG<MessengerPinState> blg;
            MessengerPinState messengerPinState;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                MessengerConnectorViewModel.this._pinState.Af8(MessengerPinState.Verifying.INSTANCE);
                MessengerConnectorViewModel messengerConnectorViewModel = MessengerConnectorViewModel.this;
                MessengerReadSkillRepository messengerReadSkillRepository = messengerConnectorViewModel.repository;
                String str = this.$pin;
                AbstractC3358CGz abstractC3358CGz = messengerConnectorViewModel.userSession;
                this.label = 1;
                obj = messengerReadSkillRepository.unlockWithPin(str, abstractC3358CGz, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            PinUnlockResult pinUnlockResult = (PinUnlockResult) obj;
            if (pinUnlockResult instanceof PinUnlockResult.Success) {
                MessengerConnectorViewModel messengerConnectorViewModel2 = MessengerConnectorViewModel.this;
                messengerConnectorViewModel2.connectorRepository.onResumeAfterAuth(messengerConnectorViewModel2.connectorId);
                HatchConnectorQplLogger.INSTANCE.markAuthCallbackReceivedAndEndSuccess();
                blg = MessengerConnectorViewModel.this._pinState;
                messengerPinState = MessengerPinState.Success.INSTANCE;
            } else {
                if (pinUnlockResult instanceof PinUnlockResult.WrongPin) {
                    PinUnlockResult.WrongPin wrongPin = (PinUnlockResult.WrongPin) pinUnlockResult;
                    HatchConnectorQplLogger.INSTANCE.endAuthFail(HatchConnectorQplLogger.AuthFailureReason.INVALID_CREDENTIALS, "pin_unlock_failed", wrongPin.error.message);
                    MessengerConnectorViewModel messengerConnectorViewModel3 = MessengerConnectorViewModel.this;
                    messengerConnectorViewModel3._pinState.Af8(messengerConnectorViewModel3.lockoutOrError(wrongPin.error));
                    return Unit.INSTANCE;
                }
                if (!C7384Etj.areEqual(pinUnlockResult, PinUnlockResult.ConnectivityError.INSTANCE)) {
                    throw C3cG.A0q();
                }
                HatchConnectorQplLogger.INSTANCE.endAuthFail("network_error", "pin_unlock_connectivity", "PIN unlock returned no response");
                blg = MessengerConnectorViewModel.this._pinState;
                messengerPinState = MessengerPinState.ConnectivityError.INSTANCE;
            }
            blg.Af8(messengerPinState);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C126901) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void openMessengerForPin(Context context) {
        C7384Etj.A0Y(context, 0);
        MessengerPinAnalytics.INSTANCE.openMessengerTapped(this.origin, null);
        AnonymousClass003.A14(this._showTroubleshooting, false);
        MessengerLauncherKt.launchMessengerForPinReset(context);
    }

    public final void submitPin(String str) {
        C7384Etj.A0Y(str, 0);
        if ((this._pinState.getValue() instanceof MessengerPinState.CheckingPinStatus) || (this._pinState.getValue() instanceof MessengerPinState.Verifying)) {
            return;
        }
        AnonymousClass001.A1J(new C126901(str, null), AEu.A00(this));
    }

    public /* synthetic */ MessengerConnectorViewModel(AbstractC3358CGz abstractC3358CGz, String str, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, MessengerReadSkillRepository messengerReadSkillRepository, int i, C06H c06h) {
        this(abstractC3358CGz, str, hatchSkillOAuthOrigin, (i & 8) != 0 ? new MessengerReadSkillRepository() : messengerReadSkillRepository);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
    
        if (r1 >= 3) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.messenger.skills.read.viewmodel.MessengerPinState lockoutOrError(com.facebook.aura.messenger.skills.read.model.PinError r3) {
        /*
            r2 = this;
            java.lang.Integer r0 = r3.loginTimeoutRemainingSecs
            if (r0 == 0) goto L12
            int r0 = r0.intValue()
            if (r0 <= 0) goto L12
            com.facebook.aura.navigation.key.MessengerPinLockoutReason r1 = com.facebook.aura.navigation.key.MessengerPinLockoutReason.RATE_LIMITED
        Lc:
            com.facebook.aura.messenger.skills.read.viewmodel.MessengerPinState$LockedOut r0 = new com.facebook.aura.messenger.skills.read.viewmodel.MessengerPinState$LockedOut
            r0.<init>(r1)
            return r0
        L12:
            boolean r0 = r3.getBypassesLocalFailedAttemptCount()
            if (r0 != 0) goto L2f
            java.lang.Integer r0 = r3.attemptsRemaining
            if (r0 == 0) goto L25
            int r0 = r0.intValue()
            if (r0 > 0) goto L25
        L22:
            com.facebook.aura.navigation.key.MessengerPinLockoutReason r1 = com.facebook.aura.navigation.key.MessengerPinLockoutReason.TOO_MANY_ATTEMPTS
            goto Lc
        L25:
            int r0 = r2.failedAttempts
            int r1 = r0 + 1
            r2.failedAttempts = r1
            r0 = 3
            if (r1 < r0) goto L2f
            goto L22
        L2f:
            com.facebook.aura.messenger.skills.read.viewmodel.MessengerPinState$Error r0 = new com.facebook.aura.messenger.skills.read.viewmodel.MessengerPinState$Error
            r0.<init>(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.messenger.skills.read.viewmodel.MessengerConnectorViewModel.lockoutOrError(com.facebook.aura.messenger.skills.read.model.PinError):com.facebook.aura.messenger.skills.read.viewmodel.MessengerPinState");
    }

    public final void dismissTroubleshooting() {
        AnonymousClass004.A1D(false, this._showTroubleshooting);
    }

    public final C1BN<MessengerPinState> getPinState() {
        return this.pinState;
    }

    public final C1BN<Boolean> getShowTroubleshooting() {
        return this.showTroubleshooting;
    }

    public final void onNeedHelp() {
        MessengerPinAnalytics.INSTANCE.pinHelpTapped(this.origin, this.connectorId);
        AnonymousClass004.A1D(true, this._showTroubleshooting);
    }

    public final void onTroubleshootingCancelTapped() {
        MessengerPinAnalytics.INSTANCE.cancelTapped(this.origin, null);
        dismissTroubleshooting();
    }

    public final void onTroubleshootingDismissed() {
        MessengerPinAnalytics.INSTANCE.troubleshootingDismissed(this.origin);
        dismissTroubleshooting();
    }

    public final void resetPinState() {
        this._pinState.Af8(MessengerPinState.Idle.INSTANCE);
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    private final void checkPinStatus() {
        AnonymousClass001.A1J(new AnonymousClass1(null), AEu.A00(this));
    }

    public MessengerConnectorViewModel(AbstractC3358CGz abstractC3358CGz, String str, HatchSkillOAuthOrigin hatchSkillOAuthOrigin, MessengerReadSkillRepository messengerReadSkillRepository) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        AnonymousClass005.A11(str, hatchSkillOAuthOrigin, messengerReadSkillRepository, 1);
        this.userSession = abstractC3358CGz;
        this.connectorId = str;
        this.origin = hatchSkillOAuthOrigin;
        this.repository = messengerReadSkillRepository;
        C9286GCn c9286GCnA01 = HnJ.A01(MessengerPinState.CheckingPinStatus.INSTANCE);
        this._pinState = c9286GCnA01;
        this.pinState = C3cG.A11(c9286GCnA01);
        C9286GCn c9286GCnA0v = AnonymousClass002.A0v(false);
        this._showTroubleshooting = c9286GCnA0v;
        this.showTroubleshooting = C3cG.A11(c9286GCnA0v);
        this.connectorRepository = HatchConnectorCatalogRepository.Companion.getInstance(abstractC3358CGz);
        checkPinStatus();
    }
}
