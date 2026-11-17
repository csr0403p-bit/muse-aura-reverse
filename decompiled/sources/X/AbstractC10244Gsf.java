package X;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/* renamed from: X.Gsf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10244Gsf {
    public static C10242Gsb A00(Gt3 gt3, AbstractC10245Gsg abstractC10245Gsg) {
        Stream streamA00;
        int i;
        if (abstractC10245Gsg.A02()) {
            abstractC10245Gsg.A01();
            streamA00 = Gt2.A00(Gt3.class, gt3);
            i = 0;
        } else {
            abstractC10245Gsg.A01();
            streamA00 = Gt2.A00(Gt3.class, gt3);
            i = 1;
        }
        C10242Gsb c10242Gsb = (C10242Gsb) streamA00.filter(new C8932Fto(gt3, abstractC10245Gsg, i)).collect(Collectors.toCollection(new C8927Ftj(4)));
        abstractC10245Gsg.A01();
        return c10242Gsb;
    }
}
