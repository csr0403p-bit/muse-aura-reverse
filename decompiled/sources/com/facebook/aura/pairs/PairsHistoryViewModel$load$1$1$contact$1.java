package com.facebook.aura.pairs;

import X.AbstractC07127nr;
import X.C3UX;
import X.G0V;
import X.HtJ;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.pairs.PairsHistoryViewModel$load$1$1$contact$1", f = "PairsHistoryViewModel.kt", l = {113, 114}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class PairsHistoryViewModel$load$1$1$contact$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super PairsContact>, Object> {
    public int label;
    public final /* synthetic */ PairsHistoryViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PairsHistoryViewModel$load$1$1$contact$1(PairsHistoryViewModel pairsHistoryViewModel, HtJ<? super PairsHistoryViewModel$load$1$1$contact$1> htJ) {
        super(2, htJ);
        this.this$0 = pairsHistoryViewModel;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new PairsHistoryViewModel$load$1$1$contact$1(this.this$0, htJ);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super PairsContact> htJ) {
        return new PairsHistoryViewModel$load$1$1$contact$1(this.this$0, htJ).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) throws java.lang.Throwable {
        /*
            r4 = this;
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L2b
            if (r0 == r1) goto L41
            if (r0 != r2) goto L55
            X.Hwg.A00(r5)
        Lf:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            com.facebook.aura.pairs.PairsHistoryViewModel r2 = r4.this$0
            java.util.Iterator r1 = r5.iterator()
        L17:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L53
            java.lang.Object r3 = r1.next()
            r0 = r3
            com.facebook.aura.pairs.PairsContact r0 = (com.facebook.aura.pairs.PairsContact) r0
            boolean r0 = com.facebook.aura.pairs.PairsHistoryViewModel.access$isConversation(r2, r0)
            if (r0 == 0) goto L17
            return r3
        L2b:
            X.Hwg.A00(r5)
            com.facebook.aura.pairs.PairsHistoryViewModel r0 = r4.this$0
            com.facebook.aura.pairs.PairsContact r5 = com.facebook.aura.pairs.PairsHistoryViewModel.access$cachedContact(r0)
            if (r5 != 0) goto L5a
            com.facebook.aura.pairs.PairsHistoryViewModel r0 = r4.this$0
            r4.label = r1
            java.lang.Object r5 = com.facebook.aura.pairs.PairsHistoryViewModel.access$fetchContact(r0, r4)
            if (r5 != r3) goto L44
            return r3
        L41:
            X.Hwg.A00(r5)
        L44:
            if (r5 != 0) goto L5a
            com.facebook.aura.pairs.PairsHistoryViewModel r0 = r4.this$0
            com.facebook.aura.pairs.PairsRepository r0 = r0.repository
            r4.label = r2
            java.lang.Object r5 = r0.contacts(r4)
            if (r5 != r3) goto Lf
            return r3
        L53:
            r3 = 0
            return r3
        L55:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L5a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.PairsHistoryViewModel$load$1$1$contact$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
