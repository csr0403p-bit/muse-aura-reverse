package com.facebook.aura.nodes.registry;

import X.AbstractC3358CGz;
import X.AbstractC5321DgF;
import X.BzK;
import X.C06H;
import X.C3cG;
import X.C4oT;
import X.C60O;
import X.C7384Etj;
import X.F0C;
import X.FGI;
import com.facebook.aura.common.prefs.AuraDevicePrefStore;
import com.facebook.aura.common.prefs.AuraDevicePrefs;
import com.facebook.aura.nodes.datasource.DataSource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class HatchDataSourceRegistry {
    public static final Companion Companion = new Companion();
    public final F0C sources$delegate = AbstractC5321DgF.A03(HatchDataSourceRegistry$sources$2.INSTANCE);

    public final DataSource find(String str) {
        C7384Etj.A0Y(str, 0);
        DataSource dataSource = getSources().get(str);
        if (dataSource != null && isUserEnabled(str) && dataSource.isEnabled()) {
            return dataSource;
        }
        return null;
    }

    public final boolean isUserEnabled(String str) {
        C7384Etj.A0Y(str, 0);
        if (getSources().get(str) != null) {
            return AuraDevicePrefs.INSTANCE.get(AuraDevicePrefStore.NODE).getBoolean(FGI.A0M(HatchDataSourceRegistryKt.PREFS_KEY_SOURCE_PREFIX, str), true);
        }
        return false;
    }

    public final void setUserEnabled(String str, boolean z) {
        C7384Etj.A0Y(str, 0);
        BzK bzKA0F = C60O.A0F(AuraDevicePrefStore.NODE, AuraDevicePrefs.INSTANCE);
        bzKA0F.A0A(FGI.A0M(HatchDataSourceRegistryKt.PREFS_KEY_SOURCE_PREFIX, str), z);
        bzKA0F.apply();
    }

    private final C4oT getPrefs() {
        return AuraDevicePrefs.INSTANCE.get(AuraDevicePrefStore.NODE);
    }

    public final Map<String, DataSource> getSources() {
        return (Map) this.sources$delegate.getValue();
    }

    public final class Companion {
        public final HatchDataSourceRegistry getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchDataSourceRegistry) abstractC3358CGz.A03(HatchDataSourceRegistry.class, HatchDataSourceRegistry$Companion$getInstance$1.INSTANCE);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final Map<String, DataSource> getAllSources() {
        return getSources();
    }

    public final List<DataSource> getEnabledSources() {
        Collection<DataSource> collectionValues = getSources().values();
        ArrayList arrayListA0h = C3cG.A0h();
        for (DataSource dataSource : collectionValues) {
            DataSource dataSource2 = dataSource;
            if (isUserEnabled(dataSource2.getSourceId()) && dataSource2.isEnabled()) {
                arrayListA0h.add(dataSource);
            }
        }
        return arrayListA0h;
    }
}
