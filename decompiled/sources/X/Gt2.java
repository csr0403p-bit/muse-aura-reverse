package X;

import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/* loaded from: classes6.dex */
public abstract class Gt2 {
    /* JADX WARN: Incorrect types in method signature: <T:LX/Gt4;>(LX/Gt4;Ljava/lang/Class<TT;>;)Ljava/util/stream/Stream<TT;>; */
    public static Stream A00(Class cls, Gt4 gt4) {
        return StreamSupport.stream(Spliterators.spliteratorUnknownSize(new C10259Gsy(cls, gt4), 273), false);
    }

    public static C10532Hqa A01(Gt4 gt4) {
        Gt8 gt8;
        while (true) {
            if (gt4 == null) {
                break;
            }
            if (gt4 instanceof Gt8) {
                gt8 = (Gt8) gt4;
                if (gt8 == null) {
                    break;
                }
            } else {
                gt4 = gt4.A01;
            }
        }
        String str = Gt3.A03;
        gt8 = new Gt8("http://www.w3.org/1999/xhtml", "", new GtC(new C10316GuW(0)));
        return gt8.A01;
    }
}
