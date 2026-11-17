package com.facebook.aura.common.url;

import com.facebook.aura.maps.model.HatchMapSceneKt;

/* loaded from: classes3.dex */
public abstract class HatchUrlKt {
    public static final boolean isSlugChar(char c) {
        char c2;
        if ('a' <= c) {
            return c < '{';
        }
        if ('A' <= c) {
            c2 = '[';
        } else {
            if ('0' > c) {
                return c == '-';
            }
            c2 = HatchMapSceneKt.ARTIFACT_ID_SEPARATOR;
        }
        return c < c2 || c == '_';
    }
}
