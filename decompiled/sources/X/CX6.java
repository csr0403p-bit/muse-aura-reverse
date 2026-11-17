package X;

import java.util.Map;

/* loaded from: classes5.dex */
public abstract class CX6 implements CXL {
    public final CX1 defaultRequestProperties = new CX1();

    public abstract InterfaceC4891DDk createDataSourceInternal(CX1 cx1);

    @Override // X.CXN
    public /* bridge */ /* synthetic */ C1J createDataSource() {
        return createDataSourceInternal(this.defaultRequestProperties);
    }

    public final CXL setDefaultRequestProperties(Map<String, String> map) {
        CX1 cx1 = this.defaultRequestProperties;
        synchronized (cx1) {
            cx1.A00 = null;
            Map<String, String> map2 = cx1.A01;
            map2.clear();
            map2.putAll(map);
        }
        return this;
    }

    @Override // X.CXN
    public final InterfaceC4891DDk createDataSource() {
        return createDataSourceInternal(this.defaultRequestProperties);
    }
}
