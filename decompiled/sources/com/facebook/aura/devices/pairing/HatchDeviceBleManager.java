package com.facebook.aura.devices.pairing;

import X.A3q;
import X.ADq;
import X.AbstractC06907md;
import X.AbstractC07127nr;
import X.AbstractC0903AHf;
import X.AbstractC2159Azp;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BFI;
import X.BNt;
import X.Bs8;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C0KA;
import X.C10571Hud;
import X.C20Z;
import X.C3UX;
import X.C3cG;
import X.C3cI;
import X.C60Q;
import X.C7384Etj;
import X.C78W;
import X.C7Bq;
import X.C8eO;
import X.C8j3;
import X.C8j4;
import X.C9sU;
import X.CFK;
import X.DCl;
import X.EnumC10460Hji;
import X.FGI;
import X.G0U;
import X.G0V;
import X.GAt;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import X.HzP;
import X.InterfaceC10560Hsz;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.content.Context;
import android.os.ParcelUuid;
import com.facebook.aura.avatarassets.AvatarMediaMapperKt;
import com.facebook.aura.common.ble.AuraBleConnection;
import com.facebook.aura.common.ble.AuraBleConnectionImpl;
import com.facebook.aura.common.ble.AuraBleData;
import com.facebook.aura.components.reactions.AuraPressureReleaseKt;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.devices.intf.ClaimedDeviceRow;
import com.facebook.aura.devices.intf.DeviceRowBadge;
import com.facebook.aura.devices.intf.DiscoveredAdvertisement;
import com.facebook.aura.devices.intf.DiscoveredDeviceClassifier;
import com.facebook.aura.devices.intf.DiscoveryDecision;
import com.facebook.aura.devices.intf.DiscoveryScan;
import com.facebook.aura.devices.pairing.LinkEncryptedDecryptResult;
import com.facebook.aura.devices.pairing.LinkPairingConfirmationResult;
import com.facebook.aura.executors.AuraDispatchers;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.json.JsonObjectExtensionsKt;
import com.facebook.aura.pairs.PairsRepositoryKt;
import com.facebook.aura.settings.MC;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes4.dex */
public final class HatchDeviceBleManager implements LinkEncryptedSetupBleTransport {
    public static final int $stable = 8;
    public static final int CONNECT_ATTEMPTS = 3;
    public static final long CONNECT_EVENT_TIMEOUT_MS = 15000;
    public static final long CONNECT_RETRY_DELAY_MS = 750;
    public static final long LINK_TEARDOWN_POLL_MS = 100;
    public static final long LINK_TEARDOWN_TIMEOUT_MS = 6000;
    public static final long POST_SCAN_CONNECT_DELAY_MS = 200;
    public static final int SCAN_FAILED_LOCAL_EXCEPTION = -1;
    public final HatchDeviceBleManager$bleLogger$1 bleLogger;
    public BluetoothAdapter bluetoothAdapter;
    public final Set<String> bluetoothGadgetAddresses;
    public HoC chunkAssemblyJob;
    public final Map<Integer, byte[]> chunkBuffer;
    public volatile String connectedDeviceAddress;
    public String connectedHubName;
    public final AuraBleConnection connection;
    public HoC connectionJob;
    public final Context context;
    public final HatchDeviceFamily deviceFamily;
    public HoC disconnectWatcherJob;
    public final LinkedHashMap<String, ScannedDevice> discoveredDevices;
    public final DiscoveredDeviceClassifier discoveryClassifier;
    public DiscoveryScan discoveryScan;
    public volatile LinkEncryptedPairingSession encryptedPairingSession;
    public final CoroutineExceptionHandler exceptionHandler;
    public final Set<String> excludeNames;
    public int expectedChunkTotal;
    public volatile boolean hasStopped;
    public final boolean includeBluetoothGadgets;
    public final boolean includeCommunityDeviceNames;
    public final boolean includeWifiLinks;
    public volatile LinkEncryptedSetupState linkEncryptedSetupState;
    public final Set<String> linkSetupServiceAddresses;
    public final HatchDeviceBleListener listener;
    public ScanCallback multiScanCallback;
    public HoC multiScanTimeoutJob;
    public HoC notificationsJob;
    public volatile InterfaceC10560Hsz<LinkPairingConfirmationResult> pairingConfirmation;
    public final AtomicReference<PendingBleCallback<LinkDeviceInfo>> pendingDeviceInfoCallback;
    public final AtomicReference<PendingBleCallback<LinkPairingReady>> pendingPairingReadyCallback;
    public HatchDeviceProvisioningStatus pendingProvisioningFailureStatus;
    public volatile ScannedDevice pendingScannedDevice;
    public HoC provisioningTimeoutJob;
    public final C3UX scope;
    public final String setUpAgainAddress;
    public final boolean supportsGadgets;
    public final String targetName;
    public List<HatchDiscoveredDevice> visibleDevices;
    public HoC wifiScanTimeoutJob;
    public static final Companion Companion = new Companion();
    public static final Set<String> previouslyConnectedAddresses = C3cG.A0k();

    public interface ScanOutcome {

        public final class Found extends C06G implements ScanOutcome {
            public static final int $stable = ClaimedDeviceRow.$stable;
            public final ScannedDevice device;

            public Found(ScannedDevice scannedDevice) {
                C7384Etj.A0Y(scannedDevice, 0);
                this.device = scannedDevice;
            }

            public final Found copy(ScannedDevice scannedDevice) {
                C7384Etj.A0Y(scannedDevice, 0);
                return new Found(scannedDevice);
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof Found) && C7384Etj.areEqual(this.device, ((Found) obj).device));
            }

            public static /* synthetic */ Found copy$default(Found found, ScannedDevice scannedDevice, int i, Object obj) {
                if ((i & 1) != 0) {
                    scannedDevice = found.device;
                }
                C7384Etj.A0Y(scannedDevice, 0);
                return new Found(scannedDevice);
            }

            public final ScannedDevice component1() {
                return this.device;
            }

            public final ScannedDevice getDevice() {
                return this.device;
            }

            public int hashCode() {
                return this.device.hashCode();
            }

