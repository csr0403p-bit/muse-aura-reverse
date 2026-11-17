package X;

import com.facebook.aura.network.transport.cache.CachingHatchHttpClientKt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Eaz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6847Eaz implements InterfaceC6926EcZ {
    public final InterfaceC6803EaE A00;

    @Override // X.InterfaceC6926EcZ
    public final C6886Ebi ANq(C6875EbX c6875EbX) throws NumberFormatException {
        Eb4 eb4;
        Eb0 eb0 = c6875EbX.A06;
        C6854EbC c6854EbC = eb0.A04;
        String str = eb0.A01;
        C6853EbB c6853EbB = eb0.A05;
        Map<Class<?>, Object> map = eb0.A02;
        LinkedHashMap linkedHashMapA0j = map.isEmpty() ? C3cG.A0j() : new LinkedHashMap(map);
        C6844Eaw c6844Eaw = eb0.A03;
        C6845Eax c6845EaxA04 = c6844Eaw.A04();
        if (c6853EbB != null) {
            c6845EaxA04.A03("Content-Length", String.valueOf(0L));
            c6845EaxA04.A01("Transfer-Encoding");
        }
        boolean z = false;
        if (c6844Eaw.A03("Host") == null) {
            String strA06 = AbstractC6843Eav.A06(c6854EbC, false);
            C7384Etj.A0Y(strA06, 1);
            c6845EaxA04.A03("Host", strA06);
        }
        if (c6844Eaw.A03("Connection") == null) {
            c6845EaxA04.A03("Connection", "Keep-Alive");
        }
        if (c6844Eaw.A03("Accept-Encoding") == null && c6844Eaw.A03(CachingHatchHttpClientKt.RANGE_HEADER) == null) {
            c6845EaxA04.A03("Accept-Encoding", "gzip");
            z = true;
        }
        InterfaceC6803EaE interfaceC6803EaE = this.A00;
        C0881AGi c0881AGi = C0881AGi.A00;
        if (!c0881AGi.isEmpty()) {
            StringBuilder sbA0w = C60O.A0w();
            Iterator it = c0881AGi.iterator();
            int i = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC0885AGm.A14();
                    throw F60.createAndThrow();
                }
                C6752EYm c6752EYm = (C6752EYm) next;
                if (i > 0) {
                    sbA0w.append("; ");
                }
                BV7.A1I(sbA0w, c6752EYm.A02);
                sbA0w.append(c6752EYm.A04);
                i = i2;
            }
            c6845EaxA04.A03(CachingHatchHttpClientKt.COOKIE_HEADER, sbA0w.toString());
        }
        if (c6844Eaw.A03("User-Agent") == null) {
            c6845EaxA04.A03("User-Agent", "okhttp/4.10.0");
        }
        C6886Ebi c6886EbiA00 = c6875EbX.A00(new Eb0(str, AbstractC6843Eav.A08(linkedHashMapA0j), c6845EaxA04.A00(), c6854EbC, c6853EbB));
        C6844Eaw c6844Eaw2 = c6886EbiA00.A05;
        AbstractC6802EaD.A01(interfaceC6803EaE, c6844Eaw2, c6854EbC);
        C6884Ebg c6884Ebg = new C6884Ebg(c6886EbiA00);
        c6884Ebg.A07 = eb0;
        if (z && "gzip".equalsIgnoreCase(C6886Ebi.A00("Content-Encoding", c6886EbiA00)) && AbstractC6802EaD.A02(c6886EbiA00) && (eb4 = c6886EbiA00.A0B) != null) {
            C6816EaU c6816EaU = new C6816EaU(eb4.A01());
            C6845Eax c6845EaxA042 = c6844Eaw2.A04();
            c6845EaxA042.A01("Content-Encoding");
            c6845EaxA042.A01("Content-Length");
            c6884Ebg.A05 = c6845EaxA042.A00().A04();
            c6884Ebg.A0B = new C6851Eb9(new C6819EaX(c6816EaU), -1L);
        }
        return c6884Ebg.A00();
    }

    public C6847Eaz(InterfaceC6803EaE interfaceC6803EaE) {
        this.A00 = interfaceC6803EaE;
    }
}
