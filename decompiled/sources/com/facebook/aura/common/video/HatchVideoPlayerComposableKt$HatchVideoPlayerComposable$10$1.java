package com.facebook.aura.common.video;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1BO;
import X.C78g;
import X.G0U;
import android.net.Uri;
import androidx.compose.runtime.MutableState;

/* loaded from: classes4.dex */
public final class HatchVideoPlayerComposableKt$HatchVideoPlayerComposable$10$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ C1BO<Boolean> $currentPlayWhenReady$delegate;
    public final /* synthetic */ AspectRatioFrameLayout $layout;
    public final /* synthetic */ MutableState<Boolean> $lifecycleResumed$delegate;
    public final /* synthetic */ Integer $mediaGeneration;
    public final /* synthetic */ MutableState<Boolean> $renderedFirstFrame;
    public final /* synthetic */ MutableState<Integer> $resumeGeneration$delegate;
    public final /* synthetic */ MutableState<Integer> $sourceMediaGeneration$delegate;
    public final /* synthetic */ MutableState<Integer> $sourceResumeGeneration$delegate;
    public final /* synthetic */ MutableState<String> $sourceVideoKey$delegate;
    public final /* synthetic */ MutableState<HatchVideoPlayer> $sourceVideoPlayer$delegate;
    public final /* synthetic */ String $surfaceTag;
    public final /* synthetic */ Uri $uri;
    public final /* synthetic */ String $videoId;
    public final /* synthetic */ String $videoKey;
    public final /* synthetic */ boolean $videoOnly;
    public final /* synthetic */ HatchVideoPlayer $videoPlayer;
    public final /* synthetic */ HatchVideoPlayerComposableKt$HatchVideoPlayerComposable$videoPlayerListener$1$1 $videoPlayerListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchVideoPlayerComposableKt$HatchVideoPlayerComposable$10$1(HatchVideoPlayer hatchVideoPlayer, String str, Integer num, HatchVideoPlayerComposableKt$HatchVideoPlayerComposable$videoPlayerListener$1$1 hatchVideoPlayerComposableKt$HatchVideoPlayerComposable$videoPlayerListener$1$1, MutableState<Boolean> mutableState, Uri uri, String str2, AspectRatioFrameLayout aspectRatioFrameLayout, String str3, boolean z, MutableState<HatchVideoPlayer> mutableState2, MutableState<String> mutableState3, MutableState<Integer> mutableState4, MutableState<Integer> mutableState5, MutableState<Integer> mutableState6, C1BO<Boolean> c1bo, MutableState<Boolean> mutableState7) {
        super(1);
        this.$videoPlayer = hatchVideoPlayer;
        this.$videoKey = str;
        this.$mediaGeneration = num;
        this.$videoPlayerListener = hatchVideoPlayerComposableKt$HatchVideoPlayerComposable$videoPlayerListener$1$1;
        this.$renderedFirstFrame = mutableState;
        this.$uri = uri;
        this.$videoId = str2;
        this.$layout = aspectRatioFrameLayout;
        this.$surfaceTag = str3;
        this.$videoOnly = z;
        this.$sourceVideoPlayer$delegate = mutableState2;
        this.$sourceVideoKey$delegate = mutableState3;
        this.$sourceMediaGeneration$delegate = mutableState4;
        this.$resumeGeneration$delegate = mutableState5;
        this.$sourceResumeGeneration$delegate = mutableState6;
        this.$currentPlayWhenReady$delegate = c1bo;
        this.$lifecycleResumed$delegate = mutableState7;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002b A[PHI: r7
  0x002b: PHI (r7v1 boolean) = (r7v0 boolean), (r7v5 boolean), (r7v5 boolean) binds: [B:3:0x000b, B:5:0x001a, B:7:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.G0U
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C78g invoke(X.C0Yr r9) {
        /*
            r8 = this;
            androidx.compose.runtime.MutableState<com.facebook.aura.common.video.HatchVideoPlayer> r0 = r8.$sourceVideoPlayer$delegate
            java.lang.Object r2 = r0.getValue()
            com.facebook.aura.common.video.HatchVideoPlayer r0 = r8.$videoPlayer
            r1 = 1
            r5 = 0
            r7 = 1
            if (r2 != r0) goto L2b
            r7 = 0
            androidx.compose.runtime.MutableState<java.lang.String> r0 = r8.$sourceVideoKey$delegate
            java.lang.Object r2 = r0.getValue()
            java.lang.String r0 = r8.$videoKey
            boolean r0 = X.C7384Etj.areEqual(r2, r0)
            if (r0 == 0) goto L2b
            androidx.compose.runtime.MutableState<java.lang.Integer> r0 = r8.$sourceMediaGeneration$delegate
            java.lang.Object r2 = r0.getValue()
            java.lang.Integer r0 = r8.$mediaGeneration
            boolean r0 = X.C7384Etj.areEqual(r2, r0)
            r6 = 0
            if (r0 != 0) goto L2c
        L2b:
            r6 = 1
        L2c:
            java.lang.Integer r0 = r8.$mediaGeneration
            boolean r4 = X.AnonymousClass002.A1X(r0)
            androidx.compose.runtime.MutableState<java.lang.Integer> r0 = r8.$resumeGeneration$delegate
            int r2 = androidx.compose.runtime.MutableState.A02(r0)
            androidx.compose.runtime.MutableState<java.lang.Integer> r0 = r8.$sourceResumeGeneration$delegate
            int r0 = androidx.compose.runtime.MutableState.A02(r0)
            boolean r3 = X.AnonymousClass002.A1P(r2, r0)
            X.1BO<java.lang.Boolean> r0 = r8.$currentPlayWhenReady$delegate
            boolean r0 = X.C1BO.A0F(r0)
            if (r0 == 0) goto Lc8
            androidx.compose.runtime.MutableState<java.lang.Boolean> r0 = r8.$lifecycleResumed$delegate
            boolean r0 = androidx.compose.runtime.MutableState.A0A(r0)
            if (r0 == 0) goto Lc8
        L52:
            com.facebook.aura.common.video.HatchVideoPlayer r2 = r8.$videoPlayer
            com.facebook.aura.common.video.HatchVideoPlayerComposableKt$HatchVideoPlayerComposable$videoPlayerListener$1$1 r0 = r8.$videoPlayerListener
            r2.addListener(r0)
            if (r6 == 0) goto Lab
            androidx.compose.runtime.MutableState<java.lang.Boolean> r0 = r8.$renderedFirstFrame
            androidx.compose.runtime.MutableState.A09(r5, r0)
            com.facebook.aura.common.video.HatchVideoPlayer r2 = r8.$videoPlayer
            if (r7 != 0) goto Lb5
            r2.stop()
            if (r4 == 0) goto L70
            if (r3 != 0) goto L70
            com.facebook.aura.common.video.HatchVideoPlayer r0 = r8.$videoPlayer
            r0.clearMediaItems()
        L70:
            com.facebook.aura.common.video.HatchVideoPlayer r0 = r8.$videoPlayer
            r0.setPlayWhenReadyFlag(r1)
            com.facebook.aura.common.video.HatchVideoPlayer r2 = r8.$videoPlayer
            android.net.Uri r3 = r8.$uri
            java.lang.String r4 = r8.$videoId
            com.facebook.aura.common.video.AspectRatioFrameLayout r5 = r8.$layout
            java.lang.String r6 = r8.$surfaceTag
            boolean r7 = r8.$videoOnly
            com.facebook.aura.common.video.HatchVideoPlayerComposableKt.prepareVideo(r2, r3, r4, r5, r6, r7)
        L84:
            if (r1 == 0) goto L8b
            com.facebook.aura.common.video.HatchVideoPlayer r0 = r8.$videoPlayer
            r0.play()
        L8b:
            androidx.compose.runtime.MutableState<com.facebook.aura.common.video.HatchVideoPlayer> r1 = r8.$sourceVideoPlayer$delegate
            com.facebook.aura.common.video.HatchVideoPlayer r0 = r8.$videoPlayer
            r1.Af8(r0)
            androidx.compose.runtime.MutableState<java.lang.String> r1 = r8.$sourceVideoKey$delegate
            java.lang.String r0 = r8.$videoKey
            r1.Af8(r0)
            androidx.compose.runtime.MutableState<java.lang.Integer> r1 = r8.$sourceMediaGeneration$delegate
            java.lang.Integer r0 = r8.$mediaGeneration
            r1.Af8(r0)
            androidx.compose.runtime.MutableState<java.lang.Integer> r1 = r8.$sourceResumeGeneration$delegate
            androidx.compose.runtime.MutableState<java.lang.Integer> r0 = r8.$resumeGeneration$delegate
            int r0 = androidx.compose.runtime.MutableState.A02(r0)
            androidx.compose.runtime.MutableState.A07(r0, r1)
        Lab:
            com.facebook.aura.common.video.HatchVideoPlayer r2 = r8.$videoPlayer
            com.facebook.aura.common.video.HatchVideoPlayerComposableKt$HatchVideoPlayerComposable$videoPlayerListener$1$1 r1 = r8.$videoPlayerListener
            com.facebook.aura.common.video.HatchVideoPlayerComposableKt$HatchVideoPlayerComposable$10$1$invoke$$inlined$onDispose$1 r0 = new com.facebook.aura.common.video.HatchVideoPlayerComposableKt$HatchVideoPlayerComposable$10$1$invoke$$inlined$onDispose$1
            r0.<init>()
            return r0
        Lb5:
            android.net.Uri r3 = r8.$uri
            java.lang.String r4 = r8.$videoId
            com.facebook.aura.common.video.AspectRatioFrameLayout r5 = r8.$layout
            java.lang.String r6 = r8.$surfaceTag
            boolean r7 = r8.$videoOnly
            com.facebook.aura.common.video.HatchVideoPlayerComposableKt.fetchVideo(r2, r3, r4, r5, r6, r7)
            com.facebook.aura.common.video.HatchVideoPlayer r0 = r8.$videoPlayer
            r0.setPlayWhenReadyFlag(r1)
            goto L84
        Lc8:
            r1 = 0
            goto L52
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.common.video.HatchVideoPlayerComposableKt$HatchVideoPlayerComposable$10$1.invoke(X.0Yr):X.78g");
    }
}
