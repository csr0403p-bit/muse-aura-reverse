package X;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.mediastats.gen.MediaStatsListener;
import com.facebook.rsys.mediastats.gen.ScreenShareStats;
import com.facebook.rsys.mediastats.gen.VideoStreamStats;
import com.facebook.rsys.messagequeue.gen.MessageQueue;
import com.facebook.rsys.messagequeue.gen.MessageQueueItem;
import com.facebook.rsys.metaaivoicestate.api.gen.ChatHistory;
import com.facebook.rsys.metaaivoicestate.api.gen.ChatMessage;
import com.facebook.rsys.metaaivoicestate.api.gen.Conversation;
import com.facebook.rsys.metaaivoicestate.api.gen.LocationData;
import com.facebook.rsys.metaaivoicestate.api.gen.MetaAiToolCallResult;
import com.facebook.rsys.metaaivoicestate.api.gen.MetaAiVoiceStateApi;
import com.facebook.rsys.metaaivoicestate.api.gen.PsiToolData;
import com.facebook.rsys.metaaivoicestate.api.gen.ReadAloudData;
import com.facebook.rsys.metaaivoicestate.api.gen.RelevantMessage;
import com.facebook.rsys.metaaivoicestate.api.gen.SummarizeUnreadToolData;
import com.facebook.rsys.metaaivoicestate.api.gen.UnreadMessage;
import com.facebook.rsys.metaaivoicestate.api.gen.VoiceCommandExecutionResult;
import com.facebook.rsys.metaaivoicestate.gen.AipRecordingResult;
import com.facebook.rsys.metaaivoicestate.gen.ClientInstruction;
import com.facebook.rsys.metaaivoicestate.gen.CommandData;
import com.facebook.rsys.metaaivoicestate.gen.CreatorBotClientReadyMessage;
import com.facebook.rsys.metaaivoicestate.gen.DeepDiveDiscussedSubject;
import com.facebook.rsys.metaaivoicestate.gen.DeepDiveDiscussedSubjectSource;
import com.facebook.rsys.metaaivoicestate.gen.DeepDivePlaybackSection;
import com.facebook.rsys.metaaivoicestate.gen.DeepDiveSnapshot;
import com.facebook.rsys.metaaivoicestate.gen.DeepDiveState;
import com.facebook.rsys.metaaivoicestate.gen.DeepDiveTopic;
import com.facebook.rsys.metaaivoicestate.gen.GenAiBizAgentViewModel;
import com.facebook.rsys.metaaivoicestate.gen.GenAiMediaStats;
import com.facebook.rsys.metaaivoicestate.gen.GenAiTextPromptViewModel;
import com.facebook.rsys.metaaivoicestate.gen.LiveAiConnectionState;
import com.facebook.rsys.metaaivoicestate.gen.MediaUploadComplete;
import com.facebook.rsys.metaaivoicestate.gen.MetaAiBotContent;
import com.facebook.rsys.metaaivoicestate.gen.MetaAiCaption;
import com.facebook.rsys.metaaivoicestate.gen.MetaAiConnectState;
import com.facebook.rsys.metaaivoicestate.gen.MetaAiMediaStatsProxy;
import com.facebook.rsys.metaaivoicestate.gen.MetaAiSessionInfo;
import com.facebook.rsys.metaaivoicestate.gen.MetaAiState;
import com.facebook.rsys.metaaivoicestate.gen.MetaAiToolCallCancel;
import com.facebook.rsys.metaaivoicestate.gen.MetaAiToolCallRequest;
import com.facebook.rsys.metaaivoicestate.gen.MetaAiUserContent;
import com.facebook.rsys.metaaivoicestate.gen.MetaAiVoiceCommand;
import com.facebook.rsys.metaaivoicestate.gen.MetaAiVoiceState;
import com.facebook.rsys.metaaivoicestate.gen.MetaAiVoiceStateProxy;
import com.facebook.rsys.metaaivoicestate.gen.MetaAiWearableAppEventsProxy;
import com.facebook.rsys.metaaivoicestate.gen.PromptData;
import com.facebook.rsys.metaaivoicestate.gen.PsiToolQueryPlan;
import com.facebook.rsys.metaaivoicestate.gen.PsiToolRequest;
import com.facebook.rsys.metaaivoicestate.gen.RealtimeaiInternalDebugContent;
import com.facebook.rsys.metaaivoicestate.gen.S2sConnectionState;
import org.maplibre.android.R;

