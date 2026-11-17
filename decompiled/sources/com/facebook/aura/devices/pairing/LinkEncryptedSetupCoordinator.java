package com.facebook.aura.devices.pairing;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.Bs8;
import X.C06H;
import X.C10571Hud;
import X.C3UX;
import X.C3cG;
import X.C3cI;
import X.C7384Etj;
import X.C7438Evz;
import X.C7Bm;
import X.C8j3;
import X.C8j4;
import X.C8j5;
import X.C9258GBl;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.G2j;
import X.GAX;
import X.GBL;
import X.HtJ;
import X.Hwg;
import X.HzP;
import X.InterfaceC2261BLa;
import android.os.SystemClock;
import com.facebook.aura.devices.intf.LinkSetupHandoff;
import com.facebook.aura.devices.intf.LinkTokenOnlySetup;
import com.facebook.aura.devices.intf.LinkTokenOnlySetups;
import com.facebook.aura.devices.pairing.logging.HatchDevicePairingFailureReason;
import com.facebook.aura.devices.pairing.logging.HatchDevicePairingUserFlowLogger;
import com.facebook.aura.devices.token.LinkDeviceApp;
import com.facebook.aura.devices.token.LinkDeviceKey;
import com.facebook.aura.devices.token.LinkDeviceKeyProvisionFields;
import com.facebook.aura.devices.token.LinkDeviceKeyRecord;
import com.facebook.aura.devices.token.LinkDeviceTokenMintResult;
import com.facebook.aura.devices.token.LinkDeviceTokenMinter;
import com.facebook.aura.devices.token.LinkDeviceTokenPair;
import com.facebook.aura.devices.token.LinkSdkTokenFailure;
import com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepositoryJsonKt;
import com.facebook.aura.sharesheet.HatchVideoAudioStripperKt;
import com.facebook.aura.utils.HatchUtil;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class LinkEncryptedSetupCoordinator {
    public static final int $stable = 8;
    public final AtomicBoolean attemptMintedTokens;
    public final Function0<Boolean> communityDevicesEnabledProvider;
    public final InterfaceC2261BLa confirmationMutex;
    public volatile LinkConfirmedSetup confirmedSetup;
    public final AtomicReference<LinkDeviceKey> deliveredDeviceKey;
    public final long deviceInfoTimeoutMs;
    public final LinkDeviceKeyProvisioning deviceKeyProvisioning;
    public final G2j<String, LinkDeviceApp, String, HtJ<? super LinkDeviceTokenMintResult>, Object> deviceTokenMinter;
    public volatile LinkEncryptedSetup encryptedSetup;
    public final Function0<String> fleetManagerUrlProvider;
    public final LinkFleetPublicKeyProvider fleetPublicKeyProvider;
    public volatile LinkSetupHandoff handoff;
    public final InterfaceC2261BLa handshakeMutex;
    public final G0V<String, HtJ<? super Boolean>, Object> isKnownSetup;
    public final Set<String> mintedDeviceKeyIds;
    public final Function0<Long> nowMs;
    public final G0U<HtJ<? super Boolean>, Object> onAppConfirmationRequired;
    public final G0U<String, Unit> onCommunityDeviceProvisioned;
    public final G0U<HtJ<? super Boolean>, Object> onCommunityInfoRequired;
    public final G0V<LinkDeviceKeyRecord, HtJ<? super Boolean>, Object> onDeviceKeyReplacementRequired;
    public final G0U<LinkDeviceKeySetupFailure, Unit> onDeviceKeySetupFailed;
    public final G0U<LinkDeviceVerification, Unit> onDeviceVerificationChanged;
    public final G0U<LinkSdkTokenFailure, Unit> onSdkTokenFailure;
    public final G0U<LinkSetupRefusal, Unit> onSetupRefused;
    public final Function0<Boolean> otaForcedProvider;
    public final Function0<String> otaMinFirmwareVersionProvider;
    public final Function0<String> otaUrlProvider;
    public final LinkPairedNodeCheck pairedNodeCheck;
    public final HatchDevicePairingUserFlowLogger pairingLogger;
    public final long pairingReadyTimeoutMs;
    public final InterfaceC2261BLa provisionMutex;
    public volatile LinkEncryptedSetup provisionedSetup;
    public final Function0<Boolean> sdkTokenForwardingEnabledProvider;
    public final AtomicInteger setupGeneration;
    public final InterfaceC2261BLa setupMutex;
    public final Function0<LinkTokenOnlySetup> tokenOnlySetupProvider;
    public final LinkEncryptedSetupBleTransport transport;
    public final LinkUnconfirmedTokens unconfirmedTokens;

    /* renamed from: com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 extends C7438Evz implements G2j {
        public AnonymousClass1(Object obj) {
            super(4, obj, LinkDeviceTokenMinter.class, "mintDeviceTokens", "mintDeviceTokens(Ljava/lang/String;Lcom/facebook/aura/devices/token/LinkDeviceApp;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // X.G2j
        public final Object invoke(String str, LinkDeviceApp linkDeviceApp, String str2, HtJ<? super LinkDeviceTokenMintResult> htJ) {
            return ((LinkDeviceTokenMinter) this.receiver).mintDeviceTokens(str, linkDeviceApp, str2, htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$12", f = "LinkEncryptedSetupCoordinator.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$12, reason: invalid class name */
    public final class AnonymousClass12 extends AbstractC07127nr implements G0V<String, HtJ<? super Boolean>, Object> {
        public int label;

        public AnonymousClass12(HtJ<? super AnonymousClass12> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass12(htJ);
        }

        @Override // X.G0V
        public final Object invoke(String str, HtJ<? super Boolean> htJ) {
            return new AnonymousClass12(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return AnonymousClass001.A0h();
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$13", f = "LinkEncryptedSetupCoordinator.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$13, reason: invalid class name */
    public final class AnonymousClass13 extends AbstractC07127nr implements G0V<LinkDeviceKeyRecord, HtJ<? super Boolean>, Object> {
        public int label;

        public AnonymousClass13(HtJ<? super AnonymousClass13> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass13(htJ);
        }

        @Override // X.G0V
        public final Object invoke(LinkDeviceKeyRecord linkDeviceKeyRecord, HtJ<? super Boolean> htJ) {
            return new AnonymousClass13(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return AnonymousClass001.A0h();
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$15, reason: invalid class name */
    public final class AnonymousClass15 extends AbstractC7559F3s implements Function0<String> {
        public static final AnonymousClass15 INSTANCE = new AnonymousClass15();

        public AnonymousClass15() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ String invoke() {
            return HatchUtil.INSTANCE.getLinkOtaUrl();
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return HatchUtil.INSTANCE.getLinkOtaUrl();
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$16, reason: invalid class name */
    public final class AnonymousClass16 extends AbstractC7559F3s implements Function0<Boolean> {
        public static final AnonymousClass16 INSTANCE = new AnonymousClass16();

        public AnonymousClass16() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(HatchUtil.INSTANCE.isLinkOtaForced());
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$17, reason: invalid class name */
    public final class AnonymousClass17 extends AbstractC7559F3s implements Function0<String> {
        public static final AnonymousClass17 INSTANCE = new AnonymousClass17();

        public AnonymousClass17() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ String invoke() {
            return HatchUtil.INSTANCE.getLinkOtaMinFirmwareVersion();
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return HatchUtil.INSTANCE.getLinkOtaMinFirmwareVersion();
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$18, reason: invalid class name */
    /* loaded from: classes2.dex */
    public final /* synthetic */ class AnonymousClass18 extends C7438Evz implements Function0<Long> {
        public static final AnonymousClass18 INSTANCE = new AnonymousClass18();

        public AnonymousClass18() {
            super(0, SystemClock.class, "elapsedRealtime", "elapsedRealtime()J", 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return C3cI.A0O();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Long invoke() {
            return C3cI.A0O();
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<String> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ String invoke() {
            return HatchUtil.INSTANCE.getLinkFleetManagerUrl();
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return HatchUtil.INSTANCE.getLinkFleetManagerUrl();
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements Function0<Boolean> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(HatchUtil.INSTANCE.isLinkCommunityDevicesEnabled());
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements Function0<Boolean> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        public AnonymousClass4() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(HatchUtil.INSTANCE.isLinkSdkTokenForwardingEnabled());
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$5, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass5 extends C7438Evz implements Function0<LinkTokenOnlySetup> {
        public AnonymousClass5(Object obj) {
            super(0, obj, LinkTokenOnlySetups.class, "resolve", "resolve()Lcom/facebook/aura/devices/intf/LinkTokenOnlySetup;", 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final LinkTokenOnlySetup invoke() {
            return ((LinkTokenOnlySetups) this.receiver).resolve();
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$7", f = "LinkEncryptedSetupCoordinator.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$7, reason: invalid class name */
    public final class AnonymousClass7 extends AbstractC07127nr implements G0U<HtJ<? super Boolean>, Object> {
        public int label;

        public AnonymousClass7(HtJ<? super AnonymousClass7> htJ) {
            super(1, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return new AnonymousClass7(htJ);
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Boolean> htJ) {
            return new AnonymousClass7(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return AnonymousClass001.A0h();
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$8", f = "LinkEncryptedSetupCoordinator.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$8, reason: invalid class name */
    public final class AnonymousClass8 extends AbstractC07127nr implements G0U<HtJ<? super Boolean>, Object> {
        public int label;

        public AnonymousClass8(HtJ<? super AnonymousClass8> htJ) {
            super(1, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return new AnonymousClass8(htJ);
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Boolean> htJ) {
            return new AnonymousClass8(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return AnonymousClass001.A0h();
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator", f = "LinkEncryptedSetupCoordinator.kt", l = {768}, m = "acceptPairingConfirmation", v = 2)
    /* renamed from: com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$acceptPairingConfirmation$1, reason: invalid class name and case insensitive filesystem */
    public final class C116671 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C116671(HtJ<? super C116671> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LinkEncryptedSetupCoordinator.this.acceptPairingConfirmation(0, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$awaitPairingConfirmation$2", f = "LinkEncryptedSetupCoordinator.kt", l = {872}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$awaitPairingConfirmation$2, reason: invalid class name and case insensitive filesystem */
    public final class C116682 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super LinkPairingConfirmationResult>, Object> {
        public int label;

        public C116682(HtJ<? super C116682> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return LinkEncryptedSetupCoordinator.this.new C116682(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super LinkPairingConfirmationResult> htJ) {
            return LinkEncryptedSetupCoordinator.this.new C116682(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                LinkEncryptedSetupBleTransport linkEncryptedSetupBleTransport = LinkEncryptedSetupCoordinator.this.transport;
                this.label = 1;
                obj = linkEncryptedSetupBleTransport.awaitPairingConfirmation(this);
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
    }

    @DebugMetadata(c = "com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator", f = "LinkEncryptedSetupCoordinator.kt", l = {711}, m = "confirmSetup", v = 2)
    /* renamed from: com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$confirmSetup$1, reason: invalid class name and case insensitive filesystem */
    public final class C116691 extends HzP {
        public int I$0;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C116691(HtJ<? super C116691> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LinkEncryptedSetupCoordinator.this.confirmSetup(0, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator", f = "LinkEncryptedSetupCoordinator.kt", l = {504}, m = "deviceKeyPlanFor", v = 2)
    /* renamed from: com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$deviceKeyPlanFor$1, reason: invalid class name and case insensitive filesystem */
    public final class C116701 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C116701(HtJ<? super C116701> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LinkEncryptedSetupCoordinator.this.deviceKeyPlanFor(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$deviceKeyPlanFor$2", f = "LinkEncryptedSetupCoordinator.kt", l = {504}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$deviceKeyPlanFor$2, reason: invalid class name and case insensitive filesystem */
    public final class C116712 extends AbstractC07127nr implements G0U<HtJ<? super LinkDeviceKeyPlan>, Object> {
        public final /* synthetic */ LinkOtaOffer $ota;
        public final /* synthetic */ LinkDeviceKeyProvisioning $provisioning;
        public final /* synthetic */ LinkEncryptedSetupSnapshot $snapshot;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116712(LinkDeviceKeyProvisioning linkDeviceKeyProvisioning, LinkEncryptedSetupSnapshot linkEncryptedSetupSnapshot, LinkOtaOffer linkOtaOffer, HtJ<? super C116712> htJ) {
            super(1, htJ);
            this.$provisioning = linkDeviceKeyProvisioning;
            this.$snapshot = linkEncryptedSetupSnapshot;
            this.$ota = linkOtaOffer;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return new C116712(this.$provisioning, this.$snapshot, this.$ota, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                LinkDeviceKeyProvisioning linkDeviceKeyProvisioning = this.$provisioning;
                LinkDeviceInfo linkDeviceInfo = this.$snapshot.setup.deviceInfo;
                LinkOtaOffer linkOtaOffer = this.$ota;
                this.label = 1;
                obj = linkDeviceKeyProvisioning.plan(linkDeviceInfo, linkOtaOffer, this);
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
        public final Object invoke(HtJ<? super LinkDeviceKeyPlan> htJ) {
            return ((C116712) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator", f = "LinkEncryptedSetupCoordinator.kt", l = {613, 629, 632, 639, 641}, m = "ensureEncryptedSetup", v = 2)
    /* renamed from: com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$ensureEncryptedSetup$1, reason: invalid class name and case insensitive filesystem */
    public final class C116721 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C116721(HtJ<? super C116721> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LinkEncryptedSetupCoordinator.this.ensureEncryptedSetup(0, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator", f = "LinkEncryptedSetupCoordinator.kt", l = {577, 593}, m = "ensureEncryptedSetupSnapshot", v = 2)
    /* renamed from: com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$ensureEncryptedSetupSnapshot$1, reason: invalid class name and case insensitive filesystem */
    public final class C116731 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C116731(HtJ<? super C116731> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LinkEncryptedSetupCoordinator.this.ensureEncryptedSetupSnapshot(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator", f = "LinkEncryptedSetupCoordinator.kt", l = {184}, m = "establishEncryptedSetup", v = 2)
    /* renamed from: com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$establishEncryptedSetup$1, reason: invalid class name and case insensitive filesystem */
    public final class C116741 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public C116741(HtJ<? super C116741> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LinkEncryptedSetupCoordinator.this.establishEncryptedSetup(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$establishEncryptedSetup$2", f = "LinkEncryptedSetupCoordinator.kt", l = {184}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$establishEncryptedSetup$2, reason: invalid class name and case insensitive filesystem */
    public final class C116752 extends AbstractC07127nr implements G0U<HtJ<? super LinkEncryptedSetupSnapshot>, Object> {
        public int label;

        public C116752(HtJ<? super C116752> htJ) {
            super(1, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return LinkEncryptedSetupCoordinator.this.new C116752(htJ);
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super LinkEncryptedSetupSnapshot> htJ) {
            return LinkEncryptedSetupCoordinator.this.new C116752(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                LinkEncryptedSetupCoordinator linkEncryptedSetupCoordinator = LinkEncryptedSetupCoordinator.this;
                this.label = 1;
                obj = linkEncryptedSetupCoordinator.ensureEncryptedSetupSnapshot(this);
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
    }

    @DebugMetadata(c = "com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator", f = "LinkEncryptedSetupCoordinator.kt", l = {514}, m = "mintDeviceKey", v = 2)
    /* renamed from: com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$mintDeviceKey$1, reason: invalid class name and case insensitive filesystem */
    public final class C116761 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C116761(HtJ<? super C116761> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LinkEncryptedSetupCoordinator.this.mintDeviceKey(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator", f = "LinkEncryptedSetupCoordinator.kt", l = {311, 317}, m = "mintDeviceTokens", v = 2)
    /* renamed from: com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$mintDeviceTokens$1, reason: invalid class name and case insensitive filesystem */
    public final class C116771 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C116771(HtJ<? super C116771> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LinkEncryptedSetupCoordinator.this.mintDeviceTokens(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator", f = "LinkEncryptedSetupCoordinator.kt", l = {907, 229, 238, 249, 255, VoiceSelectionRepositoryJsonKt.MAX_VOICE_ID_LENGTH, 275}, m = "provision", v = 2)
    /* renamed from: com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$provision$1, reason: invalid class name and case insensitive filesystem */
    public final class C116781 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C116781(HtJ<? super C116781> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LinkEncryptedSetupCoordinator.this.provision(null, null, null, false, null, null, this);
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$provision$2, reason: invalid class name and case insensitive filesystem */
    public final class C116792 extends AbstractC7559F3s implements Function0<Unit> {
        public static final C116792 INSTANCE = new C116792();

        public C116792() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator", f = "LinkEncryptedSetupCoordinator.kt", l = {187, 907}, m = "requestEncryptedWiFiScan", v = 2)
    /* renamed from: com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$requestEncryptedWiFiScan$1, reason: invalid class name and case insensitive filesystem */
    public final class C116801 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C116801(HtJ<? super C116801> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LinkEncryptedSetupCoordinator.this.requestEncryptedWiFiScan(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$requestLinkDeviceInfo$2", f = "LinkEncryptedSetupCoordinator.kt", l = {903}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$requestLinkDeviceInfo$2, reason: invalid class name and case insensitive filesystem */
    public final class C116812 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super LinkDeviceInfo>, Object> {
        public Object L$0;
        public int label;

        public C116812(HtJ<? super C116812> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return LinkEncryptedSetupCoordinator.this.new C116812(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super LinkDeviceInfo> htJ) {
            return LinkEncryptedSetupCoordinator.this.new C116812(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                LinkEncryptedSetupCoordinator linkEncryptedSetupCoordinator = LinkEncryptedSetupCoordinator.this;
                this.L$0 = linkEncryptedSetupCoordinator;
                this.label = 1;
                GBL gblA04 = C7Bm.A04(this);
                LinkEncryptedSetupCoordinator$requestLinkDeviceInfo$2$1$callback$1 linkEncryptedSetupCoordinator$requestLinkDeviceInfo$2$1$callback$1 = new LinkEncryptedSetupCoordinator$requestLinkDeviceInfo$2$1$callback$1(gblA04);
                linkEncryptedSetupCoordinator.transport.requestLinkDeviceInfo(linkEncryptedSetupCoordinator$requestLinkDeviceInfo$2$1$callback$1);
                gblA04.AO2(new LinkEncryptedSetupCoordinator$requestLinkDeviceInfo$2$1$1(linkEncryptedSetupCoordinator, linkEncryptedSetupCoordinator$requestLinkDeviceInfo$2$1$callback$1));
                obj = gblA04.A0F();
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
    }

    @DebugMetadata(c = "com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$requestPairingReady$2", f = "LinkEncryptedSetupCoordinator.kt", l = {903}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$requestPairingReady$2, reason: invalid class name and case insensitive filesystem */
    public final class C116822 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super LinkPairingReady>, Object> {
        public final /* synthetic */ LinkPairingClientHello $clientHello;
        public Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116822(LinkPairingClientHello linkPairingClientHello, HtJ<? super C116822> htJ) {
            super(2, htJ);
            this.$clientHello = linkPairingClientHello;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return LinkEncryptedSetupCoordinator.this.new C116822(this.$clientHello, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                LinkEncryptedSetupCoordinator linkEncryptedSetupCoordinator = LinkEncryptedSetupCoordinator.this;
                LinkPairingClientHello linkPairingClientHello = this.$clientHello;
                this.L$0 = linkEncryptedSetupCoordinator;
                this.L$1 = linkPairingClientHello;
                this.label = 1;
                GBL gblA04 = C7Bm.A04(this);
                LinkEncryptedSetupCoordinator$requestPairingReady$2$1$callback$1 linkEncryptedSetupCoordinator$requestPairingReady$2$1$callback$1 = new LinkEncryptedSetupCoordinator$requestPairingReady$2$1$callback$1(gblA04);
                linkEncryptedSetupCoordinator.transport.sendPairingClientHello(linkPairingClientHello, linkEncryptedSetupCoordinator$requestPairingReady$2$1$callback$1);
                gblA04.AO2(new LinkEncryptedSetupCoordinator$requestPairingReady$2$1$1(linkEncryptedSetupCoordinator, linkEncryptedSetupCoordinator$requestPairingReady$2$1$callback$1));
                obj = gblA04.A0F();
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
        public final Object invoke(C3UX c3ux, HtJ<? super LinkPairingReady> htJ) {
            return ((C116822) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator", f = "LinkEncryptedSetupCoordinator.kt", l = {555}, m = "runSetupStep", v = 2)
    /* renamed from: com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$runSetupStep$1, reason: invalid class name and case insensitive filesystem */
    public final class C116831<T> extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C116831(HtJ<? super C116831> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LinkEncryptedSetupCoordinator.this.runSetupStep(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator", f = "LinkEncryptedSetupCoordinator.kt", l = {467, 467, 472}, m = "unclaimedNodeFailure", v = 2)
    /* renamed from: com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$unclaimedNodeFailure$1, reason: invalid class name and case insensitive filesystem */
    public final class C116841 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;
        public /* synthetic */ Object result;

        public C116841(HtJ<? super C116841> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LinkEncryptedSetupCoordinator.this.unclaimedNodeFailure(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator", f = "LinkEncryptedSetupCoordinator.kt", l = {907, 918, 414, 928}, m = "writeProvisionRecord", v = 2)
    /* renamed from: com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$writeProvisionRecord$1, reason: invalid class name and case insensitive filesystem */
    public final class C116851 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public boolean Z$0;
        public boolean Z$1;
        public boolean Z$2;
        public int label;
        public /* synthetic */ Object result;

        public C116851(HtJ<? super C116851> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LinkEncryptedSetupCoordinator.this.writeProvisionRecord(null, null, false, null, null, null, null, false, null, null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LinkEncryptedSetupCoordinator(LinkEncryptedSetupBleTransport linkEncryptedSetupBleTransport, long j, long j2, LinkFleetPublicKeyProvider linkFleetPublicKeyProvider, G2j<? super String, ? super LinkDeviceApp, ? super String, ? super HtJ<? super LinkDeviceTokenMintResult>, ? extends Object> g2j, Function0<String> function0, Function0<Boolean> function02, Function0<Boolean> function03, Function0<? extends LinkTokenOnlySetup> function04, HatchDevicePairingUserFlowLogger hatchDevicePairingUserFlowLogger, G0U<? super LinkDeviceVerification, Unit> g0u, G0U<? super HtJ<? super Boolean>, ? extends Object> g0u2, G0U<? super HtJ<? super Boolean>, ? extends Object> g0u3, G0U<? super String, Unit> g0u4, G0U<? super LinkSdkTokenFailure, Unit> g0u5, G0U<? super LinkSetupRefusal, Unit> g0u6, LinkDeviceKeyProvisioning linkDeviceKeyProvisioning, LinkPairedNodeCheck linkPairedNodeCheck, G0V<? super String, ? super HtJ<? super Boolean>, ? extends Object> g0v, Set<String> set, G0V<? super LinkDeviceKeyRecord, ? super HtJ<? super Boolean>, ? extends Object> g0v2, G0U<? super LinkDeviceKeySetupFailure, Unit> g0u7, LinkUnconfirmedTokens linkUnconfirmedTokens, Function0<String> function05, Function0<Boolean> function06, Function0<String> function07, Function0<Long> function08) {
        AnonymousClass005.A16(linkEncryptedSetupBleTransport, linkFleetPublicKeyProvider, g2j, function0, 0);
        AnonymousClass005.A13(function02, function03, function04, 6);
        AnonymousClass005.A18(g0u, g0u2, g0u3, g0u4, g0u5);
        C7384Etj.A0Y(g0u6, 15);
        C7384Etj.A0Y(g0v, 18);
        C7384Etj.A0Y(set, 19);
        C7384Etj.A0Y(g0v2, 20);
        C7384Etj.A0Y(g0u7, 21);
        C7384Etj.A0Y(function05, 23);
        C8j5.A0l(function06, function07, function08);
        this.transport = linkEncryptedSetupBleTransport;
        this.deviceInfoTimeoutMs = j;
        this.pairingReadyTimeoutMs = j2;
        this.fleetPublicKeyProvider = linkFleetPublicKeyProvider;
        this.deviceTokenMinter = g2j;
        this.fleetManagerUrlProvider = function0;
        this.communityDevicesEnabledProvider = function02;
        this.sdkTokenForwardingEnabledProvider = function03;
        this.tokenOnlySetupProvider = function04;
        this.pairingLogger = hatchDevicePairingUserFlowLogger;
        this.onDeviceVerificationChanged = g0u;
        this.onAppConfirmationRequired = g0u2;
        this.onCommunityInfoRequired = g0u3;
        this.onCommunityDeviceProvisioned = g0u4;
        this.onSdkTokenFailure = g0u5;
        this.onSetupRefused = g0u6;
        this.deviceKeyProvisioning = linkDeviceKeyProvisioning;
        this.pairedNodeCheck = linkPairedNodeCheck;
        this.isKnownSetup = g0v;
        this.mintedDeviceKeyIds = set;
        this.onDeviceKeyReplacementRequired = g0v2;
        this.onDeviceKeySetupFailed = g0u7;
        this.unconfirmedTokens = linkUnconfirmedTokens;
        this.otaUrlProvider = function05;
        this.otaForcedProvider = function06;
        this.otaMinFirmwareVersionProvider = function07;
        this.nowMs = function08;
        this.deliveredDeviceKey = new AtomicReference<>(null);
        this.attemptMintedTokens = new AtomicBoolean(false);
        this.setupGeneration = new AtomicInteger(0);
        this.handshakeMutex = new C9258GBl();
        this.confirmationMutex = new C9258GBl();
        this.setupMutex = new C9258GBl();
        this.provisionMutex = new C9258GBl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.Hud] */
    private final synchronized LinkEncryptedRecordJson encryptedProvisionRecordIfCurrent(LinkEncryptedSetupSnapshot linkEncryptedSetupSnapshot, LinkDeviceTokenPair linkDeviceTokenPair, String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, String str7, String str8, LinkDeviceKeyProvisionFields linkDeviceKeyProvisionFields) {
        LinkEncryptedRecordJson linkEncryptedRecordJson;
        LinkEncryptedRecordJson linkEncryptedRecordJsonA0s;
        if (isCurrent(linkEncryptedSetupSnapshot)) {
            try {
                linkEncryptedRecordJsonA0s = linkEncryptedSetupSnapshot.setup.session.encryptProvision(str, str2, linkDeviceTokenPair.accessToken, linkDeviceTokenPair.refreshToken, str3, str4, str5, bool, str6, str7, str8, linkDeviceKeyProvisionFields);
            } catch (Throwable th) {
                linkEncryptedRecordJsonA0s = C3cG.A0s(th);
            }
            linkEncryptedRecordJson = linkEncryptedRecordJsonA0s instanceof C10571Hud ? null : linkEncryptedRecordJsonA0s;
        }
        return linkEncryptedRecordJson;
    }

    private final synchronized LinkEncryptedSetup installSetupIfCurrent(int i, LinkEncryptedSetup linkEncryptedSetup) {
        LinkDeviceVerification linkDeviceVerification = null;
        if (this.setupGeneration.get() == i) {
            this.transport.installEncryptedPairingSession(linkEncryptedSetup.session);
            if (this.transport.hasEncryptedPairingSession(linkEncryptedSetup.session)) {
                this.encryptedSetup = linkEncryptedSetup;
                G0U<LinkDeviceVerification, Unit> g0u = this.onDeviceVerificationChanged;
                LinkEncryptedPairingSession linkEncryptedPairingSession = linkEncryptedSetup.session;
                if (linkEncryptedPairingSession.isCommunity) {
                    linkDeviceVerification = LinkDeviceVerification.COMMUNITY;
                } else {
                    LinkPairingMode linkPairingMode = linkEncryptedPairingSession.pairingMode;
                    if ((linkPairingMode == LinkPairingMode.V4_CONFIRM_PRESS || linkPairingMode == LinkPairingMode.V5) && linkEncryptedSetup.deviceInfo.pairingAuthEpoch == 1) {
                        linkDeviceVerification = LinkDeviceVerification.VERIFIED_META;
                    }
                }
                g0u.invoke(linkDeviceVerification);
                return linkEncryptedSetup;
            }
        }
        return null;
    }

    private final synchronized void markProvisionedIfCurrent(LinkEncryptedSetupSnapshot linkEncryptedSetupSnapshot, LinkSetupHandoff linkSetupHandoff) {
        if (isCurrent(linkEncryptedSetupSnapshot)) {
            this.provisionedSetup = linkEncryptedSetupSnapshot.setup;
            this.handoff = linkSetupHandoff;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mintDeviceKey(com.facebook.aura.devices.pairing.LinkEncryptedSetupSnapshot r10, com.facebook.aura.devices.token.LinkDeviceKeyTarget r11, X.HtJ<? super com.facebook.aura.devices.token.LinkDeviceKey> r12) {
        /*
            r9 = this;
            r8 = r10
            boolean r0 = r12 instanceof com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator.C116761
            if (r0 == 0) goto L5e
            r4 = r12
            com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$mintDeviceKey$1 r4 = (com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator.C116761) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5e
            int r2 = r2 - r1
            r4.label = r2
        L13:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r1 = r4.label
            r10 = 0
            r0 = 1
            if (r1 == 0) goto L41
            if (r1 != r0) goto L75
            java.lang.Object r8 = r4.L$0
            com.facebook.aura.devices.pairing.LinkEncryptedSetupSnapshot r8 = (com.facebook.aura.devices.pairing.LinkEncryptedSetupSnapshot) r8
            X.Hwg.A00(r3)
        L26:
            com.facebook.aura.devices.pairing.LinkDeviceKeyMintResult r3 = (com.facebook.aura.devices.pairing.LinkDeviceKeyMintResult) r3
            if (r3 != 0) goto L31
            com.facebook.aura.devices.pairing.LinkDeviceKeySetupFailure r0 = com.facebook.aura.devices.pairing.LinkDeviceKeySetupFailure.DEVICE_KEY_UNAVAILABLE
            com.facebook.aura.devices.pairing.LinkDeviceKeyMintResult$Failed r3 = new com.facebook.aura.devices.pairing.LinkDeviceKeyMintResult$Failed
            r3.<init>(r0)
        L31:
            boolean r0 = r3 instanceof com.facebook.aura.devices.pairing.LinkDeviceKeyMintResult.Minted
            if (r0 == 0) goto L64
            com.facebook.aura.devices.pairing.LinkDeviceKeyMintResult$Minted r3 = (com.facebook.aura.devices.pairing.LinkDeviceKeyMintResult.Minted) r3
            com.facebook.aura.devices.token.LinkDeviceKey r2 = r3.key
            java.util.Set<java.lang.String> r1 = r9.mintedDeviceKeyIds
            java.lang.String r0 = r2.encodedKeyId
            r1.add(r0)
            return r2
        L41:
            X.Hwg.A00(r3)
            com.facebook.aura.devices.pairing.LinkDeviceKeyProvisioning r6 = r9.deviceKeyProvisioning
            if (r6 != 0) goto L49
            return r10
        L49:
            com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$mintDeviceKey$result$1 r5 = new com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$mintDeviceKey$result$1
            r7 = r11
            r5.<init>(r6, r7, r8, r9, r10)
            r4.L$0 = r8
            r4.L$1 = r10
            r4.L$2 = r10
            r4.label = r0
            java.lang.Object r3 = r9.runSetupStep(r5, r4)
            if (r3 != r2) goto L26
            return r2
        L5e:
            com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$mintDeviceKey$1 r4 = new com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$mintDeviceKey$1
            r4.<init>(r12)
            goto L13
        L64:
            boolean r0 = r3 instanceof com.facebook.aura.devices.pairing.LinkDeviceKeyMintResult.Failed
            if (r0 == 0) goto L70
            com.facebook.aura.devices.pairing.LinkDeviceKeyMintResult$Failed r3 = (com.facebook.aura.devices.pairing.LinkDeviceKeyMintResult.Failed) r3
            com.facebook.aura.devices.pairing.LinkDeviceKeySetupFailure r0 = r3.failure
            r9.failDeviceKeySetup(r8, r0)
            return r10
        L70:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        L75:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator.mintDeviceKey(com.facebook.aura.devices.pairing.LinkEncryptedSetupSnapshot, com.facebook.aura.devices.token.LinkDeviceKeyTarget, X.HtJ):java.lang.Object");
    }

    private final synchronized boolean requestWiFiScanIfCurrent(int i, LinkEncryptedSetup linkEncryptedSetup) {
        if (!isCurrent(i, linkEncryptedSetup)) {
            return false;
        }
        this.transport.requestWiFiScan();
        return true;
    }

    private final synchronized void resetEncryptedSetup() {
        this.setupGeneration.incrementAndGet();
        this.encryptedSetup = null;
        this.provisionedSetup = null;
        this.confirmedSetup = null;
        this.handoff = null;
        this.onDeviceVerificationChanged.invoke(null);
        this.transport.clearEncryptedPairingSession();
    }

    private final synchronized void resetEncryptedSetupIfCurrent(LinkEncryptedSetupSnapshot linkEncryptedSetupSnapshot) {
        if (isCurrent(linkEncryptedSetupSnapshot)) {
            resetEncryptedSetup();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void resetIfTransportDroppedSession() {
        LinkEncryptedSetup linkEncryptedSetup = this.encryptedSetup;
        if (linkEncryptedSetup != null && !this.transport.hasEncryptedPairingSession(linkEncryptedSetup.session)) {
            resetEncryptedSetup();
        }
    }

    public final void onDeviceReportedStatus(String str) {
        LinkDeviceKey linkDeviceKey;
        C7384Etj.A0Y(str, 0);
        if (str.equals(LinkDeviceKeyProvisioningKt.LINK_STATUS_AUTH_OK)) {
            this.attemptMintedTokens.set(false);
            LinkUnconfirmedTokens linkUnconfirmedTokens = this.unconfirmedTokens;
            if (linkUnconfirmedTokens != null) {
                linkUnconfirmedTokens.onConfirmed();
            }
        } else if (LinkDeviceKeyProvisioning.KEY_NOT_KEPT_STATUSES.contains(str)) {
            revokeUnconfirmedTokens();
        }
        LinkDeviceKeyProvisioning linkDeviceKeyProvisioning = this.deviceKeyProvisioning;
        if (linkDeviceKeyProvisioning == null || (linkDeviceKey = this.deliveredDeviceKey.get()) == null || !linkDeviceKeyProvisioning.isOutcome(str) || !Bs8.A00(linkDeviceKey, null, this.deliveredDeviceKey)) {
            return;
        }
        linkDeviceKeyProvisioning.settle(linkDeviceKey, str);
    }

    private final void abandonDeviceKey(LinkDeviceKey linkDeviceKey) {
        Bs8.A00(linkDeviceKey, null, this.deliveredDeviceKey);
        linkDeviceKey.clear();
        LinkDeviceKeyProvisioning linkDeviceKeyProvisioning = this.deviceKeyProvisioning;
        if (linkDeviceKeyProvisioning != null) {
            linkDeviceKeyProvisioning.revoke(linkDeviceKey);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        if (X.AnonymousClass001.A1X(r4) == false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object acceptPairingConfirmation(int r6, com.facebook.aura.devices.pairing.LinkEncryptedSetup r7, com.facebook.aura.devices.pairing.LinkPairingConfirmationResult r8, X.HtJ<? super com.facebook.aura.devices.pairing.LinkPairingConfirmationResult> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator.C116671
            if (r0 == 0) goto L6a
            r2 = r9
            com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$acceptPairingConfirmation$1 r2 = (com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator.C116671) r2
            int r3 = r2.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L6a
            int r3 = r3 - r1
            r2.label = r3
        L12:
            java.lang.Object r4 = r2.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r2.label
            r1 = 1
            if (r0 == 0) goto L33
            if (r0 != r1) goto L70
            int r6 = r2.I$0
            java.lang.Object r8 = r2.L$1
            com.facebook.aura.devices.pairing.LinkPairingConfirmationResult r8 = (com.facebook.aura.devices.pairing.LinkPairingConfirmationResult) r8
            java.lang.Object r7 = r2.L$0
            com.facebook.aura.devices.pairing.LinkEncryptedSetup r7 = (com.facebook.aura.devices.pairing.LinkEncryptedSetup) r7
            X.Hwg.A00(r4)
        L2a:
            boolean r0 = X.AnonymousClass001.A1X(r4)
            if (r0 != 0) goto L75
        L30:
            com.facebook.aura.devices.pairing.LinkPairingConfirmationResult$Superseded r0 = com.facebook.aura.devices.pairing.LinkPairingConfirmationResult.Superseded.INSTANCE
            return r0
        L33:
            X.Hwg.A00(r4)
            boolean r0 = r8 instanceof com.facebook.aura.devices.pairing.LinkPairingConfirmationResult.Confirmed
            if (r0 == 0) goto L87
            boolean r0 = r5.isSetupCurrent(r6, r7)
            if (r0 == 0) goto L30
            com.facebook.aura.devices.pairing.LinkEncryptedPairingSession r0 = r7.session
            boolean r0 = r0.isCommunity
            if (r0 == 0) goto L75
            r0 = r8
            com.facebook.aura.devices.pairing.LinkPairingConfirmationResult$Confirmed r0 = (com.facebook.aura.devices.pairing.LinkPairingConfirmationResult.Confirmed) r0
            com.facebook.aura.devices.pairing.LinkPairingConfirmation r0 = r0.confirmation
            java.lang.String r0 = r0.sdkToken
            if (r0 != 0) goto L59
            X.G0U<com.facebook.aura.devices.token.LinkSdkTokenFailure, kotlin.Unit> r1 = r5.onSdkTokenFailure
            com.facebook.aura.devices.token.LinkSdkTokenFailure r0 = com.facebook.aura.devices.token.LinkSdkTokenFailure.MISSING
            r1.invoke(r0)
            com.facebook.aura.devices.pairing.LinkPairingConfirmationResult$SdkTokenMissing r0 = com.facebook.aura.devices.pairing.LinkPairingConfirmationResult.SdkTokenMissing.INSTANCE
            return r0
        L59:
            X.G0U<X.HtJ<? super java.lang.Boolean>, java.lang.Object> r0 = r5.onCommunityInfoRequired
            r2.L$0 = r7
            r2.L$1 = r8
            r2.I$0 = r6
            r2.label = r1
            java.lang.Object r4 = r0.invoke(r2)
            if (r4 != r3) goto L2a
            return r3
        L6a:
            com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$acceptPairingConfirmation$1 r2 = new com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$acceptPairingConfirmation$1
            r2.<init>(r9)
            goto L12
        L70:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L75:
            boolean r0 = r5.isSetupCurrent(r6, r7)
            if (r0 == 0) goto L87
            r0 = r8
            com.facebook.aura.devices.pairing.LinkPairingConfirmationResult$Confirmed r0 = (com.facebook.aura.devices.pairing.LinkPairingConfirmationResult.Confirmed) r0
            com.facebook.aura.devices.pairing.LinkPairingConfirmation r1 = r0.confirmation
            com.facebook.aura.devices.pairing.LinkConfirmedSetup r0 = new com.facebook.aura.devices.pairing.LinkConfirmedSetup
            r0.<init>(r7, r1)
            r5.confirmedSetup = r0
        L87:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator.acceptPairingConfirmation(int, com.facebook.aura.devices.pairing.LinkEncryptedSetup, com.facebook.aura.devices.pairing.LinkPairingConfirmationResult, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object confirmSetup(int r7, com.facebook.aura.devices.pairing.LinkEncryptedSetup r8, X.HtJ<? super com.facebook.aura.devices.pairing.LinkPairingConfirmation> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator.C116691
            if (r0 == 0) goto L9c
            r5 = r9
            com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$confirmSetup$1 r5 = (com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator.C116691) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9c
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r3 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L87
            if (r0 != r1) goto La3
            int r7 = r5.I$0
            java.lang.Object r8 = r5.L$0
            com.facebook.aura.devices.pairing.LinkEncryptedSetup r8 = (com.facebook.aura.devices.pairing.LinkEncryptedSetup) r8
            X.Hwg.A00(r3)
        L27:
            com.facebook.aura.devices.pairing.LinkPairingConfirmationResult r3 = (com.facebook.aura.devices.pairing.LinkPairingConfirmationResult) r3
            boolean r0 = r3 instanceof com.facebook.aura.devices.pairing.LinkPairingConfirmationResult.Confirmed
            if (r0 != 0) goto L7c
            boolean r0 = r6.isSetupCurrent(r7, r8)
            if (r0 == 0) goto L69
            com.facebook.aura.devices.pairing.LinkPairingConfirmationResult$TimedOut r4 = com.facebook.aura.devices.pairing.LinkPairingConfirmationResult.TimedOut.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r3, r4)
            if (r0 == 0) goto L5a
            com.facebook.aura.devices.pairing.LinkEncryptedPairingSession r0 = r8.session
            boolean r0 = r0.getRequiresAppConfirmation()
            if (r0 != 0) goto L5a
            kotlin.jvm.functions.Function0<com.facebook.aura.devices.intf.LinkTokenOnlySetup> r0 = r6.tokenOnlySetupProvider
            java.lang.Object r0 = r0.invoke()
            if (r0 == 0) goto L5a
            com.facebook.aura.devices.pairing.LinkDeviceInfo r0 = r8.deviceInfo
            boolean r0 = r0.isBluetoothGadget()
            if (r0 == 0) goto L5a
            X.G0U<com.facebook.aura.devices.pairing.LinkSetupRefusal, kotlin.Unit> r1 = r6.onSetupRefused
            com.facebook.aura.devices.pairing.LinkSetupRefusal r0 = com.facebook.aura.devices.pairing.LinkSetupRefusal.BUTTON_PRESS_TIMED_OUT
            r1.invoke(r0)
        L5a:
            com.facebook.aura.devices.pairing.logging.HatchDevicePairingUserFlowLogger r1 = r6.pairingLogger
            if (r1 == 0) goto L69
            boolean r0 = X.C7384Etj.areEqual(r3, r4)
            if (r0 == 0) goto L6a
            com.facebook.aura.devices.pairing.logging.HatchDevicePairingFailureReason r0 = com.facebook.aura.devices.pairing.logging.HatchDevicePairingFailureReason.PAIRING_CONFIRMATION_TIMED_OUT
        L66:
            r1.recordError(r0)
        L69:
            return r2
        L6a:
            com.facebook.aura.devices.pairing.LinkPairingConfirmationResult$SdkTokenMissing r0 = com.facebook.aura.devices.pairing.LinkPairingConfirmationResult.SdkTokenMissing.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r3, r0)
            if (r0 == 0) goto L79
            com.facebook.aura.devices.token.LinkSdkTokenFailure r0 = com.facebook.aura.devices.token.LinkSdkTokenFailure.MISSING
            com.facebook.aura.devices.pairing.logging.HatchDevicePairingFailureReason r0 = com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinatorKt.getPairingFailureReason(r0)
            goto L66
        L79:
            com.facebook.aura.devices.pairing.logging.HatchDevicePairingFailureReason r0 = com.facebook.aura.devices.pairing.logging.HatchDevicePairingFailureReason.ENCRYPTED_PAIRING_FAILED
            goto L66
        L7c:
            com.facebook.aura.devices.pairing.LinkPairingConfirmationResult$Confirmed r3 = (com.facebook.aura.devices.pairing.LinkPairingConfirmationResult.Confirmed) r3
            com.facebook.aura.devices.pairing.LinkPairingConfirmation r4 = r3.confirmation
            boolean r0 = r6.isSetupCurrent(r7, r8)
            if (r0 != 0) goto L9b
            return r2
        L87:
            X.Hwg.A00(r3)
            com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$confirmSetup$confirmationResult$1 r0 = new com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$confirmSetup$confirmationResult$1
            r0.<init>(r6, r7, r8, r2)
            r5.L$0 = r8
            r5.I$0 = r7
            r5.label = r1
            java.lang.Object r3 = r6.runSetupStep(r0, r5)
            if (r3 != r4) goto L27
        L9b:
            return r4
        L9c:
            com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$confirmSetup$1 r5 = new com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$confirmSetup$1
            r5.<init>(r9)
            goto L12
        La3:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator.confirmSetup(int, com.facebook.aura.devices.pairing.LinkEncryptedSetup, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object deviceKeyPlanFor(com.facebook.aura.devices.pairing.LinkEncryptedSetupSnapshot r7, com.facebook.aura.devices.pairing.LinkOtaOffer r8, X.HtJ<? super com.facebook.aura.devices.pairing.LinkDeviceKeyPlan> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator.C116701
            if (r0 == 0) goto L54
            r5 = r9
            com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$deviceKeyPlanFor$1 r5 = (com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator.C116701) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L54
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L2a
            if (r0 != r3) goto L5b
            X.Hwg.A00(r1)
        L20:
            if (r1 != 0) goto L5a
            com.facebook.aura.devices.pairing.LinkDeviceKeySetupFailure r1 = com.facebook.aura.devices.pairing.LinkDeviceKeySetupFailure.DEVICE_KEY_UNAVAILABLE
            com.facebook.aura.devices.pairing.LinkDeviceKeyPlan$Blocked r0 = new com.facebook.aura.devices.pairing.LinkDeviceKeyPlan$Blocked
            r0.<init>(r1)
            return r0
        L2a:
            X.Hwg.A00(r1)
            com.facebook.aura.devices.pairing.LinkDeviceKeyProvisioning r2 = r6.deviceKeyProvisioning
            if (r2 != 0) goto L3f
            boolean r0 = r8.isAvailable
            if (r0 == 0) goto L60
            boolean r0 = r8.isRequestedByConfig
            if (r0 == 0) goto L60
            com.facebook.aura.devices.pairing.LinkDeviceKeyPlan$OtaRound r0 = new com.facebook.aura.devices.pairing.LinkDeviceKeyPlan$OtaRound
            r0.<init>(r3)
            return r0
        L3f:
            r1 = 0
            com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$deviceKeyPlanFor$2 r0 = new com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$deviceKeyPlanFor$2
            r0.<init>(r2, r7, r8, r1)
            r5.L$0 = r1
            r5.L$1 = r1
            r5.L$2 = r1
            r5.label = r3
            java.lang.Object r1 = r6.runSetupStep(r0, r5)
            if (r1 != r4) goto L20
            return r4
        L54:
            com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$deviceKeyPlanFor$1 r5 = new com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$deviceKeyPlanFor$1
            r5.<init>(r9)
            goto L12
        L5a:
            return r1
        L5b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L60:
            com.facebook.aura.devices.pairing.LinkDeviceKeyPlan$Keyless r0 = com.facebook.aura.devices.pairing.LinkDeviceKeyPlan.Keyless.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator.deviceKeyPlanFor(com.facebook.aura.devices.pairing.LinkEncryptedSetupSnapshot, com.facebook.aura.devices.pairing.LinkOtaOffer, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0104 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0148 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0182  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ensureEncryptedSetup(int r11, X.HtJ<? super com.facebook.aura.devices.pairing.LinkEncryptedSetup> r12) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator.ensureEncryptedSetup(int, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ensureEncryptedSetupSnapshot(X.HtJ<? super com.facebook.aura.devices.pairing.LinkEncryptedSetupSnapshot> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator.C116731
            if (r0 == 0) goto L82
            r7 = r9
            com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$ensureEncryptedSetupSnapshot$1 r7 = (com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator.C116731) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L82
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r6 = r7.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r4 = 2
            r1 = 1
            r3 = 0
            if (r0 == 0) goto L30
            if (r0 == r1) goto L50
            if (r0 != r4) goto L92
            java.lang.Object r2 = r7.L$1
            com.facebook.aura.devices.pairing.LinkEncryptedSetupSnapshot r2 = (com.facebook.aura.devices.pairing.LinkEncryptedSetupSnapshot) r2
            X.Hwg.A00(r6)
        L28:
            com.facebook.aura.devices.pairing.LinkPairingConfirmation r6 = (com.facebook.aura.devices.pairing.LinkPairingConfirmation) r6
            if (r6 != 0) goto L88
            r8.resetEncryptedSetupIfCurrent(r2)
        L2f:
            return r3
        L30:
            X.Hwg.A00(r6)
            X.F1E r2 = new X.F1E
            r2.<init>()
            java.util.concurrent.atomic.AtomicInteger r0 = r8.setupGeneration
            int r0 = r0.get()
            r2.element = r0
            com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$ensureEncryptedSetupSnapshot$snapshot$1 r0 = new com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$ensureEncryptedSetupSnapshot$snapshot$1
            r0.<init>(r8, r2, r3)
            r7.L$0 = r2
            r7.label = r1
            java.lang.Object r6 = r8.runSetupStep(r0, r7)
            if (r6 != r5) goto L57
        L4f:
            return r5
        L50:
            java.lang.Object r2 = r7.L$0
            X.F1E r2 = (X.F1E) r2
            X.Hwg.A00(r6)
        L57:
            com.facebook.aura.devices.pairing.LinkEncryptedSetupSnapshot r6 = (com.facebook.aura.devices.pairing.LinkEncryptedSetupSnapshot) r6
            if (r6 != 0) goto L6f
            java.util.concurrent.atomic.AtomicInteger r0 = r8.setupGeneration
            int r1 = r0.get()
            int r0 = r2.element
            if (r1 != r0) goto L2f
            com.facebook.aura.devices.pairing.logging.HatchDevicePairingUserFlowLogger r1 = r8.pairingLogger
            if (r1 == 0) goto L2f
            com.facebook.aura.devices.pairing.logging.HatchDevicePairingFailureReason r0 = com.facebook.aura.devices.pairing.logging.HatchDevicePairingFailureReason.ENCRYPTED_PAIRING_FAILED
            r1.recordError(r0)
            return r3
        L6f:
            int r1 = r6.generation
            com.facebook.aura.devices.pairing.LinkEncryptedSetup r0 = r6.setup
            r7.L$0 = r3
            r7.L$1 = r6
            r7.label = r4
            java.lang.Object r0 = r8.confirmSetup(r1, r0, r7)
            if (r0 == r5) goto L4f
            r2 = r6
            r6 = r0
            goto L28
        L82:
            com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$ensureEncryptedSetupSnapshot$1 r7 = new com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$ensureEncryptedSetupSnapshot$1
            r7.<init>(r9)
            goto L12
        L88:
            int r1 = r2.generation
            com.facebook.aura.devices.pairing.LinkEncryptedSetup r0 = r2.setup
            com.facebook.aura.devices.pairing.LinkEncryptedSetupSnapshot r3 = new com.facebook.aura.devices.pairing.LinkEncryptedSetupSnapshot
            r3.<init>(r1, r0, r6)
            return r3
        L92:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator.ensureEncryptedSetupSnapshot(X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isCurrent(LinkEncryptedSetupSnapshot linkEncryptedSetupSnapshot) {
        return this.setupGeneration.get() == linkEncryptedSetupSnapshot.generation && this.encryptedSetup == linkEncryptedSetupSnapshot.setup;
    }

    private final boolean isRoundTwoExpired(Long l) {
        return l != null && C8j4.A0Q(this.nowMs) >= l.longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isSetupCurrent(int i, LinkEncryptedSetup linkEncryptedSetup) {
        return this.setupGeneration.get() == i && this.encryptedSetup == linkEncryptedSetup;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mintDeviceTokens(com.facebook.aura.devices.pairing.LinkEncryptedSetupSnapshot r9, X.HtJ<? super com.facebook.aura.devices.token.LinkDeviceTokenPair> r10) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator.mintDeviceTokens(com.facebook.aura.devices.pairing.LinkEncryptedSetupSnapshot, X.HtJ):java.lang.Object");
    }

    private final LinkOtaOffer otaOfferFor(LinkEncryptedSetupSnapshot linkEncryptedSetupSnapshot, boolean z) {
        boolean z2;
        LinkEncryptedSetup linkEncryptedSetup = linkEncryptedSetupSnapshot.setup;
        LinkDeviceInfo linkDeviceInfo = linkEncryptedSetup.deviceInfo;
        boolean z3 = true;
        if (z && !linkEncryptedSetup.session.isCommunity && !AnonymousClass002.A1b(linkDeviceInfo.otaSupported, false) && this.otaUrlProvider.invoke().length() > 0) {
            z2 = true;
            if (!AnonymousClass003.A1Y(this.otaForcedProvider) && !LinkFirmwareVersionKt.linkFirmwareIsOlderThan(linkDeviceInfo.firmwareVersion, this.otaMinFirmwareVersionProvider.invoke())) {
            }
            return new LinkOtaOffer(z2, z3);
        }
        z2 = false;
        z3 = false;
        return new LinkOtaOffer(z2, z3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object provision$default(LinkEncryptedSetupCoordinator linkEncryptedSetupCoordinator, String str, String str2, String str3, boolean z, Long l, Function0 function0, HtJ htJ, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        boolean zA1P = AnonymousClass005.A1P(i, z);
        if ((i & 16) != 0) {
            l = null;
        }
        if ((i & 32) != 0) {
            function0 = C116792.INSTANCE;
        }
        return linkEncryptedSetupCoordinator.provision(str, str2, str3, zA1P, l, function0, htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object requestLinkDeviceInfo(HtJ<? super LinkDeviceInfo> htJ) {
        return GAX.A01(htJ, new C116812(null), this.deviceInfoTimeoutMs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object requestPairingReady(LinkPairingClientHello linkPairingClientHello, HtJ<? super LinkPairingReady> htJ) {
        return GAX.A01(htJ, new C116822(linkPairingClientHello, null), this.pairingReadyTimeoutMs);
    }

    private final void revokeUnconfirmedTokens() {
        LinkUnconfirmedTokens linkUnconfirmedTokens;
        if (!this.attemptMintedTokens.getAndSet(false) || (linkUnconfirmedTokens = this.unconfirmedTokens) == null) {
            return;
        }
        linkUnconfirmedTokens.onNotKept();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object runSetupStep(X.G0U<? super X.HtJ<? super T>, ? extends java.lang.Object> r6, X.HtJ<? super T> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator.C116831
            if (r0 == 0) goto L1e
            r4 = r7
            com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$runSetupStep$1 r4 = (com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator.C116831) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L2d
            if (r0 != r1) goto L28
            goto L24
        L1e:
            com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$runSetupStep$1 r4 = new com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$runSetupStep$1
            r4.<init>(r7)
            goto L12
        L24:
            X.Hwg.A00(r3)     // Catch: java.lang.Exception -> L3d java.util.concurrent.CancellationException -> L3f
            return r3
        L28:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2d:
            X.Hwg.A00(r3)
            r0 = 0
            r4.L$0 = r0     // Catch: java.lang.Exception -> L3d java.util.concurrent.CancellationException -> L3f
            r4.label = r1     // Catch: java.lang.Exception -> L3d java.util.concurrent.CancellationException -> L3f
            java.lang.Object r0 = r6.invoke(r4)     // Catch: java.lang.Exception -> L3d java.util.concurrent.CancellationException -> L3f
            if (r0 != r2) goto L3c
            return r2
        L3c:
            return r0
        L3d:
            r0 = 0
            return r0
        L3f:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator.runSetupStep(X.G0U, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object unclaimedNodeFailure(com.facebook.aura.devices.pairing.LinkEncryptedSetupSnapshot r11, X.HtJ<? super com.facebook.aura.devices.pairing.LinkDeviceKeySetupFailure> r12) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator.unclaimedNodeFailure(com.facebook.aura.devices.pairing.LinkEncryptedSetupSnapshot, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|(2:4|(1:6)(1:96))(0)|7|(8:(1:(2:10|(2:12|(2:14|(6:16|133|(3:101|(1:105)|106)(3:97|(1:99)|100)|107|108|109)(2:113|114))(12:79|80|(1:83)|(1:90)|(1:92)|93|(1:95)|133|(0)(0)|107|108|109))(19:19|131|70|(1:72)|73|(1:75)|76|(1:78)|80|(1:83)|(3:86|88|90)|(0)|93|(0)|133|(0)(0)|107|108|109))(1:20))(3:21|(1:23)(1:59)|(2:45|(1:47))(5:26|(1:28)|(4:30|(1:34)|(1:36)|37)(2:40|(2:(1:43)|44)(21:(1:69)(1:65)|66|(1:68)|131|70|(0)|73|(0)|76|(0)|80|(0)|(0)|(0)|93|(0)|133|(0)(0)|107|108|109))|38|39))|129|57|58|(0)|(0)(0)|38|39)|127|48|(2:135|50)(1:51)|(1:53)(1:54)|55|56|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02a0, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0270 A[Catch: all -> 0x028b, TryCatch #3 {all -> 0x028b, blocks: (B:97:0x0259, B:99:0x0264, B:107:0x0282, B:101:0x0270, B:103:0x0276, B:105:0x027a, B:106:0x027f), top: B:133:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b5 A[Catch: all -> 0x0296, TRY_LEAVE, TryCatch #2 {all -> 0x0296, blocks: (B:70:0x01af, B:72:0x01b5), top: B:131:0x01af }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ea A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0208 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x020f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0251 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0259 A[Catch: all -> 0x028b, TRY_ENTER, TryCatch #3 {all -> 0x028b, blocks: (B:97:0x0259, B:99:0x0264, B:107:0x0282, B:101:0x0270, B:103:0x0276, B:105:0x027a, B:106:0x027f), top: B:133:0x005a }] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object writeProvisionRecord(com.facebook.aura.devices.pairing.LinkEncryptedSetupSnapshot r23, com.facebook.aura.devices.token.LinkDeviceTokenPair r24, boolean r25, com.facebook.aura.devices.token.LinkDeviceKey r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, boolean r30, java.lang.Long r31, kotlin.jvm.functions.Function0<kotlin.Unit> r32, X.HtJ<? super java.lang.Boolean> r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 679
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator.writeProvisionRecord(com.facebook.aura.devices.pairing.LinkEncryptedSetupSnapshot, com.facebook.aura.devices.token.LinkDeviceTokenPair, boolean, com.facebook.aura.devices.token.LinkDeviceKey, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.Long, kotlin.jvm.functions.Function0, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object establishEncryptedSetup(X.HtJ<? super java.lang.Boolean> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator.C116741
            if (r0 == 0) goto L3a
            r4 = r6
            com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$establishEncryptedSetup$1 r4 = (com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator.C116741) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3a
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L28
            if (r0 != r2) goto L40
            X.Hwg.A00(r1)
        L20:
            if (r1 != 0) goto L23
            r2 = 0
        L23:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L28:
            X.Hwg.A00(r1)
            r1 = 0
            com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$establishEncryptedSetup$2 r0 = new com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$establishEncryptedSetup$2
            r0.<init>(r1)
            r4.label = r2
            java.lang.Object r1 = r5.runSetupStep(r0, r4)
            if (r1 != r3) goto L20
            return r3
        L3a:
            com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$establishEncryptedSetup$1 r4 = new com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$establishEncryptedSetup$1
            r4.<init>(r6)
            goto L12
        L40:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator.establishEncryptedSetup(X.HtJ):java.lang.Object");
    }

    public final boolean getHasHandoff() {
        return AnonymousClass002.A1X(this.handoff);
    }

    public final boolean getNeedsHandoff() {
        LinkDeviceInfo linkDeviceInfo;
        LinkEncryptedSetup linkEncryptedSetup = this.encryptedSetup;
        return (linkEncryptedSetup == null || (linkDeviceInfo = linkEncryptedSetup.deviceInfo) == null || !linkDeviceInfo.servesMgCommands || this.tokenOnlySetupProvider.invoke() == null) ? false : true;
    }

    public final boolean isBluetoothGadget() {
        LinkEncryptedSetup linkEncryptedSetup;
        LinkDeviceInfo linkDeviceInfo;
        return (this.tokenOnlySetupProvider.invoke() == null || (linkEncryptedSetup = this.encryptedSetup) == null || (linkDeviceInfo = linkEncryptedSetup.deviceInfo) == null || !linkDeviceInfo.isBluetoothGadget()) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x02d2, code lost:
    
        if (r4.APs(null, r8) == r11) goto L105;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x019a A[Catch: all -> 0x02e8, TryCatch #0 {all -> 0x02e8, blocks: (B:49:0x01a2, B:71:0x0219, B:72:0x021c, B:114:0x02e1, B:115:0x02e4, B:116:0x02e7, B:58:0x01dd, B:59:0x01e0, B:61:0x01e4, B:63:0x01ea, B:65:0x01ee, B:68:0x01f5, B:45:0x0191, B:46:0x0194, B:48:0x019a, B:50:0x01a8, B:52:0x01ae, B:53:0x01b5, B:55:0x01bd, B:25:0x0142, B:26:0x0145, B:30:0x014f, B:32:0x0157, B:34:0x015d, B:36:0x0161, B:41:0x016d, B:19:0x0111, B:21:0x011b, B:22:0x011e, B:99:0x02a8, B:100:0x02ab, B:85:0x025d, B:86:0x0260, B:102:0x02b3, B:90:0x0267, B:96:0x0275, B:77:0x0225, B:79:0x022b, B:80:0x0236, B:82:0x023c, B:89:0x0265), top: B:120:0x0029, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01a8 A[Catch: all -> 0x02e8, TryCatch #0 {all -> 0x02e8, blocks: (B:49:0x01a2, B:71:0x0219, B:72:0x021c, B:114:0x02e1, B:115:0x02e4, B:116:0x02e7, B:58:0x01dd, B:59:0x01e0, B:61:0x01e4, B:63:0x01ea, B:65:0x01ee, B:68:0x01f5, B:45:0x0191, B:46:0x0194, B:48:0x019a, B:50:0x01a8, B:52:0x01ae, B:53:0x01b5, B:55:0x01bd, B:25:0x0142, B:26:0x0145, B:30:0x014f, B:32:0x0157, B:34:0x015d, B:36:0x0161, B:41:0x016d, B:19:0x0111, B:21:0x011b, B:22:0x011e, B:99:0x02a8, B:100:0x02ab, B:85:0x025d, B:86:0x0260, B:102:0x02b3, B:90:0x0267, B:96:0x0275, B:77:0x0225, B:79:0x022b, B:80:0x0236, B:82:0x023c, B:89:0x0265), top: B:120:0x0029, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01e4 A[Catch: all -> 0x02e8, TryCatch #0 {all -> 0x02e8, blocks: (B:49:0x01a2, B:71:0x0219, B:72:0x021c, B:114:0x02e1, B:115:0x02e4, B:116:0x02e7, B:58:0x01dd, B:59:0x01e0, B:61:0x01e4, B:63:0x01ea, B:65:0x01ee, B:68:0x01f5, B:45:0x0191, B:46:0x0194, B:48:0x019a, B:50:0x01a8, B:52:0x01ae, B:53:0x01b5, B:55:0x01bd, B:25:0x0142, B:26:0x0145, B:30:0x014f, B:32:0x0157, B:34:0x015d, B:36:0x0161, B:41:0x016d, B:19:0x0111, B:21:0x011b, B:22:0x011e, B:99:0x02a8, B:100:0x02ab, B:85:0x025d, B:86:0x0260, B:102:0x02b3, B:90:0x0267, B:96:0x0275, B:77:0x0225, B:79:0x022b, B:80:0x0236, B:82:0x023c, B:89:0x0265), top: B:120:0x0029, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ee A[Catch: all -> 0x02e8, TryCatch #0 {all -> 0x02e8, blocks: (B:49:0x01a2, B:71:0x0219, B:72:0x021c, B:114:0x02e1, B:115:0x02e4, B:116:0x02e7, B:58:0x01dd, B:59:0x01e0, B:61:0x01e4, B:63:0x01ea, B:65:0x01ee, B:68:0x01f5, B:45:0x0191, B:46:0x0194, B:48:0x019a, B:50:0x01a8, B:52:0x01ae, B:53:0x01b5, B:55:0x01bd, B:25:0x0142, B:26:0x0145, B:30:0x014f, B:32:0x0157, B:34:0x015d, B:36:0x0161, B:41:0x016d, B:19:0x0111, B:21:0x011b, B:22:0x011e, B:99:0x02a8, B:100:0x02ab, B:85:0x025d, B:86:0x0260, B:102:0x02b3, B:90:0x0267, B:96:0x0275, B:77:0x0225, B:79:0x022b, B:80:0x0236, B:82:0x023c, B:89:0x0265), top: B:120:0x0029, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f5 A[Catch: all -> 0x02e8, TryCatch #0 {all -> 0x02e8, blocks: (B:49:0x01a2, B:71:0x0219, B:72:0x021c, B:114:0x02e1, B:115:0x02e4, B:116:0x02e7, B:58:0x01dd, B:59:0x01e0, B:61:0x01e4, B:63:0x01ea, B:65:0x01ee, B:68:0x01f5, B:45:0x0191, B:46:0x0194, B:48:0x019a, B:50:0x01a8, B:52:0x01ae, B:53:0x01b5, B:55:0x01bd, B:25:0x0142, B:26:0x0145, B:30:0x014f, B:32:0x0157, B:34:0x015d, B:36:0x0161, B:41:0x016d, B:19:0x0111, B:21:0x011b, B:22:0x011e, B:99:0x02a8, B:100:0x02ab, B:85:0x025d, B:86:0x0260, B:102:0x02b3, B:90:0x0267, B:96:0x0275, B:77:0x0225, B:79:0x022b, B:80:0x0236, B:82:0x023c, B:89:0x0265), top: B:120:0x0029, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x023c A[Catch: all -> 0x02de, TryCatch #1 {all -> 0x02de, blocks: (B:99:0x02a8, B:100:0x02ab, B:85:0x025d, B:86:0x0260, B:102:0x02b3, B:90:0x0267, B:96:0x0275, B:77:0x0225, B:79:0x022b, B:80:0x0236, B:82:0x023c, B:89:0x0265), top: B:120:0x0029, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0265 A[Catch: all -> 0x02de, TryCatch #1 {all -> 0x02de, blocks: (B:99:0x02a8, B:100:0x02ab, B:85:0x025d, B:86:0x0260, B:102:0x02b3, B:90:0x0267, B:96:0x0275, B:77:0x0225, B:79:0x022b, B:80:0x0236, B:82:0x023c, B:89:0x0265), top: B:120:0x0029, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02a7  */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.facebook.aura.devices.token.LinkDeviceKey, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object provision(java.lang.String r18, java.lang.String r19, java.lang.String r20, boolean r21, java.lang.Long r22, kotlin.jvm.functions.Function0<kotlin.Unit> r23, X.HtJ<? super java.lang.Boolean> r24) {
        /*
            Method dump skipped, instructions count: 770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator.provision(java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.Long, kotlin.jvm.functions.Function0, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object requestEncryptedWiFiScan(X.HtJ<? super java.lang.Boolean> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator.C116801
            if (r0 == 0) goto L2d
            r7 = r9
            com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$requestEncryptedWiFiScan$1 r7 = (com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator.C116801) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2d
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r6 = r7.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r2 = 2
            r1 = 1
            r4 = 0
            if (r0 == 0) goto L38
            if (r0 == r1) goto L49
            if (r0 != r2) goto L33
            java.lang.Object r3 = r7.L$1
            X.BLa r3 = (X.InterfaceC2261BLa) r3
            java.lang.Object r2 = r7.L$0
            com.facebook.aura.devices.pairing.LinkEncryptedSetupSnapshot r2 = (com.facebook.aura.devices.pairing.LinkEncryptedSetupSnapshot) r2
            X.Hwg.A00(r6)
            goto L65
        L2d:
            com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$requestEncryptedWiFiScan$1 r7 = new com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$requestEncryptedWiFiScan$1
            r7.<init>(r9)
            goto L12
        L33:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L38:
            X.Hwg.A00(r6)
            com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$requestEncryptedWiFiScan$snapshot$1 r0 = new com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$requestEncryptedWiFiScan$snapshot$1
            r0.<init>(r8, r4)
            r7.label = r1
            java.lang.Object r6 = r8.runSetupStep(r0, r7)
            if (r6 != r5) goto L4c
        L48:
            return r5
        L49:
            X.Hwg.A00(r6)
        L4c:
            com.facebook.aura.devices.pairing.LinkEncryptedSetupSnapshot r6 = (com.facebook.aura.devices.pairing.LinkEncryptedSetupSnapshot) r6
            if (r6 != 0) goto L56
            r0 = 0
        L51:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            return r5
        L56:
            X.BLa r3 = r8.setupMutex
            r7.L$0 = r6
            r7.L$1 = r3
            r7.label = r2
            java.lang.Object r0 = r3.APs(r4, r7)
            if (r0 == r5) goto L48
            r2 = r6
        L65:
            int r1 = r2.generation     // Catch: java.lang.Throwable -> L76
            com.facebook.aura.devices.pairing.LinkEncryptedSetup r0 = r2.setup     // Catch: java.lang.Throwable -> L76
            boolean r0 = r8.requestWiFiScanIfCurrent(r1, r0)     // Catch: java.lang.Throwable -> L76
            r3.Ahe(r4)
            if (r0 != 0) goto L51
            r8.resetEncryptedSetupIfCurrent(r2)
            goto L51
        L76:
            r0 = move-exception
            r3.Ahe(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator.requestEncryptedWiFiScan(X.HtJ):java.lang.Object");
    }

    public final void reset() {
        LinkDeviceKey linkDeviceKey = (LinkDeviceKey) C8j3.A10(this.deliveredDeviceKey);
        if (linkDeviceKey != null) {
            linkDeviceKey.clear();
        }
        this.transport.clearPendingDeviceInfoCallback();
        this.transport.clearPendingPairingReadyCallback();
        resetEncryptedSetup();
    }

    public final LinkSetupHandoff takeHandoff() {
        LinkSetupHandoff linkSetupHandoff = this.handoff;
        this.handoff = null;
        return linkSetupHandoff;
    }

    public final LinkWifiRequirement wifiRequirement() {
        LinkDeviceInfo linkDeviceInfo;
        LinkEncryptedSetup linkEncryptedSetup = this.encryptedSetup;
        if (linkEncryptedSetup == null || (linkDeviceInfo = linkEncryptedSetup.deviceInfo) == null) {
            return LinkWifiRequirement.REQUIRED;
        }
        LinkWifiRequirement linkWifiRequirement = linkDeviceInfo.wifi;
        LinkWifiRequirement linkWifiRequirement2 = LinkWifiRequirement.REQUIRED;
        return (linkWifiRequirement == linkWifiRequirement2 || this.tokenOnlySetupProvider.invoke() == null) ? linkWifiRequirement2 : linkDeviceInfo.wifi;
    }

    /* renamed from: com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$10, reason: invalid class name */
    public final class AnonymousClass10 extends AbstractC7559F3s implements G0U<LinkSdkTokenFailure, Unit> {
        public static final AnonymousClass10 INSTANCE = new AnonymousClass10();

        public AnonymousClass10() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(LinkSdkTokenFailure linkSdkTokenFailure) {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(LinkSdkTokenFailure linkSdkTokenFailure) {
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$11, reason: invalid class name */
    public final class AnonymousClass11 extends AbstractC7559F3s implements G0U<LinkSetupRefusal, Unit> {
        public static final AnonymousClass11 INSTANCE = new AnonymousClass11();

        public AnonymousClass11() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(LinkSetupRefusal linkSetupRefusal) {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(LinkSetupRefusal linkSetupRefusal) {
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$14, reason: invalid class name */
    public final class AnonymousClass14 extends AbstractC7559F3s implements G0U<LinkDeviceKeySetupFailure, Unit> {
        public static final AnonymousClass14 INSTANCE = new AnonymousClass14();

        public AnonymousClass14() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(LinkDeviceKeySetupFailure linkDeviceKeySetupFailure) {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(LinkDeviceKeySetupFailure linkDeviceKeySetupFailure) {
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0U<LinkDeviceVerification, Unit> {
        public static final AnonymousClass6 INSTANCE = new AnonymousClass6();

        public AnonymousClass6() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(LinkDeviceVerification linkDeviceVerification) {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(LinkDeviceVerification linkDeviceVerification) {
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.LinkEncryptedSetupCoordinator$9, reason: invalid class name */
    public final class AnonymousClass9 extends AbstractC7559F3s implements G0U<String, Unit> {
        public static final AnonymousClass9 INSTANCE = new AnonymousClass9();

        public AnonymousClass9() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object awaitPairingConfirmation(LinkEncryptedPairingSession linkEncryptedPairingSession, HtJ<? super LinkPairingConfirmationResult> htJ) {
        int iIntValue;
        if (linkEncryptedPairingSession.getRequiresAppConfirmation()) {
            iIntValue = 5;
        } else {
            Integer num = linkEncryptedPairingSession.confirmTimeoutSeconds;
            iIntValue = num != null ? num.intValue() : 60;
        }
        return GAX.A01(htJ, new C116682(null), iIntValue * 1000);
    }

    private final boolean failDeviceKeySetup(LinkEncryptedSetupSnapshot linkEncryptedSetupSnapshot, LinkDeviceKeySetupFailure linkDeviceKeySetupFailure) {
        HatchDevicePairingUserFlowLogger hatchDevicePairingUserFlowLogger;
        if (isCurrent(linkEncryptedSetupSnapshot)) {
            HatchDevicePairingFailureReason pairingFailureReason = LinkEncryptedSetupCoordinatorKt.getPairingFailureReason(linkDeviceKeySetupFailure);
            if (pairingFailureReason != null && (hatchDevicePairingUserFlowLogger = this.pairingLogger) != null) {
                hatchDevicePairingUserFlowLogger.recordError(pairingFailureReason);
            }
            this.onDeviceKeySetupFailed.invoke(linkDeviceKeySetupFailure);
        }
        if (this.provisionedSetup == linkEncryptedSetupSnapshot.setup) {
            return false;
        }
        resetEncryptedSetupIfCurrent(linkEncryptedSetupSnapshot);
        return false;
    }

    private final boolean isCurrent(int i, LinkEncryptedSetup linkEncryptedSetup) {
        if (this.setupGeneration.get() == i && this.encryptedSetup == linkEncryptedSetup) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LinkEncryptedSetupCoordinator(LinkEncryptedSetupBleTransport linkEncryptedSetupBleTransport, long j, long j2, LinkFleetPublicKeyProvider linkFleetPublicKeyProvider, G2j g2j, Function0 function0, Function0 function02, Function0 function03, Function0 function04, HatchDevicePairingUserFlowLogger hatchDevicePairingUserFlowLogger, G0U g0u, G0U g0u2, G0U g0u3, G0U g0u4, G0U g0u5, G0U g0u6, LinkDeviceKeyProvisioning linkDeviceKeyProvisioning, LinkPairedNodeCheck linkPairedNodeCheck, G0V g0v, Set set, G0V g0v2, G0U g0u7, LinkUnconfirmedTokens linkUnconfirmedTokens, Function0 function05, Function0 function06, Function0 function07, Function0 function08, int i, C06H c06h) {
        long j3 = j;
        long j4 = j2;
        LinkFleetPublicKeyProvider linkFleetPublicKeyProvider2 = linkFleetPublicKeyProvider;
        G2j anonymousClass1 = g2j;
        Function0 function09 = function0;
        Function0 function010 = function02;
        Function0 function011 = function03;
        Function0 anonymousClass5 = function04;
        HatchDevicePairingUserFlowLogger hatchDevicePairingUserFlowLogger2 = hatchDevicePairingUserFlowLogger;
        G0U g0u8 = g0u;
        G0U anonymousClass7 = g0u2;
        G0U anonymousClass8 = g0u3;
        G0U g0u9 = g0u4;
        G0U g0u10 = g0u5;
        G0U g0u11 = g0u6;
        LinkDeviceKeyProvisioning linkDeviceKeyProvisioning2 = linkDeviceKeyProvisioning;
        LinkPairedNodeCheck linkPairedNodeCheck2 = linkPairedNodeCheck;
        G0V anonymousClass12 = g0v;
        Set setNewKeySet = set;
        G0V g0v3 = g0v2;
        G0U g0u12 = g0u7;
        Function0 function012 = function05;
        Function0 function013 = function06;
        Function0 function014 = function07;
        Function0 function015 = function08;
        j3 = (i & 2) != 0 ? 3000L : j3;
        j4 = (i & 4) != 0 ? 5000L : j4;
        linkFleetPublicKeyProvider2 = (i & 8) != 0 ? LinkFleetPublicKeys.INSTANCE : linkFleetPublicKeyProvider2;
        anonymousClass1 = (i & 16) != 0 ? new AnonymousClass1(LinkDeviceTokenMinter.INSTANCE) : anonymousClass1;
        function09 = (i & 32) != 0 ? AnonymousClass2.INSTANCE : function09;
        function010 = (i & 64) != 0 ? AnonymousClass3.INSTANCE : function010;
        function011 = (i & 128) != 0 ? AnonymousClass4.INSTANCE : function011;
        anonymousClass5 = (i & 256) != 0 ? new AnonymousClass5(LinkTokenOnlySetups.INSTANCE) : anonymousClass5;
        hatchDevicePairingUserFlowLogger2 = (i & 512) != 0 ? null : hatchDevicePairingUserFlowLogger2;
        g0u8 = (i & 1024) != 0 ? AnonymousClass6.INSTANCE : g0u8;
        anonymousClass7 = (i & 2048) != 0 ? new AnonymousClass7(null) : anonymousClass7;
        anonymousClass8 = (i & 4096) != 0 ? new AnonymousClass8(null) : anonymousClass8;
        g0u9 = (i & 8192) != 0 ? AnonymousClass9.INSTANCE : g0u9;
        g0u10 = (i & 16384) != 0 ? AnonymousClass10.INSTANCE : g0u10;
        g0u11 = (32768 & i) != 0 ? AnonymousClass11.INSTANCE : g0u11;
        linkDeviceKeyProvisioning2 = (i & 65536) != 0 ? null : linkDeviceKeyProvisioning2;
        linkPairedNodeCheck2 = (i & 131072) != 0 ? null : linkPairedNodeCheck2;
        anonymousClass12 = (i & 262144) != 0 ? new AnonymousClass12(null) : anonymousClass12;
        if ((i & 524288) != 0) {
            setNewKeySet = ConcurrentHashMap.newKeySet();
            C7384Etj.A0U(setNewKeySet);
        }
        this(linkEncryptedSetupBleTransport, j3, j4, linkFleetPublicKeyProvider2, anonymousClass1, function09, function010, function011, anonymousClass5, hatchDevicePairingUserFlowLogger2, g0u8, anonymousClass7, anonymousClass8, g0u9, g0u10, g0u11, linkDeviceKeyProvisioning2, linkPairedNodeCheck2, anonymousClass12, setNewKeySet, (i & 1048576) != 0 ? new AnonymousClass13(null) : g0v3, (i & 2097152) != 0 ? AnonymousClass14.INSTANCE : g0u12, (i & 4194304) == 0 ? linkUnconfirmedTokens : null, (i & 8388608) != 0 ? AnonymousClass15.INSTANCE : function012, (i & HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES) != 0 ? AnonymousClass16.INSTANCE : function013, (i & 33554432) != 0 ? AnonymousClass17.INSTANCE : function014, (i & 67108864) != 0 ? AnonymousClass18.INSTANCE : function015);
    }
}
