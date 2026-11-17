package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.B1V;
import X.BFM;
import X.C10G;
import X.C1DG;
import X.C1OM;
import X.G0U;
import X.G0V;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.ui.sharedelement.HatchSharedElementKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchProductDetailsHeroKt$ProductMediaPage$1$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ float $imageDecodeSize;
    public final /* synthetic */ Function0<Boolean> $isCurrentPage;
    public final /* synthetic */ MutableState<Boolean> $isImageLoaded$delegate;
    public final /* synthetic */ C1DG $morphSeedDecodeSize;
    public final /* synthetic */ Function0<Unit> $onFailure;
    public final /* synthetic */ G0U<Integer, Unit> $onImageClick;
    public final /* synthetic */ G0V<Integer, Integer, Unit> $onImageSizeDecoded;
    public final /* synthetic */ G0U<String, Unit> $onLoadFailed;
    public final /* synthetic */ int $page;
    public final /* synthetic */ int $pageCount;
    public final /* synthetic */ String $productName;
    public final /* synthetic */ String $seedUrl;
    public final /* synthetic */ String $uri;
    public final /* synthetic */ String $viewerSharedElementProductKey;

    /* renamed from: com.facebook.aura.shopping.view.HatchProductDetailsHeroKt$ProductMediaPage$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ float $imageDecodeSize;
        public final /* synthetic */ MutableState<Boolean> $isImageLoaded$delegate;
        public final /* synthetic */ C1DG $morphSeedDecodeSize;
        public final /* synthetic */ Function0<Unit> $onFailure;
        public final /* synthetic */ G0U<Integer, Unit> $onImageClick;
        public final /* synthetic */ G0V<Integer, Integer, Unit> $onImageSizeDecoded;
        public final /* synthetic */ G0U<String, Unit> $onLoadFailed;
        public final /* synthetic */ int $page;
        public final /* synthetic */ int $pageCount;
        public final /* synthetic */ String $productName;
        public final /* synthetic */ String $seedUrl;
        public final /* synthetic */ String $uri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(String str, C1DG c1dg, String str2, int i, int i2, G0U<? super Integer, Unit> g0u, G0U<? super String, Unit> g0u2, String str3, G0V<? super Integer, ? super Integer, Unit> g0v, float f, Function0<Unit> function0, MutableState<Boolean> mutableState) {
            super(2);
            this.$seedUrl = str;
            this.$morphSeedDecodeSize = c1dg;
            this.$productName = str2;
            this.$page = i;
            this.$pageCount = i2;
            this.$onImageClick = g0u;
            this.$onLoadFailed = g0u2;
            this.$uri = str3;
            this.$onImageSizeDecoded = g0v;
            this.$imageDecodeSize = f;
            this.$onFailure = function0;
            this.$isImageLoaded$delegate = mutableState;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0028 A[PHI: r10
  0x0028: PHI (r10v4 boolean) = (r10v0 boolean), (r10v5 boolean) binds: [B:9:0x0026, B:7:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00ed A[PHI: r10
  0x00ed: PHI (r10v1 boolean) = (r10v0 boolean), (r10v4 boolean) binds: [B:9:0x0026, B:11:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void invoke(X.BFM r28, int r29) {
            /*
                Method dump skipped, instructions count: 249
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.view.HatchProductDetailsHeroKt$ProductMediaPage$1$1.AnonymousClass2.invoke(X.BFM, int):void");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchProductDetailsHeroKt$ProductMediaPage$1$1(String str, Function0<Boolean> function0, int i, String str2, C1DG c1dg, String str3, int i2, G0U<? super Integer, Unit> g0u, G0U<? super String, Unit> g0u2, String str4, G0V<? super Integer, ? super Integer, Unit> g0v, float f, Function0<Unit> function02, MutableState<Boolean> mutableState) {
        super(2);
        this.$viewerSharedElementProductKey = str;
        this.$isCurrentPage = function0;
        this.$page = i;
        this.$seedUrl = str2;
        this.$morphSeedDecodeSize = c1dg;
        this.$productName = str3;
        this.$pageCount = i2;
        this.$onImageClick = g0u;
        this.$onLoadFailed = g0u2;
        this.$uri = str4;
        this.$onImageSizeDecoded = g0v;
        this.$imageDecodeSize = f;
        this.$onFailure = function02;
        this.$isImageLoaded$delegate = mutableState;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        String strProductImageSharedElementKey;
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            String str = this.$viewerSharedElementProductKey;
            if (str != null) {
                strProductImageSharedElementKey = ProductDetailsSectionsKt.productImageSharedElementKey(str, this.$page);
            } else {
                strProductImageSharedElementKey = null;
            }
            HatchSharedElementKt.HatchSharedElement(strProductImageSharedElementKey, C1OM.A00, C10G.A01, this.$isCurrentPage, null, null, B1V.A00(bfm, new AnonymousClass2(this.$seedUrl, this.$morphSeedDecodeSize, this.$productName, this.$page, this.$pageCount, this.$onImageClick, this.$onLoadFailed, this.$uri, this.$onImageSizeDecoded, this.$imageDecodeSize, this.$onFailure, this.$isImageLoaded$delegate), -503908225), bfm, 1573296, 48);
            return;
        }
        bfm.Afo();
    }
}
