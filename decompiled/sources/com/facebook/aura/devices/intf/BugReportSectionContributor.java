package com.facebook.aura.devices.intf;

import X.AbstractC3358CGz;
import android.content.Context;
import java.io.File;

/* loaded from: classes3.dex */
public interface BugReportSectionContributor {
    File collectAttachment(Context context, AbstractC3358CGz abstractC3358CGz, File file);

    String summarySection(Context context, AbstractC3358CGz abstractC3358CGz);
}
