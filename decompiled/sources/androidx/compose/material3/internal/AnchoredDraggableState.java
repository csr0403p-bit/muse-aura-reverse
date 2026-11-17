package androidx.compose.material3.internal;

import X.AGE;
import X.AGF;
import X.AGH;
import X.AOc;
import X.ATD;
import X.AnonymousClass001;
import X.BBP;
import X.C00q;
import X.C05453br;
import X.C1BO;
import X.C1Cw;
import X.C1E7;
import X.C3Sn;
import X.C3St;
import X.C3T6;
import X.C3T8;
import X.C3TN;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AnchoredDraggableState<T> {
    public final AOc<Float> A00;
    public final C3TN A02;
    public final C00q A04;
    public final C00q A05;
    public final MutableState A06;
    public final MutableState A07;
    public final MutableState A08;
    public final C1BO A09;
    public final C1BO A0A;
    public final G0U<T, Boolean> A0B;
    public final C1BO A0C;
    public final Function0<Float> A0D;
    public final G0U<Float, Float> A0E;
    public final C3St A03 = new C3St();
    public final C1Cw A01 = new C3T8(this);

    /* JADX WARN: Incorrect types in method signature: (TT;LX/3UY;LX/G2j<-LX/3TN;-LX/3Sn<TT;>;-TT;-LX/HtJ<-Lkotlin/Unit;>;+Ljava/lang/Object;>;LX/HtJ<-Lkotlin/Unit;>;)Ljava/lang/Object; */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A04(X.C3UY r13, java.lang.Object r14, X.HtJ r15, X.G2j r16) throws java.lang.Throwable {
        /*
            r12 = this;
            r11 = 1
            boolean r0 = r15 instanceof X.C3be
            if (r0 == 0) goto Ld
            r0 = r15
            X.3be r0 = (X.C3be) r0
            int r1 = r0.$t
            r0 = 1
            if (r1 == r11) goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 == 0) goto L30
            r2 = r15
            X.3be r2 = (X.C3be) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L30
            int r3 = r3 - r1
            r2.A00 = r3
        L1e:
            java.lang.Object r3 = r2.A02
            X.Hji r1 = X.EnumC10460Hji.A02
            int r0 = r2.A00
            r5 = 1056964608(0x3f000000, float:0.5)
            r10 = 0
            if (r0 == 0) goto L3f
            if (r0 != r11) goto L3a
            java.lang.Object r12 = r2.A01
            androidx.compose.material3.internal.AnchoredDraggableState r12 = (androidx.compose.material3.internal.AnchoredDraggableState) r12
            goto L36
        L30:
            X.3be r2 = new X.3be
            r2.<init>(r12, r15, r11)
            goto L1e
        L36:
            X.Hwg.A00(r3)     // Catch: java.lang.Throwable -> L70
            goto La0
        L3a:
            java.lang.IllegalStateException r4 = X.AnonymousClass001.A0n()
            throw r4
        L3f:
            X.Hwg.A00(r3)
            androidx.compose.runtime.MutableState r0 = r12.A06
            java.lang.Object r0 = r0.getValue()
            X.3Sn r0 = (X.C3Sn) r0
            X.1E7 r0 = (X.C1E7) r0
            java.util.Map<T, java.lang.Float> r0 = r0.A00
            boolean r0 = r0.containsKey(r14)
            if (r0 == 0) goto Lc9
            X.3St r8 = r12.A03     // Catch: java.lang.Throwable -> L6e
            androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4 r9 = new androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4     // Catch: java.lang.Throwable -> L6e
            r0 = r16
            r9.<init>(r12, r14, r10, r0)     // Catch: java.lang.Throwable -> L6e
            r2.A01 = r12     // Catch: java.lang.Throwable -> L6e
            r2.A00 = r11     // Catch: java.lang.Throwable -> L6e
            X.60H r6 = new X.60H     // Catch: java.lang.Throwable -> L6e
            r7 = r13
            r6.<init>(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r0 = X.Hxb.A00(r6, r2)     // Catch: java.lang.Throwable -> L6e
            if (r0 != r1) goto La0
            return r1
        L6e:
            r4 = move-exception
            goto L71
        L70:
            r4 = move-exception
        L71:
            androidx.compose.runtime.MutableState r0 = r12.A08
            r0.Af8(r10)
            androidx.compose.runtime.MutableState r3 = r12.A06
            java.lang.Object r1 = r3.getValue()
            X.3Sn r1 = (X.C3Sn) r1
            X.00q r2 = r12.A05
            float r0 = r2.AFn()
            java.lang.Object r1 = r1.A6U(r0)
            if (r1 == 0) goto L9f
            float r0 = A00(r2, r3, r1)
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 > 0) goto L9f
            X.G0U<T, java.lang.Boolean> r0 = r12.A0B
            boolean r0 = X.AnonymousClass003.A1X(r1, r0)
            if (r0 == 0) goto L9f
            androidx.compose.runtime.MutableState r0 = r12.A07
            r0.Af8(r1)
        L9f:
            throw r4
        La0:
            androidx.compose.runtime.MutableState r0 = r12.A08
            r0.Af8(r10)
            androidx.compose.runtime.MutableState r3 = r12.A06
            java.lang.Object r2 = r3.getValue()
            X.3Sn r2 = (X.C3Sn) r2
            X.00q r1 = r12.A05
            float r0 = r1.AFn()
            java.lang.Object r14 = r2.A6U(r0)
            if (r14 == 0) goto Lce
            float r0 = A00(r1, r3, r14)
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 > 0) goto Lce
            X.G0U<T, java.lang.Boolean> r0 = r12.A0B
            boolean r0 = X.AnonymousClass003.A1X(r14, r0)
            if (r0 == 0) goto Lce
        Lc9:
            androidx.compose.runtime.MutableState r0 = r12.A07
            r0.Af8(r14)
        Lce:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.AnchoredDraggableState.A04(X.3UY, java.lang.Object, X.HtJ, X.G2j):java.lang.Object");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/3UY;LX/G0W<-LX/3TN;-LX/3Sn<TT;>;-LX/HtJ<-Lkotlin/Unit;>;+Ljava/lang/Object;>;LX/HtJ<-Lkotlin/Unit;>;)Ljava/lang/Object; */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A05(X.C3UY r13, X.HtJ r14, X.G0W r15) {
        /*
            r12 = this;
            r4 = 0
            boolean r0 = r14 instanceof X.C3be
            if (r0 == 0) goto Ld
            r0 = r14
            X.3be r0 = (X.C3be) r0
            int r1 = r0.$t
            r0 = 1
            if (r1 == r4) goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 == 0) goto L30
            r3 = r14
            X.3be r3 = (X.C3be) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L30
            int r2 = r2 - r1
            r3.A00 = r2
        L1e:
            java.lang.Object r2 = r3.A02
            X.Hji r1 = X.EnumC10460Hji.A02
            int r0 = r3.A00
            r5 = 1056964608(0x3f000000, float:0.5)
            r11 = 1
            if (r0 == 0) goto L3f
            if (r0 != r11) goto L3a
            java.lang.Object r12 = r3.A01
            androidx.compose.material3.internal.AnchoredDraggableState r12 = (androidx.compose.material3.internal.AnchoredDraggableState) r12
            goto L36
        L30:
            X.3be r3 = new X.3be
            r3.<init>(r12, r14, r4)
            goto L1e
        L36:
            X.Hwg.A00(r2)     // Catch: java.lang.Throwable -> L87
            goto L5b
        L3a:
            java.lang.IllegalStateException r4 = X.AnonymousClass001.A0n()
            throw r4
        L3f:
            X.Hwg.A00(r2)
            X.3St r8 = r12.A03     // Catch: java.lang.Throwable -> L87
            r10 = 0
            X.3bj r9 = new X.3bj     // Catch: java.lang.Throwable -> L87
            r9.<init>(r12, r15, r10, r4)     // Catch: java.lang.Throwable -> L87
            r3.A01 = r12     // Catch: java.lang.Throwable -> L87
            r3.A00 = r11     // Catch: java.lang.Throwable -> L87
            X.60H r6 = new X.60H     // Catch: java.lang.Throwable -> L87
            r7 = r13
            r6.<init>(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L87
            java.lang.Object r0 = X.Hxb.A00(r6, r3)     // Catch: java.lang.Throwable -> L87
            if (r0 != r1) goto L5b
            return r1
        L5b:
            androidx.compose.runtime.MutableState r3 = r12.A06
            java.lang.Object r1 = r3.getValue()
            X.3Sn r1 = (X.C3Sn) r1
            X.00q r2 = r12.A05
            float r0 = r2.AFn()
            java.lang.Object r1 = r1.A6U(r0)
            if (r1 == 0) goto L84
            float r0 = A00(r2, r3, r1)
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 > 0) goto L84
            X.G0U<T, java.lang.Boolean> r0 = r12.A0B
            boolean r0 = X.AnonymousClass003.A1X(r1, r0)
            if (r0 == 0) goto L84
            androidx.compose.runtime.MutableState r0 = r12.A07
            r0.Af8(r1)
        L84:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        L87:
            r4 = move-exception
            androidx.compose.runtime.MutableState r3 = r12.A06
            java.lang.Object r1 = r3.getValue()
            X.3Sn r1 = (X.C3Sn) r1
            X.00q r2 = r12.A05
            float r0 = r2.AFn()
            java.lang.Object r1 = r1.A6U(r0)
            if (r1 == 0) goto Lb1
            float r0 = A00(r2, r3, r1)
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 > 0) goto Lb1
            X.G0U<T, java.lang.Boolean> r0 = r12.A0B
            boolean r0 = X.AnonymousClass003.A1X(r1, r0)
            if (r0 == 0) goto Lb1
            androidx.compose.runtime.MutableState r0 = r12.A07
            r0.Af8(r1)
        Lb1:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.AnchoredDraggableState.A05(X.3UY, X.HtJ, X.G0W):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(androidx.compose.material3.internal.AnchoredDraggableState r5, java.lang.Object r6, float r7, float r8) {
        /*
            androidx.compose.runtime.MutableState r0 = r5.A06
            java.lang.Object r4 = r0.getValue()
            X.3Sn r4 = (X.C3Sn) r4
            float r3 = r4.AYD(r6)
            kotlin.jvm.functions.Function0<java.lang.Float> r0 = r5.A0D
            float r2 = X.AnonymousClass003.A04(r0)
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 == 0) goto L50
            boolean r0 = java.lang.Float.isNaN(r3)
            if (r0 != 0) goto L50
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 >= 0) goto L51
            r1 = 1
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 >= 0) goto L8e
            java.lang.Object r2 = r4.A6V(r7, r1)
            X.C7384Etj.A0X(r2)
            float r0 = r4.AYD(r2)
            float r0 = r0 - r3
            float r0 = java.lang.Math.abs(r0)
            X.G0U<java.lang.Float, java.lang.Float> r1 = r5.A0E
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object r0 = r1.invoke(r0)
            float r0 = X.AnonymousClass001.A02(r0)
            float r0 = java.lang.Math.abs(r0)
            float r3 = r3 + r0
            float r1 = java.lang.Math.abs(r3)
        L4c:
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 >= 0) goto L95
        L50:
            return r6
        L51:
            float r0 = -r2
            r1 = 0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 <= 0) goto L8e
            java.lang.Object r2 = r4.A6V(r7, r1)
            X.C7384Etj.A0X(r2)
            float r0 = r4.AYD(r2)
            float r0 = r3 - r0
            float r0 = java.lang.Math.abs(r0)
            X.G0U<java.lang.Float, java.lang.Float> r1 = r5.A0E
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object r0 = r1.invoke(r0)
            float r0 = X.AnonymousClass001.A02(r0)
            float r0 = java.lang.Math.abs(r0)
            float r3 = r3 - r0
            float r1 = java.lang.Math.abs(r3)
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 >= 0) goto L89
            float r7 = java.lang.Math.abs(r7)
            goto L4c
        L89:
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 <= 0) goto L95
            return r6
        L8e:
            java.lang.Object r2 = r4.A6V(r7, r1)
            X.C7384Etj.A0X(r2)
        L95:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.AnchoredDraggableState.A01(androidx.compose.material3.internal.AnchoredDraggableState, java.lang.Object, float, float):java.lang.Object");
    }

    public final float A02() {
        C00q c00q = this.A05;
        if (Float.isNaN(c00q.AFn())) {
            throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return c00q.AFn();
    }

    public final float A03(float f) {
        float fFloatValue;
        C00q c00q = this.A05;
        float fAFn = (Float.isNaN(c00q.AFn()) ? 0.0f : c00q.AFn()) + f;
        MutableState mutableState = this.A06;
        float fAQn = ((C3Sn) mutableState.getValue()).AQn();
        Collection<Float> collectionValues = ((C1E7) ((C3Sn) mutableState.getValue())).A00.values();
        C7384Etj.A0Y(collectionValues, 0);
        Iterator<Float> it = collectionValues.iterator();
        if (it.hasNext()) {
            float fA02 = AnonymousClass001.A02(it.next());
            while (it.hasNext()) {
                fA02 = Math.max(fA02, AnonymousClass001.A02(it.next()));
            }
            fFloatValue = Float.valueOf(fA02).floatValue();
        } else {
            fFloatValue = Float.NaN;
        }
        return ATD.A03(fAFn, fAQn, fFloatValue);
    }

    /* JADX WARN: Incorrect types in method signature: (TT;LX/G0U<-Ljava/lang/Float;Ljava/lang/Float;>;Lkotlin/jvm/functions/Function0<Ljava/lang/Float;>;LX/AOc<Ljava/lang/Float;>;LX/G0U<-TT;Ljava/lang/Boolean;>;)V */
    public AnchoredDraggableState(AOc aOc, Object obj, Function0 function0, G0U g0u, G0U g0u2) {
        this.A0E = g0u;
        this.A0D = function0;
        this.A00 = aOc;
        this.A0B = g0u2;
        AGE ageA01 = AGF.A01();
        this.A07 = new ParcelableSnapshotMutableState(ageA01, obj);
        this.A0A = new BBP(null, new C05453br(this, 14));
        this.A09 = new BBP(null, new C05453br(this, 12));
        this.A05 = new ParcelableSnapshotMutableFloatState(Float.NaN);
        this.A0C = new BBP(ageA01, new C05453br(this, 13));
        this.A04 = new ParcelableSnapshotMutableFloatState(0.0f);
        this.A08 = new ParcelableSnapshotMutableState(ageA01, null);
        this.A06 = new ParcelableSnapshotMutableState(ageA01, new C1E7(AGH.A0E()));
        this.A02 = new C3T6(this);
    }

    public static float A00(C00q c00q, MutableState mutableState, Object obj) {
        return Math.abs(c00q.AFn() - ((C3Sn) mutableState.getValue()).AYD(obj));
    }
}
