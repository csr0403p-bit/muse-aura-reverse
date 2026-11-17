package X;

import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.Fdc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8419Fdc {
    public final Runnable A00;
    public final CopyOnWriteArrayList<InterfaceC8348FcM> A02 = new CopyOnWriteArrayList<>();
    public final Map<InterfaceC8348FcM, C8420Fdd> A01 = BV4.A0u();

    public final void A00(InterfaceC8348FcM interfaceC8348FcM) {
        this.A02.remove(interfaceC8348FcM);
        AbstractC7611F5y.A0u(interfaceC8348FcM, this.A01);
        this.A00.run();
    }

    public C8419Fdc(Runnable runnable) {
        this.A00 = runnable;
    }
}
