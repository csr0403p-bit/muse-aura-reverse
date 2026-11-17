package com.facebook.aura.gateway;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class FlightCheckoutDetailRowJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String kind;
    public final String text;

    public final class Companion {
        public final C9hr<FlightCheckoutDetailRowJson> serializer() {
            return FlightCheckoutDetailRowJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(FlightCheckoutDetailRowJson flightCheckoutDetailRowJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || flightCheckoutDetailRowJson.kind != null) {
            c9j5.AAP(flightCheckoutDetailRowJson.kind, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || flightCheckoutDetailRowJson.text != null) {
            c9j5.AAP(flightCheckoutDetailRowJson.text, C07779iq.A01, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FlightCheckoutDetailRowJson) {
                FlightCheckoutDetailRowJson flightCheckoutDetailRowJson = (FlightCheckoutDetailRowJson) obj;
                if (!C7384Etj.areEqual(this.kind, flightCheckoutDetailRowJson.kind) || !C7384Etj.areEqual(this.text, flightCheckoutDetailRowJson.text)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FlightCheckoutDetailRowJson copy$default(FlightCheckoutDetailRowJson flightCheckoutDetailRowJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = flightCheckoutDetailRowJson.kind;
        }
        if ((i & 2) != 0) {
            str2 = flightCheckoutDetailRowJson.text;
        }
        return new FlightCheckoutDetailRowJson(str, str2);
    }

    public final String component1() {
        return this.kind;
    }

    public final String component2() {
        return this.text;
    }

    public final FlightCheckoutDetailRowJson copy(String str, String str2) {
        return new FlightCheckoutDetailRowJson(str, str2);
    }

    public final String getKind() {
        return this.kind;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return (AnonymousClass006.A0G(this.kind) * 31) + AnonymousClass005.A0H(this.text);
    }

    public final HatchAgentPermissionsRepository.FlightCheckoutDetailRow toDomainOrNull() {
        String strTrimToNonEmpty;
        String str = this.text;
        if (str == null || (strTrimToNonEmpty = HatchAgentPermissionsRepositoryJsonKt.trimToNonEmpty(str)) == null) {
            return null;
        }
        return new HatchAgentPermissionsRepository.FlightCheckoutDetailRow(FlightCheckoutDetailRowKind.Companion.fromWire(this.kind), strTrimToNonEmpty);
    }

    public FlightCheckoutDetailRowJson(String str, String str2) {
        this.kind = str;
        this.text = str2;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ FlightCheckoutDetailRowJson(int i, String str, String str2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.kind = null;
        } else {
            this.kind = str;
        }
        if ((i & 2) == 0) {
            this.text = null;
        } else {
            this.text = str2;
        }
    }

    public /* synthetic */ FlightCheckoutDetailRowJson(String str, String str2, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public FlightCheckoutDetailRowJson() {
        this(null, null);
    }
}
