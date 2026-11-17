package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.B9a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2182B9a {
    public int A00;
    public B9Z<?> A01;
    public AbstractC2184B9c A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final Set<AbstractC2184B9c> A06;
    public final Set<AbstractC2184B9c> A07;
    public final Set<AbstractC2184B9c> A08;
    public final AIG<B9Z<?>> A09;
    public final AIG<B9Z<?>> A0A;
    public final BLG<AMY> A0B;
    public final C1BN<AMY> A0C;
    public final BLG<BFf> A0D;
    public final C1BN<BFf> A0E;

    public static final B9Z A00(C2182B9a c2182B9a, int i) {
        B9Z<?> next;
        B9Z<?> b9z;
        B9Z<?> next2;
        B9Z<?> next3;
        B9Z<?> b9z2 = null;
        AIG<B9Z<?>> aig = c2182B9a.A0A;
        if (i == -1) {
            Iterator<B9Z<?>> it = aig.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.A05) {
                    break;
                }
            }
            b9z = next;
            if (b9z == null) {
                Iterator<B9Z<?>> it2 = c2182B9a.A09.iterator();
                while (it2.hasNext()) {
                    next2 = it2.next();
                    if (next2.A05) {
                        b9z2 = next2;
                        break;
                    }
                }
            }
            return b9z;
        }
        Iterator<B9Z<?>> it3 = aig.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it3.next();
            B9Z<?> b9z3 = next3;
            if (b9z3.A05 || b9z3.A06) {
                break;
            }
        }
        b9z = next3;
        if (b9z == null) {
            Iterator<B9Z<?>> it4 = c2182B9a.A09.iterator();
            while (it4.hasNext()) {
                next2 = it4.next();
                B9Z<?> b9z4 = next2;
                if (b9z4.A05 || b9z4.A06) {
                    b9z2 = next2;
                    break;
                }
            }
        }
        return b9z;
        return b9z2;
    }

    public final void A02(C2183B9b c2183B9b, AbstractC2184B9c abstractC2184B9c, int i) {
        if (abstractC2184B9c.A00 != null) {
            StringBuilder sbA0f = C3cG.A0f(abstractC2184B9c, "Input '");
            sbA0f.append("' is already added to dispatcher ");
            sbA0f.append(abstractC2184B9c.A00);
            throw C8j3.A0x(sbA0f);
        }
        (i != 0 ? i != 1 ? this.A08 : this.A06 : this.A07).add(abstractC2184B9c);
        abstractC2184B9c.A00 = c2183B9b;
        C7384Etj.A0Y(this.A0E.getValue(), 0);
        abstractC2184B9c.A06(i != 0 ? i != 1 ? this.A03 : this.A04 : this.A05);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0047  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01() {
        /*
            r7 = this;
            X.AIG<X.B9Z<?>> r1 = r7.A0A
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L74
            java.util.Iterator r2 = r1.iterator()
        Lc:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L74
            java.lang.Object r1 = r2.next()
            X.B9Z r1 = (X.B9Z) r1
            boolean r0 = r1.A05
            if (r0 != 0) goto L20
            boolean r0 = r1.A06
            if (r0 == 0) goto Lc
        L20:
            r3 = 1
        L21:
            X.AIG<X.B9Z<?>> r1 = r7.A09
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L72
            java.util.Iterator r2 = r1.iterator()
        L2d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L72
            java.lang.Object r1 = r2.next()
            X.B9Z r1 = (X.B9Z) r1
            boolean r0 = r1.A05
            if (r0 != 0) goto L41
            boolean r0 = r1.A06
            if (r0 == 0) goto L2d
        L41:
            r4 = 1
        L42:
            if (r3 != 0) goto L47
            r2 = 0
            if (r4 == 0) goto L48
        L47:
            r2 = 1
        L48:
            boolean r0 = r7.A05
            boolean r1 = X.AnonymousClass002.A1P(r0, r3)
            boolean r0 = r7.A04
            boolean r6 = X.AnonymousClass002.A1P(r0, r4)
            boolean r0 = r7.A03
            boolean r5 = X.AnonymousClass002.A1P(r0, r2)
            if (r1 == 0) goto L76
            java.util.Set<X.B9c> r0 = r7.A07
            java.util.Iterator r1 = r0.iterator()
        L62:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L76
            java.lang.Object r0 = r1.next()
            X.B9c r0 = (X.AbstractC2184B9c) r0
            r0.A06(r3)
            goto L62
        L72:
            r4 = 0
            goto L42
        L74:
            r3 = 0
            goto L21
        L76:
            if (r6 == 0) goto L8e
            java.util.Set<X.B9c> r0 = r7.A06
            java.util.Iterator r1 = r0.iterator()
        L7e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L8e
            java.lang.Object r0 = r1.next()
            X.B9c r0 = (X.AbstractC2184B9c) r0
            r0.A06(r4)
            goto L7e
        L8e:
            if (r5 == 0) goto La6
            java.util.Set<X.B9c> r0 = r7.A08
            java.util.Iterator r1 = r0.iterator()
        L96:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto La6
            java.lang.Object r0 = r1.next()
            X.B9c r0 = (X.AbstractC2184B9c) r0
            r0.A06(r2)
            goto L96
        La6:
            r7.A05 = r3
            r7.A04 = r4
            r7.A03 = r2
            X.B9Z<?> r0 = r7.A01
            if (r0 != 0) goto Lb5
            r0 = 0
            X.B9Z r0 = A00(r7, r0)
        Lb5:
            r7.A03(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2182B9a.A01():void");
    }

    public final void A03(B9Z<?> b9z) {
        BFf bFf;
        B9Z<?> b9zA00 = this.A01;
        if (b9zA00 == null) {
            b9zA00 = A00(this, 0);
        }
        if (C7384Etj.areEqual(b9zA00, b9z)) {
            if (b9zA00 == null) {
                bFf = new BFf();
            } else {
                ArrayList arrayListA0h = C3cG.A0h();
                Iterator<B9Z<?>> it = this.A0A.iterator();
                while (it.hasNext()) {
                    B9Z<?> next = it.next();
                    if (next.A05 && !next.A03.isEmpty()) {
                        arrayListA0h.addAll(next.A03);
                    }
                }
                Iterator<B9Z<?>> it2 = this.A09.iterator();
                while (it2.hasNext()) {
                    B9Z<?> next2 = it2.next();
                    if (next2.A05 && !next2.A03.isEmpty()) {
                        arrayListA0h.addAll(next2.A03);
                    }
                }
                T t = b9zA00.A01;
                Collection collection = b9zA00.A04;
                AnonymousClass003.A0v(t, collection);
                AII aiiA17 = AIM.A17();
                AbstractC0882AGj.A0r(arrayListA0h, aiiA17);
                aiiA17.add(t);
                AbstractC0882AGj.A0r(collection, aiiA17);
                bFf = new BFf(AIM.A18(aiiA17), arrayListA0h.size());
            }
            BLG<BFf> blg = this.A0D;
            if (C7384Etj.areEqual(blg.getValue(), bFf)) {
                return;
            }
            AnonymousClass002.A1I(blg, bFf);
            Iterator<AbstractC2184B9c> it3 = this.A07.iterator();
            while (it3.hasNext()) {
                it3.next();
            }
            Iterator<AbstractC2184B9c> it4 = this.A06.iterator();
            while (it4.hasNext()) {
                it4.next();
            }
            Iterator<AbstractC2184B9c> it5 = this.A08.iterator();
            while (it5.hasNext()) {
                it5.next();
            }
        }
    }

    public C2182B9a() {
        C9286GCn c9286GCnA01 = HnJ.A01(AMc.A00);
        this.A0B = c9286GCnA01;
        this.A0C = C3cG.A11(c9286GCnA01);
        C9286GCn c9286GCnA14 = C3cG.A14(new BFf());
        this.A0D = c9286GCnA14;
        this.A0E = C3cG.A11(c9286GCnA14);
        this.A0A = new AIG<>();
        this.A09 = new AIG<>();
        this.A08 = C3cG.A0k();
        this.A06 = C3cG.A0k();
        this.A07 = C3cG.A0k();
    }
}
