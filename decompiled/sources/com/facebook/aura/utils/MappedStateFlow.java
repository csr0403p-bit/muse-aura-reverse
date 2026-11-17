package com.facebook.aura.utils;

import X.AnonymousClass003;
import X.C1BN;
import X.G0U;
import X.HtJ;
import X.HzP;
import java.util.Collections;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class MappedStateFlow<T, R> implements C1BN<R> {
    public static final int $stable = 8;
    public final G0U<T, R> map;
    public final C1BN<T> stateFlow;

    @DebugMetadata(c = "com.facebook.aura.utils.MappedStateFlow", f = "HatchFlowUtil.kt", l = {31}, m = "collect", v = 2)
    /* renamed from: com.facebook.aura.utils.MappedStateFlow$collect$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;
        public final /* synthetic */ MappedStateFlow<T, R> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MappedStateFlow<T, R> mappedStateFlow, HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
            this.this$0 = mappedStateFlow;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.collect(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    @Override // X.C22I, X.C20Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(X.C20Z<? super R> r7, X.HtJ<?> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.facebook.aura.utils.MappedStateFlow.AnonymousClass1
            if (r0 == 0) goto L22
            r5 = r8
            com.facebook.aura.utils.MappedStateFlow$collect$1 r5 = (com.facebook.aura.utils.MappedStateFlow.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L28
            if (r0 == r3) goto L44
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L22:
            com.facebook.aura.utils.MappedStateFlow$collect$1 r5 = new com.facebook.aura.utils.MappedStateFlow$collect$1
            r5.<init>(r6, r8)
            goto L12
        L28:
            X.Hwg.A00(r1)
            X.1BN<T> r2 = r6.stateFlow
            X.G0U<T, R> r1 = r6.map
            com.facebook.aura.utils.MappedStateFlow$collect$$inlined$map$1 r0 = new com.facebook.aura.utils.MappedStateFlow$collect$$inlined$map$1
            r0.<init>(r2, r1)
            X.20Q r1 = X.GDB.A01(r0)
            r0 = 0
            r5.L$0 = r0
            r5.label = r3
            java.lang.Object r0 = r1.collect(r7, r5)
            if (r0 != r4) goto L47
            return r4
        L44:
            X.Hwg.A00(r1)
        L47:
            java.lang.String r0 = "MappedStateFlow.collect() should never return!"
            java.lang.IllegalStateException r0 = X.C3cG.A0Q(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.utils.MappedStateFlow.collect(X.20Z, X.HtJ):java.lang.Object");
    }

    @Override // X.C1BN
    public R getValue() {
        return (R) this.map.invoke(this.stateFlow.getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MappedStateFlow(C1BN<? extends T> c1bn, G0U<? super T, ? extends R> g0u) {
        AnonymousClass003.A0u(c1bn, g0u);
        this.stateFlow = c1bn;
        this.map = g0u;
    }

    @Override // X.C22I
    public List<R> getReplayCache() {
        return Collections.singletonList(getValue());
    }
}
