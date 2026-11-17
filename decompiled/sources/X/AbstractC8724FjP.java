package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.FjP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8724FjP<K, A> {
    public C8682Fii<A> A03;
    public final InterfaceC8760Fjz<K> A06;
    public final List<InterfaceC8793FkY> A07 = new ArrayList(1);
    public boolean A04 = false;
    public float A02 = 0.0f;
    public A A05 = null;
    public float A01 = -1.0f;
    public float A00 = -1.0f;

    public void A07() {
        int i = 0;
        while (true) {
            List<InterfaceC8793FkY> list = this.A07;
            if (i >= list.size()) {
                return;
            }
            list.get(i).AX2();
            i++;
        }
    }

    public static int A03(int i, int i2) {
        int i3 = i / i2;
        return ((i ^ i2) >= 0 || i2 * i3 == i) ? i3 : i3 - 1;
    }

    public final float A04() {
        C8725FjQ<K> c8725FjQAES = this.A06.AES();
        if (c8725FjQAES == null || c8725FjQAES.A02()) {
            return 0.0f;
        }
        return c8725FjQAES.A0B.getInterpolation(A05());
    }

    public final float A05() {
        if (this.A04) {
            return 0.0f;
        }
        C8725FjQ<K> c8725FjQAES = this.A06.AES();
        if (c8725FjQAES.A02()) {
            return 0.0f;
        }
        return (this.A02 - c8725FjQAES.A01()) / (c8725FjQAES.A00() - c8725FjQAES.A01());
    }

    /* JADX WARN: Removed duplicated region for block: B:176:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x064a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x017b  */
    /* JADX WARN: Type inference failed for: r2v62, types: [A, android.graphics.PointF] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r4v1, types: [T] */
    /* JADX WARN: Type inference failed for: r4v12, types: [android.graphics.Path] */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.Fjl] */
    /* JADX WARN: Type inference failed for: r4v3, types: [T] */
    /* JADX WARN: Type inference failed for: r4v32, types: [X.Fk9] */
    /* JADX WARN: Type inference failed for: r4v33, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v34, types: [android.graphics.PointF] */
    /* JADX WARN: Type inference failed for: r4v35, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r4v36, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r4v37, types: [A] */
    /* JADX WARN: Type inference failed for: r4v38, types: [android.graphics.PointF] */
    /* JADX WARN: Type inference failed for: r4v4, types: [android.graphics.PointF] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final A A06() {
        /*
            Method dump skipped, instructions count: 1656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC8724FjP.A06():java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A08(float r6) {
        /*
            r5 = this;
            boolean r0 = r5 instanceof X.C8730FjV
            if (r0 == 0) goto L7
            r5.A02 = r6
        L6:
            return
        L7:
            boolean r0 = r5 instanceof X.C8713FjE
            if (r0 == 0) goto L45
            X.FjE r5 = (X.C8713FjE) r5
            X.FjP<java.lang.Float, java.lang.Float> r0 = r5.A04
            r0.A08(r6)
            X.FjP<java.lang.Float, java.lang.Float> r3 = r5.A05
            r3.A08(r6)
            android.graphics.PointF r2 = r5.A02
            java.lang.Object r0 = r0.A06()
            java.lang.Number r0 = (java.lang.Number) r0
            float r1 = r0.floatValue()
            java.lang.Object r0 = r3.A06()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            r2.set(r1, r0)
            r2 = 0
        L31:
            java.util.List<X.FkY> r1 = r5.A07
            int r0 = r1.size()
            if (r2 >= r0) goto L6
            java.lang.Object r0 = r1.get(r2)
            X.FkY r0 = (X.InterfaceC8793FkY) r0
            r0.AX2()
            int r2 = r2 + 1
            goto L31
        L45:
            X.Fjz<K> r4 = r5.A06
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L6
            float r1 = r5.A01
            r2 = r1
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L5d
            float r1 = r4.AKv()
            r5.A01 = r1
            r2 = r1
        L5d:
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 >= 0) goto L7e
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L6b
            float r2 = r4.AKv()
            r5.A01 = r2
        L6b:
            r6 = r2
        L6c:
            float r0 = r5.A02
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 == 0) goto L6
            r5.A02 = r6
            boolean r0 = r4.APF(r6)
            if (r0 == 0) goto L6
            r5.A07()
            return
        L7e:
            float r1 = r5.A00
            r2 = r1
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L8c
            float r1 = r4.AFA()
            r5.A00 = r1
            r2 = r1
        L8c:
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L6c
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L6b
            float r2 = r4.AFA()
            r5.A00 = r2
            goto L6b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC8724FjP.A08(float):void");
    }

    public final void A09(InterfaceC8793FkY interfaceC8793FkY) {
        this.A07.add(interfaceC8793FkY);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0A(C8682Fii<A> c8682Fii) {
        C8682Fii<A> c8682Fii2 = this.A03;
        if (c8682Fii2 != null) {
            c8682Fii2.A00 = null;
        }
        this.A03 = c8682Fii;
        if (c8682Fii != null) {
            c8682Fii.A00 = this;
        }
    }

    public AbstractC8724FjP(List<? extends C8725FjQ<K>> list) {
        this.A06 = list.isEmpty() ? new C8769Fk8<>() : list.size() == 1 ? new C8742Fjh<>(list) : new C8739Fje<>(list);
    }

    public static float A02(AbstractC8724FjP abstractC8724FjP) {
        return ((Number) abstractC8724FjP.A06()).floatValue();
    }
}
