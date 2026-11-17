package com.facebook.aura.header.api;

import X.AaC;

/* loaded from: classes.dex */
public interface AvatarFullScreen {
    boolean getActive();

    AaC getDestination();

    float getEdgeProgress();

    boolean getEnteredFromHalfScreen();

    boolean getExpanded();

    float getProgress();

    AvatarFullScreenSource getSource();

    /* renamed from: com.facebook.aura.header.api.AvatarFullScreen$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
    }

    public abstract class DefaultImpls {
        @Deprecated
        public static float getEdgeProgress(AvatarFullScreen avatarFullScreen) {
            return avatarFullScreen.getProgress();
        }
    }
}
