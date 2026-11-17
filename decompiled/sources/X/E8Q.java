package X;

import com.google.common.base.Ascii;
import com.google.common.base.Equivalence;
import com.google.common.base.MoreObjects$ToStringHelper;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers$SupplierOfInstance;
import com.google.common.base.Ticker;
import java.util.logging.Level;

/* loaded from: classes5.dex */
public final class E8Q<K, V> {
    public static final Supplier<? extends E9R> A0E = new Suppliers$SupplierOfInstance(new E9A());
    public static final Ticker A0F = new E99();
    public Equivalence<Object> A05;
    public Equivalence<Object> A06;
    public Ticker A08;
    public E8V A09;
    public E8V A0A;
    public CQN<? super K, ? super V> A0B;
    public E98<? super K, ? super V> A0C;
    public boolean A0D = true;
    public int A00 = -1;
    public long A03 = -1;
    public long A04 = -1;
    public long A02 = -1;
    public long A01 = -1;
    public Supplier<? extends E9R> A07 = A0E;

    public final <K1 extends K, V1 extends V> HsZ<K1, V1> A00() {
        boolean z;
        String str;
        if (this.A0C == null) {
            z = this.A04 == -1;
            str = "maximumWeight requires weigher";
        } else {
            boolean z2 = this.A0D;
            long j = this.A04;
            if (!z2) {
                if (j == -1) {
                    E92.A00.log(Level.WARNING, "ignoring weigher specified without maximumWeight");
                }
                return new E8W(this);
            }
            z = j != -1;
            str = "weigher requires maximumWeight";
        }
        Preconditions.checkState(z, str);
        return new E8W(this);
    }

    public final String toString() {
        MoreObjects$ToStringHelper moreObjects$ToStringHelper = new MoreObjects$ToStringHelper(C3cI.A0Y(this));
        int i = this.A00;
        if (i != -1) {
            moreObjects$ToStringHelper.add("concurrencyLevel", i);
        }
        long j = this.A03;
        if (j != -1) {
            moreObjects$ToStringHelper.add("maximumSize", j);
        }
        long j2 = this.A04;
        if (j2 != -1) {
            moreObjects$ToStringHelper.add("maximumWeight", j2);
        }
        long j3 = this.A02;
        if (j3 != -1) {
            StringBuilder sbA0w = C60O.A0w();
            sbA0w.append(j3);
            moreObjects$ToStringHelper.add("expireAfterWrite", AnonymousClass001.A0v("ns", sbA0w));
        }
        long j4 = this.A01;
        if (j4 != -1) {
            StringBuilder sbA0w2 = C60O.A0w();
            sbA0w2.append(j4);
            moreObjects$ToStringHelper.add("expireAfterAccess", AnonymousClass001.A0v("ns", sbA0w2));
        }
        E8V e8v = this.A09;
        if (e8v != null) {
            moreObjects$ToStringHelper.add("keyStrength", Ascii.toLowerCase(e8v.toString()));
        }
        E8V e8v2 = this.A0A;
        if (e8v2 != null) {
            moreObjects$ToStringHelper.add("valueStrength", Ascii.toLowerCase(e8v2.toString()));
        }
        if (this.A05 != null) {
            moreObjects$ToStringHelper.addValue("keyEquivalence");
        }
        if (this.A06 != null) {
            moreObjects$ToStringHelper.addValue("valueEquivalence");
        }
        if (this.A0B != null) {
            moreObjects$ToStringHelper.addValue("removalListener");
        }
        return moreObjects$ToStringHelper.toString();
    }
}
