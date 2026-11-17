package X;

import com.facebook.aura.bloks.coreplugins.AuraBloksCorePlugins;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class FA7 {
    public static final int[] A00 = new int[0];

    public static final List<?> A01(FDW fdw, int i, boolean z) {
        if (!z) {
            return fdw.A0I(i);
        }
        Object objA01 = FDW.A01(fdw, i);
        if (objA01 instanceof List) {
            return (List) objA01;
        }
        return null;
    }

    public static final int[] A02(int i) {
        FAP fap = AuraBloksCorePlugins.CHILD_ATTRIBUTE_MAPPER;
        C7384Etj.A0U(fap);
        int[] textContentSubNodes = fap.getTextContentSubNodes(i);
        return textContentSubNodes == null ? A00 : textContentSubNodes;
    }

    public static final FDW A00(List<?> list, int i, boolean z) {
        Object obj = list.get(i);
        if (!z || (obj instanceof FDW)) {
            return (FDW) obj;
        }
        return null;
    }
}
