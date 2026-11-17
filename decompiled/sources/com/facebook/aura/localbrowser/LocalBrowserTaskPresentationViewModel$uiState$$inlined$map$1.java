package com.facebook.aura.localbrowser;

import X.C1BN;
import X.C20Q;
import X.C20Z;
import X.HtJ;
import X.HzP;
import com.facebook.aura.model.BrowserTaskPresentation;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes6.dex */
public final class LocalBrowserTaskPresentationViewModel$uiState$$inlined$map$1 implements C20Q<C1BN<? extends LocalBrowserFacts>> {
    public final /* synthetic */ BrowserTaskPresentation $task$inlined;
    public final /* synthetic */ C20Q $this_unsafeTransform$inlined;
    public final /* synthetic */ LocalBrowserTaskPresentationViewModel this$0;

    @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserTaskPresentationViewModel$uiState$$inlined$map$1", f = "LocalBrowserTaskPresentationViewModel.kt", l = {HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX}, m = "collect", v = 2)
    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserTaskPresentationViewModel$uiState$$inlined$map$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LocalBrowserTaskPresentationViewModel$uiState$$inlined$map$1.this.collect(null, this);
        }
    }

    /* renamed from: com.facebook.aura.localbrowser.LocalBrowserTaskPresentationViewModel$uiState$$inlined$map$1$2, reason: invalid class name */
    public final class AnonymousClass2<T> implements C20Z {
        public final /* synthetic */ BrowserTaskPresentation $task$inlined;
        public final /* synthetic */ C20Z $this_unsafeFlow;
        public final /* synthetic */ LocalBrowserTaskPresentationViewModel this$0;

        @DebugMetadata(c = "com.facebook.aura.localbrowser.LocalBrowserTaskPresentationViewModel$uiState$$inlined$map$1$2", f = "LocalBrowserTaskPresentationViewModel.kt", l = {217}, m = "emit", v = 2)
        /* renamed from: com.facebook.aura.localbrowser.LocalBrowserTaskPresentationViewModel$uiState$$inlined$map$1$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends HzP {
            public int I$0;
            public Object L$0;
            public Object L$1;
            public Object L$2;
            public Object L$3;
            public Object L$4;
            public int label;
            public /* synthetic */ Object result;

            public AnonymousClass1(HtJ htJ) {
                super(htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return AnonymousClass2.this.emit(null, this);
            }
        }

        public AnonymousClass2(C20Z c20z, LocalBrowserTaskPresentationViewModel localBrowserTaskPresentationViewModel, BrowserTaskPresentation browserTaskPresentation) {
            this.$this_unsafeFlow = c20z;
            this.this$0 = localBrowserTaskPresentationViewModel;
            this.$task$inlined = browserTaskPresentation;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
        @Override // X.C20Z
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r7, X.HtJ r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof com.facebook.aura.localbrowser.LocalBrowserTaskPresentationViewModel$uiState$$inlined$map$1.AnonymousClass2.AnonymousClass1
                if (r0 == 0) goto L4c
                r5 = r8
                com.facebook.aura.localbrowser.LocalBrowserTaskPresentationViewModel$uiState$$inlined$map$1$2$1 r5 = (com.facebook.aura.localbrowser.LocalBrowserTaskPresentationViewModel$uiState$$inlined$map$1.AnonymousClass2.AnonymousClass1) r5
                int r2 = r5.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r2 & r1
                if (r0 == 0) goto L4c
                int r2 = r2 - r1
                r5.label = r2
            L12:
                java.lang.Object r1 = r5.result
                X.Hji r4 = X.EnumC10460Hji.A02
                int r0 = r5.label
                r3 = 1
                if (r0 == 0) goto L23
                if (r0 != r3) goto L52
                X.Hwg.A00(r1)
            L20:
                kotlin.Unit r4 = kotlin.Unit.INSTANCE
                return r4
            L23:
                X.Hwg.A00(r1)
                X.20Z r2 = r6.$this_unsafeFlow
                java.util.Map r7 = (java.util.Map) r7
                com.facebook.aura.localbrowser.LocalBrowserTaskPresentationViewModel r1 = r6.this$0
                com.facebook.aura.model.BrowserTaskPresentation r0 = r6.$task$inlined
                java.lang.String r0 = r0.browserTaskId
                com.facebook.aura.localbrowser.LocalBrowserSession r0 = com.facebook.aura.localbrowser.LocalBrowserTaskPresentationViewModel.access$activeSession(r1, r0, r7)
                if (r0 == 0) goto L4a
                X.1BN<com.facebook.aura.localbrowser.LocalBrowserFacts> r1 = r0.facts
            L38:
                r0 = 0
                r5.L$0 = r0
                r5.L$1 = r0
                r5.L$2 = r0
                r5.L$3 = r0
                r5.label = r3
                java.lang.Object r0 = r2.emit(r1, r5)
                if (r0 != r4) goto L20
                return r4
            L4a:
                r1 = 0
                goto L38
            L4c:
                com.facebook.aura.localbrowser.LocalBrowserTaskPresentationViewModel$uiState$$inlined$map$1$2$1 r5 = new com.facebook.aura.localbrowser.LocalBrowserTaskPresentationViewModel$uiState$$inlined$map$1$2$1
                r5.<init>(r8)
                goto L12
            L52:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserTaskPresentationViewModel$uiState$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, X.HtJ):java.lang.Object");
        }
    }

    public LocalBrowserTaskPresentationViewModel$uiState$$inlined$map$1(C20Q c20q, LocalBrowserTaskPresentationViewModel localBrowserTaskPresentationViewModel, BrowserTaskPresentation browserTaskPresentation) {
        this.$this_unsafeTransform$inlined = c20q;
        this.this$0 = localBrowserTaskPresentationViewModel;
        this.$task$inlined = browserTaskPresentation;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    @Override // X.C20Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(X.C20Z<? super X.C1BN<? extends com.facebook.aura.localbrowser.LocalBrowserFacts>> r8, X.HtJ r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.localbrowser.LocalBrowserTaskPresentationViewModel$uiState$$inlined$map$1.AnonymousClass1
            if (r0 == 0) goto L41
            r6 = r9
            com.facebook.aura.localbrowser.LocalBrowserTaskPresentationViewModel$uiState$$inlined$map$1$1 r6 = (com.facebook.aura.localbrowser.LocalBrowserTaskPresentationViewModel$uiState$$inlined$map$1.AnonymousClass1) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L41
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r1 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L23
            if (r0 != r4) goto L47
            X.Hwg.A00(r1)
        L20:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L23:
            X.Hwg.A00(r1)
            X.20Q r3 = r7.$this_unsafeTransform$inlined
            com.facebook.aura.localbrowser.LocalBrowserTaskPresentationViewModel r2 = r7.this$0
            com.facebook.aura.model.BrowserTaskPresentation r0 = r7.$task$inlined
            com.facebook.aura.localbrowser.LocalBrowserTaskPresentationViewModel$uiState$$inlined$map$1$2 r1 = new com.facebook.aura.localbrowser.LocalBrowserTaskPresentationViewModel$uiState$$inlined$map$1$2
            r1.<init>(r8, r2, r0)
            r0 = 0
            r6.L$0 = r0
            r6.L$1 = r0
            r6.L$2 = r0
            r6.label = r4
            java.lang.Object r0 = r3.collect(r1, r6)
            if (r0 != r5) goto L20
            return r5
        L41:
            com.facebook.aura.localbrowser.LocalBrowserTaskPresentationViewModel$uiState$$inlined$map$1$1 r6 = new com.facebook.aura.localbrowser.LocalBrowserTaskPresentationViewModel$uiState$$inlined$map$1$1
            r6.<init>(r9)
            goto L12
        L47:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.localbrowser.LocalBrowserTaskPresentationViewModel$uiState$$inlined$map$1.collect(X.20Z, X.HtJ):java.lang.Object");
    }
}
