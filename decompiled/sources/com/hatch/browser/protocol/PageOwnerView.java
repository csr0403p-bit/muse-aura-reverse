package com.hatch.browser.protocol;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C7384Etj;
import X.HwO;
import java.util.List;

/* loaded from: classes6.dex */
public final class PageOwnerView {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public String browserContextId;
    public String browserInstanceId;
    public TaskPageGroupControlState control;
    public long controlRevision;
    public long generation;
    public List<? extends NativePageIdentity> ownedTargets;
    public List<? extends NativePageIdentity> readyTargets;
    public NativePageIdentity selectedTarget;
    public PageStorageMode storageMode;
    public BrowserTaskBinding task;

    public PageOwnerView(String str, long j, BrowserTaskBinding browserTaskBinding, PageStorageMode pageStorageMode, String str2, TaskPageGroupControlState taskPageGroupControlState, long j2, List<? extends NativePageIdentity> list, List<? extends NativePageIdentity> list2, NativePageIdentity nativePageIdentity) {
        AnonymousClass005.A11(str, browserTaskBinding, pageStorageMode, 0);
        AnonymousClass005.A13(taskPageGroupControlState, list, list2, 5);
        this.browserInstanceId = str;
        this.generation = j;
        this.task = browserTaskBinding;
        this.storageMode = pageStorageMode;
        this.browserContextId = str2;
        this.control = taskPageGroupControlState;
        this.controlRevision = j2;
        this.ownedTargets = list;
        this.readyTargets = list2;
        this.selectedTarget = nativePageIdentity;
    }

