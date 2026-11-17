package X;

import com.facebook.tigon.TigonBodyStream;
import com.facebook.tigon.TigonError;
import com.facebook.tigon.iface.TigonErrorCode;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class CYJ implements Runnable {
    public static final String __redex_internal_original_name = "TigonHttpEntityBodyProvider$EntityReader";
    public final int A00;
    public final TigonBodyStream A01;
    public final /* synthetic */ CYI A02;

    public CYJ(TigonBodyStream tigonBodyStream, CYI cyi, int i) {
        this.A02 = cyi;
        this.A01 = tigonBodyStream;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        try {
            TigonBodyStream tigonBodyStream = this.A01;
            CYI cyi = this.A02;
            tigonBodyStream.reportBodyLength((int) cyi.getContentLength());
            CYK cyk = new CYK(tigonBodyStream, cyi, this.A00);
            cyi.A02.writeTo(cyk);
            cyk.A00();
            if (cyk.A01) {
                return;
            }
            tigonBodyStream.writeEOM();
        } catch (IOException e) {
            this.A01.reportError(new TigonError(TigonErrorCode.A05, "TigonHttpEntityBodyProviderDomain", e.toString(), 0));
        }
    }
}
