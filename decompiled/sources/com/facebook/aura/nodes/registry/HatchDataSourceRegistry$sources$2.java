package com.facebook.aura.nodes.registry;

import X.AbstractC7559F3s;
import X.AnonymousClass801;
import X.C3cG;
import X.C7384Etj;
import X.CFK;
import X.FGI;
import com.facebook.aura.nodes.api.HatchClientCapabilities;
import com.facebook.aura.nodes.datasource.DataSource;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchDataSourceRegistry$sources$2 extends AbstractC7559F3s implements Function0<Map<String, DataSource>> {
    public static final HatchDataSourceRegistry$sources$2 INSTANCE = new HatchDataSourceRegistry$sources$2();

    public HatchDataSourceRegistry$sources$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, DataSource> invoke() {
        Object objPut;
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        int[] iArrA0o = AnonymousClass801.A0o();
        int i = 0;
        do {
            DataSource dataSourceA06 = AnonymousClass801.A06(iArrA0o[i]);
            C7384Etj.A0U(dataSourceA06);
            if (HatchClientCapabilities.INSTANCE.supportsDataSource(dataSourceA06.getSourceId()) && (objPut = linkedHashMapA0j.put(dataSourceA06.getSourceId(), dataSourceA06)) != null && objPut != dataSourceA06) {
                CFK.A04(HatchDataSourceRegistryKt.TAG, FGI.A0j("Duplicate sourceId '", dataSourceA06.getSourceId(), "': ", objPut.getClass().getName(), " was overwritten by ", dataSourceA06.getClass().getName()));
            }
            i++;
        } while (i < 10);
        return linkedHashMapA0j;
    }
}
