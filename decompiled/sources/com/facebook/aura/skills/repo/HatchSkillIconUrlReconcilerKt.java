package com.facebook.aura.skills.repo;

import X.C7BY;
import android.net.Uri;

/* loaded from: classes.dex */
public abstract class HatchSkillIconUrlReconcilerKt {
    public static final long CACHE_TTL_MS = 300000;

    public static final String extractPath(String str) {
        String path = Uri.parse(str).getPath();
        if (path == null || C7BY.A0j(path)) {
            return null;
        }
        return C7BY.A0Z(path, '/');
    }
}
