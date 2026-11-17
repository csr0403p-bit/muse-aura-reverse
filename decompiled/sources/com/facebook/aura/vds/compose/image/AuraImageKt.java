package com.facebook.aura.vds.compose.image;

import X.ARL;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.B15;
import X.B18;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BL4;
import X.BRg;
import X.C05253Tt;
import X.C0Ig;
import X.C10G;
import X.C1423Ais;
import X.C1DG;
import X.C3cG;
import X.C60O;
import X.C7195Ei7;
import X.C7196Ei8;
import X.C7197Ei9;
import X.C7384Etj;
import X.C7449EwP;
import X.C7481Exe;
import X.C78N;
import X.C78e;
import X.C7BY;
import X.C8j3;
import X.Ej6;
import X.Ejq;
import X.F13;
import X.G0U;
import X.G0V;
import X.G0W;
import X.HxE;
import X.HxS;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.Constraints;
import com.facebook.aura.network.fresco.AuraImageNetworkFetcher;
import com.facebook.aura.network.fresco.AuraImageNetworkFetcherKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.common.AuraDrawableSource;
import com.facebook.common.callercontext.ContextChain;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class AuraImageKt {
    public static final int DECODE_BUCKET_PX = 64;
    public static final int DEFAULT_MAX_AUTO_RETRIES = 6;
    public static final int MAX_DECODE_DIMEN_PX = 2048;
    public static final G0U<Throwable, Boolean> RETRY_UNLESS_404 = AuraImageKt$RETRY_UNLESS_404$1.INSTANCE;
    public static final long[] THUMBNAIL_RETRY_DELAYS_MS = {2000, 5000, 10000};

    /* renamed from: com.facebook.aura.vds.compose.image.AuraImageKt$AuraImage$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $applyAspectRatio;
        public final /* synthetic */ String $contentDescription;
        public final /* synthetic */ ContextChain $contextChain;
        public final /* synthetic */ Ej6 $imageListener;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ C7197Ei9 $options;
        public final /* synthetic */ boolean $showRetryView;
        public final /* synthetic */ boolean $showShimmeringState;
        public final /* synthetic */ AuraDrawableSource $source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AuraDrawableSource auraDrawableSource, BRg bRg, String str, C7197Ei9 c7197Ei9, boolean z, boolean z2, ContextChain contextChain, boolean z3, Ej6 ej6, int i, int i2) {
            super(2);
            this.$source = auraDrawableSource;
            this.$modifier = bRg;
            this.$contentDescription = str;
            this.$options = c7197Ei9;
            this.$showRetryView = z;
            this.$showShimmeringState = z2;
            this.$contextChain = contextChain;
            this.$applyAspectRatio = z3;
            this.$imageListener = ej6;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraImageKt.AuraImage(this.$source, this.$modifier, this.$contentDescription, this.$options, this.$showRetryView, this.$showShimmeringState, this.$contextChain, this.$applyAspectRatio, this.$imageListener, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.image.AuraImageKt$AuraImage$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $applyAspectRatio;
        public final /* synthetic */ boolean $autoRetry;
        public final /* synthetic */ String $contentDescription;
        public final /* synthetic */ ARL $contentScale;
        public final /* synthetic */ ContextChain $contextChain;
        public final /* synthetic */ C1DG $decodeAtSize;
        public final /* synthetic */ boolean $enableInPlaceImageUpdate;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $errorContent;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<Bitmap, Unit> $onBitmapDecoded;
        public final /* synthetic */ G0V<Integer, Integer, Unit> $onImageSizeDecoded;
        public final /* synthetic */ Function0<Unit> $onLoadFailed;
        public final /* synthetic */ boolean $showShimmeringState;
        public final /* synthetic */ long $tint;
        public final /* synthetic */ String $uri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(String str, BRg bRg, ARL arl, String str2, ContextChain contextChain, boolean z, C1DG c1dg, long j, boolean z2, boolean z3, boolean z4, G0V<? super BFM, ? super Integer, Unit> g0v, G0U<? super Bitmap, Unit> g0u, Function0<Unit> function0, G0V<? super Integer, ? super Integer, Unit> g0v2, int i, int i2, int i3) {
            super(2);
            this.$uri = str;
            this.$modifier = bRg;
            this.$contentScale = arl;
            this.$contentDescription = str2;
            this.$contextChain = contextChain;
            this.$applyAspectRatio = z;
            this.$decodeAtSize = c1dg;
            this.$tint = j;
            this.$autoRetry = z2;
            this.$showShimmeringState = z3;
            this.$enableInPlaceImageUpdate = z4;
            this.$errorContent = g0v;
            this.$onBitmapDecoded = g0u;
            this.$onLoadFailed = function0;
            this.$onImageSizeDecoded = g0v2;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$default = i3;
        }

        public final void invoke(BFM bfm, int i) {
            AuraImageKt.m2573AuraImageXRP3Ue8(this.$uri, this.$modifier, this.$contentScale, this.$contentDescription, this.$contextChain, this.$applyAspectRatio, this.$decodeAtSize, this.$tint, this.$autoRetry, this.$showShimmeringState, this.$enableInPlaceImageUpdate, this.$errorContent, this.$onBitmapDecoded, this.$onLoadFailed, this.$onImageSizeDecoded, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.image.AuraImageKt$AuraImage$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $applyAspectRatio;
        public final /* synthetic */ boolean $autoRetry;
        public final /* synthetic */ String $contentDescription;
        public final /* synthetic */ ContextChain $contextChain;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $errorContent;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<Float, Unit> $onAspectRatioLoaded;
        public final /* synthetic */ Function0<Unit> $onError;
        public final /* synthetic */ C7197Ei9 $options;
        public final /* synthetic */ String $uri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(String str, BRg bRg, C7197Ei9 c7197Ei9, String str2, ContextChain contextChain, boolean z, G0V<? super BFM, ? super Integer, Unit> g0v, Function0<Unit> function0, boolean z2, G0U<? super Float, Unit> g0u, int i, int i2) {
            super(2);
            this.$uri = str;
            this.$modifier = bRg;
            this.$options = c7197Ei9;
            this.$contentDescription = str2;
            this.$contextChain = contextChain;
            this.$applyAspectRatio = z;
            this.$errorContent = g0v;
            this.$onError = function0;
            this.$autoRetry = z2;
            this.$onAspectRatioLoaded = g0u;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            AuraImageKt.AuraImage(this.$uri, this.$modifier, this.$options, this.$contentDescription, this.$contextChain, this.$applyAspectRatio, this.$errorContent, this.$onError, this.$autoRetry, this.$onAspectRatioLoaded, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.image.AuraImageKt$AuraImage$6, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $applyAspectRatio;
        public final /* synthetic */ String $contentDescription;
        public final /* synthetic */ ARL $contentScale;
        public final /* synthetic */ Drawable $drawable;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(Drawable drawable, BRg bRg, ARL arl, String str, boolean z, int i, int i2) {
            super(2);
            this.$drawable = drawable;
            this.$modifier = bRg;
            this.$contentScale = arl;
            this.$contentDescription = str;
            this.$applyAspectRatio = z;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraImageKt.AuraImage(this.$drawable, this.$modifier, this.$contentScale, this.$contentDescription, this.$applyAspectRatio, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.image.AuraImageKt$AuraImage$7, reason: invalid class name */
    public final class AnonymousClass7 extends AbstractC7559F3s implements G0W<C0Ig, BFM, Integer, Unit> {
        public final /* synthetic */ Alignment $alignment;
        public final /* synthetic */ boolean $applyAspectRatio;
        public final /* synthetic */ boolean $autoRetry;
        public final /* synthetic */ C1423Ais $colorFilter;
        public final /* synthetic */ String $contentDescription;
        public final /* synthetic */ ARL $contentScale;
        public final /* synthetic */ ContextChain $contextChain;
        public final /* synthetic */ boolean $enableInPlaceImageUpdate;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $errorContent;
        public final /* synthetic */ Ej6 $imageListener;
        public final /* synthetic */ G0U<Float, Unit> $onAspectRatioLoaded;
        public final /* synthetic */ C7197Ei9 $options;
        public final /* synthetic */ boolean $showRetryView;
        public final /* synthetic */ boolean $showShimmeringState;
        public final /* synthetic */ Ejq $source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass7(Ejq ejq, C7197Ei9 c7197Ei9, String str, boolean z, ContextChain contextChain, Ej6 ej6, boolean z2, boolean z3, boolean z4, ARL arl, C1423Ais c1423Ais, Alignment alignment, G0V<? super BFM, ? super Integer, Unit> g0v, boolean z5, G0U<? super Float, Unit> g0u) {
            super(3);
            this.$source = ejq;
            this.$options = c7197Ei9;
            this.$contentDescription = str;
            this.$showRetryView = z;
            this.$contextChain = contextChain;
            this.$imageListener = ej6;
            this.$applyAspectRatio = z2;
            this.$showShimmeringState = z3;
            this.$enableInPlaceImageUpdate = z4;
            this.$contentScale = arl;
            this.$colorFilter = c1423Ais;
            this.$alignment = alignment;
            this.$errorContent = g0v;
            this.$autoRetry = z5;
            this.$onAspectRatioLoaded = g0u;
        }

        public final void invoke(C0Ig c0Ig, BFM bfm, int i) {
            C7481Exe c7481ExeM2577decodeResizeForozmzZPI;
            int iA0d = i;
            C7384Etj.A0Y(c0Ig, 0);
            if ((i & 6) == 0) {
                iA0d = i | AnonymousClass004.A0d(bfm, c0Ig);
            }
            boolean z = false;
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
                bfm.Afo();
                return;
            }
            long j = ((C05253Tt) c0Ig).A00;
            if (Constraints.A0A(j) && Constraints.A09(j)) {
                z = true;
            }
            Ejq ejq = this.$source;
            int iA01 = Constraints.A01(j);
            int iA00 = Constraints.A00(j);
            boolean zA1W = AnonymousClass002.A1W(bfm, this.$options, AnonymousClass001.A1a(AnonymousClass003.A1T(bfm, ejq, z), bfm, iA01), bfm.A63(iA00));
            C7197Ei9 c7197Ei9 = this.$options;
            Object objAaT = bfm.AaT();
            if (zA1W || objAaT == C78N.A00) {
                if (z && (c7481ExeM2577decodeResizeForozmzZPI = AuraImageKt.m2577decodeResizeForozmzZPI(AnonymousClass007.A0C(iA01, iA00))) != null) {
                    C7196Ei8 c7196Ei8 = new C7196Ei8(c7197Ei9);
                    ((C7195Ei7) c7196Ei8).A06 = c7481ExeM2577decodeResizeForozmzZPI;
                    c7197Ei9 = new C7197Ei9(c7196Ei8);
                }
                bfm.Ai0(c7197Ei9);
                objAaT = c7197Ei9;
            }
            C7197Ei9 c7197Ei92 = (C7197Ei9) objAaT;
            BRg bRg = BRg.A00;
            if (z) {
                bRg = C10G.A01;
            }
            AuraImageKt.AuraImageContent(bRg, this.$source, this.$contentDescription, c7197Ei92, this.$showRetryView, this.$contextChain, this.$imageListener, this.$applyAspectRatio, this.$showShimmeringState, this.$enableInPlaceImageUpdate, this.$contentScale, this.$colorFilter, this.$alignment, this.$errorContent, this.$autoRetry, this.$onAspectRatioLoaded, bfm, 0, 0, 0);
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C0Ig c0Ig, BFM bfm, Integer num) {
            invoke(c0Ig, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.image.AuraImageKt$AuraImage$8, reason: invalid class name */
    public final class AnonymousClass8 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Alignment $alignment;
        public final /* synthetic */ boolean $applyAspectRatio;
        public final /* synthetic */ boolean $autoRetry;
        public final /* synthetic */ C1423Ais $colorFilter;
        public final /* synthetic */ String $contentDescription;
        public final /* synthetic */ ARL $contentScale;
        public final /* synthetic */ ContextChain $contextChain;
        public final /* synthetic */ boolean $enableInPlaceImageUpdate;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $errorContent;
        public final /* synthetic */ Ej6 $imageListener;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<Float, Unit> $onAspectRatioLoaded;
        public final /* synthetic */ C7197Ei9 $options;
        public final /* synthetic */ boolean $showRetryView;
        public final /* synthetic */ boolean $showShimmeringState;
        public final /* synthetic */ Ejq $source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass8(BRg bRg, Ejq ejq, String str, C7197Ei9 c7197Ei9, boolean z, ContextChain contextChain, Ej6 ej6, boolean z2, boolean z3, boolean z4, ARL arl, C1423Ais c1423Ais, Alignment alignment, G0V<? super BFM, ? super Integer, Unit> g0v, boolean z5, G0U<? super Float, Unit> g0u, int i, int i2, int i3) {
            super(2);
            this.$modifier = bRg;
            this.$source = ejq;
            this.$contentDescription = str;
            this.$options = c7197Ei9;
            this.$showRetryView = z;
            this.$contextChain = contextChain;
            this.$imageListener = ej6;
            this.$applyAspectRatio = z2;
            this.$showShimmeringState = z3;
            this.$enableInPlaceImageUpdate = z4;
            this.$contentScale = arl;
            this.$colorFilter = c1423Ais;
            this.$alignment = alignment;
            this.$errorContent = g0v;
            this.$autoRetry = z5;
            this.$onAspectRatioLoaded = g0u;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$default = i3;
        }

        public final void invoke(BFM bfm, int i) {
            AuraImageKt.AuraImage(this.$modifier, this.$source, this.$contentDescription, this.$options, this.$showRetryView, this.$contextChain, this.$imageListener, this.$applyAspectRatio, this.$showShimmeringState, this.$enableInPlaceImageUpdate, this.$contentScale, this.$colorFilter, this.$alignment, this.$errorContent, this.$autoRetry, this.$onAspectRatioLoaded, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.image.AuraImageKt$AuraImage$9, reason: invalid class name */
    public final class AnonymousClass9 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Alignment $alignment;
        public final /* synthetic */ boolean $applyAspectRatio;
        public final /* synthetic */ boolean $autoRetry;
        public final /* synthetic */ C1423Ais $colorFilter;
        public final /* synthetic */ String $contentDescription;
        public final /* synthetic */ ARL $contentScale;
        public final /* synthetic */ ContextChain $contextChain;
        public final /* synthetic */ boolean $enableInPlaceImageUpdate;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $errorContent;
        public final /* synthetic */ Ej6 $imageListener;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<Float, Unit> $onAspectRatioLoaded;
        public final /* synthetic */ C7197Ei9 $options;
        public final /* synthetic */ boolean $showRetryView;
        public final /* synthetic */ boolean $showShimmeringState;
        public final /* synthetic */ Ejq $source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass9(BRg bRg, Ejq ejq, String str, C7197Ei9 c7197Ei9, boolean z, ContextChain contextChain, Ej6 ej6, boolean z2, boolean z3, boolean z4, ARL arl, C1423Ais c1423Ais, Alignment alignment, G0V<? super BFM, ? super Integer, Unit> g0v, boolean z5, G0U<? super Float, Unit> g0u, int i, int i2, int i3) {
            super(2);
            this.$modifier = bRg;
            this.$source = ejq;
            this.$contentDescription = str;
            this.$options = c7197Ei9;
            this.$showRetryView = z;
            this.$contextChain = contextChain;
            this.$imageListener = ej6;
            this.$applyAspectRatio = z2;
            this.$showShimmeringState = z3;
            this.$enableInPlaceImageUpdate = z4;
            this.$contentScale = arl;
            this.$colorFilter = c1423Ais;
            this.$alignment = alignment;
            this.$errorContent = g0v;
            this.$autoRetry = z5;
            this.$onAspectRatioLoaded = g0u;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$default = i3;
        }

        public final void invoke(BFM bfm, int i) {
            AuraImageKt.AuraImage(this.$modifier, this.$source, this.$contentDescription, this.$options, this.$showRetryView, this.$contextChain, this.$imageListener, this.$applyAspectRatio, this.$showShimmeringState, this.$enableInPlaceImageUpdate, this.$contentScale, this.$colorFilter, this.$alignment, this.$errorContent, this.$autoRetry, this.$onAspectRatioLoaded, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.image.AuraImageKt$AuraImageContent$1, reason: invalid class name and case insensitive filesystem */
    public final class C142851 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Alignment $alignment;
        public final /* synthetic */ boolean $applyAspectRatio;
        public final /* synthetic */ boolean $autoRetry;
        public final /* synthetic */ C1423Ais $colorFilter;
        public final /* synthetic */ String $contentDescription;
        public final /* synthetic */ ARL $contentScale;
        public final /* synthetic */ ContextChain $contextChain;
        public final /* synthetic */ boolean $enableInPlaceImageUpdate;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $errorContent;
        public final /* synthetic */ Ej6 $imageListener;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<Float, Unit> $onAspectRatioLoaded;
        public final /* synthetic */ C7197Ei9 $options;
        public final /* synthetic */ boolean $showRetryView;
        public final /* synthetic */ boolean $showShimmeringState;
        public final /* synthetic */ Ejq $source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C142851(BRg bRg, Ejq ejq, String str, C7197Ei9 c7197Ei9, boolean z, ContextChain contextChain, Ej6 ej6, boolean z2, boolean z3, boolean z4, ARL arl, C1423Ais c1423Ais, Alignment alignment, G0V<? super BFM, ? super Integer, Unit> g0v, boolean z5, G0U<? super Float, Unit> g0u, int i, int i2, int i3) {
            super(2);
            this.$modifier = bRg;
            this.$source = ejq;
            this.$contentDescription = str;
            this.$options = c7197Ei9;
            this.$showRetryView = z;
            this.$contextChain = contextChain;
            this.$imageListener = ej6;
            this.$applyAspectRatio = z2;
            this.$showShimmeringState = z3;
            this.$enableInPlaceImageUpdate = z4;
            this.$contentScale = arl;
            this.$colorFilter = c1423Ais;
            this.$alignment = alignment;
            this.$errorContent = g0v;
            this.$autoRetry = z5;
            this.$onAspectRatioLoaded = g0u;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$default = i3;
        }

        public final void invoke(BFM bfm, int i) {
            AuraImageKt.AuraImageContent(this.$modifier, this.$source, this.$contentDescription, this.$options, this.$showRetryView, this.$contextChain, this.$imageListener, this.$applyAspectRatio, this.$showShimmeringState, this.$enableInPlaceImageUpdate, this.$contentScale, this.$colorFilter, this.$alignment, this.$errorContent, this.$autoRetry, this.$onAspectRatioLoaded, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.image.AuraImageKt$AuraImageContent$6, reason: invalid class name and case insensitive filesystem */
    public final class C142866 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Alignment $alignment;
        public final /* synthetic */ boolean $applyAspectRatio;
        public final /* synthetic */ boolean $autoRetry;
        public final /* synthetic */ C1423Ais $colorFilter;
        public final /* synthetic */ String $contentDescription;
        public final /* synthetic */ ARL $contentScale;
        public final /* synthetic */ ContextChain $contextChain;
        public final /* synthetic */ boolean $enableInPlaceImageUpdate;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $errorContent;
        public final /* synthetic */ Ej6 $imageListener;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<Float, Unit> $onAspectRatioLoaded;
        public final /* synthetic */ C7197Ei9 $options;
        public final /* synthetic */ boolean $showRetryView;
        public final /* synthetic */ boolean $showShimmeringState;
        public final /* synthetic */ Ejq $source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C142866(BRg bRg, Ejq ejq, String str, C7197Ei9 c7197Ei9, boolean z, ContextChain contextChain, Ej6 ej6, boolean z2, boolean z3, boolean z4, ARL arl, C1423Ais c1423Ais, Alignment alignment, G0V<? super BFM, ? super Integer, Unit> g0v, boolean z5, G0U<? super Float, Unit> g0u, int i, int i2, int i3) {
            super(2);
            this.$modifier = bRg;
            this.$source = ejq;
            this.$contentDescription = str;
            this.$options = c7197Ei9;
            this.$showRetryView = z;
            this.$contextChain = contextChain;
            this.$imageListener = ej6;
            this.$applyAspectRatio = z2;
            this.$showShimmeringState = z3;
            this.$enableInPlaceImageUpdate = z4;
            this.$contentScale = arl;
            this.$colorFilter = c1423Ais;
            this.$alignment = alignment;
            this.$errorContent = g0v;
            this.$autoRetry = z5;
            this.$onAspectRatioLoaded = g0u;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$default = i3;
        }

        public final void invoke(BFM bfm, int i) {
            AuraImageKt.AuraImageContent(this.$modifier, this.$source, this.$contentDescription, this.$options, this.$showRetryView, this.$contextChain, this.$imageListener, this.$applyAspectRatio, this.$showShimmeringState, this.$enableInPlaceImageUpdate, this.$contentScale, this.$colorFilter, this.$alignment, this.$errorContent, this.$autoRetry, this.$onAspectRatioLoaded, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.image.AuraImageKt$ThumbnailGenerationRecovery$2, reason: invalid class name and case insensitive filesystem */
    public final class C142872 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Function0<Unit> $onFallbackToRaw;
        public final /* synthetic */ AuraImagePainter $painter;
        public final /* synthetic */ MutableState<Boolean> $showErrorContentState;
        public final /* synthetic */ MutableState<Boolean> $showRetryViewState;
        public final /* synthetic */ MutableState<Boolean> $showShimmeringViewState;
        public final /* synthetic */ Uri $thumbUri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C142872(Uri uri, AuraImagePainter auraImagePainter, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, MutableState<Boolean> mutableState3, Function0<Unit> function0, int i) {
            super(2);
            this.$thumbUri = uri;
            this.$painter = auraImagePainter;
            this.$showShimmeringViewState = mutableState;
            this.$showErrorContentState = mutableState2;
            this.$showRetryViewState = mutableState3;
            this.$onFallbackToRaw = function0;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            AuraImageKt.ThumbnailGenerationRecovery(this.$thumbUri, this.$painter, this.$showShimmeringViewState, this.$showErrorContentState, this.$showRetryViewState, this.$onFallbackToRaw, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: auraTintColor-4WTKRHQ, reason: not valid java name */
    public static final C7196Ei8 m2576auraTintColor4WTKRHQ(C7196Ei8 c7196Ei8, long j) {
        C7384Etj.A0Y(c7196Ei8, 0);
        c7196Ei8.A05 = new PorterDuffColorFilter(HxS.A01(j), PorterDuff.Mode.SRC_ATOP);
        return c7196Ei8;
    }

    public static final boolean is404(Throwable th) {
        String message;
        Throwable cause = th != null ? th.getCause() : null;
        AuraImageNetworkFetcher.ImageNetworkFetcherException imageNetworkFetcherException = cause instanceof AuraImageNetworkFetcher.ImageNetworkFetcherException ? (AuraImageNetworkFetcher.ImageNetworkFetcherException) cause : null;
        if (imageNetworkFetcherException != null) {
            if (imageNetworkFetcherException.responseCode == 404) {
                return true;
            }
        } else if (th != null && (message = th.getMessage()) != null && C7BY.A0q(message, "HTTP code 404", false)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0029 A[Catch: Exception -> 0x0039, TryCatch #0 {Exception -> 0x0039, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000c, B:10:0x0012, B:15:0x001c, B:17:0x0022, B:22:0x002b, B:25:0x0034, B:21:0x0029), top: B:28:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.graphics.Bitmap toOwnedBitmap(android.graphics.drawable.Drawable r4) {
        /*
            r3 = 0
            boolean r0 = r4 instanceof android.graphics.drawable.BitmapDrawable     // Catch: java.lang.Exception -> L39
            if (r0 == 0) goto L9
            r0 = r4
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0     // Catch: java.lang.Exception -> L39
            goto La
        L9:
            r0 = r3
        La:
            if (r0 == 0) goto L19
            android.graphics.Bitmap r2 = r0.getBitmap()     // Catch: java.lang.Exception -> L39
            if (r2 == 0) goto L19
            boolean r0 = r2.isRecycled()     // Catch: java.lang.Exception -> L39
            if (r0 != 0) goto L19
            goto L1a
        L19:
            r2 = r3
        L1a:
            if (r2 == 0) goto L31
            android.graphics.Bitmap$Config r1 = r2.getConfig()     // Catch: java.lang.Exception -> L39
            if (r1 == 0) goto L29
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.HARDWARE     // Catch: java.lang.Exception -> L39
            if (r1 != r0) goto L27
            r1 = r3
        L27:
            if (r1 != 0) goto L2b
        L29:
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Exception -> L39
        L2b:
            r0 = 0
            android.graphics.Bitmap r0 = r2.copy(r1, r0)     // Catch: java.lang.Exception -> L39
            goto L32
        L31:
            r0 = r3
        L32:
            if (r0 != 0) goto L38
            android.graphics.Bitmap r0 = drawToOwnedBitmap(r4)     // Catch: java.lang.Exception -> L39
        L38:
            return r0
        L39:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.image.AuraImageKt.toOwnedBitmap(android.graphics.drawable.Drawable):android.graphics.Bitmap");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AuraImage(X.BRg r58, X.Ejq r59, java.lang.String r60, X.C7197Ei9 r61, boolean r62, com.facebook.common.callercontext.ContextChain r63, X.Ej6 r64, boolean r65, boolean r66, boolean r67, X.ARL r68, X.C1423Ais r69, androidx.compose.ui.Alignment r70, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r71, boolean r72, X.G0U<? super java.lang.Float, kotlin.Unit> r73, X.BFM r74, int r75, int r76, int r77) {
        /*
            Method dump skipped, instructions count: 746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.image.AuraImageKt.AuraImage(X.BRg, X.Ejq, java.lang.String, X.Ei9, boolean, com.facebook.common.callercontext.ContextChain, X.Ej6, boolean, boolean, boolean, X.ARL, X.Ais, androidx.compose.ui.Alignment, X.G0V, boolean, X.G0U, X.BFM, int, int, int):void");
    }

    /* renamed from: auraDecodeSizeFor-ozmzZPI, reason: not valid java name */
    public static final BL4 m2575auraDecodeSizeForozmzZPI(long j) {
        int i;
        int i2 = (int) (j >> 32);
        if (i2 <= 0 || (i = (int) (j & 4294967295L)) <= 0) {
            return null;
        }
        return BL4.A00(C8j3.A0S(Math.min(((i2 + 63) / 64) * 64, 2048), Math.min(((i + 63) / 64) * 64, 2048)));
    }

    public static final HxE<Integer, Integer> decodedSize(Drawable drawable) {
        int intrinsicWidth;
        int intrinsicHeight;
        BitmapDrawable bitmapDrawable;
        Bitmap bitmap;
        if (!(drawable instanceof BitmapDrawable) || (bitmapDrawable = (BitmapDrawable) drawable) == null || (bitmap = bitmapDrawable.getBitmap()) == null || bitmap.isRecycled()) {
            intrinsicWidth = drawable.getIntrinsicWidth();
            intrinsicHeight = drawable.getIntrinsicHeight();
        } else {
            intrinsicWidth = bitmap.getWidth();
            intrinsicHeight = bitmap.getHeight();
        }
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return null;
        }
        return C3cG.A0r(Integer.valueOf(intrinsicWidth), Integer.valueOf(intrinsicHeight));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.common.callercontext.CallerContext rememberCallerContext(com.facebook.common.callercontext.ContextChain r5, java.lang.String r6, X.BFM r7, int r8, int r9) {
        /*
            r0 = r9 & 1
            r3 = 0
            if (r0 == 0) goto L6
            r5 = r3
        L6:
            r0 = r9 & 2
            if (r0 == 0) goto L15
            X.AKH<java.lang.String> r1 = com.facebook.aura.vds.compose.perf.LocalRootContextNameKt.LocalRootContextName
            r0 = r7
            X.BBI r0 = (X.BBI) r0
            java.lang.Object r6 = X.AKO.A07(r1, r0)
            java.lang.String r6 = (java.lang.String) r6
        L15:
            boolean r4 = r7.A65(r5)
            r0 = r8 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r2 = 32
            if (r0 <= r2) goto L27
            boolean r0 = r7.A65(r6)
            if (r0 != 0) goto L2c
        L27:
            r0 = r8 & 48
            r1 = 0
            if (r0 != r2) goto L2d
        L2c:
            r1 = 1
        L2d:
            r1 = r1 | r4
            java.lang.Object r0 = r7.AaT()
            if (r1 != 0) goto L38
            java.lang.Object r1 = X.C78N.A00
            if (r0 != r1) goto L4d
        L38:
            java.lang.String r1 = "AuraImage"
            java.lang.String r0 = "pi"
            if (r5 == 0) goto L53
            com.facebook.common.callercontext.ContextChain r2 = new com.facebook.common.callercontext.ContextChain
            r2.<init>(r5, r0, r1)
        L43:
            java.lang.String r1 = r2.A04
            com.facebook.common.callercontext.CallerContext r0 = new com.facebook.common.callercontext.CallerContext
            r0.<init>(r2, r1)
            r7.Ai0(r0)
        L4d:
            com.facebook.common.callercontext.CallerContext r0 = (com.facebook.common.callercontext.CallerContext) r0
            X.C7384Etj.A0X(r0)
            return r0
        L53:
            if (r6 == 0) goto L5b
            com.facebook.common.callercontext.ContextChain r2 = new com.facebook.common.callercontext.ContextChain
            r2.<init>(r3, r0, r6)
            goto L43
        L5b:
            java.lang.String r0 = ""
            com.facebook.common.callercontext.ContextChain r2 = new com.facebook.common.callercontext.ContextChain
            r2.<init>(r3, r0, r1)
            goto L43
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.image.AuraImageKt.rememberCallerContext(com.facebook.common.callercontext.ContextChain, java.lang.String, X.BFM, int, int):com.facebook.common.callercontext.CallerContext");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.Ej6 rememberFeatureListener(final androidx.compose.runtime.MutableState<java.lang.Boolean> r12, final boolean r13, final X.C00q r14, final boolean r15, final androidx.compose.runtime.MutableState<java.lang.Boolean> r16, final boolean r17, final androidx.compose.runtime.MutableState<java.lang.Boolean> r18, final X.Ej6 r19, X.G0U<? super java.lang.Float, kotlin.Unit> r20, X.BFM r21, int r22, int r23) {
        /*
            r1 = r20
            r0 = r23
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L9
            r1 = 0
        L9:
            r4 = r21
            androidx.compose.runtime.MutableState r11 = X.C1er.A00(r4, r1)
            r0 = 29360128(0x1c00000, float:7.052966E-38)
            r0 = r0 & r22
            r2 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r0 ^ r2
            r1 = 8388608(0x800000, float:1.17549435E-38)
            r7 = r19
            if (r0 <= r1) goto L22
            boolean r0 = r4.A65(r7)
            if (r0 != 0) goto L27
        L22:
            r3 = r22 & r2
            r0 = 0
            if (r3 != r1) goto L28
        L27:
            r0 = 1
        L28:
            java.lang.Object r5 = r4.AaT()
            if (r0 != 0) goto L32
            java.lang.Object r0 = X.C78N.A00
            if (r5 != r0) goto L44
        L32:
            com.facebook.aura.vds.compose.image.AuraImageKt$rememberFeatureListener$1$1 r5 = new com.facebook.aura.vds.compose.image.AuraImageKt$rememberFeatureListener$1$1
            r8 = r12
            r9 = r13
            r10 = r14
            r12 = r15
            r13 = r16
            r14 = r17
            r6 = r18
            r5.<init>()
            X.BBI.A0T(r4, r5)
        L44:
            com.facebook.aura.vds.compose.image.AuraImageKt$rememberFeatureListener$1$1 r5 = (com.facebook.aura.vds.compose.image.AuraImageKt$rememberFeatureListener$1$1) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.image.AuraImageKt.rememberFeatureListener(androidx.compose.runtime.MutableState, boolean, X.00q, boolean, androidx.compose.runtime.MutableState, boolean, androidx.compose.runtime.MutableState, X.Ej6, X.G0U, X.BFM, int, int):X.Ej6");
    }

    public static final int roundUpToBucket(int i) {
        return ((i + 63) / 64) * 64;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
    
        if (X.C7384Etj.areEqual(r1, X.InterfaceC8647Fhz.A0B) != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.ARL toContentScale(X.InterfaceC8647Fhz r1) {
        /*
            X.Fhz r0 = X.InterfaceC8647Fhz.A05
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 != 0) goto L4c
            X.Fhz r0 = X.InterfaceC8647Fhz.A01
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 != 0) goto L49
            X.Fhz r0 = X.InterfaceC8647Fhz.A02
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto L1b
            X.ARL r0 = X.B18.A03
            return r0
        L1b:
            X.Fhz r0 = X.InterfaceC8647Fhz.A00
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto L26
            X.2VX r0 = X.B18.A04
            return r0
        L26:
            X.Fhz r0 = X.InterfaceC8647Fhz.A09
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto L31
            X.ARL r0 = X.B18.A01
            return r0
        L31:
            X.Fhz r0 = X.InterfaceC8647Fhz.A06
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 != 0) goto L4c
            X.Fhz r0 = X.InterfaceC8647Fhz.A07
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 != 0) goto L4c
            X.Fhz r0 = X.InterfaceC8647Fhz.A0B
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto L4c
        L49:
            X.ARL r0 = X.B18.A00
            return r0
        L4c:
            X.ARL r0 = X.B18.A02
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.image.AuraImageKt.toContentScale(X.Fhz):X.ARL");
    }

    public static final void ThumbnailGenerationRecovery(Uri uri, AuraImagePainter auraImagePainter, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, MutableState<Boolean> mutableState3, Function0<Unit> function0, BFM bfm, int i) {
        bfm.AgG(-1993391919);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, uri) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass002.A06(AnonymousClass004.A1Y(auraImagePainter, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, mutableState);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0g(bfm, mutableState2);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0h(bfm, mutableState3);
        }
        if ((196608 & i) == 0) {
            iA0T |= AnonymousClass004.A0Y(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA0T, 74898), bfm, iA0T)) {
            boolean zA65 = bfm.A65(uri);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = AuraImageCacheKeyKt.stableImageKey(C60O.A0o(uri));
                bfm.Ai0(objAaT);
            }
            String str = (String) objAaT;
            boolean zA652 = bfm.A65(uri);
            Object objAaT2 = bfm.AaT();
            if (zA652 || objAaT2 == C78N.A00) {
                objAaT2 = Boolean.valueOf(AuraImageNetworkFetcherKt.isImageUri(uri));
                bfm.Ai0(objAaT2);
            }
            boolean zA1X = AnonymousClass001.A1X(objAaT2);
            boolean zA653 = bfm.A65(uri);
            Object objAaT3 = bfm.AaT();
            if (zA653 || objAaT3 == C78N.A00) {
                objAaT3 = new ThumbnailRetryState();
                BBI.A0T(bfm, objAaT3);
            }
            ThumbnailRetryState thumbnailRetryState = (ThumbnailRetryState) objAaT3;
            boolean zA1U = AnonymousClass001.A1U(bfm, zA1X, AnonymousClass004.A1S(bfm, str, thumbnailRetryState, (iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32 || ((iA0T & 64) != 0 && bfm.A67(auraImagePainter))) | AnonymousClass003.A1D(iA0T)) | AnonymousClass004.A1M(iA0T) | AnonymousClass005.A1L(iA0T) | ((458752 & iA0T) == 131072);
            Object objAaT4 = bfm.AaT();
            if (zA1U || objAaT4 == C78N.A00) {
                objAaT4 = new AuraImageKt$ThumbnailGenerationRecovery$1$1(str, auraImagePainter, thumbnailRetryState, mutableState, zA1X, mutableState2, mutableState3, function0);
                BBI.A0T(bfm, objAaT4);
            }
            int i2 = AuraImagePainter.$stable;
            C78e.A03(bfm, auraImagePainter, uri, (G0U) objAaT4);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C142872(uri, auraImagePainter, mutableState, mutableState2, mutableState3, function0, i);
        }
    }

    public static final C7197Ei9 createDefaultOptions() {
        C7196Ei8 c7196Ei8A00 = C7197Ei9.A00();
        c7196Ei8A00.A0I = true;
        c7196Ei8A00.A0O = true;
        return new C7197Ei9(c7196Ei8A00);
    }

    /* renamed from: decodeResizeFor-ozmzZPI, reason: not valid java name */
    public static final C7481Exe m2577decodeResizeForozmzZPI(long j) {
        BL4 bl4M2575auraDecodeSizeForozmzZPI = m2575auraDecodeSizeForozmzZPI(j);
        if (bl4M2575auraDecodeSizeForozmzZPI == null) {
            return null;
        }
        long j2 = bl4M2575auraDecodeSizeForozmzZPI.A00;
        return new C7481Exe(C8j3.A0G(j2), AnonymousClass002.A09(j2));
    }

    public static final Bitmap drawToOwnedBitmap(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
        C7384Etj.A0U(bitmapCreateBitmap);
        Rect rectCopyBounds = drawable.copyBounds();
        C7384Etj.A0U(rectCopyBounds);
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.draw(new Canvas(bitmapCreateBitmap));
        drawable.setBounds(rectCopyBounds);
        return bitmapCreateBitmap;
    }

    public static final Ejq stableImageSourceFor(String str) {
        return B15.A00(Uri.parse(str));
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00e4  */
    /* renamed from: AuraImage-XRP3Ue8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2573AuraImageXRP3Ue8(java.lang.String r44, X.BRg r45, X.ARL r46, java.lang.String r47, com.facebook.common.callercontext.ContextChain r48, boolean r49, X.C1DG r50, long r51, boolean r53, boolean r54, boolean r55, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r56, X.G0U<? super android.graphics.Bitmap, kotlin.Unit> r57, kotlin.jvm.functions.Function0<kotlin.Unit> r58, X.G0V<? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> r59, X.BFM r60, int r61, int r62, int r63) {
        /*
            Method dump skipped, instructions count: 813
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.image.AuraImageKt.m2573AuraImageXRP3Ue8(java.lang.String, X.BRg, X.ARL, java.lang.String, com.facebook.common.callercontext.ContextChain, boolean, X.1DG, long, boolean, boolean, boolean, X.G0V, X.G0U, kotlin.jvm.functions.Function0, X.G0V, X.BFM, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01ef A[PHI: r45
  0x01ef: PHI (r45v4 int) = (r45v2 int), (r45v5 int) binds: [B:135:0x01ed, B:132:0x01e7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x010c  */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v29 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AuraImageContent(X.BRg r39, X.Ejq r40, java.lang.String r41, X.C7197Ei9 r42, boolean r43, com.facebook.common.callercontext.ContextChain r44, X.Ej6 r45, boolean r46, boolean r47, boolean r48, X.ARL r49, X.C1423Ais r50, androidx.compose.ui.Alignment r51, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r52, boolean r53, X.G0U<? super java.lang.Float, kotlin.Unit> r54, X.BFM r55, int r56, int r57, int r58) {
        /*
            Method dump skipped, instructions count: 1544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.image.AuraImageKt.AuraImageContent(X.BRg, X.Ejq, java.lang.String, X.Ei9, boolean, com.facebook.common.callercontext.ContextChain, X.Ej6, boolean, boolean, boolean, X.ARL, X.Ais, androidx.compose.ui.Alignment, X.G0V, boolean, X.G0U, X.BFM, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AuraImage(com.facebook.aura.vds.compose.common.AuraDrawableSource r35, X.BRg r36, java.lang.String r37, X.C7197Ei9 r38, boolean r39, boolean r40, com.facebook.common.callercontext.ContextChain r41, boolean r42, X.Ej6 r43, X.BFM r44, int r45, int r46) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.image.AuraImageKt.AuraImage(com.facebook.aura.vds.compose.common.AuraDrawableSource, X.BRg, java.lang.String, X.Ei9, boolean, boolean, com.facebook.common.callercontext.ContextChain, boolean, X.Ej6, X.BFM, int, int):void");
    }

    public static final void AuraImage(String str, BRg bRg, C7197Ei9 c7197Ei9, String str2, ContextChain contextChain, boolean z, G0V<? super BFM, ? super Integer, Unit> g0v, Function0<Unit> function0, boolean z2, G0U<? super Float, Unit> g0u, BFM bfm, int i, int i2) {
        String str3 = str2;
        ContextChain contextChain2 = contextChain;
        G0V<? super BFM, ? super Integer, Unit> g0v2 = g0v;
        final Function0<Unit> function02 = function0;
        G0U<? super Float, Unit> g0u2 = g0u;
        BRg bRg2 = bRg;
        boolean zA1K = z;
        boolean zA1K2 = z2;
        AnonymousClass002.A1A(str, 0, c7197Ei9);
        bfm.AgG(-1909419624);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, c7197Ei9);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, str3);
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, contextChain2);
        }
        int i6 = i2 & 32;
        int iA0s = 196608;
        if (i6 != 0) {
            iA0d |= iA0s;
        } else if ((196608 & i) == 0) {
            iA0s = AnonymousClass004.A0s(bfm, zA1K);
            iA0d |= iA0s;
        }
        int i7 = i2 & 64;
        int iA0Z = 1572864;
        if (i7 != 0) {
            iA0d |= iA0Z;
        } else if ((i & 1572864) == 0) {
            iA0Z = AnonymousClass004.A0Z(bfm, g0v2);
            iA0d |= iA0Z;
        }
        int i8 = i2 & 128;
        int iA0a = 12582912;
        if (i8 != 0) {
            iA0d |= iA0a;
        } else if ((i & 12582912) == 0) {
            iA0a = AnonymousClass004.A0a(bfm, function02);
            iA0d |= iA0a;
        }
        int i9 = i2 & 256;
        int iA0v = 100663296;
        if (i9 != 0) {
            iA0d |= iA0v;
        } else if ((i & 100663296) == 0) {
            i9 = 0;
            iA0v = AnonymousClass004.A0v(bfm, zA1K2);
            iA0d |= iA0v;
        }
        int i10 = i2 & 512;
        int iA0c = 805306368;
        if (i10 != 0) {
            iA0d |= iA0c;
        } else if ((i & 805306368) == 0) {
            i10 = 0;
            iA0c = AnonymousClass004.A0c(bfm, g0u2);
            iA0d |= iA0c;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 306783379, 306783378), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            F13 f13 = null;
            if (i4 != 0) {
                str3 = null;
            }
            if (i5 != 0) {
                contextChain2 = null;
            }
            zA1K = C3cG.A1K(i6, zA1K);
            if (i7 != 0) {
                g0v2 = ComposableSingletons$AuraImageKt.f305lambda$453552009;
            }
            if (i8 != 0) {
                function02 = null;
            }
            zA1K2 = C3cG.A1K(i9, zA1K2);
            if (i10 != 0) {
                g0u2 = null;
            }
            boolean zA1F = AnonymousClass004.A1F(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1F || objAaT == C78N.A00) {
                objAaT = AuraImageCacheKeyKt.stableImageKey(str);
                bfm.Ai0(objAaT);
            }
            boolean zA65 = bfm.A65(objAaT);
            Object objAaT2 = bfm.AaT();
            if (zA65 || objAaT2 == C78N.A00) {
                objAaT2 = B15.A00(Uri.parse(str));
                bfm.Ai0(objAaT2);
            }
            Ejq ejq = (Ejq) objAaT2;
            if (function02 != null) {
                bfm.AgE(-972481905);
                boolean z3 = (iA0d & 29360128) == 8388608;
                Object objAaT3 = bfm.AaT();
                if (z3 || objAaT3 == C78N.A00) {
                    objAaT3 = new F13() { // from class: com.facebook.aura.vds.compose.image.AuraImageKt$AuraImage$errorListener$1$1
                        @Override // X.F13, X.Ej6
                        public void onFailure(long j, Drawable drawable, Throwable th) {
                            if (AuraImageKt.is404(th)) {
                                function02.invoke();
                            }
                        }
                    };
                    BBI.A0T(bfm, objAaT3);
                }
                f13 = (F13) objAaT3;
            } else {
                bfm.AgE(-972203867);
            }
            AnonymousClass001.A1D(bfm);
            int i11 = iA0d << 3;
            int i12 = ((iA0d >> 3) & 910) | (i11 & 7168) | (i11 & 458752) | (29360128 & (iA0d << 6));
            int i13 = iA0d >> 12;
            AuraImage(bRg2, ejq, str3, c7197Ei9, false, contextChain2, f13, zA1K, false, false, null, null, null, g0v2, zA1K2, g0u2, bfm, i12, ((iA0d >> 9) & 7168) | (57344 & i13) | (i13 & 458752), 7952);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(str, bRg2, c7197Ei9, str3, contextChain2, zA1K, g0v2, function02, zA1K2, g0u2, i, i2);
        }
    }

    public static final void AuraImage(Drawable drawable, BRg bRg, ARL arl, String str, boolean z, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        ARL arl2 = arl;
        String strA0e = str;
        boolean zA1K = z;
        C7384Etj.A0Y(drawable, 0);
        bfm.AgG(-820138367);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, drawable) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, arl2);
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0g(bfm, strA0e);
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            iA0T |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0r(bfm, zA1K);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                arl2 = B18.A02;
            }
            strA0e = C3cG.A0e(strA0e, i5);
            zA1K = C3cG.A1K(i6, zA1K);
            boolean zA65 = bfm.A65(drawable);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new C7449EwP(drawable);
                BBI.A0T(bfm, objAaT);
            }
            C7449EwP c7449EwP = (C7449EwP) objAaT;
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == C78N.A00) {
                C7196Ei8 c7196Ei8A00 = C7197Ei9.A00();
                c7196Ei8A00.A0I = true;
                c7196Ei8A00.A0O = true;
                objAaT2 = new C7197Ei9(c7196Ei8A00);
                BBI.A0T(bfm, objAaT2);
            }
            AuraImage(bRg2, c7449EwP, strA0e, (C7197Ei9) objAaT2, false, null, null, zA1K, false, false, arl2, null, null, null, false, null, bfm, AnonymousClass001.A0C(iA0T << 9, (iA0T >> 3) & 910), ((iA0T >> 6) & 14) | 3072, 56176);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass6(drawable, bRg2, arl2, strA0e, zA1K, i, i2);
        }
    }
}
