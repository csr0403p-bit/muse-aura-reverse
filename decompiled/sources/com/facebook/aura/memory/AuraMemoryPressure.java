package com.facebook.aura.memory;

import X.C4JM;
import X.C7384Etj;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class AuraMemoryPressure implements ComponentCallbacks2 {
    public static volatile boolean attached;
    public static final AuraMemoryPressure INSTANCE = new AuraMemoryPressure();
    public static final CopyOnWriteArrayList<AuraTrimmable> trimmables = new CopyOnWriteArrayList<>();

    private final synchronized void attachIfNeeded() {
        Application application;
        if (!attached && (application = C4JM.A00) != null) {
            application.registerComponentCallbacks(this);
            attached = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0024  */
    @Override // android.content.ComponentCallbacks2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onTrimMemory(int r2) {
        /*
            r1 = this;
            r0 = 5
            if (r2 == r0) goto L27
            r0 = 10
            if (r2 == r0) goto L1b
            r0 = 15
            if (r2 == r0) goto L24
            r0 = 20
            if (r2 == r0) goto L21
            r0 = 40
            if (r2 == r0) goto L24
            r0 = 60
            if (r2 == r0) goto L24
            r0 = 80
            if (r2 == r0) goto L24
        L1b:
            com.facebook.aura.memory.AuraMemoryPressureLevel r0 = com.facebook.aura.memory.AuraMemoryPressureLevel.LOW
        L1d:
            r1.dispatch(r0)
            return
        L21:
            com.facebook.aura.memory.AuraMemoryPressureLevel r0 = com.facebook.aura.memory.AuraMemoryPressureLevel.BACKGROUNDED
            goto L1d
        L24:
            com.facebook.aura.memory.AuraMemoryPressureLevel r0 = com.facebook.aura.memory.AuraMemoryPressureLevel.CRITICAL
            goto L1d
        L27:
            com.facebook.aura.memory.AuraMemoryPressureLevel r0 = com.facebook.aura.memory.AuraMemoryPressureLevel.MODERATE
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.memory.AuraMemoryPressure.onTrimMemory(int):void");
    }

    public final void register(AuraTrimmable auraTrimmable) {
        C7384Etj.A0Y(auraTrimmable, 0);
        attachIfNeeded();
        trimmables.addIfAbsent(auraTrimmable);
    }

    public final void unregister(AuraTrimmable auraTrimmable) {
        C7384Etj.A0Y(auraTrimmable, 0);
        trimmables.remove(auraTrimmable);
    }

    private final void dispatch(AuraMemoryPressureLevel auraMemoryPressureLevel) {
        Iterator<AuraTrimmable> it = trimmables.iterator();
        while (it.hasNext()) {
            it.next().onMemoryPressure(auraMemoryPressureLevel);
        }
    }

    public final void clearAllCaches() {
        AuraByteLruCache auraByteLruCache;
        Iterator<AuraTrimmable> it = trimmables.iterator();
        while (it.hasNext()) {
            AuraTrimmable next = it.next();
            if ((next instanceof AuraByteLruCache) && (auraByteLruCache = (AuraByteLruCache) next) != null) {
                auraByteLruCache.clear();
            }
        }
    }

    public final long getCachedBytes() {
        AuraByteLruCache auraByteLruCache;
        Iterator<AuraTrimmable> it = trimmables.iterator();
        long retainedBytes = 0;
        while (it.hasNext()) {
            AuraTrimmable next = it.next();
            retainedBytes += (!(next instanceof AuraByteLruCache) || (auraByteLruCache = (AuraByteLruCache) next) == null) ? 0L : auraByteLruCache.getRetainedBytes();
        }
        return retainedBytes;
    }

    public final int getRegisteredCount() {
        return trimmables.size();
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        dispatch(AuraMemoryPressureLevel.CRITICAL);
    }
}
