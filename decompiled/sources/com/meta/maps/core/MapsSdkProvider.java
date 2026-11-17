package com.meta.maps.core;

import X.AbstractC0878AGe;
import X.AnonymousClass003;
import X.C06H;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.F60;
import com.meta.maps.core.MapsPlatformProvider;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class MapsSdkProvider extends MapsPlatformProvider {
    public static final Companion Companion;
    public static final Object registryLock;
    public static final LinkedHashMap<String, SdkModuleBase> sdkModules;
    public final ConcurrentHashMap<ServiceType, Providing> kotlinServices = C60O.A1C();
    public final ConcurrentHashMap<ServiceType, Function0<Providing>> kotlinFactories = C60O.A1C();

    public final class Companion {
        public final AutoCloseable onLoaded(Function0<Unit> function0) {
            C7384Etj.A0Y(function0, 0);
            List<SdkModuleBase> listRegisteredModules = registeredModules();
            LoadedSubscription loadedSubscription = new LoadedSubscription(listRegisteredModules.size(), function0);
            Iterator<SdkModuleBase> it = listRegisteredModules.iterator();
            while (it.hasNext()) {
                loadedSubscription.attach(it.next().addOnLoadedListener$xplat_maps_sdk_packages_core_core_kotlin(new MapsSdkProvider$Companion$onLoaded$1$1(loadedSubscription)));
            }
            loadedSubscription.deliverIfReady();
            return loadedSubscription;
        }

        public final void register(SdkModuleBase sdkModuleBase, boolean z) {
            C7384Etj.A0Y(sdkModuleBase, 0);
            String name = sdkModuleBase.getName();
            synchronized (MapsSdkProvider.registryLock) {
                MapsSdkProvider.sdkModules.put(name, sdkModuleBase);
            }
            if (z) {
                sdkModuleBase.ensureLoaded();
            }
        }

        private final List<SdkModuleBase> registeredModules() {
            List<SdkModuleBase> listA0X;
            synchronized (MapsSdkProvider.registryLock) {
                Collection<SdkModuleBase> collectionValues = MapsSdkProvider.sdkModules.values();
                C7384Etj.A0U(collectionValues);
                listA0X = AbstractC0878AGe.A0X(collectionValues);
            }
            return listA0X;
        }

        public final void loadLibrary() {
            Iterator<SdkModuleBase> it = registeredModules().iterator();
            while (it.hasNext()) {
                it.next().ensureLoaded();
            }
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final /* synthetic */ <T extends Providing> T get(ServiceType serviceType) {
        C7384Etj.A0Y(serviceType, 0);
        getByType(serviceType);
        C7384Etj.A0Q();
        throw F60.createAndThrow();
    }

    public final Providing getByType(ServiceType serviceType) {
        C7384Etj.A0Y(serviceType, 0);
        synchronized (this) {
            Providing providingInvoke = this.kotlinServices.get(serviceType);
            if (providingInvoke == null) {
                Function0<Providing> function0Remove = this.kotlinFactories.remove(serviceType);
                if (function0Remove == null) {
                    return null;
                }
                providingInvoke = function0Remove.invoke();
                this.kotlinServices.put(serviceType, providingInvoke);
                putInstance(serviceType, providingInvoke);
            }
            return providingInvoke;
        }
    }

    public final void setAnalytics(Analytics analytics) {
        C7384Etj.A0Y(analytics, 0);
        synchronized (this) {
            ConcurrentHashMap<ServiceType, Providing> concurrentHashMap = this.kotlinServices;
            ServiceType serviceType = ServiceType.ANALYTICS;
            concurrentHashMap.put(serviceType, analytics);
            this.kotlinFactories.remove(serviceType);
            putOrReplace(serviceType, analytics);
        }
    }

    public final void setHttpClient(HttpClient httpClient) {
        C7384Etj.A0Y(httpClient, 0);
        synchronized (this) {
            ConcurrentHashMap<ServiceType, Providing> concurrentHashMap = this.kotlinServices;
            ServiceType serviceType = ServiceType.HTTP_CLIENT;
            concurrentHashMap.put(serviceType, httpClient);
            this.kotlinFactories.remove(serviceType);
            putOrReplace(serviceType, httpClient);
        }
    }

    static {
        Companion companion = new Companion();
        Companion = companion;
        registryLock = C3cG.A0T();
        sdkModules = C3cG.A0j();
        companion.register(SdkModule.INSTANCE, true);
    }

    public final Analytics getAnalytics() {
        Providing byType = getByType(ServiceType.ANALYTICS);
        if (byType instanceof Analytics) {
            return (Analytics) byType;
        }
        return null;
    }

    public final HttpClient getHttpClient() {
        Providing byType = getByType(ServiceType.HTTP_CLIENT);
        if (byType instanceof HttpClient) {
            return (HttpClient) byType;
        }
        return null;
    }

    public MapsSdkProvider() {
        setServiceResolver(new MapsPlatformProvider.ServiceResolver() { // from class: com.meta.maps.core.MapsSdkProvider.1
            @Override // com.meta.maps.core.MapsPlatformProvider.ServiceResolver
            public final boolean apply(ServiceType serviceType) {
                C7384Etj.A0Y(serviceType, 0);
                return MapsSdkProvider.this.getByType(serviceType) != null;
            }
        });
    }

    public final void putIfAbsent(ServiceType serviceType, Function0<? extends Providing> function0, boolean z) {
        AnonymousClass003.A0u(serviceType, function0);
        synchronized (this) {
            if (!this.kotlinServices.containsKey(serviceType) && !this.kotlinFactories.containsKey(serviceType)) {
                if (z) {
                    Providing providingInvoke = function0.invoke();
                    this.kotlinServices.put(serviceType, providingInvoke);
                    putInstance(serviceType, providingInvoke);
                } else {
                    this.kotlinFactories.put(serviceType, function0);
                }
            }
        }
    }
}
