package X;

import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.Eig, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7216Eig {
    public static final NullPointerException A01 = BV4.A0a("No image request was specified!");
    public static final InterfaceC7005EeA<InterfaceC7236Ej0<EfF<InterfaceC7064EfB>>> A00 = Ej5.A00;

    public static final C7183Eht A01(InterfaceC7258Eji interfaceC7258Eji, C7197Ei9 c7197Ei9, Ejq ejq) {
        Ejq ejq2;
        C7384Etj.A0Y(ejq, 0);
        if (ejq instanceof C7506EyQ) {
            C7506EyQ c7506EyQ = (C7506EyQ) ejq;
            C7384Etj.A0Y(c7506EyQ, 0);
            return interfaceC7258Eji.A5V(c7506EyQ.A00, c7197Ei9);
        }
        if (!(ejq instanceof B1C)) {
            if (!(ejq instanceof C2eD)) {
                if (ejq instanceof F07) {
                    ejq2 = ((F07) ejq).A00;
                } else if (ejq instanceof C7228Eis) {
                    ejq2 = ((C7228Eis) ejq).A00;
                }
                return A01(interfaceC7258Eji, c7197Ei9, ejq2);
            }
            C2eD c2eD = (C2eD) ejq;
            C7384Etj.A0Y(c2eD, 0);
            for (Ejq ejq3 : c2eD.A00) {
                C7183Eht c7183EhtA01 = A01(interfaceC7258Eji, c7197Ei9, ejq3);
                if (c7183EhtA01 != null) {
                    return c7183EhtA01;
                }
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Ejq;LX/Ehs;LX/Eji;LX/Ei9;Ljava/lang/Object;LX/EjU;Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;LX/Exf;)LX/EeA<LX/Ej0<LX/EfF<LX/EfB;>;>;>; */
    public static final InterfaceC7005EeA A00(C7482Exf c7482Exf, InterfaceC7258Eji interfaceC7258Eji, C7197Ei9 c7197Ei9, Ejq ejq, C7182Ehs c7182Ehs, InterfaceC7250EjU interfaceC7250EjU, Object obj, String str, Map map) {
        InterfaceC7005EeA c7232Eiw;
        C7384Etj.A0Y(ejq, 0);
        AnonymousClass005.A11(c7182Ehs, interfaceC7258Eji, c7197Ei9, 1);
        AnonymousClass003.A10(str, map);
        if (ejq instanceof C7506EyQ) {
            return new C7214Eie(c7482Exf, interfaceC7258Eji, c7197Ei9, ejq, c7182Ehs, interfaceC7250EjU, obj, str, map);
        }
        if (!(ejq instanceof B1C)) {
            if (ejq instanceof C2eD) {
                Ejq[] ejqArr = ((C2eD) ejq).A00;
                ArrayList arrayListA11 = C60O.A11(ejqArr.length);
                for (Ejq ejq2 : ejqArr) {
                    arrayListA11.add(A00(c7482Exf, interfaceC7258Eji, c7197Ei9, ejq2, c7182Ehs, interfaceC7250EjU, obj, str, map));
                }
                c7232Eiw = new C7231Eiv(arrayListA11);
            } else if (ejq instanceof F07) {
                F07 f07 = (F07) ejq;
                c7232Eiw = new C7232Eiw(AbstractC0885AGm.A0x(A00(c7482Exf, interfaceC7258Eji, c7197Ei9, f07.A00, c7182Ehs, interfaceC7250EjU, obj, str, map), A00(c7482Exf, interfaceC7258Eji, c7197Ei9, f07.A01, c7182Ehs, interfaceC7250EjU, obj, str, map)));
            } else if (ejq instanceof C7228Eis) {
                C7228Eis c7228Eis = (C7228Eis) ejq;
                c7228Eis.A01 = new C7215Eif(c7482Exf, interfaceC7258Eji, c7197Ei9, c7182Ehs, interfaceC7250EjU, obj, str, map);
                C7228Eis.A00(c7228Eis, c7228Eis.A00, true);
                return c7228Eis.A02;
            }
            return c7232Eiw;
        }
        return A00;
    }
}
