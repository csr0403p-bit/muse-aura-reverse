package X;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Dwf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6137Dwf extends C6140Dwi {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final SparseArray A0G;
    public final SparseBooleanArray A0H;

    public final void A08(String str) {
        A05(str == null ? new String[0] : new String[]{str});
    }

    public final void A07(int i, boolean z) {
        SparseBooleanArray sparseBooleanArray = this.A0H;
        if (sparseBooleanArray.get(i) != z) {
            if (z) {
                sparseBooleanArray.put(i, true);
            } else {
                sparseBooleanArray.delete(i);
            }
        }
    }

    public C6137Dwf(C6136Dwe c6136Dwe) {
        C6140Dwi.A01(this, c6136Dwe);
        this.A0E = c6136Dwe.A0G;
        this.A08 = c6136Dwe.A0A;
        this.A09 = c6136Dwe.A0B;
        this.A07 = c6136Dwe.A09;
        this.A0B = c6136Dwe.A0D;
        this.A02 = c6136Dwe.A04;
        this.A03 = c6136Dwe.A05;
        this.A00 = c6136Dwe.A02;
        this.A01 = c6136Dwe.A03;
        this.A04 = c6136Dwe.A06;
        this.A0A = c6136Dwe.A0C;
        this.A0D = c6136Dwe.A0F;
        this.A0F = c6136Dwe.A0H;
        this.A06 = c6136Dwe.A08;
        this.A05 = c6136Dwe.A07;
        this.A0C = c6136Dwe.A0E;
        SparseArray sparseArray = c6136Dwe.A00;
        SparseArray sparseArrayA0B = BV4.A0B();
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArrayA0B.put(sparseArray.keyAt(i), BV4.A0w((Map) sparseArray.valueAt(i)));
        }
        this.A0G = sparseArrayA0B;
        this.A0H = c6136Dwe.A01.clone();
    }

    @Override // X.C6140Dwi
    public final /* bridge */ /* synthetic */ void A03(Set set) {
        super.A03(set);
    }

    @Override // X.C6140Dwi
    public final /* bridge */ /* synthetic */ void A04(boolean z) {
        super.A04(z);
    }

    @Override // X.C6140Dwi
    public final /* bridge */ /* synthetic */ void A05(String[] strArr) {
        super.A05(strArr);
    }

    @Override // X.C6140Dwi
    public final /* bridge */ /* synthetic */ void A06(String[] strArr) {
        super.A06(strArr);
    }

    @Override // X.C6140Dwi
    public final /* bridge */ /* synthetic */ void A02(int i, boolean z) {
        super.A02(i, z);
    }

    public C6137Dwf() {
        this.A0G = BV4.A0B();
        this.A0H = new SparseBooleanArray();
        this.A0E = true;
        this.A08 = false;
        this.A09 = true;
        this.A07 = false;
        this.A0B = true;
        this.A02 = false;
        this.A03 = false;
        this.A00 = false;
        this.A01 = false;
        this.A04 = true;
        this.A0A = true;
        this.A0D = true;
        this.A0F = false;
        this.A06 = true;
        this.A05 = false;
        this.A0C = false;
    }
}
