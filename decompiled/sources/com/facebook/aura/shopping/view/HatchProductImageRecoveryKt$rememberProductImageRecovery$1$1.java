package com.facebook.aura.shopping.view;

import X.AHD;
import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C1BO;
import X.C3UX;
import X.G0V;
import X.HtJ;
import com.facebook.aura.opengraph.HatchOpenGraphRepository;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.shopping.view.HatchProductImageRecoveryKt$rememberProductImageRecovery$1$1", f = "HatchProductImageRecovery.kt", l = {128, 130}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchProductImageRecoveryKt$rememberProductImageRecovery$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1BO<AHD<String>> $currentGallery;
    public final /* synthetic */ C1BO<String> $currentSeed;
    public final /* synthetic */ HatchOpenGraphRepository $repository;
    public final /* synthetic */ ProductImageRecoveryState $state;
    public final /* synthetic */ String $webPageUrl;
    public int label;

    /* renamed from: com.facebook.aura.shopping.view.HatchProductImageRecoveryKt$rememberProductImageRecovery$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Boolean> {
        public final /* synthetic */ C1BO<AHD<String>> $currentGallery;
        public final /* synthetic */ C1BO<String> $currentSeed;
        public final /* synthetic */ ProductImageRecoveryState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(C1BO<? extends AHD<String>> c1bo, C1BO<String> c1bo2, ProductImageRecoveryState productImageRecoveryState) {
            super(0);
            this.$currentGallery = c1bo;
            this.$currentSeed = c1bo2;
            this.$state = productImageRecoveryState;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(HatchProductImageRecoveryKt.resolveProductImages(C1BO.A0C(this.$currentGallery), C1BO.A08(this.$currentSeed), this.$state.getFailedUrls(), this.$state.getPreview()).needsPreviewLookup);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.shopping.view.HatchProductImageRecoveryKt$rememberProductImageRecovery$1$1$2", f = "HatchProductImageRecovery.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.shopping.view.HatchProductImageRecoveryKt$rememberProductImageRecovery$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<Boolean, HtJ<? super Boolean>, Object> {
        public /* synthetic */ boolean Z$0;
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(htJ);
            anonymousClass2.Z$0 = AnonymousClass001.A1X(obj);
            return anonymousClass2;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            boolean z = this.Z$0;
            if (this.label == 0) {
                return AnonymousClass001.A0k(obj, z);
            }
            throw AnonymousClass001.A0n();
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, HtJ<? super Boolean> htJ) {
            return invoke(AnonymousClass001.A1X(bool), htJ);
        }

        public final Object invoke(boolean z, HtJ<? super Boolean> htJ) {
            return ((AnonymousClass2) AnonymousClass002.A0r(htJ, this, z)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchProductImageRecoveryKt$rememberProductImageRecovery$1$1(HatchOpenGraphRepository hatchOpenGraphRepository, String str, ProductImageRecoveryState productImageRecoveryState, C1BO<? extends AHD<String>> c1bo, C1BO<String> c1bo2, HtJ<? super HatchProductImageRecoveryKt$rememberProductImageRecovery$1$1> htJ) {
        super(2, htJ);
        this.$repository = hatchOpenGraphRepository;
        this.$webPageUrl = str;
        this.$state = productImageRecoveryState;
        this.$currentGallery = c1bo;
        this.$currentSeed = c1bo2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchProductImageRecoveryKt$rememberProductImageRecovery$1$1(this.$repository, this.$webPageUrl, this.$state, this.$currentGallery, this.$currentSeed, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x002b A[EDGE_INSN: B:31:0x002b->B:13:0x002b BREAK  A[LOOP:0: B:8:0x001a->B:33:?], SYNTHETIC] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r8.label
            r5 = 0
            r4 = 2
            r7 = 1
            if (r0 == 0) goto L36
            if (r0 == r7) goto L6c
            if (r0 != r4) goto L83
            X.Hwg.A00(r9)
        L10:
            com.facebook.aura.opengraph.HatchWebPageMetadata r9 = (com.facebook.aura.opengraph.HatchWebPageMetadata) r9
            com.facebook.aura.shopping.view.ProductImageRecoveryState r2 = r8.$state
            X.AHD<java.lang.String> r0 = r9.imageCandidates
            java.util.Iterator r1 = r0.iterator()
        L1a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L2b
            java.lang.String r0 = X.AnonymousClass005.A0j(r1)
            java.lang.String r0 = com.facebook.aura.shopping.view.HatchProductImageRecoveryKt.absoluteProductWebUrl(r0)
            if (r0 == 0) goto L1a
            r5 = r0
        L2b:
            com.facebook.aura.shopping.view.ProductImagePreview$Resolved r0 = new com.facebook.aura.shopping.view.ProductImagePreview$Resolved
            r0.<init>(r5)
            r2.setPreview(r0)
        L33:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L36:
            X.Hwg.A00(r9)
            com.facebook.aura.opengraph.HatchOpenGraphRepository r0 = r8.$repository
            if (r0 == 0) goto L33
            java.lang.String r0 = r8.$webPageUrl
            if (r0 == 0) goto L33
            com.facebook.aura.shopping.view.ProductImageRecoveryState r0 = r8.$state
            com.facebook.aura.shopping.view.ProductImagePreview r1 = r0.getPreview()
            com.facebook.aura.shopping.view.ProductImagePreview$NotRequested r0 = com.facebook.aura.shopping.view.ProductImagePreview.NotRequested.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto L33
            X.1BO<X.AHD<java.lang.String>> r3 = r8.$currentGallery
            X.1BO<java.lang.String> r2 = r8.$currentSeed
            com.facebook.aura.shopping.view.ProductImageRecoveryState r1 = r8.$state
            com.facebook.aura.shopping.view.HatchProductImageRecoveryKt$rememberProductImageRecovery$1$1$1 r0 = new com.facebook.aura.shopping.view.HatchProductImageRecoveryKt$rememberProductImageRecovery$1$1$1
            r0.<init>(r3, r2, r1)
            X.3ul r1 = X.C6v3.A01(r0)
            com.facebook.aura.shopping.view.HatchProductImageRecoveryKt$rememberProductImageRecovery$1$1$2 r0 = new com.facebook.aura.shopping.view.HatchProductImageRecoveryKt$rememberProductImageRecovery$1$1$2
            r0.<init>(r5)
            r8.label = r7
            java.lang.Object r0 = X.AbstractC9777Gfy.A00(r8, r0, r1)
            if (r0 != r6) goto L6f
            return r6
        L6c:
            X.Hwg.A00(r9)
        L6f:
            com.facebook.aura.shopping.view.ProductImageRecoveryState r1 = r8.$state
            com.facebook.aura.shopping.view.ProductImagePreview$Pending r0 = com.facebook.aura.shopping.view.ProductImagePreview.Pending.INSTANCE
            r1.setPreview(r0)
            com.facebook.aura.opengraph.HatchOpenGraphRepository r1 = r8.$repository
            java.lang.String r0 = r8.$webPageUrl
            r8.label = r4
            java.lang.Object r9 = r1.metadata(r0, r8)
            if (r9 != r6) goto L10
            return r6
        L83:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.shopping.view.HatchProductImageRecoveryKt$rememberProductImageRecovery$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchProductImageRecoveryKt$rememberProductImageRecovery$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
