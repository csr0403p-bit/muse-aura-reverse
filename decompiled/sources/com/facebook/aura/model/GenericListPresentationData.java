package com.facebook.aura.model;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C60R;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class GenericListPresentationData extends C06G implements HatchPresentationData {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final GenericListPresentation list;
    public final JSONState state;

    public final class Companion {
        public final C9hr<GenericListPresentationData> serializer() {
            return GenericListPresentationData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GenericListPresentationData) {
                GenericListPresentationData genericListPresentationData = (GenericListPresentationData) obj;
                if (!C7384Etj.areEqual(this.list, genericListPresentationData.list) || !C7384Etj.areEqual(this.state, genericListPresentationData.state)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ GenericListPresentationData copy$default(GenericListPresentationData genericListPresentationData, GenericListPresentation genericListPresentation, JSONState jSONState, int i, Object obj) {
        if ((i & 1) != 0) {
            genericListPresentation = genericListPresentationData.list;
        }
        if ((i & 2) != 0) {
            jSONState = genericListPresentationData.state;
        }
        AnonymousClass003.A0u(genericListPresentation, jSONState);
        return new GenericListPresentationData(genericListPresentation, jSONState);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(GenericListPresentationData genericListPresentationData, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAQ(genericListPresentationData.list, GenericListPresentation$$serializer.INSTANCE, c9iZ, 0);
        if (c9j5.AfR() || !C7384Etj.areEqual(genericListPresentationData.state, C60R.A0O())) {
            c9j5.AAQ(genericListPresentationData.state, JSONState$$serializer.INSTANCE, c9iZ, 1);
        }
    }

    public final GenericListPresentation component1() {
        return this.list;
    }

    public final JSONState component2() {
        return this.state;
    }

    public final GenericListPresentation getList() {
        return this.list;
    }

    public final JSONState getState() {
        return this.state;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.state, AnonymousClass005.A0E(this.list));
    }

    public GenericListPresentationData(GenericListPresentation genericListPresentation, JSONState jSONState) {
        AnonymousClass003.A0u(genericListPresentation, jSONState);
        this.list = genericListPresentation;
        this.state = jSONState;
    }

    public final GenericListPresentationData copy(GenericListPresentation genericListPresentation, JSONState jSONState) {
        AnonymousClass003.A0u(genericListPresentation, jSONState);
        return new GenericListPresentationData(genericListPresentation, jSONState);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ GenericListPresentationData(int i, GenericListPresentation genericListPresentation, JSONState jSONState, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(GenericListPresentationData$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.list = genericListPresentation;
        this.state = (i & 2) == 0 ? C60R.A0O() : jSONState;
    }

    public /* synthetic */ GenericListPresentationData(GenericListPresentation genericListPresentation, JSONState jSONState, int i, C06H c06h) {
        this(genericListPresentation, (i & 2) != 0 ? C60R.A0O() : jSONState);
    }
}
