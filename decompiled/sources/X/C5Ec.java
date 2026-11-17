package X;

import android.os.Build;

/* renamed from: X.5Ec, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C5Ec {
    public static String A00(int i, int i2) {
        switch (i) {
            case 1:
                return "intentional_exit";
            case 2:
                return i2 == 9 ? "unexplained" : "native";
            case 3:
                return "lmk";
            case 4:
                return "java";
            case 5:
                return "native";
            case 6:
                return "anr";
            case 7:
                return "initialization_failure";
            case 8:
                return "permission_change";
            case 9:
                return "excessive_resource_usage";
            case 10:
                return DBJ.FIRST_RUN_UPGRADE;
            case 11:
                return "user_stopped";
            case 12:
                return "dependency_died";
            default:
                return Build.VERSION.SDK_INT >= 33 ? C5Ed.A00(i) : "unexplained";
        }
    }
}
