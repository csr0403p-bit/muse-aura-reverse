package X;

import androidx.compose.foundation.gestures.AnchoredDraggableKt;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.MutableState;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class BSU implements C1YA {
    public final int $t;
    public final Object A00;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: Multi-variable type inference failed */
    public BSU(Object obj, AnchoredDraggableState<T> anchoredDraggableState, G0U<? super Float, Float> g0u, Function0<Float> function0) {
        this.$t = function0;
        this.A01 = obj;
        this.A00 = g0u;
        this.A02 = anchoredDraggableState;
    }

    @Override // X.C1YA
    public final float A5g(float f, float f2) {
        if (this.$t == 0) {
            return 0.0f;
        }
        PagerState pagerState = (PagerState) this.A02;
        MutableState<C1133Abh> mutableState = pagerState.A0A;
        int i = mutableState.getValue().A04 + mutableState.getValue().A05;
        if (i == 0) {
            return 0.0f;
        }
        int i2 = pagerState.A02;
        if (f < 0.0f) {
            i2++;
        }
        int iA04 = ATD.A04(((int) (f2 / i)) + i2, 0, pagerState.A06());
        mutableState.getValue();
        mutableState.getValue();
        long j = i2;
        long j2 = j - 1;
        if (j2 < 0) {
            j2 = 0;
        }
        int i3 = (int) j2;
        long j3 = j + 1;
        if (j3 > 2147483647L) {
            j3 = 2147483647L;
        }
        int iAbs = Math.abs((ATD.A04(ATD.A04(iA04, i3, (int) j3), 0, pagerState.A06()) - i2) * i) - i;
        if (iAbs < 0 || iAbs == 0) {
            return 0.0f;
        }
        return iAbs * Math.signum(f);
    }

    @Override // X.C1YA
    public final float A5p(float f) {
        float f2;
        if (this.$t == 0) {
            AnchoredDraggableState anchoredDraggableState = (AnchoredDraggableState) this.A01;
            float fA01 = anchoredDraggableState.A01();
            MutableState mutableState = anchoredDraggableState.A09;
            Object objA03 = AnchoredDraggableKt.A03(C8j4.A0T(mutableState), (Function0) this.A02, (G0U) this.A00, fA01, f);
            if (!AnonymousClass003.A1X(objA03, anchoredDraggableState.A03)) {
                objA03 = anchoredDraggableState.A0C.getValue();
            }
            return C8j4.A0T(mutableState).AYD(objA03) - fA01;
        }
        PagerState pagerState = (PagerState) this.A02;
        MutableState<C1133Abh> mutableState2 = pagerState.A0A;
        C2AC c2ac = C8j4.A0V(mutableState2).A0A;
        List<AbZ> list = C8j4.A0V(mutableState2).A0H;
        int size = list.size();
        int i = 0;
        float f3 = Float.NEGATIVE_INFINITY;
        float f4 = Float.POSITIVE_INFINITY;
        while (true) {
            f2 = 0.0f;
            if (i >= size) {
                break;
            }
            AbZ abZ = list.get(i);
            C1133Abh value = mutableState2.getValue();
            EnumC1108AYu enumC1108AYu = value.A09;
            EnumC1108AYu enumC1108AYu2 = EnumC1108AYu.A03;
            InterfaceC1134Abi interfaceC1134Abi = value.A0D;
            int iA0F = (int) C8j5.A0F(C8j3.A0T(interfaceC1134Abi.getWidth(), interfaceC1134Abi.getHeight()), enumC1108AYu, enumC1108AYu2);
            int i2 = -C8j4.A0V(mutableState2).A07;
            int i3 = C8j4.A0V(mutableState2).A01;
            int i4 = C8j4.A0V(mutableState2).A04;
            int i5 = abZ.A01;
            pagerState.A06();
            float fAY9 = i5 - c2ac.AY9(iA0F, i4, i2, i3);
            if (fAY9 <= 0.0f && fAY9 > f3) {
                f3 = fAY9;
            }
            if (fAY9 >= 0.0f && fAY9 < f4) {
                f4 = fAY9;
            }
            i++;
        }
        if (f3 == Float.NEGATIVE_INFINITY) {
            f3 = f4;
        }
        if (f4 == Float.POSITIVE_INFINITY) {
            f4 = f3;
        }
        if (!MutableState.A0A(pagerState.A0P)) {
            if (AbJ.A00(pagerState, f)) {
                f3 = 0.0f;
            }
            f4 = 0.0f;
        }
        if (MutableState.A0A(pagerState.A0O)) {
            f2 = f3;
        } else if (!AbJ.A00(pagerState, f)) {
            f4 = 0.0f;
        }
        Float fValueOf = Float.valueOf(f2);
        Float fValueOf2 = Float.valueOf(f4);
        float fFloatValue = fValueOf.floatValue();
        float fFloatValue2 = fValueOf2.floatValue();
        float fA02 = AnonymousClass001.A02(((G0W) this.A00).invoke(Float.valueOf(f), Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2)));
        if (fA02 == fFloatValue || fA02 == fFloatValue2 || fA02 == 0.0f) {
            if (fA02 == Float.POSITIVE_INFINITY || fA02 == Float.NEGATIVE_INFINITY) {
                return 0.0f;
            }
            return fA02;
        }
        StringBuilder sbA0x = C60O.A0x("Final Snapping Offset Should Be one of ");
        sbA0x.append(fFloatValue);
        C8j3.A1K(sbA0x);
        sbA0x.append(fFloatValue2);
        throw C3cG.A0Q(AnonymousClass001.A0v(" or 0.0", sbA0x));
    }
}
