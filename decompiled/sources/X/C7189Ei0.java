package X;

import java.util.Map;
import java.util.concurrent.CancellationException;

/* renamed from: X.Ei0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7189Ei0 implements InterfaceC7146EhC {
    public static final Throwable A02 = BV4.A0a("No image to prefetch.");
    public final InterfaceC7258Eji A00;
    public final C7182Ehs A01;

    public static final InterfaceC7236Ej0 A00(C7189Ei0 c7189Ei0, C7183Eht c7183Eht, Integer num, Object obj, Map map) {
        InterfaceC7015EeM<Void> c7078Efc;
        Throwable th;
        if (c7183Eht == null) {
            th = A02;
        } else {
            int iIntValue = num.intValue();
            C7182Ehs c7182Ehs = c7189Ei0.A01;
            try {
                if (iIntValue != 0) {
                    EnumC7203EiK enumC7203EiK = EnumC7203EiK.A04;
                    if (AnonymousClass001.A1X(c7182Ehs.A01.get())) {
                        return C7182Ehs.A00(enumC7203EiK, c7182Ehs, c7182Ehs.A07.A06(c7183Eht), EnumC7058Ef5.FULL_FETCH, c7183Eht, obj, "disk", map);
                    }
                } else {
                    CancellationException cancellationException = C7182Ehs.A0E;
                    EnumC7203EiK enumC7203EiK2 = EnumC7203EiK.A04;
                    C7267Ejs.A00();
                    boolean zA00 = true;
                    if (AnonymousClass001.A1X(c7182Ehs.A01.get())) {
                        Boolean bool = c7183Eht.A0E;
                        if (bool == null) {
                            zA00 = InterfaceC7005EeA.A00(c7182Ehs.A02);
                        } else if (bool.booleanValue()) {
                            zA00 = false;
                        }
                        C7154EhP c7154EhP = c7182Ehs.A07;
                        if (zA00) {
                            c7078Efc = c7154EhP.A06(c7183Eht);
                        } else {
                            InterfaceC7015EeM<EfF<InterfaceC7064EfB>> interfaceC7015EeMA04 = C7154EhP.A04(c7154EhP, c7183Eht);
                            synchronized (c7154EhP) {
                                Map<InterfaceC7015EeM<EfF<InterfaceC7064EfB>>, InterfaceC7015EeM<Void>> map2 = c7154EhP.A00;
                                c7078Efc = map2.get(interfaceC7015EeMA04);
                                if (c7078Efc == null) {
                                    C7384Etj.A0Y(interfaceC7015EeMA04, 0);
                                    c7078Efc = new C7078Efc<>(interfaceC7015EeMA04);
                                    map2.put(interfaceC7015EeMA04, c7078Efc);
                                }
                            }
                        }
                        return C7182Ehs.A00(enumC7203EiK2, c7182Ehs, c7078Efc, EnumC7058Ef5.FULL_FETCH, c7183Eht, obj, zA00 ? "encoded" : "bitmap", map);
                    }
                }
                th = C7182Ehs.A0E;
            } catch (Exception e) {
                C7207EiP c7207EiP = new C7207EiP();
                c7207EiP.A07(e, null);
                return c7207EiP;
            }
        }
        C7207EiP c7207EiP2 = new C7207EiP();
        c7207EiP2.A07(th, null);
        return c7207EiP2;
    }

    public C7189Ei0(InterfaceC7258Eji interfaceC7258Eji, C7182Ehs c7182Ehs) {
        this.A01 = c7182Ehs;
        this.A00 = interfaceC7258Eji;
    }
}
