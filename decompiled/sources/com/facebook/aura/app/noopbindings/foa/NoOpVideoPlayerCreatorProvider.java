package com.facebook.aura.app.noopbindings.foa;

/* loaded from: classes6.dex */
public final class NoOpVideoPlayerCreatorProvider {
    public static final NoOpVideoPlayerCreatorProvider INSTANCE = new NoOpVideoPlayerCreatorProvider();

    public NoOpVideoPlayerCreator get() {
        return NoOpVideoPlayerCreator.INSTANCE;
    }
}
