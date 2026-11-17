package com.facebook.aura.ccv.nativeflow;

import X.AGI;
import X.AHD;
import X.C7BY;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class HatchCcvCountryOptionsSource {
    public static final HatchCcvCountryOptionsSource INSTANCE = new HatchCcvCountryOptionsSource();
    public static final String PAYMENT_ADDRESS_FORM_DEFAULT_COUNTRY = "default";
    public static final String PAYMENT_ADDRESS_FORM_ZIP_FIELD_ID = "zip";

    /* JADX WARN: Removed duplicated region for block: B:42:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.ccv.nativeflow.HatchCcvCountryOptions countryOptions(com.facebook.aura.ccv.nativeflow.HatchAddressFormFieldsConfigJson r8) {
        /*
            r7 = this;
            r4 = 0
            if (r8 != 0) goto L4
            return r4
        L4:
            java.util.List<com.facebook.aura.ccv.nativeflow.HatchCountryFormFieldsJson> r0 = r8.country_to_fields
            java.util.ArrayList r5 = X.C3cG.A0h()
            java.util.Iterator r3 = r0.iterator()
        Le:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2e
            java.lang.Object r2 = r3.next()
            com.facebook.aura.ccv.nativeflow.HatchCountryFormFieldsJson r2 = (com.facebook.aura.ccv.nativeflow.HatchCountryFormFieldsJson) r2
            java.lang.String r1 = r2.country_code
            if (r1 == 0) goto Le
            boolean r0 = X.C7BY.A0j(r1)
            if (r0 != 0) goto Le
            com.facebook.aura.ccv.nativeflow.HatchCcvCountryOptionsSource r0 = com.facebook.aura.ccv.nativeflow.HatchCcvCountryOptionsSource.INSTANCE
            com.facebook.aura.ccv.nativeflow.HatchCcvPostalFieldConfig r0 = r0.postalField(r2)
            X.AnonymousClass002.A1J(r1, r0, r5)
            goto Le
        L2e:
            java.util.Map r5 = X.AGH.A06(r5)
            java.util.List<com.facebook.aura.ccv.nativeflow.HatchCountryOptionJson> r0 = r8.supported_countries
            java.util.ArrayList r7 = X.C3cG.A0h()
            java.util.Iterator r6 = r0.iterator()
        L3c:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L75
            java.lang.Object r1 = r6.next()
            com.facebook.aura.ccv.nativeflow.HatchCountryOptionJson r1 = (com.facebook.aura.ccv.nativeflow.HatchCountryOptionJson) r1
            java.lang.String r3 = r1.value
            if (r3 == 0) goto L3c
            boolean r0 = X.C7BY.A0j(r3)
            if (r0 != 0) goto L3c
            java.lang.String r0 = "default"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L3c
            java.lang.Object r2 = r5.get(r3)
            com.facebook.aura.ccv.nativeflow.HatchCcvPostalFieldConfig r2 = (com.facebook.aura.ccv.nativeflow.HatchCcvPostalFieldConfig) r2
            java.lang.String r1 = r1.label
            if (r1 == 0) goto L73
            boolean r0 = X.C7BY.A0j(r1)
            if (r0 != 0) goto L73
        L6a:
            com.facebook.aura.ccv.nativeflow.HatchCcvCountryConfig r0 = new com.facebook.aura.ccv.nativeflow.HatchCcvCountryConfig
            r0.<init>(r3, r2, r1)
            r7.add(r0)
            goto L3c
        L73:
            r1 = r4
            goto L6a
        L75:
            X.AHD r2 = X.AGI.A07(r7)
            java.lang.String r3 = r8.default_country
            if (r3 == 0) goto Ld9
            boolean r0 = X.C7BY.A0j(r3)
            if (r0 != 0) goto Ld9
        L83:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Ld6
            if (r3 == 0) goto La8
            java.lang.Object r1 = r5.get(r3)
            com.facebook.aura.ccv.nativeflow.HatchCcvPostalFieldConfig r1 = (com.facebook.aura.ccv.nativeflow.HatchCcvPostalFieldConfig) r1
            com.facebook.aura.ccv.nativeflow.HatchCcvCountryConfig r0 = new com.facebook.aura.ccv.nativeflow.HatchCcvCountryConfig
            r0.<init>(r3, r1, r4)
            com.facebook.aura.ccv.nativeflow.HatchCcvCountryConfig[] r0 = new com.facebook.aura.ccv.nativeflow.HatchCcvCountryConfig[]{r0}
            X.AHH r2 = X.AGI.A0E(r0)
        L9e:
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 == 0) goto Lbd
            boolean r0 = X.C3cG.A1N(r2)
            if (r0 == 0) goto Lbd
        La8:
            java.lang.Object r0 = X.AbstractC0878AGe.A0G(r2)
            com.facebook.aura.ccv.nativeflow.HatchCcvCountryConfig r0 = (com.facebook.aura.ccv.nativeflow.HatchCcvCountryConfig) r0
            if (r0 == 0) goto Lba
            java.lang.String r3 = r0.country
        Lb2:
            boolean r1 = r8.should_only_allow_default_country
            com.facebook.aura.ccv.nativeflow.HatchCcvCountryOptions r0 = new com.facebook.aura.ccv.nativeflow.HatchCcvCountryOptions
            r0.<init>(r3, r2, r1)
            return r0
        Lba:
            java.lang.String r3 = "US"
            goto Lb2
        Lbd:
            java.util.Iterator r1 = r2.iterator()
        Lc1:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto La8
            java.lang.Object r0 = r1.next()
            com.facebook.aura.ccv.nativeflow.HatchCcvCountryConfig r0 = (com.facebook.aura.ccv.nativeflow.HatchCcvCountryConfig) r0
            java.lang.String r0 = r0.country
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lc1
            goto Lb2
        Ld6:
            if (r3 == 0) goto La8
            goto L9e
        Ld9:
            r3 = r4
            goto L83
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ccv.nativeflow.HatchCcvCountryOptionsSource.countryOptions(com.facebook.aura.ccv.nativeflow.HatchAddressFormFieldsConfigJson):com.facebook.aura.ccv.nativeflow.HatchCcvCountryOptions");
    }

    private final HatchCcvPostalFieldConfig postalField(HatchCountryFormFieldsJson hatchCountryFormFieldsJson) {
        HatchAddressFormFieldJson next;
        Iterator<HatchAddressFormFieldJson> it = hatchCountryFormFieldsJson.form_fields.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if ("zip".equals(next.field_id)) {
                break;
            }
        }
        HatchAddressFormFieldJson hatchAddressFormFieldJson = next;
        if (hatchAddressFormFieldJson == null) {
            return null;
        }
        AHD ahdA07 = AGI.A07(HatchCardValidationKt.toPostalRules(hatchAddressFormFieldJson.validation_rules));
        HatchPostalKeyboardType hatchPostalKeyboardTypeFromWire = HatchPostalKeyboardType.Companion.fromWire(hatchAddressFormFieldJson.value_type);
        String str = hatchAddressFormFieldJson.label;
        if (str == null || C7BY.A0j(str)) {
            str = null;
        }
        String str2 = hatchAddressFormFieldJson.placeholder;
        if (str2 == null || C7BY.A0j(str2)) {
            str2 = null;
        }
        return new HatchCcvPostalFieldConfig(ahdA07, hatchPostalKeyboardTypeFromWire, str, str2, hatchAddressFormFieldJson.is_optional);
    }
}
