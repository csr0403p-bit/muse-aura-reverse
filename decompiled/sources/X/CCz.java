package X;

import android.content.Context;
import com.facebook.aura.analytics.waterfall.HatchPriceImpressionEventDataKt;
import java.io.File;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class CCz {
    public final CDT A00;
    public final File A01;

    public final CDB A02(Context context, String str) {
        CDI cdi = CDH.A04.A00().A00;
        cdi.A05(context);
        Integer num = C79.A01;
        boolean z = CDI.A02(cdi, num, str) != null;
        CDA cdaA00 = CD3.A00(context, str);
        File fileA00 = cdaA00.A01;
        File fileA002 = cdaA00.A00;
        if (fileA00 == null) {
            fileA00 = A00(str);
        }
        if (fileA002 == null && z) {
            String strA02 = CDI.A02(cdi, num, str);
            if (strA02 == null) {
                throw C3cG.A0Q("Required value was null.");
            }
            fileA002 = A00(strA02);
        }
        if (fileA00 != null) {
            return new CDB(fileA00, fileA002);
        }
        throw C3cG.A0Q("Required value was null.");
    }

    public CCz(Context context) {
        File fileA00 = AbstractC3416CMe.A00(context, 211429074);
        this.A01 = fileA00;
        try {
            this.A00 = new CDT(fileA00.getCanonicalPath());
        } catch (IOException unused) {
            throw new SecurityException("Cannot resolve the canonical path of the module's root dir.");
        }
    }

    public final CD4 A00(String str) {
        return new CD4(this.A00, C3cG.A0O(A01(str), "download.zip"), false);
    }

    public final CD4 A01(String str) {
        String strA00 = AbstractC7473ExH.A00(str);
        EnumC3180C1k enumC3180C1kA00 = EnumC3180C1k.A00(str);
        String strA01 = CDI.A01(CDH.A04.A00().A00, enumC3180C1kA00 == EnumC3180C1k.A02 ? C79.A00 : C79.A01, strA00);
        File file = this.A01;
        if (strA01 == null) {
            strA01 = HatchPriceImpressionEventDataKt.NO_DISCOUNT;
        }
        return new CD4(this.A00, C3cG.A0O(file, FGI.A0U(str, "_", strA01)), false);
    }
}
