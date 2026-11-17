package com.facebook.aura.shopping.model;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cG;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import X.FGI;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import com.facebook.aura.shopping.model.PdpActionIntent;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializationException;

/* loaded from: classes4.dex */
public final class PdpActionIntentSerializer implements C9hr<PdpActionIntent> {
    public static final int $stable = 0;
    public static final PdpActionIntentSerializer INSTANCE = new PdpActionIntentSerializer();
    public static final C9iZ descriptor = PdpActionIntentSerializer$Surrogate$$serializer.descriptor;

    @Serializable
    public final class Surrogate extends C06G {
        public static final Companion Companion = new Companion();
        public final String type;
        public final String value;

        public final class Companion {
            public final C9hr<Surrogate> serializer() {
                return PdpActionIntentSerializer$Surrogate$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(C06H c06h) {
            }

            public Companion() {
            }
        }

        public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(Surrogate surrogate, C9j5 c9j5, C9iZ c9iZ) {
            c9j5.AAV(surrogate.type, c9iZ, 0);
            c9j5.AAV(surrogate.value, c9iZ, 1);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Surrogate) {
                    Surrogate surrogate = (Surrogate) obj;
                    if (!C7384Etj.areEqual(this.type, surrogate.type) || !C7384Etj.areEqual(this.value, surrogate.value)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.type;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.value;
            }
            AnonymousClass003.A0u(str, str2);
            return new Surrogate(str, str2);
        }

        public final String component1() {
            return this.type;
        }

        public final String component2() {
            return this.value;
        }

        public final String getType() {
            return this.type;
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.value, AnonymousClass001.A0G(this.type));
        }

        public Surrogate(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            this.type = str;
            this.value = str2;
        }

        public final Surrogate copy(String str, String str2) {
            AnonymousClass003.A0u(str, str2);
            return new Surrogate(str, str2);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, C2hx c2hx) {
            if (3 != (i & 3)) {
                C9iI.A00(PdpActionIntentSerializer$Surrogate$$serializer.descriptor, i, 3);
                throw F60.createAndThrow();
            }
            this.type = str;
            this.value = str2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C9jG
    public PdpActionIntent deserialize(InterfaceC07829iw interfaceC07829iw) {
        PdpActionIntent deeplink;
        PdpActionIntent pdpActionIntent;
        C7384Etj.A0Y(interfaceC07829iw, 0);
        Surrogate surrogate = (Surrogate) interfaceC07829iw.A8b(PdpActionIntentSerializer$Surrogate$$serializer.INSTANCE);
        String str = surrogate.type;
        switch (str.hashCode()) {
            case -504306182:
                if (str.equals("open_url")) {
                    deeplink = new PdpActionIntent.OpenUrl(surrogate.value);
                    return deeplink;
                }
                throw new SerializationException(FGI.A0M("Unknown PdpActionIntent type: ", str));
            case 164161734:
                if (str.equals("add_to_cart")) {
                    pdpActionIntent = PdpActionIntent.AddToCart.INSTANCE;
                    return pdpActionIntent;
                }
                throw new SerializationException(FGI.A0M("Unknown PdpActionIntent type: ", str));
            case 245343645:
                if (str.equals("buy_now")) {
                    pdpActionIntent = PdpActionIntent.BuyNow.INSTANCE;
                    return pdpActionIntent;
                }
                throw new SerializationException(FGI.A0M("Unknown PdpActionIntent type: ", str));
            case 629233382:
                if (str.equals("deeplink")) {
                    deeplink = new PdpActionIntent.Deeplink(surrogate.value);
                    return deeplink;
                }
                throw new SerializationException(FGI.A0M("Unknown PdpActionIntent type: ", str));
            default:
                throw new SerializationException(FGI.A0M("Unknown PdpActionIntent type: ", str));
        }
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public C9iZ getDescriptor() {
        return descriptor;
    }

    @Override // X.C9hv
    public void serialize(InterfaceC07789is interfaceC07789is, PdpActionIntent pdpActionIntent) {
        String str;
        AnonymousClass003.A0u(interfaceC07789is, pdpActionIntent);
        String str2 = "";
        if (pdpActionIntent instanceof PdpActionIntent.BuyNow) {
            str = "buy_now";
        } else if (pdpActionIntent instanceof PdpActionIntent.AddToCart) {
            str = "add_to_cart";
        } else if (pdpActionIntent instanceof PdpActionIntent.OpenUrl) {
            str2 = ((PdpActionIntent.OpenUrl) pdpActionIntent).url;
            str = "open_url";
        } else {
            if (!(pdpActionIntent instanceof PdpActionIntent.Deeplink)) {
                throw C3cG.A0q();
            }
            str2 = ((PdpActionIntent.Deeplink) pdpActionIntent).uri;
            str = "deeplink";
        }
        interfaceC07789is.AAR(new Surrogate(str, str2), PdpActionIntentSerializer$Surrogate$$serializer.INSTANCE);
    }
}
