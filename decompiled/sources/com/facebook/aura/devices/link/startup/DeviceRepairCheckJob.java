package com.facebook.aura.devices.link.startup;

import X.A3q;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C0881AGi;
import X.C3UX;
import X.C60N;
import X.C60O;
import X.C7384Etj;
import X.C7Bm;
import X.CFK;
import X.G0U;
import X.G0V;
import X.GBL;
import X.Hm1;
import X.HtJ;
import X.HzP;
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
import android.os.Handler;
import com.facebook.aura.activation.view.AuraWaitlistConfettiKt;
import com.facebook.aura.devices.pairing.HatchDeviceBleAdvertisementKt;
import com.facebook.aura.devices.pairing.HatchDeviceFamily;
import com.facebook.aura.devices.pairing.HatchDeviceFamilyKt;
import com.facebook.aura.nodes.json.NodeListEntry;
import com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer;
import com.facebook.aura.startup.appjob.AppJobId;
import com.facebook.aura.startup.appjob.AppJobKey;
import com.facebook.aura.startup.appjob.FeatureAppJobKey;
import com.facebook.aura.startup.appjob.ProcessScope;
import com.facebook.aura.startup.appjob.ResumePolicy;
import com.facebook.aura.startup.appjob.SessionedStartupJob;
import com.facebook.aura.startup.appjob.StartupPhase;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class DeviceRepairCheckJob implements SessionedStartupJob {
    public static final DeviceRepairCheckJob INSTANCE = new DeviceRepairCheckJob();
    public static final AppJobKey key = new FeatureAppJobKey("DEVICE_REPAIR_CHECK");

    public final class RepairCandidate extends C06G {
        public final String bleName;
        public final NodeListEntry device;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof RepairCandidate) {
                    RepairCandidate repairCandidate = (RepairCandidate) obj;
                    if (!C7384Etj.areEqual(this.bleName, repairCandidate.bleName) || !C7384Etj.areEqual(this.device, repairCandidate.device)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ RepairCandidate copy$default(RepairCandidate repairCandidate, String str, NodeListEntry nodeListEntry, int i, Object obj) {
            if ((i & 1) != 0) {
                str = repairCandidate.bleName;
            }
            if ((i & 2) != 0) {
                nodeListEntry = repairCandidate.device;
            }
            AnonymousClass003.A0u(str, nodeListEntry);
            return new RepairCandidate(str, nodeListEntry);
        }

        public final String component1() {
            return this.bleName;
        }

        public final NodeListEntry component2() {
            return this.device;
        }

        public final String getBleName() {
            return this.bleName;
        }

        public final NodeListEntry getDevice() {
            return this.device;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.device, AnonymousClass001.A0G(this.bleName));
        }

        public RepairCandidate(String str, NodeListEntry nodeListEntry) {
            AnonymousClass003.A0u(str, nodeListEntry);
            this.bleName = str;
            this.device = nodeListEntry;
        }

        public final RepairCandidate copy(String str, NodeListEntry nodeListEntry) {
            AnonymousClass003.A0u(str, nodeListEntry);
            return new RepairCandidate(str, nodeListEntry);
        }

        public String toString() {
            return super.toString();
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.link.startup.DeviceRepairCheckJob", f = "DeviceRepairCheckJob.kt", l = {HatchIdeaShareImageRenderer.TEXT_LEFT, 83}, m = "execute", v = 2)
    /* renamed from: com.facebook.aura.devices.link.startup.DeviceRepairCheckJob$execute$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
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
            return DeviceRepairCheckJob.this.execute(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.link.startup.DeviceRepairCheckJob$execute$2", f = "DeviceRepairCheckJob.kt", l = {86, 89, 91, AuraWaitlistConfettiKt.StandardParticleCount, 98}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.devices.link.startup.DeviceRepairCheckJob$execute$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Context $appContext;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AbstractC3358CGz abstractC3358CGz, Context context, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$userSession = abstractC3358CGz;
            this.$appContext = context;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$userSession, this.$appContext, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x008b A[Catch: Exception -> 0x0104, CancellationException -> 0x0111, TryCatch #2 {CancellationException -> 0x0111, Exception -> 0x0104, blocks: (B:46:0x00f0, B:47:0x00f3, B:41:0x00bd, B:43:0x00c3, B:49:0x00f9, B:38:0x00b4, B:39:0x00b7, B:40:0x00b9, B:34:0x009d, B:35:0x00a0, B:28:0x0080, B:29:0x0083, B:31:0x008b, B:20:0x005f, B:21:0x0062, B:23:0x006a, B:25:0x006d, B:17:0x004a), top: B:57:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00b3 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00c3 A[Catch: Exception -> 0x0104, CancellationException -> 0x0111, TryCatch #2 {CancellationException -> 0x0111, Exception -> 0x0104, blocks: (B:46:0x00f0, B:47:0x00f3, B:41:0x00bd, B:43:0x00c3, B:49:0x00f9, B:38:0x00b4, B:39:0x00b7, B:40:0x00b9, B:34:0x009d, B:35:0x00a0, B:28:0x0080, B:29:0x0083, B:31:0x008b, B:20:0x005f, B:21:0x0062, B:23:0x006a, B:25:0x006d, B:17:0x004a), top: B:57:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00f9 A[Catch: Exception -> 0x0104, CancellationException -> 0x0111, TryCatch #2 {CancellationException -> 0x0111, Exception -> 0x0104, blocks: (B:46:0x00f0, B:47:0x00f3, B:41:0x00bd, B:43:0x00c3, B:49:0x00f9, B:38:0x00b4, B:39:0x00b7, B:40:0x00b9, B:34:0x009d, B:35:0x00a0, B:28:0x0080, B:29:0x0083, B:31:0x008b, B:20:0x005f, B:21:0x0062, B:23:0x006a, B:25:0x006d, B:17:0x004a), top: B:57:0x000b }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00ed -> B:47:0x00f3). Please report as a decompilation issue!!! */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 275
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.link.startup.DeviceRepairCheckJob.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.link.startup.DeviceRepairCheckJob", f = "DeviceRepairCheckJob.kt", l = {115}, m = "findRepairCandidates", v = 2)
    /* renamed from: com.facebook.aura.devices.link.startup.DeviceRepairCheckJob$findRepairCandidates$1, reason: invalid class name and case insensitive filesystem */
    public final class C115991 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C115991(HtJ<? super C115991> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeviceRepairCheckJob.this.findRepairCandidates(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0088  */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.Hji] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object findRepairCandidates(android.content.Context r7, java.util.List<com.facebook.aura.nodes.json.NodeListEntry> r8, X.HtJ<? super java.util.List<com.facebook.aura.devices.link.startup.DeviceRepairCheckJob.RepairCandidate>> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.facebook.aura.devices.link.startup.DeviceRepairCheckJob.C115991
            if (r0 == 0) goto L88
            r4 = r9
            com.facebook.aura.devices.link.startup.DeviceRepairCheckJob$findRepairCandidates$1 r4 = (com.facebook.aura.devices.link.startup.DeviceRepairCheckJob.C115991) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L88
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r2 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L77
            if (r0 != r1) goto L8e
            java.lang.Object r8 = r4.L$1
            java.util.List r8 = (java.util.List) r8
            X.Hwg.A00(r2)
        L24:
            java.util.Set r2 = (java.util.Set) r2
            java.util.ArrayList r3 = X.C3cG.A0h()
            java.util.Iterator r7 = r2.iterator()
        L2e:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L87
            java.lang.String r5 = X.AnonymousClass005.A0j(r7)
            java.util.Locale r6 = java.util.Locale.ROOT
            java.lang.String r0 = r5.toLowerCase(r6)
            java.lang.String r4 = X.AnonymousClass002.A0l(r0)
            java.util.Iterator r1 = r8.iterator()
        L46:
            boolean r0 = r1.hasNext()
            r2 = 0
            if (r0 == 0) goto L64
            java.lang.Object r2 = r1.next()
            r0 = r2
            com.facebook.aura.nodes.json.NodeListEntry r0 = (com.facebook.aura.nodes.json.NodeListEntry) r0
            java.lang.String r0 = r0.nodeId
            java.lang.String r0 = r0.toLowerCase(r6)
            java.lang.String r0 = X.AnonymousClass002.A0l(r0)
            boolean r0 = X.C7384Etj.areEqual(r0, r4)
            if (r0 == 0) goto L46
        L64:
            com.facebook.aura.nodes.json.NodeListEntry r2 = (com.facebook.aura.nodes.json.NodeListEntry) r2
            if (r2 == 0) goto L2e
            com.facebook.aura.nodes.json.NodePairingStatus r1 = r2.pairingStatus
            com.facebook.aura.nodes.json.NodePairingStatus r0 = com.facebook.aura.nodes.json.NodePairingStatus.SELF_REVOKED
            if (r1 == r0) goto L2e
            com.facebook.aura.devices.link.startup.DeviceRepairCheckJob$RepairCandidate r0 = new com.facebook.aura.devices.link.startup.DeviceRepairCheckJob$RepairCandidate
            r0.<init>(r5, r2)
            r3.add(r0)
            goto L2e
        L77:
            X.Hwg.A00(r2)
            r0 = 0
            r4.L$0 = r0
            r4.L$1 = r8
            r4.label = r1
            java.lang.Object r2 = r6.scanForUnpairedDevices(r7, r4)
            if (r2 != r3) goto L24
        L87:
            return r3
        L88:
            com.facebook.aura.devices.link.startup.DeviceRepairCheckJob$findRepairCandidates$1 r4 = new com.facebook.aura.devices.link.startup.DeviceRepairCheckJob$findRepairCandidates$1
            r4.<init>(r9)
            goto L12
        L8e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.link.startup.DeviceRepairCheckJob.findRepairCandidates(android.content.Context, java.util.List, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.bluetooth.le.ScanCallback, com.facebook.aura.devices.link.startup.DeviceRepairCheckJob$scanForUnpairedDevices$2$callback$1] */
    public final Object scanForUnpairedDevices(Context context, HtJ<? super Set<String>> htJ) {
        BluetoothManager bluetoothManager;
        BluetoothAdapter adapter;
        final BluetoothLeScanner bluetoothLeScanner;
        Object systemService = context.getSystemService("bluetooth");
        if (!(systemService instanceof BluetoothManager) || (bluetoothManager = (BluetoothManager) systemService) == null || (adapter = bluetoothManager.getAdapter()) == null || (bluetoothLeScanner = adapter.getBluetoothLeScanner()) == 0) {
            return A3q.A00;
        }
        final GBL gblA03 = C7Bm.A03(htJ);
        final ConcurrentHashMap.KeySetView keySetViewNewKeySet = ConcurrentHashMap.newKeySet();
        ScanSettings scanSettingsBuild = new ScanSettings.Builder().setScanMode(0).build();
        final ?? r1 = new ScanCallback() { // from class: com.facebook.aura.devices.link.startup.DeviceRepairCheckJob$scanForUnpairedDevices$2$callback$1
            public boolean loggedNameRefusal;

            @Override // android.bluetooth.le.ScanCallback
            public void onScanResult(int i, ScanResult scanResult) {
                String name;
                C7384Etj.A0Y(scanResult, 1);
                ScanRecord scanRecord = scanResult.getScanRecord();
                if (scanRecord == null || (name = scanRecord.getDeviceName()) == null) {
                    try {
                        BluetoothDevice device = scanResult.getDevice();
                        if (device == null) {
                            return;
                        }
                        name = device.getName();
                        if (name == null) {
                            return;
                        }
                    } catch (SecurityException e) {
                        if (this.loggedNameRefusal) {
                            return;
                        }
                        this.loggedNameRefusal = true;
                        CFK.A0A(C60N.A00(45), "BluetoothDevice.getName refused", e);
                        return;
                    }
                }
                if (HatchDeviceFamilyKt.matchesDeviceName(HatchDeviceFamily.HATCH_LINK, name, true, false) && AnonymousClass002.A1b(HatchDeviceBleAdvertisementKt.hatchAdvertisedPairingFlag(scanResult.getScanRecord()), false)) {
                    keySetViewNewKeySet.add(name);
                }
            }
        };
        bluetoothLeScanner.startScan((List<ScanFilter>) null, scanSettingsBuild, (ScanCallback) r1);
        Handler handlerA02 = C60O.A02();
        Runnable runnable = new Runnable() { // from class: com.facebook.aura.devices.link.startup.DeviceRepairCheckJob$scanForUnpairedDevices$2$timeoutRunnable$1

            /* renamed from: com.facebook.aura.devices.link.startup.DeviceRepairCheckJob$scanForUnpairedDevices$2$timeoutRunnable$1$2, reason: invalid class name */
            public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<Throwable, Unit> {
                public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

                public AnonymousClass2() {
                    super(1);
                }

                @Override // X.G0U
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    bluetoothLeScanner.stopScan(r1);
                } catch (Exception unused) {
                }
                try {
                    if (gblA03.isActive()) {
                        Hm1<Set<String>> hm1 = gblA03;
                        ConcurrentHashMap.KeySetView<String, Boolean> keySetView = keySetViewNewKeySet;
                        C7384Etj.A0X(keySetView);
                        hm1.Abf(AnonymousClass2.INSTANCE, AbstractC0878AGe.A0g(keySetView));
                    }
                } catch (IllegalStateException unused2) {
                }
            }
        };
        gblA03.AO2(new DeviceRepairCheckJob$scanForUnpairedDevices$2$1(handlerA02, runnable, bluetoothLeScanner, r1));
        handlerA02.postDelayed(runnable, 5000L);
        return gblA03.A0F();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0087  */
    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object execute(X.AbstractC3358CGz r8, X.HtJ<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.devices.link.startup.DeviceRepairCheckJob.AnonymousClass1
            if (r0 == 0) goto L87
            r4 = r9
            com.facebook.aura.devices.link.startup.DeviceRepairCheckJob$execute$1 r4 = (com.facebook.aura.devices.link.startup.DeviceRepairCheckJob.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L87
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r6 = 2
            r7 = 1
            if (r0 == 0) goto L26
            if (r0 == r7) goto L4c
            if (r0 != r6) goto L8d
            X.Hwg.A00(r1)
        L23:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L26:
            X.Hwg.A00(r1)
            com.facebook.aura.common.appcontext.AuraAppContext r0 = com.facebook.aura.common.appcontext.AuraAppContext.INSTANCE
            android.content.Context r3 = r0.getContext()
            if (r3 == 0) goto L23
            boolean r0 = com.facebook.aura.devices.pairing.HatchDeviceBlePermissionEffectKt.hasHatchDeviceBlePermissions(r3)
            if (r0 == 0) goto L23
            com.facebook.aura.gateway.HatchGatewayConnection r2 = X.C60O.A05(r8)
            r4.L$0 = r8
            r4.L$1 = r3
            r4.L$2 = r2
            r4.label = r7
            r0 = 30000(0x7530, double:1.4822E-319)
            java.lang.Object r1 = r2.awaitConnected(r0, r4)
            if (r1 != r5) goto L5a
            return r5
        L4c:
            java.lang.Object r2 = r4.L$2
            com.facebook.aura.gateway.HatchGatewayConnection r2 = (com.facebook.aura.gateway.HatchGatewayConnection) r2
            java.lang.Object r3 = r4.L$1
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r0 = r4.L$0
            X.CGz r8 = X.C60O.A0D(r0, r1)
        L5a:
            boolean r0 = X.AnonymousClass001.A1X(r1)
            if (r0 == 0) goto L23
            boolean r0 = r2.isConnected()
            if (r0 == 0) goto L23
            com.facebook.aura.utils.HatchUtil r0 = com.facebook.aura.utils.HatchUtil.INSTANCE
            boolean r0 = r0.isHatchLinksSettingsEnabled()
            if (r0 == 0) goto L23
            X.78T r2 = X.AnonymousClass001.A0y()
            r1 = 0
            com.facebook.aura.devices.link.startup.DeviceRepairCheckJob$execute$2 r0 = new com.facebook.aura.devices.link.startup.DeviceRepairCheckJob$execute$2
            r0.<init>(r8, r3, r1)
            r4.L$0 = r1
            r4.L$1 = r1
            r4.L$2 = r1
            r4.label = r6
            java.lang.Object r0 = X.GAo.A00(r4, r2, r0)
            if (r0 != r5) goto L23
            return r5
        L87:
            com.facebook.aura.devices.link.startup.DeviceRepairCheckJob$execute$1 r4 = new com.facebook.aura.devices.link.startup.DeviceRepairCheckJob$execute$1
            r4.<init>(r9)
            goto L12
        L8d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.link.startup.DeviceRepairCheckJob.execute(X.CGz, X.HtJ):java.lang.Object");
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob, com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public List<AppJobId> getDependsOn() {
        return C0881AGi.A00;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public SessionedStartupJob getJob() {
        return this;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public AppJobKey getJobId() {
        return key;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public StartupPhase getPhase() {
        return StartupPhase.NON_BLOCKING_LOW_PRIORITY;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob, com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public ProcessScope getProcessScope() {
        return ProcessScope.FOREGROUND_ONLY;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob, com.facebook.aura.startup.appjob.SessionedStartupJobRegistration
    public ResumePolicy getResumePolicy() {
        return ResumePolicy.OncePerProcess.INSTANCE;
    }

    @Override // com.facebook.aura.startup.appjob.SessionedStartupJob
    public /* bridge */ long getTimeoutMs() {
        return 10000L;
    }
}
