package com.facebook.aura.partners.voice.uicontrol;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class CallAvatarUpdatedPortraitJson extends C06G {
    public static final Companion Companion = new Companion();
    public final CallAvatarUpdatedDisplayCropJson display_crop;

    public final class Companion {
        public final C9hr<CallAvatarUpdatedPortraitJson> serializer() {
            return CallAvatarUpdatedPortraitJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_voice_uicontrol_uicontrol(CallAvatarUpdatedPortraitJson callAvatarUpdatedPortraitJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || callAvatarUpdatedPortraitJson.display_crop != null) {
            c9j5.AAP(callAvatarUpdatedPortraitJson.display_crop, CallAvatarUpdatedDisplayCropJson$$serializer.INSTANCE, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof CallAvatarUpdatedPortraitJson) && C7384Etj.areEqual(this.display_crop, ((CallAvatarUpdatedPortraitJson) obj).display_crop));
    }

    public static /* synthetic */ CallAvatarUpdatedPortraitJson copy$default(CallAvatarUpdatedPortraitJson callAvatarUpdatedPortraitJson, CallAvatarUpdatedDisplayCropJson callAvatarUpdatedDisplayCropJson, int i, Object obj) {
        if ((i & 1) != 0) {
            callAvatarUpdatedDisplayCropJson = callAvatarUpdatedPortraitJson.display_crop;
        }
        return new CallAvatarUpdatedPortraitJson(callAvatarUpdatedDisplayCropJson);
    }

    public final CallAvatarUpdatedDisplayCropJson component1() {
        return this.display_crop;
    }

    public final CallAvatarUpdatedPortraitJson copy(CallAvatarUpdatedDisplayCropJson callAvatarUpdatedDisplayCropJson) {
        return new CallAvatarUpdatedPortraitJson(callAvatarUpdatedDisplayCropJson);
    }

    public final CallAvatarUpdatedDisplayCropJson getDisplay_crop() {
        return this.display_crop;
    }

    public int hashCode() {
        return AnonymousClass006.A0D(this.display_crop);
    }

    public /* synthetic */ CallAvatarUpdatedPortraitJson(int i, CallAvatarUpdatedDisplayCropJson callAvatarUpdatedDisplayCropJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.display_crop = null;
        } else {
            this.display_crop = callAvatarUpdatedDisplayCropJson;
        }
    }

    public String toString() {
        return super.toString();
    }

    public CallAvatarUpdatedPortraitJson(CallAvatarUpdatedDisplayCropJson callAvatarUpdatedDisplayCropJson) {
        this.display_crop = callAvatarUpdatedDisplayCropJson;
    }

    public /* synthetic */ CallAvatarUpdatedPortraitJson(CallAvatarUpdatedDisplayCropJson callAvatarUpdatedDisplayCropJson, int i, C06H c06h) {
        this((i & 1) != 0 ? null : callAvatarUpdatedDisplayCropJson);
    }

    public CallAvatarUpdatedPortraitJson() {
        this(null);
    }
}
