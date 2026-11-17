package com.facebook.aura.gateway;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.F60;
import X.G0U;
import X.HtJ;
import X.HzP;
import com.facebook.aura.activation.view.AuraWaitlistConfettiKt;
import com.facebook.aura.ageverification.SelfieSnapshotKt;
import com.facebook.aura.gateway.HatchGatewayConnectionState;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.gateway.store.HatchVmConfidentiality;
import com.facebook.aura.network.api.JarvisPath;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.transport.HatchNoiseHandshakeOutcome;
import com.facebook.aura.network.transport.HatchVmProbeAuthProvider;
import com.facebook.aura.network.transport.HatchVmProbeResponseObserver;
import com.facebook.aura.network.transport.HatchVmProbeResult;
import com.facebook.aura.partners.voice.screen.HatchVoiceAnnouncementSheetKt;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes5.dex */
public final class HatchVmStatusProbe {
    public static final int $stable = 8;
    public final ConcurrentHashMap.KeySetView<String, Boolean> blockedVmIds;
    public final ConcurrentHashMap<String, HatchVmConfidentiality> learnedConfidentiality;
    public final HatchGatewayPrefsStore prefsStore;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchVmStatusProbe", f = "HatchVmStatusProbe.kt", l = {136, HatchVoiceAnnouncementSheetKt.NUX_FADE_IN_DELAY_MS}, m = "executeScopedProbe", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchVmStatusProbe$executeScopedProbe$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchVmStatusProbe.this.executeScopedProbe(null, null, null, null, this);
        }
    }

    /* renamed from: com.facebook.aura.gateway.HatchVmStatusProbe$executeScopedProbeAttempt$2, reason: invalid class name */
    public final class AnonymousClass2 implements HatchVmProbeAuthProvider {
        public final /* synthetic */ HatchVmConfidentiality $confidentiality;
        public final /* synthetic */ String $vmUrl;

        public AnonymousClass2(String str, HatchVmConfidentiality hatchVmConfidentiality) {
            this.$vmUrl = str;
            this.$confidentiality = hatchVmConfidentiality;
        }

        @Override // com.facebook.aura.network.transport.HatchVmProbeAuthProvider
        public boolean acceptsHandshake(HatchNoiseHandshakeOutcome hatchNoiseHandshakeOutcome) {
            return (hatchNoiseHandshakeOutcome == HatchNoiseHandshakeOutcome.LEGACY_PEER_VERIFIED && HatchGatewayConnectionKt.isLegacyPeerDowngrade(this.$confidentiality)) ? false : true;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
        @Override // com.facebook.aura.network.transport.HatchVmProbeAuthProvider
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object connect(X.G0U<? super com.facebook.aura.network.transport.HatchNoisePrivateAuth, ? extends com.facebook.aura.network.transport.HatchWebSocketSession> r7, X.HtJ<? super com.facebook.aura.network.transport.HatchWebSocketSession> r8) throws java.lang.Exception {
            /*
                r6 = this;
                boolean r0 = r8 instanceof com.facebook.aura.gateway.HatchVmStatusProbe$executeScopedProbeAttempt$2$connect$1
                if (r0 == 0) goto L3d
                r5 = r8
                com.facebook.aura.gateway.HatchVmStatusProbe$executeScopedProbeAttempt$2$connect$1 r5 = (com.facebook.aura.gateway.HatchVmStatusProbe$executeScopedProbeAttempt$2$connect$1) r5
                int r2 = r5.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r2 & r1
                if (r0 == 0) goto L3d
                int r2 = r2 - r1
                r5.label = r2
            L12:
                java.lang.Object r1 = r5.result
                X.Hji r4 = X.EnumC10460Hji.A02
                int r0 = r5.label
                r3 = 1
                if (r0 == 0) goto L27
                if (r0 != r3) goto L50
                java.lang.Object r7 = r5.L$0
                X.G0U r7 = (X.G0U) r7
                X.Hwg.A00(r1)
            L24:
                com.facebook.aura.gateway.ResolvedNoisePrivateAuth r1 = (com.facebook.aura.gateway.ResolvedNoisePrivateAuth) r1
                goto L43
            L27:
                X.Hwg.A00(r1)
                com.facebook.aura.gateway.HatchVmStatusProbe r0 = com.facebook.aura.gateway.HatchVmStatusProbe.this
                X.CGz r2 = r0.userSession
                java.lang.String r1 = r6.$vmUrl
                com.facebook.aura.gateway.store.HatchVmConfidentiality r0 = r6.$confidentiality
                r5.L$0 = r7
                r5.label = r3
                java.lang.Object r1 = com.facebook.aura.gateway.HatchGatewayConnectionKt.resolveNoisePrivateAuth(r2, r1, r0, r5)
                if (r1 != r4) goto L24
                return r4
            L3d:
                com.facebook.aura.gateway.HatchVmStatusProbe$executeScopedProbeAttempt$2$connect$1 r5 = new com.facebook.aura.gateway.HatchVmStatusProbe$executeScopedProbeAttempt$2$connect$1
                r5.<init>(r6, r8)
                goto L12
            L43:
                java.lang.Object r4 = r1.consume(r7)     // Catch: java.lang.Throwable -> L4b
                r1.close()
                return r4
            L4b:
                r0 = move-exception
                r1.close()
                throw r0
            L50:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchVmStatusProbe.AnonymousClass2.connect(X.G0U, X.HtJ):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [Identity] */
    /* renamed from: com.facebook.aura.gateway.HatchVmStatusProbe$fetchStatusFromVm$2, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes3.dex */
    public final class C121402<Identity> extends AbstractC7559F3s implements G0U<Identity, Unit> {
        public static final C121402 INSTANCE = null;

        public C121402() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            return Unit.INSTANCE;
        }

        static {
            C7384Etj.A0P();
            throw F60.createAndThrow();
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Identity identity) {
        }
    }

    @DebugMetadata(c = "com.facebook.aura.gateway.HatchVmStatusProbe", f = "HatchVmStatusProbe.kt", l = {AuraWaitlistConfettiKt.StandardParticleCount, SelfieSnapshotKt.SELFIE_JPEG_QUALITY}, m = "probeVm", v = 2)
    /* renamed from: com.facebook.aura.gateway.HatchVmStatusProbe$probeVm$1, reason: invalid class name and case insensitive filesystem */
    public final class C121411 extends HzP {
        public int I$0;
        public int I$1;
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

        public C121411(HtJ<? super C121411> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchVmStatusProbe.this.probeVm(null, null, null, null, this);
        }
    }

    public HatchVmStatusProbe(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.userSession = abstractC3358CGz;
        this.prefsStore = HatchGatewayPrefsStore.Companion.getInstance(abstractC3358CGz);
        this.learnedConfidentiality = C60O.A1C();
        this.blockedVmIds = ConcurrentHashMap.newKeySet();
    }

    private final boolean isTerminalFailure(HatchVmProbeResult hatchVmProbeResult, HatchVmConfidentiality hatchVmConfidentiality) {
        if ((hatchVmProbeResult != null ? hatchVmProbeResult.noiseHandshakeOutcome : null) != HatchNoiseHandshakeOutcome.VERIFICATION_FAILED) {
            return (hatchVmProbeResult != null ? hatchVmProbeResult.noiseHandshakeOutcome : null) == HatchNoiseHandshakeOutcome.LEGACY_PEER_VERIFIED && HatchGatewayConnectionKt.isLegacyPeerDowngrade(hatchVmConfidentiality);
        }
        return true;
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HatchNoiseHandshakeOutcome.values().length];
            try {
                AnonymousClass002.A13(HatchNoiseHandshakeOutcome.LEGACY_PEER_VERIFIED, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HatchNoiseHandshakeOutcome.PRIVATE_AUTH_PEER_VERIFIED, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(HatchNoiseHandshakeOutcome.ENROLLMENT_REQUIRED, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(HatchNoiseHandshakeOutcome.KEY_REQUIRED, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(HatchNoiseHandshakeOutcome.VERIFICATION_FAILED, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final boolean acceptsResult(HatchVmProbeResult hatchVmProbeResult, HatchVmConfidentiality hatchVmConfidentiality, String str) {
        ConcurrentHashMap<String, HatchVmConfidentiality> concurrentHashMap;
        HatchVmConfidentiality hatchVmConfidentiality2;
        if ((hatchVmProbeResult != null ? hatchVmProbeResult.responses : null) != null) {
            int iA0M = AnonymousClass003.A0M(hatchVmProbeResult.noiseHandshakeOutcome);
            if (iA0M != -1) {
                if (iA0M != 0) {
                    if (iA0M == 1) {
                        concurrentHashMap = this.learnedConfidentiality;
                        hatchVmConfidentiality2 = HatchVmConfidentiality.CONFIDENTIAL;
                        concurrentHashMap.put(str, hatchVmConfidentiality2);
                    } else if (iA0M != 2 && iA0M != 3 && iA0M != 4) {
                        throw C3cG.A0q();
                    }
                } else if (!HatchGatewayConnectionKt.isLegacyPeerDowngrade(hatchVmConfidentiality)) {
                    if (hatchVmConfidentiality == HatchVmConfidentiality.UNKNOWN) {
                        concurrentHashMap = this.learnedConfidentiality;
                        hatchVmConfidentiality2 = HatchVmConfidentiality.STANDARD;
                        concurrentHashMap.put(str, hatchVmConfidentiality2);
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object executeScopedProbe(java.lang.String r15, java.lang.String r16, java.util.List<? extends com.facebook.aura.network.api.JarvisPath> r17, com.facebook.aura.network.transport.HatchVmProbeResponseObserver r18, X.HtJ<? super com.facebook.aura.gateway.HatchVmStatusFailure> r19) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchVmStatusProbe.executeScopedProbe(java.lang.String, java.lang.String, java.util.List, com.facebook.aura.network.transport.HatchVmProbeResponseObserver, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object executeScopedProbeAttempt(String str, String str2, List<? extends JarvisPath> list, HatchVmConfidentiality hatchVmConfidentiality, HatchVmProbeResponseObserver hatchVmProbeResponseObserver, HtJ<? super HatchVmProbeResult> htJ) {
        return HatchHttpApi.INSTANCE.executeVmProbeAttempt(str, str2, list, new AnonymousClass2(str, hatchVmConfidentiality), hatchVmProbeResponseObserver, htJ);
    }

    public static /* synthetic */ Object fetchStatusFromVm$default(HatchVmStatusProbe hatchVmStatusProbe, String str, String str2, G0U g0u, HtJ htJ, int i, Object obj) {
        if ((i & 4) == 0) {
            Arrays.asList(JarvisPath.Identity.INSTANCE, JarvisPath.Health.INSTANCE);
        }
        C7384Etj.A0P();
        throw F60.createAndThrow();
    }

    private final boolean sharedChannelServes(String str) {
        HatchGatewayConnection companion = HatchGatewayConnection.Companion.getInstance(this.userSession);
        String strExtractHatcheryVMId = HatcheryVMIdUtilsKt.extractHatcheryVMId(str);
        if (strExtractHatcheryVMId != null) {
            String strA0a = null;
            if (strExtractHatcheryVMId.length() > 0) {
                HatchGatewayConnectionState hatchGatewayConnectionState = companion.gatewayState.getValue().connection;
                if (C7384Etj.areEqual(hatchGatewayConnectionState, HatchGatewayConnectionState.Connected.INSTANCE)) {
                    String str2 = companion.currentWsUrl;
                    if (str2 != null) {
                        strA0a = HatcheryVMIdUtilsKt.extractHatcheryVMId(str2);
                    }
                } else if (C7384Etj.areEqual(hatchGatewayConnectionState, HatchGatewayConnectionState.Connecting.INSTANCE) || (hatchGatewayConnectionState instanceof HatchGatewayConnectionState.Reconnecting)) {
                    strA0a = C3cG.A0a(this.prefsStore);
                } else if (!(hatchGatewayConnectionState instanceof HatchGatewayConnectionState.Disconnected) && !(hatchGatewayConnectionState instanceof HatchGatewayConnectionState.Error) && !C7384Etj.areEqual(hatchGatewayConnectionState, HatchGatewayConnectionState.Paused.INSTANCE) && !C7384Etj.areEqual(hatchGatewayConnectionState, HatchGatewayConnectionState.Resetting.INSTANCE)) {
                    throw C3cG.A0q();
                }
                return strExtractHatcheryVMId.equals(strA0a);
            }
        }
        return false;
    }

    public final /* synthetic */ <Identity, Health> Object fetchStatusFromVm(String str, String str2, G0U<? super Identity, Unit> g0u, HtJ<? super HatchVmStatusSnapshot<Identity, Health>> htJ) {
        Arrays.asList(JarvisPath.Identity.INSTANCE, JarvisPath.Health.INSTANCE);
        C7384Etj.A0P();
        throw F60.createAndThrow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b2, code lost:
    
        if (r8 == r2) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c2 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00b2 -> B:12:0x003c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object probeVm(java.lang.String r14, java.lang.String r15, java.util.List<? extends com.facebook.aura.network.api.JarvisPath> r16, com.facebook.aura.network.transport.HatchVmProbeResponseObserver r17, X.HtJ<? super com.facebook.aura.gateway.HatchVmStatusFailure> r18) {
        /*
            Method dump skipped, instructions count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchVmStatusProbe.probeVm(java.lang.String, java.lang.String, java.util.List, com.facebook.aura.network.transport.HatchVmProbeResponseObserver, X.HtJ):java.lang.Object");
    }

    private final HatchVmStatusFailure statusFailure(HatchNoiseHandshakeOutcome hatchNoiseHandshakeOutcome) {
        return HatchGatewayConnectionKt.isCvmCredentialRequired(hatchNoiseHandshakeOutcome) ? HatchVmStatusFailure.CREDENTIALS_REQUIRED : HatchVmStatusFailure.STATUS_UNAVAILABLE;
    }
}
