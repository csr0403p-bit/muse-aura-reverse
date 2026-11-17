package com.facebook.aura.sharesheet;

import X.ATD;
import X.Ab3;
import X.AbstractC07127nr;
import X.C3UX;
import X.C7384Etj;
import X.C8j4;
import X.C8j5;
import X.G0V;
import X.HtJ;
import X.HzP;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import com.facebook.aura.R;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class HatchArtifactStoryImageRenderer {
    public static final int $stable = 0;
    public static final String CACHE_VERSION = "artifact-story-sticker-v16";
    public static final String CALLER_CONTEXT = "HatchArtifactStoryShare";
    public static final float CARD_CORNER_RADIUS_PX = 120.0f;
    public static final int CARD_LAYOUT_WIDTH_PX = 1200;
    public static final float CARD_SCALE = 0.75f;
    public static final int CARD_WIDTH_PX = 900;
    public static final float DEFAULT_PREVIEW_ASPECT_RATIO = 1.5f;
    public static final float FOOTER_HEIGHT_PX = 202.0f;
    public static final HatchArtifactStoryImageRenderer INSTANCE = new HatchArtifactStoryImageRenderer();
    public static final float MAX_PREVIEW_ASPECT_RATIO = 3.0f;
    public static final float MIN_PREVIEW_ASPECT_RATIO = 0.5f;
    public static final float PREVIEW_CORNER_RADIUS_PX = 100.0f;
    public static final int PREVIEW_DECODE_SIZE_PX = 1200;
    public static final float PREVIEW_LEFT_PX = 20.0f;
    public static final float PREVIEW_RIGHT_PX = 1180.0f;
    public static final float PREVIEW_TOP_PX = 20.0f;
    public static final float STORY_WIDTH_PX = 1080.0f;
    public static final float STORY_WIDTH_RATIO = 0.8333333f;
    public static final float SUBTITLE_BASELINE_SPACING_PX = 141.0f;
    public static final int SUBTITLE_FONT_WEIGHT = 400;
    public static final int SUBTITLE_OPTICAL_SIZE = 13;
    public static final float SUBTITLE_TEXT_SIZE_PX = 40.0f;
    public static final String TAG = "HatchArtifactStoryImageRenderer";
    public static final float TEXT_RIGHT_SPACING_PX = 60.0f;
    public static final float TILE_CORNER_RADIUS_PX = 28.0f;
    public static final int TILE_DECODE_SIZE_PX = 256;
    public static final int TILE_FALLBACK_SIZE_PX = 80;
    public static final float TILE_LEFT_PX = 60.0f;
    public static final float TILE_TEXT_SPACING_PX = 32.0f;
    public static final int TITLE_FONT_WEIGHT = 500;
    public static final int TITLE_OPTICAL_SIZE = 17;
    public static final float TITLE_TEXT_SIZE_PX = 52.0f;
    public static final float TITLE_TOP_SPACING_PX = 36.0f;

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchArtifactStoryImageRenderer", f = "HatchArtifactStoryImageRenderer.kt", l = {304}, m = "fetchBitmap", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchArtifactStoryImageRenderer$fetchBitmap$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int I$0;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchArtifactStoryImageRenderer.this.fetchBitmap(null, 0, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchArtifactStoryImageRenderer", f = "HatchArtifactStoryImageRenderer.kt", l = {52}, m = "render", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchArtifactStoryImageRenderer$render$1, reason: invalid class name and case insensitive filesystem */
    public final class C136511 extends HzP {
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

        public C136511(HtJ<? super C136511> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchArtifactStoryImageRenderer.this.render(null, null, null, null, null, 0, 0, 0, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchArtifactStoryImageRenderer$render$2", f = "HatchArtifactStoryImageRenderer.kt", l = {58, HatchMessageShareDocumentRenderer.TABLE_MIN_ROW_HEIGHT_PX}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchArtifactStoryImageRenderer$render$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super String>, Object> {
        public final /* synthetic */ Context $applicationContext;
        public final /* synthetic */ int $backgroundColor;
        public final /* synthetic */ String $cacheFileName;
        public final /* synthetic */ Uri $localPreviewUri;
        public final /* synthetic */ List<String> $openGraphImageUrls;
        public final /* synthetic */ String $subtitle;
        public final /* synthetic */ int $subtitleColor;
        public final /* synthetic */ String $title;
        public final /* synthetic */ int $titleColor;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Context context, String str, Uri uri, List<String> list, String str2, String str3, int i, int i2, int i3, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$applicationContext = context;
            this.$cacheFileName = str;
            this.$localPreviewUri = uri;
            this.$openGraphImageUrls = list;
            this.$title = str2;
            this.$subtitle = str3;
            this.$backgroundColor = i;
            this.$titleColor = i2;
            this.$subtitleColor = i3;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$applicationContext, this.$cacheFileName, this.$localPreviewUri, this.$openGraphImageUrls, this.$title, this.$subtitle, this.$backgroundColor, this.$titleColor, this.$subtitleColor, htJ);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0056 A[DONT_GENERATE] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x005f A[DONT_GENERATE] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:57:? A[PHI: r2 r3 r7 r8
  PHI (r2v3 com.facebook.aura.sharesheet.HatchShareMediaCache) = (r2v1 com.facebook.aura.sharesheet.HatchShareMediaCache), (r2v6 com.facebook.aura.sharesheet.HatchShareMediaCache) binds: [B:30:0x009f, B:7:0x0021] A[DONT_GENERATE, DONT_INLINE]
  PHI (r3v3 X.Hqv) = (r3v2 X.Hqv), (r3v5 X.Hqv) binds: [B:30:0x009f, B:7:0x0021] A[DONT_GENERATE, DONT_INLINE]
  PHI (r7v1 java.util.Iterator<java.lang.String>) = (r7v0 java.util.Iterator<java.lang.String>), (r7v3 java.util.Iterator<java.lang.String>) binds: [B:30:0x009f, B:7:0x0021] A[DONT_GENERATE, DONT_INLINE]
  PHI (r8v4 android.graphics.Bitmap) = (r8v1 android.graphics.Bitmap), (r8v6 android.graphics.Bitmap) binds: [B:30:0x009f, B:7:0x0021] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00d1 -> B:7:0x0021). Please report as a decompilation issue!!! */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r16) throws android.content.res.Resources.NotFoundException {
            /*
                Method dump skipped, instructions count: 236
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchArtifactStoryImageRenderer.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super String> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final void drawArtifactTile(Canvas canvas, Context context, Bitmap bitmap, float f, float f2) throws Resources.NotFoundException {
        RectF rectF = new RectF(60.0f, f, f2 + 60.0f, f2 + f);
        Paint paint = new Paint(1);
        paint.setColor(-1);
        C8j5.A0f(canvas, paint, rectF, 28.0f);
        if (bitmap != null) {
            drawPreview(canvas, bitmap, rectF);
        } else {
            Drawable drawable = context.getResources().getDrawable(R.drawable.hatch_logo, null);
            if (drawable != null) {
                int iCenterX = (int) rectF.centerX();
                int iCenterY = (int) rectF.centerY();
                drawable.setBounds(iCenterX - 40, iCenterY - 40, iCenterX + 40, iCenterY + 40);
                drawable.draw(canvas);
            }
        }
        canvas.restore();
    }

    private final void drawFooter(Canvas canvas, Context context, Bitmap bitmap, float f, String str, String str2, int i, int i2) throws Resources.NotFoundException {
        Typeface typefaceA0J = C8j5.A0J(context);
        float f2 = f + 36.0f;
        float f3 = f + 141.0f;
        Paint paint = new Paint(1);
        paint.setColor(i2);
        paint.setTextSize(40.0f);
        paint.setTypeface(typefaceA0J);
        paint.setFontVariationSettings("'wght' 400, 'opsz' 13");
        float f4 = (paint.getFontMetrics().descent + f3) - f2;
        float f5 = f4 + 60.0f + 32.0f;
        int iA01 = Ab3.A01((1200.0f - f5) - 60.0f);
        drawArtifactTile(canvas, context, bitmap, f2, f4);
        int length = str.length();
        TextPaint textPaint = new TextPaint(1);
        textPaint.setColor(i);
        textPaint.setTextSize(52.0f);
        textPaint.setTypeface(Typeface.create(typefaceA0J, 500, false));
        textPaint.setFontVariationSettings("'wght' 500, 'opsz' 17");
        StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(str, 0, length, textPaint, iA01).setAlignment(Layout.Alignment.ALIGN_NORMAL).setEllipsize(TextUtils.TruncateAt.END).setMaxLines(1).setIncludePad(false).build();
        C7384Etj.A0U(staticLayoutBuild);
        canvas.save();
        C8j4.A1G(canvas, staticLayoutBuild, f5, f2);
        canvas.drawText(str2, f5, f3, paint);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchBitmap(android.net.Uri r11, int r12, X.HtJ<? super android.graphics.Bitmap> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.facebook.aura.sharesheet.HatchArtifactStoryImageRenderer.AnonymousClass1
            if (r0 == 0) goto L1e
            r9 = r13
            com.facebook.aura.sharesheet.HatchArtifactStoryImageRenderer$fetchBitmap$1 r9 = (com.facebook.aura.sharesheet.HatchArtifactStoryImageRenderer.AnonymousClass1) r9
            int r2 = r9.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r9.label = r2
        L12:
            java.lang.Object r0 = r9.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r2 = r9.label
            r1 = 1
            if (r2 == 0) goto L29
            if (r2 != r1) goto L24
            goto L43
        L1e:
            com.facebook.aura.sharesheet.HatchArtifactStoryImageRenderer$fetchBitmap$1 r9 = new com.facebook.aura.sharesheet.HatchArtifactStoryImageRenderer$fetchBitmap$1
            r9.<init>(r13)
            goto L12
        L24:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L29:
            X.Hwg.A00(r0)
            com.facebook.aura.common.image.AuraBitmapLoader r4 = com.facebook.aura.common.image.AuraBitmapLoader.INSTANCE     // Catch: java.lang.Exception -> L49 java.util.concurrent.CancellationException -> L53
            java.lang.String r6 = "HatchArtifactStoryShare"
            java.lang.Integer r7 = X.C3cG.A0R(r12)     // Catch: java.lang.Exception -> L49 java.util.concurrent.CancellationException -> L53
            r8 = 0
            r9.L$0 = r8     // Catch: java.lang.Exception -> L49 java.util.concurrent.CancellationException -> L53
            r9.I$0 = r12     // Catch: java.lang.Exception -> L49 java.util.concurrent.CancellationException -> L53
            r9.label = r1     // Catch: java.lang.Exception -> L49 java.util.concurrent.CancellationException -> L53
            r5 = r11
            java.lang.Object r0 = r4.load(r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L49 java.util.concurrent.CancellationException -> L53
            if (r0 != r3) goto L46
            return r3
        L43:
            X.Hwg.A00(r0)     // Catch: java.lang.Exception -> L49 java.util.concurrent.CancellationException -> L53
        L46:
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch: java.lang.Exception -> L49 java.util.concurrent.CancellationException -> L53
            return r0
        L49:
            r2 = move-exception
            java.lang.String r1 = "Failed to load an artifact share image"
            java.lang.String r0 = "HatchArtifactStoryImageRenderer"
            X.CFK.A0K(r0, r2, r1)
            r0 = 0
            return r0
        L53:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchArtifactStoryImageRenderer.fetchBitmap(android.net.Uri, int, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap renderCard(Context context, Bitmap bitmap, Bitmap bitmap2, String str, String str2, int i, int i2, int i3) throws Resources.NotFoundException {
        float fA03 = (1160.0f / ((bitmap2 == null || bitmap2.getWidth() <= 0 || bitmap2.getHeight() <= 0) ? 1.5f : ATD.A03(bitmap2.getWidth() / bitmap2.getHeight(), 0.5f, 3.0f))) + 20.0f;
        float f = 202.0f + fA03;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(900, Ab3.A02(f, 0.75f), Bitmap.Config.ARGB_8888);
        Canvas canvasA0R = C8j4.A0R(bitmapCreateBitmap);
        canvasA0R.scale(0.75f, 0.75f);
        RectF rectF = new RectF(0.0f, 0.0f, 1200.0f, f);
        Paint paint = new Paint(1);
        paint.setColor(i);
        canvasA0R.drawRoundRect(rectF, 120.0f, 120.0f, paint);
        RectF rectF2 = new RectF(20.0f, 20.0f, 1180.0f, fA03);
        Paint paint2 = new Paint(1);
        paint2.setColor(-1);
        C8j5.A0f(canvasA0R, paint2, rectF2, 100.0f);
        if (bitmap2 != null) {
            drawPreview(canvasA0R, bitmap2, rectF2);
        } else {
            drawDrawable(canvasA0R, context, R.drawable.muse_wordmark, rectF2);
        }
        canvasA0R.restore();
        drawFooter(canvasA0R, context, bitmap, fA03, str, str2, i2, i3);
        return bitmapCreateBitmap;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object render(android.content.Context r7, android.net.Uri r8, java.util.List<java.lang.String> r9, java.lang.String r10, java.lang.String r11, int r12, int r13, int r14, X.HtJ<? super java.lang.String> r15) {
        /*
            r6 = this;
            boolean r0 = r15 instanceof com.facebook.aura.sharesheet.HatchArtifactStoryImageRenderer.C136511
            if (r0 == 0) goto L1e
            r1 = r15
            com.facebook.aura.sharesheet.HatchArtifactStoryImageRenderer$render$1 r1 = (com.facebook.aura.sharesheet.HatchArtifactStoryImageRenderer.C136511) r1
            int r3 = r1.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto L1e
            int r3 = r3 - r2
            r1.label = r3
        L12:
            java.lang.Object r0 = r1.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r4 = r1.label
            r2 = 1
            if (r4 == 0) goto L29
            if (r4 != r2) goto L24
            goto L95
        L1e:
            com.facebook.aura.sharesheet.HatchArtifactStoryImageRenderer$render$1 r1 = new com.facebook.aura.sharesheet.HatchArtifactStoryImageRenderer$render$1
            r1.<init>(r15)
            goto L12
        L24:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L29:
            X.Hwg.A00(r0)
            android.content.Context r6 = r7.getApplicationContext()
            com.facebook.aura.sharesheet.HatchShareMediaCache$Companion r5 = com.facebook.aura.sharesheet.HatchShareMediaCache.Companion
            com.facebook.aura.vds.font.api.AuraAppTypeface r0 = com.facebook.aura.vds.font.api.AuraAppTypeface.INSTANCE
            java.lang.String r4 = r0.getCacheKeySuffix()
            java.lang.String r0 = "artifact-story-sticker-v16"
            java.lang.StringBuilder r4 = X.C3cI.A0x(r0, r4)
            java.lang.String r0 = ":"
            r4.append(r0)
            r4.append(r8)
            r4.append(r0)
            r4.append(r9)
            X.C60O.A1R(r0, r10, r4)
            r4.append(r11)
            r4.append(r0)
            r4.append(r12)
            r4.append(r0)
            r4.append(r13)
            java.lang.String r0 = X.C60P.A1O(r0, r4, r14)
            java.lang.String r4 = r5.keyFor(r0)
            java.lang.String r0 = ".png"
            java.lang.String r7 = X.FGI.A0M(r4, r0)
            X.78T r0 = X.AnonymousClass001.A0y()     // Catch: java.lang.Exception -> L9b java.util.concurrent.CancellationException -> La5
            r15 = 0
            com.facebook.aura.sharesheet.HatchArtifactStoryImageRenderer$render$2 r5 = new com.facebook.aura.sharesheet.HatchArtifactStoryImageRenderer$render$2     // Catch: java.lang.Exception -> L9b java.util.concurrent.CancellationException -> La5
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Exception -> L9b java.util.concurrent.CancellationException -> La5
            r1.L$0 = r15     // Catch: java.lang.Exception -> L9b java.util.concurrent.CancellationException -> La5
            r1.L$1 = r15     // Catch: java.lang.Exception -> L9b java.util.concurrent.CancellationException -> La5
            r1.L$2 = r15     // Catch: java.lang.Exception -> L9b java.util.concurrent.CancellationException -> La5
            r1.L$3 = r15     // Catch: java.lang.Exception -> L9b java.util.concurrent.CancellationException -> La5
            r1.L$4 = r15     // Catch: java.lang.Exception -> L9b java.util.concurrent.CancellationException -> La5
            r1.L$5 = r15     // Catch: java.lang.Exception -> L9b java.util.concurrent.CancellationException -> La5
            r1.L$6 = r15     // Catch: java.lang.Exception -> L9b java.util.concurrent.CancellationException -> La5
            r1.L$7 = r15     // Catch: java.lang.Exception -> L9b java.util.concurrent.CancellationException -> La5
            r1.I$0 = r12     // Catch: java.lang.Exception -> L9b java.util.concurrent.CancellationException -> La5
            r1.I$1 = r13     // Catch: java.lang.Exception -> L9b java.util.concurrent.CancellationException -> La5
            r1.I$2 = r14     // Catch: java.lang.Exception -> L9b java.util.concurrent.CancellationException -> La5
            r1.label = r2     // Catch: java.lang.Exception -> L9b java.util.concurrent.CancellationException -> La5
            java.lang.Object r0 = X.GAo.A00(r1, r0, r5)     // Catch: java.lang.Exception -> L9b java.util.concurrent.CancellationException -> La5
            if (r0 != r3) goto L98
            return r3
        L95:
            X.Hwg.A00(r0)     // Catch: java.lang.Exception -> L9b java.util.concurrent.CancellationException -> La5
        L98:
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L9b java.util.concurrent.CancellationException -> La5
            return r0
        L9b:
            r2 = move-exception
            java.lang.String r1 = "Failed to render artifact story image"
            java.lang.String r0 = "HatchArtifactStoryImageRenderer"
            X.CFK.A0K(r0, r2, r1)
            r0 = 0
            return r0
        La5:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchArtifactStoryImageRenderer.render(android.content.Context, android.net.Uri, java.util.List, java.lang.String, java.lang.String, int, int, int, X.HtJ):java.lang.Object");
    }

    private final void drawDrawable(Canvas canvas, Context context, int i, RectF rectF) throws Resources.NotFoundException {
        Drawable drawable = context.getResources().getDrawable(i, null);
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth <= 0) {
                intrinsicWidth = (int) rectF.width();
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight <= 0) {
                intrinsicHeight = (int) rectF.height();
            }
            float f = intrinsicWidth;
            float f2 = intrinsicHeight;
            float fMin = Math.min(rectF.width() / f, rectF.height() / f2);
            float f3 = (f * fMin) / 2.0f;
            float f4 = (f2 * fMin) / 2.0f;
            drawable.setBounds(Ab3.A01(rectF.centerX() - f3), Ab3.A01(rectF.centerY() - f4), Ab3.A01(rectF.centerX() + f3), Ab3.A01(rectF.centerY() + f4));
            drawable.draw(canvas);
        }
    }

    private final void drawPreview(Canvas canvas, Bitmap bitmap, RectF rectF) {
        float fMin = Math.min(rectF.width() / bitmap.getWidth(), rectF.height() / bitmap.getHeight());
        float width = (bitmap.getWidth() * fMin) / 2.0f;
        float height = (bitmap.getHeight() * fMin) / 2.0f;
        RectF rectF2 = new RectF(rectF.centerX() - width, rectF.centerY() - height, rectF.centerX() + width, rectF.centerY() + height);
        Paint paint = new Paint(1);
        paint.setFilterBitmap(true);
        canvas.drawBitmap(bitmap, (Rect) null, rectF2, paint);
    }
}
