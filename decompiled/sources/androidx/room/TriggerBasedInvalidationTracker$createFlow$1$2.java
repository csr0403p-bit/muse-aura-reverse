package androidx.room;

import X.C10543Hqv;
import X.C20Z;
import java.util.Set;

/* loaded from: classes3.dex */
public final class TriggerBasedInvalidationTracker$createFlow$1$2<T> implements C20Z {
    public final /* synthetic */ C10543Hqv<int[]> A00;
    public final /* synthetic */ C20Z<Set<String>> A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ int[] A03;
    public final /* synthetic */ String[] A04;

    /* JADX WARN: Incorrect types in method signature: (LX/Hqv<[I>;ZLX/20Z<-Ljava/util/Set<Ljava/lang/String;>;>;[Ljava/lang/String;[I)V */
    public TriggerBasedInvalidationTracker$createFlow$1$2(C10543Hqv c10543Hqv, C20Z c20z, int[] iArr, String[] strArr, boolean z) {
        this.A00 = c10543Hqv;
        this.A02 = z;
        this.A01 = c20z;
        this.A04 = strArr;
        this.A03 = iArr;
    }

    /* JADX WARN: Incorrect types in method signature: ([ILX/HtJ<-Lkotlin/Unit;>;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0050 A[RETURN] */
    @Override // X.C20Z
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(X.HtJ r14, int[] r15) {
        /*
            r13 = this;
            r3 = 8
            boolean r0 = r14 instanceof X.C8iP
            if (r0 == 0) goto L2b
            r9 = r14
            X.8iP r9 = (X.C8iP) r9
            int r0 = r9.$t
            if (r0 != r3) goto L2b
            int r2 = r9.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2b
            int r2 = r2 - r1
            r9.A00 = r2
        L18:
            java.lang.Object r1 = r9.A02
            X.Hji r10 = X.EnumC10460Hji.A02
            int r0 = r9.A00
            r8 = 2
            r2 = 1
            if (r0 == 0) goto L31
            if (r0 == r2) goto L85
            if (r0 == r8) goto L85
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2b:
            X.8iP r9 = new X.8iP
            r9.<init>(r13, r14, r3)
            goto L18
        L31:
            X.Hwg.A00(r1)
            X.Hqv<int[]> r0 = r13.A00
            T r11 = r0.element
            if (r11 != 0) goto L51
            boolean r0 = r13.A02
            if (r0 == 0) goto L8a
            X.20Z<java.util.Set<java.lang.String>> r1 = r13.A01
            java.lang.String[] r0 = r13.A04
            java.util.Set r0 = X.BFI.A0H(r0)
            r9.A01 = r15
            r9.A00 = r2
        L4a:
            java.lang.Object r0 = r1.emit(r0, r9)
            if (r0 != r10) goto L8a
            return r10
        L51:
            java.lang.String[] r7 = r13.A04
            int[] r6 = r13.A03
            java.util.ArrayList r5 = X.C3cG.A0h()
            int r4 = r7.length
            r3 = 0
            r0 = 0
        L5c:
            if (r3 >= r4) goto L74
            r2 = r7[r3]
            int r12 = r0 + 1
            r1 = r11
            int[] r1 = (int[]) r1
            r0 = r6[r0]
            r1 = r1[r0]
            r0 = r15[r0]
            if (r1 == r0) goto L70
            r5.add(r2)
        L70:
            int r3 = r3 + 1
            r0 = r12
            goto L5c
        L74:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L8a
            X.20Z<java.util.Set<java.lang.String>> r1 = r13.A01
            java.util.Set r0 = X.AbstractC0878AGe.A0g(r5)
            r9.A01 = r15
            r9.A00 = r8
            goto L4a
        L85:
            java.lang.Object r15 = r9.A01
            X.Hwg.A00(r1)
        L8a:
            X.Hqv<int[]> r0 = r13.A00
            r0.element = r15
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.TriggerBasedInvalidationTracker$createFlow$1$2.emit(X.HtJ, int[]):java.lang.Object");
    }
}
