package X;

import com.facebook.quicklog.EventBuilder;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class DKT implements EventBuilder {
    public final int A00;
    public final int A01;
    public final String A02;
    public final ArrayList<DKX> A03 = C3cG.A0h();
    public final DKO A04;

    @Override // com.facebook.quicklog.EventBuilder
    public final void report() {
        DKO.A02(this.A04, this, null, "", TimeUnit.MILLISECONDS, 14, 0, 0, 0L);
    }

    public static void A00(Object obj, String str, AbstractCollection abstractCollection, int i) {
        abstractCollection.add(new DKX(str, obj, i));
    }

    @Override // com.facebook.quicklog.EventBuilder
    public final boolean isSampled() {
        return true;
    }

    @Override // com.facebook.quicklog.EventBuilder
    public final EventBuilder setActionId(short s) {
        A00(Short.valueOf(s), "", this.A03, 51);
        return this;
    }

    @Override // com.facebook.quicklog.EventBuilder
    public final EventBuilder setLevel(int i) {
        A00(Integer.valueOf(i), "", this.A03, 32);
        return this;
    }

    public DKT(DKO dko, String str, int i, int i2) {
        this.A04 = dko;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = str;
    }

    @Override // com.facebook.quicklog.EventBuilder
    public final EventBuilder annotate(String str, double d) {
        A00(Double.valueOf(d), str, this.A03, 8);
        return this;
    }

    @Override // com.facebook.quicklog.EventBuilder
    public final EventBuilder annotate(String str, int i) {
        A00(Integer.valueOf(i), str, this.A03, 5);
        return this;
    }

    @Override // com.facebook.quicklog.EventBuilder
    public final EventBuilder annotate(String str, long j) {
        A00(Long.valueOf(j), str, this.A03, 11);
        return this;
    }

    @Override // com.facebook.quicklog.EventBuilder
    public final EventBuilder annotate(String str, String str2) {
        A00(str2, str, this.A03, 4);
        return this;
    }

    @Override // com.facebook.quicklog.EventBuilder
    public final EventBuilder annotate(String str, boolean z) {
        A00(Boolean.valueOf(z), str, this.A03, 6);
        return this;
    }

    @Override // com.facebook.quicklog.EventBuilder
    public final EventBuilder annotate(String str, double[] dArr) {
        A00(dArr, str, this.A03, 17);
        return this;
    }

    @Override // com.facebook.quicklog.EventBuilder
    public final EventBuilder annotate(String str, int[] iArr) {
        A00(iArr, str, this.A03, 10);
        return this;
    }

    @Override // com.facebook.quicklog.EventBuilder
    public final EventBuilder annotate(String str, long[] jArr) {
        A00(jArr, str, this.A03, 15);
        return this;
    }

    @Override // com.facebook.quicklog.EventBuilder
    public final EventBuilder annotate(String str, String[] strArr) {
        A00(strArr, str, this.A03, 9);
        return this;
    }

    @Override // com.facebook.quicklog.EventBuilder
    public final EventBuilder annotate(String str, boolean[] zArr) {
        A00(zArr, str, this.A03, 16);
        return this;
    }
}
