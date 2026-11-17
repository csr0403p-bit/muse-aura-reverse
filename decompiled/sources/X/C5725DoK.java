package X;

import com.google.common.collect.ImmutableSet;
import java.util.Arrays;

/* renamed from: X.DoK, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5725DoK {
    public static final C5725DoK A03 = new C5725DoK(ImmutableSet.A03(new Object[]{BV4.A0W(), 5}, 2), null, null);
    public final ImmutableSet<Integer> A00;
    public final Double A01;
    public final Double A02;

    public C5725DoK(ImmutableSet immutableSet, Double d, Double d2) {
        this.A00 = immutableSet;
        this.A02 = d2;
        this.A01 = d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5725DoK)) {
            return false;
        }
        C5725DoK c5725DoK = (C5725DoK) obj;
        return this.A00.equals(c5725DoK.A00) && C6xC.A00(this.A02, c5725DoK.A02) && C6xC.A00(this.A01, c5725DoK.A01);
    }

    public final int hashCode() {
        ImmutableSet<Integer> immutableSet = this.A00;
        Double d = this.A02;
        Double d2 = this.A01;
        Boolean boolA0i = AnonymousClass001.A0i();
        return Arrays.hashCode(new Object[]{immutableSet, d, d2, boolA0i, boolA0i, boolA0i, boolA0i});
    }
}
