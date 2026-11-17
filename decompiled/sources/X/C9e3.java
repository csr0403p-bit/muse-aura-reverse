package X;

import kotlinx.serialization.SerializationException;

/* renamed from: X.9e3, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9e3 implements C9hr {
    public static final C9e3 A00 = new C9e3();
    public static final C9iZ A01 = C9e2.A01;

    @Override // X.C9jG
    public final /* bridge */ /* synthetic */ Object deserialize(InterfaceC07829iw interfaceC07829iw) {
        throw new SerializationException("'kotlin.Nothing' does not have instances");
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return A01;
    }

    @Override // X.C9hv
    public final /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        throw new SerializationException("'kotlin.Nothing' cannot be serialized");
    }
}
