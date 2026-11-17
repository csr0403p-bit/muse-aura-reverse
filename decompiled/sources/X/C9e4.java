package X;

import com.facebook.aura.spacesharing.impl.SpaceShareUiCommandsKt;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: X.9e4, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9e4<T> implements C9cd<T> {
    public final /* synthetic */ C9hr<T> A00;

    public static C9iM A00(String str, C9hr c9hr) {
        return new C9iM(str, new C9e4(c9hr), 1);
    }

    public C9e4(C9hr<T> c9hr) {
        this.A00 = c9hr;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        return new C9hr[]{this.A00};
    }

    @Override // X.C9jG
    public final T deserialize(InterfaceC07829iw interfaceC07829iw) {
        throw C3cG.A0Q(SpaceShareUiCommandsKt.ERROR_CODE_UNSUPPORTED);
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        throw C3cG.A0Q(SpaceShareUiCommandsKt.ERROR_CODE_UNSUPPORTED);
    }

    @Override // X.C9hv
    public final void serialize(InterfaceC07789is interfaceC07789is, T t) {
        throw C3cG.A0Q(SpaceShareUiCommandsKt.ERROR_CODE_UNSUPPORTED);
    }

    @Override // X.C9cd
    public final /* synthetic */ C9hr[] typeParametersSerializers() {
        return C5hV.A00;
    }
}
