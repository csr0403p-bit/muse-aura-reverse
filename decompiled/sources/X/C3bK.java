package X;

import androidx.compose.runtime.MutableState;
import java.util.List;

/* renamed from: X.3bK, reason: invalid class name */
/* loaded from: classes.dex */
public final class C3bK implements C20Z {
    public final int $t;
    public final Object A00;
    public final Object A01;

    public C3bK(AT5<AWx, ARY> at5, C3UX c3ux) {
        this.$t = 3;
        this.A00 = at5;
        this.A01 = c3ux;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00d0 A[PHI: r12
  0x00d0: PHI (r12v6 X.1Xu) = (r12v1 X.1Xu), (r12v7 X.1Xu) binds: [B:33:0x00ad, B:17:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.C20Z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object r12, X.HtJ r13) {
        /*
            r11 = this;
            int r0 = r11.$t
            switch(r0) {
                case 0: goto L65;
                case 1: goto L78;
                case 2: goto La9;
                default: goto L5;
            }
        L5:
            X.AWx r12 = (X.AWx) r12
            long r2 = r12.A00
            java.lang.Object r6 = r11.A00
            X.AT5 r6 = (X.AT5) r6
            X.AT7<T, V extends X.AOd> r0 = r6.A04
            androidx.compose.runtime.MutableState r1 = r0.A05
            java.lang.Object r0 = r1.getValue()
            X.AWx r0 = (X.AWx) r0
            long r4 = r0.A00
            r9 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r4 = r4 & r9
            r7 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r0 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r0 == 0) goto L57
            long r4 = r2 & r9
            int r0 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r0 == 0) goto L57
            java.lang.Object r0 = r1.getValue()
            X.AWx r0 = (X.AWx) r0
            long r0 = r0.A00
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            float r1 = X.AnonymousClass001.A01(r0, r4)
            float r0 = X.AnonymousClass001.A01(r4, r2)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L57
            java.lang.Object r4 = r11.A01
            X.3UX r4 = (X.C3UX) r4
            r1 = 0
            androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1$2$1 r0 = new androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1$2$1
            r0.<init>(r6, r1, r2)
            X.AnonymousClass001.A1J(r0, r4)
        L54:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        L57:
            X.AWx r0 = new X.AWx
            r0.<init>(r2)
            java.lang.Object r1 = r6.A04(r0, r13)
            X.Hji r0 = X.EnumC10460Hji.A02
            if (r1 != r0) goto L54
            return r1
        L65:
            X.1Xu r12 = (X.InterfaceC04911Xu) r12
            boolean r0 = r12 instanceof X.C04891Xs
            if (r0 != 0) goto Ld0
            boolean r0 = r12 instanceof X.C1wG
            if (r0 == 0) goto Lbe
            java.lang.Object r1 = r11.A00
            java.util.List r1 = (java.util.List) r1
            X.1wG r12 = (X.C1wG) r12
            X.1Xs r0 = r12.A00
            goto Lbb
        L78:
            X.1Xu r12 = (X.InterfaceC04911Xu) r12
            boolean r0 = r12 instanceof X.AWp
            if (r0 == 0) goto L8c
            java.lang.Object r0 = r11.A01
            java.util.List r0 = (java.util.List) r0
            r0.add(r12)
        L85:
            java.lang.Object r1 = r11.A00
            androidx.compose.runtime.MutableState r1 = (androidx.compose.runtime.MutableState) r1
            java.lang.Object r0 = r11.A01
            goto Lc4
        L8c:
            boolean r0 = r12 instanceof X.AWk
            if (r0 == 0) goto L9c
            java.lang.Object r1 = r11.A01
            java.util.List r1 = (java.util.List) r1
            X.AWk r12 = (X.AWk) r12
            X.AWp r0 = r12.A00
        L98:
            r1.remove(r0)
            goto L85
        L9c:
            boolean r0 = r12 instanceof X.AWl
            if (r0 == 0) goto L85
            java.lang.Object r1 = r11.A01
            java.util.List r1 = (java.util.List) r1
            X.AWl r12 = (X.AWl) r12
            X.AWp r0 = r12.A00
            goto L98
        La9:
            X.1Xu r12 = (X.InterfaceC04911Xu) r12
            boolean r0 = r12 instanceof X.C1wU
            if (r0 != 0) goto Ld0
            boolean r0 = r12 instanceof X.C1wT
            if (r0 == 0) goto Lbe
            java.lang.Object r1 = r11.A00
            java.util.List r1 = (java.util.List) r1
            X.1wT r12 = (X.C1wT) r12
            X.1wU r0 = r12.A00
        Lbb:
            r1.remove(r0)
        Lbe:
            java.lang.Object r1 = r11.A01
            androidx.compose.runtime.MutableState r1 = (androidx.compose.runtime.MutableState) r1
            java.lang.Object r0 = r11.A00
        Lc4:
            java.util.List r0 = (java.util.List) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            androidx.compose.runtime.MutableState.A09(r0, r1)
            goto L54
        Ld0:
            java.lang.Object r0 = r11.A00
            java.util.List r0 = (java.util.List) r0
            r0.add(r12)
            goto Lbe
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3bK.emit(java.lang.Object, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3bK(MutableState mutableState, List<C04891Xs> list, MutableState<Boolean> mutableState2) {
        this.$t = mutableState2;
        switch (mutableState2) {
            case null:
            case 2:
                this.A00 = list;
                this.A01 = mutableState;
                break;
            case 1:
            default:
                this.A01 = list;
                this.A00 = mutableState;
                break;
        }
    }
}
