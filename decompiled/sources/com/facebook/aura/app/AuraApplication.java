package com.facebook.aura.app;

import X.AbstractC1512AkJ;
import X.AbstractC3358CGz;
import X.AbstractC3422CMk;
import X.AbstractC7559F3s;
import X.BV4;
import X.BV5;
import X.BXw;
import X.BeM;
import X.C06H;
import X.C3cG;
import X.C4JM;
import X.C60O;
import X.C7384Etj;
import X.C7469Ex5;
import X.C7Je;
import X.CCR;
import X.CFK;
import X.CFM;
import X.CGF;
import X.CGH;
import X.EKi;
import X.ETi;
import android.app.ActivityThread;
import android.app.Application;
import android.content.Context;
import android.os.SystemClock;
import com.facebook.aura.applock.AppLockLifecycleObserver;
import com.facebook.aura.auth.AuraSessionManager;
import com.facebook.aura.crashreporting.AuraLacrimaConfig;
import com.facebook.aura.executors.AuraWorkManagerTaskExecutor;
import com.facebook.aura.executors.AuraWorkerFactoryHolder;
import com.facebook.aura.graphql.AuraGraphQLExecutorFactory;
import com.facebook.aura.hooks.lifecycle.impl.AuraLifecycleHooksImpl;
import com.facebook.aura.mobileconfig.AuraMobileConfig;
import com.facebook.aura.qpl.startup.HatchStartupQpl;
import com.facebook.aura.qpl.startup.points.HatchStartupPoints;
import com.facebook.aura.startup.AuraStartupMetricTracker;
import com.facebook.aura.startup.AuraStartupOrchestrator;
import com.facebook.aura.startup.appjob.ScopeFilter;
import com.facebook.aura.startup.lifecycle.AuraLifecycleObserver;
import com.facebook.aura.startup.qpl.AuraQplStartup;
import com.facebook.aura.ui.adaptive.AuraOrientationPolicy;
import com.facebook.perf.background.BackgroundStartupDetector;
import com.facebook.xplat.fbglog.FbGlog;
import java.io.IOException;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class AuraApplication extends Application implements CGF {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();

    public final class StartupTimings {
        public long abcEnd;
        public final long abcStart;
        public final long exopackageEnd;
        public final long exopackageStart;
        public final long processStartTime;

        public final void dump() {
            HatchStartupQpl.Companion.markerPointsForAttachBaseContext(this.processStartTime, this.abcStart, this.abcEnd, this.exopackageStart, this.exopackageEnd);
        }

        public final long getAbcEnd() {
            return this.abcEnd;
        }

        public final long getAbcStart() {
            return this.abcStart;
        }

        public final long getExopackageEnd() {
            return this.exopackageEnd;
        }

        public final long getExopackageStart() {
            return this.exopackageStart;
        }

        public final long getProcessStartTime() {
            return this.processStartTime;
        }

        public StartupTimings(long j, long j2, long j3, long j4, long j5) {
            this.processStartTime = j;
            this.abcStart = j2;
            this.abcEnd = j3;
            this.exopackageStart = j4;
            this.exopackageEnd = j5;
        }

        public final void setAbcEnd(long j) {
            this.abcEnd = j;
        }

        public /* synthetic */ StartupTimings(long j, long j2, long j3, long j4, long j5, int i, C06H c06h) {
            this(j, j2, (i & 4) != 0 ? -1L : j3, j4, j5);
        }
    }

    /* renamed from: com.facebook.aura.app.AuraApplication$attachBaseContext$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<AbstractC3358CGz> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final AbstractC3358CGz invoke() {
            return AuraSessionManager.INSTANCE.getCurrentSession();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ AbstractC3358CGz invoke() {
            return AuraSessionManager.INSTANCE.getCurrentSession();
        }
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        Context c7469Ex5;
        C7384Etj.A0Y(context, 0);
        long jUptimeMillis = SystemClock.uptimeMillis();
        super.attachBaseContext(context);
        long jA00 = CCR.A00();
        if (!C7384Etj.areEqual(C4JM.A00, this)) {
            C4JM.A00 = this;
            try {
                c7469Ex5 = getApplicationContext() == null ? new C7469Ex5(this) : this;
            } catch (Exception unused) {
                c7469Ex5 = this;
            }
            C4JM.A01 = c7469Ex5;
        }
        BXw.A01(ActivityThread.currentActivityThread());
        boolean z = CFK.A00;
        synchronized (CFK.class) {
            CFM cfm = CFM.A01;
            cfm.A00 = CFK.A02.AHn();
            CFK.A02 = cfm;
            AbstractC3422CMk.A00 = CFK.A02;
        }
        synchronized (CFK.class) {
            if (!(!CFK.A00)) {
                throw C3cG.A0Q("Log level has been frozen! You can't change it again.");
            }
            CFK.A02.Adl(4);
            Iterator it = CFK.A01.iterator();
            while (it.hasNext()) {
                it.next();
                FbGlog.setLogLevel(4);
            }
        }
        synchronized (CFK.class) {
            CFK.A00 = true;
        }
        HatchStartupQpl.Companion companion = HatchStartupQpl.Companion;
        companion.markerPoint(HatchStartupPoints.SOLOADER_INIT_START);
        try {
            ETi.A06(this, 0);
            companion.markerPoint(HatchStartupPoints.SOLOADER_INIT_END);
            BackgroundStartupDetector.Companion.A02(this, true, false, false, false, false);
            companion.markerPoint(HatchStartupPoints.LACRIMA_INIT_START);
            AuraLacrimaConfig.INSTANCE.earlyJavaInit(this, SystemClock.uptimeMillis(), AnonymousClass1.INSTANCE, new AuraApplication$attachBaseContext$$inlined$map$1(AuraSessionManager.state));
            companion.markerPoint(HatchStartupPoints.LACRIMA_INIT_END);
            companion.markerPoint(HatchStartupPoints.MC_INIT_START);
            AuraMobileConfig.INSTANCE.ensureInitialized();
            companion.markerPoint(HatchStartupPoints.MC_INIT_END);
            companion.markerPoint(HatchStartupPoints.SESSIONLESS_MC_READY);
            companion.markerPoint(HatchStartupPoints.GRAPHQL_INIT_START);
            AuraGraphQLExecutorFactory.INSTANCE.init();
            companion.markerPoint(HatchStartupPoints.GRAPHQL_INIT_END);
            companion.markerPoint(HatchStartupPoints.QPL_INIT_START);
            AuraQplStartup.INSTANCE.init(this);
            companion.markerPoint(HatchStartupPoints.QPL_INIT_END);
            companion.markerPointsForAttachBaseContext(jA00, jUptimeMillis, SystemClock.uptimeMillis(), -1L, -1L);
        } catch (IOException e) {
            throw BV4.A0e(e);
        }
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        CCR.A02 = SystemClock.uptimeMillis();
    }

    @Override // X.CGF
    public EKi getWorkManagerConfiguration() {
        CGH cgh = AuraWorkerFactoryHolder.workerFactory;
        C7384Etj.A0Y(cgh, 0);
        AuraWorkManagerTaskExecutor auraWorkManagerTaskExecutor = AuraWorkManagerTaskExecutor.INSTANCE;
        C7384Etj.A0Y(auraWorkManagerTaskExecutor, 0);
        BeM beM = new BeM() { // from class: com.facebook.aura.app.AuraApplication$workManagerConfiguration$1
            @Override // X.BeM
            public final void accept(Throwable th) {
                C7384Etj.A0Y(th, 0);
                CFK.A0A("AuraApplication", "WorkManager failed to initialize", th);
            }
        };
        C7384Etj.A0Y(beM, 0);
        return new EKi(beM, cgh, auraWorkManagerTaskExecutor);
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        AbstractC1512AkJ.A00 = true;
        C7Je.A02 = true;
        AuraStartupMetricTracker auraStartupMetricTracker = AuraStartupMetricTracker.instance;
        auraStartupMetricTracker.startColdStartImmediate(this, true);
        HatchStartupQpl.Companion companion = HatchStartupQpl.Companion;
        companion.markerPoint(HatchStartupPoints.APP_ON_CREATE_START);
        registerActivityLifecycleCallbacks(AuraOrientationPolicy.OrientationCallbacks.INSTANCE);
        C60O.A02().postAtFrontOfQueue(new Runnable() { // from class: com.facebook.aura.app.AuraApplication.onCreate.1
            @Override // java.lang.Runnable
            public final void run() {
                AuraLifecycleObserver.INSTANCE.init();
                AppLockLifecycleObserver.INSTANCE.init(AuraApplication.this);
                ((AuraLifecycleHooksImpl) BV5.A0Z(65537)).init();
            }
        });
        AuraStartupOrchestrator.INSTANCE.start(ScopeFilter.ALL_PROCESSES_ONLY);
        auraStartupMetricTracker.onBackgroundStartupDetectorInstalled(this, null);
        companion.markerPoint(HatchStartupPoints.APP_ON_CREATE_END);
    }
}
