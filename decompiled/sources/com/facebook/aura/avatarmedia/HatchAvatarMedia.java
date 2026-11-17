package com.facebook.aura.avatarmedia;

import X.AbstractC3358CGz;
import X.HtJ;
import com.facebook.aura.avatarassets.AvatarAssetsSource;
import com.facebook.aura.avatarassets.appearance.HatchAvatarAppearance;
import com.facebook.aura.gateway.HatchAvatarMediaSource;
import com.facebook.aura.gateway.HatchAvatarMediaSourceRegistration;
import com.facebook.aura.model.AvatarMedia;

/* loaded from: classes2.dex */
public final class HatchAvatarMedia implements HatchAvatarMediaSource, HatchAvatarMediaSourceRegistration {
    public static final HatchAvatarMedia INSTANCE = new HatchAvatarMedia();

    @Override // com.facebook.aura.gateway.HatchAvatarMediaSourceRegistration
    public HatchAvatarMediaSource getSource() {
        return this;
    }

    @Override // com.facebook.aura.gateway.HatchAvatarMediaSource
    public Object resolve(AbstractC3358CGz abstractC3358CGz, String str, HtJ<? super AvatarMedia> htJ) {
        if (HatchAvatarAppearance.INSTANCE.isDarkAvatarEnabled()) {
            return AvatarAssetsSource.Companion.getInstance(abstractC3358CGz).resolve(str, htJ);
        }
        return null;
    }
}
