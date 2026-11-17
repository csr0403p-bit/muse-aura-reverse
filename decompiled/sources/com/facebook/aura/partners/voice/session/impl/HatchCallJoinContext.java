package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BFI;
import X.BLG;
import X.BV4;
import X.Bs8;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C10649I0t;
import X.C20Q;
import X.C27k;
import X.C3cG;
import X.C3cH;
import X.C60R;
import X.C7384Etj;
import X.Ey9;
import X.G0U;
import X.GAt;
import X.HtJ;
import X.HwN;
import X.HzP;
import X.InterfaceC10560Hsz;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;
import com.facebook.aura.partners.voice.infra.HatchVideoCrop;
import com.facebook.aura.partners.voice.intf.VoiceAudioOnlyReason;
import com.facebook.aura.partners.voice.intf.VoiceCallEntryPoint;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class HatchCallJoinContext {
    public PendingBind endedBind;
    public final AtomicReference<State> state = BV4.A16(new State(0, null, null, false));
    public final Object lifecycleLock = C3cG.A0T();
    public final BLG<JoinRetry> lastJoinRetry = C3cG.A14(HwN.A01);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public final class AvatarUpdatingPresentation {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ AvatarUpdatingPresentation[] $VALUES;
        public static final AvatarUpdatingPresentation NEW_STILL;
        public static final AvatarUpdatingPresentation PREVIOUS_LIVE;
        public final String wireValue;

        static {
            AvatarUpdatingPresentation avatarUpdatingPresentation = new AvatarUpdatingPresentation("PREVIOUS_LIVE", 0, "previous_live");
            PREVIOUS_LIVE = avatarUpdatingPresentation;
            AvatarUpdatingPresentation avatarUpdatingPresentation2 = new AvatarUpdatingPresentation("NEW_STILL", 1, "new_still");
            NEW_STILL = avatarUpdatingPresentation2;
            AvatarUpdatingPresentation[] avatarUpdatingPresentationArr = {avatarUpdatingPresentation, avatarUpdatingPresentation2};
            $VALUES = avatarUpdatingPresentationArr;
            $ENTRIES = C3cG.A0w(avatarUpdatingPresentationArr);
        }

        public static Ey9<AvatarUpdatingPresentation> getEntries() {
            return $ENTRIES;
        }

        public static AvatarUpdatingPresentation valueOf(String str) {
            return (AvatarUpdatingPresentation) Enum.valueOf(AvatarUpdatingPresentation.class, str);
        }

        public static AvatarUpdatingPresentation[] values() {
            return (AvatarUpdatingPresentation[]) $VALUES.clone();
        }

        public final String getWireValue() {
            return this.wireValue;
        }

        public AvatarUpdatingPresentation(String str, int i, String str2) {
            this.wireValue = str2;
        }
    }

    /* loaded from: classes2.dex */
    public final class AvatarUpdatingStart extends C06G {
        public final String awaitedStem;
        public final AvatarUpdatingPresentation presentation;
        public final String previousImagePath;
        public final String previousStem;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof AvatarUpdatingStart) {
                    AvatarUpdatingStart avatarUpdatingStart = (AvatarUpdatingStart) obj;
                    if (this.presentation != avatarUpdatingStart.presentation || !C7384Etj.areEqual(this.awaitedStem, avatarUpdatingStart.awaitedStem) || !C7384Etj.areEqual(this.previousStem, avatarUpdatingStart.previousStem) || !C7384Etj.areEqual(this.previousImagePath, avatarUpdatingStart.previousImagePath)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ AvatarUpdatingStart copy$default(AvatarUpdatingStart avatarUpdatingStart, AvatarUpdatingPresentation avatarUpdatingPresentation, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                avatarUpdatingPresentation = avatarUpdatingStart.presentation;
            }
            if ((i & 2) != 0) {
                str = avatarUpdatingStart.awaitedStem;
            }
            if ((i & 4) != 0) {
                str2 = avatarUpdatingStart.previousStem;
            }
            if ((i & 8) != 0) {
                str3 = avatarUpdatingStart.previousImagePath;
            }
            return new AvatarUpdatingStart(avatarUpdatingPresentation, str, str2, str3);
        }

        public final AvatarUpdatingPresentation component1() {
            return this.presentation;
        }

        public final String component2() {
            return this.awaitedStem;
        }

        public final String component3() {
            return this.previousStem;
        }

        public final String component4() {
            return this.previousImagePath;
        }

        public final AvatarUpdatingStart copy(AvatarUpdatingPresentation avatarUpdatingPresentation, String str, String str2, String str3) {
            return new AvatarUpdatingStart(avatarUpdatingPresentation, str, str2, str3);
        }

        public final String getAwaitedStem() {
            return this.awaitedStem;
        }

        public final AvatarUpdatingPresentation getPresentation() {
            return this.presentation;
        }

        public final String getPreviousImagePath() {
            return this.previousImagePath;
        }

        public final String getPreviousStem() {
            return this.previousStem;
        }

        public int hashCode() {
            return (((((AnonymousClass006.A0D(this.presentation) * 31) + AnonymousClass006.A0G(this.awaitedStem)) * 31) + AnonymousClass006.A0G(this.previousStem)) * 31) + AnonymousClass005.A0H(this.previousImagePath);
        }

        public AvatarUpdatingStart(AvatarUpdatingPresentation avatarUpdatingPresentation, String str, String str2, String str3) {
            this.presentation = avatarUpdatingPresentation;
            this.awaitedStem = str;
            this.previousStem = str2;
            this.previousImagePath = str3;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class BindOutcome {
        public final CallAdmission admission;
        public final boolean bound;
        public final JoinFailure failure;
        public final boolean serverVideoDisabled;

        public final CallAdmission getAdmission() {
            return this.admission;
        }

        public final boolean getBound() {
            return this.bound;
        }

        public final JoinFailure getFailure() {
            return this.failure;
        }

        public final boolean getServerVideoDisabled() {
            return this.serverVideoDisabled;
        }

        public BindOutcome(boolean z, JoinFailure joinFailure, CallAdmission callAdmission, boolean z2) {
            this.bound = z;
            this.failure = joinFailure;
            this.admission = callAdmission;
            this.serverVideoDisabled = z2;
        }

        public /* synthetic */ BindOutcome(boolean z, JoinFailure joinFailure, CallAdmission callAdmission, boolean z2, int i, C06H c06h) {
            this(z, (i & 2) != 0 ? null : joinFailure, (i & 4) != 0 ? null : callAdmission, (i & 8) != 0 ? false : z2);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class BindResult {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ BindResult[] $VALUES;
        public static final BindResult BOUND;
        public static final BindResult FAILED;
        public static final BindResult UNBOUND;

        static {
            BindResult bindResult = new BindResult("BOUND", 0);
            BOUND = bindResult;
            BindResult bindResult2 = new BindResult("UNBOUND", 1);
            UNBOUND = bindResult2;
            BindResult bindResult3 = new BindResult(CvmMigrationStatusJson.STAGE_FAILED, 2);
            FAILED = bindResult3;
            BindResult[] bindResultArr = {bindResult, bindResult2, bindResult3};
            $VALUES = bindResultArr;
            $ENTRIES = C3cG.A0w(bindResultArr);
        }

        public static Ey9<BindResult> getEntries() {
            return $ENTRIES;
        }

        public static BindResult valueOf(String str) {
            return (BindResult) Enum.valueOf(BindResult.class, str);
        }

        public static BindResult[] values() {
            return (BindResult[]) $VALUES.clone();
        }

        public BindResult(String str, int i) {
        }
    }

    /* loaded from: classes2.dex */
    public final class CallAdmission extends C06G {
        public final boolean avatarUpdating;
        public final AvatarUpdatingStart avatarUpdatingStart;
        public final boolean darkPortrait;
        public final HatchVideoCrop portraitCrop;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof CallAdmission) {
                    CallAdmission callAdmission = (CallAdmission) obj;
                    if (!C7384Etj.areEqual(this.portraitCrop, callAdmission.portraitCrop) || this.avatarUpdating != callAdmission.avatarUpdating || !C7384Etj.areEqual(this.avatarUpdatingStart, callAdmission.avatarUpdatingStart) || this.darkPortrait != callAdmission.darkPortrait) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ CallAdmission copy$default(CallAdmission callAdmission, HatchVideoCrop hatchVideoCrop, boolean z, AvatarUpdatingStart avatarUpdatingStart, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                hatchVideoCrop = callAdmission.portraitCrop;
            }
            if ((i & 2) != 0) {
                z = callAdmission.avatarUpdating;
            }
            if ((i & 4) != 0) {
                avatarUpdatingStart = callAdmission.avatarUpdatingStart;
            }
            if ((i & 8) != 0) {
                z2 = callAdmission.darkPortrait;
            }
            return new CallAdmission(hatchVideoCrop, z, avatarUpdatingStart, z2);
        }

        public final HatchVideoCrop component1() {
            return this.portraitCrop;
        }

        public final boolean component2() {
            return this.avatarUpdating;
        }

        public final AvatarUpdatingStart component3() {
            return this.avatarUpdatingStart;
        }

        public final boolean component4() {
            return this.darkPortrait;
        }

        public final CallAdmission copy(HatchVideoCrop hatchVideoCrop, boolean z, AvatarUpdatingStart avatarUpdatingStart, boolean z2) {
            return new CallAdmission(hatchVideoCrop, z, avatarUpdatingStart, z2);
        }

        public final boolean getAvatarUpdating() {
            return this.avatarUpdating;
        }

        public final AvatarUpdatingStart getAvatarUpdatingStart() {
            return this.avatarUpdatingStart;
        }

        public final boolean getDarkPortrait() {
            return this.darkPortrait;
        }

        public final HatchVideoCrop getPortraitCrop() {
            return this.portraitCrop;
        }

        public int hashCode() {
            return C0KA.A00((C0KA.A01(AnonymousClass006.A0D(this.portraitCrop) * 31, this.avatarUpdating) + C3cH.A02(this.avatarUpdatingStart)) * 31, this.darkPortrait);
        }

        public CallAdmission(HatchVideoCrop hatchVideoCrop, boolean z, AvatarUpdatingStart avatarUpdatingStart, boolean z2) {
            this.portraitCrop = hatchVideoCrop;
            this.avatarUpdating = z;
            this.avatarUpdatingStart = avatarUpdatingStart;
            this.darkPortrait = z2;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class JoinFailure extends C06G {
        public final String errorCode;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof JoinFailure) && C7384Etj.areEqual(this.errorCode, ((JoinFailure) obj).errorCode));
        }

        public static /* synthetic */ JoinFailure copy$default(JoinFailure joinFailure, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = joinFailure.errorCode;
            }
            return new JoinFailure(str);
        }

        public final String component1() {
            return this.errorCode;
        }

        public final JoinFailure copy(String str) {
            return new JoinFailure(str);
        }

        public final String getErrorCode() {
            return this.errorCode;
        }

        public int hashCode() {
            return AnonymousClass006.A0G(this.errorCode);
        }

        public JoinFailure(String str) {
            this.errorCode = str;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class JoinRetry extends C06G {
        public final String callId;
        public final String errorCode;
        public final int failedAttempt;
        public final long generation;

        public static /* synthetic */ JoinRetry copy$default(JoinRetry joinRetry, String str, long j, int i, String str2, int i2, Object obj) {
            String str3 = str;
            long j2 = j;
            int i3 = i;
            String str4 = str2;
            if ((i2 & 1) != 0) {
                str3 = joinRetry.callId;
            }
            if ((i2 & 2) != 0) {
                j2 = joinRetry.generation;
            }
            if ((i2 & 4) != 0) {
                i3 = joinRetry.failedAttempt;
            }
            if ((i2 & 8) != 0) {
                str4 = joinRetry.errorCode;
            }
            AnonymousClass003.A0w(str3, str4);
            return new JoinRetry(str3, j2, i3, str4);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof JoinRetry) {
                    JoinRetry joinRetry = (JoinRetry) obj;
                    if (!C7384Etj.areEqual(this.callId, joinRetry.callId) || this.generation != joinRetry.generation || this.failedAttempt != joinRetry.failedAttempt || !C7384Etj.areEqual(this.errorCode, joinRetry.errorCode)) {
                    }
                }
                return false;
            }
            return true;
        }

        public final String component1() {
            return this.callId;
        }

        public final long component2() {
            return this.generation;
        }

        public final int component3() {
            return this.failedAttempt;
        }

        public final String component4() {
            return this.errorCode;
        }

        public final String getCallId() {
            return this.callId;
        }

        public final String getErrorCode() {
            return this.errorCode;
        }

        public final int getFailedAttempt() {
            return this.failedAttempt;
        }

        public final long getGeneration() {
            return this.generation;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.errorCode, (C60R.A00(this.generation, AnonymousClass001.A0G(this.callId)) + this.failedAttempt) * 31);
        }

        public JoinRetry(String str, long j, int i, String str2) {
            AnonymousClass003.A0w(str, str2);
            this.callId = str;
            this.generation = j;
            this.failedAttempt = i;
            this.errorCode = str2;
        }

        public final JoinRetry copy(String str, long j, int i, String str2) {
            AnonymousClass003.A0w(str, str2);
            return new JoinRetry(str, j, i, str2);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class JoinSendContext extends C06G {
        public final VoiceAudioOnlyReason audioOnlyReason;
        public final String callId;
        public final String callServerInfoData;
        public final boolean deferCompanionSetup;
        public final String device;
        public final String deviceId;
        public final VoiceCallEntryPoint entryPoint;
        public final long generation;
        public final Double latitude;
        public final String localCallId;
        public final Long locationFixTimestampMs;
        public final Double longitude;
        public final boolean requestsDarkAvatar;
        public final String rtcSessionId;
        public final boolean spokenTiming;
        public final String threadId;
        public final String timezone;

        public JoinSendContext(String str, String str2, String str3, String str4, String str5, String str6, Double d, Double d2, Long l, boolean z, long j, String str7, String str8, boolean z2, VoiceAudioOnlyReason voiceAudioOnlyReason, VoiceCallEntryPoint voiceCallEntryPoint, boolean z3) {
            AnonymousClass005.A16(str, str4, str5, str6, 0);
            C7384Etj.A0Y(str7, 11);
            this.callId = str;
            this.rtcSessionId = str2;
            this.threadId = str3;
            this.device = str4;
            this.deviceId = str5;
            this.timezone = str6;
            this.latitude = d;
            this.longitude = d2;
            this.locationFixTimestampMs = l;
            this.spokenTiming = z;
            this.generation = j;
            this.localCallId = str7;
            this.callServerInfoData = str8;
            this.deferCompanionSetup = z2;
            this.audioOnlyReason = voiceAudioOnlyReason;
            this.entryPoint = voiceCallEntryPoint;
            this.requestsDarkAvatar = z3;
        }

        public final JoinSendContext copy(String str, String str2, String str3, String str4, String str5, String str6, Double d, Double d2, Long l, boolean z, long j, String str7, String str8, boolean z2, VoiceAudioOnlyReason voiceAudioOnlyReason, VoiceCallEntryPoint voiceCallEntryPoint, boolean z3) {
            AnonymousClass005.A16(str, str4, str5, str6, 0);
            C7384Etj.A0Y(str7, 11);
            return new JoinSendContext(str, str2, str3, str4, str5, str6, d, d2, l, z, j, str7, str8, z2, voiceAudioOnlyReason, voiceCallEntryPoint, z3);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof JoinSendContext) {
                    JoinSendContext joinSendContext = (JoinSendContext) obj;
                    if (!C7384Etj.areEqual(this.callId, joinSendContext.callId) || !C7384Etj.areEqual(this.rtcSessionId, joinSendContext.rtcSessionId) || !C7384Etj.areEqual(this.threadId, joinSendContext.threadId) || !C7384Etj.areEqual(this.device, joinSendContext.device) || !C7384Etj.areEqual(this.deviceId, joinSendContext.deviceId) || !C7384Etj.areEqual(this.timezone, joinSendContext.timezone) || !C7384Etj.areEqual(this.latitude, joinSendContext.latitude) || !C7384Etj.areEqual(this.longitude, joinSendContext.longitude) || !C7384Etj.areEqual(this.locationFixTimestampMs, joinSendContext.locationFixTimestampMs) || this.spokenTiming != joinSendContext.spokenTiming || this.generation != joinSendContext.generation || !C7384Etj.areEqual(this.localCallId, joinSendContext.localCallId) || !C7384Etj.areEqual(this.callServerInfoData, joinSendContext.callServerInfoData) || this.deferCompanionSetup != joinSendContext.deferCompanionSetup || this.audioOnlyReason != joinSendContext.audioOnlyReason || this.entryPoint != joinSendContext.entryPoint || this.requestsDarkAvatar != joinSendContext.requestsDarkAvatar) {
                    }
                }
                return false;
            }
            return true;
        }

        public final String component1() {
            return this.callId;
        }

        public final boolean component10() {
            return this.spokenTiming;
        }

        public final long component11$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl() {
            return this.generation;
        }

        public final String component12() {
            return this.localCallId;
        }

        public final String component13() {
            return this.callServerInfoData;
        }

        public final boolean component14() {
            return this.deferCompanionSetup;
        }

        public final VoiceAudioOnlyReason component15() {
            return this.audioOnlyReason;
        }

        public final VoiceCallEntryPoint component16() {
            return this.entryPoint;
        }

        public final boolean component17() {
            return this.requestsDarkAvatar;
        }

        public final String component2() {
            return this.rtcSessionId;
        }

        public final String component3() {
            return this.threadId;
        }

        public final String component4() {
            return this.device;
        }

        public final String component5() {
            return this.deviceId;
        }

        public final String component6() {
            return this.timezone;
        }

        public final Double component7() {
            return this.latitude;
        }

        public final Double component8() {
            return this.longitude;
        }

        public final Long component9() {
            return this.locationFixTimestampMs;
        }

        public final VoiceAudioOnlyReason getAudioOnlyReason() {
            return this.audioOnlyReason;
        }

        public final String getCallId() {
            return this.callId;
        }

        public final String getCallServerInfoData() {
            return this.callServerInfoData;
        }

        public final boolean getDeferCompanionSetup() {
            return this.deferCompanionSetup;
        }

        public final String getDevice() {
            return this.device;
        }

        public final String getDeviceId() {
            return this.deviceId;
        }

        public final VoiceCallEntryPoint getEntryPoint() {
            return this.entryPoint;
        }

        public final long getGeneration$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl() {
            return this.generation;
        }

        public final Double getLatitude() {
            return this.latitude;
        }

        public final String getLocalCallId() {
            return this.localCallId;
        }

        public final Long getLocationFixTimestampMs() {
            return this.locationFixTimestampMs;
        }

        public final Double getLongitude() {
            return this.longitude;
        }

        public final boolean getRequestsDarkAvatar() {
            return this.requestsDarkAvatar;
        }

        public final String getRtcSessionId() {
            return this.rtcSessionId;
        }

        public final boolean getSpokenTiming() {
            return this.spokenTiming;
        }

        public final String getThreadId() {
            return this.threadId;
        }

        public final String getTimezone() {
            return this.timezone;
        }

        public int hashCode() {
            return C0KA.A00((((C0KA.A01((AnonymousClass005.A0I(this.localCallId, C60R.A00(this.generation, C0KA.A01((((((AnonymousClass005.A0I(this.timezone, AnonymousClass005.A0I(this.deviceId, AnonymousClass005.A0I(this.device, (((AnonymousClass001.A0G(this.callId) + AnonymousClass006.A0G(this.rtcSessionId)) * 31) + AnonymousClass006.A0G(this.threadId)) * 31))) + AnonymousClass006.A0D(this.latitude)) * 31) + AnonymousClass006.A0D(this.longitude)) * 31) + AnonymousClass006.A0D(this.locationFixTimestampMs)) * 31, this.spokenTiming))) + AnonymousClass006.A0G(this.callServerInfoData)) * 31, this.deferCompanionSetup) + AnonymousClass006.A0D(this.audioOnlyReason)) * 31) + C3cH.A02(this.entryPoint)) * 31, this.requestsDarkAvatar);
        }

        public String toString() {
            return super.toString();
        }

        public static /* synthetic */ JoinSendContext copy$default(JoinSendContext joinSendContext, String str, String str2, String str3, String str4, String str5, String str6, Double d, Double d2, Long l, boolean z, long j, String str7, String str8, boolean z2, VoiceAudioOnlyReason voiceAudioOnlyReason, VoiceCallEntryPoint voiceCallEntryPoint, boolean z3, int i, Object obj) {
            String str9 = str;
            String str10 = str2;
            String str11 = str3;
            String str12 = str4;
            String str13 = str5;
            String str14 = str6;
            Double d3 = d;
            Double d4 = d2;
            Long l2 = l;
            boolean z4 = z;
            long j2 = j;
            String str15 = str7;
            String str16 = str8;
            boolean z5 = z2;
            VoiceAudioOnlyReason voiceAudioOnlyReason2 = voiceAudioOnlyReason;
            VoiceCallEntryPoint voiceCallEntryPoint2 = voiceCallEntryPoint;
            boolean z6 = z3;
            if ((i & 1) != 0) {
                str9 = joinSendContext.callId;
            }
            if ((i & 2) != 0) {
                str10 = joinSendContext.rtcSessionId;
            }
            if ((i & 4) != 0) {
                str11 = joinSendContext.threadId;
            }
            if ((i & 8) != 0) {
                str12 = joinSendContext.device;
            }
            if ((i & 16) != 0) {
                str13 = joinSendContext.deviceId;
            }
            if ((i & 32) != 0) {
                str14 = joinSendContext.timezone;
            }
            if ((i & 64) != 0) {
                d3 = joinSendContext.latitude;
            }
            if ((i & 128) != 0) {
                d4 = joinSendContext.longitude;
            }
            if ((i & 256) != 0) {
                l2 = joinSendContext.locationFixTimestampMs;
            }
            if ((i & 512) != 0) {
                z4 = joinSendContext.spokenTiming;
            }
            if ((i & 1024) != 0) {
                j2 = joinSendContext.generation;
            }
            if ((i & 2048) != 0) {
                str15 = joinSendContext.localCallId;
            }
            if ((i & 4096) != 0) {
                str16 = joinSendContext.callServerInfoData;
            }
            if ((i & 8192) != 0) {
                z5 = joinSendContext.deferCompanionSetup;
            }
            if ((i & 16384) != 0) {
                voiceAudioOnlyReason2 = joinSendContext.audioOnlyReason;
            }
            if ((i & 32768) != 0) {
                voiceCallEntryPoint2 = joinSendContext.entryPoint;
            }
            if ((i & 65536) != 0) {
                z6 = joinSendContext.requestsDarkAvatar;
            }
            String str17 = str14;
            Double d5 = d3;
            Double d6 = d4;
            return joinSendContext.copy(str9, str10, str11, str12, str13, str17, d5, d6, l2, z4, j2, str15, str16, z5, voiceAudioOnlyReason2, voiceCallEntryPoint2, z6);
        }

        public /* synthetic */ JoinSendContext(String str, String str2, String str3, String str4, String str5, String str6, Double d, Double d2, Long l, boolean z, long j, String str7, String str8, boolean z2, VoiceAudioOnlyReason voiceAudioOnlyReason, VoiceCallEntryPoint voiceCallEntryPoint, boolean z3, int i, C06H c06h) {
            this(str, str2, str3, str4, str5, str6, d, d2, (i & 256) != 0 ? null : l, C3cG.A1K(i & 512, z), (i & 1024) != 0 ? 0L : j, (i & 2048) != 0 ? str : str7, (i & 4096) != 0 ? null : str8, C3cG.A1K(i & 8192, z2), (i & 16384) != 0 ? null : voiceAudioOnlyReason, (32768 & i) != 0 ? null : voiceCallEntryPoint, C3cH.A1L(i, 65536, z3));
        }
    }

    public final class PendingBind {
        public final InterfaceC10560Hsz<Boolean> admitted;
        public final String callId;
        public final long generation;
        public final InterfaceC10560Hsz<BindOutcome> outcome;

        public PendingBind(String str, long j, InterfaceC10560Hsz<BindOutcome> interfaceC10560Hsz, InterfaceC10560Hsz<Boolean> interfaceC10560Hsz2) {
            AnonymousClass005.A11(str, interfaceC10560Hsz, interfaceC10560Hsz2, 0);
            this.callId = str;
            this.generation = j;
            this.outcome = interfaceC10560Hsz;
            this.admitted = interfaceC10560Hsz2;
        }

        public final InterfaceC10560Hsz<Boolean> getAdmitted() {
            return this.admitted;
        }

        public final String getCallId() {
            return this.callId;
        }

        public final long getGeneration() {
            return this.generation;
        }

        public final InterfaceC10560Hsz<BindOutcome> getOutcome() {
            return this.outcome;
        }

        public /* synthetic */ PendingBind(String str, long j, InterfaceC10560Hsz interfaceC10560Hsz, InterfaceC10560Hsz interfaceC10560Hsz2, int i, C06H c06h) {
            this(str, j, interfaceC10560Hsz, (i & 8) != 0 ? new GAt(null) : interfaceC10560Hsz2);
        }
    }

    public final class State {
        public final boolean armed;
        public final PendingBind bind;
        public final long generation;
        public final JoinSendContext sendContext;

        public final boolean getArmed() {
            return this.armed;
        }

        public final PendingBind getBind() {
            return this.bind;
        }

        public final long getGeneration() {
            return this.generation;
        }

        public final JoinSendContext getSendContext() {
            return this.sendContext;
        }

        public State(long j, JoinSendContext joinSendContext, PendingBind pendingBind, boolean z) {
            this.generation = j;
            this.sendContext = joinSendContext;
            this.bind = pendingBind;
            this.armed = z;
        }

        public /* synthetic */ State(long j, JoinSendContext joinSendContext, PendingBind pendingBind, boolean z, int i, C06H c06h) {
            this(j, joinSendContext, pendingBind, C3cG.A1K(i & 8, z));
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$armSendContext$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<State, State> {
        public final /* synthetic */ long $generation;
        public final /* synthetic */ String $localCallId;

        @Override // X.G0U
        public final State invoke(State state) {
            C7384Etj.A0Y(state, 0);
            JoinSendContext joinSendContext = state.sendContext;
            if (C7384Etj.areEqual(joinSendContext != null ? joinSendContext.localCallId : null, this.$localCallId)) {
                long j = state.generation;
                if (j == this.$generation) {
                    return new State(j, state.sendContext, state.bind, true);
                }
            }
            return state;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, long j) {
            super(1);
            this.$localCallId = str;
            this.$generation = j;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext", f = "HatchCallJoinContext.kt", l = {250}, m = "awaitAdmission", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$awaitAdmission$1, reason: invalid class name and case insensitive filesystem */
    public final class C132291 extends HzP {
        public long J$0;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C132291(HtJ<? super C132291> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchCallJoinContext.this.awaitAdmission(null, 0L, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext", f = "HatchCallJoinContext.kt", l = {240}, m = "awaitBindOutcome", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$awaitBindOutcome$1, reason: invalid class name and case insensitive filesystem */
    public final class C132301 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C132301(HtJ<? super C132301> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchCallJoinContext.this.awaitBindOutcome(null, 0L, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext", f = "HatchCallJoinContext.kt", l = {256}, m = "awaitJoinFailure", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$awaitJoinFailure$1, reason: invalid class name and case insensitive filesystem */
    public final class C132311 extends HzP {
        public long J$0;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C132311(HtJ<? super C132311> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchCallJoinContext.this.awaitJoinFailure(null, 0L, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext", f = "HatchCallJoinContext.kt", l = {253}, m = "awaitServerVideoDisabled", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$awaitServerVideoDisabled$1, reason: invalid class name and case insensitive filesystem */
    public final class C132321 extends HzP {
        public long J$0;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C132321(HtJ<? super C132321> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchCallJoinContext.this.awaitServerVideoDisabled(null, 0L, this);
        }
    }

    public final void armSendContext(String str, long j) {
        C7384Etj.A0Y(str, 0);
        replaceState(new AnonymousClass1(str, j));
    }

    public final void failJoin(String str, long j, String str2) {
        C7384Etj.A0Y(str, 0);
        completeBind(str, j, new BindOutcome(false, new JoinFailure(str2), null, false));
    }

    public final boolean isCurrentCall$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl(String str, long j) {
        C7384Etj.A0Y(str, 0);
        State state = this.state.get();
        if (state.generation != j) {
            return false;
        }
        PendingBind pendingBind = state.bind;
        return str.equals(pendingBind != null ? pendingBind.callId : null);
    }

    public final C20Q<JoinRetry> joinRetries(String str, long j) {
        C7384Etj.A0Y(str, 0);
        return new HatchCallJoinContext$joinRetries$$inlined$filter$1(new C10649I0t(this.lastJoinRetry, 2), str, j);
    }

    public final void settleBind(String str, long j, boolean z, CallAdmission callAdmission, boolean z2) {
        C7384Etj.A0Y(str, 0);
        completeBind(str, j, new BindOutcome(z, null, callAdmission, z2));
    }

    public final Long stagedGeneration(String str) {
        C7384Etj.A0Y(str, 0);
        State state = this.state.get();
        JoinSendContext joinSendContext = state.sendContext;
        if (!str.equals(joinSendContext != null ? joinSendContext.localCallId : null)) {
            state = null;
        }
        State state2 = state;
        if (state2 != null) {
            return Long.valueOf(state2.generation);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object awaitOutcome(String str, long j, HtJ<? super BindOutcome> htJ) {
        InterfaceC10560Hsz<BindOutcome> interfaceC10560Hsz;
        PendingBind pendingBind = this.state.get().bind;
        if (pendingBind == null || !C7384Etj.areEqual(pendingBind.callId, str) || pendingBind.generation != j || (interfaceC10560Hsz = pendingBind.outcome) == null) {
            return null;
        }
        return C3cG.A0W(interfaceC10560Hsz, htJ);
    }

    private final void completeBind(String str, long j, BindOutcome bindOutcome) {
        Object next;
        synchronized (this.lifecycleLock) {
            Iterator it = BFI.A0F(new PendingBind[]{this.state.get().bind, this.endedBind}).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                PendingBind pendingBind = (PendingBind) next;
                if (C7384Etj.areEqual(pendingBind.callId, str) && pendingBind.generation == j) {
                    break;
                }
            }
            PendingBind pendingBind2 = (PendingBind) next;
            if (pendingBind2 != null) {
                ((GAt) pendingBind2.admitted).A0R(Boolean.valueOf(bindOutcome.bound));
                ((GAt) pendingBind2.outcome).A0R(bindOutcome);
            }
        }
    }

    private final State replaceState(G0U<? super State, State> g0u) {
        State state;
        AtomicReference<State> atomicReference;
        do {
            state = this.state.get();
            atomicReference = this.state;
            C7384Etj.A0X(state);
        } while (!Bs8.A00(state, g0u.invoke(state), atomicReference));
        return state;
    }

    public static /* synthetic */ C27k reset$default(HatchCallJoinContext hatchCallJoinContext, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return hatchCallJoinContext.reset(str);
    }

    public static /* synthetic */ void settleBind$default(HatchCallJoinContext hatchCallJoinContext, String str, long j, boolean z, CallAdmission callAdmission, boolean z2, int i, Object obj) {
        if ((i & 8) != 0) {
            callAdmission = null;
        }
        hatchCallJoinContext.settleBind(str, j, z, callAdmission, C3cG.A1K(i & 16, z2));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object awaitAdmission(java.lang.String r6, long r7, X.HtJ<? super com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext.CallAdmission> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext.C132291
            if (r0 == 0) goto L38
            r4 = r9
            com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$awaitAdmission$1 r4 = (com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext.C132291) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L38
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L27
            if (r0 != r1) goto L40
            X.Hwg.A00(r3)
        L20:
            com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$BindOutcome r3 = (com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext.BindOutcome) r3
            if (r3 == 0) goto L3e
            com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$CallAdmission r2 = r3.admission
            return r2
        L27:
            X.Hwg.A00(r3)
            r0 = 0
            r4.L$0 = r0
            r4.J$0 = r7
            r4.label = r1
            java.lang.Object r3 = r5.awaitOutcome(r6, r7, r4)
            if (r3 != r2) goto L20
            return r2
        L38:
            com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$awaitAdmission$1 r4 = new com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$awaitAdmission$1
            r4.<init>(r9)
            goto L12
        L3e:
            r2 = 0
            return r2
        L40:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext.awaitAdmission(java.lang.String, long, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object awaitBindOutcome(java.lang.String r7, long r8, X.HtJ<? super com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext.BindResult> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext.C132301
            if (r0 == 0) goto L57
            r5 = r10
            com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$awaitBindOutcome$1 r5 = (com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext.C132301) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L57
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L2b
            if (r0 != r3) goto L64
            X.Hwg.A00(r1)
        L20:
            com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$BindOutcome r1 = (com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext.BindOutcome) r1
            if (r1 == 0) goto L69
            boolean r0 = r1.bound
            if (r0 == 0) goto L5d
            com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$BindResult r4 = com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext.BindResult.BOUND
            return r4
        L2b:
            X.Hwg.A00(r1)
            java.util.concurrent.atomic.AtomicReference<com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$State> r0 = r6.state
            java.lang.Object r0 = r0.get()
            com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$State r0 = (com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext.State) r0
            com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$PendingBind r2 = r0.bind
            if (r2 == 0) goto L69
            java.lang.String r0 = r2.callId
            boolean r0 = X.C7384Etj.areEqual(r0, r7)
            r1 = 0
            if (r0 == 0) goto L69
            com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$awaitBindOutcome$outcome$1 r0 = new com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$awaitBindOutcome$outcome$1
            r0.<init>(r2, r1)
            r5.L$0 = r1
            r5.L$1 = r1
            r5.J$0 = r8
            r5.label = r3
            java.lang.Object r1 = X.GAX.A01(r5, r0, r8)
            if (r1 != r4) goto L20
            return r4
        L57:
            com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$awaitBindOutcome$1 r5 = new com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$awaitBindOutcome$1
            r5.<init>(r10)
            goto L12
        L5d:
            com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$JoinFailure r0 = r1.failure
            if (r0 == 0) goto L69
            com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$BindResult r4 = com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext.BindResult.FAILED
            return r4
        L64:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L69:
            com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$BindResult r4 = com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext.BindResult.UNBOUND
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext.awaitBindOutcome(java.lang.String, long, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object awaitJoinFailure(java.lang.String r6, long r7, X.HtJ<? super com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext.JoinFailure> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext.C132311
            if (r0 == 0) goto L38
            r4 = r9
            com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$awaitJoinFailure$1 r4 = (com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext.C132311) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L38
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L27
            if (r0 != r1) goto L40
            X.Hwg.A00(r3)
        L20:
            com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$BindOutcome r3 = (com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext.BindOutcome) r3
            if (r3 == 0) goto L3e
            com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$JoinFailure r2 = r3.failure
            return r2
        L27:
            X.Hwg.A00(r3)
            r0 = 0
            r4.L$0 = r0
            r4.J$0 = r7
            r4.label = r1
            java.lang.Object r3 = r5.awaitOutcome(r6, r7, r4)
            if (r3 != r2) goto L20
            return r2
        L38:
            com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$awaitJoinFailure$1 r4 = new com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$awaitJoinFailure$1
            r4.<init>(r9)
            goto L12
        L3e:
            r2 = 0
            return r2
        L40:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext.awaitJoinFailure(java.lang.String, long, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object awaitServerVideoDisabled(java.lang.String r6, long r7, X.HtJ<? super java.lang.Boolean> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext.C132321
            if (r0 == 0) goto L40
            r4 = r9
            com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$awaitServerVideoDisabled$1 r4 = (com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext.C132321) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L40
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L2f
            if (r0 != r1) goto L46
            X.Hwg.A00(r3)
        L20:
            com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$BindOutcome r3 = (com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext.BindOutcome) r3
            if (r3 == 0) goto L2d
            boolean r0 = r3.serverVideoDisabled
            if (r0 != r1) goto L2d
        L28:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        L2d:
            r1 = 0
            goto L28
        L2f:
            X.Hwg.A00(r3)
            r0 = 0
            r4.L$0 = r0
            r4.J$0 = r7
            r4.label = r1
            java.lang.Object r3 = r5.awaitOutcome(r6, r7, r4)
            if (r3 != r2) goto L20
            return r2
        L40:
            com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$awaitServerVideoDisabled$1 r4 = new com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext$awaitServerVideoDisabled$1
            r4.<init>(r9)
            goto L12
        L46:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.HatchCallJoinContext.awaitServerVideoDisabled(java.lang.String, long, X.HtJ):java.lang.Object");
    }

    public final JoinSendContext consumeSendContext() {
        State state = this.state.get();
        if (!state.armed) {
            state = null;
        }
        State state2 = state;
        if (state2 != null) {
            return state2.sendContext;
        }
        return null;
    }

    public final long prepareForCall(JoinSendContext joinSendContext) {
        long j;
        InterfaceC10560Hsz<BindOutcome> interfaceC10560Hsz;
        synchronized (this.lifecycleLock) {
            State stateReplaceState = replaceState(new HatchCallJoinContext$prepareForCall$1$previous$1(joinSendContext));
            PendingBind pendingBind = stateReplaceState.bind;
            if (pendingBind != null && (interfaceC10560Hsz = pendingBind.outcome) != null) {
                ((GAt) interfaceC10560Hsz).A0R(new BindOutcome(false, null, null, false));
            }
            j = stateReplaceState.generation + 1;
        }
        return j;
    }

    public final C27k<Boolean> reset(String str) {
        InterfaceC10560Hsz<Boolean> interfaceC10560Hsz;
        InterfaceC10560Hsz<BindOutcome> interfaceC10560Hsz2;
        synchronized (this.lifecycleLock) {
            State stateReplaceState = replaceState(HatchCallJoinContext$reset$1$previous$1.INSTANCE);
            PendingBind pendingBind = stateReplaceState.bind;
            if (pendingBind != null && (interfaceC10560Hsz2 = pendingBind.outcome) != null) {
                ((GAt) interfaceC10560Hsz2).A0R(new BindOutcome(false, null, null, false));
            }
            PendingBind pendingBind2 = stateReplaceState.bind;
            if (pendingBind2 != null) {
                this.endedBind = pendingBind2;
            }
            interfaceC10560Hsz = null;
            if (pendingBind2 != null && C7384Etj.areEqual(pendingBind2.callId, str)) {
                interfaceC10560Hsz = pendingBind2.admitted;
            }
        }
        return interfaceC10560Hsz;
    }

    public final void recordJoinRetry$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl(String str, long j, int i, String str2) {
        AnonymousClass003.A0w(str, str2);
        AnonymousClass002.A1I(this.lastJoinRetry, new JoinRetry(str, j, i, str2));
    }

    public final <T> T withCurrentCall$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl(String str, long j, Function0<? extends T> function0) {
        T tInvoke;
        AnonymousClass003.A0v(str, function0);
        synchronized (this.lifecycleLock) {
            tInvoke = isCurrentCall$fbandroid_express_aura_java_com_facebook_aura_partners_voice_session_impl_impl(str, j) ? function0.invoke() : null;
        }
        return tInvoke;
    }
}
