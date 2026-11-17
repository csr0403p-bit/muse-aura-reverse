package com.hatch.browser.core;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06H;
import X.C0KA;
import X.C3cH;
import X.C3cJ;
import X.C60O;
import X.C7384Etj;

/* loaded from: classes6.dex */
public final class BrowserCoreOptions implements Disposable {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public BrowserHostBlocklist blocklist;
    public boolean closedSelect;
    public BrowserHostDownloads downloads;
    public BrowserHostFiles files;
    public boolean nativeControlFill;
    public BrowserHostNativeControls nativeControls;
    public BrowserHostPageClose pageCloser;
    public BrowserHostPdf pdf;

    public BrowserCoreOptions() {
        this(false, false, null, null, null, null, null, null);
    }

    public static /* synthetic */ BrowserCoreOptions copy$default(BrowserCoreOptions browserCoreOptions, boolean z, boolean z2, BrowserHostNativeControls browserHostNativeControls, BrowserHostPageClose browserHostPageClose, BrowserHostPdf browserHostPdf, BrowserHostFiles browserHostFiles, BrowserHostDownloads browserHostDownloads, BrowserHostBlocklist browserHostBlocklist, int i, Object obj) {
        boolean z3 = z;
        boolean z4 = z2;
        BrowserHostNativeControls browserHostNativeControls2 = browserHostNativeControls;
        BrowserHostPageClose browserHostPageClose2 = browserHostPageClose;
        BrowserHostPdf browserHostPdf2 = browserHostPdf;
        BrowserHostFiles browserHostFiles2 = browserHostFiles;
        BrowserHostDownloads browserHostDownloads2 = browserHostDownloads;
        BrowserHostBlocklist browserHostBlocklist2 = browserHostBlocklist;
        if ((i & 1) != 0) {
            z3 = browserCoreOptions.closedSelect;
        }
        if ((i & 2) != 0) {
            z4 = browserCoreOptions.nativeControlFill;
        }
        if ((i & 4) != 0) {
            browserHostNativeControls2 = browserCoreOptions.nativeControls;
        }
        if ((i & 8) != 0) {
            browserHostPageClose2 = browserCoreOptions.pageCloser;
        }
        if ((i & 16) != 0) {
            browserHostPdf2 = browserCoreOptions.pdf;
        }
        if ((i & 32) != 0) {
            browserHostFiles2 = browserCoreOptions.files;
        }
        if ((i & 64) != 0) {
            browserHostDownloads2 = browserCoreOptions.downloads;
        }
        if ((i & 128) != 0) {
            browserHostBlocklist2 = browserCoreOptions.blocklist;
        }
        return new BrowserCoreOptions(z3, z4, browserHostNativeControls2, browserHostPageClose2, browserHostPdf2, browserHostFiles2, browserHostDownloads2, browserHostBlocklist2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BrowserCoreOptions) {
                BrowserCoreOptions browserCoreOptions = (BrowserCoreOptions) obj;
                if (this.closedSelect != browserCoreOptions.closedSelect || this.nativeControlFill != browserCoreOptions.nativeControlFill || !C7384Etj.areEqual(this.nativeControls, browserCoreOptions.nativeControls) || !C7384Etj.areEqual(this.pageCloser, browserCoreOptions.pageCloser) || !C7384Etj.areEqual(this.pdf, browserCoreOptions.pdf) || !C7384Etj.areEqual(this.files, browserCoreOptions.files) || !C7384Etj.areEqual(this.downloads, browserCoreOptions.downloads) || !C7384Etj.areEqual(this.blocklist, browserCoreOptions.blocklist)) {
                }
            }
            return false;
        }
        return true;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public final boolean component1() {
        return this.closedSelect;
    }

    public final boolean component2() {
        return this.nativeControlFill;
    }

    public final BrowserHostNativeControls component3() {
        return this.nativeControls;
    }

    public final BrowserHostPageClose component4() {
        return this.pageCloser;
    }

    public final BrowserHostPdf component5() {
        return this.pdf;
    }

    public final BrowserHostFiles component6() {
        return this.files;
    }

    public final BrowserHostDownloads component7() {
        return this.downloads;
    }

    public final BrowserHostBlocklist component8() {
        return this.blocklist;
    }

    public final BrowserCoreOptions copy(boolean z, boolean z2, BrowserHostNativeControls browserHostNativeControls, BrowserHostPageClose browserHostPageClose, BrowserHostPdf browserHostPdf, BrowserHostFiles browserHostFiles, BrowserHostDownloads browserHostDownloads, BrowserHostBlocklist browserHostBlocklist) {
        return new BrowserCoreOptions(z, z2, browserHostNativeControls, browserHostPageClose, browserHostPdf, browserHostFiles, browserHostDownloads, browserHostBlocklist);
    }

    @Override // com.hatch.browser.core.Disposable
    public void destroy() {
        Disposable.Companion.destroy(Boolean.valueOf(this.closedSelect), Boolean.valueOf(this.nativeControlFill), this.nativeControls, this.pageCloser, this.pdf, this.files, this.downloads, this.blocklist);
    }

