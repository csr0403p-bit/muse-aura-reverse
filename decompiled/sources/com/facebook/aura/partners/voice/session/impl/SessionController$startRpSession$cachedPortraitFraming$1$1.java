package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0V;
import com.facebook.aura.partners.voice.infra.HatchVideoCrop;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentMedia;

/* loaded from: classes2.dex */
public final class SessionController$startRpSession$cachedPortraitFraming$1$1 extends AbstractC7559F3s implements G0V<Integer, Integer, VoiceEmbodimentMedia.ReferenceFraming> {
    public static final SessionController$startRpSession$cachedPortraitFraming$1$1 INSTANCE = new SessionController$startRpSession$cachedPortraitFraming$1$1();

    public SessionController$startRpSession$cachedPortraitFraming$1$1() {
        super(2);
    }

    public final VoiceEmbodimentMedia.ReferenceFraming invoke(int i, int i2) {
        return SessionControllerKt.toReferenceFraming(new HatchVideoCrop(i, i2));
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ VoiceEmbodimentMedia.ReferenceFraming invoke(Integer num, Integer num2) {
        return SessionControllerKt.toReferenceFraming(new HatchVideoCrop(AnonymousClass001.A0F(num), AnonymousClass001.A0F(num2)));
    }
}
