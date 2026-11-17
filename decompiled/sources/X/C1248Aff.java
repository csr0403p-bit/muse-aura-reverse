package X;

import java.util.Map;
import kotlin.Unit;

/* renamed from: X.Aff, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1248Aff implements InterfaceC1134Abi {
    public final int A00;
    public final int A01;
    public final /* synthetic */ InterfaceC1134Abi A02;

    @Override // X.InterfaceC1134Abi
    public final Map<AbstractC1493Ak0, Integer> ACJ() {
        return this.A02.ACJ();
    }

    @Override // X.InterfaceC1134Abi
    public final G0U<InterfaceC1620Amr, Unit> AJs() {
        return this.A02.AJs();
    }

    @Override // X.InterfaceC1134Abi
    public final void AXv() {
        this.A02.AXv();
    }

    @Override // X.InterfaceC1134Abi
    public final int getHeight() {
        return this.A00;
    }

    @Override // X.InterfaceC1134Abi
    public final int getWidth() {
        return this.A01;
    }

    public C1248Aff(InterfaceC1134Abi interfaceC1134Abi, C1354Ahf c1354Ahf) {
        this.A02 = interfaceC1134Abi;
        AbstractC1383AiD abstractC1383AiD = c1354Ahf.A02;
        C7384Etj.A0X(abstractC1383AiD);
        this.A01 = ((AZE) abstractC1383AiD).A01;
        AbstractC1383AiD abstractC1383AiD2 = c1354Ahf.A02;
        C7384Etj.A0X(abstractC1383AiD2);
        this.A00 = ((AZE) abstractC1383AiD2).A00;
    }
}
