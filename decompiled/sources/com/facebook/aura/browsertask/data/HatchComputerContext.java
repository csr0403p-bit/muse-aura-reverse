package com.facebook.aura.browsertask.data;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C3cG;
import X.C3cJ;
import X.C7384Etj;
import com.facebook.aura.model.BrowserTaskPresentation;
import java.util.List;

/* loaded from: classes2.dex */
public final class HatchComputerContext {
    public static final int $stable = 8;
    public final HatchDesktopImage defaultDesktopImage;
    public final List<BrowserTaskPresentation> tasks;

    public HatchComputerContext(List<BrowserTaskPresentation> list, HatchDesktopImage hatchDesktopImage) {
        C7384Etj.A0Y(list, 0);
        this.tasks = list;
        this.defaultDesktopImage = hatchDesktopImage;
    }

    public final HatchComputerContext copy(List<BrowserTaskPresentation> list, HatchDesktopImage hatchDesktopImage) {
        C7384Etj.A0Y(list, 0);
        return new HatchComputerContext(list, hatchDesktopImage);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchComputerContext) {
                HatchComputerContext hatchComputerContext = (HatchComputerContext) obj;
                if (!C7384Etj.areEqual(this.tasks, hatchComputerContext.tasks) || !C7384Etj.areEqual(this.defaultDesktopImage, hatchComputerContext.defaultDesktopImage)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchComputerContext copy$default(HatchComputerContext hatchComputerContext, List list, HatchDesktopImage hatchDesktopImage, int i, Object obj) {
        if ((i & 1) != 0) {
            list = hatchComputerContext.tasks;
        }
        if ((i & 2) != 0) {
            hatchDesktopImage = hatchComputerContext.defaultDesktopImage;
        }
        C7384Etj.A0Y(list, 0);
        return new HatchComputerContext(list, hatchDesktopImage);
    }

    public final List<BrowserTaskPresentation> component1() {
        return this.tasks;
    }

    public final HatchDesktopImage component2() {
        return this.defaultDesktopImage;
    }

    public final HatchDesktopImage getDefaultDesktopImage() {
        return this.defaultDesktopImage;
    }

    public final List<BrowserTaskPresentation> getTasks() {
        return this.tasks;
    }

    public int hashCode() {
        return AnonymousClass005.A0E(this.tasks) + AnonymousClass006.A0D(this.defaultDesktopImage);
    }

    public String toString() {
        return C3cJ.A0L(this.defaultDesktopImage, ", defaultDesktopImage=", C3cG.A0f(this.tasks, "HatchComputerContext(tasks="));
    }
}
