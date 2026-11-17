package X;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class GNr {
    public static final GNr $redex_init_class = null;

    public static String A02(Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            String strA0Y = C3cI.A0Y(exc);
            String message = exc.getMessage();
            if (message == null) {
                message = "";
            }
            String strA0U = FGI.A0U(strA0Y, ":", message);
            return strA0U.length() > 40 ? BV4.A0j(strA0U, 40) : strA0U;
        } catch (Throwable th) {
            GNN.A07("BillingLogger", "Unable to get truncated exception info", th);
            return null;
        }
    }

    static {
        GNK gnk = GNK.$redex_init_class;
    }

    public static C9541GNx A00(GNM gnm, EnumC9540GNw enumC9540GNw, EnumC9535GNn enumC9535GNn, G4i g4i, String str) {
        try {
            int i = C9543GNz.c;
            C9528GNf c9528GNf = new C9528GNf();
            GIF.A06(gnm, GIG.A00(c9528GNf), c9528GNf, gnm.A00);
            int i2 = gnm.A01;
            if (i2 != 0) {
                C9543GNz c9543GNzA00 = GIG.A00(c9528GNf);
                c9543GNzA00.bitField0_ |= 16;
                c9543GNzA00.onPurchasesUpdatedSubResponseCode_ = i2;
            }
            if (enumC9535GNn != null) {
                C9543GNz.A0A(enumC9535GNn, GIG.A00(c9528GNf));
            }
            if (str != null) {
                C9543GNz c9543GNzA002 = GIG.A00(c9528GNf);
                c9543GNzA002.getClass();
                c9543GNzA002.bitField0_ |= 8;
                c9543GNzA002.additionalDetails_ = str;
            }
            int i3 = C9541GNx.c;
            GOC goc = new GOC();
            goc.A05(c9528GNf);
            C9541GNx.A0A((C9541GNx) GIG.A02(goc), enumC9540GNw);
            if (!g4i.equals(G4i.A01)) {
                C9541GNx c9541GNx = (C9541GNx) GIG.A02(goc);
                c9541GNx.getClass();
                c9541GNx.billingBroadcastAction_ = g4i.a;
                c9541GNx.bitField0_ |= 4;
            }
            return (C9541GNx) goc.A03();
        } catch (Throwable th) {
            GNN.A07("BillingLogger", "Unable to create logging payload", th);
            return null;
        }
    }

    public static C9542GNy A01(EnumC9540GNw enumC9540GNw, G4i g4i) {
        try {
            int i = C9542GNy.c;
            C9529GNg c9529GNg = new C9529GNg();
            C9542GNy.A0A(enumC9540GNw, (C9542GNy) GIG.A02(c9529GNg));
            if (!g4i.equals(G4i.A01)) {
                C9542GNy c9542GNy = (C9542GNy) GIG.A02(c9529GNg);
                c9542GNy.getClass();
                c9542GNy.billingBroadcastAction_ = g4i.a;
                c9542GNy.bitField0_ |= 2;
            }
            return (C9542GNy) c9529GNg.A03();
        } catch (Exception e) {
            GNN.A07("BillingLogger", "Unable to create logging payload", e);
            return null;
        }
    }
}
