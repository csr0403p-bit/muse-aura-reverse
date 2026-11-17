package com.facebook.aura.file.view;

import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C27i;
import X.C7384Etj;
import X.C8eM;
import X.GCQ;
import X.HtJ;
import X.HzP;
import android.graphics.Bitmap;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class HtmlPreviewRenderer {
    public static final int $stable = 0;
    public static final HtmlPreviewRenderer INSTANCE = new HtmlPreviewRenderer();
    public static final C8eM renderSemaphore;

    @DebugMetadata(c = "com.facebook.aura.file.view.HtmlPreviewRenderer", f = "HtmlPreviewRenderer.kt", l = {LinkEncryptedPairingKt.LINK_PUBLIC_KEY_SIZE}, m = "render", v = 2)
    /* renamed from: com.facebook.aura.file.view.HtmlPreviewRenderer$render$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HtmlPreviewRenderer.this.render(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.file.view.HtmlPreviewRenderer", f = "HtmlPreviewRenderer.kt", l = {277, 183}, m = "renderHtmlToBitmap", v = 2)
    /* renamed from: com.facebook.aura.file.view.HtmlPreviewRenderer$renderHtmlToBitmap$1, reason: invalid class name and case insensitive filesystem */
    public final class C119661 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C119661(HtJ<? super C119661> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HtmlPreviewRenderer.this.renderHtmlToBitmap(null, null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.file.view.HtmlPreviewRenderer", f = "HtmlPreviewRenderer.kt", l = {89, 100}, m = "renderUncached", v = 2)
    /* renamed from: com.facebook.aura.file.view.HtmlPreviewRenderer$renderUncached$1, reason: invalid class name and case insensitive filesystem */
    public final class C119671 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public C119671(HtJ<? super C119671> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HtmlPreviewRenderer.this.renderUncached(null, null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object renderUncached(android.content.Context r12, java.lang.String r13, X.AbstractC3358CGz r14, com.facebook.aura.file.view.HtmlPreviewRenderState r15, X.HtJ<? super android.graphics.Bitmap> r16) {
        /*
            r11 = this;
            r7 = r12
            r4 = r16
            r10 = r14
            r9 = r13
            boolean r0 = r4 instanceof com.facebook.aura.file.view.HtmlPreviewRenderer.C119671
            if (r0 == 0) goto L2f
            r3 = r4
            com.facebook.aura.file.view.HtmlPreviewRenderer$renderUncached$1 r3 = (com.facebook.aura.file.view.HtmlPreviewRenderer.C119671) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2f
            int r2 = r2 - r1
            r3.label = r2
        L17:
            java.lang.Object r8 = r3.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r2 = 2
            r11 = 0
            r5 = 1
            if (r0 == 0) goto L3a
            if (r0 == r5) goto L57
            if (r0 != r2) goto L35
            java.lang.Object r15 = r3.L$3
            com.facebook.aura.file.view.HtmlPreviewRenderState r15 = (com.facebook.aura.file.view.HtmlPreviewRenderState) r15
            java.lang.Object r9 = r3.L$1
            java.lang.String r9 = (java.lang.String) r9
            goto L8d
        L2f:
            com.facebook.aura.file.view.HtmlPreviewRenderer$renderUncached$1 r3 = new com.facebook.aura.file.view.HtmlPreviewRenderer$renderUncached$1
            r3.<init>(r4)
            goto L17
        L35:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L3a:
            X.Hwg.A00(r8)
            com.facebook.aura.file.utils.HatchFileUIUtils r6 = com.facebook.aura.file.utils.HatchFileUIUtils.INSTANCE
            r0 = 2097152(0x200000, double:1.0361308E-317)
            java.lang.Long r0 = X.C3cG.A0S(r0)
            r3.L$0 = r12
            r3.L$1 = r13
            r3.L$2 = r14
            r3.L$3 = r15
            r3.label = r5
            java.lang.Object r8 = r6.readHtmlContent(r13, r14, r0, r3)
            if (r8 != r4) goto L69
            return r4
        L57:
            java.lang.Object r15 = r3.L$3
            com.facebook.aura.file.view.HtmlPreviewRenderState r15 = (com.facebook.aura.file.view.HtmlPreviewRenderState) r15
            java.lang.Object r10 = r3.L$2
            X.CGz r10 = (X.AbstractC3358CGz) r10
            java.lang.Object r9 = r3.L$1
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r0 = r3.L$0
            android.content.Context r7 = X.C60P.A02(r0, r8)
        L69:
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto Lb9
            boolean r0 = X.C7BY.A0j(r8)
            if (r0 != 0) goto Lb9
            X.GB9 r0 = com.facebook.aura.executors.AuraDispatchers.main     // Catch: java.lang.Exception -> L95 java.util.concurrent.CancellationException -> Lb7
            com.facebook.aura.file.view.HtmlPreviewRenderer$renderUncached$bitmap$1 r6 = new com.facebook.aura.file.view.HtmlPreviewRenderer$renderUncached$bitmap$1     // Catch: java.lang.Exception -> L95 java.util.concurrent.CancellationException -> Lb7
            r6.<init>(r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L95 java.util.concurrent.CancellationException -> Lb7
            r3.L$0 = r11     // Catch: java.lang.Exception -> L95 java.util.concurrent.CancellationException -> Lb7
            r3.L$1 = r9     // Catch: java.lang.Exception -> L95 java.util.concurrent.CancellationException -> Lb7
            r3.L$2 = r11     // Catch: java.lang.Exception -> L95 java.util.concurrent.CancellationException -> Lb7
            r3.L$3 = r15     // Catch: java.lang.Exception -> L95 java.util.concurrent.CancellationException -> Lb7
            r3.L$4 = r11     // Catch: java.lang.Exception -> L95 java.util.concurrent.CancellationException -> Lb7
            r3.label = r2     // Catch: java.lang.Exception -> L95 java.util.concurrent.CancellationException -> Lb7
            java.lang.Object r8 = X.GAo.A00(r3, r0, r6)     // Catch: java.lang.Exception -> L95 java.util.concurrent.CancellationException -> Lb7
            if (r8 != r4) goto L90
            return r4
        L8d:
            X.Hwg.A00(r8)     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> Lb7
        L90:
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8     // Catch: java.lang.Exception -> L93 java.util.concurrent.CancellationException -> Lb7
            goto La6
        L93:
            r2 = move-exception
            goto L96
        L95:
            r2 = move-exception
        L96:
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "HTML preview render failed for "
            java.lang.String r1 = X.C60P.A1L(r0, r9, r1)
            java.lang.String r0 = "HtmlPreviewRenderer"
            X.CFK.A0A(r0, r1, r2)
            r8 = r11
        La6:
            if (r8 != 0) goto Lac
            r15.recordTransientFailure(r9)
            return r11
        Lac:
            android.util.LruCache<java.lang.String, java.lang.Integer> r0 = r15.transientFailureCounts
            r0.remove(r9)
            android.util.LruCache<java.lang.String, android.graphics.Bitmap> r0 = r15.bitmapCache
            r0.put(r9, r8)
            return r8
        Lb7:
            r0 = move-exception
            throw r0
        Lb9:
            android.util.LruCache<java.lang.String, java.lang.Boolean> r1 = r15.terminalFailures
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r1.put(r9, r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.view.HtmlPreviewRenderer.renderUncached(android.content.Context, java.lang.String, X.CGz, com.facebook.aura.file.view.HtmlPreviewRenderState, X.HtJ):java.lang.Object");
    }

    public final boolean hasFailed(String str, AbstractC3358CGz abstractC3358CGz) {
        boolean zA1a = AnonymousClass002.A1a(str, abstractC3358CGz);
        if (HtmlPreviewRenderState.Companion.getInstance(abstractC3358CGz).terminalFailures.get(str) != null) {
            return zA1a;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object render(android.content.Context r10, java.lang.String r11, X.AbstractC3358CGz r12, X.HtJ<? super android.graphics.Bitmap> r13) {
        /*
            r9 = this;
            r6 = r11
            boolean r0 = r13 instanceof com.facebook.aura.file.view.HtmlPreviewRenderer.AnonymousClass1
            if (r0 == 0) goto L69
            r2 = r13
            com.facebook.aura.file.view.HtmlPreviewRenderer$render$1 r2 = (com.facebook.aura.file.view.HtmlPreviewRenderer.AnonymousClass1) r2
            int r3 = r2.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L69
            int r3 = r3 - r1
            r2.label = r3
        L13:
            java.lang.Object r4 = r2.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r2.label
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 != r1) goto L83
            java.lang.Object r5 = r2.L$3
            com.facebook.aura.file.view.HtmlPreviewRenderState r5 = (com.facebook.aura.file.view.HtmlPreviewRenderState) r5
            java.lang.Object r6 = r2.L$1
            X.Hwg.A00(r4)
        L27:
            com.facebook.aura.common.coroutines.SingleFlightResult r4 = (com.facebook.aura.common.coroutines.SingleFlightResult) r4
            boolean r0 = r4 instanceof com.facebook.aura.common.coroutines.SingleFlightResult.Result
            if (r0 == 0) goto L6f
            com.facebook.aura.common.coroutines.SingleFlightResult$Result r4 = (com.facebook.aura.common.coroutines.SingleFlightResult.Result) r4
            T r3 = r4.value
            return r3
        L32:
            X.Hwg.A00(r4)
            com.facebook.aura.file.view.HtmlPreviewRenderState$Companion r0 = com.facebook.aura.file.view.HtmlPreviewRenderState.Companion
            r8 = r12
            com.facebook.aura.file.view.HtmlPreviewRenderState r5 = r0.getInstance(r12)
            android.util.LruCache<java.lang.String, android.graphics.Bitmap> r0 = r5.bitmapCache
            java.lang.Object r0 = r0.get(r11)
            if (r0 == 0) goto L45
            return r0
        L45:
            android.util.LruCache<java.lang.String, java.lang.Boolean> r0 = r5.terminalFailures
            java.lang.Object r0 = r0.get(r11)
            if (r0 == 0) goto L4f
            r3 = 0
            return r3
        L4f:
            com.facebook.aura.common.coroutines.SingleFlight r0 = r5.singleFlight
            r9 = 0
            com.facebook.aura.file.view.HtmlPreviewRenderer$render$result$1 r4 = new com.facebook.aura.file.view.HtmlPreviewRenderer$render$result$1
            r7 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            r2.L$0 = r9
            r2.L$1 = r11
            r2.L$2 = r9
            r2.L$3 = r5
            r2.label = r1
            java.lang.Object r4 = r0.invoke(r11, r4, r2)
            if (r4 != r3) goto L27
            return r3
        L69:
            com.facebook.aura.file.view.HtmlPreviewRenderer$render$1 r2 = new com.facebook.aura.file.view.HtmlPreviewRenderer$render$1
            r2.<init>(r13)
            goto L13
        L6f:
            com.facebook.aura.common.coroutines.SingleFlightResult$Skipped r0 = com.facebook.aura.common.coroutines.SingleFlightResult.Skipped.INSTANCE
            boolean r0 = X.C7384Etj.areEqual(r4, r0)
            if (r0 == 0) goto L7e
            android.util.LruCache<java.lang.String, android.graphics.Bitmap> r0 = r5.bitmapCache
            java.lang.Object r3 = r0.get(r6)
            return r3
        L7e:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        L83:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.view.HtmlPreviewRenderer.render(android.content.Context, java.lang.String, X.CGz, X.HtJ):java.lang.Object");
    }

    static {
        int i = GCQ.A00;
        renderSemaphore = new C27i(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(17:106|(4:(1:(1:(18:11|27|28|78|29|86|32|94|35|102|38|82|41|90|44|98|47|48)(2:13|14))(2:15|23))(6:16|(1:18)|19|108|20|(1:22))|98|47|48)|24|(1:26)|28|78|29|86|32|94|35|102|38|82|41|90|44) */
    /* JADX WARN: Can't wrap try/catch for region: R(20:106|(1:(1:(18:11|27|28|78|29|86|32|94|35|102|38|82|41|90|44|98|47|48)(2:13|14))(2:15|23))(6:16|(1:18)|19|108|20|(1:22))|24|(1:26)|28|78|29|86|32|94|35|102|38|82|41|90|44|98|47|48) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0102, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0103, code lost:
    
        X.C3cG.A0s(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x010a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x010b, code lost:
    
        X.C3cG.A0s(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0112, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0113, code lost:
    
        X.C3cG.A0s(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x011a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x011b, code lost:
    
        X.C3cG.A0s(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0127, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0128, code lost:
    
        X.C3cG.A0s(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x012f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object renderHtmlToBitmap(android.content.Context r16, java.lang.String r17, final java.lang.String r18, final X.AbstractC3358CGz r19, X.HtJ<? super android.graphics.Bitmap> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.view.HtmlPreviewRenderer.renderHtmlToBitmap(android.content.Context, java.lang.String, java.lang.String, X.CGz, X.HtJ):java.lang.Object");
    }

    private final Bitmap downscale(Bitmap bitmap) {
        if (bitmap.getWidth() <= 600) {
            return bitmap;
        }
        int height = (int) ((bitmap.getHeight() * 600) / bitmap.getWidth());
        if (height < 1) {
            height = 1;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, 600, height, true);
        C7384Etj.A0U(bitmapCreateScaledBitmap);
        if (bitmapCreateScaledBitmap != bitmap) {
            bitmap.recycle();
        }
        return bitmapCreateScaledBitmap;
    }

    public final Bitmap peek(String str, AbstractC3358CGz abstractC3358CGz) {
        AnonymousClass003.A0u(str, abstractC3358CGz);
        return HtmlPreviewRenderState.Companion.getInstance(abstractC3358CGz).bitmapCache.get(str);
    }
}
