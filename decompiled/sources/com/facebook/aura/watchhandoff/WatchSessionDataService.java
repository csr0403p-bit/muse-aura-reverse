package com.facebook.aura.watchhandoff;

import X.AbstractC3358CGz;
import X.AbstractC4267Crq;
import X.AbstractC7559F3s;
import X.AnonymousClass005;
import X.BV4;
import X.C3357CGy;
import X.C3cG;
import X.C4182Cos;
import X.C4276Cs4;
import X.C4278Cs8;
import X.C60O;
import X.C60P;
import X.C7384Etj;
import X.C7BY;
import X.C9sU;
import X.CSA;
import X.CSC;
import X.CSR;
import X.CSY;
import X.Cao;
import X.F0C;
import X.InterfaceC3641Caw;
import X.InterfaceC4097CmR;
import com.facebook.aura.auth.AuraSessionManager;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.partners.voice.prefs.VoicePrefs;
import com.facebook.aura.watchlink.WatchLinkClient;
import com.facebook.aura.watchlink.WatchLinkRequest;
import com.facebook.aura.watchlink.WatchLinkRequest$$serializer;
import com.facebook.aura.watchlink.WatchLinkResponse;
import com.facebook.aura.watchlink.WatchLinkResponse$$serializer;
import com.google.android.gms.wearable.internal.zzhg;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class WatchSessionDataService extends Cao {
    public static final int $stable = 8;

    /* renamed from: com.facebook.aura.watchhandoff.WatchSessionDataService$respondAfterRenewal$1, reason: invalid class name and case insensitive filesystem */
    public final class C143571 extends AbstractC7559F3s implements Function0<WatchLinkResponse> {
        public final /* synthetic */ String $nodeId;
        public final /* synthetic */ String $path;
        public final /* synthetic */ WatchLinkRequest $request;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C143571(String str, String str2, WatchLinkRequest watchLinkRequest) {
            super(0);
            this.$nodeId = str;
            this.$path = str2;
            this.$request = watchLinkRequest;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final WatchLinkResponse invoke() {
            return WatchSessionDataService.this.respond(this.$nodeId, this.$path, this.$request);
        }
    }

    private final String getAppVersion() {
        return "16.0.0.11.159";
    }

    private final WatchLinkResponse linked(AbstractC3358CGz abstractC3358CGz, WatchLinkResponse watchLinkResponse) {
        WatchBackgroundingNotifier.Companion.start(abstractC3358CGz);
        return WatchLinkResponse.copy$default(watchLinkResponse, null, null, null, null, null, null, Boolean.valueOf(VoicePrefs.INSTANCE.getBackgroundingEnabled(abstractC3358CGz)), 63, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.watchlink.WatchLinkResponse respond(java.lang.String r11, java.lang.String r12, com.facebook.aura.watchlink.WatchLinkRequest r13) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.watchhandoff.WatchSessionDataService.respond(java.lang.String, java.lang.String, com.facebook.aura.watchlink.WatchLinkRequest):com.facebook.aura.watchlink.WatchLinkResponse");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CSA<WatchLinkResponse> respondAfterRenewal(String str, String str2, WatchLinkRequest watchLinkRequest) {
        AbstractC3358CGz abstractC3358CGz;
        String strA0z;
        AuraSessionManager.SessionSnapshot currentSessionSnapshot = AuraSessionManager.INSTANCE.getCurrentSessionSnapshot();
        return (currentSessionSnapshot == null || (abstractC3358CGz = currentSessionSnapshot.session) == null || (strA0z = C3357CGy.A0z(abstractC3358CGz)) == null || C7BY.A0j(strA0z) || !WatchLinkClient.SESSION_PATH.equals(str2) || !C7384Etj.areEqual(watchLinkRequest.rejected_token_sha256, WatchLinkClient.INSTANCE.tokenSha256(strA0z)) || !WatchHandoffGate.INSTANCE.isEnabled() || WatchSessionHandoffLink.INSTANCE.currentRemote(abstractC3358CGz, str) == null) ? CSC.A02(respond(str, str2, watchLinkRequest)) : WatchHandoffRenewal.Companion.getInstance(abstractC3358CGz).answerAfterRenewal(strA0z, new C143571(str, str2, watchLinkRequest));
    }

    public static final /* synthetic */ String access$getAppVersion(WatchSessionDataService watchSessionDataService) {
        return "16.0.0.11.159";
    }

    private final String selectedVm(AbstractC3358CGz abstractC3358CGz) {
        String strA1K = C60P.A1K(abstractC3358CGz);
        if (C7BY.A0j(strA1K)) {
            return null;
        }
        return strA1K;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [X.CSC] */
    @Override // X.Cao
    public CSA<byte[]> onRequest(final String str, final String str2, byte[] bArr) {
        boolean zA1Z = AnonymousClass005.A1Z(str, str2, bArr);
        if (bArr.length > 4096) {
            return CSC.A01(new SecurityException("Watch handoff unavailable"));
        }
        try {
            final WatchLinkRequest watchLinkRequest = (WatchLinkRequest) HatchJsonKt.HatchJson.A00(BV4.A0o(bArr), WatchLinkRequest$$serializer.INSTANCE);
            WatchOpenChatSupport.INSTANCE.refresh(this);
            C4276Cs4 c4276Cs4 = C4276Cs4.A02;
            ?? A05 = new C4182Cos(this, C4278Cs8.A00, AbstractC4267Crq.A00, c4276Cs4).A05(WatchLinkClient.WATCH_CAPABILITY, zA1Z ? 1 : 0);
            Executor executorA05 = F0C.A05();
            CSY csy = new CSY() { // from class: com.facebook.aura.watchhandoff.WatchSessionDataService.onRequest.1
                @Override // X.CSY
                public final CSA<byte[]> then(CSA<InterfaceC4097CmR> csa) {
                    C7384Etj.A0Y(csa, 0);
                    if (!csa.A0C()) {
                        return CSC.A02(C3cG.A1S(HatchJsonKt.HatchJson.A02(new WatchLinkResponse("unavailable", null, null, null, null, "16.0.0.11.159", null), WatchLinkResponse$$serializer.INSTANCE)));
                    }
                    Set<InterfaceC3641Caw> setAI8 = csa.A08().AI8();
                    C7384Etj.A0U(setAI8);
                    String str3 = str;
                    if (!(setAI8 instanceof Collection) || !setAI8.isEmpty()) {
                        Iterator<InterfaceC3641Caw> it = setAI8.iterator();
                        while (it.hasNext()) {
                            if (C7384Etj.areEqual(((zzhg) it.next()).A00, str3)) {
                                CSA csaRespondAfterRenewal = WatchSessionDataService.this.respondAfterRenewal(str, str2, watchLinkRequest);
                                Executor executorA052 = F0C.A05();
                                final WatchSessionDataService watchSessionDataService = WatchSessionDataService.this;
                                return csaRespondAfterRenewal.A04(new CSY() { // from class: com.facebook.aura.watchhandoff.WatchSessionDataService.onRequest.1.2
                                    @Override // X.CSY
                                    public final byte[] then(CSA<WatchLinkResponse> csa2) {
                                        C7384Etj.A0Y(csa2, 0);
                                        C9sU c9sU = HatchJsonKt.HatchJson;
                                        WatchLinkResponse$$serializer watchLinkResponse$$serializer = WatchLinkResponse$$serializer.INSTANCE;
                                        WatchLinkResponse watchLinkResponseA08 = csa2.A08();
                                        C7384Etj.A0U(watchLinkResponseA08);
                                        return C3cG.A1S(c9sU.A02(WatchLinkResponse.copy$default(watchLinkResponseA08, null, null, null, null, null, "16.0.0.11.159", null, 95, null), watchLinkResponse$$serializer));
                                    }

                                    @Override // X.CSY
                                    public /* bridge */ /* synthetic */ Object then(CSA csa2) {
                                        return then((CSA<WatchLinkResponse>) csa2);
                                    }
                                }, executorA052);
                            }
                        }
                    }
                    return CSC.A01(new SecurityException("Requesting watch is not connected"));
                }

                @Override // X.CSY
                public /* bridge */ /* synthetic */ Object then(CSA csa) {
                    return then((CSA<InterfaceC4097CmR>) csa);
                }
            };
            CSC csc = new CSC();
            CSA.A00(new CSR(csy, csc, executorA05), A05);
            return csc;
        } catch (IllegalArgumentException unused) {
            return CSC.A01(C60O.A0i("Invalid watch request"));
        }
    }
}
