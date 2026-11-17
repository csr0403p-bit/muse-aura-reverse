package com.fasterxml.jackson.datatype.guava.deser;

import X.DKN;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;

/* loaded from: classes6.dex */
public class HashCodeDeserializer extends FromStringDeserializer<DKN> {
    public static final HashCodeDeserializer A00 = new HashCodeDeserializer();
    public static final long serialVersionUID = 1;

    public HashCodeDeserializer() {
        super(DKN.class);
    }
}
