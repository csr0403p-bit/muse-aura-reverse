package com.facebook.quicklog;

import X.AnonymousClass002;
import X.BV4;
import X.BV7;
import X.BV8;
import X.C06827l3;
import X.C0881AGi;
import X.C3cG;
import X.C7384Etj;
import X.FGI;
import com.facebook.aura.analytics.waterfall.HatchPriceImpressionEventDataKt;
import java.util.List;
import java.util.ListIterator;
import org.maplibre.android.R;

/* loaded from: classes5.dex */
public final class JNIMethodsBridge {
    public static final JNIMethodsBridge INSTANCE = new JNIMethodsBridge();

    public static final void markerPoint(int i, int i2, String str, String[] strArr, int i3, long j, boolean z, QuickPerformanceLogger quickPerformanceLogger) {
        C7384Etj.A0Y(str, 2);
        C7384Etj.A0Y(strArr, 3);
        if (quickPerformanceLogger != null) {
            int length = strArr.length;
            if (length % 3 == 0) {
                MarkerEditor markerEditorWithMarker = quickPerformanceLogger.withMarker(i, i2);
                markerEditorWithMarker.withLevel(i3);
                PointEditor pointEditorPointShouldIncludeMetadata = markerEditorWithMarker.pointEditor(str).pointCustomTimestamp(j).pointShouldIncludeMetadata(z);
                C7384Etj.A0U(pointEditorPointShouldIncludeMetadata);
                for (int i4 = 0; i4 < length; i4 += 3) {
                    String str2 = strArr[i4];
                    String str3 = strArr[i4 + 1];
                    String str4 = strArr[i4 + 2];
                    switch (str4.hashCode()) {
                        case R.styleable.maplibre_MapView_maplibre_uiRotateGestures /* 49 */:
                            if (!str4.equals("1")) {
                                throw new IllegalArgumentException(FGI.A0M("Type entry is not supported: ", str4));
                            }
                            pointEditorPointShouldIncludeMetadata.addPointData(str2, str3);
                            break;
                        case 50:
                            if (!str4.equals("2")) {
                                throw new IllegalArgumentException(FGI.A0M("Type entry is not supported: ", str4));
                            }
                            pointEditorPointShouldIncludeMetadata.addPointData(str2, Long.parseLong(str3));
                            break;
                        case R.styleable.maplibre_MapView_maplibre_uiTiltGestures /* 51 */:
                            if (!str4.equals("3")) {
                                throw new IllegalArgumentException(FGI.A0M("Type entry is not supported: ", str4));
                            }
                            pointEditorPointShouldIncludeMetadata.addPointData(str2, Double.parseDouble(str3));
                            break;
                        case 52:
                            if (!str4.equals("4")) {
                                throw new IllegalArgumentException(FGI.A0M("Type entry is not supported: ", str4));
                            }
                            pointEditorPointShouldIncludeMetadata.addPointData(str2, !HatchPriceImpressionEventDataKt.NO_DISCOUNT.equals(str3));
                            break;
                        case 53:
                            if (!str4.equals("5")) {
                                throw new IllegalArgumentException(FGI.A0M("Type entry is not supported: ", str4));
                            }
                            pointEditorPointShouldIncludeMetadata.addPointData(str2, toStringArray(str3));
                            break;
                        case 54:
                            if (!str4.equals("6")) {
                                throw new IllegalArgumentException(FGI.A0M("Type entry is not supported: ", str4));
                            }
                            String[] stringArray = toStringArray(str3);
                            int length2 = stringArray.length;
                            long[] jArr = new long[length2];
                            for (int i5 = 0; i5 < length2; i5++) {
                                jArr[i5] = Long.parseLong(stringArray[i5]);
                            }
                            pointEditorPointShouldIncludeMetadata.addPointData(str2, jArr);
                            break;
                        case 55:
                            if (!str4.equals("7")) {
                                throw new IllegalArgumentException(FGI.A0M("Type entry is not supported: ", str4));
                            }
                            String[] stringArray2 = toStringArray(str3);
                            int length3 = stringArray2.length;
                            double[] dArr = new double[length3];
                            for (int i6 = 0; i6 < length3; i6++) {
                                dArr[i6] = Double.parseDouble(stringArray2[i6]);
                            }
                            pointEditorPointShouldIncludeMetadata.addPointData(str2, dArr);
                            break;
                        case 56:
                            if (!str4.equals("8")) {
                                throw new IllegalArgumentException(FGI.A0M("Type entry is not supported: ", str4));
                            }
                            String[] stringArray3 = toStringArray(str3);
                            int length4 = stringArray3.length;
                            boolean[] zArr = new boolean[length4];
                            for (int i7 = 0; i7 < length4; i7++) {
                                zArr[i7] = "1".equals(stringArray3[i7]);
                            }
                            pointEditorPointShouldIncludeMetadata.addPointData(str2, zArr);
                            break;
                        default:
                            throw new IllegalArgumentException(FGI.A0M("Type entry is not supported: ", str4));
                    }
                }
                pointEditorPointShouldIncludeMetadata.pointEditingCompleted().markerEditingCompleted();
            }
        }
    }

