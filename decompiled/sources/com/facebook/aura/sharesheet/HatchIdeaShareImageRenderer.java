package com.facebook.aura.sharesheet;

import X.Ab3;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C60Q;
import X.C7384Etj;
import X.C78T;
import X.C7BY;
import X.C8j3;
import X.C8j4;
import X.C8j5;
import X.EnumC10460Hji;
import X.FGI;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import X.HzP;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import com.facebook.aura.installsource.AuraInstallSourceDetector;
import com.facebook.aura.model.HatchFileProviderUtil;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes4.dex */
public final class HatchIdeaShareImageRenderer {
    public static final int $stable = 0;
    public static final int CARD_WIDTH = 400;
    public static final float CONTENT_TOP = 24.0f;
    public static final int ILLUSTRATION_OVERLAP = 40;
    public static final int ILLUSTRATION_SIZE = 216;
    public static final float IMAGE_SIZE = 48.0f;
    public static final HatchIdeaShareImageRenderer INSTANCE = new HatchIdeaShareImageRenderer();
    public static final int SCALE = 3;
    public static final int TEXT_LEFT = 76;

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer", f = "HatchIdeaShareImageRenderer.kt", l = {AuraInstallSourceDetector.SYSTEM_IMAGE_FLAGS, 135, 137}, m = "render", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer$render$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
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
        public boolean Z$1;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchIdeaShareImageRenderer.this.render(null, null, null, null, false, false, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer$render$2", f = "HatchIdeaShareImageRenderer.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer$render$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<String, HtJ<? super Bitmap>, Object> {
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(htJ);
        }

        @Override // X.G0V
        public final Object invoke(String str, HtJ<? super Bitmap> htJ) {
            return new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return null;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer$render$3", f = "HatchIdeaShareImageRenderer.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer$render$3, reason: invalid class name */
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
            File fileFindNamed = C8j4.A0k(this.$applicationContext).findNamed(FGI.A0M(this.$cacheKey, ".png"));
            if (fileFindNamed != null) {
                return C8j4.A0v(this.$applicationContext, HatchFileProviderUtil.INSTANCE, fileFindNamed);
            }
            return null;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super String> htJ) {
            return ((AnonymousClass3) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer", f = "HatchIdeaShareImageRenderer.kt", l = {R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop}, m = "renderInstagramStoriesSticker", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer$renderInstagramStoriesSticker$1, reason: invalid class name and case insensitive filesystem */
    public final class C136611 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C136611(HtJ<? super C136611> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchIdeaShareImageRenderer.this.renderInstagramStoriesSticker(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer$renderInstagramStoriesSticker$2", f = "HatchIdeaShareImageRenderer.kt", l = {58}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer$renderInstagramStoriesSticker$2, reason: invalid class name and case insensitive filesystem */
    public final class C136622 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super String>, Object> {
        public final /* synthetic */ Context $applicationContext;
        public final /* synthetic */ String $cardUri;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer$renderInstagramStoriesSticker$2$2", f = "HatchIdeaShareImageRenderer.kt", l = {61}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer$renderInstagramStoriesSticker$2$2, reason: invalid class name and collision with other inner class name */
        public final class C03572 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super String>, Object> {
            public final /* synthetic */ Context $applicationContext;
            public final /* synthetic */ HatchShareMediaCache $cache;
            public final /* synthetic */ String $cacheFileName;
            public final /* synthetic */ Bitmap $card;
            public final /* synthetic */ Bitmap $illustration;
            public Object L$0;
            public int label;

            @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer$renderInstagramStoriesSticker$2$2$1", f = "HatchIdeaShareImageRenderer.kt", l = {}, m = "invokeSuspend", v = 2)
            /* renamed from: com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer$renderInstagramStoriesSticker$2$2$1, reason: invalid class name */
            public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super String>, Object> {
                public final /* synthetic */ Context $applicationContext;
                public final /* synthetic */ Bitmap $bitmap;
                public final /* synthetic */ HatchShareMediaCache $cache;
                public final /* synthetic */ String $cacheFileName;
                public int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(HatchShareMediaCache hatchShareMediaCache, String str, Context context, Bitmap bitmap, HtJ<? super AnonymousClass1> htJ) {
                    super(2, htJ);
                    this.$cache = hatchShareMediaCache;
                    this.$cacheFileName = str;
                    this.$applicationContext = context;
                    this.$bitmap = bitmap;
                }

                @Override // X.AbstractC8884Fsp
                public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                    return new AnonymousClass1(this.$cache, this.$cacheFileName, this.$applicationContext, this.$bitmap, htJ);
                }

                @Override // X.AbstractC8884Fsp
                public final Object invokeSuspend(Object obj) throws Exception {
                    if (this.label != 0) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    File fileStoreNamed = this.$cache.storeNamed(this.$cacheFileName, new HatchIdeaShareImageRenderer$renderInstagramStoriesSticker$2$2$1$file$1(this.$bitmap));
                    return C8j4.A0v(this.$applicationContext, HatchFileProviderUtil.INSTANCE, fileStoreNamed);
                }

                @Override // X.G0V
                public final Object invoke(C3UX c3ux, HtJ<? super String> htJ) {
                    return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03572(Bitmap bitmap, Bitmap bitmap2, HatchShareMediaCache hatchShareMediaCache, String str, Context context, HtJ<? super C03572> htJ) {
                super(2, htJ);
                this.$card = bitmap;
                this.$illustration = bitmap2;
                this.$cache = hatchShareMediaCache;
                this.$cacheFileName = str;
                this.$applicationContext = context;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new C03572(this.$card, this.$illustration, this.$cache, this.$cacheFileName, this.$applicationContext, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                Bitmap bitmapCompositeStory;
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                try {
                    if (i == 0) {
                        Hwg.A00(obj);
                        bitmapCompositeStory = HatchIdeaShareImageRenderer.INSTANCE.compositeStory(this.$card, this.$illustration);
                        C78T c78tA0y = AnonymousClass001.A0y();
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$cache, this.$cacheFileName, this.$applicationContext, bitmapCompositeStory, null);
                        this.L$0 = bitmapCompositeStory;
                        this.label = 1;
                        obj = GAo.A00(this, c78tA0y, anonymousClass1);
                        if (obj == enumC10460Hji) {
                            return enumC10460Hji;
                        }
                    } else {
                        if (i != 1) {
                            throw AnonymousClass001.A0n();
                        }
                        bitmapCompositeStory = (Bitmap) this.L$0;
                        Hwg.A00(obj);
                    }
                    return (String) obj;
                } finally {
                    bitmapCompositeStory.recycle();
                }
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super String> htJ) {
                return ((C03572) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C136622(Context context, String str, HtJ<? super C136622> htJ) {
            super(2, htJ);
            this.$applicationContext = context;
            this.$cardUri = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C136622(this.$applicationContext, this.$cardUri, htJ);
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x00a5, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00a9, code lost:
        
            throw r0;
         */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.io.IOException {
            /*
                r12 = this;
                X.Hji r4 = X.EnumC10460Hji.A02
                int r0 = r12.label
                r3 = 1
                if (r0 == 0) goto L18
                if (r0 != r3) goto L13
                java.lang.Object r7 = r12.L$4
                android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
                java.lang.Object r6 = r12.L$3
                android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
                goto L94
            L13:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            L18:
                X.Hwg.A00(r13)
                android.content.Context r0 = r12.$applicationContext
                com.facebook.aura.sharesheet.HatchShareMediaCache r8 = X.C8j4.A0k(r0)
                com.facebook.aura.sharesheet.HatchShareMediaCache$Companion r2 = com.facebook.aura.sharesheet.HatchShareMediaCache.Companion
                java.lang.String r1 = r12.$cardUri
                java.lang.String r0 = "idea-story-v1:"
                java.lang.String r0 = X.FGI.A0M(r0, r1)
                java.lang.String r1 = r2.keyFor(r0)
                java.lang.String r0 = ".png"
                java.lang.String r9 = X.FGI.A0M(r1, r0)
                java.io.File r2 = r8.findNamed(r9)
                if (r2 == 0) goto L44
                android.content.Context r1 = r12.$applicationContext
                com.facebook.aura.model.HatchFileProviderUtil r0 = com.facebook.aura.model.HatchFileProviderUtil.INSTANCE
                java.lang.String r11 = X.C8j4.A0v(r1, r0, r2)
            L43:
                return r11
            L44:
                java.lang.String r0 = r12.$cardUri
                r11 = 0
                r1 = 0
                android.net.Uri r1 = X.C7Je.A01(r0)     // Catch: java.lang.Throwable -> L4c
            L4c:
                if (r1 == 0) goto L43
                android.content.Context r0 = r12.$applicationContext
                android.content.ContentResolver r0 = r0.getContentResolver()
                java.io.InputStream r2 = r0.openInputStream(r1)
                if (r2 == 0) goto L43
                android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeStream(r2)     // Catch: java.lang.Throwable -> Laa
                r2.close()
                if (r6 == 0) goto L43
                android.content.Context r0 = r12.$applicationContext     // Catch: java.lang.Throwable -> La5
                android.content.res.Resources r1 = r0.getResources()     // Catch: java.lang.Throwable -> La5
                r0 = 2131230878(0x7f08009e, float:1.8077821E38)
                android.graphics.Bitmap r7 = android.graphics.BitmapFactory.decodeResource(r1, r0)     // Catch: java.lang.Throwable -> La5
                if (r7 != 0) goto L76
                r6.recycle()
                return r11
            L76:
                X.78T r0 = X.C3cG.A0v()     // Catch: java.lang.Throwable -> La0
                android.content.Context r10 = r12.$applicationContext     // Catch: java.lang.Throwable -> La0
                com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer$renderInstagramStoriesSticker$2$2 r5 = new com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer$renderInstagramStoriesSticker$2$2     // Catch: java.lang.Throwable -> La0
                r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> La0
                r12.L$0 = r11     // Catch: java.lang.Throwable -> La0
                r12.L$1 = r11     // Catch: java.lang.Throwable -> La0
                r12.L$2 = r11     // Catch: java.lang.Throwable -> La0
                r12.L$3 = r6     // Catch: java.lang.Throwable -> La0
                r12.L$4 = r7     // Catch: java.lang.Throwable -> La0
                r12.label = r3     // Catch: java.lang.Throwable -> La0
                java.lang.Object r13 = X.GAo.A00(r12, r0, r5)     // Catch: java.lang.Throwable -> La0
                if (r13 != r4) goto L97
                return r4
            L94:
                X.Hwg.A00(r13)     // Catch: java.lang.Throwable -> La0
            L97:
                java.lang.String r13 = (java.lang.String) r13     // Catch: java.lang.Throwable -> La0
                r7.recycle()     // Catch: java.lang.Throwable -> La5
                r6.recycle()
                return r13
            La0:
                r0 = move-exception
                r7.recycle()     // Catch: java.lang.Throwable -> La5
                throw r0     // Catch: java.lang.Throwable -> La5
            La5:
                r0 = move-exception
                r6.recycle()
                throw r0
            Laa:
                r1 = move-exception
                throw r1     // Catch: java.lang.Throwable -> Lac
            Lac:
                r0 = move-exception
                X.AbstractC7531Ezs.A00(r2, r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer.C136622.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super String> htJ) {
            return ((C136622) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final int firstVisibleRow(Bitmap bitmap) {
        if (bitmap.hasAlpha()) {
            int width = bitmap.getWidth();
            int[] iArr = new int[width];
            int height = bitmap.getHeight();
            for (int i = 0; i < height; i++) {
                bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, i, bitmap.getWidth(), 1);
                for (int i2 = 0; i2 < width; i2++) {
                    if ((iArr[i2] >>> 24) != 0) {
                        return i;
                    }
                }
            }
        }
        return 0;
    }

    private final void drawImage(Canvas canvas, Context context, Bitmap bitmap, boolean z, int i, float f) throws Resources.NotFoundException {
        Drawable drawableMutate;
        RectF rectF = new RectF(16.0f, f, 64.0f, 48.0f + f);
        if (bitmap == null) {
            Drawable drawable = context.getResources().getDrawable(com.facebook.aura.R.drawable.aura_lightbulb_outline, null);
            if (drawable == null || (drawableMutate = drawable.mutate()) == null) {
                return;
            }
            drawableMutate.setTint(i);
            drawableMutate.setBounds(24, Ab3.A01(f), 56, Ab3.A01(f + 32.0f));
            drawableMutate.draw(canvas);
            return;
        }
        float fMin = Math.min(rectF.width() / bitmap.getWidth(), rectF.height() / bitmap.getHeight());
        float width = (bitmap.getWidth() * fMin) / 2.0f;
        float fFirstVisibleRow = f - (firstVisibleRow(bitmap) * fMin);
        RectF rectF2 = new RectF(rectF.centerX() - width, fFirstVisibleRow, rectF.centerX() + width, (bitmap.getHeight() * fMin) + fFirstVisibleRow);
        Paint paint = new Paint(3);
        if (!z) {
            paint.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        }
        canvas.drawBitmap(bitmap, (Rect) null, rectF2, paint);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object render$default(HatchIdeaShareImageRenderer hatchIdeaShareImageRenderer, Context context, String str, String str2, String str3, boolean z, boolean z2, G0V g0v, HtJ htJ, int i, Object obj) {
        boolean zA1Q = C60Q.A1Q(i & 32, z2);
        if ((i & 64) != 0) {
            g0v = new AnonymousClass2(null);
        }
        return hatchIdeaShareImageRenderer.render(context, str, str2, str3, z, zA1Q, g0v, htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap renderCard(Context context, String str, String str2, String str3, Bitmap bitmap, boolean z, HatchMessageShareImageColors hatchMessageShareImageColors) throws Resources.NotFoundException {
        Typeface typefaceA0J = C8j5.A0J(context);
        C7384Etj.A0X(typefaceA0J);
        StaticLayout staticLayoutTextLayout = textLayout(str, typefaceA0J, 15.0f, 400, hatchMessageShareImageColors.secondaryText, 1);
        StaticLayout staticLayoutTextLayout2 = textLayout(str2, typefaceA0J, 22.0f, 500, hatchMessageShareImageColors.primaryText, 3);
        StaticLayout staticLayoutTextLayout3 = textLayout(str3, typefaceA0J, 17.0f, 400, hatchMessageShareImageColors.secondaryText, 4);
        staticLayoutTextLayout.getPaint().getTextBounds(str, 0, str.length(), new Rect());
        float lineBaseline = staticLayoutTextLayout.getLineBaseline(0) + 24.0f + r7.top;
        float height = staticLayoutTextLayout.getHeight() + 24.0f + 6.0f;
        float height2 = staticLayoutTextLayout2.getHeight() + height + 10.0f;
        float fMax = Math.max(48.0f + lineBaseline, C7BY.A0j(str3) ? height2 : staticLayoutTextLayout3.getHeight() + height2) + 28.0f;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1200, Ab3.A02(3.0f, fMax), Bitmap.Config.ARGB_8888);
        Canvas canvasA0R = C8j4.A0R(bitmapCreateBitmap);
        canvasA0R.scale(3.0f, 3.0f);
        RectF rectF = new RectF(0.0f, 0.0f, 400.0f, fMax);
        Paint paint = new Paint(1);
        paint.setColor(hatchMessageShareImageColors.card);
        canvasA0R.drawRoundRect(rectF, 24.0f, 24.0f, paint);
        drawImage(canvasA0R, context, bitmap, z, hatchMessageShareImageColors.primaryText, lineBaseline);
        drawText(canvasA0R, staticLayoutTextLayout, 24.0f);
        drawText(canvasA0R, staticLayoutTextLayout2, height);
        if (!C7BY.A0j(str3)) {
            drawText(canvasA0R, staticLayoutTextLayout3, height2);
        }
        return bitmapCreateBitmap;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0180 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0188 A[Catch: Exception -> 0x0199, CancellationException -> 0x01a2, TRY_ENTER, TryCatch #4 {CancellationException -> 0x01a2, Exception -> 0x0199, blocks: (B:41:0x0188, B:42:0x018b, B:48:0x0194, B:49:0x0197, B:32:0x0135, B:33:0x0138, B:25:0x0109, B:26:0x010c, B:29:0x0112, B:22:0x00e1), top: B:60:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0194 A[Catch: Exception -> 0x0199, CancellationException -> 0x01a2, TRY_ENTER, TryCatch #4 {CancellationException -> 0x01a2, Exception -> 0x0199, blocks: (B:41:0x0188, B:42:0x018b, B:48:0x0194, B:49:0x0197, B:32:0x0135, B:33:0x0138, B:25:0x0109, B:26:0x010c, B:29:0x0112, B:22:0x00e1), top: B:60:0x002f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object render(android.content.Context r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, boolean r30, boolean r31, X.G0V<? super java.lang.String, ? super X.HtJ<? super android.graphics.Bitmap>, ? extends java.lang.Object> r32, X.HtJ<? super java.lang.String> r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer.render(android.content.Context, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, X.G0V, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object renderInstagramStoriesSticker(android.content.Context r8, java.lang.String r9, X.HtJ<? super java.lang.String> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer.C136611
            if (r0 == 0) goto L1f
            r6 = r10
            com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer$renderInstagramStoriesSticker$1 r6 = (com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer.C136611) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1f
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r0 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r1 = r6.label
            r4 = 0
            r3 = 1
            if (r1 == 0) goto L2a
            if (r1 != r3) goto L25
            goto L49
        L1f:
            com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer$renderInstagramStoriesSticker$1 r6 = new com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer$renderInstagramStoriesSticker$1
            r6.<init>(r10)
            goto L12
        L25:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2a:
            X.Hwg.A00(r0)
            android.content.Context r2 = r8.getApplicationContext()
            X.78T r1 = X.AnonymousClass001.A0y()     // Catch: java.lang.Exception -> L4f java.util.concurrent.CancellationException -> L58
            com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer$renderInstagramStoriesSticker$2 r0 = new com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer$renderInstagramStoriesSticker$2     // Catch: java.lang.Exception -> L4f java.util.concurrent.CancellationException -> L58
            r0.<init>(r2, r9, r4)     // Catch: java.lang.Exception -> L4f java.util.concurrent.CancellationException -> L58
            r6.L$0 = r4     // Catch: java.lang.Exception -> L4f java.util.concurrent.CancellationException -> L58
            r6.L$1 = r4     // Catch: java.lang.Exception -> L4f java.util.concurrent.CancellationException -> L58
            r6.L$2 = r4     // Catch: java.lang.Exception -> L4f java.util.concurrent.CancellationException -> L58
            r6.label = r3     // Catch: java.lang.Exception -> L4f java.util.concurrent.CancellationException -> L58
            java.lang.Object r0 = X.GAo.A00(r6, r1, r0)     // Catch: java.lang.Exception -> L4f java.util.concurrent.CancellationException -> L58
            if (r0 != r5) goto L4c
            return r5
        L49:
            X.Hwg.A00(r0)     // Catch: java.lang.Exception -> L4f java.util.concurrent.CancellationException -> L58
        L4c:
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L4f java.util.concurrent.CancellationException -> L58
            return r0
        L4f:
            r2 = move-exception
            java.lang.String r1 = "Failed to render idea story image"
            java.lang.String r0 = "HatchIdeaShareImageRenderer"
            X.CFK.A0K(r0, r2, r1)
            return r4
        L58:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer.renderInstagramStoriesSticker(android.content.Context, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap compositeStory(Bitmap bitmap, Bitmap bitmap2) {
        float width = bitmap.getWidth() / 400.0f;
        float f = 216.0f * width;
        float fA00 = C8j3.A00(bitmap.getWidth(), f);
        int iA02 = Ab3.A02(176.0f, width);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight() + iA02, Bitmap.Config.ARGB_8888);
        Canvas canvasA0R = C8j4.A0R(bitmapCreateBitmap);
        canvasA0R.drawBitmap(bitmap2, (Rect) null, new RectF(fA00, 0.0f, fA00 + f, f), new Paint(3));
        canvasA0R.drawBitmap(bitmap, 0.0f, iA02, (Paint) null);
        return bitmapCreateBitmap;
    }

    private final void drawText(Canvas canvas, StaticLayout staticLayout, float f) {
        canvas.save();
        C8j4.A1G(canvas, staticLayout, 76.0f, f);
    }

    private final StaticLayout textLayout(String str, Typeface typeface, float f, int i, int i2, int i3) {
        int length = str.length();
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTypeface(Typeface.create(typeface, i, false));
        textPaint.setTextSize(f);
        textPaint.setColor(i2);
        textPaint.setFontVariationSettings(FGI.A0I("'wght' ", i, ", 'opsz' 17"));
        StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(str, 0, length, textPaint, 300).setAlignment(Layout.Alignment.ALIGN_NORMAL).setIncludePad(false).setEllipsize(TextUtils.TruncateAt.END).setMaxLines(i3).setLineSpacing(2.0f, 1.0f).build();
        C7384Etj.A0U(staticLayoutBuild);
        return staticLayoutBuild;
    }
}
