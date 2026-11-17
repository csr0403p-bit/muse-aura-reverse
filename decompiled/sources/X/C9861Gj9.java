package X;

import com.facebook.aura.opengraph.HatchOpenGraphRepository;
import java.io.Serializable;
import java.lang.reflect.TypeVariable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Gj9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9861Gj9 implements Serializable {
    public static final C9861Gj9 A00;
    public static final AbstractC9870GjI[] A01;
    public static final String[] A02;
    public static final long serialVersionUID = 1;
    public final int _hashCode;
    public final String[] _names;
    public final AbstractC9870GjI[] _types;
    public final String[] _unboundVariables;

    static {
        String[] strArr = new String[0];
        A02 = strArr;
        AbstractC9870GjI[] abstractC9870GjIArr = new AbstractC9870GjI[0];
        A01 = abstractC9870GjIArr;
        A00 = new C9861Gj9(abstractC9870GjIArr, strArr, null);
    }

    public static C9861Gj9 A02(Class<?> cls, AbstractC9870GjI[] abstractC9870GjIArr) {
        String[] strArr;
        int length;
        int i = 0;
        if (abstractC9870GjIArr == null) {
            abstractC9870GjIArr = A01;
        } else {
            int length2 = abstractC9870GjIArr.length;
            if (length2 == 1) {
                return A01(abstractC9870GjIArr[0], cls);
            }
            if (length2 == 2) {
                return A00(abstractC9870GjIArr[0], abstractC9870GjIArr[1], cls);
            }
        }
        TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
        if (typeParameters == null || (length = typeParameters.length) == 0) {
            strArr = A02;
        } else {
            strArr = new String[length];
            do {
                strArr[i] = typeParameters[i].getName();
                i++;
            } while (i < length);
        }
        int length3 = strArr.length;
        int length4 = abstractC9870GjIArr.length;
        if (length3 == length4) {
            return new C9861Gj9(abstractC9870GjIArr, strArr, null);
        }
        StringBuilder sbA0x = C60O.A0x("Cannot create TypeBindings for class ");
        BV6.A18(cls, sbA0x);
        sbA0x.append(" with ");
        sbA0x.append(length4);
        sbA0x.append(" type parameter");
        sbA0x.append(length4 == 1 ? "" : "s");
        throw C60O.A0i(C60P.A1O(": class expects ", sbA0x, length3));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r5 == r4) goto L28
            java.lang.Class r2 = r4.getClass()
            X.GpS[] r0 = X.AbstractC9855Gj3.A01
            if (r5 == 0) goto L12
            java.lang.Class r1 = r5.getClass()
            r0 = 1
            if (r1 == r2) goto L13
        L12:
            r0 = 0
        L13:
            r2 = 0
            if (r0 == 0) goto L29
            X.Gj9 r5 = (X.C9861Gj9) r5
            int r1 = r4._hashCode
            int r0 = r5._hashCode
            if (r1 != r0) goto L29
            X.GjI[] r1 = r4._types
            X.GjI[] r0 = r5._types
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 == 0) goto L29
        L28:
            return r3
        L29:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9861Gj9.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/Class<*>;LX/GjI;LX/GjI;)LX/Gj9; */
    public static C9861Gj9 A00(AbstractC9870GjI abstractC9870GjI, AbstractC9870GjI abstractC9870GjI2, Class cls) {
        int length;
        TypeVariable<?>[] typeVariableArr = AbstractC9863GjB.A00;
        TypeVariable<?>[] typeParameters = cls == Map.class ? AbstractC9863GjB.A07 : cls == HashMap.class ? AbstractC9863GjB.A03 : cls == LinkedHashMap.class ? AbstractC9863GjB.A05 : cls.getTypeParameters();
        if (typeParameters == null) {
            length = 0;
        } else {
            length = typeParameters.length;
            if (length == 2) {
                return new C9861Gj9(new AbstractC9870GjI[]{abstractC9870GjI, abstractC9870GjI2}, new String[]{typeParameters[0].getName(), typeParameters[1].getName()}, null);
            }
        }
        throw C60O.A0i(FGI.A0V("Cannot create TypeBindings for class ", cls.getName(), " with 2 type parameters: class expects ", length));
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/Class<*>;LX/GjI;)LX/Gj9; */
    public static C9861Gj9 A01(AbstractC9870GjI abstractC9870GjI, Class cls) {
        int length;
        TypeVariable<?>[] typeVariableArr = AbstractC9863GjB.A00;
        TypeVariable<?>[] typeParameters = cls == Collection.class ? AbstractC9863GjB.A02 : cls == List.class ? AbstractC9863GjB.A06 : cls == ArrayList.class ? AbstractC9863GjB.A01 : cls == AbstractList.class ? AbstractC9863GjB.A00 : cls == Iterable.class ? AbstractC9863GjB.A04 : cls.getTypeParameters();
        if (typeParameters == null) {
            length = 0;
        } else {
            length = typeParameters.length;
            if (length == 1) {
                return new C9861Gj9(new AbstractC9870GjI[]{abstractC9870GjI}, new String[]{typeParameters[0].getName()}, null);
            }
        }
        throw C60O.A0i(FGI.A0V("Cannot create TypeBindings for class ", cls.getName(), " with 1 type parameter: class expects ", length));
    }

    public final List<AbstractC9870GjI> A03() {
        AbstractC9870GjI[] abstractC9870GjIArr = this._types;
        if (abstractC9870GjIArr.length == 0) {
            return Collections.EMPTY_LIST;
        }
        List<AbstractC9870GjI> listAsList = Arrays.asList(abstractC9870GjIArr);
        if (!listAsList.contains(null)) {
            return listAsList;
        }
        ArrayList arrayListA0t = BV4.A0t(listAsList);
        for (int i = 0; i < arrayListA0t.size(); i++) {
            if (arrayListA0t.get(i) == null) {
                arrayListA0t.set(i, C9860Gj8.A05);
            }
        }
        return arrayListA0t;
    }

    public final int hashCode() {
        return this._hashCode;
    }

    public Object readResolve() {
        String[] strArr = this._names;
        return (strArr == null || strArr.length == 0) ? A00 : this;
    }

    public final String toString() {
        String string;
        int length = this._types.length;
        if (length == 0) {
            return "<>";
        }
        StringBuilder sbA0x = C60O.A0x("<");
        int i = 0;
        while (true) {
            AbstractC9870GjI abstractC9870GjI = this._types[i];
            if (abstractC9870GjI == null) {
                string = HatchOpenGraphRepository.UNKNOWN_HOST;
            } else {
                StringBuilder sbA0p = BV4.A0p(40);
                abstractC9870GjI.A0M(sbA0p);
                string = sbA0p.toString();
            }
            sbA0x.append(string);
            i++;
            if (i >= length) {
                return C8j3.A16(sbA0x, '>');
            }
            if (i > 0) {
                sbA0x.append(',');
            }
        }
    }

    public C9861Gj9(AbstractC9870GjI[] abstractC9870GjIArr, String[] strArr, String[] strArr2) {
        strArr = strArr == null ? A02 : strArr;
        this._names = strArr;
        abstractC9870GjIArr = abstractC9870GjIArr == null ? A01 : abstractC9870GjIArr;
        this._types = abstractC9870GjIArr;
        int length = strArr.length;
        int length2 = abstractC9870GjIArr.length;
        if (length != length2) {
            throw C60O.A0i(FGI.A0Y("Mismatching names (", "), types (", ")", length, length2));
        }
        this._unboundVariables = strArr2;
        this._hashCode = Arrays.hashCode(abstractC9870GjIArr);
    }
}
