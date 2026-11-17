package X;

import com.facebook.common.dextricks.RuntimeInternals;
import java.io.File;

/* renamed from: X.C3n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3212C3n {
    public static String A00(File file) {
        String name = file.getName();
        if (name.equals(RuntimeInternals.APK_BASE_NAME)) {
            return "base";
        }
        if (name.startsWith("split_") && name.endsWith(".apk")) {
            return name.substring(6, name.length() - 4);
        }
        return null;
    }
}
