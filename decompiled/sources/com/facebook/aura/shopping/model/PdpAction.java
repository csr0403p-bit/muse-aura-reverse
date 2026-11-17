package com.facebook.aura.shopping.model;

import X.AbstractC5321DgF;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import com.facebook.aura.shopping.model.PdpActionIntent;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class PdpAction extends C06G {
    public static final int $stable = 8;
    public final boolean followsProductWebsite;
    public final PdpActionIntent intent;
    public final String label;
    public final PdpActionStyle style;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, AbstractC5321DgF.A02(C79.A01, PdpAction$Companion$$childSerializers$1.INSTANCE), null};

    public final class Companion {
        public final PdpAction productWebsite(String str, String str2) {
            C7384Etj.A0Y(str, 0);
            int i = PdpAction.$stable;
            return new PdpAction(new PdpActionIntent.OpenUrl(str), str2, PdpActionStyle.SECONDARY, true);
        }

        public final C9hr<PdpAction> serializer() {
            return PdpAction$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PdpAction) {
                PdpAction pdpAction = (PdpAction) obj;
                if (!C7384Etj.areEqual(this.intent, pdpAction.intent) || !C7384Etj.areEqual(this.label, pdpAction.label) || this.style != pdpAction.style || this.followsProductWebsite != pdpAction.followsProductWebsite) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PdpAction copy$default(PdpAction pdpAction, PdpActionIntent pdpActionIntent, String str, PdpActionStyle pdpActionStyle, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            pdpActionIntent = pdpAction.intent;
        }
        if ((i & 2) != 0) {
            str = pdpAction.label;
        }
        if ((i & 4) != 0) {
            pdpActionStyle = pdpAction.style;
        }
        if ((i & 8) != 0) {
            z = pdpAction.followsProductWebsite;
        }
        AnonymousClass003.A0v(pdpActionIntent, pdpActionStyle);
        return new PdpAction(pdpActionIntent, str, pdpActionStyle, z);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_shopping_model_model(PdpAction pdpAction, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAQ(pdpAction.intent, PdpActionIntentSerializer.INSTANCE, c9iZ, 0);
        c9j5.AAP(pdpAction.label, C07779iq.A01, c9iZ, 1);
        c9j5.AAQ(pdpAction.style, C3cH.A15(f0cArr, 2), c9iZ, 2);
        if (c9j5.AfR() || pdpAction.followsProductWebsite) {
            c9j5.AA7(c9iZ, 3, pdpAction.followsProductWebsite);
        }
    }

    public final PdpActionIntent component1() {
        return this.intent;
    }

    public final String component2() {
        return this.label;
    }

    public final PdpActionStyle component3() {
        return this.style;
    }

    public final boolean component4() {
        return this.followsProductWebsite;
    }

    public final boolean getFollowsProductWebsite() {
        return this.followsProductWebsite;
    }

    public final PdpActionIntent getIntent() {
        return this.intent;
    }

    public final String getLabel() {
        return this.label;
    }

    public final PdpActionStyle getStyle() {
        return this.style;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass005.A0F(this.style, (AnonymousClass005.A0E(this.intent) + AnonymousClass006.A0G(this.label)) * 31), this.followsProductWebsite);
    }

    public PdpAction(PdpActionIntent pdpActionIntent, String str, PdpActionStyle pdpActionStyle, boolean z) {
        AnonymousClass003.A0v(pdpActionIntent, pdpActionStyle);
        this.intent = pdpActionIntent;
        this.label = str;
        this.style = pdpActionStyle;
        this.followsProductWebsite = z;
    }

    public final PdpAction copy(PdpActionIntent pdpActionIntent, String str, PdpActionStyle pdpActionStyle, boolean z) {
        AnonymousClass003.A0v(pdpActionIntent, pdpActionStyle);
        return new PdpAction(pdpActionIntent, str, pdpActionStyle, z);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PdpAction(int i, PdpActionIntent pdpActionIntent, String str, PdpActionStyle pdpActionStyle, boolean z, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(PdpAction$$serializer.descriptor, i, 7);
            throw F60.createAndThrow();
        }
        this.intent = pdpActionIntent;
        this.label = str;
        this.style = pdpActionStyle;
        this.followsProductWebsite = (i & 8) == 0 ? false : z;
    }

    public /* synthetic */ PdpAction(PdpActionIntent pdpActionIntent, String str, PdpActionStyle pdpActionStyle, boolean z, int i, C06H c06h) {
        this(pdpActionIntent, str, pdpActionStyle, AnonymousClass005.A1P(i, z));
    }
}
