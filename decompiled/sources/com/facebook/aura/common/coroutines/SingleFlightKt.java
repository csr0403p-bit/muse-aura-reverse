package com.facebook.aura.common.coroutines;

import X.AbstractC3358CGz;
import X.AnonymousClass005;
import X.C7384Etj;
import com.facebook.aura.common.coroutines.OnDuplicateCall;

/* loaded from: classes2.dex */
public abstract class SingleFlightKt {
    public static final SingleFlight SingleFlight(AbstractC3358CGz abstractC3358CGz, OnDuplicateCall onDuplicateCall, boolean z) {
        C7384Etj.A0Y(onDuplicateCall, 1);
        return z ? new UndispatchedStartSingleFlightImpl(onDuplicateCall) : new LazyStartSingleFlightImpl(onDuplicateCall);
    }

    public static /* synthetic */ SingleFlight SingleFlight$default(AbstractC3358CGz abstractC3358CGz, OnDuplicateCall onDuplicateCall, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            onDuplicateCall = OnDuplicateCall.Join.INSTANCE;
        }
        return SingleFlight(abstractC3358CGz, onDuplicateCall, AnonymousClass005.A1O(i, z));
    }
}
