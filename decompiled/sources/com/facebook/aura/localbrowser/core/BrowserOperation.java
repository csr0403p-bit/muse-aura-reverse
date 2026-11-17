package com.facebook.aura.localbrowser.core;

import X.AnonymousClass002;
import X.C06H;
import com.hatch.browser.protocol.Command;
import com.hatch.browser.protocol.FailureContext;
import com.hatch.browser.protocol.ObserveOptions;
import com.hatch.browser.protocol.RenderFence;
import com.hatch.browser.protocol.ReportImageFormat;

/* loaded from: classes6.dex */
public final class BrowserOperation {
    public final Command command;
    public final ReportImageFormat imageFormat;
    public final ObserveOptions observeAfter;
    public static final Companion Companion = new Companion();
    public static final int $stable = ObserveOptions.$stable | Command.$stable;

    public final class Companion {
        public final BrowserOperation observe() {
            return new BrowserOperation(new Command.Observe(new ObserveOptions(false, RenderFence.BEST_EFFORT, null, null, null, false, false, null)), false, null, ReportImageFormat.JPEG);
        }

        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public BrowserOperation(Command command, boolean z, FailureContext failureContext, ReportImageFormat reportImageFormat) {
        AnonymousClass002.A1B(command, 0, reportImageFormat);
        this.command = command;
        this.imageFormat = reportImageFormat;
        this.observeAfter = z ? new ObserveOptions(false, RenderFence.BEST_EFFORT, failureContext, null, null, false, false, null) : null;
    }

    public final boolean getCapturesImage() {
        Command command = this.command;
        return (command instanceof Command.Capture) || (command instanceof Command.CaptureChallenge);
    }

    public final Command getCommand$fbandroid_express_aura_java_com_facebook_aura_localbrowser_core_core() {
        return this.command;
    }

    public final boolean getFillsNativeControl() {
        Command command = this.command;
        return (command instanceof Command.Fill) || (command instanceof Command.Select);
    }

    public final ReportImageFormat getImageFormat$fbandroid_express_aura_java_com_facebook_aura_localbrowser_core_core() {
        return this.imageFormat;
    }

    public final boolean getMayOpenNativePicker() {
        Command command = this.command;
        return (command instanceof Command.Click) || (command instanceof Command.Fill) || (command instanceof Command.Select) || (command instanceof Command.Press) || (command instanceof Command.ClickAt) || (command instanceof Command.FillAt);
    }

    public final ObserveOptions getObserveAfter$fbandroid_express_aura_java_com_facebook_aura_localbrowser_core_core() {
        return this.observeAfter;
    }

    public /* synthetic */ BrowserOperation(Command command, boolean z, FailureContext failureContext, ReportImageFormat reportImageFormat, int i, C06H c06h) {
        this(command, z, (i & 4) != 0 ? null : failureContext, (i & 8) != 0 ? ReportImageFormat.JPEG : reportImageFormat);
    }
}
