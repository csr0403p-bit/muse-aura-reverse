package X;

import java.io.Serializable;
import java.util.ArrayList;

/* renamed from: X.GjA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9862GjA implements Serializable {
    public static final long serialVersionUID = 1;
    public final C9860Gj8 _factory;

    public static final IllegalArgumentException A01(C9864GjC c9864GjC, String str) {
        String str2 = c9864GjC.A02;
        return BV5.A0T("Failed to parse type %s (remaining: %s): %s", new Object[]{A02(str2), A02(str2.substring(c9864GjC.A00)), str});
    }

    public C9862GjA(C9860Gj8 c9860Gj8) {
        this._factory = c9860Gj8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Class] */
    public static final AbstractC9870GjI A00(C9864GjC c9864GjC, C9862GjA c9862GjA, int i) {
        String strA0U;
        if (c9864GjC.hasMoreTokens()) {
            String strNextToken = c9864GjC.nextToken();
            try {
                strNextToken = c9862GjA._factory.A0D(strNextToken);
                if (c9864GjC.hasMoreTokens()) {
                    String strNextToken2 = c9864GjC.nextToken();
                    if ("<".equals(strNextToken2)) {
                        int i2 = i - 1;
                        if (i2 >= 0) {
                            ArrayList arrayListA0h = C3cG.A0h();
                            while (c9864GjC.hasMoreTokens()) {
                                arrayListA0h.add(A00(c9864GjC, c9862GjA, i2));
                                if (!c9864GjC.hasMoreTokens()) {
                                    break;
                                }
                                String strNextToken3 = c9864GjC.nextToken();
                                if (">".equals(strNextToken3)) {
                                    C9861Gj9 c9861Gj9 = C9861Gj9.A00;
                                    return c9862GjA._factory.A07(null, C9861Gj9.A02(strNextToken, arrayListA0h.isEmpty() ? C9861Gj9.A01 : (AbstractC9870GjI[]) arrayListA0h.toArray(C9861Gj9.A01)), strNextToken);
                                }
                                if (!",".equals(strNextToken3)) {
                                    strA0U = FGI.A0U("Unexpected token '", strNextToken3, "', expected ',' or '>')");
                                    break;
                                }
                            }
                            strA0U = "Unexpected end-of-string";
                        } else {
                            strA0U = "too deeply nested; exceeds maximum of 1000 nesting levels";
                        }
                    } else {
                        c9864GjC.A01 = strNextToken2;
                    }
                }
                return c9862GjA._factory.A07(null, C9861Gj9.A00, strNextToken);
            } catch (Exception e) {
                AbstractC9855Gj3.A0F(e);
                throw A01(c9864GjC, FGI.A0d("Cannot locate class '", strNextToken, "', problem: ", e.getMessage()));
            }
        }
        strA0U = "Unexpected end-of-string";
        throw A01(c9864GjC, strA0U);
    }

    public static String A02(String str) {
        int length = str.length();
        return length <= 1000 ? FGI.A0U("'", str, "'") : String.format("'%s...'[truncated %d charaters]", BV4.A0j(str, 1000), Integer.valueOf(length - 1000));
    }
}
