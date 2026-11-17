package com.hatch.browser.protocol;

import X.AnonymousClass005;
import X.C06H;
import X.C3cG;
import X.C3cJ;
import X.C7384Etj;

/* loaded from: classes6.dex */
public final class PageAuthoritySnapshot {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public Availability availability;
    public TaskPageGroupControlState control;
    public TaskPageGroupControlRevision groupControlRevision;
    public NativePageIdentity nativePage;
    public PageAuthorityRevision pageAuthorityRevision;
    public BrowserTaskBinding task;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PageAuthoritySnapshot) {
                PageAuthoritySnapshot pageAuthoritySnapshot = (PageAuthoritySnapshot) obj;
                if (!C7384Etj.areEqual(this.task, pageAuthoritySnapshot.task) || !C7384Etj.areEqual(this.nativePage, pageAuthoritySnapshot.nativePage) || !C7384Etj.areEqual(this.groupControlRevision, pageAuthoritySnapshot.groupControlRevision) || !C7384Etj.areEqual(this.pageAuthorityRevision, pageAuthoritySnapshot.pageAuthorityRevision) || this.control != pageAuthoritySnapshot.control || this.availability != pageAuthoritySnapshot.availability) {
                }
            }
            return false;
        }
        return true;
    }

    public final void setAvailability(Availability availability) {
        C7384Etj.A0Y(availability, 0);
        this.availability = availability;
    }

    public final void setControl(TaskPageGroupControlState taskPageGroupControlState) {
        C7384Etj.A0Y(taskPageGroupControlState, 0);
        this.control = taskPageGroupControlState;
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

    public static /* synthetic */ PageAuthoritySnapshot copy$default(PageAuthoritySnapshot pageAuthoritySnapshot, BrowserTaskBinding browserTaskBinding, NativePageIdentity nativePageIdentity, TaskPageGroupControlRevision taskPageGroupControlRevision, PageAuthorityRevision pageAuthorityRevision, TaskPageGroupControlState taskPageGroupControlState, Availability availability, int i, Object obj) {
        if ((i & 1) != 0) {
            browserTaskBinding = pageAuthoritySnapshot.task;
        }
        if ((i & 2) != 0) {
            nativePageIdentity = pageAuthoritySnapshot.nativePage;
        }
        if ((i & 4) != 0) {
            taskPageGroupControlRevision = pageAuthoritySnapshot.groupControlRevision;
        }
        if ((i & 8) != 0) {
            pageAuthorityRevision = pageAuthoritySnapshot.pageAuthorityRevision;
        }
        if ((i & 16) != 0) {
            taskPageGroupControlState = pageAuthoritySnapshot.control;
        }
        if ((i & 32) != 0) {
            availability = pageAuthoritySnapshot.availability;
        }
        return pageAuthoritySnapshot.copy(browserTaskBinding, nativePageIdentity, taskPageGroupControlRevision, pageAuthorityRevision, taskPageGroupControlState, availability);
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

    public final TaskPageGroupControlState component5() {
        return this.control;
    }

    public final Availability component6() {
        return this.availability;
    }

    public final Availability getAvailability() {
        return this.availability;
    }

    public final TaskPageGroupControlState getControl() {
        return this.control;
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
        return AnonymousClass005.A0G(this.availability, AnonymousClass005.A0F(this.control, AnonymousClass005.A0F(this.pageAuthorityRevision, AnonymousClass005.A0F(this.groupControlRevision, AnonymousClass005.A0F(this.nativePage, AnonymousClass005.A0E(this.task))))));
    }

    public String toString() {
        BrowserTaskBinding browserTaskBinding = this.task;
        NativePageIdentity nativePageIdentity = this.nativePage;
        TaskPageGroupControlRevision taskPageGroupControlRevision = this.groupControlRevision;
        PageAuthorityRevision pageAuthorityRevision = this.pageAuthorityRevision;
        TaskPageGroupControlState taskPageGroupControlState = this.control;
        Availability availability = this.availability;
        StringBuilder sbA0f = C3cG.A0f(browserTaskBinding, "PageAuthoritySnapshot(task=");
        sbA0f.append(", nativePage=");
        sbA0f.append(nativePageIdentity);
        sbA0f.append(", groupControlRevision=");
        sbA0f.append(taskPageGroupControlRevision);
        sbA0f.append(", pageAuthorityRevision=");
        sbA0f.append(pageAuthorityRevision);
        sbA0f.append(", control=");
        sbA0f.append(taskPageGroupControlState);
        return C3cJ.A0L(availability, ", availability=", sbA0f);
    }

    public PageAuthoritySnapshot(BrowserTaskBinding browserTaskBinding, NativePageIdentity nativePageIdentity, TaskPageGroupControlRevision taskPageGroupControlRevision, PageAuthorityRevision pageAuthorityRevision, TaskPageGroupControlState taskPageGroupControlState, Availability availability) {
        AnonymousClass005.A17(browserTaskBinding, nativePageIdentity, taskPageGroupControlRevision, pageAuthorityRevision, taskPageGroupControlState);
        C7384Etj.A0Y(availability, 5);
        this.task = browserTaskBinding;
        this.nativePage = nativePageIdentity;
        this.groupControlRevision = taskPageGroupControlRevision;
        this.pageAuthorityRevision = pageAuthorityRevision;
        this.control = taskPageGroupControlState;
        this.availability = availability;
    }

    public final PageAuthoritySnapshot copy(BrowserTaskBinding browserTaskBinding, NativePageIdentity nativePageIdentity, TaskPageGroupControlRevision taskPageGroupControlRevision, PageAuthorityRevision pageAuthorityRevision, TaskPageGroupControlState taskPageGroupControlState, Availability availability) {
        AnonymousClass005.A17(browserTaskBinding, nativePageIdentity, taskPageGroupControlRevision, pageAuthorityRevision, taskPageGroupControlState);
        C7384Etj.A0Y(availability, 5);
        return new PageAuthoritySnapshot(browserTaskBinding, nativePageIdentity, taskPageGroupControlRevision, pageAuthorityRevision, taskPageGroupControlState, availability);
    }
}
