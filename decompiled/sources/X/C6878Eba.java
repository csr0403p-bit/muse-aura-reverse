package X;

import java.io.IOException;
import java.util.ArrayDeque;
import okhttp3.internal.http2.StreamResetException;

/* renamed from: X.Eba, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6878Eba {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public IOException A04;
    public Ec2 A05;
    public boolean A06;
    public final int A07;
    public final ArrayDeque<C6844Eaw> A08;
    public final C6879Ebb A09;
    public final C6877EbZ A0A;
    public final C6881Ebd A0B;
    public final C6892Ebo A0C;
    public final C6892Ebo A0D;

    public final synchronized Ec2 A01() {
        return this.A05;
    }

    public final C6877EbZ A02() {
        synchronized (this) {
            if (!this.A06 && true != AnonymousClass002.A1Q(this.A07 & 1, 1)) {
                throw C3cG.A0Q("reply before requesting the sink");
            }
        }
        return this.A0A;
    }

    public final void A07(Ec2 ec2) {
        if (A00(null, ec2)) {
            this.A09.A05(ec2, this.A07);
        }
    }

    public final synchronized boolean A08() {
        if (this.A05 == null) {
            C6881Ebd c6881Ebd = this.A0B;
            if (c6881Ebd.A02 || c6881Ebd.A01) {
                C6877EbZ c6877EbZ = this.A0A;
                if (c6877EbZ.A01 || c6877EbZ.A00) {
                    if (this.A06) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    private final boolean A00(IOException iOException, Ec2 ec2) {
        byte[] bArr = AbstractC6843Eav.A06;
        synchronized (this) {
            if (A01() == null && (!this.A0B.A02 || !this.A0A.A01)) {
                this.A05 = ec2;
                this.A04 = iOException;
                notifyAll();
                this.A09.A02(this.A07);
                return true;
            }
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03() {
        /*
            r2 = this;
            byte[] r0 = X.AbstractC6843Eav.A06
            monitor-enter(r2)
            X.Ebd r1 = r2.A0B     // Catch: java.lang.Throwable -> L32
            boolean r0 = r1.A02     // Catch: java.lang.Throwable -> L32
            if (r0 != 0) goto L19
            boolean r0 = r1.A01     // Catch: java.lang.Throwable -> L32
            if (r0 == 0) goto L19
            X.EbZ r1 = r2.A0A     // Catch: java.lang.Throwable -> L32
            boolean r0 = r1.A01     // Catch: java.lang.Throwable -> L32
            if (r0 != 0) goto L17
            boolean r0 = r1.A00     // Catch: java.lang.Throwable -> L32
            if (r0 == 0) goto L19
        L17:
            r1 = 1
            goto L1a
        L19:
            r1 = 0
        L1a:
            boolean r0 = r2.A08()     // Catch: java.lang.Throwable -> L32
            monitor-exit(r2)
            if (r1 == 0) goto L28
            X.Ec2 r1 = X.Ec2.CANCEL
            r0 = 0
            r2.A05(r0, r1)
        L27:
            return
        L28:
            if (r0 != 0) goto L27
            X.Ebb r1 = r2.A09
            int r0 = r2.A07
            r1.A02(r0)
            return
        L32:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6878Eba.A03():void");
    }

    public final void A04() throws IOException {
        C6877EbZ c6877EbZ = this.A0A;
        if (c6877EbZ.A00) {
            throw BV4.A0K("stream closed");
        }
        if (c6877EbZ.A01) {
            throw BV4.A0K("stream finished");
        }
        Ec2 ec2 = this.A05;
        if (ec2 != null) {
            IOException iOException = this.A04;
            if (iOException != null) {
                throw iOException;
            }
            throw new StreamResetException(ec2);
        }
    }

    public final void A06(C6844Eaw c6844Eaw, boolean z) {
        boolean zA08;
        byte[] bArr = AbstractC6843Eav.A06;
        synchronized (this) {
            if (this.A06 && z) {
                this.A0B.A00 = c6844Eaw;
            } else {
                this.A06 = true;
                this.A08.add(c6844Eaw);
                if (z) {
                }
                zA08 = A08();
                notifyAll();
            }
            this.A0B.A02 = true;
            zA08 = A08();
            notifyAll();
        }
        if (zA08) {
            return;
        }
        this.A09.A02(this.A07);
    }

    public C6878Eba(C6844Eaw c6844Eaw, C6879Ebb c6879Ebb, int i, boolean z, boolean z2) {
        this.A07 = i;
        this.A09 = c6879Ebb;
        this.A02 = c6879Ebb.A09.A00();
        ArrayDeque<C6844Eaw> arrayDequeA0s = BV4.A0s();
        this.A08 = arrayDequeA0s;
        this.A0B = new C6881Ebd(this, c6879Ebb.A0P.A00(), z2);
        this.A0A = new C6877EbZ(this, z);
        this.A0C = new C6892Ebo(this);
        this.A0D = new C6892Ebo(this);
        boolean zA1Q = AnonymousClass002.A1Q(this.A07 & 1, 1);
        if (c6844Eaw == null) {
            if (true != zA1Q) {
                throw C3cG.A0Q("remotely-initiated streams should have headers");
            }
        } else {
            if (true == zA1Q) {
                throw C3cG.A0Q("locally-initiated streams shouldn't have headers yet");
            }
            arrayDequeA0s.add(c6844Eaw);
        }
    }

    public final void A05(IOException iOException, Ec2 ec2) {
        if (A00(iOException, ec2)) {
            C6879Ebb c6879Ebb = this.A09;
            c6879Ebb.A0N.A03(ec2, this.A07);
        }
    }
}
