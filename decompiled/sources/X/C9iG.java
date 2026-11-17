package X;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.SerializationException;

/* renamed from: X.9iG, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9iG {
    public static final C9iZ[] A00 = new C9iZ[0];

    public static final Set<String> A00(C9iZ c9iZ) {
        if (c9iZ instanceof C9iH) {
            return ((C9iH) c9iZ).AKQ();
        }
        HashSet hashSet = new HashSet(c9iZ.AF6());
        int iAF6 = c9iZ.AF6();
        for (int i = 0; i < iAF6; i++) {
            hashSet.add(c9iZ.AF5(i));
        }
        return hashSet;
    }

    public static final C9iZ[] A02(List<? extends C9iZ> list) {
        C9iZ[] c9iZArr;
        return (list == null || list.isEmpty() || (c9iZArr = (C9iZ[]) list.toArray(new C9iZ[0])) == null) ? A00 : c9iZArr;
    }

    /* JADX WARN: Incorrect return type in method signature: (LX/9uG<*>;)Ljava/lang/Void; */
    public static final void A01(C9uG c9uG) {
        String strA12 = C8j3.A12(c9uG);
        if (strA12 == null) {
            strA12 = "<local class name not available>";
        }
        throw new SerializationException(FGI.A0U("Serializer for class '", strA12, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n"));
    }
}
