package com.facebook.aura.library.model;

import X.C10571Hud;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class ArtifactFileKt {
    public static final boolean isValidUuid(String str) {
        Object c10571Hud;
        try {
            c10571Hud = UUID.fromString(str);
        } catch (Throwable th) {
            c10571Hud = new C10571Hud(th);
        }
        return !(c10571Hud instanceof C10571Hud);
    }
}
