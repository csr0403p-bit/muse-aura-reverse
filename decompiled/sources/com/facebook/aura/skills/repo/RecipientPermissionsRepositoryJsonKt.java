package com.facebook.aura.skills.repo;

import X.AnonymousClass002;

/* loaded from: classes2.dex */
public abstract class RecipientPermissionsRepositoryJsonKt {
    public static final String nonBlank(String str) {
        String strA0l;
        if (str == null || (strA0l = AnonymousClass002.A0l(str)) == null || strA0l.length() <= 0) {
            return null;
        }
        return strA0l;
    }
}
