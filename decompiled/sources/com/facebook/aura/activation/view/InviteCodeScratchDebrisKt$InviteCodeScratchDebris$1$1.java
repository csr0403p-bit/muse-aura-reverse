package com.facebook.aura.activation.view;

import X.AbstractC07127nr;
import X.C00r;
import X.C3UX;
import X.G0V;
import X.HtJ;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.activation.view.InviteCodeScratchDebrisKt$InviteCodeScratchDebris$1$1", f = "InviteCodeScratchDebris.kt", l = {200, 202}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class InviteCodeScratchDebrisKt$InviteCodeScratchDebris$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C00r $frameTick$delegate;
    public final /* synthetic */ InviteCodeScratchDebrisState $state;
    public Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InviteCodeScratchDebrisKt$InviteCodeScratchDebris$1$1(InviteCodeScratchDebrisState inviteCodeScratchDebrisState, C00r c00r, HtJ<? super InviteCodeScratchDebrisKt$InviteCodeScratchDebris$1$1> htJ) {
        super(2, htJ);
        this.$state = inviteCodeScratchDebrisState;
        this.$frameTick$delegate = c00r;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new InviteCodeScratchDebrisKt$InviteCodeScratchDebris$1$1(this.$state, this.$frameTick$delegate, htJ);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0049 -> B:7:0x0013). Please report as a decompilation issue!!! */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L4c
            if (r0 == r3) goto L3a
            if (r0 != r4) goto L50
            java.lang.Object r2 = r6.L$0
            com.facebook.aura.activation.view.InviteCodeScratchDebrisState r2 = (com.facebook.aura.activation.view.InviteCodeScratchDebrisState) r2
            X.Hwg.A00(r7)
        L13:
            java.lang.Number r7 = (java.lang.Number) r7
            long r0 = r7.longValue()
            boolean r2 = r2.advance(r0)
            X.00r r0 = r6.$frameTick$delegate
            int r0 = r0.AGd()
            X.00r r1 = r6.$frameTick$delegate
            int r0 = r0 + 1
            r1.AdX(r0)
            if (r2 != 0) goto L3d
        L2c:
            com.facebook.aura.activation.view.InviteCodeScratchDebrisState r1 = r6.$state
            r0 = 0
            r6.L$0 = r0
            r6.label = r3
            java.lang.Object r0 = r1.awaitEmission(r6)
            if (r0 != r5) goto L3d
            return r5
        L3a:
            X.Hwg.A00(r7)
        L3d:
            com.facebook.aura.activation.view.InviteCodeScratchDebrisState r2 = r6.$state
            com.facebook.aura.activation.view.InviteCodeScratchDebrisKt$InviteCodeScratchDebris$1$1$hasParticles$1 r0 = com.facebook.aura.activation.view.InviteCodeScratchDebrisKt$InviteCodeScratchDebris$1$1$hasParticles$1.INSTANCE
            r6.L$0 = r2
            r6.label = r4
            java.lang.Object r7 = X.AvW.A01(r0, r6)
            if (r7 != r5) goto L13
            return r5
        L4c:
            X.Hwg.A00(r7)
            goto L2c
        L50:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.activation.view.InviteCodeScratchDebrisKt$InviteCodeScratchDebris$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((InviteCodeScratchDebrisKt$InviteCodeScratchDebris$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
