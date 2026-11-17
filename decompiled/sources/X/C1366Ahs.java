package X;

import androidx.compose.runtime.snapshots.Snapshot;
import kotlin.Unit;

/* renamed from: X.Ahs, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1366Ahs implements AfD {
    public final /* synthetic */ C1369Ahv A00;
    public final /* synthetic */ Object A01;

    public C1366Ahs(C1369Ahv c1369Ahv, Object obj) {
        this.A00 = c1369Ahv;
        this.A01 = obj;
    }

    private final C1375Ai1 A00() {
        C1369Ahv c1369Ahv = this.A00;
        C1453AjM c1453AjMA05 = c1369Ahv.A08.A05(this.A01);
        if (c1453AjMA05 != null) {
            return c1369Ahv.A07.A05(c1453AjMA05);
        }
        return null;
    }

    @Override // X.AfD
    public final AfC A4N() {
        C1375Ai1 c1375Ai1A00 = A00();
        if (c1375Ai1A00 != null) {
            C1369Ahv.A03(c1375Ai1A00, this.A00, false);
        }
        return C1369Ahv.A00(this.A00, this.A01);
    }

    @Override // X.AfD
    public final void Abg(InterfaceC2246BCr interfaceC2246BCr) {
        InterfaceC1367Aht interfaceC1367Aht;
        C1375Ai1 c1375Ai1A00 = A00();
        if (c1375Ai1A00 == null || (interfaceC1367Aht = c1375Ai1A00.A01) == null || ((C1373Ahz) interfaceC1367Aht).A01.get().compareTo(EnumC1374Ai0.A03) >= 0) {
            return;
        }
        Snapshot snapshotA03 = Snapshot.A03();
        G0U<Object, Unit> g0uA0D = snapshotA03 != null ? snapshotA03.A0D() : null;
        Snapshot snapshotA04 = Snapshot.A04(snapshotA03);
        try {
            interfaceC1367Aht.Abh(interfaceC2246BCr);
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
                Snapshot.A07(snapshotA03, snapshotA04, g0uA0D);
            }
        }
    }

    @Override // X.AfD
    public final void cancel() {
        C1375Ai1 c1375Ai1A00 = A00();
        if (c1375Ai1A00 == null || c1375Ai1A00.A01 == null) {
            return;
        }
        C1369Ahv.A07(this.A00, this.A01);
    }

    @Override // X.AfD
    public final boolean isComplete() {
        InterfaceC1367Aht interfaceC1367Aht;
        C1375Ai1 c1375Ai1A00 = A00();
        if (c1375Ai1A00 == null || (interfaceC1367Aht = c1375Ai1A00.A01) == null) {
            return true;
        }
        return C8j3.A1Q(((C1373Ahz) interfaceC1367Aht).A01.get().compareTo(EnumC1374Ai0.A03));
    }
}
