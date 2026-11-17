package X;

import com.facebook.acra.util.HttpRequestMultipart;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;

/* renamed from: X.EbL, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6863EbL implements InterfaceC6909Ec6 {
    public int A00;
    public C6844Eaw A01;
    public final C6859EbH A02;
    public final C6862EbK A03;
    public final C6901Ebx A04;
    public final EcA A05;
    public final InterfaceC6831Eaj A06;

    public final void A00(String str, C6844Eaw c6844Eaw) {
        C7384Etj.A0Y(str, 1);
        int i = this.A00;
        if (i != 0) {
            throw C7384Etj.A0E(i);
        }
        EcA ecA = this.A05;
        ecA.Aj6(str);
        ecA.Aj6(HttpRequestMultipart.LINE_FEED);
        String[] strArr = c6844Eaw.A00;
        int length = strArr.length / 2;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 2;
            ecA.Aj6(strArr[i3]);
            ecA.Aj6(": ");
            ecA.Aj6(strArr[i3 + 1]);
            ecA.Aj6(HttpRequestMultipart.LINE_FEED);
        }
        ecA.Aj6(HttpRequestMultipart.LINE_FEED);
        this.A00 = 1;
    }

    @Override // X.InterfaceC6909Ec6
    public final InterfaceC6833Eal A80(Eb0 eb0, long j) {
        C7384Etj.A0Y(eb0, 0);
        if ("chunked".equalsIgnoreCase(eb0.A03.A03("Transfer-Encoding"))) {
            int i = this.A00;
            if (i != 1) {
                throw C7384Etj.A0E(i);
            }
            this.A00 = 2;
            return new C6902Eby(this);
        }
        if (j == -1) {
            throw C3cG.A0Q("Cannot stream a request body without chunked encoding or a known content length!");
        }
        int i2 = this.A00;
        if (i2 != 1) {
            throw C7384Etj.A0E(i2);
        }
        this.A00 = 2;
        return new C6900Ebw(this);
    }

    @Override // X.InterfaceC6909Ec6
    public final void Ait(Eb0 eb0) {
        C7384Etj.A0Y(eb0, 0);
        Proxy.Type type = this.A03.A0F.A01.type();
        C7384Etj.A0U(type);
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(eb0.A01);
        sbA0w.append(' ');
        C6854EbC c6854EbC = eb0.A04;
        if (c6854EbC.A06 || type != Proxy.Type.HTTP) {
            String strA06 = c6854EbC.A06();
            String strA07 = c6854EbC.A07();
            if (strA07 != null) {
                StringBuilder sbA0g = C3cG.A0g(strA06);
                sbA0g.append('?');
                strA06 = C8j3.A14(strA07, sbA0g);
            }
            sbA0w.append(strA06);
        } else {
            sbA0w.append(c6854EbC);
        }
        A00(AnonymousClass001.A0v(" HTTP/1.1", sbA0w), eb0.A03);
    }

    @Override // X.InterfaceC6909Ec6
    public final void ABc() {
        this.A05.flush();
    }

    @Override // X.InterfaceC6909Ec6
    public final void ABg() {
        this.A05.flush();
    }

    @Override // X.InterfaceC6909Ec6
    public final C6862EbK ADv() {
        return this.A03;
    }

    @Override // X.InterfaceC6909Ec6
    public final C6884Ebg AZT(boolean z) throws IOException {
        int i = this.A00;
        if (i != 1 && i != 3) {
            throw C7384Etj.A0E(i);
        }
        try {
            C6901Ebx c6901Ebx = this.A04;
            String strAZb = c6901Ebx.A01.AZb(c6901Ebx.A00);
            c6901Ebx.A00 -= strAZb.length();
            C6896Ebs c6896EbsA00 = C6896Ebs.A00(strAZb);
            C6884Ebg c6884Ebg = new C6884Ebg();
            c6884Ebg.A06 = c6896EbsA00.A02;
            int i2 = c6896EbsA00.A00;
            c6884Ebg.A00 = i2;
            String str = c6896EbsA00.A01;
            C7384Etj.A0Y(str, 0);
            c6884Ebg.A03 = str;
            c6884Ebg.A05 = c6901Ebx.A00().A04();
            if (z && i2 == 100) {
                return null;
            }
            this.A00 = i2 != 100 ? 4 : 3;
            return c6884Ebg;
        } catch (EOFException e) {
            throw new IOException(AnonymousClass006.A0y(this.A03.A0F.A02.A09.A09(), "unexpected end of stream on ", C60O.A0w()), e);
        }
    }

    @Override // X.InterfaceC6909Ec6
    public final void cancel() throws IOException {
        Socket socket = this.A03.A05;
        if (socket != null) {
            AbstractC6843Eav.A0C(socket);
        }
    }

    public C6863EbL(C6859EbH c6859EbH, C6862EbK c6862EbK, EcA ecA, InterfaceC6831Eaj interfaceC6831Eaj) {
        this.A02 = c6859EbH;
        this.A03 = c6862EbK;
        this.A06 = interfaceC6831Eaj;
        this.A05 = ecA;
        this.A04 = new C6901Ebx(interfaceC6831Eaj);
    }

    @Override // X.InterfaceC6909Ec6
    public final InterfaceC6834Eam AXW(C6886Ebi c6886Ebi) {
        long jA03;
        if (!AbstractC6802EaD.A02(c6886Ebi)) {
            jA03 = 0;
        } else {
            if ("chunked".equalsIgnoreCase(C6886Ebi.A00("Transfer-Encoding", c6886Ebi))) {
                C6854EbC c6854EbC = c6886Ebi.A07.A04;
                int i = this.A00;
                if (i != 4) {
                    throw C7384Etj.A0E(i);
                }
                this.A00 = 5;
                return new C6870EbS(c6854EbC, this);
            }
            jA03 = AbstractC6843Eav.A03(c6886Ebi);
            if (jA03 == -1) {
                int i2 = this.A00;
                if (i2 != 4) {
                    throw C7384Etj.A0E(i2);
                }
                this.A00 = 5;
                this.A03.A01();
                return new C6906Ec3(this);
            }
        }
        int i3 = this.A00;
        if (i3 != 4) {
            throw C7384Etj.A0E(i3);
        }
        this.A00 = 5;
        return new C6889Ebl(this, jA03);
    }

    @Override // X.InterfaceC6909Ec6
    public final long Ab7(C6886Ebi c6886Ebi) {
        if (!AbstractC6802EaD.A02(c6886Ebi)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(C6886Ebi.A00("Transfer-Encoding", c6886Ebi))) {
            return -1L;
        }
        return AbstractC6843Eav.A03(c6886Ebi);
    }
}
