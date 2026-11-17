package com.facebook.aura.session;

import X.AGO;
import X.AKH;
import X.AbstractC3358CGz;
import X.C7384Etj;
import X.FGI;

/* loaded from: classes3.dex */
public abstract class LocalUserSessionKt {
    public static final AKH<AbstractC3358CGz> LocalUserSession = new AGO(LocalUserSessionKt$LocalUserSession$1.INSTANCE);
    public static final AKH<AbstractC3358CGz> LocalUserSessionOrNull = new AGO(LocalUserSessionKt$LocalUserSessionOrNull$1.INSTANCE);
    public static final AKH<Long> LocalUserSessionGeneration = new AGO(LocalUserSessionKt$LocalUserSessionGeneration$1.INSTANCE);

    public static final String activityViewModelKey(Class<?> cls, long j) {
        C7384Etj.A0Y(cls, 0);
        return FGI.A0K(cls.getName(), j, ":session:");
    }

    public static final AKH<AbstractC3358CGz> getLocalUserSession() {
        return LocalUserSession;
    }

    public static final AKH<Long> getLocalUserSessionGeneration() {
        return LocalUserSessionGeneration;
    }

    public static final AKH<AbstractC3358CGz> getLocalUserSessionOrNull() {
        return LocalUserSessionOrNull;
    }
}
