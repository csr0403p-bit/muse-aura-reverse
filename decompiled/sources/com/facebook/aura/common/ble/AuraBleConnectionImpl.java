package com.facebook.aura.common.ble;

import X.A3q;
import X.AbstractC7559F3s;
import X.AbstractC7606F5t;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.C06H;
import X.C22I;
import X.C3Em;
import X.C3cG;
import X.C3cI;
import X.C60O;
import X.C60P;
import X.C7384Etj;
import X.C79;
import X.C8j3;
import X.C8j4;
import X.C8j5;
import X.C9258GBl;
import X.C9290GCr;
import X.FGI;
import X.G0U;
import X.HtJ;
import X.HzP;
import X.InterfaceC10560Hsz;
import X.InterfaceC2261BLa;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import com.facebook.aura.common.ble.AuraGattEvent;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Deprecated;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class AuraBleConnectionImpl implements AuraBleConnection {
    public static final long BUSY_RETRY_DELAY_MS = 5;
    public static final Companion Companion = new Companion();
    public static final int DEFAULT_ATT_MTU = 23;
    public static final int MAX_BUSY_RETRIES = 200;
    public static final long OPERATION_TIMEOUT_MS = 5000;
    public final C3Em<AuraGattEvent> _gattEvents;
    public final C3Em<AuraBleData> _incomingData;
    public volatile int _negotiatedMtu;
    public final BluetoothAdapter adapter;
    public final BluetoothManager bluetoothManager;
    public final Context context;
    public volatile BluetoothGatt gatt;
    public final AuraBleConnectionImpl$gattCallback$1 gattCallback;
    public final C22I<AuraGattEvent> gattEvents;
    public final C22I<AuraBleData> incomingData;
    public final AuraBleLogger logger;
    public final InterfaceC2261BLa operationMutex;
    public final AtomicReference<InterfaceC10560Hsz<Integer>> pendingMtu;
    public final AtomicReference<InterfaceC10560Hsz<Boolean>> pendingOperation;
    public final AtomicReference<InterfaceC10560Hsz<Boolean>> pendingServiceDiscovery;
    public final Set<UUID> quietNotifyUuids;
    public final boolean retryBusyWrites;
    public final G0U<UUID, String> uuidNamer;

    @DebugMetadata(c = "com.facebook.aura.common.ble.AuraBleConnectionImpl", f = "AuraBleConnectionImpl.kt", l = {265}, m = "requestMtu", v = 2)
    /* renamed from: com.facebook.aura.common.ble.AuraBleConnectionImpl$requestMtu$1, reason: invalid class name and case insensitive filesystem */
    public final class C111391 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C111391(HtJ<? super C111391> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraBleConnectionImpl.this.requestMtu(0, this);
        }
    }

    @Override // com.facebook.aura.common.ble.AuraBleConnection
    public int getConnectionState(String str) {
        C7384Etj.A0Y(str, 0);
        try {
            return this.bluetoothManager.getConnectionState(this.adapter.getRemoteDevice(str), 7);
        } catch (Exception e) {
            this.logger.warning(FGI.A0M("getConnectionState failed: ", e.getMessage()));
            return 0;
        }
    }

    @Override // com.facebook.aura.common.ble.AuraBleConnection
    public boolean hasCharacteristic(UUID uuid, UUID uuid2) {
        boolean zA1a = AnonymousClass002.A1a(uuid, uuid2);
        if (findCharacteristic(uuid, uuid2) != null) {
            return zA1a;
        }
        return false;
    }

    @Override // com.facebook.aura.common.ble.AuraBleConnection
    public boolean hasService(UUID uuid) {
        C7384Etj.A0Y(uuid, 0);
        BluetoothGatt bluetoothGatt = this.gatt;
        return (bluetoothGatt == null || bluetoothGatt.getService(uuid) == null) ? false : true;
    }

    public /* synthetic */ AuraBleConnectionImpl(Context context, AuraBleLogger auraBleLogger, G0U g0u, Set set, boolean z, int i, C06H c06h) {
        this(context, auraBleLogger, (i & 4) != 0 ? AnonymousClass1.INSTANCE : g0u, (i & 8) != 0 ? A3q.A00 : set, C3cI.A1S(i, z));
    }

    private final BluetoothGattCharacteristic findCharacteristic(UUID uuid, UUID uuid2) {
        BluetoothGattService service;
        BluetoothGatt bluetoothGatt = this.gatt;
        if (bluetoothGatt == null || (service = bluetoothGatt.getService(uuid)) == null) {
            return null;
        }
        return service.getCharacteristic(uuid2);
    }

    @Override // com.facebook.aura.common.ble.AuraBleConnection
    public Object closeGatt(HtJ<? super Unit> htJ) {
        BluetoothGatt bluetoothGatt = this.gatt;
        if (bluetoothGatt != null) {
            this.logger.log("closeGatt()");
            try {
                bluetoothGatt.disconnect();
                bluetoothGatt.close();
            } catch (Exception e) {
                this.logger.error(FGI.A0M("closeGatt error: ", e.getMessage()), e);
            }
            this.gatt = null;
            this._negotiatedMtu = 23;
            C8j5.A0r(this.pendingOperation);
            C8j5.A0r(this.pendingServiceDiscovery);
            C8j5.A0r(this.pendingMtu);
        }
        return Unit.INSTANCE;
    }

    @Override // com.facebook.aura.common.ble.AuraBleConnection
    public C22I<AuraGattEvent> getGattEvents() {
        return this.gattEvents;
    }

    @Override // com.facebook.aura.common.ble.AuraBleConnection
    public C22I<AuraBleData> getIncomingData() {
        return this.incomingData;
    }

    @Override // com.facebook.aura.common.ble.AuraBleConnection
    public int getNegotiatedMtu() {
        return this._negotiatedMtu;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007e A[Catch: Exception -> 0x00ac, TryCatch #0 {Exception -> 0x00ac, blocks: (B:24:0x0075, B:25:0x0078, B:27:0x007e, B:29:0x0085, B:31:0x00a2, B:33:0x00a9, B:19:0x0055, B:21:0x0060), top: B:38:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a2 A[Catch: Exception -> 0x00ac, TryCatch #0 {Exception -> 0x00ac, blocks: (B:24:0x0075, B:25:0x0078, B:27:0x007e, B:29:0x0085, B:31:0x00a2, B:33:0x00a9, B:19:0x0055, B:21:0x0060), top: B:38:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a9 A[Catch: Exception -> 0x00ac, TryCatch #0 {Exception -> 0x00ac, blocks: (B:24:0x0075, B:25:0x0078, B:27:0x007e, B:29:0x0085, B:31:0x00a2, B:33:0x00a9, B:19:0x0055, B:21:0x0060), top: B:38:0x001c }] */
    @Override // com.facebook.aura.common.ble.AuraBleConnection
    /* renamed from: openGatt-BWLJW6A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo361openGattBWLJW6A(java.lang.String r8, boolean r9, boolean r10, X.HtJ<? super X.HsJ<kotlin.Unit>> r11) {
        /*
            r7 = this;
            java.lang.String r5 = "connectGatt(autoConnect="
            boolean r0 = r11 instanceof com.facebook.aura.common.ble.AuraBleConnectionImpl$openGatt$1
            if (r0 == 0) goto L2d
            r2 = r11
            com.facebook.aura.common.ble.AuraBleConnectionImpl$openGatt$1 r2 = (com.facebook.aura.common.ble.AuraBleConnectionImpl$openGatt$1) r2
            int r3 = r2.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L2d
            int r3 = r3 - r1
            r2.label = r3
        L14:
            java.lang.Object r0 = r2.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r4 = r2.label
            r1 = 1
            r3 = 2
            if (r4 == 0) goto L43
            if (r4 == r1) goto L38
            if (r4 != r3) goto L33
            boolean r9 = r2.Z$0
            java.lang.Object r4 = r2.L$1
            android.bluetooth.BluetoothDevice r4 = (android.bluetooth.BluetoothDevice) r4
            java.lang.Object r8 = r2.L$0
            java.lang.String r8 = (java.lang.String) r8
            goto L75
        L2d:
            com.facebook.aura.common.ble.AuraBleConnectionImpl$openGatt$1 r2 = new com.facebook.aura.common.ble.AuraBleConnectionImpl$openGatt$1
            r2.<init>(r7, r11)
            goto L14
        L33:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L38:
            boolean r10 = r2.Z$1
            boolean r9 = r2.Z$0
            java.lang.Object r1 = r2.L$0
            java.lang.String r8 = X.C3cG.A0d(r1, r0)
            goto L55
        L43:
            X.Hwg.A00(r0)
            r2.L$0 = r8
            r2.Z$0 = r9
            r2.Z$1 = r10
            r2.label = r1
            java.lang.Object r0 = r7.closeGatt(r2)
            if (r0 != r6) goto L55
            return r6
        L55:
            android.bluetooth.BluetoothAdapter r0 = r7.adapter     // Catch: java.lang.Exception -> Lac
            android.bluetooth.BluetoothDevice r4 = r0.getRemoteDevice(r8)     // Catch: java.lang.Exception -> Lac
            X.C7384Etj.A0U(r4)     // Catch: java.lang.Exception -> Lac
            if (r10 == 0) goto L85
            android.content.Context r1 = r7.context     // Catch: java.lang.Exception -> Lac
            com.facebook.aura.common.ble.AuraBleLogger r0 = r7.logger     // Catch: java.lang.Exception -> Lac
            r2.L$0 = r8     // Catch: java.lang.Exception -> Lac
            r2.L$1 = r4     // Catch: java.lang.Exception -> Lac
            r2.Z$0 = r9     // Catch: java.lang.Exception -> Lac
            r2.Z$1 = r10     // Catch: java.lang.Exception -> Lac
            r2.label = r3     // Catch: java.lang.Exception -> Lac
            java.lang.Object r0 = com.facebook.aura.common.ble.AuraBondHelperKt.ensureBonded(r1, r4, r0, r2)     // Catch: java.lang.Exception -> Lac
            if (r0 != r6) goto L78
            return r6
        L75:
            X.Hwg.A00(r0)     // Catch: java.lang.Exception -> Lac
        L78:
            boolean r0 = X.AnonymousClass001.A1X(r0)     // Catch: java.lang.Exception -> Lac
            if (r0 != 0) goto L85
            java.lang.String r0 = "Bonding failed or cancelled"
            X.Hud r0 = X.C8j4.A1A(r0)     // Catch: java.lang.Exception -> Lac
            return r0
        L85:
            com.facebook.aura.common.ble.AuraBleLogger r2 = r7.logger     // Catch: java.lang.Exception -> Lac
            java.lang.StringBuilder r1 = X.C60O.A10(r5, r9)     // Catch: java.lang.Exception -> Lac
            java.lang.String r0 = ") \u2192 "
            java.lang.String r0 = X.C60P.A1M(r0, r8, r1)     // Catch: java.lang.Exception -> Lac
            r2.log(r0)     // Catch: java.lang.Exception -> Lac
            android.content.Context r1 = r7.context     // Catch: java.lang.Exception -> Lac
            com.facebook.aura.common.ble.AuraBleConnectionImpl$gattCallback$1 r0 = r7.gattCallback     // Catch: java.lang.Exception -> Lac
            android.bluetooth.BluetoothGatt r0 = r4.connectGatt(r1, r9, r0, r3)     // Catch: java.lang.Exception -> Lac
            r7.gatt = r0     // Catch: java.lang.Exception -> Lac
            android.bluetooth.BluetoothGatt r0 = r7.gatt     // Catch: java.lang.Exception -> Lac
            if (r0 != 0) goto La9
            java.lang.String r0 = "connectGatt returned null"
            X.Hud r0 = X.C8j4.A1A(r0)     // Catch: java.lang.Exception -> Lac
            return r0
        La9:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Exception -> Lac
            return r0
        Lac:
            r3 = move-exception
            com.facebook.aura.common.ble.AuraBleLogger r2 = r7.logger
            java.lang.String r1 = r3.getMessage()
            java.lang.String r0 = "openGatt failed: "
            X.Hud r0 = X.C8j4.A18(r2, r0, r1, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.common.ble.AuraBleConnectionImpl.mo361openGattBWLJW6A(java.lang.String, boolean, boolean, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c9 A[Catch: Exception -> 0x00d5, all -> 0x00ed, TRY_LEAVE, TryCatch #2 {Exception -> 0x00d5, blocks: (B:37:0x00b9, B:38:0x00bc, B:40:0x00c0, B:42:0x00c6, B:43:0x00c9), top: B:57:0x00b9 }] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.BLa] */
    /* JADX WARN: Type inference failed for: r3v10, types: [X.BLa] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.BLa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4 */
    @Override // com.facebook.aura.common.ble.AuraBleConnection
    /* renamed from: readCharacteristic-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo362readCharacteristic0E7RQCE(java.util.UUID r11, java.util.UUID r12, X.HtJ<? super X.HsJ<kotlin.Unit>> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.common.ble.AuraBleConnectionImpl.mo362readCharacteristic0E7RQCE(java.util.UUID, java.util.UUID, X.HtJ):java.lang.Object");
    }

    @Override // com.facebook.aura.common.ble.AuraBleConnection
    public void requestBalancedConnectionPriority() {
        BluetoothGatt bluetoothGatt = this.gatt;
        if (bluetoothGatt != null) {
            bluetoothGatt.requestConnectionPriority(0);
        }
    }

    @Override // com.facebook.aura.common.ble.AuraBleConnection
    public void requestHighConnectionPriority() {
        BluetoothGatt bluetoothGatt = this.gatt;
        if (bluetoothGatt != null) {
            bluetoothGatt.requestConnectionPriority(1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    @Override // com.facebook.aura.common.ble.AuraBleConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object requestMtu(int r9, X.HtJ<? super java.lang.Integer> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.facebook.aura.common.ble.AuraBleConnectionImpl.C111391
            if (r0 == 0) goto L21
            r7 = r10
            com.facebook.aura.common.ble.AuraBleConnectionImpl$requestMtu$1 r7 = (com.facebook.aura.common.ble.AuraBleConnectionImpl.C111391) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r1 = r7.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r3 = 1
            r5 = 23
            r4 = 0
            if (r0 == 0) goto L2c
            if (r0 != r3) goto L27
            goto L61
        L21:
            com.facebook.aura.common.ble.AuraBleConnectionImpl$requestMtu$1 r7 = new com.facebook.aura.common.ble.AuraBleConnectionImpl$requestMtu$1
            r7.<init>(r10)
            goto L12
        L27:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2c:
            X.Hwg.A00(r1)
            android.bluetooth.BluetoothGatt r2 = r8.gatt
            if (r2 == 0) goto L8e
            X.GAt r1 = new X.GAt     // Catch: java.lang.Exception -> L79
            r1.<init>(r4)     // Catch: java.lang.Exception -> L79
            java.util.concurrent.atomic.AtomicReference<X.Hsz<java.lang.Integer>> r0 = r8.pendingMtu     // Catch: java.lang.Exception -> L79
            r0.set(r1)     // Catch: java.lang.Exception -> L79
            boolean r0 = r2.requestMtu(r9)     // Catch: java.lang.Exception -> L79
            if (r0 != 0) goto L4d
            java.util.concurrent.atomic.AtomicReference<X.Hsz<java.lang.Integer>> r0 = r8.pendingMtu     // Catch: java.lang.Exception -> L79
            r0.getAndSet(r4)     // Catch: java.lang.Exception -> L79
            java.lang.Integer r6 = X.C3cG.A0R(r5)     // Catch: java.lang.Exception -> L79
            return r6
        L4d:
            com.facebook.aura.common.ble.AuraBleConnectionImpl$requestMtu$result$1 r0 = new com.facebook.aura.common.ble.AuraBleConnectionImpl$requestMtu$result$1     // Catch: java.lang.Exception -> L79
            r0.<init>(r1, r4)     // Catch: java.lang.Exception -> L79
            r7.L$0 = r4     // Catch: java.lang.Exception -> L79
            r7.L$1 = r4     // Catch: java.lang.Exception -> L79
            r7.I$0 = r9     // Catch: java.lang.Exception -> L79
            r7.label = r3     // Catch: java.lang.Exception -> L79
            java.lang.Object r1 = X.C8j4.A0s(r0, r7)     // Catch: java.lang.Exception -> L79
            if (r1 != r6) goto L64
            return r6
        L61:
            X.Hwg.A00(r1)     // Catch: java.lang.Exception -> L79
        L64:
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Exception -> L79
            if (r1 == 0) goto L6f
            int r0 = r1.intValue()     // Catch: java.lang.Exception -> L79
        L6c:
            r8._negotiatedMtu = r0     // Catch: java.lang.Exception -> L79
            goto L77
        L6f:
            java.util.concurrent.atomic.AtomicReference<X.Hsz<java.lang.Integer>> r0 = r8.pendingMtu     // Catch: java.lang.Exception -> L79
            r0.set(r4)     // Catch: java.lang.Exception -> L79
            r0 = 23
            goto L6c
        L77:
            r5 = r0
            goto L8e
        L79:
            r3 = move-exception
            java.util.concurrent.atomic.AtomicReference<X.Hsz<java.lang.Integer>> r0 = r8.pendingMtu
            r0.set(r4)
            com.facebook.aura.common.ble.AuraBleLogger r2 = r8.logger
            java.lang.String r1 = r3.getMessage()
            java.lang.String r0 = "MTU request failed: "
            java.lang.String r0 = X.FGI.A0M(r0, r1)
            r2.error(r0, r3)
        L8e:
            java.lang.Integer r6 = X.C3cG.A0R(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.common.ble.AuraBleConnectionImpl.requestMtu(int, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0111 A[Catch: Exception -> 0x011d, all -> 0x0135, TRY_LEAVE, TryCatch #2 {Exception -> 0x011d, blocks: (B:50:0x0101, B:51:0x0104, B:53:0x0108, B:55:0x010e, B:56:0x0111), top: B:70:0x0101 }] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.BLa] */
    /* JADX WARN: Type inference failed for: r3v10, types: [X.BLa] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.BLa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4 */
    @Override // com.facebook.aura.common.ble.AuraBleConnection
    /* renamed from: setNotificationsEnabled-BWLJW6A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo363setNotificationsEnabledBWLJW6A(java.util.UUID r12, java.util.UUID r13, boolean r14, X.HtJ<? super X.HsJ<kotlin.Unit>> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.common.ble.AuraBleConnectionImpl.mo363setNotificationsEnabledBWLJW6A(java.util.UUID, java.util.UUID, boolean, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    @Override // com.facebook.aura.common.ble.AuraBleConnection
    /* renamed from: triggerServiceDiscovery-IoAF18A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo364triggerServiceDiscoveryIoAF18A(X.HtJ<? super X.HsJ<kotlin.Unit>> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.facebook.aura.common.ble.AuraBleConnectionImpl$triggerServiceDiscovery$1
            if (r0 == 0) goto L1f
            r6 = r8
            com.facebook.aura.common.ble.AuraBleConnectionImpl$triggerServiceDiscovery$1 r6 = (com.facebook.aura.common.ble.AuraBleConnectionImpl$triggerServiceDiscovery$1) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1f
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L2a
            if (r0 != r3) goto L25
            goto L6d
        L1f:
            com.facebook.aura.common.ble.AuraBleConnectionImpl$triggerServiceDiscovery$1 r6 = new com.facebook.aura.common.ble.AuraBleConnectionImpl$triggerServiceDiscovery$1
            r6.<init>(r7, r8)
            goto L12
        L25:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2a:
            X.Hwg.A00(r1)
            android.bluetooth.BluetoothGatt r2 = r7.gatt
            if (r2 != 0) goto L38
            java.lang.String r0 = "Not connected"
            X.Hud r0 = X.C8j4.A1A(r0)
            return r0
        L38:
            com.facebook.aura.common.ble.AuraBleLogger r1 = r7.logger
            java.lang.String r0 = "Discovering services\u2026"
            r1.log(r0)
            X.GAt r1 = new X.GAt     // Catch: java.lang.Exception -> L89
            r1.<init>(r4)     // Catch: java.lang.Exception -> L89
            java.util.concurrent.atomic.AtomicReference<X.Hsz<java.lang.Boolean>> r0 = r7.pendingServiceDiscovery     // Catch: java.lang.Exception -> L89
            r0.set(r1)     // Catch: java.lang.Exception -> L89
            boolean r0 = r2.discoverServices()     // Catch: java.lang.Exception -> L89
            if (r0 != 0) goto L5b
            java.util.concurrent.atomic.AtomicReference<X.Hsz<java.lang.Boolean>> r0 = r7.pendingServiceDiscovery     // Catch: java.lang.Exception -> L89
            r0.getAndSet(r4)     // Catch: java.lang.Exception -> L89
            java.lang.String r0 = "Service discovery initiation failed"
            X.Hud r0 = X.C8j4.A1A(r0)     // Catch: java.lang.Exception -> L89
            return r0
        L5b:
            com.facebook.aura.common.ble.AuraBleConnectionImpl$triggerServiceDiscovery$success$1 r0 = new com.facebook.aura.common.ble.AuraBleConnectionImpl$triggerServiceDiscovery$success$1     // Catch: java.lang.Exception -> L89
            r0.<init>(r1, r4)     // Catch: java.lang.Exception -> L89
            r6.L$0 = r4     // Catch: java.lang.Exception -> L89
            r6.L$1 = r4     // Catch: java.lang.Exception -> L89
            r6.label = r3     // Catch: java.lang.Exception -> L89
            java.lang.Object r1 = X.C8j4.A0s(r0, r6)     // Catch: java.lang.Exception -> L89
            if (r1 != r5) goto L70
            return r5
        L6d:
            X.Hwg.A00(r1)     // Catch: java.lang.Exception -> L89
        L70:
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Exception -> L89
            if (r1 == 0) goto L7d
            boolean r0 = r1.booleanValue()     // Catch: java.lang.Exception -> L89
            if (r0 == 0) goto L7d
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Exception -> L89
            return r0
        L7d:
            java.util.concurrent.atomic.AtomicReference<X.Hsz<java.lang.Boolean>> r0 = r7.pendingServiceDiscovery     // Catch: java.lang.Exception -> L89
            r0.set(r4)     // Catch: java.lang.Exception -> L89
            java.lang.String r0 = "Service discovery failed or timed out"
            X.Hud r0 = X.C8j4.A1A(r0)     // Catch: java.lang.Exception -> L89
            return r0
        L89:
            r3 = move-exception
            java.util.concurrent.atomic.AtomicReference<X.Hsz<java.lang.Boolean>> r0 = r7.pendingServiceDiscovery
            r0.set(r4)
            com.facebook.aura.common.ble.AuraBleLogger r2 = r7.logger
            java.lang.String r1 = r3.getMessage()
            java.lang.String r0 = "Service discovery failed: "
            X.Hud r0 = X.C8j4.A18(r2, r0, r1, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.common.ble.AuraBleConnectionImpl.mo364triggerServiceDiscoveryIoAF18A(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0124 A[Catch: Exception -> 0x0176, all -> 0x0191, TryCatch #0 {all -> 0x0191, blocks: (B:59:0x0148, B:61:0x014c, B:63:0x0152, B:64:0x0155, B:73:0x017c, B:46:0x00e5, B:52:0x00fa, B:65:0x0161, B:56:0x0124), top: B:83:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0155 A[Catch: Exception -> 0x0176, all -> 0x0191, TryCatch #0 {all -> 0x0191, blocks: (B:59:0x0148, B:61:0x014c, B:63:0x0152, B:64:0x0155, B:73:0x017c, B:46:0x00e5, B:52:0x00fa, B:65:0x0161, B:56:0x0124), top: B:83:0x002a }] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.BLa] */
    /* JADX WARN: Type inference failed for: r4v11, types: [X.BLa] */
    /* JADX WARN: Type inference failed for: r4v13, types: [X.BLa] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v3, types: [X.BLa] */
    /* JADX WARN: Type inference failed for: r4v4, types: [X.BLa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // com.facebook.aura.common.ble.AuraBleConnection
    /* renamed from: writeCharacteristic-yxL6bBk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo365writeCharacteristicyxL6bBk(java.util.UUID r16, java.util.UUID r17, byte[] r18, boolean r19, X.HtJ<? super X.HsJ<kotlin.Unit>> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.common.ble.AuraBleConnectionImpl.mo365writeCharacteristicyxL6bBk(java.util.UUID, java.util.UUID, byte[], boolean, X.HtJ):java.lang.Object");
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String describeProperties(int i) {
        StringBuilder sbA0w = C60O.A0w();
        if ((i & 2) != 0) {
            sbA0w.append("R");
        }
        if ((i & 8) != 0) {
            sbA0w.append("W");
        }
        if ((i & 4) != 0) {
            sbA0w.append("w");
        }
        if ((i & 16) != 0) {
            sbA0w.append("N");
        }
        if ((i & 32) != 0) {
            sbA0w.append("I");
        }
        return sbA0w.toString();
    }

    /* renamed from: com.facebook.aura.common.ble.AuraBleConnectionImpl$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<UUID, String> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ String invoke(UUID uuid) {
            C7384Etj.A0Y(uuid, 0);
            return uuid.toString();
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String invoke2(UUID uuid) {
            C7384Etj.A0Y(uuid, 0);
            return uuid.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.facebook.aura.common.ble.AuraBleConnectionImpl$gattCallback$1] */
    public AuraBleConnectionImpl(Context context, AuraBleLogger auraBleLogger, G0U<? super UUID, String> g0u, Set<UUID> set, boolean z) {
        C7384Etj.A0Y(context, 0);
        AnonymousClass005.A11(auraBleLogger, g0u, set, 1);
        this.context = context;
        this.logger = auraBleLogger;
        this.uuidNamer = g0u;
        this.quietNotifyUuids = set;
        this.retryBusyWrites = z;
        Object systemService = context.getSystemService("bluetooth");
        C7384Etj.A0Z(systemService, "null cannot be cast to non-null type android.bluetooth.BluetoothManager");
        BluetoothManager bluetoothManager = (BluetoothManager) systemService;
        this.bluetoothManager = bluetoothManager;
        BluetoothAdapter adapter = bluetoothManager.getAdapter();
        C7384Etj.A0U(adapter);
        this.adapter = adapter;
        Integer num = C79.A00;
        C9290GCr c9290GCr = new C9290GCr(num, 0, 16);
        this._gattEvents = c9290GCr;
        this.gattEvents = c9290GCr;
        C9290GCr c9290GCr2 = new C9290GCr(num, 0, 64);
        this._incomingData = c9290GCr2;
        this.incomingData = c9290GCr2;
        this._negotiatedMtu = 23;
        this.operationMutex = new C9258GBl();
        this.pendingOperation = new AtomicReference<>();
        this.pendingServiceDiscovery = new AtomicReference<>();
        this.pendingMtu = new AtomicReference<>();
        this.gattCallback = new BluetoothGattCallback() { // from class: com.facebook.aura.common.ble.AuraBleConnectionImpl$gattCallback$1
            @Override // android.bluetooth.BluetoothGattCallback
            public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
                C3Em<AuraGattEvent> c3Em;
                AuraGattEvent connected;
                C7384Etj.A0Y(bluetoothGatt, 0);
                this.this$0.logger.debug(FGI.A0T("GATT connection state: status=", ", newState=", i, i2));
                if (i2 == 0) {
                    this.this$0.logger.log("GATT disconnected");
                    InterfaceC10560Hsz<Boolean> andSet = this.this$0.pendingOperation.getAndSet(null);
                    if (andSet != null) {
                        C8j4.A1S(false, andSet);
                    }
                    InterfaceC10560Hsz<Boolean> andSet2 = this.this$0.pendingServiceDiscovery.getAndSet(null);
                    if (andSet2 != null) {
                        C8j4.A1S(false, andSet2);
                    }
                    InterfaceC10560Hsz<Integer> andSet3 = this.this$0.pendingMtu.getAndSet(null);
                    if (andSet3 != null) {
                        C3cG.A1F(andSet3, 23);
                    }
                    c3Em = this.this$0._gattEvents;
                    connected = AuraGattEvent.Disconnected.INSTANCE;
                } else {
                    if (i2 != 2) {
                        return;
                    }
                    this.this$0.logger.log(FGI.A0M("GATT connected: ", bluetoothGatt.getDevice().getAddress()));
                    c3Em = this.this$0._gattEvents;
                    connected = new AuraGattEvent.Connected(C8j4.A0u(bluetoothGatt.getDevice()), bluetoothGatt.getDevice().getName());
                }
                c3Em.AhV(connected);
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
                C7384Etj.A0Y(bluetoothGatt, 0);
                boolean zA1M = AnonymousClass002.A1M(i);
                AuraBleLogger auraBleLogger2 = this.this$0.logger;
                int size = bluetoothGatt.getServices().size();
                auraBleLogger2.log(C60P.A1O(AbstractC7606F5t.A00(6), C60O.A10("Services discovered: success=", zA1M), size));
                if (zA1M) {
                    List<BluetoothGattService> services = bluetoothGatt.getServices();
                    C7384Etj.A0U(services);
                    AuraBleConnectionImpl auraBleConnectionImpl = this.this$0;
                    for (BluetoothGattService bluetoothGattService : services) {
                        AuraBleLogger auraBleLogger3 = auraBleConnectionImpl.logger;
                        G0U<UUID, String> g0u2 = auraBleConnectionImpl.uuidNamer;
                        UUID uuid = bluetoothGattService.getUuid();
                        C7384Etj.A0U(uuid);
                        auraBleLogger3.debug(AnonymousClass007.A0a("  Service: ", g0u2.invoke(uuid)));
                        List<BluetoothGattCharacteristic> characteristics = bluetoothGattService.getCharacteristics();
                        C7384Etj.A0U(characteristics);
                        for (BluetoothGattCharacteristic bluetoothGattCharacteristic : characteristics) {
                            String strDescribeProperties = auraBleConnectionImpl.describeProperties(bluetoothGattCharacteristic.getProperties());
                            AuraBleLogger auraBleLogger4 = auraBleConnectionImpl.logger;
                            G0U<UUID, String> g0u3 = auraBleConnectionImpl.uuidNamer;
                            UUID uuid2 = bluetoothGattCharacteristic.getUuid();
                            C7384Etj.A0U(uuid2);
                            StringBuilder sbA0f = C3cG.A0f(g0u3.invoke(uuid2), "    Characteristic: ");
                            sbA0f.append(" [");
                            sbA0f.append(strDescribeProperties);
                            auraBleLogger4.debug(AnonymousClass001.A0v("]", sbA0f));
                        }
                    }
                }
                InterfaceC10560Hsz interfaceC10560Hsz = (InterfaceC10560Hsz) C8j3.A10(this.this$0.pendingServiceDiscovery);
                if (interfaceC10560Hsz != null) {
                    C8j4.A1S(zA1M, interfaceC10560Hsz);
                }
                this.this$0._gattEvents.AhV(new AuraGattEvent.ServicesDiscovered(zA1M));
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
                InterfaceC10560Hsz interfaceC10560Hsz = (InterfaceC10560Hsz) C8j3.A10(this.this$0.pendingOperation);
                if (interfaceC10560Hsz != null) {
                    C8j4.A1S(AnonymousClass002.A1M(i), interfaceC10560Hsz);
                }
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
                InterfaceC10560Hsz interfaceC10560Hsz = (InterfaceC10560Hsz) C8j3.A10(this.this$0.pendingOperation);
                if (interfaceC10560Hsz != null) {
                    C8j4.A1S(AnonymousClass002.A1M(i), interfaceC10560Hsz);
                }
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
                UUID uuid;
                AnonymousClass003.A0x(bluetoothGattCharacteristic, bArr);
                if (!this.this$0.quietNotifyUuids.contains(bluetoothGattCharacteristic.getUuid())) {
                    AuraBleConnectionImpl auraBleConnectionImpl = this.this$0;
                    AuraBleLogger auraBleLogger2 = auraBleConnectionImpl.logger;
                    G0U<UUID, String> g0u2 = auraBleConnectionImpl.uuidNamer;
                    UUID uuid2 = bluetoothGattCharacteristic.getUuid();
                    C7384Etj.A0U(uuid2);
                    String strInvoke = g0u2.invoke(uuid2);
                    int length = bArr.length;
                    StringBuilder sbA0f = C3cG.A0f(strInvoke, "Notification from ");
                    sbA0f.append(": ");
                    sbA0f.append(length);
                    auraBleLogger2.debug(AnonymousClass001.A0v(" bytes", sbA0f));
                }
                C3Em<AuraBleData> c3Em = this.this$0._incomingData;
                BluetoothGattService service = bluetoothGattCharacteristic.getService();
                if (service == null || (uuid = service.getUuid()) == null) {
                    uuid = new UUID(0L, 0L);
                }
                UUID uuid3 = bluetoothGattCharacteristic.getUuid();
                C7384Etj.A0U(uuid3);
                if (c3Em.AhV(new AuraBleData(uuid, uuid3, bArr))) {
                    return;
                }
                AuraBleConnectionImpl auraBleConnectionImpl2 = this.this$0;
                AuraBleLogger auraBleLogger3 = auraBleConnectionImpl2.logger;
                int length2 = bArr.length;
                G0U<UUID, String> g0u3 = auraBleConnectionImpl2.uuidNamer;
                UUID uuid4 = bluetoothGattCharacteristic.getUuid();
                C7384Etj.A0U(uuid4);
                auraBleLogger3.warning(AnonymousClass006.A0y(g0u3.invoke(uuid4), " bytes from ", C60O.A0y("BLE data buffer full, dropped ", length2)));
            }

            @Override // android.bluetooth.BluetoothGattCallback
            @Deprecated(message = "Deprecated in API 33")
            public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
                int iA1b = AnonymousClass004.A1b(bluetoothGatt, bluetoothGattCharacteristic);
                byte[] value = bluetoothGattCharacteristic.getValue();
                if (value == null) {
                    value = new byte[iA1b];
                }
                onCharacteristicRead(bluetoothGatt, bluetoothGattCharacteristic, value, i);
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onMtuChanged(BluetoothGatt bluetoothGatt, int i, int i2) {
                boolean zA1M = AnonymousClass002.A1M(i2);
                this.this$0.logger.log(C60P.A1P(", success=", C60O.A0y("MTU changed: mtu=", i), zA1M));
                InterfaceC10560Hsz interfaceC10560Hsz = (InterfaceC10560Hsz) C8j3.A10(this.this$0.pendingMtu);
                if (interfaceC10560Hsz != null) {
                    if (!zA1M) {
                        i = 23;
                    }
                    C3cG.A1F(interfaceC10560Hsz, Integer.valueOf(i));
                }
            }

            @Override // android.bluetooth.BluetoothGattCallback
            @Deprecated(message = "Deprecated in API 33")
            public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
                AnonymousClass003.A0u(bluetoothGatt, bluetoothGattCharacteristic);
                byte[] value = bluetoothGattCharacteristic.getValue();
                if (value != null) {
                    onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic, value);
                }
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i) {
                UUID uuid;
                AnonymousClass003.A0x(bluetoothGattCharacteristic, bArr);
                boolean z2 = false;
                if (i == 0) {
                    z2 = true;
                    C3Em<AuraBleData> c3Em = this.this$0._incomingData;
                    BluetoothGattService service = bluetoothGattCharacteristic.getService();
                    if (service == null || (uuid = service.getUuid()) == null) {
                        uuid = new UUID(0L, 0L);
                    }
                    UUID uuid2 = bluetoothGattCharacteristic.getUuid();
                    C7384Etj.A0U(uuid2);
                    c3Em.AhV(new AuraBleData(uuid, uuid2, bArr));
                }
                InterfaceC10560Hsz interfaceC10560Hsz = (InterfaceC10560Hsz) C8j3.A10(this.this$0.pendingOperation);
                if (interfaceC10560Hsz != null) {
                    C8j4.A1S(z2, interfaceC10560Hsz);
                }
            }
        };
    }
}
