package X;

import com.facebook.aura.opengraph.HatchWebPageParserKt;
import java.nio.charset.Charset;
import java.util.regex.Pattern;

/* renamed from: X.Hne, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10501Hne {
    public static final Pattern A01 = Pattern.compile("(?i)\\bcharset=\\s*(?:[\"'])?([^\\s,;\"']*)");
    public static final Charset A00 = Charset.forName(HatchWebPageParserKt.UTF_8);
    public static final char[] A03 = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    public static final AbstractC10245Gsg A02 = GtJ.A08("meta[http-equiv=content-type], meta[charset]");
}
