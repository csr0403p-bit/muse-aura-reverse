package com.facebook.aura.devices.intf;

import X.AnonymousClass006;
import X.C7384Etj;
import X.C7BY;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class MuseGadgetNamesKt {
    public static final List<String> MUSE_GADGET_NAME_PREFIXES = Arrays.asList("MuseGadget", "Muse Gadget", "MG-");

    public static final String museGadgetIdentifier(String str) {
        C7384Etj.A0Y(str, 0);
        String strMuseGadgetNamePrefix = museGadgetNamePrefix(str);
        if (strMuseGadgetNamePrefix != null) {
            String strA0a = C7BY.A0a(str.substring(strMuseGadgetNamePrefix.length()), '-', ' ');
            if (strA0a.length() != 0) {
                return strA0a;
            }
        }
        return null;
    }

    public static final String museGadgetNamePrefix(String str) {
        String next;
        C7384Etj.A0Y(str, 0);
        Iterator<String> it = MUSE_GADGET_NAME_PREFIXES.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            String str2 = next;
            C7384Etj.A0Y(str2, 1);
            if (AnonymousClass006.A1b(str2, str)) {
                break;
            }
        }
        return next;
    }
}
