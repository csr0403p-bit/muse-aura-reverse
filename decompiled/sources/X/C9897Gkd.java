package X;

import java.io.Serializable;

/* renamed from: X.Gkd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9897Gkd implements Serializable {
    public static final long serialVersionUID = 1;
    public final Class<Enum<?>> _enumClass;
    public final InterfaceC10180Gqq[] _textual;
    public final Enum<?>[] _values;

    public C9897Gkd(Class<Enum<?>> cls, InterfaceC10180Gqq[] interfaceC10180GqqArr) {
        this._enumClass = cls;
        this._values = cls.getEnumConstants();
        this._textual = interfaceC10180GqqArr;
    }

    public static C9897Gkd A00(AbstractC9901Gkh<?> abstractC9901Gkh, C9909Gkr c9909Gkr) {
        AbstractC9910Gks abstractC9910GksA02 = abstractC9901Gkh.A02();
        boolean zA00 = ((AbstractC9896GkZ) abstractC9901Gkh)._datatypeFeatures.A00(EnumC9825GiJ.WRITE_ENUMS_TO_LOWERCASE);
        Class<?> cls = c9909Gkr.A05;
        Class<?> superclass = cls;
        C10104GpS[] c10104GpSArr = AbstractC9855Gj3.A01;
        if (cls.getSuperclass() != Enum.class) {
            superclass = cls.getSuperclass();
        }
        Enum[] enumArr = (Enum[]) superclass.getEnumConstants();
        if (enumArr == null) {
            throw C60Q.A0U("No enum constants for class ", cls.getName());
        }
        int length = enumArr.length;
        String[] strArr = new String[length];
        abstractC9910GksA02.A0d(c9909Gkr, enumArr, strArr);
        InterfaceC10180Gqq[] interfaceC10180GqqArr = new InterfaceC10180Gqq[length];
        for (int i = 0; i < length; i++) {
            Enum r1 = enumArr[i];
            String lowerCase = strArr[i];
            String strName = r1.name();
            if (lowerCase == null) {
                lowerCase = zA00 ? strName.toLowerCase() : strName;
            }
            interfaceC10180GqqArr[r1.ordinal()] = new C10026Go0(lowerCase);
        }
        return new C9897Gkd(cls, interfaceC10180GqqArr);
    }
}
