package com.facebook.aura.maps.model;

import X.AbstractC5321DgF;
import X.AbstractC7559F3s;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C8j4;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class HatchMapScene extends C06G {
    public static final int $stable = 0;
    public final List<HatchMapElement> elements;
    public final F0C markers$delegate;
    public final String motivation;
    public final F0C places$delegate;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1X(C79.A01, HatchMapScene$Companion$$childSerializers$1.INSTANCE);

    /* renamed from: com.facebook.aura.maps.model.HatchMapScene$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<List<? extends HatchMapPlace>> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends HatchMapPlace> invoke() {
            List<HatchMapElement> list = HatchMapScene.this.elements;
            ArrayList arrayListA0h = C3cG.A0h();
            for (HatchMapElement hatchMapElement : list) {
                if (hatchMapElement instanceof HatchMapPlace) {
                    arrayListA0h.add(hatchMapElement);
                }
            }
            return arrayListA0h;
        }
    }

    /* renamed from: com.facebook.aura.maps.model.HatchMapScene$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<List<? extends HatchMapMarker>> {
        public AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends HatchMapMarker> invoke() {
            List<HatchMapElement> list = HatchMapScene.this.elements;
            ArrayList arrayListA0h = C3cG.A0h();
            for (HatchMapElement hatchMapElement : list) {
                if (hatchMapElement instanceof HatchMapMarker) {
                    arrayListA0h.add(hatchMapElement);
                }
            }
            return arrayListA0h;
        }
    }

    public final class Companion {
        public final C9hr<HatchMapScene> serializer() {
            return HatchMapScene$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HatchMapScene(List<? extends HatchMapElement> list, String str) {
        C7384Etj.A0Y(list, 0);
        this.elements = list;
        this.motivation = str;
        this.places$delegate = AbstractC5321DgF.A03(new HatchMapScene$places$2(this));
        this.markers$delegate = AbstractC5321DgF.A03(new HatchMapScene$markers$2(this));
    }

    public final HatchMapScene copy(List<? extends HatchMapElement> list, String str) {
        C7384Etj.A0Y(list, 0);
        return new HatchMapScene(list, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchMapScene) {
                HatchMapScene hatchMapScene = (HatchMapScene) obj;
                if (!C7384Etj.areEqual(this.elements, hatchMapScene.elements) || !C7384Etj.areEqual(this.motivation, hatchMapScene.motivation)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchMapScene copy$default(HatchMapScene hatchMapScene, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = hatchMapScene.elements;
        }
        if ((i & 2) != 0) {
            str = hatchMapScene.motivation;
        }
        C7384Etj.A0Y(list, 0);
        return new HatchMapScene(list, str);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_maps_model_model(HatchMapScene hatchMapScene, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAQ(hatchMapScene.elements, C3cH.A15($childSerializers, 0), c9iZ, 0);
        if (c9j5.AfR() || hatchMapScene.motivation != null) {
            c9j5.AAP(hatchMapScene.motivation, C07779iq.A01, c9iZ, 1);
        }
    }

    public final List<HatchMapElement> component1() {
        return this.elements;
    }

    public final String component2() {
        return this.motivation;
    }

    public final List<HatchMapElement> getElements() {
        return this.elements;
    }

    public final List<HatchMapMarker> getMarkers() {
        return (List) this.markers$delegate.getValue();
    }

    public final String getMotivation() {
        return this.motivation;
    }

    public final List<HatchMapPlace> getPlaces() {
        return (List) this.places$delegate.getValue();
    }

    public int hashCode() {
        return AnonymousClass005.A0E(this.elements) + AnonymousClass006.A0G(this.motivation);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchMapScene(int i, List list, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(HatchMapScene$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.elements = list;
        this.motivation = C8j4.A0t(i, str);
        this.places$delegate = AbstractC5321DgF.A03(new AnonymousClass1());
        this.markers$delegate = AbstractC5321DgF.A03(new AnonymousClass2());
    }

    public /* synthetic */ HatchMapScene(List list, String str, int i, C06H c06h) {
        this(list, AnonymousClass006.A0s(i, str));
    }
}
