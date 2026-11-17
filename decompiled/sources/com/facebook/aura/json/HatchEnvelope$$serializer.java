package com.facebook.aura.json;

import X.AbstractC07749im;
import X.AnonymousClass003;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C7384Etj;
import X.C9cd;
import X.C9hr;
import X.C9iK;
import X.C9iZ;
import X.C9j4;
import X.C9j5;
import X.Hs1;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.pairs.PairsInviteMailboxKt;
import kotlin.Deprecated;
import kotlinx.serialization.UnknownFieldException;

@Deprecated(level = Hs1.A03, message = "This synthesized declaration should not be used directly")
/* loaded from: classes2.dex */
public final /* synthetic */ class HatchEnvelope$$serializer<T> implements C9cd<HatchEnvelope<T>> {
    public final C9iZ descriptor;
    public final /* synthetic */ C9hr<?> typeSerial0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchEnvelope$$serializer(C9hr<T> c9hr) {
        this();
        C7384Etj.A0Y(c9hr, 0);
        this.typeSerial0 = c9hr;
    }

    @Override // X.C9jG
    public final HatchEnvelope<T> deserialize(InterfaceC07829iw interfaceC07829iw) {
        C7384Etj.A0Y(interfaceC07829iw, 0);
        C9iZ c9iZ = this.descriptor;
        C9j4 c9j4A55 = interfaceC07829iw.A55(c9iZ);
        Object objA8Z = null;
        HatchEnvelopeError hatchEnvelopeError = null;
        String str = null;
        boolean zA8G = false;
        int i = 0;
        while (true) {
            int iA8N = c9j4A55.A8N(c9iZ);
            if (iA8N == -1) {
                c9j4A55.AAd(c9iZ);
                return new HatchEnvelope<>(i, zA8G, objA8Z, hatchEnvelopeError, str, (C2hx) null);
            }
            if (iA8N == 0) {
                zA8G = c9j4A55.A8G(c9iZ, 0);
                i |= 1;
            } else if (iA8N == 1) {
                objA8Z = c9j4A55.A8Z(this.typeSerial0, c9iZ, 1);
                i |= 2;
            } else if (iA8N == 2) {
                hatchEnvelopeError = (HatchEnvelopeError) c9j4A55.A8Z(HatchEnvelopeError$$serializer.INSTANCE, c9iZ, 2);
                i |= 4;
            } else {
                if (iA8N != 3) {
                    throw new UnknownFieldException(iA8N);
                }
                str = (String) c9j4A55.A8Z(C07779iq.A01, c9iZ, 3);
                i |= 8;
            }
        }
    }

    private final /* synthetic */ C9hr getTypeSerial0() {
        return this.typeSerial0;
    }

    @Override // X.C9cd
    public final C9hr<?>[] childSerializers() {
        return new C9hr[]{C07839ix.A00, AbstractC07749im.A00(this.typeSerial0), AbstractC07749im.A00(HatchEnvelopeError$$serializer.INSTANCE), AbstractC07749im.A00(C07779iq.A01)};
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return this.descriptor;
    }

    @Override // X.C9cd
    public final C9hr<?>[] typeParametersSerializers() {
        return new C9hr[]{this.typeSerial0};
    }

    public HatchEnvelope$$serializer() {
        C9iK c9iK = new C9iK("com.facebook.aura.json.HatchEnvelope", this, 4);
        c9iK.A08(PairsInviteMailboxKt.OUTCOME_OK, true);
        c9iK.A08("result", true);
        c9iK.A08("error", true);
        c9iK.A08(AuraDeeplinkRouteMapper.CODE_PARAM, true);
        this.descriptor = c9iK;
    }

    @Override // X.C9hv
    public final void serialize(InterfaceC07789is interfaceC07789is, HatchEnvelope<T> hatchEnvelope) {
        AnonymousClass003.A0u(interfaceC07789is, hatchEnvelope);
        C9iZ c9iZ = this.descriptor;
        C9j5 c9j5A56 = interfaceC07789is.A56(c9iZ);
        HatchEnvelope.write$Self$fbandroid_express_aura_java_com_facebook_aura_json_json(hatchEnvelope, c9j5A56, c9iZ, this.typeSerial0);
        c9j5A56.AAd(c9iZ);
    }
}
