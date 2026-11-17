package X;

import com.google.common.base.Charsets;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Byl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3121Byl {
    public static final C3121Byl A02 = new C3121Byl(Collections.EMPTY_MAP);
    public int A00;
    public final Map<String, byte[]> A01;

    public final C3121Byl A01(C3122Bym c3122Bym) {
        Map<String, byte[]> map = this.A01;
        HashMap mapA0w = BV4.A0w(map);
        List listA13 = BV5.A13(c3122Bym.A00);
        for (int i = 0; i < listA13.size(); i++) {
            mapA0w.remove(listA13.get(i));
        }
        HashMap mapA0w2 = BV4.A0w(c3122Bym.A01);
        Iterator itA0i = C3cG.A0i(mapA0w2);
        while (itA0i.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0i);
            Object value = entryA0l.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entryA0l.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        Iterator itA0n = AnonymousClass002.A0n(Collections.unmodifiableMap(mapA0w2));
        while (itA0n.hasNext()) {
            Map.Entry entryA0l2 = C3cH.A0l(itA0n);
            Object key = entryA0l2.getKey();
            Object value2 = entryA0l2.getValue();
            if (value2 instanceof Long) {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                byteBufferAllocate.putLong(C3cG.A05(value2));
                value2 = byteBufferAllocate.array();
            } else if (value2 instanceof String) {
                value2 = ((String) value2).getBytes(Charsets.UTF_8);
            } else if (!(value2 instanceof byte[])) {
                throw BV4.A0P();
            }
            mapA0w.put(key, value2);
        }
        return A00(map, mapA0w) ? this : new C3121Byl(mapA0w);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return A00(this.A01, ((C3121Byl) obj).A01);
    }

    public final int hashCode() {
        int iHashCode = this.A00;
        if (iHashCode == 0) {
            Iterator itA0n = AnonymousClass002.A0n(this.A01);
            iHashCode = 0;
            while (itA0n.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0n);
                iHashCode += Arrays.hashCode((byte[]) entryA0l.getValue()) ^ C60O.A0t(entryA0l).hashCode();
            }
            this.A00 = iHashCode;
        }
        return iHashCode;
    }

    public C3121Byl(Map<String, byte[]> map) {
        this.A01 = Collections.unmodifiableMap(map);
    }

    public static boolean A00(Map<String, byte[]> map, Map<String, byte[]> map2) {
        if (map.size() == map2.size()) {
            Iterator itA0n = AnonymousClass002.A0n(map);
            while (itA0n.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0n);
                if (!Arrays.equals((byte[]) entryA0l.getValue(), map2.get(entryA0l.getKey()))) {
                }
            }
            return true;
        }
        return false;
    }

    public C3121Byl() {
        this(Collections.EMPTY_MAP);
    }
}