    public final BrowserHostBlocklist getBlocklist() {
        return this.blocklist;
    }

    public final boolean getClosedSelect() {
        return this.closedSelect;
    }

    public final BrowserHostDownloads getDownloads() {
        return this.downloads;
    }

    public final BrowserHostFiles getFiles() {
        return this.files;
    }

    public final boolean getNativeControlFill() {
        return this.nativeControlFill;
    }

    public final BrowserHostNativeControls getNativeControls() {
        return this.nativeControls;
    }

    public final BrowserHostPageClose getPageCloser() {
        return this.pageCloser;
    }

    public final BrowserHostPdf getPdf() {
        return this.pdf;
    }

    public int hashCode() {
        return ((((((((((C0KA.A01(C0KA.A02(this.closedSelect), this.nativeControlFill) + AnonymousClass006.A0D(this.nativeControls)) * 31) + AnonymousClass006.A0D(this.pageCloser)) * 31) + AnonymousClass006.A0D(this.pdf)) * 31) + AnonymousClass006.A0D(this.files)) * 31) + AnonymousClass006.A0D(this.downloads)) * 31) + C3cH.A02(this.blocklist);
    }

    public final void setBlocklist(BrowserHostBlocklist browserHostBlocklist) {
        this.blocklist = browserHostBlocklist;
    }

    public final void setClosedSelect(boolean z) {
        this.closedSelect = z;
    }

    public final void setDownloads(BrowserHostDownloads browserHostDownloads) {
        this.downloads = browserHostDownloads;
    }

    public final void setFiles(BrowserHostFiles browserHostFiles) {
        this.files = browserHostFiles;
    }

    public final void setNativeControlFill(boolean z) {
        this.nativeControlFill = z;
    }

    public final void setNativeControls(BrowserHostNativeControls browserHostNativeControls) {
        this.nativeControls = browserHostNativeControls;
    }

    public final void setPageCloser(BrowserHostPageClose browserHostPageClose) {
        this.pageCloser = browserHostPageClose;
    }

    public final void setPdf(BrowserHostPdf browserHostPdf) {
        this.pdf = browserHostPdf;
    }

    public String toString() {
        boolean z = this.closedSelect;
        boolean z2 = this.nativeControlFill;
        BrowserHostNativeControls browserHostNativeControls = this.nativeControls;
        BrowserHostPageClose browserHostPageClose = this.pageCloser;
        BrowserHostPdf browserHostPdf = this.pdf;
        BrowserHostFiles browserHostFiles = this.files;
        BrowserHostDownloads browserHostDownloads = this.downloads;
        BrowserHostBlocklist browserHostBlocklist = this.blocklist;
        StringBuilder sbA10 = C60O.A10("BrowserCoreOptions(closedSelect=", z);
        sbA10.append(", nativeControlFill=");
        sbA10.append(z2);
        sbA10.append(", nativeControls=");
        sbA10.append(browserHostNativeControls);
        sbA10.append(", pageCloser=");
        sbA10.append(browserHostPageClose);
        sbA10.append(", pdf=");
        sbA10.append(browserHostPdf);
        sbA10.append(", files=");
        sbA10.append(browserHostFiles);
        sbA10.append(", downloads=");
        sbA10.append(browserHostDownloads);
        return C3cJ.A0L(browserHostBlocklist, ", blocklist=", sbA10);
    }

    public /* synthetic */ BrowserCoreOptions(boolean z, boolean z2, BrowserHostNativeControls browserHostNativeControls, BrowserHostPageClose browserHostPageClose, BrowserHostPdf browserHostPdf, BrowserHostFiles browserHostFiles, BrowserHostDownloads browserHostDownloads, BrowserHostBlocklist browserHostBlocklist, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z), AnonymousClass001.A1Q(i, z2), (i & 4) != 0 ? null : browserHostNativeControls, (i & 8) != 0 ? null : browserHostPageClose, (i & 16) != 0 ? null : browserHostPdf, (i & 32) != 0 ? null : browserHostFiles, (i & 64) != 0 ? null : browserHostDownloads, (i & 128) != 0 ? null : browserHostBlocklist);
    }

    public BrowserCoreOptions(boolean z, boolean z2, BrowserHostNativeControls browserHostNativeControls, BrowserHostPageClose browserHostPageClose, BrowserHostPdf browserHostPdf, BrowserHostFiles browserHostFiles, BrowserHostDownloads browserHostDownloads, BrowserHostBlocklist browserHostBlocklist) {
        this.closedSelect = z;
        this.nativeControlFill = z2;
        this.nativeControls = browserHostNativeControls;
        this.pageCloser = browserHostPageClose;
        this.pdf = browserHostPdf;
        this.files = browserHostFiles;
        this.downloads = browserHostDownloads;
        this.blocklist = browserHostBlocklist;
    }
}
