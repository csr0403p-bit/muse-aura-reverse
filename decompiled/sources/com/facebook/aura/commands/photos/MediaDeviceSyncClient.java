package com.facebook.aura.commands.photos;

import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes6.dex */
public final class MediaDeviceSyncClient {
    public static final MediaDeviceSyncClient INSTANCE = new MediaDeviceSyncClient();

    @DebugMetadata(c = "com.facebook.aura.commands.photos.MediaDeviceSyncClient", f = "MediaDeviceSyncClient.kt", l = {135}, m = "existsOnServer", v = 2)
    /* renamed from: com.facebook.aura.commands.photos.MediaDeviceSyncClient$existsOnServer$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
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

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MediaDeviceSyncClient.this.existsOnServer(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.photos.MediaDeviceSyncClient", f = "MediaDeviceSyncClient.kt", l = {63, 75}, m = "upload", v = 2)
    /* renamed from: com.facebook.aura.commands.photos.MediaDeviceSyncClient$upload$1, reason: invalid class name and case insensitive filesystem */
    public final class C111321 extends HzP {
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

        public C111321(HtJ<? super C111321> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MediaDeviceSyncClient.this.upload(null, null, null, null, null, null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object existsOnServer(X.AbstractC3358CGz r25, java.lang.String r26, X.HtJ<? super java.lang.Boolean> r27) {
        /*
            r24 = this;
            r4 = r27
            boolean r0 = r4 instanceof com.facebook.aura.commands.photos.MediaDeviceSyncClient.AnonymousClass1
            if (r0 == 0) goto L92
            r3 = r4
            com.facebook.aura.commands.photos.MediaDeviceSyncClient$existsOnServer$1 r3 = (com.facebook.aura.commands.photos.MediaDeviceSyncClient.AnonymousClass1) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L92
            int r2 = r2 - r1
            r3.label = r2
        L14:
            java.lang.Object r4 = r3.result
            X.Hji r1 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r2 = 1
            if (r0 == 0) goto L30
            if (r0 != r2) goto L9c
            java.lang.Object r2 = X.AnonymousClass001.A0q(r4)
        L23:
            boolean r1 = r2 instanceof X.C10571Hud
            r0 = 0
            if (r1 == 0) goto L29
            r2 = r0
        L29:
            com.facebook.aura.commands.photos.FsUploadStatusResultJson r2 = (com.facebook.aura.commands.photos.FsUploadStatusResultJson) r2
            if (r2 == 0) goto L9b
            java.lang.Boolean r1 = r2.exists
            return r1
        L30:
            X.Hwg.A00(r4)
            com.facebook.aura.network.http.HatchHttpApi r5 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.commands.photos.PhotosJarvisPath$FsUploadStatus r9 = com.facebook.aura.commands.photos.PhotosJarvisPath.FsUploadStatus.INSTANCE
            java.lang.String r0 = "media_device_sync"
            com.facebook.aura.commands.photos.FsUploadStatusRequestJson r10 = new com.facebook.aura.commands.photos.FsUploadStatusRequestJson
            r4 = r26
            r10.<init>(r0, r4)
            com.facebook.aura.network.http.RequestType r11 = com.facebook.aura.network.http.RequestType.POST
            r8 = 0
            X.HxE[] r15 = new X.HxE[r8]
            java.util.Set r16 = X.AnonymousClass004.A18()
            X.9jH r19 = X.C9jH.A00
            com.facebook.aura.commands.photos.MediaDeviceSyncClient$existsOnServer$$inlined$executeJarvisRequest-Z6QaZII$default$1 r6 = com.facebook.aura.commands.photos.MediaDeviceSyncClient$existsOnServer$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE
            com.facebook.aura.commands.photos.MediaDeviceSyncClient$existsOnServer$$inlined$executeJarvisRequest-Z6QaZII$default$2 r7 = com.facebook.aura.commands.photos.MediaDeviceSyncClient$existsOnServer$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE
            r13 = 0
            r3.L$0 = r13
            r3.L$1 = r13
            r3.L$2 = r13
            r3.L$3 = r13
            r3.L$4 = r13
            r3.L$5 = r13
            r3.L$6 = r13
            r3.L$7 = r13
            r3.L$8 = r13
            r3.L$9 = r13
            r3.I$0 = r2
            r3.I$1 = r2
            r3.I$2 = r8
            r3.I$3 = r2
            r3.I$4 = r8
            r3.I$5 = r8
            r3.I$6 = r8
            r3.label = r2
            r12 = r25
            r14 = r13
            r18 = r2
            r20 = r13
            r21 = r8
            r22 = r2
            r23 = r8
            r24 = r8
            r25 = r13
            r26 = r8
            r27 = r3
            r17 = r2
            java.lang.Object r2 = r5.m1599executeJarvisRequestWithFof5HsY(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            if (r2 != r1) goto L23
            return r1
        L92:
            com.facebook.aura.commands.photos.MediaDeviceSyncClient$existsOnServer$1 r3 = new com.facebook.aura.commands.photos.MediaDeviceSyncClient$existsOnServer$1
            r0 = r24
            r3.<init>(r4)
            goto L14
        L9b:
            return r0
        L9c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.photos.MediaDeviceSyncClient.existsOnServer(X.CGz, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0110 A[Catch: all -> 0x015e, TRY_ENTER, TryCatch #2 {all -> 0x015e, blocks: (B:35:0x0103, B:36:0x0106, B:39:0x0110, B:40:0x012a, B:42:0x012e, B:48:0x0159, B:49:0x015d, B:24:0x00a0, B:27:0x00bb, B:29:0x00ce, B:31:0x00d4, B:32:0x00d9), top: B:60:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012a A[Catch: all -> 0x015e, TryCatch #2 {all -> 0x015e, blocks: (B:35:0x0103, B:36:0x0106, B:39:0x0110, B:40:0x012a, B:42:0x012e, B:48:0x0159, B:49:0x015d, B:24:0x00a0, B:27:0x00bb, B:29:0x00ce, B:31:0x00d4, B:32:0x00d9), top: B:60:0x0030 }] */
    /* JADX WARN: Type inference failed for: r11v1, types: [int, java.io.File] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object upload(android.content.Context r17, X.AbstractC3358CGz r18, android.net.Uri r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, X.HtJ<? super com.facebook.aura.commands.photos.PhotoUploadOutcome> r24) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.photos.MediaDeviceSyncClient.upload(android.content.Context, X.CGz, android.net.Uri, java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }
}
