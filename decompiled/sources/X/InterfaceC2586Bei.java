package X;

import java.util.Set;

/* renamed from: X.Bei, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC2586Bei extends InterfaceC2585Beh {
    @Override // X.InterfaceC2585Beh
    boolean A74(AbstractC2531BdI<?> abstractC2531BdI);

    InterfaceC2585Beh ADr();

    @Override // X.InterfaceC2585Beh
    Set<AbstractC2531BdI<?>> APd();

    @Override // X.InterfaceC2585Beh
    <ValueT> ValueT Abk(AbstractC2531BdI<ValueT> abstractC2531BdI);

    @Override // X.InterfaceC2585Beh
    <ValueT> ValueT Abl(AbstractC2531BdI<ValueT> abstractC2531BdI, ValueT valuet);

    static int A00(AbstractC2531BdI abstractC2531BdI, InterfaceC2586Bei interfaceC2586Bei, int i) {
        return ((Number) interfaceC2586Bei.Abl(abstractC2531BdI, Integer.valueOf(i))).intValue();
    }
}
