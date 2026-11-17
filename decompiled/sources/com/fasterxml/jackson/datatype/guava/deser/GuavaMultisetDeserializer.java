package com.fasterxml.jackson.datatype.guava.deser;

import X.InterfaceC5026DPa;
import com.google.common.collect.AbstractMapBasedMultiset;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.LinkedHashMultiset;
import com.google.common.collect.NaturalOrdering;
import com.google.common.collect.TreeMultiset;

/* loaded from: classes5.dex */
public abstract class GuavaMultisetDeserializer<T extends InterfaceC5026DPa<Object>> extends GuavaCollectionDeserializer<T> {
    public static final long serialVersionUID = 1;

    public final T A1L() {
        if (this instanceof TreeMultisetDeserializer) {
            return new TreeMultiset(NaturalOrdering.A00);
        }
        if (this instanceof LinkedHashMultisetDeserializer) {
            LinkedHashMultiset linkedHashMultiset = new LinkedHashMultiset();
            ((AbstractMapBasedMultiset) linkedHashMultiset).A01 = linkedHashMultiset.A03();
            return linkedHashMultiset;
        }
        HashMultiset hashMultiset = new HashMultiset();
        ((AbstractMapBasedMultiset) hashMultiset).A01 = hashMultiset.A03();
        return hashMultiset;
    }
}
