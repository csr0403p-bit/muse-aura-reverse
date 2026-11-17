package X;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* renamed from: X.A6i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0861A6i implements C9uG, F0S {
    public static final Map<Class<? extends Ht9<?>>, Integer> A01;
    public final Class<?> A00;

    public C0861A6i(Class<?> cls) {
        C7384Etj.A0Y(cls, 0);
        this.A00 = cls;
    }

    public static final String A00(Class<?> cls) {
        String strA02;
        C7384Etj.A0Y(cls, 0);
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            return (!componentType.isPrimitive() || (strA02 = A02(componentType.getName())) == null) ? "kotlin.Array" : FGI.A0M(strA02, "Array");
        }
        String strA022 = A02(cls.getName());
        return strA022 == null ? cls.getCanonicalName() : strA022;
    }

    public static final String A01(Class<?> cls) {
        String strA03;
        String strA0U;
        C7384Etj.A0Y(cls, 0);
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (cls.isArray()) {
                Class<?> componentType = cls.getComponentType();
                return (!componentType.isPrimitive() || (strA03 = A03(componentType.getName())) == null) ? "Array" : FGI.A0M(strA03, "Array");
            }
            String strA032 = A03(cls.getName());
            return strA032 == null ? cls.getSimpleName() : strA032;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null && (strA0U = C7BY.A0U(simpleName, FGI.A0E(enclosingMethod.getName(), '$'), simpleName)) != null) {
            return strA0U;
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        return enclosingConstructor != null ? C7BY.A0U(simpleName, FGI.A0E(enclosingConstructor.getName(), '$'), simpleName) : C7BY.A0Q(simpleName, simpleName, '$');
    }

    static {
        int i = 0;
        List listAsList = Arrays.asList(Function0.class, G0U.class, G0V.class, G0W.class, G2j.class, G2k.class, G2l.class, G2m.class, G2n.class, G2o.class, G2p.class, G2q.class, G2r.class, G2s.class, G2t.class, G2u.class, G2v.class, G31.class, G30.class, G2w.class, G2z.class, G2y.class, G2x.class);
        ArrayList arrayListA0m = AnonymousClass002.A0m(listAsList);
        for (Object obj : listAsList) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC0885AGm.A14();
                throw F60.createAndThrow();
            }
            arrayListA0m.add(new HxE(obj, Integer.valueOf(i)));
            i = i2;
        }
        A01 = AGH.A06(arrayListA0m);
    }

    @Override // X.F0S
    public final Class<?> AGj() {
        return this.A00;
    }

    @Override // X.C9uG
    public final boolean AOZ(Object obj) {
        Class<?> clsA02 = this.A00;
        Map<Class<? extends Ht9<?>>, Integer> map = A01;
        C7384Etj.A0Z(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Integer num = map.get(clsA02);
        if (num != null) {
            return C0862A6j.A04(num.intValue(), obj);
        }
        if (clsA02.isPrimitive()) {
            clsA02 = C9uT.A02(new C0861A6i(clsA02));
        }
        return clsA02.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0861A6i) && C9uT.A02(this).equals(C9uT.A02((C9uG) obj));
    }

    public final String toString() {
        return FGI.A0M(this.A00.toString(), " (Kotlin reflection is not available)");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01e5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x01ee A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x01f7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x020b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0214 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0228 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x025d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:249:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String A02(java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 916
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0861A6i.A02(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:144:0x019e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01c2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01cb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01e1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01ea A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x01fe A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0223 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:222:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String A03(java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 848
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0861A6i.A03(java.lang.String):java.lang.String");
    }

    @Override // X.InterfaceC7518Eyt
    public final List getAnnotations() {
        throw F60.createAndThrow();
    }

    @Override // X.C9uG
    public final int hashCode() {
        return C9uT.A02(this).hashCode();
    }
}
