package com.facebook.aura.maps.model;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import X.FGI;
import X.InterfaceC07789is;
import X.InterfaceC07829iw;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializationException;

/* loaded from: classes4.dex */
public final class HatchMapElementSerializer implements C9hr<HatchMapElement> {
    public static final int $stable = 0;
    public static final HatchMapElementSerializer INSTANCE = new HatchMapElementSerializer();
    public static final C9iZ descriptor = HatchMapElementSerializer$Surrogate$$serializer.descriptor;

    @Serializable
    public final class Surrogate extends C06G {
        public static final Companion Companion = new Companion();
        public final String kind;
        public final HatchMapMarker marker;
        public final HatchMapPlace richPlace;

        public final class Companion {
            public final C9hr<Surrogate> serializer() {
                return HatchMapElementSerializer$Surrogate$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(C06H c06h) {
            }

            public Companion() {
            }
        }

        public Surrogate(String str, HatchMapPlace hatchMapPlace, HatchMapMarker hatchMapMarker) {
            C7384Etj.A0Y(str, 0);
            this.kind = str;
            this.richPlace = hatchMapPlace;
            this.marker = hatchMapMarker;
        }

        public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_maps_model_model(Surrogate surrogate, C9j5 c9j5, C9iZ c9iZ) {
            c9j5.AAV(surrogate.kind, c9iZ, 0);
            boolean zAfR = c9j5.AfR();
            if (zAfR || surrogate.richPlace != null) {
                c9j5.AAP(surrogate.richPlace, HatchMapPlace$$serializer.INSTANCE, c9iZ, 1);
            }
            if (zAfR || surrogate.marker != null) {
                c9j5.AAP(surrogate.marker, HatchMapMarker$$serializer.INSTANCE, c9iZ, 2);
            }
        }

        public final Surrogate copy(String str, HatchMapPlace hatchMapPlace, HatchMapMarker hatchMapMarker) {
            C7384Etj.A0Y(str, 0);
            return new Surrogate(str, hatchMapPlace, hatchMapMarker);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Surrogate) {
                    Surrogate surrogate = (Surrogate) obj;
                    if (!C7384Etj.areEqual(this.kind, surrogate.kind) || !C7384Etj.areEqual(this.richPlace, surrogate.richPlace) || !C7384Etj.areEqual(this.marker, surrogate.marker)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, HatchMapPlace hatchMapPlace, HatchMapMarker hatchMapMarker, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.kind;
            }
            if ((i & 2) != 0) {
                hatchMapPlace = surrogate.richPlace;
            }
            if ((i & 4) != 0) {
                hatchMapMarker = surrogate.marker;
            }
            return surrogate.copy(str, hatchMapPlace, hatchMapMarker);
        }

        public final String component1() {
            return this.kind;
        }

        public final HatchMapPlace component2() {
            return this.richPlace;
        }

        public final HatchMapMarker component3() {
            return this.marker;
        }

        public final String getKind() {
            return this.kind;
        }

        public final HatchMapMarker getMarker() {
            return this.marker;
        }

        public final HatchMapPlace getRichPlace() {
            return this.richPlace;
        }

        public int hashCode() {
            return ((AnonymousClass001.A0G(this.kind) + AnonymousClass006.A0D(this.richPlace)) * 31) + C3cH.A02(this.marker);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Surrogate(int i, String str, HatchMapPlace hatchMapPlace, HatchMapMarker hatchMapMarker, C2hx c2hx) {
            if (1 != (i & 1)) {
                C9iI.A00(HatchMapElementSerializer$Surrogate$$serializer.descriptor, i, 1);
                throw F60.createAndThrow();
            }
            this.kind = str;
            if ((i & 2) == 0) {
                this.richPlace = null;
            } else {
                this.richPlace = hatchMapPlace;
            }
            if ((i & 4) == 0) {
                this.marker = null;
            } else {
                this.marker = hatchMapMarker;
            }
        }

        public /* synthetic */ Surrogate(String str, HatchMapPlace hatchMapPlace, HatchMapMarker hatchMapMarker, int i, C06H c06h) {
            this(str, (i & 2) != 0 ? null : hatchMapPlace, (i & 4) != 0 ? null : hatchMapMarker);
        }
    }

    @Override // X.C9jG
    public HatchMapElement deserialize(InterfaceC07829iw interfaceC07829iw) {
        HatchMapElement hatchMapElement;
        C7384Etj.A0Y(interfaceC07829iw, 0);
        Surrogate surrogate = (Surrogate) interfaceC07829iw.A8b(HatchMapElementSerializer$Surrogate$$serializer.INSTANCE);
        String str = surrogate.kind;
        if ("rich_place".equals(str)) {
            hatchMapElement = surrogate.richPlace;
            if (hatchMapElement == null) {
                throw new SerializationException("Missing rich_place payload for map element");
            }
        } else {
            if (!"marker".equals(str)) {
                throw new SerializationException(FGI.A0M("Unknown map element kind: ", str));
            }
            hatchMapElement = surrogate.marker;
            if (hatchMapElement == null) {
                throw new SerializationException("Missing marker payload for map element");
            }
        }
        return hatchMapElement;
    }

    @Override // X.C9hr, X.C9hv, X.C9jG
    public C9iZ getDescriptor() {
        return descriptor;
    }

    @Override // X.C9hv
    public void serialize(InterfaceC07789is interfaceC07789is, HatchMapElement hatchMapElement) {
        Surrogate surrogate;
        AnonymousClass003.A0u(interfaceC07789is, hatchMapElement);
        if (hatchMapElement instanceof HatchMapPlace) {
            surrogate = new Surrogate("rich_place", (HatchMapPlace) hatchMapElement, null);
        } else {
            if (!(hatchMapElement instanceof HatchMapMarker)) {
                throw C3cG.A0q();
            }
            surrogate = new Surrogate("marker", null, (HatchMapMarker) hatchMapElement);
        }
        interfaceC07789is.AAR(surrogate, HatchMapElementSerializer$Surrogate$$serializer.INSTANCE);
    }
}
