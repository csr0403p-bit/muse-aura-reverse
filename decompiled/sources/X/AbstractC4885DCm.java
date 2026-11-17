package X;

import com.facebook.aura.opengraph.HatchWebPageParserKt;

/* renamed from: X.DCm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4885DCm extends Enum<AbstractC4885DCm> {
    public final boolean _bigEndian;
    public final int _bits;
    public final String _javaName;

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "UTF-16BE";
            case 2:
                return "UTF-16LE";
            case 3:
                return "UTF-32BE";
            case 4:
                return "UTF-32LE";
            default:
                return HatchWebPageParserKt.UTF_8;
        }
    }
}
