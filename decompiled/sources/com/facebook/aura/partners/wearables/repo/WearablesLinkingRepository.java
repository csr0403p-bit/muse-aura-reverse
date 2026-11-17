package com.facebook.aura.partners.wearables.repo;

import X.AbstractC3358CGz;
import X.C06H;
import X.C7BY;
import X.HsJ;
import X.HtJ;
import X.HzP;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.json.NetworkException;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes6.dex */
public final class WearablesLinkingRepository {
    public static final Companion Companion = new Companion();

    @Deprecated
    public static final long OFFER_RECOVERY_DELAY_MS = 2000;

    @DebugMetadata(c = "com.facebook.aura.partners.wearables.repo.WearablesLinkingRepository", f = "WearablesLinkingRepository.kt", l = {159}, m = "linkWearables", v = 2)
    /* renamed from: com.facebook.aura.partners.wearables.repo.WearablesLinkingRepository$linkWearables$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
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

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WearablesLinkingRepository.this.linkWearables(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.wearables.repo.WearablesLinkingRepository", f = "WearablesLinkingRepository.kt", l = {44, R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop, 48, 55, 58, 187}, m = "prepareComplimentaryOffer", v = 2)
    /* renamed from: com.facebook.aura.partners.wearables.repo.WearablesLinkingRepository$prepareComplimentaryOffer$1, reason: invalid class name and case insensitive filesystem */
    public final class C133921 extends HzP {
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
        public Object L$12;
        public Object L$13;
        public Object L$14;
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

