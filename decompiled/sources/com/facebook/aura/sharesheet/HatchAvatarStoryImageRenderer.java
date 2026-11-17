package com.facebook.aura.sharesheet;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.C06G;
import X.C3UX;
import X.C60O;
import X.C7384Etj;
import X.C8j4;
import X.C8j5;
import X.CFK;
import X.FGI;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HzP;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.facebook.aura.model.HatchFileProviderUtil;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class HatchAvatarStoryImageRenderer {
    public static final int $stable = 0;
    public static final float BODY_CORNER_RADIUS_PX = 60.92308f;
    public static final float BODY_TOP_PX = 83.07693f;
    public static final float BUBBLE_ROTATION_DEGREES = -3.0f;
    public static final int BUBBLE_SHADOW_COLOR = 436207616;
    public static final float BUBBLE_SHADOW_EXTRA_PX = 5.5384617f;
    public static final float BUBBLE_SHADOW_OFFSET_Y_PX = 5.5384617f;
    public static final float BUBBLE_SHADOW_RADIUS_PX = 16.615385f;
    public static final float BUBBLE_VIDEO_OVERLAP_PX = 16.615385f;
    public static final float BUBBLE_WIDTH_PX = 723.60004f;
    public static final String CACHE_VERSION = "avatar-story-sticker-v1";
    public static final float DESIGN_WIDTH_DP = 390.0f;
    public static final float LARGE_TAIL_OFFSET_X_PX = 132.92308f;
    public static final float LARGE_TAIL_OFFSET_Y_PX = 66.46154f;
    public static final float LARGE_TAIL_RADIUS_PX = 38.769234f;
    public static final int LOSSLESS_QUALITY = 100;
    public static final float SCALE = 2.7692308f;
    public static final float SMALL_TAIL_OFFSET_X_PX = 66.46154f;
    public static final float SMALL_TAIL_OFFSET_Y_PX = 19.384617f;
    public static final float SMALL_TAIL_RADIUS_PX = 19.384617f;
    public static final float STORY_HEIGHT_PX = 1920.0f;
    public static final float STORY_WIDTH_PX = 1080.0f;
    public static final String TAG = "HatchAvatarStoryImageRenderer";
    public static final int TEXT_FONT_WEIGHT = 500;
    public static final float TEXT_HORIZONTAL_INSET_PX = 55.384617f;
    public static final float TEXT_LINE_HEIGHT_PX = 49.846153f;
    public static final int TEXT_MAX_LINES = 4;
    public static final float TEXT_SIZE_PX = 38.769234f;
    public static final float TEXT_VERTICAL_INSET_PX = 33.23077f;
    public static final float VIDEO_CORNER_RADIUS_PX = 88.61539f;
    public static final int VIDEO_SHADOW_COLOR = 855638016;
    public static final float VIDEO_SHADOW_OFFSET_Y_PX = 11.076923f;
    public static final float VIDEO_SHADOW_RADIUS_PX = 33.23077f;
    public static final float VIDEO_SIZE_PX = 928.8f;
    public static final float VIDEO_WIDTH_RATIO = 0.86f;
    public static final HatchAvatarStoryImageRenderer INSTANCE = new HatchAvatarStoryImageRenderer();
    public static final float CARD_SHADOW_PADDING_PX = (float) Math.ceil(44.30769348144531d);
    public static final float BUBBLE_SHADOW_PADDING_PX = (float) Math.ceil(27.69230842590332d);

    /* loaded from: classes.dex */
    public final class AvatarStoryBubble extends C06G {
        public static final int $stable = 0;
        public final float centerYRatio;
        public final float rotationDegrees;
        public final String uri;
        public final float videoTopOffsetRatio;
        public final float widthRatio;

        public AvatarStoryBubble(String str, float f, float f2, float f3, float f4) {
            C7384Etj.A0Y(str, 0);
            this.uri = str;
            this.widthRatio = f;
            this.centerYRatio = f2;
            this.rotationDegrees = f3;
            this.videoTopOffsetRatio = f4;
        }

        public final AvatarStoryBubble copy(String str, float f, float f2, float f3, float f4) {
            C7384Etj.A0Y(str, 0);
            return new AvatarStoryBubble(str, f, f2, f3, f4);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof AvatarStoryBubble) {
                    AvatarStoryBubble avatarStoryBubble = (AvatarStoryBubble) obj;
                    if (!C7384Etj.areEqual(this.uri, avatarStoryBubble.uri) || Float.compare(this.widthRatio, avatarStoryBubble.widthRatio) != 0 || Float.compare(this.centerYRatio, avatarStoryBubble.centerYRatio) != 0 || Float.compare(this.rotationDegrees, avatarStoryBubble.rotationDegrees) != 0 || Float.compare(this.videoTopOffsetRatio, avatarStoryBubble.videoTopOffsetRatio) != 0) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ AvatarStoryBubble copy$default(AvatarStoryBubble avatarStoryBubble, String str, float f, float f2, float f3, float f4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = avatarStoryBubble.uri;
            }
            if ((i & 2) != 0) {
                f = avatarStoryBubble.widthRatio;
            }
            if ((i & 4) != 0) {
                f2 = avatarStoryBubble.centerYRatio;
            }
            if ((i & 8) != 0) {
                f3 = avatarStoryBubble.rotationDegrees;
            }
            if ((i & 16) != 0) {
                f4 = avatarStoryBubble.videoTopOffsetRatio;
            }
            return avatarStoryBubble.copy(str, f, f2, f3, f4);
        }

        public final String component1() {
            return this.uri;
        }

        public final float component2() {
            return this.widthRatio;
        }

        public final float component3() {
            return this.centerYRatio;
        }

        public final float component4() {
            return this.rotationDegrees;
        }

        public final float component5() {
            return this.videoTopOffsetRatio;
        }

        public final float getCenterYRatio() {
            return this.centerYRatio;
        }

        public final float getRotationDegrees() {
            return this.rotationDegrees;
        }

        public final String getUri() {
            return this.uri;
        }

        public final float getVideoTopOffsetRatio() {
            return this.videoTopOffsetRatio;
        }

        public final float getWidthRatio() {
            return this.widthRatio;
        }

        public int hashCode() {
            return AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass001.A0G(this.uri), this.widthRatio), this.centerYRatio), this.rotationDegrees) + Float.floatToIntBits(this.videoTopOffsetRatio);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class AvatarStoryLayout {
        public final float bubbleCenterY;
        public final float cardCenterY;

        public final float getBubbleCenterY() {
            return this.bubbleCenterY;
        }

        public final float getCardCenterY() {
            return this.cardCenterY;
        }

        public AvatarStoryLayout(float f, float f2) {
            this.cardCenterY = f;
            this.bubbleCenterY = f2;
        }
    }

    /* loaded from: classes.dex */
    public final class AvatarStoryStickers extends C06G {
        public static final int $stable = 0;
        public final float bubbleCenterYRatio;
        public final float bubbleRotationDegrees;
        public final String bubbleUri;
        public final float bubbleWidthRatio;
        public final float cardCenterYRatio;
        public final String cardUri;
        public final float cardWidthRatio;

        public static /* synthetic */ AvatarStoryStickers copy$default(AvatarStoryStickers avatarStoryStickers, String str, float f, float f2, String str2, float f3, float f4, float f5, int i, Object obj) {
            String str3 = str;
            float f6 = f;
            float f7 = f2;
            String str4 = str2;
            float f8 = f3;
            float f9 = f4;
            float f10 = f5;
            if ((i & 1) != 0) {
                str3 = avatarStoryStickers.cardUri;
            }
            if ((i & 2) != 0) {
                f6 = avatarStoryStickers.cardWidthRatio;
            }
            if ((i & 4) != 0) {
                f7 = avatarStoryStickers.cardCenterYRatio;
            }
            if ((i & 8) != 0) {
                str4 = avatarStoryStickers.bubbleUri;
            }
            if ((i & 16) != 0) {
                f8 = avatarStoryStickers.bubbleWidthRatio;
            }
            if ((i & 32) != 0) {
                f9 = avatarStoryStickers.bubbleCenterYRatio;
            }
            if ((i & 64) != 0) {
                f10 = avatarStoryStickers.bubbleRotationDegrees;
            }
            AnonymousClass003.A0w(str3, str4);
            return new AvatarStoryStickers(str3, f6, f7, str4, f8, f9, f10);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof AvatarStoryStickers) {
                    AvatarStoryStickers avatarStoryStickers = (AvatarStoryStickers) obj;
                    if (!C7384Etj.areEqual(this.cardUri, avatarStoryStickers.cardUri) || Float.compare(this.cardWidthRatio, avatarStoryStickers.cardWidthRatio) != 0 || Float.compare(this.cardCenterYRatio, avatarStoryStickers.cardCenterYRatio) != 0 || !C7384Etj.areEqual(this.bubbleUri, avatarStoryStickers.bubbleUri) || Float.compare(this.bubbleWidthRatio, avatarStoryStickers.bubbleWidthRatio) != 0 || Float.compare(this.bubbleCenterYRatio, avatarStoryStickers.bubbleCenterYRatio) != 0 || Float.compare(this.bubbleRotationDegrees, avatarStoryStickers.bubbleRotationDegrees) != 0) {
                    }
                }
                return false;
            }
            return true;
        }

        public final String component1() {
            return this.cardUri;
        }

        public final float component2() {
            return this.cardWidthRatio;
        }

        public final float component3() {
            return this.cardCenterYRatio;
        }

        public final String component4() {
            return this.bubbleUri;
        }

        public final float component5() {
            return this.bubbleWidthRatio;
        }

        public final float component6() {
            return this.bubbleCenterYRatio;
        }

        public final float component7() {
            return this.bubbleRotationDegrees;
        }

        public final float getBubbleCenterYRatio() {
            return this.bubbleCenterYRatio;
        }

        public final float getBubbleRotationDegrees() {
            return this.bubbleRotationDegrees;
        }

        public final String getBubbleUri() {
            return this.bubbleUri;
        }

        public final float getBubbleWidthRatio() {
            return this.bubbleWidthRatio;
        }

        public final float getCardCenterYRatio() {
            return this.cardCenterYRatio;
        }

        public final String getCardUri() {
            return this.cardUri;
        }

        public final float getCardWidthRatio() {
            return this.cardWidthRatio;
        }

        public int hashCode() {
            return AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A0I(this.bubbleUri, AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass001.A0G(this.cardUri), this.cardWidthRatio), this.cardCenterYRatio)), this.bubbleWidthRatio), this.bubbleCenterYRatio) + Float.floatToIntBits(this.bubbleRotationDegrees);
        }

        public AvatarStoryStickers(String str, float f, float f2, String str2, float f3, float f4, float f5) {
            AnonymousClass003.A0w(str, str2);
            this.cardUri = str;
            this.cardWidthRatio = f;
            this.cardCenterYRatio = f2;
            this.bubbleUri = str2;
            this.bubbleWidthRatio = f3;
            this.bubbleCenterYRatio = f4;
            this.bubbleRotationDegrees = f5;
        }

        public final AvatarStoryStickers copy(String str, float f, float f2, String str2, float f3, float f4, float f5) {
            AnonymousClass003.A0w(str, str2);
            return new AvatarStoryStickers(str, f, f2, str2, f3, f4, f5);
        }

        public String toString() {
            return super.toString();
        }
    }

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchAvatarStoryImageRenderer", f = "HatchAvatarStoryImageRenderer.kt", l = {124}, m = "render", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchAvatarStoryImageRenderer$render$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int I$0;
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
            return HatchAvatarStoryImageRenderer.this.render(null, null, null, 0, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchAvatarStoryImageRenderer$render$2", f = "HatchAvatarStoryImageRenderer.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchAvatarStoryImageRenderer$render$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super AvatarStoryStickers>, Object> {
        public final /* synthetic */ Context $applicationContext;
        public final /* synthetic */ Uri $avatarMediaUri;
        public final /* synthetic */ String $bubbleText;
        public final /* synthetic */ int $bubbleTextColor;
        public final /* synthetic */ String $cacheKey;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Context context, Uri uri, String str, int i, String str2, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$applicationContext = context;
            this.$avatarMediaUri = uri;
            this.$bubbleText = str;
            this.$bubbleTextColor = i;
            this.$cacheKey = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$applicationContext, this.$avatarMediaUri, this.$bubbleText, this.$bubbleTextColor, this.$cacheKey, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws Throwable {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            HatchShareMediaCache hatchShareMediaCacheA0k = C8j4.A0k(this.$applicationContext);
            HatchAvatarStoryImageRenderer hatchAvatarStoryImageRenderer = HatchAvatarStoryImageRenderer.INSTANCE;
            Context context = this.$applicationContext;
            C7384Etj.A0X(context);
            Bitmap bitmapLoadAvatarFrame = hatchAvatarStoryImageRenderer.loadAvatarFrame(context, this.$avatarMediaUri);
            if (bitmapLoadAvatarFrame == null) {
                throw new IOException(AnonymousClass007.A0a("No avatar frame for ", this.$avatarMediaUri));
            }
            try {
                Bitmap bitmapRenderCard = hatchAvatarStoryImageRenderer.renderCard(bitmapLoadAvatarFrame);
                bitmapLoadAvatarFrame.recycle();
                Context context2 = this.$applicationContext;
                C7384Etj.A0X(context2);
                bitmapLoadAvatarFrame = hatchAvatarStoryImageRenderer.renderBubble(context2, this.$bubbleText, this.$bubbleTextColor);
                AvatarStoryLayout avatarStoryLayoutLayoutFor = hatchAvatarStoryImageRenderer.layoutFor(bitmapLoadAvatarFrame.getHeight());
                try {
                    Context context3 = this.$applicationContext;
                    C7384Etj.A0X(context3);
                    float f = avatarStoryLayoutLayoutFor.cardCenterY / 1920.0f;
                    Context context4 = this.$applicationContext;
                    C7384Etj.A0X(context4);
                    AvatarStoryStickers avatarStoryStickers = new AvatarStoryStickers(hatchAvatarStoryImageRenderer.store(context3, hatchShareMediaCacheA0k, FGI.A0M(this.$cacheKey, "-card"), bitmapRenderCard), bitmapRenderCard.getWidth() / 1080.0f, f, hatchAvatarStoryImageRenderer.store(context4, hatchShareMediaCacheA0k, FGI.A0M(this.$cacheKey, "-bubble"), bitmapLoadAvatarFrame), bitmapLoadAvatarFrame.getWidth() / 1080.0f, avatarStoryLayoutLayoutFor.bubbleCenterY / 1920.0f, -3.0f);
                    bitmapRenderCard.recycle();
                    bitmapLoadAvatarFrame.recycle();
                    return avatarStoryStickers;
                } catch (Throwable th) {
                    th = th;
                    bitmapRenderCard.recycle();
                    bitmapLoadAvatarFrame.recycle();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super AvatarStoryStickers> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchAvatarStoryImageRenderer", f = "HatchAvatarStoryImageRenderer.kt", l = {83}, m = "renderBubbleForVideoStory", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchAvatarStoryImageRenderer$renderBubbleForVideoStory$1, reason: invalid class name and case insensitive filesystem */
    public final class C136591 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C136591(HtJ<? super C136591> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchAvatarStoryImageRenderer.this.renderBubbleForVideoStory(null, null, 0, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchAvatarStoryImageRenderer$renderBubbleForVideoStory$2", f = "HatchAvatarStoryImageRenderer.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchAvatarStoryImageRenderer$renderBubbleForVideoStory$2, reason: invalid class name and case insensitive filesystem */
    public final class C136602 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super AvatarStoryBubble>, Object> {
        public final /* synthetic */ Context $applicationContext;
        public final /* synthetic */ String $bubbleText;
        public final /* synthetic */ int $bubbleTextColor;
        public final /* synthetic */ String $cacheKey;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C136602(Context context, String str, int i, String str2, HtJ<? super C136602> htJ) {
            super(2, htJ);
            this.$applicationContext = context;
            this.$bubbleText = str;
            this.$bubbleTextColor = i;
            this.$cacheKey = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C136602(this.$applicationContext, this.$bubbleText, this.$bubbleTextColor, this.$cacheKey, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            HatchShareMediaCache hatchShareMediaCacheA0k = C8j4.A0k(this.$applicationContext);
            HatchAvatarStoryImageRenderer hatchAvatarStoryImageRenderer = HatchAvatarStoryImageRenderer.INSTANCE;
            Context context = this.$applicationContext;
            C7384Etj.A0X(context);
            Bitmap bitmapRenderBubble = hatchAvatarStoryImageRenderer.renderBubble(context, this.$bubbleText, this.$bubbleTextColor);
            try {
                float height = bitmapRenderBubble.getHeight() - (HatchAvatarStoryImageRenderer.BUBBLE_SHADOW_PADDING_PX * 2.0f);
                float fVideoStoryTopOffset = hatchAvatarStoryImageRenderer.videoStoryTopOffset(bitmapRenderBubble.getHeight());
                Context context2 = this.$applicationContext;
                C7384Etj.A0X(context2);
                return new AvatarStoryBubble(hatchAvatarStoryImageRenderer.store(context2, hatchShareMediaCacheA0k, this.$cacheKey, bitmapRenderBubble), bitmapRenderBubble.getWidth() / 1080.0f, ((((fVideoStoryTopOffset * 1920.0f) + 1424.4f) - 16.615385f) + (height / 2.0f)) / 1920.0f, -3.0f, fVideoStoryTopOffset);
            } finally {
                bitmapRenderBubble.recycle();
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super AvatarStoryBubble> htJ) {
            return ((C136602) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap loadAvatarFrame(Context context, Uri uri) throws IOException {
        Bitmap bitmapDecodeStream;
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                mediaMetadataRetriever.setDataSource(context, uri);
                bitmapDecodeStream = mediaMetadataRetriever.getFrameAtTime(0L, 2);
                mediaMetadataRetriever.close();
            } finally {
            }
        } catch (Exception e) {
            CFK.A0K(TAG, e, "Avatar media is not a video, falling back to image decoding");
            bitmapDecodeStream = null;
        }
        if (bitmapDecodeStream == null) {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                return null;
            }
            try {
                bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream);
                inputStreamOpenInputStream.close();
            } finally {
            }
        }
        return bitmapDecodeStream;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap renderBubble(Context context, String str, int i) {
        StaticLayout staticLayoutBubbleTextLayout = bubbleTextLayout(str, bubbleTextPaint(context, i));
        float height = staticLayoutBubbleTextLayout.getHeight() + 149.53847f;
        float f = BUBBLE_SHADOW_PADDING_PX;
        float f2 = f * 2.0f;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (723.60004f + f2), (int) (f2 + height), Bitmap.Config.ARGB_8888);
        drawBubble(C8j4.A0R(bitmapCreateBitmap), staticLayoutBubbleTextLayout, f, f, height);
        return bitmapCreateBitmap;
    }

    private final StaticLayout bubbleTextLayout(String str, TextPaint textPaint) {
        StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(str, 0, str.length(), textPaint, 612).setAlignment(Layout.Alignment.ALIGN_NORMAL).setIncludePad(false).setLineSpacing(49.846153f - textPaint.getFontSpacing(), 1.0f).setMaxLines(4).build();
        C7384Etj.A0U(staticLayoutBuild);
        return staticLayoutBuild;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AvatarStoryLayout layoutFor(float f) {
        float f2 = f - (BUBBLE_SHADOW_PADDING_PX * 2.0f);
        float f3 = (1920.0f - ((f2 + 928.8f) - 16.615385f)) / 2.0f;
        return new AvatarStoryLayout(f3 + 464.4f, ((928.8f + f3) - 16.615385f) + (f2 / 2.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap renderCard(Bitmap bitmap) {
        float f = CARD_SHADOW_PADDING_PX;
        int i = (int) ((2.0f * f) + 928.8f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        drawAvatarCard(C8j4.A0R(bitmapCreateBitmap), bitmap, f, f);
        return bitmapCreateBitmap;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object render(android.content.Context r7, android.net.Uri r8, java.lang.String r9, int r10, X.HtJ<? super com.facebook.aura.sharesheet.HatchAvatarStoryImageRenderer.AvatarStoryStickers> r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof com.facebook.aura.sharesheet.HatchAvatarStoryImageRenderer.AnonymousClass1
            if (r0 == 0) goto L1e
            r2 = r11
            com.facebook.aura.sharesheet.HatchAvatarStoryImageRenderer$render$1 r2 = (com.facebook.aura.sharesheet.HatchAvatarStoryImageRenderer.AnonymousClass1) r2
            int r3 = r2.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L1e
            int r3 = r3 - r1
            r2.label = r3
        L12:
            java.lang.Object r0 = r2.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r1 = r2.label
            r3 = 1
            if (r1 == 0) goto L29
            if (r1 != r3) goto L24
            goto L76
        L1e:
            com.facebook.aura.sharesheet.HatchAvatarStoryImageRenderer$render$1 r2 = new com.facebook.aura.sharesheet.HatchAvatarStoryImageRenderer$render$1
            r2.<init>(r11)
            goto L12
        L24:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L29:
            X.Hwg.A00(r0)
            android.content.Context r6 = r7.getApplicationContext()
            com.facebook.aura.sharesheet.HatchShareMediaCache$Companion r5 = com.facebook.aura.sharesheet.HatchShareMediaCache.Companion
            com.facebook.aura.vds.font.api.AuraAppTypeface r0 = com.facebook.aura.vds.font.api.AuraAppTypeface.INSTANCE
            java.lang.String r1 = r0.getCacheKeySuffix()
            java.lang.String r0 = "avatar-story-sticker-v1"
            java.lang.StringBuilder r1 = X.C3cI.A0x(r0, r1)
            java.lang.String r0 = ":"
            r1.append(r0)
            r7 = r8
            r1.append(r8)
            r8 = r9
            X.C60O.A1R(r0, r9, r1)
            r9 = r10
            r1.append(r10)
            java.lang.String r0 = r1.toString()
            java.lang.String r10 = r5.keyFor(r0)
            X.78T r0 = X.AnonymousClass001.A0y()     // Catch: java.lang.Exception -> L7c java.util.concurrent.CancellationException -> L86
            r11 = 0
            com.facebook.aura.sharesheet.HatchAvatarStoryImageRenderer$render$2 r5 = new com.facebook.aura.sharesheet.HatchAvatarStoryImageRenderer$render$2     // Catch: java.lang.Exception -> L7c java.util.concurrent.CancellationException -> L86
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L7c java.util.concurrent.CancellationException -> L86
            r2.L$0 = r11     // Catch: java.lang.Exception -> L7c java.util.concurrent.CancellationException -> L86
            r2.L$1 = r11     // Catch: java.lang.Exception -> L7c java.util.concurrent.CancellationException -> L86
            r2.L$2 = r11     // Catch: java.lang.Exception -> L7c java.util.concurrent.CancellationException -> L86
            r2.L$3 = r11     // Catch: java.lang.Exception -> L7c java.util.concurrent.CancellationException -> L86
            r2.L$4 = r11     // Catch: java.lang.Exception -> L7c java.util.concurrent.CancellationException -> L86
            r2.I$0 = r9     // Catch: java.lang.Exception -> L7c java.util.concurrent.CancellationException -> L86
            r2.label = r3     // Catch: java.lang.Exception -> L7c java.util.concurrent.CancellationException -> L86
            java.lang.Object r0 = X.GAo.A00(r2, r0, r5)     // Catch: java.lang.Exception -> L7c java.util.concurrent.CancellationException -> L86
            if (r0 != r4) goto L79
            return r4
        L76:
            X.Hwg.A00(r0)     // Catch: java.lang.Exception -> L7c java.util.concurrent.CancellationException -> L86
        L79:
            com.facebook.aura.sharesheet.HatchAvatarStoryImageRenderer$AvatarStoryStickers r0 = (com.facebook.aura.sharesheet.HatchAvatarStoryImageRenderer.AvatarStoryStickers) r0     // Catch: java.lang.Exception -> L7c java.util.concurrent.CancellationException -> L86
            return r0
        L7c:
            r2 = move-exception
            java.lang.String r1 = "Failed to render avatar story image"
            java.lang.String r0 = "HatchAvatarStoryImageRenderer"
            X.CFK.A0K(r0, r2, r1)
            r0 = 0
            return r0
        L86:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchAvatarStoryImageRenderer.render(android.content.Context, android.net.Uri, java.lang.String, int, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object renderBubbleForVideoStory(android.content.Context r7, java.lang.String r8, int r9, X.HtJ<? super com.facebook.aura.sharesheet.HatchAvatarStoryImageRenderer.AvatarStoryBubble> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof com.facebook.aura.sharesheet.HatchAvatarStoryImageRenderer.C136591
            if (r0 == 0) goto L1e
            r2 = r10
            com.facebook.aura.sharesheet.HatchAvatarStoryImageRenderer$renderBubbleForVideoStory$1 r2 = (com.facebook.aura.sharesheet.HatchAvatarStoryImageRenderer.C136591) r2
            int r3 = r2.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L1e
            int r3 = r3 - r1
            r2.label = r3
        L12:
            java.lang.Object r0 = r2.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r1 = r2.label
            r3 = 1
            if (r1 == 0) goto L29
            if (r1 != r3) goto L24
            goto L6f
        L1e:
            com.facebook.aura.sharesheet.HatchAvatarStoryImageRenderer$renderBubbleForVideoStory$1 r2 = new com.facebook.aura.sharesheet.HatchAvatarStoryImageRenderer$renderBubbleForVideoStory$1
            r2.<init>(r10)
            goto L12
        L24:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L29:
            X.Hwg.A00(r0)
            android.content.Context r6 = r7.getApplicationContext()
            com.facebook.aura.sharesheet.HatchShareMediaCache$Companion r5 = com.facebook.aura.sharesheet.HatchShareMediaCache.Companion
            com.facebook.aura.vds.font.api.AuraAppTypeface r0 = com.facebook.aura.vds.font.api.AuraAppTypeface.INSTANCE
            java.lang.String r1 = r0.getCacheKeySuffix()
            java.lang.String r0 = "avatar-story-sticker-v1"
            java.lang.StringBuilder r1 = X.C3cI.A0x(r0, r1)
            java.lang.String r0 = ":video-bubble:"
            r1.append(r0)
            r7 = r8
            r1.append(r8)
            java.lang.String r0 = ":"
            r8 = r9
            java.lang.String r0 = X.C60P.A1O(r0, r1, r9)
            java.lang.String r9 = r5.keyFor(r0)
            X.78T r0 = X.AnonymousClass001.A0y()     // Catch: java.lang.Exception -> L75 java.util.concurrent.CancellationException -> L7f
            r10 = 0
            com.facebook.aura.sharesheet.HatchAvatarStoryImageRenderer$renderBubbleForVideoStory$2 r5 = new com.facebook.aura.sharesheet.HatchAvatarStoryImageRenderer$renderBubbleForVideoStory$2     // Catch: java.lang.Exception -> L75 java.util.concurrent.CancellationException -> L7f
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L75 java.util.concurrent.CancellationException -> L7f
            r2.L$0 = r10     // Catch: java.lang.Exception -> L75 java.util.concurrent.CancellationException -> L7f
            r2.L$1 = r10     // Catch: java.lang.Exception -> L75 java.util.concurrent.CancellationException -> L7f
            r2.L$2 = r10     // Catch: java.lang.Exception -> L75 java.util.concurrent.CancellationException -> L7f
            r2.L$3 = r10     // Catch: java.lang.Exception -> L75 java.util.concurrent.CancellationException -> L7f
            r2.I$0 = r8     // Catch: java.lang.Exception -> L75 java.util.concurrent.CancellationException -> L7f
            r2.label = r3     // Catch: java.lang.Exception -> L75 java.util.concurrent.CancellationException -> L7f
            java.lang.Object r0 = X.GAo.A00(r2, r0, r5)     // Catch: java.lang.Exception -> L75 java.util.concurrent.CancellationException -> L7f
            if (r0 != r4) goto L72
            return r4
        L6f:
            X.Hwg.A00(r0)     // Catch: java.lang.Exception -> L75 java.util.concurrent.CancellationException -> L7f
        L72:
            com.facebook.aura.sharesheet.HatchAvatarStoryImageRenderer$AvatarStoryBubble r0 = (com.facebook.aura.sharesheet.HatchAvatarStoryImageRenderer.AvatarStoryBubble) r0     // Catch: java.lang.Exception -> L75 java.util.concurrent.CancellationException -> L7f
            return r0
        L75:
            r2 = move-exception
            java.lang.String r1 = "Failed to render avatar story bubble"
            java.lang.String r0 = "HatchAvatarStoryImageRenderer"
            X.CFK.A0K(r0, r2, r1)
            r0 = 0
            return r0
        L7f:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchAvatarStoryImageRenderer.renderBubbleForVideoStory(android.content.Context, java.lang.String, int, X.HtJ):java.lang.Object");
    }

    public final float videoStoryTopOffset(float f) {
        return ((-((f - (BUBBLE_SHADOW_PADDING_PX * 2.0f)) - 16.615385f)) / 2.0f) / 1920.0f;
    }

    private final TextPaint bubbleTextPaint(Context context, int i) {
        Typeface typefaceA0J = C8j5.A0J(context);
        TextPaint textPaint = new TextPaint(1);
        textPaint.setColor(i);
        textPaint.setTextSize(38.769234f);
        textPaint.setTypeface(Typeface.create(typefaceA0J, 500, false));
        return textPaint;
    }

    private final void drawAvatarCard(Canvas canvas, Bitmap bitmap, float f, float f2) {
        RectF rectF = new RectF(f, f2, f + 928.8f, f2 + 928.8f);
        Paint paint = new Paint(1);
        paint.setColor(-1);
        paint.setShadowLayer(33.23077f, 0.0f, 11.076923f, VIDEO_SHADOW_COLOR);
        canvas.drawRoundRect(rectF, 88.61539f, 88.61539f, paint);
        float fMax = Math.max(928.8f / bitmap.getWidth(), 928.8f / bitmap.getHeight());
        Matrix matrix = new Matrix();
        matrix.setScale(fMax, fMax);
        matrix.postTranslate(rectF.centerX() - ((bitmap.getWidth() * fMax) / 2.0f), rectF.centerY() - ((bitmap.getHeight() * fMax) / 2.0f));
        Paint paint2 = new Paint(3);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(matrix);
        paint2.setShader(bitmapShader);
        canvas.drawRoundRect(rectF, 88.61539f, 88.61539f, paint2);
    }

    private final void drawBubble(Canvas canvas, StaticLayout staticLayout, float f, float f2, float f3) {
        float f4 = 361.80002f + f;
        RectF rectF = new RectF(f, 83.07693f + f2, 723.60004f + f, f3 + f2);
        Path path = new Path();
        Path.Direction direction = Path.Direction.CW;
        path.addCircle(f4 + 66.46154f, f2 + 19.384617f, 19.384617f, direction);
        path.addCircle(f4 + 132.92308f, f2 + 66.46154f, 38.769234f, direction);
        path.addRoundRect(rectF, 60.92308f, 60.92308f, direction);
        Paint paint = new Paint(1);
        paint.setColor(-1);
        paint.setShadowLayer(16.615385f, 0.0f, 5.5384617f, BUBBLE_SHADOW_COLOR);
        canvas.save();
        canvas.drawPath(path, paint);
        C8j4.A1G(canvas, staticLayout, rectF.left + 55.384617f, rectF.top + 33.23077f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String store(Context context, HatchShareMediaCache hatchShareMediaCache, String str, Bitmap bitmap) throws Exception {
        File fileFind = hatchShareMediaCache.find(str);
        if (fileFind == null) {
            fileFind = hatchShareMediaCache.storeNamed(FGI.A0M(str, ".png"), new HatchAvatarStoryImageRenderer$store$file$1(bitmap));
        }
        return C60O.A0o(HatchFileProviderUtil.INSTANCE.getUriForFile(context, fileFind));
    }
}
