package com.facebook.aura.graduation.repo;

import X.AHD;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class HatchGraduationStory extends C06G {
    public final AHD<HatchGraduationChapter> chapters;
    public final String experienceId;
    public final Long loopStartTimeMs;
    public final String videoUrl;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchGraduationStory) {
                HatchGraduationStory hatchGraduationStory = (HatchGraduationStory) obj;
                if (!C7384Etj.areEqual(this.experienceId, hatchGraduationStory.experienceId) || !C7384Etj.areEqual(this.videoUrl, hatchGraduationStory.videoUrl) || !C7384Etj.areEqual(this.loopStartTimeMs, hatchGraduationStory.loopStartTimeMs) || !C7384Etj.areEqual(this.chapters, hatchGraduationStory.chapters)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchGraduationStory copy$default(HatchGraduationStory hatchGraduationStory, String str, String str2, Long l, AHD ahd, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchGraduationStory.experienceId;
        }
        if ((i & 2) != 0) {
            str2 = hatchGraduationStory.videoUrl;
        }
        if ((i & 4) != 0) {
            l = hatchGraduationStory.loopStartTimeMs;
        }
        if ((i & 8) != 0) {
            ahd = hatchGraduationStory.chapters;
        }
        AnonymousClass005.A0y(str, str2, ahd);
        return new HatchGraduationStory(str, str2, l, ahd);
    }

    public final String component1() {
        return this.experienceId;
    }

    public final String component2() {
        return this.videoUrl;
    }

    public final Long component3() {
        return this.loopStartTimeMs;
    }

    public final AHD<HatchGraduationChapter> component4() {
        return this.chapters;
    }

    public final AHD<HatchGraduationChapter> getChapters() {
        return this.chapters;
    }

    public final String getExperienceId() {
        return this.experienceId;
    }

    public final Long getLoopStartTimeMs() {
        return this.loopStartTimeMs;
    }

    public final String getVideoUrl() {
        return this.videoUrl;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.chapters, (AnonymousClass005.A0I(this.videoUrl, AnonymousClass001.A0G(this.experienceId)) + AnonymousClass006.A0D(this.loopStartTimeMs)) * 31);
    }

    public HatchGraduationStory(String str, String str2, Long l, AHD<HatchGraduationChapter> ahd) {
        AnonymousClass005.A0y(str, str2, ahd);
        this.experienceId = str;
        this.videoUrl = str2;
        this.loopStartTimeMs = l;
        this.chapters = ahd;
    }

    public final HatchGraduationStory copy(String str, String str2, Long l, AHD<HatchGraduationChapter> ahd) {
        AnonymousClass005.A0y(str, str2, ahd);
        return new HatchGraduationStory(str, str2, l, ahd);
    }

    public String toString() {
        return super.toString();
    }
}
