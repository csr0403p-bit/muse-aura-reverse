package com.meta.maps.fancypins;

import X.C60P;
import X.C7384Etj;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class FancyPinRenderFrameIdentity {
    public static final FancyPinRenderFrameIdentity INSTANCE = new FancyPinRenderFrameIdentity();
    public static final ThreadLocal<Long> current = new ThreadLocal<>();

    public final <T> T tagging(long j, Function0<? extends T> function0) {
        C7384Etj.A0Y(function0, 1);
        ThreadLocal<Long> threadLocal = current;
        Long l = threadLocal.get();
        threadLocal.set(Long.valueOf(j));
        try {
            T tInvoke = function0.invoke();
            if (l == null) {
                threadLocal.remove();
                return tInvoke;
            }
            threadLocal.set(l);
            return tInvoke;
        } catch (Throwable th) {
            if (l == null) {
                threadLocal.remove();
                throw th;
            }
            threadLocal.set(l);
            throw th;
        }
    }

    public final long currentMapFrameIdentity$xplat_maps_sdk_packages_fancypins_fancypins_kotlin() {
        return C60P.A01(current.get());
    }
}
