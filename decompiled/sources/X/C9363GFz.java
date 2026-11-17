package X;

import androidx.glance.appwidget.protobuf.CodedOutputStream;

/* renamed from: X.GFz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9363GFz<T> implements GG0<T> {
    public final C9362GFy<?> A00;
    public final AnonymousClass777 A01;
    public final GG8<?, ?> A02;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.GG0
    public final boolean AAo(T t, T t2) {
        return C8j3.A1S(((GF0) t).unknownFields.equals(((GF0) t2).unknownFields) ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.GG0
    public final int AKR(T message) {
        GG7 gg7 = ((GF0) message).unknownFields;
        int iA05 = gg7.A01;
        if (iA05 == -1) {
            iA05 = 0;
            for (int i = 0; i < gg7.A00; i++) {
                int i2 = gg7.A03[i] >>> 3;
                AbstractC9320GEb abstractC9320GEb = (AbstractC9320GEb) gg7.A04[i];
                boolean z = CodedOutputStream.A02;
                iA05 += (AbstractC7609F5w.A05(8) * 2) + AbstractC7610F5x.A0E(i2, AbstractC7609F5w.A05(16)) + AbstractC7610F5x.A08(3) + AbstractC7610F5x.A06(abstractC9320GEb.A02());
            }
            gg7.A01 = iA05;
        }
        return iA05;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.GG0
    public final int ANL(T message) {
        return ((GF0) message).unknownFields.hashCode();
    }

    @Override // X.GG0
    public final boolean AOY(T message) {
        throw BV4.A0a("extensions");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.GG0
    public final void AQ3(T message) {
        GG7 gg7 = ((GF0) message).unknownFields;
        if (gg7.A02) {
            gg7.A02 = false;
        }
        throw BV4.A0a("extensions");
    }

    /* JADX WARN: Incorrect types in method signature: (TT;LX/GGK;LX/796;)V */
    @Override // X.GG0
    public final void AQd(AnonymousClass796 message, GGK reader, Object extensionRegistry) {
        GF0 gf0 = (GF0) extensionRegistry;
        if (gf0.unknownFields == GG7.A05) {
            gf0.unknownFields = new GG7();
        }
        throw BV4.A0a("ensureExtensionsAreMutable");
    }

    /* JADX WARN: Incorrect types in method signature: (TT;[BIILX/Hk0;)V */
    @Override // X.GG0
    public final void AQe(Hk0 message, Object data, byte[] position, int limit, int registers) {
        GF0 gf0 = (GF0) data;
        if (gf0.unknownFields == GG7.A05) {
            gf0.unknownFields = new GG7();
        }
        throw BV4.A0a("ensureExtensionsAreMutable");
    }

    /* JADX WARN: Incorrect return type in method signature: ()TT; */
    @Override // X.GG0
    public final GF0 AR9() {
        AnonymousClass777 anonymousClass777 = this.A01;
        boolean z = anonymousClass777 instanceof GF0;
        GF0 gf0 = (GF0) anonymousClass777;
        if (z) {
            return (GF0) gf0.A05(C79.A0K);
        }
        AbstractC10440Hhn abstractC10440Hhn = (AbstractC10440Hhn) gf0.A05(C79.A0P);
        MessageType messagetype = abstractC10440Hhn.A00;
        if (!AbstractC7609F5w.A1U(messagetype.memoizedSerializedSize, Integer.MIN_VALUE)) {
            return messagetype;
        }
        AbstractC7609F5w.A0V(messagetype).AQ3(messagetype);
        messagetype.memoizedSerializedSize &= Integer.MAX_VALUE;
        return abstractC10440Hhn.A00;
    }

    /* JADX WARN: Incorrect types in method signature: (TT;LX/GGt;)V */
    @Override // X.GG0
    public final void Aj4(InterfaceC9380GGt message, Object writer) {
        throw BV4.A0a("extensions");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/GG8<**>;LX/GFy<*>;LX/777;)V */
    public C9363GFz(C9362GFy unknownFieldSchema, AnonymousClass777 extensionSchema, GG8 defaultInstance) {
        this.A02 = defaultInstance;
        this.A00 = unknownFieldSchema;
        this.A01 = extensionSchema;
    }

    @Override // X.GG0
    public final void AQb(T message, T other) {
        GG2.A07(message, other);
    }
}
