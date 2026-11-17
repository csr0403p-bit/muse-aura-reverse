package X;

import java.util.concurrent.ExecutorService;

/* renamed from: X.F4o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7575F4o implements InterfaceC5344Dgn {
    public final int $t;

    public C7575F4o(int i) {
        this.$t = i;
    }

    @Override // X.InterfaceC5344Dgn
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                ((C5510Djm) obj).A01.release();
                break;
            case 2:
                ((ExecutorService) obj).shutdown();
                break;
        }
    }
}
