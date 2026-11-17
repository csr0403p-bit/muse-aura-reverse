package com.facebook.aura.startup.entrypathinstrumentation;

import X.C06H;
import X.CAJ;
import com.facebook.aura.qpl.startup.HatchStartupQpl;

/* loaded from: classes5.dex */
public final class HatchEntryPathInstrumentation {
    public static final Companion Companion = new Companion();
    public static final CAJ instance = new CAJ(new HatchActivityStartReasonClassifier(), HatchStartupQpl.startupQpl.startupMarker);

    public final class Companion {
        public final CAJ getInstance() {
            return HatchEntryPathInstrumentation.instance;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }
}
