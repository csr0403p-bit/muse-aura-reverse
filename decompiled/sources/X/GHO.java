package X;

/* loaded from: classes6.dex */
public final class GHO<T> implements GHV<T> {
    public final C9395GHk<?> A00;
    public final InterfaceC9329GEk A01;
    public final GHT<?, ?> A02;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.GHV
    public final boolean AAo(T t, T t2) {
        return C8j3.A1S(((GHM) t).unknownFields.equals(((GHM) t2).unknownFields) ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.GHV
    public final int AKR(T message) {
        GHQ ghq = ((GHM) message).unknownFields;
        int iA05 = ghq.A01;
        if (iA05 == -1) {
            iA05 = 0;
            for (int i = 0; i < ghq.A00; i++) {
                int i2 = ghq.A03[i] >>> 3;
                AbstractC9321GEc abstractC9321GEc = (AbstractC9321GEc) ghq.A04[i];
                boolean z = GGF.A05;
                iA05 += (AbstractC7609F5w.A05(8) * 2) + AbstractC7610F5x.A0E(i2, AbstractC7609F5w.A05(16)) + AbstractC7610F5x.A08(3) + AbstractC7610F5x.A06(abstractC9321GEc.A02());
            }
            ghq.A01 = iA05;
        }
        return iA05;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.GHV
    public final int ANL(T message) {
        return ((GHM) message).unknownFields.hashCode();
    }

    @Override // X.GHV
    public final boolean AOY(T message) {
        throw BV4.A0a("extensions");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.GHV
    public final void AQ3(T message) {
        GHQ ghq = ((GHM) message).unknownFields;
        if (ghq.A02) {
            ghq.A02 = false;
        }
        throw BV4.A0a("extensions");
    }

    @Override // X.GHV
    public final void AQg(GHN message, HzL reader, Object extensionRegistry) {
        GHM ghm = (GHM) extensionRegistry;
        if (ghm.unknownFields == GHQ.A05) {
            ghm.unknownFields = new GHQ();
        }
        throw BV4.A0a("ensureExtensionsAreMutable");
    }

    /* JADX WARN: Incorrect types in method signature: (TT;[BIILX/GHf;)V */
    @Override // X.GHV
    public final void AQh(C9390GHf message, Object data, byte[] position, int limit, int registers) {
        GHM ghm = (GHM) data;
        if (ghm.unknownFields == GHQ.A05) {
            ghm.unknownFields = new GHQ();
        }
        throw BV4.A0a("ensureExtensionsAreMutable");
    }

    /* JADX WARN: Incorrect return type in method signature: ()TT; */
    @Override // X.GHV
    public final GHM ARB() {
        InterfaceC9329GEk interfaceC9329GEk = this.A01;
        boolean z = interfaceC9329GEk instanceof GHM;
        GHM ghm = (GHM) interfaceC9329GEk;
        return z ? (GHM) ghm.A0E(C79.A0K) : GHS.A09(ghm).A03();
    }

    @Override // X.GHV
    public final void Aj1(GHX message, Object writer) {
        throw BV4.A0a("extensions");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/GHT<**>;LX/GHk<*>;LX/GEk;)V */
    public GHO(C9395GHk unknownFieldSchema, InterfaceC9329GEk extensionSchema, GHT defaultInstance) {
        this.A02 = defaultInstance;
        this.A00 = unknownFieldSchema;
        this.A01 = extensionSchema;
    }

    @Override // X.GHV
    public final void AQb(T message, T other) {
        GHL.A07(message, other);
    }
}
