package com.facebook.aura.feed.view;

import X.AbstractC07127nr;
import X.C20Z;
import X.G0V;
import X.HtJ;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.feed.view.FeedPostInformationKt$FeedPostInformationButton$clock$1$1", f = "FeedPostInformation.kt", l = {56, 57}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class FeedPostInformationKt$FeedPostInformationButton$clock$1$1 extends AbstractC07127nr implements G0V<C20Z<? super Long>, HtJ<? super Unit>, Object> {
    public /* synthetic */ Object L$0;
    public int label;

    public FeedPostInformationKt$FeedPostInformationButton$clock$1$1(HtJ<? super FeedPostInformationKt$FeedPostInformationButton$clock$1$1> htJ) {
        super(2, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        FeedPostInformationKt$FeedPostInformationButton$clock$1$1 feedPostInformationKt$FeedPostInformationButton$clock$1$1 = new FeedPostInformationKt$FeedPostInformationButton$clock$1$1(htJ);
        feedPostInformationKt$FeedPostInformationButton$clock$1$1.L$0 = obj;
        return feedPostInformationKt$FeedPostInformationButton$clock$1$1;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x003a -> B:9:0x0018). Please report as a decompilation issue!!! */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r6 = r7.L$0
            X.20Z r6 = (X.C20Z) r6
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L15
            if (r0 == r3) goto L2c
            if (r0 == r4) goto L15
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L15:
            X.Hwg.A00(r8)
        L18:
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r1)
            r7.L$0 = r6
            r7.label = r3
            java.lang.Object r0 = r6.emit(r0, r7)
            if (r0 != r5) goto L2f
            return r5
        L2c:
            X.Hwg.A00(r8)
        L2f:
            r7.L$0 = r6
            r7.label = r4
            r0 = 60000(0xea60, double:2.9644E-319)
            java.lang.Object r0 = X.C7Bq.A01(r0, r7)
            if (r0 != r5) goto L18
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.feed.view.FeedPostInformationKt$FeedPostInformationButton$clock$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(C20Z<? super Long> c20z, HtJ<? super Unit> htJ) {
        FeedPostInformationKt$FeedPostInformationButton$clock$1$1 feedPostInformationKt$FeedPostInformationButton$clock$1$1 = new FeedPostInformationKt$FeedPostInformationButton$clock$1$1(htJ);
        feedPostInformationKt$FeedPostInformationButton$clock$1$1.L$0 = c20z;
        return feedPostInformationKt$FeedPostInformationButton$clock$1$1.invokeSuspend(Unit.INSTANCE);
    }
}
