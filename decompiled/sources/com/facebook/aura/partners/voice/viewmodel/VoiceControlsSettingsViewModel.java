package com.facebook.aura.partners.voice.viewmodel;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC5321DgF;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass441;
import X.BLG;
import X.BLL;
import X.C1BN;
import X.C20Q;
import X.C22I;
import X.C3Em;
import X.C3Es;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3pU;
import X.C3pd;
import X.C3rb;
import X.C60I;
import X.C7384Etj;
import X.C79;
import X.C9286GCn;
import X.C9290GCr;
import X.CFK;
import X.EnumC10460Hji;
import X.F0C;
import X.F1E;
import X.G0V;
import X.G0W;
import X.GAo;
import X.HnJ;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.HzP;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.devices.link.ordering.HatchLinkOrderStateMachine;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.executors.AuraDispatchers;
import com.facebook.aura.feed.repo.FeedInstructionsCardStoreKt;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.gateway.HatchGatewayConnectionState;
import com.facebook.aura.navigation.key.VoiceEntryPoint;
import com.facebook.aura.partners.voice.api.VoiceCatalogRepository;
import com.facebook.aura.partners.voice.api.VoiceOption;
import com.facebook.aura.partners.voice.api.VoicePipelineProfileState;
import com.facebook.aura.partners.voice.background.VoiceCallForegroundService;
import com.facebook.aura.partners.voice.gating.VoiceGating;
import com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository;
import com.facebook.aura.partners.voice.infra.VoiceOnboardingRepository;
import com.facebook.aura.partners.voice.prefs.VoicePrefs;
import com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository;
import com.facebook.aura.partners.voice.viewmodel.VoiceTelemetry;
import com.facebook.aura.settings.support.HatchContactSupportViewModelKt;
import com.facebook.aura.toast.api.ToastApi;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class VoiceControlsSettingsViewModel extends AEs {
    public static final int $stable = 8;
    public final BLG<Boolean> _backgroundingEnabled;
    public final BLG<Integer> _greetingDelayMs;
    public final BLG<Boolean> _isSavingVoicePipelineProfile;
    public final C3Em<Boolean> _resetSucceeded;
    public final BLG<VoiceOption> _selectedVoice;
    public final BLG<VoicePipelineProfileState> _voicePipelineProfileState;
    public final C1BN<Boolean> backgroundingEnabled;
    public final HatchGatewayConnection gateway;
    public final C1BN<Integer> greetingDelayMs;
    public final AtomicInteger greetingWriteGeneration;
    public final C1BN<Boolean> isSavingVoicePipelineProfile;
    public final C1BN<Boolean> liveAvatarEnabled;
    public final F0C pageImpressionMetadata$delegate;
    public final BLG<Integer> pageRefreshGeneration;
    public HoC refreshGreetingJob;
    public HoC refreshVoiceJob;
    public HoC resetJob;
    public final C22I<Boolean> resetSucceeded;
    public final C1BN<VoiceOption> selectedVoice;
    public final VoiceSelectionRepository selectionRepository;
    public final VoiceTelemetry telemetry;
    public final AbstractC3358CGz userSession;
    public final VoiceCallActivityRepository voiceCallRepository;
    public final VoiceCatalogRepository voiceCatalogRepository;
    public final VoiceOnboardingRepository voiceOnboardingRepository;
    public final C1BN<VoicePipelineProfileState> voicePipelineProfileState;
    public final AtomicInteger voiceSelectionGeneration;
    public HoC writeGreetingJob;
    public HoC writeVoicePipelineProfileJob;

    @DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoiceControlsSettingsViewModel$1", f = "VoiceControlsSettingsViewModel.kt", l = {432}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoiceControlsSettingsViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public Object L$1;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoiceControlsSettingsViewModel$1$1", f = "VoiceControlsSettingsViewModel.kt", l = {118}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoiceControlsSettingsViewModel$1$1, reason: invalid class name and collision with other inner class name */
        public final class C03281 extends AbstractC07127nr implements G0V<HatchGatewayConnectionState, HtJ<? super Unit>, Object> {
            public int label;
            public final /* synthetic */ VoiceControlsSettingsViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03281(VoiceControlsSettingsViewModel voiceControlsSettingsViewModel, HtJ<? super C03281> htJ) {
                super(2, htJ);
                this.this$0 = voiceControlsSettingsViewModel;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new C03281(this.this$0, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    if (!AnonymousClass003.A1Z(this.this$0._isSavingVoicePipelineProfile)) {
                        VoiceControlsSettingsViewModel voiceControlsSettingsViewModel = this.this$0;
                        this.label = 1;
                        if (voiceControlsSettingsViewModel.refreshVoicePipelineProfiles(this) == enumC10460Hji) {
                            return enumC10460Hji;
                        }
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
            public final Object invoke(HatchGatewayConnectionState hatchGatewayConnectionState, HtJ<? super Unit> htJ) {
                return new C03281(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
            }
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return VoiceControlsSettingsViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                VoiceControlsSettingsViewModel voiceControlsSettingsViewModel = VoiceControlsSettingsViewModel.this;
                C1BN<HatchGatewayConnectionState> c1bn = voiceControlsSettingsViewModel.gateway.connectionState;
                C03281 c03281 = new C03281(voiceControlsSettingsViewModel, null);
                C7384Etj.A0Z(c1bn, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.FlowKt__CollectKt.collectLatest>");
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                if (C3pU.A00(this, c03281, c1bn) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw C3cG.A0Q("SharedFlow never completes, this call should never return.");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return VoiceControlsSettingsViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoiceControlsSettingsViewModel$2", f = "VoiceControlsSettingsViewModel.kt", l = {432}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoiceControlsSettingsViewModel$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoiceControlsSettingsViewModel$2$1", f = "VoiceControlsSettingsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoiceControlsSettingsViewModel$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0V<VoiceSelectionRepository.OperationState, HtJ<? super Unit>, Object> {
            public final /* synthetic */ F1E $observedRevision;
            public /* synthetic */ Object L$0;
            public int label;
            public final /* synthetic */ VoiceControlsSettingsViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(F1E f1e, VoiceControlsSettingsViewModel voiceControlsSettingsViewModel, HtJ<? super AnonymousClass1> htJ) {
                super(2, htJ);
                this.$observedRevision = f1e;
                this.this$0 = voiceControlsSettingsViewModel;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$observedRevision, this.this$0, htJ);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                VoiceSelectionRepository.OperationState operationState = (VoiceSelectionRepository.OperationState) this.L$0;
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                if (!operationState.isBusy()) {
                    int i = operationState.revision;
                    F1E f1e = this.$observedRevision;
                    if (i != f1e.element) {
                        f1e.element = i;
                        VoiceControlsSettingsViewModel voiceControlsSettingsViewModel = this.this$0;
                        voiceControlsSettingsViewModel._selectedVoice.Af8(voiceControlsSettingsViewModel.readSelectedVoice());
                    }
                }
                return Unit.INSTANCE;
            }

            @Override // X.G0V
            public final Object invoke(VoiceSelectionRepository.OperationState operationState, HtJ<? super Unit> htJ) {
                return ((AnonymousClass1) create(operationState, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return VoiceControlsSettingsViewModel.this.new AnonymousClass2(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                F1E f1e = new F1E();
                f1e.element = VoiceControlsSettingsViewModel.this.selectionRepository.operations.getValue().revision;
                VoiceControlsSettingsViewModel voiceControlsSettingsViewModel = VoiceControlsSettingsViewModel.this;
                C1BN<VoiceSelectionRepository.OperationState> c1bn = voiceControlsSettingsViewModel.selectionRepository.operations;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(f1e, voiceControlsSettingsViewModel, null);
                C7384Etj.A0Z(c1bn, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.FlowKt__CollectKt.collectLatest>");
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 1;
                if (C3pU.A00(this, anonymousClass1, c1bn) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw C3cG.A0Q("SharedFlow never completes, this call should never return.");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return VoiceControlsSettingsViewModel.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* loaded from: classes.dex */
    public final class Factory extends AuraViewModelFactory<VoiceControlsSettingsViewModel> {
        public static final int $stable = 8;
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public /* bridge */ /* synthetic */ AEs create() {
            return new VoiceControlsSettingsViewModel(this.userSession);
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public VoiceControlsSettingsViewModel create() {
            return new VoiceControlsSettingsViewModel(this.userSession);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoiceControlsSettingsViewModel$pageImpressionMetadata$2, reason: invalid class name and case insensitive filesystem */
    public final class C133392 extends AbstractC7559F3s implements Function0<C1BN<? extends Map<HatchMetadataKey, ? extends String>>> {

        @DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoiceControlsSettingsViewModel$pageImpressionMetadata$2$1", f = "VoiceControlsSettingsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoiceControlsSettingsViewModel$pageImpressionMetadata$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0W<Integer, Boolean, HtJ<? super Map<HatchMetadataKey, ? extends String>>, Object> {
            public /* synthetic */ boolean Z$0;
            public int label;
            public final /* synthetic */ VoiceControlsSettingsViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(VoiceControlsSettingsViewModel voiceControlsSettingsViewModel, HtJ<? super AnonymousClass1> htJ) {
                super(3, htJ);
                this.this$0 = voiceControlsSettingsViewModel;
            }

            public final Object invoke(int i, boolean z, HtJ<? super Map<HatchMetadataKey, String>> htJ) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, htJ);
                anonymousClass1.Z$0 = z;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                boolean z = this.Z$0;
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return this.this$0.pageImpressionMetadata(z);
            }

            @Override // X.G0W
            public /* bridge */ /* synthetic */ Object invoke(Integer num, Boolean bool, HtJ<? super Map<HatchMetadataKey, ? extends String>> htJ) {
                return invoke(AnonymousClass001.A0F(num), AnonymousClass001.A1X(bool), (HtJ<? super Map<HatchMetadataKey, String>>) htJ);
            }
        }

        public C133392() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final C1BN<? extends Map<HatchMetadataKey, ? extends String>> invoke() {
            VoiceControlsSettingsViewModel voiceControlsSettingsViewModel = VoiceControlsSettingsViewModel.this;
            C60I c60iA03 = C3rb.A03(new AnonymousClass1(voiceControlsSettingsViewModel, null), voiceControlsSettingsViewModel.pageRefreshGeneration, voiceControlsSettingsViewModel.liveAvatarEnabled);
            BLL bllA00 = AEu.A00(VoiceControlsSettingsViewModel.this);
            C3Es c3Es = new C3Es(5000L, LinkEncryptedPairingKt.LINK_COUNTER_MAX);
            VoiceControlsSettingsViewModel voiceControlsSettingsViewModel2 = VoiceControlsSettingsViewModel.this;
            return AnonymousClass441.A00(voiceControlsSettingsViewModel2.pageImpressionMetadata(VoicePrefs.INSTANCE.getLiveAvatarEnabled(voiceControlsSettingsViewModel2.userSession, true)), bllA00, c60iA03, c3Es);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoiceControlsSettingsViewModel$refresh$1", f = "VoiceControlsSettingsViewModel.kt", l = {VoiceCallForegroundService.AVATAR_TARGET_PX}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoiceControlsSettingsViewModel$refresh$1, reason: invalid class name and case insensitive filesystem */
    public final class C133401 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int I$0;
        public int label;

        public C133401(HtJ<? super C133401> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return VoiceControlsSettingsViewModel.this.new C133401(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i;
            Integer num;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i2 = this.label;
            try {
                if (i2 == 0) {
                    Hwg.A00(obj);
                    i = VoiceControlsSettingsViewModel.this.greetingWriteGeneration.get();
                    VoiceCallActivityRepository voiceCallActivityRepository = VoiceControlsSettingsViewModel.this.voiceCallRepository;
                    this.I$0 = i;
                    this.label = 1;
                    obj = voiceCallActivityRepository.readGreetingDelayMs(this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i2 != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    i = this.I$0;
                    Hwg.A00(obj);
                }
                num = (Integer) obj;
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                CFK.A0A(VoiceControlsSettingsViewModelKt.TAG, "refresh greeting delay failed", e2);
            }
            if (num == null) {
                return Unit.INSTANCE;
            }
            int iIntValue = num.intValue();
            if (i != VoiceControlsSettingsViewModel.this.greetingWriteGeneration.get()) {
                return Unit.INSTANCE;
            }
            VoicePrefs.INSTANCE.setGreetingDelayMs(VoiceControlsSettingsViewModel.this.userSession, iIntValue);
            VoiceControlsSettingsViewModel voiceControlsSettingsViewModel = VoiceControlsSettingsViewModel.this;
            AnonymousClass002.A1I(voiceControlsSettingsViewModel._greetingDelayMs, C3cG.A0R(voiceControlsSettingsViewModel.currentGreetingDelayMs()));
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return VoiceControlsSettingsViewModel.this.new C133401(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoiceControlsSettingsViewModel$refreshSelectedVoiceFromServer$1", f = "VoiceControlsSettingsViewModel.kt", l = {355, 369}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoiceControlsSettingsViewModel$refreshSelectedVoiceFromServer$1, reason: invalid class name and case insensitive filesystem */
    public final class C133411 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoiceControlsSettingsViewModel$refreshSelectedVoiceFromServer$1$1", f = "VoiceControlsSettingsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoiceControlsSettingsViewModel$refreshSelectedVoiceFromServer$1$1, reason: invalid class name and collision with other inner class name */
        public final class C03291 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ int $generation;
            public final /* synthetic */ int $operationRevision;
            public final /* synthetic */ VoiceOption $resolvedVoice;
            public final /* synthetic */ String $vmId;
            public int label;
            public final /* synthetic */ VoiceControlsSettingsViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03291(VoiceControlsSettingsViewModel voiceControlsSettingsViewModel, int i, String str, int i2, VoiceOption voiceOption, HtJ<? super C03291> htJ) {
                super(2, htJ);
                this.this$0 = voiceControlsSettingsViewModel;
                this.$generation = i;
                this.$vmId = str;
                this.$operationRevision = i2;
                this.$resolvedVoice = voiceOption;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new C03291(this.this$0, this.$generation, this.$vmId, this.$operationRevision, this.$resolvedVoice, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                VoiceSelectionRepository.OperationState value = this.this$0.selectionRepository.operations.getValue();
                if (this.$generation == this.this$0.voiceSelectionGeneration.get()) {
                    String str = this.$vmId;
                    VoicePrefs voicePrefs = VoicePrefs.INSTANCE;
                    if (C7384Etj.areEqual(str, voicePrefs.currentVmId(this.this$0.userSession)) && !value.isBusy() && value.revision == this.$operationRevision) {
                        VoiceOption voiceOption = this.$resolvedVoice;
                        AbstractC3358CGz abstractC3358CGz = this.this$0.userSession;
                        if (voiceOption == null) {
                            voicePrefs.clearSelectedVoice(abstractC3358CGz);
                        } else {
                            voicePrefs.setSelectedVoice(abstractC3358CGz, voiceOption.id, voiceOption.name, voiceOption.description);
                        }
                        this.this$0._selectedVoice.Af8(this.$resolvedVoice);
                    }
                }
                return Unit.INSTANCE;
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                return ((C03291) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public C133411(HtJ<? super C133411> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return VoiceControlsSettingsViewModel.this.new C133411(htJ);
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x00a9, code lost:
        
            if (r4.equals(com.facebook.aura.partners.voice.prefs.VoicePrefs.INSTANCE.selectedVoiceId(r15.this$0.userSession)) == false) goto L36;
         */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r16) {
            /*
                Method dump skipped, instructions count: 223
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.viewmodel.VoiceControlsSettingsViewModel.C133411.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return VoiceControlsSettingsViewModel.this.new C133411(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoiceControlsSettingsViewModel", f = "VoiceControlsSettingsViewModel.kt", l = {269}, m = "refreshVoicePipelineProfiles", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoiceControlsSettingsViewModel$refreshVoicePipelineProfiles$1, reason: invalid class name and case insensitive filesystem */
    public final class C133421 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C133421(HtJ<? super C133421> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VoiceControlsSettingsViewModel.this.refreshVoicePipelineProfiles(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoiceControlsSettingsViewModel$resetOnboarding$1", f = "VoiceControlsSettingsViewModel.kt", l = {HatchContactSupportViewModelKt.MAX_EMAIL_LENGTH, 325, 327}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoiceControlsSettingsViewModel$resetOnboarding$1, reason: invalid class name and case insensitive filesystem */
    public final class C133431 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ VoiceOption $previousVoice;
        public boolean Z$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C133431(VoiceOption voiceOption, HtJ<? super C133431> htJ) {
            super(2, htJ);
            this.$previousVoice = voiceOption;
        }

        public static final void invokeSuspend$onResetFailed(VoiceControlsSettingsViewModel voiceControlsSettingsViewModel, VoiceOption voiceOption) {
            if (voiceControlsSettingsViewModel._selectedVoice.getValue() == null) {
                voiceControlsSettingsViewModel._selectedVoice.Af8(voiceOption);
            }
            voiceControlsSettingsViewModel._resetSucceeded.AhV(AnonymousClass001.A0h());
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return VoiceControlsSettingsViewModel.this.new C133431(this.$previousVoice, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x006c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0076 A[ADDED_TO_REGION] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                X.Hji r6 = X.EnumC10460Hji.A02
                int r0 = r7.label
                r5 = 3
                r4 = 2
                java.lang.String r2 = "VoiceControlsSettingsViewModel"
                r3 = 1
                if (r0 == 0) goto L1d
                if (r0 == r3) goto L19
                if (r0 == r4) goto L51
                if (r0 != r5) goto L14
                boolean r4 = r7.Z$0
                goto L6d
            L14:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            L19:
                X.Hwg.A00(r8)     // Catch: java.lang.Exception -> La5 java.util.concurrent.CancellationException -> Lb5
                goto L2d
            L1d:
                X.Hwg.A00(r8)
                com.facebook.aura.partners.voice.viewmodel.VoiceControlsSettingsViewModel r0 = com.facebook.aura.partners.voice.viewmodel.VoiceControlsSettingsViewModel.this     // Catch: java.lang.Exception -> La5 java.util.concurrent.CancellationException -> Lb5
                com.facebook.aura.partners.voice.infra.VoiceOnboardingRepository r0 = r0.voiceOnboardingRepository     // Catch: java.lang.Exception -> La5 java.util.concurrent.CancellationException -> Lb5
                r7.label = r3     // Catch: java.lang.Exception -> La5 java.util.concurrent.CancellationException -> Lb5
                java.lang.Object r8 = r0.reset(r7)     // Catch: java.lang.Exception -> La5 java.util.concurrent.CancellationException -> Lb5
                if (r8 != r6) goto L2d
                return r6
            L2d:
                if (r8 != 0) goto L3e
                java.lang.String r0 = "resetOnboarding: server reset failed"
                X.CFK.A06(r2, r0)     // Catch: java.lang.Exception -> La5 java.util.concurrent.CancellationException -> Lb5
                com.facebook.aura.partners.voice.viewmodel.VoiceControlsSettingsViewModel r1 = com.facebook.aura.partners.voice.viewmodel.VoiceControlsSettingsViewModel.this     // Catch: java.lang.Exception -> La5 java.util.concurrent.CancellationException -> Lb5
                com.facebook.aura.partners.voice.api.VoiceOption r0 = r7.$previousVoice     // Catch: java.lang.Exception -> La5 java.util.concurrent.CancellationException -> Lb5
                invokeSuspend$onResetFailed(r1, r0)     // Catch: java.lang.Exception -> La5 java.util.concurrent.CancellationException -> Lb5
                kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Exception -> La5 java.util.concurrent.CancellationException -> Lb5
                return r0
            L3e:
                com.facebook.aura.partners.voice.infra.VoiceNuxRepository$Companion r1 = com.facebook.aura.partners.voice.infra.VoiceNuxRepository.Companion     // Catch: java.lang.Exception -> La5 java.util.concurrent.CancellationException -> Lb5
                com.facebook.aura.partners.voice.viewmodel.VoiceControlsSettingsViewModel r0 = com.facebook.aura.partners.voice.viewmodel.VoiceControlsSettingsViewModel.this     // Catch: java.lang.Exception -> La5 java.util.concurrent.CancellationException -> Lb5
                X.CGz r0 = r0.userSession     // Catch: java.lang.Exception -> La5 java.util.concurrent.CancellationException -> Lb5
                com.facebook.aura.partners.voice.infra.VoiceNuxRepository r0 = r1.getInstance(r0)     // Catch: java.lang.Exception -> La5 java.util.concurrent.CancellationException -> Lb5
                r7.label = r4     // Catch: java.lang.Exception -> La5 java.util.concurrent.CancellationException -> Lb5
                java.lang.Object r8 = r0.resetOnAccount(r7)     // Catch: java.lang.Exception -> La5 java.util.concurrent.CancellationException -> Lb5
                if (r8 != r6) goto L54
                return r6
            L51:
                X.Hwg.A00(r8)     // Catch: java.lang.Exception -> La5 java.util.concurrent.CancellationException -> Lb5
            L54:
                boolean r4 = X.AnonymousClass001.A1X(r8)     // Catch: java.lang.Exception -> La5 java.util.concurrent.CancellationException -> Lb5
                com.facebook.aura.partners.voice.infra.VoiceAnnouncementRepository$Companion r1 = com.facebook.aura.partners.voice.infra.VoiceAnnouncementRepository.Companion     // Catch: java.lang.Exception -> La5 java.util.concurrent.CancellationException -> Lb5
                com.facebook.aura.partners.voice.viewmodel.VoiceControlsSettingsViewModel r0 = com.facebook.aura.partners.voice.viewmodel.VoiceControlsSettingsViewModel.this     // Catch: java.lang.Exception -> La5 java.util.concurrent.CancellationException -> Lb5
                X.CGz r0 = r0.userSession     // Catch: java.lang.Exception -> La5 java.util.concurrent.CancellationException -> Lb5
                com.facebook.aura.partners.voice.infra.VoiceAnnouncementRepository r0 = r1.getInstance(r0)     // Catch: java.lang.Exception -> La5 java.util.concurrent.CancellationException -> Lb5
                r7.Z$0 = r4     // Catch: java.lang.Exception -> La5 java.util.concurrent.CancellationException -> Lb5
                r7.label = r5     // Catch: java.lang.Exception -> La5 java.util.concurrent.CancellationException -> Lb5
                java.lang.Object r8 = r0.resetOnAccount(r7)     // Catch: java.lang.Exception -> La5 java.util.concurrent.CancellationException -> Lb5
                if (r8 != r6) goto L70
                return r6
            L6d:
                X.Hwg.A00(r8)     // Catch: java.lang.Exception -> La5 java.util.concurrent.CancellationException -> Lb5
            L70:
                boolean r0 = X.AnonymousClass001.A1X(r8)     // Catch: java.lang.Exception -> La5 java.util.concurrent.CancellationException -> Lb5
                if (r4 == 0) goto L96
                if (r0 == 0) goto L96
                com.facebook.aura.partners.voice.prefs.VoicePrefs r1 = com.facebook.aura.partners.voice.prefs.VoicePrefs.INSTANCE     // Catch: java.lang.Exception -> La5 java.util.concurrent.CancellationException -> Lb5
                com.facebook.aura.partners.voice.viewmodel.VoiceControlsSettingsViewModel r0 = com.facebook.aura.partners.voice.viewmodel.VoiceControlsSettingsViewModel.this     // Catch: java.lang.Exception -> La5 java.util.concurrent.CancellationException -> Lb5
                X.CGz r0 = r0.userSession     // Catch: java.lang.Exception -> La5 java.util.concurrent.CancellationException -> Lb5
                r1.resetVoiceOnboarding(r0)     // Catch: java.lang.Exception -> La5 java.util.concurrent.CancellationException -> Lb5
                com.facebook.aura.partners.voice.api.VoiceCatalogRepository$Companion r1 = com.facebook.aura.partners.voice.api.VoiceCatalogRepository.Companion     // Catch: java.lang.Exception -> La5 java.util.concurrent.CancellationException -> Lb5
                com.facebook.aura.partners.voice.viewmodel.VoiceControlsSettingsViewModel r0 = com.facebook.aura.partners.voice.viewmodel.VoiceControlsSettingsViewModel.this     // Catch: java.lang.Exception -> La5 java.util.concurrent.CancellationException -> Lb5
                X.CGz r0 = r0.userSession     // Catch: java.lang.Exception -> La5 java.util.concurrent.CancellationException -> Lb5
                r1.invalidateForCurrentVm(r0)     // Catch: java.lang.Exception -> La5 java.util.concurrent.CancellationException -> Lb5
                com.facebook.aura.partners.voice.viewmodel.VoiceControlsSettingsViewModel r0 = com.facebook.aura.partners.voice.viewmodel.VoiceControlsSettingsViewModel.this     // Catch: java.lang.Exception -> La5 java.util.concurrent.CancellationException -> Lb5
                X.3Em<java.lang.Boolean> r1 = r0._resetSucceeded     // Catch: java.lang.Exception -> La5 java.util.concurrent.CancellationException -> Lb5
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Exception -> La5 java.util.concurrent.CancellationException -> Lb5
                r1.AhV(r0)     // Catch: java.lang.Exception -> La5 java.util.concurrent.CancellationException -> Lb5
                goto Lb2
            L96:
                java.lang.String r0 = "resetOnboarding: account voice NUX or announcement reset failed"
                X.CFK.A06(r2, r0)     // Catch: java.lang.Exception -> La5 java.util.concurrent.CancellationException -> Lb5
                com.facebook.aura.partners.voice.viewmodel.VoiceControlsSettingsViewModel r1 = com.facebook.aura.partners.voice.viewmodel.VoiceControlsSettingsViewModel.this     // Catch: java.lang.Exception -> La5 java.util.concurrent.CancellationException -> Lb5
                com.facebook.aura.partners.voice.api.VoiceOption r0 = r7.$previousVoice     // Catch: java.lang.Exception -> La5 java.util.concurrent.CancellationException -> Lb5
                invokeSuspend$onResetFailed(r1, r0)     // Catch: java.lang.Exception -> La5 java.util.concurrent.CancellationException -> Lb5
                kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Exception -> La5 java.util.concurrent.CancellationException -> Lb5
                return r0
            La5:
                r1 = move-exception
                java.lang.String r0 = "resetOnboarding failed before server reset confirmed"
                X.CFK.A0A(r2, r0, r1)
                com.facebook.aura.partners.voice.viewmodel.VoiceControlsSettingsViewModel r1 = com.facebook.aura.partners.voice.viewmodel.VoiceControlsSettingsViewModel.this
                com.facebook.aura.partners.voice.api.VoiceOption r0 = r7.$previousVoice
                invokeSuspend$onResetFailed(r1, r0)
            Lb2:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            Lb5:
                r0 = move-exception
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.viewmodel.VoiceControlsSettingsViewModel.C133431.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C133431) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoiceControlsSettingsViewModel$setGreetingDelayMs$1", f = "VoiceControlsSettingsViewModel.kt", l = {289}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoiceControlsSettingsViewModel$setGreetingDelayMs$1, reason: invalid class name and case insensitive filesystem */
    public final class C133441 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ int $newDelayMs;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C133441(int i, HtJ<? super C133441> htJ) {
            super(2, htJ);
            this.$newDelayMs = i;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return VoiceControlsSettingsViewModel.this.new C133441(this.$newDelayMs, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    VoiceCallActivityRepository voiceCallActivityRepository = VoiceControlsSettingsViewModel.this.voiceCallRepository;
                    int i2 = this.$newDelayMs;
                    this.label = 1;
                    if (voiceCallActivityRepository.writeGreetingDelayMs(i2, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                CFK.A0A(VoiceControlsSettingsViewModelKt.TAG, "write greeting delay failed", e2);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C133441) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoiceControlsSettingsViewModel$setVoicePipelineProfile$1", f = "VoiceControlsSettingsViewModel.kt", l = {237, HatchLinkOrderStateMachine.MAX_EMAIL_LENGTH}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoiceControlsSettingsViewModel$setVoicePipelineProfile$1, reason: invalid class name and case insensitive filesystem */
    public final class C133451 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ VoicePipelineProfileState $previous;
        public final /* synthetic */ String $profileId;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C133451(String str, VoicePipelineProfileState voicePipelineProfileState, HtJ<? super C133451> htJ) {
            super(2, htJ);
            this.$profileId = str;
            this.$previous = voicePipelineProfileState;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return VoiceControlsSettingsViewModel.this.new C133451(this.$profileId, this.$previous, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            VoicePipelineProfileState voicePipelineProfileState;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                CFK.A08(VoiceControlsSettingsViewModelKt.TAG, "Failed to select voice pipeline profile", e2);
                voicePipelineProfileState = null;
            }
            if (i == 0) {
                Hwg.A00(obj);
                VoiceCallActivityRepository voiceCallActivityRepository = VoiceControlsSettingsViewModel.this.voiceCallRepository;
                String str = this.$profileId;
                this.label = 1;
                obj = voiceCallActivityRepository.selectVoicePipelineProfile(str, this);
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
            voicePipelineProfileState = (VoicePipelineProfileState) obj;
            BLG<VoicePipelineProfileState> blg = VoiceControlsSettingsViewModel.this._voicePipelineProfileState;
            if (voicePipelineProfileState == null) {
                blg.Af8(this.$previous);
                ToastApi.INSTANCE.showToast(R.string._name_removed__res_0x7f120684);
            } else {
                AnonymousClass001.A1E(blg, null, voicePipelineProfileState);
            }
            AnonymousClass003.A14(VoiceControlsSettingsViewModel.this._isSavingVoicePipelineProfile, false);
            boolean z = VoiceControlsSettingsViewModel.this.gateway.connectionState.getValue() instanceof HatchGatewayConnectionState.Connected;
            if (voicePipelineProfileState == null) {
                if (z) {
                    VoiceControlsSettingsViewModel voiceControlsSettingsViewModel = VoiceControlsSettingsViewModel.this;
                    this.L$0 = null;
                    this.label = 2;
                    if (voiceControlsSettingsViewModel.refreshVoicePipelineProfiles(this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                }
            } else if (!z) {
                VoiceControlsSettingsViewModel.this._voicePipelineProfileState.Af8(null);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C133451) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public VoiceControlsSettingsViewModel(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.userSession = abstractC3358CGz;
        int i = VoiceTelemetry.$stable;
        this.telemetry = new VoiceTelemetry(VoiceEntryPoint.SETTINGS, VoiceTelemetry.Page.SETTINGS);
        this.voiceCallRepository = new VoiceCallActivityRepository(abstractC3358CGz);
        this.voiceCatalogRepository = new VoiceCatalogRepository();
        this.selectionRepository = VoiceSelectionRepository.Companion.getInstance(abstractC3358CGz);
        this.voiceOnboardingRepository = new VoiceOnboardingRepository(abstractC3358CGz);
        this.gateway = HatchGatewayConnection.Companion.getInstance(abstractC3358CGz);
        C9286GCn c9286GCnA01 = HnJ.A01(readSelectedVoice());
        this._selectedVoice = c9286GCnA01;
        this.selectedVoice = C3cG.A11(c9286GCnA01);
        Integer num = C79.A00;
        C9290GCr c9290GCrA12 = C3cG.A12(num, 0, 1);
        this._resetSucceeded = c9290GCrA12;
        this.resetSucceeded = C3pd.A00(c9290GCrA12);
        C9286GCn c9286GCnA14 = C3cG.A14(0);
        this._greetingDelayMs = c9286GCnA14;
        this.greetingDelayMs = C3cG.A11(c9286GCnA14);
        C9286GCn c9286GCnA13 = C3cG.A13();
        this._voicePipelineProfileState = c9286GCnA13;
        this.voicePipelineProfileState = C3cG.A11(c9286GCnA13);
        C9286GCn c9286GCnA0v = AnonymousClass002.A0v(false);
        this._isSavingVoicePipelineProfile = c9286GCnA0v;
        this.isSavingVoicePipelineProfile = C3cG.A11(c9286GCnA0v);
        VoicePrefs voicePrefs = VoicePrefs.INSTANCE;
        C9286GCn c9286GCnA0v2 = AnonymousClass002.A0v(voicePrefs.getBackgroundingEnabled(abstractC3358CGz));
        this._backgroundingEnabled = c9286GCnA0v2;
        this.backgroundingEnabled = C3cG.A11(c9286GCnA0v2);
        C20Q<Boolean> c20qObserveLiveAvatarEnabled = voicePrefs.observeLiveAvatarEnabled(abstractC3358CGz, true);
        this.liveAvatarEnabled = AnonymousClass441.A00(Boolean.valueOf(voicePrefs.getLiveAvatarEnabled(abstractC3358CGz, true)), AEu.A00(this), c20qObserveLiveAvatarEnabled, new C3Es(5000L, LinkEncryptedPairingKt.LINK_COUNTER_MAX));
        this.pageRefreshGeneration = C3cG.A14(0);
        this.pageImpressionMetadata$delegate = AbstractC5321DgF.A03(new C133392());
        this.greetingWriteGeneration = new AtomicInteger(0);
        this.voiceSelectionGeneration = new AtomicInteger(0);
        BLL bllA00 = AEu.A00(this);
        AuraDispatchers auraDispatchers = AuraDispatchers.INSTANCE;
        GAo.A02(num, auraDispatchers.io(), new AnonymousClass2(null), AnonymousClass001.A0e(this, num, auraDispatchers.io(), new AnonymousClass1(null), bllA00));
    }

    public final void setVoicePipelineProfile(String str) {
        C7384Etj.A0Y(str, 0);
        VoicePipelineProfileState value = this._voicePipelineProfileState.getValue();
        if (value == null || AnonymousClass003.A1Z(this._isSavingVoicePipelineProfile)) {
            return;
        }
        if (!str.equals(value.selectedProfileId) || value.modified) {
            this._voicePipelineProfileState.Af8(value.copy(value.profiles, str, false));
            AnonymousClass003.A14(this._isSavingVoicePipelineProfile, true);
            HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SETTINGS, HatchSubsurface.VOICE_CONTROLS, HatchScreen.INTERNAL_SETTINGS, HatchComponent.VOICE_PIPELINE, null, null, null);
            HoC hoC = this.writeVoicePipelineProfileJob;
            if (hoC != null) {
                hoC.A5w(null);
            }
            BLL bllA00 = AEu.A00(this);
            this.writeVoicePipelineProfileJob = GAo.A02(C79.A00, AnonymousClass001.A0y(), new C133451(str, value, null), bllA00);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int currentGreetingDelayMs() {
        VoiceGating voiceGating = VoiceGating.INSTANCE;
        if (voiceGating.isGreetingDelayEnabled()) {
            return VoicePrefs.INSTANCE.getGreetingDelayMs(this.userSession, voiceGating.getGreetingDelayDefaultMs());
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<HatchMetadataKey, String> pageImpressionMetadata(boolean z) {
        HatchMetadataKey hatchMetadataKey = HatchMetadataKey.LIVE_AVATAR_AVAILABLE;
        VoiceGating voiceGating = VoiceGating.INSTANCE;
        return C3cH.A0m(HatchMetadataKey.EXPANDED_VIEW, VoiceControlsSettingsViewModelKt.telemetryValue(voiceGating.effectiveAvatarExpandedView(VoicePrefs.INSTANCE.getAvatarExpandedView(this.userSession))), C3cH.A0r(hatchMetadataKey, AnonymousClass002.A1Y(voiceGating.getEmbodimentOffReason())), C3cH.A0r(HatchMetadataKey.LIVE_AVATAR_ENABLED, z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VoiceOption readSelectedVoice() {
        String strSelectedVoiceName;
        VoicePrefs voicePrefs = VoicePrefs.INSTANCE;
        String strSelectedVoiceId = voicePrefs.selectedVoiceId(this.userSession);
        if (strSelectedVoiceId == null || (strSelectedVoiceName = voicePrefs.selectedVoiceName(this.userSession)) == null) {
            return null;
        }
        String strSelectedVoiceDescription = voicePrefs.selectedVoiceDescription(this.userSession);
        if (strSelectedVoiceDescription == null) {
            strSelectedVoiceDescription = "";
        }
        return new VoiceOption(strSelectedVoiceId, strSelectedVoiceName, strSelectedVoiceDescription, "", "", "");
    }

    private final void refreshSelectedVoiceFromServer() {
        HtJ htJA13 = AnonymousClass006.A13(this.refreshVoiceJob);
        BLL bllA00 = AEu.A00(this);
        this.refreshVoiceJob = GAo.A02(C79.A00, AnonymousClass001.A0y(), new C133411(htJA13), bllA00);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object refreshVoicePipelineProfiles(X.HtJ<? super kotlin.Unit> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.facebook.aura.partners.voice.viewmodel.VoiceControlsSettingsViewModel.C133421
            if (r0 == 0) goto L27
            r6 = r8
            com.facebook.aura.partners.voice.viewmodel.VoiceControlsSettingsViewModel$refreshVoicePipelineProfiles$1 r6 = (com.facebook.aura.partners.voice.viewmodel.VoiceControlsSettingsViewModel.C133421) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L27
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r5 = r6.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 0
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 != r1) goto L2d
            java.lang.Object r0 = r6.L$1
            X.BLG r0 = (X.BLG) r0
            java.lang.Object r3 = r6.L$0
            X.BLG r3 = (X.BLG) r3
            goto L59
        L27:
            com.facebook.aura.partners.voice.viewmodel.VoiceControlsSettingsViewModel$refreshVoicePipelineProfiles$1 r6 = new com.facebook.aura.partners.voice.viewmodel.VoiceControlsSettingsViewModel$refreshVoicePipelineProfiles$1
            r6.<init>(r8)
            goto L12
        L2d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L32:
            X.Hwg.A00(r5)
            com.facebook.aura.gateway.HatchGatewayConnection r0 = r7.gateway
            X.1BN<com.facebook.aura.gateway.HatchGatewayConnectionState> r0 = r0.connectionState
            java.lang.Object r0 = r0.getValue()
            boolean r0 = r0 instanceof com.facebook.aura.gateway.HatchGatewayConnectionState.Connected
            X.BLG<com.facebook.aura.partners.voice.api.VoicePipelineProfileState> r3 = r7._voicePipelineProfileState
            if (r0 != 0) goto L49
            r3.Af8(r4)
        L46:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
        L48:
            return r2
        L49:
            com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository r0 = r7.voiceCallRepository     // Catch: java.lang.Exception -> L60 java.util.concurrent.CancellationException -> L6d
            r6.L$0 = r3     // Catch: java.lang.Exception -> L60 java.util.concurrent.CancellationException -> L6d
            r6.L$1 = r3     // Catch: java.lang.Exception -> L60 java.util.concurrent.CancellationException -> L6d
            r6.label = r1     // Catch: java.lang.Exception -> L60 java.util.concurrent.CancellationException -> L6d
            java.lang.Object r5 = r0.fetchVoicePipelineProfiles(r6)     // Catch: java.lang.Exception -> L60 java.util.concurrent.CancellationException -> L6d
            if (r5 == r2) goto L48
            r0 = r3
            goto L5c
        L59:
            X.Hwg.A00(r5)     // Catch: java.lang.Exception -> L60 java.util.concurrent.CancellationException -> L6d
        L5c:
            com.facebook.aura.partners.voice.api.VoicePipelineProfileState r5 = (com.facebook.aura.partners.voice.api.VoicePipelineProfileState) r5     // Catch: java.lang.Exception -> L60 java.util.concurrent.CancellationException -> L6d
            r4 = r5
            goto L69
        L60:
            r2 = move-exception
            java.lang.String r1 = "Failed to load voice pipeline profiles"
            java.lang.String r0 = "VoiceControlsSettingsViewModel"
            X.CFK.A08(r0, r1, r2)
            r0 = r3
        L69:
            r0.Af8(r4)
            goto L46
        L6d:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.viewmodel.VoiceControlsSettingsViewModel.refreshVoicePipelineProfiles(X.HtJ):java.lang.Object");
    }

    public final C1BN<Boolean> getBackgroundingEnabled() {
        return this.backgroundingEnabled;
    }

    public final C1BN<Integer> getGreetingDelayMs() {
        return this.greetingDelayMs;
    }

    public final C1BN<Boolean> getLiveAvatarEnabled() {
        return this.liveAvatarEnabled;
    }

    public final C1BN<Map<HatchMetadataKey, String>> getPageImpressionMetadata() {
        return (C1BN) this.pageImpressionMetadata$delegate.getValue();
    }

    public final C22I<Boolean> getResetSucceeded() {
        return this.resetSucceeded;
    }

    public final C1BN<VoiceOption> getSelectedVoice() {
        return this.selectedVoice;
    }

    public final VoiceTelemetry getTelemetry() {
        return this.telemetry;
    }

    public final C1BN<VoicePipelineProfileState> getVoicePipelineProfileState() {
        return this.voicePipelineProfileState;
    }

    public final boolean isGreetingDelayEnabled() {
        return VoiceGating.INSTANCE.isGreetingDelayEnabled();
    }

    public final C1BN<Boolean> isSavingVoicePipelineProfile() {
        return this.isSavingVoicePipelineProfile;
    }

    @Override // X.AEs
    public void onCleared() {
        this.telemetry.endVisit(FeedInstructionsCardStoreKt.KEY_DISMISSED);
        HoC hoC = this.resetJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        HoC hoC2 = this.refreshGreetingJob;
        if (hoC2 != null) {
            hoC2.A5w(null);
        }
        HoC hoC3 = this.refreshVoiceJob;
        if (hoC3 != null) {
            hoC3.A5w(null);
        }
        HoC hoC4 = this.writeGreetingJob;
        if (hoC4 != null) {
            hoC4.A5w(null);
        }
        HoC hoC5 = this.writeVoicePipelineProfileJob;
        if (hoC5 != null) {
            hoC5.A5w(null);
        }
    }

    public final void onOpenVoiceList() {
        if (this.telemetry.getHasActiveVisit()) {
            this.telemetry.interaction(VoiceTelemetry.Interaction.CLICK, HatchComponent.VOICE_SETTINGS_OPEN_VOICE_LIST, AnonymousClass006.A10(HatchMetadataKey.SELECTION_KNOWN, String.valueOf(AnonymousClass002.A1X(this._selectedVoice.getValue()))), null);
            this.telemetry.endVisit("navigation");
        }
    }

    public final void refresh() {
        HoC hoC = this.resetJob;
        if (hoC == null || !hoC.isActive()) {
            BLG<Integer> blg = this.pageRefreshGeneration;
            C9286GCn.A00(null, Integer.valueOf(AnonymousClass001.A0F(blg.getValue()) + 1), (C9286GCn) blg);
            this._selectedVoice.Af8(readSelectedVoice());
            AnonymousClass001.A1E(this._greetingDelayMs, null, Integer.valueOf(currentGreetingDelayMs()));
            refreshSelectedVoiceFromServer();
            if (VoiceGating.INSTANCE.isGreetingDelayEnabled()) {
                HoC hoC2 = this.writeGreetingJob;
                if (hoC2 == null || !hoC2.isActive()) {
                    HoC hoC3 = this.refreshGreetingJob;
                    if (hoC3 != null) {
                        hoC3.A5w(null);
                    }
                    BLL bllA00 = AEu.A00(this);
                    this.refreshGreetingJob = GAo.A02(C79.A00, AnonymousClass001.A0y(), new C133401(null), bllA00);
                }
            }
        }
    }

    public final void resetOnboarding() {
        this.voiceSelectionGeneration.incrementAndGet();
        VoiceOption value = this._selectedVoice.getValue();
        this._selectedVoice.Af8(null);
        HoC hoC = this.refreshVoiceJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        HoC hoC2 = this.resetJob;
        if (hoC2 != null) {
            hoC2.A5w(null);
        }
        BLL bllA00 = AEu.A00(this);
        this.resetJob = GAo.A02(C79.A00, AnonymousClass001.A0y(), new C133431(value, null), bllA00);
    }

    public final void setBackgroundingEnabled(boolean z) {
        VoicePrefs voicePrefs = VoicePrefs.INSTANCE;
        boolean backgroundingEnabled = voicePrefs.getBackgroundingEnabled(this.userSession);
        if (this.telemetry.getHasActiveVisit()) {
            this.telemetry.interaction(z ? VoiceTelemetry.Interaction.TOGGLE_ON : VoiceTelemetry.Interaction.TOGGLE_OFF, HatchComponent.VOICE_SETTINGS_BACKGROUNDING_TOGGLE, AnonymousClass007.A0d(HatchMetadataKey.NEW_VALUE, String.valueOf(z), C3cH.A0r(HatchMetadataKey.OLD_VALUE, backgroundingEnabled)), null);
        }
        AnonymousClass004.A1D(z, this._backgroundingEnabled);
        voicePrefs.setBackgroundingEnabled(this.userSession, z);
    }

    public final void setGreetingDelayMs(int i) {
        if (VoiceGating.INSTANCE.isGreetingDelayEnabled()) {
            this.greetingWriteGeneration.incrementAndGet();
            VoicePrefs.INSTANCE.setGreetingDelayMs(this.userSession, i);
            int iCurrentGreetingDelayMs = currentGreetingDelayMs();
            C9286GCn.A00(null, Integer.valueOf(iCurrentGreetingDelayMs), (C9286GCn) this._greetingDelayMs);
            HoC hoC = this.refreshGreetingJob;
            if (hoC != null) {
                hoC.A5w(null);
            }
            HoC hoC2 = this.writeGreetingJob;
            if (hoC2 != null) {
                hoC2.A5w(null);
            }
            BLL bllA00 = AEu.A00(this);
            this.writeGreetingJob = GAo.A02(C79.A00, AnonymousClass001.A0y(), new C133441(iCurrentGreetingDelayMs, null), bllA00);
        }
    }

    public final void setLiveAvatarEnabled(boolean z) {
        VoicePrefs voicePrefs = VoicePrefs.INSTANCE;
        boolean liveAvatarEnabled = voicePrefs.getLiveAvatarEnabled(this.userSession, true);
        if (this.telemetry.getHasActiveVisit()) {
            this.telemetry.interaction(z ? VoiceTelemetry.Interaction.TOGGLE_ON : VoiceTelemetry.Interaction.TOGGLE_OFF, HatchComponent.VOICE_SETTINGS_LIVE_AVATAR_TOGGLE, C3cH.A0m(HatchMetadataKey.EXPANDED_VIEW, VoiceControlsSettingsViewModelKt.telemetryValue(voicePrefs.getAvatarExpandedView(this.userSession)), C3cH.A0r(HatchMetadataKey.PREVIOUS_VALUE, liveAvatarEnabled), C3cH.A0r(HatchMetadataKey.NEW_VALUE, z)), null);
        }
        voicePrefs.setLiveAvatarEnabled(this.userSession, z);
    }
}
