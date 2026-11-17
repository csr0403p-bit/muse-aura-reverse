package com.facebook.aura.partners.voice.uicontrol;

import X.AGH;
import X.AIX;
import X.AIY;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.C0881AGi;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C9jH;
import X.HxE;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.nodes.core.NodeArgSpec;
import com.facebook.aura.nodes.core.NodeArgType;
import com.facebook.aura.nodes.core.NodeCommandSpec;
import com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository;
import com.facebook.aura.partners.voice.session.intf.VoiceCallSupport;
import com.facebook.aura.uicontrol.ContributedUiAction;
import com.facebook.aura.uicontrol.UiCommandContributor;
import com.facebook.aura.uicontrol.UiCommandSpecsKt;
import com.facebook.aura.utils.HatchUtil;
import com.facebook.aura.vmbrowser.runtime.BrowserSessionControllerKt;
import java.util.Map;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes2.dex */
public final class VoiceUiCommands implements UiCommandContributor {
    public static final VoiceUiCommands INSTANCE = new VoiceUiCommands();
    public static final Map<String, NodeCommandSpec> allSpecs;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.aura.uicontrol.UiCommandContributor
    public ContributedUiAction parse(String str, JsonObject jsonObject) {
        SetLiveAvatarParamsJson setLiveAvatarParamsJsonDecodeSetLiveAvatarParams;
        String str2;
        JsonPrimitive jsonPrimitive;
        ContributedUiAction endVoiceCallUiAction;
        boolean z = false;
        C7384Etj.A0Y(str, 0);
        ContributedUiAction setLiveAvatarUiAction = null;
        switch (str.hashCode()) {
            case -2083112051:
                if (str.equals(VoiceUiCommandsKt.UI_SET_VOICE_SET_LIVE_AVATAR)) {
                    String strA0u = (jsonObject == null || (setLiveAvatarParamsJsonDecodeSetLiveAvatarParams = VoiceUiCommandsKt.decodeSetLiveAvatarParams(jsonObject)) == null || (str2 = setLiveAvatarParamsJsonDecodeSetLiveAvatarParams.live_avatar_status) == null) ? null : AnonymousClass001.A0u(str2);
                    if (!HatchUtil.TYPING_INDICATOR_STATE_ON.equals(strA0u)) {
                        if (HatchUtil.TYPING_INDICATOR_STATE_OFF.equals(strA0u)) {
                        }
                        return setLiveAvatarUiAction;
                    }
                    z = true;
                    setLiveAvatarUiAction = new SetLiveAvatarUiAction(z);
                    return setLiveAvatarUiAction;
                }
                return null;
            case -1741937484:
                if (str.equals(VoiceUiCommandsKt.UI_SET_VOICE_CALL_AVATAR_UPDATED)) {
                    return VoiceUiCommandsKt.callAvatarUpdatedAction(jsonObject);
                }
                return null;
            case -789282376:
                if (str.equals("ui.set.voice.set_mute")) {
                    JsonElement jsonElement = jsonObject != null ? (JsonElement) jsonObject.get("mic_status") : null;
                    if (VoiceCallActivityRepository.MIC_STATUS_MUTED.equals(((jsonElement instanceof JsonPrimitive) && (jsonPrimitive = (JsonPrimitive) jsonElement) != null && jsonPrimitive.A01()) ? jsonPrimitive.A00() : null)) {
                        setLiveAvatarUiAction = MuteVoiceUiAction.INSTANCE;
                    }
                    return setLiveAvatarUiAction;
                }
                return null;
            case -479608540:
                if (str.equals("ui.set.voice.end_call")) {
                    endVoiceCallUiAction = new EndVoiceCallUiAction(new EndVoiceCallRequest(VoiceUiCommandsKt.nonBlankString(jsonObject, "reason"), VoiceUiCommandsKt.nonBlankString(jsonObject, "active_call_id"), VoiceUiCommandsKt.nonBlankString(jsonObject, "target_call_id")));
                    return endVoiceCallUiAction;
                }
                return null;
            case -120760069:
                if (str.equals("ui.set.voice.mute")) {
                    endVoiceCallUiAction = MuteVoiceUiAction.INSTANCE;
                    return endVoiceCallUiAction;
                }
                return null;
            case 1044366442:
                if (str.equals(VoiceUiCommandsKt.UI_NAVIGATE_SETTINGS_VOICE)) {
                    endVoiceCallUiAction = OpenVoiceSettingsUiAction.INSTANCE;
                    return endVoiceCallUiAction;
                }
                return null;
            case 1045048624:
                if (str.equals(VoiceUiCommandsKt.UI_SET_VOICE_DISABLE_PERSONIFICATION)) {
                    endVoiceCallUiAction = new SetLiveAvatarUiAction(false);
                    return endVoiceCallUiAction;
                }
                return null;
            case 1612162350:
                if (str.equals(VoiceUiCommandsKt.UI_SET_VOICE_PREVIEW_OPTION)) {
                    endVoiceCallUiAction = new PreviewVoiceOptionUiAction(VoiceUiCommandsKt.nonBlankString(jsonObject, "widget_id"), VoiceUiCommandsKt.nonBlankString(jsonObject, "voice_id"));
                    return endVoiceCallUiAction;
                }
                return null;
            case 1857252008:
                if (str.equals("ui.set.voice.reconnect_call")) {
                    endVoiceCallUiAction = new ReconnectVoiceCallUiAction(new ReconnectVoiceCallRequest(VoiceUiCommandsKt.nonBlankString(jsonObject, "reason"), VoiceUiCommandsKt.nonBlankString(jsonObject, "target_call_id"), VoiceUiCommandsKt.nonBlankString(jsonObject, "root_call_server_info_data")));
                    return endVoiceCallUiAction;
                }
                return null;
            default:
                return null;
        }
    }

