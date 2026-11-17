package X;

import java.io.IOException;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;

/* renamed from: X.Ebu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6898Ebu {
    public int A00;
    public int A01;
    public int A02;
    public C6910Ec7 A03;
    public EcP A04;
    public C6885Ebh A05;
    public final C6856EbE A06;
    public final C6932Ecg A07;
    public final C6864EbM A08;
    public final C6865EbN A09;

    public final void A00(IOException iOException) {
        C7384Etj.A0Y(iOException, 0);
        this.A03 = null;
        if ((iOException instanceof StreamResetException) && ((StreamResetException) iOException).errorCode == Ec2.REFUSED_STREAM) {
            this.A02++;
        } else if (iOException instanceof ConnectionShutdownException) {
            this.A00++;
        } else {
            this.A01++;
        }
    }

    public C6898Ebu(C6856EbE c6856EbE, C6932Ecg c6932Ecg, C6864EbM c6864EbM, C6865EbN c6865EbN) {
        this.A09 = c6865EbN;
        this.A06 = c6856EbE;
        this.A08 = c6864EbM;
        this.A07 = c6932Ecg;
    }
}
