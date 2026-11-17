package com.facebook.aura.productactions.impl;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C10543Hqv;
import X.C3UX;
import X.C3cG;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import android.net.Uri;
import com.facebook.aura.model.HatchFileProviderUtil;
import com.facebook.aura.sharesheet.HatchShareMediaCache;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.UUID;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.productactions.impl.ShoppingProductShareKt$prepareProductShare$thumbnailUri$1", f = "ShoppingProductShare.kt", l = {64, 83}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class ShoppingProductShareKt$prepareProductShare$thumbnailUri$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Uri>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ String $imageUrl;
    public final /* synthetic */ C10543Hqv<File> $thumbnailFile;
    public final /* synthetic */ AbstractC3358CGz $userSession;
    public float F$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.productactions.impl.ShoppingProductShareKt$prepareProductShare$thumbnailUri$1$1", f = "ShoppingProductShare.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.productactions.impl.ShoppingProductShareKt$prepareProductShare$thumbnailUri$1$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Uri>, Object> {
        public final /* synthetic */ byte[] $bytes;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ C10543Hqv<File> $thumbnailFile;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, C10543Hqv<File> c10543Hqv, byte[] bArr, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$context = context;
            this.$thumbnailFile = c10543Hqv;
            this.$bytes = bArr;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$context, this.$thumbnailFile, this.$bytes, htJ);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v1, types: [T, java.io.File] */
        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws Exception {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            HatchShareMediaCache hatchShareMediaCache = new HatchShareMediaCache(AnonymousClass001.A0I(this.$context));
            String strA0v = AnonymousClass001.A0v(".png", C3cG.A0f(UUID.randomUUID(), "product-share-"));
            final byte[] bArr = this.$bytes;
            ?? StoreNamed = hatchShareMediaCache.storeNamed(strA0v, new G0U() { // from class: com.facebook.aura.productactions.impl.ShoppingProductShareKt$prepareProductShare$thumbnailUri$1$1$$ExternalSyntheticLambda0
                @Override // X.G0U
                public final Object invoke(Object obj2) throws IOException {
                    ((OutputStream) obj2).write(bArr);
                    return Unit.INSTANCE;
                }
            });
            this.$thumbnailFile.element = StoreNamed;
            return HatchFileProviderUtil.INSTANCE.getUriForFile(AnonymousClass001.A0I(this.$context), StoreNamed);
        }

        public static final Unit invokeSuspend$lambda$0(byte[] bArr, OutputStream outputStream) throws IOException {
            outputStream.write(bArr);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Uri> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingProductShareKt$prepareProductShare$thumbnailUri$1(String str, AbstractC3358CGz abstractC3358CGz, Context context, C10543Hqv<File> c10543Hqv, HtJ<? super ShoppingProductShareKt$prepareProductShare$thumbnailUri$1> htJ) {
        super(2, htJ);
        this.$imageUrl = str;
        this.$userSession = abstractC3358CGz;
        this.$context = context;
        this.$thumbnailFile = c10543Hqv;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ShoppingProductShareKt$prepareProductShare$thumbnailUri$1(this.$imageUrl, this.$userSession, this.$context, this.$thumbnailFile, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa A[Catch: all -> 0x00c7, DONT_GENERATE, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00c7, blocks: (B:36:0x00aa, B:16:0x003c, B:19:0x0054, B:22:0x005e, B:25:0x0068, B:48:0x00c3, B:49:0x00c6, B:33:0x00a3, B:34:0x00a6, B:26:0x006f, B:30:0x0082, B:44:0x00bc, B:45:0x00bf, B:27:0x0074, B:29:0x007e, B:39:0x00b1, B:40:0x00b8, B:42:0x00ba), top: B:53:0x0007, inners: #0 }] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            X.Hji r9 = X.EnumC10460Hji.A02
            int r0 = r11.label
            r8 = 2
            r7 = 0
            r2 = 1
            if (r0 == 0) goto L1c
            if (r0 == r2) goto L33
            if (r0 != r8) goto L17
            java.lang.Object r6 = r11.L$1
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            java.lang.Object r5 = r11.L$0
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            goto La3
        L17:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L1c:
            X.Hwg.A00(r12)
            java.lang.String r1 = r11.$imageUrl
            X.CGz r0 = r11.$userSession
            com.facebook.aura.productactions.impl.ShoppingProductShareKt$prepareProductShare$thumbnailUri$1$bitmap$1 r3 = new com.facebook.aura.productactions.impl.ShoppingProductShareKt$prepareProductShare$thumbnailUri$1$bitmap$1
            r3.<init>(r1, r0, r7)
            r11.label = r2
            r0 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r12 = X.GAX.A01(r11, r3, r0)
            if (r12 != r9) goto L36
            return r9
        L33:
            X.Hwg.A00(r12)
        L36:
            r5 = r12
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            if (r5 != 0) goto L3c
            return r7
        L3c:
            int r1 = r5.getWidth()     // Catch: java.lang.Throwable -> Lc7
            int r0 = r5.getHeight()     // Catch: java.lang.Throwable -> Lc7
            int r0 = java.lang.Math.max(r1, r0)     // Catch: java.lang.Throwable -> Lc7
            float r0 = (float) r0     // Catch: java.lang.Throwable -> Lc7
            r10 = 1134559232(0x43a00000, float:320.0)
            float r10 = r10 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 <= 0) goto L54
            r10 = 1065353216(0x3f800000, float:1.0)
        L54:
            int r0 = r5.getWidth()     // Catch: java.lang.Throwable -> Lc7
            float r0 = (float) r0     // Catch: java.lang.Throwable -> Lc7
            float r0 = r0 * r10
            int r1 = (int) r0     // Catch: java.lang.Throwable -> Lc7
            if (r1 >= r2) goto L5e
            r1 = 1
        L5e:
            int r0 = r5.getHeight()     // Catch: java.lang.Throwable -> Lc7
            float r0 = (float) r0     // Catch: java.lang.Throwable -> Lc7
            float r0 = r0 * r10
            int r0 = (int) r0     // Catch: java.lang.Throwable -> Lc7
            if (r0 >= r2) goto L68
            r0 = 1
        L68:
            android.graphics.Bitmap r6 = android.graphics.Bitmap.createScaledBitmap(r5, r1, r0, r2)     // Catch: java.lang.Throwable -> Lc7
            X.C7384Etj.A0U(r6)     // Catch: java.lang.Throwable -> Lc7
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> Lc0
            r2.<init>()     // Catch: java.lang.Throwable -> Lc0
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG     // Catch: java.lang.Throwable -> Lb9
            r0 = 100
            boolean r0 = r6.compress(r1, r0, r2)     // Catch: java.lang.Throwable -> Lb9
            if (r0 == 0) goto Lb1
            byte[] r4 = r2.toByteArray()     // Catch: java.lang.Throwable -> Lb9
            r2.close()     // Catch: java.lang.Throwable -> Lc0
            X.78T r3 = X.AnonymousClass001.A0y()     // Catch: java.lang.Throwable -> Lc0
            android.content.Context r2 = r11.$context     // Catch: java.lang.Throwable -> Lc0
            X.Hqv<java.io.File> r1 = r11.$thumbnailFile     // Catch: java.lang.Throwable -> Lc0
            com.facebook.aura.productactions.impl.ShoppingProductShareKt$prepareProductShare$thumbnailUri$1$1 r0 = new com.facebook.aura.productactions.impl.ShoppingProductShareKt$prepareProductShare$thumbnailUri$1$1     // Catch: java.lang.Throwable -> Lc0
            r0.<init>(r2, r1, r4, r7)     // Catch: java.lang.Throwable -> Lc0
            r11.L$0 = r5     // Catch: java.lang.Throwable -> Lc0
            r11.L$1 = r6     // Catch: java.lang.Throwable -> Lc0
            r11.L$2 = r7     // Catch: java.lang.Throwable -> Lc0
            r11.F$0 = r10     // Catch: java.lang.Throwable -> Lc0
            r11.label = r8     // Catch: java.lang.Throwable -> Lc0
            java.lang.Object r12 = X.GAo.A00(r11, r3, r0)     // Catch: java.lang.Throwable -> Lc0
            if (r12 != r9) goto La6
            return r9
        La3:
            X.Hwg.A00(r12)     // Catch: java.lang.Throwable -> Lc0
        La6:
            android.net.Uri r12 = (android.net.Uri) r12     // Catch: java.lang.Throwable -> Lc0
            if (r6 == r5) goto Lad
            r6.recycle()     // Catch: java.lang.Throwable -> Lc7
        Lad:
            r5.recycle()
            return r12
        Lb1:
            java.lang.String r1 = "Failed to encode product share thumbnail"
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> Lb9
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lb9
            throw r0     // Catch: java.lang.Throwable -> Lb9
        Lb9:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> Lbb
        Lbb:
            r0 = move-exception
            X.AbstractC7531Ezs.A00(r2, r1)     // Catch: java.lang.Throwable -> Lc0
            throw r0     // Catch: java.lang.Throwable -> Lc0
        Lc0:
            r0 = move-exception
            if (r6 == r5) goto Lc6
            r6.recycle()     // Catch: java.lang.Throwable -> Lc7
        Lc6:
            throw r0     // Catch: java.lang.Throwable -> Lc7
        Lc7:
            r0 = move-exception
            r5.recycle()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.productactions.impl.ShoppingProductShareKt$prepareProductShare$thumbnailUri$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Uri> htJ) {
        return ((ShoppingProductShareKt$prepareProductShare$thumbnailUri$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
