package com.facebook.aura.partners.voice.session.impl;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0U;
import com.facebook.aura.partners.voice.avatar.HatchVoiceVideoConfigStore;
import java.util.AbstractMap;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final /* synthetic */ class SessionController$swapCallAvatarLocked$completed$3 extends C7438Evz implements G0U<String, HatchVoiceVideoConfigStore.Snapshot> {
    public SessionController$swapCallAvatarLocked$completed$3(Object obj) {
        super(1, obj, ConcurrentHashMap.class, "get", "get(Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Override // X.G0U
    public final HatchVoiceVideoConfigStore.Snapshot invoke(String str) {
        return (HatchVoiceVideoConfigStore.Snapshot) ((AbstractMap) AnonymousClass006.A0o(str, this)).get(str);
    }
}
