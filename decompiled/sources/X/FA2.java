package X;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class FA2 {
    public static final HsM A00(FDW fdw, Object obj, List list, int i) {
        F9F f9f;
        C7384Etj.A0Y(obj, 3);
        if (obj instanceof HsM) {
            return (HsM) obj;
        }
        if (obj instanceof FDG) {
            FDG fdg = (FDG) obj;
            C7648F8p c7648F8p = fdw.A09;
            FDK fdk = fdg.A01;
            return fdg.A00(fdk == null ? null : fdk.A00, c7648F8p);
        }
        if (!(obj instanceof String)) {
            FFI.A01(null, FGI.A0V("Unsupported value type: ", C60Q.A0e(obj), " for key: ", i), null);
            return null;
        }
        String str = (String) obj;
        F9H f9h = fdw.A01;
        if (f9h != null) {
            F99 f99 = new F99(f9h);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC7608F5v.A1A(C60Q.A03(it), f99.A01);
            }
            f9f = new F9F(f99.A00, f99.A01);
        } else {
            f9f = null;
        }
        return new FDG(f9f, fdw.A09, (Integer) null, str);
    }
}
