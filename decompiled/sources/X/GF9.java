package X;

/* loaded from: classes6.dex */
public final class GF9<T> implements GF4<T> {
    public final GFB<?> A00;
    public final GF8 A01;
    public final GFA<?, ?> A02;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.GF4
    public final boolean AAo(T t, T t2) {
        return C8j3.A1S(((GF2) t).unknownFields.equals(((GF2) t2).unknownFields) ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.GF4
    public final int AKR(T message) {
        GFI gfi = ((GF2) message).unknownFields;
        int iA05 = gfi.A01;
        if (iA05 == -1) {
            iA05 = 0;
            for (int i = 0; i < gfi.A00; i++) {
                int i2 = gfi.A03[i] >>> 3;
                GEY gey = (GEY) gfi.A04[i];
                boolean z = GFE.A05;
                iA05 += (AbstractC7609F5w.A05(8) * 2) + AbstractC7610F5x.A0E(i2, AbstractC7609F5w.A05(16)) + AbstractC7610F5x.A08(3) + AbstractC7610F5x.A06(gey.A01());
            }
            gfi.A01 = iA05;
        }
        return iA05;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.GF4
    public final int ANL(T message) {
        return ((GF2) message).unknownFields.hashCode();
    }

    @Override // X.GF4
    public final boolean AOY(T message) {
        throw BV4.A0a("extensions");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.GF4
    public final void AQ3(T message) {
        GFI gfi = ((GF2) message).unknownFields;
        if (gfi.A02) {
            gfi.A02 = false;
        }
        throw BV4.A0a("extensions");
    }

    /* JADX WARN: Incorrect types in method signature: (TT;[BIILX/GF6;)V */
    @Override // X.GF4
    public final void AQf(GF6 message, Object data, byte[] position, int limit, int registers) {
        GF2 gf2 = (GF2) data;
        if (gf2.unknownFields == GFI.A05) {
            gf2.unknownFields = new GFI();
        }
        throw BV4.A0a("ensureExtensionsAreMutable");
    }

    /* JADX WARN: Incorrect return type in method signature: ()TT; */
    @Override // X.GF4
    public final GF2 ARA() {
        GF8 gf8 = this.A01;
        boolean z = gf8 instanceof GF2;
        GF2 gf2 = (GF2) gf8;
        if (z) {
            return (GF2) gf2.A06(C79.A0K);
        }
        GF3 gf3 = (GF3) gf2.A06(C79.A0P);
        MessageType messagetype = gf3.A00;
        if (!AbstractC7609F5w.A1U(messagetype.memoizedSerializedSize, Integer.MIN_VALUE)) {
            return messagetype;
        }
        messagetype.A07();
        return gf3.A00;
    }

    /* JADX WARN: Incorrect types in method signature: (TT;LX/GFQ;)V */
    @Override // X.GF4
    public final void Aj5(GFQ message, Object writer) {
        throw BV4.A0a("extensions");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/GFA<**>;LX/GFB<*>;LX/GF8;)V */
    public GF9(GFB unknownFieldSchema, GF8 extensionSchema, GFA defaultInstance) {
        this.A02 = defaultInstance;
        this.A00 = unknownFieldSchema;
        this.A01 = extensionSchema;
    }

    @Override // X.GF4
    public final void AQb(T message, T other) {
        GFG.A07(message, other);
    }
}
