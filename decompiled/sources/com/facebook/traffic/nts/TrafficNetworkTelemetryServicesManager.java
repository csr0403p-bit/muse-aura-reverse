package com.facebook.traffic.nts;

import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.CFK;
import com.facebook.debug.tracer.Tracer;
import com.facebook.jni.HybridData;
import com.facebook.traffic.nts.amp.ActiveMeasurementPlatform;
import com.facebook.traffic.nts.appnetsessionid.AppNetSessionIdManager;
import com.facebook.traffic.nts.providers.TrafficNTSProvidersAppLayer;
import com.facebook.traffic.nts.tasos.bwemanager.BWEManagerV2;
import com.facebook.traffic.nts.tasos.congestionmanager.CongestionManager;
import com.facebook.traffic.nts.tasos.dccmanager.TasosDccManager;
import com.facebook.traffic.nts.tasos.http_layer_bwe.HttpLayerBwe;
import com.facebook.traffic.nts.tasos.tasosnetworkinfo.TasosNetworkInfo;

/* loaded from: classes6.dex */
public final class TrafficNetworkTelemetryServicesManager implements TasosInterface {
    public static final Companion Companion = new Companion();
    public static final Object mutex = C3cG.A0T();
    public static TrafficNetworkTelemetryServicesManager sharedManager;
    public final TrafficNTSManagerConfigInterface config;
    public HybridData mHybridData;
    public HybridData postHybridData;
    public boolean postInitDone;
    public final TrafficNTSProvidersAppLayer providers;

    public final class Companion {
        public final void initializeManagerAndAllModules(TrafficNTSManagerConfigInterface trafficNTSManagerConfigInterface, TrafficNTSProvidersAppLayer trafficNTSProvidersAppLayer) {
            TrafficNTSManagerConfigInterface trafficNTSManagerConfigInterface2;
            TrafficNetworkTelemetryServicesManager trafficNetworkTelemetryServicesManager;
            C7384Etj.A0Y(trafficNTSManagerConfigInterface, 0);
            Tracer.A01("Companion.initializeManagerAndAllModules");
            try {
                synchronized (TrafficNetworkTelemetryServicesManager.mutex) {
                    if (TrafficNetworkTelemetryServicesManager.sharedManager == null) {
                        TrafficNetworkTelemetryServicesManager trafficNetworkTelemetryServicesManager2 = new TrafficNetworkTelemetryServicesManager(trafficNTSManagerConfigInterface, trafficNTSProvidersAppLayer);
                        TrafficNetworkTelemetryServicesManager.sharedManager = trafficNetworkTelemetryServicesManager2;
                        trafficNetworkTelemetryServicesManager2.loadPostInit();
                        TrafficNetworkTelemetryServicesManager trafficNetworkTelemetryServicesManager3 = TrafficNetworkTelemetryServicesManager.sharedManager;
                        if (trafficNetworkTelemetryServicesManager3 != null && (trafficNTSManagerConfigInterface2 = trafficNetworkTelemetryServicesManager3.config) != null && trafficNTSManagerConfigInterface2.getEnableNetSeer() && (trafficNetworkTelemetryServicesManager = TrafficNetworkTelemetryServicesManager.sharedManager) != null) {
                            trafficNetworkTelemetryServicesManager.initNetSeer();
                        }
                        TrafficNetworkTelemetryServicesManager trafficNetworkTelemetryServicesManager4 = TrafficNetworkTelemetryServicesManager.sharedManager;
                        if (trafficNetworkTelemetryServicesManager4 != null) {
                            TasosInterface.Companion.setInstance(trafficNetworkTelemetryServicesManager4);
                        }
                    }
                }
            } finally {
                Tracer.A00();
            }
        }

        public final void initializeManagerAndCriticalModulesOnly(TrafficNTSManagerConfigInterface trafficNTSManagerConfigInterface, TrafficNTSProvidersAppLayer trafficNTSProvidersAppLayer) {
            C7384Etj.A0Y(trafficNTSManagerConfigInterface, 0);
            Tracer.A01("Companion.initializeManagerAndCriticalModulesOnly");
            try {
                synchronized (TrafficNetworkTelemetryServicesManager.mutex) {
                    if (TrafficNetworkTelemetryServicesManager.sharedManager == null) {
                        TrafficNetworkTelemetryServicesManager trafficNetworkTelemetryServicesManager = new TrafficNetworkTelemetryServicesManager(trafficNTSManagerConfigInterface, trafficNTSProvidersAppLayer);
                        TrafficNetworkTelemetryServicesManager.sharedManager = trafficNetworkTelemetryServicesManager;
                        TasosInterface.Companion.setInstance(trafficNetworkTelemetryServicesManager);
                    }
                }
            } finally {
                Tracer.A00();
            }
        }

        public final TrafficNetworkTelemetryServicesManager getManager() {
            TrafficNetworkTelemetryServicesManager trafficNetworkTelemetryServicesManager;
            synchronized (TrafficNetworkTelemetryServicesManager.mutex) {
                trafficNetworkTelemetryServicesManager = TrafficNetworkTelemetryServicesManager.sharedManager;
            }
            return trafficNetworkTelemetryServicesManager;
        }

        public final void initializeNetSeer() {
            TrafficNTSManagerConfigInterface trafficNTSManagerConfigInterface;
            TrafficNetworkTelemetryServicesManager trafficNetworkTelemetryServicesManager;
            Tracer.A01("Companion.initializeNetSeer");
            try {
                synchronized (TrafficNetworkTelemetryServicesManager.mutex) {
                    TrafficNetworkTelemetryServicesManager trafficNetworkTelemetryServicesManager2 = TrafficNetworkTelemetryServicesManager.sharedManager;
                    if (trafficNetworkTelemetryServicesManager2 != null && (trafficNTSManagerConfigInterface = trafficNetworkTelemetryServicesManager2.config) != null && trafficNTSManagerConfigInterface.getEnableNetSeer() && (trafficNetworkTelemetryServicesManager = TrafficNetworkTelemetryServicesManager.sharedManager) != null) {
                        trafficNetworkTelemetryServicesManager.initNetSeer();
                    }
                }
            } finally {
                Tracer.A00();
            }
        }

