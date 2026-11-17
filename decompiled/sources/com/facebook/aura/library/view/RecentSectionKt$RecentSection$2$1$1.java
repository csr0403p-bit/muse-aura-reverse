package com.facebook.aura.library.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.AnonymousClass037;
import X.BFM;
import X.BRg;
import X.C0CD;
import X.C10G;
import X.C7384Etj;
import X.C78N;
import X.FGI;
import X.G0U;
import X.G2j;
import com.facebook.aura.library.model.RecentFile;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class RecentSectionKt$RecentSection$2$1$1 extends AbstractC7559F3s implements G0U<C0CD, Unit> {
    public final /* synthetic */ boolean $isLoadingMore;
    public final /* synthetic */ G0U<RecentFile, Unit> $onRecentItemClick;
    public final /* synthetic */ AHD<RecentFile> $recentFiles;

    /* renamed from: com.facebook.aura.library.view.RecentSectionKt$RecentSection$2$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<RecentFile, Object> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Object invoke(RecentFile recentFile) {
            RecentFile recentFile2 = recentFile;
            C7384Etj.A0Y(recentFile2, 0);
            return recentFile2.id;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(RecentFile recentFile) {
            C7384Etj.A0Y(recentFile, 0);
            return recentFile.id;
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C0CD c0cd) {
        C7384Etj.A0Y(c0cd, 0);
        final AHD<RecentFile> ahd = this.$recentFiles;
        final AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        final G0U<RecentFile, Unit> g0u = this.$onRecentItemClick;
        final RecentSectionKt$RecentSection$2$1$1$invoke$$inlined$items$default$1 recentSectionKt$RecentSection$2$1$1$invoke$$inlined$items$default$1 = new G0U() { // from class: com.facebook.aura.library.view.RecentSectionKt$RecentSection$2$1$1$invoke$$inlined$items$default$1
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return null;
            }

            @Override // X.G0U
            public final Void invoke(RecentFile recentFile) {
                return null;
            }
        };
        c0cd.APL(anonymousClass1 != null ? new G0U<Integer, Object>() { // from class: com.facebook.aura.library.view.RecentSectionKt$RecentSection$2$1$1$invoke$$inlined$items$default$2
            public final Object invoke(int i) {
                return AnonymousClass006.A0p(ahd, anonymousClass1, i);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(AnonymousClass001.A0F(num));
            }
        } : null, new G0U<Integer, Object>() { // from class: com.facebook.aura.library.view.RecentSectionKt$RecentSection$2$1$1$invoke$$inlined$items$default$3
            public final Object invoke(int i) {
                return AnonymousClass006.A0p(ahd, recentSectionKt$RecentSection$2$1$1$invoke$$inlined$items$default$1, i);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(AnonymousClass001.A0F(num));
            }
        }, AnonymousClass001.A0M(new G2j<AnonymousClass037, Integer, BFM, Integer, Unit>() { // from class: com.facebook.aura.library.view.RecentSectionKt$RecentSection$2$1$1$invoke$$inlined$items$default$4
            public final void invoke(AnonymousClass037 anonymousClass037, int i, BFM bfm, int i2) {
                int iA0d = (i2 & 6) == 0 ? i2 | AnonymousClass004.A0d(bfm, anonymousClass037) : i2;
                if ((i2 & 48) == 0) {
                    iA0d |= AnonymousClass004.A0E(bfm, i);
                }
                if (!AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
                    bfm.Afo();
                    return;
                }
                RecentFile recentFile = (RecentFile) ahd.get(i);
                bfm.AgE(-1071003857);
                String str = recentFile.imageUri;
                boolean zA65 = bfm.A65(recentFile.previewUris);
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = AnonymousClass001.A0z(bfm, recentFile.previewUris);
                }
                AHD ahd2 = (AHD) objAaT;
                boolean zA1J = AnonymousClass003.A1J(bfm, g0u, recentFile);
                Object objAaT2 = bfm.AaT();
                if (zA1J || objAaT2 == C78N.A00) {
                    objAaT2 = new RecentSectionKt$RecentSection$2$1$1$2$2$1(g0u, recentFile);
                    bfm.Ai0(objAaT2);
                }
                HatchDocumentCardKt.LobsterDocumentCard(recentFile, str, ahd2, (Function0) objAaT2, C10G.A08(BRg.A00, 166.0f), null, FGI.A0M("lobster_recent_", recentFile.relativePath), false, null, null, false, null, null, bfm, RecentFile.$stable | RuntimeInternals.IOPRIO_BACKGROUND, 0, 8096);
                AnonymousClass001.A1D(bfm);
            }

            @Override // X.G2j
            public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, Integer num, BFM bfm, Integer num2) {
                invoke(anonymousClass037, AnonymousClass001.A0F(num), bfm, AnonymousClass001.A0F(num2));
                return Unit.INSTANCE;
            }
        }, 802480018), ahd.size());
        if (this.$isLoadingMore) {
            c0cd.APJ("recents_loading_more", null, ComposableSingletons$RecentSectionKt.f74lambda$1013641326);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RecentSectionKt$RecentSection$2$1$1(AHD<RecentFile> ahd, boolean z, G0U<? super RecentFile, Unit> g0u) {
        super(1);
        this.$recentFiles = ahd;
        this.$isLoadingMore = z;
        this.$onRecentItemClick = g0u;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C0CD c0cd) {
        invoke2(c0cd);
        return Unit.INSTANCE;
    }
}
