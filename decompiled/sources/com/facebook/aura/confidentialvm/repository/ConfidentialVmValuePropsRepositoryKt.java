package com.facebook.aura.confidentialvm.repository;

import X.AGI;
import X.AHD;
import X.AHI;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.C7384Etj;
import X.C7BY;
import X.FGI;
import android.net.Uri;
import com.facebook.aura.common.url.HatchUrl;
import com.facebook.aura.network.endpoint.AuraAnalyticsEndpointSelector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes4.dex */
public abstract class ConfidentialVmValuePropsRepositoryKt {
    public static final List<String> META_LINK_DOMAINS = Arrays.asList("meta.com", "meta.ai", HatchUrl.SHARE_DOMAIN, AuraAnalyticsEndpointSelector.DEFAULT_DOMAIN_SUFFIX);
    public static final String TAG = "ConfidentialVmValuePropsRepository";

    public static final boolean isLinkIn(ConfidentialVmValuePropEntityJson confidentialVmValuePropEntityJson, String str) {
        int i;
        int i2 = confidentialVmValuePropEntityJson.offset;
        return i2 >= 0 && (i = confidentialVmValuePropEntityJson.length) > 0 && i <= str.length() - i2 && isMetaHostedHttpsUrl(confidentialVmValuePropEntityJson.url);
    }

