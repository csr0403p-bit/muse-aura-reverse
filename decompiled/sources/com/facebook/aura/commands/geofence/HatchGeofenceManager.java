package com.facebook.aura.commands.geofence;

import X.AbstractC4178Com;
import X.AbstractC4379Cud;
import X.AnonymousClass000;
import X.AnonymousClass002;
import X.BV4;
import X.C4109Cmq;
import X.C4163CoN;
import X.C4199Cpc;
import X.C4200Cpj;
import X.C4202Cpo;
import X.C4230Cqe;
import X.C4248CrK;
import X.C4255CrS;
import X.C4276Cs4;
import X.C4280CsB;
import X.C4284CsJ;
import X.C4384Cuk;
import X.C4401CvE;
import X.C7384Etj;
import X.CRy;
import X.CSE;
import X.Crt;
import X.ExecutorC4369CuP;
import X.HtJ;
import X.HzP;
import X.InterfaceC3519CRu;
import X.InterfaceC3786CeU;
import X.InterfaceC4375CuV;
import X.RunnableC4399CvC;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.WorkSource;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.google.android.gms.location.LocationRequest;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes5.dex */
public final class HatchGeofenceManager {
    public static final long KEEP_ALIVE_INTERVAL_MS = 900000;
    public static final int LOITERING_DELAY_MS = 30000;
    public static final int RESPONSIVENESS_MS = 0;
    public static final String TAG = "HatchGeofenceManager";
    public static InterfaceC3519CRu keepAliveClient;
    public static final HatchGeofenceManager INSTANCE = new HatchGeofenceManager();
    public static final HatchGeofenceManager$keepAliveCallback$1 keepAliveCallback = new AbstractC4379Cud() { // from class: com.facebook.aura.commands.geofence.HatchGeofenceManager$keepAliveCallback$1
    };

    @DebugMetadata(c = "com.facebook.aura.commands.geofence.HatchGeofenceManager", f = "HatchGeofenceManager.kt", l = {55, 68}, m = "registerGeofence", v = 2)
    /* renamed from: com.facebook.aura.commands.geofence.HatchGeofenceManager$registerGeofence$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchGeofenceManager.this.registerGeofence(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.geofence.HatchGeofenceManager", f = "HatchGeofenceManager.kt", l = {130}, m = "reregisterAll", v = 2)
    /* renamed from: com.facebook.aura.commands.geofence.HatchGeofenceManager$reregisterAll$1, reason: invalid class name and case insensitive filesystem */
    public final class C111151 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public int label;
        public /* synthetic */ Object result;

