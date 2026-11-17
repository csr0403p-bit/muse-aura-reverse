package com.facebook.aura.nodes.core;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C60O;
import X.C60P;
import X.C7384Etj;
import X.C7BY;
import X.FGI;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;

/* loaded from: classes3.dex */
public abstract class DeviceDisplayNameKt {
    public static final String localDeviceDisplayName(Context context) {
        String string;
        C7384Etj.A0Y(context, 0);
        try {
            string = Settings.Global.getString(context.getContentResolver(), "device_name");
        } catch (Exception unused) {
            string = null;
        }
        if (string != null && !C7BY.A0j(string)) {
            return string;
        }
        String str = Build.MANUFACTURER;
        if (str == null) {
            str = "";
        }
        String strA0l = AnonymousClass002.A0l(str);
        if (strA0l.length() > 0) {
            StringBuilder sbA0w = C60O.A0w();
            strA0l = AnonymousClass001.A0v(C60P.A1N(strA0l, sbA0w), sbA0w);
        }
        String str2 = Build.MODEL;
        String strA0l2 = AnonymousClass002.A0l(FGI.A0U(strA0l, InviteCodeScratcherKt.CODE_SEPARATOR, AnonymousClass002.A0l(str2 != null ? str2 : "")));
        return C7BY.A0j(strA0l2) ? "Android" : strA0l2;
    }
}