    public static final AHD<ConfidentialVmValuePropBullet> toBullets(List<ConfidentialVmValuePropBulletJson> list) {
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (ConfidentialVmValuePropBulletJson confidentialVmValuePropBulletJson : list) {
                if (C7BY.A0j(confidentialVmValuePropBulletJson.title) || C7BY.A0j(confidentialVmValuePropBulletJson.subtitle)) {
                    return AHI.A01;
                }
            }
        }
        ArrayList arrayListA0m = AnonymousClass002.A0m(list);
        for (ConfidentialVmValuePropBulletJson confidentialVmValuePropBulletJson2 : list) {
            String str = confidentialVmValuePropBulletJson2.title;
            String str2 = confidentialVmValuePropBulletJson2.subtitle;
            List<ConfidentialVmValuePropEntityJson> list2 = confidentialVmValuePropBulletJson2.subtitle_entities;
            ArrayList arrayListA0m2 = AnonymousClass002.A0m(list2);
            for (ConfidentialVmValuePropEntityJson confidentialVmValuePropEntityJson : list2) {
                arrayListA0m2.add(new ConfidentialVmValuePropLink(confidentialVmValuePropEntityJson.offset, confidentialVmValuePropEntityJson.length, confidentialVmValuePropEntityJson.url));
            }
            AHD ahdA07 = AGI.A07(arrayListA0m2);
            String str3 = confidentialVmValuePropBulletJson2.icon;
            arrayListA0m.add(new ConfidentialVmValuePropBullet(str, str2, ahdA07, "speechBubble".equals(str3) ? ConfidentialVmValuePropIcon.SPEECH_BUBBLE : "fourDots".equals(str3) ? ConfidentialVmValuePropIcon.FOUR_DOTS : ConfidentialVmValuePropIcon.INFO));
        }
        return AGI.A07(arrayListA0m);
    }

    public static final ConfidentialVmDataMigrationCopy toDataMigrationCopy(ConfidentialVmDataMigrationStepJson confidentialVmDataMigrationStepJson) {
        String strNonBlank = nonBlank(confidentialVmDataMigrationStepJson.title);
        String strNonBlank2 = nonBlank(confidentialVmDataMigrationStepJson.subtitle);
        ConfidentialVmDataMigrationKeepOptionJson confidentialVmDataMigrationKeepOptionJson = confidentialVmDataMigrationStepJson.keep_option;
        ConfidentialVmDataMigrationKeepOption keepOption = confidentialVmDataMigrationKeepOptionJson != null ? toKeepOption(confidentialVmDataMigrationKeepOptionJson) : null;
        ConfidentialVmDataMigrationDeleteOptionJson confidentialVmDataMigrationDeleteOptionJson = confidentialVmDataMigrationStepJson.delete_option;
        return new ConfidentialVmDataMigrationCopy(strNonBlank, strNonBlank2, keepOption, confidentialVmDataMigrationDeleteOptionJson != null ? toDeleteOption(confidentialVmDataMigrationDeleteOptionJson) : null, nonBlank(confidentialVmDataMigrationStepJson.primary_button_text), nonBlank(confidentialVmDataMigrationStepJson.secondary_button_text));
    }

    public static final ConfidentialVmDataMigrationDeleteOption toDeleteOption(ConfidentialVmDataMigrationDeleteOptionJson confidentialVmDataMigrationDeleteOptionJson) {
        return new ConfidentialVmDataMigrationDeleteOption(nonBlank(confidentialVmDataMigrationDeleteOptionJson.title), nonBlank(confidentialVmDataMigrationDeleteOptionJson.body));
    }

    public static final ConfidentialVmDataMigrationKeepOption toKeepOption(ConfidentialVmDataMigrationKeepOptionJson confidentialVmDataMigrationKeepOptionJson) {
        ConfidentialVmValuePropEntityJson next;
        String strNonBlank = nonBlank(confidentialVmDataMigrationKeepOptionJson.body);
        ConfidentialVmDisclosure confidentialVmDisclosure = null;
        if (strNonBlank != null) {
            Iterator<ConfidentialVmValuePropEntityJson> it = confidentialVmDataMigrationKeepOptionJson.body_entities.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (isLinkIn(next, strNonBlank)) {
                    break;
                }
            }
            ConfidentialVmValuePropEntityJson confidentialVmValuePropEntityJson = next;
            if (confidentialVmValuePropEntityJson != null) {
                confidentialVmDisclosure = new ConfidentialVmDisclosure(strNonBlank, AGI.A0E(new ConfidentialVmValuePropLink(confidentialVmValuePropEntityJson.offset, confidentialVmValuePropEntityJson.length, AnonymousClass002.A0l(confidentialVmValuePropEntityJson.url))));
            }
        }
        return new ConfidentialVmDataMigrationKeepOption(nonBlank(confidentialVmDataMigrationKeepOptionJson.title), confidentialVmDisclosure, nonBlank(confidentialVmDataMigrationKeepOptionJson.footnote));
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0095 A[PHI: r11
  0x0095: PHI (r11v1 com.facebook.aura.confidentialvm.repository.ConfidentialVmDataMigrationCopy) = 
  (r11v0 com.facebook.aura.confidentialvm.repository.ConfidentialVmDataMigrationCopy)
  (r11v3 com.facebook.aura.confidentialvm.repository.ConfidentialVmDataMigrationCopy)
 binds: [B:57:0x0092, B:44:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.confidentialvm.repository.ConfidentialVmValueProps toValueProps(com.facebook.aura.confidentialvm.repository.ConfidentialVmValuePropsJson r12) {
        /*
            java.util.List<com.facebook.aura.confidentialvm.repository.ConfidentialVmValuePropBulletJson> r0 = r12.bullets
            X.AHD r5 = toBullets(r0)
            com.facebook.aura.confidentialvm.repository.ConfidentialVmDisclosure r10 = com.facebook.aura.confidentialvm.repository.ConfidentialVmValuePropsJsonKt.toDisclosure(r12)
            com.facebook.aura.confidentialvm.repository.ConfidentialVmValuePropsVariantsJson r0 = r12.variants
            r4 = 0
            if (r0 == 0) goto L46
            com.facebook.aura.confidentialvm.repository.ConfidentialVmValuePropsVariantJson r0 = r0.waitlist
            if (r0 == 0) goto L46
            com.facebook.aura.confidentialvm.repository.ConfidentialVmValuePropsVariant r6 = toVariant(r0)
        L17:
            com.facebook.aura.confidentialvm.repository.ConfidentialVmValuePropsVariantsJson r0 = r12.variants
            if (r0 == 0) goto L44
            com.facebook.aura.confidentialvm.repository.ConfidentialVmValuePropsVariantJson r0 = r0.try_it
            if (r0 == 0) goto L44
            com.facebook.aura.confidentialvm.repository.ConfidentialVmValuePropsVariant r7 = toVariant(r0)
        L23:
            com.facebook.aura.confidentialvm.repository.ConfidentialVmValuePropsVariantsJson r0 = r12.variants
            if (r0 == 0) goto L42
            com.facebook.aura.confidentialvm.repository.ConfidentialVmValuePropsVariantJson r0 = r0.subscribe
            if (r0 == 0) goto L42
            com.facebook.aura.confidentialvm.repository.ConfidentialVmValuePropsVariant r8 = toVariant(r0)
        L2f:
            com.facebook.aura.confidentialvm.repository.ConfidentialVmValuePropsVariantsJson r0 = r12.variants
            if (r0 == 0) goto L40
            com.facebook.aura.confidentialvm.repository.ConfidentialVmValuePropsVariantJson r0 = r0.f19switch
            if (r0 == 0) goto L40
            com.facebook.aura.confidentialvm.repository.ConfidentialVmValuePropsVariant r9 = toVariant(r0)
        L3b:
            kotlinx.serialization.json.JsonElement r2 = r12.data_migration
            if (r2 == 0) goto L67
            goto L48
        L40:
            r9 = r4
            goto L3b
        L42:
            r8 = r4
            goto L2f
        L44:
            r7 = r4
            goto L23
        L46:
            r6 = r4
            goto L17
        L48:
            X.9sU r1 = com.facebook.aura.json.HatchJsonKt.HatchJson     // Catch: java.lang.Throwable -> L51
            com.facebook.aura.confidentialvm.repository.ConfidentialVmDataMigrationJson$$serializer r0 = com.facebook.aura.confidentialvm.repository.ConfidentialVmDataMigrationJson$$serializer.INSTANCE     // Catch: java.lang.Throwable -> L51
            java.lang.Object r3 = X.C3cI.A0T(r0, r1, r2)     // Catch: java.lang.Throwable -> L51
            goto L56
        L51:
            r0 = move-exception
            X.Hud r3 = X.C3cG.A0s(r0)
        L56:
            java.lang.Throwable r2 = X.HsJ.A00(r3)
            if (r2 == 0) goto L63
            java.lang.String r1 = "ConfidentialVmValuePropsRepository"
            java.lang.String r0 = "toValueProps: ignoring malformed data_migration"
            X.CFK.A0K(r1, r2, r0)
        L63:
            boolean r0 = r3 instanceof X.C10571Hud
            if (r0 == 0) goto L68
        L67:
            r3 = r4
        L68:
            com.facebook.aura.confidentialvm.repository.ConfidentialVmDataMigrationJson r3 = (com.facebook.aura.confidentialvm.repository.ConfidentialVmDataMigrationJson) r3
            if (r3 == 0) goto L91
            com.facebook.aura.confidentialvm.repository.ConfidentialVmDataMigrationStepJson r0 = r3.confidential_vm
            if (r0 == 0) goto L91
            com.facebook.aura.confidentialvm.repository.ConfidentialVmDataMigrationCopy r11 = toDataMigrationCopy(r0)
        L74:
            com.facebook.aura.confidentialvm.repository.ConfidentialVmDataMigrationStepJson r0 = r3.secure_vm
            if (r0 == 0) goto L95
            com.facebook.aura.confidentialvm.repository.ConfidentialVmDataMigrationCopy r12 = toDataMigrationCopy(r0)
        L7c:
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L97
            if (r6 != 0) goto L97
            if (r7 != 0) goto L97
            if (r8 != 0) goto L97
            if (r9 != 0) goto L97
            if (r10 != 0) goto L97
            if (r11 != 0) goto L97
            if (r12 != 0) goto L97
            return r4
        L91:
            r11 = r4
            if (r3 == 0) goto L95
            goto L74
        L95:
            r12 = r4
            goto L7c
        L97:
            com.facebook.aura.confidentialvm.repository.ConfidentialVmValueProps r4 = new com.facebook.aura.confidentialvm.repository.ConfidentialVmValueProps
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.confidentialvm.repository.ConfidentialVmValuePropsRepositoryKt.toValueProps(com.facebook.aura.confidentialvm.repository.ConfidentialVmValuePropsJson):com.facebook.aura.confidentialvm.repository.ConfidentialVmValueProps");
    }

    public static final ConfidentialVmValuePropsVariant toVariant(ConfidentialVmValuePropsVariantJson confidentialVmValuePropsVariantJson) {
        if (C7BY.A0j(confidentialVmValuePropsVariantJson.title) || C7BY.A0j(confidentialVmValuePropsVariantJson.primary_button_text)) {
            return null;
        }
        String str = confidentialVmValuePropsVariantJson.title;
        String str2 = confidentialVmValuePropsVariantJson.subtitle;
        if (str2 == null || C7BY.A0j(str2)) {
            str2 = null;
        }
        String str3 = confidentialVmValuePropsVariantJson.primary_button_text;
        String str4 = confidentialVmValuePropsVariantJson.secondary_button_text;
        if (str4 == null || C7BY.A0j(str4)) {
            str4 = null;
        }
        String str5 = confidentialVmValuePropsVariantJson.banner_text;
        if (str5 == null || C7BY.A0j(str5)) {
            str5 = null;
        }
        String str6 = confidentialVmValuePropsVariantJson.joined_button_text;
        if (str6 == null || C7BY.A0j(str6)) {
            str6 = null;
        }
        return new ConfidentialVmValuePropsVariant(str, str2, str3, str4, str5, str6);
    }

    public static final boolean isMetaHostedHttpsUrl(String str) {
        Uri uri = Uri.parse(AnonymousClass002.A0l(str));
        String host = uri.getHost();
        if (host != null) {
            Locale locale = Locale.US;
            C7384Etj.A0V(locale);
            String lowerCase = host.toLowerCase(locale);
            String scheme = uri.getScheme();
            if (scheme != null && scheme.equalsIgnoreCase("https") && (uri.getPort() == -1 || uri.getPort() == 443)) {
                List<String> list = META_LINK_DOMAINS;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<String> it = list.iterator();
                    while (it.hasNext()) {
                        String strA0j = AnonymousClass005.A0j(it);
                        if (lowerCase.equals(strA0j) || lowerCase.endsWith(FGI.A0M(".", strA0j))) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final String nonBlank(String str) {
        if (C7BY.A0j(str)) {
            return null;
        }
        return str;
    }
}
