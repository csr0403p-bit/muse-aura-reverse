package com.facebook.debug.plog.persistence;

import X.AbstractC6554EEq;
import X.AbstractC6592EIm;
import X.BV4;
import X.C3cG;
import X.C60O;
import X.C6593EIn;
import X.EIR;
import X.EN5;
import X.InterfaceC6590EIi;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public final class PLogDatabase_Impl extends PLogDatabase {
    @Override // X.EIN
    public final EIR createInvalidationTracker() {
        return new EIR(this, BV4.A0v(0), BV4.A0v(0), "plog_config_overrides");
    }

    @Override // X.EIN
    public final void clearAllTables() {
        performClear(false, "plog_config_overrides");
    }

    @Override // X.EIN
    public final /* bridge */ /* synthetic */ InterfaceC6590EIi createOpenDelegate() {
        return new C6593EIn(this);
    }

    @Override // X.EIN
    public final List<AbstractC6554EEq> getAutoMigrations(Map<Class<? extends EN5>, EN5> map) {
        return C3cG.A0h();
    }

    @Override // X.EIN
    public final Set<Class<? extends EN5>> getRequiredAutoMigrationSpecs() {
        return C60O.A13();
    }

    @Override // X.EIN
    public final Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap mapA0u = BV4.A0u();
        mapA0u.put(AbstractC6592EIm.class, Collections.EMPTY_LIST);
        return mapA0u;
    }
}
