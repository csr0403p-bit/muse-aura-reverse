package com.facebook.aura.sharesheet;

import X.C20Q;
import X.C20Z;
import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class HatchShareSheetViewModel$special$$inlined$map$2 implements C20Q<HatchShareLogContext> {
    public final /* synthetic */ C20Q $this_unsafeTransform$inlined;
    public final /* synthetic */ HatchShareSheetViewModel this$0;

    @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetViewModel$special$$inlined$map$2", f = "HatchShareSheetViewModel.kt", l = {HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX}, m = "collect", v = 2)
    /* renamed from: com.facebook.aura.sharesheet.HatchShareSheetViewModel$special$$inlined$map$2$1, reason: invalid class name */
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
            return HatchShareSheetViewModel$special$$inlined$map$2.this.collect(null, this);
        }
    }

    /* renamed from: com.facebook.aura.sharesheet.HatchShareSheetViewModel$special$$inlined$map$2$2, reason: invalid class name */
    public final class AnonymousClass2<T> implements C20Z {
        public final /* synthetic */ C20Z $this_unsafeFlow;
        public final /* synthetic */ HatchShareSheetViewModel this$0;

        @DebugMetadata(c = "com.facebook.aura.sharesheet.HatchShareSheetViewModel$special$$inlined$map$2$2", f = "HatchShareSheetViewModel.kt", l = {217}, m = "emit", v = 2)
        /* renamed from: com.facebook.aura.sharesheet.HatchShareSheetViewModel$special$$inlined$map$2$2$1, reason: invalid class name */
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

        public AnonymousClass2(C20Z c20z, HatchShareSheetViewModel hatchShareSheetViewModel) {
            this.$this_unsafeFlow = c20z;
            this.this$0 = hatchShareSheetViewModel;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
        @Override // X.C20Z
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r9, X.HtJ r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof com.facebook.aura.sharesheet.HatchShareSheetViewModel$special$$inlined$map$2.AnonymousClass2.AnonymousClass1
                if (r0 == 0) goto L52
                r7 = r10
                com.facebook.aura.sharesheet.HatchShareSheetViewModel$special$$inlined$map$2$2$1 r7 = (com.facebook.aura.sharesheet.HatchShareSheetViewModel$special$$inlined$map$2.AnonymousClass2.AnonymousClass1) r7
                int r2 = r7.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r2 & r1
                if (r0 == 0) goto L52
                int r2 = r2 - r1
                r7.label = r2
            L12:
                java.lang.Object r1 = r7.result
                X.Hji r6 = X.EnumC10460Hji.A02
                int r0 = r7.label
                r5 = 1
                if (r0 == 0) goto L23
                if (r0 != r5) goto L58
                X.Hwg.A00(r1)
            L20:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            L23:
                X.Hwg.A00(r1)
                X.20Z r4 = r8.$this_unsafeFlow
                boolean r1 = X.AnonymousClass001.A1X(r9)
                com.facebook.aura.sharesheet.HatchShareSheetViewModel r0 = r8.this$0
                if (r1 == 0) goto L4f
                com.facebook.aura.sharesheet.HatchShareLogContext r0 = r0.baseLogContext
                com.facebook.aura.navigation.key.ShareType r3 = r0.shareType
                java.lang.String r2 = r0.messageId
                java.lang.String r0 = r0.threadId
                com.facebook.aura.sharesheet.HatchShareLogContext r1 = new com.facebook.aura.sharesheet.HatchShareLogContext
                r1.<init>(r3, r2, r0, r5)
            L3d:
                r0 = 0
                r7.L$0 = r0
                r7.L$1 = r0
                r7.L$2 = r0
                r7.L$3 = r0
                r7.label = r5
                java.lang.Object r0 = r4.emit(r1, r7)
                if (r0 != r6) goto L20
                return r6
            L4f:
                com.facebook.aura.sharesheet.HatchShareLogContext r1 = r0.baseLogContext
                goto L3d
            L52:
                com.facebook.aura.sharesheet.HatchShareSheetViewModel$special$$inlined$map$2$2$1 r7 = new com.facebook.aura.sharesheet.HatchShareSheetViewModel$special$$inlined$map$2$2$1
                r7.<init>(r10)
                goto L12
            L58:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchShareSheetViewModel$special$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, X.HtJ):java.lang.Object");
        }
    }

    public HatchShareSheetViewModel$special$$inlined$map$2(C20Q c20q, HatchShareSheetViewModel hatchShareSheetViewModel) {
        this.$this_unsafeTransform$inlined = c20q;
        this.this$0 = hatchShareSheetViewModel;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    @Override // X.C20Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(X.C20Z<? super com.facebook.aura.sharesheet.HatchShareLogContext> r7, X.HtJ r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.sharesheet.HatchShareSheetViewModel$special$$inlined$map$2.AnonymousClass1
            if (r0 == 0) goto L3f
            r5 = r8
            com.facebook.aura.sharesheet.HatchShareSheetViewModel$special$$inlined$map$2$1 r5 = (com.facebook.aura.sharesheet.HatchShareSheetViewModel$special$$inlined$map$2.AnonymousClass1) r5
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
            com.facebook.aura.sharesheet.HatchShareSheetViewModel r0 = r6.this$0
            com.facebook.aura.sharesheet.HatchShareSheetViewModel$special$$inlined$map$2$2 r1 = new com.facebook.aura.sharesheet.HatchShareSheetViewModel$special$$inlined$map$2$2
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
            com.facebook.aura.sharesheet.HatchShareSheetViewModel$special$$inlined$map$2$1 r5 = new com.facebook.aura.sharesheet.HatchShareSheetViewModel$special$$inlined$map$2$1
            r5.<init>(r8)
            goto L12
        L45:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.sharesheet.HatchShareSheetViewModel$special$$inlined$map$2.collect(X.20Z, X.HtJ):java.lang.Object");
    }
}
