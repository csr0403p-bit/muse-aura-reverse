package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC9804GhQ;
import X.AbstractC9807GhW;
import X.AbstractC9904Gkk;
import X.AbstractC9916Gl7;
import X.AnonymousClass001;
import X.C9805GhS;
import X.C9808GhY;
import X.C9809Ghf;
import X.C9822GiG;
import X.EnumC9834GiY;
import X.F60;

/* loaded from: classes6.dex */
public class JsonNodeDeserializer extends BaseNodeDeserializer<AbstractC9804GhQ> {
    public static final JsonNodeDeserializer A00 = new JsonNodeDeserializer();

    public final class ArrayDeserializer extends BaseNodeDeserializer<C9805GhS> {
        public static final ArrayDeserializer A00 = new ArrayDeserializer();
        public static final long serialVersionUID = 1;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final C9805GhS A0i(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) {
            if (!abstractC9916Gl7.A1x()) {
                abstractC9904Gkk.A0X(abstractC9916Gl7, C9805GhS.class);
                throw F60.createAndThrow();
            }
            C9808GhY c9808GhY = abstractC9904Gkk._config._nodeFactory;
            C9805GhS c9805GhS = new C9805GhS(c9808GhY);
            A1N(abstractC9916Gl7, abstractC9904Gkk, new C9822GiG(), c9805GhS, c9808GhY);
            return c9805GhS;
        }

        public ArrayDeserializer() {
            super(AnonymousClass001.A0i(), C9805GhS.class);
        }
    }

    public final class ObjectDeserializer extends BaseNodeDeserializer<C9809Ghf> {
        public static final ObjectDeserializer A00 = new ObjectDeserializer();
        public static final long serialVersionUID = 1;

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final C9809Ghf A0i(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) {
            C9808GhY c9808GhY = abstractC9904Gkk._config._nodeFactory;
            if (abstractC9916Gl7.A1y()) {
                C9809Ghf c9809Ghf = new C9809Ghf(c9808GhY);
                A1N(abstractC9916Gl7, abstractC9904Gkk, new C9822GiG(), c9809Ghf, c9808GhY);
                return c9809Ghf;
            }
            if (abstractC9916Gl7.A22(EnumC9834GiY.FIELD_NAME)) {
                return A1M(abstractC9916Gl7, abstractC9904Gkk, new C9822GiG(), c9808GhY);
            }
            if (abstractC9916Gl7.A22(EnumC9834GiY.END_OBJECT)) {
                return new C9809Ghf(c9808GhY);
            }
            abstractC9904Gkk.A0X(abstractC9916Gl7, C9809Ghf.class);
            throw F60.createAndThrow();
        }

        public ObjectDeserializer() {
            super(AnonymousClass001.A0i(), C9809Ghf.class);
        }
    }

    public JsonNodeDeserializer() {
        super(null, AbstractC9804GhQ.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final AbstractC9804GhQ A0i(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) {
        AbstractC9807GhW c9809Ghf;
        C9822GiG c9822GiG = new C9822GiG();
        C9808GhY c9808GhY = abstractC9904Gkk._config._nodeFactory;
        int iA1B = abstractC9916Gl7.A1B();
        if (iA1B == 1) {
            c9809Ghf = new C9809Ghf(c9808GhY);
        } else {
            if (iA1B == 2) {
                return new C9809Ghf(c9808GhY);
            }
            if (iA1B != 3) {
                return iA1B != 5 ? A1K(abstractC9916Gl7, abstractC9904Gkk) : A1M(abstractC9916Gl7, abstractC9904Gkk, c9822GiG, c9808GhY);
            }
            c9809Ghf = new C9805GhS(c9808GhY);
        }
        A1N(abstractC9916Gl7, abstractC9904Gkk, c9822GiG, c9809Ghf, c9808GhY);
        return c9809Ghf;
    }
}
