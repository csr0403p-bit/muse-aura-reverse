package com.facebook.aura.activation.repo;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C5b2;
import X.C7384Etj;
import com.facebook.aura.activation.data.HatchInviteState;
import com.facebook.graphql.enums.EnumHelper;
import java.util.Locale;

/* loaded from: classes4.dex */
public abstract class AuraActivationRepositoryJsonKt {
    public static final HatchInviteState toInviteStateOrNull(String str) {
        if (str == null) {
            return null;
        }
        String strA0u = AnonymousClass001.A0u(str);
        int iHashCode = strA0u.hashCode();
        if (iHashCode == -1708376637) {
            if (strA0u.equals(AnonymousClass000.A00(50))) {
                return HatchInviteState.NOT_ELIGIBLE;
            }
            return null;
        }
        if (iHashCode == 100743639) {
            if (strA0u.equals("eligible")) {
                return HatchInviteState.ELIGIBLE;
            }
            return null;
        }
        if (iHashCode == 1514258249 && strA0u.equals("exhausted")) {
            return HatchInviteState.EXHAUSTED;
        }
        return null;
    }

    public static final C5b2 toWaitlistStatusOrNull(String str) {
        if (str != null) {
            String upperCase = str.toUpperCase(Locale.ROOT);
            C5b2 c5b2 = C5b2.A05;
            Enum enumA00 = EnumHelper.A00(upperCase, c5b2);
            C7384Etj.A0U(enumA00);
            C5b2 c5b22 = (C5b2) enumA00;
            if (c5b22 != null && c5b22 != c5b2) {
                return c5b22;
            }
        }
        return null;
    }
}
