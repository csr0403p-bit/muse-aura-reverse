package com.facebook.aura.gateway;

import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BV4;
import X.BV5;
import X.C31u;
import X.C3cG;
import X.C7384Etj;
import X.C7438Evz;
import X.C7462Ewq;
import X.G0V;
import X.HtJ;
import X.HzP;
import X.InterfaceC7359EnW;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmRvKeyResolution;
import com.facebook.aura.conversation.offline.HatchOfflineConversationRepository;
import com.facebook.aura.gateway.MC;
import com.facebook.aura.gateway.ResolvedNoisePrivateAuth;
import com.facebook.aura.gateway.connection.Presence;
import com.facebook.aura.gateway.store.HatchVmConfidentiality;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.network.transport.HatchConnectTimeout;
import com.facebook.aura.network.transport.HatchNoiseChipBindingPolicy;
import com.facebook.aura.network.transport.HatchNoiseHandshakeOutcome;
import java.io.IOException;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes5.dex */
public abstract class HatchGatewayConnectionKt {
    public static final String ANNOTATION_CONNECT_PHASE = "connect_phase";
    public static final String ANNOTATION_CONNECT_TIMEOUT_BUDGET_MS = "connect_timeout_budget_ms";
    public static final String ANNOTATION_CONNECT_TIMEOUT_ELAPSED_MS = "connect_timeout_elapsed_ms";
    public static final long ATTEMPT_CONTINUITY_IDLE_WINDOW_MS = 90000;
    public static final long ATTEMPT_CONTINUITY_MAX_AGE_MS = 600000;
    public static final int BACKGROUND_CYCLE_WAKE_RETRY_COUNT = -2;
    public static final String CONNECT_PHASE_CONNECTED = "connected";
    public static final String CONNECT_PHASE_CREDENTIAL_FETCH = "credential_fetch";
    public static final String CONNECT_PHASE_NOISE_HANDSHAKE = "noise_handshake";
    public static final String CONNECT_PHASE_WS_OPEN = "ws_open";
    public static final String CONNECT_PHASE_WS_SUBSCRIBE_ACK = "ws_subscribe_ack";
    public static final String CONNECT_PHASE_WS_UPGRADE = "ws_upgrade";
    public static final String CREDENTIAL_FAILURE_DETAIL_MISSING_CACHED_VM_AUTH_TOKEN = "missing_cached_vm_auth_token";
    public static final String CREDENTIAL_RECONNECT_REASON = "credential_available";
    public static final String ERROR_MESSAGE_STALE_SESSION = "gateway_session_is_not_current";
    public static final String ERROR_TYPE_HANDSHAKE_TIMEOUT = "handshake_timeout";
    public static final String ERROR_TYPE_STALE_SESSION = "StaleUserSession";
    public static final String ERROR_TYPE_VM_CHAT_SUBSCRIBE_ACK_TIMEOUT = "vm_chat_subscribe_ack_timeout";
    public static final long GATEWAY_UI_CONNECT_TIMEOUT_MS = 15000;
    public static final int HTTP_STATUS_BAD_GATEWAY = 502;
    public static final int HTTP_STATUS_BAD_REQUEST = 400;
    public static final long KEEPALIVE_RESPONSE_MAX_WAIT_MS = 120000;
    public static final long KEEPALIVE_RESPONSE_TIMEOUT_MS = 15000;
    public static final String NOISE_HOST_DATA_REJECTED = "noise.handshake.host_data_rejected";
    public static final String NOISE_VM_PROOF_FAILED = "noise.handshake.private_auth.vm_proof_failed";
    public static final long PROVISIONING_STATUS_RESOLUTION_TIMEOUT_MS = 15000;
    public static final String SERVICE_CODE_STORAGE_FULL = "http_507";
    public static final long STORAGE_RECOVERY_RECONNECT_TIMEOUT_MS = 45000;
    public static final String SUBSCRIBE_ERROR_CODE_BAD_GATEWAY = "http_502";
    public static final String SUBSCRIBE_ERROR_CODE_BAD_REQUEST = "http_400";
    public static final String TAG = "HatchGatewayConnection";
    public static final String TOKEN_SOURCE_MISSING = "missing";
    public static final String TOKEN_SOURCE_VM_AUTH_TOKEN = "vm_auth_token";
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = {new C7462Ewq(HatchGatewayConnectionKt.class, "gatewayServiceRestartReconnectDelayMs", "getGatewayServiceRestartReconnectDelayMs()J", 1), new C7462Ewq(HatchGatewayConnectionKt.class, "isBackgroundCycleWakeEnabled", "isBackgroundCycleWakeEnabled()Z", 1), new C7462Ewq(HatchGatewayConnectionKt.class, "isGatewayRegionHintEnabled", "isGatewayRegionHintEnabled()Z", 1)};
    public static final C31u gatewayServiceRestartReconnectDelayMs$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigLong(MC.hatch_android_networking.gateway_service_restart_reconnect_delay_ms);
    public static final C31u isBackgroundCycleWakeEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android_networking.enable_background_cycle_wake);
    public static final C31u isGatewayRegionHintEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android_networking.enable_gateway_region_hint);

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchGatewayConnectionKt", f = "HatchGatewayConnection.kt", l = {2626}, m = "resolveNoiseChipBindingPolicy", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchGatewayConnectionKt$resolveNoiseChipBindingPolicy$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchGatewayConnectionKt.resolveNoiseChipBindingPolicy(null, null, null, this);
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchGatewayConnectionKt", f = "HatchGatewayConnection.kt", l = {2577, 2588}, m = "resolveNoisePrivateAuth", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchGatewayConnectionKt$resolveNoisePrivateAuth$1, reason: invalid class name and case insensitive filesystem */
    public final class C121141 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchGatewayConnectionKt.resolveNoisePrivateAuth((AbstractC3358CGz) null, (String) null, (HatchVmConfidentiality) null, this);
        }

        public C121141(HtJ<? super C121141> htJ) {
            super(htJ);
        }
    }

    /* renamed from: com.facebook.aura.gateway.HatchGatewayConnectionKt$resolveNoisePrivateAuth$2, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass2 extends C7438Evz implements G0V<String, String, String> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(2, VmNotaryTokenKt.class, "getVmNotaryToken", "getVmNotaryToken(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", 1);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ String invoke(String str, String str2) {
            String str3 = str2;
            C7384Etj.A0Y(str3, 1);
            return VmNotaryTokenKt.getVmNotaryToken(str, str3);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String invoke2(String str, String str2) {
            C7384Etj.A0Y(str2, 1);
            return VmNotaryTokenKt.getVmNotaryToken(str, str2);
        }
    }

    /* renamed from: com.facebook.aura.gateway.HatchGatewayConnectionKt$resolveNoisePrivateAuth$3, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass3 extends C7438Evz implements G0V<String, String, String> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(2, VmNotaryTokenKt.class, "getVmNotaryToken", "getVmNotaryToken(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", 1);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ String invoke(String str, String str2) {
            String str3 = str2;
            C7384Etj.A0Y(str3, 1);
            return VmNotaryTokenKt.getVmNotaryToken(str, str3);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String invoke2(String str, String str2) {
            C7384Etj.A0Y(str2, 1);
            return VmNotaryTokenKt.getVmNotaryToken(str, str2);
        }
    }

    public static final GatewayConnectStage afterTransportReady(GatewayConnectStage gatewayConnectStage) {
        C7384Etj.A0Y(gatewayConnectStage, 0);
        return gatewayConnectStage == GatewayConnectStage.OPENING_WEBSOCKET ? GatewayConnectStage.AWAITING_WEBSOCKET_UPGRADE : gatewayConnectStage;
    }

    public static final GatewayConnectStage afterWebSocketUpgrade(GatewayConnectStage gatewayConnectStage) {
        int iA0E = AnonymousClass001.A0E(gatewayConnectStage, 0);
        return (iA0E == 2 || iA0E == 3) ? GatewayConnectStage.AWAITING_NOISE_READY : gatewayConnectStage;
    }

    public static final AttestedHostDataVerdict attestedHostDataVerdict(NoisePrivateAuthAttempt noisePrivateAuthAttempt, HatchNoiseHandshakeOutcome hatchNoiseHandshakeOutcome, String str) {
        C7384Etj.A0Y(noisePrivateAuthAttempt, 0);
        if (noisePrivateAuthAttempt != NoisePrivateAuthAttempt.AUTHENTICATE) {
            return null;
        }
        if (str == null && hatchNoiseHandshakeOutcome == HatchNoiseHandshakeOutcome.PRIVATE_AUTH_PEER_VERIFIED) {
            return AttestedHostDataVerdict.MATCHED;
        }
        if (!NOISE_HOST_DATA_REJECTED.equals(str)) {
            return null;
        }
        if (hatchNoiseHandshakeOutcome == null || hatchNoiseHandshakeOutcome == HatchNoiseHandshakeOutcome.VERIFICATION_FAILED) {
            return AttestedHostDataVerdict.REJECTED;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003c, code lost:
    
        if ("noise.handshake.private_auth.vm_proof_failed".equals(r9) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.gateway.NoiseFailureDisposition classifyNoiseFailure(com.facebook.aura.gateway.NoisePrivateAuthAttempt r6, com.facebook.aura.gateway.store.HatchVmConfidentiality r7, com.facebook.aura.network.transport.HatchNoiseHandshakeOutcome r8, java.lang.String r9) {
        /*
            r5 = 0
            X.C7384Etj.A0Y(r6, r5)
            r4 = 1
            r3 = 2
            X.C7384Etj.A0Y(r7, r4)
            r0 = -1
            int r1 = X.AnonymousClass003.A0M(r8)
            r2 = 0
            if (r1 == r0) goto L46
            if (r1 == r3) goto L22
            r0 = 3
            if (r1 == r0) goto L22
            r0 = 4
            if (r1 == r0) goto L2e
            if (r1 == r5) goto L46
            if (r1 == r4) goto L46
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        L22:
            com.facebook.aura.gateway.NoisePrivateAuthAttempt r0 = com.facebook.aura.gateway.NoisePrivateAuthAttempt.LEGACY
            if (r6 != r0) goto L3e
            com.facebook.aura.network.transport.HatchNoiseHandshakeOutcome r0 = com.facebook.aura.network.transport.HatchNoiseHandshakeOutcome.VERIFICATION_FAILED
            com.facebook.aura.gateway.NoiseFailureDisposition r1 = new com.facebook.aura.gateway.NoiseFailureDisposition
            r1.<init>(r2, r0)
            return r1
        L2e:
            com.facebook.aura.gateway.NoisePrivateAuthAttempt r0 = com.facebook.aura.gateway.NoisePrivateAuthAttempt.DISCOVER
            if (r6 != r0) goto L46
            com.facebook.aura.gateway.store.HatchVmConfidentiality r0 = com.facebook.aura.gateway.store.HatchVmConfidentiality.UNKNOWN
            if (r7 != r0) goto L46
            java.lang.String r0 = "noise.handshake.private_auth.vm_proof_failed"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L46
        L3e:
            com.facebook.aura.gateway.store.HatchVmConfidentiality r0 = com.facebook.aura.gateway.store.HatchVmConfidentiality.CONFIDENTIAL
            com.facebook.aura.gateway.NoiseFailureDisposition r1 = new com.facebook.aura.gateway.NoiseFailureDisposition
            r1.<init>(r0, r8)
            return r1
        L46:
            com.facebook.aura.gateway.NoiseFailureDisposition r1 = new com.facebook.aura.gateway.NoiseFailureDisposition
            r1.<init>(r2, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchGatewayConnectionKt.classifyNoiseFailure(com.facebook.aura.gateway.NoisePrivateAuthAttempt, com.facebook.aura.gateway.store.HatchVmConfidentiality, com.facebook.aura.network.transport.HatchNoiseHandshakeOutcome, java.lang.String):com.facebook.aura.gateway.NoiseFailureDisposition");
    }

    public static final boolean isLegacyPeerDowngrade(HatchVmConfidentiality hatchVmConfidentiality) {
        C7384Etj.A0Y(hatchVmConfidentiality, 0);
        return hatchVmConfidentiality == HatchVmConfidentiality.CONFIDENTIAL;
    }

    public static final NoisePrivateAuthAttempt noisePrivateAuthAttempt(HatchVmConfidentiality hatchVmConfidentiality) {
        int iA0E = AnonymousClass001.A0E(hatchVmConfidentiality, 0);
        if (iA0E == 0) {
            return NoisePrivateAuthAttempt.DISCOVER;
        }
        if (iA0E == 1) {
            return NoisePrivateAuthAttempt.LEGACY;
        }
        if (iA0E == 2) {
            return NoisePrivateAuthAttempt.AUTHENTICATE;
        }
        throw C3cG.A0q();
    }

    public static final String requireHatcheryVmId(String str) {
        C7384Etj.A0Y(str, 0);
        String strExtractHatcheryVMId = HatcheryVMIdUtilsKt.extractHatcheryVMId(str);
        if (strExtractHatcheryVMId == null || strExtractHatcheryVMId.length() <= 0) {
            throw BV4.A0K("noise.handshake.private_auth.missing_vm_id");
        }
        return strExtractHatcheryVMId;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.gateway.CachedGatewayCredentials resolveCachedGatewayCredentials(java.lang.String r6, boolean r7) {
        /*
            r0 = 0
            X.C7384Etj.A0Y(r6, r0)
            java.lang.String r6 = X.AnonymousClass002.A0l(r6)
            int r5 = r6.length()
            if (r5 != 0) goto L38
            java.lang.String r4 = ""
        L10:
            java.lang.String r1 = com.facebook.aura.gateway.HatcheryVMIdUtilsKt.extractHatcheryVMId(r6)
            java.lang.String r0 = "/v1/noise"
            boolean r3 = com.facebook.aura.gateway.VmNotaryTokenKt.isVmNotaryTokenExpired(r1, r0)
            r2 = 0
            if (r7 != 0) goto L28
            if (r5 == 0) goto L28
            int r0 = r4.length()
            if (r0 == 0) goto L28
            r1 = 0
            if (r3 == 0) goto L29
        L28:
            r1 = 1
        L29:
            if (r5 <= 0) goto L32
            int r0 = r4.length()
            if (r0 != 0) goto L32
            r2 = 1
        L32:
            com.facebook.aura.gateway.CachedGatewayCredentials r0 = new com.facebook.aura.gateway.CachedGatewayCredentials
            r0.<init>(r6, r4, r1, r2)
            return r0
        L38:
            java.lang.String r4 = com.facebook.aura.gateway.VmAuthTokenKt.vmAuthTokenForGatewayUrl(r6)
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchGatewayConnectionKt.resolveCachedGatewayCredentials(java.lang.String, boolean):com.facebook.aura.gateway.CachedGatewayCredentials");
    }

    public static final boolean shouldReportCredentialFailureAsUrlUnavailable(String str) {
        C7384Etj.A0Y(str, 0);
        return str.equals(HatchVmRepositoryKt.ERROR_TYPE_NO_VALID_VM_URL);
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[GatewayConnectStage.values().length];
            try {
                AnonymousClass005.A0v(GatewayConnectStage.OPENING_WEBSOCKET, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(GatewayConnectStage.AWAITING_WEBSOCKET_UPGRADE, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[HatchVmConfidentiality.values().length];
            try {
                AnonymousClass005.A0v(HatchVmConfidentiality.UNKNOWN, iArr2, 1);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass005.A0v(HatchVmConfidentiality.STANDARD, iArr2, 2);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass005.A0v(HatchVmConfidentiality.CONFIDENTIAL, iArr2, 3);
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[NoisePrivateAuthAttempt.values().length];
            try {
                AnonymousClass005.A0v(NoisePrivateAuthAttempt.LEGACY, iArr3, 1);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass005.A0v(NoisePrivateAuthAttempt.DISCOVER, iArr3, 2);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass005.A0v(NoisePrivateAuthAttempt.AUTHENTICATE, iArr3, 3);
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[HatchNoiseHandshakeOutcome.values().length];
            try {
                AnonymousClass005.A0v(HatchNoiseHandshakeOutcome.ENROLLMENT_REQUIRED, iArr4, 1);
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AnonymousClass005.A0v(HatchNoiseHandshakeOutcome.KEY_REQUIRED, iArr4, 2);
            } catch (NoSuchFieldError unused10) {
            }
            try {
                AnonymousClass005.A0v(HatchNoiseHandshakeOutcome.VERIFICATION_FAILED, iArr4, 3);
            } catch (NoSuchFieldError unused11) {
            }
            try {
                AnonymousClass002.A16(HatchNoiseHandshakeOutcome.LEGACY_PEER_VERIFIED, iArr4);
            } catch (NoSuchFieldError unused12) {
            }
            try {
                AnonymousClass002.A17(HatchNoiseHandshakeOutcome.PRIVATE_AUTH_PEER_VERIFIED, iArr4);
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    public static /* synthetic */ NoiseFailureDisposition classifyNoiseFailure$default(NoisePrivateAuthAttempt noisePrivateAuthAttempt, HatchVmConfidentiality hatchVmConfidentiality, HatchNoiseHandshakeOutcome hatchNoiseHandshakeOutcome, String str, int i, Object obj) {
        if ((i & 8) != 0) {
            str = null;
        }
        return classifyNoiseFailure(noisePrivateAuthAttempt, hatchVmConfidentiality, hatchNoiseHandshakeOutcome, str);
    }

    public static final GatewayConnectStage getGatewayConnectStage(HatchConnectTimeout hatchConnectTimeout) {
        if (hatchConnectTimeout instanceof HatchConnectTimeout.WebSocketUpgrade) {
            return GatewayConnectStage.AWAITING_WEBSOCKET_UPGRADE;
        }
        if (hatchConnectTimeout instanceof HatchConnectTimeout.NoiseHandshake) {
            return GatewayConnectStage.AWAITING_NOISE_READY;
        }
        throw C3cG.A0q();
    }

    public static final long getGatewayServiceRestartReconnectDelayMs() {
        return C3cG.A05(C31u.A00(gatewayServiceRestartReconnectDelayMs$delegate, $$delegatedProperties));
    }

    public static final String getWireValue(Presence presence) {
        return presence == Presence.ACTIVE ? HatchOfflineConversationRepository.THREAD_STATUS_ACTIVE : "away";
    }

    public static final boolean isBackgroundCycleWakeEnabled() {
        return BV5.A1W(isBackgroundCycleWakeEnabled$delegate, $$delegatedProperties, 1);
    }

    public static final boolean isCvmCredentialRequired(HatchNoiseHandshakeOutcome hatchNoiseHandshakeOutcome) {
        return hatchNoiseHandshakeOutcome == HatchNoiseHandshakeOutcome.ENROLLMENT_REQUIRED || hatchNoiseHandshakeOutcome == HatchNoiseHandshakeOutcome.KEY_REQUIRED;
    }

    public static final boolean isGatewayRegionHintEnabled() {
        return BV5.A1W(isGatewayRegionHintEnabled$delegate, $$delegatedProperties, 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object resolveNoiseChipBindingPolicy(X.AbstractC3358CGz r7, java.lang.String r8, com.facebook.aura.gateway.store.HatchCvmChipClaim r9, X.HtJ<? super com.facebook.aura.network.transport.HatchNoiseChipBindingPolicy> r10) throws java.io.IOException {
        /*
            boolean r0 = r10 instanceof com.facebook.aura.gateway.HatchGatewayConnectionKt.AnonymousClass1
            if (r0 == 0) goto Lbd
            r5 = r10
            com.facebook.aura.gateway.HatchGatewayConnectionKt$resolveNoiseChipBindingPolicy$1 r5 = (com.facebook.aura.gateway.HatchGatewayConnectionKt.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lbd
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r2 = r5.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L8b
            if (r0 != r3) goto Ldf
            java.lang.Object r1 = r5.L$5
            java.lang.Object r9 = r5.L$2
            com.facebook.aura.gateway.store.HatchCvmChipClaim r9 = (com.facebook.aura.gateway.store.HatchCvmChipClaim) r9
            java.lang.Object r8 = r5.L$1
            java.lang.String r8 = (java.lang.String) r8
            X.Hwg.A00(r2)
        L2b:
            com.facebook.aura.gateway.HatchCvmReplacement r2 = (com.facebook.aura.gateway.HatchCvmReplacement) r2
            if (r2 == 0) goto L37
            com.facebook.aura.gateway.HatchCvmReplacement$NotFound r0 = com.facebook.aura.gateway.HatchCvmReplacement.NotFound.INSTANCE
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L3d
        L37:
            if (r1 != 0) goto Ld8
            if (r2 != 0) goto L3d
        L3b:
            com.facebook.aura.gateway.HatchCvmReplacement$None r2 = com.facebook.aura.gateway.HatchCvmReplacement.None.INSTANCE
        L3d:
            com.facebook.aura.gateway.HatchCvmReplacement$None r0 = com.facebook.aura.gateway.HatchCvmReplacement.None.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r2, r0)
            if (r0 != 0) goto Ld7
            com.facebook.aura.gateway.HatchCvmReplacement$NotFound r0 = com.facebook.aura.gateway.HatchCvmReplacement.NotFound.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r2, r0)
            if (r0 != 0) goto Ld7
            com.facebook.aura.gateway.HatchCvmReplacement$Unknown r0 = com.facebook.aura.gateway.HatchCvmReplacement.Unknown.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r2, r0)
            if (r0 != 0) goto Ld0
            boolean r0 = r2 instanceof com.facebook.aura.gateway.HatchCvmReplacement.Active
            if (r0 == 0) goto Lcb
            com.facebook.aura.gateway.HatchCvmReplacement$Active r2 = (com.facebook.aura.gateway.HatchCvmReplacement.Active) r2
            boolean r0 = com.facebook.aura.gateway.HatchCvmReplaceStoreKt.isAwaitingChipPinnedUnlock(r2)
            if (r0 == 0) goto Lc4
            com.facebook.aura.gateway.HatchCvmChipPin r1 = com.facebook.aura.gateway.HatchCvmChipPin.INSTANCE
            java.util.List r3 = r1.expectedChipIdsForLockedReplacement$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(r2, r9)
            if (r9 == 0) goto L72
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L72
            r1.recordOwnedClaim$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(r8, r9)
        L72:
            com.facebook.aura.common.HatchCvmChipPinPurpose r2 = com.facebook.aura.common.HatchCvmChipPinPurpose.HARD_REPLACEMENT
            if (r9 == 0) goto L85
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L85
            java.lang.String r1 = r9.attemptId
            java.lang.String r0 = r9.nonce
            com.facebook.aura.network.transport.HatchNoiseChipAuthorization r4 = new com.facebook.aura.network.transport.HatchNoiseChipAuthorization
            r4.<init>(r1, r0, r3)
        L85:
            com.facebook.aura.network.transport.HatchNoiseChipBindingPolicy r0 = new com.facebook.aura.network.transport.HatchNoiseChipBindingPolicy
            r0.<init>(r2, r3, r4)
            return r0
        L8b:
            X.Hwg.A00(r2)
            com.facebook.aura.gateway.HatchCvmReplaceStore$Companion r0 = com.facebook.aura.gateway.HatchCvmReplaceStore.Companion
            com.facebook.aura.gateway.HatchCvmReplaceStore r2 = r0.getInstance(r7)
            X.1BN<com.facebook.aura.gateway.HatchCvmReplacement> r0 = r2.replacement
            java.lang.Object r0 = r0.getValue()
            com.facebook.aura.gateway.HatchCvmReplacement r0 = (com.facebook.aura.gateway.HatchCvmReplacement) r0
            com.facebook.aura.gateway.HatchCvmReplacement$Active r1 = com.facebook.aura.gateway.HatchCvmReplaceStoreKt.forVm(r0, r8)
            if (r1 != 0) goto La6
            boolean r0 = r0 instanceof com.facebook.aura.gateway.HatchCvmReplacement.Unknown
            if (r0 == 0) goto L3b
        La6:
            com.facebook.aura.gateway.HatchCvmReplaceSource r0 = com.facebook.aura.gateway.HatchCvmReplaceSource.CONNECT
            r5.L$0 = r4
            r5.L$1 = r8
            r5.L$2 = r9
            r5.L$3 = r4
            r5.L$4 = r4
            r5.L$5 = r1
            r5.label = r3
            java.lang.Object r2 = r2.refresh(r8, r0, r5)
            if (r2 != r6) goto L2b
            return r6
        Lbd:
            com.facebook.aura.gateway.HatchGatewayConnectionKt$resolveNoiseChipBindingPolicy$1 r5 = new com.facebook.aura.gateway.HatchGatewayConnectionKt$resolveNoiseChipBindingPolicy$1
            r5.<init>(r10)
            goto L12
        Lc4:
            java.lang.String r0 = "cvm.replacement_in_progress"
            java.io.IOException r0 = X.BV4.A0K(r0)
            throw r0
        Lcb:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        Ld0:
            java.lang.String r0 = "cvm.replacement_state_unknown"
            java.io.IOException r0 = X.BV4.A0K(r0)
            throw r0
        Ld7:
            return r4
        Ld8:
            java.lang.String r0 = "cvm.replacement_state_unavailable"
            java.io.IOException r0 = X.BV4.A0K(r0)
            throw r0
        Ldf:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchGatewayConnectionKt.resolveNoiseChipBindingPolicy(X.CGz, java.lang.String, com.facebook.aura.gateway.store.HatchCvmChipClaim, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ef  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object resolveNoisePrivateAuth(X.AbstractC3358CGz r10, java.lang.String r11, com.facebook.aura.gateway.store.HatchVmConfidentiality r12, X.HtJ<? super com.facebook.aura.gateway.ResolvedNoisePrivateAuth> r13) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchGatewayConnectionKt.resolveNoisePrivateAuth(X.CGz, java.lang.String, com.facebook.aura.gateway.store.HatchVmConfidentiality, X.HtJ):java.lang.Object");
    }

    public static /* synthetic */ ResolvedNoisePrivateAuth resolveNoisePrivateAuth$default(ConfidentialVmRvKeyResolution confidentialVmRvKeyResolution, String str, G0V g0v, HatchNoiseChipBindingPolicy hatchNoiseChipBindingPolicy, int i, Object obj) {
        if ((i & 8) != 0) {
            hatchNoiseChipBindingPolicy = null;
        }
        return resolveNoisePrivateAuth(confidentialVmRvKeyResolution, str, (G0V<? super String, ? super String, String>) g0v, hatchNoiseChipBindingPolicy);
    }

    public static final String resolveGatewayConnectFailureErrorType(String str, GatewayConnectStage gatewayConnectStage) {
        AnonymousClass003.A0u(str, gatewayConnectStage);
        return (str.equals(ERROR_TYPE_HANDSHAKE_TIMEOUT) && gatewayConnectStage == GatewayConnectStage.AWAITING_SUBSCRIBE_ACK) ? ERROR_TYPE_VM_CHAT_SUBSCRIBE_ACK_TIMEOUT : str;
    }

    public static final ResolvedNoisePrivateAuth resolveNoisePrivateAuth(ConfidentialVmRvKeyResolution confidentialVmRvKeyResolution, String str, G0V<? super String, ? super String, String> g0v, HatchNoiseChipBindingPolicy hatchNoiseChipBindingPolicy) throws IOException {
        AnonymousClass005.A0x(confidentialVmRvKeyResolution, str, g0v);
        if (confidentialVmRvKeyResolution instanceof ConfidentialVmRvKeyResolution.Available) {
            try {
                String strInvoke = g0v.invoke(str, VmNotaryTokenKt.NOISE_INGRESS_PATH);
                if (strInvoke.length() != 0) {
                    return new ResolvedNoisePrivateAuth.Authenticate(strInvoke, ((ConfidentialVmRvKeyResolution.Available) confidentialVmRvKeyResolution).key, hatchNoiseChipBindingPolicy);
                }
                throw BV4.A0K("noise.handshake.private_auth.missing_notary_token");
            } catch (Throwable th) {
                ((ConfidentialVmRvKeyResolution.Available) confidentialVmRvKeyResolution).key.close();
                throw th;
            }
        }
        if (!confidentialVmRvKeyResolution.equals(ConfidentialVmRvKeyResolution.NoStoredSecret.INSTANCE) && !confidentialVmRvKeyResolution.equals(ConfidentialVmRvKeyResolution.UnreadableSecret.INSTANCE)) {
            if (!confidentialVmRvKeyResolution.equals(ConfidentialVmRvKeyResolution.DeviceLocked.INSTANCE) && !confidentialVmRvKeyResolution.equals(ConfidentialVmRvKeyResolution.Failure.INSTANCE)) {
                throw C3cG.A0q();
            }
            throw BV4.A0K("noise.handshake.private_auth.rv_key_unavailable");
        }
        return new ResolvedNoisePrivateAuth.Discover(HatchVmConfidentiality.CONFIDENTIAL, hatchNoiseChipBindingPolicy);
    }
}
