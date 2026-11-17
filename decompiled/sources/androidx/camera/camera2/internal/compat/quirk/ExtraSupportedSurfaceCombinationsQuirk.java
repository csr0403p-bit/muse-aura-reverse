package androidx.camera.camera2.internal.compat.quirk;

import X.AnonymousClass005;
import X.BV5;
import X.BV6;
import X.BX1;
import X.C2409BaO;
import X.C79;
import X.EnumC2408BaN;
import android.os.Build;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes5.dex */
public class ExtraSupportedSurfaceCombinationsQuirk implements BX1 {
    public static final C2409BaO A00;
    public static final C2409BaO A01;
    public static final Set<String> A02;
    public static final Set<String> A03;

    static {
        C2409BaO c2409BaO = new C2409BaO();
        Integer num = C79.A01;
        EnumC2408BaN enumC2408BaN = EnumC2408BaN.VGA;
        C2409BaO.A03(c2409BaO, enumC2408BaN, num);
        Integer num2 = C79.A00;
        EnumC2408BaN enumC2408BaN2 = EnumC2408BaN.PREVIEW;
        C2409BaO.A03(c2409BaO, enumC2408BaN2, num2);
        EnumC2408BaN enumC2408BaN3 = EnumC2408BaN.MAXIMUM;
        C2409BaO.A03(c2409BaO, enumC2408BaN3, num);
        A00 = c2409BaO;
        C2409BaO c2409BaOA00 = C2409BaO.A00(enumC2408BaN2, num2);
        C2409BaO.A03(c2409BaOA00, enumC2408BaN, num2);
        C2409BaO.A03(c2409BaOA00, enumC2408BaN3, num);
        A01 = c2409BaOA00;
        A02 = BV5.A0v(new String[]{"PIXEL 6", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO"});
        A03 = BV5.A0v(new String[]{"SM-S921", "SC-51E", "SCG25", "SM-S926", "SM-S928", "SC-52E", "SCG26"});
    }

    public static boolean A00() {
        if (!BV6.A1a("samsung")) {
            return false;
        }
        String upperCase = Build.MODEL.toUpperCase(Locale.US);
        Iterator<String> it = A03.iterator();
        while (it.hasNext()) {
            if (upperCase.startsWith(AnonymousClass005.A0j(it))) {
                return true;
            }
        }
        return false;
    }
}