    public static final String[] toStringArray(String str) {
        List listA1A;
        List listA05 = C06827l3.A02(",,,").A05(str);
        if (listA05.isEmpty()) {
            listA1A = C0881AGi.A00;
        } else {
            ListIterator listIteratorA0n = C3cG.A0n(listA05);
            while (listIteratorA0n.hasPrevious()) {
                if (BV7.A0M(listIteratorA0n) != 0) {
                    listA1A = BV8.A1A(listA05, listIteratorA0n);
                    break;
                }
            }
            listA1A = C0881AGi.A00;
        }
        return BV4.A1b(listA1A);
    }

    public static final void markerPoint(int i, int i2, String str, String str2, int i3, long j, QuickPerformanceLogger quickPerformanceLogger) {
        MarkerEditor markerEditorWithMarker;
        PointEditor pointEditorAddPointData;
        PointEditor pointEditorPointCustomTimestamp;
        MarkerEditor markerEditorPointEditingCompleted;
        AnonymousClass002.A1B(str, 2, str2);
        if (quickPerformanceLogger != null && (markerEditorWithMarker = quickPerformanceLogger.withMarker(i, i2)) != null) {
            markerEditorWithMarker.withLevel(i3);
            PointEditor pointEditor = markerEditorWithMarker.pointEditor(str);
            if (pointEditor != null && (pointEditorAddPointData = pointEditor.addPointData("__key", str2)) != null && (pointEditorPointCustomTimestamp = pointEditorAddPointData.pointCustomTimestamp(j)) != null && (markerEditorPointEditingCompleted = pointEditorPointCustomTimestamp.pointEditingCompleted()) != null) {
                markerEditorPointEditingCompleted.markerEditingCompleted();
            }
        }
    }

    public static final void markerPoint(int i, int i2, String str, int i3, long j, QuickPerformanceLogger quickPerformanceLogger) {
        MarkerEditor markerEditorWithMarker;
        PointEditor pointEditorPointCustomTimestamp;
        MarkerEditor markerEditorPointEditingCompleted;
        C7384Etj.A0Y(str, 2);
        if (quickPerformanceLogger != null && (markerEditorWithMarker = quickPerformanceLogger.withMarker(i, i2)) != null) {
            markerEditorWithMarker.withLevel(i3);
            PointEditor pointEditor = markerEditorWithMarker.pointEditor(str);
            if (pointEditor != null && (pointEditorPointCustomTimestamp = pointEditor.pointCustomTimestamp(j)) != null && (markerEditorPointEditingCompleted = pointEditorPointCustomTimestamp.pointEditingCompleted()) != null) {
                markerEditorPointEditingCompleted.markerEditingCompleted();
            }
        }
    }
}
