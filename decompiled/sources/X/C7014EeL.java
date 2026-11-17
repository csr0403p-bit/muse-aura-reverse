package X;

/* renamed from: X.EeL, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7014EeL implements InterfaceC7015EeM<C6988Edo> {
    public final InterfaceC7013EeK<C6988Edo>[] A00;

    public static boolean A00(InterfaceC7028EeZ interfaceC7028EeZ, InterfaceC7029Eea interfaceC7029Eea, C7014EeL c7014EeL, int i) {
        C7481Exe c7481Exe = ((C7185Ehv) interfaceC7029Eea).A07.A08;
        while (true) {
            InterfaceC7013EeK<C6988Edo>[] interfaceC7013EeKArr = c7014EeL.A00;
            if (i >= interfaceC7013EeKArr.length) {
                return false;
            }
            if (interfaceC7013EeKArr[i].A5u(c7481Exe)) {
                if (i == -1) {
                    return false;
                }
                interfaceC7013EeKArr[i].AYc(new C7016EeN(interfaceC7028EeZ, interfaceC7029Eea, c7014EeL, i), interfaceC7029Eea);
                return true;
            }
            i++;
        }
    }

    @Override // X.InterfaceC7015EeM
    public final void AYc(InterfaceC7028EeZ<C6988Edo> interfaceC7028EeZ, InterfaceC7029Eea interfaceC7029Eea) {
        if (((C7185Ehv) interfaceC7029Eea).A07.A08 == null || !A00(interfaceC7028EeZ, interfaceC7029Eea, this, 0)) {
            interfaceC7028EeZ.AUL(null, 1);
        }
    }

    public C7014EeL(InterfaceC7013EeK<C6988Edo>... interfaceC7013EeKArr) {
        interfaceC7013EeKArr.getClass();
        this.A00 = interfaceC7013EeKArr;
        int length = interfaceC7013EeKArr.length;
        if (0 >= length) {
            throw BV6.A0g(CVn.A00("%s (%s) must be less than size (%s)", BV8.A1b("index", 0, length)));
        }
    }
}
