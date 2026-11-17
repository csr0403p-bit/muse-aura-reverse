package com.facebook.aura.confidentialvm.repository;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class PinMutationResultJson extends C06G {
    public static final Companion Companion = new Companion();
    public final boolean accepted;
    public final PinStateJson current_pin_state;

    public final class Companion {
        public final C9hr<PinMutationResultJson> serializer() {
            return PinMutationResultJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_confidentialvm_repository_repository(PinMutationResultJson pinMutationResultJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AA7(c9iZ, 0, pinMutationResultJson.accepted);
        if (c9j5.AfR() || pinMutationResultJson.current_pin_state != null) {
            c9j5.AAP(pinMutationResultJson.current_pin_state, PinStateJson$$serializer.INSTANCE, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PinMutationResultJson) {
                PinMutationResultJson pinMutationResultJson = (PinMutationResultJson) obj;
                if (this.accepted != pinMutationResultJson.accepted || !C7384Etj.areEqual(this.current_pin_state, pinMutationResultJson.current_pin_state)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PinMutationResultJson copy$default(PinMutationResultJson pinMutationResultJson, boolean z, PinStateJson pinStateJson, int i, Object obj) {
        if ((i & 1) != 0) {
            z = pinMutationResultJson.accepted;
        }
        if ((i & 2) != 0) {
            pinStateJson = pinMutationResultJson.current_pin_state;
        }
        return new PinMutationResultJson(z, pinStateJson);
    }

    public final boolean component1() {
        return this.accepted;
    }

    public final PinStateJson component2() {
        return this.current_pin_state;
    }

    public final PinMutationResultJson copy(boolean z, PinStateJson pinStateJson) {
        return new PinMutationResultJson(z, pinStateJson);
    }

    public final boolean getAccepted() {
        return this.accepted;
    }

    public final PinStateJson getCurrent_pin_state() {
        return this.current_pin_state;
    }

    public int hashCode() {
        return C0KA.A02(this.accepted) + AnonymousClass006.A0D(this.current_pin_state);
    }

    public PinMutationResultJson(boolean z, PinStateJson pinStateJson) {
        this.accepted = z;
        this.current_pin_state = pinStateJson;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PinMutationResultJson(int i, boolean z, PinStateJson pinStateJson, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(PinMutationResultJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.accepted = z;
        this.current_pin_state = (i & 2) == 0 ? null : pinStateJson;
    }

    public /* synthetic */ PinMutationResultJson(boolean z, PinStateJson pinStateJson, int i, C06H c06h) {
        this(z, (i & 2) != 0 ? null : pinStateJson);
    }
}
