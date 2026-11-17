package X;

import java.util.Set;

/* renamed from: X.Beh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC2585Beh {
    boolean A74(AbstractC2531BdI<?> abstractC2531BdI);

    void ABW(InterfaceC2588Bek interfaceC2588Bek, String str);

    BY1 AIG(AbstractC2531BdI<?> abstractC2531BdI);

    Set<BY1> AJ7(AbstractC2531BdI<?> abstractC2531BdI);

    Set<AbstractC2531BdI<?>> APd();

    <ValueT> ValueT Abk(AbstractC2531BdI<ValueT> abstractC2531BdI);

    <ValueT> ValueT Abl(AbstractC2531BdI<ValueT> abstractC2531BdI, ValueT valuet);

    <ValueT> ValueT Abm(AbstractC2531BdI<ValueT> abstractC2531BdI, BY1 by1);

    static C2584Beg A00(InterfaceC2585Beh interfaceC2585Beh) {
        BgT bgT = new BgT();
        interfaceC2585Beh.ABW(new C2587Bej(bgT, interfaceC2585Beh), "camera2.captureRequest.option.");
        return C2584Beg.A02(bgT.A00);
    }

    static void A01(InterfaceC2588Bek interfaceC2588Bek, InterfaceC2586Bei interfaceC2586Bei, String str) {
        interfaceC2586Bei.ADr().ABW(interfaceC2588Bek, str);
    }
}
