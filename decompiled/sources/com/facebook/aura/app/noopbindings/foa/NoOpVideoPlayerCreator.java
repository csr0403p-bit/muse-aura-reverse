package com.facebook.aura.app.noopbindings.foa;

import X.AbstractC7884FJc;
import X.CFK;
import X.InterfaceC7888FJg;
import android.content.Context;

/* loaded from: classes6.dex */
public final class NoOpVideoPlayerCreator {
    public static final NoOpVideoPlayerCreator INSTANCE = new NoOpVideoPlayerCreator();

    public NoOpVideoPlayer createPlayer(Context context, InterfaceC7888FJg interfaceC7888FJg, AbstractC7884FJc abstractC7884FJc) {
        CFK.A06(NoOpVideoPlayerCreatorProviderKt.TAG, "Video playback is unsupported in Aura; rendering an empty video surface");
        return NoOpVideoPlayer.INSTANCE;
    }
}
