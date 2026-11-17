package X;

import java.util.NoSuchElementException;

/* renamed from: X.9oI, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9oI implements C9hr<C9oJ> {
    public static final C9oI A00 = new C9oI();
    public static final C9iZ A01 = C9iY.A05("LinkedOperationNonceSourceApp", C07719ih.A00);

    @Override // X.C9jG
    public final /* bridge */ /* synthetic */ Object deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        int iA8T = interfaceC07829iw.A8T();
        for (C9oJ c9oJ : C9oJ.values()) {
            if (c9oJ.code == iA8T) {
                return c9oJ;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return A01;
    }

    @Override // X.C9hv
    public final /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        C9oJ c9oJ = (C9oJ) obj;
        AnonymousClass003.A0u(interfaceC07789is, c9oJ);
        interfaceC07789is.AAJ(c9oJ.code);
    }
}
