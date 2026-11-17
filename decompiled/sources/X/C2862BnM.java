package X;

import android.util.ArrayMap;
import android.util.Pair;
import android.view.Surface;
import java.util.concurrent.Executor;

/* renamed from: X.BnM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2862BnM implements InterfaceC2864BnO {
    public Bi7 A00;
    public final InterfaceC2864BnO A01;

    private C2872Bnf A00(InterfaceC2873Bng interfaceC2873Bng) {
        BhZ bhZ;
        if (interfaceC2873Bng == null) {
            return null;
        }
        Bi7 bi7 = this.A00;
        if (bi7 == null) {
            bhZ = BhZ.A01;
        } else {
            Pair pairA0A = BV4.A0A(bi7.A09, C8j4.A0p(bi7.A0A));
            BhZ bhZ2 = BhZ.A01;
            ArrayMap arrayMap = new ArrayMap();
            arrayMap.put(pairA0A.first, pairA0A.second);
            bhZ = new BhZ(arrayMap);
        }
        this.A00 = null;
        return new C2872Bnf(BV6.A0P(interfaceC2873Bng.getWidth(), interfaceC2873Bng.getHeight()), new BnL(new BnE(bhZ, interfaceC2873Bng.AGK().getTimestamp())), interfaceC2873Bng);
    }

    @Override // X.InterfaceC2864BnO
    public final InterfaceC2873Bng A30() {
        return A00(this.A01.A30());
    }

    @Override // X.InterfaceC2864BnO
    public final InterfaceC2873Bng A31() {
        return A00(this.A01.A31());
    }

    @Override // X.InterfaceC2864BnO
    public final void A6K() {
        this.A01.A6K();
    }

    @Override // X.InterfaceC2864BnO
    public final int AGJ() {
        return this.A01.AGJ();
    }

    @Override // X.InterfaceC2864BnO
    public final int AHQ() {
        return this.A01.AHQ();
    }

    @Override // X.InterfaceC2864BnO
    public final void Adw(InterfaceC2888Bnw interfaceC2888Bnw, Executor executor) {
        this.A01.Adw(new F4P(1, this, interfaceC2888Bnw), executor);
    }

    @Override // X.InterfaceC2864BnO
    public final void close() {
        this.A01.close();
    }

    @Override // X.InterfaceC2864BnO
    public final int getHeight() {
        return this.A01.getHeight();
    }

    @Override // X.InterfaceC2864BnO
    public final Surface getSurface() {
        return this.A01.getSurface();
    }

    @Override // X.InterfaceC2864BnO
    public final int getWidth() {
        return this.A01.getWidth();
    }

    public C2862BnM(InterfaceC2864BnO interfaceC2864BnO) {
        this.A01 = interfaceC2864BnO;
    }
}
