package com.facebook.aura.partners.voice.avatar;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C7384Etj;
import X.C9hr;
import X.EnumC10460Hji;
import X.G0V;
import X.GAX;
import X.HtJ;
import X.Hwg;
import X.HzP;
import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.aura.commands.sms.MessageDraftSenderKt;
import com.facebook.aura.common.image.AuraBitmapLoader;
import com.facebook.aura.graphql.AuraGraphQLQueryExecutor;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes5.dex */
public final class HatchAvatarAssetService {
    public static final HatchAvatarAssetService INSTANCE = new HatchAvatarAssetService();

    @DebugMetadata(c = "com.facebook.aura.partners.voice.avatar.HatchAvatarAssetService", f = "HatchAvatarAssetService.kt", l = {AuraGraphQLQueryExecutor.API_EC_PARAM_ACCESS_TOKEN}, m = "executeOrNull", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.avatar.HatchAvatarAssetService$executeOrNull$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchAvatarAssetService.this.executeOrNull(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.avatar.HatchAvatarAssetService", f = "HatchAvatarAssetService.kt", l = {MessageDraftSenderKt.UNICODE_SINGLE_PART_CHARS}, m = "fetchCustomAvatars", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.avatar.HatchAvatarAssetService$fetchCustomAvatars$1, reason: invalid class name and case insensitive filesystem */
    public final class C130491 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C130491(HtJ<? super C130491> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchAvatarAssetService.this.fetchCustomAvatars(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.avatar.HatchAvatarAssetService$loadBitmap$2", f = "HatchAvatarAssetService.kt", l = {184}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.avatar.HatchAvatarAssetService$loadBitmap$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Bitmap>, Object> {
        public final /* synthetic */ String $url;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$url = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$url, htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Bitmap> htJ) {
            return new AnonymousClass2(this.$url, htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                AuraBitmapLoader auraBitmapLoader = AuraBitmapLoader.INSTANCE;
                Uri uri = Uri.parse(this.$url);
                C7384Etj.A0U(uri);
                this.label = 1;
                obj = auraBitmapLoader.load(uri, HatchAvatarAssetServiceKt.IMAGE_CALLER_CONTEXT, null, null, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return obj;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.avatar.HatchAvatarAssetService", f = "HatchAvatarAssetService.kt", l = {227}, m = "postGraph", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.avatar.HatchAvatarAssetService$postGraph$1, reason: invalid class name and case insensitive filesystem */
    public final class C130501<T> extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C130501(HtJ<? super C130501> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchAvatarAssetService.this.postGraph(null, null, null, null, null, false, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.avatar.HatchAvatarAssetService", f = "HatchAvatarAssetService.kt", l = {117}, m = "setCustomAvatar", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.avatar.HatchAvatarAssetService$setCustomAvatar$1, reason: invalid class name and case insensitive filesystem */
    public final class C130511 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public C130511(HtJ<? super C130511> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchAvatarAssetService.this.setCustomAvatar(null, null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.avatar.HatchAvatarAssetService", f = "HatchAvatarAssetService.kt", l = {152}, m = "uploadToEcto", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.avatar.HatchAvatarAssetService$uploadToEcto$1, reason: invalid class name and case insensitive filesystem */
    public final class C130521 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public C130521(HtJ<? super C130521> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchAvatarAssetService.this.uploadToEcto(null, null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object executeOrNull(com.facebook.aura.network.transport.HatchHttpRequest r6, java.lang.String r7, X.HtJ<? super com.facebook.aura.network.transport.HatchHttpResponse> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.facebook.aura.partners.voice.avatar.HatchAvatarAssetService.AnonymousClass1
            if (r0 == 0) goto L20
            r4 = r8
            com.facebook.aura.partners.voice.avatar.HatchAvatarAssetService$executeOrNull$1 r4 = (com.facebook.aura.partners.voice.avatar.HatchAvatarAssetService.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L2b
            if (r0 != r2) goto L26
            java.lang.Object r7 = r4.L$1
            goto L40
        L20:
            com.facebook.aura.partners.voice.avatar.HatchAvatarAssetService$executeOrNull$1 r4 = new com.facebook.aura.partners.voice.avatar.HatchAvatarAssetService$executeOrNull$1
            r4.<init>(r8)
            goto L12
        L26:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2b:
            X.Hwg.A00(r1)
            com.facebook.aura.network.transport.HatchHttpClient r1 = X.C60O.A07()     // Catch: java.lang.Exception -> L46 java.util.concurrent.CancellationException -> L54
            r0 = 0
            r4.L$0 = r0     // Catch: java.lang.Exception -> L46 java.util.concurrent.CancellationException -> L54
            r4.L$1 = r7     // Catch: java.lang.Exception -> L46 java.util.concurrent.CancellationException -> L54
            r4.label = r2     // Catch: java.lang.Exception -> L46 java.util.concurrent.CancellationException -> L54
            java.lang.Object r1 = r1.execute(r6, r4)     // Catch: java.lang.Exception -> L46 java.util.concurrent.CancellationException -> L54
            if (r1 != r3) goto L43
            return r3
        L40:
            X.Hwg.A00(r1)     // Catch: java.lang.Exception -> L46 java.util.concurrent.CancellationException -> L54
        L43:
            com.facebook.aura.network.transport.HatchHttpResponse r1 = (com.facebook.aura.network.transport.HatchHttpResponse) r1     // Catch: java.lang.Exception -> L46 java.util.concurrent.CancellationException -> L54
            return r1
        L46:
            r3 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[]{r7}
            java.lang.String r1 = "HatchAvatarAssetService"
            java.lang.String r0 = "%s: transport failed"
            X.CFK.A0D(r1, r0, r3, r2)
            r0 = 0
            return r0
        L54:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.avatar.HatchAvatarAssetService.executeOrNull(com.facebook.aura.network.transport.HatchHttpRequest, java.lang.String, X.HtJ):java.lang.Object");
    }

    public static /* synthetic */ Object fetchCustomAvatars$default(HatchAvatarAssetService hatchAvatarAssetService, String str, String str2, Integer num, HtJ htJ, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        return hatchAvatarAssetService.fetchCustomAvatars(str, str2, num, htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object postGraph(java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, X.C9hr<T> r25, boolean r26, X.HtJ<? super T> r27) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.avatar.HatchAvatarAssetService.postGraph(java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.9hr, boolean, X.HtJ):java.lang.Object");
    }

    public static /* synthetic */ Object postGraph$default(HatchAvatarAssetService hatchAvatarAssetService, String str, String str2, String str3, String str4, C9hr c9hr, boolean z, HtJ htJ, int i, Object obj) {
        if ((i & 32) != 0) {
            z = true;
        }
        return hatchAvatarAssetService.postGraph(str, str2, str3, str4, c9hr, z, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchCustomAvatars(java.lang.String r14, java.lang.String r15, java.lang.Integer r16, X.HtJ<? super java.util.List<com.facebook.aura.partners.voice.avatar.CustomAvatarAssetJson>> r17) {
        /*
            r13 = this;
            r3 = r17
            boolean r0 = r3 instanceof com.facebook.aura.partners.voice.avatar.HatchAvatarAssetService.C130491
            r6 = r13
            if (r0 == 0) goto L77
            r13 = r3
            com.facebook.aura.partners.voice.avatar.HatchAvatarAssetService$fetchCustomAvatars$1 r13 = (com.facebook.aura.partners.voice.avatar.HatchAvatarAssetService.C130491) r13
            int r2 = r13.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L77
            int r2 = r2 - r1
            r13.label = r2
        L15:
            java.lang.Object r2 = r13.result
            X.Hji r1 = X.EnumC10460Hji.A02
            int r0 = r13.label
            r12 = 1
            if (r0 == 0) goto L29
            if (r0 != r12) goto La7
            X.Hwg.A00(r2)
        L23:
            com.facebook.aura.partners.voice.avatar.CustomAvatarsDataJson r2 = (com.facebook.aura.partners.voice.avatar.CustomAvatarsDataJson) r2
            if (r2 != 0) goto L7d
            r0 = 0
            return r0
        L29:
            X.Hwg.A00(r2)
            X.9sU r4 = com.facebook.aura.json.HatchJsonKt.HatchJson
            kotlinx.serialization.json.JsonObjectSerializer r3 = kotlinx.serialization.json.JsonObjectSerializer.A01
            X.2nw r2 = new X.2nw
            r2.<init>()
            if (r15 == 0) goto L3c
            java.lang.String r0 = "asset_kind"
            X.C7qW.A06(r0, r15, r2)
        L3c:
            r5 = r16
            if (r16 == 0) goto L45
            java.lang.String r0 = "limit"
            X.C7qW.A05(r5, r0, r2)
        L45:
            kotlinx.serialization.json.JsonObject r0 = r2.A00()
            java.lang.String r10 = r4.A02(r0, r3)
            r0 = 51
            java.lang.String r0 = X.C3cF.A00(r0)
            boolean r0 = r0.equals(r15)
            if (r0 == 0) goto L74
            java.lang.String r9 = "28681665694847817"
        L5b:
            X.F0C<X.9hr<java.lang.Object>>[] r0 = com.facebook.aura.partners.voice.avatar.CustomAvatarsDataJson.$childSerializers
            com.facebook.aura.partners.voice.avatar.CustomAvatarsDataJson$$serializer r11 = com.facebook.aura.partners.voice.avatar.CustomAvatarsDataJson$$serializer.INSTANCE
            r0 = 0
            r13.L$0 = r0
            r13.L$1 = r15
            r13.L$2 = r0
            r13.L$3 = r0
            r13.label = r12
            java.lang.String r8 = "ClawmagotchiAbraCustomAvatars"
            r7 = r14
            java.lang.Object r2 = r6.postGraph(r7, r8, r9, r10, r11, r12, r13)
            if (r2 != r1) goto L23
            return r1
        L74:
            java.lang.String r9 = "29045950825092570"
            goto L5b
        L77:
            com.facebook.aura.partners.voice.avatar.HatchAvatarAssetService$fetchCustomAvatars$1 r13 = new com.facebook.aura.partners.voice.avatar.HatchAvatarAssetService$fetchCustomAvatars$1
            r13.<init>(r3)
            goto L15
        L7d:
            java.util.List<com.facebook.aura.partners.voice.avatar.CustomAvatarAssetJson> r4 = r2.clawmagotchi_abra_custom_avatars
            java.util.ArrayList r3 = X.C3cG.A0h()
            java.util.Iterator r2 = r4.iterator()
        L87:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto La0
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.facebook.aura.partners.voice.avatar.CustomAvatarAssetJson r0 = (com.facebook.aura.partners.voice.avatar.CustomAvatarAssetJson) r0
            java.lang.String r0 = r0.asset_id
            int r0 = r0.length()
            if (r0 <= 0) goto L87
            r3.add(r1)
            goto L87
        La0:
            r4.size()
            r3.size()
            return r3
        La7:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.avatar.HatchAvatarAssetService.fetchCustomAvatars(java.lang.String, java.lang.String, java.lang.Integer, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object setCustomAvatar(java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, X.HtJ<? super com.facebook.aura.partners.voice.avatar.CustomAvatarAssetJson> r20) {
        /*
            r15 = this;
            r3 = r20
            boolean r0 = r3 instanceof com.facebook.aura.partners.voice.avatar.HatchAvatarAssetService.C130511
            r8 = r15
            if (r0 == 0) goto L8b
            r15 = r3
            com.facebook.aura.partners.voice.avatar.HatchAvatarAssetService$setCustomAvatar$1 r15 = (com.facebook.aura.partners.voice.avatar.HatchAvatarAssetService.C130511) r15
            int r2 = r15.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8b
            int r2 = r2 - r1
            r15.label = r2
        L15:
            java.lang.Object r1 = r15.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r15.label
            r5 = 1
            if (r0 == 0) goto L35
            if (r0 != r5) goto L91
            X.Hwg.A00(r1)
        L23:
            com.facebook.aura.partners.voice.avatar.SetCustomAvatarDataJson r1 = (com.facebook.aura.partners.voice.avatar.SetCustomAvatarDataJson) r1
            r2 = 0
            if (r1 == 0) goto L8a
            com.facebook.aura.partners.voice.avatar.CustomAvatarAssetJson r1 = r1.clawmagotchi_abra_set_custom_avatar
            if (r1 == 0) goto L8a
            java.lang.String r0 = r1.asset_id
            int r0 = r0.length()
            if (r0 <= 0) goto L8a
            return r1
        L35:
            X.Hwg.A00(r1)
            X.9sU r6 = com.facebook.aura.json.HatchJsonKt.HatchJson
            kotlinx.serialization.json.JsonObjectSerializer r4 = kotlinx.serialization.json.JsonObjectSerializer.A01
            X.2nw r3 = new X.2nw
            r3.<init>()
            X.2nw r1 = new X.2nw
            r1.<init>()
            java.lang.String r0 = "file_handle"
            r7 = r17
            X.C7qW.A06(r0, r7, r1)
            java.lang.String r0 = "asset_kind"
            r7 = r18
            X.C7qW.A06(r0, r7, r1)
            r7 = r19
            if (r19 == 0) goto L5d
            java.lang.String r0 = "attributes"
            X.C7qW.A06(r0, r7, r1)
        L5d:
            kotlinx.serialization.json.JsonObject r1 = r1.A00()
            java.lang.String r0 = "data"
            r3.A01(r0, r1)
            kotlinx.serialization.json.JsonObject r0 = r3.A00()
            java.lang.String r12 = r6.A02(r0, r4)
            com.facebook.aura.partners.voice.avatar.SetCustomAvatarDataJson$$serializer r13 = com.facebook.aura.partners.voice.avatar.SetCustomAvatarDataJson$$serializer.INSTANCE
            r0 = 0
            r15.L$0 = r0
            r15.L$1 = r0
            r15.L$2 = r0
            r15.L$3 = r0
            r15.L$4 = r0
            r15.label = r5
            java.lang.String r10 = "ClawmagotchiAbraSetCustomAvatar"
            java.lang.String r11 = "36805194462428540"
            r14 = 0
            r9 = r16
            java.lang.Object r1 = r8.postGraph(r9, r10, r11, r12, r13, r14, r15)
            if (r1 != r2) goto L23
        L8a:
            return r2
        L8b:
            com.facebook.aura.partners.voice.avatar.HatchAvatarAssetService$setCustomAvatar$1 r15 = new com.facebook.aura.partners.voice.avatar.HatchAvatarAssetService$setCustomAvatar$1
            r15.<init>(r3)
            goto L15
        L91:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.avatar.HatchAvatarAssetService.setCustomAvatar(java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object uploadToEcto(java.lang.String r24, byte[] r25, java.lang.String r26, java.lang.String r27, X.HtJ<? super java.lang.String> r28) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.avatar.HatchAvatarAssetService.uploadToEcto(java.lang.String, byte[], java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    public final Object loadBitmap(String str, HtJ<? super Bitmap> htJ) {
        if (str.length() != 0) {
            return GAX.A01(htJ, new AnonymousClass2(str, null), 6000L);
        }
        return null;
    }
}