    /* renamed from: copy-IVcfG5w, reason: not valid java name */
    public final PageOwnerView m3666copyIVcfG5w(String str, long j, BrowserTaskBinding browserTaskBinding, PageStorageMode pageStorageMode, String str2, TaskPageGroupControlState taskPageGroupControlState, long j2, List<? extends NativePageIdentity> list, List<? extends NativePageIdentity> list2, NativePageIdentity nativePageIdentity) {
        AnonymousClass005.A11(str, browserTaskBinding, pageStorageMode, 0);
        AnonymousClass005.A13(taskPageGroupControlState, list, list2, 5);
        return new PageOwnerView(str, j, browserTaskBinding, pageStorageMode, str2, taskPageGroupControlState, j2, list, list2, nativePageIdentity);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PageOwnerView) {
                PageOwnerView pageOwnerView = (PageOwnerView) obj;
                if (!C7384Etj.areEqual(this.browserInstanceId, pageOwnerView.browserInstanceId) || this.generation != pageOwnerView.generation || !C7384Etj.areEqual(this.task, pageOwnerView.task) || this.storageMode != pageOwnerView.storageMode || !C7384Etj.areEqual(this.browserContextId, pageOwnerView.browserContextId) || this.control != pageOwnerView.control || this.controlRevision != pageOwnerView.controlRevision || !C7384Etj.areEqual(this.ownedTargets, pageOwnerView.ownedTargets) || !C7384Etj.areEqual(this.readyTargets, pageOwnerView.readyTargets) || !C7384Etj.areEqual(this.selectedTarget, pageOwnerView.selectedTarget)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void setBrowserInstanceId(String str) {
        C7384Etj.A0Y(str, 0);
        this.browserInstanceId = str;
    }

    public final void setControl(TaskPageGroupControlState taskPageGroupControlState) {
        C7384Etj.A0Y(taskPageGroupControlState, 0);
        this.control = taskPageGroupControlState;
    }

    public final void setOwnedTargets(List<? extends NativePageIdentity> list) {
        C7384Etj.A0Y(list, 0);
        this.ownedTargets = list;
    }

    public final void setReadyTargets(List<? extends NativePageIdentity> list) {
        C7384Etj.A0Y(list, 0);
        this.readyTargets = list;
    }

    public final void setStorageMode(PageStorageMode pageStorageMode) {
        C7384Etj.A0Y(pageStorageMode, 0);
        this.storageMode = pageStorageMode;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy-IVcfG5w$default, reason: not valid java name */
    public static /* synthetic */ PageOwnerView m3663copyIVcfG5w$default(PageOwnerView pageOwnerView, String str, long j, BrowserTaskBinding browserTaskBinding, PageStorageMode pageStorageMode, String str2, TaskPageGroupControlState taskPageGroupControlState, long j2, List list, List list2, NativePageIdentity nativePageIdentity, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pageOwnerView.browserInstanceId;
        }
        if ((i & 2) != 0) {
            j = pageOwnerView.generation;
        }
        if ((i & 4) != 0) {
            browserTaskBinding = pageOwnerView.task;
        }
        if ((i & 8) != 0) {
            pageStorageMode = pageOwnerView.storageMode;
        }
        if ((i & 16) != 0) {
            str2 = pageOwnerView.browserContextId;
        }
        if ((i & 32) != 0) {
            taskPageGroupControlState = pageOwnerView.control;
        }
        if ((i & 64) != 0) {
            j2 = pageOwnerView.controlRevision;
        }
        if ((i & 128) != 0) {
            list = pageOwnerView.ownedTargets;
        }
        if ((i & 256) != 0) {
            list2 = pageOwnerView.readyTargets;
        }
        if ((i & 512) != 0) {
            nativePageIdentity = pageOwnerView.selectedTarget;
        }
        return pageOwnerView.m3666copyIVcfG5w(str, j, browserTaskBinding, pageStorageMode, str2, taskPageGroupControlState, j2, list, list2, nativePageIdentity);
    }

    public final String component1() {
        return this.browserInstanceId;
    }

    public final NativePageIdentity component10() {
        return this.selectedTarget;
    }

    /* renamed from: component2-s-VKNKU, reason: not valid java name */
    public final long m3664component2sVKNKU() {
        return this.generation;
    }

    public final BrowserTaskBinding component3() {
        return this.task;
    }

    public final PageStorageMode component4() {
        return this.storageMode;
    }

    public final String component5() {
        return this.browserContextId;
    }

    public final TaskPageGroupControlState component6() {
        return this.control;
    }

    /* renamed from: component7-s-VKNKU, reason: not valid java name */
    public final long m3665component7sVKNKU() {
        return this.controlRevision;
    }

    public final List<NativePageIdentity> component8() {
        return this.ownedTargets;
    }

    public final List<NativePageIdentity> component9() {
        return this.readyTargets;
    }

    public final String getBrowserContextId() {
        return this.browserContextId;
    }

    public final String getBrowserInstanceId() {
        return this.browserInstanceId;
    }

    public final TaskPageGroupControlState getControl() {
        return this.control;
    }

    /* renamed from: getControlRevision-s-VKNKU, reason: not valid java name */
    public final long m3667getControlRevisionsVKNKU() {
        return this.controlRevision;
    }

    /* renamed from: getGeneration-s-VKNKU, reason: not valid java name */
    public final long m3668getGenerationsVKNKU() {
        return this.generation;
    }

    public final List<NativePageIdentity> getOwnedTargets() {
        return this.ownedTargets;
    }

    public final List<NativePageIdentity> getReadyTargets() {
        return this.readyTargets;
    }

    public final NativePageIdentity getSelectedTarget() {
        return this.selectedTarget;
    }

    public final PageStorageMode getStorageMode() {
        return this.storageMode;
    }

    public final BrowserTaskBinding getTask() {
        return this.task;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.readyTargets, AnonymousClass005.A0F(this.ownedTargets, AnonymousClass006.A06(this.controlRevision, AnonymousClass005.A0F(this.control, (AnonymousClass005.A0F(this.storageMode, AnonymousClass005.A0F(this.task, AnonymousClass006.A06(this.generation, AnonymousClass001.A0G(this.browserInstanceId)))) + AnonymousClass006.A0G(this.browserContextId)) * 31)))) + C3cH.A02(this.selectedTarget);
    }

    public final void setBrowserContextId(String str) {
        this.browserContextId = str;
    }

    /* renamed from: setControlRevision-VKZWuLQ, reason: not valid java name */
    public final void m3669setControlRevisionVKZWuLQ(long j) {
        this.controlRevision = j;
    }

    /* renamed from: setGeneration-VKZWuLQ, reason: not valid java name */
    public final void m3670setGenerationVKZWuLQ(long j) {
        this.generation = j;
    }

    public final void setSelectedTarget(NativePageIdentity nativePageIdentity) {
        this.selectedTarget = nativePageIdentity;
    }

    public String toString() {
        String str = this.browserInstanceId;
        String strA01 = HwO.A01(this.generation, 10);
        BrowserTaskBinding browserTaskBinding = this.task;
        PageStorageMode pageStorageMode = this.storageMode;
        String str2 = this.browserContextId;
        TaskPageGroupControlState taskPageGroupControlState = this.control;
        String strA012 = HwO.A01(this.controlRevision, 10);
        List<? extends NativePageIdentity> list = this.ownedTargets;
        List<? extends NativePageIdentity> list2 = this.readyTargets;
        NativePageIdentity nativePageIdentity = this.selectedTarget;
        StringBuilder sbA0x = C3cI.A0x("PageOwnerView(browserInstanceId=", str);
        sbA0x.append(", generation=");
        sbA0x.append(strA01);
        sbA0x.append(", task=");
        sbA0x.append(browserTaskBinding);
        sbA0x.append(", storageMode=");
        sbA0x.append(pageStorageMode);
        sbA0x.append(", browserContextId=");
        sbA0x.append(str2);
        sbA0x.append(", control=");
        sbA0x.append(taskPageGroupControlState);
        sbA0x.append(", controlRevision=");
        sbA0x.append(strA012);
        sbA0x.append(", ownedTargets=");
        sbA0x.append(list);
        sbA0x.append(", readyTargets=");
        sbA0x.append(list2);
        return C3cJ.A0L(nativePageIdentity, ", selectedTarget=", sbA0x);
    }

    public /* synthetic */ PageOwnerView(String str, long j, BrowserTaskBinding browserTaskBinding, PageStorageMode pageStorageMode, String str2, TaskPageGroupControlState taskPageGroupControlState, long j2, List list, List list2, NativePageIdentity nativePageIdentity, C06H c06h) {
        this(str, j, browserTaskBinding, pageStorageMode, str2, taskPageGroupControlState, j2, list, list2, nativePageIdentity);
    }
}
