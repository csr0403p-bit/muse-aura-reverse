package X;

import android.net.Uri;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public abstract class DFJ {
    public static final FCQ<Uri, Uri> A00;
    public static final FCQ<Uri, Uri> A01;
    public static final Pattern A02 = Pattern.compile("^(z-.*)?(origincache.*|cdn).fbsbx.com$");
    public static final ThreadLocal<StringBuilder> A03;
    public static final Set<String> A04;

    static {
        HashSet hashSet = new HashSet(6);
        Collections.addAll(hashSet, "__gda__", "oh", "oe", "hdnea", "logcdn", "efg");
        A04 = Collections.unmodifiableSet(hashSet);
        A01 = new FCQ<>(100);
        A00 = new FCQ<>(100);
        A03 = new ThreadLocal<>();
    }
}
