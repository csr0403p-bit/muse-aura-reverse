package com.facebook.aura.common.coroutines;

import X.G0U;
import X.HtJ;
import kotlin.Unit;

/* loaded from: classes2.dex */
public interface SingleFlight {

    /* renamed from: com.facebook.aura.common.coroutines.SingleFlight$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static /* synthetic */ void forget$default(SingleFlight singleFlight, Object obj, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forget");
            }
            if ((i & 1) != 0) {
                obj = Unit.INSTANCE;
            }
            singleFlight.forget(obj);
        }

        public static /* synthetic */ Object invoke$default(SingleFlight singleFlight, Object obj, G0U g0u, HtJ htJ, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
            }
            if ((i & 1) != 0) {
                obj = Unit.INSTANCE;
            }
            return singleFlight.invoke(obj, g0u, htJ);
        }
    }

    void clearAndCancelAll();

    void forget(Object obj);

    boolean hasActiveJobForKey(Object obj);

    <T> Object invoke(Object obj, G0U<? super HtJ<? super T>, ? extends Object> g0u, HtJ<? super SingleFlightResult<? extends T>> htJ);

    public abstract class DefaultImpls {
    }
}