        public C133921(HtJ<? super C133921> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WearablesLinkingRepository.this.prepareComplimentaryOffer(null, null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.wearables.repo.WearablesLinkingRepository", f = "WearablesLinkingRepository.kt", l = {187}, m = "setAssistantName", v = 2)
    /* renamed from: com.facebook.aura.partners.wearables.repo.WearablesLinkingRepository$setAssistantName$1, reason: invalid class name and case insensitive filesystem */
    public final class C133931 extends HzP {
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
        public int label;
        public /* synthetic */ Object result;

        public C133931(HtJ<? super C133931> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WearablesLinkingRepository.this.setAssistantName(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.wearables.repo.WearablesLinkingRepository", f = "WearablesLinkingRepository.kt", l = {159}, m = "setCommsConsent", v = 2)
    /* renamed from: com.facebook.aura.partners.wearables.repo.WearablesLinkingRepository$setCommsConsent$1, reason: invalid class name and case insensitive filesystem */
    public final class C133941 extends HzP {
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C133941(HtJ<? super C133941> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WearablesLinkingRepository.this.setCommsConsent(false, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.wearables.repo.WearablesLinkingRepository", f = "WearablesLinkingRepository.kt", l = {156}, m = "unlinkWearables", v = 2)
    /* renamed from: com.facebook.aura.partners.wearables.repo.WearablesLinkingRepository$unlinkWearables$1, reason: invalid class name and case insensitive filesystem */
    public final class C133951 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public C133951(HtJ<? super C133951> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WearablesLinkingRepository.this.unlinkWearables(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object linkWearables(com.facebook.aura.analytics.hatch.HatchSurface r15, com.facebook.aura.analytics.hatch.HatchSubsurface r16, java.lang.String r17, X.HtJ<? super java.lang.Boolean> r18) {
        /*
            r14 = this;
            r2 = r15
            r7 = r18
            r4 = r17
            r3 = r16
            boolean r0 = r7 instanceof com.facebook.aura.partners.wearables.repo.WearablesLinkingRepository.AnonymousClass1
            if (r0 == 0) goto L77
            r1 = r7
            com.facebook.aura.partners.wearables.repo.WearablesLinkingRepository$linkWearables$1 r1 = (com.facebook.aura.partners.wearables.repo.WearablesLinkingRepository.AnonymousClass1) r1
            int r6 = r1.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r6 & r5
            if (r0 == 0) goto L77
            int r6 = r6 - r5
            r1.label = r6
        L19:
            java.lang.Object r6 = r1.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r1.label
            r9 = 1
            if (r0 == 0) goto L40
            if (r0 != r9) goto L7d
            java.lang.Object r4 = r1.L$2
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r1.L$1
            com.facebook.aura.analytics.hatch.HatchSubsurface r3 = (com.facebook.aura.analytics.hatch.HatchSubsurface) r3
            java.lang.Object r2 = r1.L$0
            com.facebook.aura.analytics.hatch.HatchSurface r2 = (com.facebook.aura.analytics.hatch.HatchSurface) r2
            java.lang.Object r1 = X.AnonymousClass001.A0q(r6)
        L34:
            com.facebook.aura.partners.wearables.repo.WearablesComplimentaryOfferLogging r0 = com.facebook.aura.partners.wearables.repo.WearablesComplimentaryOfferLogging.INSTANCE
            r0.logConsentResult(r1, r2, r3, r4)
            boolean r0 = r1 instanceof X.C10571Hud
            java.lang.Boolean r5 = X.C3cG.A0P(r0)
            return r5
        L40:
            X.Hwg.A00(r6)
            com.facebook.aura.network.http.HatchHttpApi r6 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.partners.wearables.repo.WearablesStefiPath$WearablesLink r10 = com.facebook.aura.partners.wearables.repo.WearablesStefiPath.WearablesLink.INSTANCE
            r0 = 0
            byte[] r11 = new byte[r0]
            com.facebook.aura.network.http.RequestType r12 = com.facebook.aura.network.http.RequestType.POST
            X.9jH r13 = X.C9jH.A00
            com.facebook.aura.partners.wearables.repo.WearablesLinkingRepository$linkWearables$$inlined$executeStefiRequest-tZkwj4A$default$1 r7 = com.facebook.aura.partners.wearables.repo.WearablesLinkingRepository$linkWearables$$inlined$executeStefiRequesttZkwj4A$default$1.INSTANCE
            com.facebook.aura.partners.wearables.repo.WearablesLinkingRepository$linkWearables$$inlined$executeStefiRequest-tZkwj4A$default$2 r8 = com.facebook.aura.partners.wearables.repo.WearablesLinkingRepository$linkWearables$$inlined$executeStefiRequesttZkwj4A$default$2.INSTANCE
            r1.L$0 = r15
            r1.L$1 = r3
            r1.L$2 = r4
            r15 = 0
            r1.L$3 = r15
            r1.L$4 = r15
            r1.L$5 = r15
            r1.L$6 = r15
            r1.L$7 = r15
            r1.I$0 = r9
            r1.I$1 = r0
            r1.label = r9
            r14 = r9
            r17 = r15
            r18 = r1
            r16 = r0
            java.lang.Object r1 = r6.m1604executeStefiRequestWithjLovISM(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            if (r1 != r5) goto L34
            return r5
        L77:
            com.facebook.aura.partners.wearables.repo.WearablesLinkingRepository$linkWearables$1 r1 = new com.facebook.aura.partners.wearables.repo.WearablesLinkingRepository$linkWearables$1
            r1.<init>(r7)
            goto L19
        L7d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.wearables.repo.WearablesLinkingRepository.linkWearables(com.facebook.aura.analytics.hatch.HatchSurface, com.facebook.aura.analytics.hatch.HatchSubsurface, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object setCommsConsent(boolean r13, X.HtJ<? super java.lang.Boolean> r14) {
        /*
            r12 = this;
            r3 = r14
            boolean r0 = r14 instanceof com.facebook.aura.partners.wearables.repo.WearablesLinkingRepository.C133941
            if (r0 == 0) goto L5a
            r14 = r3
            com.facebook.aura.partners.wearables.repo.WearablesLinkingRepository$setCommsConsent$1 r14 = (com.facebook.aura.partners.wearables.repo.WearablesLinkingRepository.C133941) r14
            int r2 = r14.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5a
            int r2 = r2 - r1
            r14.label = r2
        L13:
            java.lang.Object r2 = r14.result
            X.Hji r1 = X.EnumC10460Hji.A02
            int r0 = r14.label
            r5 = 1
            if (r0 == 0) goto L29
            if (r0 != r5) goto L60
            java.lang.Object r0 = X.AnonymousClass001.A0q(r2)
        L22:
            boolean r0 = r0 instanceof X.C10571Hud
            java.lang.Boolean r1 = X.C3cG.A0P(r0)
            return r1
        L29:
            X.Hwg.A00(r2)
            com.facebook.aura.network.http.HatchHttpApi r2 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.partners.wearables.repo.WearablesStefiPath$WearablesCommsConsent r6 = com.facebook.aura.partners.wearables.repo.WearablesStefiPath.WearablesCommsConsent.INSTANCE
            com.facebook.aura.partners.wearables.repo.WearablesCommsConsentJson r7 = new com.facebook.aura.partners.wearables.repo.WearablesCommsConsentJson
            r7.<init>(r13)
            com.facebook.aura.network.http.RequestType r8 = com.facebook.aura.network.http.RequestType.POST
            X.9jH r9 = X.C9jH.A00
            com.facebook.aura.partners.wearables.repo.WearablesLinkingRepository$setCommsConsent$$inlined$executeStefiRequest-tZkwj4A$default$1 r3 = com.facebook.aura.partners.wearables.repo.WearablesLinkingRepository$setCommsConsent$$inlined$executeStefiRequesttZkwj4A$default$1.INSTANCE
            com.facebook.aura.partners.wearables.repo.WearablesLinkingRepository$setCommsConsent$$inlined$executeStefiRequest-tZkwj4A$default$2 r4 = com.facebook.aura.partners.wearables.repo.WearablesLinkingRepository$setCommsConsent$$inlined$executeStefiRequesttZkwj4A$default$2.INSTANCE
            r12 = 0
            r11 = 0
            r14.L$0 = r11
            r14.L$1 = r11
            r14.L$2 = r11
            r14.L$3 = r11
            r14.L$4 = r11
            r14.Z$0 = r13
            r14.I$0 = r5
            r14.I$1 = r12
            r14.label = r5
            r10 = r5
            r13 = r11
            java.lang.Object r0 = r2.m1604executeStefiRequestWithjLovISM(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            if (r0 != r1) goto L22
            return r1
        L5a:
            com.facebook.aura.partners.wearables.repo.WearablesLinkingRepository$setCommsConsent$1 r14 = new com.facebook.aura.partners.wearables.repo.WearablesLinkingRepository$setCommsConsent$1
            r14.<init>(r3)
            goto L13
        L60:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.wearables.repo.WearablesLinkingRepository.setCommsConsent(boolean, X.HtJ):java.lang.Object");
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    private final boolean hasGatewayUrl(AbstractC3358CGz abstractC3358CGz) {
        return !C7BY.A0j(HatchGatewayPrefsStore.Companion.getInstance(abstractC3358CGz).getGatewayUrl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0085  */
    /* renamed from: requestAttach-yxL6bBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1835requestAttachyxL6bBk(com.facebook.aura.analytics.hatch.HatchSurface r16, com.facebook.aura.analytics.hatch.HatchSubsurface r17, java.lang.String r18, int r19, X.HtJ<? super X.HsJ<com.facebook.aura.partners.wearables.repo.WearablesComplimentaryOfferJson>> r20) {
        /*
            r15 = this;
            r4 = r19
            r8 = r20
            r3 = r18
            r2 = r17
            r1 = r16
            boolean r0 = r8 instanceof com.facebook.aura.partners.wearables.repo.WearablesLinkingRepository$requestAttach$1
            if (r0 == 0) goto L85
            r7 = r8
            com.facebook.aura.partners.wearables.repo.WearablesLinkingRepository$requestAttach$1 r7 = (com.facebook.aura.partners.wearables.repo.WearablesLinkingRepository$requestAttach$1) r7
            int r6 = r7.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r6 & r5
            if (r0 == 0) goto L85
            int r6 = r6 - r5
            r7.label = r6
        L1c:
            java.lang.Object r8 = r7.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r5 = 1
            if (r0 == 0) goto L49
            if (r0 != r5) goto L8b
            int r4 = r7.I$0
            java.lang.Object r3 = r7.L$2
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r7.L$1
            com.facebook.aura.analytics.hatch.HatchSubsurface r2 = (com.facebook.aura.analytics.hatch.HatchSubsurface) r2
            java.lang.Object r1 = r7.L$0
            com.facebook.aura.analytics.hatch.HatchSurface r1 = (com.facebook.aura.analytics.hatch.HatchSurface) r1
            java.lang.Object r0 = X.AnonymousClass001.A0q(r8)
        L39:
            com.facebook.aura.partners.wearables.repo.WearablesComplimentaryOfferLogging r5 = com.facebook.aura.partners.wearables.repo.WearablesComplimentaryOfferLogging.INSTANCE
            java.lang.String r6 = "attach"
            java.lang.Integer r11 = X.C3cG.A0R(r4)
            r9 = r2
            r10 = r3
            r7 = r0
            r8 = r1
            r5.log(r6, r7, r8, r9, r10, r11)
            return r0
        L49:
            X.Hwg.A00(r8)
            com.facebook.aura.network.http.HatchHttpApi r8 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.partners.wearables.repo.WearablesStefiPath$WearablesComplimentaryOffer r12 = com.facebook.aura.partners.wearables.repo.WearablesStefiPath.WearablesComplimentaryOffer.INSTANCE
            r11 = 0
            byte[] r13 = new byte[r11]
            com.facebook.aura.network.http.RequestType r14 = com.facebook.aura.network.http.RequestType.POST
            X.9jH r15 = X.C9jH.A00
            com.facebook.aura.partners.wearables.repo.WearablesLinkingRepository$requestAttach-yxL6bBk$$inlined$executeStefiRequest-tZkwj4A$default$1 r9 = com.facebook.aura.partners.wearables.repo.WearablesLinkingRepository$requestAttachyxL6bBk$$inlined$executeStefiRequesttZkwj4A$default$1.INSTANCE
            com.facebook.aura.partners.wearables.repo.WearablesLinkingRepository$requestAttach-yxL6bBk$$inlined$executeStefiRequest-tZkwj4A$default$2 r10 = com.facebook.aura.partners.wearables.repo.WearablesLinkingRepository$requestAttachyxL6bBk$$inlined$executeStefiRequesttZkwj4A$default$2.INSTANCE
            r7.L$0 = r1
            r7.L$1 = r2
            r7.L$2 = r3
            r0 = 0
            r7.L$3 = r0
            r7.L$4 = r0
            r7.L$5 = r0
            r7.L$6 = r0
            r7.L$7 = r0
            r7.I$0 = r4
            r7.I$1 = r11
            r7.I$2 = r11
            r7.label = r5
            r16 = r11
            r18 = r11
            r19 = r0
            r20 = r7
            r17 = r0
            java.lang.Object r0 = r8.m1604executeStefiRequestWithjLovISM(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            if (r0 != r6) goto L39
            return r6
        L85:
            com.facebook.aura.partners.wearables.repo.WearablesLinkingRepository$requestAttach$1 r7 = new com.facebook.aura.partners.wearables.repo.WearablesLinkingRepository$requestAttach$1
            r7.<init>(r15, r8)
            goto L1c
        L8b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.wearables.repo.WearablesLinkingRepository.m1835requestAttachyxL6bBk(com.facebook.aura.analytics.hatch.HatchSurface, com.facebook.aura.analytics.hatch.HatchSubsurface, java.lang.String, int, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e5 A[PHI: r10
  0x00e5: PHI (r10v4 java.lang.String) = (r10v3 java.lang.String), (r10v5 java.lang.String) binds: [B:31:0x00dd, B:34:0x00e3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object prepareComplimentaryOffer(X.AbstractC3358CGz r28, com.facebook.aura.analytics.hatch.HatchSurface r29, com.facebook.aura.analytics.hatch.HatchSubsurface r30, java.lang.String r31, X.HtJ<? super kotlin.Unit> r32) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.wearables.repo.WearablesLinkingRepository.prepareComplimentaryOffer(X.CGz, com.facebook.aura.analytics.hatch.HatchSurface, com.facebook.aura.analytics.hatch.HatchSubsurface, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object setAssistantName(java.lang.String r24, X.AbstractC3358CGz r25, X.HtJ<? super java.lang.Boolean> r26) {
        /*
            r23 = this;
            r4 = r26
            boolean r0 = r4 instanceof com.facebook.aura.partners.wearables.repo.WearablesLinkingRepository.C133931
            if (r0 == 0) goto L8a
            r3 = r4
            com.facebook.aura.partners.wearables.repo.WearablesLinkingRepository$setAssistantName$1 r3 = (com.facebook.aura.partners.wearables.repo.WearablesLinkingRepository.C133931) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8a
            int r2 = r2 - r1
            r3.label = r2
        L14:
            java.lang.Object r2 = r3.result
            X.Hji r1 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r7 = 1
            if (r0 == 0) goto L2a
            if (r0 != r7) goto L92
            java.lang.Object r0 = X.AnonymousClass001.A0q(r2)
        L23:
            boolean r0 = r0 instanceof X.C10571Hud
            java.lang.Boolean r1 = X.C3cG.A0P(r0)
            return r1
        L2a:
            X.Hwg.A00(r2)
            com.facebook.aura.network.http.HatchHttpApi r4 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.network.api.JarvisPath$OnboardingIdentity r8 = com.facebook.aura.network.api.JarvisPath.OnboardingIdentity.INSTANCE
            com.facebook.aura.partners.wearables.repo.OnboardingIdentityUpdateJson r9 = new com.facebook.aura.partners.wearables.repo.OnboardingIdentityUpdateJson
            r0 = r24
            r9.<init>(r0)
            com.facebook.aura.network.http.RequestType r10 = com.facebook.aura.network.http.RequestType.POST
            r0 = 0
            X.HxE[] r14 = new X.HxE[r0]
            java.util.Set r15 = X.AnonymousClass004.A18()
            X.9jH r18 = X.C9jH.A00
            com.facebook.aura.partners.wearables.repo.WearablesLinkingRepository$setAssistantName$$inlined$executeJarvisRequest-Z6QaZII$default$1 r5 = com.facebook.aura.partners.wearables.repo.WearablesLinkingRepository$setAssistantName$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE
            com.facebook.aura.partners.wearables.repo.WearablesLinkingRepository$setAssistantName$$inlined$executeJarvisRequest-Z6QaZII$default$2 r6 = com.facebook.aura.partners.wearables.repo.WearablesLinkingRepository$setAssistantName$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE
            r12 = 0
            r3.L$0 = r12
            r3.L$1 = r12
            r3.L$2 = r12
            r3.L$3 = r12
            r3.L$4 = r12
            r3.L$5 = r12
            r3.L$6 = r12
            r3.L$7 = r12
            r3.L$8 = r12
            r3.L$9 = r12
            r3.I$0 = r7
            r3.I$1 = r7
            r3.I$2 = r0
            r3.I$3 = r7
            r3.I$4 = r0
            r3.I$5 = r0
            r3.I$6 = r0
            r3.label = r7
            r11 = r25
            r13 = r12
            r16 = r7
            r17 = r7
            r19 = r12
            r20 = r0
            r21 = r7
            r22 = r0
            r23 = r0
            r24 = r12
            r25 = r0
            r26 = r3
            java.lang.Object r0 = r4.m1599executeJarvisRequestWithFof5HsY(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            if (r0 != r1) goto L23
            return r1
        L8a:
            com.facebook.aura.partners.wearables.repo.WearablesLinkingRepository$setAssistantName$1 r3 = new com.facebook.aura.partners.wearables.repo.WearablesLinkingRepository$setAssistantName$1
            r0 = r23
            r3.<init>(r4)
            goto L14
        L92:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.wearables.repo.WearablesLinkingRepository.setAssistantName(java.lang.String, X.CGz, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object unlinkWearables(X.HtJ<? super java.lang.Boolean> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof com.facebook.aura.partners.wearables.repo.WearablesLinkingRepository.C133951
            if (r0 == 0) goto L4b
            r11 = r13
            com.facebook.aura.partners.wearables.repo.WearablesLinkingRepository$unlinkWearables$1 r11 = (com.facebook.aura.partners.wearables.repo.WearablesLinkingRepository.C133951) r11
            int r2 = r11.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4b
            int r2 = r2 - r1
            r11.label = r2
        L12:
            java.lang.Object r2 = r11.result
            X.Hji r1 = X.EnumC10460Hji.A02
            int r0 = r11.label
            r4 = 1
            if (r0 == 0) goto L28
            if (r0 != r4) goto L51
            java.lang.Object r0 = X.AnonymousClass001.A0q(r2)
        L21:
            boolean r0 = r0 instanceof X.C10571Hud
            java.lang.Boolean r1 = X.C3cG.A0P(r0)
            return r1
        L28:
            X.Hwg.A00(r2)
            com.facebook.aura.network.http.HatchHttpApi r2 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.partners.wearables.repo.WearablesStefiPath$WearablesLink r5 = com.facebook.aura.partners.wearables.repo.WearablesStefiPath.WearablesLink.INSTANCE
            com.facebook.aura.network.http.RequestType r6 = com.facebook.aura.network.http.RequestType.DELETE
            X.9jH r9 = X.C9jH.A00
            com.facebook.aura.partners.wearables.repo.WearablesLinkingRepository$unlinkWearables$$inlined$executeStefiRequest-bMdYcbs$default$1 r3 = com.facebook.aura.partners.wearables.repo.WearablesLinkingRepository$unlinkWearables$$inlined$executeStefiRequestbMdYcbs$default$1.INSTANCE
            r7 = 0
            r11.L$0 = r7
            r11.L$1 = r7
            r11.L$2 = r7
            r11.L$3 = r7
            r11.L$4 = r7
            r11.label = r4
            r8 = r7
            r10 = r9
            java.lang.Object r0 = r2.m1596executeBodylessStefiRequestWithtZkwj4A(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            if (r0 != r1) goto L21
            return r1
        L4b:
            com.facebook.aura.partners.wearables.repo.WearablesLinkingRepository$unlinkWearables$1 r11 = new com.facebook.aura.partners.wearables.repo.WearablesLinkingRepository$unlinkWearables$1
            r11.<init>(r13)
            goto L12
        L51:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.wearables.repo.WearablesLinkingRepository.unlinkWearables(X.HtJ):java.lang.Object");
    }

    private final boolean hasNoResponse(Object obj) {
        Throwable thA00 = HsJ.A00(obj);
        NetworkException networkException = thA00 instanceof NetworkException ? (NetworkException) thA00 : null;
        return networkException != null && networkException.httpResponseCode <= 0;
    }
}
