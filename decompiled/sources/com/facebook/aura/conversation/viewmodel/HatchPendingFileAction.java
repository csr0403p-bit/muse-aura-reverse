package com.facebook.aura.conversation.viewmodel;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class HatchPendingFileAction extends C06G {
    public static final int $stable = 0;
    public final String fileName;
    public final HatchPendingFileActionType type;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchPendingFileAction) {
                HatchPendingFileAction hatchPendingFileAction = (HatchPendingFileAction) obj;
                if (this.type != hatchPendingFileAction.type || !C7384Etj.areEqual(this.fileName, hatchPendingFileAction.fileName)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchPendingFileAction copy$default(HatchPendingFileAction hatchPendingFileAction, HatchPendingFileActionType hatchPendingFileActionType, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            hatchPendingFileActionType = hatchPendingFileAction.type;
        }
        if ((i & 2) != 0) {
            str = hatchPendingFileAction.fileName;
        }
        AnonymousClass003.A0u(hatchPendingFileActionType, str);
        return new HatchPendingFileAction(hatchPendingFileActionType, str);
    }

    public final HatchPendingFileActionType component1() {
        return this.type;
    }

    public final String component2() {
        return this.fileName;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final HatchPendingFileActionType getType() {
        return this.type;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.fileName, AnonymousClass005.A0E(this.type));
    }

    public HatchPendingFileAction(HatchPendingFileActionType hatchPendingFileActionType, String str) {
        AnonymousClass003.A0u(hatchPendingFileActionType, str);
        this.type = hatchPendingFileActionType;
        this.fileName = str;
    }

    public final HatchPendingFileAction copy(HatchPendingFileActionType hatchPendingFileActionType, String str) {
        AnonymousClass003.A0u(hatchPendingFileActionType, str);
        return new HatchPendingFileAction(hatchPendingFileActionType, str);
    }

    public String toString() {
        return super.toString();
    }
}
