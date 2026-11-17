package com.facebook.aura.graduation.viewmodel;

import X.AGI;
import X.AHD;
import X.AnonymousClass003;
import com.facebook.aura.graduation.repo.HatchGraduationChapter;
import com.facebook.aura.graduation.repo.HatchGraduationState;
import com.facebook.aura.graduation.repo.HatchGraduationStory;
import com.facebook.aura.graduation.viewmodel.GraduationUiState;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class GraduationViewModelKt {
    public static final String TAG = "GraduationViewModel";

    public static final GraduationChapterUiModel toUiModel(HatchGraduationChapter hatchGraduationChapter) {
        return new GraduationChapterUiModel(hatchGraduationChapter.header, hatchGraduationChapter.title, hatchGraduationChapter.body, hatchGraduationChapter.startTimeMs);
    }

    public static final GraduationUiState toUiState(HatchGraduationState hatchGraduationState, boolean z, boolean z2) {
        HatchGraduationStory hatchGraduationStory = hatchGraduationState.story;
        if (hatchGraduationStory == null) {
            return hatchGraduationState.isLoaded ? GraduationUiState.Unavailable.INSTANCE : GraduationUiState.Loading.INSTANCE;
        }
        String str = hatchGraduationStory.videoUrl;
        Long l = hatchGraduationStory.loopStartTimeMs;
        AHD<HatchGraduationChapter> ahd = hatchGraduationStory.chapters;
        ArrayList arrayListA0i = AnonymousClass003.A0i(ahd);
        Iterator it = ahd.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(toUiModel((HatchGraduationChapter) it.next()));
        }
        return new GraduationUiState.Loaded(str, l, AGI.A07(arrayListA0i), z, z2);
    }
}
