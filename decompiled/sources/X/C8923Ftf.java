package X;

import com.facebook.djinni.mcf.exception.Exception;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.ai.gen.AiSessionCreateResult;
import com.facebook.rsys.ai.gen.ClientToolDefinition;
import com.facebook.rsys.ai.gen.ConversationStarterPrompt;
import com.facebook.rsys.ai.gen.DatingParams;
import com.facebook.rsys.ai.gen.GpsLocation;
import com.facebook.rsys.ai.gen.GraphqlQueryContext;
import com.facebook.rsys.ai.gen.GraphqlQueryOptions;
import com.facebook.rsys.ai.gen.InputSchema;
import com.facebook.rsys.ai.gen.MobiusParams;
import com.facebook.rsys.ai.gen.ModelOverrides;
import com.facebook.rsys.ai.gen.OptionalParams;
import com.facebook.rsys.ai.gen.ProactiveVoicePrompt;
import com.facebook.rsys.ai.gen.SelectedEmbodimentParams;
import com.facebook.rsys.ai.gen.VideoContext;
import com.facebook.rsys.ai.gen.WaveformsSession;
import com.facebook.rsys.ai.gen.WwwHostOverride;
import com.facebook.rsys.appdrivenaudio.gen.AppDrivenAudioDevice;
import com.facebook.rsys.appdrivenaudio.gen.AppDrivenAudioDeviceConfig;
import com.facebook.rsys.appdrivenaudio.gen.AppDrivenAudioPcmSink;
import com.facebook.rsys.appdrivenaudio.gen.AppDrivenAudioTask;
import com.facebook.rsys.appdrivenaudio.gen.AppDrivenAudioTransport;
import com.facebook.rsys.appdrivenaudio.gen.AudioStateManagerListener;
import com.facebook.rsys.appdrivenaudio.gen.AudioStateManagerProxy;
import com.facebook.rsys.appdrivenaudio.gen.AudioStateManagerTaskRunner;
import com.facebook.rsys.appinfo.gen.AppInfo;
import com.facebook.rsys.appstate.gen.AppstateApi;
import com.facebook.rsys.appstate.gen.AppstateModel;
import com.facebook.rsys.audio.frame.gen.AudioFrame;
import com.facebook.rsys.audio.frame.gen.AudioFrameDetails;
import com.facebook.rsys.audio.frame.gen.AudioFrameMetadata;
import com.facebook.rsys.audio.frame.gen.AudioTtsMetadata;
import com.facebook.rsys.audio.frame.gen.TtsSpeechChunk;
import com.facebook.rsys.audio.gen.AudioApi;
import com.facebook.rsys.audio.gen.AudioDeviceApi;
import com.facebook.rsys.audio.gen.AudioDeviceModule;
import com.facebook.rsys.audio.gen.AudioEncodedPacket;
import com.facebook.rsys.audio.gen.AudioInputRoute;
import com.facebook.rsys.audio.gen.AudioMetrics;
import com.facebook.rsys.audio.gen.AudioModel;
import com.facebook.rsys.audio.gen.AudioOutputRoute;
import com.facebook.rsys.audio.gen.AudioProxy;
import com.facebook.rsys.audio.gen.AudioSource;
import com.facebook.rsys.audio.gen.AudioSourceSink;
import com.facebook.rsys.audio.gen.AudioStream;
import com.facebook.rsys.audio.gen.AudioStreamSource;
import com.facebook.rsys.audio.gen.AudioVadMetadata;
import com.facebook.rsys.audio.gen.EnableAudioParameters;
import com.facebook.rsys.audio.gen.PlaybackVolumeParameters;
import com.facebook.rsys.audiodevicestate.gen.AudioDeviceContext;
import org.maplibre.android.R;

