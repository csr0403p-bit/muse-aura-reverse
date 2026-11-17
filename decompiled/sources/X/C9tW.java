package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.9tW, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9tW<Key, Value, Collection, Builder extends Map<Key, Value>> extends C9tY<Map.Entry<? extends Key, ? extends Value>, Collection, Builder> {
    public final C9hr<Key> A00;
    public final C9hr<Value> A01;

    @Override // X.C9hv
    public final void serialize(InterfaceC07789is interfaceC07789is, Collection collection) {
        C7384Etj.A0Y(interfaceC07789is, 0);
        A02(collection);
        C9iZ descriptor = getDescriptor();
        C7384Etj.A0Y(descriptor, 1);
        C9j5 c9j5A56 = interfaceC07789is.A56(descriptor);
        Iterator<Map.Entry<? extends Key, ? extends Value>> itA06 = A06(collection);
        int i = 0;
        while (itA06.hasNext()) {
            Map.Entry<? extends Key, ? extends Value> next = itA06.next();
            Key key = next.getKey();
            Value value = next.getValue();
            int i2 = i + 1;
            c9j5A56.AAQ(key, this.A00, descriptor, i);
            i += 2;
            c9j5A56.AAQ(value, this.A01, descriptor, i2);
        }
        c9j5A56.AAd(descriptor);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    @Override // X.C9tY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void A07(java.lang.Object r6, X.C9j4 r7, int r8, boolean r9) {
        /*
            r5 = this;
            java.util.Map r6 = (java.util.Map) r6
            r0 = 0
            X.C7384Etj.A0Y(r7, r0)
            r0 = 2
            X.C7384Etj.A0Y(r6, r0)
            X.9iZ r4 = r5.getDescriptor()
            X.9hr<Key> r0 = r5.A00
            java.lang.Object r3 = r7.A8a(r0, r4, r8)
            if (r9 == 0) goto L2c
            int r2 = r7.A8N(r4)
            int r0 = r8 + 1
            if (r2 == r0) goto L2e
            java.lang.String r1 = "Value must follow key in a map, index for key: "
            java.lang.String r0 = ", returned index for value: "
            java.lang.String r1 = X.FGI.A0T(r1, r0, r8, r2)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L2c:
            int r2 = r8 + 1
        L2e:
            boolean r0 = r6.containsKey(r3)
            if (r0 == 0) goto L4d
            X.9hr<Value> r1 = r5.A01
            X.9iZ r0 = r1.getDescriptor()
            X.BL8 r0 = r0.AGs()
            boolean r0 = r0 instanceof X.AbstractC07679ic
            if (r0 != 0) goto L4d
            X.AbstractC2258BHp.A0L(r3, r6)
            java.lang.Object r0 = r7.A8a(r1, r4, r2)
        L49:
            r6.put(r3, r0)
            return
        L4d:
            X.9hr<Value> r0 = r5.A01
            java.lang.Object r0 = r7.A8a(r0, r4, r2)
            goto L49
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9tW.A07(java.lang.Object, X.9j4, int, boolean):void");
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public C9iZ getDescriptor() {
        return ((C9tT) this).A00;
    }

    public C9tW(C9hr<Key> c9hr, C9hr<Value> c9hr2) {
        this.A00 = c9hr;
        this.A01 = c9hr2;
    }
}
