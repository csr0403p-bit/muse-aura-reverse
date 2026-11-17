package com.facebook.aura.settings;

import X.AbstractC3358CGz;
import X.C7384Etj;
import X.HtJ;
import X.HzP;
import com.facebook.aura.network.transport.flipper.FlipperNoiseReporter;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes6.dex */
public final class HatchMessengerRepository {
    public static final int $stable = 8;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.settings.HatchMessengerRepository", f = "HatchMessengerRepository.kt", l = {HatchMessageShareDocumentRenderer.APP_ICON_SIZE_PX}, m = "fetchChannelStatus", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchMessengerRepository$fetchChannelStatus$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchMessengerRepository.this.fetchChannelStatus(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.HatchMessengerRepository", f = "HatchMessengerRepository.kt", l = {FlipperNoiseReporter.SWITCHING_PROTOCOLS_STATUS_CODE}, m = "linkChannelForPairing", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchMessengerRepository$linkChannelForPairing$1, reason: invalid class name and case insensitive filesystem */
    public final class C135411 extends HzP {
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
        public int label;
        public /* synthetic */ Object result;

        public C135411(HtJ<? super C135411> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchMessengerRepository.this.linkChannelForPairing(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.HatchMessengerRepository", f = "HatchMessengerRepository.kt", l = {FlipperNoiseReporter.SWITCHING_PROTOCOLS_STATUS_CODE}, m = "unlinkChannel", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchMessengerRepository$unlinkChannel$1, reason: invalid class name and case insensitive filesystem */
    public final class C135421 extends HzP {
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
        public int label;
        public /* synthetic */ Object result;

        public C135421(HtJ<? super C135421> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchMessengerRepository.this.unlinkChannel(this);
        }
    }

    public HatchMessengerRepository(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.userSession = abstractC3358CGz;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchChannelStatus(X.HtJ<? super com.facebook.aura.settings.MessengerChannelStatus> r19) {
        /*
            r18 = this;
            r4 = r19
            boolean r0 = r4 instanceof com.facebook.aura.settings.HatchMessengerRepository.AnonymousClass1
            r5 = r18
            if (r0 == 0) goto Laa
            r3 = r4
            com.facebook.aura.settings.HatchMessengerRepository$fetchChannelStatus$1 r3 = (com.facebook.aura.settings.HatchMessengerRepository.AnonymousClass1) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Laa
            int r2 = r2 - r1
            r3.label = r2
        L16:
            java.lang.Object r1 = r3.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r6 = 0
            r14 = 1
            if (r0 == 0) goto L6e
            if (r0 != r14) goto Lb1
            java.lang.Object r1 = X.AnonymousClass001.A0q(r1)
        L26:
            boolean r0 = r1 instanceof X.C10571Hud
            r4 = 0
            if (r0 == 0) goto L2c
            r1 = r4
        L2c:
            com.facebook.aura.settings.ChannelsPayloadJson r1 = (com.facebook.aura.settings.ChannelsPayloadJson) r1
            if (r1 == 0) goto L36
            java.util.List r0 = r1.detailedChannels()
            if (r0 != 0) goto L38
        L36:
            X.AGi r0 = X.C0881AGi.A00
        L38:
            java.util.Iterator r2 = r0.iterator()
        L3c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L6c
            java.lang.Object r3 = r2.next()
            r0 = r3
            com.facebook.aura.settings.ChannelJson r0 = (com.facebook.aura.settings.ChannelJson) r0
            java.lang.String r1 = r0.provider
            java.lang.String r0 = "messenger"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3c
        L53:
            com.facebook.aura.settings.ChannelJson r3 = (com.facebook.aura.settings.ChannelJson) r3
            if (r3 == 0) goto L6a
            boolean r2 = r3.linked
            java.lang.String r1 = r3.agent_id
            if (r1 == 0) goto L64
            int r0 = r1.length()
            if (r0 <= 0) goto L64
            r4 = r1
        L64:
            com.facebook.aura.settings.MessengerChannelStatus r0 = new com.facebook.aura.settings.MessengerChannelStatus
            r0.<init>(r2, r4)
            return r0
        L6a:
            r2 = 0
            goto L64
        L6c:
            r3 = r4
            goto L53
        L6e:
            X.Hwg.A00(r1)
            com.facebook.aura.network.http.HatchHttpApi r4 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.network.api.JarvisPath$ChannelsStatus r7 = com.facebook.aura.network.api.JarvisPath.ChannelsStatus.INSTANCE
            com.facebook.aura.network.http.RequestType r8 = com.facebook.aura.network.http.RequestType.GET
            X.CGz r9 = r5.userSession
            X.HxE[] r11 = new X.HxE[r6]
            java.util.Set r13 = X.AnonymousClass004.A18()
            X.9jH r15 = X.C9jH.A00
            com.facebook.aura.settings.HatchMessengerRepository$fetchChannelStatus$$inlined$executeJarvisRequest-1iavgos$default$1 r5 = com.facebook.aura.settings.HatchMessengerRepository$fetchChannelStatus$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE
            r10 = 0
            r3.L$0 = r10
            r3.L$1 = r10
            r3.L$2 = r10
            r3.L$3 = r10
            r3.L$4 = r10
            r3.L$5 = r10
            r3.L$6 = r10
            r3.I$0 = r14
            r3.I$1 = r14
            r3.I$2 = r6
            r3.label = r14
            r12 = r10
            r16 = r14
            r17 = r10
            r18 = r6
            r19 = r3
            java.lang.Object r1 = r4.m1595executeBodylessJarvisRequestWithp3iPjrY(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            if (r1 != r2) goto L26
            return r2
        Laa:
            com.facebook.aura.settings.HatchMessengerRepository$fetchChannelStatus$1 r3 = new com.facebook.aura.settings.HatchMessengerRepository$fetchChannelStatus$1
            r3.<init>(r4)
            goto L16
        Lb1:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchMessengerRepository.fetchChannelStatus(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object linkChannelForPairing(X.HtJ<? super com.facebook.aura.settings.ChannelLinkResult> r27) {
        /*
            r26 = this;
            r4 = r27
            boolean r0 = r4 instanceof com.facebook.aura.settings.HatchMessengerRepository.C135411
            r6 = r26
            if (r0 == 0) goto L91
            r3 = r4
            com.facebook.aura.settings.HatchMessengerRepository$linkChannelForPairing$1 r3 = (com.facebook.aura.settings.HatchMessengerRepository.C135411) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L91
            int r2 = r2 - r1
            r3.label = r2
        L16:
            java.lang.Object r5 = r3.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r4 = 0
            r1 = 1
            if (r0 == 0) goto L34
            if (r0 != r1) goto L97
            java.lang.Object r1 = X.AnonymousClass001.A0q(r5)
        L26:
            boolean r0 = r1 instanceof X.C10571Hud
            if (r0 == 0) goto L2b
            r1 = r4
        L2b:
            com.facebook.aura.settings.ChannelLinkOuterJson r1 = (com.facebook.aura.settings.ChannelLinkOuterJson) r1
            if (r1 == 0) goto L33
            com.facebook.aura.settings.ChannelLinkResult r4 = com.facebook.aura.settings.HatchChannelsJsonKt.toDomain(r1)
        L33:
            return r4
        L34:
            X.Hwg.A00(r5)
            com.facebook.aura.network.http.HatchHttpApi r5 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.network.api.JarvisPath$ChannelsLink r9 = com.facebook.aura.network.api.JarvisPath.ChannelsLink.INSTANCE
            java.lang.String r0 = "messenger"
            r13 = 0
            com.facebook.aura.settings.ChannelProviderRequestJson r10 = new com.facebook.aura.settings.ChannelProviderRequestJson
            r10.<init>(r0, r13)
            com.facebook.aura.network.http.RequestType r11 = com.facebook.aura.network.http.RequestType.POST
            X.CGz r12 = r6.userSession
            r8 = 0
            X.HxE[] r15 = new X.HxE[r8]
            java.util.Set r16 = X.AnonymousClass004.A18()
            X.9jH r19 = X.C9jH.A00
            com.facebook.aura.settings.HatchMessengerRepository$linkChannelForPairing$$inlined$executeJarvisRequest-Z6QaZII$default$1 r6 = com.facebook.aura.settings.HatchMessengerRepository$linkChannelForPairing$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE
            com.facebook.aura.settings.HatchMessengerRepository$linkChannelForPairing$$inlined$executeJarvisRequest-Z6QaZII$default$2 r7 = com.facebook.aura.settings.HatchMessengerRepository$linkChannelForPairing$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE
            r3.L$0 = r13
            r3.L$1 = r13
            r3.L$2 = r13
            r3.L$3 = r13
            r3.L$4 = r13
            r3.L$5 = r13
            r3.L$6 = r13
            r3.L$7 = r13
            r3.I$0 = r1
            r3.I$1 = r1
            r3.I$2 = r8
            r3.I$3 = r1
            r3.I$4 = r8
            r3.I$5 = r8
            r3.I$6 = r8
            r3.label = r1
            r4 = 0
            r14 = r13
            r18 = r1
            r20 = r13
            r21 = r8
            r22 = r1
            r23 = r8
            r24 = r8
            r25 = r13
            r26 = r8
            r27 = r3
            r17 = r1
            java.lang.Object r1 = r5.m1599executeJarvisRequestWithFof5HsY(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            if (r1 != r2) goto L26
            return r2
        L91:
            com.facebook.aura.settings.HatchMessengerRepository$linkChannelForPairing$1 r3 = new com.facebook.aura.settings.HatchMessengerRepository$linkChannelForPairing$1
            r3.<init>(r4)
            goto L16
        L97:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchMessengerRepository.linkChannelForPairing(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object unlinkChannel(X.HtJ<? super java.lang.Boolean> r25) {
        /*
            r24 = this;
            r5 = r25
            boolean r0 = r5 instanceof com.facebook.aura.settings.HatchMessengerRepository.C135421
            r4 = r24
            if (r0 == 0) goto L87
            r2 = r5
            com.facebook.aura.settings.HatchMessengerRepository$unlinkChannel$1 r2 = (com.facebook.aura.settings.HatchMessengerRepository.C135421) r2
            int r3 = r2.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L87
            int r3 = r3 - r1
            r2.label = r3
        L16:
            java.lang.Object r3 = r2.result
            X.Hji r1 = X.EnumC10460Hji.A02
            int r0 = r2.label
            r6 = 1
            if (r0 == 0) goto L2c
            if (r0 != r6) goto L8d
            java.lang.Object r0 = X.AnonymousClass001.A0q(r3)
        L25:
            boolean r0 = r0 instanceof X.C10571Hud
            java.lang.Boolean r1 = X.C3cG.A0P(r0)
            return r1
        L2c:
            X.Hwg.A00(r3)
            com.facebook.aura.network.http.HatchHttpApi r3 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.network.api.JarvisPath$ChannelsUnlink r7 = com.facebook.aura.network.api.JarvisPath.ChannelsUnlink.INSTANCE
            java.lang.String r0 = "messenger"
            r11 = 0
            com.facebook.aura.settings.ChannelProviderRequestJson r8 = new com.facebook.aura.settings.ChannelProviderRequestJson
            r8.<init>(r0, r11)
            com.facebook.aura.network.http.RequestType r9 = com.facebook.aura.network.http.RequestType.POST
            X.CGz r10 = r4.userSession
            r0 = 0
            X.HxE[] r13 = new X.HxE[r0]
            java.util.Set r14 = X.AnonymousClass004.A18()
            X.9jH r17 = X.C9jH.A00
            com.facebook.aura.settings.HatchMessengerRepository$unlinkChannel$$inlined$executeJarvisRequest-Z6QaZII$default$1 r4 = com.facebook.aura.settings.HatchMessengerRepository$unlinkChannel$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE
            com.facebook.aura.settings.HatchMessengerRepository$unlinkChannel$$inlined$executeJarvisRequest-Z6QaZII$default$2 r5 = com.facebook.aura.settings.HatchMessengerRepository$unlinkChannel$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE
            r2.L$0 = r11
            r2.L$1 = r11
            r2.L$2 = r11
            r2.L$3 = r11
            r2.L$4 = r11
            r2.L$5 = r11
            r2.L$6 = r11
            r2.L$7 = r11
            r2.I$0 = r6
            r2.I$1 = r6
            r2.I$2 = r0
            r2.I$3 = r6
            r2.I$4 = r0
            r2.I$5 = r0
            r2.I$6 = r0
            r2.label = r6
            r12 = r11
            r15 = r6
            r16 = r6
            r18 = r11
            r19 = r0
            r20 = r6
            r21 = r0
            r22 = r0
            r23 = r11
            r24 = r0
            r25 = r2
            java.lang.Object r0 = r3.m1599executeJarvisRequestWithFof5HsY(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            if (r0 != r1) goto L25
            return r1
        L87:
            com.facebook.aura.settings.HatchMessengerRepository$unlinkChannel$1 r2 = new com.facebook.aura.settings.HatchMessengerRepository$unlinkChannel$1
            r2.<init>(r5)
            goto L16
        L8d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchMessengerRepository.unlinkChannel(X.HtJ):java.lang.Object");
    }
}
