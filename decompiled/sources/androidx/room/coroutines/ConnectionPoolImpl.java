package androidx.room.coroutines;

import X.AbstractC0852A5y;
import X.C6604EJg;
import X.C7589F5c;
import X.C7600F5n;
import X.EIZ;
import X.F24;
import X.InterfaceC6586EIe;

/* loaded from: classes5.dex */
public final class ConnectionPoolImpl implements EIZ {
    public final Pool A03;
    public final Pool A04;
    public final InterfaceC6586EIe A06;
    public volatile boolean A07;
    public final C6604EJg A02 = new C6604EJg();
    public final ThreadLocal<PooledConnectionImpl> A05 = new ThreadLocal<>();
    public long A01 = AbstractC0852A5y.A01(F24.A07, 30);
    public int A00 = 2;

    public ConnectionPoolImpl(InterfaceC6586EIe interfaceC6586EIe, int i) {
        this.A06 = interfaceC6586EIe;
        Pool pool = new Pool(1, i, new C7589F5c(interfaceC6586EIe, 7));
        this.A03 = pool;
        this.A04 = pool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00eb A[Catch: all -> 0x0120, TryCatch #0 {all -> 0x0120, blocks: (B:45:0x00c7, B:50:0x00e0, B:52:0x00eb, B:55:0x0119, B:56:0x011f), top: B:94:0x00c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0119 A[Catch: all -> 0x0120, TryCatch #0 {all -> 0x0120, blocks: (B:45:0x00c7, B:50:0x00e0, B:52:0x00eb, B:55:0x0119, B:56:0x011f), top: B:94:0x00c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015e  */
    /* JADX WARN: Type inference failed for: r0v17, types: [T, androidx.room.coroutines.PooledConnectionImpl] */
    @Override // X.EIZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <R> java.lang.Object AiC(final boolean r14, X.G0V<? super X.EJA, ? super X.HtJ<? super R>, ? extends java.lang.Object> r15, X.HtJ<? super R> r16) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.coroutines.ConnectionPoolImpl.AiC(boolean, X.G0V, X.HtJ):java.lang.Object");
    }

    @Override // X.EIZ, java.lang.AutoCloseable
    public final void close() {
        if (this.A07) {
            return;
        }
        this.A07 = true;
        this.A03.A02();
        this.A04.A02();
    }

    public ConnectionPoolImpl(InterfaceC6586EIe interfaceC6586EIe, String str, int i, int i2) {
        this.A06 = interfaceC6586EIe;
        this.A03 = new Pool(i, i2, new C7600F5n(interfaceC6586EIe, str, 0));
        this.A04 = new Pool(1, i2, new C7600F5n(interfaceC6586EIe, str, 1));
    }
}
