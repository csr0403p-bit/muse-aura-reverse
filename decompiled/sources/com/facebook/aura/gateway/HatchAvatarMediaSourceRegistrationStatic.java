package com.facebook.aura.gateway;

import X.AnonymousClass005;
import com.facebook.aura.avatarmedia.HatchAvatarMedia;

/* loaded from: classes2.dex */
public class HatchAvatarMediaSourceRegistrationStatic {
    public static HatchAvatarMediaSource getSource(int i) {
        if (i == 0) {
            return HatchAvatarMedia.INSTANCE;
        }
        throw AnonymousClass005.A0c(i);
    }

    public static int[] getKeys() {
        return AnonymousClass005.A1b();
    }
}