        public C111151(HtJ<? super C111151> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchGeofenceManager.this.reregisterAll(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.geofence.HatchGeofenceManager", f = "HatchGeofenceManager.kt", l = {93}, m = "unregisterAll", v = 2)
    /* renamed from: com.facebook.aura.commands.geofence.HatchGeofenceManager$unregisterAll$1, reason: invalid class name and case insensitive filesystem */
    public final class C111161 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C111161(HtJ<? super C111161> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchGeofenceManager.this.unregisterAll(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.geofence.HatchGeofenceManager", f = "HatchGeofenceManager.kt", l = {80}, m = "unregisterGeofence", v = 2)
    /* renamed from: com.facebook.aura.commands.geofence.HatchGeofenceManager$unregisterGeofence$1, reason: invalid class name and case insensitive filesystem */
    public final class C111171 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C111171(HtJ<? super C111171> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchGeofenceManager.this.unregisterGeofence(null, null, this);
        }
    }

    /* loaded from: classes3.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GeofenceTriggerType.values().length];
            try {
                AnonymousClass002.A13(GeofenceTriggerType.ENTER, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(GeofenceTriggerType.EXIT, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(GeofenceTriggerType.ENTER_OR_EXIT, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.F0V buildGoogleGeofence(com.facebook.aura.commands.geofence.NodeGeofence r16) {
        /*
            r15 = this;
            r3 = r16
            com.facebook.aura.commands.geofence.GeofenceTriggerType r0 = r3.trigger
            int r2 = r0.ordinal()
            r12 = 0
            r11 = 5
            if (r2 == r12) goto L14
            r1 = 1
            r11 = 3
            r0 = 2
            if (r2 == r1) goto L14
            if (r2 != r0) goto Lbc
            r11 = 7
        L14:
            java.lang.String r5 = r3.id
            java.lang.String r0 = "Request ID can't be set to null"
            X.CRy.A04(r5, r0)
            double r6 = r3.latitude
            double r8 = r3.longitude
            float r10 = r3.radiusMeters
            r3 = -4587338432941916160(0xc056800000000000, double:-90.0)
            r2 = 0
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 < 0) goto L35
            r3 = 4636033603912859648(0x4056800000000000, double:90.0)
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            r3 = 1
            if (r0 <= 0) goto L36
        L35:
            r3 = 0
        L36:
            java.lang.String r0 = java.lang.String.valueOf(r6)
            int r0 = r0.length()
            int r0 = r0 + 18
            java.lang.StringBuilder r1 = X.BV4.A0p(r0)
            java.lang.String r0 = "Invalid latitude: "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            X.CRy.A08(r3, r0)
            r3 = -4582834833314545664(0xc066800000000000, double:-180.0)
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 < 0) goto L66
            r3 = 4640537203540230144(0x4066800000000000, double:180.0)
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            r3 = 1
            if (r0 <= 0) goto L67
        L66:
            r3 = 0
        L67:
            java.lang.String r0 = java.lang.String.valueOf(r8)
            int r0 = r0.length()
            int r0 = r0 + 19
            java.lang.StringBuilder r1 = X.BV4.A0p(r0)
            java.lang.String r0 = "Invalid longitude: "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = r1.toString()
            X.CRy.A08(r3, r0)
            r0 = 0
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 <= 0) goto L8a
            r2 = 1
        L8a:
            java.lang.String r0 = java.lang.String.valueOf(r10)
            int r0 = r0.length()
            int r0 = r0 + 16
            java.lang.StringBuilder r1 = X.BV4.A0p(r0)
            java.lang.String r0 = "Invalid radius: "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = r1.toString()
            X.CRy.A08(r2, r0)
            r14 = -1
            if (r5 == 0) goto Lb5
            r13 = 30000(0x7530, float:4.2039E-41)
            r16 = 1
            com.google.android.gms.internal.location.zzek r4 = new com.google.android.gms.internal.location.zzek
            r4.<init>(r5, r6, r8, r10, r11, r12, r13, r14, r16)
            return r4
        Lb5:
            java.lang.String r0 = "Request ID not set."
            java.lang.IllegalArgumentException r0 = X.C60O.A0i(r0)
            throw r0
        Lbc:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.geofence.HatchGeofenceManager.buildGoogleGeofence(com.facebook.aura.commands.geofence.NodeGeofence):X.F0V");
    }

    private final PendingIntent getGeofencePendingIntent(Context context) {
        Intent intent = new Intent(context, (Class<?>) HatchGeofenceBroadcastReceiver.class);
        intent.setAction(HatchGeofenceBroadcastReceiver.ACTION_GEOFENCE_TRANSITION);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 167772160);
        C7384Etj.A0U(broadcast);
        return broadcast;
    }

    private final boolean hasMonitoringPermissions(Context context) {
        return context.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0 && context.checkSelfPermission(AnonymousClass000.A00(39)) == 0;
    }

    private final void startLocationKeepAlive(Context context) {
        if (keepAliveClient == null) {
            C4109Cmq c4109Cmq = new C4109Cmq(context, InterfaceC3786CeU.A00, C4109Cmq.A01, C4276Cs4.A02);
            final LocationRequest locationRequest = new LocationRequest(new WorkSource(null), null, 100.0f, 104, Integer.MAX_VALUE, 0, 0, 900000L, 900000L, Math.max(0L, 900000L), LinkEncryptedPairingKt.LINK_COUNTER_MAX, LinkEncryptedPairingKt.LINK_COUNTER_MAX, 900000L, true, false);
            HatchGeofenceManager$keepAliveCallback$1 hatchGeofenceManager$keepAliveCallback$1 = keepAliveCallback;
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper == null) {
                mainLooper = Looper.myLooper();
                CRy.A04(mainLooper, "invalid null looper");
            }
            CRy.A04(hatchGeofenceManager$keepAliveCallback$1, "Listener must not be null");
            CRy.A04(mainLooper, "Looper must not be null");
            C4200Cpj c4200Cpj = new C4200Cpj(mainLooper, hatchGeofenceManager$keepAliveCallback$1);
            final C4202Cpo c4202Cpo = new C4202Cpo(c4200Cpj, C4401CvE.A00, c4109Cmq);
            InterfaceC4375CuV interfaceC4375CuV = new InterfaceC4375CuV() { // from class: X.Crw
                @Override // X.InterfaceC4375CuV
                public final /* synthetic */ void accept(Object obj, Object obj2) {
                    ((C4196CpV) obj).A08(c4202Cpo, locationRequest, (CSE) obj2);
                }
            };
            C4230Cqe c4230Cqe = new C4230Cqe();
            c4230Cqe.A04 = RunnableC4399CvC.A00;
            c4230Cqe.A05 = true;
            c4230Cqe.A02 = interfaceC4375CuV;
            c4230Cqe.A03 = c4202Cpo;
            c4230Cqe.A01 = c4200Cpj;
            c4230Cqe.A00 = 2436;
            C4248CrK c4248CrK = c4200Cpj.A01;
            CRy.A04(c4248CrK, "Key must not be null");
            C4255CrS c4255CrS = new C4255CrS(c4230Cqe.A01, c4230Cqe, c4230Cqe.A00, c4230Cqe.A05);
            Crt crt = new Crt(c4248CrK, c4230Cqe);
            Runnable runnable = c4230Cqe.A04;
            CRy.A04(c4255CrS.A01.A01, "Listener has already been released.");
            CRy.A04(crt.A00, "Listener has already been released.");
            C4163CoN c4163CoN = c4109Cmq.A07;
            CSE cse = new CSE();
            C4163CoN.A05(c4109Cmq, c4163CoN, cse, c4255CrS.A00);
            BV4.A1D(c4163CoN.A05, new C4284CsJ(c4109Cmq, new C4199Cpc(new C4280CsB(c4255CrS, crt, runnable), cse), c4163CoN.A0B.get()), 8);
            keepAliveClient = c4109Cmq;
        }
    }

