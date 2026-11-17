package com.facebook.aura.confidentialvm.model;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BLG;
import X.BLL;
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
import X.C6ys;
import X.C7384Etj;
import X.C79;
import X.C9286GCn;
import X.C9290GCr;
import X.CFK;
import X.EnumC10460Hji;
import X.G0V;
import X.GAX;
import X.GAo;
import X.HoC;
import X.HtJ;
import X.HwN;
import X.Hwg;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.confidentialvm.ConfidentialVmSetupGate;
import com.facebook.aura.confidentialvm.HatchVmAccessController;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmLoginState;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmRepository;
import com.facebook.aura.navigation.key.RegisterPinEntryPoint;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class ConfidentialVmLoginViewModel extends AEs {
    public static final int $stable = 8;

    @Deprecated
    public static final long COOLDOWN_TICK_MS = 1000;
    public static final Companion Companion = new Companion();

    @Deprecated
    public static final long LOCKOUT_REFETCH_TIMEOUT_MS = 2000;

    @Deprecated
    public static final String TAG = "ConfidentialVmLoginViewModel";
    public final BLG<Integer> _cooldownSecondsRemaining;
    public final BLG<ConfidentialVmLoginUiState> _uiState;
    public final C3Em<ConfidentialVmLoginViewEffect> _viewEffects;
    public final HatchVmAccessController accessController;
    public HoC cooldownJob;
    public final C1BN<Integer> cooldownSecondsRemaining;
    public final boolean isCvmSetupFlow;
    public final ConfidentialVmRepository repository;
    public final RegisterPinEntryPoint setupEntryPoint;
    public final ConfidentialVmSetupGate setupGate;
    public final C1BN<ConfidentialVmLoginUiState> uiState;
    public final C22I<ConfidentialVmLoginViewEffect> viewEffects;

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.model.ConfidentialVmLoginViewModel$1", f = "ConfidentialVmLoginViewModel.kt", l = {79}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.model.ConfidentialVmLoginViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConfidentialVmLoginViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            ConfidentialVmLoginState confidentialVmLoginState;
            ConfidentialVmLoginUiState value;
            ConfidentialVmLoginUiState confidentialVmLoginUiState;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    ConfidentialVmRepository confidentialVmRepository = ConfidentialVmLoginViewModel.this.repository;
                    this.label = 1;
                    obj = confidentialVmRepository.fetchLoginState(this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                confidentialVmLoginState = (ConfidentialVmLoginState) obj;
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                CFK.A0K(ConfidentialVmLoginViewModel.TAG, e2, "init: failed to read server PIN state");
                confidentialVmLoginState = null;
            }
            if (confidentialVmLoginState != null) {
                ConfidentialVmLoginUiState value2 = ConfidentialVmLoginViewModel.this._uiState.getValue();
                if (!value2.isSubmitting && !value2.isPermanentlyLocked && value2.attemptsRemaining == null && ConfidentialVmLoginViewModel.this._cooldownSecondsRemaining.getValue() == null) {
                    Integer num = confidentialVmLoginState.lockoutSecondsRemaining;
                    if (num != null) {
                        if (num.intValue() <= 0) {
                            num = null;
                        }
                        if (num != null) {
                            ConfidentialVmLoginViewModel.this.startCooldown(num.intValue());
                        }
                    }
                    Integer num2 = confidentialVmLoginState.attemptsRemaining;
                    if (num2 != null) {
                        Integer num3 = num2.intValue() > 0 ? num2 : null;
                        if (num3 != null) {
                            ConfidentialVmLoginViewModel confidentialVmLoginViewModel = ConfidentialVmLoginViewModel.this;
                            int iIntValue = num3.intValue();
                            BLG<ConfidentialVmLoginUiState> blg = confidentialVmLoginViewModel._uiState;
                            do {
                                value = blg.getValue();
                                confidentialVmLoginUiState = value;
                            } while (!blg.A6e(value, confidentialVmLoginUiState.copy(confidentialVmLoginUiState.pin, confidentialVmLoginUiState.isSubmitting, confidentialVmLoginUiState.error, new Integer(iIntValue), confidentialVmLoginUiState.isPermanentlyLocked)));
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ConfidentialVmLoginViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final class ConfidentialVmLoginUiState extends C06G {
        public static final int $stable = 0;
        public final Integer attemptsRemaining;
        public final ConfidentialVmLoginError error;
        public final boolean isPermanentlyLocked;
        public final boolean isSubmitting;
        public final String pin;

        public ConfidentialVmLoginUiState(String str, boolean z, ConfidentialVmLoginError confidentialVmLoginError, Integer num, boolean z2) {
            C7384Etj.A0Y(str, 0);
            this.pin = str;
            this.isSubmitting = z;
            this.error = confidentialVmLoginError;
            this.attemptsRemaining = num;
            this.isPermanentlyLocked = z2;
        }

        public final ConfidentialVmLoginUiState copy(String str, boolean z, ConfidentialVmLoginError confidentialVmLoginError, Integer num, boolean z2) {
            C7384Etj.A0Y(str, 0);
            return new ConfidentialVmLoginUiState(str, z, confidentialVmLoginError, num, z2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ConfidentialVmLoginUiState) {
                    ConfidentialVmLoginUiState confidentialVmLoginUiState = (ConfidentialVmLoginUiState) obj;
                    if (!C7384Etj.areEqual(this.pin, confidentialVmLoginUiState.pin) || this.isSubmitting != confidentialVmLoginUiState.isSubmitting || this.error != confidentialVmLoginUiState.error || !C7384Etj.areEqual(this.attemptsRemaining, confidentialVmLoginUiState.attemptsRemaining) || this.isPermanentlyLocked != confidentialVmLoginUiState.isPermanentlyLocked) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ ConfidentialVmLoginUiState copy$default(ConfidentialVmLoginUiState confidentialVmLoginUiState, String str, boolean z, ConfidentialVmLoginError confidentialVmLoginError, Integer num, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = confidentialVmLoginUiState.pin;
            }
            if ((i & 2) != 0) {
                z = confidentialVmLoginUiState.isSubmitting;
            }
            if ((i & 4) != 0) {
                confidentialVmLoginError = confidentialVmLoginUiState.error;
            }
            if ((i & 8) != 0) {
                num = confidentialVmLoginUiState.attemptsRemaining;
            }
            if ((i & 16) != 0) {
                z2 = confidentialVmLoginUiState.isPermanentlyLocked;
            }
            return confidentialVmLoginUiState.copy(str, z, confidentialVmLoginError, num, z2);
        }

        public final String component1() {
            return this.pin;
        }

        public final boolean component2() {
            return this.isSubmitting;
        }

        public final ConfidentialVmLoginError component3() {
            return this.error;
        }

        public final Integer component4() {
            return this.attemptsRemaining;
        }

        public final boolean component5() {
            return this.isPermanentlyLocked;
        }

        public final Integer getAttemptsRemaining() {
            return this.attemptsRemaining;
        }

        public final ConfidentialVmLoginError getError() {
            return this.error;
        }

        public final String getPin() {
            return this.pin;
        }

        public int hashCode() {
            return C0KA.A00((((C0KA.A01(AnonymousClass001.A0G(this.pin), this.isSubmitting) + AnonymousClass006.A0D(this.error)) * 31) + C06G.A04(this.attemptsRemaining)) * 31, this.isPermanentlyLocked);
        }

        public final boolean isPermanentlyLocked() {
            return this.isPermanentlyLocked;
        }

        public final boolean isPinComplete() {
            return AnonymousClass002.A1Q(this.pin.length(), 6);
        }

        public final boolean isSubmitting() {
            return this.isSubmitting;
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ ConfidentialVmLoginUiState(String str, boolean z, ConfidentialVmLoginError confidentialVmLoginError, Integer num, boolean z2, int i, C06H c06h) {
            this((i & 1) != 0 ? "" : str, AnonymousClass001.A1Q(i, z), (i & 4) != 0 ? null : confidentialVmLoginError, (i & 8) != 0 ? null : num, (i & 16) != 0 ? false : z2);
        }

        public ConfidentialVmLoginUiState() {
            this("", false, null, null, false);
        }
    }

    public final class Factory extends AuraViewModelFactory<ConfidentialVmLoginViewModel> {
        public static final int $stable = 8;
        public final RegisterPinEntryPoint setupEntryPoint;
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz, RegisterPinEntryPoint registerPinEntryPoint) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
            this.setupEntryPoint = registerPinEntryPoint;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public ConfidentialVmLoginViewModel create() {
            return new ConfidentialVmLoginViewModel(ConfidentialVmRepository.Companion.getInstance(this.userSession), HatchVmAccessController.Companion.getInstance(this.userSession), ConfidentialVmSetupGate.Companion.getInstance(this.userSession), this.setupEntryPoint);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.model.ConfidentialVmLoginViewModel$onSubmit$2", f = "ConfidentialVmLoginViewModel.kt", l = {171, HatchMessageShareDocumentRenderer.CONTENT_TOP_PX, 202, 213, 233}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.model.ConfidentialVmLoginViewModel$onSubmit$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ ConfidentialVmLoginUiState $state;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ConfidentialVmLoginUiState confidentialVmLoginUiState, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$state = confidentialVmLoginUiState;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConfidentialVmLoginViewModel.this.new AnonymousClass2(this.$state, htJ);
        }

        /* JADX WARN: Code restructure failed: missing block: B:81:0x01bc, code lost:
        
            if (r7 == null) goto L82;
         */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0029 A[LOOP:0: B:13:0x0029->B:115:?, LOOP_START] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0058 A[LOOP:1: B:22:0x0058->B:117:?, LOOP_START] */
        /* JADX WARN: Removed duplicated region for block: B:51:0x011d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0146  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0153  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instructions count: 583
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.model.ConfidentialVmLoginViewModel.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.model.ConfidentialVmLoginViewModel$serverLockoutSeconds$2", f = "ConfidentialVmLoginViewModel.kt", l = {300}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.model.ConfidentialVmLoginViewModel$serverLockoutSeconds$2, reason: invalid class name and case insensitive filesystem */
    public final class C112042 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Integer>, Object> {
        public int label;

        public C112042(HtJ<? super C112042> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConfidentialVmLoginViewModel.this.new C112042(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Integer num;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    ConfidentialVmRepository confidentialVmRepository = ConfidentialVmLoginViewModel.this.repository;
                    this.label = 1;
                    obj = confidentialVmRepository.fetchLoginState(this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                ConfidentialVmLoginState confidentialVmLoginState = (ConfidentialVmLoginState) obj;
                if (confidentialVmLoginState != null && (num = confidentialVmLoginState.lockoutSecondsRemaining) != null) {
                    if (num.intValue() > 0) {
                        return num;
                    }
                }
                return null;
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                CFK.A0K(ConfidentialVmLoginViewModel.TAG, e2, "onSubmit: failed to read server lockout window");
                return null;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Integer> htJ) {
            return ConfidentialVmLoginViewModel.this.new C112042(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.confidentialvm.model.ConfidentialVmLoginViewModel$startCooldown$1", f = "ConfidentialVmLoginViewModel.kt", l = {315}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.confidentialvm.model.ConfidentialVmLoginViewModel$startCooldown$1, reason: invalid class name and case insensitive filesystem */
    public final class C112051 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ int $seconds;
        public int I$0;
        public int label;
        public final /* synthetic */ ConfidentialVmLoginViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C112051(int i, ConfidentialVmLoginViewModel confidentialVmLoginViewModel, HtJ<? super C112051> htJ) {
            super(2, htJ);
            this.$seconds = i;
            this.this$0 = confidentialVmLoginViewModel;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C112051(this.$seconds, this.this$0, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:6:0x000e). Please report as a decompilation issue!!! */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                X.Hji r4 = X.EnumC10460Hji.A02
                int r0 = r7.label
                r3 = 1
                if (r0 == 0) goto L2b
                if (r0 != r3) goto L55
                int r0 = r7.I$0
                X.Hwg.A00(r8)
            Le:
                int r0 = r0 + (-1)
            L10:
                com.facebook.aura.confidentialvm.model.ConfidentialVmLoginViewModel r1 = r7.this$0
                X.BLG<java.lang.Integer> r2 = r1._cooldownSecondsRemaining
                if (r0 <= 0) goto L31
                java.lang.Integer r1 = new java.lang.Integer
                r1.<init>(r0)
                X.AnonymousClass002.A1I(r2, r1)
                r7.I$0 = r0
                r7.label = r3
                r1 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r1 = X.C7Bq.A01(r1, r7)
                if (r1 != r4) goto Le
                return r4
            L2b:
                X.Hwg.A00(r8)
                int r0 = r7.$seconds
                goto L10
            L31:
                r6 = 0
                r2.Af8(r6)
                com.facebook.aura.confidentialvm.model.ConfidentialVmLoginViewModel r0 = r7.this$0
                X.BLG<com.facebook.aura.confidentialvm.model.ConfidentialVmLoginViewModel$ConfidentialVmLoginUiState> r2 = r0._uiState
            L39:
                java.lang.Object r1 = r2.getValue()
                r3 = r1
                com.facebook.aura.confidentialvm.model.ConfidentialVmLoginViewModel$ConfidentialVmLoginUiState r3 = (com.facebook.aura.confidentialvm.model.ConfidentialVmLoginViewModel.ConfidentialVmLoginUiState) r3
                java.lang.String r4 = r3.pin
                boolean r5 = r3.isSubmitting
                java.lang.Integer r7 = r3.attemptsRemaining
                boolean r8 = r3.isPermanentlyLocked
                com.facebook.aura.confidentialvm.model.ConfidentialVmLoginViewModel$ConfidentialVmLoginUiState r0 = r3.copy(r4, r5, r6, r7, r8)
                boolean r0 = r2.A6e(r1, r0)
                if (r0 == 0) goto L39
                kotlin.Unit r4 = kotlin.Unit.INSTANCE
                return r4
            L55:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.model.ConfidentialVmLoginViewModel.C112051.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C112051) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public ConfidentialVmLoginViewModel(ConfidentialVmRepository confidentialVmRepository, HatchVmAccessController hatchVmAccessController, ConfidentialVmSetupGate confidentialVmSetupGate, RegisterPinEntryPoint registerPinEntryPoint) {
        boolean zA1Z = AnonymousClass005.A1Z(confidentialVmRepository, hatchVmAccessController, confidentialVmSetupGate);
        this.repository = confidentialVmRepository;
        this.accessController = hatchVmAccessController;
        this.setupGate = confidentialVmSetupGate;
        this.setupEntryPoint = registerPinEntryPoint;
        this.isCvmSetupFlow = AnonymousClass002.A1X(registerPinEntryPoint);
        C9286GCn c9286GCn = new C9286GCn(new ConfidentialVmLoginUiState("", false, null, null, false));
        this._uiState = c9286GCn;
        this.uiState = new C3Pi(null, c9286GCn);
        C9286GCn c9286GCn2 = new C9286GCn(HwN.A01);
        this._cooldownSecondsRemaining = c9286GCn2;
        this.cooldownSecondsRemaining = new C3Pi(null, c9286GCn2);
        Integer num = C79.A00;
        C9290GCr c9290GCr = new C9290GCr(num, 0, zA1Z ? 1 : 0);
        this._viewEffects = c9290GCr;
        this.viewEffects = new C3pd(c9290GCr);
        BLL bllA00 = AEu.A00(this);
        GAo.A02(num, C6ys.A00, new AnonymousClass1(null), bllA00);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object serverLockoutSeconds(HtJ<? super Integer> htJ) {
        return GAX.A01(htJ, new C112042(null), 2000L);
    }

    public final void onPinChange(String str) {
        ConfidentialVmLoginUiState value;
        ConfidentialVmLoginUiState confidentialVmLoginUiState;
        C7384Etj.A0Y(str, 0);
        ConfidentialVmLoginUiState value2 = this._uiState.getValue();
        if (value2.isSubmitting || this._cooldownSecondsRemaining.getValue() != null || value2.isPermanentlyLocked) {
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
        BLG<ConfidentialVmLoginUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            confidentialVmLoginUiState = value;
        } while (!blg.A6e(value, confidentialVmLoginUiState.copy(strA17, confidentialVmLoginUiState.isSubmitting, confidentialVmLoginUiState.error, confidentialVmLoginUiState.attemptsRemaining, confidentialVmLoginUiState.isPermanentlyLocked)));
    }

    private final HatchScreen getPinScreen() {
        return this._uiState.getValue().isPermanentlyLocked ? HatchScreen.CVM_PIN_LOCKED : HatchScreen.CVM_PIN_ENTER;
    }

    private final void logSetupClick(HatchComponent hatchComponent) {
        ConfidentialVmAnalytics.INSTANCE.logSetupTap(this.setupEntryPoint, getPinScreen(), hatchComponent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startCooldown(int i) {
        HtJ htJA13 = AnonymousClass006.A13(this.cooldownJob);
        this.cooldownJob = AnonymousClass001.A11(new C112051(i, this, htJA13), AEu.A00(this));
    }

    public final C1BN<Integer> getCooldownSecondsRemaining() {
        return this.cooldownSecondsRemaining;
    }

    public final C1BN<ConfidentialVmLoginUiState> getUiState() {
        return this.uiState;
    }

    public final C22I<ConfidentialVmLoginViewEffect> getViewEffects() {
        return this.viewEffects;
    }

    public final void onBackClick() {
        logSetupClick(HatchComponent.BACK_BUTTON);
        ConfidentialVmAnalytics.INSTANCE.logRecoveryLogOutTap(this.setupEntryPoint);
    }

    public final void onHelpClick() {
        logSetupClick(HatchComponent.CVM_PIN_HELP_BUTTON);
    }

    public final void onShown() {
        ConfidentialVmLoginUiState value;
        ConfidentialVmLoginUiState confidentialVmLoginUiState;
        if (this._uiState.getValue().isSubmitting) {
            return;
        }
        BLG<ConfidentialVmLoginUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            confidentialVmLoginUiState = value;
        } while (!blg.A6e(value, confidentialVmLoginUiState.copy("", confidentialVmLoginUiState.isSubmitting, null, confidentialVmLoginUiState.attemptsRemaining, confidentialVmLoginUiState.isPermanentlyLocked)));
    }

    public final void onStepShown() {
        ConfidentialVmAnalytics.INSTANCE.logSetupImpression(this.setupEntryPoint, getPinScreen(), HatchComponent.CVM_SCREEN_VIEW);
    }

    public final void onSubmit() {
        ConfidentialVmLoginUiState value;
        ConfidentialVmLoginUiState confidentialVmLoginUiState;
        ConfidentialVmLoginUiState value2 = this._uiState.getValue();
        if (!value2.isPinComplete() || value2.isSubmitting || this._cooldownSecondsRemaining.getValue() != null || value2.isPermanentlyLocked) {
            return;
        }
        logSetupClick(HatchComponent.CONTINUE_BUTTON);
        ConfidentialVmAnalytics.INSTANCE.logRecoveryPinSubmitted(this.setupEntryPoint);
        BLG<ConfidentialVmLoginUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            confidentialVmLoginUiState = value;
        } while (!blg.A6e(value, confidentialVmLoginUiState.copy(confidentialVmLoginUiState.pin, true, null, null, confidentialVmLoginUiState.isPermanentlyLocked)));
        AnonymousClass001.A1J(new AnonymousClass2(value2, null), AEu.A00(this));
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }
}
