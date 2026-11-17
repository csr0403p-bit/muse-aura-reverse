package X;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Gjr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9883Gjr extends AbstractC9840Gif implements Serializable {
    public static final long serialVersionUID = 1;
    public final boolean _caseInsensitive;
    public final AbstractC9901Gkh<?> _config;
    public final Map<String, AbstractC9870GjI> _idToType;
    public final ConcurrentHashMap<String, String> _typeToId;

    /* JADX WARN: Incorrect types in method signature: (LX/Gkh<*>;LX/GjI;Ljava/util/concurrent/ConcurrentHashMap<Ljava/lang/String;Ljava/lang/String;>;Ljava/util/HashMap<Ljava/lang/String;LX/GjI;>;)V */
    public C9883Gjr(AbstractC9870GjI abstractC9870GjI, AbstractC9901Gkh abstractC9901Gkh, HashMap map, ConcurrentHashMap concurrentHashMap) {
        super(abstractC9870GjI, abstractC9901Gkh._base._typeFactory);
        this._config = abstractC9901Gkh;
        this._typeToId = concurrentHashMap;
        this._idToType = map;
        this._caseInsensitive = abstractC9901Gkh.A09(EnumC9951GmA.A03);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String A00(java.lang.Class<?> r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L4
            r1 = 0
        L3:
            return r1
        L4:
            java.lang.Class r2 = X.AbstractC9840Gif.A01(r6)
            java.lang.String r4 = r2.getName()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r0 = r5._typeToId
            java.lang.String r1 = X.BV4.A0h(r4, r0)
            if (r1 != 0) goto L3
            X.Gj8 r0 = r5._typeFactory
            X.GjI r0 = r0.A09(r2)
            java.lang.Class<?> r3 = r0._class
            X.Gkh<?> r1 = r5._config
            boolean r0 = r1.A08()
            if (r0 == 0) goto L36
            X.Gl4 r2 = r1.A05(r3)
            X.Gkh<?> r0 = r5._config
            X.Gks r1 = r0.A02()
            X.Gkr r0 = r2.A07
            java.lang.String r1 = r1.A0a(r0)
            if (r1 != 0) goto L46
        L36:
            java.lang.String r1 = r3.getName()
            r0 = 46
            int r0 = r1.lastIndexOf(r0)
            if (r0 < 0) goto L46
            java.lang.String r1 = X.BV4.A0g(r0, r1)
        L46:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r0 = r5._typeToId
            r0.put(r4, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9883Gjr.A00(java.lang.Class):java.lang.String");
    }

    @Override // X.InterfaceC9853Gix
    public final String AEn() {
        TreeSet treeSet = new TreeSet();
        Iterator itA0n = AnonymousClass002.A0n(this._idToType);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            if (((AbstractC9870GjI) entryA0l.getValue()).A0Q()) {
                treeSet.add(entryA0l.getKey());
            }
        }
        return treeSet.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC9853Gix
    public final String ANR(Object obj, Class<?> cls) {
        return cls == null ? A00(obj) : A00(cls.getClass());
    }

    @Override // X.InterfaceC9853Gix
    public final AbstractC9870GjI Aha(AbstractC9849Git abstractC9849Git, String str) {
        if (this._caseInsensitive) {
            str = str.toLowerCase();
        }
        return this._idToType.get(str);
    }

    @Override // X.InterfaceC9853Gix
    public final String ANQ(Object obj) {
        return A00(obj.getClass());
    }

    public final String toString() {
        return String.format("[%s; id-to-type=%s]", C60Q.A0e(this), this._idToType);
    }
}
