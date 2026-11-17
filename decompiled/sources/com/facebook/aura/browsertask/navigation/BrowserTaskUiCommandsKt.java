package com.facebook.aura.browsertask.navigation;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass006;
import X.C3cG;
import X.C3cI;

/* loaded from: classes2.dex */
public abstract class BrowserTaskUiCommandsKt {
    public static final String TASK_ID_PARAM = "task_id";
    public static final String UI_NAVIGATE_BROWSER_TASK = "ui.navigate.browser_task";

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BrowserTaskAgentOpenFailure.values().length];
            try {
                AnonymousClass002.A13(BrowserTaskAgentOpenFailure.NOT_FOUND, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(BrowserTaskAgentOpenFailure.FINISHED, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(BrowserTaskAgentOpenFailure.NOT_STARTED, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(BrowserTaskAgentOpenFailure.PREVIEW_REVOKED, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(BrowserTaskAgentOpenFailure.NOT_OPENABLE, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(BrowserTaskAgentOpenFailure.BROWSER_GONE, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass006.A1G(BrowserTaskAgentOpenFailure.COVERED, iArr);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass006.A1H(BrowserTaskAgentOpenFailure.VIEWER_UNAVAILABLE, iArr);
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String message(BrowserTaskAgentOpenFailure browserTaskAgentOpenFailure, String str) {
        StringBuilder sbA0x;
        String str2;
        switch (browserTaskAgentOpenFailure.ordinal()) {
            case 0:
                sbA0x = C3cI.A0x("No open browser task ", str);
                str2 = " on this device. Get a current task_id from browser.windows list, or ask the user to tap the browser card.";
                break;
            case 1:
                sbA0x = C3cI.A0x("Browser task ", str);
                str2 = " has already ended, so there is no live browser to open. Ask the user to tap the browser card to see how it ended.";
                break;
            case 2:
                sbA0x = C3cI.A0x("Browser task ", str);
                str2 = " has not started its browser yet, so there is nothing to show. Try again once it is running, or ask the user to tap the browser card.";
                break;
            case 3:
                sbA0x = C3cI.A0x("The live view of browser task ", str);
                str2 = " is no longer available. Ask the user to tap the browser card.";
                break;
            case 4:
                sbA0x = C3cI.A0x("Browser task ", str);
                str2 = " runs in a browser this app can't show. Ask the user to check it where it runs.";
                break;
            case 5:
                sbA0x = C3cI.A0x("The browser for task ", str);
                str2 = " is no longer running on this device, so there is no live view to open. Ask the user to tap the browser card.";
                break;
            case 6:
                sbA0x = C3cI.A0x("Something is covering the app, such as the app lock, so browser task ", str);
                str2 = " was not opened. Ask the user to unlock or close it, then try again.";
                break;
            case 7:
                sbA0x = C3cI.A0x("The browser viewer could not be opened for task ", str);
                str2 = ". Ask the user to tap the browser card.";
                break;
            default:
                throw C3cG.A0q();
        }
        return AnonymousClass001.A0v(str2, sbA0x);
    }
}
