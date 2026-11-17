package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC07127nr;
import X.C3UX;
import X.C57m;
import X.F1F;
import X.G0V;
import X.HtJ;
import com.facebook.aura.partners.voice.session.impl.SessionController;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$handleSessionEnded$4$released$1", f = "SessionController.kt", l = {5268}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class SessionController$handleSessionEnded$4$released$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ F1F $connectTimedOut;
    public final /* synthetic */ F1F $isCurrentGeneration;
    public final /* synthetic */ SessionController.CallEndOwnership $ownership;
    public final /* synthetic */ C57m $session;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionController$handleSessionEnded$4$released$1(C57m c57m, SessionController.CallEndOwnership callEndOwnership, F1F f1f, F1F f1f2, HtJ<? super SessionController$handleSessionEnded$4$released$1> htJ) {
        super(2, htJ);
        this.$session = c57m;
        this.$ownership = callEndOwnership;
        this.$isCurrentGeneration = f1f;
        this.$connectTimedOut = f1f2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new SessionController$handleSessionEnded$4$released$1(this.$session, this.$ownership, this.$isCurrentGeneration, this.$connectTimedOut, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0030 A[RETURN] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto Lf
            if (r0 != r3) goto L31
            X.Hwg.A00(r6)
        Lc:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        Lf:
            X.Hwg.A00(r6)
            X.57m r2 = r5.$session
            com.facebook.aura.partners.voice.session.impl.SessionController$CallEndOwnership r0 = r5.$ownership
            boolean r0 = r0.wasActive
            if (r0 == 0) goto L27
            X.F1F r0 = r5.$isCurrentGeneration
            boolean r0 = r0.element
            if (r0 == 0) goto L27
            X.F1F r0 = r5.$connectTimedOut
            boolean r1 = r0.element
            r0 = 1
            if (r1 == 0) goto L28
        L27:
            r0 = 0
        L28:
            r5.label = r3
            java.lang.Object r0 = r2.AXy(r0, r5)
            if (r0 != r4) goto Lc
            return r4
        L31:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.SessionController$handleSessionEnded$4$released$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((SessionController$handleSessionEnded$4$released$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
