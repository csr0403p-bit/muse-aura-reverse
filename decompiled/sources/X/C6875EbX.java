package X;

import java.util.List;

/* renamed from: X.EbX, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6875EbX {
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final List<InterfaceC6926EcZ> A05;
    public final Eb0 A06;
    public final C6871EbT A07;
    public final C6864EbM A08;

    public final C6886Ebi A00(Eb0 eb0) {
        int i = this.A02;
        List<InterfaceC6926EcZ> list = this.A05;
        if (i >= list.size()) {
            throw BV4.A0S();
        }
        int i2 = this.A00 + 1;
        this.A00 = i2;
        C6871EbT c6871EbT = this.A07;
        if (c6871EbT != null) {
            C6898Ebu c6898Ebu = c6871EbT.A00;
            C6854EbC c6854EbC = eb0.A04;
            C6854EbC c6854EbC2 = c6898Ebu.A06.A09;
            if (c6854EbC.A00 != c6854EbC2.A00 || !c6854EbC.A02.equals(c6854EbC2.A02)) {
                StringBuilder sbA0x = C60O.A0x("network interceptor ");
                sbA0x.append(list.get(i - 1));
                throw BV8.A0m(" must retain the same host and port", sbA0x);
            }
            if (i2 != 1) {
                StringBuilder sbA0x2 = C60O.A0x("network interceptor ");
                sbA0x2.append(list.get(i - 1));
                throw BV8.A0m(" must call proceed() exactly once", sbA0x2);
            }
        }
        int i3 = i + 1;
        C6875EbX c6875EbX = new C6875EbX(list, eb0, c6871EbT, this.A08, i3, this.A01, this.A03, this.A04);
        InterfaceC6926EcZ interfaceC6926EcZ = list.get(i);
        C6886Ebi c6886EbiANq = interfaceC6926EcZ.ANq(c6875EbX);
        if (c6886EbiANq == null) {
            throw BV4.A0a(AnonymousClass001.A0v(" returned null", C3cG.A0f(interfaceC6926EcZ, "interceptor ")));
        }
        if (c6871EbT != null && i3 < list.size() && c6875EbX.A00 != 1) {
            throw BV8.A0m(" must call proceed() exactly once", C3cG.A0f(interfaceC6926EcZ, "network interceptor "));
        }
        if (c6886EbiANq.A0B != null) {
            return c6886EbiANq;
        }
        throw BV8.A0m(" returned a response with no body", C3cG.A0f(interfaceC6926EcZ, "interceptor "));
    }

    /* JADX WARN: Incorrect types in method signature: (LX/EbM;Ljava/util/List<+LX/EcZ;>;ILX/EbT;LX/Eb0;III)V */
    public C6875EbX(List list, Eb0 eb0, C6871EbT c6871EbT, C6864EbM c6864EbM, int i, int i2, int i3, int i4) {
        this.A08 = c6864EbM;
        this.A05 = list;
        this.A02 = i;
        this.A07 = c6871EbT;
        this.A06 = eb0;
        this.A01 = i2;
        this.A03 = i3;
        this.A04 = i4;
    }
}
