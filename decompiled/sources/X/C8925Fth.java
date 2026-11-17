package X;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.datachannel.gen.DataTransport;
import com.facebook.rsys.devicestats.gen.DeviceStatsApi;
import com.facebook.rsys.devxagent.gen.CosmosOverrides;
import com.facebook.rsys.devxagent.gen.DevXAgentApi;
import com.facebook.rsys.devxagent.gen.DevXAgentAppError;
import com.facebook.rsys.devxagent.gen.DevXAgentAppProxy;
import com.facebook.rsys.devxagent.gen.DevXAgentCallStartParams;
import com.facebook.rsys.devxagent.gen.DevXAgentTextAiContentBlock;
import com.facebook.rsys.devxagent.gen.DevXAgentTextAiParams;
import com.facebook.rsys.devxagent.gen.DevXAgentTextAiProxy;
import com.facebook.rsys.devxagent.gen.DevXAgentTextAiResponse;
import com.facebook.rsys.devxagent.gen.DevXAgentTextAiResponseHandler;
import com.facebook.rsys.devxagent.gen.DevXAgentUploadImageResult;
import com.facebook.rsys.devxagent.gen.DevXAgentUploadImageResultHandler;
import com.facebook.rsys.devxagent.gen.DevxCallAdsContext;
import com.facebook.rsys.devxagent.gen.DevxDumpappAdapter;
import com.facebook.rsys.devxagent.gen.DevxLeadAdsContext;
import com.facebook.rsys.devxagent.gen.DumpappProxy;
import com.facebook.rsys.devxagent.gen.DumpappResult;
import com.facebook.rsys.devxagent.gen.VoiceAdContext;
import com.facebook.rsys.devxcallagent.gen.DevXAgentCallApi;
import com.facebook.rsys.devxcallagent.gen.DevXAgentCallConfig;
import com.facebook.rsys.dominantspeaker.gen.DominantSpeakerModel;
import com.facebook.rsys.ended.gen.EndedModel;
import com.facebook.rsys.ended.gen.ErrorMessageFallback;
import com.facebook.rsys.ended.gen.UnsupportedCapabilityFallbacks;
import com.facebook.rsys.ended.gen.VideoQuality;
import com.facebook.rsys.ended.gen.VideoStats;
import com.facebook.rsys.ended.gen.VoicemailInfo;
import com.facebook.rsys.environmentvariables.gen.EnvironmentVariablesProxy;
import com.facebook.rsys.execution.gen.Task;
import com.facebook.rsys.execution.gen.TaskExecutor;
import com.facebook.rsys.filelogging.gen.FileLogUploadCallbacks;
import com.facebook.rsys.filelogging.gen.FileLogUploadProxy;
import com.facebook.rsys.filelogging.gen.LargeLogUploadProxy;
import com.facebook.rsys.filelogging.gen.LogFile;
import com.facebook.rsys.filelogging.gen.LogFileData;
import com.facebook.rsys.filelogging.gen.LogFileStats;
import com.facebook.rsys.groupexpansion.gen.GroupExpansionCompletedCallback;
import com.facebook.rsys.groupexpansion.gen.GroupExpansionProxy;
import com.facebook.rsys.log.gen.CallSummaryInfo;
import com.facebook.rsys.log.gen.ConsoleLogMetadata;
import com.facebook.rsys.log.gen.LogApi;
import com.facebook.rsys.log.gen.LogModel;
import com.facebook.rsys.media.gen.StreamInfo;
import com.facebook.rsys.media.gen.UserStreamInfo;
import com.facebook.rsys.mediastats.gen.AudioLevelsCallback;
import com.facebook.rsys.mediastats.gen.DedicatedStunQualityStats;
import com.facebook.rsys.mediastats.gen.MediaStats;
import com.facebook.rsys.mediastats.gen.MediaStatsApi;
import org.maplibre.android.R;

