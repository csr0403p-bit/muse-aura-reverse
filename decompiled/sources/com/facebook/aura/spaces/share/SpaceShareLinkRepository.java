package com.facebook.aura.spaces.share;

import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.BV4;
import X.HtJ;
import X.HzP;
import com.facebook.aura.json.HatchJsonKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes6.dex */
public final class SpaceShareLinkRepository {
    public static final int $stable = 8;
    public final String gatewayUrl;
    public final String slug;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.spaces.share.SpaceShareLinkRepository", f = "SpaceShareLinkRepository.kt", l = {104}, m = "currentAudience", v = 2)
    /* renamed from: com.facebook.aura.spaces.share.SpaceShareLinkRepository$currentAudience$1, reason: invalid class name */
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
            return SpaceShareLinkRepository.this.currentAudience(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.spaces.share.SpaceShareLinkRepository", f = "SpaceShareLinkRepository.kt", l = {128}, m = "publish", v = 2)
    /* renamed from: com.facebook.aura.spaces.share.SpaceShareLinkRepository$publish$1, reason: invalid class name and case insensitive filesystem */
    public final class C139421 extends HzP {
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

        public C139421(HtJ<? super C139421> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SpaceShareLinkRepository.this.publish(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.spaces.share.SpaceShareLinkRepository", f = "SpaceShareLinkRepository.kt", l = {104}, m = "settings", v = 2)
    /* renamed from: com.facebook.aura.spaces.share.SpaceShareLinkRepository$settings$1, reason: invalid class name and case insensitive filesystem */
    public final class C139431 extends HzP {
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
        public Object L$7;
        public Object L$8;
        public int label;
        public /* synthetic */ Object result;

        public C139431(HtJ<? super C139431> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SpaceShareLinkRepository.this.settings(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.spaces.share.SpaceShareLinkRepository", f = "SpaceShareLinkRepository.kt", l = {104}, m = "unpublish", v = 2)
    /* renamed from: com.facebook.aura.spaces.share.SpaceShareLinkRepository$unpublish$1, reason: invalid class name and case insensitive filesystem */
    public final class C139441 extends HzP {
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
        public Object L$7;
        public int label;
        public /* synthetic */ Object result;

        public C139441(HtJ<? super C139441> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SpaceShareLinkRepository.this.unpublish(this);
        }
    }

    private final SpaceShareLinkSettingsJson decode(JsonObject jsonObject) {
        return (SpaceShareLinkSettingsJson) HatchJsonKt.HatchJson.A01(SpaceShareLinkSettingsJson$$serializer.INSTANCE, unwrap(jsonObject));
    }

    private final JsonObject unwrap(JsonObject jsonObject) {
        JsonElement jsonElement;
        SpaceShareLinkResponseJson spaceShareLinkResponseJson = (SpaceShareLinkResponseJson) HatchJsonKt.HatchJson.A01(SpaceShareLinkResponseJson$$serializer.INSTANCE, jsonObject);
        if (AnonymousClass002.A1b(spaceShareLinkResponseJson.ok, false) || !((jsonElement = spaceShareLinkResponseJson.error) == null || jsonElement.equals(JsonNull.A00))) {
            throw BV4.A0S();
        }
        JsonObject jsonObject2 = spaceShareLinkResponseJson.result;
        return jsonObject2 == null ? jsonObject : jsonObject2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object currentAudience(X.HtJ<? super com.facebook.aura.spaces.share.SpaceShareLinkAudienceJson> r21) {
        /*
            r20 = this;
            r4 = r21
            r2 = r20
            boolean r0 = r4 instanceof com.facebook.aura.spaces.share.SpaceShareLinkRepository.AnonymousClass1
            if (r0 == 0) goto L9d
            r5 = r4
            com.facebook.aura.spaces.share.SpaceShareLinkRepository$currentAudience$1 r5 = (com.facebook.aura.spaces.share.SpaceShareLinkRepository.AnonymousClass1) r5
            int r3 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L9d
            int r3 = r3 - r1
            r5.label = r3
        L16:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L49
            if (r0 != r3) goto La5
            java.lang.Object r2 = r5.L$8
            com.facebook.aura.spaces.share.SpaceShareLinkRepository r2 = (com.facebook.aura.spaces.share.SpaceShareLinkRepository) r2
            java.lang.Object r0 = X.AnonymousClass001.A0q(r1)
        L29:
            X.Hwg.A00(r0)
            kotlinx.serialization.json.JsonObject r0 = (kotlinx.serialization.json.JsonObject) r0
            kotlinx.serialization.json.JsonObject r2 = r2.unwrap(r0)
            X.9sU r1 = com.facebook.aura.json.HatchJsonKt.HatchJson
            com.facebook.aura.spaces.share.SpaceShareLinkAudienceResponseJson$$serializer r0 = com.facebook.aura.spaces.share.SpaceShareLinkAudienceResponseJson$$serializer.INSTANCE
            java.lang.Object r0 = r1.A01(r0, r2)
            com.facebook.aura.spaces.share.SpaceShareLinkAudienceResponseJson r0 = (com.facebook.aura.spaces.share.SpaceShareLinkAudienceResponseJson) r0
            com.facebook.aura.spaces.share.SpaceShareLinkAudienceJson r0 = r0.audience
            if (r0 != 0) goto La4
            int r0 = com.facebook.aura.spaces.share.SpaceShareLinkAudienceJson.$stable
            com.facebook.aura.spaces.share.SpaceShareLinkAudienceJson$$serializer r0 = com.facebook.aura.spaces.share.SpaceShareLinkAudienceJson$$serializer.INSTANCE
            java.lang.Object r4 = r1.A01(r0, r2)
            return r4
        L49:
            X.Hwg.A00(r1)
            com.facebook.aura.network.http.HatchHttpApi r6 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            java.lang.String r1 = r2.slug
            java.lang.String r0 = "/audience"
            com.facebook.aura.spaces.share.SpaceShareLinkPath r9 = new com.facebook.aura.spaces.share.SpaceShareLinkPath
            r9.<init>(r1, r0)
            com.facebook.aura.network.http.RequestType r10 = com.facebook.aura.network.http.RequestType.GET
            X.CGz r11 = r2.userSession
            java.lang.String r1 = r2.gatewayUrl
            java.lang.String r0 = "refresh"
            X.HxE r0 = X.AnonymousClass002.A0q(r0, r3)
            r8 = 0
            X.HxE[] r13 = new X.HxE[]{r0}
            java.util.Set r15 = X.AnonymousClass004.A18()
            X.9jH r17 = X.C9jH.A00
            com.facebook.aura.spaces.share.SpaceShareLinkRepository$currentAudience$$inlined$executeJarvisRequest-1iavgos$default$1 r7 = com.facebook.aura.spaces.share.SpaceShareLinkRepository$currentAudience$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE
            r12 = 0
            r5.L$0 = r12
            r5.L$1 = r12
            r5.L$2 = r12
            r5.L$3 = r12
            r5.L$4 = r12
            r5.L$5 = r12
            r5.L$6 = r12
            r5.L$7 = r12
            r5.L$8 = r2
            r5.I$0 = r8
            r5.I$1 = r3
            r5.I$2 = r8
            r5.label = r3
            r14 = r12
            r16 = r8
            r19 = r1
            r20 = r8
            r21 = r5
            r18 = r3
            java.lang.Object r0 = r6.m1595executeBodylessJarvisRequestWithp3iPjrY(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            if (r0 != r4) goto L29
            return r4
        L9d:
            com.facebook.aura.spaces.share.SpaceShareLinkRepository$currentAudience$1 r5 = new com.facebook.aura.spaces.share.SpaceShareLinkRepository$currentAudience$1
            r5.<init>(r4)
            goto L16
        La4:
            return r0
        La5:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.share.SpaceShareLinkRepository.currentAudience(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object publish(com.facebook.aura.spaces.share.SpaceShareLinkAudienceRequestJson r29, X.HtJ<? super com.facebook.aura.spaces.share.SpaceShareLinkSettingsJson> r30) {
        /*
            r28 = this;
            r4 = r30
            r2 = r28
            boolean r0 = r4 instanceof com.facebook.aura.spaces.share.SpaceShareLinkRepository.C139421
            if (r0 == 0) goto Laa
            r5 = r4
            com.facebook.aura.spaces.share.SpaceShareLinkRepository$publish$1 r5 = (com.facebook.aura.spaces.share.SpaceShareLinkRepository.C139421) r5
            int r3 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto Laa
            int r3 = r3 - r1
            r5.label = r3
        L16:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L33
            if (r0 != r3) goto Lb1
            java.lang.Object r2 = r5.L$11
            com.facebook.aura.spaces.share.SpaceShareLinkRepository r2 = (com.facebook.aura.spaces.share.SpaceShareLinkRepository) r2
            java.lang.Object r0 = X.AnonymousClass001.A0q(r1)
        L29:
            X.Hwg.A00(r0)
            kotlinx.serialization.json.JsonObject r0 = (kotlinx.serialization.json.JsonObject) r0
            com.facebook.aura.spaces.share.SpaceShareLinkSettingsJson r4 = r2.decode(r0)
            return r4
        L33:
            X.Hwg.A00(r1)
            com.facebook.aura.network.http.HatchHttpApi r8 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            java.lang.String r1 = r2.slug
            java.lang.String r0 = "/settings"
            com.facebook.aura.spaces.share.SpaceShareLinkPath r12 = new com.facebook.aura.spaces.share.SpaceShareLinkPath
            r12.<init>(r1, r0)
            com.facebook.aura.spaces.share.SpaceShareLinkPublishRequestJson r13 = new com.facebook.aura.spaces.share.SpaceShareLinkPublishRequestJson
            r0 = r29
            r13.<init>(r3, r0)
            com.facebook.aura.network.http.RequestType r14 = com.facebook.aura.network.http.RequestType.POST
            X.CGz r7 = r2.userSession
            java.lang.String r6 = r2.gatewayUrl
            r0 = 180(0xb4, double:8.9E-322)
            java.lang.Long r16 = X.C3cG.A0S(r0)
            r11 = 0
            X.HxE[] r1 = new X.HxE[r11]
            java.util.Set r19 = X.AnonymousClass004.A18()
            X.9jH r22 = X.C9jH.A00
            com.facebook.aura.spaces.share.SpaceShareLinkRepository$publish$$inlined$executeJarvisRequest-Z6QaZII$default$1 r9 = com.facebook.aura.spaces.share.SpaceShareLinkRepository$publish$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE
            com.facebook.aura.spaces.share.SpaceShareLinkRepository$publish$$inlined$executeJarvisRequest-Z6QaZII$default$2 r10 = com.facebook.aura.spaces.share.SpaceShareLinkRepository$publish$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE
            r0 = 0
            r5.L$0 = r0
            r5.L$1 = r0
            r5.L$2 = r0
            r5.L$3 = r0
            r5.L$4 = r0
            r5.L$5 = r0
            r5.L$6 = r0
            r5.L$7 = r0
            r5.L$8 = r0
            r5.L$9 = r0
            r5.L$10 = r0
            r5.L$11 = r2
            r5.I$0 = r11
            r5.I$1 = r11
            r5.I$2 = r11
            r5.I$3 = r3
            r5.I$4 = r11
            r5.I$5 = r11
            r5.I$6 = r11
            r5.label = r3
            r20 = r11
            r21 = r11
            r23 = r6
            r24 = r11
            r25 = r3
            r26 = r11
            r27 = r11
            r28 = r0
            r29 = r11
            r30 = r5
            r17 = r0
            r18 = r1
            r15 = r7
            java.lang.Object r0 = r8.m1599executeJarvisRequestWithFof5HsY(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            if (r0 != r4) goto L29
            return r4
        Laa:
            com.facebook.aura.spaces.share.SpaceShareLinkRepository$publish$1 r5 = new com.facebook.aura.spaces.share.SpaceShareLinkRepository$publish$1
            r5.<init>(r4)
            goto L16
        Lb1:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.share.SpaceShareLinkRepository.publish(com.facebook.aura.spaces.share.SpaceShareLinkAudienceRequestJson, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object settings(X.HtJ<? super com.facebook.aura.spaces.share.SpaceShareLinkSettingsJson> r21) {
        /*
            r20 = this;
            r5 = r21
            r1 = r20
            boolean r0 = r5 instanceof com.facebook.aura.spaces.share.SpaceShareLinkRepository.C139431
            if (r0 == 0) goto L7f
            r4 = r5
            com.facebook.aura.spaces.share.SpaceShareLinkRepository$settings$1 r4 = (com.facebook.aura.spaces.share.SpaceShareLinkRepository.C139431) r4
            int r3 = r4.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto L7f
            int r3 = r3 - r2
            r4.label = r3
        L16:
            java.lang.Object r5 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L33
            if (r0 != r2) goto L85
            java.lang.Object r1 = r4.L$8
            com.facebook.aura.spaces.share.SpaceShareLinkRepository r1 = (com.facebook.aura.spaces.share.SpaceShareLinkRepository) r1
            java.lang.Object r0 = X.AnonymousClass001.A0q(r5)
        L29:
            X.Hwg.A00(r0)
            kotlinx.serialization.json.JsonObject r0 = (kotlinx.serialization.json.JsonObject) r0
            com.facebook.aura.spaces.share.SpaceShareLinkSettingsJson r3 = r1.decode(r0)
            return r3
        L33:
            X.Hwg.A00(r5)
            com.facebook.aura.network.http.HatchHttpApi r6 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            java.lang.String r5 = r1.slug
            java.lang.String r0 = "/settings"
            com.facebook.aura.spaces.share.SpaceShareLinkPath r9 = new com.facebook.aura.spaces.share.SpaceShareLinkPath
            r9.<init>(r5, r0)
            com.facebook.aura.network.http.RequestType r10 = com.facebook.aura.network.http.RequestType.GET
            X.CGz r11 = r1.userSession
            java.lang.String r0 = r1.gatewayUrl
            r8 = 0
            X.HxE[] r13 = new X.HxE[r8]
            java.util.Set r15 = X.AnonymousClass004.A18()
            X.9jH r17 = X.C9jH.A00
            com.facebook.aura.spaces.share.SpaceShareLinkRepository$settings$$inlined$executeJarvisRequest-1iavgos$default$1 r7 = com.facebook.aura.spaces.share.SpaceShareLinkRepository$settings$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE
            r12 = 0
            r4.L$0 = r12
            r4.L$1 = r12
            r4.L$2 = r12
            r4.L$3 = r12
            r4.L$4 = r12
            r4.L$5 = r12
            r4.L$6 = r12
            r4.L$7 = r12
            r4.L$8 = r1
            r4.I$0 = r8
            r4.I$1 = r2
            r4.I$2 = r8
            r4.label = r2
            r14 = r12
            r16 = r8
            r19 = r0
            r20 = r8
            r21 = r4
            r18 = r2
            java.lang.Object r0 = r6.m1595executeBodylessJarvisRequestWithp3iPjrY(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            if (r0 != r3) goto L29
            return r3
        L7f:
            com.facebook.aura.spaces.share.SpaceShareLinkRepository$settings$1 r4 = new com.facebook.aura.spaces.share.SpaceShareLinkRepository$settings$1
            r4.<init>(r5)
            goto L16
        L85:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.share.SpaceShareLinkRepository.settings(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object unpublish(X.HtJ<? super kotlin.Unit> r20) {
        /*
            r19 = this;
            r5 = r20
            boolean r0 = r5 instanceof com.facebook.aura.spaces.share.SpaceShareLinkRepository.C139441
            r4 = r19
            if (r0 == 0) goto L74
            r3 = r5
            com.facebook.aura.spaces.share.SpaceShareLinkRepository$unpublish$1 r3 = (com.facebook.aura.spaces.share.SpaceShareLinkRepository.C139441) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L74
            int r2 = r2 - r1
            r3.label = r2
        L16:
            java.lang.Object r1 = r3.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r7 = 1
            if (r0 == 0) goto L2b
            if (r0 != r7) goto L7a
            java.lang.Object r0 = X.AnonymousClass001.A0q(r1)
        L25:
            X.Hwg.A00(r0)
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        L2b:
            X.Hwg.A00(r1)
            com.facebook.aura.network.http.HatchHttpApi r5 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            java.lang.String r1 = r4.slug
            java.lang.String r0 = ""
            com.facebook.aura.spaces.share.SpaceShareLinkPath r8 = new com.facebook.aura.spaces.share.SpaceShareLinkPath
            r8.<init>(r1, r0)
            com.facebook.aura.network.http.RequestType r9 = com.facebook.aura.network.http.RequestType.DELETE
            X.CGz r10 = r4.userSession
            java.lang.String r1 = r4.gatewayUrl
            r0 = 0
            X.HxE[] r12 = new X.HxE[r0]
            java.util.Set r14 = X.AnonymousClass004.A18()
            X.9jH r16 = X.C9jH.A00
            com.facebook.aura.spaces.share.SpaceShareLinkRepository$unpublish$$inlined$executeJarvisRequest-1iavgos$default$1 r6 = com.facebook.aura.spaces.share.SpaceShareLinkRepository$unpublish$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE
            r11 = 0
            r3.L$0 = r11
            r3.L$1 = r11
            r3.L$2 = r11
            r3.L$3 = r11
            r3.L$4 = r11
            r3.L$5 = r11
            r3.L$6 = r11
            r3.L$7 = r11
            r3.I$0 = r7
            r3.I$1 = r0
            r3.I$2 = r0
            r3.label = r7
            r13 = r11
            r15 = r7
            r18 = r1
            r19 = r0
            r20 = r3
            r17 = r0
            java.lang.Object r0 = r5.m1595executeBodylessJarvisRequestWithp3iPjrY(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            if (r0 != r2) goto L25
            return r2
        L74:
            com.facebook.aura.spaces.share.SpaceShareLinkRepository$unpublish$1 r3 = new com.facebook.aura.spaces.share.SpaceShareLinkRepository$unpublish$1
            r3.<init>(r5)
            goto L16
        L7a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.share.SpaceShareLinkRepository.unpublish(X.HtJ):java.lang.Object");
    }

    public SpaceShareLinkRepository(AbstractC3358CGz abstractC3358CGz, String str, String str2) {
        AnonymousClass005.A0x(abstractC3358CGz, str, str2);
        this.userSession = abstractC3358CGz;
        this.slug = str;
        this.gatewayUrl = str2;
    }
}
