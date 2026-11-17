package com.facebook.aura.localbrowser.core;

import X.AnonymousClass005;
import X.BV4;
import X.C60O;
import com.hatch.browser.core.BrowserHostDownloads;
import com.hatch.browser.core.BrowserHostNativeControls;
import com.hatch.browser.core.BrowserHostPdf;
import com.hatch.browser.protocol.Availability;
import com.hatch.browser.protocol.BrowserTaskBinding;
import com.hatch.browser.protocol.NativePageIdentity;
import com.hatch.browser.protocol.PageAuthorityRevision;
import com.hatch.browser.protocol.PageAuthoritySnapshot;
import com.hatch.browser.protocol.TaskPageGroupControlRevision;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class BrowserEnginePageFacts {
    public static final int $stable = 8;
    public final BrowserPageCloser closer;
    public final AtomicReference<BrowserEngineGroupControl> control;
    public final BrowserHostDownloads downloads;
    public final BrowserPageFileSource fileSource;
    public final NativePageIdentity identity;
    public final Function0<Boolean> isCurrent;
    public final BrowserHostNativeControls nativeControls;
    public final BrowserHostPdf pdf;
    public final AtomicReference<BrowserEnginePageState> state;
    public final BrowserTaskBinding task;

    public final BrowserPageCloser getCloser() {
        return this.closer;
    }

    public final BrowserHostDownloads getDownloads() {
        return this.downloads;
    }

    public final BrowserPageFileSource getFileSource() {
        return this.fileSource;
    }

    public final NativePageIdentity getIdentity() {
        return this.identity;
    }

    public final BrowserHostNativeControls getNativeControls() {
        return this.nativeControls;
    }

    public final BrowserHostPdf getPdf() {
        return this.pdf;
    }

    public final BrowserTaskBinding getTask() {
        return this.task;
    }

    public final Function0<Boolean> isCurrent() {
        return this.isCurrent;
    }

    public final void publish(long j, boolean z) {
        this.state.set(new BrowserEnginePageState(j, z));
    }

    public final PageAuthoritySnapshot snapshot() {
        BrowserEngineGroupControl browserEngineGroupControl = this.control.get();
        BrowserEnginePageState browserEnginePageState = this.state.get();
        return new PageAuthoritySnapshot(this.task, this.identity, new TaskPageGroupControlRevision(browserEngineGroupControl.revision), new PageAuthorityRevision(browserEnginePageState.revision), browserEngineGroupControl.control, browserEnginePageState.available ? Availability.AVAILABLE : Availability.UNAVAILABLE);
    }

    public BrowserEnginePageFacts(BrowserTaskBinding browserTaskBinding, NativePageIdentity nativePageIdentity, BrowserPageCloser browserPageCloser, BrowserHostPdf browserHostPdf, BrowserPageFileSource browserPageFileSource, BrowserHostDownloads browserHostDownloads, BrowserHostNativeControls browserHostNativeControls, Function0<Boolean> function0, AtomicReference<BrowserEngineGroupControl> atomicReference, long j, boolean z) {
        AnonymousClass005.A0x(browserTaskBinding, nativePageIdentity, browserPageCloser);
        C60O.A1N(function0, 7, atomicReference);
        this.task = browserTaskBinding;
        this.identity = nativePageIdentity;
        this.closer = browserPageCloser;
        this.pdf = browserHostPdf;
        this.fileSource = browserPageFileSource;
        this.downloads = browserHostDownloads;
        this.nativeControls = browserHostNativeControls;
        this.isCurrent = function0;
        this.control = atomicReference;
        this.state = BV4.A16(new BrowserEnginePageState(j, z));
    }
}
