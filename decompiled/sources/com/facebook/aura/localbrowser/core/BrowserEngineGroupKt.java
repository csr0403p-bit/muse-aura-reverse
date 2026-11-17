package com.facebook.aura.localbrowser.core;

import X.AnonymousClass002;
import X.C3cG;
import com.hatch.browser.protocol.Availability;
import com.hatch.browser.protocol.PageAuthorityRevision;
import com.hatch.browser.protocol.PageAuthorityState;
import com.hatch.browser.protocol.PageStateChange;
import com.hatch.browser.protocol.TaskPageGroupControlState;

/* loaded from: classes6.dex */
public abstract class BrowserEngineGroupKt {

    /* loaded from: classes2.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BrowserEngineControl.values().length];
            try {
                AnonymousClass002.A13(BrowserEngineControl.AUTOMATION, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(BrowserEngineControl.HUMAN, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(BrowserEngineControl.STOPPED, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final PageStateChange pageStateChange(long j, boolean z) {
        return new PageStateChange(new PageAuthorityRevision(j), new PageAuthorityState.Alive(z ? Availability.AVAILABLE : Availability.UNAVAILABLE));
    }

    public static final TaskPageGroupControlState toTaskPageGroupControlState(BrowserEngineControl browserEngineControl) {
        int iOrdinal = browserEngineControl.ordinal();
        if (iOrdinal == 0) {
            return TaskPageGroupControlState.AUTOMATION;
        }
        if (iOrdinal == 1) {
            return TaskPageGroupControlState.HUMAN;
        }
        if (iOrdinal == 2) {
            return TaskPageGroupControlState.STOPPED;
        }
        throw C3cG.A0q();
    }
}
