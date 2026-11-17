package X;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Glz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9945Glz extends AbstractC10023Gnw {
    public final InterfaceC10159GqS A00;
    public final C9860Gj8 A01;
    public final boolean A02;

    /* JADX WARN: Incorrect types in method signature: (LX/Gqb;LX/GjI;Ljava/util/Map<Ljava/lang/String;LX/Gpl;>;)Ljava/util/Map<Ljava/lang/String;LX/Gpl;>; */
    public static Map A00(AbstractC9870GjI abstractC9870GjI, C9945Glz c9945Glz, InterfaceC10166Gqb interfaceC10166Gqb) {
        InterfaceC10159GqS interfaceC10159GqS;
        Class<?> clsABU;
        C10120Gpl c10120Gpl;
        Map mapA00 = null;
        AbstractC9870GjI abstractC9870GjIA09 = abstractC9870GjI.A09();
        if (abstractC9870GjIA09 != null) {
            Class<?> cls = abstractC9870GjI._class;
            mapA00 = A00(abstractC9870GjIA09, c9945Glz, new C10124Gpp(abstractC9870GjIA09.A0K(), c9945Glz.A01));
            for (Field field : cls.getDeclaredFields()) {
                if (field.isEnumConstant() || (!field.isSynthetic() && !Modifier.isStatic(field.getModifiers()))) {
                    if (mapA00 == null) {
                        mapA00 = C3cG.A0j();
                    }
                    C10120Gpl c10120Gpl2 = new C10120Gpl(interfaceC10166Gqb, field);
                    if (c9945Glz.A02) {
                        c10120Gpl2.A00 = c9945Glz.A05(c10120Gpl2.A00, field.getDeclaredAnnotations());
                    }
                    mapA00.put(field.getName(), c10120Gpl2);
                }
            }
            if (mapA00 != null && (interfaceC10159GqS = c9945Glz.A00) != null && (clsABU = interfaceC10159GqS.ABU(cls)) != null) {
                C10104GpS[] c10104GpSArr = AbstractC9855Gj3.A01;
                ArrayList arrayListA11 = C60O.A11(8);
                if (clsABU != cls) {
                    do {
                        arrayListA11.add(clsABU);
                        clsABU = clsABU.getSuperclass();
                        if (clsABU == null) {
                            break;
                        }
                    } while (clsABU != cls);
                }
                Iterator it = arrayListA11.iterator();
                while (it.hasNext()) {
                    for (Field field2 : ((Class) it.next()).getDeclaredFields()) {
                        if ((field2.isEnumConstant() || (!field2.isSynthetic() && !Modifier.isStatic(field2.getModifiers()))) && (c10120Gpl = (C10120Gpl) mapA00.get(field2.getName())) != null) {
                            c10120Gpl.A00 = c9945Glz.A05(c10120Gpl.A00, field2.getDeclaredAnnotations());
                        }
                    }
                }
            }
        }
        return mapA00;
    }

    public C9945Glz(AbstractC9910Gks abstractC9910Gks, InterfaceC10159GqS interfaceC10159GqS, C9860Gj8 c9860Gj8, boolean z) {
        super(abstractC9910Gks);
        this.A01 = c9860Gj8;
        this.A00 = abstractC9910Gks == null ? null : interfaceC10159GqS;
        this.A02 = z;
    }
}
