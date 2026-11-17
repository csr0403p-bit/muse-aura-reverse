package com.facebook.aura.commands.calendar;

import X.AnonymousClass001;
import X.C7BY;

/* loaded from: classes3.dex */
public abstract class CalendarRepositoryKt {
    public static final long ONE_DAY_MS = 86400000;
    public static final long ONE_HOUR_MS = 3600000;
    public static final String TAG = "CalendarRepository";

    public static final String providerOf(String str) {
        String strA0u = AnonymousClass001.A0u(str);
        return strA0u.startsWith("com.google") ? "Google" : strA0u.startsWith("com.microsoft.office.outlook") ? "Outlook" : strA0u.startsWith("com.samsung") ? "Samsung" : C7BY.A0q(strA0u, "yahoo", false) ? "Yahoo" : (C7BY.A0q(strA0u, "exchange", false) || strA0u.equals("eas")) ? "Exchange" : (C7BY.A0q(strA0u, "icloud", false) || C7BY.A0q(strA0u, "apple", false)) ? "iCloud" : C7BY.A0q(strA0u, "fastmail", false) ? "Fastmail" : C7BY.A0q(strA0u, "proton", false) ? "Proton" : "Other";
    }
}
