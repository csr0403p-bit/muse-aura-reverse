package com.facebook.aura.login.nativeflow;

import X.C20Q;
import X.C20Z;
import X.HtJ;
import X.HzP;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes6.dex */
public final class NativeLoginViewModel$observeEntryScreenIdle$1$invokeSuspend$$inlined$map$1 implements C20Q<Boolean> {
    public final /* synthetic */ C20Q $this_unsafeTransform$inlined;
    public final /* synthetic */ NativeLoginViewModel this$0;

    @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel$observeEntryScreenIdle$1$invokeSuspend$$inlined$map$1", f = "NativeLoginViewModel.kt", l = {HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX}, m = "collect", v = 2)
    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$observeEntryScreenIdle$1$invokeSuspend$$inlined$map$1$1, reason: invalid class name */
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
            return NativeLoginViewModel$observeEntryScreenIdle$1$invokeSuspend$$inlined$map$1.this.collect(null, this);
        }
    }

    /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$observeEntryScreenIdle$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
    public final class AnonymousClass2<T> implements C20Z {
        public final /* synthetic */ C20Z $this_unsafeFlow;
        public final /* synthetic */ NativeLoginViewModel this$0;

        @DebugMetadata(c = "com.facebook.aura.login.nativeflow.NativeLoginViewModel$observeEntryScreenIdle$1$invokeSuspend$$inlined$map$1$2", f = "NativeLoginViewModel.kt", l = {217}, m = "emit", v = 2)
        /* renamed from: com.facebook.aura.login.nativeflow.NativeLoginViewModel$observeEntryScreenIdle$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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

        public AnonymousClass2(C20Z c20z, NativeLoginViewModel nativeLoginViewModel) {
            this.$this_unsafeFlow = c20z;
            this.this$0 = nativeLoginViewModel;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
        @Override // X.C20Z
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r7, X.HtJ r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof com.facebook.aura.login.nativeflow.NativeLoginViewModel$observeEntryScreenIdle$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                if (r0 == 0) goto L44
                r5 = r8
                com.facebook.aura.login.nativeflow.NativeLoginViewModel$observeEntryScreenIdle$1$invokeSuspend$$inlined$map$1$2$1 r5 = (com.facebook.aura.login.nativeflow.NativeLoginViewModel$observeEntryScreenIdle$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r5
                int r2 = r5.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r2 & r1
                if (r0 == 0) goto L44
                int r2 = r2 - r1
                r5.label = r2
            L12:
                java.lang.Object r1 = r5.result
                X.Hji r4 = X.EnumC10460Hji.A02
                int r0 = r5.label
                r3 = 1
                if (r0 == 0) goto L23
                if (r0 != r3) goto L4a
                X.Hwg.A00(r1)
            L20:
                kotlin.Unit r4 = kotlin.Unit.INSTANCE
                return r4
            L23:
                X.Hwg.A00(r1)
                X.20Z r2 = r6.$this_unsafeFlow
                com.facebook.aura.login.nativeflow.NativeLoginViewModel r0 = r6.this$0
                boolean r0 = com.facebook.aura.login.nativeflow.NativeLoginViewModel.access$mayConcedeToGoogle(r0)
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
                r0 = 0
                r5.L$0 = r0
                r5.L$1 = r0
                r5.L$2 = r0
                r5.L$3 = r0
                r5.label = r3
                java.lang.Object r0 = r2.emit(r1, r5)
                if (r0 != r4) goto L20
                return r4
            L44:
                com.facebook.aura.login.nativeflow.NativeLoginViewModel$observeEntryScreenIdle$1$invokeSuspend$$inlined$map$1$2$1 r5 = new com.facebook.aura.login.nativeflow.NativeLoginViewModel$observeEntryScreenIdle$1$invokeSuspend$$inlined$map$1$2$1
                r5.<init>(r8)
                goto L12
            L4a:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginViewModel$observeEntryScreenIdle$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, X.HtJ):java.lang.Object");
        }
    }

    public NativeLoginViewModel$observeEntryScreenIdle$1$invokeSuspend$$inlined$map$1(C20Q c20q, NativeLoginViewModel nativeLoginViewModel) {
        this.$this_unsafeTransform$inlined = c20q;
        this.this$0 = nativeLoginViewModel;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    @Override // X.C20Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(X.C20Z<? super java.lang.Boolean> r7, X.HtJ r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.login.nativeflow.NativeLoginViewModel$observeEntryScreenIdle$1$invokeSuspend$$inlined$map$1.AnonymousClass1
            if (r0 == 0) goto L3f
            r5 = r8
            com.facebook.aura.login.nativeflow.NativeLoginViewModel$observeEntryScreenIdle$1$invokeSuspend$$inlined$map$1$1 r5 = (com.facebook.aura.login.nativeflow.NativeLoginViewModel$observeEntryScreenIdle$1$invokeSuspend$$inlined$map$1.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3f
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L23
            if (r0 != r3) goto L45
            X.Hwg.A00(r1)
        L20:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L23:
            X.Hwg.A00(r1)
            X.20Q r2 = r6.$this_unsafeTransform$inlined
            com.facebook.aura.login.nativeflow.NativeLoginViewModel r0 = r6.this$0
            com.facebook.aura.login.nativeflow.NativeLoginViewModel$observeEntryScreenIdle$1$invokeSuspend$$inlined$map$1$2 r1 = new com.facebook.aura.login.nativeflow.NativeLoginViewModel$observeEntryScreenIdle$1$invokeSuspend$$inlined$map$1$2
            r1.<init>(r7, r0)
            r0 = 0
            r5.L$0 = r0
            r5.L$1 = r0
            r5.L$2 = r0
            r5.label = r3
            java.lang.Object r0 = r2.collect(r1, r5)
            if (r0 != r4) goto L20
            return r4
        L3f:
            com.facebook.aura.login.nativeflow.NativeLoginViewModel$observeEntryScreenIdle$1$invokeSuspend$$inlined$map$1$1 r5 = new com.facebook.aura.login.nativeflow.NativeLoginViewModel$observeEntryScreenIdle$1$invokeSuspend$$inlined$map$1$1
            r5.<init>(r8)
            goto L12
        L45:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.login.nativeflow.NativeLoginViewModel$observeEntryScreenIdle$1$invokeSuspend$$inlined$map$1.collect(X.20Z, X.HtJ):java.lang.Object");
    }
}
