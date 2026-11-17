package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC9904Gkk;
import X.AbstractC9916Gl7;
import X.C9913Gl1;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;

@JacksonStdImpl
/* loaded from: classes6.dex */
public class TokenBufferDeserializer extends StdScalarDeserializer<C9913Gl1> {
    public static final long serialVersionUID = 1;

    public TokenBufferDeserializer() {
        super(C9913Gl1.class);
    }

    public static final void A00(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) throws MismatchedInputException, JsonGenerationException {
        new C9913Gl1(abstractC9916Gl7).A14(abstractC9916Gl7, abstractC9904Gkk);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final /* bridge */ /* synthetic */ Object A0i(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) throws MismatchedInputException, JsonGenerationException {
        C9913Gl1 c9913Gl1 = new C9913Gl1(abstractC9916Gl7);
        c9913Gl1.A14(abstractC9916Gl7, abstractC9904Gkk);
        return c9913Gl1;
    }
}
