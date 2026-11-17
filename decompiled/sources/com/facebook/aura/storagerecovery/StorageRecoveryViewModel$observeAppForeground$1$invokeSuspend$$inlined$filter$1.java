package com.facebook.aura.storagerecovery;

import X.C20Q;
import X.C20Z;
import X.HtJ;
import X.HzP;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes6.dex */
public final class StorageRecoveryViewModel$observeAppForeground$1$invokeSuspend$$inlined$filter$1 implements C20Q<Boolean> {
    public final /* synthetic */ C20Q $this_unsafeTransform$inlined;

    @DebugMetadata(c = "com.facebook.aura.storagerecovery.StorageRecoveryViewModel$observeAppForeground$1$invokeSuspend$$inlined$filter$1", f = "StorageRecoveryViewModel.kt", l = {HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX}, m = "collect", v = 2)
    /* renamed from: com.facebook.aura.storagerecovery.StorageRecoveryViewModel$observeAppForeground$1$invokeSuspend$$inlined$filter$1$1, reason: invalid class name */
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
            return StorageRecoveryViewModel$observeAppForeground$1$invokeSuspend$$inlined$filter$1.this.collect(null, this);
        }
    }

    /* renamed from: com.facebook.aura.storagerecovery.StorageRecoveryViewModel$observeAppForeground$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
    public final class AnonymousClass2<T> implements C20Z {
        public final /* synthetic */ C20Z $this_unsafeFlow;

        @DebugMetadata(c = "com.facebook.aura.storagerecovery.StorageRecoveryViewModel$observeAppForeground$1$invokeSuspend$$inlined$filter$1$2", f = "StorageRecoveryViewModel.kt", l = {217}, m = "emit", v = 2)
        /* renamed from: com.facebook.aura.storagerecovery.StorageRecoveryViewModel$observeAppForeground$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends HzP {
            public int I$0;
            public Object L$0;
            public Object L$1;
            public Object L$2;
            public Object L$3;
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

        public AnonymousClass2(C20Z c20z) {
            this.$this_unsafeFlow = c20z;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
        @Override // X.C20Z
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r6, X.HtJ r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof com.facebook.aura.storagerecovery.StorageRecoveryViewModel$observeAppForeground$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                if (r0 == 0) goto L40
                r4 = r7
                com.facebook.aura.storagerecovery.StorageRecoveryViewModel$observeAppForeground$1$invokeSuspend$$inlined$filter$1$2$1 r4 = (com.facebook.aura.storagerecovery.StorageRecoveryViewModel$observeAppForeground$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r4
                int r2 = r4.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r2 & r1
                if (r0 == 0) goto L40
                int r2 = r2 - r1
                r4.label = r2
            L12:
                java.lang.Object r1 = r4.result
                X.Hji r3 = X.EnumC10460Hji.A02
                int r0 = r4.label
                r2 = 1
                if (r0 == 0) goto L23
                if (r0 != r2) goto L46
                X.Hwg.A00(r1)
            L20:
                kotlin.Unit r3 = kotlin.Unit.INSTANCE
                return r3
            L23:
                X.Hwg.A00(r1)
                X.20Z r1 = r5.$this_unsafeFlow
                boolean r0 = X.AnonymousClass001.A1X(r6)
                if (r0 == 0) goto L20
                r0 = 0
                r4.L$0 = r0
                r4.L$1 = r0
                r4.L$2 = r0
                r4.L$3 = r0
                r4.label = r2
                java.lang.Object r0 = r1.emit(r6, r4)
                if (r0 != r3) goto L20
                return r3
            L40:
                com.facebook.aura.storagerecovery.StorageRecoveryViewModel$observeAppForeground$1$invokeSuspend$$inlined$filter$1$2$1 r4 = new com.facebook.aura.storagerecovery.StorageRecoveryViewModel$observeAppForeground$1$invokeSuspend$$inlined$filter$1$2$1
                r4.<init>(r7)
                goto L12
            L46:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.storagerecovery.StorageRecoveryViewModel$observeAppForeground$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, X.HtJ):java.lang.Object");
        }
    }

    public StorageRecoveryViewModel$observeAppForeground$1$invokeSuspend$$inlined$filter$1(C20Q c20q) {
        this.$this_unsafeTransform$inlined = c20q;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    @Override // X.C20Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(X.C20Z<? super java.lang.Boolean> r7, X.HtJ r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.storagerecovery.StorageRecoveryViewModel$observeAppForeground$1$invokeSuspend$$inlined$filter$1.AnonymousClass1
            if (r0 == 0) goto L3d
            r5 = r8
            com.facebook.aura.storagerecovery.StorageRecoveryViewModel$observeAppForeground$1$invokeSuspend$$inlined$filter$1$1 r5 = (com.facebook.aura.storagerecovery.StorageRecoveryViewModel$observeAppForeground$1$invokeSuspend$$inlined$filter$1.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3d
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L23
            if (r0 != r3) goto L43
            X.Hwg.A00(r1)
        L20:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L23:
            X.Hwg.A00(r1)
            X.20Q r2 = r6.$this_unsafeTransform$inlined
            com.facebook.aura.storagerecovery.StorageRecoveryViewModel$observeAppForeground$1$invokeSuspend$$inlined$filter$1$2 r1 = new com.facebook.aura.storagerecovery.StorageRecoveryViewModel$observeAppForeground$1$invokeSuspend$$inlined$filter$1$2
            r1.<init>(r7)
            r0 = 0
            r5.L$0 = r0
            r5.L$1 = r0
            r5.L$2 = r0
            r5.label = r3
            java.lang.Object r0 = r2.collect(r1, r5)
            if (r0 != r4) goto L20
            return r4
        L3d:
            com.facebook.aura.storagerecovery.StorageRecoveryViewModel$observeAppForeground$1$invokeSuspend$$inlined$filter$1$1 r5 = new com.facebook.aura.storagerecovery.StorageRecoveryViewModel$observeAppForeground$1$invokeSuspend$$inlined$filter$1$1
            r5.<init>(r8)
            goto L12
        L43:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.storagerecovery.StorageRecoveryViewModel$observeAppForeground$1$invokeSuspend$$inlined$filter$1.collect(X.20Z, X.HtJ):java.lang.Object");
    }
}
