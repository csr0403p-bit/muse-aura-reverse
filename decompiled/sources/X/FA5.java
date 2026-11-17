package X;

import com.facebook.aura.bloks.coreplugins.AuraBloksCorePlugins;
import java.util.List;

/* loaded from: classes6.dex */
public final class FA5 implements FAW {
    public final FAW A00;

    @Override // X.FAW
    public final boolean Agn(FDW fdw) {
        boolean z;
        int i;
        FAP fap = AuraBloksCorePlugins.CHILD_ATTRIBUTE_MAPPER;
        C7384Etj.A0U(fap);
        int i2 = fdw.A05;
        int[] pluralSubNodes = fap.getPluralSubNodes(i2);
        int[] iArrA02 = FA7.A02(i2);
        int i3 = 0;
        while (true) {
            int length = pluralSubNodes.length;
            if (i3 >= iArrA02.length + length) {
                for (int i4 : fap.getSubNodes(i2)) {
                    FDW fdwA0C = fdw.A0C(i4);
                    if (fdwA0C != null && this.A00.Agn(fdwA0C)) {
                        return true;
                    }
                }
                return false;
            }
            if (i3 >= length) {
                z = true;
                i = iArrA02[i3 - length];
            } else {
                z = false;
                i = pluralSubNodes[i3];
            }
            List<?> listA01 = FA7.A01(fdw, i, z);
            if (listA01 != null) {
                for (int i5 = 0; i5 < listA01.size(); i5++) {
                    FDW fdwA00 = FA7.A00(listA01, i5, z);
                    if (fdwA00 != null && this.A00.Agn(fdwA00)) {
                        return true;
                    }
                }
            }
            i3++;
        }
    }

    public FA5(FAW faw) {
        this.A00 = faw;
    }
}
