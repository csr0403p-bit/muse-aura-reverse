package X;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes5.dex */
public final class BeG implements InterfaceC3288C9m<AbstractC2457Bbk> {
    public static final BeG A00 = new BeG();
    public static final C2580BeF A01;
    public static final C2580BeF A02;

    static {
        Map map = Collections.EMPTY_MAP;
        A02 = C2580BeF.A00("networkType", map);
        A01 = C2580BeF.A00("mobileSubtype", map);
    }

    @Override // X.C9k
    public final /* bridge */ /* synthetic */ void AA4(Object obj, InterfaceC3892CgV interfaceC3892CgV) {
        InterfaceC3892CgV interfaceC3892CgV2 = interfaceC3892CgV;
        C2456Bbj c2456Bbj = (C2456Bbj) ((AbstractC2457Bbk) obj);
        interfaceC3892CgV2.A3F(A02, c2456Bbj.A01);
        interfaceC3892CgV2.A3F(A01, c2456Bbj.A00);
    }
}
