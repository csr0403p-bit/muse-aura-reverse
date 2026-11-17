package com.facebook.aura.vmbrowser;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06H;
import X.C0KA;
import X.C7384Etj;
import X.FGI;

/* loaded from: classes2.dex */
public final class VmBrowserViewerState {
    public static final int $stable = 0;
    public final boolean isPreviewVisible;
    public final String taskId;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof VmBrowserViewerState) {
                VmBrowserViewerState vmBrowserViewerState = (VmBrowserViewerState) obj;
                if (!C7384Etj.areEqual(this.taskId, vmBrowserViewerState.taskId) || this.isPreviewVisible != vmBrowserViewerState.isPreviewVisible) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ VmBrowserViewerState copy$default(VmBrowserViewerState vmBrowserViewerState, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = vmBrowserViewerState.taskId;
        }
        if ((i & 2) != 0) {
            z = vmBrowserViewerState.isPreviewVisible;
        }
        return new VmBrowserViewerState(str, z);
    }

    public final String component1() {
        return this.taskId;
    }

    public final boolean component2() {
        return this.isPreviewVisible;
    }

    public final VmBrowserViewerState copy(String str, boolean z) {
        return new VmBrowserViewerState(str, z);
    }

    public final String getTaskId() {
        return this.taskId;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass006.A0G(this.taskId) * 31, this.isPreviewVisible);
    }

    public final boolean isPreviewVisible() {
        return this.isPreviewVisible;
    }

    public String toString() {
        return FGI.A0n("VmBrowserViewerState(taskId=", this.taskId, ", isPreviewVisible=", ")", this.isPreviewVisible);
    }

    public VmBrowserViewerState(String str, boolean z) {
        this.taskId = str;
        this.isPreviewVisible = z;
    }

    public /* synthetic */ VmBrowserViewerState(String str, boolean z, int i, C06H c06h) {
        this(AnonymousClass006.A0r(i, str), AnonymousClass001.A1Q(i, z));
    }

    public VmBrowserViewerState() {
        this(null, false);
    }
}
