package com.facebook.aura.partners.voice.gating;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFI;
import X.C07739il;
import X.C31u;
import X.C3cG;
import X.C4992DKo;
import X.C7384Etj;
import X.C7491Exw;
import X.CFK;
import X.InterfaceC7359EnW;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import com.facebook.aura.memory.AuraMemoryBudget;
import com.facebook.aura.memory.AuraMemoryState;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.partners.voice.gating.MC;
import com.facebook.aura.partners.voice.intf.VoiceAudioOnlyReason;
import com.facebook.aura.partners.voice.prefs.VoiceAvatarExpandedView;
import java.util.Set;

/* loaded from: classes2.dex */
public final class VoiceGating {
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties;
    public static final long DEFAULT_CONNECT_TIMEOUT_MS = 15000;
    public static final int GREETING_DELAY_DEFAULT_MAX_MS = 180000;
    public static final VoiceGating INSTANCE;
    public static final String TAG = "VoiceGating";
    public static final C07739il VALID_CONNECT_TIMEOUT_MS;
    public static final C31u allowFilesDuringCall$delegate;
    public static final C31u allowMultipleAttachmentsDuringCall$delegate;
    public static final C31u audioDumpDurationS$delegate;
    public static final C31u connectTimeoutMsRaw$delegate;
    public static final C31u greetingDelayDefaultMsRaw$delegate;
    public static volatile Boolean hardwareH265DecoderPresent;
    public static final C31u isAssistantStreamEnabled$delegate;
    public static final C31u isAutoMuteBotAtMinVolumeEnabled$delegate;
    public static final C31u isAvatarEditMenuChangeVoiceEnabledRaw$delegate;
    public static final C31u isBotCaptionTimestampsEnabled$delegate;
    public static final C31u isCallShortcutEnabled$delegate;
    public static final C31u isDarkCallEmbodimentEnabled$delegate;
    public static final C31u isEmbodimentEnabledRaw$delegate;
    public static final C31u isEmbodimentKeepScreenOnEnabled$delegate;
    public static final C31u isEmbodimentVideoStateSwapEnabled$delegate;
    public static final C31u isFullScreenExpandedViewDisabled$delegate;
    public static final C31u isGreetingDelayEnabled$delegate;
    public static final C31u isH265GeneratedVideoEnabled$delegate;
    public static final C31u isInternalSettingsEnabled$delegate;
    public static final C31u isLiveAvatarUpdateEnabledRaw$delegate;
    public static final C31u isMediaStreamForRtcEnabled$delegate;
    public static final C31u isNativeCallingEnabled$delegate;
    public static final C31u isOriginVipIdInUfragEnabled$delegate;
    public static final C31u isPoorLinkVideoFallbackEnabled$delegate;
    public static final C31u isServerVoicePreviewEnabled$delegate;
    public static final C31u isStreamingCaptionsToThreadEnabled$delegate;
    public static final C31u isSystemPipEnabledRaw$delegate;
    public static final C31u isTabRootCaptionsEnabledRaw$delegate;
    public static final C31u isVmCachedVoicePreviewEnabled$delegate;
    public static final C31u isVoiceCallEnabled$delegate;
    public static final C31u isVoiceCallKeepScreenOnEnabled$delegate;
    public static final C31u isVoiceDesignEnabledRaw$delegate;
    public static final C31u isWaitForJoinResponseBeforeApplyingPregenRemoteSdpEnabled$delegate;
    public static final C31u isWearOsEmbodimentDisabled$delegate;
    public static final C31u isWearOsVoiceEnabled$delegate;
    public static final C31u isWidgetConfirmationEnabled$delegate;
    public static final C31u isWidgetPreviewPrefetchEnabledRaw$delegate;
    public static final C31u joinRequestRetryMinBackoffS$delegate;
    public static final Set<Integer> mediaOutputTypes;
    public static final C31u requiresNuxForMetaAppCall$delegate;
    public static final Set<Integer> twoWayHeadsetTypes;
    public static final C31u voiceAnnouncementFlow$delegate;
    public static final C31u voiceAnnouncementFlowWithoutLogging$delegate;

