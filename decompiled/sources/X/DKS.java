package X;

import android.os.SystemClock;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.PointEditor;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class DKS extends MarkerEditor implements PointEditor {
    public final int A00;
    public final int A01;
    public final ArrayList<DKV> A02 = C3cG.A0h();
    public final DKO A03;

    @Override // com.facebook.quicklog.MarkerEditor, com.facebook.quicklog.PointEditor
    public final void markerEditingCompleted() {
        DKO.A02(this.A03, this, null, "", TimeUnit.MILLISECONDS, 13, 0, 0, 0L);
    }

    public static void A00(Object obj, String str, AbstractCollection abstractCollection, int i) {
        abstractCollection.add(new DKV(obj, str, i, 0L));
    }

    @Override // com.facebook.quicklog.MarkerEditor
    public final boolean isSampled() {
        return true;
    }

    @Override // com.facebook.quicklog.MarkerEditor
    public final MarkerEditor point(String str, String str2, long j) {
        this.A02.add(new DKV(str2, str, 3, j));
        return this;
    }

    @Override // com.facebook.quicklog.PointEditor
    public final PointEditor pointCustomTimestamp(long j) {
        this.A02.add(new DKV(null, "", 37, j));
        return this;
    }

    @Override // com.facebook.quicklog.PointEditor
    public final MarkerEditor pointEditingCompleted() {
        A00(null, "", this.A02, 35);
        return this;
    }

    @Override // com.facebook.quicklog.MarkerEditor
    public final PointEditor pointEditor(String str) {
        this.A02.add(new DKV(null, str, 34, SystemClock.uptimeMillis()));
        return this;
    }

    @Override // com.facebook.quicklog.PointEditor
    public final PointEditor pointShouldIncludeMetadata(boolean z) {
        A00(Boolean.valueOf(z), "", this.A02, 36);
        return this;
    }

    @Override // com.facebook.quicklog.MarkerEditor
    public final MarkerEditor pointWithMetadata(String str, String str2, long j) {
        this.A02.add(new DKV(str2, str, 33, j));
        return this;
    }

    @Override // com.facebook.quicklog.MarkerEditor
    public final MarkerEditor setSurviveUserSwitch(boolean z) {
        A00(Boolean.valueOf(z), "", this.A02, 50);
        return this;
    }

    @Override // com.facebook.quicklog.MarkerEditor
    public final MarkerEditor withLevel(int i) {
        A00(Integer.valueOf(i), "", this.A02, 52);
        return this;
    }

    public DKS(DKO dko, int i, int i2) {
        this.A03 = dko;
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // com.facebook.quicklog.PointEditor
    public final PointEditor addPointData(String str, double d) {
        A00(Double.valueOf(d), str, this.A02, 42);
        return this;
    }

    @Override // com.facebook.quicklog.MarkerEditor
    public final MarkerEditor annotate(String str, double d) {
        A00(Double.valueOf(d), str, this.A02, 8);
        return this;
    }

    @Override // com.facebook.quicklog.PointEditor
    public final PointEditor addPointData(String str, long j) {
        A00(Long.valueOf(j), str, this.A02, 40);
        return this;
    }

    @Override // com.facebook.quicklog.MarkerEditor
    public final MarkerEditor annotate(String str, long j) {
        A00(Long.valueOf(j), str, this.A02, 11);
        return this;
    }

    @Override // com.facebook.quicklog.PointEditor
    public final PointEditor addPointData(String str, float f) {
        A00(Float.valueOf(f), str, this.A02, 41);
        return this;
    }

    @Override // com.facebook.quicklog.PointEditor
    public final PointEditor addPointData(String str, int i) {
        A00(Integer.valueOf(i), str, this.A02, 39);
        return this;
    }

    @Override // com.facebook.quicklog.PointEditor
    public final PointEditor addPointData(String str, boolean z) {
        A00(Boolean.valueOf(z), str, this.A02, 43);
        return this;
    }

    @Override // com.facebook.quicklog.MarkerEditor
    public final MarkerEditor annotate(String str, boolean z) {
        A00(Boolean.valueOf(z), str, this.A02, 6);
        return this;
    }

    @Override // com.facebook.quicklog.MarkerEditor
    public final MarkerEditor annotate(String str, int i) {
        A00(Integer.valueOf(i), str, this.A02, 5);
        return this;
    }

    @Override // com.facebook.quicklog.PointEditor
    public final PointEditor addPointData(String str, String str2) {
        A00(str2, str, this.A02, 38);
        return this;
    }

    @Override // com.facebook.quicklog.PointEditor
    public final PointEditor addPointData(String str, double[] dArr) {
        A00(dArr, str, this.A02, 48);
        return this;
    }

    @Override // com.facebook.quicklog.PointEditor
    public final PointEditor addPointData(String str, float[] fArr) {
        A00(fArr, str, this.A02, 47);
        return this;
    }

    @Override // com.facebook.quicklog.PointEditor
    public final PointEditor addPointData(String str, int[] iArr) {
        A00(iArr, str, this.A02, 44);
        return this;
    }

    @Override // com.facebook.quicklog.PointEditor
    public final PointEditor addPointData(String str, long[] jArr) {
        A00(jArr, str, this.A02, 46);
        return this;
    }

    @Override // com.facebook.quicklog.PointEditor
    public final PointEditor addPointData(String str, String[] strArr) {
        A00(strArr, str, this.A02, 45);
        return this;
    }

    @Override // com.facebook.quicklog.PointEditor
    public final PointEditor addPointData(String str, boolean[] zArr) {
        A00(zArr, str, this.A02, 49);
        return this;
    }

    @Override // com.facebook.quicklog.MarkerEditor
    public final MarkerEditor annotate(String str, double[] dArr) {
        A00(dArr, str, this.A02, 17);
        return this;
    }

    @Override // com.facebook.quicklog.MarkerEditor
    public final MarkerEditor annotate(String str, int[] iArr) {
        A00(iArr, str, this.A02, 10);
        return this;
    }

    @Override // com.facebook.quicklog.MarkerEditor
    public final MarkerEditor annotate(String str, long[] jArr) {
        A00(jArr, str, this.A02, 15);
        return this;
    }

    @Override // com.facebook.quicklog.MarkerEditor
    public final MarkerEditor annotate(String str, String[] strArr) {
        A00(strArr, str, this.A02, 9);
        return this;
    }

    @Override // com.facebook.quicklog.MarkerEditor
    public final MarkerEditor annotate(String str, boolean[] zArr) {
        A00(zArr, str, this.A02, 16);
        return this;
    }

    @Override // com.facebook.quicklog.MarkerEditor
    public final MarkerEditor annotate(String str, String str2) {
        A00(str2, str, this.A02, 4);
        return this;
    }
}
