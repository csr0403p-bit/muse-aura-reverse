package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC10054GoZ;
import X.AbstractC9904Gkk;
import X.AbstractC9916Gl7;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public class ByteBufferDeserializer extends StdScalarDeserializer<ByteBuffer> {
    public static final long serialVersionUID = 1;

    public ByteBufferDeserializer() {
        super(ByteBuffer.class);
    }

    public static final void A00(AbstractC9916Gl7 abstractC9916Gl7) {
        ByteBuffer.wrap(abstractC9916Gl7.A24(AbstractC10054GoZ.A01));
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final /* bridge */ /* synthetic */ Object A0i(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) {
        return ByteBuffer.wrap(abstractC9916Gl7.A24(AbstractC10054GoZ.A01));
    }
}
