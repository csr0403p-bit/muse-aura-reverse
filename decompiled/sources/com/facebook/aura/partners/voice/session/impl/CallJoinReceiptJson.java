package com.facebook.aura.partners.voice.session.impl;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C7384Etj;
import X.C7BY;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext;
import java.util.Iterator;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class CallJoinReceiptJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String audio_only_reason;
    public final boolean avatar_updating;
    public final String avatar_updating_presentation;
    public final String avatar_updating_stem;
    public final String call_id;
    public final String call_media_type;
    public final CallPortraitJson call_portrait;
    public final boolean ok;
    public final String previous_avatar_image_path;
    public final String previous_avatar_stem;

    public final class Companion {
        public final C9hr<CallJoinReceiptJson> serializer() {
            return CallJoinReceiptJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static /* synthetic */ CallJoinReceiptJson copy$default(CallJoinReceiptJson callJoinReceiptJson, boolean z, String str, String str2, String str3, CallPortraitJson callPortraitJson, boolean z2, String str4, String str5, String str6, String str7, int i, Object obj) {
        boolean z3 = z;
        String str8 = str;
        String str9 = str2;
        String str10 = str3;
        CallPortraitJson callPortraitJson2 = callPortraitJson;
        boolean z4 = z2;
        String str11 = str4;
        String str12 = str5;
        String str13 = str6;
        String str14 = str7;
        if ((i & 1) != 0) {
            z3 = callJoinReceiptJson.ok;
        }
        if ((i & 2) != 0) {
            str8 = callJoinReceiptJson.call_id;
        }
        if ((i & 4) != 0) {
            str9 = callJoinReceiptJson.call_media_type;
        }
        if ((i & 8) != 0) {
            str10 = callJoinReceiptJson.audio_only_reason;
        }
        if ((i & 16) != 0) {
            callPortraitJson2 = callJoinReceiptJson.call_portrait;
        }
        if ((i & 32) != 0) {
            z4 = callJoinReceiptJson.avatar_updating;
        }
        if ((i & 64) != 0) {
            str11 = callJoinReceiptJson.avatar_updating_presentation;
        }
        if ((i & 128) != 0) {
            str12 = callJoinReceiptJson.avatar_updating_stem;
        }
        if ((i & 256) != 0) {
            str13 = callJoinReceiptJson.previous_avatar_stem;
        }
        if ((i & 512) != 0) {
            str14 = callJoinReceiptJson.previous_avatar_image_path;
        }
        return new CallJoinReceiptJson(z3, str8, str9, str10, callPortraitJson2, z4, str11, str12, str13, str14);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl(CallJoinReceiptJson callJoinReceiptJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || callJoinReceiptJson.ok) {
            c9j5.AA7(c9iZ, 0, callJoinReceiptJson.ok);
        }
        if (zAfR || callJoinReceiptJson.call_id != null) {
            c9j5.AAP(callJoinReceiptJson.call_id, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || callJoinReceiptJson.call_media_type != null) {
            c9j5.AAP(callJoinReceiptJson.call_media_type, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || callJoinReceiptJson.audio_only_reason != null) {
            c9j5.AAP(callJoinReceiptJson.audio_only_reason, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || callJoinReceiptJson.call_portrait != null) {
            c9j5.AAP(callJoinReceiptJson.call_portrait, CallPortraitJson$$serializer.INSTANCE, c9iZ, 4);
        }
        if (zAfR || callJoinReceiptJson.avatar_updating) {
            c9j5.AA7(c9iZ, 5, callJoinReceiptJson.avatar_updating);
        }
        if (zAfR || callJoinReceiptJson.avatar_updating_presentation != null) {
            c9j5.AAP(callJoinReceiptJson.avatar_updating_presentation, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || callJoinReceiptJson.avatar_updating_stem != null) {
            c9j5.AAP(callJoinReceiptJson.avatar_updating_stem, C07779iq.A01, c9iZ, 7);
        }
        if (zAfR || callJoinReceiptJson.previous_avatar_stem != null) {
            c9j5.AAP(callJoinReceiptJson.previous_avatar_stem, C07779iq.A01, c9iZ, 8);
        }
        if (zAfR || callJoinReceiptJson.previous_avatar_image_path != null) {
            c9j5.AAP(callJoinReceiptJson.previous_avatar_image_path, C07779iq.A01, c9iZ, 9);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CallJoinReceiptJson) {
                CallJoinReceiptJson callJoinReceiptJson = (CallJoinReceiptJson) obj;
                if (this.ok != callJoinReceiptJson.ok || !C7384Etj.areEqual(this.call_id, callJoinReceiptJson.call_id) || !C7384Etj.areEqual(this.call_media_type, callJoinReceiptJson.call_media_type) || !C7384Etj.areEqual(this.audio_only_reason, callJoinReceiptJson.audio_only_reason) || !C7384Etj.areEqual(this.call_portrait, callJoinReceiptJson.call_portrait) || this.avatar_updating != callJoinReceiptJson.avatar_updating || !C7384Etj.areEqual(this.avatar_updating_presentation, callJoinReceiptJson.avatar_updating_presentation) || !C7384Etj.areEqual(this.avatar_updating_stem, callJoinReceiptJson.avatar_updating_stem) || !C7384Etj.areEqual(this.previous_avatar_stem, callJoinReceiptJson.previous_avatar_stem) || !C7384Etj.areEqual(this.previous_avatar_image_path, callJoinReceiptJson.previous_avatar_image_path)) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean component1() {
        return this.ok;
    }

    public final String component10() {
        return this.previous_avatar_image_path;
    }

    public final String component2() {
        return this.call_id;
    }

    public final String component3() {
        return this.call_media_type;
    }

    public final String component4() {
        return this.audio_only_reason;
    }

    public final CallPortraitJson component5() {
        return this.call_portrait;
    }

    public final boolean component6() {
        return this.avatar_updating;
    }

    public final String component7() {
        return this.avatar_updating_presentation;
    }

    public final String component8() {
        return this.avatar_updating_stem;
    }

    public final String component9() {
        return this.previous_avatar_stem;
    }

    public final CallJoinReceiptJson copy(boolean z, String str, String str2, String str3, CallPortraitJson callPortraitJson, boolean z2, String str4, String str5, String str6, String str7) {
        return new CallJoinReceiptJson(z, str, str2, str3, callPortraitJson, z2, str4, str5, str6, str7);
    }

    public final String getAudio_only_reason() {
        return this.audio_only_reason;
    }

    public final boolean getAvatar_updating() {
        return this.avatar_updating;
    }

    public final String getAvatar_updating_presentation() {
        return this.avatar_updating_presentation;
    }

    public final String getAvatar_updating_stem() {
        return this.avatar_updating_stem;
    }

    public final String getCall_id() {
        return this.call_id;
    }

    public final String getCall_media_type() {
        return this.call_media_type;
    }

    public final CallPortraitJson getCall_portrait() {
        return this.call_portrait;
    }

    public final boolean getOk() {
        return this.ok;
    }

    public final String getPrevious_avatar_image_path() {
        return this.previous_avatar_image_path;
    }

    public final String getPrevious_avatar_stem() {
        return this.previous_avatar_stem;
    }

    public int hashCode() {
        return ((((((C0KA.A01((((((((C0KA.A02(this.ok) + AnonymousClass006.A0G(this.call_id)) * 31) + AnonymousClass006.A0G(this.call_media_type)) * 31) + AnonymousClass006.A0G(this.audio_only_reason)) * 31) + AnonymousClass006.A0D(this.call_portrait)) * 31, this.avatar_updating) + AnonymousClass006.A0G(this.avatar_updating_presentation)) * 31) + AnonymousClass006.A0G(this.avatar_updating_stem)) * 31) + AnonymousClass006.A0G(this.previous_avatar_stem)) * 31) + AnonymousClass005.A0H(this.previous_avatar_image_path);
    }

    public /* synthetic */ CallJoinReceiptJson(int i, boolean z, String str, String str2, String str3, CallPortraitJson callPortraitJson, boolean z2, String str4, String str5, String str6, String str7, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.ok = false;
        } else {
            this.ok = z;
        }
        if ((i & 2) == 0) {
            this.call_id = null;
        } else {
            this.call_id = str;
        }
        if ((i & 4) == 0) {
            this.call_media_type = null;
        } else {
            this.call_media_type = str2;
        }
        if ((i & 8) == 0) {
            this.audio_only_reason = null;
        } else {
            this.audio_only_reason = str3;
        }
        if ((i & 16) == 0) {
            this.call_portrait = null;
        } else {
            this.call_portrait = callPortraitJson;
        }
        if ((i & 32) == 0) {
            this.avatar_updating = false;
        } else {
            this.avatar_updating = z2;
        }
        if ((i & 64) == 0) {
            this.avatar_updating_presentation = null;
        } else {
            this.avatar_updating_presentation = str4;
        }
        if ((i & 128) == 0) {
            this.avatar_updating_stem = null;
        } else {
            this.avatar_updating_stem = str5;
        }
        if ((i & 256) == 0) {
            this.previous_avatar_stem = null;
        } else {
            this.previous_avatar_stem = str6;
        }
        if ((i & 512) == 0) {
            this.previous_avatar_image_path = null;
        } else {
            this.previous_avatar_image_path = str7;
        }
    }

    public final HatchCallJoinContext.AvatarUpdatingStart avatarUpdatingStart() {
        HatchCallJoinContext.AvatarUpdatingPresentation next;
        Iterator<HatchCallJoinContext.AvatarUpdatingPresentation> it = HatchCallJoinContext.AvatarUpdatingPresentation.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (C7384Etj.areEqual(next.getWireValue(), this.avatar_updating_presentation)) {
                break;
            }
        }
        HatchCallJoinContext.AvatarUpdatingPresentation avatarUpdatingPresentation = next;
        String str = this.avatar_updating_stem;
        if (str == null || C7BY.A0j(str)) {
            str = null;
        }
        String str2 = this.previous_avatar_stem;
        if (str2 == null || C7BY.A0j(str2)) {
            str2 = null;
        }
        String str3 = this.previous_avatar_image_path;
        if (str3 == null || C7BY.A0j(str3)) {
            str3 = null;
        }
        HatchCallJoinContext.AvatarUpdatingStart avatarUpdatingStart = new HatchCallJoinContext.AvatarUpdatingStart(avatarUpdatingPresentation, str, str2, str3);
        if (this.avatar_updating) {
            return avatarUpdatingStart;
        }
        return null;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ CallJoinReceiptJson(boolean z, String str, String str2, String str3, CallPortraitJson callPortraitJson, boolean z2, String str4, String str5, String str6, String str7, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z), (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : callPortraitJson, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : str7);
    }

    public CallJoinReceiptJson(boolean z, String str, String str2, String str3, CallPortraitJson callPortraitJson, boolean z2, String str4, String str5, String str6, String str7) {
        this.ok = z;
        this.call_id = str;
        this.call_media_type = str2;
        this.audio_only_reason = str3;
        this.call_portrait = callPortraitJson;
        this.avatar_updating = z2;
        this.avatar_updating_presentation = str4;
        this.avatar_updating_stem = str5;
        this.previous_avatar_stem = str6;
        this.previous_avatar_image_path = str7;
    }

    public CallJoinReceiptJson() {
        this(false, null, null, null, null, false, null, null, null, null);
    }
}
