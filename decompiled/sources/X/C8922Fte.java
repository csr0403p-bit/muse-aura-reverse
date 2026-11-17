package X;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.metaaivoicestate.gen.SendMessageCommandData;
import com.facebook.rsys.metaaivoicestate.gen.ShapeOfFeedCommandData;
import com.facebook.rsys.metaaivoicestate.gen.StandardizedResponseItem;
import com.facebook.rsys.metaaivoicestate.gen.ThreadSummaryCommandData;
import com.facebook.rsys.metaaivoicestate.gen.TurnMetaData;
import com.facebook.rsys.metaaivoicestate.gen.UgcBotChangeResult;
import com.facebook.rsys.metaaivoicestate.gen.WearableAppEvent;
import com.facebook.rsys.odin.gen.LiteInferenceEngineHolder;
import com.facebook.rsys.odin.gen.PredictionResult;
import com.facebook.rsys.outgoingcallconfig.gen.OutgoingCallConfig;
import com.facebook.rsys.outgoingcallconfig.gen.StateSyncMessage;
import com.facebook.rsys.overlayconfig.gen.OverlayConfigApi;
import com.facebook.rsys.perf.holders.gen.PerfListener;
import com.facebook.rsys.perf.holders.gen.PerfListenerFactory;
import com.facebook.rsys.perf.holders.gen.PerfLoggerHolder;
import com.facebook.rsys.roomtypecalling.gen.CallingAppContext;
import com.facebook.rsys.roomtypecalling.gen.CallingTags;
import com.facebook.rsys.screenshare.gen.PeerScreenShareStates;
import com.facebook.rsys.screenshare.gen.ScreenShareApi;
import com.facebook.rsys.screenshare.gen.ScreenShareModel;
import com.facebook.rsys.state.gen.State;
import com.facebook.rsys.stream.gen.LocalVideoStream;
import com.facebook.rsys.stream.gen.StreamApi;
import com.facebook.rsys.stream.gen.StreamCallbacks;
import com.facebook.rsys.stream.gen.StreamModel;
import com.facebook.rsys.stream.gen.VideoCapturePropertiesListener;
import com.facebook.rsys.stream.gen.VideoStreamController;
import com.facebook.rsys.stream.gen.VideoStreamParams;
import com.facebook.rsys.stream.gen.VideoStreamSendParams;
import com.facebook.rsys.transport.gen.ChatdSendStats;
import com.facebook.rsys.transport.gen.MessageReceiveCallbacks;
import com.facebook.rsys.transport.gen.MetricIdentifiers;
import com.facebook.rsys.transport.gen.SendMessageAttemptStats;
import com.facebook.rsys.transport.gen.SendMessageStats;
import com.facebook.rsys.transport.gen.SignalingMessage;
import com.facebook.rsys.transport.gen.SignalingMessageIncomingStats;
import com.facebook.rsys.transport.gen.SignalingProtocolParams;
import com.facebook.rsys.transport.gen.SignalingTransportCallback;
import com.facebook.rsys.transport.gen.SignalingTransportCallbackExt;
import com.facebook.rsys.transport.gen.SignalingTransportProxy;
import com.facebook.rsys.transport.gen.SignalingTransportSink;
import com.facebook.rsys.transport.gen.StatusUpdate;
import com.facebook.rsys.transport.gen.UllcEdgerayAddress;
import com.facebook.rsys.transport.gen.UllcParams;
import com.facebook.rsys.tslog.gen.TslogApi;
import com.facebook.rsys.tslog.gen.TslogCounterApi;
import com.facebook.rsys.tslog.gen.TslogEngineApi;
import com.facebook.rsys.tslog.gen.TslogStreamApi;
import com.facebook.rsys.video.gen.MediaProcessor;
import com.facebook.rsys.video.gen.ProcessedFrameCallbacks;
import org.maplibre.android.R;

