package X;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.9hq, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9hq<T> extends C9hu<T> {
    public List<? extends Annotation> A00;
    public final Map<C9uG<? extends T>, C9hr<? extends T>> A01;
    public final Map<String, C9hr<? extends T>> A02;
    public final F0C A03;
    public final C9uG<T> A04;

    /* JADX WARN: Incorrect types in method signature: (LX/9j4;Ljava/lang/String;)LX/9jG<TT;>; */
    @Override // X.C9hu
    public final C9jG A01(String str, C9j4 c9j4) {
        C7384Etj.A0Y(c9j4, 0);
        C9hr<? extends T> c9hr = this.A02.get(str);
        return c9hr == null ? super.A01(str, c9j4) : c9hr;
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return (C9iZ) this.A03.getValue();
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;LX/9uG<TT;>;[LX/9uG<+TT;>;[LX/9hr<+TT;>;[Ljava/lang/annotation/Annotation;)V */
    public C9hq(String str, C9uG c9uG, Annotation[] annotationArr, C9uG[] c9uGArr, C9hr[] c9hrArr) {
        this.A04 = c9uG;
        this.A00 = C0881AGi.A00;
        this.A03 = AbstractC5321DgF.A02(C79.A01, new C2303BTd(str, this, 0));
        int length = c9uGArr.length;
        int length2 = c9hrArr.length;
        if (length != length2) {
            throw C60O.A0i(FGI.A0U("All subclasses of sealed class ", C8j3.A12(this.A04), " should be marked @Serializable"));
        }
        int iMin = Math.min(length, length2);
        ArrayList arrayListA11 = C60O.A11(iMin);
        for (int i = 0; i < iMin; i++) {
            AnonymousClass002.A1J(c9uGArr[i], c9hrArr[i], arrayListA11);
        }
        Map<C9uG<? extends T>, C9hr<? extends T>> mapA06 = AGH.A06(arrayListA11);
        this.A01 = mapA06;
        Set<Map.Entry<C9uG<? extends T>, C9hr<? extends T>>> setEntrySet = mapA06.entrySet();
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        for (Map.Entry<C9uG<? extends T>, C9hr<? extends T>> entry : setEntrySet) {
            String strAKP = entry.getValue().getDescriptor().AKP();
            Object obj = linkedHashMapA0j.get(strAKP);
            if (obj == null) {
                linkedHashMapA0j.containsKey(strAKP);
            }
            Map.Entry entry2 = (Map.Entry) obj;
            if (entry2 != null) {
                StringBuilder sbA0x = C60O.A0x("Multiple sealed subclasses of '");
                sbA0x.append(this.A04);
                sbA0x.append("' have the same serial name '");
                sbA0x.append(strAKP);
                sbA0x.append("': '");
                sbA0x.append(entry2.getKey());
                sbA0x.append("', '");
                sbA0x.append(entry.getKey());
                throw C3cG.A0Q(C8j3.A16(sbA0x, '\''));
            }
            linkedHashMapA0j.put(strAKP, entry);
        }
        LinkedHashMap linkedHashMapA15 = C60O.A15(AIW.A0H(linkedHashMapA0j.size()));
        Iterator itA0i = C3cG.A0i(linkedHashMapA0j);
        while (itA0i.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0i);
            linkedHashMapA15.put(entryA0l.getKey(), ((Map.Entry) entryA0l.getValue()).getValue());
        }
        this.A02 = linkedHashMapA15;
        this.A00 = Arrays.asList(annotationArr);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/9is;TT;)LX/9hv<TT;>; */
    @Override // X.C9hu
    public final C9hv A02(Object obj, InterfaceC07789is interfaceC07789is) {
        AnonymousClass003.A0u(interfaceC07789is, obj);
        C9hr<? extends T> c9hr = this.A01.get(C3cG.A0x(obj.getClass()));
        if (c9hr != null) {
            return c9hr;
        }
        C9hv c9hvA02 = super.A02(obj, interfaceC07789is);
        if (c9hvA02 == null) {
            return null;
        }
        return c9hvA02;
    }
}
