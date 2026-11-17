package com.facebook.aura.library.repo;

import X.AHG;
import X.C20Q;
import X.C20Z;
import X.HtJ;
import X.HzP;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class HatchGoalsTabDataSource$special$$inlined$map$4 implements C20Q<AHG<? extends String>> {
    public final /* synthetic */ C20Q $this_unsafeTransform$inlined;

    @DebugMetadata(c = "com.facebook.aura.library.repo.HatchGoalsTabDataSource$special$$inlined$map$4", f = "HatchGoalsTabDataSource.kt", l = {HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX}, m = "collect", v = 2)
    /* renamed from: com.facebook.aura.library.repo.HatchGoalsTabDataSource$special$$inlined$map$4$1, reason: invalid class name */
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
            return HatchGoalsTabDataSource$special$$inlined$map$4.this.collect(null, this);
        }
    }

    /* renamed from: com.facebook.aura.library.repo.HatchGoalsTabDataSource$special$$inlined$map$4$2, reason: invalid class name */
    public final class AnonymousClass2<T> implements C20Z {
        public final /* synthetic */ C20Z $this_unsafeFlow;

        @DebugMetadata(c = "com.facebook.aura.library.repo.HatchGoalsTabDataSource$special$$inlined$map$4$2", f = "HatchGoalsTabDataSource.kt", l = {217}, m = "emit", v = 2)
        /* renamed from: com.facebook.aura.library.repo.HatchGoalsTabDataSource$special$$inlined$map$4$2$1, reason: invalid class name */
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

        public AnonymousClass2(C20Z c20z) {
            this.$this_unsafeFlow = c20z;
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
        @Override // X.C20Z
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r9, X.HtJ r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof com.facebook.aura.library.repo.HatchGoalsTabDataSource$special$$inlined$map$4.AnonymousClass2.AnonymousClass1
                if (r0 == 0) goto L78
                r6 = r10
                com.facebook.aura.library.repo.HatchGoalsTabDataSource$special$$inlined$map$4$2$1 r6 = (com.facebook.aura.library.repo.HatchGoalsTabDataSource$special$$inlined$map$4.AnonymousClass2.AnonymousClass1) r6
                int r2 = r6.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r2 & r1
                if (r0 == 0) goto L78
                int r2 = r2 - r1
                r6.label = r2
            L12:
                java.lang.Object r1 = r6.result
                X.Hji r5 = X.EnumC10460Hji.A02
                int r0 = r6.label
                r7 = 1
                if (r0 == 0) goto L23
                if (r0 != r7) goto L7e
                X.Hwg.A00(r1)
            L20:
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
            L23:
                X.Hwg.A00(r1)
                X.20Z r8 = r8.$this_unsafeFlow
                java.util.Map r9 = (java.util.Map) r9
                java.util.Collection r0 = r9.values()
                java.util.ArrayList r4 = X.C3cG.A0h()
                java.util.Iterator r3 = r0.iterator()
            L36:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L62
                java.lang.Object r0 = r3.next()
                com.facebook.aura.library.repo.GoalToggleState r0 = (com.facebook.aura.library.repo.GoalToggleState) r0
                X.AHH<com.facebook.aura.library.repo.GoalToggleIntent> r0 = r0.queued
                java.util.ArrayList r2 = X.AnonymousClass003.A0i(r0)
                java.util.Iterator r1 = r0.iterator()
            L4c:
                boolean r0 = r1.hasNext()
                if (r0 == 0) goto L5e
                java.lang.Object r0 = r1.next()
                com.facebook.aura.library.repo.GoalToggleIntent r0 = (com.facebook.aura.library.repo.GoalToggleIntent) r0
                java.lang.String r0 = r0.goalId
                r2.add(r0)
                goto L4c
            L5e:
                X.AbstractC0882AGj.A0r(r2, r4)
                goto L36
            L62:
                X.AHG r1 = X.AGI.A0H(r4)
                r0 = 0
                r6.L$0 = r0
                r6.L$1 = r0
                r6.L$2 = r0
                r6.L$3 = r0
                r6.label = r7
                java.lang.Object r0 = r8.emit(r1, r6)
                if (r0 != r5) goto L20
                return r5
            L78:
                com.facebook.aura.library.repo.HatchGoalsTabDataSource$special$$inlined$map$4$2$1 r6 = new com.facebook.aura.library.repo.HatchGoalsTabDataSource$special$$inlined$map$4$2$1
                r6.<init>(r10)
                goto L12
            L7e:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.repo.HatchGoalsTabDataSource$special$$inlined$map$4.AnonymousClass2.emit(java.lang.Object, X.HtJ):java.lang.Object");
        }
    }

    public HatchGoalsTabDataSource$special$$inlined$map$4(C20Q c20q) {
        this.$this_unsafeTransform$inlined = c20q;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    @Override // X.C20Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(X.C20Z<? super X.AHG<? extends java.lang.String>> r7, X.HtJ r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.library.repo.HatchGoalsTabDataSource$special$$inlined$map$4.AnonymousClass1
            if (r0 == 0) goto L3d
            r5 = r8
            com.facebook.aura.library.repo.HatchGoalsTabDataSource$special$$inlined$map$4$1 r5 = (com.facebook.aura.library.repo.HatchGoalsTabDataSource$special$$inlined$map$4.AnonymousClass1) r5
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
            com.facebook.aura.library.repo.HatchGoalsTabDataSource$special$$inlined$map$4$2 r1 = new com.facebook.aura.library.repo.HatchGoalsTabDataSource$special$$inlined$map$4$2
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
            com.facebook.aura.library.repo.HatchGoalsTabDataSource$special$$inlined$map$4$1 r5 = new com.facebook.aura.library.repo.HatchGoalsTabDataSource$special$$inlined$map$4$1
            r5.<init>(r8)
            goto L12
        L43:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.repo.HatchGoalsTabDataSource$special$$inlined$map$4.collect(X.20Z, X.HtJ):java.lang.Object");
    }
}
