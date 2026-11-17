package X;

import com.facebook.nativeutil.NativeList;
import com.facebook.nativeutil.NativeMap;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class C01 {
    public static final Object A00(Object obj) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Float) || (obj instanceof Byte)) {
            return Double.valueOf(BV6.A00(obj));
        }
        if (obj instanceof Map) {
            return new NativeMap((Map) obj);
        }
        if (obj.getClass().isArray()) {
            NativeList nativeList = NativeList.$redex_init_class;
            obj = ImmutableList.of(obj);
        } else if (!(obj instanceof List)) {
            return obj;
        }
        return new NativeList((List<? extends Object>) obj);
    }
}
