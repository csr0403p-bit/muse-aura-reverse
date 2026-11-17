package X;

/* renamed from: X.3bH, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C3bH {
    public static Object A00(int i, InterfaceC5259DeO interfaceC5259DeO, Object obj) {
        int[] iArr;
        int i2;
        switch ((i >> 14) & 127) {
            case 0:
                switch (i & 16383) {
                    case 0:
                        iArr = C0Zn.A00;
                        return new C3062Bwg(interfaceC5259DeO, iArr);
                    case 1:
                        iArr = C0Zn.A06;
                        return new C3062Bwg(interfaceC5259DeO, iArr);
                    case 2:
                        iArr = C0Zn.A05;
                        return new C3062Bwg(interfaceC5259DeO, iArr);
                    case 3:
                        iArr = C0Zn.A07;
                        return new C3062Bwg(interfaceC5259DeO, iArr);
                    case 4:
                        iArr = C0Zn.A01;
                        return new C3062Bwg(interfaceC5259DeO, iArr);
                    case 5:
                        iArr = C0Zn.A02;
                        return new C3062Bwg(interfaceC5259DeO, iArr);
                    case 6:
                        iArr = C0Zn.A03;
                        return new C3062Bwg(interfaceC5259DeO, iArr);
                    case 7:
                        iArr = C0Zn.A04;
                        return new C3062Bwg(interfaceC5259DeO, iArr);
                    case 8:
                        i2 = 65581;
                        return new De5(i2);
                    case 9:
                        i2 = 49153;
                        return new De5(i2);
                    default:
                        throw new RuntimeException("Nested Switch Binding Exception: ".concat(String.valueOf(i)));
                }
            case 1:
                return C3cK.A00(i, interfaceC5259DeO, obj);
            case 2:
                return C60T.A00(i, interfaceC5259DeO, obj);
            case 3:
                return C8j6.A00(i, interfaceC5259DeO, obj);
            case 4:
                return BVA.A00(i, interfaceC5259DeO, obj);
            case 5:
                return AbstractC7612F5z.A00(i, interfaceC5259DeO, obj);
            default:
                throw new RuntimeException("Method Switch Binding Exception: ".concat(String.valueOf(i)));
        }
    }
}
