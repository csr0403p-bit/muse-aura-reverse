package com.facebook.aura.library.view;

import X.AHD;
import X.AbstractC1061ATk;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.BFM;
import X.BRg;
import X.C03X;
import X.C10G;
import X.C1Cj;
import X.C1V6;
import X.C1VA;
import X.C1VW;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0U;
import X.G2j;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.library.model.RecentFile;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchGridDetailScreenKt$HatchGridDetailScreen$2$1$1$1 extends AbstractC7559F3s implements G0U<C1Cj, Unit> {
    public final /* synthetic */ AHD<T> $gridItems;
    public final /* synthetic */ G0U<T, String> $imageUri;
    public final /* synthetic */ boolean $isLoadingMore;
    public final /* synthetic */ G0U<T, Object> $itemKey;
    public final /* synthetic */ G0U<T, AHD<String>> $previewUris;
    public final /* synthetic */ MutableState<T> $selectedItem$delegate;
    public final /* synthetic */ G0U<T, RecentFile> $toRecentFile;

    /* renamed from: com.facebook.aura.library.view.HatchGridDetailScreenKt$HatchGridDetailScreen$2$1$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<C1V6, C1VW> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        /* renamed from: invoke-BHJ-flc, reason: not valid java name */
        public final long m1171invokeBHJflc(C1V6 c1v6) {
            C7384Etj.A0Y(c1v6, 0);
            int i = C1VA.A00;
            if (i > 0) {
                return i;
            }
            AbstractC1061ATk.A00("The span value should be higher than 0");
            throw F60.createAndThrow();
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ C1VW invoke(C1V6 c1v6) {
            return new C1VW(m1171invokeBHJflc(c1v6));
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C1Cj c1Cj) {
        C7384Etj.A0Y(c1Cj, 0);
        final List list = this.$gridItems;
        final G0U<T, Object> g0u = this.$itemKey;
        final G0U<T, RecentFile> g0u2 = this.$toRecentFile;
        final G0U<T, String> g0u3 = this.$imageUri;
        final G0U<T, AHD<String>> g0u4 = this.$previewUris;
        final MutableState<T> mutableState = this.$selectedItem$delegate;
        final HatchGridDetailScreenKt$HatchGridDetailScreen$2$1$1$1$invoke$$inlined$items$default$1 hatchGridDetailScreenKt$HatchGridDetailScreen$2$1$1$1$invoke$$inlined$items$default$1 = new G0U() { // from class: com.facebook.aura.library.view.HatchGridDetailScreenKt$HatchGridDetailScreen$2$1$1$1$invoke$$inlined$items$default$1
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return null;
            }

            @Override // X.G0U
            public final Void invoke(T t) {
                return null;
            }
        };
        c1Cj.APM(g0u != 0 ? new G0U<Integer, Object>() { // from class: com.facebook.aura.library.view.HatchGridDetailScreenKt$HatchGridDetailScreen$2$1$1$1$invoke$$inlined$items$default$2
            public final Object invoke(int i) {
                return AnonymousClass006.A0p(list, g0u, i);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(AnonymousClass001.A0F(num));
            }
        } : null, new G0U<Integer, Object>() { // from class: com.facebook.aura.library.view.HatchGridDetailScreenKt$HatchGridDetailScreen$2$1$1$1$invoke$$inlined$items$default$4
            public final Object invoke(int i) {
                return AnonymousClass006.A0p(list, hatchGridDetailScreenKt$HatchGridDetailScreen$2$1$1$1$invoke$$inlined$items$default$1, i);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(AnonymousClass001.A0F(num));
            }
        }, null, AnonymousClass001.A0M(new G2j<C03X, Integer, BFM, Integer, Unit>() { // from class: com.facebook.aura.library.view.HatchGridDetailScreenKt$HatchGridDetailScreen$2$1$1$1$invoke$$inlined$items$default$5
            public final void invoke(C03X c03x, int i, BFM bfm, int i2) {
                int iA0d = (i2 & 6) == 0 ? i2 | AnonymousClass004.A0d(bfm, c03x) : i2;
                if ((i2 & 48) == 0) {
                    iA0d |= AnonymousClass004.A0E(bfm, i);
                }
                if (!AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
                    bfm.Afo();
                    return;
                }
                Object obj = list.get(i);
                bfm.AgE(-2016749100);
                RecentFile recentFile = (RecentFile) g0u2.invoke(obj);
                String str = (String) g0u3.invoke(obj);
                AHD ahd = (AHD) g0u4.invoke(obj);
                boolean zA67 = bfm.A67(obj);
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new HatchGridDetailScreenKt$HatchGridDetailScreen$2$1$1$1$1$1$1(obj, mutableState);
                    bfm.Ai0(objAaT);
                }
                HatchDocumentCardKt.LobsterDocumentCard(recentFile, str, ahd, (Function0) objAaT, C10G.A08(BRg.A00, 166.0f), null, null, false, null, null, false, null, null, bfm, RecentFile.$stable | RuntimeInternals.IOPRIO_BACKGROUND, 0, 8160);
                AnonymousClass001.A1D(bfm);
            }

            @Override // X.G2j
            public /* bridge */ /* synthetic */ Unit invoke(C03X c03x, Integer num, BFM bfm, Integer num2) {
                invoke(c03x, AnonymousClass001.A0F(num), bfm, AnonymousClass001.A0F(num2));
                return Unit.INSTANCE;
            }
        }, -1117249557), list.size());
        if (this.$isLoadingMore) {
            c1Cj.APK("loading_more", null, AnonymousClass2.INSTANCE, ComposableSingletons$HatchGridDetailScreenKt.lambda$1003754659);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchGridDetailScreenKt$HatchGridDetailScreen$2$1$1$1(AHD<? extends T> ahd, G0U<? super T, ? extends Object> g0u, boolean z, G0U<? super T, RecentFile> g0u2, G0U<? super T, String> g0u3, G0U<? super T, ? extends AHD<String>> g0u4, MutableState<T> mutableState) {
        super(1);
        this.$gridItems = ahd;
        this.$itemKey = g0u;
        this.$isLoadingMore = z;
        this.$toRecentFile = g0u2;
        this.$imageUri = g0u3;
        this.$previewUris = g0u4;
        this.$selectedItem$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C1Cj c1Cj) {
        invoke2(c1Cj);
        return Unit.INSTANCE;
    }
}
