package X;

import android.content.pm.ResolveInfo;
import android.graphics.Rect;
import android.media.MediaCodec;
import android.util.Size;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* renamed from: X.F4m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7573F4m implements Comparator {
    public final int $t;
    public final Object A00;

    public C7573F4m(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        long jA05;
        Object orDefault;
        int iIndexOf;
        int iIndexOf2;
        switch (this.$t) {
            case 0:
                BhS bhS = (BhS) obj2;
                Class<?> cls = ((C2649Bgg) ((BhS) obj)).A03.A03;
                if (cls == MediaCodec.class) {
                    iIndexOf = 2;
                } else {
                    iIndexOf = 1;
                    if (cls == BfA.class) {
                        iIndexOf = 0;
                    }
                }
                Class<?> cls2 = ((C2649Bgg) bhS).A03.A03;
                if (cls2 == MediaCodec.class) {
                    iIndexOf2 = 2;
                } else {
                    iIndexOf2 = 1;
                    if (cls2 == BfA.class) {
                        iIndexOf2 = 0;
                    }
                }
                return iIndexOf - iIndexOf2;
            case 1:
                Rect rect = (Rect) this.A00;
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                Bf9 bf9 = Bf9.$redex_init_class;
                iIndexOf = Math.abs(size.getWidth() - rect.width()) + Math.abs(size.getHeight() - rect.height());
                iIndexOf2 = Math.abs(size2.getWidth() - rect.width()) + Math.abs(size2.getHeight() - rect.height());
                return iIndexOf - iIndexOf2;
            case 2:
                float fA02 = AnonymousClass001.A02(((C7418EvO) obj).A01);
                float fA022 = AnonymousClass001.A02(((C7418EvO) obj2).A01);
                if (fA022 <= fA02) {
                    return fA02 > fA022 ? -1 : 0;
                }
                return 1;
            case 3:
                long jA00 = ((C7088Efr) obj).A00();
                long jA002 = ((C7088Efr) obj2).A00();
                if (jA00 >= jA002) {
                    return jA002 == jA00 ? 0 : 1;
                }
                return -1;
            case 4:
                Map map = (Map) this.A00;
                List list = C4E.A05;
                jA05 = C3cG.A05(map.get(obj));
                orDefault = map.get(obj2);
                break;
            case 5:
                Map map2 = (Map) this.A00;
                Long lA0o = BV7.A0o();
                jA05 = C3cG.A05(map2.getOrDefault(obj, lA0o));
                orDefault = map2.getOrDefault(obj2, lA0o);
                break;
            case 6:
                ResolveInfo resolveInfo = (ResolveInfo) obj;
                ResolveInfo resolveInfo2 = (ResolveInfo) obj2;
                boolean z = resolveInfo.isDefault;
                boolean z2 = resolveInfo2.isDefault;
                if (z != z2) {
                    return z2 ? 1 : -1;
                }
                List list2 = (List) this.A00;
                iIndexOf = list2.indexOf(resolveInfo2.resolvePackageName);
                iIndexOf2 = list2.indexOf(resolveInfo.resolvePackageName);
                return iIndexOf - iIndexOf2;
            default:
                InterfaceC6273DzQ interfaceC6273DzQ = (InterfaceC6273DzQ) this.A00;
                iIndexOf = interfaceC6273DzQ.AK3(obj2);
                iIndexOf2 = interfaceC6273DzQ.AK3(obj);
                return iIndexOf - iIndexOf2;
        }
        return (jA05 > C3cG.A05(orDefault) ? 1 : (jA05 == C3cG.A05(orDefault) ? 0 : -1));
    }
}
