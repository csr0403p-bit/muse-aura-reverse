package X;

import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public final class CXE extends DgA {
    public static final Pattern A02 = Pattern.compile("(.+?)='(.*?)';", 32);
    public final CharsetDecoder A01 = StandardCharsets.UTF_8.newDecoder();
    public final CharsetDecoder A00 = StandardCharsets.ISO_8859_1.newDecoder();
}
