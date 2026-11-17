package com.facebook.aura.login.nativeflow;

import X.AnonymousClass002;
import X.C7384Etj;
import X.C7BY;
import X.C9hr;
import X.C9sU;
import X.F0C;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.login.nativeflow.HatchReTosScreen;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class HatchReTosKt {
    public static final List<HatchDisclosurePresentation> RETOS_SUPPORTED_PRESENTATIONS = Arrays.asList(HatchDisclosurePresentation.DEDICATED_PROSE_SCREEN, HatchDisclosurePresentation.ITEMIZED_CONSENT_SCREEN);

    public static final HatchReTos parseReTos(String str) {
        C7384Etj.A0Y(str, 0);
        try {
            C9sU c9sU = HatchJsonKt.HatchJson;
            F0C<C9hr<Object>>[] f0cArr = ReTosJson.$childSerializers;
            return toReTos((ReTosJson) c9sU.A00(str, ReTosJson$$serializer.INSTANCE));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static final HatchReTos toReTos(ReTosJson reTosJson) {
        HatchTosDisclosure disclosure;
        HatchReTosScreen prose;
        C7384Etj.A0Y(reTosJson, 0);
        HatchDisclosurePresentation hatchDisclosurePresentationFromWire = HatchDisclosurePresentation.Companion.fromWire(reTosJson.disclosure_presentation);
        if (RETOS_SUPPORTED_PRESENTATIONS.contains(hatchDisclosurePresentationFromWire)) {
            boolean zA1Z = AnonymousClass002.A1Z(hatchDisclosurePresentationFromWire, HatchDisclosurePresentation.ITEMIZED_CONSENT_SCREEN);
            AuthTosJson authTosJson = reTosJson.tos;
            if (authTosJson != null && (disclosure = HatchAuthTosJsonKt.toDisclosure(authTosJson, zA1Z)) != null) {
                if (zA1Z) {
                    HatchItemizedConsent hatchItemizedConsentItemizedConsentFrom = HatchAuthTosJsonKt.itemizedConsentFrom(reTosJson.tos_consent_items, reTosJson.tos_consent_screen);
                    if (hatchItemizedConsentItemizedConsentFrom != null) {
                        prose = new HatchReTosScreen.Itemized(HatchItemizedConsent.copy$default(hatchItemizedConsentItemizedConsentFrom, null, null, null, null, null, null, null, 63, null));
                        return new HatchReTos(disclosure.contentVersion, prose);
                    }
                } else if (!C7BY.A0j(reTosJson.title) && !C7BY.A0j(reTosJson.confirm_label)) {
                    prose = new HatchReTosScreen.Prose(reTosJson.title, disclosure, reTosJson.confirm_label);
                    return new HatchReTos(disclosure.contentVersion, prose);
                }
            }
        }
        return null;
    }

    public static final List<HatchDisclosurePresentation> getRETOS_SUPPORTED_PRESENTATIONS() {
        return RETOS_SUPPORTED_PRESENTATIONS;
    }
}
