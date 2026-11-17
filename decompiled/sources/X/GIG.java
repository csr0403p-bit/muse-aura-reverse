package X;

import com.android.billingclient.wa;

/* loaded from: classes6.dex */
public abstract class GIG extends HiH {
    public GI0 A00;
    public final GI0 A01;

    public final GI0 A03() {
        GI0 gi0 = this.A00;
        if (AbstractC7609F5w.A1U(gi0.memoizedSerializedSize, Integer.MIN_VALUE)) {
            gi0.A0F();
            gi0 = this.A00;
        }
        gi0.getClass();
        byte bByteValue = ((Number) gi0.A0E(1)).byteValue();
        if (bByteValue == 1) {
            return gi0;
        }
        if (bByteValue == 0) {
            throw new wa();
        }
        AbstractC7609F5w.A0Y(gi0).A2m(gi0);
        gi0.A0E(2);
        throw F60.createAndThrow();
    }

    public final void A04() {
        if (AbstractC7609F5w.A1U(this.A00.memoizedSerializedSize, Integer.MIN_VALUE)) {
            return;
        }
        GI0 gi0 = (GI0) this.A01.A0E(4);
        AbstractC7609F5w.A0Y(gi0).A2j(gi0, this.A00);
        this.A00 = gi0;
    }

    public final Object clone() {
        GIG gig = (GIG) this.A01.A0E(5);
        GI0 gi0 = this.A00;
        if (AbstractC7609F5w.A1U(gi0.memoizedSerializedSize, Integer.MIN_VALUE)) {
            gi0.A0F();
            gi0 = this.A00;
        }
        gig.A00 = gi0;
        return gig;
    }

    public GIG(GI0 gi0) {
        this.A01 = gi0;
        if (AbstractC7609F5w.A1U(gi0.memoizedSerializedSize, Integer.MIN_VALUE)) {
            throw C60O.A0i("Default instance must be immutable.");
        }
        this.A00 = (GI0) gi0.A0E(4);
    }

    public static C9543GNz A00(GIG gig) {
        gig.A04();
        return (C9543GNz) gig.A00;
    }

    public static C9523GNa A01(GIG gig) {
        gig.A04();
        return (C9523GNa) gig.A00;
    }

    public static GI0 A02(GIG gig) {
        gig.A04();
        return gig.A00;
    }
}
