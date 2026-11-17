package com.facebook.aura.devices.pairing;

import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C7384Etj;
import com.facebook.aura.devices.intf.MuseGadgetNamesKt;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class HatchDeviceFamilyKt {
    public static final List<String> COMMUNITY_LINK_NAME_PREFIXES = Arrays.asList("MuseGadget", "Muse Gadget");

    public static final boolean matchesCommunityName(HatchDeviceFamily hatchDeviceFamily, String str) {
        boolean zA1a = AnonymousClass002.A1a(hatchDeviceFamily, str);
        if (hatchDeviceFamily != HatchDeviceFamily.HATCH_LINK || MuseGadgetNamesKt.museGadgetNamePrefix(str) == null) {
            return false;
        }
        return zA1a;
    }

    public static final boolean matchesDeviceName(HatchDeviceFamily hatchDeviceFamily, String str, boolean z, boolean z2) {
        boolean zA1a = AnonymousClass002.A1a(hatchDeviceFamily, str);
        List<String> namePrefixes = hatchDeviceFamily.getNamePrefixes();
        if (!(namePrefixes instanceof Collection) || !namePrefixes.isEmpty()) {
            Iterator<String> it = namePrefixes.iterator();
            while (it.hasNext()) {
                String strA0j = AnonymousClass005.A0j(it);
                C7384Etj.A0Y(strA0j, zA1a ? 1 : 0);
                if (str.startsWith(strA0j)) {
                    return zA1a;
                }
            }
        }
        if (z && hatchDeviceFamily == HatchDeviceFamily.HATCH_LINK && communityLinkPrefix(str, z2) != null) {
            return zA1a;
        }
        return false;
    }

    public static final boolean matchesTargetDeviceName(HatchDeviceFamily hatchDeviceFamily, String str, String str2, boolean z) {
        String strLinkDeviceIdentifier;
        String strLinkDeviceIdentifier2;
        boolean zA1Z = AnonymousClass005.A1Z(hatchDeviceFamily, str, str2);
        if (str.equals(str2)) {
            return zA1Z;
        }
        if (hatchDeviceFamily != HatchDeviceFamily.HATCH_LINK || (strLinkDeviceIdentifier = linkDeviceIdentifier(str, z)) == null || (strLinkDeviceIdentifier2 = linkDeviceIdentifier(str2, z)) == null) {
            return false;
        }
        return strLinkDeviceIdentifier.equalsIgnoreCase(strLinkDeviceIdentifier2);
    }

    public static final String communityLinkPrefix(String str, boolean z) {
        String next;
        if (z) {
            return MuseGadgetNamesKt.museGadgetNamePrefix(str);
        }
        Iterator<String> it = COMMUNITY_LINK_NAME_PREFIXES.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            String str2 = next;
            C7384Etj.A0Y(str, 0);
            C7384Etj.A0Y(str2, 1);
            if (AnonymousClass006.A1b(str2, str)) {
                break;
            }
        }
        return next;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033 A[PHI: r2
  0x0033: PHI (r2v3 java.lang.String) = (r2v2 java.lang.String), (r2v4 java.lang.String) binds: [B:8:0x0028, B:17:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String linkDeviceIdentifier(java.lang.String r6, boolean r7) {
        /*
            com.facebook.aura.devices.pairing.HatchDeviceFamily r0 = com.facebook.aura.devices.pairing.HatchDeviceFamily.HATCH_LINK
            java.util.List r0 = r0.getNamePrefixes()
            java.util.Iterator r5 = r0.iterator()
        La:
            boolean r0 = r5.hasNext()
            r4 = 0
            r3 = 0
            if (r0 == 0) goto L31
            java.lang.Object r2 = r5.next()
            r1 = r2
            java.lang.String r1 = (java.lang.String) r1
            X.C7384Etj.A0Y(r6, r4)
            r0 = 1
            X.C7384Etj.A0Y(r1, r0)
            boolean r0 = r6.startsWith(r1)
            if (r0 == 0) goto La
        L26:
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L33
            if (r7 == 0) goto L42
            java.lang.String r0 = com.facebook.aura.devices.intf.MuseGadgetNamesKt.museGadgetIdentifier(r6)
            return r0
        L31:
            r2 = r3
            goto L26
        L33:
            int r0 = r2.length()
            java.lang.String r1 = r6.substring(r0)
            int r0 = r1.length()
            if (r0 == 0) goto L48
            return r1
        L42:
            java.lang.String r2 = communityLinkPrefix(r6, r4)
            if (r2 != 0) goto L33
        L48:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.pairing.HatchDeviceFamilyKt.linkDeviceIdentifier(java.lang.String, boolean):java.lang.String");
    }

    public static /* synthetic */ boolean matchesDeviceName$default(HatchDeviceFamily hatchDeviceFamily, String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return matchesDeviceName(hatchDeviceFamily, str, z, AnonymousClass005.A1O(i, z2));
    }
}
