package X;

import java.io.Serializable;

/* renamed from: X.Gjm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9878Gjm extends C9879Gjn implements Serializable {
    public static final long serialVersionUID = 1;

    public static AbstractC9870GjI A00(AbstractC9870GjI abstractC9870GjI, Class<?> cls) {
        AbstractC9870GjI abstractC9870GjIA0F = abstractC9870GjI.A0F(cls);
        if (abstractC9870GjIA0F != null) {
            return abstractC9870GjIA0F;
        }
        StringBuilder sbA0x = C60O.A0x("Strange ");
        BV6.A18(cls, sbA0x);
        sbA0x.append(" sub-type, ");
        sbA0x.append(abstractC9870GjI);
        throw C8j3.A0w(", can not find type parameters", sbA0x);
    }
}
