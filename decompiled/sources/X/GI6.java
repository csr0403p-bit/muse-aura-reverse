package X;

/* loaded from: classes6.dex */
public final class GI6 implements GIK {
    public final GIF A00;
    public final C9411GIa A01;

    @Override // X.GIK
    public final void A2p(GIS gis, Object obj, byte[] bArr, int i, int i2) {
        GI0 gi0 = (GI0) obj;
        if (gi0.b == GI4.A05) {
            gi0.b = new GI4(new int[8], new Object[8], 0, true);
        }
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // X.GIK
    public final void A52(Object obj) {
        GI4 gi4 = ((GI0) obj).b;
        if (gi4.A02) {
            gi4.A02 = false;
        }
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // X.GIK
    public final int A2g(GI0 gi0) {
        return gi0.b.hashCode();
    }

    @Override // X.GIK
    public final GI0 A2i() {
        GIF gif = this.A00;
        boolean z = gif instanceof GI0;
        GI0 gi0 = (GI0) gif;
        if (z) {
            return (GI0) gi0.A0E(4);
        }
        GIG gig = (GIG) gi0.A0E(5);
        GI0 gi02 = gig.A00;
        if (AbstractC7609F5w.A1U(gi02.memoizedSerializedSize, Integer.MIN_VALUE)) {
            gi02.A0F();
        }
        return gig.A00;
    }

    @Override // X.GIK
    public final boolean A2l(GI0 gi0, GI0 gi02) {
        return C8j3.A1S(gi0.b.equals(gi02.b) ? 1 : 0);
    }

    @Override // X.GIK
    public final int A51(GI0 gi0) {
        GI4 gi4 = gi0.b;
        int i = gi4.A01;
        if (i != -1) {
            return i;
        }
        int iA05 = 0;
        for (int i2 = 0; i2 < gi4.A00; i2++) {
            int i3 = gi4.A03[i2] >>> 3;
            AbstractC9330GEn abstractC9330GEn = (AbstractC9330GEn) gi4.A04[i2];
            int iA052 = AbstractC7609F5w.A05(i3) + AbstractC7609F5w.A05(16) + (AbstractC7609F5w.A05(8) * 2);
            int iA00 = GI5.A00(3);
            int iA01 = abstractC9330GEn.A01();
            iA05 += AbstractC7609F5w.A05(iA01) + iA01 + iA00 + iA052;
        }
        gi4.A01 = iA05;
        return iA05;
    }

    public GI6(GIF gif, C9411GIa c9411GIa) {
        this.A01 = c9411GIa;
        this.A00 = gif;
    }

    @Override // X.GIK
    public final boolean A2m(Object obj) {
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // X.GIK
    public final void A2o(GIQ giq, Object obj) {
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // X.GIK
    public final void A2j(Object obj, Object obj2) {
        GI2.A05(obj, obj2);
    }
}
