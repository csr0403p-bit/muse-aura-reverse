package com.facebook.aura.avatarsize;

import X.AnonymousClass003;
import X.C31u;
import X.InterfaceC7359EnW;
import com.facebook.aura.avatarsize.MC;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;

/* loaded from: classes.dex */
public final class HatchAvatarSizeMC {
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = AnonymousClass003.A1b(HatchAvatarSizeMC.class, "defaultAvatarSize", "getDefaultAvatarSize()Ljava/lang/String;");
    public static final HatchAvatarSizeMC INSTANCE = new HatchAvatarSizeMC();
    public static final C31u defaultAvatarSize$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigString(MC.hatch_android.default_avatar_size);

    public final String getDefaultAvatarSize() {
        return (String) defaultAvatarSize$delegate.getValue(this, $$delegatedProperties[0]);
    }
}
