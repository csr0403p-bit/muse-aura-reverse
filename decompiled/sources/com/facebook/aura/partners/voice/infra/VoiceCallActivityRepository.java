package com.facebook.aura.partners.voice.infra;

import X.AGI;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06H;
import X.C3cF;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.C9258GBl;
import X.C9hr;
import X.C9sU;
import X.CFK;
import X.F0C;
import X.FGI;
import X.HtJ;
import X.HzP;
import X.InterfaceC2261BLa;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.network.transport.HatchHttpResponse;
import com.facebook.aura.partners.voice.api.VoicePipelineProfile;
import com.facebook.aura.partners.voice.api.VoicePipelineProfileState;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;

/* loaded from: classes6.dex */
public final class VoiceCallActivityRepository {
    public static final String ENDPOINT_END_CALL = "api/voice/end-call";
    public static final String ENDPOINT_PIPELINE_PROFILE = "api/voice/pipeline-profile";
    public static final String ENDPOINT_PIPELINE_PROFILES = "api/voice/pipeline-profiles";
    public static final String ENDPOINT_START_CALL = "api/voice/start-call";
    public static final String ENDPOINT_USER_SPEECH_STARTED = "api/voice/user-speech-started";
    public static final String ERROR_CODE_OUT_OF_CREDITS = "out_of_credits";
    public static final String GREETING_DELAY_KEY = "greeting_delay_ms";
    public static final String MIC_STATUS_LIVE = "live";
    public static final String MIC_STATUS_MUTED = "muted";
    public static final long MIC_STATUS_TIMEOUT_SECONDS = 5;
    public static final String PLAYBACK_STATE_IDLE = "idle";
    public static final String PLAYBACK_STATE_PLAYING = "playing";
    public static final long PLAYBACK_STATUS_TIMEOUT_SECONDS = 3;
    public static final String TAG = "VoiceCallActivityRepository";
    public static final long USER_SPEECH_TIMEOUT_SECONDS = 5;
    public final AbstractC3358CGz userSession;
    public static final Companion Companion = new Companion();
    public static final InterfaceC2261BLa configMutex = new C9258GBl();

