package X;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.audiodevicestate.gen.AudioDeviceStateListener;
import com.facebook.rsys.audiodevicestate.manager.gen.AudioDeviceModuleLatch;
import com.facebook.rsys.audiodevicestate.manager.gen.AudioDeviceRtcSession;
import com.facebook.rsys.audiodevicestate.manager.gen.AudioDeviceRtcSessionCreationResult;
import com.facebook.rsys.audiodevicestate.manager.gen.AudioDeviceRtcSessionStartParams;
import com.facebook.rsys.audiodevicestate.manager.gen.AudioDeviceStateManager;
import com.facebook.rsys.audioevents.gen.AudioEventsModel;
import com.facebook.rsys.audiomodule.gen.AudioModule;
import com.facebook.rsys.base.gen.FeatureHolder;
import com.facebook.rsys.call.datamessage.gen.DataMessage;
import com.facebook.rsys.call.gen.AddUsersOptions;
import com.facebook.rsys.call.gen.CallModel;
import com.facebook.rsys.call.gen.CallNotification;
import com.facebook.rsys.call.gen.CallParticipant;
import com.facebook.rsys.call.gen.CallStartContext;
import com.facebook.rsys.call.gen.ParticipantMediaState;
import com.facebook.rsys.callcontext.gen.CallContext;
import com.facebook.rsys.callinfo.gen.CallInfo;
import com.facebook.rsys.callinfo.gen.CallInfoObserver;
import com.facebook.rsys.callinfo.gen.CallInfoReadCallback;
import com.facebook.rsys.callinfo.gen.UserProfile;
import com.facebook.rsys.callinfo.gen.UserProfilesReadCallback;
import com.facebook.rsys.callintent.gen.CallIntent;
import com.facebook.rsys.callintent.gen.CallIntentCreationResult;
import com.facebook.rsys.callintent.gen.CallIntentFactory;
import com.facebook.rsys.callintent.gen.CallMetadata;
import com.facebook.rsys.callintent.gen.IncomingCallInfo;
import com.facebook.rsys.callintent.gen.SignalingUserContext;
import com.facebook.rsys.callmanager.callclient.gen.CallManager;
import com.facebook.rsys.callmanager.callintentcommon.gen.InitCallConfig;
import com.facebook.rsys.callmanager.callintentcommon.gen.RejectCallParams;
import com.facebook.rsys.callmanager.gen.ApiBag;
import com.facebook.rsys.callmanager.gen.Call;
import com.facebook.rsys.callmanager.gen.CallApi;
import com.facebook.rsys.callmanager.gen.CallManagerConfig;
import com.facebook.rsys.callmanager.gen.CodecInfo;
import com.facebook.rsys.callmanager.gen.UserContext;
import com.facebook.rsys.camera.gen.Camera;
import com.facebook.rsys.camera.gen.CameraApi;
import com.facebook.rsys.camera.gen.CameraModel;
import com.facebook.rsys.camera.gen.CameraProxy;
import com.facebook.rsys.camera.gen.CameraStallHandler;
import com.facebook.rsys.crypto.gen.CryptoApi;
import com.facebook.rsys.crypto.gen.CryptoContextHolder;
import com.facebook.rsys.crypto.gen.CryptoE2eeModel;
import com.facebook.rsys.crypto.gen.CryptoParticipantIdentity;
import com.facebook.rsys.crypto.gen.ParticipantIdentityInfo;
import com.facebook.rsys.datachannel.gen.DataApi;
import com.facebook.rsys.datachannel.gen.DataChannelConfig;
import com.facebook.rsys.datachannel.gen.DataChannelMessageParams;
import org.maplibre.android.R;

