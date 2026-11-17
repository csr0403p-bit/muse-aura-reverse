package androidx.compose.foundation.gestures;

import X.AGE;
import X.AOc;
import X.ATD;
import X.AbstractC1798ArH;
import X.C00q;
import X.C0881AGi;
import X.C1150Acf;
import X.C1151Ach;
import X.C1BO;
import X.C1YC;
import X.C2278BSe;
import X.C3cG;
import X.C5WW;
import X.C7384Etj;
import X.C8j4;
import X.G0U;
import X.Hs1;
import X.InterfaceC1153Acj;
import X.InterfaceC2261BLa;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import kotlin.Deprecated;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AnchoredDraggableState<T> {
    public AOc<Float> A00;
    public C1YC<Float> A01;
    public Function0<Float> A02;
    public G0U<? super T, Boolean> A03;
    public G0U<? super Float, Float> A04;
    public final C5WW A05 = new C5WW();
    public final C1151Ach A06;
    public final C00q A07;
    public final C00q A08;
    public final MutableState A09;
    public final MutableState A0A;
    public final MutableState A0B;
    public final MutableState A0C;
    public final C1BO A0D;
    public final C1BO A0E;

    /* JADX WARN: Incorrect types in method signature: (TT;LX/3UY;LX/G2j<-LX/AcX;-LX/Acj<TT;>;-TT;-LX/HtJ<-Lkotlin/Unit;>;+Ljava/lang/Object;>;LX/HtJ<-Lkotlin/Unit;>;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A04(X.C3UY r10, java.lang.Object r11, X.HtJ r12, X.G2j r13) {
        /*
            r9 = this;
            r4 = 2
            boolean r0 = r12 instanceof X.C2310BTk
            r5 = r9
            if (r0 == 0) goto L25
            r3 = r12
            X.BTk r3 = (X.C2310BTk) r3
            int r0 = r3.$t
            if (r0 != r4) goto L25
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L25
            int r2 = r2 - r1
            r3.A00 = r2
        L18:
            java.lang.Object r1 = r3.A01
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r3.A00
            r9 = 1
            r8 = 0
            if (r0 == 0) goto L34
            if (r0 != r9) goto L2f
            goto L2b
        L25:
            X.BTk r3 = new X.BTk
            r3.<init>(r9, r12, r4)
            goto L18
        L2b:
            X.Hwg.A00(r1)     // Catch: java.lang.Throwable -> L60
            goto L5a
        L2f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L34:
            X.Hwg.A00(r1)
            androidx.compose.runtime.MutableState r0 = r5.A09
            X.Acj r0 = X.C8j4.A0T(r0)
            X.Acf r0 = (X.C1150Acf) r0
            java.util.List<T> r0 = r0.A01
            r6 = r11
            int r1 = r0.indexOf(r11)
            r0 = -1
            if (r1 == r0) goto L67
            X.5WW r0 = r5.A05     // Catch: java.lang.Throwable -> L60
            X.BUB r4 = new X.BUB     // Catch: java.lang.Throwable -> L60
            r7 = r13
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L60
            r3.A00 = r9     // Catch: java.lang.Throwable -> L60
            java.lang.Object r0 = r0.A01(r10, r3, r4)     // Catch: java.lang.Throwable -> L60
            if (r0 != r2) goto L5a
            return r2
        L5a:
            androidx.compose.runtime.MutableState r0 = r5.A0B
            r0.Af8(r8)
            goto L79
        L60:
            r1 = move-exception
            androidx.compose.runtime.MutableState r0 = r5.A0B
            r0.Af8(r8)
            throw r1
        L67:
            X.G0U<? super T, java.lang.Boolean> r0 = r5.A03
            boolean r0 = X.AnonymousClass003.A1X(r11, r0)
            if (r0 == 0) goto L79
            androidx.compose.runtime.MutableState r0 = r5.A0C
            r0.Af8(r11)
            androidx.compose.runtime.MutableState r0 = r5.A0A
            r0.Af8(r11)
        L79:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableState.A04(X.3UY, java.lang.Object, X.HtJ, X.G2j):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void A00(AnchoredDraggableState anchoredDraggableState, InterfaceC1153Acj interfaceC1153Acj) {
        Object value;
        C00q c00q = anchoredDraggableState.A08;
        if (Float.isNaN(c00q.AFn()) || (value = interfaceC1153Acj.A6U(c00q.AFn())) == null) {
            value = anchoredDraggableState.A0E.getValue();
        }
        MutableState mutableState = anchoredDraggableState.A09;
        if (C7384Etj.areEqual(mutableState.getValue(), interfaceC1153Acj)) {
            return;
        }
        mutableState.Af8(interfaceC1153Acj);
        InterfaceC2261BLa interfaceC2261BLa = anchoredDraggableState.A05.A01;
        if (!interfaceC2261BLa.AhW(null)) {
            anchoredDraggableState.A0B.Af8(value);
            return;
        }
        try {
            C1151Ach c1151Ach = anchoredDraggableState.A06;
            float fAYD = C8j4.A0T(mutableState).AYD(value);
            if (!Float.isNaN(fAYD)) {
                c1151Ach.A9C(fAYD, 0.0f);
                anchoredDraggableState.A0B.Af8(null);
            }
            anchoredDraggableState.A0A.Af8(value);
            anchoredDraggableState.A0C.Af8(value);
        } finally {
            interfaceC2261BLa.Ahe(null);
        }
    }

    public final float A01() {
        C00q c00q = this.A08;
        if (Float.isNaN(c00q.AFn())) {
            throw C3cG.A0Q("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return c00q.AFn();
    }

    public final float A02(float f) {
        float fMin;
        float fMax;
        C00q c00q = this.A08;
        float fAFn = (Float.isNaN(c00q.AFn()) ? 0.0f : c00q.AFn()) + f;
        MutableState mutableState = this.A09;
        float[] fArr = ((C1150Acf) C8j4.A0T(mutableState)).A02;
        int length = fArr.length;
        if (length == 0) {
            fMin = Float.NaN;
        } else {
            fMin = fArr[0];
            int i = length - 1;
            int i2 = 1;
            if (1 <= i) {
                while (true) {
                    fMin = Math.min(fMin, fArr[i2]);
                    if (i2 == i) {
                        break;
                    }
                    i2++;
                }
            }
        }
        float[] fArr2 = ((C1150Acf) C8j4.A0T(mutableState)).A02;
        int length2 = fArr2.length;
        if (length2 == 0) {
            fMax = Float.NaN;
        } else {
            fMax = fArr2[0];
            int i3 = length2 - 1;
            int i4 = 1;
            if (1 <= i3) {
                while (true) {
                    fMax = Math.max(fMax, fArr2[i4]);
                    if (i4 == i3) {
                        break;
                    }
                    i4++;
                }
            }
        }
        return ATD.A03(fAFn, fMin, fMax);
    }

    public final float A03(T t, T t2) {
        MutableState mutableState = this.A09;
        float fAYD = C8j4.A0T(mutableState).AYD(t);
        float fAYD2 = C8j4.A0T(mutableState).AYD(t2);
        float fA03 = (ATD.A03(this.A08.AFn(), Math.min(fAYD, fAYD2), Math.max(fAYD, fAYD2)) - fAYD) / (fAYD2 - fAYD);
        if (!Float.isNaN(fA03)) {
            if (fA03 < 1.0E-6f) {
                return 0.0f;
            }
            if (fA03 <= 0.999999f) {
                return Math.abs(fA03);
            }
        }
        return 1.0f;
    }

    /* JADX WARN: Incorrect types in method signature: (TT;LX/G0U<-TT;Ljava/lang/Boolean;>;)V */
    @Deprecated(level = Hs1.A04, message = "confirmValueChange is deprecated without replacement. Rather than relying on a callback to veto state changes, the anchor set should not include disallowed anchors. See androidx.compose.foundation.samples.AnchoredDraggableDynamicAnchorsSample for an example of using dynamic anchors over confirmValueChange.")
    public AnchoredDraggableState(G0U g0u, Object obj) {
        this.A03 = C2278BSe.A00(31);
        AGE age = AGE.A00;
        this.A0A = C3cG.A08(age, obj);
        this.A0C = C3cG.A08(age, obj);
        this.A0E = AbstractC1798ArH.A01(null, this, 20);
        this.A08 = new ParcelableSnapshotMutableFloatState(Float.NaN);
        this.A0D = AbstractC1798ArH.A01(age, this, 21);
        this.A07 = new ParcelableSnapshotMutableFloatState(0.0f);
        this.A0B = C3cG.A08(age, null);
        this.A09 = C3cG.A08(age, new C1150Acf(C0881AGi.A00, new float[0]));
        this.A06 = new C1151Ach(this);
        this.A03 = g0u;
    }
}
