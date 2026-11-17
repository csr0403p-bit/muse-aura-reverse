package com.facebook.aura.devices.link.ordering;

import X.AHG;
import X.AnonymousClass002;
import X.C0943AIw;
import X.C0944AIx;
import X.C7384Etj;
import X.Ey9;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes4.dex */
public abstract class HatchLinkOrderStateMachineKt {
    public static final AHG<HatchLinkOrderField> ADDRESS_FIELDS;
    public static final HatchLinkOrderInput EMPTY_INPUT = new HatchLinkOrderInput("", "", "", "", "", "", "", "", "");
    public static final int US_STATE_CODE_LENGTH = 2;

    public static final String normalizedUsStateCode(String str) {
        UsState next;
        C7384Etj.A0Y(str, 0);
        String strA0l = AnonymousClass002.A0l(str);
        int length = strA0l.length();
        if (length == 2) {
            int i = 0;
            while (Character.isLetter(strA0l.charAt(i))) {
                i++;
                if (i >= length) {
                    String upperCase = strA0l.toUpperCase(Locale.ROOT);
                    Ey9<UsState> entries = UsState.getEntries();
                    if (!(entries instanceof Collection) || !entries.isEmpty()) {
                        Iterator<UsState> it = entries.iterator();
                        while (it.hasNext()) {
                            if (upperCase.equals(it.next().getCode())) {
                                return upperCase;
                            }
                        }
                    }
                    return null;
                }
            }
        }
        Iterator<UsState> it2 = UsState.getEntries().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            String displayName = next.getDisplayName();
            if (displayName != null && displayName.equalsIgnoreCase(strA0l)) {
                break;
            }
        }
        UsState usState = next;
        if (usState != null) {
            return usState.getCode();
        }
        return null;
    }

    static {
        HatchLinkOrderField[] hatchLinkOrderFieldArr = {HatchLinkOrderField.STREET1, HatchLinkOrderField.STREET2, HatchLinkOrderField.CITY, HatchLinkOrderField.STATE, HatchLinkOrderField.POSTAL_CODE};
        C0943AIw c0943AIwA5T = C0943AIw.A03;
        List listAsList = Arrays.asList(hatchLinkOrderFieldArr);
        if (!listAsList.isEmpty()) {
            C0944AIx c0944AIx = new C0944AIx(c0943AIwA5T);
            c0944AIx.addAll(listAsList);
            c0943AIwA5T = c0944AIx.A5T();
        }
        ADDRESS_FIELDS = c0943AIwA5T;
    }
}
