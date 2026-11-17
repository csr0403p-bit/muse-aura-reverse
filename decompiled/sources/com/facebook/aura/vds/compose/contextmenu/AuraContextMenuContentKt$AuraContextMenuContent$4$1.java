package com.facebook.aura.vds.compose.contextmenu;

import X.AbstractC07127nr;
import X.C1518AkS;
import X.C3UX;
import X.G0V;
import X.HtJ;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.vds.compose.contextmenu.AuraContextMenuContentKt$AuraContextMenuContent$4$1", f = "AuraContextMenuContent.kt", l = {149, 154}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class AuraContextMenuContentKt$AuraContextMenuContent$4$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1518AkS $focusRequester;
    public Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraContextMenuContentKt$AuraContextMenuContent$4$1(C1518AkS c1518AkS, HtJ<? super AuraContextMenuContentKt$AuraContextMenuContent$4$1> htJ) {
        super(2, htJ);
        this.$focusRequester = c1518AkS;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new AuraContextMenuContentKt$AuraContextMenuContent$4$1(this.$focusRequester, htJ);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|2|(1:23)|(1:(1:(4:17|18|21|22)(2:7|8))(1:9))(2:10|(1:12))|25|13|21|22) */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        r7.L$0 = null;
        r7.label = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        if (X.C7Bq.A01(250, r7) == r6) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        return r6;
     */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.Hji r6 = X.EnumC10460Hji.A02
            int r5 = r7.label
            r4 = 0
            r1 = 250(0xfa, double:1.235E-321)
            r3 = 2
            r0 = 1
            if (r5 == 0) goto L19
            if (r5 == r0) goto L15
            if (r5 != r3) goto L10
            goto L36
        L10:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L15:
            X.Hwg.A00(r8)
            goto L25
        L19:
            X.Hwg.A00(r8)
            r7.label = r0
            java.lang.Object r0 = X.C7Bq.A01(r1, r7)
            if (r0 != r6) goto L25
            return r6
        L25:
            X.AkS r0 = r7.$focusRequester     // Catch: java.lang.IllegalStateException -> L2b
            X.C1518AkS.A00(r0)     // Catch: java.lang.IllegalStateException -> L2b
            goto L4f
        L2b:
            r7.L$0 = r4     // Catch: java.lang.IllegalStateException -> L3f
            r7.label = r3     // Catch: java.lang.IllegalStateException -> L3f
            java.lang.Object r0 = X.C7Bq.A01(r1, r7)     // Catch: java.lang.IllegalStateException -> L3f
            if (r0 != r6) goto L39
            return r6
        L36:
            X.Hwg.A00(r8)     // Catch: java.lang.IllegalStateException -> L3f
        L39:
            X.AkS r0 = r7.$focusRequester     // Catch: java.lang.IllegalStateException -> L3f
            X.C1518AkS.A00(r0)     // Catch: java.lang.IllegalStateException -> L3f
            goto L4f
        L3f:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            java.lang.String r0 = "Can't request focus on AuraContextMenuContent "
            java.lang.String r1 = X.FGI.A0M(r0, r1)
            java.lang.String r0 = "AuraContextMenuContent"
            X.CFK.A04(r0, r1)
        L4f:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.contextmenu.AuraContextMenuContentKt$AuraContextMenuContent$4$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return new AuraContextMenuContentKt$AuraContextMenuContent$4$1(this.$focusRequester, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