/* renamed from: X.Ftd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8921Ftd implements G50 {
    public final int $t;

    public C8921Ftd(int i) {
        this.$t = i;
    }

    public static C8921Ftd A00(int i) {
        return new C8921Ftd(i);
    }

    @Override // X.G50
    public final /* bridge */ /* synthetic */ Object A7C(McfReference mcfReference) {
        switch (this.$t) {
            case 0:
                return MediaStatsListener.CProxy.createFromMcfType(mcfReference);
            case 1:
                GUd.A00();
                return ScreenShareStats.createFromMcfType(mcfReference);
            case 2:
                GUd.A00();
                return VideoStreamStats.createFromMcfType(mcfReference);
            case 3:
                GYl.A00();
                return MessageQueue.createFromMcfType(mcfReference);
            case 4:
                GYl.A00();
                return MessageQueueItem.createFromMcfType(mcfReference);
            case 5:
                GUe.A00();
                return ChatHistory.createFromMcfType(mcfReference);
            case 6:
                GUe.A00();
                return ChatMessage.createFromMcfType(mcfReference);
            case 7:
                GUe.A00();
                return Conversation.createFromMcfType(mcfReference);
            case 8:
                GUe.A00();
                return LocationData.createFromMcfType(mcfReference);
            case 9:
                GUe.A00();
                return MetaAiToolCallResult.createFromMcfType(mcfReference);
            case 10:
                return MetaAiVoiceStateApi.CProxy.createFromMcfType(mcfReference);
            case 11:
                GUe.A00();
                return PsiToolData.createFromMcfType(mcfReference);
            case 12:
                GUe.A00();
                return ReadAloudData.createFromMcfType(mcfReference);
            case 13:
                GUe.A00();
                return RelevantMessage.createFromMcfType(mcfReference);
            case 14:
                GUe.A00();
                return SummarizeUnreadToolData.createFromMcfType(mcfReference);
            case 15:
                GUe.A00();
                return UnreadMessage.createFromMcfType(mcfReference);
            case 16:
                GUe.A00();
                return VoiceCommandExecutionResult.createFromMcfType(mcfReference);
            case 17:
                GUf.A00();
                return AipRecordingResult.createFromMcfType(mcfReference);
            case 18:
                GUf.A00();
                return ClientInstruction.createFromMcfType(mcfReference);
            case 19:
                GUf.A00();
                return CommandData.createFromMcfType(mcfReference);
            case 20:
                GUf.A00();
                return CreatorBotClientReadyMessage.createFromMcfType(mcfReference);
            case 21:
                GUf.A00();
                return DeepDiveDiscussedSubject.createFromMcfType(mcfReference);
            case 22:
                GUf.A00();
                return DeepDiveDiscussedSubjectSource.createFromMcfType(mcfReference);
            case 23:
                GUf.A00();
                return DeepDivePlaybackSection.createFromMcfType(mcfReference);
            case 24:
                GUf.A00();
                return DeepDiveSnapshot.createFromMcfType(mcfReference);
            case 25:
                GUf.A00();
                return DeepDiveState.createFromMcfType(mcfReference);
            case 26:
                GUf.A00();
                return DeepDiveTopic.createFromMcfType(mcfReference);
            case 27:
                GUf.A00();
                return GenAiBizAgentViewModel.createFromMcfType(mcfReference);
            case 28:
                GUf.A00();
                return GenAiMediaStats.createFromMcfType(mcfReference);
            case 29:
                GUf.A00();
                return GenAiTextPromptViewModel.createFromMcfType(mcfReference);
            case 30:
                GUf.A00();
                return LiveAiConnectionState.createFromMcfType(mcfReference);
            case 31:
                GUf.A00();
                return MediaUploadComplete.createFromMcfType(mcfReference);
            case 32:
                GUf.A00();
                return MetaAiBotContent.createFromMcfType(mcfReference);
            case 33:
                GUf.A00();
                return MetaAiCaption.createFromMcfType(mcfReference);
            case 34:
                GUf.A00();
                return MetaAiConnectState.createFromMcfType(mcfReference);
            case 35:
                return MetaAiMediaStatsProxy.CProxy.createFromMcfType(mcfReference);
            case 36:
                GUf.A00();
                return MetaAiSessionInfo.createFromMcfType(mcfReference);
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft /* 37 */:
                GUf.A00();
                return MetaAiState.createFromMcfType(mcfReference);
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight /* 38 */:
                GUf.A00();
                return MetaAiToolCallCancel.createFromMcfType(mcfReference);
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop /* 39 */:
                GUf.A00();
                return MetaAiToolCallRequest.createFromMcfType(mcfReference);
            case 40:
                GUf.A00();
                return MetaAiUserContent.createFromMcfType(mcfReference);
            case R.styleable.maplibre_MapView_maplibre_uiHorizontalScrollGestures /* 41 */:
                GUf.A00();
                return MetaAiVoiceCommand.createFromMcfType(mcfReference);
            case 42:
                GUf.A00();
                return MetaAiVoiceState.createFromMcfType(mcfReference);
            case R.styleable.maplibre_MapView_maplibre_uiLogoGravity /* 43 */:
                return MetaAiVoiceStateProxy.CProxy.createFromMcfType(mcfReference);
            case 44:
                return MetaAiWearableAppEventsProxy.CProxy.createFromMcfType(mcfReference);
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft /* 45 */:
                GUf.A00();
                return PromptData.createFromMcfType(mcfReference);
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight /* 46 */:
                GUf.A00();
                return PsiToolQueryPlan.createFromMcfType(mcfReference);
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop /* 47 */:
                GUf.A00();
                return PsiToolRequest.createFromMcfType(mcfReference);
            case 48:
                GUf.A00();
                return RealtimeaiInternalDebugContent.createFromMcfType(mcfReference);
            case R.styleable.maplibre_MapView_maplibre_uiRotateGestures /* 49 */:
                GUf.A00();
                return S2sConnectionState.createFromMcfType(mcfReference);
            default:
                return null;
        }
    }

    @Override // X.G50
    public final Class<MediaStatsListener> AHp() {
        switch (this.$t) {
            case 0:
                return MediaStatsListener.class;
            case 1:
                return ScreenShareStats.class;
            case 2:
                return VideoStreamStats.class;
            case 3:
                return MessageQueue.class;
            case 4:
                return MessageQueueItem.class;
            case 5:
                return ChatHistory.class;
            case 6:
                return ChatMessage.class;
            case 7:
                return Conversation.class;
            case 8:
                return LocationData.class;
            case 9:
                return MetaAiToolCallResult.class;
            case 10:
                return MetaAiVoiceStateApi.class;
            case 11:
                return PsiToolData.class;
            case 12:
                return ReadAloudData.class;
            case 13:
                return RelevantMessage.class;
            case 14:
                return SummarizeUnreadToolData.class;
            case 15:
                return UnreadMessage.class;
            case 16:
                return VoiceCommandExecutionResult.class;
            case 17:
                return AipRecordingResult.class;
            case 18:
                return ClientInstruction.class;
            case 19:
                return CommandData.class;
            case 20:
                return CreatorBotClientReadyMessage.class;
            case 21:
                return DeepDiveDiscussedSubject.class;
            case 22:
                return DeepDiveDiscussedSubjectSource.class;
            case 23:
                return DeepDivePlaybackSection.class;
            case 24:
                return DeepDiveSnapshot.class;
            case 25:
                return DeepDiveState.class;
            case 26:
                return DeepDiveTopic.class;
            case 27:
                return GenAiBizAgentViewModel.class;
            case 28:
                return GenAiMediaStats.class;
            case 29:
                return GenAiTextPromptViewModel.class;
            case 30:
                return LiveAiConnectionState.class;
            case 31:
                return MediaUploadComplete.class;
            case 32:
                return MetaAiBotContent.class;
            case 33:
                return MetaAiCaption.class;
            case 34:
                return MetaAiConnectState.class;
            case 35:
                return MetaAiMediaStatsProxy.class;
            case 36:
                return MetaAiSessionInfo.class;
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft /* 37 */:
                return MetaAiState.class;
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight /* 38 */:
                return MetaAiToolCallCancel.class;
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop /* 39 */:
                return MetaAiToolCallRequest.class;
            case 40:
                return MetaAiUserContent.class;
            case R.styleable.maplibre_MapView_maplibre_uiHorizontalScrollGestures /* 41 */:
                return MetaAiVoiceCommand.class;
            case 42:
                return MetaAiVoiceState.class;
            case R.styleable.maplibre_MapView_maplibre_uiLogoGravity /* 43 */:
                return MetaAiVoiceStateProxy.class;
            case 44:
                return MetaAiWearableAppEventsProxy.class;
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft /* 45 */:
                return PromptData.class;
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight /* 46 */:
                return PsiToolQueryPlan.class;
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop /* 47 */:
                return PsiToolRequest.class;
            case 48:
                return RealtimeaiInternalDebugContent.class;
            case R.styleable.maplibre_MapView_maplibre_uiRotateGestures /* 49 */:
                return S2sConnectionState.class;
            default:
                return null;
        }
    }

    @Override // X.G50
    public final long AMC() {
        switch (this.$t) {
            case 0:
                long j = MediaStatsListener.CProxy.sMcfTypeId;
                if (j != 0) {
                    return j;
                }
                long jNativeGetMcfTypeId = MediaStatsListener.CProxy.nativeGetMcfTypeId();
                MediaStatsListener.CProxy.sMcfTypeId = jNativeGetMcfTypeId;
                return jNativeGetMcfTypeId;
            case 1:
                GUd.A00();
                long j2 = ScreenShareStats.sMcfTypeId;
                if (j2 != 0) {
                    return j2;
                }
                long jNativeGetMcfTypeId2 = ScreenShareStats.nativeGetMcfTypeId();
                ScreenShareStats.sMcfTypeId = jNativeGetMcfTypeId2;
                return jNativeGetMcfTypeId2;
            case 2:
                GUd.A00();
                long j3 = VideoStreamStats.sMcfTypeId;
                if (j3 != 0) {
                    return j3;
                }
                long jNativeGetMcfTypeId3 = VideoStreamStats.nativeGetMcfTypeId();
                VideoStreamStats.sMcfTypeId = jNativeGetMcfTypeId3;
                return jNativeGetMcfTypeId3;
            case 3:
                GYl.A00();
                long j4 = MessageQueue.sMcfTypeId;
                if (j4 != 0) {
                    return j4;
                }
                long jNativeGetMcfTypeId4 = MessageQueue.nativeGetMcfTypeId();
                MessageQueue.sMcfTypeId = jNativeGetMcfTypeId4;
                return jNativeGetMcfTypeId4;
            case 4:
                GYl.A00();
                long j5 = MessageQueueItem.sMcfTypeId;
                if (j5 != 0) {
                    return j5;
                }
                long jNativeGetMcfTypeId5 = MessageQueueItem.nativeGetMcfTypeId();
                MessageQueueItem.sMcfTypeId = jNativeGetMcfTypeId5;
                return jNativeGetMcfTypeId5;
            case 5:
                GUe.A00();
                long j6 = ChatHistory.sMcfTypeId;
                if (j6 != 0) {
                    return j6;
                }
                long jNativeGetMcfTypeId6 = ChatHistory.nativeGetMcfTypeId();
                ChatHistory.sMcfTypeId = jNativeGetMcfTypeId6;
                return jNativeGetMcfTypeId6;
            case 6:
                GUe.A00();
                long j7 = ChatMessage.sMcfTypeId;
                if (j7 != 0) {
                    return j7;
                }
                long jNativeGetMcfTypeId7 = ChatMessage.nativeGetMcfTypeId();
                ChatMessage.sMcfTypeId = jNativeGetMcfTypeId7;
                return jNativeGetMcfTypeId7;
            case 7:
                GUe.A00();
                long j8 = Conversation.sMcfTypeId;
                if (j8 != 0) {
                    return j8;
                }
                long jNativeGetMcfTypeId8 = Conversation.nativeGetMcfTypeId();
                Conversation.sMcfTypeId = jNativeGetMcfTypeId8;
                return jNativeGetMcfTypeId8;
            case 8:
                GUe.A00();
                long j9 = LocationData.sMcfTypeId;
                if (j9 != 0) {
                    return j9;
                }
                long jNativeGetMcfTypeId9 = LocationData.nativeGetMcfTypeId();
                LocationData.sMcfTypeId = jNativeGetMcfTypeId9;
                return jNativeGetMcfTypeId9;
            case 9:
                GUe.A00();
                long j10 = MetaAiToolCallResult.sMcfTypeId;
                if (j10 != 0) {
                    return j10;
                }
                long jNativeGetMcfTypeId10 = MetaAiToolCallResult.nativeGetMcfTypeId();
                MetaAiToolCallResult.sMcfTypeId = jNativeGetMcfTypeId10;
                return jNativeGetMcfTypeId10;
            case 10:
                long j11 = MetaAiVoiceStateApi.CProxy.sMcfTypeId;
                if (j11 != 0) {
                    return j11;
                }
                long jNativeGetMcfTypeId11 = MetaAiVoiceStateApi.CProxy.nativeGetMcfTypeId();
                MetaAiVoiceStateApi.CProxy.sMcfTypeId = jNativeGetMcfTypeId11;
                return jNativeGetMcfTypeId11;
            case 11:
                GUe.A00();
                long j12 = PsiToolData.sMcfTypeId;
                if (j12 != 0) {
                    return j12;
                }
                long jNativeGetMcfTypeId12 = PsiToolData.nativeGetMcfTypeId();
                PsiToolData.sMcfTypeId = jNativeGetMcfTypeId12;
                return jNativeGetMcfTypeId12;
            case 12:
                GUe.A00();
                long j13 = ReadAloudData.sMcfTypeId;
                if (j13 != 0) {
                    return j13;
                }
                long jNativeGetMcfTypeId13 = ReadAloudData.nativeGetMcfTypeId();
                ReadAloudData.sMcfTypeId = jNativeGetMcfTypeId13;
                return jNativeGetMcfTypeId13;
            case 13:
                GUe.A00();
                long j14 = RelevantMessage.sMcfTypeId;
                if (j14 != 0) {
                    return j14;
                }
                long jNativeGetMcfTypeId14 = RelevantMessage.nativeGetMcfTypeId();
                RelevantMessage.sMcfTypeId = jNativeGetMcfTypeId14;
                return jNativeGetMcfTypeId14;
            case 14:
                GUe.A00();
                long j15 = SummarizeUnreadToolData.sMcfTypeId;
                if (j15 != 0) {
                    return j15;
                }
                long jNativeGetMcfTypeId15 = SummarizeUnreadToolData.nativeGetMcfTypeId();
                SummarizeUnreadToolData.sMcfTypeId = jNativeGetMcfTypeId15;
                return jNativeGetMcfTypeId15;
            case 15:
                GUe.A00();
                long j16 = UnreadMessage.sMcfTypeId;
                if (j16 != 0) {
                    return j16;
                }
                long jNativeGetMcfTypeId16 = UnreadMessage.nativeGetMcfTypeId();
                UnreadMessage.sMcfTypeId = jNativeGetMcfTypeId16;
                return jNativeGetMcfTypeId16;
            case 16:
                GUe.A00();
                long j17 = VoiceCommandExecutionResult.sMcfTypeId;
                if (j17 != 0) {
                    return j17;
                }
                long jNativeGetMcfTypeId17 = VoiceCommandExecutionResult.nativeGetMcfTypeId();
                VoiceCommandExecutionResult.sMcfTypeId = jNativeGetMcfTypeId17;
                return jNativeGetMcfTypeId17;
            case 17:
                GUf.A00();
                long j18 = AipRecordingResult.sMcfTypeId;
                if (j18 != 0) {
                    return j18;
                }
                long jNativeGetMcfTypeId18 = AipRecordingResult.nativeGetMcfTypeId();
                AipRecordingResult.sMcfTypeId = jNativeGetMcfTypeId18;
                return jNativeGetMcfTypeId18;
            case 18:
                GUf.A00();
                long j19 = ClientInstruction.sMcfTypeId;
                if (j19 != 0) {
                    return j19;
                }
                long jNativeGetMcfTypeId19 = ClientInstruction.nativeGetMcfTypeId();
                ClientInstruction.sMcfTypeId = jNativeGetMcfTypeId19;
                return jNativeGetMcfTypeId19;
            case 19:
                GUf.A00();
                long j20 = CommandData.sMcfTypeId;
                if (j20 != 0) {
                    return j20;
                }
                long jNativeGetMcfTypeId20 = CommandData.nativeGetMcfTypeId();
                CommandData.sMcfTypeId = jNativeGetMcfTypeId20;
                return jNativeGetMcfTypeId20;
            case 20:
                GUf.A00();
                long j21 = CreatorBotClientReadyMessage.sMcfTypeId;
                if (j21 != 0) {
                    return j21;
                }
                long jNativeGetMcfTypeId21 = CreatorBotClientReadyMessage.nativeGetMcfTypeId();
                CreatorBotClientReadyMessage.sMcfTypeId = jNativeGetMcfTypeId21;
                return jNativeGetMcfTypeId21;
            case 21:
                GUf.A00();
                long j22 = DeepDiveDiscussedSubject.sMcfTypeId;
                if (j22 != 0) {
                    return j22;
                }
                long jNativeGetMcfTypeId22 = DeepDiveDiscussedSubject.nativeGetMcfTypeId();
                DeepDiveDiscussedSubject.sMcfTypeId = jNativeGetMcfTypeId22;
                return jNativeGetMcfTypeId22;
            case 22:
                GUf.A00();
                long j23 = DeepDiveDiscussedSubjectSource.sMcfTypeId;
                if (j23 != 0) {
                    return j23;
                }
                long jNativeGetMcfTypeId23 = DeepDiveDiscussedSubjectSource.nativeGetMcfTypeId();
                DeepDiveDiscussedSubjectSource.sMcfTypeId = jNativeGetMcfTypeId23;
                return jNativeGetMcfTypeId23;
            case 23:
                GUf.A00();
                long j24 = DeepDivePlaybackSection.sMcfTypeId;
                if (j24 != 0) {
                    return j24;
                }
                long jNativeGetMcfTypeId24 = DeepDivePlaybackSection.nativeGetMcfTypeId();
                DeepDivePlaybackSection.sMcfTypeId = jNativeGetMcfTypeId24;
                return jNativeGetMcfTypeId24;
            case 24:
                GUf.A00();
                long j25 = DeepDiveSnapshot.sMcfTypeId;
                if (j25 != 0) {
                    return j25;
                }
                long jNativeGetMcfTypeId25 = DeepDiveSnapshot.nativeGetMcfTypeId();
                DeepDiveSnapshot.sMcfTypeId = jNativeGetMcfTypeId25;
                return jNativeGetMcfTypeId25;
            case 25:
                GUf.A00();
                long j26 = DeepDiveState.sMcfTypeId;
                if (j26 != 0) {
                    return j26;
                }
                long jNativeGetMcfTypeId26 = DeepDiveState.nativeGetMcfTypeId();
                DeepDiveState.sMcfTypeId = jNativeGetMcfTypeId26;
                return jNativeGetMcfTypeId26;
            case 26:
                GUf.A00();
                long j27 = DeepDiveTopic.sMcfTypeId;
                if (j27 != 0) {
                    return j27;
                }
                long jNativeGetMcfTypeId27 = DeepDiveTopic.nativeGetMcfTypeId();
                DeepDiveTopic.sMcfTypeId = jNativeGetMcfTypeId27;
                return jNativeGetMcfTypeId27;
            case 27:
                GUf.A00();
                long j28 = GenAiBizAgentViewModel.sMcfTypeId;
                if (j28 != 0) {
                    return j28;
                }
                long jNativeGetMcfTypeId28 = GenAiBizAgentViewModel.nativeGetMcfTypeId();
                GenAiBizAgentViewModel.sMcfTypeId = jNativeGetMcfTypeId28;
                return jNativeGetMcfTypeId28;
            case 28:
                GUf.A00();
                long j29 = GenAiMediaStats.sMcfTypeId;
                if (j29 != 0) {
                    return j29;
                }
                long jNativeGetMcfTypeId29 = GenAiMediaStats.nativeGetMcfTypeId();
                GenAiMediaStats.sMcfTypeId = jNativeGetMcfTypeId29;
                return jNativeGetMcfTypeId29;
            case 29:
                GUf.A00();
                long j30 = GenAiTextPromptViewModel.sMcfTypeId;
                if (j30 != 0) {
                    return j30;
                }
                long jNativeGetMcfTypeId30 = GenAiTextPromptViewModel.nativeGetMcfTypeId();
                GenAiTextPromptViewModel.sMcfTypeId = jNativeGetMcfTypeId30;
                return jNativeGetMcfTypeId30;
            case 30:
                GUf.A00();
                long j31 = LiveAiConnectionState.sMcfTypeId;
                if (j31 != 0) {
                    return j31;
                }
                long jNativeGetMcfTypeId31 = LiveAiConnectionState.nativeGetMcfTypeId();
                LiveAiConnectionState.sMcfTypeId = jNativeGetMcfTypeId31;
                return jNativeGetMcfTypeId31;
            case 31:
                GUf.A00();
                long j32 = MediaUploadComplete.sMcfTypeId;
                if (j32 != 0) {
                    return j32;
                }
                long jNativeGetMcfTypeId32 = MediaUploadComplete.nativeGetMcfTypeId();
                MediaUploadComplete.sMcfTypeId = jNativeGetMcfTypeId32;
                return jNativeGetMcfTypeId32;
            case 32:
                GUf.A00();
                long j33 = MetaAiBotContent.sMcfTypeId;
                if (j33 != 0) {
                    return j33;
                }
                long jNativeGetMcfTypeId33 = MetaAiBotContent.nativeGetMcfTypeId();
                MetaAiBotContent.sMcfTypeId = jNativeGetMcfTypeId33;
                return jNativeGetMcfTypeId33;
            case 33:
                GUf.A00();
                long j34 = MetaAiCaption.sMcfTypeId;
                if (j34 != 0) {
                    return j34;
                }
                long jNativeGetMcfTypeId34 = MetaAiCaption.nativeGetMcfTypeId();
                MetaAiCaption.sMcfTypeId = jNativeGetMcfTypeId34;
                return jNativeGetMcfTypeId34;
            case 34:
                GUf.A00();
                long j35 = MetaAiConnectState.sMcfTypeId;
                if (j35 != 0) {
                    return j35;
                }
                long jNativeGetMcfTypeId35 = MetaAiConnectState.nativeGetMcfTypeId();
                MetaAiConnectState.sMcfTypeId = jNativeGetMcfTypeId35;
                return jNativeGetMcfTypeId35;
            case 35:
                long j36 = MetaAiMediaStatsProxy.CProxy.sMcfTypeId;
                if (j36 != 0) {
                    return j36;
                }
                long jNativeGetMcfTypeId36 = MetaAiMediaStatsProxy.CProxy.nativeGetMcfTypeId();
                MetaAiMediaStatsProxy.CProxy.sMcfTypeId = jNativeGetMcfTypeId36;
                return jNativeGetMcfTypeId36;
            case 36:
                GUf.A00();
                long j37 = MetaAiSessionInfo.sMcfTypeId;
                if (j37 != 0) {
                    return j37;
                }
                long jNativeGetMcfTypeId37 = MetaAiSessionInfo.nativeGetMcfTypeId();
                MetaAiSessionInfo.sMcfTypeId = jNativeGetMcfTypeId37;
                return jNativeGetMcfTypeId37;
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft /* 37 */:
                GUf.A00();
                long j38 = MetaAiState.sMcfTypeId;
                if (j38 != 0) {
                    return j38;
                }
                long jNativeGetMcfTypeId38 = MetaAiState.nativeGetMcfTypeId();
                MetaAiState.sMcfTypeId = jNativeGetMcfTypeId38;
                return jNativeGetMcfTypeId38;
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight /* 38 */:
                GUf.A00();
                long j39 = MetaAiToolCallCancel.sMcfTypeId;
                if (j39 != 0) {
                    return j39;
                }
                long jNativeGetMcfTypeId39 = MetaAiToolCallCancel.nativeGetMcfTypeId();
                MetaAiToolCallCancel.sMcfTypeId = jNativeGetMcfTypeId39;
                return jNativeGetMcfTypeId39;
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop /* 39 */:
                GUf.A00();
                long j40 = MetaAiToolCallRequest.sMcfTypeId;
                if (j40 != 0) {
                    return j40;
                }
                long jNativeGetMcfTypeId40 = MetaAiToolCallRequest.nativeGetMcfTypeId();
                MetaAiToolCallRequest.sMcfTypeId = jNativeGetMcfTypeId40;
                return jNativeGetMcfTypeId40;
            case 40:
                GUf.A00();
                long j41 = MetaAiUserContent.sMcfTypeId;
                if (j41 != 0) {
                    return j41;
                }
                long jNativeGetMcfTypeId41 = MetaAiUserContent.nativeGetMcfTypeId();
                MetaAiUserContent.sMcfTypeId = jNativeGetMcfTypeId41;
                return jNativeGetMcfTypeId41;
            case R.styleable.maplibre_MapView_maplibre_uiHorizontalScrollGestures /* 41 */:
                GUf.A00();
                long j42 = MetaAiVoiceCommand.sMcfTypeId;
                if (j42 != 0) {
                    return j42;
                }
                long jNativeGetMcfTypeId42 = MetaAiVoiceCommand.nativeGetMcfTypeId();
                MetaAiVoiceCommand.sMcfTypeId = jNativeGetMcfTypeId42;
                return jNativeGetMcfTypeId42;
            case 42:
                GUf.A00();
                long j43 = MetaAiVoiceState.sMcfTypeId;
                if (j43 != 0) {
                    return j43;
                }
                long jNativeGetMcfTypeId43 = MetaAiVoiceState.nativeGetMcfTypeId();
                MetaAiVoiceState.sMcfTypeId = jNativeGetMcfTypeId43;
                return jNativeGetMcfTypeId43;
            case R.styleable.maplibre_MapView_maplibre_uiLogoGravity /* 43 */:
                long j44 = MetaAiVoiceStateProxy.CProxy.sMcfTypeId;
                if (j44 != 0) {
                    return j44;
                }
                long jNativeGetMcfTypeId44 = MetaAiVoiceStateProxy.CProxy.nativeGetMcfTypeId();
                MetaAiVoiceStateProxy.CProxy.sMcfTypeId = jNativeGetMcfTypeId44;
                return jNativeGetMcfTypeId44;
            case 44:
                long j45 = MetaAiWearableAppEventsProxy.CProxy.sMcfTypeId;
                if (j45 != 0) {
                    return j45;
                }
                long jNativeGetMcfTypeId45 = MetaAiWearableAppEventsProxy.CProxy.nativeGetMcfTypeId();
                MetaAiWearableAppEventsProxy.CProxy.sMcfTypeId = jNativeGetMcfTypeId45;
                return jNativeGetMcfTypeId45;
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft /* 45 */:
                GUf.A00();
                long j46 = PromptData.sMcfTypeId;
                if (j46 != 0) {
                    return j46;
                }
                long jNativeGetMcfTypeId46 = PromptData.nativeGetMcfTypeId();
                PromptData.sMcfTypeId = jNativeGetMcfTypeId46;
                return jNativeGetMcfTypeId46;
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight /* 46 */:
                GUf.A00();
                long j47 = PsiToolQueryPlan.sMcfTypeId;
                if (j47 != 0) {
                    return j47;
                }
                long jNativeGetMcfTypeId47 = PsiToolQueryPlan.nativeGetMcfTypeId();
                PsiToolQueryPlan.sMcfTypeId = jNativeGetMcfTypeId47;
                return jNativeGetMcfTypeId47;
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop /* 47 */:
                GUf.A00();
                long j48 = PsiToolRequest.sMcfTypeId;
                if (j48 != 0) {
                    return j48;
                }
                long jNativeGetMcfTypeId48 = PsiToolRequest.nativeGetMcfTypeId();
                PsiToolRequest.sMcfTypeId = jNativeGetMcfTypeId48;
                return jNativeGetMcfTypeId48;
            case 48:
                GUf.A00();
                long j49 = RealtimeaiInternalDebugContent.sMcfTypeId;
                if (j49 != 0) {
                    return j49;
                }
                long jNativeGetMcfTypeId49 = RealtimeaiInternalDebugContent.nativeGetMcfTypeId();
                RealtimeaiInternalDebugContent.sMcfTypeId = jNativeGetMcfTypeId49;
                return jNativeGetMcfTypeId49;
            case R.styleable.maplibre_MapView_maplibre_uiRotateGestures /* 49 */:
                GUf.A00();
                long j50 = S2sConnectionState.sMcfTypeId;
                if (j50 != 0) {
                    return j50;
                }
                long jNativeGetMcfTypeId50 = S2sConnectionState.nativeGetMcfTypeId();
                S2sConnectionState.sMcfTypeId = jNativeGetMcfTypeId50;
                return jNativeGetMcfTypeId50;
            default:
                return 0L;
        }
    }
}
