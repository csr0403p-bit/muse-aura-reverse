package X;

import com.facebook.tigon.iface.TigonRequest;
import java.io.IOException;
import java.net.ProtocolException;

/* renamed from: X.EbO, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6866EbO implements InterfaceC6926EcZ {
    @Override // X.InterfaceC6926EcZ
    public final C6886Ebi ANq(C6875EbX c6875EbX) throws Throwable {
        C6884Ebg c6884EbgA01;
        Eb4 eb4;
        C6871EbT c6871EbT = c6875EbX.A07;
        C7384Etj.A0X(c6871EbT);
        Eb0 eb0 = c6875EbX.A06;
        C6853EbB c6853EbB = eb0.A05;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            InterfaceC6909Ec6 interfaceC6909Ec6 = c6871EbT.A03;
            interfaceC6909Ec6.Ait(eb0);
            String str = eb0.A01;
            boolean z = false;
            if (!str.equals(TigonRequest.GET) && !str.equals(TigonRequest.HEAD)) {
                z = true;
            }
            if (!z || c6853EbB == null) {
                c6871EbT.A01.A02(null, c6871EbT, true, false);
                c6884EbgA01 = null;
            } else {
                if ("100-continue".equalsIgnoreCase(eb0.A03.A03("Expect"))) {
                    interfaceC6909Ec6.ABg();
                    c6884EbgA01 = c6871EbT.A01(true);
                    if (c6884EbgA01 != null) {
                        c6871EbT.A01.A02(null, c6871EbT, true, false);
                        if (c6871EbT.A02.A09 == null) {
                            interfaceC6909Ec6.ADv().A01();
                        }
                    }
                } else {
                    c6884EbgA01 = null;
                }
                C7384Etj.A0X(c6853EbB);
                C6825Ead c6825Ead = new C6825Ead(new C6887Ebj(c6871EbT, interfaceC6909Ec6.A80(eb0, 0L)));
                C7384Etj.A0Y(c6853EbB.A00, 0);
                if (c6825Ead.A00) {
                    throw BV4.A0R();
                }
                C6818EaW c6818EaW = c6825Ead.A01;
                AbstractC6789EZy.A01(r5.length, 0L, 0L);
                c6818EaW.A00 = c6818EaW.A00;
                C6825Ead.A00(c6825Ead);
                c6825Ead.close();
            }
            interfaceC6909Ec6.ABc();
            if (c6884EbgA01 == null) {
                c6884EbgA01 = c6871EbT.A01(false);
                C7384Etj.A0X(c6884EbgA01);
            }
            c6884EbgA01.A07 = eb0;
            C6862EbK c6862EbK = c6871EbT.A02;
            c6884EbgA01.A04 = c6862EbK.A07;
            c6884EbgA01.A02 = jCurrentTimeMillis;
            c6884EbgA01.A01 = System.currentTimeMillis();
            C6886Ebi c6886EbiA00 = c6884EbgA01.A00();
            int i = c6886EbiA00.A00;
            if (i == 100) {
                C6884Ebg c6884EbgA012 = c6871EbT.A01(false);
                C7384Etj.A0X(c6884EbgA012);
                c6884EbgA012.A07 = eb0;
                c6884EbgA012.A04 = c6862EbK.A07;
                c6884EbgA012.A02 = jCurrentTimeMillis;
                c6884EbgA012.A01 = System.currentTimeMillis();
                c6886EbiA00 = c6884EbgA012.A00();
                i = c6886EbiA00.A00;
            }
            C6884Ebg c6884Ebg = new C6884Ebg(c6886EbiA00);
            long jAb7 = interfaceC6909Ec6.Ab7(c6886EbiA00);
            c6884Ebg.A0B = new C6851Eb9(new C6819EaX(new C6888Ebk(c6871EbT, interfaceC6909Ec6.AXW(c6886EbiA00), jAb7)), jAb7);
            C6886Ebi c6886EbiA002 = c6884Ebg.A00();
            if ("close".equalsIgnoreCase(c6886EbiA002.A07.A03.A03("Connection")) || "close".equalsIgnoreCase(C6886Ebi.A00("Connection", c6886EbiA002))) {
                interfaceC6909Ec6.ADv().A01();
            }
            if ((i == 204 || i == 205) && (eb4 = c6886EbiA002.A0B) != null) {
                long jA00 = eb4.A00();
                if (jA00 > 0) {
                    StringBuilder sbA0y = C60O.A0y("HTTP ", i);
                    sbA0y.append(" had non-zero Content-Length: ");
                    throw new ProtocolException(C8j3.A14(Long.valueOf(jA00), sbA0y));
                }
            }
            return c6886EbiA002;
        } catch (IOException e) {
            C6871EbT.A00(e, c6871EbT);
            throw e;
        }
    }
}
