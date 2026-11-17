package X;

/* renamed from: X.Ahd, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1352Ahd implements AfC {
    public final Aeh A00;
    public final /* synthetic */ C1369Ahv A01;
    public final /* synthetic */ Object A02;

    public C1352Ahd(C1369Ahv c1369Ahv, Object obj) {
        this.A01 = c1369Ahv;
        this.A02 = obj;
        int[] iArr = Ac1.A00;
        this.A00 = new Aeh(6);
    }

    @Override // X.AfC
    public final int AIi() {
        C1453AjM c1453AjMA05 = this.A01.A08.A05(this.A02);
        if (c1453AjMA05 != null) {
            return C0910AHm.A04(c1453AjMA05).size();
        }
        return 0;
    }

    @Override // X.AfC
    public final void AKc(int i) {
        C1453AjM c1453AjMA05 = this.A01.A08.A05(this.A02);
        if (c1453AjMA05 == null || c1453AjMA05.A0D == null) {
            return;
        }
        int size = C0910AHm.A04(c1453AjMA05).size();
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException(C8j4.A0y("Index (", ") is out of bound of [0, ", i, size));
        }
        if (this.A00.A04(i)) {
            C0910AHm.A04(c1453AjMA05).get(i);
            C0910AHm.A04(c1453AjMA05).get(i);
        }
    }

    @Override // X.AfC
    public final void AYN(int i, long j) {
        C1369Ahv c1369Ahv = this.A01;
        C1453AjM c1453AjMA05 = c1369Ahv.A08.A05(this.A02);
        if (c1453AjMA05 == null || c1453AjMA05.A0D == null) {
            return;
        }
        int size = C0910AHm.A04(c1453AjMA05).size();
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException(C8j4.A0y("Index (", ") is out of bound of [0, ", i, size));
        }
        if (c1453AjMA05.A0d.A0G.A0G) {
            throw C60O.A0i("Pre-measure called on node that is not placed");
        }
        C1453AjM c1453AjM = c1369Ahv.A0D;
        c1453AjM.A0O = true;
        AbstractC1333AhK.A00(c1453AjMA05).AQY((C1453AjM) C0910AHm.A04(c1453AjMA05).get(i), j);
        c1453AjM.A0O = false;
        this.A00.A07(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AfC
    public final void AhO(Object obj, G0U<? super InterfaceC1237AfR, ? extends EnumC1236AfQ> g0u) {
        C1438Aj7 c1438Aj7;
        AbstractC1439Aj8 abstractC1439Aj8;
        C1453AjM c1453AjMA05 = this.A01.A08.A05(this.A02);
        if (c1453AjMA05 == null || (c1438Aj7 = c1453AjMA05.A0f) == null || (abstractC1439Aj8 = c1438Aj7.A02) == null || !abstractC1439Aj8.isAttached) {
            return;
        }
        AbstractC1235AfP.A02(abstractC1439Aj8, g0u, obj);
    }

    @Override // X.AfC
    public final void dispose() {
        C1369Ahv.A07(this.A01, this.A02);
    }
}
