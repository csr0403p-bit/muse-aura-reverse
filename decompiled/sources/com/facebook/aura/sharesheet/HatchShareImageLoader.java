package com.facebook.aura.sharesheet;

import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes5.dex */
public final class HatchShareImageLoader {
    public static final int $stable = 0;
    public static final String CALLER_CONTEXT = "HatchMessageShare";
    public static final HatchShareImageLoader INSTANCE = new HatchShareImageLoader();
    public static final int MAX_DECODE_SIZE_PX = 1200;
    public static final String TAG = "HatchShareImageLoader";

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareImageLoader", f = "HatchShareImageLoader.kt", l = {42}, m = "fetchBitmap", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchShareImageLoader$fetchBitmap$1, reason: invalid class name */
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
            return HatchShareImageLoader.this.fetchBitmap(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareImageLoader", f = "HatchShareImageLoader.kt", l = {31}, m = "load", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchShareImageLoader$load$1, reason: invalid class name and case insensitive filesystem */
    public final class C136721 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;
        public /* synthetic */ Object result;

        public C136721(HtJ<? super C136721> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchShareImageLoader.this.load(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchBitmap(java.lang.String r11, X.HtJ<? super android.graphics.Bitmap> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.facebook.aura.sharesheet.HatchShareImageLoader.AnonymousClass1
            if (r0 == 0) goto L1f
            r9 = r12
            com.facebook.aura.sharesheet.HatchShareImageLoader$fetchBitmap$1 r9 = (com.facebook.aura.sharesheet.HatchShareImageLoader.AnonymousClass1) r9
            int r2 = r9.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1f
            int r2 = r2 - r1
            r9.label = r2
        L12:
            java.lang.Object r0 = r9.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r2 = r9.label
            r8 = 0
            r1 = 1
            if (r2 == 0) goto L2a
            if (r2 != r1) goto L25
            goto L4c
        L1f:
            com.facebook.aura.sharesheet.HatchShareImageLoader$fetchBitmap$1 r9 = new com.facebook.aura.sharesheet.HatchShareImageLoader$fetchBitmap$1
            r9.<init>(r12)
            goto L12
        L25:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2a:
            X.Hwg.A00(r0)
            r5 = 0
            android.net.Uri r5 = X.C7Je.A01(r11)     // Catch: java.lang.Throwable -> L32
        L32:
            if (r5 != 0) goto L35
            return r8
        L35:
            com.facebook.aura.common.image.AuraBitmapLoader r4 = com.facebook.aura.common.image.AuraBitmapLoader.INSTANCE     // Catch: java.lang.Exception -> L52 java.util.concurrent.CancellationException -> L5b
            java.lang.String r6 = "HatchMessageShare"
            r0 = 1200(0x4b0, float:1.682E-42)
            java.lang.Integer r7 = X.C3cG.A0R(r0)     // Catch: java.lang.Exception -> L52 java.util.concurrent.CancellationException -> L5b
            r9.L$0 = r8     // Catch: java.lang.Exception -> L52 java.util.concurrent.CancellationException -> L5b
            r9.L$1 = r8     // Catch: java.lang.Exception -> L52 java.util.concurrent.CancellationException -> L5b
            r9.label = r1     // Catch: java.lang.Exception -> L52 java.util.concurrent.CancellationException -> L5b
            java.lang.Object r0 = r4.load(r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L52 java.util.concurrent.CancellationException -> L5b
            if (r0 != r3) goto L4f
            return r3
        L4c:
            X.Hwg.A00(r0)     // Catch: java.lang.Exception -> L52 java.util.concurrent.CancellationException -> L5b
        L4f:
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch: java.lang.Exception -> L52 java.util.concurrent.CancellationException -> L5b
            return r0
        L52:
            r2 = move-exception
            java.lang.String r1 = "Failed to fetch an image for sharing"
            java.lang.String r0 = "HatchShareImageLoader"
            X.CFK.A0K(r0, r2, r1)
            return r8
        L5b:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchShareImageLoader.fetchBitmap(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x006f -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object load(java.lang.String r7, X.AbstractC3358CGz r8, X.HtJ<? super android.graphics.Bitmap> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.facebook.aura.sharesheet.HatchShareImageLoader.C136721
            if (r0 == 0) goto L72
            r3 = r9
            com.facebook.aura.sharesheet.HatchShareImageLoader$load$1 r3 = (com.facebook.aura.sharesheet.HatchShareImageLoader.C136721) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L72
            int r2 = r2 - r1
            r3.label = r2
        L12:
            java.lang.Object r0 = r3.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r1 = r3.label
            r2 = 1
            if (r1 == 0) goto L27
            if (r1 != r2) goto L78
            java.lang.Object r5 = r3.L$4
            java.util.Iterator r5 = (java.util.Iterator) r5
            X.Hwg.A00(r0)
        L24:
            if (r0 == 0) goto L52
            return r0
        L27:
            X.Hwg.A00(r0)
            com.facebook.aura.gateway.HatchFileOperations r1 = com.facebook.aura.gateway.HatchFileOperations.INSTANCE
            com.facebook.aura.gateway.HatchThumbnailDisplaySize r0 = com.facebook.aura.gateway.HatchThumbnailDisplaySize.MEDIUM
            java.lang.String r0 = r1.buildAuthenticatedImageUrl(r7, r8, r0)
            if (r0 != 0) goto L38
            java.lang.String r0 = com.facebook.aura.gateway.AuraMarkdownUrlResolversKt.resolveAuraMarkdownUrl(r7, r8)
        L38:
            X.AII r1 = X.AIM.A17()
            r1.add(r0)
            java.util.List r0 = com.facebook.aura.gateway.AuraMarkdownUrlResolversKt.resolveAuraMarkdownVideoThumbnails(r7, r8)
            r1.addAll(r0)
            X.AII r0 = X.AIM.A18(r1)
            java.util.List r0 = X.AbstractC0878AGe.A0T(r0)
            java.util.Iterator r5 = r0.iterator()
        L52:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L7d
            java.lang.String r1 = X.AnonymousClass005.A0j(r5)
            r0 = 0
            r3.L$0 = r0
            r3.L$1 = r0
            r3.L$2 = r0
            r3.L$3 = r0
            r3.L$4 = r5
            r3.L$5 = r0
            r3.label = r2
            java.lang.Object r0 = r6.fetchBitmap(r1, r3)
            if (r0 != r4) goto L24
            return r4
        L72:
            com.facebook.aura.sharesheet.HatchShareImageLoader$load$1 r3 = new com.facebook.aura.sharesheet.HatchShareImageLoader$load$1
            r3.<init>(r9)
            goto L12
        L78:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L7d:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchShareImageLoader.load(java.lang.String, X.CGz, X.HtJ):java.lang.Object");
    }
}
