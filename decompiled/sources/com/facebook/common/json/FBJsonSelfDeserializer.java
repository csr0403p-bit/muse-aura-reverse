package com.facebook.common.json;

import X.AbstractC9779GgG;
import X.AbstractC9904Gkk;
import X.AbstractC9916Gl7;
import X.BV4;
import X.F60;
import com.google.common.base.Throwables;
import java.io.IOException;

/* loaded from: classes6.dex */
public class FBJsonSelfDeserializer extends FbJsonDeserializer {
    @Override // com.facebook.common.json.FbJsonDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0i(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) throws IOException {
        try {
            A0q();
            throw BV4.A0a("deserialize");
        } catch (Exception e) {
            Throwables.propagateIfPossible(e, IOException.class);
            AbstractC9779GgG.A00(abstractC9916Gl7, this.A00, e);
            throw F60.createAndThrow();
        }
    }
}
