package X;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.Bcc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2506Bcc implements InterfaceC2502BcY {
    public static final C2503BcZ A00 = new C2503BcZ(new C2506Bcc());
    public static final Set<C2507Bcd> A01 = Collections.singleton(C2507Bcd.A07);

    @Override // X.InterfaceC2502BcY
    public final Set<C2507Bcd> AF0(C2507Bcd c2507Bcd) {
        BeS.A06(C2507Bcd.A07.equals(c2507Bcd), AnonymousClass007.A0a("DynamicRange is not supported: ", c2507Bcd));
        return A01;
    }

    @Override // X.InterfaceC2502BcY
    public final Set<C2507Bcd> ALL() {
        return A01;
    }

    @Override // X.InterfaceC2502BcY
    public final DynamicRangeProfiles Aho() {
        return null;
    }
}
