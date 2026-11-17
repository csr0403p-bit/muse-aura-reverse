package com.facebook.aura.confidentialvm.model;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.BLG;
import X.BQG;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C1BN;
import X.C22I;
import X.C3Em;
import X.C3Pi;
import X.C3UX;
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
import com.facebook.aura.activation.view.AuraWaitlistConfettiKt;
import com.facebook.aura.analytics.hatch.HatchClientCvmEventLogger;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.confidentialvm.model.ConfidentialVmPinReminderViewEffect;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmPinVerifyResult;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class ConfidentialVmPinReminderViewModel extends AEs {
    public static final int $stable = 8;
    public final BLG<ConfidentialVmPinReminderUiState> _uiState;
    public final C3Em<ConfidentialVmPinReminderViewEffect> _viewEffects;
    public final ConfidentialVmRepository repository;
    public final C1BN<ConfidentialVmPinReminderUiState> uiState;
    public final C22I<ConfidentialVmPinReminderViewEffect> viewEffects;

    public final class ConfidentialVmPinReminderUiState extends C06G {
        public static final int $stable = 0;
        public final boolean isError;
        public final boolean isVerifying;
        public final String pin;

        public ConfidentialVmPinReminderUiState(String str, boolean z, boolean z2) {
            C7384Etj.A0Y(str, 0);
            this.pin = str;
            this.isVerifying = z;
            this.isError = z2;
        }

        public final ConfidentialVmPinReminderUiState copy(String str, boolean z, boolean z2) {
            C7384Etj.A0Y(str, 0);
            return new ConfidentialVmPinReminderUiState(str, z, z2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ConfidentialVmPinReminderUiState) {
                    ConfidentialVmPinReminderUiState confidentialVmPinReminderUiState = (ConfidentialVmPinReminderUiState) obj;
                    if (!C7384Etj.areEqual(this.pin, confidentialVmPinReminderUiState.pin) || this.isVerifying != confidentialVmPinReminderUiState.isVerifying || this.isError != confidentialVmPinReminderUiState.isError) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ ConfidentialVmPinReminderUiState copy$default(ConfidentialVmPinReminderUiState confidentialVmPinReminderUiState, String str, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = confidentialVmPinReminderUiState.pin;
            }
            if ((i & 2) != 0) {
                z = confidentialVmPinReminderUiState.isVerifying;
            }
            if ((i & 4) != 0) {
                z2 = confidentialVmPinReminderUiState.isError;
            }
            return confidentialVmPinReminderUiState.copy(str, z, z2);
        }

        public final String component1() {
            return this.pin;
        }

        public final boolean component2() {
            return this.isVerifying;
        }

        public final boolean component3() {
            return this.isError;
        }

        public final String getPin() {
            return this.pin;
        }

        public int hashCode() {
            return C0KA.A00(C0KA.A01(AnonymousClass001.A0G(this.pin), this.isVerifying), this.isError);
        }

        public final boolean isError() {
            return this.isError;
        }

        public final boolean isVerifying() {
            return this.isVerifying;
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ ConfidentialVmPinReminderUiState(String str, boolean z, boolean z2, int i, C06H c06h) {
            this((i & 1) != 0 ? "" : str, AnonymousClass001.A1Q(i, z), AnonymousClass005.A1O(i, z2));
        }

        public ConfidentialVmPinReminderUiState() {
            this("", false, false);
        }
    }

    public final class Factory extends AuraViewModelFactory<ConfidentialVmPinReminderViewModel> {
        public static final int $stable = 8;
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public ConfidentialVmPinReminderViewModel create() {
            return new ConfidentialVmPinReminderViewModel(ConfidentialVmRepository.Companion.getInstance(this.userSession));
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.model.ConfidentialVmPinReminderViewModel$verify$2", f = "ConfidentialVmPinReminderViewModel.kt", l = {81, AuraWaitlistConfettiKt.StandardParticleCount, 102}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.model.ConfidentialVmPinReminderViewModel$verify$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $pin;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$pin = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConfidentialVmPinReminderViewModel.this.new AnonymousClass2(this.$pin, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            C3Em<ConfidentialVmPinReminderViewEffect> c3Em;
            ConfidentialVmPinReminderViewEffect confidentialVmPinReminderViewEffect;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                CFK.A0K(ConfidentialVmPinReminderViewModelKt.TAG, e2, "verify: PIN verification failed");
                obj2 = ConfidentialVmPinVerifyResult.AuthenticationFailed.INSTANCE;
            }
            if (i == 0) {
                Hwg.A00(obj);
                ConfidentialVmRepository confidentialVmRepository = ConfidentialVmPinReminderViewModel.this.repository;
                String str = this.$pin;
                this.label = 1;
                obj = confidentialVmRepository.submitReminderPin(str, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i != 2 && i != 3) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    return Unit.INSTANCE;
                }
                Hwg.A00(obj);
            }
            obj2 = (ConfidentialVmPinVerifyResult) obj;
            if (C7384Etj.areEqual(obj2, ConfidentialVmPinVerifyResult.Match.INSTANCE)) {
                ConfidentialVmAnalytics.INSTANCE.logPinReminderMatched();
                ConfidentialVmPinReminderViewModel.this.repository.dismissRecoveryPinPrompt();
                BLG<ConfidentialVmPinReminderUiState> blg = ConfidentialVmPinReminderViewModel.this._uiState;
                while (!blg.A6e(blg.getValue(), new ConfidentialVmPinReminderUiState("", false, false))) {
                }
                c3Em = ConfidentialVmPinReminderViewModel.this._viewEffects;
                confidentialVmPinReminderViewEffect = ConfidentialVmPinReminderViewEffect.VerificationSucceeded.INSTANCE;
                this.L$0 = null;
                this.label = 2;
            } else {
                if (C7384Etj.areEqual(obj2, ConfidentialVmPinVerifyResult.AuthenticationFailed.INSTANCE)) {
                    CFK.A06(ConfidentialVmPinReminderViewModelKt.TAG, "verify: envelope did not authenticate; not a wrong PIN");
                }
                ConfidentialVmAnalytics.INSTANCE.logPinReminderMismatched();
                BLG<ConfidentialVmPinReminderUiState> blg2 = ConfidentialVmPinReminderViewModel.this._uiState;
                while (!blg2.A6e(blg2.getValue(), new ConfidentialVmPinReminderUiState("", false, true))) {
                }
                c3Em = ConfidentialVmPinReminderViewModel.this._viewEffects;
                confidentialVmPinReminderViewEffect = ConfidentialVmPinReminderViewEffect.VerificationFailed.INSTANCE;
                this.L$0 = null;
                this.label = 3;
            }
            if (c3Em.emit(confidentialVmPinReminderViewEffect, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public ConfidentialVmPinReminderViewModel(ConfidentialVmRepository confidentialVmRepository) {
        C7384Etj.A0Y(confidentialVmRepository, 0);
        this.repository = confidentialVmRepository;
        C9286GCn c9286GCn = new C9286GCn(new ConfidentialVmPinReminderUiState("", false, false));
        this._uiState = c9286GCn;
        this.uiState = C3Pi.A00(c9286GCn);
        C9290GCr c9290GCr = new C9290GCr(C79.A00, 0, 1);
        this._viewEffects = c9290GCr;
        this.viewEffects = new C3pd(c9290GCr);
        HatchClientCvmEventLogger.INSTANCE.logRecoveryPinReminderView();
    }

    public final void onPinChange(String str) {
        ConfidentialVmPinReminderUiState value;
        ConfidentialVmPinReminderUiState confidentialVmPinReminderUiState;
        C7384Etj.A0Y(str, 0);
        if (this._uiState.getValue().isVerifying) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        String strA17 = BQG.A17(sb.toString(), 6);
        BLG<ConfidentialVmPinReminderUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            confidentialVmPinReminderUiState = value;
        } while (!blg.A6e(value, confidentialVmPinReminderUiState.copy(strA17, confidentialVmPinReminderUiState.isVerifying, false)));
        if (strA17.length() == 6) {
            verify(strA17);
        }
    }

    private final void verify(String str) {
        ConfidentialVmPinReminderUiState value;
        ConfidentialVmPinReminderUiState confidentialVmPinReminderUiState;
        BLG<ConfidentialVmPinReminderUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            confidentialVmPinReminderUiState = value;
        } while (!blg.A6e(value, confidentialVmPinReminderUiState.copy(confidentialVmPinReminderUiState.pin, true, false)));
        ConfidentialVmAnalytics.INSTANCE.logPinReminderSubmitted();
        AnonymousClass001.A1J(new AnonymousClass2(str, null), AEu.A00(this));
    }

    public final C1BN<ConfidentialVmPinReminderUiState> getUiState() {
        return this.uiState;
    }

    public final C22I<ConfidentialVmPinReminderViewEffect> getViewEffects() {
        return this.viewEffects;
    }
}
