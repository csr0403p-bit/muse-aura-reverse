package X;

import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import java.util.concurrent.CancellationException;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class BUG extends AbstractC07127nr implements G0V {
    public final int $t = 1;
    public int A00;
    public Object A01;
    public Object A02;
    public final float A03;
    public final Object A04;
    public final Object A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (FLX/AcI;LX/3Q0;LX/HtJ<-LX/BUG;>;)V */
    public BUG(AcI acI, C3Q0 c3q0, HtJ htJ, float f) {
        super(2, htJ);
        this.A03 = f;
        this.A05 = acI;
        this.A04 = c3q0;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        float f;
        C1051ASv c1051ASv;
        AT7 at7A00;
        C1051ASv c1051ASv2;
        String str;
        Object objA01 = obj;
        int i = this.$t;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        if (i == 0) {
            int i2 = this.A00;
            try {
            } catch (CancellationException unused) {
                c1051ASv.element = AT7.A00(at7A00);
            }
            if (i2 == 0) {
                Hwg.A00(obj);
                f = this.A03;
                if (Math.abs(f) > 1.0f) {
                    c1051ASv = new C1051ASv();
                    c1051ASv.element = f;
                    C1051ASv c1051ASv3 = new C1051ASv();
                    at7A00 = ATB.A00(0.0f, f);
                    AcI acI = (AcI) this.A05;
                    C1YC<Float> c1yc = acI.A01;
                    BTX btx = new BTX(c1051ASv3, this.A04, c1051ASv, acI, 3);
                    this.A01 = c1051ASv;
                    this.A02 = at7A00;
                    this.A00 = 1;
                    if (SuspendAnimationKt.A04(at7A00, c1yc, this, btx, false) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                }
                return C8j3.A0u(f);
            }
            if (i2 != 1) {
                throw AnonymousClass001.A0n();
            }
            at7A00 = (AT7) this.A02;
            c1051ASv = (C1051ASv) this.A01;
            Hwg.A00(obj);
            f = c1051ASv.element;
            return C8j3.A0u(f);
        }
        int i3 = this.A00;
        if (i3 == 0) {
            Hwg.A00(obj);
            SnapFlingBehavior snapFlingBehavior = (SnapFlingBehavior) this.A05;
            C1YC<Float> c1yc2 = snapFlingBehavior.A02;
            float f2 = this.A03;
            float fA5g = snapFlingBehavior.A03.A5g(f2, AbstractC1053ATa.A00(c1yc2, 0.0f, f2));
            if (Float.isNaN(fA5g)) {
                str = "calculateApproachOffset returned NaN. Please use a valid value.";
                throw C3cG.A0Q(str);
            }
            c1051ASv2 = new C1051ASv();
            float fAbs = Math.abs(fA5g) * Math.signum(f2);
            c1051ASv2.element = fAbs;
            G0U g0u = (G0U) this.A04;
            g0u.invoke(C8j3.A0u(fAbs));
            C3Q0 c3q0 = (C3Q0) this.A01;
            float f3 = c1051ASv2.element;
            BTA btaA01 = BTA.A01(g0u, c1051ASv2, 21);
            this.A02 = c1051ASv2;
            this.A00 = 1;
            objA01 = SnapFlingBehavior.A01(c3q0, snapFlingBehavior, this, btaA01, f3, f2);
            if (objA01 == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i3 != 1) {
                Hwg.A00(obj);
            }
            c1051ASv2 = (C1051ASv) this.A02;
            Hwg.A00(obj);
        }
        AT7 at7 = (AT7) objA01;
        SnapFlingBehavior snapFlingBehavior2 = (SnapFlingBehavior) this.A05;
        float fA5p = snapFlingBehavior2.A03.A5p(AT7.A00(at7));
        if (Float.isNaN(fA5p)) {
            str = "calculateSnapOffset returned NaN. Please use a valid value.";
            throw C3cG.A0Q(str);
        }
        c1051ASv2.element = fA5p;
        C3Q0 c3q02 = (C3Q0) this.A01;
        AT7 at7A01 = ATB.A01(at7, 0.0f, 0.0f, 30);
        AOc<Float> aOc = snapFlingBehavior2.A01;
        BTA btaA012 = BTA.A01(this.A04, c1051ASv2, 22);
        this.A02 = null;
        this.A00 = 2;
        objA01 = SnapFlingBehaviorKt.A00(aOc, at7A01, c3q02, this, btaA012, fA5p, fA5p);
        return objA01 == enumC10460Hji ? enumC10460Hji : objA01;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        if (this.$t == 0) {
            return new BUG((AcI) this.A05, (C3Q0) this.A04, htJ, this.A03);
        }
        SnapFlingBehavior snapFlingBehavior = (SnapFlingBehavior) this.A05;
        float f = this.A03;
        return new BUG((C3Q0) this.A01, snapFlingBehavior, htJ, (G0U) this.A04, f);
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((BUG) C8j3.A1E(obj2, obj, this)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;FLX/G0U<-Ljava/lang/Float;Lkotlin/Unit;>;LX/3Q0;LX/HtJ<-LX/BUG;>;)V */
    public BUG(C3Q0 c3q0, SnapFlingBehavior snapFlingBehavior, HtJ htJ, G0U g0u, float f) {
        super(2, htJ);
        this.A05 = snapFlingBehavior;
        this.A03 = f;
        this.A04 = g0u;
        this.A01 = c3q0;
    }
}
