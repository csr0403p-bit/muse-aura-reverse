package com.facebook.aura.onepassword;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class OnePasswordGrantPayloadJson extends C06G {
    public static final int $stable = 8;
    public final List<OnePasswordResolvedGrantJson> resolved;
    public final String state;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1X(C79.A01, OnePasswordGrantPayloadJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<OnePasswordGrantPayloadJson> serializer() {
            return OnePasswordGrantPayloadJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public OnePasswordGrantPayloadJson(List<OnePasswordResolvedGrantJson> list, String str) {
        C7384Etj.A0Y(list, 0);
        this.resolved = list;
        this.state = str;
    }

    public final OnePasswordGrantPayloadJson copy(List<OnePasswordResolvedGrantJson> list, String str) {
        C7384Etj.A0Y(list, 0);
        return new OnePasswordGrantPayloadJson(list, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OnePasswordGrantPayloadJson) {
                OnePasswordGrantPayloadJson onePasswordGrantPayloadJson = (OnePasswordGrantPayloadJson) obj;
                if (!C7384Etj.areEqual(this.resolved, onePasswordGrantPayloadJson.resolved) || !C7384Etj.areEqual(this.state, onePasswordGrantPayloadJson.state)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ OnePasswordGrantPayloadJson copy$default(OnePasswordGrantPayloadJson onePasswordGrantPayloadJson, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = onePasswordGrantPayloadJson.resolved;
        }
        if ((i & 2) != 0) {
            str = onePasswordGrantPayloadJson.state;
        }
        C7384Etj.A0Y(list, 0);
        return new OnePasswordGrantPayloadJson(list, str);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_onepassword_onepassword(OnePasswordGrantPayloadJson onePasswordGrantPayloadJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cG.A1L(onePasswordGrantPayloadJson.resolved)) {
            c9j5.AAQ(onePasswordGrantPayloadJson.resolved, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
        if (zAfR || onePasswordGrantPayloadJson.state != null) {
            c9j5.AAP(onePasswordGrantPayloadJson.state, C07779iq.A01, c9iZ, 1);
        }
    }

    public final List<OnePasswordResolvedGrantJson> component1() {
        return this.resolved;
    }

    public final String component2() {
        return this.state;
    }

    public final List<OnePasswordResolvedGrantJson> getResolved() {
        return this.resolved;
    }

    public final String getState() {
        return this.state;
    }

    public int hashCode() {
        return AnonymousClass005.A0E(this.resolved) + AnonymousClass006.A0G(this.state);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ OnePasswordGrantPayloadJson(int i, List list, String str, C2hx c2hx) {
        this.resolved = (i & 1) == 0 ? C0881AGi.A00 : list;
        if ((i & 2) == 0) {
            this.state = null;
        } else {
            this.state = str;
        }
    }

    public /* synthetic */ OnePasswordGrantPayloadJson(List list, String str, int i, C06H c06h) {
        this(C3cI.A10(list, i), AnonymousClass006.A0s(i, str));
    }

    public OnePasswordGrantPayloadJson() {
        this(C0881AGi.A00, null);
    }
}
