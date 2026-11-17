package X;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: X.EbN, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6865EbN {
    public final long A00;
    public final C6922EcV A03;
    public final DUK A02 = new DUK(AnonymousClass006.A0y(" ConnectionPool", AbstractC6843Eav.A00, C60O.A0w()), this, 1);
    public final ConcurrentLinkedQueue<C6862EbK> A01 = new ConcurrentLinkedQueue<>();

    /* JADX WARN: Code restructure failed: missing block: B:75:0x00d1, code lost:
    
        continue;
     */
    /* JADX WARN: Incorrect types in method signature: (LX/EbE;LX/EbM;Ljava/util/List<LX/Ec7;>;Z)Z */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001e A[Catch: all -> 0x00eb, TryCatch #1 {, blocks: (B:8:0x001a, B:10:0x001e, B:12:0x002a, B:14:0x002e, B:16:0x0038, B:18:0x0046, B:21:0x004c, B:23:0x0050, B:26:0x0057, B:27:0x005b, B:29:0x0061, B:31:0x0071, B:33:0x0079, B:35:0x0083, B:37:0x0089, B:39:0x008f, B:41:0x0093, B:43:0x0097, B:45:0x00a5, B:47:0x00b1, B:50:0x00d4, B:52:0x00d8, B:55:0x00e6, B:56:0x00ea), top: B:64:0x001a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A00(java.util.List r13, X.C6856EbE r14, X.C6864EbM r15, boolean r16) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6865EbN.A00(java.util.List, X.EbE, X.EbM, boolean):boolean");
    }

    public C6865EbN(TimeUnit timeUnit, C6920EcT c6920EcT) {
        this.A00 = timeUnit.toNanos(5L);
        this.A03 = c6920EcT.A01();
    }
}
