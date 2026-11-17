package com.facebook.aura.graduation.viewmodel;

import X.AHD;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C3cI;
import X.C7384Etj;

/* loaded from: classes3.dex */
public interface GraduationUiState {

    public final class Loaded extends C06G implements GraduationUiState {
        public final AHD<GraduationChapterUiModel> chapters;
        public final boolean isSavingVideo;
        public final boolean isVideoSaved;
        public final Long loopStartTimeMs;
        public final String videoUrl;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Loaded) {
                    Loaded loaded = (Loaded) obj;
                    if (!C7384Etj.areEqual(this.videoUrl, loaded.videoUrl) || !C7384Etj.areEqual(this.loopStartTimeMs, loaded.loopStartTimeMs) || !C7384Etj.areEqual(this.chapters, loaded.chapters) || this.isSavingVideo != loaded.isSavingVideo || this.isVideoSaved != loaded.isVideoSaved) {
                    }
                }
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Loaded copy$default(Loaded loaded, String str, Long l, AHD ahd, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loaded.videoUrl;
            }
            if ((i & 2) != 0) {
                l = loaded.loopStartTimeMs;
            }
            if ((i & 4) != 0) {
                ahd = loaded.chapters;
            }
            if ((i & 8) != 0) {
                z = loaded.isSavingVideo;
            }
            if ((i & 16) != 0) {
                z2 = loaded.isVideoSaved;
            }
            return loaded.copy(str, l, ahd, z, z2);
        }

        public final String component1() {
            return this.videoUrl;
        }

        public final Long component2() {
            return this.loopStartTimeMs;
        }

        public final AHD<GraduationChapterUiModel> component3() {
            return this.chapters;
        }

        public final boolean component4() {
            return this.isSavingVideo;
        }

        public final boolean component5() {
            return this.isVideoSaved;
        }

        public final AHD<GraduationChapterUiModel> getChapters() {
            return this.chapters;
        }

        public final Long getLoopStartTimeMs() {
            return this.loopStartTimeMs;
        }

        public final String getVideoUrl() {
            return this.videoUrl;
        }

        public int hashCode() {
            return C0KA.A00(C0KA.A01(AnonymousClass005.A0F(this.chapters, (AnonymousClass001.A0G(this.videoUrl) + AnonymousClass006.A0D(this.loopStartTimeMs)) * 31), this.isSavingVideo), this.isVideoSaved);
        }

        public final boolean isSavingVideo() {
            return this.isSavingVideo;
        }

        public final boolean isVideoSaved() {
            return this.isVideoSaved;
        }

        public Loaded(String str, Long l, AHD<GraduationChapterUiModel> ahd, boolean z, boolean z2) {
            AnonymousClass003.A0v(str, ahd);
            this.videoUrl = str;
            this.loopStartTimeMs = l;
            this.chapters = ahd;
            this.isSavingVideo = z;
            this.isVideoSaved = z2;
        }

        public final Loaded copy(String str, Long l, AHD<GraduationChapterUiModel> ahd, boolean z, boolean z2) {
            AnonymousClass003.A0v(str, ahd);
            return new Loaded(str, l, ahd, z, z2);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Loaded(String str, Long l, AHD ahd, boolean z, boolean z2, int i, C06H c06h) {
            this(str, l, ahd, AnonymousClass005.A1P(i, z), C3cI.A1S(i, z2));
        }
    }

    public final class Loading implements GraduationUiState {
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public String toString() {
            return "Loading";
        }

        public int hashCode() {
            return 311266019;
        }
    }

    public final class Unavailable implements GraduationUiState {
        public static final Unavailable INSTANCE = new Unavailable();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Unavailable);
        }

        public String toString() {
            return "Unavailable";
        }

        public int hashCode() {
            return -1886955913;
        }
    }
}
