package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.3c9, reason: invalid class name */
/* loaded from: classes.dex */
public final class C3c9 extends AbstractC7559F3s implements Function0 {
    public final int $t;
    public final Object A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C3c9(Object obj, C1Pn c1Pn, C3UX c3ux, AT5<Float, AOW> at5, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.A03 = c1Pn;
        this.A02 = at5;
        this.A01 = obj;
        this.A00 = c3ux;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ac  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r7 = this;
            int r0 = r7.$t
            switch(r0) {
                case 0: goto L8c;
                case 1: goto L2f;
                case 2: goto L1b;
                default: goto L5;
            }
        L5:
            java.lang.Object r3 = r7.A00
            X.BA0 r3 = (X.BA0) r3
            java.lang.Object r2 = r7.A02
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            java.lang.Object r1 = r7.A03
            X.BA2 r1 = (X.BA2) r1
            java.lang.Object r0 = r7.A01
            X.Arj r0 = (X.EnumC1820Arj) r0
            r3.A05(r0, r1, r2)
        L18:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L1b:
            java.lang.Object r3 = r7.A00
            X.BA1 r3 = (X.BA1) r3
            java.lang.Object r2 = r7.A02
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            java.lang.Object r1 = r7.A03
            X.BA3 r1 = (X.BA3) r1
            java.lang.Object r0 = r7.A01
            X.Arj r0 = (X.EnumC1820Arj) r0
            r3.A05(r1, r0, r2)
            goto L18
        L2f:
            java.lang.Object r6 = r7.A03
            X.1Pn r6 = (X.C1Pn) r6
            androidx.compose.material3.internal.AnchoredDraggableState<X.1Vj> r2 = r6.A00
            androidx.compose.runtime.MutableState r0 = r2.A07
            java.lang.Object r1 = r0.getValue()
            X.1Vj r0 = X.C1Vj.Expanded
            r5 = 0
            if (r1 != r0) goto L71
            androidx.compose.runtime.MutableState r0 = r2.A06
            java.lang.Object r0 = r0.getValue()
            X.3Sn r0 = (X.C3Sn) r0
            X.1Vj r1 = X.C1Vj.PartiallyExpanded
            X.1E7 r0 = (X.C1E7) r0
            java.util.Map<T, java.lang.Float> r0 = r0.A00
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L71
            java.lang.Object r4 = r7.A02
            X.3UX r4 = (X.C3UX) r4
            java.lang.Object r2 = r7.A01
            r1 = 5
            X.3bi r0 = new X.3bi
            r0.<init>(r2, r5, r1)
            X.6ys r3 = X.C6ys.A00
            java.lang.Integer r2 = X.C79.A00
            X.GAo.A02(r2, r3, r0, r4)
            r1 = 6
            X.3bi r0 = new X.3bi
            r0.<init>(r6, r5, r1)
            X.GAo.A02(r2, r3, r0, r4)
            goto L18
        L71:
            java.lang.Object r2 = r7.A02
            X.3UX r2 = (X.C3UX) r2
            r1 = 7
            X.3bi r0 = new X.3bi
            r0.<init>(r6, r5, r1)
            X.Hqc r3 = X.AnonymousClass001.A11(r0, r2)
            java.lang.Object r2 = r7.A00
            r1 = 15
            X.3bs r0 = new X.3bs
            r0.<init>(r2, r1)
            r3.AO5(r0)
            goto L18
        L8c:
            java.lang.Object r1 = r7.A02
            java.lang.Number r1 = (java.lang.Number) r1
            if (r1 == 0) goto Lac
            java.lang.Object r5 = r7.A00
            X.1Xc r5 = (X.AbstractC04741Xc) r5
            java.lang.Object r0 = r7.A01
            X.1Y4 r0 = (X.C1Y4) r0
            java.lang.Object r4 = r7.A03
            java.util.Locale r4 = (java.util.Locale) r4
            long r2 = r1.longValue()
            java.lang.String r1 = r0.A02
            java.util.Map<java.lang.String, java.lang.Object> r0 = r5.A00
            java.lang.String r3 = X.C1Y1.A01(r1, r4, r0, r2)
            if (r3 != 0) goto Lae
        Lac:
            java.lang.String r3 = ""
        Lae:
            r1 = 0
            r0 = 32
            long r1 = r1 << r0
            X.ArO r0 = new X.ArO
            r0.<init>(r3, r1)
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = X.AnonymousClass002.A0P(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3c9.invoke():java.lang.Object");
    }
}
