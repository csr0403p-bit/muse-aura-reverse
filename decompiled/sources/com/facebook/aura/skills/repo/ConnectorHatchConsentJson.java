package com.facebook.aura.skills.repo;

import X.AGI;
import X.AHH;
import X.AbstractC5321DgF;
import X.AnonymousClass003;
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
import X.C7BY;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import com.facebook.aura.skills.model.Consent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class ConnectorHatchConsentJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final List<ConnectorConsentBulletJson> bullets;
    public final List<String> callout_paragraphs;
    public final String callout_title;
    public final List<String> footer_paragraphs;

    public final class Companion {
        public final C9hr<ConnectorHatchConsentJson> serializer() {
            return ConnectorHatchConsentJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{AbstractC5321DgF.A02(num, ConnectorHatchConsentJson$Companion$$childSerializers$1.INSTANCE), AbstractC5321DgF.A02(num, ConnectorHatchConsentJson$Companion$$childSerializers$2.INSTANCE), AbstractC5321DgF.A02(num, ConnectorHatchConsentJson$Companion$$childSerializers$3.INSTANCE), null};
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConnectorHatchConsentJson) {
                ConnectorHatchConsentJson connectorHatchConsentJson = (ConnectorHatchConsentJson) obj;
                if (!C7384Etj.areEqual(this.bullets, connectorHatchConsentJson.bullets) || !C7384Etj.areEqual(this.footer_paragraphs, connectorHatchConsentJson.footer_paragraphs) || !C7384Etj.areEqual(this.callout_paragraphs, connectorHatchConsentJson.callout_paragraphs) || !C7384Etj.areEqual(this.callout_title, connectorHatchConsentJson.callout_title)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ConnectorHatchConsentJson copy$default(ConnectorHatchConsentJson connectorHatchConsentJson, List list, List list2, List list3, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = connectorHatchConsentJson.bullets;
        }
        if ((i & 2) != 0) {
            list2 = connectorHatchConsentJson.footer_paragraphs;
        }
        if ((i & 4) != 0) {
            list3 = connectorHatchConsentJson.callout_paragraphs;
        }
        if ((i & 8) != 0) {
            str = connectorHatchConsentJson.callout_title;
        }
        AnonymousClass005.A0x(list, list2, list3);
        return new ConnectorHatchConsentJson(list, list2, list3, str);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_skills_repo_repo(ConnectorHatchConsentJson connectorHatchConsentJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cG.A1L(connectorHatchConsentJson.bullets)) {
            c9j5.AAQ(connectorHatchConsentJson.bullets, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
        if (zAfR || !C3cG.A1L(connectorHatchConsentJson.footer_paragraphs)) {
            c9j5.AAQ(connectorHatchConsentJson.footer_paragraphs, C3cH.A15(f0cArr, 1), c9iZ, 1);
        }
        if (zAfR || !C3cG.A1L(connectorHatchConsentJson.callout_paragraphs)) {
            c9j5.AAQ(connectorHatchConsentJson.callout_paragraphs, C3cH.A15(f0cArr, 2), c9iZ, 2);
        }
        if (zAfR || connectorHatchConsentJson.callout_title != null) {
            c9j5.AAP(connectorHatchConsentJson.callout_title, C07779iq.A01, c9iZ, 3);
        }
    }

    public final List<ConnectorConsentBulletJson> component1() {
        return this.bullets;
    }

    public final List<String> component2() {
        return this.footer_paragraphs;
    }

    public final List<String> component3() {
        return this.callout_paragraphs;
    }

    public final String component4() {
        return this.callout_title;
    }

    public final List<ConnectorConsentBulletJson> getBullets() {
        return this.bullets;
    }

    public final List<String> getCallout_paragraphs() {
        return this.callout_paragraphs;
    }

    public final String getCallout_title() {
        return this.callout_title;
    }

    public final List<String> getFooter_paragraphs() {
        return this.footer_paragraphs;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.callout_paragraphs, AnonymousClass005.A0F(this.footer_paragraphs, AnonymousClass005.A0E(this.bullets))) + AnonymousClass006.A0G(this.callout_title);
    }

    public final Consent.HatchManaged toDomain() {
        List<ConnectorConsentBulletJson> list = this.bullets;
        ArrayList arrayListA0h = C3cG.A0h();
        for (ConnectorConsentBulletJson connectorConsentBulletJson : list) {
            AnonymousClass006.A1F(connectorConsentBulletJson.text, connectorConsentBulletJson, arrayListA0h);
        }
        ArrayList arrayListA0i = AnonymousClass003.A0i(arrayListA0h);
        Iterator it = arrayListA0h.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(((ConnectorConsentBulletJson) it.next()).toDomain());
        }
        List<String> list2 = this.callout_paragraphs;
        ArrayList arrayListA0h2 = C3cG.A0h();
        for (String str : list2) {
            AnonymousClass006.A1F(str, str, arrayListA0h2);
        }
        String str2 = null;
        if (arrayListA0i.isEmpty() && this.footer_paragraphs.isEmpty() && arrayListA0h2.isEmpty()) {
            return null;
        }
        AHH ahhA0C = AGI.A0C(arrayListA0i);
        AHH ahhA0C2 = AGI.A0C(this.footer_paragraphs);
        AHH ahhA0C3 = AGI.A0C(arrayListA0h2);
        String str3 = this.callout_title;
        if (str3 != null && !C7BY.A0j(str3)) {
            str2 = str3;
        }
        return new Consent.HatchManaged(ahhA0C, ahhA0C2, ahhA0C3, str2);
    }

    public ConnectorHatchConsentJson(List<ConnectorConsentBulletJson> list, List<String> list2, List<String> list3, String str) {
        AnonymousClass005.A0x(list, list2, list3);
        this.bullets = list;
        this.footer_paragraphs = list2;
        this.callout_paragraphs = list3;
        this.callout_title = str;
    }

    public final ConnectorHatchConsentJson copy(List<ConnectorConsentBulletJson> list, List<String> list2, List<String> list3, String str) {
        AnonymousClass005.A0x(list, list2, list3);
        return new ConnectorHatchConsentJson(list, list2, list3, str);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ConnectorHatchConsentJson(int i, List list, List list2, List list3, String str, C2hx c2hx) {
        this.bullets = (i & 1) == 0 ? C0881AGi.A00 : list;
        if ((i & 2) == 0) {
            this.footer_paragraphs = C0881AGi.A00;
        } else {
            this.footer_paragraphs = list2;
        }
        if ((i & 4) == 0) {
            this.callout_paragraphs = C0881AGi.A00;
        } else {
            this.callout_paragraphs = list3;
        }
        if ((i & 8) == 0) {
            this.callout_title = null;
        } else {
            this.callout_title = str;
        }
    }

    public /* synthetic */ ConnectorHatchConsentJson(List list, List list2, List list3, String str, int i, C06H c06h) {
        this(C3cI.A10(list, i), C3cI.A11(list2, i), C3cI.A12(list3, i), AnonymousClass006.A0u(i, str));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ConnectorHatchConsentJson() {
        C0881AGi c0881AGi = C0881AGi.A00;
        this(c0881AGi, c0881AGi, c0881AGi, null);
    }
}
