package X;

import java.util.Map;

/* renamed from: X.Eie, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7214Eie<T> implements InterfaceC7005EeA {
    public final /* synthetic */ C7482Exf A00;
    public final /* synthetic */ InterfaceC7258Eji A01;
    public final /* synthetic */ C7197Ei9 A02;
    public final /* synthetic */ Ejq A03;
    public final /* synthetic */ C7182Ehs A04;
    public final /* synthetic */ InterfaceC7250EjU A05;
    public final /* synthetic */ Object A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ Map<String, Object> A08;

    /* JADX WARN: Incorrect types in method signature: (LX/Ejq;LX/Eji;LX/Ei9;LX/Ehs;Ljava/lang/Object;LX/EjU;Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;LX/Exf;)V */
    public C7214Eie(C7482Exf c7482Exf, InterfaceC7258Eji interfaceC7258Eji, C7197Ei9 c7197Ei9, Ejq ejq, C7182Ehs c7182Ehs, InterfaceC7250EjU interfaceC7250EjU, Object obj, String str, Map map) {
        this.A03 = ejq;
        this.A01 = interfaceC7258Eji;
        this.A02 = c7197Ei9;
        this.A04 = c7182Ehs;
        this.A06 = obj;
        this.A05 = interfaceC7250EjU;
        this.A07 = str;
        this.A08 = map;
        this.A00 = c7482Exf;
    }

    @Override // X.InterfaceC7005EeA
    public final /* bridge */ /* synthetic */ Object get() {
        C7506EyQ c7506EyQ = (C7506EyQ) this.A03;
        InterfaceC7258Eji interfaceC7258Eji = this.A01;
        C7197Ei9 c7197Ei9 = this.A02;
        C7384Etj.A0Y(c7506EyQ, 0);
        C7183Eht c7183EhtA5V = interfaceC7258Eji.A5V(c7506EyQ.A00, c7197Ei9);
        C7182Ehs c7182Ehs = this.A04;
        Object obj = this.A06;
        InterfaceC7250EjU interfaceC7250EjU = this.A05;
        EnumC7058Ef5 enumC7058Ef5 = EnumC7058Ef5.FULL_FETCH;
        Map<String, Object> map = this.A08;
        C7482Exf c7482Exf = this.A00;
        if (c7482Exf != null) {
            map.put("viewport", c7482Exf);
        }
        map.put("scaletype", ((AbstractC7191Ei2) c7197Ei9).A01);
        if (c7183EhtA5V == null) {
            InterfaceC7236Ej0<EfF<InterfaceC7064EfB>> interfaceC7236Ej0 = AbstractC7216Eig.A00.get();
            C7384Etj.A0X(interfaceC7236Ej0);
            return interfaceC7236Ej0;
        }
        try {
            C7154EhP c7154EhP = c7182Ehs.A07;
            C7267Ejs.A00();
            return C7182Ehs.A01(c7182Ehs, interfaceC7250EjU, C7154EhP.A04(c7154EhP, c7183EhtA5V), enumC7058Ef5, c7183EhtA5V, obj, map);
        } catch (Exception e) {
            C7207EiP c7207EiP = new C7207EiP();
            c7207EiP.A07(e, null);
            return c7207EiP;
        }
    }
}
