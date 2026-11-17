package com.facebook.aura.partners.voice.session.impl;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.ccv.nativeflow.HatchCheckoutClientKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class CallStartAvatarLayout {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ CallStartAvatarLayout[] $VALUES;
    public static final CallStartAvatarLayout LIVE;
    public static final CallStartAvatarLayout NEW_AVATAR_STILL;
    public static final CallStartAvatarLayout PREVIOUS_AVATAR_LIVE;

    static {
        CallStartAvatarLayout callStartAvatarLayout = new CallStartAvatarLayout(HatchCheckoutClientKt.CONTAINER_MODE_LIVE, 0);
        LIVE = callStartAvatarLayout;
        CallStartAvatarLayout callStartAvatarLayout2 = new CallStartAvatarLayout("PREVIOUS_AVATAR_LIVE", 1);
        PREVIOUS_AVATAR_LIVE = callStartAvatarLayout2;
        CallStartAvatarLayout callStartAvatarLayout3 = new CallStartAvatarLayout("NEW_AVATAR_STILL", 2);
        NEW_AVATAR_STILL = callStartAvatarLayout3;
        CallStartAvatarLayout[] callStartAvatarLayoutArr = {callStartAvatarLayout, callStartAvatarLayout2, callStartAvatarLayout3};
        $VALUES = callStartAvatarLayoutArr;
        $ENTRIES = C3cG.A0w(callStartAvatarLayoutArr);
    }

    public static Ey9<CallStartAvatarLayout> getEntries() {
        return $ENTRIES;
    }

    public static CallStartAvatarLayout valueOf(String str) {
        return (CallStartAvatarLayout) Enum.valueOf(CallStartAvatarLayout.class, str);
    }

    public static CallStartAvatarLayout[] values() {
        return (CallStartAvatarLayout[]) $VALUES.clone();
    }

    public CallStartAvatarLayout(String str, int i) {
    }
}
