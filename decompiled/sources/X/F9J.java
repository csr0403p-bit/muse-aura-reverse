package X;

import android.app.Application;
import android.content.Context;
import com.instagram.common.bloks.BloksParseResult;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class F9J {
    /* JADX WARN: Incorrect types in method signature: (Landroid/content/Context;LX/HjT;LX/Hj6;LX/FBD;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)Ljava/lang/Object; */
    public static Object A00(Context context, HjT hjT, FBD fbd, Hj6 hj6, Map map) {
        Integer num = C79.A01;
        FDW fdw = new FDW(-1);
        F9T f9t = hjT.A01;
        F9b f9b = new F9b(new BloksParseResult(null, f9t, fdw, null), F9N.A00);
        if (context instanceof Application) {
            FFI.A01(null, "Creating BloksContext with Application Context. This may break the ability to execute navigation actions correctly", null);
        }
        FBB fbbA01 = FBA.A01(context, BV4.A0B(), f9b, fbd, hjT.A03);
        f9b.A03(fbbA01, new F9L(), Collections.EMPTY_MAP);
        FBA.A03(fbbA01).A06(new BloksParseResult(null, f9t, new FDW(-1), null), BloksParseResult.A03(f9t.A03, map));
        return AbstractC7691FAk.A01(F6D.A01(fbbA01, null), hj6, hjT.A02, num);
    }

    public static void A01(HjT hjT, C7633F7q c7633F7q, F6D f6d, Map map) {
        FBB fbb = f6d.A02;
        if (fbb == null) {
            FFI.A01(null, "Async action executed with a null Context", null);
            return;
        }
        F9T f9t = hjT.A01;
        FBA.A03(fbb).A06(new BloksParseResult(null, f9t, new FDW(-1), null), BloksParseResult.A03(f9t.A03, map));
        Htq<F6D> htqA02 = FBA.A02(fbb);
        String strA02 = FBB.A02(fbb);
        String str = f6d.A01;
        if (str == null) {
            throw AbstractC7608F5v.A0e();
        }
        Object objA00 = AbstractC7691FAk.A00(new F6D(null, fbb, null, null, null, htqA02, null, C79.A01, strA02, str, null, false), C9115Fyg.A04(fbb), ((FDG) hjT.A02).A00(((F6L) f6d).A00, null));
        if (c7633F7q != null) {
            c7633F7q.A00(C9115Fyg.A03(C9115Fyg.A02(objA00), fbb, 1), null);
        }
    }

    public static void A02(FBB fbb, FDW fdw, C9115Fyg c9115Fyg, HsM hsM) {
        A04(fbb, fdw, c9115Fyg.A05(), hsM);
    }

    public static void A03(FBB fbb, FDW fdw, C9115Fyg c9115Fyg, HsM hsM, int i) {
        c9115Fyg.A06(fbb, i);
        A04(fbb, fdw, c9115Fyg.A05(), hsM);
    }

    public static void A04(FBB fbb, FDW fdw, Hj6 hj6, HsM hsM) {
        F6D.A03(fbb, fdw, hj6, hsM);
    }
}
