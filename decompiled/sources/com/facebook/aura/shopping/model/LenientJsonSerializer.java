package com.facebook.aura.shopping.model;

import X.AbstractC07749im;
import X.C10571Hud;
import X.C3cG;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import com.facebook.aura.json.HatchJsonKt;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;

/* loaded from: classes4.dex */
public abstract class LenientJsonSerializer<T> implements C9hr<T> {
    public static final int $stable = 0;
    public final C9hr<T> delegate;
    public final C9iZ descriptor;

    public LenientJsonSerializer(C9hr<T> c9hr) {
        C7384Etj.A0Y(c9hr, 0);
        this.delegate = c9hr;
        this.descriptor = AbstractC07749im.A00(c9hr).getDescriptor();
    }

    @Override // X.C9jG
    public T deserialize(InterfaceC07829iw interfaceC07829iw) {
        T t;
        C7384Etj.A0Y(interfaceC07829iw, 0);
        try {
            t = (T) HatchJsonKt.HatchJson.A01(this.delegate, (JsonElement) interfaceC07829iw.A8b(JsonElementSerializer.A00));
        } catch (Throwable th) {
            t = (T) C3cG.A0s(th);
        }
        if (t instanceof C10571Hud) {
            return null;
        }
        return t;
    }

    @Override // X.C9hv
    public void serialize(InterfaceC07789is interfaceC07789is, T t) {
        C7384Etj.A0Y(interfaceC07789is, 0);
        interfaceC07789is.AAR(t, AbstractC07749im.A00(this.delegate));
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public C9iZ getDescriptor() {
        return this.descriptor;
    }
}
