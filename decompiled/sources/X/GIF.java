package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class GIF {
    public transient int a = 0;

    public static void A08(GIG gig) {
        gig.A04();
        GO4 go4 = (GO4) gig.A00;
        go4.bitField0_ |= 8;
        go4.autoServiceReconnectionAttempt_ = false;
        gig.A04();
        GO4 go42 = (GO4) gig.A00;
        go42.bitField0_ |= 16;
        go42.autoServiceReconnectionAttemptCount_ = 0;
    }

    public final byte[] A0C() {
        try {
            GI0 gi0 = (GI0) this;
            int iA0B = gi0.A0B(null);
            byte[] bArr = new byte[iA0B];
            GI5 gi5 = new GI5(bArr, iA0B);
            gi0.A0G(gi5);
            int i = gi5.A02 - gi5.A00;
            if (i > 0) {
                throw C3cG.A0Q("Did not write as much data as expected.");
            }
            if (i >= 0) {
                return bArr;
            }
            throw C3cG.A0Q("Wrote more data than expected.");
        } catch (IOException e) {
            throw BV4.A0d(FGI.A0h("Serializing ", C60Q.A0e(this), " to a ", "byte array", " threw an IOException (should never happen)."), e);
        }
    }

    public static C9523GNa A04(GNT gnt, int i) {
        C9524GNb c9524GNb = (C9524GNb) gnt.A00.A0D();
        c9524GNb.A04();
        C9523GNa c9523GNa = (C9523GNa) c9524GNb.A00;
        int i2 = C9523GNa.c;
        c9523GNa.bitField0_ |= 8;
        c9523GNa.billingApiVersion_ = i;
        return (C9523GNa) c9524GNb.A03();
    }

    public static void A06(GNM gnm, C9543GNz c9543GNz, GIG gig, int i) {
        c9543GNz.bitField0_ |= 1;
        c9543GNz.responseCode_ = i;
        String str = gnm.A02;
        gig.A04();
        C9543GNz c9543GNz2 = (C9543GNz) gig.A00;
        c9543GNz2.getClass();
        str.getClass();
        c9543GNz2.bitField0_ |= 2;
        c9543GNz2.debugMessage_ = str;
    }

    public static void A07(GNU gnu, GNT gnt, GIG gig, int i) {
        gnu.eventCase_ = i;
        gnt.A01.A00((GNU) gig.A03());
    }

    public final int A0B(GIK gik) {
        int iA51;
        GI0 gi0 = (GI0) this;
        if (AbstractC7609F5w.A1U(gi0.memoizedSerializedSize, Integer.MIN_VALUE)) {
            if (gik == null) {
                gik = AbstractC7609F5w.A0Y(gi0);
            }
            iA51 = gik.A51(gi0);
            if (iA51 < 0) {
                throw BV7.A0l("serialized size must be non-negative, was ", iA51);
            }
        } else {
            iA51 = gi0.memoizedSerializedSize & Integer.MAX_VALUE;
            if (iA51 == Integer.MAX_VALUE) {
                if (gik == null) {
                    gik = AbstractC7609F5w.A0Y(gi0);
                }
                int iA512 = gik.A51(gi0);
                if (iA512 < 0) {
                    throw BV7.A0l("serialized size must be non-negative, was ", iA512);
                }
                gi0.memoizedSerializedSize = (Integer.MAX_VALUE & iA512) | (gi0.memoizedSerializedSize & Integer.MIN_VALUE);
                return iA512;
            }
        }
        return iA51;
    }

    public static GNU A03(C9523GNa c9523GNa, GIG gig) {
        gig.A04();
        GNU gnu = (GNU) gig.A00;
        int i = GNU.c;
        gnu.getClass();
        c9523GNa.getClass();
        gnu.clientMetaInfo_ = c9523GNa;
        gnu.bitField0_ |= 1;
        gig.A04();
        GNU gnu2 = (GNU) gig.A00;
        gnu2.getClass();
        return gnu2;
    }

    public static GI0 A05(GI0 gi0, long j) {
        C9524GNb c9524GNb = (C9524GNb) gi0.A0D();
        c9524GNb.A04();
        C9523GNa c9523GNa = (C9523GNa) c9524GNb.A00;
        int i = C9523GNa.c;
        c9523GNa.bitField0_ |= 32;
        c9523GNa.billingClientTransactionId_ = j;
        return c9524GNb.A03();
    }

    public static void A09(GIG gig, EnumC8948FuN enumC8948FuN) {
        gig.A04();
        C9423GIm c9423GIm = (C9423GIm) gig.A00;
        c9423GIm.getClass();
        c9423GIm.receiverEvent_ = enumC8948FuN.a;
        c9423GIm.bitField0_ |= 2;
    }
}
