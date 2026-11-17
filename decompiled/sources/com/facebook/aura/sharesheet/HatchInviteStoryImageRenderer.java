package com.facebook.aura.sharesheet;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C60R;
import X.C7384Etj;
import X.C7BY;
import X.C8j4;
import X.C8j5;
import X.FGI;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HzP;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.facebook.aura.model.HatchFileProviderUtil;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes4.dex */
public final class HatchInviteStoryImageRenderer {
    public static final int $stable = 0;
    public static final String CACHE_VERSION = "invite-story-sticker-v1";
    public static final Bitmap.CompressFormat COMPRESS_FORMAT;
    public static final int COMPRESS_QUALITY = 90;
    public static final int CONTENT_WIDTH_PX = 888;
    public static final float DESIGN_WIDTH_PX = 390.0f;
    public static final int FRAME_BACKGROUND_COLOR;
    public static final int FRAME_HEIGHT_PX = 1920;
    public static final float FRAME_SCALE = 2.7692308f;
    public static final int FRAME_WIDTH_PX = 1080;
    public static final int HORIZONTAL_PADDING_PX = 96;
    public static final HatchInviteStoryImageRenderer INSTANCE = new HatchInviteStoryImageRenderer();
    public static final int SUBTITLE_FONT_WEIGHT = 400;
    public static final float SUBTITLE_LINE_HEIGHT_PX = 49.846153f;
    public static final int SUBTITLE_TEXT_COLOR;
    public static final float SUBTITLE_TEXT_SIZE_PX = 36.0f;
    public static final String TAG = "HatchInviteStoryImageRenderer";
    public static final int TEXT_CENTER_Y_PX = 1440;
    public static final int TEXT_SPACING_PX = 28;
    public static final int TITLE_FONT_WEIGHT = 500;
    public static final float TITLE_LINE_HEIGHT_PX = 66.46154f;
    public static final float TITLE_TEXT_SIZE_PX = 49.846153f;

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchInviteStoryImageRenderer", f = "HatchInviteStoryImageRenderer.kt", l = {R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight}, m = "render", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchInviteStoryImageRenderer$render$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchInviteStoryImageRenderer.this.render(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchInviteStoryImageRenderer$render$2", f = "HatchInviteStoryImageRenderer.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchInviteStoryImageRenderer$render$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super String>, Object> {
        public final /* synthetic */ String $accessCodeMessage;
        public final /* synthetic */ Context $applicationContext;
        public final /* synthetic */ String $cacheKey;
        public final /* synthetic */ String $message;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Context context, String str, String str2, String str3, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$applicationContext = context;
            this.$cacheKey = str;
            this.$message = str2;
            this.$accessCodeMessage = str3;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$applicationContext, this.$cacheKey, this.$message, this.$accessCodeMessage, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws Resources.NotFoundException {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            HatchShareMediaCache hatchShareMediaCacheA0k = C8j4.A0k(this.$applicationContext);
            File fileFind = hatchShareMediaCacheA0k.find(this.$cacheKey);
            if (fileFind != null) {
                return C8j4.A0v(this.$applicationContext, HatchFileProviderUtil.INSTANCE, fileFind);
            }
            HatchInviteStoryImageRenderer hatchInviteStoryImageRenderer = HatchInviteStoryImageRenderer.INSTANCE;
            Context context = this.$applicationContext;
            C7384Etj.A0X(context);
            Bitmap bitmapRenderCard = hatchInviteStoryImageRenderer.renderCard(context, this.$message, this.$accessCodeMessage);
            try {
                File fileStoreNamed = hatchShareMediaCacheA0k.storeNamed(FGI.A0M(this.$cacheKey, ".webp"), new HatchInviteStoryImageRenderer$render$2$file$1(bitmapRenderCard));
                return C8j4.A0v(this.$applicationContext, HatchFileProviderUtil.INSTANCE, fileStoreNamed);
            } finally {
                bitmapRenderCard.recycle();
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super String> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final StaticLayout textLayout(String str, float f, float f2, int i, Typeface typeface) {
        TextPaint textPaint = new TextPaint(1);
        textPaint.setColor(i);
        textPaint.setTextSize(f);
        textPaint.setTypeface(typeface);
        textPaint.setLetterSpacing(0.0f);
        StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(str, 0, str.length(), textPaint, CONTENT_WIDTH_PX).setAlignment(Layout.Alignment.ALIGN_CENTER).setIncludePad(false).setLineSpacing(f2 - textPaint.getFontSpacing(), 1.0f).build();
        C7384Etj.A0U(staticLayoutBuild);
        return staticLayoutBuild;
    }

    static {
        COMPRESS_FORMAT = Build.VERSION.SDK_INT >= 30 ? Bitmap.CompressFormat.WEBP_LOSSY : Bitmap.CompressFormat.WEBP;
        FRAME_BACKGROUND_COLOR = Color.rgb(245, 245, 245);
        SUBTITLE_TEXT_COLOR = Color.rgb(117, 117, 117);
    }

    public static /* synthetic */ void getCOMPRESS_FORMAT$annotations() {
    }

    private final String keepLastTwoWordsTogether(String str) {
        int iA09 = C7BY.A09(str, ' ', C60R.A02(str) - 1);
        return iA09 > 0 ? C7BY.A0c(str, "\u00a0", iA09, iA09 + 1).toString() : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap renderCard(Context context, String str, String str2) throws Resources.NotFoundException {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1080, 1920, Bitmap.Config.ARGB_8888);
        Canvas canvasA0R = C8j4.A0R(bitmapCreateBitmap);
        canvasA0R.drawColor(FRAME_BACKGROUND_COLOR);
        StaticLayout staticLayoutTextLayout = null;
        Drawable drawable = context.getResources().getDrawable(com.facebook.aura.R.drawable.hatch_invite_story_background, null);
        if (drawable != null) {
            drawable.setBounds(0, 0, 1080, 1920);
            drawable.draw(canvasA0R);
        }
        Typeface typefaceA0J = C8j5.A0J(context);
        String strKeepLastTwoWordsTogether = keepLastTwoWordsTogether(str);
        Typeface typefaceCreate = Typeface.create(typefaceA0J, 500, false);
        C7384Etj.A0U(typefaceCreate);
        StaticLayout staticLayoutTextLayout2 = textLayout(strKeepLastTwoWordsTogether, 49.846153f, 66.46154f, -16777216, typefaceCreate);
        if (str2 != null) {
            HatchInviteStoryImageRenderer hatchInviteStoryImageRenderer = INSTANCE;
            int i = SUBTITLE_TEXT_COLOR;
            Typeface typefaceCreate2 = Typeface.create(typefaceA0J, 400, false);
            C7384Etj.A0U(typefaceCreate2);
            staticLayoutTextLayout = hatchInviteStoryImageRenderer.textLayout(str2, 36.0f, 49.846153f, i, typefaceCreate2);
        }
        int height = staticLayoutTextLayout2.getHeight();
        int height2 = staticLayoutTextLayout != null ? staticLayoutTextLayout.getHeight() + 28 : 0;
        canvasA0R.save();
        canvasA0R.translate(96.0f, 1440 - ((height + height2) / 2));
        staticLayoutTextLayout2.draw(canvasA0R);
        if (staticLayoutTextLayout != null) {
            canvasA0R.translate(0.0f, staticLayoutTextLayout2.getHeight() + 28);
            staticLayoutTextLayout.draw(canvasA0R);
        }
        canvasA0R.restore();
        return bitmapCreateBitmap;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object render(android.content.Context r13, java.lang.String r14, java.lang.String r15, X.HtJ<? super java.lang.String> r16) {
        /*
            r12 = this;
            r4 = r16
            boolean r0 = r4 instanceof com.facebook.aura.sharesheet.HatchInviteStoryImageRenderer.AnonymousClass1
            if (r0 == 0) goto L20
            r3 = r4
            com.facebook.aura.sharesheet.HatchInviteStoryImageRenderer$render$1 r3 = (com.facebook.aura.sharesheet.HatchInviteStoryImageRenderer.AnonymousClass1) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r3.label = r2
        L14:
            java.lang.Object r0 = r3.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r1 = r3.label
            r2 = 1
            if (r1 == 0) goto L2b
            if (r1 != r2) goto L26
            goto L68
        L20:
            com.facebook.aura.sharesheet.HatchInviteStoryImageRenderer$render$1 r3 = new com.facebook.aura.sharesheet.HatchInviteStoryImageRenderer$render$1
            r3.<init>(r4)
            goto L14
        L26:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2b:
            X.Hwg.A00(r0)
            android.content.Context r12 = r13.getApplicationContext()
            com.facebook.aura.sharesheet.HatchShareMediaCache$Companion r1 = com.facebook.aura.sharesheet.HatchShareMediaCache.Companion
            com.facebook.aura.vds.font.api.AuraAppTypeface r0 = com.facebook.aura.vds.font.api.AuraAppTypeface.INSTANCE
            java.lang.String r6 = r0.getCacheKeySuffix()
            java.lang.String r5 = "invite-story-sticker-v1"
            java.lang.String r7 = ":"
            r8 = r14
            r10 = r15
            r9 = r7
            java.lang.String r0 = X.FGI.A0j(r5, r6, r7, r8, r9, r10)
            java.lang.String r13 = r1.keyFor(r0)
            X.78T r1 = X.AnonymousClass001.A0y()     // Catch: java.lang.Exception -> L6e java.util.concurrent.CancellationException -> L78
            r0 = 0
            com.facebook.aura.sharesheet.HatchInviteStoryImageRenderer$render$2 r11 = new com.facebook.aura.sharesheet.HatchInviteStoryImageRenderer$render$2     // Catch: java.lang.Exception -> L6e java.util.concurrent.CancellationException -> L78
            r16 = r0
            r11.<init>(r12, r13, r14, r15, r16)     // Catch: java.lang.Exception -> L6e java.util.concurrent.CancellationException -> L78
            r3.L$0 = r0     // Catch: java.lang.Exception -> L6e java.util.concurrent.CancellationException -> L78
            r3.L$1 = r0     // Catch: java.lang.Exception -> L6e java.util.concurrent.CancellationException -> L78
            r3.L$2 = r0     // Catch: java.lang.Exception -> L6e java.util.concurrent.CancellationException -> L78
            r3.L$3 = r0     // Catch: java.lang.Exception -> L6e java.util.concurrent.CancellationException -> L78
            r3.L$4 = r0     // Catch: java.lang.Exception -> L6e java.util.concurrent.CancellationException -> L78
            r3.label = r2     // Catch: java.lang.Exception -> L6e java.util.concurrent.CancellationException -> L78
            java.lang.Object r0 = X.GAo.A00(r3, r1, r11)     // Catch: java.lang.Exception -> L6e java.util.concurrent.CancellationException -> L78
            if (r0 != r4) goto L6b
            return r4
        L68:
            X.Hwg.A00(r0)     // Catch: java.lang.Exception -> L6e java.util.concurrent.CancellationException -> L78
        L6b:
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L6e java.util.concurrent.CancellationException -> L78
            return r0
        L6e:
            r2 = move-exception
            java.lang.String r1 = "Failed to render invite story image"
            java.lang.String r0 = "HatchInviteStoryImageRenderer"
            X.CFK.A0K(r0, r2, r1)
            r0 = 0
            return r0
        L78:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchInviteStoryImageRenderer.render(android.content.Context, java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }
}
