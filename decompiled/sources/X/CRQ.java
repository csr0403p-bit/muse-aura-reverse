package X;

import android.util.SparseArray;
import com.facebook.aura.localbrowser.core.BrowserOperationCatalogKt;

/* loaded from: classes5.dex */
public final class CRQ {
    public TMap A00;
    public final SparseArray<TMap> A01 = new SparseArray<>(8);
    public final CRR A02;

    public static final Object A00(CRQ crq, int i) {
        String str;
        int i2;
        Object obj = crq.A00;
        if (obj == null) {
            throw BV4.A0a("Attempting to use visitor without destination");
        }
        switch (i) {
            case 1:
                str = "string";
                i2 = 0;
                break;
            case 2:
            case 3:
                str = "int";
                i2 = 1;
                break;
            case 4:
                str = "string_array";
                i2 = 7;
                break;
            case 5:
            default:
                str = "int_array";
                i2 = 6;
                break;
            case 6:
                str = BrowserOperationCatalogKt.DOUBLE;
                i2 = 4;
                break;
            case 7:
                str = "double_array";
                i2 = 5;
                break;
            case 8:
                str = "bool";
                i2 = 2;
                break;
            case 9:
                str = "bool_array";
                i2 = 3;
                break;
        }
        SparseArray<TMap> sparseArray = crq.A01;
        Object obj2 = sparseArray.get(i2);
        if (obj2 != null) {
            return obj2;
        }
        C3341CFl c3341CFlA00 = crq.A02.A00(obj, str);
        sparseArray.put(i2, c3341CFlA00);
        return c3341CFlA00;
    }

    public CRQ(CRR crr) {
        this.A02 = crr;
    }
}
