package com.facebook.aura.spaces.view;

import X.AHD;
import X.AbstractC07127nr;
import X.G2j;
import X.HtJ;
import com.facebook.aura.library.repo.ArtifactItem;
import com.facebook.aura.library.repo.UnifiedArtifact;
import com.facebook.aura.library.repo.UnifiedArtifactsRepository;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.spaces.view.SpaceMenuViewModel$state$1", f = "SpaceMenuViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class SpaceMenuViewModel$state$1 extends AbstractC07127nr implements G2j<AHD<? extends UnifiedArtifact>, AHD<? extends ArtifactItem>, UnifiedArtifactsRepository.SpaceLookupResult, HtJ<? super SpaceMenuState>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public /* synthetic */ Object L$2;
    public int label;
    public final /* synthetic */ SpaceMenuViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpaceMenuViewModel$state$1(SpaceMenuViewModel spaceMenuViewModel, HtJ<? super SpaceMenuViewModel$state$1> htJ) {
        super(4, htJ);
        this.this$0 = spaceMenuViewModel;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(AHD<UnifiedArtifact> ahd, AHD<ArtifactItem> ahd2, UnifiedArtifactsRepository.SpaceLookupResult spaceLookupResult, HtJ<? super SpaceMenuState> htJ) {
        SpaceMenuViewModel$state$1 spaceMenuViewModel$state$1 = new SpaceMenuViewModel$state$1(this.this$0, htJ);
        spaceMenuViewModel$state$1.L$0 = ahd;
        spaceMenuViewModel$state$1.L$1 = ahd2;
        spaceMenuViewModel$state$1.L$2 = spaceLookupResult;
        return spaceMenuViewModel$state$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0158, code lost:
    
        if (r11 != null) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0062 A[PHI: r13
  0x0062: PHI (r13v2 boolean) = (r13v0 boolean), (r13v0 boolean), (r13v3 boolean) binds: [B:28:0x005c, B:30:0x0060, B:26:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0092 A[PHI: r16
  0x0092: PHI (r16v5 java.lang.Integer) = (r16v0 java.lang.Integer), (r16v6 java.lang.Integer) binds: [B:43:0x0090, B:41:0x008c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0098 A[PHI: r16
  0x0098: PHI (r16v4 java.lang.Integer) = (r16v0 java.lang.Integer), (r16v5 java.lang.Integer) binds: [B:43:0x0090, B:45:0x0096] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009c A[PHI: r16 r17
  0x009c: PHI (r16v1 java.lang.Integer) = (r16v4 java.lang.Integer), (r16v5 java.lang.Integer) binds: [B:47:0x009a, B:45:0x0096] A[DONT_GENERATE, DONT_INLINE]
  0x009c: PHI (r17v0 boolean) = (r17v3 boolean), (r17v4 boolean) binds: [B:47:0x009a, B:45:0x0096] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a2 A[PHI: r16 r17
  0x00a2: PHI (r16v3 java.lang.Integer) = (r16v1 java.lang.Integer), (r16v4 java.lang.Integer) binds: [B:49:0x00a0, B:47:0x009a] A[DONT_GENERATE, DONT_INLINE]
  0x00a2: PHI (r17v2 boolean) = (r17v0 boolean), (r17v3 boolean) binds: [B:49:0x00a0, B:47:0x009a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x013a  */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.view.SpaceMenuViewModel$state$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G2j
    public /* bridge */ /* synthetic */ Object invoke(AHD<? extends UnifiedArtifact> ahd, AHD<? extends ArtifactItem> ahd2, UnifiedArtifactsRepository.SpaceLookupResult spaceLookupResult, HtJ<? super SpaceMenuState> htJ) {
        return invoke2((AHD<UnifiedArtifact>) ahd, (AHD<ArtifactItem>) ahd2, spaceLookupResult, htJ);
    }
}
