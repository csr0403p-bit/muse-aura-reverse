package androidx.camera.core.internal.compat.quirk;

import X.BV5;
import X.BX1;
import java.util.Set;

/* loaded from: classes5.dex */
public final class LargeJpegImageQuirk implements BX1 {
    public static final Set<String> A00;
    public static final Set<String> A01;

    static {
        String[] strArr = new String[31];
        System.arraycopy(new String[]{"SM-G930V", "SM-S901B", "SM-S901B/DS", "SM-S906B"}, BV5.A1U(new String[]{"SM-A520F", "SM-A520L", "SM-A520K", "SM-A520S", "SM-A520X", "SM-A520W", "SM-A525F", "SM-A525M", "SM-A705F", "SM-A705FN", "SM-A705GM", "SM-A705MN", "SM-A7050", "SM-A705W", "SM-A705YN", "SM-A705U", "SM-A715F", "SM-A715F/DS", "SM-A715F/DSM", "SM-A715F/DSN", "SM-A715W", "SM-A715X", "SM-A725F", "SM-A725M", "SM-M515F", "SM-M515F/DSN", "SM-G930T"}, strArr) ? 1 : 0, strArr, 27, 4);
        A00 = BV5.A0v(strArr);
        A01 = BV5.A0v(new String[]{"V2244A", "V2045", "V2046"});
    }
}
