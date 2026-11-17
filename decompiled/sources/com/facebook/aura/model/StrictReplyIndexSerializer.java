package com.facebook.aura.model;

import X.AnonymousClass001;
import X.BNA;
import X.C07719ih;
import X.C07729ii;
import X.C7384Etj;
import X.C9hr;
import X.C9iY;
import X.C9iZ;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import com.facebook.aura.json.HatchJsonKt;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes4.dex */
public final class StrictReplyIndexSerializer implements C9hr<Integer> {
    public static final StrictReplyIndexSerializer INSTANCE = new StrictReplyIndexSerializer();
    public static final C9iZ descriptor = C9iY.A05("ReplyElementIndex", C07719ih.A00);

    @Override // X.C9jG
    public Integer deserialize(InterfaceC07829iw interfaceC07829iw) {
        BNA bna;
        C7384Etj.A0Y(interfaceC07829iw, 0);
        if (!(interfaceC07829iw instanceof BNA) || (bna = (BNA) interfaceC07829iw) == null) {
            throw new SerializationException("Reply index requires JSON");
        }
        JsonElement jsonElementA8V = bna.A8V();
        if (!(jsonElementA8V instanceof JsonPrimitive) || ((JsonPrimitive) jsonElementA8V).A01()) {
            throw new SerializationException("Reply index must be an integer token");
        }
        return (Integer) HatchJsonKt.HatchJson.A01(C07729ii.A00, jsonElementA8V);
    }

    public void serialize(InterfaceC07789is interfaceC07789is, int i) {
        C7384Etj.A0Y(interfaceC07789is, 0);
        interfaceC07789is.AAJ(i);
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public C9iZ getDescriptor() {
        return descriptor;
    }

    @Override // X.C9hv
    public /* bridge */ /* synthetic */ void serialize(InterfaceC07789is interfaceC07789is, Object obj) {
        serialize(interfaceC07789is, AnonymousClass001.A0F(obj));
    }
}
