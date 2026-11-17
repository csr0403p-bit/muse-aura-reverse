package com.facebook.aura.productactions.impl;

import X.C60O;
import X.C60Q;
import X.C7384Etj;
import X.CFK;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import java.io.File;

/* loaded from: classes3.dex */
public final class PreparedProductShare implements AutoCloseable {
    public static final int $stable = 8;
    public boolean handedOff;
    public final Intent intent;
    public final File thumbnailFile;

    public PreparedProductShare(Intent intent, File file) {
        C7384Etj.A0Y(intent, 0);
        this.intent = intent;
        this.thumbnailFile = file;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        final File file;
        if (this.handedOff || (file = this.thumbnailFile) == null) {
            return;
        }
        C60O.A1D().execute(new Runnable() { // from class: com.facebook.aura.productactions.impl.PreparedProductShare$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                file.delete();
            }
        });
    }

    public final Intent getIntent() {
        return this.intent;
    }

    public final void launch(Context context) {
        C7384Etj.A0Y(context, 0);
        try {
            boolean zA05 = C60Q.A0S().A05(context, this.intent);
            this.handedOff = zA05;
            if (zA05) {
                return;
            }
            CFK.A06("ProductShare", "No activity could share the product link");
        } catch (ActivityNotFoundException e) {
            CFK.A0K("ProductShare", e, "No activity could share the product link");
        }
    }
}
