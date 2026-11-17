package com.facebook.aura.avatarassets.path;

import X.C7384Etj;
import X.C7BY;

/* loaded from: classes.dex */
public abstract class AvatarPathKt {
    public static final String avatarPath(String str) {
        C7384Etj.A0Y(str, 0);
        String strRelativeWorkspacePath = relativeWorkspacePath(str);
        if (strRelativeWorkspacePath == null || !(strRelativeWorkspacePath.startsWith("workspace/avatars/") || strRelativeWorkspacePath.startsWith("assets/avatar/"))) {
            return null;
        }
        return strRelativeWorkspacePath;
    }

    public static final String relativeWorkspacePath(String str) {
        C7384Etj.A0Y(str, 0);
        String strA0K = C7BY.A0K("~/", C7BY.A0F(str).toString());
        int length = strA0K.length();
        if (length > 0 && !C7BY.A0m(strA0K, '/')) {
            int i = 0;
            while (true) {
                char cCharAt = strA0K.charAt(i);
                if (C7BY.A0k("\\%?#:", cCharAt) || Character.isISOControl(cCharAt)) {
                    break;
                }
                i++;
                if (i >= length) {
                    if (!C7BY.A0g(strA0K, new char[]{'/'}).contains("..")) {
                        return strA0K;
                    }
                }
            }
        }
        return null;
    }
}
