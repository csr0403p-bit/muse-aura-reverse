package X;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class FD5 implements Runnable {
    public static final String __redex_internal_original_name = "ActionChain$runNext$1";
    public final /* synthetic */ FD4 A00;
    public final /* synthetic */ List<HxE<InterfaceC7646F8n, C7658F9a>> A01;

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<LX/HxE<LX/F8n;LX/F9a;>;>;LX/FD4;)V */
    public FD5(FD4 fd4, List list) {
        this.A01 = list;
        this.A00 = fd4;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        Iterator<HxE<InterfaceC7646F8n, C7658F9a>> it = this.A01.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            HxE hxEA10 = C60Q.A10(it);
            FD8 fd8 = FD3.A01;
            if (fd8 == null) {
                this.A00.A00();
                break;
            }
            try {
                ((InterfaceC7646F8n) hxEA10.first).execute(fd8.ACP(), fd8.ACs(), fd8.AE2());
            } catch (Exception e) {
                FFI.A01(fd8.ACs(), "Action execution threw exception.", e);
                this.A00.A00();
            }
        }
        FD4 fd4 = this.A00;
        if (fd4.A02.isEmpty()) {
            fd4.A00();
        }
    }
}
