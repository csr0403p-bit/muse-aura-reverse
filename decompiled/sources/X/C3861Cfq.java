package X;

import java.util.Collections;
import java.util.Map;

/* renamed from: X.Cfq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3861Cfq implements InterfaceC3288C9m<AbstractC3929ChB> {
    public static final C3861Cfq A00 = new C3861Cfq();
    public static final C2580BeF A01;
    public static final C2580BeF A02;

    static {
        Map map = Collections.EMPTY_MAP;
        A02 = C2580BeF.A00("clientType", map);
        A01 = C2580BeF.A00("androidClientInfo", map);
    }

    @Override // X.C9k
    public final /* bridge */ /* synthetic */ void AA4(Object obj, InterfaceC3892CgV interfaceC3892CgV) {
        InterfaceC3892CgV interfaceC3892CgV2 = interfaceC3892CgV;
        C3866Cfv c3866Cfv = (C3866Cfv) ((AbstractC3929ChB) obj);
        interfaceC3892CgV2.A3F(A02, c3866Cfv.A01);
        interfaceC3892CgV2.A3F(A01, c3866Cfv.A00);
    }
}
