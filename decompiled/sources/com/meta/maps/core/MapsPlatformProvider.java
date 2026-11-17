package com.meta.maps.core;

import X.C06H;
import com.meta.maps.NativeBase;

/* loaded from: classes4.dex */
public class MapsPlatformProvider extends NativeBase {
    public static final Companion Companion = new Companion();

    public interface ServiceResolver {
        boolean apply(ServiceType serviceType);
    }

    public final class ServiceResolverImpl extends NativeBase implements ServiceResolver {
        public static final Companion Companion = new Companion();

        public static final native void disposeNativeHandle(long j);

        @Override // com.meta.maps.core.MapsPlatformProvider.ServiceResolver
        public native boolean apply(ServiceType serviceType);

        public ServiceResolverImpl(long j, Object obj) {
            super(j, Companion);
        }

        public final class Companion implements NativeBase.Disposer {
            public /* synthetic */ Companion(C06H c06h) {
            }

            private final void disposeNativeHandle(long j) {
                ServiceResolverImpl.disposeNativeHandle(j);
            }

            @Override // com.meta.maps.NativeBase.Disposer
            public void dispose(long j) {
                ServiceResolverImpl.disposeNativeHandle(j);
            }

            public Companion() {
            }
        }
    }

    private final native void cacheThisInstance();

    public static final native long create();

    public static final native void disposeNativeHandle(long j);

    public final native Providing getService(ServiceType serviceType);

    public final native boolean hasService(ServiceType serviceType);

    public final native void putInstance(ServiceType serviceType, Providing providing);

    public final native void putOrReplace(ServiceType serviceType, Providing providing);

    public final native void removeService(ServiceType serviceType);

    public final native boolean resolveService(ServiceType serviceType);

    public final native void setServiceResolver(ServiceResolver serviceResolver);

    public final class Companion implements NativeBase.Disposer {
        public final long create() {
            return MapsPlatformProvider.create();
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        private final void disposeNativeHandle(long j) {
            MapsPlatformProvider.disposeNativeHandle(j);
        }

        @Override // com.meta.maps.NativeBase.Disposer
        public void dispose(long j) {
            MapsPlatformProvider.disposeNativeHandle(j);
        }

        public Companion() {
        }
    }

    public MapsPlatformProvider(long j, Object obj) {
        super(j, Companion);
    }

    public MapsPlatformProvider() {
        super(create(), Companion);
        cacheThisInstance();
    }
}
