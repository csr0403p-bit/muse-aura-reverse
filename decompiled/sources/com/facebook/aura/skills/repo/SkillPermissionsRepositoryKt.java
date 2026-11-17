package com.facebook.aura.skills.repo;

import X.C6tn;
import com.facebook.aura.opengraph.HatchWebPageParserKt;

/* loaded from: classes3.dex */
public abstract class SkillPermissionsRepositoryKt {
    public static final String encodePermissionPathSegment(String str) {
        return C6tn.A06(str, HatchWebPageParserKt.UTF_8);
    }
}
