package com.facebook.aura.battery;

import X.AbstractC07127nr;
import X.AbstractC3582CVd;
import X.AnonymousClass001;
import X.AnonymousClass602;
import X.BV4;
import X.C20Z;
import X.C3580CVb;
import X.C3581CVc;
import X.C3583CVe;
import X.C3UX;
import X.C60O;
import X.C6ys;
import X.C7384Etj;
import X.C78W;
import X.C79;
import X.CFK;
import X.CVj;
import X.DFW;
import X.DFX;
import X.DLx;
import X.DM2;
import X.DM3;
import X.DM4;
import X.DM6;
import X.DM7;
import X.DM8;
import X.DM9;
import X.DMA;
import X.DMC;
import X.DMD;
import X.DME;
import X.DMF;
import X.DMG;
import X.DMH;
import X.DMI;
import X.DMK;
import X.DML;
import X.DMM;
import X.DMO;
import X.DQZ;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import X.Hy1;
import X.InterfaceC3585CVk;
import android.content.Context;
import com.facebook.aura.analytics.AuraAnalytics;
import com.facebook.aura.commands.photos.PhotosSearchHandlerKt;
import com.facebook.aura.executors.AuraExecutors;
import com.facebook.aura.lifecycle.AuraAppLifecycleManager;
import java.util.Random;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes5.dex */
public final class AuraBatteryMetrics {
    public static final long PERSIST_INTERVAL_MS = 600000;
    public static final String STORAGE_DIR = "battery_metrics";
    public static final String STORAGE_FILE = "snapshot";
    public static final AuraBatteryMetrics INSTANCE = new AuraBatteryMetrics();
    public static final AtomicBoolean started = C60O.A1E();
    public static final String TAG = "AuraBatteryMetrics";
    public static final C3UX scope = C78W.A04(new Hy1(AuraExecutors.INSTANCE.newSingleThreadExecutor(TAG)));

