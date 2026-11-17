package com.facebook.aura.sharesheet;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C3UX;
import X.C3cG;
import X.C60O;
import X.C60P;
import X.C7384Etj;
import X.C78T;
import X.C8j4;
import X.EnumC10460Hji;
import X.FGI;
import X.G0U;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import X.HzP;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.facebook.aura.model.HatchFileProviderUtil;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes4.dex */
public final class HatchMessageShareImageRenderer {
    public static final int $stable = 0;
    public static final HatchMessageShareImageRenderer INSTANCE = new HatchMessageShareImageRenderer();
    public static final String TAG = "HatchMessageShareImageRenderer";

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchMessageShareImageRenderer", f = "HatchMessageShareImageRenderer.kt", l = {99}, m = "deriveFromCard", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchMessageShareImageRenderer$deriveFromCard$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchMessageShareImageRenderer.this.deriveFromCard(null, null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchMessageShareImageRenderer$deriveFromCard$2", f = "HatchMessageShareImageRenderer.kt", l = {110}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchMessageShareImageRenderer$deriveFromCard$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super String>, Object> {
        public final /* synthetic */ Context $applicationContext;
        public final /* synthetic */ String $cacheKey;
        public final /* synthetic */ String $cardUri;
        public final /* synthetic */ G0U<Bitmap, Bitmap> $transform;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Context context, String str, String str2, G0U<? super Bitmap, Bitmap> g0u, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$applicationContext = context;
            this.$cacheKey = str;
            this.$cardUri = str2;
            this.$transform = g0u;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$applicationContext, this.$cacheKey, this.$cardUri, this.$transform, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws IOException {
            Bitmap bitmapDecodeStream;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    File fileFind = C8j4.A0k(this.$applicationContext).find(this.$cacheKey);
                    Context context = this.$applicationContext;
                    if (fileFind != null) {
                        return C8j4.A0v(context, HatchFileProviderUtil.INSTANCE, fileFind);
                    }
                    InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(Uri.parse(this.$cardUri));
                    if (inputStreamOpenInputStream != null) {
                        try {
                            bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream);
                            inputStreamOpenInputStream.close();
                            if (bitmapDecodeStream != null) {
                                C78T c78tA0v = C3cG.A0v();
                                HatchMessageShareImageRenderer$deriveFromCard$2$bitmap$1 hatchMessageShareImageRenderer$deriveFromCard$2$bitmap$1 = new HatchMessageShareImageRenderer$deriveFromCard$2$bitmap$1(this.$transform, bitmapDecodeStream, null);
                                this.L$0 = bitmapDecodeStream;
                                this.label = 1;
                                obj = GAo.A00(this, c78tA0v, hatchMessageShareImageRenderer$deriveFromCard$2$bitmap$1);
                                if (obj == enumC10460Hji) {
                                    return enumC10460Hji;
                                }
                            }
                        } finally {
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                bitmapDecodeStream = (Bitmap) this.L$0;
                Hwg.A00(obj);
                Bitmap bitmap = (Bitmap) obj;
                bitmapDecodeStream.recycle();
                HatchMessageShareImageRenderer hatchMessageShareImageRenderer = HatchMessageShareImageRenderer.INSTANCE;
                Context context2 = this.$applicationContext;
                C7384Etj.A0X(context2);
                return hatchMessageShareImageRenderer.storePng(context2, this.$cacheKey, bitmap);
            } catch (Throwable th) {
                bitmapDecodeStream.recycle();
                throw th;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super String> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchMessageShareImageRenderer", f = "HatchMessageShareImageRenderer.kt", l = {36, R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft, R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight, 55, 64}, m = "render", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchMessageShareImageRenderer$render$1, reason: invalid class name and case insensitive filesystem */
    public final class C136631 extends HzP {
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
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C136631(HtJ<? super C136631> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchMessageShareImageRenderer.this.render(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchMessageShareImageRenderer$render$2", f = "HatchMessageShareImageRenderer.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchMessageShareImageRenderer$render$2, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C136642 extends AbstractC07127nr implements G0V<String, HtJ<? super Bitmap>, Object> {
        public int label;

        public C136642(HtJ<? super C136642> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C136642(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return null;
        }

        @Override // X.G0V
        public final Object invoke(String str, HtJ<? super Bitmap> htJ) {
            return new C136642(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchMessageShareImageRenderer$render$3", f = "HatchMessageShareImageRenderer.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchMessageShareImageRenderer$render$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super String>, Object> {
        public final /* synthetic */ Context $applicationContext;
        public final /* synthetic */ String $cacheKey;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Context context, String str, HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
            this.$applicationContext = context;
            this.$cacheKey = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass3(this.$applicationContext, this.$cacheKey, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            File fileFind = C8j4.A0k(this.$applicationContext).find(this.$cacheKey);
            if (fileFind != null) {
                return C8j4.A0v(this.$applicationContext, HatchFileProviderUtil.INSTANCE, fileFind);
            }
            return null;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super String> htJ) {
            return ((AnonymousClass3) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: com.facebook.aura.sharesheet.HatchMessageShareImageRenderer$renderFacebookFeedCard$2, reason: invalid class name and case insensitive filesystem */
    public final class C136652 extends AbstractC7559F3s implements G0U<Bitmap, Bitmap> {
        public static final C136652 INSTANCE = new C136652();

        public C136652() {
            super(1);
        }

        @Override // X.G0U
        public final Bitmap invoke(Bitmap bitmap) {
            C7384Etj.A0Y(bitmap, 0);
            return HatchMessageShareDocumentRenderer.Companion.renderOnBackdrop(bitmap);
        }
    }

    /* renamed from: com.facebook.aura.sharesheet.HatchMessageShareImageRenderer$renderOpaqueCard$2, reason: invalid class name and case insensitive filesystem */
    public final class C136662 extends AbstractC7559F3s implements G0U<Bitmap, Bitmap> {
        public final /* synthetic */ int $backgroundColor;

        @Override // X.G0U
        public final Bitmap invoke(Bitmap bitmap) {
            C7384Etj.A0Y(bitmap, 0);
            return HatchMessageShareDocumentRenderer.Companion.renderOnColor(bitmap, this.$backgroundColor);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C136662(int i) {
            super(1);
            this.$backgroundColor = i;
        }
    }

    public final Object renderOpaqueCard(Context context, String str, HtJ<? super String> htJ) {
        int i = (AnonymousClass003.A18(C60P.A00(AnonymousClass001.A0I(context))) ? HatchMessageShareImageColors.Dark : HatchMessageShareImageColors.Light).background;
        return deriveFromCard(context, FGI.A0W("message-share-opaque-v1:", ":", str, i), str, new C136662(i), htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object deriveFromCard(android.content.Context r6, java.lang.String r7, java.lang.String r8, X.G0U<? super android.graphics.Bitmap, android.graphics.Bitmap> r9, X.HtJ<? super java.lang.String> r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof com.facebook.aura.sharesheet.HatchMessageShareImageRenderer.AnonymousClass1
            if (r0 == 0) goto L1e
            r4 = r10
            com.facebook.aura.sharesheet.HatchMessageShareImageRenderer$deriveFromCard$1 r4 = (com.facebook.aura.sharesheet.HatchMessageShareImageRenderer.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r0 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r2 = r4.label
            r1 = 1
            if (r2 == 0) goto L29
            if (r2 != r1) goto L24
            goto L55
        L1e:
            com.facebook.aura.sharesheet.HatchMessageShareImageRenderer$deriveFromCard$1 r4 = new com.facebook.aura.sharesheet.HatchMessageShareImageRenderer$deriveFromCard$1
            r4.<init>(r10)
            goto L12
        L24:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L29:
            X.Hwg.A00(r0)
            android.content.Context r6 = r6.getApplicationContext()
            com.facebook.aura.sharesheet.HatchShareMediaCache$Companion r0 = com.facebook.aura.sharesheet.HatchShareMediaCache.Companion
            java.lang.String r7 = r0.keyFor(r7)
            X.78T r0 = X.AnonymousClass001.A0y()     // Catch: java.lang.Exception -> L5b java.util.concurrent.CancellationException -> L65
            r10 = 0
            com.facebook.aura.sharesheet.HatchMessageShareImageRenderer$deriveFromCard$2 r5 = new com.facebook.aura.sharesheet.HatchMessageShareImageRenderer$deriveFromCard$2     // Catch: java.lang.Exception -> L5b java.util.concurrent.CancellationException -> L65
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L5b java.util.concurrent.CancellationException -> L65
            r4.L$0 = r10     // Catch: java.lang.Exception -> L5b java.util.concurrent.CancellationException -> L65
            r4.L$1 = r10     // Catch: java.lang.Exception -> L5b java.util.concurrent.CancellationException -> L65
            r4.L$2 = r10     // Catch: java.lang.Exception -> L5b java.util.concurrent.CancellationException -> L65
            r4.L$3 = r10     // Catch: java.lang.Exception -> L5b java.util.concurrent.CancellationException -> L65
            r4.L$4 = r10     // Catch: java.lang.Exception -> L5b java.util.concurrent.CancellationException -> L65
            r4.L$5 = r10     // Catch: java.lang.Exception -> L5b java.util.concurrent.CancellationException -> L65
            r4.label = r1     // Catch: java.lang.Exception -> L5b java.util.concurrent.CancellationException -> L65
            java.lang.Object r0 = X.GAo.A00(r4, r0, r5)     // Catch: java.lang.Exception -> L5b java.util.concurrent.CancellationException -> L65
            if (r0 != r3) goto L58
            return r3
        L55:
            X.Hwg.A00(r0)     // Catch: java.lang.Exception -> L5b java.util.concurrent.CancellationException -> L65
        L58:
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L5b java.util.concurrent.CancellationException -> L65
            return r0
        L5b:
            r2 = move-exception
            java.lang.String r1 = "Failed to derive message share image"
            java.lang.String r0 = "HatchMessageShareImageRenderer"
            X.CFK.A0K(r0, r2, r1)
            r0 = 0
            return r0
        L65:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchMessageShareImageRenderer.deriveFromCard(android.content.Context, java.lang.String, java.lang.String, X.G0U, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object render$default(HatchMessageShareImageRenderer hatchMessageShareImageRenderer, Context context, String str, G0V g0v, HtJ htJ, int i, Object obj) {
        if ((i & 4) != 0) {
            g0v = new C136642(null);
        }
        return hatchMessageShareImageRenderer.render(context, str, g0v, htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String storePng(Context context, String str, Bitmap bitmap) {
        try {
            return C60O.A0o(HatchFileProviderUtil.INSTANCE.getUriForFile(context, new HatchShareMediaCache(context).storeNamed(FGI.A0M(str, ".png"), new HatchMessageShareImageRenderer$storePng$file$1(bitmap))));
        } finally {
            bitmap.recycle();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0180 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d0 A[Catch: Exception -> 0x01fe, CancellationException -> 0x0207, LOOP:0: B:56:0x01ca->B:58:0x01d0, LOOP_END, TRY_LEAVE, TryCatch #5 {CancellationException -> 0x0207, Exception -> 0x01fe, blocks: (B:55:0x01be, B:56:0x01ca, B:58:0x01d0, B:64:0x01df, B:65:0x01eb, B:67:0x01f1, B:68:0x01fb, B:44:0x0149, B:45:0x014c, B:40:0x0122, B:41:0x0125, B:34:0x00f9, B:35:0x00fc, B:37:0x0100, B:31:0x00d7), top: B:82:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01f1 A[Catch: Exception -> 0x01fe, CancellationException -> 0x0207, LOOP:1: B:65:0x01eb->B:67:0x01f1, LOOP_END, TryCatch #5 {CancellationException -> 0x0207, Exception -> 0x01fe, blocks: (B:55:0x01be, B:56:0x01ca, B:58:0x01d0, B:64:0x01df, B:65:0x01eb, B:67:0x01f1, B:68:0x01fb, B:44:0x0149, B:45:0x014c, B:40:0x0122, B:41:0x0125, B:34:0x00f9, B:35:0x00fc, B:37:0x0100, B:31:0x00d7), top: B:82:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01fc A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object render(android.content.Context r18, java.lang.String r19, X.G0V<? super java.lang.String, ? super X.HtJ<? super android.graphics.Bitmap>, ? extends java.lang.Object> r20, X.HtJ<? super java.lang.String> r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchMessageShareImageRenderer.render(android.content.Context, java.lang.String, X.G0V, X.HtJ):java.lang.Object");
    }

    public final Object renderFacebookFeedCard(Context context, String str, HtJ<? super String> htJ) {
        return deriveFromCard(context, FGI.A0M("message-share-facebook-feed-v2:", str), str, C136652.INSTANCE, htJ);
    }

    private final boolean isDarkTheme(Context context) {
        return AnonymousClass003.A18(C60P.A00(context));
    }
}
