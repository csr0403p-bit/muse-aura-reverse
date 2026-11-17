package X;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URI;
import java.util.List;

/* renamed from: X.Ebh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6885Ebh {
    public int A00;
    public List<? extends InetSocketAddress> A01;
    public List<? extends Proxy> A02;
    public final List<C6910Ec7> A03;
    public final C6856EbE A04;
    public final EcL A05;
    public final InterfaceC6931Ecf A06;
    public final C6932Ecg A07;

    public final boolean A00() {
        return this.A00 < this.A02.size() || !this.A03.isEmpty();
    }

    public C6885Ebh(C6856EbE c6856EbE, InterfaceC6931Ecf interfaceC6931Ecf, C6932Ecg c6932Ecg, EcL ecL) {
        List<? extends Proxy> listA07;
        List<Proxy> listSelect;
        this.A04 = c6856EbE;
        this.A05 = ecL;
        this.A06 = interfaceC6931Ecf;
        this.A07 = c6932Ecg;
        C0881AGi c0881AGi = C0881AGi.A00;
        this.A02 = c0881AGi;
        this.A01 = c0881AGi;
        this.A03 = C3cG.A0h();
        URI uriA0A = c6856EbE.A09.A0A();
        if (uriA0A.getHost() == null || (listSelect = this.A04.A00.select(uriA0A)) == null || listSelect.isEmpty()) {
            listA07 = AbstractC6843Eav.A07(Proxy.NO_PROXY);
        } else {
            byte[] bArr = AbstractC6843Eav.A06;
            listA07 = BV5.A13(listSelect);
        }
        this.A02 = listA07;
        this.A00 = 0;
    }
}
