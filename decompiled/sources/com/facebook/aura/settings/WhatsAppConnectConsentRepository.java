package com.facebook.aura.settings;

import X.HtJ;
import X.HzP;
import com.facebook.aura.model.PairingLauncherPresentationJsonKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class WhatsAppConnectConsentRepository implements WhatsAppConnectConsentApi {
    public static final int $stable = 0;
    public static final WhatsAppConnectConsentRepository INSTANCE = new WhatsAppConnectConsentRepository();
    public static final String WHATSAPP_CONNECT_TOS_NAME = "whatsapp_connect";

    @DebugMetadata(c = "com.facebook.aura.settings.WhatsAppConnectConsentRepository", f = "WhatsAppConnectConsentRepository.kt", l = {58}, m = PairingLauncherPresentationJsonKt.ACTION_ACCEPT, v = 2)
    /* renamed from: com.facebook.aura.settings.WhatsAppConnectConsentRepository$accept$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WhatsAppConnectConsentRepository.this.accept(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.WhatsAppConnectConsentRepository", f = "WhatsAppConnectConsentRepository.kt", l = {55}, m = "footerRuns", v = 2)
    /* renamed from: com.facebook.aura.settings.WhatsAppConnectConsentRepository$footerRuns$1, reason: invalid class name and case insensitive filesystem */
    public final class C136251 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public C136251(HtJ<? super C136251> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WhatsAppConnectConsentRepository.this.footerRuns(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    @Override // com.facebook.aura.settings.WhatsAppConnectConsentApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object accept(X.HtJ<? super java.lang.Boolean> r14) {
        /*
            r13 = this;
            r3 = r14
            boolean r0 = r14 instanceof com.facebook.aura.settings.WhatsAppConnectConsentRepository.AnonymousClass1
            if (r0 == 0) goto L59
            r14 = r3
            com.facebook.aura.settings.WhatsAppConnectConsentRepository$accept$1 r14 = (com.facebook.aura.settings.WhatsAppConnectConsentRepository.AnonymousClass1) r14
            int r2 = r14.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L59
            int r2 = r2 - r1
            r14.label = r2
        L13:
            java.lang.Object r2 = r14.result
            X.Hji r1 = X.EnumC10460Hji.A02
            int r0 = r14.label
            r5 = 1
            if (r0 == 0) goto L29
            if (r0 != r5) goto L5f
            java.lang.Object r0 = X.AnonymousClass001.A0q(r2)
        L22:
            boolean r0 = r0 instanceof X.C10571Hud
            java.lang.Boolean r1 = X.C3cG.A0P(r0)
            return r1
        L29:
            com.facebook.aura.network.http.HatchHttpApi r2 = X.C60O.A06(r2)
            com.facebook.aura.network.api.StefiHatchPath$AcceptChannelTos r6 = com.facebook.aura.network.api.StefiHatchPath.AcceptChannelTos.INSTANCE
            java.lang.String r0 = "whatsapp_connect"
            com.facebook.aura.settings.AcceptChannelTosRequestJson r7 = new com.facebook.aura.settings.AcceptChannelTosRequestJson
            r7.<init>(r0)
            com.facebook.aura.network.http.RequestType r8 = com.facebook.aura.network.http.RequestType.POST
            X.9jH r9 = X.C9jH.A00
            com.facebook.aura.settings.WhatsAppConnectConsentRepository$accept$$inlined$executeStefiRequest-tZkwj4A$default$1 r3 = com.facebook.aura.settings.WhatsAppConnectConsentRepository$accept$$inlined$executeStefiRequesttZkwj4A$default$1.INSTANCE
            com.facebook.aura.settings.WhatsAppConnectConsentRepository$accept$$inlined$executeStefiRequest-tZkwj4A$default$2 r4 = com.facebook.aura.settings.WhatsAppConnectConsentRepository$accept$$inlined$executeStefiRequesttZkwj4A$default$2.INSTANCE
            r12 = 0
            r11 = 0
            r14.L$0 = r11
            r14.L$1 = r11
            r14.L$2 = r11
            r14.L$3 = r11
            r14.L$4 = r11
            r14.I$0 = r5
            r14.I$1 = r12
            r14.label = r5
            r10 = r5
            r13 = r11
            java.lang.Object r0 = r2.m1604executeStefiRequestWithjLovISM(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            if (r0 != r1) goto L22
            return r1
        L59:
            com.facebook.aura.settings.WhatsAppConnectConsentRepository$accept$1 r14 = new com.facebook.aura.settings.WhatsAppConnectConsentRepository$accept$1
            r14.<init>(r3)
            goto L13
        L5f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.WhatsAppConnectConsentRepository.accept(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    @Override // com.facebook.aura.settings.WhatsAppConnectConsentApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object footerRuns(X.HtJ<? super X.AHD<com.facebook.aura.settings.WhatsAppConnectDisclosureRun>> r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof com.facebook.aura.settings.WhatsAppConnectConsentRepository.C136251
            if (r0 == 0) goto L64
            r13 = r15
            com.facebook.aura.settings.WhatsAppConnectConsentRepository$footerRuns$1 r13 = (com.facebook.aura.settings.WhatsAppConnectConsentRepository.C136251) r13
            int r2 = r13.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L64
            int r2 = r2 - r1
            r13.label = r2
        L12:
            java.lang.Object r1 = r13.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r13.label
            r2 = 1
            if (r0 == 0) goto L3a
            if (r0 != r2) goto L6a
            java.lang.Object r2 = X.AnonymousClass001.A0q(r1)
        L21:
            boolean r1 = r2 instanceof X.C10571Hud
            r0 = 0
            if (r1 == 0) goto L27
            r2 = r0
        L27:
            com.facebook.aura.settings.ChannelTosDisclosureJson r2 = (com.facebook.aura.settings.ChannelTosDisclosureJson) r2
            if (r2 != 0) goto L2c
            return r0
        L2c:
            X.AHD r3 = com.facebook.aura.settings.WhatsAppConnectConsentJsonKt.toFooterRuns(r2)
            if (r3 != 0) goto L63
            java.lang.String r1 = "WhatsAppConnectConsent"
            java.lang.String r0 = "Rejected malformed channel ToS disclosure runs"
            X.CFK.A06(r1, r0)
            return r3
        L3a:
            com.facebook.aura.network.http.HatchHttpApi r4 = X.C60O.A06(r1)
            com.facebook.aura.settings.ChannelTosDisclosurePath r7 = com.facebook.aura.settings.ChannelTosDisclosurePath.INSTANCE
            com.facebook.aura.network.http.RequestType r8 = com.facebook.aura.network.http.RequestType.GET
            java.lang.String r1 = "tos_name"
            java.lang.String r0 = "whatsapp_connect"
            java.util.Map r12 = X.AnonymousClass006.A10(r1, r0)
            X.9jH r11 = X.C9jH.A00
            com.facebook.aura.settings.WhatsAppConnectConsentRepository$footerRuns$$inlined$executeStefiRequest-bMdYcbs$default$1 r5 = com.facebook.aura.settings.WhatsAppConnectConsentRepository$footerRuns$$inlined$executeStefiRequestbMdYcbs$default$1.INSTANCE
            r6 = 0
            r9 = 0
            r13.L$0 = r9
            r13.L$1 = r9
            r13.L$2 = r9
            r13.L$3 = r9
            r13.L$4 = r9
            r13.label = r2
            r10 = r9
            java.lang.Object r2 = r4.m1596executeBodylessStefiRequestWithtZkwj4A(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            if (r2 != r3) goto L21
        L63:
            return r3
        L64:
            com.facebook.aura.settings.WhatsAppConnectConsentRepository$footerRuns$1 r13 = new com.facebook.aura.settings.WhatsAppConnectConsentRepository$footerRuns$1
            r13.<init>(r15)
            goto L12
        L6a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.WhatsAppConnectConsentRepository.footerRuns(X.HtJ):java.lang.Object");
    }
}
