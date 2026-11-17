package com.facebook.aura.startup.fresco;

import X.C10343HBh;
import X.C60O;
import X.C7384Etj;
import X.HBA;
import android.graphics.RectF;

/* loaded from: classes6.dex */
public abstract class AuraSvgSupportKt {
    public static final int NO_INTRINSIC_SIZE = -1;
    public static final int SVG_HEADER_SIZE = 256;

    public static final int documentSize(HBA hba, boolean z) {
        float f;
        C7384Etj.A0Y(hba, 0);
        C10343HBh c10343HBh = hba.A01;
        if (z) {
            if (c10343HBh == null) {
                throw C60O.A0i("SVG document is empty");
            }
            f = HBA.A00(hba).A03;
        } else {
            if (c10343HBh == null) {
                throw C60O.A0i("SVG document is empty");
            }
            f = HBA.A00(hba).A00;
        }
        int i = (int) f;
        if (i > 0) {
            return i;
        }
        RectF rectFA03 = hba.A03();
        if (rectFA03 != null) {
            return (int) (z ? rectFA03.width() : rectFA03.height());
        }
        return 0;
    }
}
