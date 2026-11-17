package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Bfs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2625Bfs implements InterfaceC2641BgM {
    public final AtomicBoolean A00 = C60O.A1E();
    public final InterfaceC2641BgM A01;

    public static void A00(C2625Bfs c2625Bfs) {
        c2625Bfs.A00.set(true);
    }

    @Override // X.InterfaceC2641BgM
    public final void AT5(C2643Bga c2643Bga, Integer num) {
        if (this.A00.get()) {
            return;
        }
        this.A01.AT5(c2643Bga, num);
    }

    public C2625Bfs(InterfaceC2641BgM interfaceC2641BgM) {
        this.A01 = interfaceC2641BgM;
    }
}
