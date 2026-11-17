package X;

import android.graphics.Color;
import android.text.TextUtils;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.google.common.base.Ascii;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.Hay, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10390Hay {
    public static final Map<String, Integer> A00;
    public static final Pattern A03 = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    public static final Pattern A02 = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
    public static final Pattern A01 = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");

    static {
        HashMap mapA0u = BV4.A0u();
        A00 = mapA0u;
        Integer numA0W = AbstractC7611F5y.A0W(mapA0u);
        AbstractC7611F5y.A12(mapA0u);
        AbstractC7611F5y.A0s(numA0W, mapA0u);
        AbstractC7611F5y.A0t(-7667573, mapA0u);
        mapA0u.put("dimgray", -9868951);
        mapA0u.put("dimgrey", -9868951);
        Integer numA0V = AbstractC7611F5y.A0V(-14774017, mapA0u);
        AbstractC7611F5y.A10(mapA0u);
        AbstractC7611F5y.A0r(AbstractC7611F5y.A0X(mapA0u), numA0V, mapA0u);
        AbstractC7611F5y.A16(mapA0u);
        AbstractC7611F5y.A15(mapA0u);
        AbstractC7611F5y.A14(mapA0u);
        AbstractC7611F5y.A13(mapA0u);
        mapA0u.put("transparent", BV4.A0V());
        AbstractC7611F5y.A11(mapA0u);
    }

    public static int A00(String str, boolean z) {
        int i;
        C1G.A07(!TextUtils.isEmpty(str));
        String strReplace = str.replace(InviteCodeScratcherKt.CODE_SEPARATOR, "");
        if (AbstractC7607F5u.A00(strReplace) == '#') {
            int i2 = (int) Long.parseLong(strReplace.substring(1), 16);
            int length = strReplace.length();
            if (length == 7) {
                i = -16777216;
            } else {
                if (length != 9) {
                    throw BV4.A0P();
                }
                i = (i2 & 255) << 24;
                i2 >>>= 8;
            }
            return i | i2;
        }
        if (strReplace.startsWith("rgba")) {
            Matcher matcher = (z ? A01 : A02).matcher(strReplace);
            if (matcher.matches()) {
                String strA0p = BV6.A0p(matcher, 4);
                return Color.argb(z ? (int) (Float.parseFloat(strA0p) * 255.0f) : Integer.parseInt(strA0p, 10), Integer.parseInt(BV6.A0p(matcher, 1), 10), Integer.parseInt(BV6.A0p(matcher, 2), 10), Integer.parseInt(BV6.A0p(matcher, 3), 10));
            }
        } else if (strReplace.startsWith("rgb")) {
            Matcher matcher2 = A03.matcher(strReplace);
            if (matcher2.matches()) {
                return Color.rgb(Integer.parseInt(BV6.A0p(matcher2, 1), 10), Integer.parseInt(BV6.A0p(matcher2, 2), 10), Integer.parseInt(BV6.A0p(matcher2, 3), 10));
            }
        } else {
            Number numberA0b = BV4.A0b(Ascii.toLowerCase(strReplace), A00);
            if (numberA0b != null) {
                return numberA0b.intValue();
            }
        }
        throw BV4.A0P();
    }
}
