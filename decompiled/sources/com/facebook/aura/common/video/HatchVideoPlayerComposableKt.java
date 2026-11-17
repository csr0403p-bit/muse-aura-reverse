package com.facebook.aura.common.video;

import X.AKO;
import X.ATD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass011;
import X.BBI;
import X.BFM;
import X.BNt;
import X.BRg;
import X.C1BO;
import X.C7197Ei9;
import X.C7384Etj;
import X.C78N;
import X.EnumC2374BWi;
import X.G0U;
import X.G0V;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.aura.common.video.HatchVideoPlayer;
import com.facebook.aura.vds.compose.common.AuraDrawableSource;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class HatchVideoPlayerComposableKt {
    public static final long ICON_DELAY = 3000;

    /* renamed from: com.facebook.aura.common.video.HatchVideoPlayerComposableKt$HatchVideoPlayerComposable$23, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass23 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$changed2;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $allowPlayPause;
        public final /* synthetic */ boolean $enableAudio;
        public final /* synthetic */ float $initialAspectRatio;
        public final /* synthetic */ boolean $keepFrameOnPause;
        public final /* synthetic */ Integer $mediaGeneration;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<Function0<Bitmap>, Unit> $onFrameCaptureAvailable;
        public final /* synthetic */ G0U<Exception, Unit> $onMediaError;
        public final /* synthetic */ Function0<Unit> $onMediaRendered;
        public final /* synthetic */ G0U<Boolean, Unit> $onPlayerResourcesActiveChanged;
        public final /* synthetic */ G0U<View, Unit> $onSamplingViewChanged;
        public final /* synthetic */ G0V<Integer, Integer, Unit> $onVideoSizeChanged;
        public final /* synthetic */ AuraDrawableSource $placeholderImage;
        public final /* synthetic */ boolean $placeholderImageApplyAspectRatio;
        public final /* synthetic */ C7197Ei9 $placeholderImageOptions;
        public final /* synthetic */ boolean $playWhenReady;
        public final /* synthetic */ boolean $requireTextureUpdateForMediaRendered;
        public final /* synthetic */ HatchVideoPlayer.ResizeMode $resizeMode;
        public final /* synthetic */ boolean $rewindOnPause;
        public final /* synthetic */ boolean $showErrorAndLoading;
        public final /* synthetic */ boolean $showIconOnPause;
        public final /* synthetic */ String $surfaceTag;
        public final /* synthetic */ Uri $uri;
        public final /* synthetic */ Function0<Float> $videoBottomAlignmentFraction;
        public final /* synthetic */ String $videoId;
        public final /* synthetic */ boolean $videoOnly;
        public final /* synthetic */ HatchVideoPlayer $videoPlayer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass23(BRg bRg, Uri uri, HatchVideoPlayer hatchVideoPlayer, String str, AuraDrawableSource auraDrawableSource, C7197Ei9 c7197Ei9, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, HatchVideoPlayer.ResizeMode resizeMode, float f, String str2, Function0<Float> function0, boolean z7, boolean z8, boolean z9, Integer num, boolean z10, G0U<? super Boolean, Unit> g0u, G0V<? super Integer, ? super Integer, Unit> g0v, G0U<? super Exception, Unit> g0u2, Function0<Unit> function02, G0U<? super Function0<Bitmap>, Unit> g0u3, G0U<? super View, Unit> g0u4, int i, int i2, int i3, int i4) {
            super(2);
            this.$modifier = bRg;
            this.$uri = uri;
            this.$videoPlayer = hatchVideoPlayer;
            this.$videoId = str;
            this.$placeholderImage = auraDrawableSource;
            this.$placeholderImageOptions = c7197Ei9;
            this.$placeholderImageApplyAspectRatio = z;
            this.$playWhenReady = z2;
            this.$enableAudio = z3;
            this.$showIconOnPause = z4;
            this.$allowPlayPause = z5;
            this.$rewindOnPause = z6;
            this.$resizeMode = resizeMode;
            this.$initialAspectRatio = f;
            this.$surfaceTag = str2;
            this.$videoBottomAlignmentFraction = function0;
            this.$showErrorAndLoading = z7;
            this.$keepFrameOnPause = z8;
            this.$videoOnly = z9;
            this.$mediaGeneration = num;
            this.$requireTextureUpdateForMediaRendered = z10;
            this.$onPlayerResourcesActiveChanged = g0u;
            this.$onVideoSizeChanged = g0v;
            this.$onMediaError = g0u2;
            this.$onMediaRendered = function02;
            this.$onFrameCaptureAvailable = g0u3;
            this.$onSamplingViewChanged = g0u4;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$changed2 = i3;
            this.$$default = i4;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchVideoPlayerComposableKt.HatchVideoPlayerComposable(this.$modifier, this.$uri, this.$videoPlayer, this.$videoId, this.$placeholderImage, this.$placeholderImageOptions, this.$placeholderImageApplyAspectRatio, this.$playWhenReady, this.$enableAudio, this.$showIconOnPause, this.$allowPlayPause, this.$rewindOnPause, this.$resizeMode, this.$initialAspectRatio, this.$surfaceTag, this.$videoBottomAlignmentFraction, this.$showErrorAndLoading, this.$keepFrameOnPause, this.$videoOnly, this.$mediaGeneration, this.$requireTextureUpdateForMediaRendered, this.$onPlayerResourcesActiveChanged, this.$onVideoSizeChanged, this.$onMediaError, this.$onMediaRendered, this.$onFrameCaptureAvailable, this.$onSamplingViewChanged, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), AnonymousClass011.A01(this.$$changed2), this.$$default);
        }
    }

    /* loaded from: classes3.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HatchVideoPlayer.ResizeMode.values().length];
            try {
                AnonymousClass002.A13(HatchVideoPlayer.ResizeMode.ZOOM, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HatchVideoPlayer.ResizeMode.FILL, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(HatchVideoPlayer.ResizeMode.FIT, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(HatchVideoPlayer.ResizeMode.FIXED_WIDTH, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(HatchVideoPlayer.ResizeMode.FIXED_HEIGHT, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Bitmap captureVideoBitmap(View view) {
        if (view instanceof TextureView) {
            TextureView textureView = (TextureView) view;
            if (textureView.isAvailable()) {
                return textureView.getBitmap();
            }
            return null;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        Iterator<Integer> it = ATD.A0C(0, viewGroup.getChildCount()).iterator();
        while (it.hasNext()) {
            View childAt = viewGroup.getChildAt(((BNt) it).A00());
            C7384Etj.A0U(childAt);
            Bitmap bitmapCaptureVideoBitmap = captureVideoBitmap(childAt);
            if (bitmapCaptureVideoBitmap != null) {
                return bitmapCaptureVideoBitmap;
            }
        }
        return null;
    }

    public static final void prepareVideo(HatchVideoPlayer hatchVideoPlayer, Uri uri, String str, AspectRatioFrameLayout aspectRatioFrameLayout, String str2, boolean z) {
        hatchVideoPlayer.prepareCached(uri, str, null, aspectRatioFrameLayout, str2, z ? EnumC2374BWi.VIDEO_ONLY : EnumC2374BWi.AUDIO_VIDEO, -1L, -1L, null, null);
    }

    public static final AspectRatioFrameLayout rememberAspectRatioFrameLayout(BFM bfm, int i) {
        BBI bbi = (BBI) bfm;
        Context contextA00 = AKO.A00(AndroidCompositionLocals_androidKt.A01, bbi);
        Object objAaT = bfm.AaT();
        if (objAaT == C78N.A00) {
            objAaT = new AspectRatioFrameLayout(contextA00, null);
            BBI.A0O(bbi, objAaT);
        }
        return (AspectRatioFrameLayout) objAaT;
    }

    public static final void HatchVideoPlayerComposable$lambda$24(MutableState<Float> mutableState, float f) {
        mutableState.Af8(Float.valueOf(f));
    }

    public static final G0V<Integer, Integer, Unit> HatchVideoPlayerComposable$lambda$7(C1BO<? extends G0V<? super Integer, ? super Integer, Unit>> c1bo) {
        return (G0V) c1bo.getValue();
    }

    public static final /* synthetic */ HatchVideoPlayer access$HatchVideoPlayerComposable$lambda$26(MutableState mutableState) {
        return (HatchVideoPlayer) mutableState.getValue();
    }

    public static final /* synthetic */ Integer access$HatchVideoPlayerComposable$lambda$32(MutableState mutableState) {
        return (Integer) mutableState.getValue();
    }

    public static final /* synthetic */ G0V access$HatchVideoPlayerComposable$lambda$7(C1BO c1bo) {
        return (G0V) c1bo.getValue();
    }

    public static final void fetchVideo(HatchVideoPlayer hatchVideoPlayer, Uri uri, String str, AspectRatioFrameLayout aspectRatioFrameLayout, String str2, boolean z) {
        HatchVideoPlayer.PlayerState playbackState = hatchVideoPlayer.getPlaybackState();
        if (playbackState == HatchVideoPlayer.PlayerState.BUFFERING || playbackState == HatchVideoPlayer.PlayerState.READY || uri == null) {
            return;
        }
        prepareVideo(hatchVideoPlayer, uri, str, aspectRatioFrameLayout, str2, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0188 A[PHI: r15
  0x0188: PHI (r15v1 int) = (r15v0 int), (r15v9 int) binds: [B:96:0x017c, B:99:0x0182] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0197 A[PHI: r14
  0x0197: PHI (r14v1 int) = (r14v0 int), (r14v11 int) binds: [B:102:0x018b, B:105:0x0191] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00be A[PHI: r2 r11
  0x00be: PHI (r2v29 int) = (r2v28 int), (r2v159 int) binds: [B:32:0x00b1, B:35:0x00b7] A[DONT_GENERATE, DONT_INLINE]
  0x00be: PHI (r11v1 int) = (r11v0 int), (r11v70 int) binds: [B:32:0x00b1, B:35:0x00b7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x08d3  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x08e2  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x08f1  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x08fe  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0910  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x091d  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x092c  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x093d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x094b  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x095e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x0ba1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x0c1a  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x0c23  */
    /* JADX WARN: Removed duplicated region for block: B:550:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011a A[PHI: r2
  0x011a: PHI (r2v53 int) = (r2v52 int), (r2v150 int) binds: [B:61:0x010e, B:64:0x0114] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012d A[PHI: r2
  0x012d: PHI (r2v56 int) = (r2v55 int), (r2v147 int) binds: [B:67:0x0121, B:70:0x0127] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0140 A[PHI: r2
  0x0140: PHI (r2v59 int) = (r2v58 int), (r2v144 int) binds: [B:73:0x0134, B:76:0x013a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchVideoPlayerComposable(X.BRg r77, android.net.Uri r78, final com.facebook.aura.common.video.HatchVideoPlayer r79, java.lang.String r80, com.facebook.aura.vds.compose.common.AuraDrawableSource r81, X.C7197Ei9 r82, boolean r83, boolean r84, boolean r85, boolean r86, boolean r87, boolean r88, com.facebook.aura.common.video.HatchVideoPlayer.ResizeMode r89, float r90, java.lang.String r91, kotlin.jvm.functions.Function0<java.lang.Float> r92, boolean r93, boolean r94, boolean r95, java.lang.Integer r96, boolean r97, X.G0U<? super java.lang.Boolean, kotlin.Unit> r98, X.G0V<? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> r99, X.G0U<? super java.lang.Exception, kotlin.Unit> r100, kotlin.jvm.functions.Function0<kotlin.Unit> r101, X.G0U<? super kotlin.jvm.functions.Function0<android.graphics.Bitmap>, kotlin.Unit> r102, X.G0U<? super android.view.View, kotlin.Unit> r103, X.BFM r104, int r105, int r106, int r107, int r108) {
        /*
            Method dump skipped, instructions count: 3177
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.common.video.HatchVideoPlayerComposableKt.HatchVideoPlayerComposable(X.BRg, android.net.Uri, com.facebook.aura.common.video.HatchVideoPlayer, java.lang.String, com.facebook.aura.vds.compose.common.AuraDrawableSource, X.Ei9, boolean, boolean, boolean, boolean, boolean, boolean, com.facebook.aura.common.video.HatchVideoPlayer$ResizeMode, float, java.lang.String, kotlin.jvm.functions.Function0, boolean, boolean, boolean, java.lang.Integer, boolean, X.G0U, X.G0V, X.G0U, kotlin.jvm.functions.Function0, X.G0U, X.G0U, X.BFM, int, int, int, int):void");
    }
}
