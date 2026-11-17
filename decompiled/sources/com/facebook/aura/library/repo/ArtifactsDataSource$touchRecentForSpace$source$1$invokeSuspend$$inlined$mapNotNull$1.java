package com.facebook.aura.library.repo;

import X.C20Q;
import X.C20Z;
import X.HtJ;
import X.HzP;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes6.dex */
public final class ArtifactsDataSource$touchRecentForSpace$source$1$invokeSuspend$$inlined$mapNotNull$1 implements C20Q<ArtifactSource> {
    public final /* synthetic */ String $slug$inlined;
    public final /* synthetic */ C20Q $this_unsafeTransform$inlined;

    @DebugMetadata(c = "com.facebook.aura.library.repo.ArtifactsDataSource$touchRecentForSpace$source$1$invokeSuspend$$inlined$mapNotNull$1", f = "ArtifactsDataSource.kt", l = {HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX}, m = "collect", v = 2)
    /* renamed from: com.facebook.aura.library.repo.ArtifactsDataSource$touchRecentForSpace$source$1$invokeSuspend$$inlined$mapNotNull$1$1, reason: invalid class name */
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
            return ArtifactsDataSource$touchRecentForSpace$source$1$invokeSuspend$$inlined$mapNotNull$1.this.collect(null, this);
        }
    }

    /* renamed from: com.facebook.aura.library.repo.ArtifactsDataSource$touchRecentForSpace$source$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
    public final class AnonymousClass2<T> implements C20Z {
        public final /* synthetic */ String $slug$inlined;
        public final /* synthetic */ C20Z $this_unsafeFlow;

        @DebugMetadata(c = "com.facebook.aura.library.repo.ArtifactsDataSource$touchRecentForSpace$source$1$invokeSuspend$$inlined$mapNotNull$1$2", f = "ArtifactsDataSource.kt", l = {226}, m = "emit", v = 2)
        /* renamed from: com.facebook.aura.library.repo.ArtifactsDataSource$touchRecentForSpace$source$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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

        public AnonymousClass2(C20Z c20z, String str) {
            this.$this_unsafeFlow = c20z;
            this.$slug$inlined = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x006a  */
        @Override // X.C20Z
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r10, X.HtJ r11) {
            /*
                r9 = this;
                boolean r0 = r11 instanceof com.facebook.aura.library.repo.ArtifactsDataSource$touchRecentForSpace$source$1$invokeSuspend$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1
                if (r0 == 0) goto L6a
                r6 = r11
                com.facebook.aura.library.repo.ArtifactsDataSource$touchRecentForSpace$source$1$invokeSuspend$$inlined$mapNotNull$1$2$1 r6 = (com.facebook.aura.library.repo.ArtifactsDataSource$touchRecentForSpace$source$1$invokeSuspend$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1) r6
                int r2 = r6.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r2 & r1
                if (r0 == 0) goto L6a
                int r2 = r2 - r1
                r6.label = r2
            L12:
                java.lang.Object r1 = r6.result
                X.Hji r5 = X.EnumC10460Hji.A02
                int r0 = r6.label
                r7 = 1
                if (r0 == 0) goto L23
                if (r0 != r7) goto L70
                X.Hwg.A00(r1)
            L20:
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
            L23:
                X.Hwg.A00(r1)
                X.20Z r4 = r9.$this_unsafeFlow
                java.util.Iterator r8 = X.AbstractC7607F5u.A13(r10)
            L2c:
                boolean r0 = r8.hasNext()
                r3 = 0
                if (r0 == 0) goto L4e
                java.lang.Object r3 = r8.next()
                r2 = r3
                com.facebook.aura.library.repo.ArtifactItem r2 = (com.facebook.aura.library.repo.ArtifactItem) r2
                java.lang.String r1 = r2.itemKey
                java.lang.String r0 = r9.$slug$inlined
                boolean r0 = X.C7384Etj.areEqual(r1, r0)
                if (r0 == 0) goto L2c
                com.facebook.aura.library.repo.ArtifactSource r1 = r2.source
                com.facebook.aura.library.repo.ArtifactSource r0 = com.facebook.aura.library.repo.ArtifactSource.SPACE
                if (r1 == r0) goto L4e
                com.facebook.aura.library.repo.ArtifactSource r0 = com.facebook.aura.library.repo.ArtifactSource.SAVED_SPACE
                if (r1 != r0) goto L2c
            L4e:
                com.facebook.aura.library.repo.ArtifactItem r3 = (com.facebook.aura.library.repo.ArtifactItem) r3
                if (r3 == 0) goto L20
                com.facebook.aura.library.repo.ArtifactSource r1 = r3.source
                if (r1 == 0) goto L20
                r0 = 0
                r6.L$0 = r0
                r6.L$1 = r0
                r6.L$2 = r0
                r6.L$3 = r0
                r6.L$4 = r0
                r6.label = r7
                java.lang.Object r0 = r4.emit(r1, r6)
                if (r0 != r5) goto L20
                return r5
            L6a:
                com.facebook.aura.library.repo.ArtifactsDataSource$touchRecentForSpace$source$1$invokeSuspend$$inlined$mapNotNull$1$2$1 r6 = new com.facebook.aura.library.repo.ArtifactsDataSource$touchRecentForSpace$source$1$invokeSuspend$$inlined$mapNotNull$1$2$1
                r6.<init>(r11)
                goto L12
            L70:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.repo.ArtifactsDataSource$touchRecentForSpace$source$1$invokeSuspend$$inlined$mapNotNull$1.AnonymousClass2.emit(java.lang.Object, X.HtJ):java.lang.Object");
        }
    }

    public ArtifactsDataSource$touchRecentForSpace$source$1$invokeSuspend$$inlined$mapNotNull$1(C20Q c20q, String str) {
        this.$this_unsafeTransform$inlined = c20q;
        this.$slug$inlined = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    @Override // X.C20Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(X.C20Z<? super com.facebook.aura.library.repo.ArtifactSource> r7, X.HtJ r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.library.repo.ArtifactsDataSource$touchRecentForSpace$source$1$invokeSuspend$$inlined$mapNotNull$1.AnonymousClass1
            if (r0 == 0) goto L3f
            r5 = r8
            com.facebook.aura.library.repo.ArtifactsDataSource$touchRecentForSpace$source$1$invokeSuspend$$inlined$mapNotNull$1$1 r5 = (com.facebook.aura.library.repo.ArtifactsDataSource$touchRecentForSpace$source$1$invokeSuspend$$inlined$mapNotNull$1.AnonymousClass1) r5
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
            java.lang.String r0 = r6.$slug$inlined
            com.facebook.aura.library.repo.ArtifactsDataSource$touchRecentForSpace$source$1$invokeSuspend$$inlined$mapNotNull$1$2 r1 = new com.facebook.aura.library.repo.ArtifactsDataSource$touchRecentForSpace$source$1$invokeSuspend$$inlined$mapNotNull$1$2
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
            com.facebook.aura.library.repo.ArtifactsDataSource$touchRecentForSpace$source$1$invokeSuspend$$inlined$mapNotNull$1$1 r5 = new com.facebook.aura.library.repo.ArtifactsDataSource$touchRecentForSpace$source$1$invokeSuspend$$inlined$mapNotNull$1$1
            r5.<init>(r8)
            goto L12
        L45:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.repo.ArtifactsDataSource$touchRecentForSpace$source$1$invokeSuspend$$inlined$mapNotNull$1.collect(X.20Z, X.HtJ):java.lang.Object");
    }
}
