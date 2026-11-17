package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class BBW extends ApK implements Iterable, InterfaceC1656Anf, BOA {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Ab2<Aeh> A04;
    public HashMap A06;
    public boolean A07;
    public int[] A08 = new int[0];
    public Object[] A09 = new Object[0];
    public ArrayList<BCR> A05 = new ArrayList<>();

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new BCI(this, 0, this.A00);
    }

    public final int A00(BCR bcr) {
        if (this.A07) {
            BBL.A01("Use active SlotWriter to determine anchor location instead");
            throw F60.createAndThrow();
        }
        if (AnonymousClass002.A1P(bcr.A00, Integer.MIN_VALUE)) {
            return bcr.A00;
        }
        throw C60O.A0i("Anchor refers to a group that was removed");
    }

    public final BBQ A01() {
        if (this.A07) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.A01++;
        return new BBQ(this);
    }

    public final BBJ A02() {
        String str;
        if (this.A07) {
            str = "Cannot start a writer when another writer is pending";
        } else {
            if (this.A01 <= 0) {
                this.A07 = true;
                this.A03++;
                return new BBJ(this);
            }
            str = "Cannot start a writer when a reader is pending";
        }
        BBL.A01(str);
        throw F60.createAndThrow();
    }

    public final void A03(int i) {
        int i2;
        ArrayList<BCR> arrayList;
        int iA00;
        BCR bcr;
        HashMap map = this.A06;
        if (map != null) {
            if (this.A07) {
                BBL.A01("use active SlotWriter to crate an anchor for location instead");
                throw F60.createAndThrow();
            }
            if (i < 0 || i >= (i2 = this.A00) || (iA00 = BCA.A00((arrayList = this.A05), i, i2)) < 0 || (bcr = arrayList.get(iA00)) == null) {
                return;
            }
            map.get(bcr);
        }
    }

    public final boolean A04(BCR bcr) {
        ArrayList<BCR> arrayList;
        int iA00;
        return AnonymousClass002.A1P(bcr.A00, Integer.MIN_VALUE) && (iA00 = BCA.A00((arrayList = this.A05), bcr.A00, this.A00)) >= 0 && C7384Etj.areEqual(arrayList.get(iA00), bcr);
    }
}
