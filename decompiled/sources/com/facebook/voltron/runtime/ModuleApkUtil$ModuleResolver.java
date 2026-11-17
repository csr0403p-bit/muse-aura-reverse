package com.facebook.voltron.runtime;

import X.C06827l3;
import X.C7384Etj;
import X.CDA;
import X.FGI;
import android.content.Context;

/* loaded from: classes5.dex */
public final class ModuleApkUtil$ModuleResolver {
    public static final ModuleApkUtil$ModuleResolver A00 = new ModuleApkUtil$ModuleResolver();

    public static final String A01(Context context, String str) {
        return A00.A03(context, str);
    }

    public static final CDA A00(Context context, String str) {
        return new CDA(A01(context, str), A02(context, str));
    }

    public static final String A02(Context context, String str) {
        C06827l3 c06827l3A02 = C06827l3.A02(FGI.A0U("split_", str, "\\.config\\.(armeabi_v7a|arm64_v8a|x86|x86_64)\\.apk$"));
        String[] strArr = context.getApplicationInfo().splitSourceDirs;
        if (strArr != null) {
            for (String str2 : strArr) {
                C7384Etj.A0X(str2);
                if (c06827l3A02.A07(str2)) {
                    return str2;
                }
            }
        }
        return null;
    }

    public final String A03(Context context, String str) {
        String[] strArr = context.getApplicationInfo().splitSourceDirs;
        if (strArr != null) {
            String strA0U = FGI.A0U("split_", str, ".apk");
            for (String str2 : strArr) {
                C7384Etj.A0X(str2);
                if (str2.endsWith(strA0U)) {
                    return str2;
                }
            }
        }
        return null;
    }
}
