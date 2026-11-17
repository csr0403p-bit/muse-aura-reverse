package X;

import kotlin.Unit;

/* loaded from: classes4.dex */
public final class BU8 extends AbstractC07127nr implements G0V {
    public final int $t;
    public float A00;
    public int A01;
    public Object A02;
    public Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/ASv;FLX/HtJ<-LX/BU8;>;)V */
    public BU8(HtJ htJ, C1051ASv c1051ASv, float f) {
        super(2, htJ);
        this.$t = 1;
        this.A02 = c1051ASv;
        this.A00 = f;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        Object obj2;
        float f;
        Object obj3;
        int i;
        switch (this.$t) {
            case 0:
                BU8 bu8 = new BU8((AOP) this.A03, htJ);
                bu8.A02 = obj;
                return bu8;
            case 1:
                BU8 bu82 = new BU8(htJ, (C1051ASv) this.A02, this.A00);
                bu82.A03 = obj;
                return bu82;
            case 2:
                obj2 = this.A03;
                f = this.A00;
                obj3 = this.A02;
                i = 2;
                break;
            default:
                obj2 = this.A03;
                f = this.A00;
                obj3 = this.A02;
                i = 3;
                break;
        }
        return new BU8(obj3, obj2, htJ, f, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001f A[RETURN] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.$t
            switch(r0) {
                case 0: goto L5f;
                case 1: goto L42;
                case 2: goto L20;
                default: goto L5;
            }
        L5:
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.A01
            r3 = 1
            if (r0 != 0) goto L9b
            X.Hwg.A00(r7)
            java.lang.Object r2 = r6.A03
            androidx.compose.animation.core.SeekableTransitionState r2 = (androidx.compose.animation.core.SeekableTransitionState) r2
            float r1 = r6.A00
            java.lang.Object r0 = r6.A02
            r6.A01 = r3
            java.lang.Object r0 = r2.A0C(r0, r6, r1)
        L1d:
            if (r0 != r5) goto L9e
            return r5
        L20:
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.A01
            r4 = 1
            if (r0 != 0) goto L9b
            X.Hwg.A00(r7)
            java.lang.Object r0 = r6.A03
            X.ATQ r0 = (X.ATQ) r0
            X.AT5<java.lang.Float, X.AOW> r3 = r0.A01
            float r0 = r6.A00
            java.lang.Float r2 = X.C8j3.A0u(r0)
            java.lang.Object r1 = r6.A02
            X.AOc r1 = (X.AOc) r1
            r6.A01 = r4
            r0 = 0
            java.lang.Object r0 = X.AnonymousClass002.A0i(r3, r1, r2, r6, r0)
            goto L1d
        L42:
            int r0 = r6.A01
            if (r0 != 0) goto L5a
            X.Hwg.A00(r7)
            java.lang.Object r2 = r6.A03
            X.3Q0 r2 = (X.C3Q0) r2
            java.lang.Object r1 = r6.A02
            X.ASv r1 = (X.C1051ASv) r1
            float r0 = r6.A00
            float r0 = r2.AcG(r0)
            r1.element = r0
            goto L9e
        L5a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L5f:
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.A01
            r4 = 1
            if (r0 == 0) goto L8b
            float r3 = r6.A00
            java.lang.Object r1 = r6.A02
            X.3UX r1 = (X.C3UX) r1
            X.Hwg.A00(r7)
        L6f:
            boolean r0 = X.Hxb.A04(r1)
            if (r0 == 0) goto L9e
            java.lang.Object r2 = r6.A03
            X.AOP r2 = (X.AOP) r2
            X.AOJ r0 = new X.AOJ
            r0.<init>()
            r6.A02 = r1
            r6.A00 = r3
            r6.A01 = r4
            java.lang.Object r0 = X.AvW.A01(r0, r6)
            if (r0 != r5) goto L6f
            return r5
        L8b:
            X.Hwg.A00(r7)
            java.lang.Object r1 = r6.A02
            X.3UX r1 = (X.C3UX) r1
            X.78T r0 = r1.AEA()
            float r3 = androidx.compose.animation.core.SuspendAnimationKt.A00(r0)
            goto L6f
        L9b:
            X.Hwg.A00(r7)
        L9e:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BU8.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((BU8) C8j3.A1E(obj2, obj, this)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BU8(AOP<S> aop, HtJ<? super BU8> htJ) {
        super(2, htJ);
        this.$t = 0;
        this.A03 = aop;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BU8(Object obj, ATQ atq, float f, AOc<Float> aOc, HtJ<? super BU8> htJ) {
        super(2, f);
        this.$t = htJ;
        this.A03 = atq;
        this.A00 = aOc;
        this.A02 = obj;
    }
}
