package X;

import com.facebook.tigon.TigonBodyStream;
import com.facebook.tigon.TigonError;
import com.facebook.tigon.TigonXplatBodyProvider;
import com.facebook.tigon.iface.TigonErrorCode;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public final class CYS implements Runnable {
    public static final String __redex_internal_original_name = "TigonChunkedBodyProvider$BodyReaderRunnable";
    public final long A00;
    public final TigonBodyStream A01;
    public final InputStream A02;
    public final /* synthetic */ CYT A03;

    public CYS(CYT cyt, TigonBodyStream tigonBodyStream, InputStream inputStream, long j) {
        C7384Etj.A0Y(inputStream, 2);
        this.A03 = cyt;
        this.A01 = tigonBodyStream;
        this.A02 = inputStream;
        this.A00 = j;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        TigonBodyStream tigonBodyStream;
        TigonError tigonError;
        int i;
        try {
            TigonBodyStream tigonBodyStream2 = this.A01;
            tigonBodyStream2.reportBodyLength((int) this.A00);
            byte[] bArr = new byte[4096];
            do {
                i = this.A02.read(bArr, 0, 4096);
                if (i == -1) {
                    tigonBodyStream2.writeEOM();
                    return;
                }
            } while (1 != tigonBodyStream2.transferBytes(bArr, i));
        } catch (IOException e) {
            tigonBodyStream = this.A01;
            TigonXplatBodyProvider tigonXplatBodyProvider = TigonXplatBodyProvider.$redex_init_class;
            tigonError = new TigonError(TigonErrorCode.A05, "TigonChunkedBodyProvider", FGI.A0M(C3cI.A0Y(e), " while providing the request body"), 2);
            tigonBodyStream.reportError(tigonError);
        } catch (RuntimeException e2) {
            tigonBodyStream = this.A01;
            TigonXplatBodyProvider tigonXplatBodyProvider2 = TigonXplatBodyProvider.$redex_init_class;
            tigonError = new TigonError(TigonErrorCode.A05, "TigonChunkedBodyProvider", FGI.A0M(C3cI.A0Y(e2), " while providing the request body"), 1);
            tigonBodyStream.reportError(tigonError);
        }
    }
}
