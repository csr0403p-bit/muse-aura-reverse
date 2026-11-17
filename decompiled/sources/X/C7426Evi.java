package X;

import com.facebook.aura.opengraph.HatchWebPageParserKt;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* renamed from: X.Evi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7426Evi {
    public static final C7426Evi A00 = new C7426Evi();
    public static final Pattern A01 = Pattern.compile("((?:\\?|&|#|^)(?:oh|oh2)=)([^&#]+)", 2);

    public static final String A00(String str) {
        if (str == null) {
            return str;
        }
        if (C7BY.A0q(str, "?url=", false) || C7BY.A0q(str, "&url=", false)) {
            int iA0B = C7BY.A0B(str, "&url=", 0, false);
            if (iA0B == -1) {
                iA0B = C7BY.A0B(str, "?url=", 0, false);
            }
            if (iA0B != -1) {
                int i = iA0B + 5;
                int iA08 = C7BY.A08(str, '&', i);
                if (iA08 == -1) {
                    iA08 = str.length();
                }
                try {
                    String strDecode = URLDecoder.decode(str.substring(i, iA08), HatchWebPageParserKt.UTF_8);
                    C7384Etj.A0X(strDecode);
                    String strEncode = URLEncoder.encode(A01(strDecode), HatchWebPageParserKt.UTF_8);
                    C7384Etj.A0X(strEncode);
                    str = FGI.A0U(str.substring(0, i), strEncode, str.substring(iA08));
                } catch (UnsupportedEncodingException unused) {
                }
            }
        }
        return A01(str);
    }

    public static final String A01(String str) {
        Matcher matcher = A01.matcher(str);
        if (!matcher.find()) {
            return str;
        }
        StringBuilder sbA0w = C60O.A0w();
        int i = 0;
        do {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            sbA0w.append(str.substring(i, iStart));
            sbA0w.append(matcher.group(1));
            if (matcher.group(2) != null) {
                String strGroup = matcher.group(2);
                sbA0w.append(AbstractC2159Azp.A0z(new String(new char[strGroup != null ? strGroup.length() : 0]), WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, "x"));
                i = iEnd;
            }
        } while (matcher.find());
        return AnonymousClass001.A0v(str.substring(i), sbA0w);
    }
}
