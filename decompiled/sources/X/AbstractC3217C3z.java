package X;

import java.io.File;

/* renamed from: X.C3z, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3217C3z {
    public static String A00(File file) {
        if (!file.getName().endsWith(".apk")) {
            throw C60O.A0i("Non-apk found in splits directory.");
        }
        String name = file.getName();
        String str = "";
        String strReplaceFirst = name.replaceFirst("(_\\d+)?\\.apk", "");
        if (strReplaceFirst.equals("base-master") || strReplaceFirst.equals("base-main")) {
            return "";
        }
        String str2 = "base-";
        if (strReplaceFirst.startsWith("base-")) {
            str = "config.";
        } else {
            strReplaceFirst = strReplaceFirst.replace("-", ".config.").replace(".config.master", "");
            str2 = ".config.main";
        }
        return strReplaceFirst.replace(str2, str);
    }
}
