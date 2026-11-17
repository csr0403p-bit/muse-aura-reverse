package X;

import androidx.datastore.preferences.protobuf.CodedOutputStream$OutOfSpaceException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
public final class GGJ {
    public static final GGJ A03 = new GGJ(true);
    public boolean A00;
    public boolean A01;
    public final DUQ<T, Object> A02;

    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A00(X.EnumC10214Gra r2, java.lang.Object r3) {
        /*
            boolean r0 = X.GGI.A02
            X.Gra[] r0 = X.EnumC10214Gra.A00
            int[] r1 = X.AbstractC9386GGz.A00
            int r0 = r2.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto La5;
                case 2: goto La3;
                case 3: goto L9a;
                case 4: goto L9a;
                case 5: goto L8c;
                case 6: goto La5;
                case 7: goto La3;
                case 8: goto L8a;
                case 9: goto L76;
                case 10: goto L16;
                case 11: goto L5f;
                case 12: goto L52;
                case 13: goto L49;
                case 14: goto La3;
                case 15: goto La5;
                case 16: goto L3c;
                case 17: goto L2f;
                case 18: goto L8c;
                default: goto Lf;
            }
        Lf:
            java.lang.String r0 = "There is no way to get here, but the compiler thinks otherwise."
            java.lang.RuntimeException r0 = X.BV4.A0c(r0)
            throw r0
        L16:
            X.GH2 r3 = (X.GH2) r3
            X.GEw r3 = (X.AbstractC9339GEw) r3
            int r1 = r3.memoizedSerializedSize
            r0 = -1
            if (r1 != r0) goto L29
            X.GGc r0 = X.AbstractC7609F5w.A0T(r3)
            int r1 = r0.AKR(r3)
            r3.memoizedSerializedSize = r1
        L29:
            int r2 = X.GGI.A03(r1)
            int r2 = r2 + r1
            goto La7
        L2f:
            long r0 = X.C3cG.A05(r3)
            long r0 = X.AbstractC7610F5x.A0S(r0)
            int r2 = X.GGI.A04(r0)
            goto La7
        L3c:
            int r0 = X.AnonymousClass001.A0F(r3)
            int r0 = X.AbstractC7607F5u.A0A(r0)
            int r2 = X.GGI.A03(r0)
            goto La7
        L49:
            int r0 = X.AnonymousClass001.A0F(r3)
            int r2 = X.GGI.A03(r0)
            goto La7
        L52:
            boolean r0 = r3 instanceof X.AbstractC9309GDl
            if (r0 != 0) goto L6a
            byte[] r3 = (byte[]) r3
            int r0 = r3.length
            int r2 = X.GGI.A03(r0)
            int r2 = r2 + r0
            goto La7
        L5f:
            boolean r0 = r3 instanceof X.AbstractC9309GDl
            if (r0 != 0) goto L6a
            java.lang.String r3 = (java.lang.String) r3
            int r2 = X.GGI.A05(r3)
            goto La7
        L6a:
            X.GDl r3 = (X.AbstractC9309GDl) r3
            int r0 = r3.A01()
            int r2 = X.GGI.A03(r0)
            int r2 = r2 + r0
            goto La7
        L76:
            X.GH2 r3 = (X.GH2) r3
            X.GEw r3 = (X.AbstractC9339GEw) r3
            int r2 = r3.memoizedSerializedSize
            r0 = -1
            if (r2 != r0) goto La7
            X.GGc r0 = X.AbstractC7609F5w.A0T(r3)
            int r2 = r0.AKR(r3)
            r3.memoizedSerializedSize = r2
            goto La7
        L8a:
            r2 = 1
            goto La7
        L8c:
            int r0 = X.AnonymousClass001.A0F(r3)
            if (r0 < 0) goto L97
            int r2 = X.GGI.A03(r0)
            goto La7
        L97:
            r2 = 10
            goto La7
        L9a:
            long r0 = X.C3cG.A05(r3)
            int r2 = X.GGI.A04(r0)
            goto La7
        La3:
            r2 = 4
            goto La7
        La5:
            r2 = 8
        La7:
            int r0 = r2 + 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GGJ.A00(X.Gra, java.lang.Object):int");
    }

    public static void A01(GGI ggi, EnumC10214Gra enumC10214Gra, Object obj, int i) throws CodedOutputStream$OutOfSpaceException {
        long jDoubleToRawLongBits;
        int iFloatToRawIntBits;
        long jA05;
        int iA0F;
        EnumC10214Gra[] enumC10214GraArr = EnumC10214Gra.A00;
        GGH ggh = (GGH) ggi;
        ggh.A06((i << 3) | enumC10214Gra.wireType);
        switch (AbstractC9386GGz.A00[enumC10214Gra.ordinal()]) {
            case 1:
                jDoubleToRawLongBits = Double.doubleToRawLongBits(BV6.A00(obj));
                GGH.A01(ggh, 8);
                ggh.A0G(jDoubleToRawLongBits);
                break;
            case 2:
                iFloatToRawIntBits = Float.floatToRawIntBits(AnonymousClass001.A02(obj));
                GGH.A01(ggh, 4);
                ggh.A0E(iFloatToRawIntBits);
                break;
            case 3:
            case 4:
                jA05 = C3cG.A05(obj);
                GHG.A08(ggh, jA05);
                break;
            case 5:
            case 18:
                int iA0F2 = AnonymousClass001.A0F(obj);
                if (iA0F2 < 0) {
                    GHG.A08(ggh, iA0F2);
                    break;
                } else {
                    ggh.A06(iA0F2);
                    break;
                }
            case 6:
            case 15:
                jDoubleToRawLongBits = C3cG.A05(obj);
                GGH.A01(ggh, 8);
                ggh.A0G(jDoubleToRawLongBits);
                break;
            case 7:
            case 14:
                iFloatToRawIntBits = AnonymousClass001.A0F(obj);
                GGH.A01(ggh, 4);
                ggh.A0E(iFloatToRawIntBits);
                break;
            case 8:
                ggi.A0D(AnonymousClass001.A1X(obj));
                break;
            case 9:
                ((GH2) obj).Aiz(ggi);
                break;
            case 10:
                GH2 gh2 = (GH2) obj;
                AbstractC9339GEw abstractC9339GEw = (AbstractC9339GEw) gh2;
                int iAKR = abstractC9339GEw.memoizedSerializedSize;
                if (iAKR == -1) {
                    iAKR = AbstractC7609F5w.A0T(abstractC9339GEw).AKR(abstractC9339GEw);
                    abstractC9339GEw.memoizedSerializedSize = iAKR;
                }
                ggh.A06(iAKR);
                gh2.Aiz(ggh);
                break;
            case 11:
                if (!(obj instanceof AbstractC9309GDl)) {
                    ggi.A0C((String) obj);
                    break;
                }
                ggi.A0B((AbstractC9309GDl) obj);
                break;
            case 12:
                if (!(obj instanceof AbstractC9309GDl)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    ggh.A06(length);
                    GGH.A02(ggh, bArr, 0, length);
                    break;
                }
                ggi.A0B((AbstractC9309GDl) obj);
                break;
            case 13:
                iA0F = AnonymousClass001.A0F(obj);
                ggi.A06(iA0F);
                break;
            case 16:
                iA0F = AbstractC7607F5u.A0A(AnonymousClass001.A0F(obj));
                ggi.A06(iA0F);
                break;
            case 17:
                jA05 = AbstractC7610F5x.A0S(C3cG.A05(obj));
                GHG.A08(ggh, jA05);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* bridge */ /* synthetic */ Object clone() {
        Map.Entry entryA0l;
        GGJ ggj = new GGJ();
        DUQ<T, Object> duq = this.A02;
        if (0 < duq.A00.size()) {
            entryA0l = (Map.Entry) duq.A00.get(0);
        } else {
            Iterator it = (duq.A01.isEmpty() ? C21.A00 : duq.A01.entrySet()).iterator();
            if (!it.hasNext()) {
                ggj.A00 = this.A00;
                return ggj;
            }
            entryA0l = C3cH.A0l(it);
        }
        entryA0l.getKey();
        entryA0l.getValue();
        throw BV4.A0a("isRepeated");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GGJ) {
            return this.A02.equals(((GGJ) obj).A02);
        }
        return false;
    }

    public final int hashCode() {
        return this.A02.hashCode();
    }

    public GGJ() {
        this.A02 = new DUS(16);
    }

    public GGJ(boolean z) {
        DUS dus = new DUS(0);
        this.A02 = dus;
        if (!this.A01) {
            dus.A05();
            this.A01 = true;
        }
    }
}