        public final void initializeNonCriticalModules() {
            Tracer.A01("Companion.initializeNonCriticalModules");
            try {
                synchronized (TrafficNetworkTelemetryServicesManager.mutex) {
                    TrafficNetworkTelemetryServicesManager trafficNetworkTelemetryServicesManager = TrafficNetworkTelemetryServicesManager.sharedManager;
                    if (trafficNetworkTelemetryServicesManager != null) {
                        trafficNetworkTelemetryServicesManager.loadPostInit();
                    }
                }
            } finally {
                Tracer.A00();
            }
        }

        public Companion() {
        }

        private final HybridData initHybrid(TrafficNTSManagerConfigInterface trafficNTSManagerConfigInterface, TrafficNTSProvidersAppLayer trafficNTSProvidersAppLayer) {
            return TrafficNetworkTelemetryServicesManager.initHybrid(trafficNTSManagerConfigInterface, trafficNTSProvidersAppLayer);
        }

        private final HybridData initPostHybrid(TrafficNetworkTelemetryServicesManager trafficNetworkTelemetryServicesManager) {
            return TrafficNetworkTelemetryServicesManager.initPostHybrid(trafficNetworkTelemetryServicesManager);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public static final native HybridData initHybrid(TrafficNTSManagerConfigInterface trafficNTSManagerConfigInterface, TrafficNTSProvidersAppLayer trafficNTSProvidersAppLayer);

    public static final native HybridData initPostHybrid(TrafficNetworkTelemetryServicesManager trafficNetworkTelemetryServicesManager);

    public final native ActiveMeasurementPlatform getAmp();

    @Override // com.facebook.traffic.nts.TasosInterface
    public native AppNetSessionIdManager getAppNetSessionIdManager();

    @Override // com.facebook.traffic.nts.TasosInterface
    public native BWEManagerV2 getBWEManager();

    @Override // com.facebook.traffic.nts.TasosInterface
    public native CongestionManager getCongestionManager();

    @Override // com.facebook.traffic.nts.TasosInterface
    public native HttpLayerBwe getHttpLayerBwe();

    @Override // com.facebook.traffic.nts.TasosInterface
    public native TasosDccManager getTasosDccManager();

    @Override // com.facebook.traffic.nts.TasosInterface
    public native TasosNetworkInfo getTasosNetworkInfo();

    public final native void initNetSeer();

    public final native void postInit();

    public static final TrafficNetworkTelemetryServicesManager getManager() {
        return Companion.getManager();
    }

    private final void initTNTSManager(TrafficNTSManagerConfigInterface trafficNTSManagerConfigInterface, TrafficNTSProvidersAppLayer trafficNTSProvidersAppLayer) {
        Tracer.A01("TrafficNetworkTelemetryServicesManager.initTNTSManager");
        try {
            TrafficNTSModule.loadLibrary();
            this.mHybridData = initHybrid(trafficNTSManagerConfigInterface, trafficNTSProvidersAppLayer);
        } finally {
            Tracer.A00();
        }
    }

    public static final void initializeManagerAndAllModules(TrafficNTSManagerConfigInterface trafficNTSManagerConfigInterface, TrafficNTSProvidersAppLayer trafficNTSProvidersAppLayer) {
        Companion.initializeManagerAndAllModules(trafficNTSManagerConfigInterface, trafficNTSProvidersAppLayer);
    }

    public static final void initializeManagerAndCriticalModulesOnly(TrafficNTSManagerConfigInterface trafficNTSManagerConfigInterface, TrafficNTSProvidersAppLayer trafficNTSProvidersAppLayer) {
        Companion.initializeManagerAndCriticalModulesOnly(trafficNTSManagerConfigInterface, trafficNTSProvidersAppLayer);
    }

    public static final void initializeNetSeer() {
        Companion.initializeNetSeer();
    }

    public static final void initializeNonCriticalModules() {
        Companion.initializeNonCriticalModules();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadPostInit() {
        Tracer.A01("TrafficNetworkTelemetryServicesManager.loadPostInit");
        try {
            if (this.postInitDone) {
                CFK.A04("TNTS", "TrafficNetworkTelemetryServicesManager postInit triggered again!");
            } else {
                TrafficNTSManagerPostInitModule.loadLibrary();
                this.postHybridData = initPostHybrid(this);
                postInit();
                this.postInitDone = true;
            }
        } finally {
            Tracer.A00();
        }
    }

    public final TrafficNTSProvidersAppLayer getProviders() {
        return this.providers;
    }

    public TrafficNetworkTelemetryServicesManager(TrafficNTSManagerConfigInterface trafficNTSManagerConfigInterface, TrafficNTSProvidersAppLayer trafficNTSProvidersAppLayer) {
        this.config = trafficNTSManagerConfigInterface;
        this.providers = trafficNTSProvidersAppLayer;
        initTNTSManager(trafficNTSManagerConfigInterface, trafficNTSProvidersAppLayer);
    }

    public /* synthetic */ TrafficNetworkTelemetryServicesManager(TrafficNTSManagerConfigInterface trafficNTSManagerConfigInterface, TrafficNTSProvidersAppLayer trafficNTSProvidersAppLayer, C06H c06h) {
        this(trafficNTSManagerConfigInterface, trafficNTSProvidersAppLayer);
    }
}
