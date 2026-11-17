package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC9904Gkk;
import X.AbstractC9916Gl7;
import X.C3cG;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.util.Collection;
import java.util.concurrent.ArrayBlockingQueue;

/* loaded from: classes6.dex */
public class ArrayBlockingQueueDeserializer extends CollectionDeserializer {
    public static final long serialVersionUID = 1;

    @Override // com.fasterxml.jackson.databind.deser.std.CollectionDeserializer
    public final Collection<Object> A1K(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk, Collection<Object> collection) throws JsonMappingException {
        if (collection == null) {
            collection = C3cG.A0h();
        }
        super.A1K(abstractC9916Gl7, abstractC9904Gkk, collection);
        return collection.isEmpty() ? new ArrayBlockingQueue(1, false) : new ArrayBlockingQueue(collection.size(), false, collection);
    }
}
