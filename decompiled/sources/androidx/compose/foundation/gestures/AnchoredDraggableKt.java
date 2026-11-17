package androidx.compose.foundation.gestures;

import X.AOc;
import X.Aa1;
import X.AcX;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.BTC;
import X.C00q;
import X.C1051ASv;
import X.C1054ATb;
import X.C1154Ack;
import X.C1312Agx;
import X.C1YC;
import X.C2278BSe;
import X.C3UY;
import X.C60O;
import X.C7384Etj;
import X.C8j3;
import X.EnumC10460Hji;
import X.G0U;
import X.HtJ;
import X.InterfaceC1153Acj;
import androidx.compose.animation.core.SuspendAnimationKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class AnchoredDraggableKt {
    public static final G0U<C1312Agx, Boolean> A01 = C2278BSe.A00(29);
    public static final G0U<Integer, Float> A02 = C2278BSe.A00(30);
    public static final C1YC<Float> A00 = new C1054ATb(new C1154Ack());

    /* JADX WARN: Incorrect types in method signature: <I:Ljava/lang/Object;>(Lkotlin/jvm/functions/Function0<+TI;>;LX/G0V<-TI;-LX/HtJ<-Lkotlin/Unit;>;+Ljava/lang/Object;>;LX/HtJ<-Lkotlin/Unit;>;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A04(X.HtJ r5, kotlin.jvm.functions.Function0 r6, X.G0V r7) {
        /*
            r3 = 0
            boolean r0 = r5 instanceof X.C2309BTj
            if (r0 == 0) goto L23
            r4 = r5
            X.BTj r4 = (X.C2309BTj) r4
            int r0 = r4.$t
            if (r0 != r3) goto L23
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r4.A00 = r2
        L17:
            java.lang.Object r1 = r4.A01
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L32
            if (r0 != r2) goto L2d
            goto L29
        L23:
            X.BTj r4 = new X.BTj
            r4.<init>(r3, r5)
            goto L17
        L29:
            X.Hwg.A00(r1)     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L44
            goto L44
        L2d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L32:
            X.Hwg.A00(r1)
            r1 = 0
            X.3bl r0 = new X.3bl     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L44
            r0.<init>(r7, r6, r1, r2)     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L44
            r4.A00 = r2     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L44
            java.lang.Object r0 = X.Hxb.A00(r0, r4)     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L44
            if (r0 != r3) goto L44
            return r3
        L44:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableKt.A04(X.HtJ, kotlin.jvm.functions.Function0, X.G0V):java.lang.Object");
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(Landroidx/compose/foundation/gestures/AnchoredDraggableState<TT;>;TT;FLX/AOc<Ljava/lang/Float;>;LX/1YC<Ljava/lang/Float;>;LX/HtJ<-Ljava/lang/Float;>;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.AOc r12, X.C1YC r13, androidx.compose.foundation.gestures.AnchoredDraggableState r14, java.lang.Object r15, X.HtJ r16, float r17) {
        /*
            r3 = r16
            r11 = r17
            boolean r0 = r3 instanceof X.C1152Aci
            if (r0 == 0) goto L54
            r4 = r3
            X.Aci r4 = (X.C1152Aci) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L54
            int r2 = r2 - r1
            r4.label = r2
        L16:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r1 = r4.label
            r0 = 1
            if (r1 == 0) goto L32
            if (r1 != r0) goto L5a
            float r11 = r4.F$0
            java.lang.Object r10 = r4.L$0
            X.ASv r10 = (X.C1051ASv) r10
            X.Hwg.A00(r3)
        L2a:
            float r0 = r10.element
            float r11 = r11 - r0
            java.lang.Float r2 = X.C8j3.A0u(r11)
            return r2
        L32:
            X.Hwg.A00(r3)
            X.ASv r10 = new X.ASv
            r10.<init>()
            r10.element = r11
            r9 = 0
            androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2 r5 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2
            r6 = r12
            r7 = r13
            r8 = r14
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r4.L$0 = r10
            r4.F$0 = r11
            r4.label = r0
            X.3UY r0 = X.C3UY.A02
            java.lang.Object r0 = r14.A04(r0, r15, r4, r5)
            if (r0 != r2) goto L2a
            return r2
        L54:
            X.Aci r4 = new X.Aci
            r4.<init>(r3)
            goto L16
        L5a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableKt.A00(X.AOc, X.1YC, androidx.compose.foundation.gestures.AnchoredDraggableState, java.lang.Object, X.HtJ, float):java.lang.Object");
    }

    public static /* synthetic */ Object A02(AnchoredDraggableState anchoredDraggableState, Object obj, HtJ htJ) {
        AOc<Float> aOc;
        if (anchoredDraggableState.A04 == null || anchoredDraggableState.A02 == null || (aOc = anchoredDraggableState.A00) == null || anchoredDraggableState.A01 == null) {
            aOc = Aa1.A00;
        }
        Object objA04 = anchoredDraggableState.A04(C3UY.A02, obj, htJ, new AnchoredDraggableKt$animateTo$4(aOc, anchoredDraggableState, null));
        return objA04 != EnumC10460Hji.A02 ? Unit.INSTANCE : objA04;
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(Landroidx/compose/foundation/gestures/AnchoredDraggableState<TT;>;FLX/AcX;LX/Acj<TT;>;TT;LX/AOc<Ljava/lang/Float;>;LX/HtJ<-Lkotlin/Unit;>;)Ljava/lang/Object; */
    public static final Object A01(AOc aOc, AcX acX, AnchoredDraggableState anchoredDraggableState, InterfaceC1153Acj interfaceC1153Acj, Object obj, HtJ htJ, float f) {
        Object objA03;
        float fAYD = interfaceC1153Acj.AYD(obj);
        C1051ASv c1051ASv = new C1051ASv();
        C00q c00q = anchoredDraggableState.A08;
        float fAFn = Float.isNaN(c00q.AFn()) ? 0.0f : c00q.AFn();
        c1051ASv.element = fAFn;
        return (Float.isNaN(fAYD) || fAFn == fAYD || (objA03 = SuspendAnimationKt.A03(aOc, htJ, new BTC(0, acX, c1051ASv), fAFn, fAYD, f)) != EnumC10460Hji.A02) ? Unit.INSTANCE : objA03;
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;>(LX/Acj<TT;>;FFLX/G0U<-Ljava/lang/Float;Ljava/lang/Float;>;Lkotlin/jvm/functions/Function0<Ljava/lang/Float;>;)TT; */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object A03(InterfaceC1153Acj interfaceC1153Acj, Function0 function0, G0U g0u, float f, float f2) {
        Object objA6U;
        if (Float.isNaN(f)) {
            throw C60O.A0i("The offset provided to computeTarget must not be NaN.");
        }
        float fAbs = Math.abs(f2);
        if (fAbs > 0.0f) {
            boolean zA1N = AnonymousClass002.A1N((f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1)));
            if (fAbs < Math.abs(AnonymousClass003.A04(function0))) {
                objA6U = interfaceC1153Acj.A6V(f, false);
                C7384Etj.A0X(objA6U);
                float fAYD = interfaceC1153Acj.AYD(objA6U);
                Object objA6V = interfaceC1153Acj.A6V(f, true);
                C7384Etj.A0X(objA6V);
                float fAYD2 = interfaceC1153Acj.AYD(objA6V);
                float fAbs2 = Math.abs(AnonymousClass001.A02(g0u.invoke(Float.valueOf(C8j3.A01(fAYD, fAYD2)))));
                if (!zA1N) {
                    fAYD = fAYD2;
                }
                if (C8j3.A01(fAYD, f) >= fAbs2) {
                    if (!zA1N) {
                        return objA6U;
                    }
                } else if (zA1N) {
                    return objA6U;
                }
                return objA6V;
            }
            objA6U = interfaceC1153Acj.A6V(f, zA1N);
        } else {
            objA6U = interfaceC1153Acj.A6U(f);
        }
        C7384Etj.A0X(objA6U);
        return objA6U;
    }
}
