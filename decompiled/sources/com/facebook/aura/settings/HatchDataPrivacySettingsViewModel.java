package com.facebook.aura.settings;

import X.A6J;
import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC08429uh;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass441;
import X.BLG;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C10571Hud;
import X.C1BN;
import X.C3Ek;
import X.C3UX;
import X.C3rb;
import X.C60I;
import X.C7384Etj;
import X.C9286GCn;
import X.C9uG;
import X.EnumC10460Hji;
import X.FGI;
import X.G0U;
import X.G0V;
import X.GAo;
import X.GB9;
import X.HnJ;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import X.InterfaceC08439ui;
import android.app.Activity;
import android.content.Context;
import com.facebook.aura.analytics.hatch.HatchClientCvmEventLogger;
import com.facebook.aura.analytics.hatch.HatchClientCvmOutcome;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvThreeDSChallengeDialogKt;
import com.facebook.aura.common.appname.HatchAppName;
import com.facebook.aura.composer.util.ImageCompressor;
import com.facebook.aura.executors.AuraDispatchers;
import com.facebook.aura.gateway.HatchVmRepository;
import com.facebook.aura.gateway.HatcheryVMIdUtilsKt;
import com.facebook.aura.gateway.service.HatchGatewayServiceManager;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.identity.provider.HatchIdentityProvider;
import com.facebook.aura.json.NetworkException;
import com.facebook.aura.onboarding.OnboardingStateManager;
import com.facebook.aura.perf.HatchActivationQplLogger;
import com.facebook.aura.settings.HatchDataExportState;
import com.facebook.aura.user.provider.AuraViewerDataProvider;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class HatchDataPrivacySettingsViewModel extends AEs {
    public static final int $stable = 8;
    public final BLG<ResetState> _resetState;
    public final HatchAiTrainingApi aiTrainingApi;
    public final C1BN<DataPrivacyUiState> uiState;
    public final AbstractC3358CGz userSession;

    public final class AiTrainingUiState extends C06G {
        public static final int $stable = 0;
        public final boolean isChecked;
        public final boolean isLocked;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof AiTrainingUiState) {
                    AiTrainingUiState aiTrainingUiState = (AiTrainingUiState) obj;
                    if (this.isChecked != aiTrainingUiState.isChecked || this.isLocked != aiTrainingUiState.isLocked) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ AiTrainingUiState copy$default(AiTrainingUiState aiTrainingUiState, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = aiTrainingUiState.isChecked;
            }
            if ((i & 2) != 0) {
                z2 = aiTrainingUiState.isLocked;
            }
            return new AiTrainingUiState(z, z2);
        }

        public final boolean component1() {
            return this.isChecked;
        }

        public final boolean component2() {
            return this.isLocked;
        }

        public final AiTrainingUiState copy(boolean z, boolean z2) {
            return new AiTrainingUiState(z, z2);
        }

        public int hashCode() {
            return C0KA.A00(C0KA.A02(this.isChecked), this.isLocked);
        }

        public final boolean isChecked() {
            return this.isChecked;
        }

        public final boolean isLocked() {
            return this.isLocked;
        }

        public AiTrainingUiState(boolean z, boolean z2) {
            this.isChecked = z;
            this.isLocked = z2;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class DataPrivacyUiState extends C06G {
        public static final int $stable = 0;
        public final AiTrainingUiState aiTraining;
        public final String botName;
        public final HatchDataExportState exportState;
        public final ResetState resetState;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof DataPrivacyUiState) {
                    DataPrivacyUiState dataPrivacyUiState = (DataPrivacyUiState) obj;
                    if (!C7384Etj.areEqual(this.botName, dataPrivacyUiState.botName) || !C7384Etj.areEqual(this.resetState, dataPrivacyUiState.resetState) || !C7384Etj.areEqual(this.exportState, dataPrivacyUiState.exportState) || !C7384Etj.areEqual(this.aiTraining, dataPrivacyUiState.aiTraining)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ DataPrivacyUiState copy$default(DataPrivacyUiState dataPrivacyUiState, String str, ResetState resetState, HatchDataExportState hatchDataExportState, AiTrainingUiState aiTrainingUiState, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dataPrivacyUiState.botName;
            }
            if ((i & 2) != 0) {
                resetState = dataPrivacyUiState.resetState;
            }
            if ((i & 4) != 0) {
                hatchDataExportState = dataPrivacyUiState.exportState;
            }
            if ((i & 8) != 0) {
                aiTrainingUiState = dataPrivacyUiState.aiTraining;
            }
            AnonymousClass005.A0x(str, resetState, hatchDataExportState);
            return new DataPrivacyUiState(str, resetState, hatchDataExportState, aiTrainingUiState);
        }

        public final String component1() {
            return this.botName;
        }

        public final ResetState component2() {
            return this.resetState;
        }

        public final HatchDataExportState component3() {
            return this.exportState;
        }

        public final AiTrainingUiState component4() {
            return this.aiTraining;
        }

        public final AiTrainingUiState getAiTraining() {
            return this.aiTraining;
        }

        public final String getBotName() {
            return this.botName;
        }

        public final HatchDataExportState getExportState() {
            return this.exportState;
        }

        public final ResetState getResetState() {
            return this.resetState;
        }

        public int hashCode() {
            return AnonymousClass005.A0F(this.exportState, AnonymousClass005.A0F(this.resetState, AnonymousClass001.A0G(this.botName))) + AnonymousClass006.A0D(this.aiTraining);
        }

        public DataPrivacyUiState(String str, ResetState resetState, HatchDataExportState hatchDataExportState, AiTrainingUiState aiTrainingUiState) {
            AnonymousClass005.A0x(str, resetState, hatchDataExportState);
            this.botName = str;
            this.resetState = resetState;
            this.exportState = hatchDataExportState;
            this.aiTraining = aiTrainingUiState;
        }

        public final DataPrivacyUiState copy(String str, ResetState resetState, HatchDataExportState hatchDataExportState, AiTrainingUiState aiTrainingUiState) {
            AnonymousClass005.A0x(str, resetState, hatchDataExportState);
            return new DataPrivacyUiState(str, resetState, hatchDataExportState, aiTrainingUiState);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ DataPrivacyUiState(String str, ResetState resetState, HatchDataExportState hatchDataExportState, AiTrainingUiState aiTrainingUiState, int i, C06H c06h) {
            this((i & 1) != 0 ? HatchAppName.value : str, (i & 2) != 0 ? ResetState.Idle.INSTANCE : resetState, (i & 4) != 0 ? HatchDataExportState.Idle.INSTANCE : hatchDataExportState, (i & 8) != 0 ? null : aiTrainingUiState);
        }

        public DataPrivacyUiState() {
            this(HatchAppName.value, ResetState.Idle.INSTANCE, HatchDataExportState.Idle.INSTANCE, null);
        }
    }

    /* loaded from: classes4.dex */
    public final class Factory implements InterfaceC08439ui {
        public static final int $stable = 8;
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // X.InterfaceC08439ui
        public <T extends AEs> T create(Class<T> cls) {
            return new HatchDataPrivacySettingsViewModel(this.userSession);
        }

        @Override // X.InterfaceC08439ui
        public /* bridge */ <T extends AEs> T create(C9uG<T> c9uG, A6J a6j) {
            return (T) AbstractC08429uh.A00(this, a6j, c9uG);
        }

        @Override // X.InterfaceC08439ui
        public /* bridge */ <T extends AEs> T create(Class<T> cls, A6J a6j) {
            return (T) InterfaceC08439ui.A00(this, cls);
        }
    }

    public interface ResetState {

        public final class Error extends C06G implements ResetState {
            public static final int $stable = 0;
            public final String message;

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof Error) && C7384Etj.areEqual(this.message, ((Error) obj).message));
            }

            public static /* synthetic */ Error copy$default(Error error, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = error.message;
                }
                return new Error(str);
            }

            public final String component1() {
                return this.message;
            }

            public final Error copy(String str) {
                return new Error(str);
            }

            public final String getMessage() {
                return this.message;
            }

            public int hashCode() {
                return AnonymousClass006.A0G(this.message);
            }

            public Error(String str) {
                this.message = str;
            }

            public String toString() {
                return super.toString();
            }
        }

        public final class Idle implements ResetState {
            public static final int $stable = 0;
            public static final Idle INSTANCE = new Idle();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Idle);
            }

            public String toString() {
                return "Idle";
            }

            public int hashCode() {
                return 71779546;
            }
        }

        public final class Loading implements ResetState {
            public static final int $stable = 0;
            public static final Loading INSTANCE = new Loading();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Loading);
            }

            public String toString() {
                return "Loading";
            }

            public int hashCode() {
                return -1836878218;
            }
        }

        public final class Success implements ResetState {
            public static final int $stable = 0;
            public static final Success INSTANCE = new Success();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Success);
            }

            public String toString() {
                return HatchCcvThreeDSChallengeDialogKt.AUTH_RESULT_SUCCESS;
            }

            public int hashCode() {
                return 254268733;
            }
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.HatchDataPrivacySettingsViewModel$refreshAiTraining$1", f = "HatchDataPrivacySettingsViewModel.kt", l = {ImageCompressor.IMAGE_COMPRESSION_QUALITY}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchDataPrivacySettingsViewModel$refreshAiTraining$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchDataPrivacySettingsViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchAiTrainingApi hatchAiTrainingApi = HatchDataPrivacySettingsViewModel.this.aiTrainingApi;
                this.label = 1;
                if (hatchAiTrainingApi.m1934refreshIoAF18A(this) == enumC10460Hji) {
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
            return HatchDataPrivacySettingsViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.HatchDataPrivacySettingsViewModel$resetHatch$1", f = "HatchDataPrivacySettingsViewModel.kt", l = {120, 145}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchDataPrivacySettingsViewModel$resetHatch$1, reason: invalid class name and case insensitive filesystem */
    public final class C135211 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Activity $activity;
        public final /* synthetic */ String $fqdn;
        public final /* synthetic */ boolean $isRecoveryPinReset;
        public Object L$0;
        public boolean Z$0;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.settings.HatchDataPrivacySettingsViewModel$resetHatch$1$1", f = "HatchDataPrivacySettingsViewModel.kt", l = {121}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.settings.HatchDataPrivacySettingsViewModel$resetHatch$1$1, reason: invalid class name and collision with other inner class name */
        public final class C03471 extends AbstractC07127nr implements G0U<HtJ<? super HsJ<? extends Boolean>>, Object> {
            public final /* synthetic */ String $fqdn;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03471(String str, HtJ<? super C03471> htJ) {
                super(1, htJ);
                this.$fqdn = str;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(HtJ<?> htJ) {
                return new C03471(this.$fqdn, htJ);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(HtJ<? super HsJ<Boolean>> htJ) {
                return new C03471(this.$fqdn, htJ).invokeSuspend(Unit.INSTANCE);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                Object objM964destroyAndReleaseVmgIAlus;
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchVmRepository hatchVmRepository = HatchVmRepository.INSTANCE;
                    String str = this.$fqdn;
                    this.label = 1;
                    objM964destroyAndReleaseVmgIAlus = hatchVmRepository.m964destroyAndReleaseVmgIAlus(str, this);
                    if (objM964destroyAndReleaseVmgIAlus == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    objM964destroyAndReleaseVmgIAlus = AnonymousClass001.A0q(obj);
                }
                return new HsJ(objM964destroyAndReleaseVmgIAlus);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(HtJ<? super HsJ<? extends Boolean>> htJ) {
                return invoke2((HtJ<? super HsJ<Boolean>>) htJ);
            }
        }

        @DebugMetadata(c = "com.facebook.aura.settings.HatchDataPrivacySettingsViewModel$resetHatch$1$2", f = "HatchDataPrivacySettingsViewModel.kt", l = {123}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.settings.HatchDataPrivacySettingsViewModel$resetHatch$1$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC07127nr implements G0U<HtJ<? super Boolean>, Object> {
            public final /* synthetic */ String $fqdn;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(String str, HtJ<? super AnonymousClass2> htJ) {
                super(1, htJ);
                this.$fqdn = str;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(HtJ<?> htJ) {
                return new AnonymousClass2(this.$fqdn, htJ);
            }

            @Override // X.G0U
            public final Object invoke(HtJ<? super Boolean> htJ) {
                return new AnonymousClass2(this.$fqdn, htJ).invokeSuspend(Unit.INSTANCE);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                Object objM965fetchLiveVmHostsIoAF18A;
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchVmRepository hatchVmRepository = HatchVmRepository.INSTANCE;
                    this.label = 1;
                    objM965fetchLiveVmHostsIoAF18A = hatchVmRepository.m965fetchLiveVmHostsIoAF18A(this);
                    if (objM965fetchLiveVmHostsIoAF18A == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    objM965fetchLiveVmHostsIoAF18A = AnonymousClass001.A0q(obj);
                }
                if (objM965fetchLiveVmHostsIoAF18A instanceof C10571Hud) {
                    objM965fetchLiveVmHostsIoAF18A = null;
                }
                Set set = (Set) objM965fetchLiveVmHostsIoAF18A;
                return Boolean.valueOf((set == null || set.contains(this.$fqdn)) ? false : true);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135211(String str, boolean z, Activity activity, HtJ<? super C135211> htJ) {
            super(2, htJ);
            this.$fqdn = str;
            this.$isRecoveryPinReset = z;
            this.$activity = activity;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchDataPrivacySettingsViewModel.this.new C135211(this.$fqdn, this.$isRecoveryPinReset, this.$activity, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1895logRequest0E7RQCE;
            String message;
            BLG<ResetState> blg;
            NetworkException networkException;
            int i;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i2 = this.label;
            if (i2 == 0) {
                Hwg.A00(obj);
                HatchDataPrivacySettingsViewModel.this._resetState.Af8(ResetState.Loading.INSTANCE);
                AgentResetLogging agentResetLogging = AgentResetLogging.INSTANCE;
                C03471 c03471 = new C03471(this.$fqdn, null);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$fqdn, null);
                this.label = 1;
                objM1895logRequest0E7RQCE = agentResetLogging.m1895logRequest0E7RQCE(c03471, anonymousClass2, this);
                if (objM1895logRequest0E7RQCE == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    return Unit.INSTANCE;
                }
                objM1895logRequest0E7RQCE = AnonymousClass001.A0q(obj);
            }
            HatchDataPrivacySettingsViewModel hatchDataPrivacySettingsViewModel = HatchDataPrivacySettingsViewModel.this;
            boolean z = this.$isRecoveryPinReset;
            Activity activity = this.$activity;
            Throwable thA00 = HsJ.A00(objM1895logRequest0E7RQCE);
            if (thA00 == null) {
                boolean zA1X = AnonymousClass001.A1X(objM1895logRequest0E7RQCE);
                if (zA1X) {
                    hatchDataPrivacySettingsViewModel.logRecoveryPinReset(z, HatchClientCvmOutcome.SUCCESS);
                    HatchActivationQplLogger hatchActivationQplLogger = HatchActivationQplLogger.INSTANCE;
                    hatchActivationQplLogger.pointFlow("vm_reset");
                    hatchActivationQplLogger.endFlowCancel("vm_reset");
                    AuraViewerDataProvider companion = AuraViewerDataProvider.Companion.getInstance(hatchDataPrivacySettingsViewModel.userSession);
                    OnboardingStateManager.Companion.getInstance(hatchDataPrivacySettingsViewModel.userSession).resetOnboarding();
                    companion.atomicUpdate(HatchDataPrivacySettingsViewModel$resetHatch$1$3$1.INSTANCE);
                    HatchGatewayServiceManager.INSTANCE.getGateway(hatchDataPrivacySettingsViewModel.userSession).clearUserData();
                    hatchDataPrivacySettingsViewModel._resetState.Af8(ResetState.Success.INSTANCE);
                    GB9 gb9 = AuraDispatchers.main;
                    HatchDataPrivacySettingsViewModel$resetHatch$1$3$2 hatchDataPrivacySettingsViewModel$resetHatch$1$3$2 = new HatchDataPrivacySettingsViewModel$resetHatch$1$3$2(hatchDataPrivacySettingsViewModel, activity, null);
                    this.L$0 = null;
                    this.Z$0 = zA1X;
                    this.label = 2;
                    if (GAo.A00(this, gb9, hatchDataPrivacySettingsViewModel$resetHatch$1$3$2) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                    return Unit.INSTANCE;
                }
                hatchDataPrivacySettingsViewModel.logRecoveryPinReset(z, HatchClientCvmOutcome.FAILURE);
                blg = hatchDataPrivacySettingsViewModel._resetState;
                message = "Reset failed";
            } else {
                hatchDataPrivacySettingsViewModel.logRecoveryPinReset(z, HatchClientCvmOutcome.FAILURE);
                if (!(thA00 instanceof NetworkException) || (networkException = (NetworkException) thA00) == null || (200 <= (i = networkException.httpResponseCode) && i < 300)) {
                    message = thA00.getMessage();
                } else {
                    String message2 = networkException.getMessage();
                    message = FGI.A0I("HTTP ", i, message2 != null ? FGI.A0U(" (", message2, ")") : "");
                }
                blg = hatchDataPrivacySettingsViewModel._resetState;
            }
            AnonymousClass001.A1E(blg, null, new ResetState.Error(message));
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C135211) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.HatchDataPrivacySettingsViewModel$setAiTrainingEnabled$1", f = "HatchDataPrivacySettingsViewModel.kt", l = {89}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchDataPrivacySettingsViewModel$setAiTrainingEnabled$1, reason: invalid class name and case insensitive filesystem */
    public final class C135221 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ boolean $enabled;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135221(boolean z, HtJ<? super C135221> htJ) {
            super(2, htJ);
            this.$enabled = z;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchDataPrivacySettingsViewModel.this.new C135221(this.$enabled, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchAiTrainingApi hatchAiTrainingApi = HatchDataPrivacySettingsViewModel.this.aiTrainingApi;
                boolean z = this.$enabled;
                this.label = 1;
                if (hatchAiTrainingApi.m1935setEnabledgIAlus(z, this) == enumC10460Hji) {
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
            return ((C135221) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public HatchDataPrivacySettingsViewModel(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.userSession = abstractC3358CGz;
        HatchAiTrainingApi companion = HatchAiTrainingApi.Companion.getInstance(abstractC3358CGz);
        this.aiTrainingApi = companion;
        ResetState.Idle idle = ResetState.Idle.INSTANCE;
        C9286GCn c9286GCnA01 = HnJ.A01(idle);
        this._resetState = c9286GCnA01;
        C60I c60iA03 = C3rb.A03(new HatchDataPrivacySettingsViewModel$uiState$3(null), C3rb.A03(new HatchDataPrivacySettingsViewModel$uiState$2(null), C3rb.A03(new HatchDataPrivacySettingsViewModel$uiState$1(null), HatchIdentityProvider.Companion.getInstance(abstractC3358CGz).aiIdentityName, c9286GCnA01), HatchDataExportStatus.state), companion.setting);
        this.uiState = AnonymousClass441.A00(new DataPrivacyUiState(HatchAppName.value, idle, HatchDataExportState.Idle.INSTANCE, null), AEu.A00(this), c60iA03, C3Ek.A00);
    }

    public final void exportData(Context context) {
        C7384Etj.A0Y(context, 0);
        HatchDataExportStatus.INSTANCE.start(context, this.userSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logRecoveryPinReset(boolean z, HatchClientCvmOutcome hatchClientCvmOutcome) {
        if (z) {
            HatchClientCvmEventLogger.INSTANCE.logRecoveryPinReset(hatchClientCvmOutcome);
        }
    }

    public final void dismissError() {
        this._resetState.Af8(ResetState.Idle.INSTANCE);
    }

    public final void dismissExportResult() {
        HatchDataExportStatus.INSTANCE.cancel();
    }

    public final C1BN<DataPrivacyUiState> getUiState() {
        return this.uiState;
    }

    public final void resetHatch(Activity activity, boolean z) {
        BLG<ResetState> blg;
        String str;
        logRecoveryPinReset(z, HatchClientCvmOutcome.ATTEMPT);
        if (activity == null) {
            AgentResetLogging.INSTANCE.logNotSent(AgentResetLogging.NO_ACTIVITY);
            logRecoveryPinReset(z, HatchClientCvmOutcome.FAILURE);
            blg = this._resetState;
            str = "Reset failed";
        } else {
            String strExtractVmHost = HatcheryVMIdUtilsKt.extractVmHost(HatchGatewayPrefsStore.Companion.getInstance(this.userSession).getGatewayUrl());
            if (strExtractVmHost != null) {
                AnonymousClass001.A1I(AnonymousClass001.A0y(), new C135211(strExtractVmHost, z, activity, null), AEu.A00(this));
                return;
            } else {
                AgentResetLogging.INSTANCE.logNotSent(AgentResetLogging.NO_VM_HOST);
                logRecoveryPinReset(z, HatchClientCvmOutcome.FAILURE);
                blg = this._resetState;
                str = "No FQDN found";
            }
        }
        AnonymousClass002.A1I(blg, new ResetState.Error(str));
    }

    public final void refreshAiTraining() {
        AnonymousClass001.A1J(new AnonymousClass1(null), AEu.A00(this));
    }

    public final void setAiTrainingEnabled(boolean z) {
        AnonymousClass001.A1J(new C135221(z, null), AEu.A00(this));
    }
}
