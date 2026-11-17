package X;

import X.AMl;

/* renamed from: X.9ip, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C07769ip<T extends AMl> implements C9hr<T> {
    public final C9iZ A00 = C9iY.A01("androidx.navigation.runtime.NavKey", new C2276BSc(29));

    @Override // X.C9jG
    public final /* bridge */ /* synthetic */ Object deserialize(InterfaceC07829iw interfaceC07829iw) throws ClassNotFoundException {
        C9iZ c9iZ = this.A00;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        Class<?> cls = Class.forName(c9j4A55.A8f(c9iZ, c9j4A55.A8N(c9iZ)));
        C7384Etj.A0Y(cls, 0);
        C0861A6i c0861A6iA0x = C3cG.A0x(cls);
        C9hr c9hrA02 = C9u8.A02(c0861A6iA0x);
        if (c9hrA02 == null) {
            C9iG.A01(c0861A6iA0x);
            throw F60.createAndThrow();
        }
        Object objA8a = c9j4A55.A8a(c9hrA02, c9iZ, c9j4A55.A8N(c9iZ));
        C7384Etj.A0Z(objA8a, "null cannot be cast to non-null type T of androidx.navigation3.runtime.serialization.NavKeySerializer");
        c9j4A55.AAd(c9iZ);
        return objA8a;
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return this.A00;
    }

    @Override // X.C9hv
    public final /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        C9iZ c9iZ = this.A00;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        Class<?> cls = obj.getClass();
        c9j5A56.AAV(cls.getName(), c9iZ, 0);
        C0861A6i c0861A6iA0x = C3cG.A0x(cls);
        C9hr c9hrA02 = C9u8.A02(c0861A6iA0x);
        if (c9hrA02 == null) {
            C9iG.A01(c0861A6iA0x);
            throw F60.createAndThrow();
        }
        c9j5A56.AAQ(obj, c9hrA02, c9iZ, 1);
        c9j5A56.AAd(c9iZ);
    }
}