    private final void stopLocationKeepAlive() {
        Object obj = keepAliveClient;
        if (obj != null) {
            HatchGeofenceManager$keepAliveCallback$1 hatchGeofenceManager$keepAliveCallback$1 = keepAliveCallback;
            CRy.A04(hatchGeofenceManager$keepAliveCallback$1, "Listener must not be null");
            CRy.A07("LocationCallback", "Listener type must not be empty");
            ((AbstractC4178Com) obj).A04(new C4248CrK<>(hatchGeofenceManager$keepAliveCallback$1, "LocationCallback"), 2418).A04(C4384Cuk.A00, ExecutorC4369CuP.A00);
        }
        keepAliveClient = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object registerGeofence(android.content.Context r12, com.facebook.aura.commands.geofence.NodeGeofence r13, X.HtJ<? super kotlin.Unit> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.facebook.aura.commands.geofence.HatchGeofenceManager.AnonymousClass1
            if (r0 == 0) goto Lcb
            r8 = r14
            com.facebook.aura.commands.geofence.HatchGeofenceManager$registerGeofence$1 r8 = (com.facebook.aura.commands.geofence.HatchGeofenceManager.AnonymousClass1) r8
            int r2 = r8.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lcb
            int r2 = r2 - r1
            r8.label = r2
        L12:
            java.lang.Object r1 = r8.result
            X.Hji r7 = X.EnumC10460Hji.A02
            int r0 = r8.label
            java.lang.String r6 = "HatchGeofenceManager"
            r9 = 2
            r10 = 1
            if (r0 == 0) goto L47
            if (r0 == r10) goto L3b
            if (r0 != r9) goto Ld2
            java.lang.Object r13 = r8.L$1
            com.facebook.aura.commands.geofence.NodeGeofence r13 = (com.facebook.aura.commands.geofence.NodeGeofence) r13
            X.Hwg.A00(r1)
        L29:
            java.lang.String r3 = r13.id
            java.lang.String r2 = r13.label
            java.lang.String r1 = "Registered geofence: id="
            java.lang.String r0 = " label="
            java.lang.String r0 = X.FGI.A0d(r1, r3, r0, r2)
            X.CFK.A05(r6, r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L3b:
            java.lang.Object r13 = r8.L$1
            com.facebook.aura.commands.geofence.NodeGeofence r13 = (com.facebook.aura.commands.geofence.NodeGeofence) r13
            java.lang.Object r12 = r8.L$0
            android.content.Context r12 = (android.content.Context) r12
            X.Hwg.A00(r1)     // Catch: java.lang.Exception -> L71
            goto L7b
        L47:
            X.Hwg.A00(r1)
            r11.startLocationKeepAlive(r12)
            X.CrC r3 = X.C4109Cmq.A01     // Catch: java.lang.Exception -> L71
            X.CeV r1 = X.InterfaceC3786CeU.A00     // Catch: java.lang.Exception -> L71
            X.Cs4 r0 = X.C4276Cs4.A02     // Catch: java.lang.Exception -> L71
            X.Cmq r2 = new X.Cmq     // Catch: java.lang.Exception -> L71
            r2.<init>(r12, r1, r3, r0)     // Catch: java.lang.Exception -> L71
            r0 = 100
            r1 = 0
            X.CSC r0 = r2.AET(r1, r0)     // Catch: java.lang.Exception -> L71
            X.C7384Etj.A0U(r0)     // Catch: java.lang.Exception -> L71
            r8.L$0 = r12     // Catch: java.lang.Exception -> L71
            r8.L$1 = r13     // Catch: java.lang.Exception -> L71
            r8.L$2 = r1     // Catch: java.lang.Exception -> L71
            r8.label = r10     // Catch: java.lang.Exception -> L71
            java.lang.Object r0 = X.AbstractC3001Brc.A00(r0, r8)     // Catch: java.lang.Exception -> L71
            if (r0 != r7) goto L7b
            goto Ld7
        L71:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            java.lang.String r0 = "getCurrentLocation fix failed before geofence register: "
            X.C3cG.A1G(r0, r1, r6)
        L7b:
            X.CrC r2 = X.C4109Cmq.A01
            X.CeV r1 = X.InterfaceC3786CeU.A00
            X.Cs4 r0 = X.C4276Cs4.A02
            X.CnT r5 = new X.CnT
            r5.<init>(r12, r1, r2, r0)
            X.F0V r0 = r11.buildGoogleGeofence(r13)
            java.util.ArrayList r2 = X.BV5.A0u(r0)
            boolean r0 = r2.isEmpty()
            r1 = r0 ^ 1
            java.lang.String r0 = "No geofence has been added to this request."
            X.CRy.A08(r1, r0)
            java.util.ArrayList r0 = X.BV4.A0t(r2)
            r4 = 0
            com.google.android.gms.location.GeofencingRequest r3 = new com.google.android.gms.location.GeofencingRequest
            r3.<init>(r0, r10, r4)
            android.app.PendingIntent r2 = r11.getGeofencePendingIntent(r12)
            X.Cqf r1 = X.C4232Cqg.A00()
            X.Cpa r0 = new X.Cpa
            r0.<init>(r2, r3)
            r1.A01 = r0
            r0 = 2424(0x978, float:3.397E-42)
            X.CSC r0 = X.AbstractC4178Com.A01(r5, r1, r0, r10)
            r8.L$0 = r4
            r8.L$1 = r13
            r8.L$2 = r4
            r8.L$3 = r4
            r8.L$4 = r4
            r8.label = r9
            java.lang.Object r0 = X.AbstractC3001Brc.A00(r0, r8)
            if (r0 != r7) goto L29
            return r7
        Lcb:
            com.facebook.aura.commands.geofence.HatchGeofenceManager$registerGeofence$1 r8 = new com.facebook.aura.commands.geofence.HatchGeofenceManager$registerGeofence$1
            r8.<init>(r14)
            goto L12
        Ld2:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        Ld7:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.geofence.HatchGeofenceManager.registerGeofence(android.content.Context, com.facebook.aura.commands.geofence.NodeGeofence, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00dd -> B:23:0x0083). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object reregisterAll(android.content.Context r14, X.HtJ<? super kotlin.Unit> r15) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.geofence.HatchGeofenceManager.reregisterAll(android.content.Context, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object unregisterAll(android.content.Context r8, X.HtJ<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.commands.geofence.HatchGeofenceManager.C111161
            if (r0 == 0) goto L5e
            r6 = r9
            com.facebook.aura.commands.geofence.HatchGeofenceManager$unregisterAll$1 r6 = (com.facebook.aura.commands.geofence.HatchGeofenceManager.C111161) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5e
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L2d
            if (r0 != r4) goto L64
            X.Hwg.A00(r1)
        L20:
            r7.stopLocationKeepAlive()
            java.lang.String r1 = "HatchGeofenceManager"
            java.lang.String r0 = "Unregistered all geofences"
            X.CFK.A05(r1, r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L2d:
            X.Hwg.A00(r1)
            X.CrC r2 = X.C4109Cmq.A01
            X.CeV r1 = X.InterfaceC3786CeU.A00
            X.Cs4 r0 = X.C4276Cs4.A02
            X.CnT r3 = new X.CnT
            r3.<init>(r8, r1, r2, r0)
            android.app.PendingIntent r2 = r7.getGeofencePendingIntent(r8)
            X.Cqf r1 = X.C4232Cqg.A00()
            X.Cnu r0 = new X.Cnu
            r0.<init>()
            r1.A01 = r0
            r0 = 2425(0x979, float:3.398E-42)
            X.CSC r1 = X.AbstractC4178Com.A01(r3, r1, r0, r4)
            r0 = 0
            r6.L$0 = r0
            r6.L$1 = r0
            r6.label = r4
            java.lang.Object r0 = X.AbstractC3001Brc.A00(r1, r6)
            if (r0 != r5) goto L20
            return r5
        L5e:
            com.facebook.aura.commands.geofence.HatchGeofenceManager$unregisterAll$1 r6 = new com.facebook.aura.commands.geofence.HatchGeofenceManager$unregisterAll$1
            r6.<init>(r9)
            goto L12
        L64:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.geofence.HatchGeofenceManager.unregisterAll(android.content.Context, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object unregisterGeofence(android.content.Context r8, java.lang.String r9, X.HtJ<? super kotlin.Unit> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.facebook.aura.commands.geofence.HatchGeofenceManager.C111171
            if (r0 == 0) goto L7c
            r5 = r10
            com.facebook.aura.commands.geofence.HatchGeofenceManager$unregisterGeofence$1 r5 = (com.facebook.aura.commands.geofence.HatchGeofenceManager.C111171) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7c
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r6 = 1
            if (r0 == 0) goto L49
            if (r0 != r6) goto L82
            java.lang.Object r9 = r5.L$1
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r5.L$0
            android.content.Context r8 = (android.content.Context) r8
            X.Hwg.A00(r1)
        L28:
            java.lang.String r0 = "Unregistered geofence: id="
            java.lang.String r1 = X.FGI.A0M(r0, r9)
            java.lang.String r0 = "HatchGeofenceManager"
            X.CFK.A05(r0, r1)
            com.facebook.aura.commands.geofence.GeofenceStore$Companion r0 = com.facebook.aura.commands.geofence.GeofenceStore.Companion
            com.facebook.aura.commands.geofence.GeofenceStore r0 = r0.getInstance(r8)
            java.util.List r0 = r0.getAll()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L46
            r7.stopLocationKeepAlive()
        L46:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L49:
            X.Hwg.A00(r1)
            X.CrC r2 = X.C4109Cmq.A01
            X.CeV r1 = X.InterfaceC3786CeU.A00
            X.Cs4 r0 = X.C4276Cs4.A02
            X.CnT r3 = new X.CnT
            r3.<init>(r8, r1, r2, r0)
            java.util.List r2 = java.util.Collections.singletonList(r9)
            X.Cqf r1 = X.C4232Cqg.A00()
            X.Cnt r0 = new X.Cnt
            r0.<init>()
            r1.A01 = r0
            r0 = 2425(0x979, float:3.398E-42)
            X.CSC r1 = X.AbstractC4178Com.A01(r3, r1, r0, r6)
            r5.L$0 = r8
            r5.L$1 = r9
            r0 = 0
            r5.L$2 = r0
            r5.label = r6
            java.lang.Object r0 = X.AbstractC3001Brc.A00(r1, r5)
            if (r0 != r4) goto L28
            return r4
        L7c:
            com.facebook.aura.commands.geofence.HatchGeofenceManager$unregisterGeofence$1 r5 = new com.facebook.aura.commands.geofence.HatchGeofenceManager$unregisterGeofence$1
            r5.<init>(r10)
            goto L12
        L82:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.geofence.HatchGeofenceManager.unregisterGeofence(android.content.Context, java.lang.String, X.HtJ):java.lang.Object");
    }
}
