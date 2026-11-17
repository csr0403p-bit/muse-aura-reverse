package X;

import java.util.Map;

/* loaded from: classes5.dex */
public final class CXI extends DDU {
    @Override // X.DDU
    public final CXK createInstance(String str, CXB cxb, CXO cxo, int i, int i2, C3159C0h c3159C0h) {
        C7384Etj.A0Y(str, 0);
        CWy cWy = new CWy(new CX1(), str, i, i2);
        if (cxb != null) {
            cWy.addTransferListener(cxb);
        }
        return new DDi(cWy);
    }

    @Override // X.DDU
    public final String getFactoryName() {
        return "Apache";
    }

    @Override // X.DDU
    public final Map<String, String> getBugReportFiles(String str) {
        return null;
    }
}
