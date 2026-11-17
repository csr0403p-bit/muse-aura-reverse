package com.facebook.aura.conversation.api;

import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class PrimarySessionIds {
    public static final int $stable = 0;
    public static final PrimarySessionIds INSTANCE = new PrimarySessionIds();

    @DebugMetadata(c = "com.facebook.aura.conversation.api.PrimarySessionIds", f = "PrimarySessionIds.kt", l = {15}, m = "load", v = 2)
    /* renamed from: com.facebook.aura.conversation.api.PrimarySessionIds$load$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PrimarySessionIds.this.load(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0057 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object load(X.AbstractC3358CGz r9, X.HtJ<? super java.lang.String> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.facebook.aura.conversation.api.PrimarySessionIds.AnonymousClass1
            if (r0 == 0) goto L5a
            r7 = r10
            com.facebook.aura.conversation.api.PrimarySessionIds$load$1 r7 = (com.facebook.aura.conversation.api.PrimarySessionIds.AnonymousClass1) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5a
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r0 = r7.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r1 = r7.label
            r5 = 1
            if (r1 == 0) goto L34
            if (r1 != r5) goto L60
            int r4 = r7.I$1
            int r3 = r7.I$0
            java.lang.Object r2 = r7.L$1
            int[] r2 = (int[]) r2
            java.lang.Object r1 = r7.L$0
            X.CGz r9 = X.C60O.A0D(r1, r0)
        L2b:
            if (r0 == 0) goto L2e
            return r0
        L2e:
            int r3 = r3 + 1
            if (r3 < r4) goto L3d
            r6 = 0
            return r6
        L34:
            X.Hwg.A00(r0)
            int[] r2 = X.AnonymousClass005.A1b()
            r4 = 1
            r3 = 0
        L3d:
            r1 = r2[r3]
            if (r1 != 0) goto L65
            com.facebook.aura.conversation.repo.HatchPrimarySessionIdProvider r0 = com.facebook.aura.conversation.repo.HatchPrimarySessionIdProvider.INSTANCE
            com.facebook.aura.conversation.api.PrimarySessionIdSource r0 = r0.source(r9)
            r7.L$0 = r9
            r7.L$1 = r2
            r7.I$0 = r3
            r7.I$1 = r4
            r7.I$2 = r1
            r7.label = r5
            java.lang.Object r0 = r0.loadPrimarySessionId(r7)
            if (r0 != r6) goto L2b
            return r6
        L5a:
            com.facebook.aura.conversation.api.PrimarySessionIds$load$1 r7 = new com.facebook.aura.conversation.api.PrimarySessionIds$load$1
            r7.<init>(r10)
            goto L12
        L60:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L65:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass005.A0c(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.api.PrimarySessionIds.load(X.CGz, X.HtJ):java.lang.Object");
    }
}