    @DebugMetadata(c = "com.facebook.aura.battery.AuraBatteryMetrics$init$1", f = "AuraBatteryMetrics.kt", l = {78}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.battery.AuraBatteryMetrics$init$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ DMM $batterySessionInstance;
        public final /* synthetic */ DMO $metricsLogger;
        public final /* synthetic */ CVj $reporter;
        public final /* synthetic */ DM2<C3581CVc, C3583CVe> $sessionCollector;
        public final /* synthetic */ AuraBatteryEventStore $store;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DM2<C3581CVc, C3583CVe> dm2, CVj cVj, DMO dmo, AuraBatteryEventStore auraBatteryEventStore, DMM dmm, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$sessionCollector = dm2;
            this.$reporter = cVj;
            this.$metricsLogger = dmo;
            this.$store = auraBatteryEventStore;
            this.$batterySessionInstance = dmm;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$sessionCollector, this.$reporter, this.$metricsLogger, this.$store, this.$batterySessionInstance, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                AuraBatteryMetrics.INSTANCE.logPreviousSession(this.$sessionCollector, this.$reporter, this.$metricsLogger, this.$store);
                AnonymousClass602 anonymousClass602 = new AnonymousClass602(AuraAppLifecycleManager.isAppInForegroundFlow, 0);
                final DM2<C3581CVc, C3583CVe> dm2 = this.$sessionCollector;
                final CVj cVj = this.$reporter;
                final DMO dmo = this.$metricsLogger;
                final AuraBatteryEventStore auraBatteryEventStore = this.$store;
                final DMM dmm = this.$batterySessionInstance;
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.battery.AuraBatteryMetrics.init.1.1
                    public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                        AuraBatteryMetrics.INSTANCE.logCurrentSession(dm2, cVj, dmo, auraBatteryEventStore, dmm, z ? "background" : "foreground");
                        return Unit.INSTANCE;
                    }

                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit(AnonymousClass001.A1X(obj2), (HtJ<? super Unit>) htJ);
                    }
                };
                this.label = 1;
                if (anonymousClass602.collect(c20z, this) == enumC10460Hji) {
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
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.battery.AuraBatteryMetrics$init$2", f = "AuraBatteryMetrics.kt", l = {98}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.battery.AuraBatteryMetrics$init$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ DMM $batterySessionInstance;
        public final /* synthetic */ DM2<C3581CVc, C3583CVe> $sessionCollector;
        public final /* synthetic */ AuraBatteryEventStore $store;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(DM2<C3581CVc, C3583CVe> dm2, AuraBatteryEventStore auraBatteryEventStore, DMM dmm, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$sessionCollector = dm2;
            this.$store = auraBatteryEventStore;
            this.$batterySessionInstance = dmm;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$sessionCollector, this.$store, this.$batterySessionInstance, htJ);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0022 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0020 -> B:6:0x000c). Please report as a decompilation issue!!! */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                X.Hji r5 = X.EnumC10460Hji.A02
                int r0 = r6.label
                r4 = 1
                if (r0 == 0) goto L23
                if (r0 != r4) goto L27
                X.Hwg.A00(r7)
            Lc:
                com.facebook.aura.battery.AuraBatteryMetrics r3 = com.facebook.aura.battery.AuraBatteryMetrics.INSTANCE
                X.DM2<X.CVc, X.CVe> r2 = r6.$sessionCollector
                com.facebook.aura.battery.AuraBatteryEventStore r1 = r6.$store
                X.DMM r0 = r6.$batterySessionInstance
                com.facebook.aura.battery.AuraBatteryMetrics.access$persistSnapshot(r3, r2, r1, r0)
            L17:
                r6.label = r4
                r0 = 600000(0x927c0, double:2.964394E-318)
                java.lang.Object r0 = X.C7Bq.A01(r0, r6)
                if (r0 != r5) goto Lc
                return r5
            L23:
                X.Hwg.A00(r7)
                goto L17
            L27:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.battery.AuraBatteryMetrics.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final C3583CVe createCollector(Context context) {
        DQZ dqz = new DQZ(0);
        dqz.put(DMF.class, new DME());
        dqz.put(DMK.class, new DMI());
        dqz.put(DMA.class, new DM9(context));
        dqz.put(DM6.class, new DM4(context));
        return new C3583CVe(dqz);
    }

    public final void init(Context context) {
        DMM dmm;
        C7384Etj.A0Y(context, 0);
        if (BV4.A1V(started)) {
            Context applicationContext = context.getApplicationContext();
            C7384Etj.A0X(applicationContext);
            DM2 dm2 = new DM2(createCollector(applicationContext));
            CVj cVjCreateReporter = createReporter();
            DMO dmo = new DMO((DFX) AuraAnalytics.deviceInstance$delegate.getValue());
            AuraBatteryEventStore auraBatteryEventStore = new AuraBatteryEventStore(applicationContext, createSerializer(), STORAGE_DIR, "snapshot");
            synchronized (DMM.A03) {
                dmm = DMM.A02;
                if (dmm == null) {
                    dmm = new DMM(BV4.A14(1L), new Random().nextLong());
                    DMM.A02 = dmm;
                }
                C7384Etj.A0Z(dmm, "null cannot be cast to non-null type com.facebook.battery.session.BatterySessionInstance");
            }
            C3UX c3ux = scope;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(dm2, cVjCreateReporter, dmo, auraBatteryEventStore, dmm, null);
            C6ys c6ys = C6ys.A00;
            Integer num = C79.A00;
            GAo.A02(num, c6ys, anonymousClass1, c3ux);
            GAo.A02(num, c6ys, new AnonymousClass2(dm2, auraBatteryEventStore, dmm, null), c3ux);
        }
    }

    private final CVj createReporter() {
        CVj cVj = new CVj();
        DMG dmg = new DMG();
        DQZ<Class<? extends AbstractC3582CVd<?>>, InterfaceC3585CVk<?>> dqz = cVj.A00;
        dqz.put(DMF.class, dmg);
        dqz.put(DMK.class, new DMH());
        dqz.put(DMA.class, new DMC());
        dqz.put(DM6.class, new DM7());
        return cVj;
    }

    private final C3580CVb createSerializer() {
        C3580CVb c3580CVb = new C3580CVb();
        c3580CVb.A03(new DMD(), DMF.class);
        c3580CVb.A03(new DML(), DMK.class);
        c3580CVb.A03(new DM8(), DMA.class);
        c3580CVb.A03(new DM3(), DM6.class);
        return c3580CVb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r0v6, types: [R extends X.CVd<R>, X.CVd] */
    /* JADX WARN: Type inference failed for: r0v7, types: [R extends X.CVd<R>] */
    /* JADX WARN: Type inference failed for: r1v1, types: [S extends X.CVf<R>, X.CVf] */
    /* JADX WARN: Type inference failed for: r1v3, types: [R extends X.CVd<R>, X.CVd] */
    /* JADX WARN: Type inference failed for: r1v4, types: [R extends X.CVd<R>] */
    /* JADX WARN: Type inference failed for: r5v3, types: [R extends X.CVd<R>, X.CVd] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void logCurrentSession(X.DM2<X.C3581CVc, X.C3583CVe> r13, X.CVj r14, X.DMO r15, com.facebook.aura.battery.AuraBatteryEventStore r16, X.DMM r17, java.lang.String r18) {
        /*
            r12 = this;
            boolean r2 = r13.A02     // Catch: java.lang.Exception -> L46 java.util.concurrent.CancellationException -> L4f
            S extends X.CVf<R> r1 = r13.A04     // Catch: java.lang.Exception -> L46 java.util.concurrent.CancellationException -> L4f
            R extends X.CVd<R> r0 = r13.A00     // Catch: java.lang.Exception -> L46 java.util.concurrent.CancellationException -> L4f
            boolean r0 = r1.A02(r0)     // Catch: java.lang.Exception -> L46 java.util.concurrent.CancellationException -> L4f
            r2 = r2 & r0
            r13.A02 = r2     // Catch: java.lang.Exception -> L46 java.util.concurrent.CancellationException -> L4f
            if (r2 == 0) goto L1b
            R extends X.CVd<R> r1 = r13.A00     // Catch: java.lang.Exception -> L46 java.util.concurrent.CancellationException -> L4f
            R extends X.CVd<R> r0 = r13.A01     // Catch: java.lang.Exception -> L46 java.util.concurrent.CancellationException -> L4f
            R extends X.CVd<R> r5 = r13.A03     // Catch: java.lang.Exception -> L46 java.util.concurrent.CancellationException -> L4f
            r1.A02(r0, r5)     // Catch: java.lang.Exception -> L46 java.util.concurrent.CancellationException -> L4f
            if (r5 == 0) goto L1b
            goto L1d
        L1b:
            r5 = 0
            goto L25
        L1d:
            R extends X.CVd<R> r1 = r13.A01     // Catch: java.lang.Exception -> L46 java.util.concurrent.CancellationException -> L4f
            R extends X.CVd<R> r0 = r13.A00     // Catch: java.lang.Exception -> L46 java.util.concurrent.CancellationException -> L4f
            r13.A01 = r0     // Catch: java.lang.Exception -> L46 java.util.concurrent.CancellationException -> L4f
            r13.A00 = r1     // Catch: java.lang.Exception -> L46 java.util.concurrent.CancellationException -> L4f
        L25:
            X.CVc r5 = (X.C3581CVc) r5     // Catch: java.lang.Exception -> L46 java.util.concurrent.CancellationException -> L4f
            if (r5 == 0) goto L45
            r0 = r17
            long r7 = r0.A00     // Catch: java.lang.Exception -> L46 java.util.concurrent.CancellationException -> L4f
            java.util.concurrent.atomic.AtomicLong r1 = r0.A01     // Catch: java.lang.Exception -> L46 java.util.concurrent.CancellationException -> L4f
            long r9 = r1.get()     // Catch: java.lang.Exception -> L46 java.util.concurrent.CancellationException -> L4f
            r11 = 0
            r2 = r12
            r3 = r14
            r4 = r15
            r6 = r18
            boolean r0 = r2.logMetrics(r3, r4, r5, r6, r7, r9, r11)     // Catch: java.lang.Exception -> L46 java.util.concurrent.CancellationException -> L4f
            if (r0 == 0) goto L45
            r1.getAndIncrement()     // Catch: java.lang.Exception -> L46 java.util.concurrent.CancellationException -> L4f
            r16.clear()     // Catch: java.lang.Exception -> L46 java.util.concurrent.CancellationException -> L4f
        L45:
            return
        L46:
            r2 = move-exception
            java.lang.String r1 = "Failed to log battery metrics"
            java.lang.String r0 = "AuraBatteryMetrics"
            X.CFK.A0A(r0, r1, r2)
            return
        L4f:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.battery.AuraBatteryMetrics.logCurrentSession(X.DM2, X.CVj, X.DMO, com.facebook.aura.battery.AuraBatteryEventStore, X.DMM, java.lang.String):void");
    }

    private final boolean logMetrics(CVj cVj, DMO dmo, C3581CVc c3581CVc, String str, long j, long j2, String str2) {
        DLx dLx = new DLx(dmo.A00);
        if (c3581CVc == null) {
            return false;
        }
        DFW dfwA01 = DFX.A01(dLx.A01, C79.A00, null, "mobile_power_stats", false);
        dLx.A00 = dfwA01;
        if (dfwA01 == null) {
            throw BV4.A0U();
        }
        if (!dfwA01.A0A()) {
            return false;
        }
        if (cVj != null) {
            cVj.Ab5(c3581CVc, dLx);
        }
        C7384Etj.A0Y(str, 1);
        DFW dfw = dLx.A00;
        if (dfw == null) {
            throw BV4.A0U();
        }
        dfw.A09("dimension", str);
        if (str2 != null) {
            DFW dfw2 = dLx.A00;
            if (dfw2 == null) {
                throw BV4.A0U();
            }
            dfw2.A09(PhotosSearchHandlerKt.PARAM_SOURCE, str2);
        }
        dLx.A3B("session_instance_id", j);
        dLx.A3B("session_seq_no", j2);
        DFW dfw3 = dLx.A00;
        if (dfw3 == null) {
            throw BV4.A0U();
        }
        dfw3.A05();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logPreviousSession(DM2<C3581CVc, C3583CVe> dm2, CVj cVj, DMO dmo, AuraBatteryEventStore auraBatteryEventStore) {
        try {
            try {
                AuraBatteryEventSnapshot auraBatteryEventSnapshotLoad = auraBatteryEventStore.load(((C3583CVe) dm2.A04).A03());
                if (auraBatteryEventSnapshotLoad != null) {
                    logMetrics(cVj, dmo, auraBatteryEventSnapshotLoad.metrics, auraBatteryEventSnapshotLoad.isAppInForeground ? "foreground" : "background", auraBatteryEventSnapshotLoad.appInstanceId, auraBatteryEventSnapshotLoad.currentSequence, "disk");
                }
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                CFK.A0A(TAG, "Failed to log previous battery session", e2);
            }
        } finally {
            auraBatteryEventStore.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [R extends X.CVd<R>, X.CVd] */
    /* JADX WARN: Type inference failed for: r1v1, types: [S extends X.CVf<R>, X.CVf] */
    /* JADX WARN: Type inference failed for: r1v2, types: [R extends X.CVd<R>, X.CVd] */
    /* JADX WARN: Type inference failed for: r2v3, types: [R extends X.CVd<R>, X.CVd] */
    public final void persistSnapshot(DM2<C3581CVc, C3583CVe> dm2, AuraBatteryEventStore auraBatteryEventStore, DMM dmm) {
        C3581CVc c3581CVc;
        try {
            boolean zA02 = dm2.A02 & dm2.A04.A02(dm2.A00);
            dm2.A02 = zA02;
            if (zA02) {
                ?? r1 = dm2.A00;
                ?? r0 = dm2.A01;
                ?? r2 = dm2.A03;
                r1.A02(r0, r2);
                c3581CVc = r2;
            } else {
                c3581CVc = null;
            }
            C3581CVc c3581CVc2 = c3581CVc;
            if (c3581CVc2 != null) {
                auraBatteryEventStore.store(new AuraBatteryEventSnapshot(c3581CVc2, AuraAppLifecycleManager.INSTANCE.isAppInForeground(), dmm.A00, dmm.A01.get()));
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            CFK.A0A(TAG, "Failed to persist battery snapshot", e2);
        }
    }
}
