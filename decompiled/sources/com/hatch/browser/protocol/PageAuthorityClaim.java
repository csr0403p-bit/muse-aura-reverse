package com.hatch.browser.protocol;

import X.AnonymousClass005;
import X.C06H;
import X.C3cG;
import X.C3cJ;
import X.C7384Etj;

/* loaded from: classes6.dex */
public final class PageAuthorityClaim {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public TaskPageGroupControlRevision groupControlRevision;
    public NativePageIdentity nativePage;
    public PageAuthorityRevision pageAuthorityRevision;
    public BrowserTaskBinding task;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PageAuthorityClaim) {
                PageAuthorityClaim pageAuthorityClaim = (PageAuthorityClaim) obj;
                if (!C7384Etj.areEqual(this.task, pageAuthorityClaim.task) || !C7384Etj.areEqual(this.nativePage, pageAuthorityClaim.nativePage) || !C7384Etj.areEqual(this.groupControlRevision, pageAuthorityClaim.groupControlRevision) || !C7384Etj.areEqual(this.pageAuthorityRevision, pageAuthorityClaim.pageAuthorityRevision)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void setGroupControlRevision(TaskPageGroupControlRevision taskPageGroupControlRevision) {
        C7384Etj.A0Y(taskPageGroupControlRevision, 0);
        this.groupControlRevision = taskPageGroupControlRevision;
    }

    public final void setNativePage(NativePageIdentity nativePageIdentity) {
        C7384Etj.A0Y(nativePageIdentity, 0);
        this.nativePage = nativePageIdentity;
    }

    public final void setPageAuthorityRevision(PageAuthorityRevision pageAuthorityRevision) {
        C7384Etj.A0Y(pageAuthorityRevision, 0);
        this.pageAuthorityRevision = pageAuthorityRevision;
    }

    public final void setTask(BrowserTaskBinding browserTaskBinding) {
        C7384Etj.A0Y(browserTaskBinding, 0);
        this.task = browserTaskBinding;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public static /* synthetic */ PageAuthorityClaim copy$default(PageAuthorityClaim pageAuthorityClaim, BrowserTaskBinding browserTaskBinding, NativePageIdentity nativePageIdentity, TaskPageGroupControlRevision taskPageGroupControlRevision, PageAuthorityRevision pageAuthorityRevision, int i, Object obj) {
        if ((i & 1) != 0) {
            browserTaskBinding = pageAuthorityClaim.task;
        }
        if ((i & 2) != 0) {
            nativePageIdentity = pageAuthorityClaim.nativePage;
        }
        if ((i & 4) != 0) {
            taskPageGroupControlRevision = pageAuthorityClaim.groupControlRevision;
        }
        if ((i & 8) != 0) {
            pageAuthorityRevision = pageAuthorityClaim.pageAuthorityRevision;
        }
        return pageAuthorityClaim.copy(browserTaskBinding, nativePageIdentity, taskPageGroupControlRevision, pageAuthorityRevision);
    }

    public final BrowserTaskBinding component1() {
        return this.task;
    }

    public final NativePageIdentity component2() {
        return this.nativePage;
    }

    public final TaskPageGroupControlRevision component3() {
        return this.groupControlRevision;
    }

    public final PageAuthorityRevision component4() {
        return this.pageAuthorityRevision;
    }

    public final TaskPageGroupControlRevision getGroupControlRevision() {
        return this.groupControlRevision;
    }

    public final NativePageIdentity getNativePage() {
        return this.nativePage;
    }

    public final PageAuthorityRevision getPageAuthorityRevision() {
        return this.pageAuthorityRevision;
    }

    public final BrowserTaskBinding getTask() {
        return this.task;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.pageAuthorityRevision, AnonymousClass005.A0F(this.groupControlRevision, AnonymousClass005.A0F(this.nativePage, AnonymousClass005.A0E(this.task))));
    }

    public String toString() {
        BrowserTaskBinding browserTaskBinding = this.task;
        NativePageIdentity nativePageIdentity = this.nativePage;
        TaskPageGroupControlRevision taskPageGroupControlRevision = this.groupControlRevision;
        PageAuthorityRevision pageAuthorityRevision = this.pageAuthorityRevision;
        StringBuilder sbA0f = C3cG.A0f(browserTaskBinding, "PageAuthorityClaim(task=");
        sbA0f.append(", nativePage=");
        sbA0f.append(nativePageIdentity);
        sbA0f.append(", groupControlRevision=");
        sbA0f.append(taskPageGroupControlRevision);
        return C3cJ.A0L(pageAuthorityRevision, ", pageAuthorityRevision=", sbA0f);
    }

    public PageAuthorityClaim(BrowserTaskBinding browserTaskBinding, NativePageIdentity nativePageIdentity, TaskPageGroupControlRevision taskPageGroupControlRevision, PageAuthorityRevision pageAuthorityRevision) {
        AnonymousClass005.A14(browserTaskBinding, nativePageIdentity, taskPageGroupControlRevision, pageAuthorityRevision);
        this.task = browserTaskBinding;
        this.nativePage = nativePageIdentity;
        this.groupControlRevision = taskPageGroupControlRevision;
        this.pageAuthorityRevision = pageAuthorityRevision;
    }

    public final PageAuthorityClaim copy(BrowserTaskBinding browserTaskBinding, NativePageIdentity nativePageIdentity, TaskPageGroupControlRevision taskPageGroupControlRevision, PageAuthorityRevision pageAuthorityRevision) {
        AnonymousClass005.A14(browserTaskBinding, nativePageIdentity, taskPageGroupControlRevision, pageAuthorityRevision);
        return new PageAuthorityClaim(browserTaskBinding, nativePageIdentity, taskPageGroupControlRevision, pageAuthorityRevision);
    }
}