    public final class Companion {
        /* JADX INFO: Access modifiers changed from: private */
        public final String formatUtcTimestamp(long j) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(C3cF.A00(63), Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            String str = simpleDateFormat.format(new Date(j));
            C7384Etj.A0U(str);
            return str;
        }

        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository", f = "VoiceCallActivityRepository.kt", l = {157}, m = "endCall", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository$endCall$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VoiceCallActivityRepository.this.endCall(null, 0L, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository", f = "VoiceCallActivityRepository.kt", l = {332}, m = "executeGet", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository$executeGet$1, reason: invalid class name and case insensitive filesystem */
    public final class C131171 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public C131171(HtJ<? super C131171> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VoiceCallActivityRepository.this.executeGet(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository", f = "VoiceCallActivityRepository.kt", l = {358}, m = "executeWithRequestId", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository$executeWithRequestId$1, reason: invalid class name and case insensitive filesystem */
    public final class C131181 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public int label;
        public /* synthetic */ Object result;

        public C131181(HtJ<? super C131181> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VoiceCallActivityRepository.this.executeWithRequestId(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository", f = "VoiceCallActivityRepository.kt", l = {268}, m = "fetchVoicePipelineProfiles", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository$fetchVoicePipelineProfiles$1, reason: invalid class name and case insensitive filesystem */
    public final class C131191 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C131191(HtJ<? super C131191> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VoiceCallActivityRepository.this.fetchVoicePipelineProfiles(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository", f = "VoiceCallActivityRepository.kt", l = {396, 253}, m = "readGreetingDelayMs", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository$readGreetingDelayMs$1, reason: invalid class name and case insensitive filesystem */
    public final class C131201 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C131201(HtJ<? super C131201> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VoiceCallActivityRepository.this.readGreetingDelayMs(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository", f = "VoiceCallActivityRepository.kt", l = {430}, m = "reportMicStatus", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository$reportMicStatus$1, reason: invalid class name and case insensitive filesystem */
    public final class C131211 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C131211(HtJ<? super C131211> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VoiceCallActivityRepository.this.reportMicStatus(null, false, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository", f = "VoiceCallActivityRepository.kt", l = {430}, m = "reportPlaybackStatus", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository$reportPlaybackStatus$1, reason: invalid class name and case insensitive filesystem */
    public final class C131221 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C131221(HtJ<? super C131221> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VoiceCallActivityRepository.this.reportPlaybackStatus(null, 0L, false, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository", f = "VoiceCallActivityRepository.kt", l = {430}, m = "reportUserSpeech", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository$reportUserSpeech$1, reason: invalid class name and case insensitive filesystem */
    public final class C131231 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public int label;
        public /* synthetic */ Object result;

        public C131231(HtJ<? super C131231> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VoiceCallActivityRepository.this.reportUserSpeech(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository", f = "VoiceCallActivityRepository.kt", l = {279}, m = "selectVoicePipelineProfile", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository$selectVoicePipelineProfile$1, reason: invalid class name and case insensitive filesystem */
    public final class C131241 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C131241(HtJ<? super C131241> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VoiceCallActivityRepository.this.selectVoicePipelineProfile(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository", f = "VoiceCallActivityRepository.kt", l = {HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX}, m = "startCall", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository$startCall$1, reason: invalid class name and case insensitive filesystem */
    public final class C131251 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C131251(HtJ<? super C131251> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VoiceCallActivityRepository.this.startCall(null, null, null, null, null, null, null, null, false, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository", f = "VoiceCallActivityRepository.kt", l = {173}, m = "userSpeechStarted", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository$userSpeechStarted$1, reason: invalid class name and case insensitive filesystem */
    public final class C131261 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C131261(HtJ<? super C131261> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VoiceCallActivityRepository.this.userSpeechStarted(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository", f = "VoiceCallActivityRepository.kt", l = {396, 223, 243}, m = "writeGreetingDelayMs", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository$writeGreetingDelayMs$1, reason: invalid class name and case insensitive filesystem */
    public final class C131271 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public C131271(HtJ<? super C131271> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VoiceCallActivityRepository.this.writeGreetingDelayMs(0, this);
        }
    }

    public VoiceCallActivityRepository(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.userSession = abstractC3358CGz;
    }

    private final VoicePipelineProfileState parseVoicePipelineProfiles(HatchHttpResponse hatchHttpResponse, String str) {
        StringBuilder sbA0g;
        String str2;
        String string;
        if (hatchHttpResponse == null) {
            sbA0g = C3cG.A0g(str);
            str2 = ": request failed (null response)";
        } else {
            int i = hatchHttpResponse.statusCode;
            if (200 <= i && i < 300) {
                try {
                    String strBodyString = hatchHttpResponse.bodyString();
                    if (strBodyString == null) {
                        strBodyString = "";
                    }
                    C9sU c9sU = HatchJsonKt.HatchJson;
                    JsonElement jsonElementA1F = C60O.A1F("result", (JsonObject) c9sU.A00(strBodyString, JsonObjectSerializer.A01));
                    if (jsonElementA1F != null && (string = jsonElementA1F.toString()) != null) {
                        strBodyString = string;
                    }
                    F0C<C9hr<Object>>[] f0cArr = VoicePipelineProfilesResponseJson.$childSerializers;
                    VoicePipelineProfilesResponseJson voicePipelineProfilesResponseJson = (VoicePipelineProfilesResponseJson) c9sU.A00(strBodyString, VoicePipelineProfilesResponseJson$$serializer.INSTANCE);
                    List<VoicePipelineProfileJson> list = voicePipelineProfilesResponseJson.profiles;
                    ArrayList arrayListA0i = AnonymousClass003.A0i(list);
                    for (VoicePipelineProfileJson voicePipelineProfileJson : list) {
                        arrayListA0i.add(new VoicePipelineProfile(voicePipelineProfileJson.id, voicePipelineProfileJson.label));
                    }
                    return new VoicePipelineProfileState(AGI.A07(arrayListA0i), voicePipelineProfilesResponseJson.selected_profile_id, voicePipelineProfilesResponseJson.modified);
                } catch (Exception e) {
                    CFK.A06(TAG, FGI.A0U(str, ": parse failed: ", e.getMessage()));
                    return null;
                }
            }
            sbA0g = C3cG.A0g(str);
            sbA0g.append(": request failed (code=");
            sbA0g.append(i);
            str2 = ")";
        }
        CFK.A06(TAG, AnonymousClass001.A0v(str2, sbA0g));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object executeGet(java.lang.String r16, X.HtJ<? super com.facebook.aura.network.transport.HatchHttpResponse> r17) {
        /*
            r15 = this;
            r3 = r17
            boolean r0 = r3 instanceof com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository.C131171
            if (r0 == 0) goto L23
            r5 = r3
            com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository$executeGet$1 r5 = (com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository.C131171) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r5.label = r2
        L14:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r9 = 0
            java.lang.String r2 = "VoiceCallActivityRepository"
            r3 = 1
            if (r0 == 0) goto L2e
            if (r0 != r3) goto L29
            goto L99
        L23:
            com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository$executeGet$1 r5 = new com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository$executeGet$1
            r5.<init>(r3)
            goto L14
        L29:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2e:
            X.Hwg.A00(r1)
            com.facebook.aura.gateway.store.HatchGatewayPrefsStore$Companion r1 = com.facebook.aura.gateway.store.HatchGatewayPrefsStore.Companion
            X.CGz r0 = r15.userSession
            com.facebook.aura.gateway.store.HatchGatewayPrefsStore r0 = r1.getInstance(r0)
            java.lang.String r1 = r0.getGatewayUrl()
            boolean r0 = X.C7BY.A0j(r1)
            if (r0 == 0) goto L49
            java.lang.String r0 = "request failed: missing gateway URL"
        L45:
            X.CFK.A06(r2, r0)
            return r9
        L49:
            com.facebook.aura.network.http.HatchHttpApi r0 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            java.lang.String r7 = r0.jarvisHttpBaseUrl(r1)
            if (r7 != 0) goto L54
            java.lang.String r0 = "request failed: could not derive base URL"
            goto L45
        L54:
            java.lang.String r1 = "Accept"
            java.lang.String r0 = "application/json"
            X.HxE r6 = X.C3cG.A0r(r1, r0)
            java.lang.String r1 = X.BV5.A0j()
            java.lang.String r0 = "x-request-id"
            java.util.Map r8 = X.AnonymousClass007.A0d(r0, r1, r6)
            com.facebook.aura.network.transport.HatchHttpRequest$Companion r6 = com.facebook.aura.network.transport.HatchHttpRequest.Companion
            r0 = r16
            java.lang.String r7 = X.FGI.A0M(r7, r0)
            com.facebook.aura.network.transport.HatchRequestCategory r12 = com.facebook.aura.network.transport.HatchRequestCategory.API
            com.facebook.aura.network.transport.HatchRequestPurpose r13 = com.facebook.aura.network.transport.HatchRequestPurpose.FETCH
            r15 = 0
            com.facebook.aura.network.transport.HatchResponseBodyPolicy r17 = com.facebook.aura.network.transport.HatchResponseBodyPolicy.DEFAULT
            r10 = r9
            r11 = r9
            r14 = r9
            r16 = r15
            com.facebook.aura.network.transport.HatchHttpRequest r6 = r6.get(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            com.facebook.aura.network.transport.HatchTransport r1 = com.facebook.aura.network.transport.HatchTransport.INSTANCE     // Catch: java.lang.Exception -> La0
            com.facebook.aura.network.transport.HatchAuthScheme r0 = com.facebook.aura.network.transport.HatchAuthScheme.VM_JWT     // Catch: java.lang.Exception -> La0
            com.facebook.aura.network.transport.HatchHttpClient r0 = r1.httpClient(r0)     // Catch: java.lang.Exception -> La0
            r5.L$0 = r9     // Catch: java.lang.Exception -> La0
            r5.L$1 = r9     // Catch: java.lang.Exception -> La0
            r5.L$2 = r9     // Catch: java.lang.Exception -> La0
            r5.L$3 = r9     // Catch: java.lang.Exception -> La0
            r5.L$4 = r9     // Catch: java.lang.Exception -> La0
            r5.label = r3     // Catch: java.lang.Exception -> La0
            java.lang.Object r1 = r0.execute(r6, r5)     // Catch: java.lang.Exception -> La0
            if (r1 != r4) goto L9c
            return r4
        L99:
            X.Hwg.A00(r1)     // Catch: java.lang.Exception -> La0
        L9c:
            r4 = r1
            com.facebook.aura.network.transport.HatchHttpResponse r4 = (com.facebook.aura.network.transport.HatchHttpResponse) r4     // Catch: java.lang.Exception -> La0
            return r4
        La0:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            java.lang.String r0 = "request failed: "
            java.lang.String r0 = X.FGI.A0M(r0, r1)
            X.CFK.A06(r2, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository.executeGet(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object executeWithRequestId(java.lang.String r20, java.lang.String r21, X.HtJ<? super com.facebook.aura.network.transport.HatchHttpResponse> r22) {
        /*
            r19 = this;
            r3 = r22
            boolean r0 = r3 instanceof com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository.C131181
            r6 = r19
            if (r0 == 0) goto L26
            r5 = r3
            com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository$executeWithRequestId$1 r5 = (com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository.C131181) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r5.label = r2
        L16:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            java.lang.String r2 = "VoiceCallActivityRepository"
            r10 = 0
            r3 = 1
            if (r0 == 0) goto L31
            if (r0 != r3) goto L2c
            goto Laf
        L26:
            com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository$executeWithRequestId$1 r5 = new com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository$executeWithRequestId$1
            r5.<init>(r3)
            goto L16
        L2c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L31:
            X.Hwg.A00(r1)
            com.facebook.aura.gateway.store.HatchGatewayPrefsStore$Companion r1 = com.facebook.aura.gateway.store.HatchGatewayPrefsStore.Companion
            X.CGz r0 = r6.userSession
            com.facebook.aura.gateway.store.HatchGatewayPrefsStore r0 = r1.getInstance(r0)
            java.lang.String r1 = r0.getGatewayUrl()
            boolean r0 = X.C7BY.A0j(r1)
            if (r0 == 0) goto L4c
            java.lang.String r0 = "request failed: missing gateway URL"
            X.CFK.A06(r2, r0)
        L4b:
            return r10
        L4c:
            com.facebook.aura.network.http.HatchHttpApi r0 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            java.lang.String r0 = r0.jarvisHttpBaseUrl(r1)
            if (r0 == 0) goto L4b
            r1 = r20
            java.lang.String r7 = X.FGI.A0M(r0, r1)
            java.lang.String r6 = X.BV5.A0j()
            java.lang.String r1 = "Accept"
            java.lang.String r0 = "application/json"
            X.HxE r1 = X.C3cG.A0r(r1, r0)
            java.lang.String r0 = "x-request-id"
            java.util.Map r9 = X.AnonymousClass007.A0d(r0, r6, r1)
            com.facebook.aura.network.transport.HatchHttpRequest$Companion r6 = com.facebook.aura.network.transport.HatchHttpRequest.Companion
            com.facebook.aura.network.transport.HatchRequestBody$Json r8 = new com.facebook.aura.network.transport.HatchRequestBody$Json
            r0 = r21
            r8.<init>(r0)
            com.facebook.aura.network.transport.HatchRequestCategory r13 = com.facebook.aura.network.transport.HatchRequestCategory.API
            com.facebook.aura.network.transport.HatchRequestPurpose r14 = com.facebook.aura.network.transport.HatchRequestPurpose.FETCH
            r16 = 0
            com.facebook.aura.network.transport.HatchResponseBodyPolicy r19 = com.facebook.aura.network.transport.HatchResponseBodyPolicy.DEFAULT
            r11 = r10
            r12 = r10
            r15 = r10
            r17 = r16
            r18 = r3
            r20 = r10
            r21 = r16
            r22 = r3
            com.facebook.aura.network.transport.HatchHttpRequest r6 = r6.post(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            com.facebook.aura.network.transport.HatchTransport r1 = com.facebook.aura.network.transport.HatchTransport.INSTANCE     // Catch: java.lang.Exception -> Lb6
            com.facebook.aura.network.transport.HatchAuthScheme r0 = com.facebook.aura.network.transport.HatchAuthScheme.VM_JWT     // Catch: java.lang.Exception -> Lb6
            com.facebook.aura.network.transport.HatchHttpClient r0 = r1.httpClient(r0)     // Catch: java.lang.Exception -> Lb6
            r5.L$0 = r10     // Catch: java.lang.Exception -> Lb6
            r5.L$1 = r10     // Catch: java.lang.Exception -> Lb6
            r5.L$2 = r10     // Catch: java.lang.Exception -> Lb6
            r5.L$3 = r10     // Catch: java.lang.Exception -> Lb6
            r5.L$4 = r10     // Catch: java.lang.Exception -> Lb6
            r5.L$5 = r10     // Catch: java.lang.Exception -> Lb6
            r5.L$6 = r10     // Catch: java.lang.Exception -> Lb6
            r5.L$7 = r10     // Catch: java.lang.Exception -> Lb6
            r5.label = r3     // Catch: java.lang.Exception -> Lb6
            java.lang.Object r1 = r0.execute(r6, r5)     // Catch: java.lang.Exception -> Lb6
            if (r1 != r4) goto Lb2
            return r4
        Laf:
            X.Hwg.A00(r1)     // Catch: java.lang.Exception -> Lb6
        Lb2:
            r4 = r1
            com.facebook.aura.network.transport.HatchHttpResponse r4 = (com.facebook.aura.network.transport.HatchHttpResponse) r4     // Catch: java.lang.Exception -> Lb6
            return r4
        Lb6:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            java.lang.String r0 = "request failed: "
            java.lang.String r0 = X.FGI.A0M(r0, r1)
            X.CFK.A06(r2, r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository.executeWithRequestId(java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    public static /* synthetic */ Object startCall$default(VoiceCallActivityRepository voiceCallActivityRepository, String str, String str2, String str3, String str4, Double d, Double d2, Long l, String str5, boolean z, HtJ htJ, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        if ((i & 16) != 0) {
            d = null;
        }
        if ((i & 32) != 0) {
            d2 = null;
        }
        if ((i & 64) != 0) {
            l = null;
        }
        if ((i & 128) != 0) {
            str5 = null;
        }
        if ((i & 256) != 0) {
            z = false;
        }
        return voiceCallActivityRepository.startCall(str, str2, str3, str4, d, d2, l, str5, z, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object endCall(java.lang.String r9, long r10, java.lang.String r12, X.HtJ<? super java.lang.Boolean> r13) {
        /*
            r8 = this;
            boolean r0 = r13 instanceof com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository.AnonymousClass1
            if (r0 == 0) goto L64
            r4 = r13
            com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository$endCall$1 r4 = (com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L64
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r4.label
            java.lang.String r3 = "VoiceCallActivityRepository"
            r2 = 1
            if (r0 == 0) goto L30
            if (r0 != r2) goto L7b
            X.Hwg.A00(r1)
        L22:
            com.facebook.aura.network.transport.HatchHttpResponse r1 = (com.facebook.aura.network.transport.HatchHttpResponse) r1
            if (r1 != 0) goto L6a
            java.lang.String r0 = "endCall: request failed (null response)"
            X.CFK.A06(r3, r0)
            java.lang.Boolean r5 = X.AnonymousClass001.A0h()
            return r5
        L30:
            X.Hwg.A00(r1)
            com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository$Companion r6 = com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository.Companion
            java.lang.String r7 = com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository.Companion.access$formatUtcTimestamp(r6, r10)
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository.Companion.access$formatUtcTimestamp(r6, r0)
            com.facebook.aura.partners.voice.infra.EndCallRequestJson r6 = new com.facebook.aura.partners.voice.infra.EndCallRequestJson
            r6.<init>(r9, r7, r0, r12)
            X.9sU r1 = com.facebook.aura.json.HatchJsonKt.HatchJson
            com.facebook.aura.partners.voice.infra.EndCallRequestJson$$serializer r0 = com.facebook.aura.partners.voice.infra.EndCallRequestJson$$serializer.INSTANCE
            java.lang.String r1 = r1.A02(r6, r0)
            r0 = 0
            r4.L$0 = r0
            r4.L$1 = r0
            r4.L$2 = r0
            r4.L$3 = r0
            r4.J$0 = r10
            r4.label = r2
            java.lang.String r0 = "api/voice/end-call"
            java.lang.Object r1 = r8.executeWithRequestId(r0, r1, r4)
            if (r1 != r5) goto L22
            return r5
        L64:
            com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository$endCall$1 r4 = new com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository$endCall$1
            r4.<init>(r13)
            goto L12
        L6a:
            int r1 = r1.statusCode
            r0 = 200(0xc8, float:2.8E-43)
            if (r0 > r1) goto L79
            r0 = 300(0x12c, float:4.2E-43)
            if (r1 >= r0) goto L79
        L74:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            return r5
        L79:
            r2 = 0
            goto L74
        L7b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository.endCall(java.lang.String, long, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchVoicePipelineProfiles(X.HtJ<? super com.facebook.aura.partners.voice.api.VoicePipelineProfileState> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository.C131191
            if (r0 == 0) goto L3d
            r4 = r6
            com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository$fetchVoicePipelineProfiles$1 r4 = (com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository.C131191) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3d
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r1 = r4.label
            r0 = 1
            if (r1 == 0) goto L2d
            if (r1 != r0) goto L43
            java.lang.Object r5 = r4.L$0
            com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository r5 = (com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository) r5
            X.Hwg.A00(r3)
        L24:
            com.facebook.aura.network.transport.HatchHttpResponse r3 = (com.facebook.aura.network.transport.HatchHttpResponse) r3
            java.lang.String r0 = "fetchVoicePipelineProfiles"
            com.facebook.aura.partners.voice.api.VoicePipelineProfileState r0 = r5.parseVoicePipelineProfiles(r3, r0)
            return r0
        L2d:
            X.Hwg.A00(r3)
            r4.L$0 = r5
            r4.label = r0
            java.lang.String r0 = "api/voice/pipeline-profiles"
            java.lang.Object r3 = r5.executeGet(r0, r4)
            if (r3 != r2) goto L24
            return r2
        L3d:
            com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository$fetchVoicePipelineProfiles$1 r4 = new com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository$fetchVoicePipelineProfiles$1
            r4.<init>(r6)
            goto L12
        L43:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository.fetchVoicePipelineProfiles(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readGreetingDelayMs(X.HtJ<? super java.lang.Integer> r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository.C131201
            if (r0 == 0) goto L26
            r7 = r9
            com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository$readGreetingDelayMs$1 r7 = (com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository.C131201) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r1 = r7.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r2 = r7.label
            r5 = 2
            r0 = 1
            r4 = 0
            if (r2 == 0) goto L39
            if (r2 == r0) goto L31
            if (r2 != r5) goto L2c
            java.lang.Object r3 = r7.L$0
            X.BLa r3 = (X.InterfaceC2261BLa) r3
            goto L5a
        L26:
            com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository$readGreetingDelayMs$1 r7 = new com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository$readGreetingDelayMs$1
            r7.<init>(r9)
            goto L12
        L2c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L31:
            java.lang.Object r3 = r7.L$0
            X.BLa r3 = (X.InterfaceC2261BLa) r3
            X.Hwg.A00(r1)
            goto L49
        L39:
            X.Hwg.A00(r1)
            X.BLa r3 = com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository.configMutex
            r7.L$0 = r3
            r7.label = r0
            java.lang.Object r0 = r3.APs(r4, r7)
            if (r0 != r6) goto L49
            return r6
        L49:
            com.facebook.aura.gateway.HatchFileOperations r2 = com.facebook.aura.gateway.HatchFileOperations.INSTANCE     // Catch: java.lang.Throwable -> L9f
            java.lang.String r1 = "user/voice_config.json"
            X.CGz r0 = r8.userSession     // Catch: java.lang.Throwable -> L9f
            r7.L$0 = r3     // Catch: java.lang.Throwable -> L9f
            r7.label = r5     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r1 = r2.readFile(r1, r0, r7)     // Catch: java.lang.Throwable -> L9f
            if (r1 != r6) goto L5d
            return r6
        L5a:
            X.Hwg.A00(r1)     // Catch: java.lang.Throwable -> La1
        L5d:
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> La1
            if (r1 == 0) goto L9a
            boolean r0 = X.C7BY.A0j(r1)     // Catch: java.lang.Throwable -> La1
            if (r0 != 0) goto L9a
            X.9sU r0 = com.facebook.aura.json.HatchJsonKt.HatchJson     // Catch: java.lang.Throwable -> L84
            kotlinx.serialization.json.JsonElement r0 = r0.A04(r1)     // Catch: java.lang.Throwable -> L84
            kotlinx.serialization.json.JsonObject r1 = X.C9oY.A05(r0)     // Catch: java.lang.Throwable -> L84
            java.lang.String r0 = "greeting_delay_ms"
            kotlinx.serialization.json.JsonElement r0 = X.C60O.A1F(r0, r1)     // Catch: java.lang.Throwable -> L84
            if (r0 == 0) goto L82
            kotlinx.serialization.json.JsonPrimitive r0 = X.C9oY.A08(r0)     // Catch: java.lang.Throwable -> L84
            java.lang.Integer r0 = X.C9oY.A02(r0)     // Catch: java.lang.Throwable -> L84
            goto L89
        L82:
            r0 = r4
            goto L89
        L84:
            r0 = move-exception
            X.Hud r0 = X.C3cG.A0s(r0)     // Catch: java.lang.Throwable -> La1
        L89:
            java.lang.Throwable r2 = X.HsJ.A00(r0)     // Catch: java.lang.Throwable -> La1
            if (r2 == 0) goto L97
            java.lang.String r1 = "VoiceCallActivityRepository"
            java.lang.String r0 = "readGreetingDelayMs: failed to parse user/voice_config.json"
            X.CFK.A0A(r1, r0, r2)     // Catch: java.lang.Throwable -> La1
            r0 = r4
        L97:
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> La1
            goto L9b
        L9a:
            r0 = r4
        L9b:
            r3.Ahe(r4)
            return r0
        L9f:
            r0 = move-exception
            goto La2
        La1:
            r0 = move-exception
        La2:
            r3.Ahe(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository.readGreetingDelayMs(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object reportMicStatus(java.lang.String r27, boolean r28, X.HtJ<? super java.lang.Boolean> r29) {
        /*
            r26 = this;
            r4 = r29
            boolean r0 = r4 instanceof com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository.C131211
            r5 = r26
            if (r0 == 0) goto La6
            r3 = r4
            com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository$reportMicStatus$1 r3 = (com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository.C131211) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La6
            int r2 = r2 - r1
            r3.label = r2
        L16:
            java.lang.Object r4 = r3.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 != r1) goto Lad
            java.lang.Object r3 = X.AnonymousClass001.A0q(r4)
        L25:
            boolean r1 = r3 instanceof X.C10571Hud
            r0 = 0
            if (r1 == 0) goto L2b
            r3 = r0
        L2b:
            com.facebook.aura.partners.voice.infra.MicStatusResponseJson r3 = (com.facebook.aura.partners.voice.infra.MicStatusResponseJson) r3
            if (r3 == 0) goto L31
            java.lang.Boolean r0 = r3.accepted
        L31:
            return r0
        L32:
            X.Hwg.A00(r4)
            com.facebook.aura.network.http.HatchHttpApi r7 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.partners.voice.api.VoiceJarvisPath$VoiceMicStatus r11 = com.facebook.aura.partners.voice.api.VoiceJarvisPath.VoiceMicStatus.INSTANCE
            r4 = r28
            if (r28 == 0) goto La3
            java.lang.String r0 = "muted"
        L3f:
            com.facebook.aura.partners.voice.infra.MicStatusRequestJson r12 = new com.facebook.aura.partners.voice.infra.MicStatusRequestJson
            r6 = r27
            r12.<init>(r6, r0)
            com.facebook.aura.network.http.RequestType r13 = com.facebook.aura.network.http.RequestType.POST
            X.CGz r14 = r5.userSession
            r5 = 5
            java.lang.Long r15 = X.C3cG.A0S(r5)
            r10 = 0
            X.HxE[] r5 = new X.HxE[r10]
            java.util.Set r18 = X.AnonymousClass004.A18()
            X.9jH r21 = X.C9jH.A00
            com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository$reportMicStatus$$inlined$executeJarvisRequest-Z6QaZII$default$1 r8 = com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository$reportMicStatus$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE
            com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository$reportMicStatus$$inlined$executeJarvisRequest-Z6QaZII$default$2 r9 = com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository$reportMicStatus$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE
            r0 = 0
            r3.L$0 = r0
            r3.L$1 = r0
            r3.L$2 = r0
            r3.L$3 = r0
            r3.L$4 = r0
            r3.L$5 = r0
            r3.L$6 = r0
            r3.L$7 = r0
            r3.L$8 = r0
            r3.L$9 = r0
            r3.Z$0 = r4
            r3.I$0 = r1
            r3.I$1 = r1
            r3.I$2 = r10
            r3.I$3 = r1
            r3.I$4 = r10
            r3.I$5 = r10
            r3.I$6 = r10
            r3.label = r1
            r20 = r1
            r22 = r0
            r23 = r10
            r24 = r1
            r25 = r10
            r26 = r10
            r27 = r0
            r28 = r10
            r29 = r3
            r17 = r5
            r19 = r1
            r16 = r0
            java.lang.Object r3 = r7.m1599executeJarvisRequestWithFof5HsY(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            if (r3 != r2) goto L25
            return r2
        La3:
            java.lang.String r0 = "live"
            goto L3f
        La6:
            com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository$reportMicStatus$1 r3 = new com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository$reportMicStatus$1
            r3.<init>(r4)
            goto L16
        Lad:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository.reportMicStatus(java.lang.String, boolean, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object reportPlaybackStatus(java.lang.String r30, long r31, boolean r33, X.HtJ<? super java.lang.Boolean> r34) {
        /*
            r29 = this;
            r3 = r34
            boolean r0 = r3 instanceof com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository.C131221
            r8 = r29
            if (r0 == 0) goto Lae
            r6 = r3
            com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository$reportPlaybackStatus$1 r6 = (com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository.C131221) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lae
            int r2 = r2 - r1
            r6.label = r2
        L16:
            java.lang.Object r1 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L32
            if (r0 != r4) goto Lb5
            java.lang.Object r2 = X.AnonymousClass001.A0q(r1)
        L25:
            boolean r1 = r2 instanceof X.C10571Hud
            r0 = 0
            if (r1 == 0) goto L2b
            r2 = r0
        L2b:
            com.facebook.aura.partners.voice.infra.PlaybackStatusResponseJson r2 = (com.facebook.aura.partners.voice.infra.PlaybackStatusResponseJson) r2
            if (r2 == 0) goto L31
            java.lang.Boolean r0 = r2.accepted
        L31:
            return r0
        L32:
            X.Hwg.A00(r1)
            com.facebook.aura.network.http.HatchHttpApi r12 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.partners.voice.api.VoiceJarvisPath$VoicePlaybackStatus r16 = com.facebook.aura.partners.voice.api.VoiceJarvisPath.VoicePlaybackStatus.INSTANCE
            r7 = r33
            if (r33 == 0) goto Lab
            java.lang.String r2 = "playing"
        L3f:
            com.facebook.aura.partners.voice.infra.PlaybackStatusRequestJson r3 = new com.facebook.aura.partners.voice.infra.PlaybackStatusRequestJson
            r9 = r30
            r0 = r31
            r3.<init>(r9, r0, r2)
            com.facebook.aura.network.http.RequestType r18 = com.facebook.aura.network.http.RequestType.POST
            X.CGz r9 = r8.userSession
            r10 = 3
            java.lang.Long r20 = X.C3cG.A0S(r10)
            r15 = 0
            X.HxE[] r8 = new X.HxE[r15]
            java.util.Set r23 = X.AnonymousClass004.A18()
            X.9jH r26 = X.C9jH.A00
            com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository$reportPlaybackStatus$$inlined$executeJarvisRequest-Z6QaZII$default$1 r13 = com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository$reportPlaybackStatus$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE
            com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository$reportPlaybackStatus$$inlined$executeJarvisRequest-Z6QaZII$default$2 r14 = com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository$reportPlaybackStatus$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE
            r2 = 0
            r6.L$0 = r2
            r6.L$1 = r2
            r6.L$2 = r2
            r6.L$3 = r2
            r6.L$4 = r2
            r6.L$5 = r2
            r6.L$6 = r2
            r6.L$7 = r2
            r6.L$8 = r2
            r6.L$9 = r2
            r6.J$0 = r0
            r6.Z$0 = r7
            r6.I$0 = r4
            r6.I$1 = r4
            r6.I$2 = r15
            r6.I$3 = r4
            r6.I$4 = r15
            r6.I$5 = r15
            r6.I$6 = r15
            r6.label = r4
            r25 = r4
            r27 = r2
            r28 = r15
            r29 = r4
            r30 = r15
            r31 = r15
            r32 = r2
            r33 = r15
            r34 = r6
            r21 = r2
            r22 = r8
            r24 = r4
            r19 = r9
            r17 = r3
            java.lang.Object r2 = r12.m1599executeJarvisRequestWithFof5HsY(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            if (r2 != r5) goto L25
            return r5
        Lab:
            java.lang.String r2 = "idle"
            goto L3f
        Lae:
            com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository$reportPlaybackStatus$1 r6 = new com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository$reportPlaybackStatus$1
            r6.<init>(r3)
            goto L16
        Lb5:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository.reportPlaybackStatus(java.lang.String, long, boolean, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object reportUserSpeech(java.lang.String r25, java.lang.String r26, com.facebook.aura.partners.voice.infra.UserSpeechState r27, X.HtJ<? super java.lang.Boolean> r28) {
        /*
            r24 = this;
            r4 = r28
            boolean r0 = r4 instanceof com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository.C131231
            r5 = r24
            if (r0 == 0) goto L9d
            r3 = r4
            com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository$reportUserSpeech$1 r3 = (com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository.C131231) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9d
            int r2 = r2 - r1
            r3.label = r2
        L16:
            java.lang.Object r1 = r3.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r9 = 1
            if (r0 == 0) goto L2c
            if (r0 != r9) goto La4
            java.lang.Object r0 = X.AnonymousClass001.A0q(r1)
        L25:
            boolean r0 = r0 instanceof X.C10571Hud
            java.lang.Boolean r2 = X.C3cG.A0P(r0)
            return r2
        L2c:
            X.Hwg.A00(r1)
            com.facebook.aura.network.http.HatchHttpApi r6 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.partners.voice.api.VoiceJarvisPath$VoiceCallsUserSpeech r10 = com.facebook.aura.partners.voice.api.VoiceJarvisPath.VoiceCallsUserSpeech.INSTANCE
            java.lang.String r0 = r27.getWireValue()
            com.facebook.aura.partners.voice.infra.UserSpeechRequestJson r11 = new com.facebook.aura.partners.voice.infra.UserSpeechRequestJson
            r4 = r25
            r1 = r26
            r11.<init>(r4, r1, r0)
            com.facebook.aura.network.http.RequestType r12 = com.facebook.aura.network.http.RequestType.POST
            X.CGz r13 = r5.userSession
            r0 = 5
            java.lang.Long r14 = X.C3cG.A0S(r0)
            r1 = 0
            X.HxE[] r0 = new X.HxE[r1]
            java.util.Set r17 = X.AnonymousClass004.A18()
            X.9jH r20 = X.C9jH.A00
            com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository$reportUserSpeech$$inlined$executeJarvisRequest-Z6QaZII$default$1 r7 = com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository$reportUserSpeech$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE
            com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository$reportUserSpeech$$inlined$executeJarvisRequest-Z6QaZII$default$2 r8 = com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository$reportUserSpeech$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE
            r15 = 0
            r3.L$0 = r15
            r3.L$1 = r15
            r3.L$2 = r15
            r3.L$3 = r15
            r3.L$4 = r15
            r3.L$5 = r15
            r3.L$6 = r15
            r3.L$7 = r15
            r3.L$8 = r15
            r3.L$9 = r15
            r3.L$10 = r15
            r3.L$11 = r15
            r3.I$0 = r9
            r3.I$1 = r9
            r3.I$2 = r1
            r3.I$3 = r9
            r3.I$4 = r1
            r3.I$5 = r1
            r3.I$6 = r1
            r3.label = r9
            r18 = r9
            r19 = r9
            r21 = r15
            r22 = r1
            r23 = r9
            r24 = r1
            r25 = r1
            r26 = r15
            r27 = r1
            r28 = r3
            r16 = r0
            java.lang.Object r0 = r6.m1599executeJarvisRequestWithFof5HsY(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            if (r0 != r2) goto L25
            return r2
        L9d:
            com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository$reportUserSpeech$1 r3 = new com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository$reportUserSpeech$1
            r3.<init>(r4)
            goto L16
        La4:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository.reportUserSpeech(java.lang.String, java.lang.String, com.facebook.aura.partners.voice.infra.UserSpeechState, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object selectVoicePipelineProfile(java.lang.String r7, X.HtJ<? super com.facebook.aura.partners.voice.api.VoicePipelineProfileState> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository.C131241
            if (r0 == 0) goto L4f
            r5 = r8
            com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository$selectVoicePipelineProfile$1 r5 = (com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository.C131241) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4f
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L2d
            if (r0 != r3) goto L55
            java.lang.Object r6 = r5.L$2
            com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository r6 = (com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository) r6
            X.Hwg.A00(r1)
        L24:
            com.facebook.aura.network.transport.HatchHttpResponse r1 = (com.facebook.aura.network.transport.HatchHttpResponse) r1
            java.lang.String r0 = "selectVoicePipelineProfile"
            com.facebook.aura.partners.voice.api.VoicePipelineProfileState r0 = r6.parseVoicePipelineProfiles(r1, r0)
            return r0
        L2d:
            X.Hwg.A00(r1)
            X.9sU r2 = com.facebook.aura.json.HatchJsonKt.HatchJson
            com.facebook.aura.partners.voice.infra.SelectVoicePipelineProfileRequestJson$$serializer r1 = com.facebook.aura.partners.voice.infra.SelectVoicePipelineProfileRequestJson$$serializer.INSTANCE
            com.facebook.aura.partners.voice.infra.SelectVoicePipelineProfileRequestJson r0 = new com.facebook.aura.partners.voice.infra.SelectVoicePipelineProfileRequestJson
            r0.<init>(r7)
            java.lang.String r1 = r2.A02(r0, r1)
            r0 = 0
            r5.L$0 = r0
            r5.L$1 = r0
            r5.L$2 = r6
            r5.label = r3
            java.lang.String r0 = "api/voice/pipeline-profile"
            java.lang.Object r1 = r6.executeWithRequestId(r0, r1, r5)
            if (r1 != r4) goto L24
            return r4
        L4f:
            com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository$selectVoicePipelineProfile$1 r5 = new com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository$selectVoicePipelineProfile$1
            r5.<init>(r8)
            goto L12
        L55:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository.selectVoicePipelineProfile(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object startCall(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.Double r21, java.lang.Double r22, java.lang.Long r23, java.lang.String r24, boolean r25, X.HtJ<? super com.facebook.aura.partners.voice.infra.StartCallResult> r26) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository.startCall(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Double, java.lang.Double, java.lang.Long, java.lang.String, boolean, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object userSpeechStarted(X.HtJ<? super java.lang.Boolean> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository.C131261
            if (r0 == 0) goto L5a
            r5 = r7
            com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository$userSpeechStarted$1 r5 = (com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository.C131261) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5a
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L3c
            if (r0 != r3) goto L60
            X.Hwg.A00(r1)
        L20:
            com.facebook.aura.network.transport.HatchHttpResponse r1 = (com.facebook.aura.network.transport.HatchHttpResponse) r1
            if (r1 != 0) goto L31
            java.lang.String r1 = "VoiceCallActivityRepository"
            java.lang.String r0 = "userSpeechStarted: request failed (null response)"
            X.CFK.A06(r1, r0)
        L2b:
            r3 = 0
        L2c:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            return r4
        L31:
            int r1 = r1.statusCode
            r0 = 200(0xc8, float:2.8E-43)
            if (r0 > r1) goto L2b
            r0 = 300(0x12c, float:4.2E-43)
            if (r1 >= r0) goto L2b
            goto L2c
        L3c:
            X.Hwg.A00(r1)
            X.9sU r2 = com.facebook.aura.json.HatchJsonKt.HatchJson
            com.facebook.aura.partners.voice.infra.UserSpeechStartedRequestJson$$serializer r1 = com.facebook.aura.partners.voice.infra.UserSpeechStartedRequestJson$$serializer.INSTANCE
            com.facebook.aura.partners.voice.infra.UserSpeechStartedRequestJson r0 = new com.facebook.aura.partners.voice.infra.UserSpeechStartedRequestJson
            r0.<init>()
            java.lang.String r1 = r2.A02(r0, r1)
            r0 = 0
            r5.L$0 = r0
            r5.label = r3
            java.lang.String r0 = "api/voice/user-speech-started"
            java.lang.Object r1 = r6.executeWithRequestId(r0, r1, r5)
            if (r1 != r4) goto L20
            return r4
        L5a:
            com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository$userSpeechStarted$1 r5 = new com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository$userSpeechStarted$1
            r5.<init>(r7)
            goto L12
        L60:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository.userSpeechStarted(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|2|(2:4|(1:6)(1:13))(0)|7|(1:(3:(1:(7:12|73|48|49|(1:51)(1:52)|53|54)(2:14|15))(8:16|68|17|76|25|(5:70|27|(6:71|29|32|(1:34)|35|(1:37))(1:38)|39|(1:41)(6:44|74|45|(1:47)|49|(0)(0)))(0)|53|54)|64|65)(1:18))(2:19|(1:21))|66|22|(1:24)|76|25|(0)(0)|53|54) */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x010f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0111, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a1 A[Catch: all -> 0x010f, TRY_ENTER, TryCatch #6 {all -> 0x010f, blocks: (B:25:0x0076, B:39:0x00a3, B:44:0x00c9, B:38:0x00a1), top: B:76:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fd A[Catch: all -> 0x010b, TryCatch #4 {all -> 0x010b, blocks: (B:48:0x00f4, B:49:0x00f7, B:51:0x00fd, B:52:0x0100), top: B:73:0x00f4 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0100 A[Catch: all -> 0x010b, TRY_LEAVE, TryCatch #4 {all -> 0x010b, blocks: (B:48:0x00f4, B:49:0x00f7, B:51:0x00fd, B:52:0x0100), top: B:73:0x00f4 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x007a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object writeGreetingDelayMs(int r17, X.HtJ<? super com.facebook.aura.partners.voice.infra.GreetingDelayWriteResult> r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository.writeGreetingDelayMs(int, X.HtJ):java.lang.Object");
    }
}
