package X;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.EbM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6864EbM implements InterfaceC6931Ecf {
    public Object A00;
    public C6871EbT A01;
    public C6898Ebu A02;
    public C6862EbK A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final AtomicBoolean A07;
    public final C6932Ecg A08;
    public final C6859EbH A09;
    public final Eb0 A0A;
    public final C6918EcR A0B;
    public final C6865EbN A0C;
    public final boolean A0D;
    public volatile C6871EbT A0E;
    public volatile C6862EbK A0F;
    public volatile boolean A0G;

    public C6864EbM(C6859EbH c6859EbH, Eb0 eb0, boolean z) {
        C7384Etj.A0Y(c6859EbH, 0);
        this.A09 = c6859EbH;
        this.A0A = eb0;
        this.A0D = z;
        this.A0C = c6859EbH.A0C.A00;
        C6932Ecg c6932Ecg = c6859EbH.A0G.A00;
        byte[] bArr = AbstractC6843Eav.A06;
        this.A08 = c6932Ecg;
        C6918EcR c6918EcR = new C6918EcR(this);
        c6918EcR.A04(TimeUnit.MILLISECONDS, 0L);
        this.A0B = c6918EcR;
        this.A07 = new AtomicBoolean();
        this.A04 = true;
    }

    public final IOException A01(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.A04) {
                this.A04 = false;
                if (!this.A05) {
                    if (!this.A06) {
                        z = true;
                    }
                }
            }
        }
        return z ? A00(iOException) : iOException;
    }

    /* JADX WARN: Incorrect types in method signature: <E:Ljava/io/IOException;>(LX/EbT;ZZTE;)TE; */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.IOException A02(java.io.IOException r5, X.C6871EbT r6, boolean r7, boolean r8) {
        /*
            r4 = this;
            r1 = 0
            X.EbT r0 = r4.A0E
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L57
            monitor-enter(r4)
            r3 = 0
            if (r7 == 0) goto L11
            boolean r0 = r4.A05     // Catch: java.lang.Throwable -> L36
            if (r0 != 0) goto L17
        L11:
            if (r8 == 0) goto L39
            boolean r0 = r4.A06     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L39
        L17:
            if (r7 == 0) goto L1b
            r4.A05 = r1     // Catch: java.lang.Throwable -> L36
        L1b:
            if (r8 == 0) goto L1f
            r4.A06 = r1     // Catch: java.lang.Throwable -> L36
        L1f:
            boolean r2 = r4.A05     // Catch: java.lang.Throwable -> L36
            if (r2 != 0) goto L28
            boolean r0 = r4.A06     // Catch: java.lang.Throwable -> L36
            r1 = 1
            if (r0 == 0) goto L29
        L28:
            r1 = 0
        L29:
            if (r2 != 0) goto L34
            boolean r0 = r4.A06     // Catch: java.lang.Throwable -> L36
            if (r0 != 0) goto L34
            boolean r0 = r4.A04     // Catch: java.lang.Throwable -> L36
            if (r0 != 0) goto L34
            r3 = 1
        L34:
            r2 = r3
            goto L3a
        L36:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L39:
            r2 = 0
        L3a:
            monitor-exit(r4)
            if (r1 == 0) goto L50
            r0 = 0
            r4.A0E = r0
            X.EbK r1 = r4.A03
            if (r1 == 0) goto L50
            monitor-enter(r1)
            int r0 = r1.A03     // Catch: java.lang.Throwable -> L4c
            int r0 = r0 + 1
            r1.A03 = r0     // Catch: java.lang.Throwable -> L4c
            goto L4f
        L4c:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4c
            throw r0
        L4f:
            monitor-exit(r1)
        L50:
            if (r2 == 0) goto L57
            java.io.IOException r0 = r4.A00(r5)
            return r0
        L57:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6864EbM.A02(java.io.IOException, X.EbT, boolean, boolean):java.io.IOException");
    }

    public final void A04(boolean z) {
        C6871EbT c6871EbT;
        synchronized (this) {
            if (!this.A04) {
                throw C3cG.A0Q("released");
            }
        }
        if (z && (c6871EbT = this.A0E) != null) {
            c6871EbT.A03.cancel();
            c6871EbT.A01.A02(null, c6871EbT, true, true);
        }
        this.A01 = null;
    }

    private final <E extends IOException> E A00(E e) throws IOException {
        E interruptedIOException;
        Socket socketA03;
        byte[] bArr = AbstractC6843Eav.A06;
        C6862EbK c6862EbK = this.A03;
        if (c6862EbK != null) {
            synchronized (c6862EbK) {
                socketA03 = A03();
            }
            if (this.A03 == null) {
                if (socketA03 != null) {
                    AbstractC6843Eav.A0C(socketA03);
                }
            } else if (socketA03 != null) {
                throw BV4.A0S();
            }
        }
        if (this.A0B.A08()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (e != null) {
                interruptedIOException.initCause(e);
            }
        } else {
            interruptedIOException = e;
        }
        if (e != null) {
            C7384Etj.A0X(interruptedIOException);
        }
        return interruptedIOException;
    }

    public final Socket A03() {
        C6862EbK c6862EbK = this.A03;
        C7384Etj.A0X(c6862EbK);
        byte[] bArr = AbstractC6843Eav.A06;
        List<Reference<C6864EbM>> list = c6862EbK.A0E;
        Iterator<Reference<C6864EbM>> it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (!C7384Etj.areEqual(it.next().get(), this)) {
                i++;
            } else if (i != -1) {
                list.remove(i);
                this.A03 = null;
                if (list.isEmpty()) {
                    c6862EbK.A04 = System.nanoTime();
                    C6865EbN c6865EbN = this.A0C;
                    if (c6862EbK.A0D) {
                        c6862EbK.A0D = true;
                        ConcurrentLinkedQueue<C6862EbK> concurrentLinkedQueue = c6865EbN.A01;
                        concurrentLinkedQueue.remove(c6862EbK);
                        if (concurrentLinkedQueue.isEmpty()) {
                            c6865EbN.A03.A00();
                        }
                        Socket socket = c6862EbK.A06;
                        C7384Etj.A0X(socket);
                        return socket;
                    }
                    c6865EbN.A03.A02(c6865EbN.A02);
                }
                return null;
            }
        }
        throw BV4.A0S();
    }

    @Override // X.InterfaceC6931Ecf
    public final void cancel() {
        Socket socket;
        if (this.A0G) {
            return;
        }
        this.A0G = true;
        C6871EbT c6871EbT = this.A0E;
        if (c6871EbT != null) {
            c6871EbT.A03.cancel();
        }
        C6862EbK c6862EbK = this.A0F;
        if (c6862EbK == null || (socket = c6862EbK.A05) == null) {
            return;
        }
        AbstractC6843Eav.A0C(socket);
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return new C6864EbM(this.A09, this.A0A, this.A0D);
    }
}