    private final VoiceAnnouncementCopy copyForFlow(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    switch (i) {
                        case 11:
                            break;
                        case 12:
                            break;
                        case 13:
                            break;
                        default:
                            return null;
                    }
                }
                return VoiceAnnouncementCopy.NOW_HAS_A_VOICE;
            }
            return VoiceAnnouncementCopy.TURN_IT_UP;
        }
        return VoiceAnnouncementCopy.HEAR_THAT;
    }

    private final Boolean findHardwareH265Decoder() {
        try {
            boolean z = false;
            MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
            C7384Etj.A0U(codecInfos);
            int length = codecInfos.length;
            int i = 0;
            loop0: while (true) {
                if (i >= length) {
                    break;
                }
                MediaCodecInfo mediaCodecInfo = codecInfos[i];
                if (!mediaCodecInfo.isEncoder() && mediaCodecInfo.isHardwareAccelerated()) {
                    String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                    C7384Etj.A0U(supportedTypes);
                    int length2 = supportedTypes.length;
                    for (int i2 = 0; i2 < length2; i2++) {
                        String str = supportedTypes[i2];
                        if (str == null ? false : str.equalsIgnoreCase("video/hevc")) {
                            z = true;
                            break loop0;
                        }
                    }
                }
                i++;
            }
            return Boolean.valueOf(z);
        } catch (RuntimeException e) {
            CFK.A0K(TAG, e, "Failed to list video decoders; H.265 stays off for this call");
            return null;
        }
    }

    public final VoiceAvatarExpandedView effectiveAvatarExpandedView(VoiceAvatarExpandedView voiceAvatarExpandedView) {
        C7384Etj.A0Y(voiceAvatarExpandedView, 0);
        return (voiceAvatarExpandedView == VoiceAvatarExpandedView.FULL_SCREEN && isFullScreenExpandedViewDisabled()) ? VoiceAvatarExpandedView.HALF_SCREEN : voiceAvatarExpandedView;
    }

    public final boolean isEmbodimentPressureBlocked(AuraMemoryState auraMemoryState, boolean z) {
        C7384Etj.A0Y(auraMemoryState, 0);
        DefaultEmbodimentMemoryPolicy defaultEmbodimentMemoryPolicy = DefaultEmbodimentMemoryPolicy.INSTANCE;
        return auraMemoryState.isPressureBlocked(z ? defaultEmbodimentMemoryPolicy.getResumeAvailableMemoryBytes() : defaultEmbodimentMemoryPolicy.getMinAvailableMemoryBytes());
    }

    static {
        InterfaceC7359EnW<Object>[] interfaceC7359EnWArr = new InterfaceC7359EnW[40];
        System.arraycopy(new InterfaceC7359EnW[]{C3cG.A0y(VoiceGating.class, "isWidgetPreviewPrefetchEnabledRaw", "isWidgetPreviewPrefetchEnabledRaw()Z"), C3cG.A0y(VoiceGating.class, "isVmCachedVoicePreviewEnabled", "isVmCachedVoicePreviewEnabled()Z"), C3cG.A0y(VoiceGating.class, "isServerVoicePreviewEnabled", "isServerVoicePreviewEnabled()Z"), C3cG.A0y(VoiceGating.class, "isVoiceCallEnabled", "isVoiceCallEnabled()Z"), C3cG.A0y(VoiceGating.class, "isNativeCallingEnabled", "isNativeCallingEnabled()Z"), C3cG.A0y(VoiceGating.class, "isCallShortcutEnabled", "isCallShortcutEnabled()Z"), C3cG.A0y(VoiceGating.class, "isWearOsVoiceEnabled", "isWearOsVoiceEnabled()Z"), C3cG.A0y(VoiceGating.class, "isWearOsEmbodimentDisabled", "isWearOsEmbodimentDisabled()Z"), C3cG.A0y(VoiceGating.class, "isWidgetConfirmationEnabled", "isWidgetConfirmationEnabled()Z"), C3cG.A0y(VoiceGating.class, "isGreetingDelayEnabled", "isGreetingDelayEnabled()Z"), C3cG.A0y(VoiceGating.class, "requiresNuxForMetaAppCall", "getRequiresNuxForMetaAppCall()Z"), C3cG.A0y(VoiceGating.class, "voiceAnnouncementFlow", "getVoiceAnnouncementFlow()I"), C3cG.A0y(VoiceGating.class, "voiceAnnouncementFlowWithoutLogging", "getVoiceAnnouncementFlowWithoutLogging()I"), C3cG.A0y(VoiceGating.class, "isAssistantStreamEnabled", "isAssistantStreamEnabled()Z"), C3cG.A0y(VoiceGating.class, "isMediaStreamForRtcEnabled", "isMediaStreamForRtcEnabled()Z"), C3cG.A0y(VoiceGating.class, "isInternalSettingsEnabled", "isInternalSettingsEnabled()Z"), C3cG.A0y(VoiceGating.class, "isFullScreenExpandedViewDisabled", "isFullScreenExpandedViewDisabled()Z"), C3cG.A0y(VoiceGating.class, "joinRequestRetryMinBackoffS", "getJoinRequestRetryMinBackoffS()I"), C3cG.A0y(VoiceGating.class, "audioDumpDurationS", "getAudioDumpDurationS()I"), C3cG.A0y(VoiceGating.class, "connectTimeoutMsRaw", "getConnectTimeoutMsRaw()J"), C3cG.A0y(VoiceGating.class, "allowMultipleAttachmentsDuringCall", "getAllowMultipleAttachmentsDuringCall()Z"), C3cG.A0y(VoiceGating.class, "allowFilesDuringCall", "getAllowFilesDuringCall()Z"), C3cG.A0y(VoiceGating.class, "isStreamingCaptionsToThreadEnabled", "isStreamingCaptionsToThreadEnabled()Z"), C3cG.A0y(VoiceGating.class, "isOriginVipIdInUfragEnabled", "isOriginVipIdInUfragEnabled()Z"), C3cG.A0y(VoiceGating.class, "isWaitForJoinResponseBeforeApplyingPregenRemoteSdpEnabled", "isWaitForJoinResponseBeforeApplyingPregenRemoteSdpEnabled()Z"), C3cG.A0y(VoiceGating.class, "isBotCaptionTimestampsEnabled", "isBotCaptionTimestampsEnabled()Z"), C3cG.A0y(VoiceGating.class, "isAutoMuteBotAtMinVolumeEnabled", "isAutoMuteBotAtMinVolumeEnabled()Z")}, 0, interfaceC7359EnWArr, 0, 27);
        System.arraycopy(new InterfaceC7359EnW[]{C3cG.A0y(VoiceGating.class, "isLiveAvatarUpdateEnabledRaw", "isLiveAvatarUpdateEnabledRaw()Z"), C3cG.A0y(VoiceGating.class, "isDarkCallEmbodimentEnabled", "isDarkCallEmbodimentEnabled()Z"), C3cG.A0y(VoiceGating.class, "isVoiceDesignEnabledRaw", "isVoiceDesignEnabledRaw()Z"), C3cG.A0y(VoiceGating.class, "isH265GeneratedVideoEnabled", "isH265GeneratedVideoEnabled()Z"), C3cG.A0y(VoiceGating.class, "isTabRootCaptionsEnabledRaw", "isTabRootCaptionsEnabledRaw()Z"), C3cG.A0y(VoiceGating.class, "isAvatarEditMenuChangeVoiceEnabledRaw", "isAvatarEditMenuChangeVoiceEnabledRaw()Z"), C3cG.A0y(VoiceGating.class, "isEmbodimentEnabledRaw", "isEmbodimentEnabledRaw()Z"), C3cG.A0y(VoiceGating.class, "isEmbodimentVideoStateSwapEnabled", "isEmbodimentVideoStateSwapEnabled()Z"), C3cG.A0y(VoiceGating.class, "isPoorLinkVideoFallbackEnabled", "isPoorLinkVideoFallbackEnabled()Z"), C3cG.A0y(VoiceGating.class, "isEmbodimentKeepScreenOnEnabled", "isEmbodimentKeepScreenOnEnabled()Z"), C3cG.A0y(VoiceGating.class, "isVoiceCallKeepScreenOnEnabled", "isVoiceCallKeepScreenOnEnabled()Z"), C3cG.A0y(VoiceGating.class, "isSystemPipEnabledRaw", "isSystemPipEnabledRaw()Z"), C3cG.A0y(VoiceGating.class, "greetingDelayDefaultMsRaw", "getGreetingDelayDefaultMsRaw()I")}, 0, interfaceC7359EnWArr, 27, 13);
        $$delegatedProperties = interfaceC7359EnWArr;
        INSTANCE = new VoiceGating();
        isWidgetPreviewPrefetchEnabledRaw$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.android_lobster_voice_abra.enable_widget_preview_prefetch);
        isVmCachedVoicePreviewEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.android_lobster_voice_abra.enable_vm_cached_voice_previews);
        isServerVoicePreviewEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.android_lobster_voice_abra.enable_server_voice_preview);
        isVoiceCallEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.android_lobster_voice_abra.enabled);
        isNativeCallingEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.android_lobster_voice_abra.enable_native_calling);
        isCallShortcutEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.android_lobster_voice_abra.enable_call_shortcut);
        isWearOsVoiceEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.android_lobster_voice_abra.wearos_enabled);
        isWearOsEmbodimentDisabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.android_lobster_voice_abra.disable_wearos_embodiment);
        isWidgetConfirmationEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.android_lobster_voice_abra.enable_voice_widget_confirmation);
        isGreetingDelayEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.android_lobster_voice_abra.enable_greeting_delay);
        requiresNuxForMetaAppCall$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.android_lobster_voice_abra.require_nux_for_meta_app_call);
        C7491Exw c7491Exw = MC.android_lobster_voice_abra.voice_announcement_flow;
        voiceAnnouncementFlow$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigInt(c7491Exw);
        C4992DKo c4992DKo = C4992DKo.A06;
        C7384Etj.A0V(c4992DKo);
        voiceAnnouncementFlowWithoutLogging$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigIntWithOptions(c7491Exw, c4992DKo);
        isAssistantStreamEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.android_lobster_voice_abra.enable_assistant_stream);
        isMediaStreamForRtcEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.android_lobster_voice_abra.use_media_stream_for_rtc);
        twoWayHeadsetTypes = BFI.A0H(new Integer[]{7, 26});
        mediaOutputTypes = BFI.A0H(new Integer[]{8, 26, 27, 23});
        isInternalSettingsEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.android_lobster_voice_abra.enable_internal_settings);
        isFullScreenExpandedViewDisabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.android_lobster_voice_abra.disable_full_screen_expanded_view);
        joinRequestRetryMinBackoffS$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigInt(MC.android_lobster_voice_abra.join_request_retry_min_backoff_s);
        audioDumpDurationS$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigInt(MC.android_lobster_voice_abra.audio_dump_duration_s);
        VALID_CONNECT_TIMEOUT_MS = new C07739il(5000L, 30000L);
        connectTimeoutMsRaw$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigLong(MC.android_lobster_voice_abra.connect_timeout_ms);
        allowMultipleAttachmentsDuringCall$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.android_lobster_voice_abra.allow_multiple_attachments_during_call);
        allowFilesDuringCall$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.android_lobster_voice_abra.allow_files_during_call);
        isStreamingCaptionsToThreadEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.android_lobster_voice_abra.enable_streaming_captions_to_thread);
        isOriginVipIdInUfragEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.android_lobster_voice_abra.enable_origin_vip_id_in_ufrag);
        isWaitForJoinResponseBeforeApplyingPregenRemoteSdpEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.android_lobster_voice_abra.enable_wait_for_join_response_before_applying_pregen_remote_sdp);
        isBotCaptionTimestampsEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.android_lobster_voice_abra.enable_bot_caption_timestamps);
        isAutoMuteBotAtMinVolumeEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.android_lobster_voice_abra.enable_auto_mute_bot_at_min_volume);
        isLiveAvatarUpdateEnabledRaw$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.android_lobster_voice_abra.enable_live_avatar_update);
        isDarkCallEmbodimentEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.android_lobster_voice_abra.enable_dark_call_embodiment);
        isVoiceDesignEnabledRaw$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.android_lobster_voice_abra.enable_voice_design);
        isH265GeneratedVideoEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.android_lobster_voice_abra.enable_h265_generated_video);
        isTabRootCaptionsEnabledRaw$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.android_lobster_voice_abra.enable_tab_root_captions);
        isAvatarEditMenuChangeVoiceEnabledRaw$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.android_lobster_voice_abra.enable_avatar_edit_menu_change_voice);
        isEmbodimentEnabledRaw$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.android_lobster_voice_abra.enable_embodiment);
        isEmbodimentVideoStateSwapEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.android_lobster_voice_abra.enable_embodiment_video_state_swap);
        isPoorLinkVideoFallbackEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.android_lobster_voice_abra.enable_poor_link_video_fallback);
        isEmbodimentKeepScreenOnEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.android_lobster_voice_abra.enable_embodiment_keep_screen_on);
        isVoiceCallKeepScreenOnEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.android_lobster_voice_abra.enable_voice_call_keep_screen_on);
        isSystemPipEnabledRaw$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.android_lobster_voice_abra.enable_system_pip);
        greetingDelayDefaultMsRaw$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigInt(MC.android_lobster_voice_abra.greeting_delay_default_ms);
    }

    private final boolean getAllowMultipleAttachmentsDuringCall() {
        return C31u.A01(this, allowMultipleAttachmentsDuringCall$delegate, $$delegatedProperties, 20);
    }

    private final long getConnectTimeoutMsRaw() {
        return C3cG.A05(connectTimeoutMsRaw$delegate.getValue(this, $$delegatedProperties[19]));
    }

    private final int getGreetingDelayDefaultMsRaw() {
        return AnonymousClass001.A0F(greetingDelayDefaultMsRaw$delegate.getValue(this, $$delegatedProperties[39]));
    }

    private final boolean getHasHardwareH265Decoder() {
        Boolean boolFindHardwareH265Decoder = hardwareH265DecoderPresent;
        if (boolFindHardwareH265Decoder == null) {
            boolFindHardwareH265Decoder = findHardwareH265Decoder();
            if (boolFindHardwareH265Decoder == null) {
                return false;
            }
            hardwareH265DecoderPresent = boolFindHardwareH265Decoder;
        }
        return boolFindHardwareH265Decoder.booleanValue();
    }

    private final int getVoiceAnnouncementFlow() {
        return AnonymousClass001.A0F(voiceAnnouncementFlow$delegate.getValue(this, $$delegatedProperties[11]));
    }

    private final int getVoiceAnnouncementFlowWithoutLogging() {
        return AnonymousClass001.A0F(voiceAnnouncementFlowWithoutLogging$delegate.getValue(this, $$delegatedProperties[12]));
    }

    private final boolean isAssistantStreamEnabled() {
        return C31u.A01(this, isAssistantStreamEnabled$delegate, $$delegatedProperties, 13);
    }

    private final boolean isAvatarEditMenuChangeVoiceEnabledRaw() {
        return C31u.A01(this, isAvatarEditMenuChangeVoiceEnabledRaw$delegate, $$delegatedProperties, 32);
    }

    private final boolean isBotCaptionTimestampsEnabled() {
        return C31u.A01(this, isBotCaptionTimestampsEnabled$delegate, $$delegatedProperties, 25);
    }

    private final boolean isEmbodimentEnabledRaw() {
        return C31u.A01(this, isEmbodimentEnabledRaw$delegate, $$delegatedProperties, 33);
    }

    private final boolean isH265GeneratedVideoEnabled() {
        return C31u.A01(this, isH265GeneratedVideoEnabled$delegate, $$delegatedProperties, 30);
    }

    private final boolean isLiveAvatarUpdateEnabledRaw() {
        return C31u.A01(this, isLiveAvatarUpdateEnabledRaw$delegate, $$delegatedProperties, 27);
    }

    private final boolean isMediaStreamForRtcEnabled() {
        return C31u.A01(this, isMediaStreamForRtcEnabled$delegate, $$delegatedProperties, 14);
    }

    private final boolean isSystemPipEnabledRaw() {
        return C31u.A01(this, isSystemPipEnabledRaw$delegate, $$delegatedProperties, 38);
    }

    private final boolean isTabRootCaptionsEnabledRaw() {
        return C31u.A01(this, isTabRootCaptionsEnabledRaw$delegate, $$delegatedProperties, 31);
    }

    private final boolean isVoiceDesignEnabledRaw() {
        return C31u.A01(this, isVoiceDesignEnabledRaw$delegate, $$delegatedProperties, 29);
    }

    private final boolean isWidgetPreviewPrefetchEnabledRaw() {
        return C31u.A01(this, isWidgetPreviewPrefetchEnabledRaw$delegate, $$delegatedProperties, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0040 A[EDGE_INSN: B:27:0x0040->B:15:0x0040 BREAK  A[LOOP:1: B:11:0x002b->B:17:0x0050], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean connectedOutputsAreMediaOnly() {
        /*
            r6 = this;
            com.facebook.aura.partners.voice.gating.VoiceCallVolume r0 = com.facebook.aura.partners.voice.gating.VoiceCallVolume.INSTANCE
            android.media.AudioManager r3 = r0.audioManager()
            r6 = 0
            if (r3 == 0) goto L4f
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            if (r1 < r0) goto L20
            java.util.List r1 = r3.getAvailableCommunicationDevices()
            X.C7384Etj.A0U(r1)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L53
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L53
        L20:
            r5 = 0
            r0 = 2
            android.media.AudioDeviceInfo[] r4 = r3.getDevices(r0)
            X.C7384Etj.A0U(r4)
            int r3 = r4.length
            r2 = 0
        L2b:
            if (r2 >= r3) goto L40
            r0 = r4[r2]
            java.util.Set<java.lang.Integer> r1 = com.facebook.aura.partners.voice.gating.VoiceGating.mediaOutputTypes
            int r0 = r0.getType()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L50
            r6 = 1
        L40:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r5)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r6)
            java.lang.String r1 = "VoiceGating"
            java.lang.String r0 = "Call output: two-way headset %b, media output %b"
            X.CFK.A02(r3, r2, r1, r0)
        L4f:
            return r6
        L50:
            int r2 = r2 + 1
            goto L2b
        L53:
            java.util.Iterator r2 = r1.iterator()
        L57:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L20
            java.lang.Object r0 = r2.next()
            android.media.AudioDeviceInfo r0 = (android.media.AudioDeviceInfo) r0
            java.util.Set<java.lang.Integer> r1 = com.facebook.aura.partners.voice.gating.VoiceGating.twoWayHeadsetTypes
            int r0 = r0.getType()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L57
            r5 = 1
            goto L40
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.gating.VoiceGating.connectedOutputsAreMediaOnly():boolean");
    }

    public final boolean getAllowFilesDuringCall() {
        return C31u.A01(this, allowFilesDuringCall$delegate, $$delegatedProperties, 21);
    }

    public final int getAudioDumpDurationS() {
        return AnonymousClass001.A0F(audioDumpDurationS$delegate.getValue(this, $$delegatedProperties[18]));
    }

    public final VoiceCallAudioStream getCallAudioStream() {
        return (Build.VERSION.SDK_INT < 37 || !isAssistantStreamEnabled()) ? isMediaStreamForRtcEnabled() ? VoiceCallAudioStream.MEDIA : VoiceCallAudioStream.VOICE_CALL : VoiceCallAudioStream.ASSISTANT;
    }

    public final VoiceAudioOnlyReason getEmbodimentOffReason() {
        if (AuraMemoryBudget.INSTANCE.isLowRamDevice() && DefaultEmbodimentMemoryPolicy.INSTANCE.getBlocksLowRamDevices()) {
            return VoiceAudioOnlyReason.LOW_RAM_DEVICE;
        }
        if (isVoiceCallEnabled() && isEmbodimentEnabledRaw()) {
            return null;
        }
        return VoiceAudioOnlyReason.EMBODIMENT_DISABLED;
    }

    public final int getJoinRequestRetryMinBackoffS() {
        return AnonymousClass001.A0F(joinRequestRetryMinBackoffS$delegate.getValue(this, $$delegatedProperties[17]));
    }

    public final boolean getPicksCallStreamFromOutputs() {
        return false;
    }

    public final boolean getRequiresNuxForMetaAppCall() {
        return C31u.A01(this, requiresNuxForMetaAppCall$delegate, $$delegatedProperties, 10);
    }

    public final boolean isAutoMuteBotAtMinVolumeEnabled() {
        return C31u.A01(this, isAutoMuteBotAtMinVolumeEnabled$delegate, $$delegatedProperties, 26);
    }

    public final boolean isCallKeepScreenOnEnabled(boolean z) {
        return z ? isEmbodimentKeepScreenOnEnabled() : isVoiceCallKeepScreenOnEnabled();
    }

    public final boolean isCallShortcutEnabled() {
        return C31u.A01(this, isCallShortcutEnabled$delegate, $$delegatedProperties, 5);
    }

    public final boolean isDarkCallEmbodimentEnabled() {
        return C31u.A01(this, isDarkCallEmbodimentEnabled$delegate, $$delegatedProperties, 28);
    }

    public final boolean isEmbodimentKeepScreenOnEnabled() {
        return C31u.A01(this, isEmbodimentKeepScreenOnEnabled$delegate, $$delegatedProperties, 36);
    }

    public final boolean isEmbodimentVideoStateSwapEnabled() {
        return C31u.A01(this, isEmbodimentVideoStateSwapEnabled$delegate, $$delegatedProperties, 34);
    }

    public final boolean isFullScreenExpandedViewDisabled() {
        return C31u.A01(this, isFullScreenExpandedViewDisabled$delegate, $$delegatedProperties, 16);
    }

    public final boolean isGreetingDelayEnabled() {
        return C31u.A01(this, isGreetingDelayEnabled$delegate, $$delegatedProperties, 9);
    }

    public final boolean isInternalSettingsEnabled() {
        return C31u.A01(this, isInternalSettingsEnabled$delegate, $$delegatedProperties, 15);
    }

    public final boolean isNativeCallingEnabled() {
        return C31u.A01(this, isNativeCallingEnabled$delegate, $$delegatedProperties, 4);
    }

    public final boolean isOriginVipIdInUfragEnabled() {
        return C31u.A01(this, isOriginVipIdInUfragEnabled$delegate, $$delegatedProperties, 23);
    }

    public final boolean isPoorLinkVideoFallbackEnabled() {
        return C31u.A01(this, isPoorLinkVideoFallbackEnabled$delegate, $$delegatedProperties, 35);
    }

    public final boolean isServerVoicePreviewEnabled() {
        return C31u.A01(this, isServerVoicePreviewEnabled$delegate, $$delegatedProperties, 2);
    }

    public final boolean isStreamingCaptionsToThreadEnabled() {
        return C31u.A01(this, isStreamingCaptionsToThreadEnabled$delegate, $$delegatedProperties, 22);
    }

    public final boolean isVmCachedVoicePreviewEnabled() {
        return C31u.A01(this, isVmCachedVoicePreviewEnabled$delegate, $$delegatedProperties, 1);
    }

    public final boolean isVoiceCallEnabled() {
        return C31u.A01(this, isVoiceCallEnabled$delegate, $$delegatedProperties, 3);
    }

    public final boolean isVoiceCallKeepScreenOnEnabled() {
        return C31u.A01(this, isVoiceCallKeepScreenOnEnabled$delegate, $$delegatedProperties, 37);
    }

    public final boolean isWaitForJoinResponseBeforeApplyingPregenRemoteSdpEnabled() {
        return C31u.A01(this, isWaitForJoinResponseBeforeApplyingPregenRemoteSdpEnabled$delegate, $$delegatedProperties, 24);
    }

    public final boolean isWearOsEmbodimentDisabled() {
        return C31u.A01(this, isWearOsEmbodimentDisabled$delegate, $$delegatedProperties, 7);
    }

    public final boolean isWearOsVoiceEnabled() {
        return C31u.A01(this, isWearOsVoiceEnabled$delegate, $$delegatedProperties, 6);
    }

    public final boolean isWidgetConfirmationEnabled() {
        return C31u.A01(this, isWidgetConfirmationEnabled$delegate, $$delegatedProperties, 8);
    }

    public final long getConnectTimeoutMs() {
        long connectTimeoutMsRaw = getConnectTimeoutMsRaw();
        C07739il c07739il = VALID_CONNECT_TIMEOUT_MS;
        long j = c07739il.A00;
        if (connectTimeoutMsRaw > c07739il.A01 || j > connectTimeoutMsRaw) {
            return 15000L;
        }
        return connectTimeoutMsRaw;
    }

    public final int getGreetingDelayDefaultMs() {
        int greetingDelayDefaultMsRaw = getGreetingDelayDefaultMsRaw();
        if (greetingDelayDefaultMsRaw < 0) {
            return 0;
        }
        if (greetingDelayDefaultMsRaw > 180000) {
            return 180000;
        }
        return greetingDelayDefaultMsRaw;
    }

    public final int getMaxAttachmentsDuringCall() {
        return getAllowMultipleAttachmentsDuringCall() ? Integer.MAX_VALUE : 1;
    }

    public final boolean getSkipsVoiceNuxAfterAnnouncement() {
        int voiceAnnouncementFlow;
        return isVoiceCallEnabled() && 11 <= (voiceAnnouncementFlow = getVoiceAnnouncementFlow()) && voiceAnnouncementFlow < 14;
    }

    public final VoiceAnnouncementCopy getVoiceAnnouncementCopy() {
        if (isVoiceCallEnabled()) {
            return copyForFlow(getVoiceAnnouncementFlow());
        }
        return null;
    }

    public final boolean isAvatarEditMenuChangeVoiceEnabled() {
        return isVoiceCallEnabled() && isAvatarEditMenuChangeVoiceEnabledRaw();
    }

    public final boolean isEmbodimentEnabled() {
        return AnonymousClass002.A1Y(getEmbodimentOffReason());
    }

    public final boolean isEmbodimentVideoStateSwapActive() {
        return AnonymousClass002.A1Y(getEmbodimentOffReason()) && isEmbodimentVideoStateSwapEnabled();
    }

    public final boolean isFullScreenExpandedViewAvailable() {
        return !isFullScreenExpandedViewDisabled();
    }

    public final boolean isH265GeneratedVideoSupported() {
        return getHasHardwareH265Decoder() && isH265GeneratedVideoEnabled();
    }

    public final boolean isLiveAvatarUpdateEnabled() {
        return AnonymousClass002.A1Y(getEmbodimentOffReason()) && isLiveAvatarUpdateEnabledRaw();
    }

    public final boolean isPartialWordHoldEnabled() {
        return isBotCaptionTimestampsEnabled();
    }

    public final boolean isSpokenTimingEnabled() {
        return isBotCaptionTimestampsEnabled();
    }

    public final boolean isSystemPipEnabled() {
        return AnonymousClass002.A1Y(getEmbodimentOffReason()) && isSystemPipEnabledRaw();
    }

    public final boolean isTabRootCaptionsEnabled() {
        return isVoiceCallEnabled() && isTabRootCaptionsEnabledRaw();
    }

    public final boolean isVoiceAnnouncementControlWithoutLogging() {
        return isVoiceAnnouncementFlowOn() && copyForFlow(getVoiceAnnouncementFlowWithoutLogging()) == null;
    }

    public final boolean isVoiceAnnouncementFlowOn() {
        return isVoiceCallEnabled() && getVoiceAnnouncementFlowWithoutLogging() != 0;
    }

    public final boolean isVoiceAnnouncementSheetEnabled() {
        return AnonymousClass002.A1X(getVoiceAnnouncementCopy());
    }

    public final boolean isVoiceDesignEnabled() {
        return isVoiceCallEnabled() && isVoiceDesignEnabledRaw();
    }

    public final boolean isWidgetPreviewPrefetchEnabled() {
        return isWidgetPreviewPrefetchEnabledRaw() && !isVmCachedVoicePreviewEnabled();
    }
}
