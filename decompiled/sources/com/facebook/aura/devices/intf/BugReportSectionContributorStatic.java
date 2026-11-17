package com.facebook.aura.devices.intf;

import X.AbstractC3358CGz;
import X.AnonymousClass801;
import android.content.Context;
import java.io.File;

/* loaded from: classes.dex */
public class BugReportSectionContributorStatic {
    public static int[] getKeys() {
        return new int[]{0, 1, 2};
    }

    public static File collectAttachment(int i, Context context, AbstractC3358CGz abstractC3358CGz, File file) {
        return AnonymousClass801.A0L(i, context, abstractC3358CGz, file);
    }

    public static String summarySection(int i, Context context, AbstractC3358CGz abstractC3358CGz) {
        return AnonymousClass801.A0N(i, context, abstractC3358CGz);
    }
}