            public String toString() {
                return super.toString();
            }
        }

        public final class NotFound implements ScanOutcome {
            public static final int $stable = 0;
            public static final NotFound INSTANCE = new NotFound();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof NotFound);
            }

            public String toString() {
                return "NotFound";
            }

            public int hashCode() {
                return -1481276619;
            }
        }

        public final class ScanFailed extends C06G implements ScanOutcome {
            public static final int $stable = 0;
            public final int errorCode;

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof ScanFailed) && this.errorCode == ((ScanFailed) obj).errorCode);
            }

            public static /* synthetic */ ScanFailed copy$default(ScanFailed scanFailed, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = scanFailed.errorCode;
                }
                return new ScanFailed(i);
            }

            public final int component1() {
                return this.errorCode;
            }

            public final ScanFailed copy(int i) {
                return new ScanFailed(i);
            }

            public final int getErrorCode() {
                return this.errorCode;
            }

            public int hashCode() {
                return this.errorCode;
            }

            public ScanFailed(int i) {
                this.errorCode = i;
            }

            public String toString() {
                return super.toString();
            }
        }
    }

    public final class ScannedDevice extends C06G {
        public final String address;
        public final ClaimedDeviceRow claim;
        public final boolean isBluetoothGadget;
        public final String name;
        public final int rssi;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ScannedDevice) {
                    ScannedDevice scannedDevice = (ScannedDevice) obj;
                    if (!C7384Etj.areEqual(this.address, scannedDevice.address) || !C7384Etj.areEqual(this.name, scannedDevice.name) || this.rssi != scannedDevice.rssi || !C7384Etj.areEqual(this.claim, scannedDevice.claim) || this.isBluetoothGadget != scannedDevice.isBluetoothGadget) {
                    }
                }
                return false;
            }
            return true;
        }

        public /* synthetic */ ScannedDevice(String str, String str2, int i, ClaimedDeviceRow claimedDeviceRow, boolean z, int i2, C06H c06h) {
            this(str, str2, i, (i2 & 8) != 0 ? null : claimedDeviceRow, C3cI.A1S(i2, z));
        }

        public static /* synthetic */ ScannedDevice copy$default(ScannedDevice scannedDevice, String str, String str2, int i, ClaimedDeviceRow claimedDeviceRow, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = scannedDevice.address;
            }
            if ((i2 & 2) != 0) {
                str2 = scannedDevice.name;
            }
            if ((i2 & 4) != 0) {
                i = scannedDevice.rssi;
            }
            if ((i2 & 8) != 0) {
                claimedDeviceRow = scannedDevice.claim;
            }
            if ((i2 & 16) != 0) {
                z = scannedDevice.isBluetoothGadget;
            }
            return scannedDevice.copy(str, str2, i, claimedDeviceRow, z);
        }

        public final String component1() {
            return this.address;
        }

        public final String component2() {
            return this.name;
        }

        public final int component3() {
            return this.rssi;
        }

        public final ClaimedDeviceRow component4() {
            return this.claim;
        }

        public final boolean component5() {
            return this.isBluetoothGadget;
        }

        public final String getAddress() {
            return this.address;
        }

        public final ClaimedDeviceRow getClaim() {
            return this.claim;
        }

        public final String getName() {
            return this.name;
        }

        public final int getRssi() {
            return this.rssi;
        }

        public int hashCode() {
            return C0KA.A00((((AnonymousClass005.A0I(this.name, AnonymousClass001.A0G(this.address)) + this.rssi) * 31) + AnonymousClass006.A0D(this.claim)) * 31, this.isBluetoothGadget);
        }

        public final boolean isBluetoothGadget() {
            return this.isBluetoothGadget;
        }

        public final ScannedDevice copy(String str, String str2, int i, ClaimedDeviceRow claimedDeviceRow, boolean z) {
            AnonymousClass003.A0u(str, str2);
            return new ScannedDevice(str, str2, i, claimedDeviceRow, z);
        }

        public String toString() {
            return super.toString();
        }

        public ScannedDevice(String str, String str2, int i, ClaimedDeviceRow claimedDeviceRow, boolean z) {
            AnonymousClass003.A0u(str, str2);
            this.address = str;
            this.name = str2;
            this.rssi = i;
            this.claim = claimedDeviceRow;
            this.isBluetoothGadget = z;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.pairing.HatchDeviceBleManager", f = "HatchDeviceBleManager.kt", l = {1178}, m = "awaitLinkTeardown", v = 2)
    /* renamed from: com.facebook.aura.devices.pairing.HatchDeviceBleManager$awaitLinkTeardown$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchDeviceBleManager.this.awaitLinkTeardown(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.pairing.HatchDeviceBleManager", f = "HatchDeviceBleManager.kt", l = {716, 720, 721, 733, 749, 758, 772, 778, 794, 797}, m = "connectAndPrepare", v = 2)
    /* renamed from: com.facebook.aura.devices.pairing.HatchDeviceBleManager$connectAndPrepare$1, reason: invalid class name and case insensitive filesystem */
    public final class C116001 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public boolean Z$0;
        public boolean Z$1;
        public int label;
        public /* synthetic */ Object result;

        public C116001(HtJ<? super C116001> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchDeviceBleManager.this.connectAndPrepare(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.pairing.HatchDeviceBleManager$connectAndPrepare$2", f = "HatchDeviceBleManager.kt", l = {787}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.devices.pairing.HatchDeviceBleManager$connectAndPrepare$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchDeviceBleManager.this.new AnonymousClass2(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchDeviceBleManager.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchDeviceBleManager hatchDeviceBleManager = HatchDeviceBleManager.this;
                this.label = 1;
                if (hatchDeviceBleManager.collectIncomingData(this) == enumC10460Hji) {
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
    }

    @DebugMetadata(c = "com.facebook.aura.devices.pairing.HatchDeviceBleManager$connectAndPrepare$3", f = "HatchDeviceBleManager.kt", l = {788}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.devices.pairing.HatchDeviceBleManager$connectAndPrepare$3, reason: invalid class name and case insensitive filesystem */
    public final class C116013 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C116013(HtJ<? super C116013> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchDeviceBleManager.this.new C116013(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchDeviceBleManager.this.new C116013(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchDeviceBleManager hatchDeviceBleManager = HatchDeviceBleManager.this;
                this.label = 1;
                if (hatchDeviceBleManager.watchForUnexpectedDisconnect(this) == enumC10460Hji) {
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
    }

    @DebugMetadata(c = "com.facebook.aura.devices.pairing.HatchDeviceBleManager", f = "HatchDeviceBleManager.kt", l = {824, 834, 841, 848, 854, 859, 863, 865, 875, 878}, m = "connectOnce", v = 2)
    /* renamed from: com.facebook.aura.devices.pairing.HatchDeviceBleManager$connectOnce$1, reason: invalid class name and case insensitive filesystem */
    public final class C116021 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public C116021(HtJ<? super C116021> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchDeviceBleManager.this.connectOnce(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.pairing.HatchDeviceBleManager$connectToDevice$1", f = "HatchDeviceBleManager.kt", l = {MC.c50_accounts_center_settings.__CONFIG__}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.devices.pairing.HatchDeviceBleManager$connectToDevice$1, reason: invalid class name and case insensitive filesystem */
    public final class C116031 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ ScannedDevice $device;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116031(ScannedDevice scannedDevice, HtJ<? super C116031> htJ) {
            super(2, htJ);
            this.$device = scannedDevice;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C116031 c116031 = HatchDeviceBleManager.this.new C116031(this.$device, htJ);
            c116031.L$0 = obj;
            return c116031;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            C3UX c3ux = (C3UX) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchDeviceBleManager hatchDeviceBleManager = HatchDeviceBleManager.this;
                int i2 = HatchDeviceBleManager.$stable;
                hatchDeviceBleManager.listener.onStateChanged(HatchDeviceBleState.CONNECTING, null, null);
                HatchDeviceBleManager hatchDeviceBleManager2 = HatchDeviceBleManager.this;
                ScannedDevice scannedDevice = this.$device;
                this.L$0 = null;
                this.label = 1;
                if (hatchDeviceBleManager2.connectAndPrepare(c3ux, scannedDevice, this) == enumC10460Hji) {
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
            return ((C116031) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.pairing.HatchDeviceBleManager$connectToDiscovered$1", f = "HatchDeviceBleManager.kt", l = {482}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.devices.pairing.HatchDeviceBleManager$connectToDiscovered$1, reason: invalid class name and case insensitive filesystem */
    public final class C116041 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ ScannedDevice $device;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116041(ScannedDevice scannedDevice, HtJ<? super C116041> htJ) {
            super(2, htJ);
            this.$device = scannedDevice;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C116041 c116041 = HatchDeviceBleManager.this.new C116041(this.$device, htJ);
            c116041.L$0 = obj;
            return c116041;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            C3UX c3ux = (C3UX) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchDeviceBleManager hatchDeviceBleManager = HatchDeviceBleManager.this;
                int i2 = HatchDeviceBleManager.$stable;
                hatchDeviceBleManager.listener.onStateChanged(HatchDeviceBleState.CONNECTING, null, null);
                HatchDeviceBleManager hatchDeviceBleManager2 = HatchDeviceBleManager.this;
                ScannedDevice scannedDevice = this.$device;
                this.L$0 = null;
                this.label = 1;
                if (hatchDeviceBleManager2.connectAndPrepare(c3ux, scannedDevice, this) == enumC10460Hji) {
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
            return ((C116041) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.pairing.HatchDeviceBleManager$handleIncomingData$1", f = "HatchDeviceBleManager.kt", l = {1511}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.devices.pairing.HatchDeviceBleManager$handleIncomingData$1, reason: invalid class name and case insensitive filesystem */
    public final class C116051 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C116051(HtJ<? super C116051> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchDeviceBleManager.this.new C116051(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchDeviceBleManager.this.new C116051(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                this.label = 1;
                if (C7Bq.A01(3000L, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            HatchDeviceBleManager.this.resetChunkState();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.HatchDeviceBleManager$requestLinkDeviceInfo$1, reason: invalid class name and case insensitive filesystem */
    public final class C116061 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ PendingBleCallback<LinkDeviceInfo> $pendingCallback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116061(PendingBleCallback<LinkDeviceInfo> pendingBleCallback) {
            super(0);
            this.$pendingCallback = pendingBleCallback;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HatchDeviceBleManager hatchDeviceBleManager = HatchDeviceBleManager.this;
            int i = HatchDeviceBleManager.$stable;
            if (Bs8.A00(this.$pendingCallback, null, hatchDeviceBleManager.pendingDeviceInfoCallback)) {
                this.$pendingCallback.complete(null);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.HatchDeviceBleManager$requestWiFiScan$1, reason: invalid class name and case insensitive filesystem */
    public final class C116071 extends AbstractC7559F3s implements Function0<Unit> {
        public C116071() {
            super(0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HatchDeviceBleManager.this.cancelWiFiScanTimeout();
            HatchDeviceBleManager.this.listener.onWiFiScanError();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.pairing.HatchDeviceBleManager", f = "HatchDeviceBleManager.kt", l = {1288}, m = "scanForDevice", v = 2)
    /* renamed from: com.facebook.aura.devices.pairing.HatchDeviceBleManager$scanForDevice$1, reason: invalid class name and case insensitive filesystem */
    public final class C116081 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public C116081(HtJ<? super C116081> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchDeviceBleManager.this.scanForDevice(this);
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.HatchDeviceBleManager$sendPairingClientHello$1, reason: invalid class name and case insensitive filesystem */
    public final class C116091 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ PendingBleCallback<LinkPairingReady> $pendingCallback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116091(PendingBleCallback<LinkPairingReady> pendingBleCallback) {
            super(0);
            this.$pendingCallback = pendingBleCallback;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HatchDeviceBleManager hatchDeviceBleManager = HatchDeviceBleManager.this;
            int i = HatchDeviceBleManager.$stable;
            if (Bs8.A00(this.$pendingCallback, null, hatchDeviceBleManager.pendingPairingReadyCallback)) {
                this.$pendingCallback.complete(null);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.pairing.HatchDeviceBleManager$start$1", f = "HatchDeviceBleManager.kt", l = {449}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.devices.pairing.HatchDeviceBleManager$start$1, reason: invalid class name and case insensitive filesystem */
    public final class C116101 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C116101(HtJ<? super C116101> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchDeviceBleManager.this.new C116101(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchDeviceBleManager.this.new C116101(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            HatchDeviceBleListener hatchDeviceBleListener;
            HatchDeviceBleState hatchDeviceBleState;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchDeviceBleManager hatchDeviceBleManager = HatchDeviceBleManager.this;
                this.label = 1;
                obj = hatchDeviceBleManager.scanForDevice(this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            ScanOutcome scanOutcome = (ScanOutcome) obj;
            if (scanOutcome instanceof ScanOutcome.Found) {
                HatchDeviceBleManager hatchDeviceBleManager2 = HatchDeviceBleManager.this;
                ScanOutcome.Found found = (ScanOutcome.Found) scanOutcome;
                ScannedDevice scannedDevice = found.device;
                String str = scannedDevice.name;
                int i2 = HatchDeviceBleManager.$stable;
                hatchDeviceBleManager2.connectedHubName = str;
                hatchDeviceBleManager2.pendingScannedDevice = scannedDevice;
                HatchDeviceBleListener hatchDeviceBleListener2 = HatchDeviceBleManager.this.listener;
                HatchDeviceBleState hatchDeviceBleState2 = HatchDeviceBleState.FOUND;
                ScannedDevice scannedDevice2 = found.device;
                hatchDeviceBleListener2.onStateChanged(hatchDeviceBleState2, scannedDevice2.name, C3cG.A0R(scannedDevice2.rssi));
            } else if (C7384Etj.areEqual(scanOutcome, ScanOutcome.NotFound.INSTANCE)) {
                HatchDeviceBleManager hatchDeviceBleManager3 = HatchDeviceBleManager.this;
                int i3 = HatchDeviceBleManager.$stable;
                if (!hatchDeviceBleManager3.hasStopped) {
                    hatchDeviceBleListener = HatchDeviceBleManager.this.listener;
                    hatchDeviceBleState = HatchDeviceBleState.NOT_FOUND;
                    hatchDeviceBleListener.onStateChanged(hatchDeviceBleState, null, null);
                }
            } else {
                if (!(scanOutcome instanceof ScanOutcome.ScanFailed)) {
                    throw C3cG.A0q();
                }
                HatchDeviceBleManager hatchDeviceBleManager4 = HatchDeviceBleManager.this;
                int i4 = HatchDeviceBleManager.$stable;
                if (!hatchDeviceBleManager4.hasStopped) {
                    HatchDeviceBleManager.this.listener.onBleScanError();
                    hatchDeviceBleListener = HatchDeviceBleManager.this.listener;
                    hatchDeviceBleState = HatchDeviceBleState.BLUETOOTH_OFF;
                    hatchDeviceBleListener.onStateChanged(hatchDeviceBleState, null, null);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.pairing.HatchDeviceBleManager$startAccumulatingScan$2", f = "HatchDeviceBleManager.kt", l = {AuraPressureReleaseKt.PRESSURE_TOTAL_MS}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.devices.pairing.HatchDeviceBleManager$startAccumulatingScan$2, reason: invalid class name and case insensitive filesystem */
    public final class C116112 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C116112(HtJ<? super C116112> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchDeviceBleManager.this.new C116112(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchDeviceBleManager.this.new C116112(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                this.label = 1;
                if (C7Bq.A01(15000L, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            HatchDeviceBleManager.this.stopAccumulatingScan();
            HatchDeviceBleManager hatchDeviceBleManager = HatchDeviceBleManager.this;
            if (hatchDeviceBleManager.discoveredDevices.isEmpty() && !hatchDeviceBleManager.hasStopped) {
                HatchDeviceBleManager.this.listener.onStateChanged(HatchDeviceBleState.NOT_FOUND, null, null);
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.HatchDeviceBleManager$startPairingConfirmation$1, reason: invalid class name and case insensitive filesystem */
    public final class C116121 extends AbstractC7559F3s implements Function0<Unit> {
        public C116121() {
            super(0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HatchDeviceBleManager.this.encryptedPairingSession = null;
            HatchDeviceBleManager.this.linkEncryptedSetupState = LinkEncryptedSetupState.FAILED;
            HatchDeviceBleManager.this.clearPairingConfirmation();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.pairing.HatchDeviceBleManager$startProvisioningTimeout$1", f = "HatchDeviceBleManager.kt", l = {1449}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.devices.pairing.HatchDeviceBleManager$startProvisioningTimeout$1, reason: invalid class name and case insensitive filesystem */
    public final class C116131 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchDeviceProvisioningStatus $failureStatus;
        public final /* synthetic */ long $timeoutMs;
        public int label;
        public final /* synthetic */ HatchDeviceBleManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116131(long j, HatchDeviceBleManager hatchDeviceBleManager, HatchDeviceProvisioningStatus hatchDeviceProvisioningStatus, HtJ<? super C116131> htJ) {
            super(2, htJ);
            this.$timeoutMs = j;
            this.this$0 = hatchDeviceBleManager;
            this.$failureStatus = hatchDeviceProvisioningStatus;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C116131(this.$timeoutMs, this.this$0, this.$failureStatus, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                long j = this.$timeoutMs;
                this.label = 1;
                if (C7Bq.A01(j, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            HatchDeviceBleManager hatchDeviceBleManager = this.this$0;
            int i2 = HatchDeviceBleManager.$stable;
            hatchDeviceBleManager.pendingProvisioningFailureStatus = null;
            hatchDeviceBleManager.listener.onProvisioningStatusChanged(this.$failureStatus);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C116131) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.pairing.HatchDeviceBleManager$startWiFiScanTimeout$1", f = "HatchDeviceBleManager.kt", l = {1464}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.devices.pairing.HatchDeviceBleManager$startWiFiScanTimeout$1, reason: invalid class name and case insensitive filesystem */
    public final class C116141 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C116141(HtJ<? super C116141> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchDeviceBleManager.this.new C116141(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchDeviceBleManager.this.new C116141(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                this.label = 1;
                if (C7Bq.A01(20000L, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            HatchDeviceBleManager hatchDeviceBleManager = HatchDeviceBleManager.this;
            int i2 = HatchDeviceBleManager.$stable;
            hatchDeviceBleManager.listener.onDebugLog("wifi_scan timed out after 20000ms");
            HatchDeviceBleManager.this.listener.onWiFiScanError();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.pairing.HatchDeviceBleManager$stop$1", f = "HatchDeviceBleManager.kt", l = {907}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.devices.pairing.HatchDeviceBleManager$stop$1, reason: invalid class name and case insensitive filesystem */
    public final class C116151 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C116151(HtJ<? super C116151> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchDeviceBleManager.this.new C116151(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchDeviceBleManager.this.new C116151(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchDeviceBleManager hatchDeviceBleManager = HatchDeviceBleManager.this;
                int i2 = HatchDeviceBleManager.$stable;
                AuraBleConnection auraBleConnection = hatchDeviceBleManager.connection;
                this.label = 1;
                if (auraBleConnection.closeGatt(this) == enumC10460Hji) {
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
    }

    @DebugMetadata(c = "com.facebook.aura.devices.pairing.HatchDeviceBleManager", f = "HatchDeviceBleManager.kt", l = {1350, 1354}, m = "watchForUnexpectedDisconnect", v = 2)
    /* renamed from: com.facebook.aura.devices.pairing.HatchDeviceBleManager$watchForUnexpectedDisconnect$1, reason: invalid class name and case insensitive filesystem */
    public final class C116161 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public C116161(HtJ<? super C116161> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchDeviceBleManager.this.watchForUnexpectedDisconnect(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.pairing.HatchDeviceBleManager", f = "HatchDeviceBleManager.kt", l = {1095}, m = "writeEncryptedProvisionRecord", v = 2)
    /* renamed from: com.facebook.aura.devices.pairing.HatchDeviceBleManager$writeEncryptedProvisionRecord$1, reason: invalid class name and case insensitive filesystem */
    public final class C116171 extends HzP {
        public Object L$0;
        public Object L$1;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C116171(HtJ<? super C116171> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchDeviceBleManager.this.writeEncryptedProvisionRecord(null, false, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.pairing.HatchDeviceBleManager$writePayload$1", f = "HatchDeviceBleManager.kt", l = {1374}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.devices.pairing.HatchDeviceBleManager$writePayload$1, reason: invalid class name and case insensitive filesystem */
    public final class C116181 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ byte[] $data;
        public final /* synthetic */ HatchDeviceProvisioningStatus $failureStatus;
        public final /* synthetic */ long $timeoutMs;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116181(byte[] bArr, HatchDeviceProvisioningStatus hatchDeviceProvisioningStatus, long j, HtJ<? super C116181> htJ) {
            super(2, htJ);
            this.$data = bArr;
            this.$failureStatus = hatchDeviceProvisioningStatus;
            this.$timeoutMs = j;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchDeviceBleManager.this.new C116181(this.$data, this.$failureStatus, this.$timeoutMs, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM729writeChunkedgIAlus;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchDeviceBleManager hatchDeviceBleManager = HatchDeviceBleManager.this;
                byte[] bArr = this.$data;
                this.label = 1;
                objM729writeChunkedgIAlus = hatchDeviceBleManager.m729writeChunkedgIAlus(bArr, this);
                if (objM729writeChunkedgIAlus == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM729writeChunkedgIAlus = AnonymousClass001.A0q(obj);
            }
            boolean z = objM729writeChunkedgIAlus instanceof C10571Hud;
            HatchDeviceBleManager hatchDeviceBleManager2 = HatchDeviceBleManager.this;
            HatchDeviceProvisioningStatus hatchDeviceProvisioningStatus = this.$failureStatus;
            if (z) {
                hatchDeviceBleManager2.reportProvisioning(hatchDeviceProvisioningStatus);
            } else {
                hatchDeviceBleManager2.startProvisioningTimeout(hatchDeviceProvisioningStatus, this.$timeoutMs);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C116181) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.pairing.HatchDeviceBleManager$writePayloadRaw$1", f = "HatchDeviceBleManager.kt", l = {1390}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.devices.pairing.HatchDeviceBleManager$writePayloadRaw$1, reason: invalid class name and case insensitive filesystem */
    public final class C116191 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ byte[] $data;
        public final /* synthetic */ Function0<Unit> $onFailure;
        public final /* synthetic */ Function0<Unit> $onSuccess;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116191(byte[] bArr, Function0<Unit> function0, Function0<Unit> function02, HtJ<? super C116191> htJ) {
            super(2, htJ);
            this.$data = bArr;
            this.$onFailure = function0;
            this.$onSuccess = function02;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchDeviceBleManager.this.new C116191(this.$data, this.$onFailure, this.$onSuccess, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM729writeChunkedgIAlus;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchDeviceBleManager hatchDeviceBleManager = HatchDeviceBleManager.this;
                byte[] bArr = this.$data;
                this.label = 1;
                objM729writeChunkedgIAlus = hatchDeviceBleManager.m729writeChunkedgIAlus(bArr, this);
                if (objM729writeChunkedgIAlus == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM729writeChunkedgIAlus = AnonymousClass001.A0q(obj);
            }
            Function0<Unit> function0 = objM729writeChunkedgIAlus instanceof C10571Hud ? this.$onFailure : this.$onSuccess;
            if (function0 != null) {
                function0.invoke();
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C116191) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final ScannedDevice findAlreadyConnectedHatchDevice() {
        BluetoothManager bluetoothManager;
        String name;
        DiscoveryDecision.Claimed claimed;
        Object systemService = this.context.getSystemService("bluetooth");
        if (!(systemService instanceof BluetoothManager) || (bluetoothManager = (BluetoothManager) systemService) == null) {
            return null;
        }
        try {
            List<BluetoothDevice> connectedDevices = bluetoothManager.getConnectedDevices(7);
            C7384Etj.A0X(connectedDevices);
            for (BluetoothDevice bluetoothDevice : connectedDevices) {
                if (!C8j4.A0u(bluetoothDevice).equalsIgnoreCase(this.setUpAgainAddress) && (name = bluetoothDevice.getName()) != null && !this.excludeNames.contains(name)) {
                    boolean zNameMatchesTarget = nameMatchesTarget(name);
                    ParcelUuid[] uuids = bluetoothDevice.getUuids();
                    if (uuids == null) {
                        uuids = new ParcelUuid[0];
                    }
                    List<ParcelUuid> listA0G = BFI.A0G(uuids);
                    DiscoveryDecision discoveryDecisionClassify = classify(C8j4.A0u(bluetoothDevice), name, listA0G, zNameMatchesTarget, true, false);
                    ClaimedDeviceRow claimedDeviceRow = (!(discoveryDecisionClassify instanceof DiscoveryDecision.Claimed) || (claimed = (DiscoveryDecision.Claimed) discoveryDecisionClassify) == null) ? null : claimed.row;
                    boolean z = (this.supportsGadgets && !listA0G.contains(HatchDeviceBleManagerKt.LINK_SETUP_SERVICE) && HatchDeviceFamilyKt.matchesCommunityName(this.deviceFamily, name)) ? false : true;
                    if (claimedDeviceRow != null || HatchDeviceBleManagerKt.showsAsLinkRow(discoveryDecisionClassify, zNameMatchesTarget, z, this.includeWifiLinks)) {
                        return new ScannedDevice(C8j4.A0u(bluetoothDevice), name, 0, claimedDeviceRow, rememberBluetoothGadget(C8j4.A0u(bluetoothDevice), getImpliesBluetoothGadget(discoveryDecisionClassify)));
                    }
                }
            }
            return null;
        } catch (Exception e) {
            CFK.A0A(HatchDeviceBleManagerKt.TAG, "getConnectedDevices threw", e);
            return null;
        }
    }

    private final void handleDeviceInfo(JsonObject jsonObject) {
        try {
            C9sU c9sU = HatchJsonKt.HatchJson;
            int i = LinkDeviceInfoJson.$stable;
            LinkDeviceInfo domain = ((LinkDeviceInfoJson) c9sU.A01(LinkDeviceInfoJson$$serializer.INSTANCE, jsonObject)).toDomain();
            if (domain != null) {
                C8j4.A1L(this.listener, "device_info node_id=", domain.nodeId);
                completePendingDeviceInfo(domain);
                this.listener.onDeviceInfo(domain.nodeId);
                return;
            }
        } catch (Exception unused) {
        }
        completePendingDeviceInfo(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleIncomingData(byte[] bArr) {
        int length = bArr.length;
        if (length >= 3 && bArr[0] == -2) {
            int i = bArr[1] & 255;
            int i2 = bArr[2] & 255;
            byte[] bArrA06 = AbstractC0903AHf.A06(bArr, 3, length);
            if (i2 > 0 && i < i2) {
                int i3 = this.expectedChunkTotal;
                if (i3 != 0 && i3 != i2) {
                    this.chunkBuffer.clear();
                }
                this.expectedChunkTotal = i2;
                Map<Integer, byte[]> map = this.chunkBuffer;
                Integer numValueOf = Integer.valueOf(i);
                if (map.containsKey(numValueOf)) {
                    CFK.A06(HatchDeviceBleManagerKt.TAG, FGI.A0I("Duplicate chunk index ", i, ", resetting"));
                } else {
                    this.chunkBuffer.put(numValueOf, bArrA06);
                    cancelChunkAssemblyTimeout();
                    this.chunkAssemblyJob = AnonymousClass001.A11(new C116051(null), this.scope);
                    this.listener.onDebugLog(FGI.A0f("Chunk ", CustomConnectorRegisterRepositoryKt.ROOT_PATH, ", ", " bytes", i + 1, i2, bArrA06.length));
                    if (this.chunkBuffer.size() != i2) {
                        return;
                    }
                    ADq aDq = new ADq(0, i2 - 1);
                    ArrayList<byte[]> arrayListA0h = C3cG.A0h();
                    Iterator<Integer> it = aDq.iterator();
                    while (it.hasNext()) {
                        byte[] bArr2 = this.chunkBuffer.get(Integer.valueOf(((BNt) it).A00()));
                        if (bArr2 != null) {
                            arrayListA0h.add(bArr2);
                        }
                    }
                    if (arrayListA0h.size() == i2) {
                        Iterator it2 = arrayListA0h.iterator();
                        int length2 = 0;
                        while (it2.hasNext()) {
                            length2 += ((byte[]) it2.next()).length;
                        }
                        bArr = new byte[length2];
                        int i4 = 0;
                        for (byte[] bArr3 : arrayListA0h) {
                            int length3 = bArr3.length;
                            System.arraycopy(bArr3, 0, bArr, i4, length3);
                            i4 += length3;
                        }
                    }
                }
            }
            resetChunkState();
            return;
        }
        resetChunkState();
        handleReassembledMessage(bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startProvisioningTimeout(HatchDeviceProvisioningStatus hatchDeviceProvisioningStatus, long j) {
        cancelProvisioningTimeout();
        this.pendingProvisioningFailureStatus = hatchDeviceProvisioningStatus;
        this.provisioningTimeoutJob = AnonymousClass001.A11(new C116131(j, this, hatchDeviceProvisioningStatus, null), this.scope);
    }

    @Override // com.facebook.aura.devices.pairing.LinkEncryptedSetupBleTransport
    public void clearEncryptedPairingSession() {
        this.encryptedPairingSession = null;
        this.linkEncryptedSetupState = LinkEncryptedSetupState.INACTIVE;
        clearPairingConfirmation();
    }

    @Override // com.facebook.aura.devices.pairing.LinkEncryptedSetupBleTransport
    public void clearPendingDeviceInfoCallback(G0U<? super LinkDeviceInfo, Unit> g0u) {
        C7384Etj.A0Y(g0u, 0);
        PendingBleCallback<LinkDeviceInfo> pendingBleCallback = this.pendingDeviceInfoCallback.get();
        if (pendingBleCallback != null && pendingBleCallback.callback == g0u && Bs8.A00(pendingBleCallback, null, this.pendingDeviceInfoCallback)) {
            pendingBleCallback.cancel();
        }
    }

    @Override // com.facebook.aura.devices.pairing.LinkEncryptedSetupBleTransport
    public void clearPendingPairingReadyCallback(G0U<? super LinkPairingReady, Unit> g0u) {
        C7384Etj.A0Y(g0u, 0);
        PendingBleCallback<LinkPairingReady> pendingBleCallback = this.pendingPairingReadyCallback.get();
        if (pendingBleCallback != null && pendingBleCallback.callback == g0u && Bs8.A00(pendingBleCallback, null, this.pendingPairingReadyCallback)) {
            pendingBleCallback.cancel();
        }
    }

    public final void connectToDevice(String str) {
        C7384Etj.A0Y(str, 0);
        ScannedDevice scannedDevice = this.discoveredDevices.get(str);
        if (scannedDevice == null) {
            if (this.hasStopped) {
                return;
            }
            this.listener.onStateChanged(HatchDeviceBleState.CONNECTION_FAILED, null, null);
        } else {
            stopAccumulatingScan();
            this.pendingScannedDevice = null;
            this.connectedHubName = scannedDevice.name;
            cancelConnectionJobs();
            this.connectionJob = AnonymousClass001.A11(new C116031(scannedDevice, null), this.scope);
        }
    }

    @Override // com.facebook.aura.devices.pairing.LinkEncryptedSetupBleTransport
    public boolean hasEncryptedPairingSession(LinkEncryptedPairingSession linkEncryptedPairingSession) {
        C7384Etj.A0Y(linkEncryptedPairingSession, 0);
        return this.encryptedPairingSession == linkEncryptedPairingSession;
    }

    @Override // com.facebook.aura.devices.pairing.LinkEncryptedSetupBleTransport
    public void installEncryptedPairingSession(LinkEncryptedPairingSession linkEncryptedPairingSession) {
        C7384Etj.A0Y(linkEncryptedPairingSession, 0);
        if (this.linkEncryptedSetupState == LinkEncryptedSetupState.AWAITING_PAIRING_READY) {
            clearPairingConfirmation();
            this.encryptedPairingSession = linkEncryptedPairingSession;
            this.linkEncryptedSetupState = LinkEncryptedSetupState.AWAITING_CLIENT_FINISHED;
        }
    }

    public final boolean isBluetoothGadget(String str) {
        C7384Etj.A0Y(str, 0);
        return this.bluetoothGadgetAddresses.contains(str);
    }

    @Override // com.facebook.aura.devices.pairing.LinkEncryptedSetupBleTransport
    public void requestLinkDeviceInfo(G0U<? super LinkDeviceInfo, Unit> g0u) {
        C7384Etj.A0Y(g0u, 0);
        if (isConnectedLinkDevice() && this.encryptedPairingSession == null && this.linkEncryptedSetupState == LinkEncryptedSetupState.INACTIVE) {
            this.linkEncryptedSetupState = LinkEncryptedSetupState.AWAITING_PAIRING_READY;
        }
        completePendingDeviceInfo(null);
        PendingBleCallback<LinkDeviceInfo> pendingBleCallback = new PendingBleCallback<>(g0u);
        this.pendingDeviceInfoCallback.set(pendingBleCallback);
        writePayloadRaw(HatchDeviceBleManagerKt.encodeBleAction("get_device_info"), new C116061(pendingBleCallback), null);
    }

    @Override // com.facebook.aura.devices.pairing.LinkEncryptedSetupBleTransport
    public boolean startPairingConfirmation(LinkEncryptedPairingSession linkEncryptedPairingSession) {
        C7384Etj.A0Y(linkEncryptedPairingSession, 0);
        if (this.encryptedPairingSession != linkEncryptedPairingSession || this.linkEncryptedSetupState != LinkEncryptedSetupState.AWAITING_CLIENT_FINISHED) {
            return false;
        }
        clearPairingConfirmation();
        this.encryptedPairingSession = linkEncryptedPairingSession;
        this.pairingConfirmation = new GAt(null);
        this.linkEncryptedSetupState = linkEncryptedPairingSession.getRequiresAppConfirmation() ? LinkEncryptedSetupState.AWAITING_CONFIRMATION : LinkEncryptedSetupState.AWAITING_CONFIRM_REQUIRED;
        try {
            writePayloadRaw(HatchJsonKt.HatchJson.A02(linkEncryptedPairingSession.encryptPairingClientFinished(), LinkEncryptedRecordJson$$serializer.INSTANCE), new C116121(), null);
            return true;
        } catch (Exception e) {
            CFK.A0A(HatchDeviceBleManagerKt.TAG, "Failed to encode Link pairing_client_finished", e);
            this.encryptedPairingSession = null;
            this.linkEncryptedSetupState = LinkEncryptedSetupState.FAILED;
            clearPairingConfirmation();
            return false;
        }
    }

    public final void stop() {
        this.hasStopped = true;
        HoC hoC = this.connectionJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        HoC hoC2 = this.notificationsJob;
        if (hoC2 != null) {
            hoC2.A5w(null);
        }
        HoC hoC3 = this.disconnectWatcherJob;
        if (hoC3 != null) {
            hoC3.A5w(null);
        }
        cancelProvisioningTimeout();
        cancelWiFiScanTimeout();
        cancelChunkAssemblyTimeout();
        clearPendingDeviceInfoCallback();
        clearPendingPairingReadyCallback();
        clearPairingConfirmation();
        this.encryptedPairingSession = null;
        this.linkEncryptedSetupState = LinkEncryptedSetupState.INACTIVE;
        this.connectionJob = null;
        this.notificationsJob = null;
        this.disconnectWatcherJob = null;
        this.chunkBuffer.clear();
        this.expectedChunkTotal = 0;
        this.connectedHubName = null;
        this.connectedDeviceAddress = null;
        this.pendingScannedDevice = null;
        stopAccumulatingScan();
        this.discoveredDevices.clear();
        AnonymousClass001.A1J(new C116151(null), C78W.A05(new C8eO(null), AuraDispatchers.main));
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LinkEncryptedSetupState.values().length];
            try {
                AnonymousClass002.A13(LinkEncryptedSetupState.INACTIVE, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(LinkEncryptedSetupState.AWAITING_PAIRING_READY, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(LinkEncryptedSetupState.AWAITING_CLIENT_FINISHED, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(LinkEncryptedSetupState.AWAITING_CONFIRM_REQUIRED, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(LinkEncryptedSetupState.AWAITING_CONFIRMATION, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(LinkEncryptedSetupState.ESTABLISHED, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass006.A1G(LinkEncryptedSetupState.FAILED, iArr);
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ HatchDeviceBleManager(Context context, String str, Set set, HatchDeviceFamily hatchDeviceFamily, boolean z, DiscoveredDeviceClassifier discoveredDeviceClassifier, boolean z2, boolean z3, String str2, HatchDeviceBleListener hatchDeviceBleListener, int i, C06H c06h) {
        this(context, (i & 2) != 0 ? null : str, (i & 4) != 0 ? A3q.A00 : set, hatchDeviceFamily, AnonymousClass005.A1Q(i, z), (i & 32) != 0 ? null : discoveredDeviceClassifier, C60Q.A1Q(i & 64, z2), z3, str2, hatchDeviceBleListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addDiscoveredDevice(ScannedDevice scannedDevice) {
        DiscoveryScan discoveryScan;
        if (this.hasStopped) {
            return;
        }
        List<HatchDiscoveredDevice> list = this.visibleDevices;
        String str = scannedDevice.address;
        String str2 = scannedDevice.name;
        ClaimedDeviceRow claimedDeviceRow = scannedDevice.claim;
        boolean z = scannedDevice.isBluetoothGadget;
        DeviceRowBadge deviceRowBadgeBluetoothGadgetBadge = null;
        if (z && claimedDeviceRow == null && (discoveryScan = this.discoveryScan) != null) {
            deviceRowBadgeBluetoothGadgetBadge = discoveryScan.bluetoothGadgetBadge();
        }
        List<HatchDiscoveredDevice> listMergeDiscoveredDevice = HatchDiscoveredDevicesKt.mergeDiscoveredDevice(list, new HatchDiscoveredDevice(str, str2, claimedDeviceRow, z, deviceRowBadgeBluetoothGadgetBadge));
        if (listMergeDiscoveredDevice.equals(this.visibleDevices)) {
            return;
        }
        boolean zIsEmpty = this.visibleDevices.isEmpty();
        this.discoveredDevices.put(scannedDevice.address, scannedDevice);
        this.visibleDevices = listMergeDiscoveredDevice;
        if (zIsEmpty) {
            this.listener.onStateChanged(HatchDeviceBleState.FOUND, scannedDevice.name, Integer.valueOf(scannedDevice.rssi));
        }
        this.listener.onDevicesDiscovered(listMergeDiscoveredDevice);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object awaitLinkTeardown(java.lang.String r12, X.HtJ<? super java.lang.Boolean> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.facebook.aura.devices.pairing.HatchDeviceBleManager.AnonymousClass1
            if (r0 == 0) goto L29
            r9 = r13
            com.facebook.aura.devices.pairing.HatchDeviceBleManager$awaitLinkTeardown$1 r9 = (com.facebook.aura.devices.pairing.HatchDeviceBleManager.AnonymousClass1) r9
            int r2 = r9.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L29
            int r2 = r2 - r1
            r9.label = r2
        L12:
            java.lang.Object r1 = r9.result
            X.Hji r10 = X.EnumC10460Hji.A02
            int r0 = r9.label
            java.lang.String r8 = "awaitLinkTeardown failed"
            java.lang.String r4 = "HatchDeviceBleManager"
            r7 = 1
            r3 = 0
            if (r0 == 0) goto L38
            if (r0 != r7) goto L33
            long r5 = r9.J$0
            java.lang.Object r12 = r9.L$0
            java.lang.String r12 = (java.lang.String) r12
            goto L2f
        L29:
            com.facebook.aura.devices.pairing.HatchDeviceBleManager$awaitLinkTeardown$1 r9 = new com.facebook.aura.devices.pairing.HatchDeviceBleManager$awaitLinkTeardown$1
            r9.<init>(r13)
            goto L12
        L2f:
            X.Hwg.A00(r1)     // Catch: java.lang.SecurityException -> Lc2 java.lang.IllegalArgumentException -> Lc7
            goto L91
        L33:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L38:
            X.Hwg.A00(r1)
            android.content.Context r1 = r11.context
            java.lang.String r0 = "bluetooth"
            java.lang.Object r1 = r1.getSystemService(r0)
            boolean r0 = r1 instanceof android.bluetooth.BluetoothManager
            if (r0 == 0) goto L59
            android.bluetooth.BluetoothManager r1 = (android.bluetooth.BluetoothManager) r1
        L49:
            java.lang.String r2 = "Link teardown skipped for "
            if (r1 != 0) goto L5b
            com.facebook.aura.devices.pairing.HatchDeviceBleManager$bleLogger$1 r1 = r11.bleLogger
            java.lang.String r0 = ": no BluetoothManager"
            java.lang.String r0 = X.FGI.A0U(r2, r12, r0)
            r1.log(r0)
            return r3
        L59:
            r1 = r3
            goto L49
        L5b:
            long r5 = android.os.SystemClock.elapsedRealtime()
            android.bluetooth.BluetoothAdapter r0 = r1.getAdapter()     // Catch: java.lang.SecurityException -> Lc2 java.lang.IllegalArgumentException -> Lc7
            if (r0 == 0) goto L6a
            android.bluetooth.BluetoothDevice r0 = r0.getRemoteDevice(r12)     // Catch: java.lang.SecurityException -> Lc2 java.lang.IllegalArgumentException -> Lc7
            goto L6b
        L6a:
            r0 = r3
        L6b:
            if (r0 != 0) goto L79
            com.facebook.aura.devices.pairing.HatchDeviceBleManager$bleLogger$1 r1 = r11.bleLogger     // Catch: java.lang.SecurityException -> Lc2 java.lang.IllegalArgumentException -> Lc7
            java.lang.String r0 = ": no adapter"
            java.lang.String r0 = X.FGI.A0U(r2, r12, r0)     // Catch: java.lang.SecurityException -> Lc2 java.lang.IllegalArgumentException -> Lc7
            r1.log(r0)     // Catch: java.lang.SecurityException -> Lc2 java.lang.IllegalArgumentException -> Lc7
            return r3
        L79:
            com.facebook.aura.devices.pairing.HatchDeviceBleManager$awaitLinkTeardown$dropped$1 r2 = new com.facebook.aura.devices.pairing.HatchDeviceBleManager$awaitLinkTeardown$dropped$1     // Catch: java.lang.SecurityException -> Lc2 java.lang.IllegalArgumentException -> Lc7
            r2.<init>(r1, r0, r3)     // Catch: java.lang.SecurityException -> Lc2 java.lang.IllegalArgumentException -> Lc7
            r9.L$0 = r12     // Catch: java.lang.SecurityException -> Lc2 java.lang.IllegalArgumentException -> Lc7
            r9.L$1 = r3     // Catch: java.lang.SecurityException -> Lc2 java.lang.IllegalArgumentException -> Lc7
            r9.L$2 = r3     // Catch: java.lang.SecurityException -> Lc2 java.lang.IllegalArgumentException -> Lc7
            r9.J$0 = r5     // Catch: java.lang.SecurityException -> Lc2 java.lang.IllegalArgumentException -> Lc7
            r9.label = r7     // Catch: java.lang.SecurityException -> Lc2 java.lang.IllegalArgumentException -> Lc7
            r0 = 6000(0x1770, double:2.9644E-320)
            java.lang.Object r1 = X.GAX.A01(r9, r2, r0)     // Catch: java.lang.SecurityException -> Lc2 java.lang.IllegalArgumentException -> Lc7
            if (r1 != r10) goto L91
            return r10
        L91:
            if (r1 != 0) goto L94
            r7 = 0
        L94:
            com.facebook.aura.devices.pairing.HatchDeviceBleManager$bleLogger$1 r4 = r11.bleLogger
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r1 = r1 - r5
            java.lang.String r0 = "Link teardown for "
            java.lang.StringBuilder r3 = X.C3cI.A0x(r0, r12)
            java.lang.String r0 = ": dropped="
            r3.append(r0)
            r3.append(r7)
            r0 = 1
            java.lang.String r0 = X.BV3.A00(r0)
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = "ms"
            java.lang.String r0 = X.AnonymousClass001.A0v(r0, r3)
            r4.log(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            return r0
        Lc2:
            r0 = move-exception
            X.CFK.A0A(r4, r8, r0)
            return r3
        Lc7:
            r0 = move-exception
            X.CFK.A0A(r4, r8, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.pairing.HatchDeviceBleManager.awaitLinkTeardown(java.lang.String, X.HtJ):java.lang.Object");
    }

    private final void cancelChunkAssemblyTimeout() {
        this.chunkAssemblyJob = C3cI.A15(this.chunkAssemblyJob);
    }

    private final void cancelConnectionJobs() {
        HoC hoC = this.connectionJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        HoC hoC2 = this.notificationsJob;
        if (hoC2 != null) {
            hoC2.A5w(null);
        }
        HoC hoC3 = this.disconnectWatcherJob;
        if (hoC3 != null) {
            hoC3.A5w(null);
        }
        cancelProvisioningTimeout();
        cancelWiFiScanTimeout();
        cancelChunkAssemblyTimeout();
        clearPendingDeviceInfoCallback();
        clearPendingPairingReadyCallback();
        clearPairingConfirmation();
        this.encryptedPairingSession = null;
        this.linkEncryptedSetupState = LinkEncryptedSetupState.INACTIVE;
        this.connectionJob = null;
        this.notificationsJob = null;
        this.disconnectWatcherJob = null;
        this.chunkBuffer.clear();
        this.expectedChunkTotal = 0;
    }

    private final void cancelProvisioningTimeout() {
        HoC hoC = this.provisioningTimeoutJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        this.provisioningTimeoutJob = null;
        this.pendingProvisioningFailureStatus = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelWiFiScanTimeout() {
        this.wifiScanTimeoutJob = C3cI.A15(this.wifiScanTimeoutJob);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DiscoveryDecision classify(String str, String str2, List<ParcelUuid> list, boolean z, boolean z2, boolean z3) {
        DiscoveryDecision discoveryDecision;
        DiscoveryDecision discoveryDecisionClassify;
        if (this.supportsGadgets && !this.includeBluetoothGadgets && (z3 || HatchDeviceFamilyKt.matchesCommunityName(this.deviceFamily, str2))) {
            discoveryDecision = DiscoveryDecision.Hidden.INSTANCE;
        } else {
            DiscoveryScan discoveryScan = this.discoveryScan;
            if (discoveryScan != null && (discoveryDecisionClassify = discoveryScan.classify(new DiscoveredAdvertisement(str, str2, list, z, z2, z3, this.includeBluetoothGadgets))) != null) {
                return discoveryDecisionClassify;
            }
            discoveryDecision = DiscoveryDecision.Unclaimed.INSTANCE;
        }
        return discoveryDecision;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearPairingConfirmation() {
        InterfaceC10560Hsz<LinkPairingConfirmationResult> interfaceC10560Hsz = this.pairingConfirmation;
        if (interfaceC10560Hsz != null) {
            C3cG.A1F(interfaceC10560Hsz, LinkPairingConfirmationResult.Superseded.INSTANCE);
        }
        this.pairingConfirmation = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object collectIncomingData(HtJ<? super Unit> htJ) {
        return C3cG.A0U(new HatchDeviceBleManager$collectIncomingData$$inlined$filter$1(this.connection.getIncomingData()).collect(new C20Z() { // from class: com.facebook.aura.devices.pairing.HatchDeviceBleManager.collectIncomingData.3
            public final Object emit(AuraBleData auraBleData, HtJ<? super Unit> htJ2) {
                HatchDeviceBleManager.this.handleIncomingData(auraBleData.data);
                return Unit.INSTANCE;
            }

            @Override // X.C20Z
            public /* bridge */ /* synthetic */ Object emit(Object obj, HtJ htJ2) {
                return emit((AuraBleData) obj, (HtJ<? super Unit>) htJ2);
            }
        }, htJ));
    }

    private final void completePairingConfirmation(LinkPairingConfirmationResult linkPairingConfirmationResult) {
        InterfaceC10560Hsz<LinkPairingConfirmationResult> interfaceC10560Hsz = this.pairingConfirmation;
        if (interfaceC10560Hsz != null) {
            C3cG.A1F(interfaceC10560Hsz, linkPairingConfirmationResult);
        }
    }

    private final void completePendingDeviceInfo(LinkDeviceInfo linkDeviceInfo) {
        PendingBleCallback pendingBleCallback = (PendingBleCallback) C8j3.A10(this.pendingDeviceInfoCallback);
        if (pendingBleCallback != null) {
            pendingBleCallback.complete(linkDeviceInfo);
        }
    }

    private final void completePendingPairingReady(LinkPairingReady linkPairingReady) {
        PendingBleCallback pendingBleCallback = (PendingBleCallback) C8j3.A10(this.pendingPairingReadyCallback);
        if (pendingBleCallback != null) {
            pendingBleCallback.complete(linkPairingReady);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:108:0x024e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0151 A[Catch: Exception -> 0x01a1, CancellationException -> 0x0235, TryCatch #4 {CancellationException -> 0x0235, Exception -> 0x01a1, blocks: (B:66:0x016b, B:67:0x016e, B:61:0x014d, B:63:0x0151, B:69:0x017a, B:53:0x010c, B:54:0x010f), top: B:114:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01e9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0207 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0221  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object connectAndPrepare(X.C3UX r16, com.facebook.aura.devices.pairing.HatchDeviceBleManager.ScannedDevice r17, X.HtJ<? super kotlin.Unit> r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.pairing.HatchDeviceBleManager.connectAndPrepare(X.3UX, com.facebook.aura.devices.pairing.HatchDeviceBleManager$ScannedDevice, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d9 A[Catch: Exception -> 0x0155, CancellationException -> 0x017a, TRY_ENTER, TryCatch #2 {CancellationException -> 0x017a, Exception -> 0x0155, blocks: (B:59:0x013b, B:60:0x013e, B:62:0x0144, B:63:0x0148, B:53:0x011f, B:54:0x0123, B:56:0x0127, B:65:0x0152, B:46:0x00d9, B:50:0x00f4, B:49:0x00f1), top: B:88:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0127 A[Catch: Exception -> 0x0155, CancellationException -> 0x017a, TryCatch #2 {CancellationException -> 0x017a, Exception -> 0x0155, blocks: (B:59:0x013b, B:60:0x013e, B:62:0x0144, B:63:0x0148, B:53:0x011f, B:54:0x0123, B:56:0x0127, B:65:0x0152, B:46:0x00d9, B:50:0x00f4, B:49:0x00f1), top: B:88:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0144 A[Catch: Exception -> 0x0155, CancellationException -> 0x017a, TryCatch #2 {CancellationException -> 0x017a, Exception -> 0x0155, blocks: (B:59:0x013b, B:60:0x013e, B:62:0x0144, B:63:0x0148, B:53:0x011f, B:54:0x0123, B:56:0x0127, B:65:0x0152, B:46:0x00d9, B:50:0x00f4, B:49:0x00f1), top: B:88:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0152 A[Catch: Exception -> 0x0155, CancellationException -> 0x017a, TryCatch #2 {CancellationException -> 0x017a, Exception -> 0x0155, blocks: (B:59:0x013b, B:60:0x013e, B:62:0x0144, B:63:0x0148, B:53:0x011f, B:54:0x0123, B:56:0x0127, B:65:0x0152, B:46:0x00d9, B:50:0x00f4, B:49:0x00f1), top: B:88:0x001e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object connectOnce(X.C3UX r12, com.facebook.aura.devices.pairing.HatchDeviceBleManager.ScannedDevice r13, X.HtJ<? super com.facebook.aura.devices.pairing.GattConnectOutcome> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.pairing.HatchDeviceBleManager.connectOnce(X.3UX, com.facebook.aura.devices.pairing.HatchDeviceBleManager$ScannedDevice, X.HtJ):java.lang.Object");
    }

    private final void dispatchJsonMessage(String str) {
        try {
            JsonObject jsonObjectAsJsonObjectOrNull = JsonObjectExtensionsKt.asJsonObjectOrNull(HatchJsonKt.HatchJson.A04(str));
            if (jsonObjectAsJsonObjectOrNull != null) {
                String strOptString = JsonObjectExtensionsKt.optString(jsonObjectAsJsonObjectOrNull, "type", "");
                String strOptString2 = JsonObjectExtensionsKt.optString(jsonObjectAsJsonObjectOrNull, "action", "");
                if (LinkPairingProtocolStrings.ACTION_ENCRYPTED_RECORD.equals(strOptString2) || LinkPairingProtocolStrings.ACTION_ENCRYPTED_RECORD.equals(strOptString)) {
                    handleEncryptedRecord(jsonObjectAsJsonObjectOrNull);
                    return;
                }
                if (this.linkEncryptedSetupState == LinkEncryptedSetupState.INACTIVE || this.linkEncryptedSetupState == LinkEncryptedSetupState.AWAITING_PAIRING_READY) {
                    if ("device_info".equals(strOptString)) {
                        handleDeviceInfo(jsonObjectAsJsonObjectOrNull);
                        return;
                    } else if ("pairing_ready".equals(strOptString)) {
                        handlePairingReady(jsonObjectAsJsonObjectOrNull);
                        return;
                    }
                }
                if (AuraDeeplinkRouteMapper.STATUS_ROUTE.equals(strOptString)) {
                    handleStatusText(JsonObjectExtensionsKt.optString(jsonObjectAsJsonObjectOrNull, AuraDeeplinkRouteMapper.STATUS_ROUTE, ""), false, null);
                    return;
                }
                if (strOptString.length() != 0) {
                    strOptString2 = strOptString;
                }
                handlePlaintextMessageForEncryptedSetupState(strOptString2);
            }
        } catch (Exception e) {
            C8j4.A1L(this.listener, "Malformed JSON message: ", e.getMessage());
        }
    }

    private final String encryptedDecryptFailureMessage(LinkEncryptedDecryptResult.Failure failure) {
        Long l = failure.expectedCounter;
        return AnonymousClass001.A0v((l == null && failure.actualCounter == null) ? "" : AnonymousClass006.A0y(failure.actualCounter, " actual=", C3cG.A0f(l, " expected=")), C3cG.A0f(failure.reason, "Encrypted Link record rejected: "));
    }

    private final boolean failInFlightLinkEncryptedSetup(String str) {
        switch (this.linkEncryptedSetupState.ordinal()) {
            case 0:
            case 5:
            case 6:
                return false;
            case 1:
            case 2:
            case 3:
            case 4:
                C8j4.A1L(this.listener, "Link encrypted pairing failed: ", str);
                this.encryptedPairingSession = null;
                this.linkEncryptedSetupState = LinkEncryptedSetupState.FAILED;
                completePendingDeviceInfo(null);
                completePendingPairingReady(null);
                completePairingConfirmation(LinkPairingConfirmationResult.Superseded.INSTANCE);
                return true;
            default:
                throw C3cG.A0q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getImpliesBluetoothGadget(DiscoveryDecision discoveryDecision) {
        return C7384Etj.areEqual(discoveryDecision, DiscoveryDecision.LinkSetup.INSTANCE) || (discoveryDecision instanceof DiscoveryDecision.Claimed);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void handleEncryptedRecord(kotlinx.serialization.json.JsonObject r8) {
        /*
            r7 = this;
            com.facebook.aura.devices.pairing.LinkEncryptedPairingSession r2 = r7.encryptedPairingSession
            if (r2 == 0) goto Ld4
            X.9sU r1 = com.facebook.aura.json.HatchJsonKt.HatchJson     // Catch: java.lang.Throwable -> Lf
            com.facebook.aura.devices.pairing.LinkEncryptedRecordJson$$serializer r0 = com.facebook.aura.devices.pairing.LinkEncryptedRecordJson$$serializer.INSTANCE     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r1 = r1.A01(r0, r8)     // Catch: java.lang.Throwable -> Lf
            com.facebook.aura.devices.pairing.LinkEncryptedRecordJson r1 = (com.facebook.aura.devices.pairing.LinkEncryptedRecordJson) r1     // Catch: java.lang.Throwable -> Lf
            goto L14
        Lf:
            r0 = move-exception
            X.Hud r1 = X.C3cG.A0s(r0)
        L14:
            boolean r0 = r1 instanceof X.C10571Hud
            r3 = 0
            if (r0 == 0) goto L1a
            r1 = r3
        L1a:
            com.facebook.aura.devices.pairing.LinkEncryptedRecordJson r1 = (com.facebook.aura.devices.pairing.LinkEncryptedRecordJson) r1
            if (r1 == 0) goto Ld4
            com.facebook.aura.devices.pairing.LinkEncryptedDecryptResult r1 = r2.decryptDeviceToMobile(r1)
            boolean r0 = r1 instanceof com.facebook.aura.devices.pairing.LinkEncryptedDecryptResult.Success
            if (r0 == 0) goto Lbd
            com.facebook.aura.devices.pairing.LinkEncryptedDecryptResult$Success r1 = (com.facebook.aura.devices.pairing.LinkEncryptedDecryptResult.Success) r1
            byte[] r2 = r1.plaintext
            java.nio.charset.Charset r1 = X.DCl.A05
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2, r1)
            java.lang.String r2 = X.AnonymousClass002.A0l(r0)
            java.lang.String r0 = "{"
            boolean r0 = X.C60O.A1X(r2, r0)
            if (r0 != 0) goto L43
            r1 = 0
            r0 = 1
            r7.handleStatusText(r2, r0, r1)
            return
        L43:
            X.9sU r0 = com.facebook.aura.json.HatchJsonKt.HatchJson     // Catch: java.lang.Throwable -> L4e
            kotlinx.serialization.json.JsonElement r0 = r0.A04(r2)     // Catch: java.lang.Throwable -> L4e
            kotlinx.serialization.json.JsonObject r5 = com.facebook.aura.json.JsonObjectExtensionsKt.asJsonObjectOrNull(r0)     // Catch: java.lang.Throwable -> L4e
            goto L53
        L4e:
            r0 = move-exception
            X.Hud r5 = X.C3cG.A0s(r0)
        L53:
            boolean r0 = r5 instanceof X.C10571Hud
            if (r0 == 0) goto L58
            r5 = r3
        L58:
            kotlinx.serialization.json.JsonObject r5 = (kotlinx.serialization.json.JsonObject) r5
            if (r5 == 0) goto Ld4
            java.lang.String r6 = "type"
            java.lang.String r4 = ""
            java.lang.String r3 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r5, r6, r4)
            int r0 = r3.hashCode()
            r2 = 1
            switch(r0) {
                case -1375924674: goto L7c;
                case -1279102296: goto L7f;
                case -892481550: goto L82;
                case -127582731: goto L8f;
                case 808775531: goto La6;
                case 1866083892: goto La9;
                default: goto L6c;
            }
        L6c:
            com.facebook.aura.devices.pairing.HatchDeviceBleListener r2 = r7.listener
            java.lang.String r1 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r5, r6, r4)
            java.lang.String r0 = "Unhandled encrypted message type: "
            java.lang.String r0 = X.FGI.A0M(r0, r1)
        L78:
            r2.onDebugLog(r0)
            return
        L7c:
            java.lang.String r0 = "confirm_required"
            goto Lab
        L7f:
            java.lang.String r0 = "pairing_confirmed"
            goto Lab
        L82:
            java.lang.String r1 = "status"
            boolean r0 = r3.equals(r1)
            if (r0 == 0) goto L6c
            java.lang.String r1 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r5, r1, r4)
            goto Lb5
        L8f:
            java.lang.String r0 = "wifi_scan_result"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L6c
            com.facebook.aura.devices.pairing.LinkEncryptedSetupState r1 = r7.linkEncryptedSetupState
            com.facebook.aura.devices.pairing.LinkEncryptedSetupState r0 = com.facebook.aura.devices.pairing.LinkEncryptedSetupState.ESTABLISHED
            if (r1 != r0) goto La1
            r7.handleWiFiScanResult(r5)
            return
        La1:
            com.facebook.aura.devices.pairing.HatchDeviceBleListener r2 = r7.listener
            java.lang.String r0 = "Ignoring encrypted Link wifi_scan_result before confirmation"
            goto L78
        La6:
            java.lang.String r0 = "pairing_confirm_timeout"
            goto Lab
        La9:
            java.lang.String r0 = "error_pairing_confirm_timeout"
        Lab:
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L6c
            java.lang.String r1 = com.facebook.aura.json.JsonObjectExtensionsKt.optString(r5, r6, r4)
        Lb5:
            java.lang.String r0 = r7.linkSdkToken(r5)
            r7.handleStatusText(r1, r2, r0)
            return
        Lbd:
            boolean r0 = r1 instanceof com.facebook.aura.devices.pairing.LinkEncryptedDecryptResult.Failure
            if (r0 == 0) goto Lda
            com.facebook.aura.devices.pairing.LinkEncryptedDecryptResult$Failure r1 = (com.facebook.aura.devices.pairing.LinkEncryptedDecryptResult.Failure) r1
            r7.reportEncryptedDecryptFailure(r1)
            java.lang.String r0 = "error_pairing_decrypt"
            boolean r0 = r7.failInFlightLinkEncryptedSetup(r0)
            if (r0 != 0) goto Ld9
            r7.encryptedPairingSession = r3
            com.facebook.aura.devices.pairing.LinkEncryptedSetupState r0 = com.facebook.aura.devices.pairing.LinkEncryptedSetupState.FAILED
            r7.linkEncryptedSetupState = r0
        Ld4:
            com.facebook.aura.devices.pairing.HatchDeviceProvisioningStatus r0 = com.facebook.aura.devices.pairing.HatchDeviceProvisioningStatus.DEVICE_ERROR
            r7.reportProvisioning(r0)
        Ld9:
            return
        Lda:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.pairing.HatchDeviceBleManager.handleEncryptedRecord(kotlinx.serialization.json.JsonObject):void");
    }

    private final void handlePairingReady(JsonObject jsonObject) {
        LinkPairingReady domain;
        try {
            domain = ((LinkPairingReadyJson) HatchJsonKt.HatchJson.A01(LinkPairingReadyJson$$serializer.INSTANCE, jsonObject)).toDomain();
        } catch (Exception unused) {
            domain = null;
        }
        completePendingPairingReady(domain);
    }

    private final void handlePlaintextMessageForEncryptedSetupState(String str) {
        int iOrdinal = this.linkEncryptedSetupState.ordinal();
        if (iOrdinal == 0) {
            ignorePlaintextBeforeEncryptedPairing(str);
        } else if (iOrdinal != 1) {
            ignorePlaintextAfterEncryptedPairing(str);
        } else {
            rejectPlaintextDuringEncryptedPairing(str);
        }
    }

    private final void handleReassembledMessage(byte[] bArr) {
        String strA0l = AnonymousClass002.A0l(new String(bArr, DCl.A05));
        if (AnonymousClass005.A1a(strA0l, "{")) {
            dispatchJsonMessage(strA0l);
        } else {
            handleStatusText(strA0l, false, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleStatusText(String str, boolean z, String str2) {
        HatchDeviceProvisioningStatus hatchDeviceProvisioningStatusLinkDeviceProvisioningStatusFor;
        if (z && isLinkEncryptedSetupFailureStatus(str) && failInFlightLinkEncryptedSetup(str)) {
            return;
        }
        if (!z) {
            switch (this.linkEncryptedSetupState.ordinal()) {
                case 0:
                    ignorePlaintextBeforeEncryptedPairing(str);
                    return;
                case 1:
                    if (!LinkEncryptedSetupPlaintextStatusPolicy.INSTANCE.allowsBeforeSession(str)) {
                        rejectPlaintextDuringEncryptedPairing(str);
                        return;
                    }
                    C8j4.A1L(this.listener, "Device error: ", str);
                    if ("error_pairing_unavailable".equals(str)) {
                        this.listener.onLinkPairingUnavailable(this.connectedDeviceAddress);
                    }
                    failInFlightLinkEncryptedSetup(str);
                    hatchDeviceProvisioningStatusLinkDeviceProvisioningStatusFor = HatchDeviceProvisioningStatus.DEVICE_ERROR;
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    ignorePlaintextAfterEncryptedPairing(str);
                    return;
                default:
                    throw C3cG.A0q();
            }
        } else {
            if (handlePairingConfirmationStatus(str, str2)) {
                return;
            }
            if (shouldIgnoreEncryptedStatusBeforeConfirmation(str)) {
                C8j4.A1L(this.listener, "Ignoring encrypted Link setup status before confirmation: ", str);
                return;
            }
            hatchDeviceProvisioningStatusLinkDeviceProvisioningStatusFor = linkDeviceProvisioningStatusFor(str);
            if (hatchDeviceProvisioningStatusLinkDeviceProvisioningStatusFor == null) {
                return;
            }
            if (hatchDeviceProvisioningStatusLinkDeviceProvisioningStatusFor.isFailure()) {
                C8j4.A1L(this.listener, "Device error: ", str);
            }
            this.listener.onDeviceReportedStatus(str);
        }
        reportProvisioning(hatchDeviceProvisioningStatusLinkDeviceProvisioningStatusFor);
    }

    private final void ignorePlaintextAfterEncryptedPairing(String str) {
        C8j4.A1L(this.listener, "Ignoring plaintext Link message after encrypted pairing started: ", str);
    }

    private final void ignorePlaintextBeforeEncryptedPairing(String str) {
        C8j4.A1L(this.listener, "Ignoring plaintext Link message before encrypted pairing: ", str);
    }

    private final boolean isConnectedLinkDevice() {
        String str;
        HatchDeviceFamily hatchDeviceFamily = this.deviceFamily;
        HatchDeviceFamily hatchDeviceFamily2 = HatchDeviceFamily.HATCH_LINK;
        return hatchDeviceFamily == hatchDeviceFamily2 || ((str = this.connectedHubName) != null && HatchDeviceFamilyKt.matchesDeviceName(hatchDeviceFamily2, str, true, false));
    }

    private final boolean isLinkEncryptedSetupFailureStatus(String str) {
        return "error_encryption_required".equals(str) || (AnonymousClass005.A1a(str, "error_pairing_") && !"error_pairing_confirm_timeout".equals(str));
    }

    private final boolean isSetUpAgainTarget(String str) {
        return AbstractC2159Azp.A12(str, this.setUpAgainAddress, true);
    }

    private final String linkSdkToken(JsonObject jsonObject) {
        JsonPrimitive jsonPrimitive;
        String strA00;
        String strA0l;
        Object obj = jsonObject.get("sdk_token");
        if (!(obj instanceof JsonPrimitive) || (jsonPrimitive = (JsonPrimitive) obj) == null || !jsonPrimitive.A01() || (strA00 = jsonPrimitive.A00()) == null || (strA0l = AnonymousClass002.A0l(strA00)) == null || strA0l.length() <= 0) {
            return null;
        }
        return strA0l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean nameMatchesTarget(String str) {
        String str2 = this.targetName;
        HatchDeviceFamily hatchDeviceFamily = this.deviceFamily;
        return str2 != null ? HatchDeviceFamilyKt.matchesTargetDeviceName(hatchDeviceFamily, str, str2, this.supportsGadgets) : HatchDeviceFamilyKt.matchesDeviceName(hatchDeviceFamily, str, this.includeCommunityDeviceNames, this.supportsGadgets);
    }

    private final void rejectPlaintextDuringEncryptedPairing(String str) {
        C8j4.A1L(this.listener, "Ignoring plaintext Link message during encrypted pairing: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean rememberBluetoothGadget(String str, boolean z) {
        if (z) {
            this.bluetoothGadgetAddresses.add(str);
        }
        return this.bluetoothGadgetAddresses.contains(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeDiscoveredDevice(String str) {
        if (this.hasStopped) {
            return;
        }
        List<HatchDiscoveredDevice> list = this.visibleDevices;
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        Iterator<HatchDiscoveredDevice> it = list.iterator();
        while (it.hasNext()) {
            if (C7384Etj.areEqual(it.next().address, str)) {
                List<HatchDiscoveredDevice> list2 = this.visibleDevices;
                ArrayList arrayListA0h = C3cG.A0h();
                for (HatchDiscoveredDevice hatchDiscoveredDevice : list2) {
                    AnonymousClass006.A1O(hatchDiscoveredDevice.address, str, hatchDiscoveredDevice, arrayListA0h);
                }
                this.visibleDevices = arrayListA0h;
                this.discoveredDevices.remove(str);
                this.listener.onDevicesDiscovered(this.visibleDevices);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resetChunkState() {
        this.chunkBuffer.clear();
        this.expectedChunkTotal = 0;
        cancelChunkAssemblyTimeout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object scanForDevice(X.HtJ<? super com.facebook.aura.devices.pairing.HatchDeviceBleManager.ScanOutcome> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.facebook.aura.devices.pairing.HatchDeviceBleManager.C116081
            if (r0 == 0) goto L61
            r6 = r8
            com.facebook.aura.devices.pairing.HatchDeviceBleManager$scanForDevice$1 r6 = (com.facebook.aura.devices.pairing.HatchDeviceBleManager.C116081) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L61
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L25
            if (r0 != r4) goto L67
            X.Hwg.A00(r1)
        L20:
            if (r1 != 0) goto L24
            com.facebook.aura.devices.pairing.HatchDeviceBleManager$ScanOutcome$NotFound r1 = com.facebook.aura.devices.pairing.HatchDeviceBleManager.ScanOutcome.NotFound.INSTANCE
        L24:
            return r1
        L25:
            X.Hwg.A00(r1)
            com.facebook.aura.devices.pairing.HatchDeviceBleManager$ScannedDevice r3 = r7.findAlreadyConnectedHatchDevice()
            r1 = 0
            if (r3 == 0) goto L51
            com.facebook.aura.devices.intf.ClaimedDeviceRow r0 = r3.claim
            if (r0 != 0) goto L51
            java.lang.String r2 = r3.name
            java.lang.String r1 = "Found already-connected Hatch device: "
            java.lang.String r0 = " (skipping scan)"
            java.lang.String r1 = X.FGI.A0U(r1, r2, r0)
            java.lang.String r0 = "HatchDeviceBleManager"
            X.CFK.A05(r0, r1)
            com.facebook.aura.devices.pairing.HatchDeviceBleListener r2 = r7.listener
            java.lang.String r1 = r3.name
            java.lang.String r0 = "Found (already connected): "
            X.C8j4.A1L(r2, r0, r1)
            com.facebook.aura.devices.pairing.HatchDeviceBleManager$ScanOutcome$Found r0 = new com.facebook.aura.devices.pairing.HatchDeviceBleManager$ScanOutcome$Found
            r0.<init>(r3)
            return r0
        L51:
            com.facebook.aura.devices.pairing.HatchDeviceBleManager$scanForDevice$outcome$1 r2 = new com.facebook.aura.devices.pairing.HatchDeviceBleManager$scanForDevice$outcome$1
            r2.<init>(r7, r1)
            r6.label = r4
            r0 = 15000(0x3a98, double:7.411E-320)
            java.lang.Object r1 = X.GAX.A01(r6, r2, r0)
            if (r1 != r5) goto L20
            return r5
        L61:
            com.facebook.aura.devices.pairing.HatchDeviceBleManager$scanForDevice$1 r6 = new com.facebook.aura.devices.pairing.HatchDeviceBleManager$scanForDevice$1
            r6.<init>(r8)
            goto L12
        L67:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.pairing.HatchDeviceBleManager.scanForDevice(X.HtJ):java.lang.Object");
    }

    private final String securityLabel(JsonObject jsonObject) {
        return jsonObject.containsKey("secure") ? JsonObjectExtensionsKt.optBoolean(jsonObject, "secure", false) ? "Secured" : "OPEN" : JsonObjectExtensionsKt.optString(jsonObject, "security", "Unknown");
    }

    private final boolean shouldIgnoreEncryptedStatusBeforeConfirmation(String str) {
        String str2;
        if (this.linkEncryptedSetupState == LinkEncryptedSetupState.ESTABLISHED) {
            return false;
        }
        switch (str.hashCode()) {
            case -2027244122:
                str2 = "ota_wifi_required";
                break;
            case -1734110093:
                str2 = "update_failed";
                break;
            case -1414900190:
                str2 = "wifi_connecting";
                break;
            case -1319263741:
                return str.equals("ota_starting");
            case -1202706614:
                str2 = "auth_validating";
                break;
            case -944011596:
                str2 = "auth_failed";
                break;
            case -878269862:
                str2 = "ota_applied";
                break;
            case -869078336:
                str2 = "ota_failed";
                break;
            case -646523949:
                str2 = LinkDeviceKeyProvisioningKt.LINK_STATUS_AUTH_OK;
                break;
            case -442055804:
                str2 = "update_installed";
                break;
            case -411969851:
                str2 = "vm_failed";
                break;
            case -109176622:
                str2 = PairsRepositoryKt.UNPAIRED;
                break;
            case -84839258:
                str2 = "vm_switching";
                break;
            case -4275197:
                str2 = "update_current";
                break;
            case 108386723:
                str2 = AvatarMediaMapperKt.READY;
                break;
            case 112317540:
                str2 = "vm_ok";
                break;
            case 828965008:
                str2 = "update_checking";
                break;
            case 1802972425:
                str2 = "unpair_failed";
                break;
            case 1813295271:
                str2 = "wifi_failed";
                break;
            case 2032567903:
                str2 = "wifi_connected";
                break;
            case 2062409997:
                str2 = "ota_skipped";
                break;
            default:
                return false;
        }
        return str.equals(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopAccumulatingScan() {
        BluetoothLeScanner bluetoothLeScanner;
        HoC hoC = this.multiScanTimeoutJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        this.multiScanTimeoutJob = null;
        ScanCallback scanCallback = this.multiScanCallback;
        if (scanCallback != null) {
            try {
                BluetoothAdapter bluetoothAdapter = this.bluetoothAdapter;
                if (bluetoothAdapter != null && (bluetoothLeScanner = bluetoothAdapter.getBluetoothLeScanner()) != null) {
                    bluetoothLeScanner.stopScan(scanCallback);
                }
            } catch (Exception e) {
                CFK.A0A(HatchDeviceBleManagerKt.TAG, "Error stopping scan", e);
            }
        }
        this.multiScanCallback = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object watchForUnexpectedDisconnect(X.HtJ<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.facebook.aura.devices.pairing.HatchDeviceBleManager.C116161
            if (r0 == 0) goto L74
            r5 = r7
            com.facebook.aura.devices.pairing.HatchDeviceBleManager$watchForUnexpectedDisconnect$1 r5 = (com.facebook.aura.devices.pairing.HatchDeviceBleManager.C116161) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L74
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L43
            if (r0 == r2) goto L5a
            if (r0 != r3) goto L7a
            X.Hwg.A00(r1)
        L23:
            boolean r0 = r6.hasStopped
            if (r0 != 0) goto L40
            com.facebook.aura.devices.pairing.HatchDeviceBleListener r0 = r6.listener
            boolean r0 = r0.onLinkDisconnected()
            if (r0 != 0) goto L40
            com.facebook.aura.devices.pairing.HatchDeviceProvisioningStatus r0 = r6.pendingProvisioningFailureStatus
            if (r0 == 0) goto L36
            r6.reportProvisioning(r0)
        L36:
            com.facebook.aura.devices.pairing.HatchDeviceBleListener r3 = r6.listener
            com.facebook.aura.devices.pairing.HatchDeviceBleState r2 = com.facebook.aura.devices.pairing.HatchDeviceBleState.CONNECTION_FAILED
            r1 = 0
            java.lang.String r0 = "Disconnected"
            r3.onStateChanged(r2, r0, r1)
        L40:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L43:
            X.Hwg.A00(r1)
            com.facebook.aura.common.ble.AuraBleConnection r0 = r6.connection
            X.22I r1 = r0.getGattEvents()
            com.facebook.aura.devices.pairing.HatchDeviceBleManager$watchForUnexpectedDisconnect$$inlined$filterIsInstance$1 r0 = new com.facebook.aura.devices.pairing.HatchDeviceBleManager$watchForUnexpectedDisconnect$$inlined$filterIsInstance$1
            r0.<init>(r1)
            r5.label = r2
            java.lang.Object r0 = X.AbstractC9777Gfy.A02(r0, r5)
            if (r0 != r4) goto L5d
            return r4
        L5a:
            X.Hwg.A00(r1)
        L5d:
            r0 = 0
            r6.encryptedPairingSession = r0
            com.facebook.aura.devices.pairing.LinkEncryptedSetupState r0 = com.facebook.aura.devices.pairing.LinkEncryptedSetupState.INACTIVE
            r6.linkEncryptedSetupState = r0
            com.facebook.aura.devices.pairing.LinkPairingConfirmationResult$Superseded r0 = com.facebook.aura.devices.pairing.LinkPairingConfirmationResult.Superseded.INSTANCE
            r6.completePairingConfirmation(r0)
            com.facebook.aura.common.ble.AuraBleConnection r0 = r6.connection
            r5.label = r3
            java.lang.Object r0 = r0.closeGatt(r5)
            if (r0 != r4) goto L23
            return r4
        L74:
            com.facebook.aura.devices.pairing.HatchDeviceBleManager$watchForUnexpectedDisconnect$1 r5 = new com.facebook.aura.devices.pairing.HatchDeviceBleManager$watchForUnexpectedDisconnect$1
            r5.<init>(r7)
            goto L12
        L7a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.pairing.HatchDeviceBleManager.watchForUnexpectedDisconnect(X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00a8 -> B:12:0x0035). Please report as a decompilation issue!!! */
    /* renamed from: writeChunked-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m729writeChunkedgIAlus(byte[] r21, X.HtJ<? super X.HsJ<kotlin.Unit>> r22) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.pairing.HatchDeviceBleManager.m729writeChunkedgIAlus(byte[], X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void writePayloadRaw$default(HatchDeviceBleManager hatchDeviceBleManager, String str, Function0 function0, Function0 function02, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        if ((i & 4) != 0) {
            function02 = null;
        }
        hatchDeviceBleManager.writePayloadRaw(str, function0, function02);
    }

    @Override // com.facebook.aura.devices.pairing.LinkEncryptedSetupBleTransport
    public Object awaitPairingConfirmation(HtJ<? super LinkPairingConfirmationResult> htJ) {
        InterfaceC10560Hsz<LinkPairingConfirmationResult> interfaceC10560Hsz = this.pairingConfirmation;
        if (interfaceC10560Hsz != null) {
            return C3cG.A0W(interfaceC10560Hsz, htJ);
        }
        return null;
    }

    public final boolean connectToDiscovered() {
        ScannedDevice scannedDevice = this.pendingScannedDevice;
        if (scannedDevice == null) {
            return false;
        }
        this.pendingScannedDevice = null;
        cancelConnectionJobs();
        this.connectionJob = AnonymousClass001.A11(new C116041(scannedDevice, null), this.scope);
        return true;
    }

    public final String getConnectedDeviceAddress() {
        return this.connectedDeviceAddress;
    }

    @Override // com.facebook.aura.devices.pairing.LinkEncryptedSetupBleTransport
    public void requestWiFiScan() {
        LinkEncryptedPairingSession linkEncryptedPairingSession = this.encryptedPairingSession;
        if (linkEncryptedPairingSession == null || this.linkEncryptedSetupState != LinkEncryptedSetupState.ESTABLISHED) {
            this.listener.onDebugLog("Link wifi_scan requires encrypted pairing");
            this.listener.onWiFiScanError();
            return;
        }
        String strA02 = HatchJsonKt.HatchJson.A02(linkEncryptedPairingSession.encryptWiFiScan(), LinkEncryptedRecordJson$$serializer.INSTANCE);
        this.listener.onWiFiScanStarted();
        startWiFiScanTimeout();
        writePayloadRaw(strA02, new C116071(), null);
    }

    public final void start() {
        BluetoothManager bluetoothManager;
        HoC hoC = this.connectionJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        HoC hoC2 = this.notificationsJob;
        if (hoC2 != null) {
            hoC2.A5w(null);
        }
        HoC hoC3 = this.disconnectWatcherJob;
        if (hoC3 != null) {
            hoC3.A5w(null);
        }
        cancelProvisioningTimeout();
        cancelWiFiScanTimeout();
        cancelChunkAssemblyTimeout();
        clearPendingDeviceInfoCallback();
        clearPendingPairingReadyCallback();
        clearPairingConfirmation();
        this.encryptedPairingSession = null;
        this.linkEncryptedSetupState = LinkEncryptedSetupState.INACTIVE;
        this.connectionJob = null;
        this.notificationsJob = null;
        this.disconnectWatcherJob = null;
        this.chunkBuffer.clear();
        this.expectedChunkTotal = 0;
        this.connectedHubName = null;
        this.connectedDeviceAddress = null;
        this.pendingScannedDevice = null;
        stopAccumulatingScan();
        this.discoveredDevices.clear();
        this.bluetoothGadgetAddresses.clear();
        this.linkSetupServiceAddresses.clear();
        this.visibleDevices = C0881AGi.A00;
        DiscoveredDeviceClassifier discoveredDeviceClassifier = this.discoveryClassifier;
        this.discoveryScan = discoveredDeviceClassifier != null ? discoveredDeviceClassifier.startScan(this.context) : null;
        this.hasStopped = false;
        Object systemService = this.context.getSystemService("bluetooth");
        BluetoothAdapter adapter = (!(systemService instanceof BluetoothManager) || (bluetoothManager = (BluetoothManager) systemService) == null) ? null : bluetoothManager.getAdapter();
        this.bluetoothAdapter = adapter;
        if (adapter == null || !adapter.isEnabled()) {
            this.listener.onBluetoothUnavailable();
            this.listener.onStateChanged(HatchDeviceBleState.BLUETOOTH_OFF, null, null);
            return;
        }
        this.listener.onDebugLog(FGI.A0U("Starting BLE scan for ", AbstractC06907md.A01(",", this.deviceFamily.getNamePrefixes(), null), " devices"));
        this.listener.onStateChanged(HatchDeviceBleState.SCANNING, null, null);
        if (this.targetName == null) {
            startAccumulatingScan();
        } else {
            this.connectionJob = AnonymousClass001.A11(new C116101(null), this.scope);
        }
    }

    public final void unpair() {
        LinkEncryptedPairingSession linkEncryptedPairingSession = this.encryptedPairingSession;
        if (linkEncryptedPairingSession == null || this.linkEncryptedSetupState != LinkEncryptedSetupState.ESTABLISHED) {
            this.listener.onDebugLog("Link unpair requires encrypted pairing");
            reportProvisioning(HatchDeviceProvisioningStatus.UNPAIR_FAILED);
        } else {
            writePayload(HatchJsonKt.HatchJson.A02(linkEncryptedPairingSession.encryptUnpair(), LinkEncryptedRecordJson$$serializer.INSTANCE), HatchDeviceProvisioningStatus.UNPAIR_FAILED, 120000L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    @Override // com.facebook.aura.devices.pairing.LinkEncryptedSetupBleTransport
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object writeEncryptedProvisionRecord(com.facebook.aura.devices.pairing.LinkEncryptedRecordJson r7, boolean r8, X.HtJ<? super java.lang.Boolean> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.facebook.aura.devices.pairing.HatchDeviceBleManager.C116171
            if (r0 == 0) goto L21
            r5 = r9
            com.facebook.aura.devices.pairing.HatchDeviceBleManager$writeEncryptedProvisionRecord$1 r5 = (com.facebook.aura.devices.pairing.HatchDeviceBleManager.C116171) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L2c
            if (r0 != r2) goto L27
            boolean r8 = r5.Z$0
            goto L62
        L21:
            com.facebook.aura.devices.pairing.HatchDeviceBleManager$writeEncryptedProvisionRecord$1 r5 = new com.facebook.aura.devices.pairing.HatchDeviceBleManager$writeEncryptedProvisionRecord$1
            r5.<init>(r9)
            goto L12
        L27:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2c:
            X.Hwg.A00(r1)
            com.facebook.aura.devices.pairing.LinkEncryptedSetupState r1 = r6.linkEncryptedSetupState
            com.facebook.aura.devices.pairing.LinkEncryptedSetupState r0 = com.facebook.aura.devices.pairing.LinkEncryptedSetupState.ESTABLISHED
            if (r1 == r0) goto L46
            com.facebook.aura.devices.pairing.HatchDeviceBleListener r1 = r6.listener
            java.lang.String r0 = "Link provision_v2 requires button-confirmed encrypted pairing"
            r1.onDebugLog(r0)
            com.facebook.aura.devices.pairing.HatchDeviceProvisioningStatus r0 = com.facebook.aura.devices.pairing.HatchDeviceProvisioningStatus.AUTH_FAILED
            r6.reportProvisioning(r0)
        L41:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L46:
            X.9sU r1 = com.facebook.aura.json.HatchJsonKt.HatchJson     // Catch: java.lang.Exception -> L85 java.util.concurrent.CancellationException -> L94
            com.facebook.aura.devices.pairing.LinkEncryptedRecordJson$$serializer r0 = com.facebook.aura.devices.pairing.LinkEncryptedRecordJson$$serializer.INSTANCE     // Catch: java.lang.Exception -> L85 java.util.concurrent.CancellationException -> L94
            java.lang.String r0 = r1.A02(r7, r0)     // Catch: java.lang.Exception -> L85 java.util.concurrent.CancellationException -> L94
            byte[] r1 = X.C3cG.A1S(r0)     // Catch: java.lang.Exception -> L85 java.util.concurrent.CancellationException -> L94
            r0 = 0
            r5.L$0 = r0     // Catch: java.lang.Exception -> L85 java.util.concurrent.CancellationException -> L94
            r5.L$1 = r0     // Catch: java.lang.Exception -> L85 java.util.concurrent.CancellationException -> L94
            r5.Z$0 = r8     // Catch: java.lang.Exception -> L85 java.util.concurrent.CancellationException -> L94
            r5.label = r2     // Catch: java.lang.Exception -> L85 java.util.concurrent.CancellationException -> L94
            java.lang.Object r0 = r6.m729writeChunkedgIAlus(r1, r5)     // Catch: java.lang.Exception -> L85 java.util.concurrent.CancellationException -> L94
            if (r0 != r4) goto L66
            goto L93
        L62:
            java.lang.Object r0 = X.AnonymousClass001.A0q(r1)     // Catch: java.lang.Exception -> L85 java.util.concurrent.CancellationException -> L94
        L66:
            boolean r0 = r0 instanceof X.C10571Hud     // Catch: java.lang.Exception -> L85 java.util.concurrent.CancellationException -> L94
            if (r0 == 0) goto L70
            com.facebook.aura.devices.pairing.HatchDeviceProvisioningStatus r0 = com.facebook.aura.devices.pairing.HatchDeviceProvisioningStatus.AUTH_FAILED     // Catch: java.lang.Exception -> L85 java.util.concurrent.CancellationException -> L94
            r6.reportProvisioning(r0)     // Catch: java.lang.Exception -> L85 java.util.concurrent.CancellationException -> L94
            goto L41
        L70:
            if (r8 == 0) goto L75
            com.facebook.aura.devices.pairing.HatchDeviceProvisioningStatus r2 = com.facebook.aura.devices.pairing.HatchDeviceProvisioningStatus.OTA_FAILED     // Catch: java.lang.Exception -> L85 java.util.concurrent.CancellationException -> L94
            goto L77
        L75:
            com.facebook.aura.devices.pairing.HatchDeviceProvisioningStatus r2 = com.facebook.aura.devices.pairing.HatchDeviceProvisioningStatus.AUTH_FAILED     // Catch: java.lang.Exception -> L85 java.util.concurrent.CancellationException -> L94
        L77:
            if (r8 == 0) goto L7d
            r0 = 180000(0x2bf20, double:8.8932E-319)
            goto L80
        L7d:
            r0 = 120000(0x1d4c0, double:5.9288E-319)
        L80:
            r6.startProvisioningTimeout(r2, r0)     // Catch: java.lang.Exception -> L85 java.util.concurrent.CancellationException -> L94
            r3 = 1
            goto L41
        L85:
            r2 = move-exception
            java.lang.String r1 = "Failed to write encrypted provision record"
            java.lang.String r0 = "HatchDeviceBleManager"
            X.CFK.A0A(r0, r1, r2)
            com.facebook.aura.devices.pairing.HatchDeviceProvisioningStatus r0 = com.facebook.aura.devices.pairing.HatchDeviceProvisioningStatus.AUTH_FAILED
            r6.reportProvisioning(r0)
            goto L41
        L93:
            return r4
        L94:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.pairing.HatchDeviceBleManager.writeEncryptedProvisionRecord(com.facebook.aura.devices.pairing.LinkEncryptedRecordJson, boolean, X.HtJ):java.lang.Object");
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean handlePairingConfirmationStatus(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            int r0 = r7.hashCode()
            r1 = 3
            r4 = 5
            r3 = 4
            r2 = 0
            r5 = 1
            switch(r0) {
                case -1375924674: goto Ld;
                case -1279102296: goto L2c;
                case 808775531: goto L46;
                case 1866083892: goto L49;
                default: goto Lc;
            }
        Lc:
            return r2
        Ld:
            java.lang.String r0 = "confirm_required"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto Lc
            com.facebook.aura.devices.pairing.LinkEncryptedSetupState r0 = r6.linkEncryptedSetupState
            int r0 = r0.ordinal()
            if (r0 == r1) goto L68
            com.facebook.aura.devices.pairing.HatchDeviceBleListener r1 = r6.listener
            if (r0 == r3) goto L29
            if (r0 == r4) goto L26
            java.lang.String r0 = "Ignoring unexpected Link pairing confirmation request"
            goto L61
        L26:
            java.lang.String r0 = "Ignoring late Link pairing confirmation request"
            goto L61
        L29:
            java.lang.String r0 = "Ignoring duplicate Link pairing confirmation request"
            goto L61
        L2c:
            java.lang.String r0 = "pairing_confirmed"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto Lc
            com.facebook.aura.devices.pairing.LinkEncryptedSetupState r0 = r6.linkEncryptedSetupState
            int r0 = r0.ordinal()
            if (r0 == r3) goto L79
            com.facebook.aura.devices.pairing.HatchDeviceBleListener r1 = r6.listener
            if (r0 == r4) goto L43
            java.lang.String r0 = "Ignoring unexpected Link pairing confirmation"
            goto L61
        L43:
            java.lang.String r0 = "Ignoring duplicate Link pairing confirmation"
            goto L61
        L46:
            java.lang.String r0 = "pairing_confirm_timeout"
            goto L4b
        L49:
            java.lang.String r0 = "error_pairing_confirm_timeout"
        L4b:
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto Lc
            com.facebook.aura.devices.pairing.LinkEncryptedSetupState r0 = r6.linkEncryptedSetupState
            int r0 = r0.ordinal()
            if (r0 == r1) goto L97
            if (r0 == r3) goto L97
            com.facebook.aura.devices.pairing.HatchDeviceBleListener r1 = r6.listener
            if (r0 == r4) goto L65
            java.lang.String r0 = "Ignoring unexpected Link pairing confirmation timeout"
        L61:
            r1.onDebugLog(r0)
            return r5
        L65:
            java.lang.String r0 = "Ignoring late Link pairing confirmation timeout"
            goto L61
        L68:
            com.facebook.aura.devices.pairing.LinkEncryptedSetupState r0 = com.facebook.aura.devices.pairing.LinkEncryptedSetupState.AWAITING_CONFIRMATION
            r6.linkEncryptedSetupState = r0
            com.facebook.aura.devices.pairing.HatchDeviceBleListener r1 = r6.listener
            java.lang.String r0 = "Link pairing confirmation required"
            r1.onDebugLog(r0)
            com.facebook.aura.devices.pairing.HatchDeviceBleListener r0 = r6.listener
            r0.onLinkPairingConfirmationRequired()
            return r5
        L79:
            com.facebook.aura.devices.pairing.LinkEncryptedSetupState r0 = com.facebook.aura.devices.pairing.LinkEncryptedSetupState.ESTABLISHED
            r6.linkEncryptedSetupState = r0
            com.facebook.aura.devices.pairing.HatchDeviceBleListener r1 = r6.listener
            java.lang.String r0 = "Link pairing confirmed"
            r1.onDebugLog(r0)
            com.facebook.aura.devices.pairing.LinkPairingConfirmation r1 = new com.facebook.aura.devices.pairing.LinkPairingConfirmation
            r1.<init>(r8)
            com.facebook.aura.devices.pairing.LinkPairingConfirmationResult$Confirmed r0 = new com.facebook.aura.devices.pairing.LinkPairingConfirmationResult$Confirmed
            r0.<init>(r1)
            r6.completePairingConfirmation(r0)
            com.facebook.aura.devices.pairing.HatchDeviceBleListener r0 = r6.listener
            r0.onLinkPairingConfirmed()
            return r5
        L97:
            com.facebook.aura.devices.pairing.LinkEncryptedPairingSession r0 = r6.encryptedPairingSession
            if (r0 == 0) goto La2
            boolean r0 = r0.getRequiresAppConfirmation()
            if (r0 != 0) goto La2
            r2 = 1
        La2:
            r0 = 0
            r6.encryptedPairingSession = r0
            com.facebook.aura.devices.pairing.LinkEncryptedSetupState r0 = com.facebook.aura.devices.pairing.LinkEncryptedSetupState.FAILED
            r6.linkEncryptedSetupState = r0
            com.facebook.aura.devices.pairing.HatchDeviceBleListener r1 = r6.listener
            java.lang.String r0 = "Link pairing confirmation timed out"
            r1.onDebugLog(r0)
            com.facebook.aura.devices.pairing.LinkPairingConfirmationResult$TimedOut r0 = com.facebook.aura.devices.pairing.LinkPairingConfirmationResult.TimedOut.INSTANCE
            r6.completePairingConfirmation(r0)
            com.facebook.aura.devices.pairing.HatchDeviceBleListener r0 = r6.listener
            r0.onLinkPairingConfirmationTimedOut(r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.pairing.HatchDeviceBleManager.handlePairingConfirmationStatus(java.lang.String, java.lang.String):boolean");
    }

    private final void handleWiFiScanResult(JsonObject jsonObject) {
        cancelWiFiScanTimeout();
        JsonArray jsonArrayOptJsonArray = JsonObjectExtensionsKt.optJsonArray(jsonObject, HatchSavedWifiNetworkStoreKt.KEY_NETWORKS);
        if (jsonArrayOptJsonArray == null) {
            this.listener.onWiFiScanError();
            return;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<JsonElement> it = jsonArrayOptJsonArray.iterator();
        while (it.hasNext()) {
            JsonObject jsonObjectAsJsonObjectOrNull = JsonObjectExtensionsKt.asJsonObjectOrNull(it.next());
            if (jsonObjectAsJsonObjectOrNull != null) {
                String strOptString = JsonObjectExtensionsKt.optString(jsonObjectAsJsonObjectOrNull, "ssid", "");
                if (strOptString.length() != 0) {
                    arrayListA0h.add(new HatchDeviceWiFiNetwork(strOptString, JsonObjectExtensionsKt.optInt(jsonObjectAsJsonObjectOrNull, "rssi", -100), securityLabel(jsonObjectAsJsonObjectOrNull), JsonObjectExtensionsKt.optInt(jsonObjectAsJsonObjectOrNull, "frequency", 0)));
                }
            }
        }
        this.listener.onWiFiScanResult(arrayListA0h);
    }

    private final HatchDeviceProvisioningStatus linkDeviceProvisioningStatusFor(String str) {
        String str2;
        switch (str.hashCode()) {
            case -2027244122:
                if (str.equals("ota_wifi_required")) {
                    return HatchDeviceProvisioningStatus.OTA_WIFI_REQUIRED;
                }
                return null;
            case -2009916380:
                str2 = "error_encryption_required";
                break;
            case -1734110093:
                if (str.equals("update_failed")) {
                    return HatchDeviceProvisioningStatus.UPDATE_FAILED;
                }
                return null;
            case -1697925151:
                str2 = "error_message_too_large";
                break;
            case -1414900190:
                if (str.equals("wifi_connecting")) {
                    return HatchDeviceProvisioningStatus.WIFI_CONNECTING;
                }
                return null;
            case -1319263741:
                if (str.equals("ota_starting")) {
                    return HatchDeviceProvisioningStatus.OTA_STARTING;
                }
                return null;
            case -1202706614:
                if (str.equals("auth_validating")) {
                    return HatchDeviceProvisioningStatus.AUTH_VALIDATING;
                }
                return null;
            case -1125806536:
                if (str.equals("error_operation_in_progress")) {
                    return HatchDeviceProvisioningStatus.DEVICE_BUSY;
                }
                return null;
            case -944011596:
                if (str.equals("auth_failed")) {
                    return HatchDeviceProvisioningStatus.AUTH_FAILED;
                }
                return null;
            case -878269862:
                if (str.equals("ota_applied")) {
                    return HatchDeviceProvisioningStatus.OTA_APPLIED;
                }
                return null;
            case -869078336:
                if (str.equals("ota_failed")) {
                    return HatchDeviceProvisioningStatus.OTA_FAILED;
                }
                return null;
            case -820309242:
                str2 = "error_pairing_auth_failed";
                break;
            case -670932071:
                if (str.equals("error_cvm_unsupported")) {
                    return HatchDeviceProvisioningStatus.CVM_UNSUPPORTED;
                }
                return null;
            case -646523949:
                if (str.equals(LinkDeviceKeyProvisioningKt.LINK_STATUS_AUTH_OK)) {
                    return HatchDeviceProvisioningStatus.AUTH_OK;
                }
                return null;
            case -597875476:
                str2 = "error_missing_credentials";
                break;
            case -544401054:
                str2 = "error_wifi_unsupported";
                break;
            case -541760350:
                str2 = "error_pairing_unavailable";
                break;
            case -482987196:
                str2 = "error_storage";
                break;
            case -442055804:
                if (str.equals("update_installed")) {
                    return HatchDeviceProvisioningStatus.UPDATE_INSTALLED;
                }
                return null;
            case -411969851:
                if (str.equals("vm_failed")) {
                    return HatchDeviceProvisioningStatus.VM_FAILED;
                }
                return null;
            case -168848670:
                str2 = "error_unknown_action";
                break;
            case -109176622:
                if (str.equals(PairsRepositoryKt.UNPAIRED)) {
                    return HatchDeviceProvisioningStatus.UNPAIRED;
                }
                return null;
            case -84839258:
                if (str.equals("vm_switching")) {
                    return HatchDeviceProvisioningStatus.VM_SWITCHING;
                }
                return null;
            case -4275197:
                if (str.equals("update_current")) {
                    return HatchDeviceProvisioningStatus.UPDATE_CURRENT;
                }
                return null;
            case 98347212:
                str2 = "error_invalid_command";
                break;
            case 108386723:
                if (str.equals(AvatarMediaMapperKt.READY)) {
                    return HatchDeviceProvisioningStatus.IDLE;
                }
                return null;
            case 112317540:
                if (str.equals("vm_ok")) {
                    return HatchDeviceProvisioningStatus.VM_OK;
                }
                return null;
            case 691538901:
                str2 = "error_invalid_device_key";
                break;
            case 828965008:
                if (str.equals("update_checking")) {
                    return HatchDeviceProvisioningStatus.UPDATE_CHECKING;
                }
                return null;
            case 1335353055:
                str2 = "error_pairing_decrypt";
                break;
            case 1802972425:
                if (str.equals("unpair_failed")) {
                    return HatchDeviceProvisioningStatus.UNPAIR_FAILED;
                }
                return null;
            case 1813295271:
                if (str.equals("wifi_failed")) {
                    return HatchDeviceProvisioningStatus.WIFI_FAILED;
                }
                return null;
            case 2032567903:
                if (str.equals("wifi_connected")) {
                    return HatchDeviceProvisioningStatus.WIFI_CONNECTED;
                }
                return null;
            case 2062409997:
                if (str.equals("ota_skipped")) {
                    return HatchDeviceProvisioningStatus.OTA_SKIPPED;
                }
                return null;
            case 2066585692:
                str2 = "error_pairing_invalid_hello";
                break;
            default:
                return null;
        }
        if (str.equals(str2)) {
            return HatchDeviceProvisioningStatus.DEVICE_ERROR;
        }
        return null;
    }

    private final void reportEncryptedDecryptFailure(LinkEncryptedDecryptResult.Failure failure) {
        String strEncryptedDecryptFailureMessage = encryptedDecryptFailureMessage(failure);
        CFK.A06(HatchDeviceBleManagerKt.TAG, strEncryptedDecryptFailureMessage);
        this.listener.onDebugLog(strEncryptedDecryptFailureMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reportProvisioning(HatchDeviceProvisioningStatus hatchDeviceProvisioningStatus) {
        if (hatchDeviceProvisioningStatus.isTerminal()) {
            cancelProvisioningTimeout();
        }
        this.listener.onProvisioningStatusChanged(hatchDeviceProvisioningStatus);
    }

    private final void startAccumulatingScan() {
        BluetoothLeScanner bluetoothLeScanner;
        ScannedDevice scannedDeviceFindAlreadyConnectedHatchDevice = findAlreadyConnectedHatchDevice();
        if (scannedDeviceFindAlreadyConnectedHatchDevice != null) {
            addDiscoveredDevice(scannedDeviceFindAlreadyConnectedHatchDevice);
        }
        ScanCallback scanCallback = new ScanCallback() { // from class: com.facebook.aura.devices.pairing.HatchDeviceBleManager$startAccumulatingScan$callback$1
            @Override // android.bluetooth.le.ScanCallback
            public void onScanResult(int i, ScanResult scanResult) {
                List<ParcelUuid> serviceUuids;
                BluetoothDevice device;
                String name;
                C7384Etj.A0Y(scanResult, 1);
                BluetoothDevice device2 = scanResult.getDevice();
                if (device2 != null) {
                    ScanRecord scanRecord = scanResult.getScanRecord();
                    if (scanRecord == null || (serviceUuids = scanRecord.getServiceUuids()) == null) {
                        serviceUuids = C0881AGi.A00;
                    }
                    if (serviceUuids.contains(HatchDeviceBleManagerKt.LINK_SETUP_SERVICE)) {
                        HatchDeviceBleManager hatchDeviceBleManager = this.this$0;
                        int i2 = HatchDeviceBleManager.$stable;
                        hatchDeviceBleManager.linkSetupServiceAddresses.add(device2.getAddress());
                    }
                    if (HatchDeviceBleAdvertisementKt.advertisesBluetoothGadget(scanResult.getScanRecord())) {
                        HatchDeviceBleManager hatchDeviceBleManager2 = this.this$0;
                        int i3 = HatchDeviceBleManager.$stable;
                        if (hatchDeviceBleManager2.includeBluetoothGadgets) {
                            hatchDeviceBleManager2.bluetoothGadgetAddresses.add(device2.getAddress());
                        }
                    }
                    ScanRecord scanRecord2 = scanResult.getScanRecord();
                    if ((scanRecord2 == null || (name = scanRecord2.getDeviceName()) == null) && ((device = scanResult.getDevice()) == null || (name = device.getName()) == null)) {
                        return;
                    }
                    HatchDeviceBleManager hatchDeviceBleManager3 = this.this$0;
                    int i4 = HatchDeviceBleManager.$stable;
                    if (hatchDeviceBleManager3.excludeNames.contains(name)) {
                        return;
                    }
                    HatchDeviceBleManager hatchDeviceBleManager4 = this.this$0;
                    boolean zMatchesDeviceName = HatchDeviceFamilyKt.matchesDeviceName(hatchDeviceBleManager4.deviceFamily, name, hatchDeviceBleManager4.includeCommunityDeviceNames, hatchDeviceBleManager4.supportsGadgets);
                    if (!(zMatchesDeviceName && this.this$0.includeWifiLinks) && this.this$0.discoveryScan == null) {
                        return;
                    }
                    ScanRecord scanRecord3 = scanResult.getScanRecord();
                    boolean zAdvertisesBluetoothGadget = HatchDeviceBleAdvertisementKt.advertisesBluetoothGadget(scanRecord3);
                    if (!zAdvertisesBluetoothGadget || this.this$0.includeBluetoothGadgets) {
                        boolean zA12 = AbstractC2159Azp.A12(C8j4.A0u(device2), this.this$0.setUpAgainAddress, true);
                        HatchDeviceBleManager hatchDeviceBleManager5 = this.this$0;
                        AnonymousClass001.A1J(new HatchDeviceBleManager$startAccumulatingScan$callback$1$onScanResult$1(hatchDeviceBleManager5, device2, name, scanRecord3, zMatchesDeviceName, zAdvertisesBluetoothGadget, zA12, scanResult, null), hatchDeviceBleManager5.scope);
                    }
                }
            }

            @Override // android.bluetooth.le.ScanCallback
            public void onScanFailed(int i) {
                HatchDeviceBleManager hatchDeviceBleManager = this.this$0;
                int i2 = HatchDeviceBleManager.$stable;
                hatchDeviceBleManager.listener.onDebugLog(FGI.A0H("Scan failed: errorCode=", i));
                HatchDeviceBleManager hatchDeviceBleManager2 = this.this$0;
                AnonymousClass001.A1J(new HatchDeviceBleManager$startAccumulatingScan$callback$1$onScanFailed$1(hatchDeviceBleManager2, null), hatchDeviceBleManager2.scope);
            }
        };
        this.multiScanCallback = scanCallback;
        ScanSettings scanSettingsBuild = new ScanSettings.Builder().setScanMode(2).build();
        try {
            BluetoothAdapter bluetoothAdapter = this.bluetoothAdapter;
            if (bluetoothAdapter != null && (bluetoothLeScanner = bluetoothAdapter.getBluetoothLeScanner()) != null) {
                bluetoothLeScanner.startScan((List<ScanFilter>) null, scanSettingsBuild, scanCallback);
            }
            HoC hoC = this.multiScanTimeoutJob;
            if (hoC != null) {
                hoC.A5w(null);
            }
            this.multiScanTimeoutJob = AnonymousClass001.A11(new C116112(null), this.scope);
        } catch (Exception e) {
            CFK.A0A(HatchDeviceBleManagerKt.TAG, "Error starting scan", e);
            this.multiScanCallback = null;
            if (this.hasStopped) {
                return;
            }
            this.listener.onBleScanError();
            this.listener.onStateChanged(HatchDeviceBleState.BLUETOOTH_OFF, null, null);
        }
    }

    private final void startWiFiScanTimeout() {
        cancelWiFiScanTimeout();
        this.wifiScanTimeoutJob = AnonymousClass001.A11(new C116141(null), this.scope);
    }

    private final void writePayload(String str, HatchDeviceProvisioningStatus hatchDeviceProvisioningStatus, long j) {
        byte[] bArrA1S = C3cG.A1S(str);
        AnonymousClass001.A1J(new C116181(bArrA1S, hatchDeviceProvisioningStatus, j, null), this.scope);
    }

    private final void writePayloadRaw(String str, Function0<Unit> function0, Function0<Unit> function02) {
        byte[] bArrA1S = C3cG.A1S(str);
        AnonymousClass001.A1J(new C116191(bArrA1S, function0, function02, null), this.scope);
    }

    @Override // com.facebook.aura.devices.pairing.LinkEncryptedSetupBleTransport
    public void sendPairingClientHello(LinkPairingClientHello linkPairingClientHello, G0U<? super LinkPairingReady, Unit> g0u) {
        AnonymousClass003.A0u(linkPairingClientHello, g0u);
        if (this.linkEncryptedSetupState != LinkEncryptedSetupState.AWAITING_PAIRING_READY) {
            g0u.invoke(null);
            return;
        }
        completePendingPairingReady(null);
        PendingBleCallback<LinkPairingReady> pendingBleCallback = new PendingBleCallback<>(g0u);
        this.pendingPairingReadyCallback.set(pendingBleCallback);
        C9sU c9sU = HatchJsonKt.HatchJson;
        int i = LinkPairingClientHello.$stable;
        writePayloadRaw(c9sU.A02(linkPairingClientHello, LinkPairingClientHello$$serializer.INSTANCE), new C116091(pendingBleCallback), null);
    }

    @Override // com.facebook.aura.devices.pairing.LinkEncryptedSetupBleTransport
    public void clearPendingDeviceInfoCallback() {
        PendingBleCallback pendingBleCallback = (PendingBleCallback) C8j3.A10(this.pendingDeviceInfoCallback);
        if (pendingBleCallback != null) {
            pendingBleCallback.cancel();
        }
    }

    @Override // com.facebook.aura.devices.pairing.LinkEncryptedSetupBleTransport
    public void clearPendingPairingReadyCallback() {
        PendingBleCallback pendingBleCallback = (PendingBleCallback) C8j3.A10(this.pendingPairingReadyCallback);
        if (pendingBleCallback != null) {
            pendingBleCallback.cancel();
        }
    }

    public HatchDeviceBleManager(Context context, String str, Set<String> set, HatchDeviceFamily hatchDeviceFamily, boolean z, DiscoveredDeviceClassifier discoveredDeviceClassifier, boolean z2, boolean z3, String str2, HatchDeviceBleListener hatchDeviceBleListener) {
        AnonymousClass005.A11(context, set, hatchDeviceFamily, 0);
        C7384Etj.A0Y(hatchDeviceBleListener, 9);
        this.context = context;
        this.targetName = str;
        this.excludeNames = set;
        this.deviceFamily = hatchDeviceFamily;
        this.includeCommunityDeviceNames = z;
        this.discoveryClassifier = discoveredDeviceClassifier;
        this.includeWifiLinks = z2;
        this.includeBluetoothGadgets = z3;
        this.setUpAgainAddress = str2;
        this.listener = hatchDeviceBleListener;
        HatchDeviceBleManager$bleLogger$1 hatchDeviceBleManager$bleLogger$1 = new HatchDeviceBleManager$bleLogger$1(this);
        this.bleLogger = hatchDeviceBleManager$bleLogger$1;
        this.connection = new AuraBleConnectionImpl(context, hatchDeviceBleManager$bleLogger$1, AuraBleConnectionImpl.AnonymousClass1.INSTANCE, A3q.A00, false);
        HatchDeviceBleManager$special$$inlined$CoroutineExceptionHandler$1 hatchDeviceBleManager$special$$inlined$CoroutineExceptionHandler$1 = new HatchDeviceBleManager$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key);
        this.exceptionHandler = hatchDeviceBleManager$special$$inlined$CoroutineExceptionHandler$1;
        this.scope = Hxb.A02(C78W.A02(new C8eO(null), AuraDispatchers.main).plus(hatchDeviceBleManager$special$$inlined$CoroutineExceptionHandler$1));
        this.pendingDeviceInfoCallback = new AtomicReference<>(null);
        this.pendingPairingReadyCallback = new AtomicReference<>(null);
        this.linkEncryptedSetupState = LinkEncryptedSetupState.INACTIVE;
        this.discoveredDevices = C3cG.A0j();
        ConcurrentHashMap.KeySetView keySetViewNewKeySet = ConcurrentHashMap.newKeySet();
        C7384Etj.A0U(keySetViewNewKeySet);
        this.bluetoothGadgetAddresses = keySetViewNewKeySet;
        ConcurrentHashMap.KeySetView keySetViewNewKeySet2 = ConcurrentHashMap.newKeySet();
        C7384Etj.A0U(keySetViewNewKeySet2);
        this.linkSetupServiceAddresses = keySetViewNewKeySet2;
        this.visibleDevices = C0881AGi.A00;
        this.supportsGadgets = discoveredDeviceClassifier != null;
        this.chunkBuffer = C3cG.A0j();
    }
}
