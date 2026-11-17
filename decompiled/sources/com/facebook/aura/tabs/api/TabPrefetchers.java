package com.facebook.aura.tabs.api;

import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class TabPrefetchers {
    public static final TabPrefetchers INSTANCE = new TabPrefetchers();

    @DebugMetadata(c = "com.facebook.aura.tabs.api.TabPrefetchers", f = "TabPrefetchers.kt", l = {20}, m = "prefetch", v = 2)
    /* renamed from: com.facebook.aura.tabs.api.TabPrefetchers$prefetch$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TabPrefetchers.this.prefetch(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object prefetch(com.facebook.aura.navigation.AuraTabRootNavKey r7, X.AbstractC3358CGz r8, X.HtJ<? super kotlin.Unit> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.facebook.aura.tabs.api.TabPrefetchers.AnonymousClass1
            if (r0 == 0) goto L8a
            r4 = r9
            com.facebook.aura.tabs.api.TabPrefetchers$prefetch$1 r4 = (com.facebook.aura.tabs.api.TabPrefetchers.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8a
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r5 = 1
            if (r0 == 0) goto L49
            if (r0 != r5) goto L93
            java.lang.Object r2 = r4.L$3
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r0 = r4.L$1
            X.CGz r8 = X.C60O.A0D(r0, r1)
        L27:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L90
            java.lang.Object r1 = r2.next()
            com.facebook.aura.tabs.api.TabPrefetcher r1 = (com.facebook.aura.tabs.api.TabPrefetcher) r1
            r0 = 0
            r4.L$0 = r0
            r4.L$1 = r8
            r4.L$2 = r0
            r4.L$3 = r2
            r4.L$4 = r0
            r4.L$5 = r0
            r4.label = r5
            java.lang.Object r0 = r1.prefetch(r8, r4)
            if (r0 != r6) goto L27
            return r6
        L49:
            X.Hwg.A00(r1)
            r2 = 0
            int[] r0 = new int[]{r2}
            java.util.ArrayList r1 = X.C60O.A11(r5)
            r0 = r0[r2]
            if (r0 != 0) goto L98
            com.facebook.aura.pairs.ConnectionsTabPrefetchProvider r0 = com.facebook.aura.pairs.ConnectionsTabPrefetchProvider.INSTANCE
            com.facebook.aura.tabs.api.TabPrefetcher r0 = r0.prefetcher()
            r1.add(r0)
            java.util.ArrayList r3 = X.C3cG.A0h()
            java.util.Iterator r2 = r1.iterator()
        L6a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L85
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.facebook.aura.tabs.api.TabPrefetcher r0 = (com.facebook.aura.tabs.api.TabPrefetcher) r0
            com.facebook.aura.navigation.AuraTabRootNavKey r0 = r0.getTabRoot()
            boolean r0 = X.C7384Etj.areEqual(r0, r7)
            if (r0 == 0) goto L6a
            r3.add(r1)
            goto L6a
        L85:
            java.util.Iterator r2 = r3.iterator()
            goto L27
        L8a:
            com.facebook.aura.tabs.api.TabPrefetchers$prefetch$1 r4 = new com.facebook.aura.tabs.api.TabPrefetchers$prefetch$1
            r4.<init>(r9)
            goto L12
        L90:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L93:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L98:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass005.A0c(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.tabs.api.TabPrefetchers.prefetch(com.facebook.aura.navigation.AuraTabRootNavKey, X.CGz, X.HtJ):java.lang.Object");
    }
}
