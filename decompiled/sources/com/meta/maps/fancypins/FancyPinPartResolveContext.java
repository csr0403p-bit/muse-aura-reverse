package com.meta.maps.fancypins;

import X.AbstractC7607F5u;
import X.AnonymousClass003;
import X.C06H;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes6.dex */
public final class FancyPinPartResolveContext {
    public final Object attachedConfig;
    public final Map<String, Object> properties;
    public final FancyPinRuntimeClusterContext runtimeCluster;
    public final Map<String, String> style;

    public final Object getAttachedConfig() {
        return this.attachedConfig;
    }

    public final Map<String, Object> getProperties() {
        return this.properties;
    }

    public final FancyPinRuntimeClusterContext getRuntimeCluster() {
        return this.runtimeCluster;
    }

    public final Map<String, String> getStyle() {
        return this.style;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FancyPinPartResolveContext(Map<String, String> map, Map<String, ? extends Object> map2) {
        this(null, map, map2, null);
        AnonymousClass003.A0u(map, map2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FancyPinPartResolveContext(Object obj, Map<String, String> map, Map<String, ? extends Object> map2) {
        this(obj, map, map2, null);
        AnonymousClass003.A0x(map, map2);
    }

    public /* synthetic */ FancyPinPartResolveContext(Object obj, Map map, Map map2, FancyPinRuntimeClusterContext fancyPinRuntimeClusterContext, int i, C06H c06h) {
        this((i & 1) != 0 ? null : obj, map, map2, (i & 8) != 0 ? null : fancyPinRuntimeClusterContext);
    }

    public FancyPinPartResolveContext(Object obj, Map<String, String> map, Map<String, ? extends Object> map2, FancyPinRuntimeClusterContext fancyPinRuntimeClusterContext) {
        AnonymousClass003.A0x(map, map2);
        this.attachedConfig = obj;
        this.runtimeCluster = fancyPinRuntimeClusterContext;
        this.style = Collections.unmodifiableMap(AbstractC7607F5u.A14(map));
        this.properties = Collections.unmodifiableMap(AbstractC7607F5u.A14(map2));
    }
}
