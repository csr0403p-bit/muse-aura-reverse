package X;

/* renamed from: X.FwW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8993FwW<T> {
    public final InterfaceC9033FxE<?, T> A00;
    public final Integer A01;
    public final String A02;
    public final String A03;

    public static C8993FwW A00(Integer num, Object obj, String str, String str2, int i) {
        return A02(num, str, str2, new C8838Fqo(obj, i));
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;LX/FwX;Ljava/lang/String;)LX/FwW<Ljava/lang/Long;>; */
    public static final C8993FwW A01(Integer num, String str, String str2) {
        return new C8993FwW(new InterfaceC8991FwU() { // from class: X.FwY
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return obj;
            }
        }, num, str, str2);
    }

    /* JADX WARN: Incorrect types in method signature: <R:Ljava/lang/Object;>(Ljava/lang/String;LX/FwX;Ljava/lang/String;LX/G0U<-Ljava/lang/Double;+TR;>;)LX/FwW<TR;>; */
    public static final C8993FwW A02(Integer num, String str, String str2, G0U g0u) {
        return new C8993FwW(new C10462Hjo(g0u), num, str, str2);
    }

    public final String A03() {
        String strA00 = AbstractC8994FwX.A00(this.A01);
        String str = this.A02;
        String str2 = this.A03;
        StringBuilder sbA0w = C60O.A0w();
        if (str == null) {
            sbA0w.append(str2);
        } else {
            sbA0w.append(str2);
            sbA0w.append('_');
            sbA0w.append(str);
        }
        sbA0w.append('_');
        return AnonymousClass001.A0v(strA00, sbA0w);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/FxE<*+TT;>;Ljava/lang/String;LX/FwX;Ljava/lang/String;)V */
    public C8993FwW(InterfaceC9033FxE interfaceC9033FxE, Integer num, String str, String str2) {
        this.A00 = interfaceC9033FxE;
        this.A03 = str;
        this.A01 = num;
        this.A02 = str2;
    }
}
