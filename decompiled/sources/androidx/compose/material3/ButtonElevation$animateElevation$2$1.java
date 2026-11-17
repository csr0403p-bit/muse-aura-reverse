package androidx.compose.material3;

import X.AOW;
import X.AT5;
import X.AbstractC07127nr;
import X.C04881Xr;
import X.C1DG;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.InterfaceC04911Xu;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.material3.ButtonElevation$animateElevation$2$1", f = "Button.kt", l = {989, 998}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ButtonElevation$animateElevation$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ AT5<C1DG, AOW> $animatable;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ InterfaceC04911Xu $interaction;
    public final /* synthetic */ float $target;
    public int label;
    public final /* synthetic */ C04881Xr this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/AT5<LX/1DG;LX/AOW;>;FZLX/1Xr;LX/1Xu;LX/HtJ<-Landroidx/compose/material3/ButtonElevation$animateElevation$2$1;>;)V */
    public ButtonElevation$animateElevation$2$1(AT5 at5, InterfaceC04911Xu interfaceC04911Xu, C04881Xr c04881Xr, HtJ htJ, float f, boolean z) {
        super(2, htJ);
        this.$animatable = at5;
        this.$target = f;
        this.$enabled = z;
        this.this$0 = c04881Xr;
        this.$interaction = interfaceC04911Xu;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        AT5<C1DG, AOW> at5 = this.$animatable;
        float f = this.$target;
        boolean z = this.$enabled;
        return new ButtonElevation$animateElevation$2$1(at5, this.$interaction, this.this$0, htJ, f, z);
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((ButtonElevation$animateElevation$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0096, code lost:
    
        if ((r3 instanceof X.C04891Xs) != false) goto L42;
     */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.Hji r2 = X.EnumC10460Hji.A02
            r7 = r2
            int r0 = r8.label
            r6 = 2
            r4 = 1
            if (r0 == 0) goto L12
            if (r0 == r4) goto Lb3
            if (r0 == r6) goto Lb3
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L12:
            X.Hwg.A00(r9)
            X.AT5<X.1DG, X.AOW> r0 = r8.$animatable
            androidx.compose.runtime.MutableState r0 = r0.A0B
            java.lang.Object r0 = r0.getValue()
            X.1DG r0 = (X.C1DG) r0
            float r0 = r0.A00
            float r3 = r8.$target
            boolean r0 = X.C1DG.A08(r0, r3)
            if (r0 != 0) goto Lb6
            boolean r0 = r8.$enabled
            X.AT5<X.1DG, X.AOW> r1 = r8.$animatable
            if (r0 != 0) goto L3d
            X.1DG r0 = new X.1DG
            r0.<init>(r3)
            r8.label = r4
            java.lang.Object r0 = r1.A04(r0, r8)
        L3a:
            if (r0 != r2) goto Lb6
            return r7
        L3d:
            androidx.compose.runtime.MutableState r0 = r1.A0B
            java.lang.Object r0 = r0.getValue()
            X.1DG r0 = (X.C1DG) r0
            float r1 = r0.A00
            r0 = 0
            boolean r0 = X.C1DG.A08(r1, r0)
            r3 = 0
            if (r0 == 0) goto La5
            r0 = 0
            X.AWp r3 = new X.AWp
            r3.<init>(r0)
        L56:
            X.AT5<X.1DG, X.AOW> r4 = r8.$animatable
            float r5 = r8.$target
            X.1Xu r1 = r8.$interaction
            r8.label = r6
            X.ASj<X.1DG> r0 = X.C1qU.A00
            if (r1 == 0) goto L83
            boolean r0 = r1 instanceof X.AWp
            if (r0 != 0) goto L72
            boolean r0 = r1 instanceof X.C1rU
            if (r0 != 0) goto L72
            boolean r0 = r1 instanceof X.C04901Xt
            if (r0 != 0) goto L72
            boolean r0 = r1 instanceof X.C04891Xs
            if (r0 == 0) goto L9b
        L72:
            X.ASj<X.1DG> r3 = X.C1qU.A00
        L74:
            X.1DG r1 = new X.1DG
            r1.<init>(r5)
            r0 = 0
            java.lang.Object r0 = X.AnonymousClass002.A0i(r4, r3, r1, r8, r0)
        L7e:
            if (r0 == r2) goto Lb8
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L3a
        L83:
            if (r3 == 0) goto L9b
            boolean r0 = r3 instanceof X.AWp
            if (r0 != 0) goto L98
            boolean r0 = r3 instanceof X.C1rU
            if (r0 != 0) goto L98
            boolean r0 = r3 instanceof X.C04901Xt
            if (r0 == 0) goto L94
            X.ASj<X.1DG> r3 = X.C1qU.A02
            goto L74
        L94:
            boolean r0 = r3 instanceof X.C04891Xs
            if (r0 == 0) goto L9b
        L98:
            X.ASj<X.1DG> r3 = X.C1qU.A01
            goto L74
        L9b:
            X.1DG r0 = new X.1DG
            r0.<init>(r5)
            java.lang.Object r0 = r4.A04(r0, r8)
            goto L7e
        La5:
            r0 = 1065353216(0x3f800000, float:1.0)
            boolean r0 = X.C1DG.A08(r1, r0)
            if (r0 == 0) goto L56
            X.1Xt r3 = new X.1Xt
            r3.<init>()
            goto L56
        Lb3:
            X.Hwg.A00(r9)
        Lb6:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
        Lb8:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ButtonElevation$animateElevation$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