/* renamed from: X.Fte, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8922Fte implements G50 {
    public final int $t;

    public C8922Fte(int i) {
        this.$t = i;
    }

    public static C8922Fte A00(int i) {
        return new C8922Fte(i);
    }

    @Override // X.G50
    public final /* bridge */ /* synthetic */ Object A7C(McfReference mcfReference) {
        switch (this.$t) {
            case 0:
                GUf.A00();
                return SendMessageCommandData.createFromMcfType(mcfReference);
            case 1:
                GUf.A00();
                return ShapeOfFeedCommandData.createFromMcfType(mcfReference);
            case 2:
                GUf.A00();
                return StandardizedResponseItem.createFromMcfType(mcfReference);
            case 3:
                GUf.A00();
                return ThreadSummaryCommandData.createFromMcfType(mcfReference);
            case 4:
                GUf.A00();
                return TurnMetaData.createFromMcfType(mcfReference);
            case 5:
                GUf.A00();
                return UgcBotChangeResult.createFromMcfType(mcfReference);
            case 6:
                GUf.A00();
                return WearableAppEvent.createFromMcfType(mcfReference);
            case 7:
                GUg.A00();
                return LiteInferenceEngineHolder.createFromMcfType(mcfReference);
            case 8:
                GUg.A00();
                return PredictionResult.createFromMcfType(mcfReference);
            case 9:
                GUh.A00();
                return OutgoingCallConfig.createFromMcfType(mcfReference);
            case 10:
                GUh.A00();
                return StateSyncMessage.createFromMcfType(mcfReference);
            case 11:
                return OverlayConfigApi.CProxy.createFromMcfType(mcfReference);
            case 12:
                return PerfListener.CProxy.createFromMcfType(mcfReference);
            case 13:
                return PerfListenerFactory.CProxy.createFromMcfType(mcfReference);
            case 14:
                return PerfLoggerHolder.createFromMcfType(mcfReference);
            case 15:
                GUm.A00();
                return CallingAppContext.createFromMcfType(mcfReference);
            case 16:
                GUm.A00();
                return CallingTags.createFromMcfType(mcfReference);
            case 17:
                GYq.A00();
                return PeerScreenShareStates.createFromMcfType(mcfReference);
            case 18:
                return ScreenShareApi.CProxy.createFromMcfType(mcfReference);
            case 19:
                GYq.A00();
                return ScreenShareModel.createFromMcfType(mcfReference);
            case 20:
                GUk.A00();
                return State.createFromMcfType(mcfReference);
            case 21:
                GUj.A00();
                return LocalVideoStream.createFromMcfType(mcfReference);
            case 22:
                return StreamApi.CProxy.createFromMcfType(mcfReference);
            case 23:
                return StreamCallbacks.CProxy.createFromMcfType(mcfReference);
            case 24:
                GUj.A00();
                return StreamModel.createFromMcfType(mcfReference);
            case 25:
                return VideoCapturePropertiesListener.CProxy.createFromMcfType(mcfReference);
            case 26:
                return VideoStreamController.CProxy.createFromMcfType(mcfReference);
            case 27:
                GUj.A00();
                return VideoStreamParams.createFromMcfType(mcfReference);
            case 28:
                GUj.A00();
                return VideoStreamSendParams.createFromMcfType(mcfReference);
            case 29:
                return ChatdSendStats.createFromMcfType(mcfReference);
            case 30:
                return MessageReceiveCallbacks.CProxy.createFromMcfType(mcfReference);
            case 31:
                GUi.A00();
                return MetricIdentifiers.createFromMcfType(mcfReference);
            case 32:
                return SendMessageAttemptStats.createFromMcfType(mcfReference);
            case 33:
                return SendMessageStats.createFromMcfType(mcfReference);
            case 34:
                GUi.A00();
                return SignalingMessage.createFromMcfType(mcfReference);
            case 35:
                GUi.A00();
                return SignalingMessageIncomingStats.createFromMcfType(mcfReference);
            case 36:
                GUi.A00();
                return SignalingProtocolParams.createFromMcfType(mcfReference);
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft /* 37 */:
                return SignalingTransportCallback.CProxy.createFromMcfType(mcfReference);
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight /* 38 */:
                return SignalingTransportCallbackExt.CProxy.createFromMcfType(mcfReference);
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop /* 39 */:
                return SignalingTransportProxy.CProxy.createFromMcfType(mcfReference);
            case 40:
                return SignalingTransportSink.CProxy.createFromMcfType(mcfReference);
            case R.styleable.maplibre_MapView_maplibre_uiHorizontalScrollGestures /* 41 */:
                return StatusUpdate.createFromMcfType(mcfReference);
            case 42:
                GUi.A00();
                return UllcEdgerayAddress.createFromMcfType(mcfReference);
            case R.styleable.maplibre_MapView_maplibre_uiLogoGravity /* 43 */:
                GUi.A00();
                return UllcParams.createFromMcfType(mcfReference);
            case 44:
                return TslogApi.CProxy.createFromMcfType(mcfReference);
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft /* 45 */:
                return TslogCounterApi.CProxy.createFromMcfType(mcfReference);
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight /* 46 */:
                return TslogEngineApi.CProxy.createFromMcfType(mcfReference);
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop /* 47 */:
                return TslogStreamApi.CProxy.createFromMcfType(mcfReference);
            case 48:
                return MediaProcessor.CProxy.createFromMcfType(mcfReference);
            case R.styleable.maplibre_MapView_maplibre_uiRotateGestures /* 49 */:
                return ProcessedFrameCallbacks.CProxy.createFromMcfType(mcfReference);
            default:
                return null;
        }
    }

    @Override // X.G50
    public final Class<SendMessageCommandData> AHp() {
        switch (this.$t) {
            case 0:
                return SendMessageCommandData.class;
            case 1:
                return ShapeOfFeedCommandData.class;
            case 2:
                return StandardizedResponseItem.class;
            case 3:
                return ThreadSummaryCommandData.class;
            case 4:
                return TurnMetaData.class;
            case 5:
                return UgcBotChangeResult.class;
            case 6:
                return WearableAppEvent.class;
            case 7:
                return LiteInferenceEngineHolder.class;
            case 8:
                return PredictionResult.class;
            case 9:
                return OutgoingCallConfig.class;
            case 10:
                return StateSyncMessage.class;
            case 11:
                return OverlayConfigApi.class;
            case 12:
                return PerfListener.class;
            case 13:
                return PerfListenerFactory.class;
            case 14:
                return PerfLoggerHolder.class;
            case 15:
                return CallingAppContext.class;
            case 16:
                return CallingTags.class;
            case 17:
                return PeerScreenShareStates.class;
            case 18:
                return ScreenShareApi.class;
            case 19:
                return ScreenShareModel.class;
            case 20:
                return State.class;
            case 21:
                return LocalVideoStream.class;
            case 22:
                return StreamApi.class;
            case 23:
                return StreamCallbacks.class;
            case 24:
                return StreamModel.class;
            case 25:
                return VideoCapturePropertiesListener.class;
            case 26:
                return VideoStreamController.class;
            case 27:
                return VideoStreamParams.class;
            case 28:
                return VideoStreamSendParams.class;
            case 29:
                return ChatdSendStats.class;
            case 30:
                return MessageReceiveCallbacks.class;
            case 31:
                return MetricIdentifiers.class;
            case 32:
                return SendMessageAttemptStats.class;
            case 33:
                return SendMessageStats.class;
            case 34:
                return SignalingMessage.class;
            case 35:
                return SignalingMessageIncomingStats.class;
            case 36:
                return SignalingProtocolParams.class;
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft /* 37 */:
                return SignalingTransportCallback.class;
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight /* 38 */:
                return SignalingTransportCallbackExt.class;
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop /* 39 */:
                return SignalingTransportProxy.class;
            case 40:
                return SignalingTransportSink.class;
            case R.styleable.maplibre_MapView_maplibre_uiHorizontalScrollGestures /* 41 */:
                return StatusUpdate.class;
            case 42:
                return UllcEdgerayAddress.class;
            case R.styleable.maplibre_MapView_maplibre_uiLogoGravity /* 43 */:
                return UllcParams.class;
            case 44:
                return TslogApi.class;
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft /* 45 */:
                return TslogCounterApi.class;
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight /* 46 */:
                return TslogEngineApi.class;
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop /* 47 */:
                return TslogStreamApi.class;
            case 48:
                return MediaProcessor.class;
            case R.styleable.maplibre_MapView_maplibre_uiRotateGestures /* 49 */:
                return ProcessedFrameCallbacks.class;
            default:
                return null;
        }
    }

    @Override // X.G50
    public final long AMC() {
        switch (this.$t) {
            case 0:
                GUf.A00();
                long j = SendMessageCommandData.sMcfTypeId;
                if (j != 0) {
                    return j;
                }
                long jNativeGetMcfTypeId = SendMessageCommandData.nativeGetMcfTypeId();
                SendMessageCommandData.sMcfTypeId = jNativeGetMcfTypeId;
                return jNativeGetMcfTypeId;
            case 1:
                GUf.A00();
                long j2 = ShapeOfFeedCommandData.sMcfTypeId;
                if (j2 != 0) {
                    return j2;
                }
                long jNativeGetMcfTypeId2 = ShapeOfFeedCommandData.nativeGetMcfTypeId();
                ShapeOfFeedCommandData.sMcfTypeId = jNativeGetMcfTypeId2;
                return jNativeGetMcfTypeId2;
            case 2:
                GUf.A00();
                long j3 = StandardizedResponseItem.sMcfTypeId;
                if (j3 != 0) {
                    return j3;
                }
                long jNativeGetMcfTypeId3 = StandardizedResponseItem.nativeGetMcfTypeId();
                StandardizedResponseItem.sMcfTypeId = jNativeGetMcfTypeId3;
                return jNativeGetMcfTypeId3;
            case 3:
                GUf.A00();
                long j4 = ThreadSummaryCommandData.sMcfTypeId;
                if (j4 != 0) {
                    return j4;
                }
                long jNativeGetMcfTypeId4 = ThreadSummaryCommandData.nativeGetMcfTypeId();
                ThreadSummaryCommandData.sMcfTypeId = jNativeGetMcfTypeId4;
                return jNativeGetMcfTypeId4;
            case 4:
                GUf.A00();
                long j5 = TurnMetaData.sMcfTypeId;
                if (j5 != 0) {
                    return j5;
                }
                long jNativeGetMcfTypeId5 = TurnMetaData.nativeGetMcfTypeId();
                TurnMetaData.sMcfTypeId = jNativeGetMcfTypeId5;
                return jNativeGetMcfTypeId5;
            case 5:
                GUf.A00();
                long j6 = UgcBotChangeResult.sMcfTypeId;
                if (j6 != 0) {
                    return j6;
                }
                long jNativeGetMcfTypeId6 = UgcBotChangeResult.nativeGetMcfTypeId();
                UgcBotChangeResult.sMcfTypeId = jNativeGetMcfTypeId6;
                return jNativeGetMcfTypeId6;
            case 6:
                GUf.A00();
                long j7 = WearableAppEvent.sMcfTypeId;
                if (j7 != 0) {
                    return j7;
                }
                long jNativeGetMcfTypeId7 = WearableAppEvent.nativeGetMcfTypeId();
                WearableAppEvent.sMcfTypeId = jNativeGetMcfTypeId7;
                return jNativeGetMcfTypeId7;
            case 7:
                GUg.A00();
                long j8 = LiteInferenceEngineHolder.sMcfTypeId;
                if (j8 != 0) {
                    return j8;
                }
                long jNativeGetMcfTypeId8 = LiteInferenceEngineHolder.nativeGetMcfTypeId();
                LiteInferenceEngineHolder.sMcfTypeId = jNativeGetMcfTypeId8;
                return jNativeGetMcfTypeId8;
            case 8:
                GUg.A00();
                long j9 = PredictionResult.sMcfTypeId;
                if (j9 != 0) {
                    return j9;
                }
                long jNativeGetMcfTypeId9 = PredictionResult.nativeGetMcfTypeId();
                PredictionResult.sMcfTypeId = jNativeGetMcfTypeId9;
                return jNativeGetMcfTypeId9;
            case 9:
                GUh.A00();
                long j10 = OutgoingCallConfig.sMcfTypeId;
                if (j10 != 0) {
                    return j10;
                }
                long jNativeGetMcfTypeId10 = OutgoingCallConfig.nativeGetMcfTypeId();
                OutgoingCallConfig.sMcfTypeId = jNativeGetMcfTypeId10;
                return jNativeGetMcfTypeId10;
            case 10:
                GUh.A00();
                long j11 = StateSyncMessage.sMcfTypeId;
                if (j11 != 0) {
                    return j11;
                }
                long jNativeGetMcfTypeId11 = StateSyncMessage.nativeGetMcfTypeId();
                StateSyncMessage.sMcfTypeId = jNativeGetMcfTypeId11;
                return jNativeGetMcfTypeId11;
            case 11:
                long j12 = OverlayConfigApi.CProxy.sMcfTypeId;
                if (j12 != 0) {
                    return j12;
                }
                long jNativeGetMcfTypeId12 = OverlayConfigApi.CProxy.nativeGetMcfTypeId();
                OverlayConfigApi.CProxy.sMcfTypeId = jNativeGetMcfTypeId12;
                return jNativeGetMcfTypeId12;
            case 12:
                long j13 = PerfListener.CProxy.sMcfTypeId;
                if (j13 != 0) {
                    return j13;
                }
                long jNativeGetMcfTypeId13 = PerfListener.CProxy.nativeGetMcfTypeId();
                PerfListener.CProxy.sMcfTypeId = jNativeGetMcfTypeId13;
                return jNativeGetMcfTypeId13;
            case 13:
                long j14 = PerfListenerFactory.CProxy.sMcfTypeId;
                if (j14 != 0) {
                    return j14;
                }
                long jNativeGetMcfTypeId14 = PerfListenerFactory.CProxy.nativeGetMcfTypeId();
                PerfListenerFactory.CProxy.sMcfTypeId = jNativeGetMcfTypeId14;
                return jNativeGetMcfTypeId14;
            case 14:
                long j15 = PerfLoggerHolder.sMcfTypeId;
                if (j15 != 0) {
                    return j15;
                }
                long jNativeGetMcfTypeId15 = PerfLoggerHolder.nativeGetMcfTypeId();
                PerfLoggerHolder.sMcfTypeId = jNativeGetMcfTypeId15;
                return jNativeGetMcfTypeId15;
            case 15:
                GUm.A00();
                long j16 = CallingAppContext.sMcfTypeId;
                if (j16 != 0) {
                    return j16;
                }
                long jNativeGetMcfTypeId16 = CallingAppContext.nativeGetMcfTypeId();
                CallingAppContext.sMcfTypeId = jNativeGetMcfTypeId16;
                return jNativeGetMcfTypeId16;
            case 16:
                GUm.A00();
                long j17 = CallingTags.sMcfTypeId;
                if (j17 != 0) {
                    return j17;
                }
                long jNativeGetMcfTypeId17 = CallingTags.nativeGetMcfTypeId();
                CallingTags.sMcfTypeId = jNativeGetMcfTypeId17;
                return jNativeGetMcfTypeId17;
            case 17:
                GYq.A00();
                long j18 = PeerScreenShareStates.sMcfTypeId;
                if (j18 != 0) {
                    return j18;
                }
                long jNativeGetMcfTypeId18 = PeerScreenShareStates.nativeGetMcfTypeId();
                PeerScreenShareStates.sMcfTypeId = jNativeGetMcfTypeId18;
                return jNativeGetMcfTypeId18;
            case 18:
                long j19 = ScreenShareApi.CProxy.sMcfTypeId;
                if (j19 != 0) {
                    return j19;
                }
                long jNativeGetMcfTypeId19 = ScreenShareApi.CProxy.nativeGetMcfTypeId();
                ScreenShareApi.CProxy.sMcfTypeId = jNativeGetMcfTypeId19;
                return jNativeGetMcfTypeId19;
            case 19:
                GYq.A00();
                long j20 = ScreenShareModel.sMcfTypeId;
                if (j20 != 0) {
                    return j20;
                }
                long jNativeGetMcfTypeId20 = ScreenShareModel.nativeGetMcfTypeId();
                ScreenShareModel.sMcfTypeId = jNativeGetMcfTypeId20;
                return jNativeGetMcfTypeId20;
            case 20:
                GUk.A00();
                long j21 = State.sMcfTypeId;
                if (j21 != 0) {
                    return j21;
                }
                long jNativeGetMcfTypeId21 = State.nativeGetMcfTypeId();
                State.sMcfTypeId = jNativeGetMcfTypeId21;
                return jNativeGetMcfTypeId21;
            case 21:
                GUj.A00();
                long j22 = LocalVideoStream.sMcfTypeId;
                if (j22 != 0) {
                    return j22;
                }
                long jNativeGetMcfTypeId22 = LocalVideoStream.nativeGetMcfTypeId();
                LocalVideoStream.sMcfTypeId = jNativeGetMcfTypeId22;
                return jNativeGetMcfTypeId22;
            case 22:
                long j23 = StreamApi.CProxy.sMcfTypeId;
                if (j23 != 0) {
                    return j23;
                }
                long jNativeGetMcfTypeId23 = StreamApi.CProxy.nativeGetMcfTypeId();
                StreamApi.CProxy.sMcfTypeId = jNativeGetMcfTypeId23;
                return jNativeGetMcfTypeId23;
            case 23:
                long j24 = StreamCallbacks.CProxy.sMcfTypeId;
                if (j24 != 0) {
                    return j24;
                }
                long jNativeGetMcfTypeId24 = StreamCallbacks.CProxy.nativeGetMcfTypeId();
                StreamCallbacks.CProxy.sMcfTypeId = jNativeGetMcfTypeId24;
                return jNativeGetMcfTypeId24;
            case 24:
                GUj.A00();
                long j25 = StreamModel.sMcfTypeId;
                if (j25 != 0) {
                    return j25;
                }
                long jNativeGetMcfTypeId25 = StreamModel.nativeGetMcfTypeId();
                StreamModel.sMcfTypeId = jNativeGetMcfTypeId25;
                return jNativeGetMcfTypeId25;
            case 25:
                long j26 = VideoCapturePropertiesListener.CProxy.sMcfTypeId;
                if (j26 != 0) {
                    return j26;
                }
                long jNativeGetMcfTypeId26 = VideoCapturePropertiesListener.CProxy.nativeGetMcfTypeId();
                VideoCapturePropertiesListener.CProxy.sMcfTypeId = jNativeGetMcfTypeId26;
                return jNativeGetMcfTypeId26;
            case 26:
                long j27 = VideoStreamController.CProxy.sMcfTypeId;
                if (j27 != 0) {
                    return j27;
                }
                long jNativeGetMcfTypeId27 = VideoStreamController.CProxy.nativeGetMcfTypeId();
                VideoStreamController.CProxy.sMcfTypeId = jNativeGetMcfTypeId27;
                return jNativeGetMcfTypeId27;
            case 27:
                GUj.A00();
                long j28 = VideoStreamParams.sMcfTypeId;
                if (j28 != 0) {
                    return j28;
                }
                long jNativeGetMcfTypeId28 = VideoStreamParams.nativeGetMcfTypeId();
                VideoStreamParams.sMcfTypeId = jNativeGetMcfTypeId28;
                return jNativeGetMcfTypeId28;
            case 28:
                GUj.A00();
                long j29 = VideoStreamSendParams.sMcfTypeId;
                if (j29 != 0) {
                    return j29;
                }
                long jNativeGetMcfTypeId29 = VideoStreamSendParams.nativeGetMcfTypeId();
                VideoStreamSendParams.sMcfTypeId = jNativeGetMcfTypeId29;
                return jNativeGetMcfTypeId29;
            case 29:
                long j30 = ChatdSendStats.sMcfTypeId;
                if (j30 != 0) {
                    return j30;
                }
                long jNativeGetMcfTypeId30 = ChatdSendStats.nativeGetMcfTypeId();
                ChatdSendStats.sMcfTypeId = jNativeGetMcfTypeId30;
                return jNativeGetMcfTypeId30;
            case 30:
                long j31 = MessageReceiveCallbacks.CProxy.sMcfTypeId;
                if (j31 != 0) {
                    return j31;
                }
                long jNativeGetMcfTypeId31 = MessageReceiveCallbacks.CProxy.nativeGetMcfTypeId();
                MessageReceiveCallbacks.CProxy.sMcfTypeId = jNativeGetMcfTypeId31;
                return jNativeGetMcfTypeId31;
            case 31:
                GUi.A00();
                long j32 = MetricIdentifiers.sMcfTypeId;
                if (j32 != 0) {
                    return j32;
                }
                long jNativeGetMcfTypeId32 = MetricIdentifiers.nativeGetMcfTypeId();
                MetricIdentifiers.sMcfTypeId = jNativeGetMcfTypeId32;
                return jNativeGetMcfTypeId32;
            case 32:
                long j33 = SendMessageAttemptStats.sMcfTypeId;
                if (j33 != 0) {
                    return j33;
                }
                long jNativeGetMcfTypeId33 = SendMessageAttemptStats.nativeGetMcfTypeId();
                SendMessageAttemptStats.sMcfTypeId = jNativeGetMcfTypeId33;
                return jNativeGetMcfTypeId33;
            case 33:
                long j34 = SendMessageStats.sMcfTypeId;
                if (j34 != 0) {
                    return j34;
                }
                long jNativeGetMcfTypeId34 = SendMessageStats.nativeGetMcfTypeId();
                SendMessageStats.sMcfTypeId = jNativeGetMcfTypeId34;
                return jNativeGetMcfTypeId34;
            case 34:
                GUi.A00();
                long j35 = SignalingMessage.sMcfTypeId;
                if (j35 != 0) {
                    return j35;
                }
                long jNativeGetMcfTypeId35 = SignalingMessage.nativeGetMcfTypeId();
                SignalingMessage.sMcfTypeId = jNativeGetMcfTypeId35;
                return jNativeGetMcfTypeId35;
            case 35:
                GUi.A00();
                long j36 = SignalingMessageIncomingStats.sMcfTypeId;
                if (j36 != 0) {
                    return j36;
                }
                long jNativeGetMcfTypeId36 = SignalingMessageIncomingStats.nativeGetMcfTypeId();
                SignalingMessageIncomingStats.sMcfTypeId = jNativeGetMcfTypeId36;
                return jNativeGetMcfTypeId36;
            case 36:
                GUi.A00();
                long j37 = SignalingProtocolParams.sMcfTypeId;
                if (j37 != 0) {
                    return j37;
                }
                long jNativeGetMcfTypeId37 = SignalingProtocolParams.nativeGetMcfTypeId();
                SignalingProtocolParams.sMcfTypeId = jNativeGetMcfTypeId37;
                return jNativeGetMcfTypeId37;
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft /* 37 */:
                long j38 = SignalingTransportCallback.CProxy.sMcfTypeId;
                if (j38 != 0) {
                    return j38;
                }
                long jNativeGetMcfTypeId38 = SignalingTransportCallback.CProxy.nativeGetMcfTypeId();
                SignalingTransportCallback.CProxy.sMcfTypeId = jNativeGetMcfTypeId38;
                return jNativeGetMcfTypeId38;
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight /* 38 */:
                long j39 = SignalingTransportCallbackExt.CProxy.sMcfTypeId;
                if (j39 != 0) {
                    return j39;
                }
                long jNativeGetMcfTypeId39 = SignalingTransportCallbackExt.CProxy.nativeGetMcfTypeId();
                SignalingTransportCallbackExt.CProxy.sMcfTypeId = jNativeGetMcfTypeId39;
                return jNativeGetMcfTypeId39;
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop /* 39 */:
                long j40 = SignalingTransportProxy.CProxy.sMcfTypeId;
                if (j40 != 0) {
                    return j40;
                }
                long jNativeGetMcfTypeId40 = SignalingTransportProxy.CProxy.nativeGetMcfTypeId();
                SignalingTransportProxy.CProxy.sMcfTypeId = jNativeGetMcfTypeId40;
                return jNativeGetMcfTypeId40;
            case 40:
                long j41 = SignalingTransportSink.CProxy.sMcfTypeId;
                if (j41 != 0) {
                    return j41;
                }
                long jNativeGetMcfTypeId41 = SignalingTransportSink.CProxy.nativeGetMcfTypeId();
                SignalingTransportSink.CProxy.sMcfTypeId = jNativeGetMcfTypeId41;
                return jNativeGetMcfTypeId41;
            case R.styleable.maplibre_MapView_maplibre_uiHorizontalScrollGestures /* 41 */:
                long j42 = StatusUpdate.sMcfTypeId;
                if (j42 != 0) {
                    return j42;
                }
                long jNativeGetMcfTypeId42 = StatusUpdate.nativeGetMcfTypeId();
                StatusUpdate.sMcfTypeId = jNativeGetMcfTypeId42;
                return jNativeGetMcfTypeId42;
            case 42:
                GUi.A00();
                long j43 = UllcEdgerayAddress.sMcfTypeId;
                if (j43 != 0) {
                    return j43;
                }
                long jNativeGetMcfTypeId43 = UllcEdgerayAddress.nativeGetMcfTypeId();
                UllcEdgerayAddress.sMcfTypeId = jNativeGetMcfTypeId43;
                return jNativeGetMcfTypeId43;
            case R.styleable.maplibre_MapView_maplibre_uiLogoGravity /* 43 */:
                GUi.A00();
                long j44 = UllcParams.sMcfTypeId;
                if (j44 != 0) {
                    return j44;
                }
                long jNativeGetMcfTypeId44 = UllcParams.nativeGetMcfTypeId();
                UllcParams.sMcfTypeId = jNativeGetMcfTypeId44;
                return jNativeGetMcfTypeId44;
            case 44:
                long j45 = TslogApi.CProxy.sMcfTypeId;
                if (j45 != 0) {
                    return j45;
                }
                long jNativeGetMcfTypeId45 = TslogApi.CProxy.nativeGetMcfTypeId();
                TslogApi.CProxy.sMcfTypeId = jNativeGetMcfTypeId45;
                return jNativeGetMcfTypeId45;
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft /* 45 */:
                long j46 = TslogCounterApi.CProxy.sMcfTypeId;
                if (j46 != 0) {
                    return j46;
                }
                long jNativeGetMcfTypeId46 = TslogCounterApi.CProxy.nativeGetMcfTypeId();
                TslogCounterApi.CProxy.sMcfTypeId = jNativeGetMcfTypeId46;
                return jNativeGetMcfTypeId46;
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight /* 46 */:
                long j47 = TslogEngineApi.CProxy.sMcfTypeId;
                if (j47 != 0) {
                    return j47;
                }
                long jNativeGetMcfTypeId47 = TslogEngineApi.CProxy.nativeGetMcfTypeId();
                TslogEngineApi.CProxy.sMcfTypeId = jNativeGetMcfTypeId47;
                return jNativeGetMcfTypeId47;
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop /* 47 */:
                long j48 = TslogStreamApi.CProxy.sMcfTypeId;
                if (j48 != 0) {
                    return j48;
                }
                long jNativeGetMcfTypeId48 = TslogStreamApi.CProxy.nativeGetMcfTypeId();
                TslogStreamApi.CProxy.sMcfTypeId = jNativeGetMcfTypeId48;
                return jNativeGetMcfTypeId48;
            case 48:
                long j49 = MediaProcessor.CProxy.sMcfTypeId;
                if (j49 != 0) {
                    return j49;
                }
                long jNativeGetMcfTypeId49 = MediaProcessor.CProxy.nativeGetMcfTypeId();
                MediaProcessor.CProxy.sMcfTypeId = jNativeGetMcfTypeId49;
                return jNativeGetMcfTypeId49;
            case R.styleable.maplibre_MapView_maplibre_uiRotateGestures /* 49 */:
                long j50 = ProcessedFrameCallbacks.CProxy.sMcfTypeId;
                if (j50 != 0) {
                    return j50;
                }
                long jNativeGetMcfTypeId50 = ProcessedFrameCallbacks.CProxy.nativeGetMcfTypeId();
                ProcessedFrameCallbacks.CProxy.sMcfTypeId = jNativeGetMcfTypeId50;
                return jNativeGetMcfTypeId50;
            default:
                return 0L;
        }
    }
}
