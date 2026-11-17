package com.facebook.aura.status.repo;

import X.C7BY;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;

/* loaded from: classes2.dex */
public abstract class TasksJsonKt {
    public static final String normalizeOptionalText(String str) {
        if (str == null || C7BY.A0j(str) || str.equalsIgnoreCase(HatchCcvLoggingKt.NO_POSTAL_FIELD)) {
            return null;
        }
        return str;
    }
}
