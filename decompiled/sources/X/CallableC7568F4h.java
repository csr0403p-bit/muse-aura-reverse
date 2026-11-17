package X;

import androidx.work.impl.WorkDatabase_Impl;
import com.instagram.common.bloks.componentquery.cache.DiskCacheMetadata;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* renamed from: X.F4h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class CallableC7568F4h implements Callable {
    public final int $t;
    public final Object A00;
    public final Object A01;
    public final String A02;

    public CallableC7568F4h(Object obj, Object obj2, String str, int i) {
        this.$t = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                EKU eku = (EKU) this.A00;
                AbstractCollection abstractCollection = (AbstractCollection) this.A01;
                String str = this.A02;
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) eku.A03;
                abstractCollection.addAll((Collection) C7596F5j.A00(((EMQ) workDatabase_Impl.A07.getValue()).A01, str, 19));
                C6605EJh c6605EJh = (C6605EJh) workDatabase_Impl.A06.getValue();
                C7384Etj.A0Y(str, 0);
                return (EKE) C7596F5j.A00(c6605EJh.A01, str, 12);
            case 1:
                EEO eeo = (EEO) this.A01;
                String str2 = this.A02;
                eeo.A01.A00.remove(str2);
                Map<String, DiskCacheMetadata> map = eeo.A06.get();
                C7384Etj.A0U(map);
                EEO.A01(eeo, AGH.A09(str2, AGH.A0A(map)));
                return Unit.INSTANCE;
            default:
                Map.Entry entry = (Map.Entry) this.A00;
                String str3 = this.A02;
                try {
                    return (String) ((C3188C2e) entry.getValue()).A01.AMN();
                } catch (Throwable th) {
                    CFK.A0D(C9Y.TAG, "Failed to apply lazy supplier: %s", th, str3);
                    C2Q.A00().AT9("FbCustomReportDataSupplier", th, null);
                    return "";
                }
        }
    }
}
