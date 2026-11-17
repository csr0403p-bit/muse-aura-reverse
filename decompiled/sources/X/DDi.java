package X;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class DDi implements CXK {
    public final InterfaceC4891DDk A00;

    @Override // X.C1J
    public final void addTransferListener(CXB cxb) {
        C7384Etj.A0Y(cxb, 0);
        this.A00.addTransferListener(cxb);
    }

    @Override // X.InterfaceC4891DDk, X.C1J
    public final long open(C1O c1o) {
        C7384Etj.A0Y(c1o, 0);
        return this.A00.open(c1o);
    }

    @Override // X.InterfaceC4891DDk, X.C1L
    public final int read(byte[] bArr, int i, int i2) {
        C7384Etj.A0Y(bArr, 0);
        return this.A00.read(bArr, i, i2);
    }

    @Override // X.InterfaceC4896DDp
    public final void cancel() {
        InterfaceC4896DDp interfaceC4896DDp;
        InterfaceC4891DDk interfaceC4891DDk = this.A00;
        if (!(interfaceC4891DDk instanceof CXK) || (interfaceC4896DDp = (InterfaceC4896DDp) interfaceC4891DDk) == null) {
            return;
        }
        interfaceC4896DDp.cancel();
    }

    @Override // X.InterfaceC4891DDk, X.C1J
    public final void close() {
        this.A00.close();
    }

    @Override // X.InterfaceC4891DDk, X.C1J
    public final Map<String, List<String>> getResponseHeaders() {
        Map<String, List<String>> responseHeaders = this.A00.getResponseHeaders();
        C7384Etj.A0U(responseHeaders);
        return responseHeaders;
    }

    @Override // X.C1J
    public final Uri getUri() {
        return this.A00.getUri();
    }

    public DDi(InterfaceC4891DDk interfaceC4891DDk) {
        this.A00 = interfaceC4891DDk;
    }
}
