package X;

import android.net.Uri;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
public final class C1P implements InterfaceC4896DDp {
    public C1J A00;
    public final C1J A01;
    public final Map<String, String> A02;

    @Override // X.C1J
    public final void addTransferListener(CXB cxb) {
        C7384Etj.A0Y(cxb, 0);
        this.A01.addTransferListener(cxb);
    }

    @Override // X.InterfaceC4896DDp
    public final void cancel() {
    }

    @Override // X.C1L
    public final int read(byte[] bArr, int i, int i2) {
        C7384Etj.A0Y(bArr, 0);
        C1J c1j = this.A00;
        if (c1j != null) {
            return c1j.read(bArr, i, i2);
        }
        return -1;
    }

    @Override // X.C1J
    public final void close() {
        C1J c1j = this.A00;
        if (c1j != null) {
            c1j.close();
            this.A00 = null;
        }
    }

    @Override // X.C1J
    public final /* synthetic */ Map getResponseHeaders() {
        return Collections.EMPTY_MAP;
    }

    @Override // X.C1J
    public final Uri getUri() {
        return null;
    }

    @Override // X.C1J
    public final long open(C1O c1o) {
        C1J cWn;
        C1O c1o2 = c1o;
        C7384Etj.A0Y(c1o2, 0);
        Map<String, String> map = this.A02;
        String strA0i = null;
        if (map.size() == 1) {
            Iterator itA10 = BV5.A10(map);
            while (itA10.hasNext()) {
                strA0i = AnonymousClass005.A0j(itA10);
            }
        } else {
            strA0i = BV4.A0i(c1o2.A08, map);
        }
        if (strA0i != null) {
            Uri uriFromFile = Uri.fromFile(BV4.A0G(strA0i));
            Map map2 = Collections.EMPTY_MAP;
            if (uriFromFile == null) {
                uriFromFile = Uri.EMPTY;
            }
            long j = c1o2.A02;
            long j2 = c1o2.A04;
            long j3 = j - j2;
            long j4 = c1o2.A03;
            if (j4 <= 0) {
                j4 = -1;
            }
            int i = c1o2.A00;
            Object obj = c1o2.A07;
            String str = c1o2.A08;
            String str2 = str != null ? str : null;
            C1G.A04(uriFromFile);
            c1o2 = new C1O(uriFromFile, obj, str2, map2, null, 1, i, j3, j2, j4);
            cWn = new CWn(false);
        } else {
            cWn = this.A01;
        }
        this.A00 = cWn;
        return cWn.open(c1o2);
    }

    public C1P(C1J c1j, Map map) {
        this.A01 = c1j;
        this.A02 = map;
    }
}
