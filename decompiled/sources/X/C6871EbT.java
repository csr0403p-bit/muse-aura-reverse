package X;

import java.io.IOException;
import java.net.Proxy;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;

/* renamed from: X.EbT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6871EbT {
    public final C6898Ebu A00;
    public final C6864EbM A01;
    public final C6862EbK A02;
    public final InterfaceC6909Ec6 A03;
    public final C6932Ecg A04;

    public static final void A00(IOException iOException, C6871EbT c6871EbT) {
        c6871EbT.A00.A00(iOException);
        C6862EbK c6862EbKADv = c6871EbT.A03.ADv();
        C6864EbM c6864EbM = c6871EbT.A01;
        synchronized (c6862EbKADv) {
            if (iOException instanceof StreamResetException) {
                Ec2 ec2 = ((StreamResetException) iOException).errorCode;
                if (ec2 == Ec2.REFUSED_STREAM) {
                    int i = c6862EbKADv.A01 + 1;
                    c6862EbKADv.A01 = i;
                    if (i > 1) {
                        c6862EbKADv.A0D = true;
                        c6862EbKADv.A02++;
                    }
                } else if (ec2 != Ec2.CANCEL || !c6864EbM.A0G) {
                    c6862EbKADv.A0D = true;
                    c6862EbKADv.A02++;
                }
            } else if (c6862EbKADv.A09 == null || (iOException instanceof ConnectionShutdownException)) {
                c6862EbKADv.A0D = true;
                if (c6862EbKADv.A03 == 0) {
                    C6859EbH c6859EbH = c6864EbM.A09;
                    C6910Ec7 c6910Ec7 = c6862EbKADv.A0F;
                    C7384Etj.A0Y(c6910Ec7, 1);
                    Proxy proxy = c6910Ec7.A01;
                    if (proxy.type() != Proxy.Type.DIRECT) {
                        C6856EbE c6856EbE = c6910Ec7.A02;
                        c6856EbE.A00.connectFailed(c6856EbE.A09.A0A(), proxy.address(), iOException);
                    }
                    EcL ecL = c6859EbH.A0H;
                    synchronized (ecL) {
                        ecL.A00.add(c6910Ec7);
                    }
                    c6862EbKADv.A02++;
                }
            }
        }
    }

    public final C6884Ebg A01(boolean z) throws IOException {
        try {
            C6884Ebg c6884EbgAZT = this.A03.AZT(z);
            if (c6884EbgAZT != null) {
                c6884EbgAZT.A0C = this;
            }
            return c6884EbgAZT;
        } catch (IOException e) {
            A00(e, this);
            throw e;
        }
    }

    public C6871EbT(C6932Ecg c6932Ecg, C6898Ebu c6898Ebu, C6864EbM c6864EbM, InterfaceC6909Ec6 interfaceC6909Ec6) {
        this.A01 = c6864EbM;
        this.A04 = c6932Ecg;
        this.A00 = c6898Ebu;
        this.A03 = interfaceC6909Ec6;
        this.A02 = interfaceC6909Ec6.ADv();
    }
}
