package com.facebook.aura.partners.voice.uicontrol;

import X.C10571Hud;
import X.C3cG;
import X.C7384Etj;
import X.C7BY;
import X.C9sU;
import X.C9sZ;
import X.CFK;
import X.HsJ;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.partners.voice.uicontrol.CallAvatarUpdate;
import java.util.Iterator;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes2.dex */
public abstract class VoiceUiCommandsJsonKt {
    public static final String TAG = "VoiceUiCommandsJson";

    public static final CallAvatarUpdate decodeCallAvatarUpdate(JsonObject jsonObject) {
        CallAvatarUpdate.Status next;
        CallAvatarUpdate.FailureReason failureReason;
        CallAvatarUpdate.FailureReason next2;
        C7384Etj.A0Y(jsonObject, 0);
        C9sU c9sU = HatchJsonKt.HatchJson;
        CallAvatarUpdatedParamsJson$$serializer callAvatarUpdatedParamsJson$$serializer = CallAvatarUpdatedParamsJson$$serializer.INSTANCE;
        C7384Etj.A0Y(callAvatarUpdatedParamsJson$$serializer, 0);
        CallAvatarUpdatedParamsJson callAvatarUpdatedParamsJson = (CallAvatarUpdatedParamsJson) C9sZ.A00(callAvatarUpdatedParamsJson$$serializer, c9sU, jsonObject);
        String str = callAvatarUpdatedParamsJson.target_call_id;
        if (str == null || C7BY.A0j(str)) {
            str = null;
        }
        if (str == null) {
            String str2 = callAvatarUpdatedParamsJson.status;
            CFK.A03(str2 != null ? str2 : "none", TAG, "live_avatar.received status=%s result=no_target");
            return null;
        }
        Iterator<CallAvatarUpdate.Status> it = CallAvatarUpdate.Status.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (C7384Etj.areEqual(next.getWireValue(), callAvatarUpdatedParamsJson.status)) {
                break;
            }
        }
        CallAvatarUpdate.Status status = next;
        if (status == null) {
            String str3 = callAvatarUpdatedParamsJson.status;
            CFK.A03(str3 != null ? str3 : "none", TAG, "live_avatar.received status=%s result=invalid_params why=unknown_status");
            return null;
        }
        JsonElement jsonElement = callAvatarUpdatedParamsJson.call_portrait;
        CallAvatarUpdate.DisplayCrop displayCrop = (jsonElement == null || status != CallAvatarUpdate.Status.COMPLETED) ? null : displayCrop(jsonElement);
        CallAvatarUpdate.Status status2 = CallAvatarUpdate.Status.FAILED;
        if (status == status2) {
            Iterator<CallAvatarUpdate.FailureReason> it2 = CallAvatarUpdate.FailureReason.getEntries().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                if (C7384Etj.areEqual(next2.getWireValue(), callAvatarUpdatedParamsJson.reason)) {
                    break;
                }
            }
            failureReason = next2;
            if (failureReason == null) {
                failureReason = CallAvatarUpdate.FailureReason.FAILED;
            }
        } else {
            failureReason = null;
        }
        String str4 = callAvatarUpdatedParamsJson.avatar_stem;
        if (str4 == null || status == status2 || C7BY.A0j(str4)) {
            str4 = null;
        }
        String str5 = callAvatarUpdatedParamsJson.avatar_image_path;
        if (str5 == null || status == status2 || C7BY.A0j(str5)) {
            str5 = null;
        }
        return new CallAvatarUpdate(str, status, displayCrop, failureReason, str4, str5, callAvatarUpdatedParamsJson.started_on_previous);
    }

    public static final CallAvatarUpdate.DisplayCrop displayCrop(JsonElement jsonElement) {
        Object objA0s;
        CallAvatarUpdatedDisplayCropJson callAvatarUpdatedDisplayCropJson;
        try {
            objA0s = (CallAvatarUpdatedPortraitJson) HatchJsonKt.HatchJson.A01(CallAvatarUpdatedPortraitJson$$serializer.INSTANCE, jsonElement);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        Throwable thA00 = HsJ.A00(objA0s);
        if (thA00 != null) {
            CFK.A0A(TAG, "Dropping a malformed call_avatar_updated call_portrait", thA00);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        CallAvatarUpdatedPortraitJson callAvatarUpdatedPortraitJson = (CallAvatarUpdatedPortraitJson) objA0s;
        if (callAvatarUpdatedPortraitJson == null || (callAvatarUpdatedDisplayCropJson = callAvatarUpdatedPortraitJson.display_crop) == null) {
            return null;
        }
        return new CallAvatarUpdate.DisplayCrop(callAvatarUpdatedDisplayCropJson.x, callAvatarUpdatedDisplayCropJson.y, callAvatarUpdatedDisplayCropJson.size);
    }
}