    static {
        NodeArgSpec nodeArgSpec = UiCommandSpecsKt.MODE_PARAM;
        Map mapA10 = AnonymousClass006.A10(BrowserSessionControllerKt.WEBSOCKIFY_MODE_PARAM, nodeArgSpec);
        C9jH c9jHA0E = AGH.A0E();
        C0881AGi c0881AGi = C0881AGi.A00;
        HxE hxEA0r = C3cG.A0r(VoiceUiCommandsKt.UI_NAVIGATE_SETTINGS_VOICE, new NodeCommandSpec("Open Voice and Avatar settings to browse and choose from all available voices. Use for requests about voice settings or Voice and Avatar settings.", c9jHA0E, mapA10, c0881AGi, null, "Confirmation that Voice and Avatar settings were opened.", 0L));
        NodeArgType nodeArgType = NodeArgType.STRING;
        allSpecs = AGH.A0D(hxEA0r, C3cG.A0r("ui.set.voice.set_mute", new NodeCommandSpec("Mute the microphone during an active voice call.", AnonymousClass006.A10("mic_status", new NodeArgSpec(nodeArgType, "Microphone state: muted. Use the in-call microphone control to unmute.")), c9jHA0E, c0881AGi, null, "Confirmation that the microphone was muted.", 0L)), C3cG.A0r("ui.set.voice.mute", new NodeCommandSpec("Mute the microphone during an active voice call.", null, null, null, null, "Confirmation that the microphone was muted.", 0L, 94, null)), C3cG.A0r("ui.set.voice.end_call", new NodeCommandSpec("End the active voice call (hang up). No-op if there is no active voice call.", c9jHA0E, C3cH.A0m("target_call_id", new NodeArgSpec(nodeArgType, "Id of the call to end. When present, ignore the request unless it matches this device's current call. The active_call_id rule still applies to matching calls."), C3cG.A0r(BrowserSessionControllerKt.WEBSOCKIFY_MODE_PARAM, nodeArgSpec), C3cG.A0r("active_call_id", new NodeArgSpec(nodeArgType, "Id of the call that should stay active. When present and it does not match this device's current call, this device is being preempted and ends its call; when it matches, this device owns the surviving call and ignores the request."))), c0881AGi, null, "Confirmation that the voice call was ended.", 0L)), C3cG.A0r(VoiceUiCommandsKt.UI_SET_VOICE_SET_LIVE_AVATAR, new NodeCommandSpec("Turn the Live avatar on or off during an active voice call. Writes the saved Voice Controls \"Live avatar\" setting, so the choice also applies to later calls until it is changed again. The call keeps running, the microphone and audio are untouched, and the agent's still avatar image stays on screen either way. Turning it off stops the live animated avatar immediately; turning it on shows it again only if this call started with the Live avatar on, otherwise it starts with the next call. Use for \"turn the live avatar off/on\", \"stop/start animating\", or \"disable/enable personification\".", AnonymousClass006.A10("live_avatar_status", new NodeArgSpec(nodeArgType, "Target Live avatar state: \"on\" turns the Live avatar on, \"off\" turns it off.")), c9jHA0E, c0881AGi, null, "Confirmation that the Live avatar setting was changed.", 0L)), C3cG.A0r(VoiceUiCommandsKt.UI_SET_VOICE_DISABLE_PERSONIFICATION, new NodeCommandSpec("Turn the Live avatar off. Shorthand for ui.set.voice.set_live_avatar with live_avatar_status=\"off\"; prefer that command, which can also turn the Live avatar back on. Writes the same saved Voice Controls \"Live avatar\" setting, so it stays off for later calls until it is turned back on. The call keeps running, the microphone and audio are untouched, and the agent's still avatar image stays on screen; only the live animated avatar stops.", null, null, null, null, "Confirmation that the Live avatar was turned off.", 0L, 94, null)), C3cG.A0r("ui.set.voice.reconnect_call", new NodeCommandSpec("Redo the RTC join for a voice call whose server-side media session was lost, continuing the same call rather than starting a new one. Server-only.", c9jHA0E, C3cH.A0n("root_call_server_info_data", new NodeArgSpec(nodeArgType, "The call's root Call Dive id, sent back as call_server_info_data on the new RTC join."), C3cG.A0r(BrowserSessionControllerKt.WEBSOCKIFY_MODE_PARAM, nodeArgSpec), C3cG.A0r("reason", new NodeArgSpec(nodeArgType, "Why the server asked for a reconnect.")), C3cG.A0r("target_call_id", new NodeArgSpec(nodeArgType, "Id of the call to reconnect. A call that is not this device's current one is refused with error code stale_call."))), c0881AGi, null, "Confirmation that a new RTC join for the same call has started.", 0L)), C3cG.A0r(VoiceUiCommandsKt.UI_SET_VOICE_PREVIEW_OPTION, new NodeCommandSpec("Play one option's sample in a voice options card, as a tap on it would, without switching to that voice. During a call it plays even when the card is not in the chat on screen. Never scrolls the chat. Replies once the sample ends, or once no sample plays any more after another preview or a tap interrupts it, so speak only after the reply. Fails with invalid_params when the voice is not in the card on screen, widget_inactive when that card was already chosen from or replaced, widget_not_found when the card is not in the chat on screen and no call is active, and playback_failed when the sample cannot play. Server-only.", AnonymousClass007.A0d("voice_id", new NodeArgSpec(nodeArgType, "voice_id of one of that card's options."), C3cG.A0r("widget_id", new NodeArgSpec(nodeArgType, "Presentation id of the voice options card."))), AnonymousClass006.A10(BrowserSessionControllerKt.WEBSOCKIFY_MODE_PARAM, nodeArgSpec), c0881AGi, null, "Confirmation that the voice sample finished or was stopped.", 20000L)), C3cG.A0r(VoiceUiCommandsKt.UI_SET_VOICE_CALL_AVATAR_UPDATED, new NodeCommandSpec("Report the state of a live avatar update for a voice call. \"updating\": the call is waiting for a new avatar and keeps its live video. \"completed\": the call's live video already shows the avatar named by avatar_stem (same video track), framed by the optional call_portrait.display_crop {x, y, size}; without avatar_stem it is back on its call-start avatar. \"failed\": the call keeps its previous avatar; the optional reason says why. Server-only.", AnonymousClass007.A0d(AuraDeeplinkRouteMapper.STATUS_ROUTE, new NodeArgSpec(nodeArgType, "Update state: \"updating\", \"completed\" or \"failed\"."), C3cG.A0r("target_call_id", new NodeArgSpec(nodeArgType, "Id of the updated call. A call that is not this device's current one is refused with error code stale_call."))), AGH.A0D(C3cG.A0r(BrowserSessionControllerKt.WEBSOCKIFY_MODE_PARAM, nodeArgSpec), C3cG.A0r("reason", new NodeArgSpec(nodeArgType, "With \"failed\": \"failed\" (default) or \"not_animatable\" (the current avatar cannot be shown live).")), C3cG.A0r("avatar_stem", new NodeArgSpec(nodeArgType, "The stem (the identity's avatar.canonical_path) of the avatar the call waits for (\"updating\", re-sent when a newer pick replaces it) or now shows (\"completed\").")), C3cG.A0r("avatar_image_path", new NodeArgSpec(nodeArgType, "The identity's avatar.image_path of that avatar, so the client can show its still before the identity names it.")), C3cG.A0r("started_on_previous", new NodeArgSpec(NodeArgType.BOOLEAN, "True on every status of a call that started on the previous avatar. Listing it opts the client in to such calls (call.avatar_updating on the voice.calls.join receipt)."))), c0881AGi, null, "Confirmation that the call applied the avatar update state.", 0L)));
    }

    @Override // com.facebook.aura.uicontrol.UiCommandContributor
    public Map<String, NodeCommandSpec> getSpecs() {
        Map<String, NodeCommandSpec> map = allSpecs;
        AIY aiy = new AIY();
        VoiceCallSupport voiceCallSupport = VoiceCallSupport.INSTANCE;
        if (!voiceCallSupport.isVoiceCallSupported()) {
            aiy.add(VoiceUiCommandsKt.UI_NAVIGATE_SETTINGS_VOICE);
            aiy.add(VoiceUiCommandsKt.UI_SET_VOICE_PREVIEW_OPTION);
        }
        if (!voiceCallSupport.isEmbodimentSupported()) {
            aiy.addAll(VoiceUiCommandsKt.LIVE_AVATAR_COMMANDS);
        }
        if (!voiceCallSupport.isLiveAvatarUpdateSupported()) {
            aiy.add(VoiceUiCommandsKt.UI_SET_VOICE_CALL_AVATAR_UPDATED);
        }
        return AGH.A07(AIX.A00(aiy), map);
    }

    @Override // com.facebook.aura.uicontrol.UiCommandContributor
    public /* bridge */ String invalidParams(String str, JsonObject jsonObject) {
        return null;
    }
}
