package X;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.CFp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3344CFp {
    public static final ThreadLocal<StringWriter> A00 = new ThreadLocal<>();

    public static final Map<String, Object> A00(C3341CFl c3341CFl) throws IOException {
        C3343CFo c3343CFo;
        int i = c3341CFl.A00;
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            String strA0D = c3341CFl.A0D(i2);
            C7384Etj.A0U(strA0D);
            Object objA0C = c3341CFl.A0C(i2);
            if (strA0D.equals("extra") && (objA0C instanceof C3341CFl)) {
                AbstractC3342CFm abstractC3342CFm = (AbstractC3342CFm) objA0C;
                StringWriter stringWriter = new StringWriter();
                synchronized (C3343CFo.A01) {
                    c3343CFo = C3343CFo.A00;
                    if (c3343CFo == null) {
                        c3343CFo = new C3343CFo();
                        C3343CFo.A00 = c3343CFo;
                    }
                    C7384Etj.A0X(c3343CFo);
                }
                c3343CFo.AA5(abstractC3342CFm, stringWriter);
                objA0C = stringWriter.toString();
                C7384Etj.A0U(objA0C);
            }
            map.put(strA0D, objA0C);
        }
        return map;
    }
}
