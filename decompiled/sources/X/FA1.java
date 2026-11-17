package X;

import com.facebook.aura.bloks.coreplugins.AuraBloksCorePlugins;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class FA1 {
    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<*>;LX/FAW;Z)I */
    public static int A00(FAW faw, List list, boolean z) {
        for (int i = 0; i < list.size(); i++) {
            FDW fdwA00 = FA7.A00(list, i, z);
            if (fdwA00 != null && fdwA00.A0E() != null && faw.Agn(fdwA00)) {
                return i;
            }
        }
        return -1;
    }

    public static C7642F8h A01(FDW fdw, FAW faw) {
        boolean z;
        int i;
        int iA00;
        FAP fap = AuraBloksCorePlugins.CHILD_ATTRIBUTE_MAPPER;
        C7384Etj.A0U(fap);
        int i2 = fdw.A05;
        int[] pluralSubNodes = fap.getPluralSubNodes(i2);
        int[] iArrA02 = FA7.A02(i2);
        int i3 = 0;
        while (true) {
            int length = pluralSubNodes.length;
            if (i3 >= iArrA02.length + length) {
                return C7642F8h.A03;
            }
            if (i3 >= length) {
                z = true;
                i = iArrA02[i3 - length];
            } else {
                z = false;
                i = pluralSubNodes[i3];
            }
            List<?> listA01 = FA7.A01(fdw, i, z);
            if (listA01 != null && (iA00 = A00(faw, listA01, z)) >= 0) {
                ArrayList arrayListA0t = BV4.A0t(listA01);
                AbstractC7607F5u.A1M(fdw, arrayListA0t, i);
                return new C7642F8h(iA00, z, arrayListA0t);
            }
            i3++;
        }
    }

    public static ArrayList A02(FDW fdw, List list) {
        ArrayList arrayListA0t = C60Q.A0t(list);
        for (int i = 0; i < list.size(); i++) {
            FDW fdwA0z = AbstractC7607F5u.A0z(list, i);
            if (fdwA0z != null) {
                if (fdwA0z.A05 == 13346) {
                    List listA0H = fdwA0z.A0H(32);
                    for (int i2 = 0; i2 < listA0H.size(); i2++) {
                        FDW fdwA0z2 = AbstractC7607F5u.A0z(listA0H, i2);
                        arrayListA0t.add(FAH.A00(fdw.A01, new FA9(fdw.A02, fdwA0z2), fdwA0z2));
                    }
                } else {
                    arrayListA0t.add(FAH.A00(fdw.A01, new FA9(fdw.A02, fdwA0z), fdwA0z));
                }
            }
        }
        return arrayListA0t;
    }
}
