package com.facebook.aura.devices.pairing;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BLG;
import X.C1BN;
import X.C3UX;
import X.C3cG;
import X.C3cI;
import X.C60O;
import X.C60P;
import X.C7384Etj;
import X.C78T;
import X.C7Bq;
import X.C8j4;
import X.C9258GBl;
import X.C9286GCn;
import X.C9jH;
import X.CFK;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.GAo;
import X.HnJ;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.HxE;
import X.HzP;
import X.InterfaceC10560Hsz;
import X.InterfaceC2261BLa;
import android.content.Context;
import android.os.SystemClock;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.common.prefs.HatchDeveloperMode;
import com.facebook.aura.devices.intf.ClaimedDeviceRow;
import com.facebook.aura.devices.intf.LinkSetupHandoff;
import com.facebook.aura.devices.intf.LinkTokenOnlySetup;
import com.facebook.aura.devices.intf.LinkTokenOnlySetups;
import com.facebook.aura.devices.pairing.HatchDevicePairingEffect;
import com.facebook.aura.devices.pairing.HatchDevicePairingEvent;
import com.facebook.aura.devices.pairing.HatchLinkOtaRepairState;
import com.facebook.aura.devices.pairing.logging.HatchDevicePairingAnalytics;
import com.facebook.aura.devices.pairing.logging.HatchDevicePairingAttempt;
import com.facebook.aura.devices.pairing.logging.HatchDevicePairingFailureReason;
import com.facebook.aura.devices.pairing.logging.HatchDevicePairingMode;
import com.facebook.aura.devices.pairing.logging.HatchDevicePairingPoint;
import com.facebook.aura.devices.pairing.logging.HatchDevicePairingSetupProtocol;
import com.facebook.aura.devices.pairing.logging.HatchDevicePairingTriggerSource;
import com.facebook.aura.devices.pairing.logging.HatchDevicePairingUserFlowLogger;
import com.facebook.aura.devices.token.LinkDeviceKeyRecord;
import com.facebook.aura.devices.token.LinkDeviceKeys;
import com.facebook.aura.devices.token.LinkSdkTokenFailure;
import com.facebook.aura.executors.AuraDispatchers;
import com.facebook.aura.file.utils.HtmlPdfRenderer;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.wearablebroadcast.MC;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchDevicePairingViewModel extends AEs implements HatchDevicePairingActions {
    public static final int $stable = 8;
    public final BLG<AuraNavKey> _claimedDeviceDestination;
    public final BLG<HatchDevicePairingViewState> _uiState;
    public final Context appContext;
    public final C1BN<AuraNavKey> claimedDeviceDestination;
    public final HatchDeviceFamily deviceFamily;
    public boolean hasLoggedPrepairingFailure;
    public boolean hasStartedPairing;
    public boolean isOtaRoundTwoDelivered;
    public LinkEncryptedSetupCoordinator linkSetupCoordinator;
    public HoC linkSetupJob;
    public HatchDevicePairingMachineState machineState;
    public final Set<String> mintedDeviceKeyIds;
    public long nextLinkConfirmationRequestId;
    public Long otaRoundTwoDeadlineMs;
    public HoC otaRoundTwoWatchdog;
    public HatchDeviceBleManager pairingBleManager;
    public HatchDevicePairingUserFlowLogger pairingLogger;
    public InterfaceC10560Hsz<Boolean> pendingDeviceKeyReplacement;
    public InterfaceC10560Hsz<Boolean> pendingLinkConfirmation;
    public HxE<String, String> provisionedWifi;
    public String provisioningAddress;
    public HoC provisioningAuthJob;
    public final InterfaceC2261BLa savedWifiLock;
    public final HatchSavedWifiNetworkStore savedWifiNetworks;
    public Map<String, String> savedWifiPasswords;
    public long scanGeneration;
    public Function0<Unit> startPairingLogger;
    public final HatchDevicePairingStateMachine stateMachine;
    public final C1BN<HatchDevicePairingViewState> uiState;
    public final LinkUnconfirmedTokens unconfirmedTokens;
    public final AbstractC3358CGz userSession;

    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Map<String, ? extends String>> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Map<String, ? extends String> invoke() {
            return HatchDevicePairingViewModel.this.savedWifiNetworks.snapshot();
        }
    }

    public final class Factory extends AuraViewModelFactory<HatchDevicePairingViewModel> {
        public static final int $stable = 8;
        public final Context appContext;
        public final HatchDeviceFamily deviceFamily;
        public final AbstractC3358CGz userSession;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public HatchDevicePairingViewModel create() {
            return new HatchDevicePairingViewModel(this.appContext, this.userSession, this.deviceFamily);
        }

        public Factory(Context context, AbstractC3358CGz abstractC3358CGz, HatchDeviceFamily hatchDeviceFamily) {
            AnonymousClass005.A0x(context, abstractC3358CGz, hatchDeviceFamily);
            this.appContext = context;
            this.userSession = abstractC3358CGz;
            this.deviceFamily = hatchDeviceFamily;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.pairing.HatchDevicePairingViewModel", f = "HatchDevicePairingViewModel.kt", l = {HtmlPdfRenderer.PAGE_WIDTH}, m = "awaitLinkConfirmation", v = 2)
    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingViewModel$awaitLinkConfirmation$1, reason: invalid class name and case insensitive filesystem */
    public final class C116531 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C116531(HtJ<? super C116531> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchDevicePairingViewModel.this.awaitLinkConfirmation(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.pairing.HatchDevicePairingViewModel", f = "HatchDevicePairingViewModel.kt", l = {616}, m = "confirmDeviceKeyReplacement", v = 2)
    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingViewModel$confirmDeviceKeyReplacement$1, reason: invalid class name and case insensitive filesystem */
    public final class C116541 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C116541(HtJ<? super C116541> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchDevicePairingViewModel.this.confirmDeviceKeyReplacement(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.pairing.HatchDevicePairingViewModel$establishLinkPairingEffect$1", f = "HatchDevicePairingViewModel.kt", l = {900}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingViewModel$establishLinkPairingEffect$1, reason: invalid class name and case insensitive filesystem */
    public final class C116551 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ LinkEncryptedSetupCoordinator $coordinator;
        public final /* synthetic */ HatchDevicePairingUserFlowLogger $logger;
        public int label;
        public final /* synthetic */ HatchDevicePairingViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116551(LinkEncryptedSetupCoordinator linkEncryptedSetupCoordinator, HatchDevicePairingViewModel hatchDevicePairingViewModel, HatchDevicePairingUserFlowLogger hatchDevicePairingUserFlowLogger, HtJ<? super C116551> htJ) {
            super(2, htJ);
            this.$coordinator = linkEncryptedSetupCoordinator;
            this.this$0 = hatchDevicePairingViewModel;
            this.$logger = hatchDevicePairingUserFlowLogger;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C116551(this.$coordinator, this.this$0, this.$logger, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                LinkEncryptedSetupCoordinator linkEncryptedSetupCoordinator = this.$coordinator;
                this.label = 1;
                obj = linkEncryptedSetupCoordinator.establishEncryptedSetup(this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            this.this$0.dispatch(new HatchDevicePairingEvent.LinkPairingEstablishmentFinished(AnonymousClass001.A1X(obj), this.$coordinator.wifiRequirement()), this.$logger);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C116551) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingViewModel$forgetWifiPassword$1, reason: invalid class name and case insensitive filesystem */
    public final class C116561 extends AbstractC7559F3s implements Function0<Map<String, ? extends String>> {
        public final /* synthetic */ String $ssid;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116561(String str) {
            super(0);
            this.$ssid = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Map<String, ? extends String> invoke() {
            return HatchDevicePairingViewModel.this.savedWifiNetworks.forget(this.$ssid);
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingViewModel$getOrCreateLinkSetupCoordinator$1, reason: invalid class name and case insensitive filesystem */
    public final class C116571 extends AbstractC7559F3s implements G0U<LinkDeviceVerification, Unit> {
        public final /* synthetic */ HatchDevicePairingUserFlowLogger $logger;
        public final /* synthetic */ HatchDevicePairingViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116571(HatchDevicePairingUserFlowLogger hatchDevicePairingUserFlowLogger, HatchDevicePairingViewModel hatchDevicePairingViewModel) {
            super(1);
            this.$logger = hatchDevicePairingUserFlowLogger;
            this.this$0 = hatchDevicePairingViewModel;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(LinkDeviceVerification linkDeviceVerification) {
            if (linkDeviceVerification == null) {
                HatchDevicePairingUserFlowLogger hatchDevicePairingUserFlowLogger = this.$logger;
                HatchDevicePairingViewModel hatchDevicePairingViewModel = this.this$0;
                if (hatchDevicePairingUserFlowLogger == hatchDevicePairingViewModel.pairingLogger) {
                    InterfaceC10560Hsz<Boolean> interfaceC10560Hsz = hatchDevicePairingViewModel.pendingLinkConfirmation;
                    if (interfaceC10560Hsz != null) {
                        C8j4.A1S(false, interfaceC10560Hsz);
                    }
                    this.this$0.dispatch(new HatchDevicePairingEvent.LinkAppConfirmationChanged(null), this.$logger);
                }
            }
            if (linkDeviceVerification == LinkDeviceVerification.COMMUNITY) {
                HatchDevicePairingViewModel hatchDevicePairingViewModel2 = this.this$0;
                hatchDevicePairingViewModel2.dispatch(new HatchDevicePairingEvent.DeveloperModeChanged(HatchDeveloperMode.INSTANCE.isEnabled(hatchDevicePairingViewModel2.userSession)), this.$logger);
            }
            this.this$0.dispatch(new HatchDevicePairingEvent.LinkDeviceVerificationChanged(linkDeviceVerification), this.$logger);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(LinkDeviceVerification linkDeviceVerification) {
            invoke2(linkDeviceVerification);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.pairing.HatchDevicePairingViewModel$getOrCreateLinkSetupCoordinator$2", f = "HatchDevicePairingViewModel.kt", l = {513}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingViewModel$getOrCreateLinkSetupCoordinator$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0U<HtJ<? super Boolean>, Object> {
        public final /* synthetic */ HatchDevicePairingUserFlowLogger $logger;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchDevicePairingUserFlowLogger hatchDevicePairingUserFlowLogger, HtJ<? super AnonymousClass2> htJ) {
            super(1, htJ);
            this.$logger = hatchDevicePairingUserFlowLogger;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return HatchDevicePairingViewModel.this.new AnonymousClass2(this.$logger, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchDevicePairingViewModel hatchDevicePairingViewModel = HatchDevicePairingViewModel.this;
                HatchDevicePairingUserFlowLogger hatchDevicePairingUserFlowLogger = this.$logger;
                HatchDevicePairingStep hatchDevicePairingStep = HatchDevicePairingStep.LINK_BUTTON_CONFIRMATION;
                this.label = 1;
                obj = hatchDevicePairingViewModel.awaitLinkConfirmation(hatchDevicePairingUserFlowLogger, hatchDevicePairingStep, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return obj;
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Boolean> htJ) {
            return ((AnonymousClass2) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.pairing.HatchDevicePairingViewModel$getOrCreateLinkSetupCoordinator$3", f = "HatchDevicePairingViewModel.kt", l = {MC.wearables_hatch.__CONFIG__}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingViewModel$getOrCreateLinkSetupCoordinator$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0U<HtJ<? super Boolean>, Object> {
        public final /* synthetic */ HatchDevicePairingUserFlowLogger $logger;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(HatchDevicePairingUserFlowLogger hatchDevicePairingUserFlowLogger, HtJ<? super AnonymousClass3> htJ) {
            super(1, htJ);
            this.$logger = hatchDevicePairingUserFlowLogger;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return HatchDevicePairingViewModel.this.new AnonymousClass3(this.$logger, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchDevicePairingViewModel hatchDevicePairingViewModel = HatchDevicePairingViewModel.this;
                HatchDevicePairingUserFlowLogger hatchDevicePairingUserFlowLogger = this.$logger;
                HatchDevicePairingStep hatchDevicePairingStep = HatchDevicePairingStep.LINK_INFO;
                this.label = 1;
                obj = hatchDevicePairingViewModel.awaitLinkConfirmation(hatchDevicePairingUserFlowLogger, hatchDevicePairingStep, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return obj;
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Boolean> htJ) {
            return ((AnonymousClass3) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingViewModel$getOrCreateLinkSetupCoordinator$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0U<String, Unit> {
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            C7384Etj.A0Y(str, 0);
            HatchDeveloperMode.INSTANCE.markCommunityDevice(HatchDevicePairingViewModel.this.userSession, str);
        }

        public AnonymousClass4() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingViewModel$getOrCreateLinkSetupCoordinator$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0U<LinkSdkTokenFailure, Unit> {
        public final /* synthetic */ HatchDevicePairingUserFlowLogger $logger;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(LinkSdkTokenFailure linkSdkTokenFailure) {
            C7384Etj.A0Y(linkSdkTokenFailure, 0);
            HatchDevicePairingViewModel.this.dispatch(new HatchDevicePairingEvent.LinkSdkTokenFailed(linkSdkTokenFailure), this.$logger);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(HatchDevicePairingUserFlowLogger hatchDevicePairingUserFlowLogger) {
            super(1);
            this.$logger = hatchDevicePairingUserFlowLogger;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(LinkSdkTokenFailure linkSdkTokenFailure) {
            invoke2(linkSdkTokenFailure);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingViewModel$getOrCreateLinkSetupCoordinator$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0U<LinkSetupRefusal, Unit> {
        public final /* synthetic */ HatchDevicePairingUserFlowLogger $logger;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(LinkSetupRefusal linkSetupRefusal) {
            C7384Etj.A0Y(linkSetupRefusal, 0);
            HatchDevicePairingViewModel.this.dispatch(new HatchDevicePairingEvent.LinkSetupRefused(linkSetupRefusal), this.$logger);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(HatchDevicePairingUserFlowLogger hatchDevicePairingUserFlowLogger) {
            super(1);
            this.$logger = hatchDevicePairingUserFlowLogger;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(LinkSetupRefusal linkSetupRefusal) {
            invoke2(linkSetupRefusal);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.pairing.HatchDevicePairingViewModel$getOrCreateLinkSetupCoordinator$7", f = "HatchDevicePairingViewModel.kt", l = {532}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingViewModel$getOrCreateLinkSetupCoordinator$7, reason: invalid class name */
    public final class AnonymousClass7 extends AbstractC07127nr implements G0V<String, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ HatchDeviceBleManager $manager;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public int label;
        public final /* synthetic */ HatchDevicePairingViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(HatchDeviceBleManager hatchDeviceBleManager, HatchDevicePairingViewModel hatchDevicePairingViewModel, HtJ<? super AnonymousClass7> htJ) {
            super(2, htJ);
            this.$manager = hatchDeviceBleManager;
            this.this$0 = hatchDevicePairingViewModel;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass7 anonymousClass7 = new AnonymousClass7(this.$manager, this.this$0, htJ);
            anonymousClass7.L$0 = obj;
            return anonymousClass7;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            LinkTokenOnlySetup linkTokenOnlySetupResolve;
            String str = (String) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                String str2 = this.$manager.connectedDeviceAddress;
                if (str2 != null && (linkTokenOnlySetupResolve = LinkTokenOnlySetups.INSTANCE.resolve()) != null) {
                    AbstractC3358CGz abstractC3358CGz = this.this$0.userSession;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    obj = linkTokenOnlySetupResolve.holdsSetup(abstractC3358CGz, str2, str, this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                }
                return Boolean.valueOf(z);
            }
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            boolean z = AnonymousClass001.A1X(obj);
            return Boolean.valueOf(z);
        }

        @Override // X.G0V
        public final Object invoke(String str, HtJ<? super Boolean> htJ) {
            return ((AnonymousClass7) create(str, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.pairing.HatchDevicePairingViewModel$getOrCreateLinkSetupCoordinator$8", f = "HatchDevicePairingViewModel.kt", l = {536}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingViewModel$getOrCreateLinkSetupCoordinator$8, reason: invalid class name */
    public final class AnonymousClass8 extends AbstractC07127nr implements G0V<LinkDeviceKeyRecord, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ HatchDevicePairingUserFlowLogger $logger;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(HatchDevicePairingUserFlowLogger hatchDevicePairingUserFlowLogger, HtJ<? super AnonymousClass8> htJ) {
            super(2, htJ);
            this.$logger = hatchDevicePairingUserFlowLogger;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass8 anonymousClass8 = HatchDevicePairingViewModel.this.new AnonymousClass8(this.$logger, htJ);
            anonymousClass8.L$0 = obj;
            return anonymousClass8;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws Throwable {
            LinkDeviceKeyRecord linkDeviceKeyRecord = (LinkDeviceKeyRecord) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchDevicePairingViewModel hatchDevicePairingViewModel = HatchDevicePairingViewModel.this;
                HatchDevicePairingUserFlowLogger hatchDevicePairingUserFlowLogger = this.$logger;
                this.L$0 = null;
                this.label = 1;
                obj = hatchDevicePairingViewModel.confirmDeviceKeyReplacement(hatchDevicePairingUserFlowLogger, linkDeviceKeyRecord, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return obj;
        }

        @Override // X.G0V
        public final Object invoke(LinkDeviceKeyRecord linkDeviceKeyRecord, HtJ<? super Boolean> htJ) {
            return ((AnonymousClass8) create(linkDeviceKeyRecord, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingViewModel$getOrCreateLinkSetupCoordinator$9, reason: invalid class name */
    public final class AnonymousClass9 extends AbstractC7559F3s implements G0U<LinkDeviceKeySetupFailure, Unit> {
        public final /* synthetic */ HatchDevicePairingUserFlowLogger $logger;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(LinkDeviceKeySetupFailure linkDeviceKeySetupFailure) {
            C7384Etj.A0Y(linkDeviceKeySetupFailure, 0);
            HatchDevicePairingViewModel.this.dispatch(new HatchDevicePairingEvent.LinkDeviceKeySetupFailed(linkDeviceKeySetupFailure), this.$logger);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(HatchDevicePairingUserFlowLogger hatchDevicePairingUserFlowLogger) {
            super(1);
            this.$logger = hatchDevicePairingUserFlowLogger;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(LinkDeviceKeySetupFailure linkDeviceKeySetupFailure) {
            invoke2(linkDeviceKeySetupFailure);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.pairing.HatchDevicePairingViewModel$loadSavedWifiNetworks$1", f = "HatchDevicePairingViewModel.kt", l = {995, 138}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingViewModel$loadSavedWifiNetworks$1, reason: invalid class name and case insensitive filesystem */
    public final class C116581 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Function0<Map<String, String>> $read;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C116581(Function0<? extends Map<String, String>> function0, HtJ<? super C116581> htJ) {
            super(2, htJ);
            this.$read = function0;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchDevicePairingViewModel.this.new C116581(this.$read, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws Throwable {
            HatchDevicePairingViewModel hatchDevicePairingViewModel;
            InterfaceC2261BLa interfaceC2261BLa;
            Function0<Map<String, String>> function0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    hatchDevicePairingViewModel = HatchDevicePairingViewModel.this;
                    interfaceC2261BLa = hatchDevicePairingViewModel.savedWifiLock;
                    function0 = this.$read;
                    this.L$0 = interfaceC2261BLa;
                    this.L$1 = hatchDevicePairingViewModel;
                    this.L$2 = function0;
                    this.label = 1;
                    if (interfaceC2261BLa.APs(null, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw AnonymousClass001.A0n();
                        }
                        hatchDevicePairingViewModel = (HatchDevicePairingViewModel) this.L$1;
                        interfaceC2261BLa = (InterfaceC2261BLa) this.L$0;
                        try {
                            Hwg.A00(obj);
                            Map<String, String> map = (Map) obj;
                            hatchDevicePairingViewModel.savedWifiPasswords = map;
                            HatchDevicePairingViewModel.dispatch$default(hatchDevicePairingViewModel, new HatchDevicePairingEvent.SavedWifiNetworksChanged(map.keySet()), null, 2, null);
                            Unit unit = Unit.INSTANCE;
                            interfaceC2261BLa.Ahe(null);
                            return unit;
                        } catch (Throwable th) {
                            th = th;
                            interfaceC2261BLa.Ahe(null);
                            throw th;
                        }
                    }
                    function0 = (Function0) this.L$2;
                    hatchDevicePairingViewModel = (HatchDevicePairingViewModel) this.L$1;
                    interfaceC2261BLa = (InterfaceC2261BLa) this.L$0;
                    Hwg.A00(obj);
                }
                C78T c78tA0y = AnonymousClass001.A0y();
                HatchDevicePairingViewModel$loadSavedWifiNetworks$1$1$saved$1 hatchDevicePairingViewModel$loadSavedWifiNetworks$1$1$saved$1 = new HatchDevicePairingViewModel$loadSavedWifiNetworks$1$1$saved$1(function0, null);
                this.L$0 = interfaceC2261BLa;
                this.L$1 = hatchDevicePairingViewModel;
                this.L$2 = null;
                this.label = 2;
                obj = GAo.A00(this, c78tA0y, hatchDevicePairingViewModel$loadSavedWifiNetworks$1$1$saved$1);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
                Map<String, String> map2 = (Map) obj;
                hatchDevicePairingViewModel.savedWifiPasswords = map2;
                HatchDevicePairingViewModel.dispatch$default(hatchDevicePairingViewModel, new HatchDevicePairingEvent.SavedWifiNetworksChanged(map2.keySet()), null, 2, null);
                Unit unit2 = Unit.INSTANCE;
                interfaceC2261BLa.Ahe(null);
                return unit2;
            } catch (Throwable th2) {
                th = th2;
                interfaceC2261BLa.Ahe(null);
                throw th;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C116581) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingViewModel$pairingBleListener$1, reason: invalid class name and case insensitive filesystem */
    public final class C116591 implements HatchDeviceBleListener {
        public final /* synthetic */ long $generation;
        public final /* synthetic */ HatchDevicePairingUserFlowLogger $logger;

        @Override // com.facebook.aura.devices.pairing.HatchDeviceBleListener
        public void onDebugLog(String str) {
        }

        @Override // com.facebook.aura.devices.pairing.HatchDeviceBleListener
        public /* bridge */ void onDeviceInfo(String str) {
        }

        @Override // com.facebook.aura.devices.pairing.HatchDeviceBleListener
        public void onDeviceReportedStatus(String str) {
            LinkEncryptedSetupCoordinator linkEncryptedSetupCoordinator;
            C7384Etj.A0Y(str, 0);
            long j = this.$generation;
            HatchDevicePairingViewModel hatchDevicePairingViewModel = HatchDevicePairingViewModel.this;
            if (j != hatchDevicePairingViewModel.scanGeneration || (linkEncryptedSetupCoordinator = hatchDevicePairingViewModel.linkSetupCoordinator) == null) {
                return;
            }
            linkEncryptedSetupCoordinator.onDeviceReportedStatus(str);
        }

        @Override // com.facebook.aura.devices.pairing.HatchDeviceBleListener
        public void onDevicesDiscovered(List<HatchDiscoveredDevice> list) {
            C7384Etj.A0Y(list, 0);
            HatchDevicePairingViewModel.this.dispatch(new HatchDevicePairingEvent.DevicesDiscovered(list), this.$logger);
        }

        @Override // com.facebook.aura.devices.pairing.HatchDeviceBleListener
        public void onLinkSetupServiceMissing(String str) {
            C7384Etj.A0Y(str, 0);
            HatchDevicePairingViewModel.this.refuseGadgetSetup(str, this.$logger);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
        @Override // com.facebook.aura.devices.pairing.HatchDeviceBleListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onProvisioningStatusChanged(com.facebook.aura.devices.pairing.HatchDeviceProvisioningStatus r4) {
            /*
                r3 = this;
                r0 = 0
                X.C7384Etj.A0Y(r4, r0)
                com.facebook.aura.devices.pairing.HatchDevicePairingLoggingHelper r1 = com.facebook.aura.devices.pairing.HatchDevicePairingLoggingHelper.INSTANCE
                com.facebook.aura.devices.pairing.logging.HatchDevicePairingUserFlowLogger r0 = r3.$logger
                r1.logProvisioningStatus(r0, r4)
                com.facebook.aura.devices.pairing.HatchDeviceProvisioningStatus r0 = com.facebook.aura.devices.pairing.HatchDeviceProvisioningStatus.AUTH_OK
                if (r4 != r0) goto L30
                com.facebook.aura.devices.pairing.logging.HatchDevicePairingUserFlowLogger r2 = r3.$logger
                com.facebook.aura.devices.pairing.HatchDevicePairingViewModel r1 = com.facebook.aura.devices.pairing.HatchDevicePairingViewModel.this
                com.facebook.aura.devices.pairing.logging.HatchDevicePairingUserFlowLogger r0 = r1.pairingLogger
                if (r2 != r0) goto L30
                boolean r0 = com.facebook.aura.devices.pairing.HatchDevicePairingViewModel.access$completeHandoff(r1)
                if (r0 != 0) goto L30
                com.facebook.aura.devices.pairing.logging.HatchDevicePairingUserFlowLogger r1 = r3.$logger
                if (r1 == 0) goto L26
                com.facebook.aura.devices.pairing.logging.HatchDevicePairingFailureReason r0 = com.facebook.aura.devices.pairing.logging.HatchDevicePairingFailureReason.DEVICE_TOKEN_FAILED
                r1.recordError(r0)
            L26:
                com.facebook.aura.devices.pairing.HatchDevicePairingViewModel r2 = com.facebook.aura.devices.pairing.HatchDevicePairingViewModel.this
                com.facebook.aura.devices.pairing.HatchDevicePairingEvent$LinkSetupHandoffFailed r1 = com.facebook.aura.devices.pairing.HatchDevicePairingEvent.LinkSetupHandoffFailed.INSTANCE
            L2a:
                com.facebook.aura.devices.pairing.logging.HatchDevicePairingUserFlowLogger r0 = r3.$logger
                com.facebook.aura.devices.pairing.HatchDevicePairingViewModel.access$dispatch(r2, r1, r0)
                return
            L30:
                com.facebook.aura.devices.pairing.logging.HatchDevicePairingUserFlowLogger r1 = r3.$logger
                com.facebook.aura.devices.pairing.HatchDevicePairingViewModel r2 = com.facebook.aura.devices.pairing.HatchDevicePairingViewModel.this
                com.facebook.aura.devices.pairing.logging.HatchDevicePairingUserFlowLogger r0 = r2.pairingLogger
                if (r1 != r0) goto L45
                int r1 = r4.ordinal()
                r0 = 5
                if (r1 == r0) goto L4d
                r0 = 3
                if (r1 != r0) goto L45
                com.facebook.aura.devices.pairing.HatchDevicePairingViewModel.access$forgetWifiPassword(r2)
            L45:
                com.facebook.aura.devices.pairing.HatchDevicePairingViewModel r2 = com.facebook.aura.devices.pairing.HatchDevicePairingViewModel.this
                com.facebook.aura.devices.pairing.HatchDevicePairingEvent$ProvisioningStatusChanged r1 = new com.facebook.aura.devices.pairing.HatchDevicePairingEvent$ProvisioningStatusChanged
                r1.<init>(r4)
                goto L2a
            L4d:
                com.facebook.aura.devices.pairing.HatchDevicePairingViewModel.access$saveWifiPassword(r2)
                goto L45
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.pairing.HatchDevicePairingViewModel.C116591.onProvisioningStatusChanged(com.facebook.aura.devices.pairing.HatchDeviceProvisioningStatus):void");
        }

        @Override // com.facebook.aura.devices.pairing.HatchDeviceBleListener
        public void onStateChanged(HatchDeviceBleState hatchDeviceBleState, String str, Integer num) {
            C7384Etj.A0Y(hatchDeviceBleState, 0);
            if (hatchDeviceBleState == HatchDeviceBleState.NOT_FOUND) {
                HatchDevicePairingViewModel.recordPrepairingFailure$default(HatchDevicePairingViewModel.this, HatchDevicePairingAnalytics.FailureReason.DEVICE_NOT_FOUND, null, this.$logger, this.$generation, 2, null);
            }
            HatchDevicePairingLoggingHelper.INSTANCE.logBleState(this.$logger, hatchDeviceBleState, HatchDevicePairingViewModel.this.machineState);
            HatchDevicePairingViewModel.this.dispatch(new HatchDevicePairingEvent.BleStateChanged(hatchDeviceBleState, str), this.$logger);
        }

        @Override // com.facebook.aura.devices.pairing.HatchDeviceBleListener
        public void onWiFiScanResult(List<HatchDeviceWiFiNetwork> list) {
            C7384Etj.A0Y(list, 0);
            HatchDevicePairingUserFlowLogger hatchDevicePairingUserFlowLogger = this.$logger;
            if (hatchDevicePairingUserFlowLogger != null) {
                hatchDevicePairingUserFlowLogger.markPoint(HatchDevicePairingPoint.WIFI_SCAN_COMPLETED);
            }
            HatchDevicePairingViewModel.this.dispatch(new HatchDevicePairingEvent.WifiScanResult(list), this.$logger);
        }

        /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingViewModel$pairingBleListener$1$WhenMappings */
        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[HatchDeviceProvisioningStatus.values().length];
                try {
                    AnonymousClass002.A13(HatchDeviceProvisioningStatus.AUTH_OK, iArr);
                } catch (NoSuchFieldError unused) {
                }
                try {
                    AnonymousClass002.A14(HatchDeviceProvisioningStatus.WIFI_FAILED, iArr);
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public C116591(HatchDevicePairingUserFlowLogger hatchDevicePairingUserFlowLogger, long j) {
            this.$logger = hatchDevicePairingUserFlowLogger;
            this.$generation = j;
        }

        @Override // com.facebook.aura.devices.pairing.HatchDeviceBleListener
        public void onBleScanError() {
            if (AnonymousClass002.A1b(HatchDevicePairingViewModel.this.recordMissingBlePermissions(this.$logger, this.$generation), false)) {
                HatchDevicePairingViewModel.recordPrepairingFailure$default(HatchDevicePairingViewModel.this, HatchDevicePairingAnalytics.FailureReason.BLE_SCAN_FAILED, null, this.$logger, this.$generation, 2, null);
            }
            HatchDevicePairingUserFlowLogger hatchDevicePairingUserFlowLogger = this.$logger;
            if (hatchDevicePairingUserFlowLogger != null) {
                hatchDevicePairingUserFlowLogger.recordError(HatchDevicePairingFailureReason.BLE_SCAN_FAILED);
            }
        }

        @Override // com.facebook.aura.devices.pairing.HatchDeviceBleListener
        public void onBluetoothUnavailable() {
            HatchDevicePairingViewModel.recordPrepairingFailure$default(HatchDevicePairingViewModel.this, HatchDevicePairingAnalytics.FailureReason.BLUETOOTH_OFF, null, this.$logger, this.$generation, 2, null);
            HatchDevicePairingUserFlowLogger hatchDevicePairingUserFlowLogger = this.$logger;
            if (hatchDevicePairingUserFlowLogger != null) {
                hatchDevicePairingUserFlowLogger.recordError(HatchDevicePairingFailureReason.BLUETOOTH_OFF);
            }
        }

        @Override // com.facebook.aura.devices.pairing.HatchDeviceBleListener
        public boolean onLinkDisconnected() {
            InterfaceC10560Hsz<Boolean> interfaceC10560Hsz;
            long j = this.$generation;
            HatchDevicePairingViewModel hatchDevicePairingViewModel = HatchDevicePairingViewModel.this;
            if (j == hatchDevicePairingViewModel.scanGeneration && this.$logger == hatchDevicePairingViewModel.pairingLogger && ((interfaceC10560Hsz = hatchDevicePairingViewModel.pendingLinkConfirmation) != null || hatchDevicePairingViewModel.pendingDeviceKeyReplacement != null || hatchDevicePairingViewModel.machineState.ui.getLinkAppConfirmation() != null)) {
                if (interfaceC10560Hsz != null) {
                    C8j4.A1S(false, interfaceC10560Hsz);
                }
                InterfaceC10560Hsz<Boolean> interfaceC10560Hsz2 = HatchDevicePairingViewModel.this.pendingDeviceKeyReplacement;
                if (interfaceC10560Hsz2 != null) {
                    C8j4.A1S(false, interfaceC10560Hsz2);
                }
                HatchDevicePairingViewModel.this.dispatch(new HatchDevicePairingEvent.LinkAppConfirmationChanged(null), this.$logger);
                LinkEncryptedSetupCoordinator linkEncryptedSetupCoordinator = HatchDevicePairingViewModel.this.linkSetupCoordinator;
                if (linkEncryptedSetupCoordinator != null) {
                    linkEncryptedSetupCoordinator.reset();
                }
            }
            HatchDevicePairingViewModel hatchDevicePairingViewModel2 = HatchDevicePairingViewModel.this;
            boolean z = hatchDevicePairingViewModel2.machineState.linkOtaRepairState instanceof HatchLinkOtaRepairState.AwaitingReboot;
            if (z) {
                hatchDevicePairingViewModel2.dispatch(HatchDevicePairingEvent.LinkDisconnected.INSTANCE, this.$logger);
                HatchDevicePairingViewModel.this.startOtaRoundTwoWatchdog(this.$logger);
            }
            HatchDevicePairingViewModel.this.dispatch(new HatchDevicePairingEvent.LinkDeviceVerificationChanged(null), this.$logger);
            return z;
        }

        @Override // com.facebook.aura.devices.pairing.HatchDeviceBleListener
        public void onLinkPairingConfirmationRequired() {
            HatchDevicePairingUserFlowLogger hatchDevicePairingUserFlowLogger = this.$logger;
            if (hatchDevicePairingUserFlowLogger != null) {
                hatchDevicePairingUserFlowLogger.markPoint(HatchDevicePairingPoint.PAIRING_CONFIRMATION_REQUIRED);
            }
            HatchDevicePairingViewModel.this.dispatch(HatchDevicePairingEvent.LinkPairingConfirmationRequired.INSTANCE, this.$logger);
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
        @Override // com.facebook.aura.devices.pairing.HatchDeviceBleListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onLinkPairingConfirmationTimedOut(boolean r4) {
            /*
                r3 = this;
                com.facebook.aura.devices.pairing.logging.HatchDevicePairingUserFlowLogger r1 = r3.$logger
                if (r1 == 0) goto L9
                com.facebook.aura.devices.pairing.logging.HatchDevicePairingFailureReason r0 = com.facebook.aura.devices.pairing.logging.HatchDevicePairingFailureReason.PAIRING_CONFIRMATION_TIMED_OUT
                r1.recordError(r0)
            L9:
                com.facebook.aura.devices.pairing.HatchDevicePairingViewModel r2 = com.facebook.aura.devices.pairing.HatchDevicePairingViewModel.this
                if (r4 == 0) goto L15
                r0 = 0
                boolean r1 = com.facebook.aura.devices.pairing.HatchDevicePairingViewModel.access$isGadgetSetup(r2, r0)
                r0 = 1
                if (r1 != 0) goto L16
            L15:
                r0 = 0
            L16:
                com.facebook.aura.devices.pairing.HatchDevicePairingEvent$LinkPairingConfirmationTimedOut r1 = new com.facebook.aura.devices.pairing.HatchDevicePairingEvent$LinkPairingConfirmationTimedOut
                r1.<init>(r0)
                com.facebook.aura.devices.pairing.logging.HatchDevicePairingUserFlowLogger r0 = r3.$logger
                com.facebook.aura.devices.pairing.HatchDevicePairingViewModel.access$dispatch(r2, r1, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.pairing.HatchDevicePairingViewModel.C116591.onLinkPairingConfirmationTimedOut(boolean):void");
        }

        @Override // com.facebook.aura.devices.pairing.HatchDeviceBleListener
        public void onLinkPairingConfirmed() {
            HatchDevicePairingUserFlowLogger hatchDevicePairingUserFlowLogger = this.$logger;
            if (hatchDevicePairingUserFlowLogger != null) {
                hatchDevicePairingUserFlowLogger.markPoint(HatchDevicePairingPoint.PAIRING_CONFIRMATION_COMPLETED);
            }
        }

        @Override // com.facebook.aura.devices.pairing.HatchDeviceBleListener
        public void onLinkPairingUnavailable(String str) {
            HatchDevicePairingViewModel.this.refuseGadgetSetup(str, this.$logger);
        }

        @Override // com.facebook.aura.devices.pairing.HatchDeviceBleListener
        public void onWiFiScanError() {
            HatchDevicePairingUserFlowLogger hatchDevicePairingUserFlowLogger = this.$logger;
            if (hatchDevicePairingUserFlowLogger != null) {
                hatchDevicePairingUserFlowLogger.recordError(HatchDevicePairingFailureReason.WIFI_SCAN_FAILED);
            }
            HatchDevicePairingViewModel.this.dispatch(HatchDevicePairingEvent.WifiScanError.INSTANCE, this.$logger);
        }

        @Override // com.facebook.aura.devices.pairing.HatchDeviceBleListener
        public void onWiFiScanStarted() {
            HatchDevicePairingUserFlowLogger hatchDevicePairingUserFlowLogger = this.$logger;
            if (hatchDevicePairingUserFlowLogger != null) {
                hatchDevicePairingUserFlowLogger.recordAttempt(HatchDevicePairingAttempt.WIFI_SCAN);
            }
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.pairing.HatchDevicePairingViewModel$provisionLinkEffect$2", f = "HatchDevicePairingViewModel.kt", l = {937, 940}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingViewModel$provisionLinkEffect$2, reason: invalid class name and case insensitive filesystem */
    public final class C116602 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ boolean $allowOta;
        public final /* synthetic */ LinkEncryptedSetupCoordinator $coordinator;
        public final /* synthetic */ HatchDevicePairingUserFlowLogger $logger;
        public final /* synthetic */ String $password;
        public final /* synthetic */ Long $roundTwoDeadlineMs;
        public final /* synthetic */ String $ssid;
        public Object L$0;
        public Object L$1;
        public int label;

        /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingViewModel$provisionLinkEffect$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
            public final /* synthetic */ HatchDevicePairingUserFlowLogger $logger;
            public final /* synthetic */ String $password;
            public final /* synthetic */ String $ssid;
            public final /* synthetic */ HatchDevicePairingViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(String str, String str2, HatchDevicePairingViewModel hatchDevicePairingViewModel, HatchDevicePairingUserFlowLogger hatchDevicePairingUserFlowLogger) {
                super(0);
                this.$ssid = str;
                this.$password = str2;
                this.this$0 = hatchDevicePairingViewModel;
                this.$logger = hatchDevicePairingUserFlowLogger;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                String str;
                String str2 = this.$ssid;
                if (str2 == null || (str = this.$password) == null) {
                    return;
                }
                this.this$0.dispatch(new HatchDevicePairingEvent.LinkOtaRequested(str2, str), this.$logger);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            HatchDevicePairingViewModel hatchDevicePairingViewModel;
            Object objResolveAbraUsername = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchDevicePairingViewModel hatchDevicePairingViewModel2 = HatchDevicePairingViewModel.this;
                this.label = 1;
                objResolveAbraUsername = hatchDevicePairingViewModel2.resolveAbraUsername(this);
                if (objResolveAbraUsername == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw AnonymousClass001.A0n();
                    }
                    hatchDevicePairingViewModel = (HatchDevicePairingViewModel) this.L$1;
                    Hwg.A00(obj);
                    hatchDevicePairingViewModel.dispatch(new HatchDevicePairingEvent.LinkProvisionRequestFinished(AnonymousClass001.A1X(objResolveAbraUsername)), this.$logger);
                    return Unit.INSTANCE;
                }
                Hwg.A00(obj);
            }
            hatchDevicePairingViewModel = HatchDevicePairingViewModel.this;
            LinkEncryptedSetupCoordinator linkEncryptedSetupCoordinator = this.$coordinator;
            String str = this.$ssid;
            String str2 = this.$password;
            boolean z = this.$allowOta;
            Long l = this.$roundTwoDeadlineMs;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(str, str2, hatchDevicePairingViewModel, this.$logger);
            this.L$0 = null;
            this.L$1 = hatchDevicePairingViewModel;
            this.label = 2;
            objResolveAbraUsername = linkEncryptedSetupCoordinator.provision(str, str2, (String) objResolveAbraUsername, z, l, anonymousClass1, this);
            if (objResolveAbraUsername == enumC10460Hji) {
                return enumC10460Hji;
            }
            hatchDevicePairingViewModel.dispatch(new HatchDevicePairingEvent.LinkProvisionRequestFinished(AnonymousClass001.A1X(objResolveAbraUsername)), this.$logger);
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116602(LinkEncryptedSetupCoordinator linkEncryptedSetupCoordinator, String str, String str2, boolean z, Long l, HatchDevicePairingUserFlowLogger hatchDevicePairingUserFlowLogger, HtJ<? super C116602> htJ) {
            super(2, htJ);
            this.$coordinator = linkEncryptedSetupCoordinator;
            this.$ssid = str;
            this.$password = str2;
            this.$allowOta = z;
            this.$roundTwoDeadlineMs = l;
            this.$logger = hatchDevicePairingUserFlowLogger;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchDevicePairingViewModel.this.new C116602(this.$coordinator, this.$ssid, this.$password, this.$allowOta, this.$roundTwoDeadlineMs, this.$logger, htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C116602) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.pairing.HatchDevicePairingViewModel$requestLinkWiFiScanEffect$1", f = "HatchDevicePairingViewModel.kt", l = {878}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingViewModel$requestLinkWiFiScanEffect$1, reason: invalid class name and case insensitive filesystem */
    public final class C116611 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ LinkEncryptedSetupCoordinator $coordinator;
        public final /* synthetic */ HatchDevicePairingUserFlowLogger $logger;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116611(LinkEncryptedSetupCoordinator linkEncryptedSetupCoordinator, HatchDevicePairingUserFlowLogger hatchDevicePairingUserFlowLogger, HtJ<? super C116611> htJ) {
            super(2, htJ);
            this.$coordinator = linkEncryptedSetupCoordinator;
            this.$logger = hatchDevicePairingUserFlowLogger;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchDevicePairingViewModel.this.new C116611(this.$coordinator, this.$logger, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            HatchDevicePairingViewModel hatchDevicePairingViewModel;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                hatchDevicePairingViewModel = HatchDevicePairingViewModel.this;
                LinkEncryptedSetupCoordinator linkEncryptedSetupCoordinator = this.$coordinator;
                this.L$0 = hatchDevicePairingViewModel;
                this.label = 1;
                obj = linkEncryptedSetupCoordinator.requestEncryptedWiFiScan(this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                hatchDevicePairingViewModel = (HatchDevicePairingViewModel) this.L$0;
                Hwg.A00(obj);
            }
            hatchDevicePairingViewModel.dispatch(new HatchDevicePairingEvent.LinkWifiScanRequestFinished(AnonymousClass001.A1X(obj)), this.$logger);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C116611) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.pairing.HatchDevicePairingViewModel", f = "HatchDevicePairingViewModel.kt", l = {971}, m = "resolveAbraUsername", v = 2)
    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingViewModel$resolveAbraUsername$1, reason: invalid class name and case insensitive filesystem */
    public final class C116621 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C116621(HtJ<? super C116621> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchDevicePairingViewModel.this.resolveAbraUsername(this);
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingViewModel$saveWifiPassword$1, reason: invalid class name and case insensitive filesystem */
    public final class C116631 extends AbstractC7559F3s implements Function0<Map<String, ? extends String>> {
        public final /* synthetic */ String $password;
        public final /* synthetic */ String $ssid;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116631(String str, String str2) {
            super(0);
            this.$ssid = str;
            this.$password = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Map<String, ? extends String> invoke() {
            Map<String, String> mapSave = HatchDevicePairingViewModel.this.savedWifiNetworks.save(this.$ssid, this.$password);
            return mapSave == null ? HatchDevicePairingViewModel.this.savedWifiNetworks.snapshot() : mapSave;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.pairing.HatchDevicePairingViewModel$startOtaRoundTwoWatchdog$1", f = "HatchDevicePairingViewModel.kt", l = {634}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingViewModel$startOtaRoundTwoWatchdog$1, reason: invalid class name and case insensitive filesystem */
    public final class C116641 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchDevicePairingUserFlowLogger $logger;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116641(HatchDevicePairingUserFlowLogger hatchDevicePairingUserFlowLogger, HtJ<? super C116641> htJ) {
            super(2, htJ);
            this.$logger = hatchDevicePairingUserFlowLogger;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchDevicePairingViewModel.this.new C116641(this.$logger, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                this.label = 1;
                if (C7Bq.A01(HatchDevicePairingStateMachineKt.LINK_OTA_ROUND_TWO_WINDOW_MS, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            HatchDevicePairingViewModel hatchDevicePairingViewModel = HatchDevicePairingViewModel.this;
            if (!hatchDevicePairingViewModel.isOtaRoundTwoDelivered) {
                hatchDevicePairingViewModel.dispatch(HatchDevicePairingEvent.LinkOtaRoundTwoExpired.INSTANCE, this.$logger);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C116641) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final void provisionLinkEffect(String str, String str2, boolean z) {
        HxE<String, String> hxEA0r;
        if (str != null) {
            hxEA0r = C3cG.A0r(str, str2 == null ? "" : str2);
        } else {
            hxEA0r = null;
        }
        this.provisionedWifi = hxEA0r;
        HatchDevicePairingUserFlowLogger hatchDevicePairingUserFlowLogger = this.pairingLogger;
        LinkEncryptedSetupCoordinator orCreateLinkSetupCoordinator = getOrCreateLinkSetupCoordinator();
        if (orCreateLinkSetupCoordinator != null) {
            HoC hoC = this.provisioningAuthJob;
            if (hoC != null) {
                hoC.A5w(null);
            }
            HoC hoC2 = this.linkSetupJob;
            if (hoC2 != null) {
                hoC2.A5w(null);
            }
            HatchDeviceBleManager hatchDeviceBleManager = this.pairingBleManager;
            this.provisioningAddress = hatchDeviceBleManager != null ? hatchDeviceBleManager.connectedDeviceAddress : null;
            if (!orCreateLinkSetupCoordinator.getNeedsHandoff() || this.provisioningAddress != null) {
                if (hatchDevicePairingUserFlowLogger != null) {
                    hatchDevicePairingUserFlowLogger.recordAttempt(HatchDevicePairingAttempt.PROVISIONING);
                }
                Long l = this.otaRoundTwoDeadlineMs;
                Long l2 = null;
                if (this.machineState.linkOtaRepairState instanceof HatchLinkOtaRepairState.Repairing) {
                    l2 = l;
                }
                this.provisioningAuthJob = AnonymousClass001.A11(new C116602(orCreateLinkSetupCoordinator, str, str2, z, l2, hatchDevicePairingUserFlowLogger, null), AEu.A00(this));
                return;
            }
            CFK.A06(HatchDevicePairingViewModelKt.TAG, "Link setup handoff needs the device address; not provisioning");
        }
        if (hatchDevicePairingUserFlowLogger != null) {
            hatchDevicePairingUserFlowLogger.recordError(HatchDevicePairingFailureReason.WIFI_PROVISION_FAILED);
        }
        dispatch(new HatchDevicePairingEvent.LinkProvisionRequestFinished(false), this.pairingLogger);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Boolean recordMissingBlePermissions(HatchDevicePairingUserFlowLogger hatchDevicePairingUserFlowLogger, long j) {
        try {
            List<String> listMissingHatchDeviceBlePermissions = HatchDeviceBlePermissionEffectKt.missingHatchDeviceBlePermissions(this.appContext);
            if (listMissingHatchDeviceBlePermissions.isEmpty()) {
                return AnonymousClass001.A0h();
            }
            recordPrepairingFailure(HatchDeviceBlePermissionEffectKt.hatchDeviceBlePermissionFailureReason(this.appContext, listMissingHatchDeviceBlePermissions), listMissingHatchDeviceBlePermissions, hatchDevicePairingUserFlowLogger, j);
            return AnonymousClass001.A0i();
        } catch (RuntimeException unused) {
            return null;
        }
    }

    private final void startPairingQpl() {
        this.hasStartedPairing = true;
        Function0<Unit> function0 = this.startPairingLogger;
        this.startPairingLogger = null;
        if (function0 != null) {
            try {
                function0.invoke();
            } catch (RuntimeException unused) {
            }
        }
    }

    @Override // com.facebook.aura.devices.pairing.HatchDevicePairingActions
    public void continueFromCommunityWarning(Long l) {
        if (l == null) {
            if (this.machineState.ui.getPairingStep() != HatchDevicePairingStep.LINK_INFO || !canContinueAfterDeviceConnection()) {
                return;
            }
        } else if (!canAcknowledgeLinkInfo(l.longValue())) {
            return;
        }
        if (!this.machineState.ui.isDeveloperModeEnabled()) {
            HatchDeveloperMode.INSTANCE.setEnabled(this.userSession, true);
        }
        acknowledgeLinkInfo(l);
    }

    public final void onBlePermissionRequested(String str) {
        HatchDevicePairingUserFlowLogger hatchDevicePairingUserFlowLogger;
        C7384Etj.A0Y(str, 0);
        if (!str.equals(this.machineState.ui.pairingPresentationId) || (hatchDevicePairingUserFlowLogger = this.pairingLogger) == null) {
            return;
        }
        hatchDevicePairingUserFlowLogger.markPoint(HatchDevicePairingPoint.BLE_PERMISSION_REQUESTED);
    }

    public final void onBlePermissionRetry(String str) {
        C7384Etj.A0Y(str, 0);
        if (str.equals(this.machineState.ui.pairingPresentationId)) {
            this.hasLoggedPrepairingFailure = false;
            recordMissingBlePermissions(this.pairingLogger, this.scanGeneration);
        }
    }

    public final void onLinkInfoShown(String str) {
        HatchDevicePairingUserFlowLogger hatchDevicePairingUserFlowLogger;
        C7384Etj.A0Y(str, 0);
        if (!str.equals(this.machineState.ui.pairingPresentationId) || (hatchDevicePairingUserFlowLogger = this.pairingLogger) == null) {
            return;
        }
        hatchDevicePairingUserFlowLogger.markPoint(HatchDevicePairingPoint.LINK_INFO_SHOWN);
    }

    public final void onPairingPresentationClosed(String str) {
        C7384Etj.A0Y(str, 0);
        if (str.equals(this.machineState.ui.pairingPresentationId)) {
            HatchDevicePairingUserFlowLogger hatchDevicePairingUserFlowLogger = this.pairingLogger;
            if (hatchDevicePairingUserFlowLogger != null) {
                hatchDevicePairingUserFlowLogger.close(null);
            }
            this.pairingLogger = null;
            this.startPairingLogger = null;
            dispatch(HatchDevicePairingEvent.DismissFlow.INSTANCE, null);
        }
    }

    @Override // com.facebook.aura.devices.pairing.HatchDevicePairingActions
    public void rescanDevices() {
        this.hasLoggedPrepairingFailure = false;
        dispatch(HatchDevicePairingEvent.RescanDevices.INSTANCE, this.pairingLogger);
        recordMissingBlePermissions(this.pairingLogger, this.scanGeneration);
    }

    @Override // com.facebook.aura.devices.pairing.HatchDevicePairingActions
    public void selectDevice(String str) {
        HatchDiscoveredDevice next;
        ClaimedDeviceRow claimedDeviceRow;
        C7384Etj.A0Y(str, 0);
        Iterator<HatchDiscoveredDevice> it = this.machineState.ui.getDiscoveredDevices().iterator();
        do {
            next = null;
            if (!it.hasNext()) {
                break;
            } else {
                next = it.next();
            }
        } while (!str.equals(next.address));
        HatchDiscoveredDevice hatchDiscoveredDevice = next;
        if (hatchDiscoveredDevice == null || (claimedDeviceRow = hatchDiscoveredDevice.claim) == null) {
            dispatch(new HatchDevicePairingEvent.SelectDevice(str), this.pairingLogger);
        } else {
            this._claimedDeviceDestination.Af8(claimedDeviceRow.target);
        }
    }

    @Override // com.facebook.aura.devices.pairing.HatchDevicePairingActions
    public void selectWifiNetwork(String str) {
        C7384Etj.A0Y(str, 0);
        dispatch(new HatchDevicePairingEvent.SelectWifiNetwork(str, C60O.A0p(str, this.savedWifiPasswords)), this.pairingLogger);
    }

    public final void showPairingFlow(String str, HatchDevicePairingTriggerSource hatchDevicePairingTriggerSource, HatchDevicePairingMode hatchDevicePairingMode, boolean z, String str2) {
        AnonymousClass005.A10(str, hatchDevicePairingTriggerSource, hatchDevicePairingMode);
        if (str.equals(this.machineState.ui.pairingPresentationId)) {
            return;
        }
        HatchDevicePairingUserFlowLogger hatchDevicePairingUserFlowLogger = this.pairingLogger;
        if (hatchDevicePairingUserFlowLogger != null) {
            hatchDevicePairingUserFlowLogger.close(null);
        }
        this.pairingLogger = null;
        this.startPairingLogger = null;
        dispatch(HatchDevicePairingEvent.DismissFlow.INSTANCE, null);
        dispatch(new HatchDevicePairingEvent.BlePermissionsChanged(z), this.pairingLogger);
        this.hasStartedPairing = false;
        this.hasLoggedPrepairingFailure = false;
        HatchDevicePairingUserFlowLogger hatchDevicePairingUserFlowLogger2 = new HatchDevicePairingUserFlowLogger(AEu.A00(this), new HatchDevicePairingViewModel$showPairingFlow$logger$1(this));
        this.startPairingLogger = new HatchDevicePairingViewModel$showPairingFlow$startLogger$1(hatchDevicePairingUserFlowLogger2, hatchDevicePairingTriggerSource, hatchDevicePairingMode, z);
        this.pairingLogger = hatchDevicePairingUserFlowLogger2;
        this.mintedDeviceKeyIds.clear();
        dispatch(new HatchDevicePairingEvent.ShowFlow(str, str2), this.pairingLogger);
    }

    @Override // com.facebook.aura.devices.pairing.HatchDevicePairingActions
    public void startPairingBleScan() {
        this.hasLoggedPrepairingFailure = false;
        dispatch(HatchDevicePairingEvent.StartBleScan.INSTANCE, this.pairingLogger);
        recordMissingBlePermissions(this.pairingLogger, this.scanGeneration);
    }

    @Override // com.facebook.aura.devices.pairing.HatchDevicePairingActions
    public void updateWifiPassword(String str) {
        C7384Etj.A0Y(str, 0);
        dispatch(new HatchDevicePairingEvent.UpdateWifiPassword(str), this.pairingLogger);
    }

    @Override // com.facebook.aura.devices.pairing.HatchDevicePairingActions
    public void updateWifiSsid(String str) {
        C7384Etj.A0Y(str, 0);
        dispatch(new HatchDevicePairingEvent.UpdateWifiSsid(str), this.pairingLogger);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a0  */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.GAt, X.GBM, X.Hsz<java.lang.Boolean>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object awaitLinkConfirmation(com.facebook.aura.devices.pairing.logging.HatchDevicePairingUserFlowLogger r11, com.facebook.aura.devices.pairing.HatchDevicePairingStep r12, X.HtJ<? super java.lang.Boolean> r13) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.facebook.aura.devices.pairing.HatchDevicePairingViewModel.C116531
            if (r0 == 0) goto L25
            r8 = r13
            com.facebook.aura.devices.pairing.HatchDevicePairingViewModel$awaitLinkConfirmation$1 r8 = (com.facebook.aura.devices.pairing.HatchDevicePairingViewModel.C116531) r8
            int r2 = r8.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L25
            int r2 = r2 - r1
            r8.label = r2
        L12:
            java.lang.Object r2 = r8.result
            X.Hji r9 = X.EnumC10460Hji.A02
            int r0 = r8.label
            r7 = 1
            r3 = 0
            if (r0 == 0) goto L30
            if (r0 != r7) goto L2b
            java.lang.Object r6 = r8.L$2
            java.lang.Object r11 = r8.L$0
            com.facebook.aura.devices.pairing.logging.HatchDevicePairingUserFlowLogger r11 = (com.facebook.aura.devices.pairing.logging.HatchDevicePairingUserFlowLogger) r11
            goto L79
        L25:
            com.facebook.aura.devices.pairing.HatchDevicePairingViewModel$awaitLinkConfirmation$1 r8 = new com.facebook.aura.devices.pairing.HatchDevicePairingViewModel$awaitLinkConfirmation$1
            r8.<init>(r13)
            goto L12
        L2b:
            java.lang.IllegalStateException r2 = X.AnonymousClass001.A0n()
            throw r2
        L30:
            X.Hwg.A00(r2)
            com.facebook.aura.devices.pairing.logging.HatchDevicePairingUserFlowLogger r0 = r10.pairingLogger
            if (r11 != r0) goto Lb7
            com.facebook.aura.devices.pairing.HatchDevicePairingMachineState r0 = r10.machineState
            com.facebook.aura.devices.pairing.HatchDevicePairingViewState r0 = r0.ui
            boolean r0 = r0.getShowPairingFlow()
            if (r0 == 0) goto Lb7
            com.facebook.aura.devices.pairing.HatchDevicePairingStep r0 = com.facebook.aura.devices.pairing.HatchDevicePairingStep.LINK_BUTTON_CONFIRMATION
            if (r12 != r0) goto L4c
            if (r11 == 0) goto L4c
            com.facebook.aura.devices.pairing.logging.HatchDevicePairingPoint r0 = com.facebook.aura.devices.pairing.logging.HatchDevicePairingPoint.PAIRING_CONFIRMATION_REQUIRED
            r11.markPoint(r0)
        L4c:
            X.Hsz<java.lang.Boolean> r1 = r10.pendingLinkConfirmation
            if (r1 == 0) goto L54
            r0 = 0
            X.C8j4.A1S(r0, r1)
        L54:
            X.GAt r6 = new X.GAt
            r6.<init>(r3)
            r10.pendingLinkConfirmation = r6
            long r0 = r10.nextLinkConfirmationRequestId
            r4 = 1
            long r0 = r0 + r4
            r10.nextLinkConfirmationRequestId = r0
            com.facebook.aura.devices.pairing.HatchDevicePairingEvent$LinkConfirmationRequested r2 = new com.facebook.aura.devices.pairing.HatchDevicePairingEvent$LinkConfirmationRequested
            r2.<init>(r0, r12)
            r10.dispatch(r2, r11)
            r8.L$0 = r11     // Catch: java.lang.Throwable -> L99
            r8.L$1 = r3     // Catch: java.lang.Throwable -> L99
            r8.L$2 = r6     // Catch: java.lang.Throwable -> L99
            r8.label = r7     // Catch: java.lang.Throwable -> L99
            java.lang.Object r2 = r6.A0E(r8)     // Catch: java.lang.Throwable -> L99
            if (r2 != r9) goto L7c
            return r9
        L79:
            X.Hwg.A00(r2)     // Catch: java.lang.Throwable -> L9b
        L7c:
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L9b
            X.Hsz<java.lang.Boolean> r0 = r10.pendingLinkConfirmation
            if (r0 != r6) goto L98
            r10.pendingLinkConfirmation = r3
            com.facebook.aura.devices.pairing.HatchDevicePairingMachineState r0 = r10.machineState
            com.facebook.aura.devices.pairing.HatchDevicePairingViewState r0 = r0.ui
            com.facebook.aura.devices.pairing.LinkAppConfirmationState r1 = r0.getLinkAppConfirmation()
            com.facebook.aura.devices.pairing.LinkAppConfirmationState r0 = com.facebook.aura.devices.pairing.LinkAppConfirmationState.CONTINUING
            if (r1 == r0) goto L98
            com.facebook.aura.devices.pairing.HatchDevicePairingEvent$LinkAppConfirmationChanged r0 = new com.facebook.aura.devices.pairing.HatchDevicePairingEvent$LinkAppConfirmationChanged
            r0.<init>(r3)
            r10.dispatch(r0, r11)
        L98:
            return r2
        L99:
            r2 = move-exception
            goto L9c
        L9b:
            r2 = move-exception
        L9c:
            X.Hsz<java.lang.Boolean> r0 = r10.pendingLinkConfirmation
            if (r0 != r6) goto Lb6
            r10.pendingLinkConfirmation = r3
            com.facebook.aura.devices.pairing.HatchDevicePairingMachineState r0 = r10.machineState
            com.facebook.aura.devices.pairing.HatchDevicePairingViewState r0 = r0.ui
            com.facebook.aura.devices.pairing.LinkAppConfirmationState r1 = r0.getLinkAppConfirmation()
            com.facebook.aura.devices.pairing.LinkAppConfirmationState r0 = com.facebook.aura.devices.pairing.LinkAppConfirmationState.CONTINUING
            if (r1 == r0) goto Lb6
            com.facebook.aura.devices.pairing.HatchDevicePairingEvent$LinkAppConfirmationChanged r0 = new com.facebook.aura.devices.pairing.HatchDevicePairingEvent$LinkAppConfirmationChanged
            r0.<init>(r3)
            r10.dispatch(r0, r11)
        Lb6:
            throw r2
        Lb7:
            java.lang.Boolean r9 = X.AnonymousClass001.A0h()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.pairing.HatchDevicePairingViewModel.awaitLinkConfirmation(com.facebook.aura.devices.pairing.logging.HatchDevicePairingUserFlowLogger, com.facebook.aura.devices.pairing.HatchDevicePairingStep, X.HtJ):java.lang.Object");
    }

    private final boolean canAcknowledgeLinkInfo(long j) {
        InterfaceC10560Hsz<Boolean> interfaceC10560Hsz;
        Long linkConfirmationRequestId = this.machineState.ui.getLinkConfirmationRequestId();
        if (linkConfirmationRequestId == null || j != linkConfirmationRequestId.longValue() || (interfaceC10560Hsz = this.pendingLinkConfirmation) == null || !interfaceC10560Hsz.isActive()) {
            return false;
        }
        HatchDevicePairingViewState hatchDevicePairingViewState = this.machineState.ui;
        return hatchDevicePairingViewState.getPairingStep() == HatchDevicePairingStep.LINK_INFO && !hatchDevicePairingViewState.isInitialConnectionInProgress();
    }

    private final boolean canContinueAfterDeviceConnection() {
        return this.pendingLinkConfirmation == null && !this.machineState.ui.isInitialConnectionInProgress();
    }

    private final void clearOtaRoundTwoWindow() {
        HoC hoC = this.otaRoundTwoWatchdog;
        if (hoC != null) {
            hoC.A5w(null);
        }
        this.otaRoundTwoWatchdog = null;
        this.otaRoundTwoDeadlineMs = null;
        this.isOtaRoundTwoDelivered = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean completeHandoff() {
        boolean zComplete;
        String strA1P;
        LinkEncryptedSetupCoordinator linkEncryptedSetupCoordinator = this.linkSetupCoordinator;
        if (linkEncryptedSetupCoordinator == null || !AnonymousClass002.A1X(linkEncryptedSetupCoordinator.handoff)) {
            return true;
        }
        String str = this.provisioningAddress;
        String pairingTargetName = this.machineState.ui.getPairingTargetName();
        LinkSetupHandoff linkSetupHandoff = linkEncryptedSetupCoordinator.handoff;
        linkEncryptedSetupCoordinator.handoff = null;
        this.provisioningAddress = null;
        if (str != null && pairingTargetName != null && linkSetupHandoff != null) {
            zComplete = linkSetupHandoff.complete(this.appContext, this.userSession, str, pairingTargetName);
            if (!zComplete) {
                strA1P = "Link setup handoff could not be completed";
            }
            return zComplete;
        }
        zComplete = false;
        strA1P = C60P.A1P(", name known=", C60O.A10("Link setup handoff not completed: address known=", AnonymousClass002.A1X(str)), pairingTargetName != null);
        CFK.A06(HatchDevicePairingViewModelKt.TAG, strA1P);
        return zComplete;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0082  */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.GAt, X.GBM, X.Hsz<java.lang.Boolean>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object confirmDeviceKeyReplacement(com.facebook.aura.devices.pairing.logging.HatchDevicePairingUserFlowLogger r8, com.facebook.aura.devices.token.LinkDeviceKeyRecord r9, X.HtJ<? super java.lang.Boolean> r10) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.facebook.aura.devices.pairing.HatchDevicePairingViewModel.C116541
            if (r0 == 0) goto L25
            r5 = r10
            com.facebook.aura.devices.pairing.HatchDevicePairingViewModel$confirmDeviceKeyReplacement$1 r5 = (com.facebook.aura.devices.pairing.HatchDevicePairingViewModel.C116541) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L25
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L30
            if (r0 != r4) goto L2b
            java.lang.Object r2 = r5.L$2
            java.lang.Object r8 = r5.L$0
            com.facebook.aura.devices.pairing.logging.HatchDevicePairingUserFlowLogger r8 = (com.facebook.aura.devices.pairing.logging.HatchDevicePairingUserFlowLogger) r8
            goto L67
        L25:
            com.facebook.aura.devices.pairing.HatchDevicePairingViewModel$confirmDeviceKeyReplacement$1 r5 = new com.facebook.aura.devices.pairing.HatchDevicePairingViewModel$confirmDeviceKeyReplacement$1
            r5.<init>(r10)
            goto L12
        L2b:
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A0n()
            throw r1
        L30:
            X.Hwg.A00(r1)
            com.facebook.aura.devices.pairing.logging.HatchDevicePairingUserFlowLogger r0 = r7.pairingLogger
            if (r8 != r0) goto L8d
            com.facebook.aura.devices.pairing.HatchDevicePairingMachineState r0 = r7.machineState
            com.facebook.aura.devices.pairing.HatchDevicePairingViewState r0 = r0.ui
            boolean r0 = r0.getShowPairingFlow()
            if (r0 == 0) goto L8d
            X.Hsz<java.lang.Boolean> r1 = r7.pendingDeviceKeyReplacement
            if (r1 == 0) goto L49
            r0 = 0
            X.C8j4.A1S(r0, r1)
        L49:
            X.GAt r2 = new X.GAt
            r2.<init>(r3)
            r7.pendingDeviceKeyReplacement = r2
            com.facebook.aura.devices.pairing.HatchDevicePairingEvent$LinkDeviceKeyReplacementChanged r0 = new com.facebook.aura.devices.pairing.HatchDevicePairingEvent$LinkDeviceKeyReplacementChanged
            r0.<init>(r9)
            r7.dispatch(r0, r8)
            r5.L$0 = r8     // Catch: java.lang.Throwable -> L7b
            r5.L$1 = r3     // Catch: java.lang.Throwable -> L7b
            r5.L$2 = r2     // Catch: java.lang.Throwable -> L7b
            r5.label = r4     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r1 = r2.A0E(r5)     // Catch: java.lang.Throwable -> L7b
            if (r1 != r6) goto L6a
            return r6
        L67:
            X.Hwg.A00(r1)     // Catch: java.lang.Throwable -> L7d
        L6a:
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L7d
            X.Hsz<java.lang.Boolean> r0 = r7.pendingDeviceKeyReplacement
            if (r0 != r2) goto L7a
            r7.pendingDeviceKeyReplacement = r3
            com.facebook.aura.devices.pairing.HatchDevicePairingEvent$LinkDeviceKeyReplacementChanged r0 = new com.facebook.aura.devices.pairing.HatchDevicePairingEvent$LinkDeviceKeyReplacementChanged
            r0.<init>(r3)
            r7.dispatch(r0, r8)
        L7a:
            return r1
        L7b:
            r1 = move-exception
            goto L7e
        L7d:
            r1 = move-exception
        L7e:
            X.Hsz<java.lang.Boolean> r0 = r7.pendingDeviceKeyReplacement
            if (r0 != r2) goto L8c
            r7.pendingDeviceKeyReplacement = r3
            com.facebook.aura.devices.pairing.HatchDevicePairingEvent$LinkDeviceKeyReplacementChanged r0 = new com.facebook.aura.devices.pairing.HatchDevicePairingEvent$LinkDeviceKeyReplacementChanged
            r0.<init>(r3)
            r7.dispatch(r0, r8)
        L8c:
            throw r1
        L8d:
            java.lang.Boolean r6 = X.AnonymousClass001.A0h()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.pairing.HatchDevicePairingViewModel.confirmDeviceKeyReplacement(com.facebook.aura.devices.pairing.logging.HatchDevicePairingUserFlowLogger, com.facebook.aura.devices.token.LinkDeviceKeyRecord, X.HtJ):java.lang.Object");
    }

    private final void connectToDiscoveredEffect() {
        HatchDeviceBleManager hatchDeviceBleManager = this.pairingBleManager;
        if (hatchDeviceBleManager == null || !hatchDeviceBleManager.connectToDiscovered()) {
            dispatch(new HatchDevicePairingEvent.BleStateChanged(HatchDeviceBleState.CONNECTION_FAILED, null), this.pairingLogger);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispatch(HatchDevicePairingEvent hatchDevicePairingEvent, HatchDevicePairingUserFlowLogger hatchDevicePairingUserFlowLogger) {
        if (hatchDevicePairingUserFlowLogger == this.pairingLogger) {
            HatchDevicePairingTransition hatchDevicePairingTransitionReduce = this.stateMachine.reduce(this.machineState, hatchDevicePairingEvent);
            if (!this.hasStartedPairing && hatchDevicePairingUserFlowLogger != null && HatchDevicePairingLoggingHelper.INSTANCE.isAcceptedDeviceSelection(hatchDevicePairingEvent, this.machineState, hatchDevicePairingTransitionReduce)) {
                startPairingQpl();
            }
            HatchDevicePairingLoggingHelper.INSTANCE.logPairingAction(hatchDevicePairingUserFlowLogger, hatchDevicePairingEvent, this.machineState, hatchDevicePairingTransitionReduce);
            HatchLinkOtaRepairState hatchLinkOtaRepairState = this.machineState.linkOtaRepairState;
            HatchDevicePairingMachineState hatchDevicePairingMachineState = hatchDevicePairingTransitionReduce.state;
            this.machineState = hatchDevicePairingMachineState;
            this._uiState.Af8(hatchDevicePairingMachineState.ui);
            trackOtaRoundTwo(hatchDevicePairingEvent, hatchLinkOtaRepairState);
            executeEffects(hatchDevicePairingTransitionReduce.effects);
        }
    }

    public static /* synthetic */ void dispatch$default(HatchDevicePairingViewModel hatchDevicePairingViewModel, HatchDevicePairingEvent hatchDevicePairingEvent, HatchDevicePairingUserFlowLogger hatchDevicePairingUserFlowLogger, int i, Object obj) {
        if ((i & 2) != 0) {
            hatchDevicePairingUserFlowLogger = hatchDevicePairingViewModel.pairingLogger;
        }
        hatchDevicePairingViewModel.dispatch(hatchDevicePairingEvent, hatchDevicePairingUserFlowLogger);
    }

    private final void establishLinkPairingEffect() {
        HatchDevicePairingUserFlowLogger hatchDevicePairingUserFlowLogger = this.pairingLogger;
        LinkEncryptedSetupCoordinator orCreateLinkSetupCoordinator = getOrCreateLinkSetupCoordinator();
        if (orCreateLinkSetupCoordinator == null) {
            if (hatchDevicePairingUserFlowLogger != null) {
                hatchDevicePairingUserFlowLogger.recordError(HatchDevicePairingFailureReason.ENCRYPTED_PAIRING_FAILED);
            }
            dispatch(new HatchDevicePairingEvent.LinkPairingEstablishmentFinished(false, LinkWifiRequirement.REQUIRED), this.pairingLogger);
        } else {
            HoC hoC = this.linkSetupJob;
            if (hoC != null) {
                hoC.A5w(null);
            }
            this.linkSetupJob = AnonymousClass001.A11(new C116551(orCreateLinkSetupCoordinator, this, hatchDevicePairingUserFlowLogger, null), AEu.A00(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void forgetWifiPassword() {
        HxE<String, String> hxE = this.provisionedWifi;
        if (hxE != null) {
            loadSavedWifiNetworks(new C116561(hxE.first));
        }
    }

    private final LinkEncryptedSetupCoordinator getOrCreateLinkSetupCoordinator() {
        HatchDeviceBleManager hatchDeviceBleManager = this.pairingBleManager;
        if (hatchDeviceBleManager == null) {
            return null;
        }
        HatchDevicePairingUserFlowLogger hatchDevicePairingUserFlowLogger = this.pairingLogger;
        LinkEncryptedSetupCoordinator linkEncryptedSetupCoordinator = this.linkSetupCoordinator;
        if (linkEncryptedSetupCoordinator == null) {
            linkEncryptedSetupCoordinator = new LinkEncryptedSetupCoordinator(hatchDeviceBleManager, 0L, 0L, null, null, null, null, null, null, hatchDevicePairingUserFlowLogger, new C116571(hatchDevicePairingUserFlowLogger, this), new AnonymousClass2(hatchDevicePairingUserFlowLogger, null), new AnonymousClass3(hatchDevicePairingUserFlowLogger, null), new AnonymousClass4(), new AnonymousClass5(hatchDevicePairingUserFlowLogger), new AnonymousClass6(hatchDevicePairingUserFlowLogger), LinkDeviceKeyProvisioning.Companion.forSession(this.userSession), LinkPairedNodeCheck.Companion.forSession(this.userSession), new AnonymousClass7(hatchDeviceBleManager, this, null), this.mintedDeviceKeyIds, new AnonymousClass8(hatchDevicePairingUserFlowLogger, null), new AnonymousClass9(hatchDevicePairingUserFlowLogger), this.unconfirmedTokens, null, null, null, null, 125829630, null);
            if (hatchDevicePairingUserFlowLogger != null) {
                hatchDevicePairingUserFlowLogger.updateSetupProtocol(HatchDevicePairingSetupProtocol.ENCRYPTED_LINK);
            }
            this.linkSetupCoordinator = linkEncryptedSetupCoordinator;
        }
        return linkEncryptedSetupCoordinator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0015, code lost:
    
        if (r6 != null) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isGadgetSetup(java.lang.String r6) {
        /*
            r5 = this;
            com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator r0 = r5.linkSetupCoordinator
            r3 = 1
            if (r0 == 0) goto Lc
            boolean r0 = r0.isBluetoothGadget()
            if (r0 != r3) goto Lc
            return r3
        Lc:
            com.facebook.aura.devices.pairing.HatchDeviceBleManager r0 = r5.pairingBleManager
            r4 = 0
            if (r6 != 0) goto L18
            if (r0 == 0) goto L17
            java.lang.String r6 = r0.connectedDeviceAddress
            if (r6 != 0) goto L1a
        L17:
            return r4
        L18:
            if (r0 == 0) goto L23
        L1a:
            java.util.Set<java.lang.String> r0 = r0.bluetoothGadgetAddresses
            boolean r0 = r0.contains(r6)
            if (r0 != r3) goto L23
            return r3
        L23:
            com.facebook.aura.devices.pairing.HatchDevicePairingMachineState r0 = r5.machineState
            com.facebook.aura.devices.pairing.HatchDevicePairingViewState r0 = r0.ui
            java.util.List r1 = r0.getDiscoveredDevices()
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L36
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L36
            return r4
        L36:
            java.util.Iterator r2 = r1.iterator()
        L3a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L17
            java.lang.Object r1 = r2.next()
            com.facebook.aura.devices.pairing.HatchDiscoveredDevice r1 = (com.facebook.aura.devices.pairing.HatchDiscoveredDevice) r1
            java.lang.String r0 = r1.address
            if (r0 == 0) goto L3a
            boolean r0 = r0.equalsIgnoreCase(r6)
            if (r0 == 0) goto L3a
            boolean r0 = r1.isBluetoothGadget
            if (r0 == 0) goto L3a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.pairing.HatchDevicePairingViewModel.isGadgetSetup(java.lang.String):boolean");
    }

    private final C116591 pairingBleListener(HatchDevicePairingUserFlowLogger hatchDevicePairingUserFlowLogger, long j) {
        return new C116591(hatchDevicePairingUserFlowLogger, j);
    }

    public static /* synthetic */ Boolean recordMissingBlePermissions$default(HatchDevicePairingViewModel hatchDevicePairingViewModel, HatchDevicePairingUserFlowLogger hatchDevicePairingUserFlowLogger, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            hatchDevicePairingUserFlowLogger = hatchDevicePairingViewModel.pairingLogger;
        }
        if ((i & 2) != 0) {
            j = hatchDevicePairingViewModel.scanGeneration;
        }
        return hatchDevicePairingViewModel.recordMissingBlePermissions(hatchDevicePairingUserFlowLogger, j);
    }

    private final void recordPrepairingFailure(HatchDevicePairingAnalytics.FailureReason failureReason, List<String> list, HatchDevicePairingUserFlowLogger hatchDevicePairingUserFlowLogger, long j) {
        if (hatchDevicePairingUserFlowLogger == this.pairingLogger && j == this.scanGeneration && this.machineState.ui.getShowPairingFlow() && !this.hasStartedPairing && !this.hasLoggedPrepairingFailure) {
            this.hasLoggedPrepairingFailure = true;
            try {
                HatchDevicePairingAnalytics.INSTANCE.recordDiscoveryFailure(failureReason, list);
            } catch (RuntimeException unused) {
            }
        }
    }

    private final void recordPrepairingScanStart() {
        if (this.deviceFamily == HatchDeviceFamily.HATCH_LINK && this.machineState.ui.getShowPairingFlow() && !this.hasStartedPairing) {
            try {
                HatchDevicePairingAnalytics.INSTANCE.recordScanAttempt();
            } catch (RuntimeException unused) {
            }
        }
    }

    private final void requestLinkWiFiScanEffect() {
        HatchDevicePairingUserFlowLogger hatchDevicePairingUserFlowLogger = this.pairingLogger;
        LinkEncryptedSetupCoordinator orCreateLinkSetupCoordinator = getOrCreateLinkSetupCoordinator();
        if (orCreateLinkSetupCoordinator == null) {
            if (hatchDevicePairingUserFlowLogger != null) {
                hatchDevicePairingUserFlowLogger.recordError(HatchDevicePairingFailureReason.WIFI_SCAN_FAILED);
            }
            dispatch(new HatchDevicePairingEvent.LinkWifiScanRequestFinished(false), this.pairingLogger);
        } else {
            HoC hoC = this.linkSetupJob;
            if (hoC != null) {
                hoC.A5w(null);
            }
            this.linkSetupJob = AnonymousClass001.A11(new C116611(orCreateLinkSetupCoordinator, hatchDevicePairingUserFlowLogger, null), AEu.A00(this));
        }
    }

    private final void resetLinkSetupEffect() {
        HoC hoC = this.provisioningAuthJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        this.provisioningAuthJob = null;
        HoC hoC2 = this.linkSetupJob;
        if (hoC2 != null) {
            hoC2.A5w(null);
        }
        this.linkSetupJob = null;
        LinkEncryptedSetupCoordinator linkEncryptedSetupCoordinator = this.linkSetupCoordinator;
        if (linkEncryptedSetupCoordinator != null) {
            linkEncryptedSetupCoordinator.reset();
        }
        this.linkSetupCoordinator = null;
        InterfaceC10560Hsz<Boolean> interfaceC10560Hsz = this.pendingLinkConfirmation;
        if (interfaceC10560Hsz != null) {
            C8j4.A1S(false, interfaceC10560Hsz);
        }
        this.pendingLinkConfirmation = null;
        InterfaceC10560Hsz<Boolean> interfaceC10560Hsz2 = this.pendingDeviceKeyReplacement;
        if (interfaceC10560Hsz2 != null) {
            C8j4.A1S(false, interfaceC10560Hsz2);
        }
        this.pendingDeviceKeyReplacement = null;
        dispatch(new HatchDevicePairingEvent.LinkAppConfirmationChanged(null), this.pairingLogger);
        dispatch(new HatchDevicePairingEvent.LinkDeviceVerificationChanged(null), this.pairingLogger);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object resolveAbraUsername(X.HtJ<? super java.lang.String> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.facebook.aura.devices.pairing.HatchDevicePairingViewModel.C116621
            if (r0 == 0) goto L70
            r3 = r7
            com.facebook.aura.devices.pairing.HatchDevicePairingViewModel$resolveAbraUsername$1 r3 = (com.facebook.aura.devices.pairing.HatchDevicePairingViewModel.C116621) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L70
            int r2 = r2 - r1
            r3.label = r2
        L12:
            java.lang.Object r1 = r3.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r5 = 1
            r2 = 0
            if (r0 == 0) goto L36
            if (r0 != r5) goto L7e
            X.Hwg.A00(r1)
        L21:
            com.facebook.aura.user.provider.AuraUserData r1 = (com.facebook.aura.user.provider.AuraUserData) r1
            if (r1 == 0) goto L76
            java.lang.String r0 = r1.profileUsername
            if (r0 == 0) goto L76
            java.lang.String r1 = X.AnonymousClass002.A0l(r0)
            if (r1 == 0) goto L76
            int r0 = r1.length()
            if (r0 <= 0) goto L76
            return r1
        L36:
            X.Hwg.A00(r1)
            com.facebook.aura.user.provider.AuraViewerDataProvider$Companion r1 = com.facebook.aura.user.provider.AuraViewerDataProvider.Companion
            X.CGz r0 = r6.userSession
            com.facebook.aura.user.provider.AuraViewerDataProvider r0 = r1.getInstance(r0)
            X.1BN<com.facebook.aura.user.provider.AuraUserData> r0 = r0.userData
            java.lang.Object r0 = r0.getValue()
            com.facebook.aura.user.provider.AuraUserData r0 = (com.facebook.aura.user.provider.AuraUserData) r0
            if (r0 == 0) goto L5c
            java.lang.String r0 = r0.profileUsername
            if (r0 == 0) goto L5c
            java.lang.String r1 = X.AnonymousClass002.A0l(r0)
            if (r1 == 0) goto L5c
            int r0 = r1.length()
            if (r0 <= 0) goto L5c
            return r1
        L5c:
            com.facebook.aura.user.repo.AuraUserRepository$Companion r1 = com.facebook.aura.user.repo.AuraUserRepository.Companion
            X.CGz r0 = r6.userSession
            com.facebook.aura.user.repo.AuraUserRepository r1 = r1.getInstance(r0)
            r3.L$0 = r2
            r3.label = r5
            r0 = 0
            java.lang.Object r1 = r1.fetchUser(r0, r3)
            if (r1 != r4) goto L21
            return r4
        L70:
            com.facebook.aura.devices.pairing.HatchDevicePairingViewModel$resolveAbraUsername$1 r3 = new com.facebook.aura.devices.pairing.HatchDevicePairingViewModel$resolveAbraUsername$1
            r3.<init>(r7)
            goto L12
        L76:
            java.lang.String r1 = "HatchDevicePairingViewModel"
            java.lang.String r0 = "Link provisioning username unavailable; omitting field"
            X.CFK.A06(r1, r0)
            return r2
        L7e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.pairing.HatchDevicePairingViewModel.resolveAbraUsername(X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveWifiPassword() {
        HxE<String, String> hxE = this.provisionedWifi;
        if (hxE != null) {
            String str = hxE.first;
            String str2 = hxE.second;
            if (str2.length() != 0) {
                loadSavedWifiNetworks(new C116631(str, str2));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startOtaRoundTwoWatchdog(HatchDevicePairingUserFlowLogger hatchDevicePairingUserFlowLogger) {
        HtJ htJA13 = AnonymousClass006.A13(this.otaRoundTwoWatchdog);
        this.isOtaRoundTwoDelivered = false;
        this.otaRoundTwoDeadlineMs = Long.valueOf(SystemClock.elapsedRealtime() + HatchDevicePairingStateMachineKt.LINK_OTA_ROUND_TWO_WINDOW_MS);
        this.otaRoundTwoWatchdog = AnonymousClass001.A11(new C116641(hatchDevicePairingUserFlowLogger, htJA13), AEu.A00(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0084 A[PHI: r10
  0x0084: PHI (r10v3 boolean) = (r10v0 boolean), (r10v4 boolean) binds: [B:28:0x0082, B:26:0x007f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0087 A[PHI: r10
  0x0087: PHI (r10v2 boolean) = (r10v0 boolean), (r10v3 boolean) binds: [B:28:0x0082, B:30:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void startPairingBleScanEffect() {
        /*
            r14 = this;
            X.BLG<com.facebook.aura.devices.pairing.HatchDevicePairingViewState> r0 = r14._uiState
            java.lang.Object r0 = r0.getValue()
            com.facebook.aura.devices.pairing.HatchDevicePairingViewState r0 = (com.facebook.aura.devices.pairing.HatchDevicePairingViewState) r0
            boolean r0 = r0.getBlePermissionsGranted()
            if (r0 != 0) goto L16
            com.facebook.aura.devices.pairing.logging.HatchDevicePairingUserFlowLogger r2 = r14.pairingLogger
            long r0 = r14.scanGeneration
            r14.recordMissingBlePermissions(r2, r0)
            return
        L16:
            long r2 = r14.scanGeneration
            r0 = 1
            long r2 = r2 + r0
            r14.scanGeneration = r2
            r0 = 0
            r14.hasLoggedPrepairingFailure = r0
            r14.recordPrepairingScanStart()
            r9 = 0
            com.facebook.aura.devices.pairing.logging.HatchDevicePairingUserFlowLogger r2 = r14.pairingLogger
            long r0 = r14.scanGeneration
            r14.recordMissingBlePermissions(r2, r0)
            r14.resetLinkSetupEffect()
            com.facebook.aura.devices.pairing.HatchDeviceBleManager r0 = r14.pairingBleManager
            if (r0 == 0) goto L35
            r0.stop()
        L35:
            com.facebook.aura.devices.pairing.HatchDeviceFamily r1 = r14.deviceFamily
            com.facebook.aura.devices.pairing.HatchDeviceFamily r0 = com.facebook.aura.devices.pairing.HatchDeviceFamily.HATCH_LINK
            if (r1 != r0) goto L41
            com.facebook.aura.devices.intf.DiscoveredDeviceClassifiers r0 = com.facebook.aura.devices.intf.DiscoveredDeviceClassifiers.INSTANCE
            com.facebook.aura.devices.intf.DiscoveredDeviceClassifier r9 = r0.resolve()
        L41:
            com.facebook.aura.utils.HatchUtil r3 = com.facebook.aura.utils.HatchUtil.INSTANCE
            boolean r2 = r3.isLinkCommunityDevicesEnabled()
            if (r2 == 0) goto La2
            if (r9 == 0) goto L55
            com.facebook.aura.common.prefs.HatchDeveloperMode r1 = com.facebook.aura.common.prefs.HatchDeveloperMode.INSTANCE
            X.CGz r0 = r14.userSession
            boolean r0 = r1.isEnabled(r0)
            if (r0 == 0) goto La2
        L55:
            r8 = 1
        L56:
            if (r9 == 0) goto L5d
            if (r2 == 0) goto L5d
            r0 = 1
            if (r8 == 0) goto L5e
        L5d:
            r0 = 0
        L5e:
            com.facebook.aura.devices.pairing.HatchDevicePairingEvent$DeveloperModeHintChanged r1 = new com.facebook.aura.devices.pairing.HatchDevicePairingEvent$DeveloperModeHintChanged
            r1.<init>(r0)
            com.facebook.aura.devices.pairing.logging.HatchDevicePairingUserFlowLogger r0 = r14.pairingLogger
            r14.dispatch(r1, r0)
            android.content.Context r4 = r14.appContext
            X.BLG<com.facebook.aura.devices.pairing.HatchDevicePairingViewState> r0 = r14._uiState
            java.lang.Object r0 = r0.getValue()
            com.facebook.aura.devices.pairing.HatchDevicePairingViewState r0 = (com.facebook.aura.devices.pairing.HatchDevicePairingViewState) r0
            java.lang.String r5 = r0.getPairingTargetName()
            com.facebook.aura.devices.pairing.HatchDeviceFamily r7 = r14.deviceFamily
            if (r9 == 0) goto L81
            boolean r0 = r3.isHatchLinksSettingsEnabled()
            r10 = 0
            if (r0 == 0) goto L84
        L81:
            r10 = 1
            if (r9 == 0) goto L87
        L84:
            r11 = 1
            if (r8 != 0) goto L88
        L87:
            r11 = 0
        L88:
            com.facebook.aura.devices.pairing.HatchDevicePairingMachineState r0 = r14.machineState
            java.lang.String r12 = r0.setUpAgainAddress
            com.facebook.aura.devices.pairing.logging.HatchDevicePairingUserFlowLogger r2 = r14.pairingLogger
            long r0 = r14.scanGeneration
            com.facebook.aura.devices.pairing.HatchDevicePairingViewModel$pairingBleListener$1 r13 = new com.facebook.aura.devices.pairing.HatchDevicePairingViewModel$pairingBleListener$1
            r13.<init>(r2, r0)
            X.A3q r6 = X.A3q.A00
            com.facebook.aura.devices.pairing.HatchDeviceBleManager r3 = new com.facebook.aura.devices.pairing.HatchDeviceBleManager
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r14.pairingBleManager = r3
            r3.start()
            return
        La2:
            r8 = 0
            goto L56
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.pairing.HatchDevicePairingViewModel.startPairingBleScanEffect():void");
    }

    private final void stopBleEffect() {
        this.scanGeneration++;
        HatchDeviceBleManager hatchDeviceBleManager = this.pairingBleManager;
        if (hatchDeviceBleManager != null) {
            hatchDeviceBleManager.stop();
        }
        this.pairingBleManager = null;
    }

    private final void trackOtaRoundTwo(HatchDevicePairingEvent hatchDevicePairingEvent, HatchLinkOtaRepairState hatchLinkOtaRepairState) {
        if (C7384Etj.areEqual(this.machineState.linkOtaRepairState, HatchLinkOtaRepairState.Idle.INSTANCE)) {
            clearOtaRoundTwoWindow();
        } else if ((hatchDevicePairingEvent instanceof HatchDevicePairingEvent.LinkProvisionRequestFinished) && ((HatchDevicePairingEvent.LinkProvisionRequestFinished) hatchDevicePairingEvent).success && (hatchLinkOtaRepairState instanceof HatchLinkOtaRepairState.Repairing)) {
            this.isOtaRoundTwoDelivered = true;
            this.otaRoundTwoWatchdog = C3cI.A15(this.otaRoundTwoWatchdog);
        }
    }

    @Override // com.facebook.aura.devices.pairing.HatchDevicePairingActions
    public void acknowledgeLinkInfo(Long l) {
        if (l == null) {
            continueAfterDeviceConnection();
            return;
        }
        if (canAcknowledgeLinkInfo(l.longValue())) {
            dispatch(HatchDevicePairingEvent.LinkInfoAcknowledged.INSTANCE, this.pairingLogger);
            InterfaceC10560Hsz<Boolean> interfaceC10560Hsz = this.pendingLinkConfirmation;
            if (interfaceC10560Hsz != null) {
                C8j4.A1S(true, interfaceC10560Hsz);
            }
        }
    }

    @Override // com.facebook.aura.devices.pairing.HatchDevicePairingActions
    public void confirmLinkAppPairing(Long l) {
        InterfaceC10560Hsz<Boolean> interfaceC10560Hsz;
        if (l != null) {
            long jLongValue = l.longValue();
            Long linkConfirmationRequestId = this.machineState.ui.getLinkConfirmationRequestId();
            if (linkConfirmationRequestId == null || jLongValue != linkConfirmationRequestId.longValue() || (interfaceC10560Hsz = this.pendingLinkConfirmation) == null || !interfaceC10560Hsz.isActive()) {
                return;
            }
            HatchDevicePairingViewState hatchDevicePairingViewState = this.machineState.ui;
            if (hatchDevicePairingViewState.getPairingStep() == HatchDevicePairingStep.LINK_BUTTON_CONFIRMATION && hatchDevicePairingViewState.getLinkAppConfirmation() == LinkAppConfirmationState.REQUIRED) {
                dispatch(new HatchDevicePairingEvent.LinkAppConfirmationChanged(LinkAppConfirmationState.CONTINUING), this.pairingLogger);
                InterfaceC10560Hsz<Boolean> interfaceC10560Hsz2 = this.pendingLinkConfirmation;
                if (interfaceC10560Hsz2 != null) {
                    C8j4.A1S(true, interfaceC10560Hsz2);
                }
            }
        }
    }

    @Override // com.facebook.aura.devices.pairing.HatchDevicePairingActions
    public void connectToFoundDevice() {
        dispatch(HatchDevicePairingEvent.ConnectToFoundDevice.INSTANCE, this.pairingLogger);
    }

    @Override // com.facebook.aura.devices.pairing.HatchDevicePairingActions
    public void dismissPairingDialog() {
        dispatch(HatchDevicePairingEvent.DismissDialog.INSTANCE, this.pairingLogger);
    }

    @Override // com.facebook.aura.devices.pairing.HatchDevicePairingActions
    public void dismissPairingFlow() {
        HatchDevicePairingUserFlowLogger hatchDevicePairingUserFlowLogger = this.pairingLogger;
        if (hatchDevicePairingUserFlowLogger != null) {
            hatchDevicePairingUserFlowLogger.markUserDismissed();
        }
        dispatch(HatchDevicePairingEvent.DismissFlow.INSTANCE, this.pairingLogger);
    }

    @Override // com.facebook.aura.devices.pairing.HatchDevicePairingActions
    public void enterManualWifiEntry() {
        dispatch(HatchDevicePairingEvent.EnterManualWifiEntry.INSTANCE, this.pairingLogger);
    }

    public final C1BN<AuraNavKey> getClaimedDeviceDestination() {
        return this.claimedDeviceDestination;
    }

    public final C1BN<HatchDevicePairingViewState> getUiState() {
        return this.uiState;
    }

    @Override // com.facebook.aura.devices.pairing.HatchDevicePairingActions
    public void goBackInPairing() {
        HatchDevicePairingStep pairingStep = this.machineState.ui.getPairingStep();
        if (pairingStep == HatchDevicePairingStep.LINK_INFO || pairingStep == HatchDevicePairingStep.LINK_BUTTON_CONFIRMATION) {
            resetLinkSetupEffect();
        }
        dispatch(HatchDevicePairingEvent.GoBack.INSTANCE, this.pairingLogger);
    }

    public final void onBlePermissionsResult(boolean z, String str) {
        if (str == null || str.equals(this.machineState.ui.pairingPresentationId)) {
            if (z) {
                if (!this.machineState.ui.getBlePermissionsGranted()) {
                }
                dispatch(new HatchDevicePairingEvent.BlePermissionsChanged(z), this.pairingLogger);
            }
            recordMissingBlePermissions(this.pairingLogger, this.scanGeneration);
            HatchDevicePairingUserFlowLogger hatchDevicePairingUserFlowLogger = this.pairingLogger;
            if (hatchDevicePairingUserFlowLogger != null) {
                hatchDevicePairingUserFlowLogger.markPoint(z ? HatchDevicePairingPoint.BLE_PERMISSION_GRANTED : HatchDevicePairingPoint.BLE_PERMISSION_DENIED);
            }
            dispatch(new HatchDevicePairingEvent.BlePermissionsChanged(z), this.pairingLogger);
        }
    }

    public final void onClaimedDeviceDestinationHandled() {
        this._claimedDeviceDestination.Af8(null);
    }

    @Override // X.AEs
    public void onCleared() {
        HatchDevicePairingUserFlowLogger hatchDevicePairingUserFlowLogger = this.pairingLogger;
        if (hatchDevicePairingUserFlowLogger != null) {
            hatchDevicePairingUserFlowLogger.close(null);
        }
        this.pairingLogger = null;
        this.startPairingLogger = null;
        dispatch(HatchDevicePairingEvent.Cleared.INSTANCE, null);
    }

    @Override // com.facebook.aura.devices.pairing.HatchDevicePairingActions
    public void requestWifiRescan() {
        dispatch(HatchDevicePairingEvent.RequestWifiRescan.INSTANCE, this.pairingLogger);
    }

    @Override // com.facebook.aura.devices.pairing.HatchDevicePairingActions
    public void resolveLinkDeviceKeyReplacement(boolean z) {
        InterfaceC10560Hsz<Boolean> interfaceC10560Hsz = this.pendingDeviceKeyReplacement;
        if (interfaceC10560Hsz != null) {
            C8j4.A1S(z, interfaceC10560Hsz);
        }
    }

    @Override // com.facebook.aura.devices.pairing.HatchDevicePairingActions
    public void skipWifi() {
        dispatch(HatchDevicePairingEvent.SkipWifi.INSTANCE, this.pairingLogger);
    }

    @Override // com.facebook.aura.devices.pairing.HatchDevicePairingActions
    public void startProvisioning() {
        dispatch(HatchDevicePairingEvent.StartProvisioning.INSTANCE, this.pairingLogger);
    }

    public HatchDevicePairingViewModel(Context context, AbstractC3358CGz abstractC3358CGz, HatchDeviceFamily hatchDeviceFamily) {
        AnonymousClass005.A0x(context, abstractC3358CGz, hatchDeviceFamily);
        this.appContext = context;
        this.userSession = abstractC3358CGz;
        this.deviceFamily = hatchDeviceFamily;
        this.stateMachine = new HatchDevicePairingStateMachine(hatchDeviceFamily);
        HatchDevicePairingMachineState hatchDevicePairingMachineStateInitial = HatchDevicePairingMachineState.Companion.initial();
        this.machineState = hatchDevicePairingMachineStateInitial;
        C9286GCn c9286GCnA01 = HnJ.A01(hatchDevicePairingMachineStateInitial.ui);
        this._uiState = c9286GCnA01;
        this.uiState = C3cG.A11(c9286GCnA01);
        this.savedWifiNetworks = HatchSavedWifiNetworkStore.Companion.forUser(abstractC3358CGz);
        this.savedWifiPasswords = C9jH.A00;
        C9286GCn c9286GCnA012 = HnJ.A01(null);
        this._claimedDeviceDestination = c9286GCnA012;
        this.claimedDeviceDestination = C3cG.A11(c9286GCnA012);
        ConcurrentHashMap.KeySetView keySetViewNewKeySet = ConcurrentHashMap.newKeySet();
        C7384Etj.A0U(keySetViewNewKeySet);
        this.mintedDeviceKeyIds = keySetViewNewKeySet;
        this.unconfirmedTokens = new LinkUnconfirmedTokens(LinkDeviceKeys.Companion.forSession(abstractC3358CGz));
        this.savedWifiLock = new C9258GBl();
        loadSavedWifiNetworks(new AnonymousClass1());
    }

    private final void executeEffects(List<? extends HatchDevicePairingEffect> list) {
        for (HatchDevicePairingEffect hatchDevicePairingEffect : list) {
            if (C7384Etj.areEqual(hatchDevicePairingEffect, HatchDevicePairingEffect.StartBleScan.INSTANCE)) {
                startPairingBleScanEffect();
            } else if (C7384Etj.areEqual(hatchDevicePairingEffect, HatchDevicePairingEffect.StopBle.INSTANCE)) {
                stopBleEffect();
            } else if (C7384Etj.areEqual(hatchDevicePairingEffect, HatchDevicePairingEffect.ResetLinkSetup.INSTANCE)) {
                resetLinkSetupEffect();
            } else if (C7384Etj.areEqual(hatchDevicePairingEffect, HatchDevicePairingEffect.ConnectToDiscovered.INSTANCE)) {
                connectToDiscoveredEffect();
            } else if (hatchDevicePairingEffect instanceof HatchDevicePairingEffect.ConnectToDevice) {
                HatchDeviceBleManager hatchDeviceBleManager = this.pairingBleManager;
                if (hatchDeviceBleManager != null) {
                    hatchDeviceBleManager.connectToDevice(((HatchDevicePairingEffect.ConnectToDevice) hatchDevicePairingEffect).address);
                }
            } else if (C7384Etj.areEqual(hatchDevicePairingEffect, HatchDevicePairingEffect.EstablishLinkPairing.INSTANCE)) {
                establishLinkPairingEffect();
            } else if (C7384Etj.areEqual(hatchDevicePairingEffect, HatchDevicePairingEffect.RequestLinkWifiScan.INSTANCE)) {
                requestLinkWiFiScanEffect();
            } else {
                if (!(hatchDevicePairingEffect instanceof HatchDevicePairingEffect.ProvisionLink)) {
                    throw C3cG.A0q();
                }
                HatchDevicePairingEffect.ProvisionLink provisionLink = (HatchDevicePairingEffect.ProvisionLink) hatchDevicePairingEffect;
                provisionLinkEffect(provisionLink.ssid, provisionLink.password, provisionLink.allowOta);
            }
        }
    }

    private final void loadSavedWifiNetworks(Function0<? extends Map<String, String>> function0) {
        AnonymousClass001.A1I(AuraDispatchers.mainImmediate, new C116581(function0, null), AEu.A00(this));
    }

    public static /* synthetic */ void recordPrepairingFailure$default(HatchDevicePairingViewModel hatchDevicePairingViewModel, HatchDevicePairingAnalytics.FailureReason failureReason, List list, HatchDevicePairingUserFlowLogger hatchDevicePairingUserFlowLogger, long j, int i, Object obj) {
        List<String> listA11 = C3cI.A11(list, i);
        if ((i & 4) != 0) {
            hatchDevicePairingUserFlowLogger = hatchDevicePairingViewModel.pairingLogger;
        }
        if ((i & 8) != 0) {
            j = hatchDevicePairingViewModel.scanGeneration;
        }
        hatchDevicePairingViewModel.recordPrepairingFailure(failureReason, listA11, hatchDevicePairingUserFlowLogger, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refuseGadgetSetup(String str, HatchDevicePairingUserFlowLogger hatchDevicePairingUserFlowLogger) {
        if (isGadgetSetup(str)) {
            dispatch(new HatchDevicePairingEvent.LinkSetupRefused(LinkSetupRefusal.GADGET_FIRMWARE_UPDATE_REQUIRED), hatchDevicePairingUserFlowLogger);
        }
    }

    @Override // com.facebook.aura.devices.pairing.HatchDevicePairingActions
    public void continueAfterDeviceConnection() {
        if (canContinueAfterDeviceConnection()) {
            dispatch(HatchDevicePairingEvent.ContinueAfterDeviceConnection.INSTANCE, this.pairingLogger);
        }
    }
}
