package X;

import kotlin.Unit;

/* renamed from: X.9e0, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9e0 implements C9hr<Unit> {
    public static final C9e0 A01 = new C9e0();
    public final /* synthetic */ C9dz<Unit> A00 = new C9dz<>("kotlin.Unit", Unit.INSTANCE);

    @Override // X.C9jG
    public final /* bridge */ /* synthetic */ Object deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        this.A00.deserialize(interfaceC07829iw);
        return Unit.INSTANCE;
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return this.A00.getDescriptor();
    }

    @Override // X.C9hv
    public final /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        AnonymousClass003.A0u(interfaceC07789is, obj);
        this.A00.serialize(interfaceC07789is, obj);
    }
}
