package com.facebook.aura.explore.api;

import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class IdeaConnectionNames {
    public static final IdeaConnectionNames INSTANCE = new IdeaConnectionNames();

    @DebugMetadata(c = "com.facebook.aura.explore.api.IdeaConnectionNames", f = "IdeaConnectionNames.kt", l = {18}, m = "names", v = 2)
    /* renamed from: com.facebook.aura.explore.api.IdeaConnectionNames$names$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return IdeaConnectionNames.this.names(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0061 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object names(X.AbstractC3358CGz r8, java.util.List<java.lang.String> r9, X.HtJ<? super java.util.List<java.lang.String>> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.facebook.aura.explore.api.IdeaConnectionNames.AnonymousClass1
            if (r0 == 0) goto L82
            r4 = r10
            com.facebook.aura.explore.api.IdeaConnectionNames$names$1 r4 = (com.facebook.aura.explore.api.IdeaConnectionNames.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L82
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r5 = 1
            if (r0 == 0) goto L64
            if (r0 != r5) goto L92
            java.lang.Object r7 = r4.L$5
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r3 = r4.L$4
            java.util.Collection r3 = (java.util.Collection) r3
            java.lang.Object r9 = r4.L$1
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r0 = r4.L$0
            X.CGz r8 = X.C60O.A0D(r0, r1)
        L2f:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            X.AbstractC0882AGj.A0r(r1, r3)
        L34:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L8d
            java.lang.Object r0 = r7.next()
            int r2 = X.AnonymousClass001.A0F(r0)
            if (r2 != 0) goto L88
            com.facebook.aura.pairs.ConnectionsIdeaNamesProvider r0 = com.facebook.aura.pairs.ConnectionsIdeaNamesProvider.INSTANCE
            com.facebook.aura.explore.api.IdeaConnectionNamesResolver r1 = r0.resolver(r8)
            r4.L$0 = r8
            r4.L$1 = r9
            r0 = 0
            r4.L$2 = r0
            r4.L$3 = r0
            r4.L$4 = r3
            r4.L$5 = r7
            r4.L$6 = r0
            r4.I$0 = r2
            r4.label = r5
            java.lang.Object r1 = r1.names(r9, r4)
            if (r1 != r6) goto L2f
            return r6
        L64:
            X.Hwg.A00(r1)
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L70
            X.AGi r6 = X.C0881AGi.A00
            return r6
        L70:
            int[] r1 = X.AnonymousClass005.A1b()
            X.DFI r0 = new X.DFI
            r0.<init>(r1, r5)
            java.util.ArrayList r3 = X.C3cG.A0h()
            java.util.Iterator r7 = r0.iterator()
            goto L34
        L82:
            com.facebook.aura.explore.api.IdeaConnectionNames$names$1 r4 = new com.facebook.aura.explore.api.IdeaConnectionNames$names$1
            r4.<init>(r10)
            goto L12
        L88:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass005.A0c(r2)
            throw r0
        L8d:
            java.util.List r6 = X.AbstractC0878AGe.A0T(r3)
            return r6
        L92:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.explore.api.IdeaConnectionNames.names(X.CGz, java.util.List, X.HtJ):java.lang.Object");
    }
}
