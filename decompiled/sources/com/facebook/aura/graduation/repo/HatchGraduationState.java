package com.facebook.aura.graduation.repo;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class HatchGraduationState extends C06G {
    public final boolean isLoaded;
    public final boolean isUserGraduationEnabled;
    public final boolean shouldShow;
    public final HatchGraduationStory story;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchGraduationState) {
                HatchGraduationState hatchGraduationState = (HatchGraduationState) obj;
                if (this.shouldShow != hatchGraduationState.shouldShow || this.isUserGraduationEnabled != hatchGraduationState.isUserGraduationEnabled || !C7384Etj.areEqual(this.story, hatchGraduationState.story) || this.isLoaded != hatchGraduationState.isLoaded) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchGraduationState copy$default(HatchGraduationState hatchGraduationState, boolean z, boolean z2, HatchGraduationStory hatchGraduationStory, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = hatchGraduationState.shouldShow;
        }
        if ((i & 2) != 0) {
            z2 = hatchGraduationState.isUserGraduationEnabled;
        }
        if ((i & 4) != 0) {
            hatchGraduationStory = hatchGraduationState.story;
        }
        if ((i & 8) != 0) {
            z3 = hatchGraduationState.isLoaded;
        }
        return new HatchGraduationState(z, z2, hatchGraduationStory, z3);
    }

    public final boolean component1() {
        return this.shouldShow;
    }

    public final boolean component2() {
        return this.isUserGraduationEnabled;
    }

    public final HatchGraduationStory component3() {
        return this.story;
    }

    public final boolean component4() {
        return this.isLoaded;
    }

    public final HatchGraduationState copy(boolean z, boolean z2, HatchGraduationStory hatchGraduationStory, boolean z3) {
        return new HatchGraduationState(z, z2, hatchGraduationStory, z3);
    }

    public final boolean getShouldPromptInChat() {
        return this.shouldShow && this.story != null;
    }

    public final boolean getShouldShow() {
        return this.shouldShow;
    }

    public final HatchGraduationStory getStory() {
        return this.story;
    }

    public int hashCode() {
        return C0KA.A00((C0KA.A01(C0KA.A02(this.shouldShow), this.isUserGraduationEnabled) + AnonymousClass006.A0D(this.story)) * 31, this.isLoaded);
    }

    public final boolean isLoaded() {
        return this.isLoaded;
    }

    public final boolean isUserGraduationEnabled() {
        return this.isUserGraduationEnabled;
    }

    public /* synthetic */ HatchGraduationState(boolean z, boolean z2, HatchGraduationStory hatchGraduationStory, boolean z3, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z), AnonymousClass001.A1Q(i, z2), (i & 4) != 0 ? null : hatchGraduationStory, AnonymousClass005.A1P(i, z3));
    }

    public String toString() {
        return super.toString();
    }

    public HatchGraduationState(boolean z, boolean z2, HatchGraduationStory hatchGraduationStory, boolean z3) {
        this.shouldShow = z;
        this.isUserGraduationEnabled = z2;
        this.story = hatchGraduationStory;
        this.isLoaded = z3;
    }

    public HatchGraduationState() {
        this(false, false, null, false);
    }
}