/* renamed from: X.Fth, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8925Fth implements G50 {
    public final int $t;

    public C8925Fth(int i) {
        this.$t = i;
    }

    public static C8925Fth A00(int i) {
        return new C8925Fth(i);
    }

    @Override // X.G50
    public final /* bridge */ /* synthetic */ Object A7C(McfReference mcfReference) {
        switch (this.$t) {
            case 0:
                return DataTransport.CProxy.createFromMcfType(mcfReference);
            case 1:
                return DeviceStatsApi.CProxy.createFromMcfType(mcfReference);
            case 2:
                return CosmosOverrides.createFromMcfType(mcfReference);
            case 3:
                return DevXAgentApi.CProxy.createFromMcfType(mcfReference);
            case 4:
                GYi.A00();
                return DevXAgentAppError.createFromMcfType(mcfReference);
            case 5:
                return DevXAgentAppProxy.CProxy.createFromMcfType(mcfReference);
            case 6:
                return DevXAgentCallStartParams.createFromMcfType(mcfReference);
            case 7:
                return DevXAgentTextAiContentBlock.createFromMcfType(mcfReference);
            case 8:
                return DevXAgentTextAiParams.createFromMcfType(mcfReference);
            case 9:
                return DevXAgentTextAiProxy.CProxy.createFromMcfType(mcfReference);
            case 10:
                return DevXAgentTextAiResponse.createFromMcfType(mcfReference);
            case 11:
                return DevXAgentTextAiResponseHandler.CProxy.createFromMcfType(mcfReference);
            case 12:
                return DevXAgentUploadImageResult.createFromMcfType(mcfReference);
            case 13:
                return DevXAgentUploadImageResultHandler.CProxy.createFromMcfType(mcfReference);
            case 14:
                return DevxCallAdsContext.createFromMcfType(mcfReference);
            case 15:
                return DevxDumpappAdapter.CProxy.createFromMcfType(mcfReference);
            case 16:
                return DevxLeadAdsContext.createFromMcfType(mcfReference);
            case 17:
                return DumpappProxy.CProxy.createFromMcfType(mcfReference);
            case 18:
                return DumpappResult.createFromMcfType(mcfReference);
            case 19:
                return VoiceAdContext.createFromMcfType(mcfReference);
            case 20:
                return DevXAgentCallApi.CProxy.createFromMcfType(mcfReference);
            case 21:
                GYj.A00();
                return DevXAgentCallConfig.createFromMcfType(mcfReference);
            case 22:
                GUc.A00();
                return DominantSpeakerModel.createFromMcfType(mcfReference);
            case 23:
                GZ9.A00();
                return EndedModel.createFromMcfType(mcfReference);
            case 24:
                GZ9.A00();
                return ErrorMessageFallback.createFromMcfType(mcfReference);
            case 25:
                GZ9.A00();
                return UnsupportedCapabilityFallbacks.createFromMcfType(mcfReference);
            case 26:
                GZ9.A00();
                return VideoQuality.createFromMcfType(mcfReference);
            case 27:
                GZ9.A00();
                return VideoStats.createFromMcfType(mcfReference);
            case 28:
                GZ9.A00();
                return VoicemailInfo.createFromMcfType(mcfReference);
            case 29:
                return EnvironmentVariablesProxy.CProxy.createFromMcfType(mcfReference);
            case 30:
                return Task.CProxy.createFromMcfType(mcfReference);
            case 31:
                return TaskExecutor.CProxy.createFromMcfType(mcfReference);
            case 32:
                return FileLogUploadCallbacks.CProxy.createFromMcfType(mcfReference);
            case 33:
                return FileLogUploadProxy.CProxy.createFromMcfType(mcfReference);
            case 34:
                return LargeLogUploadProxy.CProxy.createFromMcfType(mcfReference);
            case 35:
                return LogFile.CProxy.createFromMcfType(mcfReference);
            case 36:
                GX3.A00();
                return LogFileData.createFromMcfType(mcfReference);
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft /* 37 */:
                GX3.A00();
                return LogFileStats.createFromMcfType(mcfReference);
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight /* 38 */:
                return GroupExpansionCompletedCallback.CProxy.createFromMcfType(mcfReference);
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop /* 39 */:
                return GroupExpansionProxy.CProxy.createFromMcfType(mcfReference);
            case 40:
                GZ3.A00();
                return CallSummaryInfo.createFromMcfType(mcfReference);
            case R.styleable.maplibre_MapView_maplibre_uiHorizontalScrollGestures /* 41 */:
                return ConsoleLogMetadata.createFromMcfType(mcfReference);
            case 42:
                return LogApi.CProxy.createFromMcfType(mcfReference);
            case R.styleable.maplibre_MapView_maplibre_uiLogoGravity /* 43 */:
                GZ3.A00();
                return LogModel.createFromMcfType(mcfReference);
            case 44:
                GYk.A00();
                return StreamInfo.createFromMcfType(mcfReference);
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft /* 45 */:
                GYk.A00();
                return UserStreamInfo.createFromMcfType(mcfReference);
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight /* 46 */:
                return AudioLevelsCallback.CProxy.createFromMcfType(mcfReference);
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop /* 47 */:
                GUd.A00();
                return DedicatedStunQualityStats.createFromMcfType(mcfReference);
            case 48:
                GUd.A00();
                return MediaStats.createFromMcfType(mcfReference);
            case R.styleable.maplibre_MapView_maplibre_uiRotateGestures /* 49 */:
                return MediaStatsApi.CProxy.createFromMcfType(mcfReference);
            default:
                return null;
        }
    }

    @Override // X.G50
    public final Class<DataTransport> AHp() {
        switch (this.$t) {
            case 0:
                return DataTransport.class;
            case 1:
                return DeviceStatsApi.class;
            case 2:
                return CosmosOverrides.class;
            case 3:
                return DevXAgentApi.class;
            case 4:
                return DevXAgentAppError.class;
            case 5:
                return DevXAgentAppProxy.class;
            case 6:
                return DevXAgentCallStartParams.class;
            case 7:
                return DevXAgentTextAiContentBlock.class;
            case 8:
                return DevXAgentTextAiParams.class;
            case 9:
                return DevXAgentTextAiProxy.class;
            case 10:
                return DevXAgentTextAiResponse.class;
            case 11:
                return DevXAgentTextAiResponseHandler.class;
            case 12:
                return DevXAgentUploadImageResult.class;
            case 13:
                return DevXAgentUploadImageResultHandler.class;
            case 14:
                return DevxCallAdsContext.class;
            case 15:
                return DevxDumpappAdapter.class;
            case 16:
                return DevxLeadAdsContext.class;
            case 17:
                return DumpappProxy.class;
            case 18:
                return DumpappResult.class;
            case 19:
                return VoiceAdContext.class;
            case 20:
                return DevXAgentCallApi.class;
            case 21:
                return DevXAgentCallConfig.class;
            case 22:
                return DominantSpeakerModel.class;
            case 23:
                return EndedModel.class;
            case 24:
                return ErrorMessageFallback.class;
            case 25:
                return UnsupportedCapabilityFallbacks.class;
            case 26:
                return VideoQuality.class;
            case 27:
                return VideoStats.class;
            case 28:
                return VoicemailInfo.class;
            case 29:
                return EnvironmentVariablesProxy.class;
            case 30:
                return Task.class;
            case 31:
                return TaskExecutor.class;
            case 32:
                return FileLogUploadCallbacks.class;
            case 33:
                return FileLogUploadProxy.class;
            case 34:
                return LargeLogUploadProxy.class;
            case 35:
                return LogFile.class;
            case 36:
                return LogFileData.class;
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft /* 37 */:
                return LogFileStats.class;
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight /* 38 */:
                return GroupExpansionCompletedCallback.class;
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop /* 39 */:
                return GroupExpansionProxy.class;
            case 40:
                return CallSummaryInfo.class;
            case R.styleable.maplibre_MapView_maplibre_uiHorizontalScrollGestures /* 41 */:
                return ConsoleLogMetadata.class;
            case 42:
                return LogApi.class;
            case R.styleable.maplibre_MapView_maplibre_uiLogoGravity /* 43 */:
                return LogModel.class;
            case 44:
                return StreamInfo.class;
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft /* 45 */:
                return UserStreamInfo.class;
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight /* 46 */:
                return AudioLevelsCallback.class;
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop /* 47 */:
                return DedicatedStunQualityStats.class;
            case 48:
                return MediaStats.class;
            case R.styleable.maplibre_MapView_maplibre_uiRotateGestures /* 49 */:
                return MediaStatsApi.class;
            default:
                return null;
        }
    }

    @Override // X.G50
    public final long AMC() {
        switch (this.$t) {
            case 0:
                long j = DataTransport.CProxy.sMcfTypeId;
                if (j != 0) {
                    return j;
                }
                long jNativeGetMcfTypeId = DataTransport.CProxy.nativeGetMcfTypeId();
                DataTransport.CProxy.sMcfTypeId = jNativeGetMcfTypeId;
                return jNativeGetMcfTypeId;
            case 1:
                long j2 = DeviceStatsApi.CProxy.sMcfTypeId;
                if (j2 != 0) {
                    return j2;
                }
                long jNativeGetMcfTypeId2 = DeviceStatsApi.CProxy.nativeGetMcfTypeId();
                DeviceStatsApi.CProxy.sMcfTypeId = jNativeGetMcfTypeId2;
                return jNativeGetMcfTypeId2;
            case 2:
                long j3 = CosmosOverrides.sMcfTypeId;
                if (j3 != 0) {
                    return j3;
                }
                long jNativeGetMcfTypeId3 = CosmosOverrides.nativeGetMcfTypeId();
                CosmosOverrides.sMcfTypeId = jNativeGetMcfTypeId3;
                return jNativeGetMcfTypeId3;
            case 3:
                long j4 = DevXAgentApi.CProxy.sMcfTypeId;
                if (j4 != 0) {
                    return j4;
                }
                long jNativeGetMcfTypeId4 = DevXAgentApi.CProxy.nativeGetMcfTypeId();
                DevXAgentApi.CProxy.sMcfTypeId = jNativeGetMcfTypeId4;
                return jNativeGetMcfTypeId4;
            case 4:
                GYi.A00();
                long j5 = DevXAgentAppError.sMcfTypeId;
                if (j5 != 0) {
                    return j5;
                }
                long jNativeGetMcfTypeId5 = DevXAgentAppError.nativeGetMcfTypeId();
                DevXAgentAppError.sMcfTypeId = jNativeGetMcfTypeId5;
                return jNativeGetMcfTypeId5;
            case 5:
                long j6 = DevXAgentAppProxy.CProxy.sMcfTypeId;
                if (j6 != 0) {
                    return j6;
                }
                long jNativeGetMcfTypeId6 = DevXAgentAppProxy.CProxy.nativeGetMcfTypeId();
                DevXAgentAppProxy.CProxy.sMcfTypeId = jNativeGetMcfTypeId6;
                return jNativeGetMcfTypeId6;
            case 6:
                long j7 = DevXAgentCallStartParams.sMcfTypeId;
                if (j7 != 0) {
                    return j7;
                }
                long jNativeGetMcfTypeId7 = DevXAgentCallStartParams.nativeGetMcfTypeId();
                DevXAgentCallStartParams.sMcfTypeId = jNativeGetMcfTypeId7;
                return jNativeGetMcfTypeId7;
            case 7:
                long j8 = DevXAgentTextAiContentBlock.sMcfTypeId;
                if (j8 != 0) {
                    return j8;
                }
                long jNativeGetMcfTypeId8 = DevXAgentTextAiContentBlock.nativeGetMcfTypeId();
                DevXAgentTextAiContentBlock.sMcfTypeId = jNativeGetMcfTypeId8;
                return jNativeGetMcfTypeId8;
            case 8:
                long j9 = DevXAgentTextAiParams.sMcfTypeId;
                if (j9 != 0) {
                    return j9;
                }
                long jNativeGetMcfTypeId9 = DevXAgentTextAiParams.nativeGetMcfTypeId();
                DevXAgentTextAiParams.sMcfTypeId = jNativeGetMcfTypeId9;
                return jNativeGetMcfTypeId9;
            case 9:
                long j10 = DevXAgentTextAiProxy.CProxy.sMcfTypeId;
                if (j10 != 0) {
                    return j10;
                }
                long jNativeGetMcfTypeId10 = DevXAgentTextAiProxy.CProxy.nativeGetMcfTypeId();
                DevXAgentTextAiProxy.CProxy.sMcfTypeId = jNativeGetMcfTypeId10;
                return jNativeGetMcfTypeId10;
            case 10:
                long j11 = DevXAgentTextAiResponse.sMcfTypeId;
                if (j11 != 0) {
                    return j11;
                }
                long jNativeGetMcfTypeId11 = DevXAgentTextAiResponse.nativeGetMcfTypeId();
                DevXAgentTextAiResponse.sMcfTypeId = jNativeGetMcfTypeId11;
                return jNativeGetMcfTypeId11;
            case 11:
                long j12 = DevXAgentTextAiResponseHandler.CProxy.sMcfTypeId;
                if (j12 != 0) {
                    return j12;
                }
                long jNativeGetMcfTypeId12 = DevXAgentTextAiResponseHandler.CProxy.nativeGetMcfTypeId();
                DevXAgentTextAiResponseHandler.CProxy.sMcfTypeId = jNativeGetMcfTypeId12;
                return jNativeGetMcfTypeId12;
            case 12:
                long j13 = DevXAgentUploadImageResult.sMcfTypeId;
                if (j13 != 0) {
                    return j13;
                }
                long jNativeGetMcfTypeId13 = DevXAgentUploadImageResult.nativeGetMcfTypeId();
                DevXAgentUploadImageResult.sMcfTypeId = jNativeGetMcfTypeId13;
                return jNativeGetMcfTypeId13;
            case 13:
                long j14 = DevXAgentUploadImageResultHandler.CProxy.sMcfTypeId;
                if (j14 != 0) {
                    return j14;
                }
                long jNativeGetMcfTypeId14 = DevXAgentUploadImageResultHandler.CProxy.nativeGetMcfTypeId();
                DevXAgentUploadImageResultHandler.CProxy.sMcfTypeId = jNativeGetMcfTypeId14;
                return jNativeGetMcfTypeId14;
            case 14:
                long j15 = DevxCallAdsContext.sMcfTypeId;
                if (j15 != 0) {
                    return j15;
                }
                long jNativeGetMcfTypeId15 = DevxCallAdsContext.nativeGetMcfTypeId();
                DevxCallAdsContext.sMcfTypeId = jNativeGetMcfTypeId15;
                return jNativeGetMcfTypeId15;
            case 15:
                long j16 = DevxDumpappAdapter.CProxy.sMcfTypeId;
                if (j16 != 0) {
                    return j16;
                }
                long jNativeGetMcfTypeId16 = DevxDumpappAdapter.CProxy.nativeGetMcfTypeId();
                DevxDumpappAdapter.CProxy.sMcfTypeId = jNativeGetMcfTypeId16;
                return jNativeGetMcfTypeId16;
            case 16:
                long j17 = DevxLeadAdsContext.sMcfTypeId;
                if (j17 != 0) {
                    return j17;
                }
                long jNativeGetMcfTypeId17 = DevxLeadAdsContext.nativeGetMcfTypeId();
                DevxLeadAdsContext.sMcfTypeId = jNativeGetMcfTypeId17;
                return jNativeGetMcfTypeId17;
            case 17:
                long j18 = DumpappProxy.CProxy.sMcfTypeId;
                if (j18 != 0) {
                    return j18;
                }
                long jNativeGetMcfTypeId18 = DumpappProxy.CProxy.nativeGetMcfTypeId();
                DumpappProxy.CProxy.sMcfTypeId = jNativeGetMcfTypeId18;
                return jNativeGetMcfTypeId18;
            case 18:
                long j19 = DumpappResult.sMcfTypeId;
                if (j19 != 0) {
                    return j19;
                }
                long jNativeGetMcfTypeId19 = DumpappResult.nativeGetMcfTypeId();
                DumpappResult.sMcfTypeId = jNativeGetMcfTypeId19;
                return jNativeGetMcfTypeId19;
            case 19:
                long j20 = VoiceAdContext.sMcfTypeId;
                if (j20 != 0) {
                    return j20;
                }
                long jNativeGetMcfTypeId20 = VoiceAdContext.nativeGetMcfTypeId();
                VoiceAdContext.sMcfTypeId = jNativeGetMcfTypeId20;
                return jNativeGetMcfTypeId20;
            case 20:
                long j21 = DevXAgentCallApi.CProxy.sMcfTypeId;
                if (j21 != 0) {
                    return j21;
                }
                long jNativeGetMcfTypeId21 = DevXAgentCallApi.CProxy.nativeGetMcfTypeId();
                DevXAgentCallApi.CProxy.sMcfTypeId = jNativeGetMcfTypeId21;
                return jNativeGetMcfTypeId21;
            case 21:
                GYj.A00();
                long j22 = DevXAgentCallConfig.sMcfTypeId;
                if (j22 != 0) {
                    return j22;
                }
                long jNativeGetMcfTypeId22 = DevXAgentCallConfig.nativeGetMcfTypeId();
                DevXAgentCallConfig.sMcfTypeId = jNativeGetMcfTypeId22;
                return jNativeGetMcfTypeId22;
            case 22:
                GUc.A00();
                long j23 = DominantSpeakerModel.sMcfTypeId;
                if (j23 != 0) {
                    return j23;
                }
                long jNativeGetMcfTypeId23 = DominantSpeakerModel.nativeGetMcfTypeId();
                DominantSpeakerModel.sMcfTypeId = jNativeGetMcfTypeId23;
                return jNativeGetMcfTypeId23;
            case 23:
                GZ9.A00();
                long j24 = EndedModel.sMcfTypeId;
                if (j24 != 0) {
                    return j24;
                }
                long jNativeGetMcfTypeId24 = EndedModel.nativeGetMcfTypeId();
                EndedModel.sMcfTypeId = jNativeGetMcfTypeId24;
                return jNativeGetMcfTypeId24;
            case 24:
                GZ9.A00();
                long j25 = ErrorMessageFallback.sMcfTypeId;
                if (j25 != 0) {
                    return j25;
                }
                long jNativeGetMcfTypeId25 = ErrorMessageFallback.nativeGetMcfTypeId();
                ErrorMessageFallback.sMcfTypeId = jNativeGetMcfTypeId25;
                return jNativeGetMcfTypeId25;
            case 25:
                GZ9.A00();
                long j26 = UnsupportedCapabilityFallbacks.sMcfTypeId;
                if (j26 != 0) {
                    return j26;
                }
                long jNativeGetMcfTypeId26 = UnsupportedCapabilityFallbacks.nativeGetMcfTypeId();
                UnsupportedCapabilityFallbacks.sMcfTypeId = jNativeGetMcfTypeId26;
                return jNativeGetMcfTypeId26;
            case 26:
                GZ9.A00();
                long j27 = VideoQuality.sMcfTypeId;
                if (j27 != 0) {
                    return j27;
                }
                long jNativeGetMcfTypeId27 = VideoQuality.nativeGetMcfTypeId();
                VideoQuality.sMcfTypeId = jNativeGetMcfTypeId27;
                return jNativeGetMcfTypeId27;
            case 27:
                GZ9.A00();
                long j28 = VideoStats.sMcfTypeId;
                if (j28 != 0) {
                    return j28;
                }
                long jNativeGetMcfTypeId28 = VideoStats.nativeGetMcfTypeId();
                VideoStats.sMcfTypeId = jNativeGetMcfTypeId28;
                return jNativeGetMcfTypeId28;
            case 28:
                GZ9.A00();
                long j29 = VoicemailInfo.sMcfTypeId;
                if (j29 != 0) {
                    return j29;
                }
                long jNativeGetMcfTypeId29 = VoicemailInfo.nativeGetMcfTypeId();
                VoicemailInfo.sMcfTypeId = jNativeGetMcfTypeId29;
                return jNativeGetMcfTypeId29;
            case 29:
                long j30 = EnvironmentVariablesProxy.CProxy.sMcfTypeId;
                if (j30 != 0) {
                    return j30;
                }
                long jNativeGetMcfTypeId30 = EnvironmentVariablesProxy.CProxy.nativeGetMcfTypeId();
                EnvironmentVariablesProxy.CProxy.sMcfTypeId = jNativeGetMcfTypeId30;
                return jNativeGetMcfTypeId30;
            case 30:
                long j31 = Task.CProxy.sMcfTypeId;
                if (j31 != 0) {
                    return j31;
                }
                long jNativeGetMcfTypeId31 = Task.CProxy.nativeGetMcfTypeId();
                Task.CProxy.sMcfTypeId = jNativeGetMcfTypeId31;
                return jNativeGetMcfTypeId31;
            case 31:
                long j32 = TaskExecutor.CProxy.sMcfTypeId;
                if (j32 != 0) {
                    return j32;
                }
                long jNativeGetMcfTypeId32 = TaskExecutor.CProxy.nativeGetMcfTypeId();
                TaskExecutor.CProxy.sMcfTypeId = jNativeGetMcfTypeId32;
                return jNativeGetMcfTypeId32;
            case 32:
                long j33 = FileLogUploadCallbacks.CProxy.sMcfTypeId;
                if (j33 != 0) {
                    return j33;
                }
                long jNativeGetMcfTypeId33 = FileLogUploadCallbacks.CProxy.nativeGetMcfTypeId();
                FileLogUploadCallbacks.CProxy.sMcfTypeId = jNativeGetMcfTypeId33;
                return jNativeGetMcfTypeId33;
            case 33:
                long j34 = FileLogUploadProxy.CProxy.sMcfTypeId;
                if (j34 != 0) {
                    return j34;
                }
                long jNativeGetMcfTypeId34 = FileLogUploadProxy.CProxy.nativeGetMcfTypeId();
                FileLogUploadProxy.CProxy.sMcfTypeId = jNativeGetMcfTypeId34;
                return jNativeGetMcfTypeId34;
            case 34:
                long j35 = LargeLogUploadProxy.CProxy.sMcfTypeId;
                if (j35 != 0) {
                    return j35;
                }
                long jNativeGetMcfTypeId35 = LargeLogUploadProxy.CProxy.nativeGetMcfTypeId();
                LargeLogUploadProxy.CProxy.sMcfTypeId = jNativeGetMcfTypeId35;
                return jNativeGetMcfTypeId35;
            case 35:
                long j36 = LogFile.CProxy.sMcfTypeId;
                if (j36 != 0) {
                    return j36;
                }
                long jNativeGetMcfTypeId36 = LogFile.CProxy.nativeGetMcfTypeId();
                LogFile.CProxy.sMcfTypeId = jNativeGetMcfTypeId36;
                return jNativeGetMcfTypeId36;
            case 36:
                GX3.A00();
                long j37 = LogFileData.sMcfTypeId;
                if (j37 != 0) {
                    return j37;
                }
                long jNativeGetMcfTypeId37 = LogFileData.nativeGetMcfTypeId();
                LogFileData.sMcfTypeId = jNativeGetMcfTypeId37;
                return jNativeGetMcfTypeId37;
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft /* 37 */:
                GX3.A00();
                long j38 = LogFileStats.sMcfTypeId;
                if (j38 != 0) {
                    return j38;
                }
                long jNativeGetMcfTypeId38 = LogFileStats.nativeGetMcfTypeId();
                LogFileStats.sMcfTypeId = jNativeGetMcfTypeId38;
                return jNativeGetMcfTypeId38;
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight /* 38 */:
                long j39 = GroupExpansionCompletedCallback.CProxy.sMcfTypeId;
                if (j39 != 0) {
                    return j39;
                }
                long jNativeGetMcfTypeId39 = GroupExpansionCompletedCallback.CProxy.nativeGetMcfTypeId();
                GroupExpansionCompletedCallback.CProxy.sMcfTypeId = jNativeGetMcfTypeId39;
                return jNativeGetMcfTypeId39;
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop /* 39 */:
                long j40 = GroupExpansionProxy.CProxy.sMcfTypeId;
                if (j40 != 0) {
                    return j40;
                }
                long jNativeGetMcfTypeId40 = GroupExpansionProxy.CProxy.nativeGetMcfTypeId();
                GroupExpansionProxy.CProxy.sMcfTypeId = jNativeGetMcfTypeId40;
                return jNativeGetMcfTypeId40;
            case 40:
                GZ3.A00();
                long j41 = CallSummaryInfo.sMcfTypeId;
                if (j41 != 0) {
                    return j41;
                }
                long jNativeGetMcfTypeId41 = CallSummaryInfo.nativeGetMcfTypeId();
                CallSummaryInfo.sMcfTypeId = jNativeGetMcfTypeId41;
                return jNativeGetMcfTypeId41;
            case R.styleable.maplibre_MapView_maplibre_uiHorizontalScrollGestures /* 41 */:
                long j42 = ConsoleLogMetadata.sMcfTypeId;
                if (j42 != 0) {
                    return j42;
                }
                long jNativeGetMcfTypeId42 = ConsoleLogMetadata.nativeGetMcfTypeId();
                ConsoleLogMetadata.sMcfTypeId = jNativeGetMcfTypeId42;
                return jNativeGetMcfTypeId42;
            case 42:
                long j43 = LogApi.CProxy.sMcfTypeId;
                if (j43 != 0) {
                    return j43;
                }
                long jNativeGetMcfTypeId43 = LogApi.CProxy.nativeGetMcfTypeId();
                LogApi.CProxy.sMcfTypeId = jNativeGetMcfTypeId43;
                return jNativeGetMcfTypeId43;
            case R.styleable.maplibre_MapView_maplibre_uiLogoGravity /* 43 */:
                GZ3.A00();
                long j44 = LogModel.sMcfTypeId;
                if (j44 != 0) {
                    return j44;
                }
                long jNativeGetMcfTypeId44 = LogModel.nativeGetMcfTypeId();
                LogModel.sMcfTypeId = jNativeGetMcfTypeId44;
                return jNativeGetMcfTypeId44;
            case 44:
                GYk.A00();
                long j45 = StreamInfo.sMcfTypeId;
                if (j45 != 0) {
                    return j45;
                }
                long jNativeGetMcfTypeId45 = StreamInfo.nativeGetMcfTypeId();
                StreamInfo.sMcfTypeId = jNativeGetMcfTypeId45;
                return jNativeGetMcfTypeId45;
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft /* 45 */:
                GYk.A00();
                long j46 = UserStreamInfo.sMcfTypeId;
                if (j46 != 0) {
                    return j46;
                }
                long jNativeGetMcfTypeId46 = UserStreamInfo.nativeGetMcfTypeId();
                UserStreamInfo.sMcfTypeId = jNativeGetMcfTypeId46;
                return jNativeGetMcfTypeId46;
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight /* 46 */:
                long j47 = AudioLevelsCallback.CProxy.sMcfTypeId;
                if (j47 != 0) {
                    return j47;
                }
                long jNativeGetMcfTypeId47 = AudioLevelsCallback.CProxy.nativeGetMcfTypeId();
                AudioLevelsCallback.CProxy.sMcfTypeId = jNativeGetMcfTypeId47;
                return jNativeGetMcfTypeId47;
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop /* 47 */:
                GUd.A00();
                long j48 = DedicatedStunQualityStats.sMcfTypeId;
                if (j48 != 0) {
                    return j48;
                }
                long jNativeGetMcfTypeId48 = DedicatedStunQualityStats.nativeGetMcfTypeId();
                DedicatedStunQualityStats.sMcfTypeId = jNativeGetMcfTypeId48;
                return jNativeGetMcfTypeId48;
            case 48:
                GUd.A00();
                long j49 = MediaStats.sMcfTypeId;
                if (j49 != 0) {
                    return j49;
                }
                long jNativeGetMcfTypeId49 = MediaStats.nativeGetMcfTypeId();
                MediaStats.sMcfTypeId = jNativeGetMcfTypeId49;
                return jNativeGetMcfTypeId49;
            case R.styleable.maplibre_MapView_maplibre_uiRotateGestures /* 49 */:
                long j50 = MediaStatsApi.CProxy.sMcfTypeId;
                if (j50 != 0) {
                    return j50;
                }
                long jNativeGetMcfTypeId50 = MediaStatsApi.CProxy.nativeGetMcfTypeId();
                MediaStatsApi.CProxy.sMcfTypeId = jNativeGetMcfTypeId50;
                return jNativeGetMcfTypeId50;
            default:
                return 0L;
        }
    }
}
