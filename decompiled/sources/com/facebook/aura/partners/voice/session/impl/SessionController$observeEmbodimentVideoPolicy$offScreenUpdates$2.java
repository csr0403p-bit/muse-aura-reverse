package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;

/* loaded from: classes2.dex */
public final class SessionController$observeEmbodimentVideoPolicy$offScreenUpdates$2 extends AbstractC7559F3s implements G0U<Boolean, Long> {
    public static final SessionController$observeEmbodimentVideoPolicy$offScreenUpdates$2 INSTANCE = new SessionController$observeEmbodimentVideoPolicy$offScreenUpdates$2();

    public SessionController$observeEmbodimentVideoPolicy$offScreenUpdates$2() {
        super(1);
    }

    public final Long invoke(boolean z) {
        return Long.valueOf(z ? 2000L : 0L);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Long invoke(Boolean bool) {
        return invoke(AnonymousClass001.A1X(bool));
    }
}
