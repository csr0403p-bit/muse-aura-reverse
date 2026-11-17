package X;

import java.util.List;
import java.util.Map;

@Deprecated
/* renamed from: X.Dfi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5299Dfi implements Dg3 {
    public final C7378EtR A00;
    public final Object A01;

    @Override // X.Dg3
    public final void onStateChanged(C1HY c1hy, EnumC3085Bxl enumC3085Bxl) {
        C7378EtR c7378EtR = this.A00;
        Object obj = this.A01;
        Map<EnumC3085Bxl, List<C5301Dfk>> map = c7378EtR.A00;
        C7378EtR.A00(enumC3085Bxl, c1hy, obj, BV4.A0z(enumC3085Bxl, map));
        C7378EtR.A00(enumC3085Bxl, c1hy, obj, BV4.A0z(EnumC3085Bxl.ON_ANY, map));
    }

    public C5299Dfi(Object obj) {
        this.A01 = obj;
        C5298Dfh c5298Dfh = C5298Dfh.A02;
        Class<?> cls = obj.getClass();
        C7378EtR c7378EtR = c5298Dfh.A00.get(cls);
        this.A00 = c7378EtR == null ? C5298Dfh.A00(c5298Dfh, cls, null) : c7378EtR;
    }
}