/* renamed from: X.Ftf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8923Ftf implements G50 {
    public final int $t;

    public C8923Ftf(int i) {
        this.$t = i;
    }

    public static C8923Ftf A00(int i) {
        return new C8923Ftf(i);
    }

    @Override // X.G50
    public final /* bridge */ /* synthetic */ Object A7C(McfReference mcfReference) {
        switch (this.$t) {
            case 0:
                return Exception.createFromMcfType(mcfReference);
            case 1:
                GUV.A00();
                return AiSessionCreateResult.createFromMcfType(mcfReference);
            case 2:
                GUV.A00();
                return ClientToolDefinition.createFromMcfType(mcfReference);
            case 3:
                GUV.A00();
                return ConversationStarterPrompt.createFromMcfType(mcfReference);
            case 4:
                GUV.A00();
                return DatingParams.createFromMcfType(mcfReference);
            case 5:
                GUV.A00();
                return GpsLocation.createFromMcfType(mcfReference);
            case 6:
                GUV.A00();
                return GraphqlQueryContext.createFromMcfType(mcfReference);
            case 7:
                GUV.A00();
                return GraphqlQueryOptions.createFromMcfType(mcfReference);
            case 8:
                GUV.A00();
                return InputSchema.createFromMcfType(mcfReference);
            case 9:
                GUV.A00();
                return MobiusParams.createFromMcfType(mcfReference);
            case 10:
                GUV.A00();
                return ModelOverrides.createFromMcfType(mcfReference);
            case 11:
                GUV.A00();
                return OptionalParams.createFromMcfType(mcfReference);
            case 12:
                GUV.A00();
                return ProactiveVoicePrompt.createFromMcfType(mcfReference);
            case 13:
                GUV.A00();
                return SelectedEmbodimentParams.createFromMcfType(mcfReference);
            case 14:
                GUV.A00();
                return VideoContext.createFromMcfType(mcfReference);
            case 15:
                GUV.A00();
                return WaveformsSession.createFromMcfType(mcfReference);
            case 16:
                GUV.A00();
                return WwwHostOverride.createFromMcfType(mcfReference);
            case 17:
                return AppDrivenAudioDevice.CProxy.createFromMcfType(mcfReference);
            case 18:
                GUW.A00();
                return AppDrivenAudioDeviceConfig.createFromMcfType(mcfReference);
            case 19:
                return AppDrivenAudioPcmSink.CProxy.createFromMcfType(mcfReference);
            case 20:
                return AppDrivenAudioTask.CProxy.createFromMcfType(mcfReference);
            case 21:
                return AppDrivenAudioTransport.CProxy.createFromMcfType(mcfReference);
            case 22:
                return AudioStateManagerListener.CProxy.createFromMcfType(mcfReference);
            case 23:
                return AudioStateManagerProxy.CProxy.createFromMcfType(mcfReference);
            case 24:
                return AudioStateManagerTaskRunner.CProxy.createFromMcfType(mcfReference);
            case 25:
                GUt.A00();
                return AppInfo.createFromMcfType(mcfReference);
            case 26:
                return AppstateApi.CProxy.createFromMcfType(mcfReference);
            case 27:
                GVb.A00();
                return AppstateModel.createFromMcfType(mcfReference);
            case 28:
                return AudioFrame.CProxy.createFromMcfType(mcfReference);
            case 29:
                return AudioFrameDetails.createFromMcfType(mcfReference);
            case 30:
                return AudioFrameMetadata.createFromMcfType(mcfReference);
            case 31:
                return AudioTtsMetadata.createFromMcfType(mcfReference);
            case 32:
                return TtsSpeechChunk.createFromMcfType(mcfReference);
            case 33:
                return AudioApi.CProxy.createFromMcfType(mcfReference);
            case 34:
                return AudioDeviceApi.CProxy.createFromMcfType(mcfReference);
            case 35:
                return AudioDeviceModule.CProxy.createFromMcfType(mcfReference);
            case 36:
                return AudioEncodedPacket.createFromMcfType(mcfReference);
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft /* 37 */:
                GUX.A00();
                return AudioInputRoute.createFromMcfType(mcfReference);
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight /* 38 */:
                return AudioMetrics.createFromMcfType(mcfReference);
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop /* 39 */:
                GUX.A00();
                return AudioModel.createFromMcfType(mcfReference);
            case 40:
                GUX.A00();
                return AudioOutputRoute.createFromMcfType(mcfReference);
            case R.styleable.maplibre_MapView_maplibre_uiHorizontalScrollGestures /* 41 */:
                return AudioProxy.CProxy.createFromMcfType(mcfReference);
            case 42:
                return AudioSource.CProxy.createFromMcfType(mcfReference);
            case R.styleable.maplibre_MapView_maplibre_uiLogoGravity /* 43 */:
                return AudioSourceSink.CProxy.createFromMcfType(mcfReference);
            case 44:
                GUX.A00();
                return AudioStream.createFromMcfType(mcfReference);
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft /* 45 */:
                return AudioStreamSource.CProxy.createFromMcfType(mcfReference);
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight /* 46 */:
                return AudioVadMetadata.createFromMcfType(mcfReference);
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop /* 47 */:
                GUX.A00();
                return EnableAudioParameters.createFromMcfType(mcfReference);
            case 48:
                GUX.A00();
                return PlaybackVolumeParameters.createFromMcfType(mcfReference);
            case R.styleable.maplibre_MapView_maplibre_uiRotateGestures /* 49 */:
                GXw.A00();
                return AudioDeviceContext.createFromMcfType(mcfReference);
            default:
                return null;
        }
    }

    @Override // X.G50
    public final Class<Exception> AHp() {
        switch (this.$t) {
            case 0:
                return Exception.class;
            case 1:
                return AiSessionCreateResult.class;
            case 2:
                return ClientToolDefinition.class;
            case 3:
                return ConversationStarterPrompt.class;
            case 4:
                return DatingParams.class;
            case 5:
                return GpsLocation.class;
            case 6:
                return GraphqlQueryContext.class;
            case 7:
                return GraphqlQueryOptions.class;
            case 8:
                return InputSchema.class;
            case 9:
                return MobiusParams.class;
            case 10:
                return ModelOverrides.class;
            case 11:
                return OptionalParams.class;
            case 12:
                return ProactiveVoicePrompt.class;
            case 13:
                return SelectedEmbodimentParams.class;
            case 14:
                return VideoContext.class;
            case 15:
                return WaveformsSession.class;
            case 16:
                return WwwHostOverride.class;
            case 17:
                return AppDrivenAudioDevice.class;
            case 18:
                return AppDrivenAudioDeviceConfig.class;
            case 19:
                return AppDrivenAudioPcmSink.class;
            case 20:
                return AppDrivenAudioTask.class;
            case 21:
                return AppDrivenAudioTransport.class;
            case 22:
                return AudioStateManagerListener.class;
            case 23:
                return AudioStateManagerProxy.class;
            case 24:
                return AudioStateManagerTaskRunner.class;
            case 25:
                return AppInfo.class;
            case 26:
                return AppstateApi.class;
            case 27:
                return AppstateModel.class;
            case 28:
                return AudioFrame.class;
            case 29:
                return AudioFrameDetails.class;
            case 30:
                return AudioFrameMetadata.class;
            case 31:
                return AudioTtsMetadata.class;
            case 32:
                return TtsSpeechChunk.class;
            case 33:
                return AudioApi.class;
            case 34:
                return AudioDeviceApi.class;
            case 35:
                return AudioDeviceModule.class;
            case 36:
                return AudioEncodedPacket.class;
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft /* 37 */:
                return AudioInputRoute.class;
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight /* 38 */:
                return AudioMetrics.class;
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop /* 39 */:
                return AudioModel.class;
            case 40:
                return AudioOutputRoute.class;
            case R.styleable.maplibre_MapView_maplibre_uiHorizontalScrollGestures /* 41 */:
                return AudioProxy.class;
            case 42:
                return AudioSource.class;
            case R.styleable.maplibre_MapView_maplibre_uiLogoGravity /* 43 */:
                return AudioSourceSink.class;
            case 44:
                return AudioStream.class;
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft /* 45 */:
                return AudioStreamSource.class;
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight /* 46 */:
                return AudioVadMetadata.class;
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop /* 47 */:
                return EnableAudioParameters.class;
            case 48:
                return PlaybackVolumeParameters.class;
            case R.styleable.maplibre_MapView_maplibre_uiRotateGestures /* 49 */:
                return AudioDeviceContext.class;
            default:
                return null;
        }
    }

    @Override // X.G50
    public final long AMC() {
        switch (this.$t) {
            case 0:
                long j = Exception.sMcfTypeId;
                if (j != 0) {
                    return j;
                }
                long jNativeGetMcfTypeId = Exception.nativeGetMcfTypeId();
                Exception.sMcfTypeId = jNativeGetMcfTypeId;
                return jNativeGetMcfTypeId;
            case 1:
                GUV.A00();
                long j2 = AiSessionCreateResult.sMcfTypeId;
                if (j2 != 0) {
                    return j2;
                }
                long jNativeGetMcfTypeId2 = AiSessionCreateResult.nativeGetMcfTypeId();
                AiSessionCreateResult.sMcfTypeId = jNativeGetMcfTypeId2;
                return jNativeGetMcfTypeId2;
            case 2:
                GUV.A00();
                long j3 = ClientToolDefinition.sMcfTypeId;
                if (j3 != 0) {
                    return j3;
                }
                long jNativeGetMcfTypeId3 = ClientToolDefinition.nativeGetMcfTypeId();
                ClientToolDefinition.sMcfTypeId = jNativeGetMcfTypeId3;
                return jNativeGetMcfTypeId3;
            case 3:
                GUV.A00();
                long j4 = ConversationStarterPrompt.sMcfTypeId;
                if (j4 != 0) {
                    return j4;
                }
                long jNativeGetMcfTypeId4 = ConversationStarterPrompt.nativeGetMcfTypeId();
                ConversationStarterPrompt.sMcfTypeId = jNativeGetMcfTypeId4;
                return jNativeGetMcfTypeId4;
            case 4:
                GUV.A00();
                long j5 = DatingParams.sMcfTypeId;
                if (j5 != 0) {
                    return j5;
                }
                long jNativeGetMcfTypeId5 = DatingParams.nativeGetMcfTypeId();
                DatingParams.sMcfTypeId = jNativeGetMcfTypeId5;
                return jNativeGetMcfTypeId5;
            case 5:
                GUV.A00();
                long j6 = GpsLocation.sMcfTypeId;
                if (j6 != 0) {
                    return j6;
                }
                long jNativeGetMcfTypeId6 = GpsLocation.nativeGetMcfTypeId();
                GpsLocation.sMcfTypeId = jNativeGetMcfTypeId6;
                return jNativeGetMcfTypeId6;
            case 6:
                GUV.A00();
                long j7 = GraphqlQueryContext.sMcfTypeId;
                if (j7 != 0) {
                    return j7;
                }
                long jNativeGetMcfTypeId7 = GraphqlQueryContext.nativeGetMcfTypeId();
                GraphqlQueryContext.sMcfTypeId = jNativeGetMcfTypeId7;
                return jNativeGetMcfTypeId7;
            case 7:
                GUV.A00();
                long j8 = GraphqlQueryOptions.sMcfTypeId;
                if (j8 != 0) {
                    return j8;
                }
                long jNativeGetMcfTypeId8 = GraphqlQueryOptions.nativeGetMcfTypeId();
                GraphqlQueryOptions.sMcfTypeId = jNativeGetMcfTypeId8;
                return jNativeGetMcfTypeId8;
            case 8:
                GUV.A00();
                long j9 = InputSchema.sMcfTypeId;
                if (j9 != 0) {
                    return j9;
                }
                long jNativeGetMcfTypeId9 = InputSchema.nativeGetMcfTypeId();
                InputSchema.sMcfTypeId = jNativeGetMcfTypeId9;
                return jNativeGetMcfTypeId9;
            case 9:
                GUV.A00();
                long j10 = MobiusParams.sMcfTypeId;
                if (j10 != 0) {
                    return j10;
                }
                long jNativeGetMcfTypeId10 = MobiusParams.nativeGetMcfTypeId();
                MobiusParams.sMcfTypeId = jNativeGetMcfTypeId10;
                return jNativeGetMcfTypeId10;
            case 10:
                GUV.A00();
                long j11 = ModelOverrides.sMcfTypeId;
                if (j11 != 0) {
                    return j11;
                }
                long jNativeGetMcfTypeId11 = ModelOverrides.nativeGetMcfTypeId();
                ModelOverrides.sMcfTypeId = jNativeGetMcfTypeId11;
                return jNativeGetMcfTypeId11;
            case 11:
                GUV.A00();
                long j12 = OptionalParams.sMcfTypeId;
                if (j12 != 0) {
                    return j12;
                }
                long jNativeGetMcfTypeId12 = OptionalParams.nativeGetMcfTypeId();
                OptionalParams.sMcfTypeId = jNativeGetMcfTypeId12;
                return jNativeGetMcfTypeId12;
            case 12:
                GUV.A00();
                long j13 = ProactiveVoicePrompt.sMcfTypeId;
                if (j13 != 0) {
                    return j13;
                }
                long jNativeGetMcfTypeId13 = ProactiveVoicePrompt.nativeGetMcfTypeId();
                ProactiveVoicePrompt.sMcfTypeId = jNativeGetMcfTypeId13;
                return jNativeGetMcfTypeId13;
            case 13:
                GUV.A00();
                long j14 = SelectedEmbodimentParams.sMcfTypeId;
                if (j14 != 0) {
                    return j14;
                }
                long jNativeGetMcfTypeId14 = SelectedEmbodimentParams.nativeGetMcfTypeId();
                SelectedEmbodimentParams.sMcfTypeId = jNativeGetMcfTypeId14;
                return jNativeGetMcfTypeId14;
            case 14:
                GUV.A00();
                long j15 = VideoContext.sMcfTypeId;
                if (j15 != 0) {
                    return j15;
                }
                long jNativeGetMcfTypeId15 = VideoContext.nativeGetMcfTypeId();
                VideoContext.sMcfTypeId = jNativeGetMcfTypeId15;
                return jNativeGetMcfTypeId15;
            case 15:
                GUV.A00();
                long j16 = WaveformsSession.sMcfTypeId;
                if (j16 != 0) {
                    return j16;
                }
                long jNativeGetMcfTypeId16 = WaveformsSession.nativeGetMcfTypeId();
                WaveformsSession.sMcfTypeId = jNativeGetMcfTypeId16;
                return jNativeGetMcfTypeId16;
            case 16:
                GUV.A00();
                long j17 = WwwHostOverride.sMcfTypeId;
                if (j17 != 0) {
                    return j17;
                }
                long jNativeGetMcfTypeId17 = WwwHostOverride.nativeGetMcfTypeId();
                WwwHostOverride.sMcfTypeId = jNativeGetMcfTypeId17;
                return jNativeGetMcfTypeId17;
            case 17:
                long j18 = AppDrivenAudioDevice.CProxy.sMcfTypeId;
                if (j18 != 0) {
                    return j18;
                }
                long jNativeGetMcfTypeId18 = AppDrivenAudioDevice.CProxy.nativeGetMcfTypeId();
                AppDrivenAudioDevice.CProxy.sMcfTypeId = jNativeGetMcfTypeId18;
                return jNativeGetMcfTypeId18;
            case 18:
                GUW.A00();
                long j19 = AppDrivenAudioDeviceConfig.sMcfTypeId;
                if (j19 != 0) {
                    return j19;
                }
                long jNativeGetMcfTypeId19 = AppDrivenAudioDeviceConfig.nativeGetMcfTypeId();
                AppDrivenAudioDeviceConfig.sMcfTypeId = jNativeGetMcfTypeId19;
                return jNativeGetMcfTypeId19;
            case 19:
                long j20 = AppDrivenAudioPcmSink.CProxy.sMcfTypeId;
                if (j20 != 0) {
                    return j20;
                }
                long jNativeGetMcfTypeId20 = AppDrivenAudioPcmSink.CProxy.nativeGetMcfTypeId();
                AppDrivenAudioPcmSink.CProxy.sMcfTypeId = jNativeGetMcfTypeId20;
                return jNativeGetMcfTypeId20;
            case 20:
                long j21 = AppDrivenAudioTask.CProxy.sMcfTypeId;
                if (j21 != 0) {
                    return j21;
                }
                long jNativeGetMcfTypeId21 = AppDrivenAudioTask.CProxy.nativeGetMcfTypeId();
                AppDrivenAudioTask.CProxy.sMcfTypeId = jNativeGetMcfTypeId21;
                return jNativeGetMcfTypeId21;
            case 21:
                long j22 = AppDrivenAudioTransport.CProxy.sMcfTypeId;
                if (j22 != 0) {
                    return j22;
                }
                long jNativeGetMcfTypeId22 = AppDrivenAudioTransport.CProxy.nativeGetMcfTypeId();
                AppDrivenAudioTransport.CProxy.sMcfTypeId = jNativeGetMcfTypeId22;
                return jNativeGetMcfTypeId22;
            case 22:
                long j23 = AudioStateManagerListener.CProxy.sMcfTypeId;
                if (j23 != 0) {
                    return j23;
                }
                long jNativeGetMcfTypeId23 = AudioStateManagerListener.CProxy.nativeGetMcfTypeId();
                AudioStateManagerListener.CProxy.sMcfTypeId = jNativeGetMcfTypeId23;
                return jNativeGetMcfTypeId23;
            case 23:
                long j24 = AudioStateManagerProxy.CProxy.sMcfTypeId;
                if (j24 != 0) {
                    return j24;
                }
                long jNativeGetMcfTypeId24 = AudioStateManagerProxy.CProxy.nativeGetMcfTypeId();
                AudioStateManagerProxy.CProxy.sMcfTypeId = jNativeGetMcfTypeId24;
                return jNativeGetMcfTypeId24;
            case 24:
                long j25 = AudioStateManagerTaskRunner.CProxy.sMcfTypeId;
                if (j25 != 0) {
                    return j25;
                }
                long jNativeGetMcfTypeId25 = AudioStateManagerTaskRunner.CProxy.nativeGetMcfTypeId();
                AudioStateManagerTaskRunner.CProxy.sMcfTypeId = jNativeGetMcfTypeId25;
                return jNativeGetMcfTypeId25;
            case 25:
                GUt.A00();
                long j26 = AppInfo.sMcfTypeId;
                if (j26 != 0) {
                    return j26;
                }
                long jNativeGetMcfTypeId26 = AppInfo.nativeGetMcfTypeId();
                AppInfo.sMcfTypeId = jNativeGetMcfTypeId26;
                return jNativeGetMcfTypeId26;
            case 26:
                long j27 = AppstateApi.CProxy.sMcfTypeId;
                if (j27 != 0) {
                    return j27;
                }
                long jNativeGetMcfTypeId27 = AppstateApi.CProxy.nativeGetMcfTypeId();
                AppstateApi.CProxy.sMcfTypeId = jNativeGetMcfTypeId27;
                return jNativeGetMcfTypeId27;
            case 27:
                GVb.A00();
                long j28 = AppstateModel.sMcfTypeId;
                if (j28 != 0) {
                    return j28;
                }
                long jNativeGetMcfTypeId28 = AppstateModel.nativeGetMcfTypeId();
                AppstateModel.sMcfTypeId = jNativeGetMcfTypeId28;
                return jNativeGetMcfTypeId28;
            case 28:
                long j29 = AudioFrame.CProxy.sMcfTypeId;
                if (j29 != 0) {
                    return j29;
                }
                long jNativeGetMcfTypeId29 = AudioFrame.CProxy.nativeGetMcfTypeId();
                AudioFrame.CProxy.sMcfTypeId = jNativeGetMcfTypeId29;
                return jNativeGetMcfTypeId29;
            case 29:
                long j30 = AudioFrameDetails.sMcfTypeId;
                if (j30 != 0) {
                    return j30;
                }
                long jNativeGetMcfTypeId30 = AudioFrameDetails.nativeGetMcfTypeId();
                AudioFrameDetails.sMcfTypeId = jNativeGetMcfTypeId30;
                return jNativeGetMcfTypeId30;
            case 30:
                long j31 = AudioFrameMetadata.sMcfTypeId;
                if (j31 != 0) {
                    return j31;
                }
                long jNativeGetMcfTypeId31 = AudioFrameMetadata.nativeGetMcfTypeId();
                AudioFrameMetadata.sMcfTypeId = jNativeGetMcfTypeId31;
                return jNativeGetMcfTypeId31;
            case 31:
                long j32 = AudioTtsMetadata.sMcfTypeId;
                if (j32 != 0) {
                    return j32;
                }
                long jNativeGetMcfTypeId32 = AudioTtsMetadata.nativeGetMcfTypeId();
                AudioTtsMetadata.sMcfTypeId = jNativeGetMcfTypeId32;
                return jNativeGetMcfTypeId32;
            case 32:
                long j33 = TtsSpeechChunk.sMcfTypeId;
                if (j33 != 0) {
                    return j33;
                }
                long jNativeGetMcfTypeId33 = TtsSpeechChunk.nativeGetMcfTypeId();
                TtsSpeechChunk.sMcfTypeId = jNativeGetMcfTypeId33;
                return jNativeGetMcfTypeId33;
            case 33:
                long j34 = AudioApi.CProxy.sMcfTypeId;
                if (j34 != 0) {
                    return j34;
                }
                long jNativeGetMcfTypeId34 = AudioApi.CProxy.nativeGetMcfTypeId();
                AudioApi.CProxy.sMcfTypeId = jNativeGetMcfTypeId34;
                return jNativeGetMcfTypeId34;
            case 34:
                long j35 = AudioDeviceApi.CProxy.sMcfTypeId;
                if (j35 != 0) {
                    return j35;
                }
                long jNativeGetMcfTypeId35 = AudioDeviceApi.CProxy.nativeGetMcfTypeId();
                AudioDeviceApi.CProxy.sMcfTypeId = jNativeGetMcfTypeId35;
                return jNativeGetMcfTypeId35;
            case 35:
                long j36 = AudioDeviceModule.CProxy.sMcfTypeId;
                if (j36 != 0) {
                    return j36;
                }
                long jNativeGetMcfTypeId36 = AudioDeviceModule.CProxy.nativeGetMcfTypeId();
                AudioDeviceModule.CProxy.sMcfTypeId = jNativeGetMcfTypeId36;
                return jNativeGetMcfTypeId36;
            case 36:
                long j37 = AudioEncodedPacket.sMcfTypeId;
                if (j37 != 0) {
                    return j37;
                }
                long jNativeGetMcfTypeId37 = AudioEncodedPacket.nativeGetMcfTypeId();
                AudioEncodedPacket.sMcfTypeId = jNativeGetMcfTypeId37;
                return jNativeGetMcfTypeId37;
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft /* 37 */:
                GUX.A00();
                long j38 = AudioInputRoute.sMcfTypeId;
                if (j38 != 0) {
                    return j38;
                }
                long jNativeGetMcfTypeId38 = AudioInputRoute.nativeGetMcfTypeId();
                AudioInputRoute.sMcfTypeId = jNativeGetMcfTypeId38;
                return jNativeGetMcfTypeId38;
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight /* 38 */:
                long j39 = AudioMetrics.sMcfTypeId;
                if (j39 != 0) {
                    return j39;
                }
                long jNativeGetMcfTypeId39 = AudioMetrics.nativeGetMcfTypeId();
                AudioMetrics.sMcfTypeId = jNativeGetMcfTypeId39;
                return jNativeGetMcfTypeId39;
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop /* 39 */:
                GUX.A00();
                long j40 = AudioModel.sMcfTypeId;
                if (j40 != 0) {
                    return j40;
                }
                long jNativeGetMcfTypeId40 = AudioModel.nativeGetMcfTypeId();
                AudioModel.sMcfTypeId = jNativeGetMcfTypeId40;
                return jNativeGetMcfTypeId40;
            case 40:
                GUX.A00();
                long j41 = AudioOutputRoute.sMcfTypeId;
                if (j41 != 0) {
                    return j41;
                }
                long jNativeGetMcfTypeId41 = AudioOutputRoute.nativeGetMcfTypeId();
                AudioOutputRoute.sMcfTypeId = jNativeGetMcfTypeId41;
                return jNativeGetMcfTypeId41;
            case R.styleable.maplibre_MapView_maplibre_uiHorizontalScrollGestures /* 41 */:
                long j42 = AudioProxy.CProxy.sMcfTypeId;
                if (j42 != 0) {
                    return j42;
                }
                long jNativeGetMcfTypeId42 = AudioProxy.CProxy.nativeGetMcfTypeId();
                AudioProxy.CProxy.sMcfTypeId = jNativeGetMcfTypeId42;
                return jNativeGetMcfTypeId42;
            case 42:
                long j43 = AudioSource.CProxy.sMcfTypeId;
                if (j43 != 0) {
                    return j43;
                }
                long jNativeGetMcfTypeId43 = AudioSource.CProxy.nativeGetMcfTypeId();
                AudioSource.CProxy.sMcfTypeId = jNativeGetMcfTypeId43;
                return jNativeGetMcfTypeId43;
            case R.styleable.maplibre_MapView_maplibre_uiLogoGravity /* 43 */:
                long j44 = AudioSourceSink.CProxy.sMcfTypeId;
                if (j44 != 0) {
                    return j44;
                }
                long jNativeGetMcfTypeId44 = AudioSourceSink.CProxy.nativeGetMcfTypeId();
                AudioSourceSink.CProxy.sMcfTypeId = jNativeGetMcfTypeId44;
                return jNativeGetMcfTypeId44;
            case 44:
                GUX.A00();
                long j45 = AudioStream.sMcfTypeId;
                if (j45 != 0) {
                    return j45;
                }
                long jNativeGetMcfTypeId45 = AudioStream.nativeGetMcfTypeId();
                AudioStream.sMcfTypeId = jNativeGetMcfTypeId45;
                return jNativeGetMcfTypeId45;
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft /* 45 */:
                long j46 = AudioStreamSource.CProxy.sMcfTypeId;
                if (j46 != 0) {
                    return j46;
                }
                long jNativeGetMcfTypeId46 = AudioStreamSource.CProxy.nativeGetMcfTypeId();
                AudioStreamSource.CProxy.sMcfTypeId = jNativeGetMcfTypeId46;
                return jNativeGetMcfTypeId46;
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight /* 46 */:
                long j47 = AudioVadMetadata.sMcfTypeId;
                if (j47 != 0) {
                    return j47;
                }
                long jNativeGetMcfTypeId47 = AudioVadMetadata.nativeGetMcfTypeId();
                AudioVadMetadata.sMcfTypeId = jNativeGetMcfTypeId47;
                return jNativeGetMcfTypeId47;
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop /* 47 */:
                GUX.A00();
                long j48 = EnableAudioParameters.sMcfTypeId;
                if (j48 != 0) {
                    return j48;
                }
                long jNativeGetMcfTypeId48 = EnableAudioParameters.nativeGetMcfTypeId();
                EnableAudioParameters.sMcfTypeId = jNativeGetMcfTypeId48;
                return jNativeGetMcfTypeId48;
            case 48:
                GUX.A00();
                long j49 = PlaybackVolumeParameters.sMcfTypeId;
                if (j49 != 0) {
                    return j49;
                }
                long jNativeGetMcfTypeId49 = PlaybackVolumeParameters.nativeGetMcfTypeId();
                PlaybackVolumeParameters.sMcfTypeId = jNativeGetMcfTypeId49;
                return jNativeGetMcfTypeId49;
            case R.styleable.maplibre_MapView_maplibre_uiRotateGestures /* 49 */:
                GXw.A00();
                long j50 = AudioDeviceContext.sMcfTypeId;
                if (j50 != 0) {
                    return j50;
                }
                long jNativeGetMcfTypeId50 = AudioDeviceContext.nativeGetMcfTypeId();
                AudioDeviceContext.sMcfTypeId = jNativeGetMcfTypeId50;
                return jNativeGetMcfTypeId50;
            default:
                return 0L;
        }
    }
}
