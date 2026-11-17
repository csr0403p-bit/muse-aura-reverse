package com.facebook.aura.crashreporting;

import X.AbstractC3220C4c;
import X.AbstractC3225C4i;
import X.AbstractC3271C6y;
import X.AbstractC3277C7e;
import X.AbstractC3281C7l;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.BV4;
import X.BV5;
import X.BWq;
import X.BeS;
import X.C20Q;
import X.C2b;
import X.C3224C4h;
import X.C3226C4j;
import X.C3227C4k;
import X.C3230C4n;
import X.C3241C4y;
import X.C3248C5h;
import X.C3249C5j;
import X.C3252C5q;
import X.C3253C5s;
import X.C3255C5w;
import X.C3260C6d;
import X.C3267C6q;
import X.C3279C7i;
import X.C3280C7k;
import X.C3cG;
import X.C44;
import X.C4U;
import X.C4V;
import X.C54;
import X.C57;
import X.C59;
import X.C5C;
import X.C5E;
import X.C5U;
import X.C5V;
import X.C5W;
import X.C5Y;
import X.C5t;
import X.C61;
import X.C66;
import X.C67;
import X.C6B;
import X.C6H;
import X.C6P;
import X.C6X;
import X.C6Y;
import X.C7384Etj;
import X.C7603F5q;
import X.C78;
import X.C79;
import X.C7A;
import X.C7Je;
import X.C7V;
import X.C98;
import X.C9Y;
import X.CCR;
import X.CCY;
import X.CFK;
import X.CH0;
import X.EnumC3223C4g;
import X.EnumC3250C5k;
import X.F18;
import X.F4A;
import X.F4R;
import X.F4S;
import X.F4T;
import X.F60;
import X.InterfaceC3231C4o;
import X.InterfaceC3235C4s;
import X.InterfaceC3269C6v;
import android.app.Application;
import android.net.Uri;
import android.os.Trace;
import com.facebook.acra.constants.ReportField;
import com.facebook.aura.analytics.waterfall.HatchPriceImpressionEventDataKt;
import com.facebook.aura.appid.AuraClientToken;
import com.facebook.aura.common.prefs.HatchPrefsStore;
import com.facebook.aura.crashreporting.AuraLacrimaUserSessionManagerProvider;
import com.facebook.aura.network.endpoint.AuraEndpointSelector;
import com.facebook.errorreporting.field.ReportFieldString;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class AuraLacrimaConfig {
    public static final String TAG = "AuraLacrimaConfig";
    public static final String USER_AGENT = "Hatch-Android";
    public static C3241C4y lacrimaConfig;
    public static C20Q<? extends AbstractC3358CGz> nativeCrashSessions;
    public static Function0<? extends AbstractC3358CGz> userSessionProvider;
    public static final AuraLacrimaConfig INSTANCE = new AuraLacrimaConfig();
    public static final ReportFieldString isWatchField = new ReportFieldString(-2, "is_watch", true);
    public static final AuraReportPolicy reportPolicy = new AuraReportPolicy();

    public final class EarlyJavaInit implements InterfaceC3269C6v {
        public final InterfaceC3269C6v init;

        public EarlyJavaInit(InterfaceC3269C6v interfaceC3269C6v) {
            C7384Etj.A0Y(interfaceC3269C6v, 0);
            this.init = interfaceC3269C6v;
        }

        @Override // X.InterfaceC3269C6v
        public void init(C3241C4y c3241C4y) {
            C7384Etj.A0Y(c3241C4y, 0);
            try {
                this.init.init(c3241C4y);
            } catch (Throwable th) {
                CFK.A08(AuraLacrimaConfig.TAG, AnonymousClass001.A0v(" failed", BV5.A0q(this.init.getName())), th);
            }
        }

        public /* synthetic */ boolean canBeParallelized() {
            return true;
        }

        @Override // X.InterfaceC3269C6v
        public EnumC3250C5k getName() {
            EnumC3250C5k name = this.init.getName();
            C7384Etj.A0U(name);
            return name;
        }

        @Override // X.InterfaceC3269C6v
        public BWq getWhenToInit() {
            return BWq.EARLY_JAVA;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0272 A[Catch: all -> 0x02f9, TryCatch #6 {all -> 0x02f9, blocks: (B:73:0x026b, B:75:0x0272, B:119:0x02f8, B:76:0x0276, B:78:0x027d, B:80:0x0285, B:84:0x0291, B:118:0x02f5, B:81:0x028c, B:108:0x02bd, B:111:0x02c9, B:113:0x02db, B:114:0x02df, B:115:0x02f0, B:116:0x02f1, B:5:0x002a, B:7:0x002d, B:8:0x002e, B:10:0x0038, B:11:0x0042, B:13:0x006a, B:14:0x0073, B:16:0x007d, B:17:0x0086, B:19:0x009f, B:20:0x00a8, B:30:0x00ef, B:38:0x0136, B:45:0x0178, B:46:0x0182, B:50:0x018e, B:51:0x018f, B:52:0x0194, B:54:0x0197, B:55:0x0198, B:56:0x01ac, B:58:0x01b2, B:59:0x01e6, B:72:0x0259, B:87:0x0299, B:88:0x02a3, B:94:0x02a9, B:96:0x02ab, B:97:0x02ae, B:99:0x02b0, B:100:0x02b3, B:102:0x02b5, B:103:0x02b8, B:106:0x02bb), top: B:135:0x002a, inners: #0, #1, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0276 A[Catch: all -> 0x02f9, TryCatch #6 {all -> 0x02f9, blocks: (B:73:0x026b, B:75:0x0272, B:119:0x02f8, B:76:0x0276, B:78:0x027d, B:80:0x0285, B:84:0x0291, B:118:0x02f5, B:81:0x028c, B:108:0x02bd, B:111:0x02c9, B:113:0x02db, B:114:0x02df, B:115:0x02f0, B:116:0x02f1, B:5:0x002a, B:7:0x002d, B:8:0x002e, B:10:0x0038, B:11:0x0042, B:13:0x006a, B:14:0x0073, B:16:0x007d, B:17:0x0086, B:19:0x009f, B:20:0x00a8, B:30:0x00ef, B:38:0x0136, B:45:0x0178, B:46:0x0182, B:50:0x018e, B:51:0x018f, B:52:0x0194, B:54:0x0197, B:55:0x0198, B:56:0x01ac, B:58:0x01b2, B:59:0x01e6, B:72:0x0259, B:87:0x0299, B:88:0x02a3, B:94:0x02a9, B:96:0x02ab, B:97:0x02ae, B:99:0x02b0, B:100:0x02b3, B:102:0x02b5, B:103:0x02b8, B:106:0x02bb), top: B:135:0x002a, inners: #0, #1, #9 }] */
    /* JADX WARN: Type inference failed for: r0v45, types: [X.C7a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void earlyJavaInit(android.app.Application r19, long r20, kotlin.jvm.functions.Function0<? extends X.AbstractC3358CGz> r22, X.C20Q<? extends X.AbstractC3358CGz> r23) {
        /*
            Method dump skipped, instructions count: 768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.crashreporting.AuraLacrimaConfig.earlyJavaInit(android.app.Application, long, kotlin.jvm.functions.Function0, X.20Q):void");
    }

    /* JADX WARN: Type inference failed for: r23v0, types: [com.facebook.aura.crashreporting.AuraLacrimaConfig$createConfig$globalPropertiesRestart$1] */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.C7b] */
    private final C3241C4y createConfig(final Application application, long j) {
        final C3248C5h c3248C5h = new C3248C5h();
        C6X<C61> c6x = new C6X<C61>() { // from class: com.facebook.aura.crashreporting.AuraLacrimaConfig$createConfig$appStateSessionSummaryProvider$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // X.C6X
            public C61 create() {
                C54 c54 = C54.A09;
                return c54 == null ? new C61() : C61.A00(null, c54, c54.A01(c54.A07));
            }

            @Override // X.C6X
            public /* bridge */ /* synthetic */ C61 create() {
                C54 c54 = C54.A09;
                if (c54 == null) {
                    return new C61();
                }
                return C61.A00(null, c54, c54.A01(c54.A07));
            }
        };
        final C3267C6q c3267C6q = new C3267C6q(application);
        C5E<InterfaceC3231C4o> c5e = new C5E<InterfaceC3231C4o>() { // from class: com.facebook.aura.crashreporting.AuraLacrimaConfig$createConfig$globalProperties$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // X.C5E
            /* renamed from: create */
            public InterfaceC3231C4o create2(C3241C4y c3241C4y) {
                C7384Etj.A0Y(c3241C4y, 0);
                AbstractC3225C4i abstractC3225C4iInitializeGlobalProperties = AuraLacrimaConfig.INSTANCE.initializeGlobalProperties(c3241C4y);
                if (abstractC3225C4iInitializeGlobalProperties == null) {
                    return null;
                }
                return new C3224C4h(abstractC3225C4iInitializeGlobalProperties);
            }
        };
        ?? r23 = new C5E<InterfaceC3231C4o>() { // from class: com.facebook.aura.crashreporting.AuraLacrimaConfig$createConfig$globalPropertiesRestart$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // X.C5E
            /* renamed from: create */
            public InterfaceC3231C4o create2(C3241C4y c3241C4y) {
                C7384Etj.A0Y(c3241C4y, 0);
                File fileA01 = c3241C4y.A03().A01("");
                if (fileA01 == null) {
                    return null;
                }
                return new C3224C4h(C2b.A00(fileA01));
            }
        };
        C5E<InterfaceC3231C4o> c5e2 = new C5E() { // from class: com.facebook.aura.crashreporting.AuraLacrimaConfig$createConfig$userInfo$1
            @Override // X.C5E
            /* renamed from: create */
            public final InterfaceC3231C4o create2(C3241C4y c3241C4y) {
                C7384Etj.A0Y(c3241C4y, 0);
                F18 f4a = c3241C4y.A0B;
                if (f4a == null) {
                    f4a = new F4A(c3241C4y, 4);
                    c3241C4y.A0B = f4a;
                }
                return (InterfaceC3231C4o) f4a.get();
            }
        };
        C5E<InterfaceC3231C4o> c5e3 = new C5E() { // from class: com.facebook.aura.crashreporting.AuraLacrimaConfig$createConfig$appExitInfoCollector$1
            @Override // X.C5E
            /* renamed from: create */
            public final InterfaceC3231C4o create2(C3241C4y c3241C4y) {
                return new C6H(c3267C6q);
            }

            @Override // X.C5E
            /* renamed from: create */
            public /* bridge */ /* synthetic */ Object create2(C3241C4y c3241C4y) {
                return new C6H(c3267C6q);
            }
        };
        C3279C7i c3279C7i = C3279C7i.A00;
        C7V c7v = C66.A05;
        C7V c7v2 = new C7V() { // from class: com.facebook.aura.crashreporting.AuraLacrimaConfig$createConfig$javaConfigBuilder$1
            @Override // X.C7V
            public final boolean accept(Thread thread, Throwable th) {
                C7384Etj.A0Y(th, 1);
                AuraLacrimaConfig auraLacrimaConfig = AuraLacrimaConfig.INSTANCE;
                Application application2 = application;
                try {
                    HatchMemoryCrashAnnotator hatchMemoryCrashAnnotator = HatchMemoryCrashAnnotator.INSTANCE;
                    File filesDir = application2.getFilesDir();
                    C7384Etj.A0U(filesDir);
                    hatchMemoryCrashAnnotator.onJavaCrash(th, filesDir);
                    return true;
                } catch (Throwable th2) {
                    C3cG.A0s(th2);
                    return true;
                }
            }
        };
        C67.A00();
        Trace.beginSection("Config.createJavaDetectionConfig");
        try {
            C5t c5t = new C5t(EnumC3250C5k.A04);
            c5t.A00 = new C3255C5w(c3279C7i, c7v, c7v2);
            BWq bWq = BWq.EARLY_JAVA;
            c5t.A02 = bWq;
            F4R f4r = new F4R(6);
            C5C c5c = c5t.A04;
            List<C5E<InterfaceC3231C4o>> list = c5c.A02;
            list.add(f4r);
            C3230C4n c3230C4n = new C3230C4n();
            List<InterfaceC3231C4o> list2 = c5c.A03;
            list2.add(c3230C4n);
            F4R.A00(5, list);
            c5c.A08.add(new C7A(application));
            list2.add(new C6Y());
            Trace.endSection();
            c5t.A03 = true;
            c5t.A01 = new C5E() { // from class: com.facebook.aura.crashreporting.AuraLacrimaConfig$createConfig$javaConfigBuilder$2
                @Override // X.C5E
                /* renamed from: create */
                public AbstractC3220C4c create2(C3241C4y c3241C4y) {
                    C7384Etj.A0Y(c3241C4y, 0);
                    return new C3253C5s(application, c3248C5h, F18.A00(c3241C4y));
                }
            };
            list.add(new C5E<InterfaceC3231C4o>() { // from class: com.facebook.aura.crashreporting.AuraLacrimaConfig$createConfig$javaConfigBuilder$3
                @Override // X.C5E
                /* renamed from: create, reason: merged with bridge method [inline-methods] */
                public InterfaceC3231C4o create2(C3241C4y c3241C4y) {
                    C7384Etj.A0Y(c3241C4y, 0);
                    Application application2 = c3241C4y.A0E;
                    C6P c6p = new C6P();
                    c6p.A00 = application2;
                    return c6p;
                }
            });
            Integer num = C79.A01;
            C3252C5q c3252C5q = new C3252C5q();
            c3252C5q.A01 = num;
            c3252C5q.A00 = j;
            list2.add(c3252C5q);
            c5c.A04.add(c5e);
            c5c.A09.add(c5e);
            list.add(c5e3);
            if (c5e2 != null) {
                list.add(c5e2);
            }
            Trace.beginSection("Config.createUnexplainedConfig");
            C5t c5t2 = new C5t(EnumC3250C5k.A0C);
            c5t2.A00 = new F4T(7, c3267C6q, c6x);
            c5t2.A02 = bWq;
            F4R f4r2 = new F4R(22);
            List<C5E<InterfaceC3231C4o>> list3 = c5t2.A04.A04;
            list3.add(f4r2);
            F4R.A00(21, list3);
            F4R.A00(19, list3);
            F4R.A00(20, list3);
            c5t2.A01 = new F4T(6, application, c3248C5h);
            Trace.endSection();
            createConfig$addPreviousSessionCollectors(c5t2, r23, c5e3, c5e2);
            F18 f18 = new F18() { // from class: com.facebook.aura.crashreporting.AuraLacrimaConfig$createConfig$breakpadInit$1
                @Override // X.F18
                public final Long get() {
                    return 2064L;
                }

                @Override // X.F18
                public /* bridge */ /* synthetic */ Object get() {
                    return 2064L;
                }
            };
            F18 f182 = new F18() { // from class: com.facebook.aura.crashreporting.AuraLacrimaConfig$createConfig$breakpadInit$2
                @Override // X.F18
                public final Boolean get() {
                    return AnonymousClass001.A0h();
                }

                @Override // X.F18
                public /* bridge */ /* synthetic */ Object get() {
                    return AnonymousClass001.A0h();
                }
            };
            AuraReportPolicy auraReportPolicy = reportPolicy;
            EarlyJavaInit earlyJavaInit = new EarlyJavaInit(new C44(application, f18, f182));
            C5t c5t3 = new C5t(EnumC3250C5k.A05);
            c5t3.A00 = new F4T(3, c6x, application);
            BWq bWq2 = BWq.EARLY_NATIVE;
            c5t3.A02 = bWq2;
            F4R f4r3 = new F4R(10);
            C5C c5c2 = c5t3.A04;
            List<C5E<InterfaceC3231C4o>> list4 = c5c2.A04;
            list4.add(f4r3);
            F4R.A00(9, list4);
            F4R.A00(7, list4);
            F4R.A00(8, list4);
            c5t3.A01 = new F4T(2, application, c3248C5h);
            c5t3.A02 = bWq;
            createConfig$addPreviousSessionCollectors(c5t3, r23, c5e3, c5e2);
            C5E<InterfaceC3235C4s> c5e4 = c5t3.A00;
            BWq bWq3 = c5t3.A02;
            C59 c59 = new C59(c5c2, c5e4, c5t3.A01, c5t3.A05, bWq3, c5t3.A03);
            C5t c5t4 = new C5t(EnumC3250C5k.A06);
            c5t4.A00 = new F4S(application, 2);
            c5t4.A02 = bWq;
            F4R f4r4 = new F4R(11);
            C5C c5c3 = c5t4.A04;
            List<C5E<InterfaceC3231C4o>> list5 = c5c3.A02;
            list5.add(f4r4);
            c5t4.A01 = new F4T(4, application, c3248C5h);
            c5c3.A04.add(c5e);
            c5c3.A09.add(c5e);
            if (c5e2 != null) {
                list5.add(c5e2);
            }
            Trace.beginSection("Config.createAnrAppDeathConfig");
            C5t c5t5 = new C5t(EnumC3250C5k.A01);
            c5t5.A00 = new F4S(c6x, 1);
            c5t5.A02 = bWq2;
            F4R f4r5 = new F4R(3);
            List<C5E<InterfaceC3231C4o>> list6 = c5t5.A04.A04;
            list6.add(f4r5);
            F4R.A00(0, list6);
            F4R.A00(1, list6);
            F4R.A00(2, list6);
            c5t5.A01 = new F4T(0, application, c3248C5h);
            Trace.endSection();
            c5t5.A02 = bWq;
            createConfig$addPreviousSessionCollectors(c5t5, r23, c5e3, c5e2);
            C3249C5j c3249C5j = new C3249C5j(application);
            c3249C5j.A0B = new F18() { // from class: com.facebook.aura.crashreporting.AuraLacrimaConfig$createConfig$lacrimaConfigBuilder$1
                @Override // X.F18
                public final String get() {
                    Function0<? extends AbstractC3358CGz> function0 = AuraLacrimaConfig.userSessionProvider;
                    if (function0 == null) {
                        C7384Etj.A0b("userSessionProvider");
                        throw F60.createAndThrow();
                    }
                    AbstractC3358CGz abstractC3358CGzInvoke = function0.invoke();
                    if (abstractC3358CGzInvoke != null) {
                        return ((CH0) abstractC3358CGzInvoke).A01;
                    }
                    String string = HatchPrefsStore.INSTANCE.metaUserSessionPrefs().getString(ReportField.UID, null);
                    return string == null ? HatchPriceImpressionEventDataKt.NO_DISCOUNT : string;
                }
            };
            c3249C5j.A05 = new F18() { // from class: com.facebook.aura.crashreporting.AuraLacrimaConfig$createConfig$lacrimaConfigBuilder$2
                @Override // X.F18
                public /* bridge */ /* synthetic */ Object get() {
                    return BV4.A0f();
                }

                @Override // X.F18
                public final String get() {
                    return BV4.A0f();
                }
            };
            c3249C5j.A08 = new F18() { // from class: com.facebook.aura.crashreporting.AuraLacrimaConfig$createConfig$lacrimaConfigBuilder$3
                @Override // X.F18
                public final Boolean get() {
                    return AnonymousClass001.A0h();
                }

                @Override // X.F18
                public /* bridge */ /* synthetic */ Object get() {
                    return AnonymousClass001.A0h();
                }
            };
            c3249C5j.A00 = CCR.A00();
            c3249C5j.A01 = auraReportPolicy;
            Trace.beginSection("Config.createStartupConfig");
            if (AbstractC3277C7e.A00 != null) {
                CFK.A06(C9Y.TAG, "ErrorReportingDiagnosticData.setInstance already set.");
            } else {
                synchronized (C3226C4j.class) {
                }
                AbstractC3281C7l.A00();
                ?? r2 = new Object() { // from class: X.C7b
                };
                if (!AbstractC3271C6y.A01) {
                    AbstractC3271C6y.A00 = r2;
                    AbstractC3271C6y.A01 = true;
                }
                AbstractC3277C7e.A00 = new C3227C4k();
                synchronized (C3226C4j.class) {
                }
                C3226C4j.A00(C6B.A4P);
                C3226C4j.A00(C6B.A51);
                C3226C4j.A00(C6B.A56);
                C3226C4j.A00(C6B.A5E);
                C3226C4j.A00(C6B.A60);
                C3226C4j.A00(C6B.A08);
                C3226C4j.A00(C6B.A6Z);
                C3226C4j.A00(C6B.A6a);
                C3226C4j.A00(C6B.A20);
                C3226C4j.A00(C6B.A7D);
                C3226C4j.A00(C6B.A7G);
                C3226C4j.A00(C6B.A0J);
                C3226C4j.A00(C6B.A7i);
                C3226C4j.A00(C6B.A83);
                C3226C4j.A00(C6B.A8G);
                C3226C4j.A00(C6B.A8U);
                C3226C4j.A00(C6B.A8y);
                C3226C4j.A00(C6B.A8z);
                C3226C4j.A00(C6B.A98);
                C3226C4j.A00(C6B.A9E);
                C3226C4j.A00(C6B.A9R);
                C3226C4j.A00(C6B.A0h);
                C3226C4j.A00(C6B.A9h);
                C3226C4j.A00(C6B.A9i);
                C3226C4j.A00(C6B.A9j);
                C3226C4j.A00(C6B.AAJ);
                C3226C4j.A00(C6B.AAW);
                C3226C4j.A00(C6B.AAX);
                C3226C4j.A00(C6B.AAY);
                C3226C4j.A00(C6B.AAZ);
                C3226C4j.A00(C6B.AAl);
                C3226C4j.A00(C6B.AAs);
                C3226C4j.A00(C6B.AAr);
                C3226C4j.A00(C6B.AAq);
                C3226C4j.A00(C6B.AAz);
                C3226C4j.A00(C6B.AB1);
            }
            C5t c5t6 = new C5t(EnumC3250C5k.A08);
            c5t6.A00 = new F4R(15);
            F4S f4s = new F4S(application, 3);
            C5C c5c4 = c5t6.A04;
            List<C5E<InterfaceC3231C4o>> list7 = c5c4.A02;
            list7.add(f4s);
            F4R.A00(14, list7);
            F4R.A00(18, list7);
            Trace.endSection();
            Integer num2 = C79.A00;
            C3252C5q c3252C5q2 = new C3252C5q();
            c3252C5q2.A01 = num2;
            c3252C5q2.A00 = j;
            c5c4.A03.add(c3252C5q2);
            if (c5e2 != null) {
                list7.add(c5e2);
            }
            C3249C5j.A00(c5t6, c3249C5j);
            final C5W c5w = new C5W();
            synchronized (C5V.class) {
                C5V.A04 = c5w;
                List list8 = C5V.A00;
                Iterator it = list8.iterator();
                while (it.hasNext()) {
                    it.next();
                    C5V.A03.execute(new Runnable() { // from class: X.C6u
                        public static final String __redex_internal_original_name = "GlobalAppState$$ExternalSyntheticLambda4";

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean z = C5V.A06;
                            throw BV4.A0a("onInstanceSet");
                        }
                    });
                }
                list8.clear();
            }
            C57[] c57Arr = {new C5Y(c5w), new C3260C6d()};
            Trace.beginSection("Config.createLifecycleConfig");
            int i = 0;
            do {
                C2b.A00.add(c57Arr[i]);
                i++;
            } while (i < 2);
            C5t c5t7 = new C5t(EnumC3250C5k.A0A);
            c5t7.A00 = new F4R(16);
            c5t7.A02 = bWq;
            Trace.endSection();
            C3249C5j.A00(c5t7, c3249C5j);
            c3249C5j.A01(new C5U());
            Trace.beginSection("Config.createNavigationConfig");
            C5t c5t8 = new C5t(EnumC3250C5k.A0B);
            c5t8.A00 = new F4R(17);
            Trace.endSection();
            C3249C5j.A00(c5t8, c3249C5j);
            C3249C5j.A00(c5t, c3249C5j);
            c3249C5j.A01(earlyJavaInit);
            c3249C5j.A01(c59);
            C3249C5j.A00(c5t2, c3249C5j);
            C3249C5j.A00(c5t4, c3249C5j);
            C3249C5j.A00(c5t5, c3249C5j);
            Trace.beginSection("Config.createBugReportConfig");
            C5t c5t9 = new C5t(EnumC3250C5k.A03);
            c5t9.A00 = new F4R(4);
            BWq bWq4 = BWq.LATER;
            c5t9.A02 = bWq4;
            c5t9.A03 = true;
            c5t9.A01 = new F4T(1, application, c3248C5h);
            Trace.endSection();
            C3249C5j.A00(c5t9, c3249C5j);
            Trace.beginSection("Config.createSoftErrorConfig");
            C5t c5t10 = new C5t(EnumC3250C5k.A07);
            c5t10.A00 = new F4R(13);
            c5t10.A02 = bWq4;
            c5t10.A04.A07.add(new F4R(12));
            c5t10.A01 = new F4T(5, application, c3248C5h);
            Trace.endSection();
            C3249C5j.A00(c5t10, c3249C5j);
            c3249C5j.A07 = new F18() { // from class: com.facebook.aura.crashreporting.AuraLacrimaConfig$createConfig$lacrimaConfigBuilder$4
                @Override // X.F18
                public final C4U get() {
                    Function0<? extends AbstractC3358CGz> function0 = AuraLacrimaConfig.userSessionProvider;
                    if (function0 == null) {
                        C7384Etj.A0b("userSessionProvider");
                        throw F60.createAndThrow();
                    }
                    AuraBugReportSender auraBugReportSender = new AuraBugReportSender(new AuraLacrimaUserSessionManagerProvider.AnonymousClass1(new AuraLacrimaUserSessionManagerProvider(function0)), AuraClientToken.loggedOutARAccessToken, "4331325740476680", AuraLacrimaConfig.USER_AGENT, BV4.A0f(), 30000, new AuraLacrimaSenderCallback(), new AuraEndpointSelector());
                    Uri uriA01 = null;
                    try {
                        uriA01 = C7Je.A01(C3241C4y.A0b);
                    } catch (SecurityException | UnsupportedOperationException unused) {
                    }
                    if (uriA01 == null) {
                        CFK.A04(AuraLacrimaConfig.TAG, "Failed to parse crash report upload URI \u2014 sender disabled");
                        return null;
                    }
                    CCY ccy = new CCY();
                    C4V c4v = new C4V();
                    c4v.A01 = new C3280C7k(uriA01, ccy, null, AuraLacrimaConfig.USER_AGENT);
                    c4v.A00 = auraBugReportSender;
                    return c4v;
                }
            };
            c3249C5j.A04 = new F18() { // from class: com.facebook.aura.crashreporting.AuraLacrimaConfig$createConfig$lacrimaConfigBuilder$5
                @Override // X.F18
                public final C78 get() {
                    return new C78();
                }

                @Override // X.F18
                public /* bridge */ /* synthetic */ Object get() {
                    return new C78();
                }
            };
            c3249C5j.A0C = true;
            if (c3249C5j.A09 == null) {
                c3249C5j.A09 = new F4A(AbstractC3281C7l.A00(), 0);
            }
            if (c3249C5j.A05 == null) {
                CFK.A06(C9Y.TAG, "LacrimaConfigBuilder.setDeviceId not called, using 0");
                c3249C5j.A05 = new F4A(HatchPriceImpressionEventDataKt.NO_DISCOUNT, 0);
            }
            if (c3249C5j.A0B == null) {
                CFK.A06(C9Y.TAG, "LacrimaConfigBuilder.setUserId not called, using 0");
                c3249C5j.A0B = new F4A(HatchPriceImpressionEventDataKt.NO_DISCOUNT, 0);
            }
            if (c3249C5j.A03 == null) {
                CFK.A06(C9Y.TAG, "LacrimaConfigBuilder.setUserIdActorId not called, using 0");
                c3249C5j.A03 = new F4A(HatchPriceImpressionEventDataKt.NO_DISCOUNT, 0);
            }
            if (c3249C5j.A02 == null) {
                CFK.A06(C9Y.TAG, "LacrimaConfigBuilder.setUserIdActingAccountId not called, using 0");
                c3249C5j.A02 = new F4A(HatchPriceImpressionEventDataKt.NO_DISCOUNT, 0);
            }
            if (c3249C5j.A08 == null) {
                CFK.A06(C9Y.TAG, "LacrimaConfigBuilder.setIsEmployee not called, using false");
                c3249C5j.A08 = new F4A(false, 0);
            }
            if (c3249C5j.A0A == null) {
                c3249C5j.A0A = new F4A(new C7603F5q(c3249C5j, 2), 1);
            }
            if (c3249C5j.A06 == null) {
                c3249C5j.A06 = new F4A(new C7603F5q(c3249C5j, 3), 1);
            }
            Application application2 = c3249C5j.A0D;
            application2.getApplicationInfo();
            F18<String> f183 = c3249C5j.A09;
            F18<String> f184 = c3249C5j.A05;
            F18<String> f185 = c3249C5j.A0B;
            F18<String> f186 = c3249C5j.A03;
            F18<String> f187 = c3249C5j.A02;
            F18<Boolean> f188 = c3249C5j.A08;
            return new C3241C4y(application2, c3249C5j.A01, c3249C5j.A0E, c3249C5j.A0F, c3249C5j.A0G, c3249C5j.A0H, f183, f184, f185, f186, f187, f188, c3249C5j.A0A, c3249C5j.A06, c3249C5j.A07, c3249C5j.A04, c3249C5j.A00, c3249C5j.A0C);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public static final C5t createConfig$addPreviousSessionCollectors(C5t c5t, AuraLacrimaConfig$createConfig$globalPropertiesRestart$1 auraLacrimaConfig$createConfig$globalPropertiesRestart$1, C5E<InterfaceC3231C4o> c5e, C5E<InterfaceC3231C4o> c5e2) {
        if (auraLacrimaConfig$createConfig$globalPropertiesRestart$1 != null) {
            C5C c5c = c5t.A04;
            c5c.A04.add(auraLacrimaConfig$createConfig$globalPropertiesRestart$1);
            c5c.A09.add(auraLacrimaConfig$createConfig$globalPropertiesRestart$1);
        }
        if (c5e != null) {
            c5t.A04.A02.add(c5e);
        }
        if (c5e2 != null) {
            c5t.A04.A02.add(c5e2);
        }
        return c5t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC3225C4i initializeGlobalProperties(C3241C4y c3241C4y) {
        if (C98.A00 == C98.A03) {
            File file = c3241C4y.A03().A05;
            BeS.A03(file, "Did you call SessionManager.init()?");
            AbstractC3225C4i abstractC3225C4iA00 = C2b.A00(file);
            if (abstractC3225C4iA00 == null) {
                return null;
            }
            C98.A00(abstractC3225C4iA00);
        }
        AbstractC3225C4i abstractC3225C4i = C98.A00;
        abstractC3225C4i.A01(isWatchField, EnumC3223C4g.CRITICAL_REPORT, c3241C4y.A0E.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? "1" : HatchPriceImpressionEventDataKt.NO_DISCOUNT);
        return abstractC3225C4i;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00e8 A[Catch: all -> 0x02c8, TRY_LEAVE, TryCatch #5 {all -> 0x02c8, blocks: (B:10:0x0021, B:12:0x0025, B:36:0x00e1, B:52:0x0162, B:58:0x017a, B:37:0x00e4, B:39:0x00e8, B:53:0x0166, B:51:0x015c, B:54:0x016f, B:56:0x0173, B:57:0x0176, B:59:0x017b, B:64:0x01be, B:66:0x01d3, B:68:0x01e3, B:69:0x01e6, B:70:0x01e9, B:71:0x01f1, B:73:0x01f7, B:75:0x0213, B:77:0x021b, B:79:0x0221, B:81:0x0225, B:85:0x024a, B:84:0x022d, B:83:0x022b, B:87:0x0263, B:89:0x0267, B:90:0x026c, B:92:0x0277, B:93:0x027f, B:95:0x0288, B:96:0x028f, B:98:0x0296, B:99:0x029b, B:101:0x02ac, B:103:0x02b0, B:106:0x02bb, B:105:0x02b6, B:60:0x019e, B:61:0x01a7, B:63:0x01ad, B:40:0x00f6, B:41:0x00fc, B:43:0x0102, B:45:0x0137, B:47:0x014a, B:48:0x014e, B:49:0x015a), top: B:121:0x0021, inners: #2, #3, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0173 A[Catch: all -> 0x02c8, TryCatch #5 {all -> 0x02c8, blocks: (B:10:0x0021, B:12:0x0025, B:36:0x00e1, B:52:0x0162, B:58:0x017a, B:37:0x00e4, B:39:0x00e8, B:53:0x0166, B:51:0x015c, B:54:0x016f, B:56:0x0173, B:57:0x0176, B:59:0x017b, B:64:0x01be, B:66:0x01d3, B:68:0x01e3, B:69:0x01e6, B:70:0x01e9, B:71:0x01f1, B:73:0x01f7, B:75:0x0213, B:77:0x021b, B:79:0x0221, B:81:0x0225, B:85:0x024a, B:84:0x022d, B:83:0x022b, B:87:0x0263, B:89:0x0267, B:90:0x026c, B:92:0x0277, B:93:0x027f, B:95:0x0288, B:96:0x028f, B:98:0x0296, B:99:0x029b, B:101:0x02ac, B:103:0x02b0, B:106:0x02bb, B:105:0x02b6, B:60:0x019e, B:61:0x01a7, B:63:0x01ad, B:40:0x00f6, B:41:0x00fc, B:43:0x0102, B:45:0x0137, B:47:0x014a, B:48:0x014e, B:49:0x015a), top: B:121:0x0021, inners: #2, #3, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017b A[Catch: all -> 0x02c8, TRY_LEAVE, TryCatch #5 {all -> 0x02c8, blocks: (B:10:0x0021, B:12:0x0025, B:36:0x00e1, B:52:0x0162, B:58:0x017a, B:37:0x00e4, B:39:0x00e8, B:53:0x0166, B:51:0x015c, B:54:0x016f, B:56:0x0173, B:57:0x0176, B:59:0x017b, B:64:0x01be, B:66:0x01d3, B:68:0x01e3, B:69:0x01e6, B:70:0x01e9, B:71:0x01f1, B:73:0x01f7, B:75:0x0213, B:77:0x021b, B:79:0x0221, B:81:0x0225, B:85:0x024a, B:84:0x022d, B:83:0x022b, B:87:0x0263, B:89:0x0267, B:90:0x026c, B:92:0x0277, B:93:0x027f, B:95:0x0288, B:96:0x028f, B:98:0x0296, B:99:0x029b, B:101:0x02ac, B:103:0x02b0, B:106:0x02bb, B:105:0x02b6, B:60:0x019e, B:61:0x01a7, B:63:0x01ad, B:40:0x00f6, B:41:0x00fc, B:43:0x0102, B:45:0x0137, B:47:0x014a, B:48:0x014e, B:49:0x015a), top: B:121:0x0021, inners: #2, #3, #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void laterInit() {
        /*
            Method dump skipped, instructions count: 719
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.crashreporting.AuraLacrimaConfig.laterInit():void");
    }
}
