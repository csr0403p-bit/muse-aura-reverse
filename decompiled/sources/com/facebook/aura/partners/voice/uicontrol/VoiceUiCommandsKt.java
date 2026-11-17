package com.facebook.aura.partners.voice.uicontrol;

import X.AnonymousClass002;
import X.BFI;
import X.C10571Hud;
import X.C3cG;
import X.C7BY;
import X.C9oY;
import X.CFK;
import X.HsJ;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.partners.voice.uicontrol.VoiceControlHandler;
import com.facebook.aura.uicontrol.ContributedUiAction;
import com.facebook.aura.uicontrol.UiActionExecutor;
import java.util.Set;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes2.dex */
public abstract class VoiceUiCommandsKt {
    public static final String ERROR_CODE_INVALID_PARAMS = "invalid_params";
    public static final String ERROR_CODE_PLAYBACK_FAILED = "playback_failed";
    public static final String ERROR_CODE_STALE_CALL = "stale_call";
    public static final String ERROR_CODE_UNSUPPORTED_TARGET = "unsupported_target";
    public static final String ERROR_CODE_WIDGET_INACTIVE = "widget_inactive";
    public static final String ERROR_CODE_WIDGET_NOT_FOUND = "widget_not_found";
    public static final long INTERRUPTED_REPLY_WAIT_MS = 8000;
    public static final long PREVIEW_OPTION_TIMEOUT_MS = 20000;
    public static final String TAG = "VoiceUiCommands";
    public static final String UI_NAVIGATE_SETTINGS_VOICE = "ui.navigate.settings.voice";
    public static final String UI_SET_VOICE_CALL_AVATAR_UPDATED = "ui.set.voice.call_avatar_updated";
    public static final String UI_SET_VOICE_PREVIEW_OPTION = "ui.set.voice.preview_option";
    public static final String UI_SET_VOICE_SET_LIVE_AVATAR = "ui.set.voice.set_live_avatar";
    public static final String UI_SET_VOICE_DISABLE_PERSONIFICATION = "ui.set.voice.disable_personification";
    public static final Set<String> LIVE_AVATAR_COMMANDS = BFI.A0H(new String[]{UI_SET_VOICE_SET_LIVE_AVATAR, UI_SET_VOICE_DISABLE_PERSONIFICATION});

    public static final String nonBlankString(JsonObject jsonObject, String str) {
        JsonPrimitive jsonPrimitive;
        String strA04;
        JsonElement jsonElement = jsonObject != null ? (JsonElement) jsonObject.get(str) : null;
        if (!(jsonElement instanceof JsonPrimitive) || (jsonPrimitive = (JsonPrimitive) jsonElement) == null || (strA04 = C9oY.A04(jsonPrimitive)) == null || C7BY.A0j(strA04)) {
            return null;
        }
        return strA04;
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VoiceControlHandler.Result.values().length];
            try {
                AnonymousClass002.A13(VoiceControlHandler.Result.PERFORMED, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(VoiceControlHandler.Result.NO_ACTIVE_CALL, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(VoiceControlHandler.Result.STALE_CALL, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(VoiceControlHandler.Result.CALL_TRANSITIONING, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(VoiceControlHandler.Result.UNSUPPORTED, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final ContributedUiAction callAvatarUpdatedAction(JsonObject jsonObject) {
        Object objA0s;
        if (jsonObject != null) {
            try {
                objA0s = VoiceUiCommandsJsonKt.decodeCallAvatarUpdate(jsonObject);
            } catch (Throwable th) {
                objA0s = C3cG.A0s(th);
            }
            Throwable thA00 = HsJ.A00(objA0s);
            if (thA00 != null) {
                CFK.A0A(TAG, "live_avatar.received result=invalid_params", thA00);
            }
            if (HsJ.A00(objA0s) == null) {
                CallAvatarUpdate callAvatarUpdate = (CallAvatarUpdate) objA0s;
                return callAvatarUpdate != null ? new CallAvatarUpdatedUiAction(callAvatarUpdate) : IgnoredCallAvatarUpdateUiAction.INSTANCE;
            }
        }
        return InvalidCallAvatarUpdateUiAction.INSTANCE;
    }

    public static final SetLiveAvatarParamsJson decodeSetLiveAvatarParams(JsonObject jsonObject) {
        Object objA0s;
        try {
            objA0s = (SetLiveAvatarParamsJson) HatchJsonKt.HatchJson.A01(SetLiveAvatarParamsJson$$serializer.INSTANCE, jsonObject);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        return (SetLiveAvatarParamsJson) objA0s;
    }

    public static final UiActionExecutor.Result toExecutionResult(VoiceControlHandler.Result result, String str, String str2) {
        UiActionExecutor.Result unsupported;
        int iOrdinal = result.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1 && iOrdinal != 3) {
                if (iOrdinal == 2) {
                    str = "The voice call is starting, restarting, or ending; try again when it is active.";
                    str2 = null;
                } else {
                    if (iOrdinal != 4) {
                        throw C3cG.A0q();
                    }
                    str = "This voice command is turned off on this device.";
                    str2 = "unsupported_target";
                }
            }
            unsupported = new UiActionExecutor.Result.Unsupported(str, str2);
        } else {
            unsupported = UiActionExecutor.Result.Performed.INSTANCE;
        }
        return unsupported;
    }
}
