package com.facebook.aura.identity.provider;

import X.AnonymousClass001;
import X.F2X;
import X.G2j;
import X.HtJ;
import android.net.Uri;
import com.facebook.aura.model.AvatarMedia;
import java.util.Map;

/* loaded from: classes2.dex */
public final /* synthetic */ class HatchIdentityProvider$cachedAvatarUri$1 extends F2X implements G2j {
    public HatchIdentityProvider$cachedAvatarUri$1(Object obj) {
        super(4, obj, HatchIdentityProvider.class, "cachedStillFor", "cachedStillFor(Ljava/util/Map;Lcom/facebook/aura/model/AvatarMedia;Z)Landroid/net/Uri;", 4);
    }

    @Override // X.G2j
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zA1X = AnonymousClass001.A1X(obj3);
        return ((HatchIdentityProvider) this.receiver).cachedStillFor((Map) obj, (AvatarMedia) obj2, zA1X);
    }

    public final Object invoke(Map<String, ? extends Uri> map, AvatarMedia avatarMedia, boolean z, HtJ<? super Uri> htJ) {
        return ((HatchIdentityProvider) this.receiver).cachedStillFor(map, avatarMedia, z);
    }
}
