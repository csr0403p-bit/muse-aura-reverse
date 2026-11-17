package X;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.JsonIgnoreUnknownKeys;
import kotlinx.serialization.json.internal.JsonException;

/* renamed from: X.9sC, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9sC {
    public static final C9sE<Map<String, Integer>> A00 = new C9sE<>();

    public static final int A01(String str, C9iZ c9iZ, C9sU c9sU) {
        C7384Etj.A0Y(c9sU, 1);
        C7384Etj.A0Y(str, 2);
        C9sa c9sa = c9sU.A00;
        if (c9sa.A08 && C7384Etj.areEqual(c9iZ.AGs(), C9i9.A00)) {
            str = str.toLowerCase(Locale.ROOT);
        } else {
            C7384Etj.areEqual(c9iZ.AGs(), C9iN.A00);
            int iAF4 = c9iZ.AF4(str);
            if (iAF4 != -3 || !c9sa.A0E) {
                return iAF4;
            }
        }
        Number number = (Number) ((Map) c9sU.A01.A00(new BTB(29, c9iZ, c9sU), c9iZ, A00)).get(str);
        if (number != null) {
            return number.intValue();
        }
        return -3;
    }

    public static final boolean A03(C9iZ c9iZ, C9sU c9sU) {
        C7384Etj.A0Y(c9sU, 1);
        if (!c9sU.A00.A0B) {
            List<Annotation> annotations = c9iZ.getAnnotations();
            if (!(annotations instanceof Collection) || !annotations.isEmpty()) {
                Iterator<Annotation> it = annotations.iterator();
                while (it.hasNext()) {
                    if (it.next() instanceof JsonIgnoreUnknownKeys) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static final int A00(String str, String str2, C9iZ c9iZ, C9sU c9sU) {
        AnonymousClass003.A0x(c9sU, str);
        int iA01 = A01(str, c9iZ, c9sU);
        if (iA01 != -3) {
            return iA01;
        }
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(c9iZ.AKP());
        sbA0w.append(" does not contain element with name '");
        sbA0w.append(str);
        sbA0w.append('\'');
        throw new SerializationException(AnonymousClass001.A0v(str2, sbA0w));
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/Map<Ljava/lang/String;Ljava/lang/Integer;>;LX/9iZ;Ljava/lang/String;I)V */
    public static final void A02(String str, Map map, C9iZ c9iZ, int i) {
        String strA00 = C7384Etj.areEqual(c9iZ.AGs(), C9i9.A00) ? "enum value" : C60N.A00(29);
        if (!map.containsKey(str)) {
            map.put(str, Integer.valueOf(i));
            return;
        }
        StringBuilder sbA0x = C3cI.A0x("The suggested name '", str);
        sbA0x.append("' for ");
        sbA0x.append(strA00);
        sbA0x.append(' ');
        sbA0x.append(c9iZ.AF5(i));
        sbA0x.append(" is already one of the names for ");
        sbA0x.append(strA00);
        sbA0x.append(' ');
        sbA0x.append(c9iZ.AF5(AnonymousClass001.A0F(AbstractC2258BHp.A0L(str, map))));
        throw new JsonException(AnonymousClass006.A0y(c9iZ, " in ", sbA0x));
    }
}
