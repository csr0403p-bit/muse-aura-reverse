package com.facebook.aura.common.identifiers.fdid;

import X.C6572EHo;
import X.EHg;
import X.EHn;

/* loaded from: classes5.dex */
public final class AuraFamilyDeviceId {
    public static volatile EHn provider;
    public static final AuraFamilyDeviceId INSTANCE = new AuraFamilyDeviceId();
    public static final EHg store = new EHg(AuraFdidStorage.INSTANCE);

    /* JADX WARN: Removed duplicated region for block: B:107:0x020d A[Catch: all -> 0x023a, TRY_ENTER, TryCatch #6 {, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0030, B:10:0x0035, B:11:0x0054, B:13:0x005a, B:15:0x0068, B:17:0x0072, B:19:0x0078, B:20:0x007e, B:22:0x0084, B:24:0x008e, B:27:0x0098, B:28:0x00a6, B:30:0x00ac, B:86:0x01d0, B:109:0x0212, B:107:0x020d, B:115:0x0228, B:116:0x022b, B:110:0x021e, B:117:0x022c), top: B:132:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x021e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0212 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void init(android.content.Context r26) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.common.identifiers.fdid.AuraFamilyDeviceId.init(android.content.Context):void");
    }

    public final String get() {
        String str;
        C6572EHo c6572EHoA00 = store.A00();
        if (c6572EHoA00 == null || (str = c6572EHoA00.A01) == null || str.length() <= 0) {
            return null;
        }
        return str;
    }
}