/* renamed from: X.Fti, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8926Fti implements G50 {
    public final int $t;

    public C8926Fti(int i) {
        this.$t = i;
    }

    public static C8926Fti A00(int i) {
        return new C8926Fti(i);
    }

    @Override // X.G50
    public final /* bridge */ /* synthetic */ Object A7C(McfReference mcfReference) {
        switch (this.$t) {
            case 0:
                return AudioDeviceStateListener.CProxy.createFromMcfType(mcfReference);
            case 1:
                return AudioDeviceModuleLatch.CProxy.createFromMcfType(mcfReference);
            case 2:
                return AudioDeviceRtcSession.CProxy.createFromMcfType(mcfReference);
            case 3:
                GVh.A00();
                return AudioDeviceRtcSessionCreationResult.createFromMcfType(mcfReference);
            case 4:
                GVh.A00();
                return AudioDeviceRtcSessionStartParams.createFromMcfType(mcfReference);
            case 5:
                return AudioDeviceStateManager.CProxy.createFromMcfType(mcfReference);
            case 6:
                GYO.A00();
                return AudioEventsModel.createFromMcfType(mcfReference);
            case 7:
                return AudioModule.CProxy.createFromMcfType(mcfReference);
            case 8:
                return FeatureHolder.CProxy.createFromMcfType(mcfReference);
            case 9:
                GUY.A00();
                return DataMessage.createFromMcfType(mcfReference);
            case 10:
                GUZ.A00();
                return AddUsersOptions.createFromMcfType(mcfReference);
            case 11:
                GUZ.A00();
                return CallModel.createFromMcfType(mcfReference);
            case 12:
                GUZ.A00();
                return CallNotification.createFromMcfType(mcfReference);
            case 13:
                GUZ.A00();
                return CallParticipant.createFromMcfType(mcfReference);
            case 14:
                GUZ.A00();
                return CallStartContext.createFromMcfType(mcfReference);
            case 15:
                GUZ.A00();
                return ParticipantMediaState.createFromMcfType(mcfReference);
            case 16:
                GX0.A00();
                return CallContext.createFromMcfType(mcfReference);
            case 17:
                GUa.A00();
                return CallInfo.createFromMcfType(mcfReference);
            case 18:
                return CallInfoObserver.CProxy.createFromMcfType(mcfReference);
            case 19:
                return CallInfoReadCallback.CProxy.createFromMcfType(mcfReference);
            case 20:
                GUa.A00();
                return UserProfile.createFromMcfType(mcfReference);
            case 21:
                return UserProfilesReadCallback.CProxy.createFromMcfType(mcfReference);
            case 22:
                GUb.A00();
                return CallIntent.createFromMcfType(mcfReference);
            case 23:
                GUb.A00();
                return CallIntentCreationResult.createFromMcfType(mcfReference);
            case 24:
                return CallIntentFactory.CProxy.createFromMcfType(mcfReference);
            case 25:
                GUb.A00();
                return CallMetadata.createFromMcfType(mcfReference);
            case 26:
                GUb.A00();
                return IncomingCallInfo.createFromMcfType(mcfReference);
            case 27:
                return SignalingUserContext.createFromMcfType(mcfReference);
            case 28:
                return CallManager.CProxy.createFromMcfType(mcfReference);
            case 29:
                GYh.A00();
                return InitCallConfig.createFromMcfType(mcfReference);
            case 30:
                GYh.A00();
                return RejectCallParams.createFromMcfType(mcfReference);
            case 31:
                return ApiBag.createFromMcfType(mcfReference);
            case 32:
                return Call.CProxy.createFromMcfType(mcfReference);
            case 33:
                return CallApi.CProxy.createFromMcfType(mcfReference);
            case 34:
                GUR.A00();
                return CallManagerConfig.createFromMcfType(mcfReference);
            case 35:
                return CodecInfo.createFromMcfType(mcfReference);
            case 36:
                return UserContext.createFromMcfType(mcfReference);
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft /* 37 */:
                GZ7.A00();
                return Camera.createFromMcfType(mcfReference);
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight /* 38 */:
                return CameraApi.CProxy.createFromMcfType(mcfReference);
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop /* 39 */:
                GZ7.A00();
                return CameraModel.createFromMcfType(mcfReference);
            case 40:
                return CameraProxy.CProxy.createFromMcfType(mcfReference);
            case R.styleable.maplibre_MapView_maplibre_uiHorizontalScrollGestures /* 41 */:
                return CameraStallHandler.CProxy.createFromMcfType(mcfReference);
            case 42:
                return CryptoApi.CProxy.createFromMcfType(mcfReference);
            case R.styleable.maplibre_MapView_maplibre_uiLogoGravity /* 43 */:
                return CryptoContextHolder.createFromMcfType(mcfReference);
            case 44:
                GZ8.A00();
                return CryptoE2eeModel.createFromMcfType(mcfReference);
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft /* 45 */:
                GZ8.A00();
                return CryptoParticipantIdentity.createFromMcfType(mcfReference);
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight /* 46 */:
                GZ8.A00();
                return ParticipantIdentityInfo.createFromMcfType(mcfReference);
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop /* 47 */:
                return DataApi.CProxy.createFromMcfType(mcfReference);
            case 48:
                return DataChannelConfig.createFromMcfType(mcfReference);
            case R.styleable.maplibre_MapView_maplibre_uiRotateGestures /* 49 */:
                return DataChannelMessageParams.createFromMcfType(mcfReference);
            default:
                return null;
        }
    }

    @Override // X.G50
    public final Class<AudioDeviceStateListener> AHp() {
        switch (this.$t) {
            case 0:
                return AudioDeviceStateListener.class;
            case 1:
                return AudioDeviceModuleLatch.class;
            case 2:
                return AudioDeviceRtcSession.class;
            case 3:
                return AudioDeviceRtcSessionCreationResult.class;
            case 4:
                return AudioDeviceRtcSessionStartParams.class;
            case 5:
                return AudioDeviceStateManager.class;
            case 6:
                return AudioEventsModel.class;
            case 7:
                return AudioModule.class;
            case 8:
                return FeatureHolder.class;
            case 9:
                return DataMessage.class;
            case 10:
                return AddUsersOptions.class;
            case 11:
                return CallModel.class;
            case 12:
                return CallNotification.class;
            case 13:
                return CallParticipant.class;
            case 14:
                return CallStartContext.class;
            case 15:
                return ParticipantMediaState.class;
            case 16:
                return CallContext.class;
            case 17:
                return CallInfo.class;
            case 18:
                return CallInfoObserver.class;
            case 19:
                return CallInfoReadCallback.class;
            case 20:
                return UserProfile.class;
            case 21:
                return UserProfilesReadCallback.class;
            case 22:
                return CallIntent.class;
            case 23:
                return CallIntentCreationResult.class;
            case 24:
                return CallIntentFactory.class;
            case 25:
                return CallMetadata.class;
            case 26:
                return IncomingCallInfo.class;
            case 27:
                return SignalingUserContext.class;
            case 28:
                return CallManager.class;
            case 29:
                return InitCallConfig.class;
            case 30:
                return RejectCallParams.class;
            case 31:
                return ApiBag.class;
            case 32:
                return Call.class;
            case 33:
                return CallApi.class;
            case 34:
                return CallManagerConfig.class;
            case 35:
                return CodecInfo.class;
            case 36:
                return UserContext.class;
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft /* 37 */:
                return Camera.class;
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight /* 38 */:
                return CameraApi.class;
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop /* 39 */:
                return CameraModel.class;
            case 40:
                return CameraProxy.class;
            case R.styleable.maplibre_MapView_maplibre_uiHorizontalScrollGestures /* 41 */:
                return CameraStallHandler.class;
            case 42:
                return CryptoApi.class;
            case R.styleable.maplibre_MapView_maplibre_uiLogoGravity /* 43 */:
                return CryptoContextHolder.class;
            case 44:
                return CryptoE2eeModel.class;
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft /* 45 */:
                return CryptoParticipantIdentity.class;
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight /* 46 */:
                return ParticipantIdentityInfo.class;
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop /* 47 */:
                return DataApi.class;
            case 48:
                return DataChannelConfig.class;
            case R.styleable.maplibre_MapView_maplibre_uiRotateGestures /* 49 */:
                return DataChannelMessageParams.class;
            default:
                return null;
        }
    }

    @Override // X.G50
    public final long AMC() {
        switch (this.$t) {
            case 0:
                long j = AudioDeviceStateListener.CProxy.sMcfTypeId;
                if (j != 0) {
                    return j;
                }
                long jNativeGetMcfTypeId = AudioDeviceStateListener.CProxy.nativeGetMcfTypeId();
                AudioDeviceStateListener.CProxy.sMcfTypeId = jNativeGetMcfTypeId;
                return jNativeGetMcfTypeId;
            case 1:
                long j2 = AudioDeviceModuleLatch.CProxy.sMcfTypeId;
                if (j2 != 0) {
                    return j2;
                }
                long jNativeGetMcfTypeId2 = AudioDeviceModuleLatch.CProxy.nativeGetMcfTypeId();
                AudioDeviceModuleLatch.CProxy.sMcfTypeId = jNativeGetMcfTypeId2;
                return jNativeGetMcfTypeId2;
            case 2:
                long j3 = AudioDeviceRtcSession.CProxy.sMcfTypeId;
                if (j3 != 0) {
                    return j3;
                }
                long jNativeGetMcfTypeId3 = AudioDeviceRtcSession.CProxy.nativeGetMcfTypeId();
                AudioDeviceRtcSession.CProxy.sMcfTypeId = jNativeGetMcfTypeId3;
                return jNativeGetMcfTypeId3;
            case 3:
                GVh.A00();
                long j4 = AudioDeviceRtcSessionCreationResult.sMcfTypeId;
                if (j4 != 0) {
                    return j4;
                }
                long jNativeGetMcfTypeId4 = AudioDeviceRtcSessionCreationResult.nativeGetMcfTypeId();
                AudioDeviceRtcSessionCreationResult.sMcfTypeId = jNativeGetMcfTypeId4;
                return jNativeGetMcfTypeId4;
            case 4:
                GVh.A00();
                long j5 = AudioDeviceRtcSessionStartParams.sMcfTypeId;
                if (j5 != 0) {
                    return j5;
                }
                long jNativeGetMcfTypeId5 = AudioDeviceRtcSessionStartParams.nativeGetMcfTypeId();
                AudioDeviceRtcSessionStartParams.sMcfTypeId = jNativeGetMcfTypeId5;
                return jNativeGetMcfTypeId5;
            case 5:
                long j6 = AudioDeviceStateManager.CProxy.sMcfTypeId;
                if (j6 != 0) {
                    return j6;
                }
                long jNativeGetMcfTypeId6 = AudioDeviceStateManager.CProxy.nativeGetMcfTypeId();
                AudioDeviceStateManager.CProxy.sMcfTypeId = jNativeGetMcfTypeId6;
                return jNativeGetMcfTypeId6;
            case 6:
                GYO.A00();
                long j7 = AudioEventsModel.sMcfTypeId;
                if (j7 != 0) {
                    return j7;
                }
                long jNativeGetMcfTypeId7 = AudioEventsModel.nativeGetMcfTypeId();
                AudioEventsModel.sMcfTypeId = jNativeGetMcfTypeId7;
                return jNativeGetMcfTypeId7;
            case 7:
                long j8 = AudioModule.CProxy.sMcfTypeId;
                if (j8 != 0) {
                    return j8;
                }
                long jNativeGetMcfTypeId8 = AudioModule.CProxy.nativeGetMcfTypeId();
                AudioModule.CProxy.sMcfTypeId = jNativeGetMcfTypeId8;
                return jNativeGetMcfTypeId8;
            case 8:
                long j9 = FeatureHolder.CProxy.sMcfTypeId;
                if (j9 != 0) {
                    return j9;
                }
                long jNativeGetMcfTypeId9 = FeatureHolder.CProxy.nativeGetMcfTypeId();
                FeatureHolder.CProxy.sMcfTypeId = jNativeGetMcfTypeId9;
                return jNativeGetMcfTypeId9;
            case 9:
                GUY.A00();
                long j10 = DataMessage.sMcfTypeId;
                if (j10 != 0) {
                    return j10;
                }
                long jNativeGetMcfTypeId10 = DataMessage.nativeGetMcfTypeId();
                DataMessage.sMcfTypeId = jNativeGetMcfTypeId10;
                return jNativeGetMcfTypeId10;
            case 10:
                GUZ.A00();
                long j11 = AddUsersOptions.sMcfTypeId;
                if (j11 != 0) {
                    return j11;
                }
                long jNativeGetMcfTypeId11 = AddUsersOptions.nativeGetMcfTypeId();
                AddUsersOptions.sMcfTypeId = jNativeGetMcfTypeId11;
                return jNativeGetMcfTypeId11;
            case 11:
                GUZ.A00();
                long j12 = CallModel.sMcfTypeId;
                if (j12 != 0) {
                    return j12;
                }
                long jNativeGetMcfTypeId12 = CallModel.nativeGetMcfTypeId();
                CallModel.sMcfTypeId = jNativeGetMcfTypeId12;
                return jNativeGetMcfTypeId12;
            case 12:
                GUZ.A00();
                long j13 = CallNotification.sMcfTypeId;
                if (j13 != 0) {
                    return j13;
                }
                long jNativeGetMcfTypeId13 = CallNotification.nativeGetMcfTypeId();
                CallNotification.sMcfTypeId = jNativeGetMcfTypeId13;
                return jNativeGetMcfTypeId13;
            case 13:
                GUZ.A00();
                long j14 = CallParticipant.sMcfTypeId;
                if (j14 != 0) {
                    return j14;
                }
                long jNativeGetMcfTypeId14 = CallParticipant.nativeGetMcfTypeId();
                CallParticipant.sMcfTypeId = jNativeGetMcfTypeId14;
                return jNativeGetMcfTypeId14;
            case 14:
                GUZ.A00();
                long j15 = CallStartContext.sMcfTypeId;
                if (j15 != 0) {
                    return j15;
                }
                long jNativeGetMcfTypeId15 = CallStartContext.nativeGetMcfTypeId();
                CallStartContext.sMcfTypeId = jNativeGetMcfTypeId15;
                return jNativeGetMcfTypeId15;
            case 15:
                GUZ.A00();
                long j16 = ParticipantMediaState.sMcfTypeId;
                if (j16 != 0) {
                    return j16;
                }
                long jNativeGetMcfTypeId16 = ParticipantMediaState.nativeGetMcfTypeId();
                ParticipantMediaState.sMcfTypeId = jNativeGetMcfTypeId16;
                return jNativeGetMcfTypeId16;
            case 16:
                GX0.A00();
                long j17 = CallContext.sMcfTypeId;
                if (j17 != 0) {
                    return j17;
                }
                long jNativeGetMcfTypeId17 = CallContext.nativeGetMcfTypeId();
                CallContext.sMcfTypeId = jNativeGetMcfTypeId17;
                return jNativeGetMcfTypeId17;
            case 17:
                GUa.A00();
                long j18 = CallInfo.sMcfTypeId;
                if (j18 != 0) {
                    return j18;
                }
                long jNativeGetMcfTypeId18 = CallInfo.nativeGetMcfTypeId();
                CallInfo.sMcfTypeId = jNativeGetMcfTypeId18;
                return jNativeGetMcfTypeId18;
            case 18:
                long j19 = CallInfoObserver.CProxy.sMcfTypeId;
                if (j19 != 0) {
                    return j19;
                }
                long jNativeGetMcfTypeId19 = CallInfoObserver.CProxy.nativeGetMcfTypeId();
                CallInfoObserver.CProxy.sMcfTypeId = jNativeGetMcfTypeId19;
                return jNativeGetMcfTypeId19;
            case 19:
                long j20 = CallInfoReadCallback.CProxy.sMcfTypeId;
                if (j20 != 0) {
                    return j20;
                }
                long jNativeGetMcfTypeId20 = CallInfoReadCallback.CProxy.nativeGetMcfTypeId();
                CallInfoReadCallback.CProxy.sMcfTypeId = jNativeGetMcfTypeId20;
                return jNativeGetMcfTypeId20;
            case 20:
                GUa.A00();
                long j21 = UserProfile.sMcfTypeId;
                if (j21 != 0) {
                    return j21;
                }
                long jNativeGetMcfTypeId21 = UserProfile.nativeGetMcfTypeId();
                UserProfile.sMcfTypeId = jNativeGetMcfTypeId21;
                return jNativeGetMcfTypeId21;
            case 21:
                long j22 = UserProfilesReadCallback.CProxy.sMcfTypeId;
                if (j22 != 0) {
                    return j22;
                }
                long jNativeGetMcfTypeId22 = UserProfilesReadCallback.CProxy.nativeGetMcfTypeId();
                UserProfilesReadCallback.CProxy.sMcfTypeId = jNativeGetMcfTypeId22;
                return jNativeGetMcfTypeId22;
            case 22:
                GUb.A00();
                long j23 = CallIntent.sMcfTypeId;
                if (j23 != 0) {
                    return j23;
                }
                long jNativeGetMcfTypeId23 = CallIntent.nativeGetMcfTypeId();
                CallIntent.sMcfTypeId = jNativeGetMcfTypeId23;
                return jNativeGetMcfTypeId23;
            case 23:
                GUb.A00();
                long j24 = CallIntentCreationResult.sMcfTypeId;
                if (j24 != 0) {
                    return j24;
                }
                long jNativeGetMcfTypeId24 = CallIntentCreationResult.nativeGetMcfTypeId();
                CallIntentCreationResult.sMcfTypeId = jNativeGetMcfTypeId24;
                return jNativeGetMcfTypeId24;
            case 24:
                long j25 = CallIntentFactory.CProxy.sMcfTypeId;
                if (j25 != 0) {
                    return j25;
                }
                long jNativeGetMcfTypeId25 = CallIntentFactory.CProxy.nativeGetMcfTypeId();
                CallIntentFactory.CProxy.sMcfTypeId = jNativeGetMcfTypeId25;
                return jNativeGetMcfTypeId25;
            case 25:
                GUb.A00();
                long j26 = CallMetadata.sMcfTypeId;
                if (j26 != 0) {
                    return j26;
                }
                long jNativeGetMcfTypeId26 = CallMetadata.nativeGetMcfTypeId();
                CallMetadata.sMcfTypeId = jNativeGetMcfTypeId26;
                return jNativeGetMcfTypeId26;
            case 26:
                GUb.A00();
                long j27 = IncomingCallInfo.sMcfTypeId;
                if (j27 != 0) {
                    return j27;
                }
                long jNativeGetMcfTypeId27 = IncomingCallInfo.nativeGetMcfTypeId();
                IncomingCallInfo.sMcfTypeId = jNativeGetMcfTypeId27;
                return jNativeGetMcfTypeId27;
            case 27:
                long j28 = SignalingUserContext.sMcfTypeId;
                if (j28 != 0) {
                    return j28;
                }
                long jNativeGetMcfTypeId28 = SignalingUserContext.nativeGetMcfTypeId();
                SignalingUserContext.sMcfTypeId = jNativeGetMcfTypeId28;
                return jNativeGetMcfTypeId28;
            case 28:
                long j29 = CallManager.CProxy.sMcfTypeId;
                if (j29 != 0) {
                    return j29;
                }
                long jNativeGetMcfTypeId29 = CallManager.CProxy.nativeGetMcfTypeId();
                CallManager.CProxy.sMcfTypeId = jNativeGetMcfTypeId29;
                return jNativeGetMcfTypeId29;
            case 29:
                GYh.A00();
                long j30 = InitCallConfig.sMcfTypeId;
                if (j30 != 0) {
                    return j30;
                }
                long jNativeGetMcfTypeId30 = InitCallConfig.nativeGetMcfTypeId();
                InitCallConfig.sMcfTypeId = jNativeGetMcfTypeId30;
                return jNativeGetMcfTypeId30;
            case 30:
                GYh.A00();
                long j31 = RejectCallParams.sMcfTypeId;
                if (j31 != 0) {
                    return j31;
                }
                long jNativeGetMcfTypeId31 = RejectCallParams.nativeGetMcfTypeId();
                RejectCallParams.sMcfTypeId = jNativeGetMcfTypeId31;
                return jNativeGetMcfTypeId31;
            case 31:
                long j32 = ApiBag.sMcfTypeId;
                if (j32 != 0) {
                    return j32;
                }
                long jNativeGetMcfTypeId32 = ApiBag.nativeGetMcfTypeId();
                ApiBag.sMcfTypeId = jNativeGetMcfTypeId32;
                return jNativeGetMcfTypeId32;
            case 32:
                long j33 = Call.CProxy.sMcfTypeId;
                if (j33 != 0) {
                    return j33;
                }
                long jNativeGetMcfTypeId33 = Call.CProxy.nativeGetMcfTypeId();
                Call.CProxy.sMcfTypeId = jNativeGetMcfTypeId33;
                return jNativeGetMcfTypeId33;
            case 33:
                long j34 = CallApi.CProxy.sMcfTypeId;
                if (j34 != 0) {
                    return j34;
                }
                long jNativeGetMcfTypeId34 = CallApi.CProxy.nativeGetMcfTypeId();
                CallApi.CProxy.sMcfTypeId = jNativeGetMcfTypeId34;
                return jNativeGetMcfTypeId34;
            case 34:
                GUR.A00();
                long j35 = CallManagerConfig.sMcfTypeId;
                if (j35 != 0) {
                    return j35;
                }
                long jNativeGetMcfTypeId35 = CallManagerConfig.nativeGetMcfTypeId();
                CallManagerConfig.sMcfTypeId = jNativeGetMcfTypeId35;
                return jNativeGetMcfTypeId35;
            case 35:
                long j36 = CodecInfo.sMcfTypeId;
                if (j36 != 0) {
                    return j36;
                }
                long jNativeGetMcfTypeId36 = CodecInfo.nativeGetMcfTypeId();
                CodecInfo.sMcfTypeId = jNativeGetMcfTypeId36;
                return jNativeGetMcfTypeId36;
            case 36:
                long j37 = UserContext.sMcfTypeId;
                if (j37 != 0) {
                    return j37;
                }
                long jNativeGetMcfTypeId37 = UserContext.nativeGetMcfTypeId();
                UserContext.sMcfTypeId = jNativeGetMcfTypeId37;
                return jNativeGetMcfTypeId37;
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft /* 37 */:
                GZ7.A00();
                long j38 = Camera.sMcfTypeId;
                if (j38 != 0) {
                    return j38;
                }
                long jNativeGetMcfTypeId38 = Camera.nativeGetMcfTypeId();
                Camera.sMcfTypeId = jNativeGetMcfTypeId38;
                return jNativeGetMcfTypeId38;
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight /* 38 */:
                long j39 = CameraApi.CProxy.sMcfTypeId;
                if (j39 != 0) {
                    return j39;
                }
                long jNativeGetMcfTypeId39 = CameraApi.CProxy.nativeGetMcfTypeId();
                CameraApi.CProxy.sMcfTypeId = jNativeGetMcfTypeId39;
                return jNativeGetMcfTypeId39;
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop /* 39 */:
                GZ7.A00();
                long j40 = CameraModel.sMcfTypeId;
                if (j40 != 0) {
                    return j40;
                }
                long jNativeGetMcfTypeId40 = CameraModel.nativeGetMcfTypeId();
                CameraModel.sMcfTypeId = jNativeGetMcfTypeId40;
                return jNativeGetMcfTypeId40;
            case 40:
                long j41 = CameraProxy.CProxy.sMcfTypeId;
                if (j41 != 0) {
                    return j41;
                }
                long jNativeGetMcfTypeId41 = CameraProxy.CProxy.nativeGetMcfTypeId();
                CameraProxy.CProxy.sMcfTypeId = jNativeGetMcfTypeId41;
                return jNativeGetMcfTypeId41;
            case R.styleable.maplibre_MapView_maplibre_uiHorizontalScrollGestures /* 41 */:
                long j42 = CameraStallHandler.CProxy.sMcfTypeId;
                if (j42 != 0) {
                    return j42;
                }
                long jNativeGetMcfTypeId42 = CameraStallHandler.CProxy.nativeGetMcfTypeId();
                CameraStallHandler.CProxy.sMcfTypeId = jNativeGetMcfTypeId42;
                return jNativeGetMcfTypeId42;
            case 42:
                long j43 = CryptoApi.CProxy.sMcfTypeId;
                if (j43 != 0) {
                    return j43;
                }
                long jNativeGetMcfTypeId43 = CryptoApi.CProxy.nativeGetMcfTypeId();
                CryptoApi.CProxy.sMcfTypeId = jNativeGetMcfTypeId43;
                return jNativeGetMcfTypeId43;
            case R.styleable.maplibre_MapView_maplibre_uiLogoGravity /* 43 */:
                long j44 = CryptoContextHolder.sMcfTypeId;
                if (j44 != 0) {
                    return j44;
                }
                long jNativeGetMcfTypeId44 = CryptoContextHolder.nativeGetMcfTypeId();
                CryptoContextHolder.sMcfTypeId = jNativeGetMcfTypeId44;
                return jNativeGetMcfTypeId44;
            case 44:
                GZ8.A00();
                long j45 = CryptoE2eeModel.sMcfTypeId;
                if (j45 != 0) {
                    return j45;
                }
                long jNativeGetMcfTypeId45 = CryptoE2eeModel.nativeGetMcfTypeId();
                CryptoE2eeModel.sMcfTypeId = jNativeGetMcfTypeId45;
                return jNativeGetMcfTypeId45;
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft /* 45 */:
                GZ8.A00();
                long j46 = CryptoParticipantIdentity.sMcfTypeId;
                if (j46 != 0) {
                    return j46;
                }
                long jNativeGetMcfTypeId46 = CryptoParticipantIdentity.nativeGetMcfTypeId();
                CryptoParticipantIdentity.sMcfTypeId = jNativeGetMcfTypeId46;
                return jNativeGetMcfTypeId46;
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight /* 46 */:
                GZ8.A00();
                long j47 = ParticipantIdentityInfo.sMcfTypeId;
                if (j47 != 0) {
                    return j47;
                }
                long jNativeGetMcfTypeId47 = ParticipantIdentityInfo.nativeGetMcfTypeId();
                ParticipantIdentityInfo.sMcfTypeId = jNativeGetMcfTypeId47;
                return jNativeGetMcfTypeId47;
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop /* 47 */:
                long j48 = DataApi.CProxy.sMcfTypeId;
                if (j48 != 0) {
                    return j48;
                }
                long jNativeGetMcfTypeId48 = DataApi.CProxy.nativeGetMcfTypeId();
                DataApi.CProxy.sMcfTypeId = jNativeGetMcfTypeId48;
                return jNativeGetMcfTypeId48;
            case 48:
                long j49 = DataChannelConfig.sMcfTypeId;
                if (j49 != 0) {
                    return j49;
                }
                long jNativeGetMcfTypeId49 = DataChannelConfig.nativeGetMcfTypeId();
                DataChannelConfig.sMcfTypeId = jNativeGetMcfTypeId49;
                return jNativeGetMcfTypeId49;
            case R.styleable.maplibre_MapView_maplibre_uiRotateGestures /* 49 */:
                long j50 = DataChannelMessageParams.sMcfTypeId;
                if (j50 != 0) {
                    return j50;
                }
                long jNativeGetMcfTypeId50 = DataChannelMessageParams.nativeGetMcfTypeId();
                DataChannelMessageParams.sMcfTypeId = jNativeGetMcfTypeId50;
                return jNativeGetMcfTypeId50;
            default:
                return 0L;
        }
    }
}
