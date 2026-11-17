package com.facebook.aura.localbrowser;

import X.AnonymousClass002;
import X.C3cG;
import com.facebook.aura.localbrowser.core.BrowserEngineControl;

/* loaded from: classes2.dex */
public abstract class LocalBrowserConnectionKt {

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LocalBrowserControl.values().length];
            try {
                AnonymousClass002.A13(LocalBrowserControl.AGENT, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(LocalBrowserControl.USER, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(LocalBrowserControl.STOPPED, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final BrowserEngineControl toEngineControl(LocalBrowserControl localBrowserControl) {
        int iOrdinal = localBrowserControl.ordinal();
        if (iOrdinal == 0) {
            return BrowserEngineControl.AUTOMATION;
        }
        if (iOrdinal == 1) {
            return BrowserEngineControl.HUMAN;
        }
        if (iOrdinal == 2) {
            return BrowserEngineControl.STOPPED;
        }
        throw C3cG.A0q();
    }
}
