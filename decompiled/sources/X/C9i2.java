package X;

import kotlinx.serialization.json.JsonElement;

/* renamed from: X.9i2, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C9i2<T> implements C9hr<T> {
    public final C9hr<T> tSerializer;

    public C9i2(C9hr<T> c9hr) {
        C7384Etj.A0Y(c9hr, 0);
        this.tSerializer = c9hr;
    }

    @Override // X.C9jG
    public final T deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        BNA bnaA00 = C9i3.A00(interfaceC07829iw);
        return (T) bnaA00.AGk().A01(this.tSerializer, transformDeserialize(bnaA00.A8V()));
    }

    @Override // X.C9hv
    public final void serialize(InterfaceC07789is interfaceC07789is, T t) {
        C7384Etj.A0Y(interfaceC07789is, 0);
        C9i4 c9i4A01 = C9i3.A01(interfaceC07789is);
        C9sU c9sUAGk = c9i4A01.AGk();
        C9hr<T> c9hr = this.tSerializer;
        AnonymousClass002.A1A(c9sUAGk, 0, c9hr);
        C10543Hqv c10543HqvA0z = C3cG.A0z();
        new C9sM(new C2291BSr(c10543HqvA0z, 4), c9sUAGk).AAR(t, c9hr);
        T t2 = c10543HqvA0z.element;
        if (t2 == null) {
            C7384Etj.A0b("result");
            throw F60.createAndThrow();
        }
        JsonElement jsonElement = (JsonElement) t2;
        C7384Etj.A0Y(jsonElement, 0);
        c9i4A01.AAL(jsonElement);
    }

    public abstract JsonElement transformDeserialize(JsonElement jsonElement);

    public JsonElement transformSerialize(JsonElement jsonElement) {
        C7384Etj.A0Y(jsonElement, 0);
        return jsonElement;
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public C9iZ getDescriptor() {
        return this.tSerializer.getDescriptor();
    }
}
