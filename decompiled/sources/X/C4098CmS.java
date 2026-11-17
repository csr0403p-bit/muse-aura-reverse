package X;

import java.util.Set;

/* renamed from: X.CmS, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4098CmS implements InterfaceC4097CmR {
    public final String A00;
    public final Set A01;

    @Override // X.InterfaceC4097CmR
    public final Set<InterfaceC3641Caw> AI8() {
        return this.A01;
    }

    @Override // X.InterfaceC4097CmR
    public final String getName() {
        return this.A00;
    }

    public C4098CmS(InterfaceC4097CmR interfaceC4097CmR) {
        String name = interfaceC4097CmR.getName();
        Set<InterfaceC3641Caw> setAI8 = interfaceC4097CmR.AI8();
        this.A00 = name;
        this.A01 = setAI8;
    }
}
