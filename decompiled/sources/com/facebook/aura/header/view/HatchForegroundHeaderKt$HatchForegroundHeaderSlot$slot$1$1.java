package com.facebook.aura.header.view;

import X.AKH;
import X.AKJ;
import X.AKT;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.B1V;
import X.BFM;
import X.C1BO;
import X.C2Jb;
import X.C2ae;
import X.G0V;
import X.G0W;
import com.facebook.aura.ui.HatchFloatingChromeGeometryKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchForegroundHeaderKt$HatchForegroundHeaderSlot$slot$1$1 extends AbstractC7559F3s implements G0W<Boolean, BFM, Integer, Unit> {
    public final /* synthetic */ C1BO<G0V<BFM, Integer, Unit>> $currentContent;
    public final /* synthetic */ Function0<C2ae> $inPageObstacleOffset;
    public final /* synthetic */ C1BO<C2Jb> $locals;

    /* renamed from: com.facebook.aura.header.view.HatchForegroundHeaderKt$HatchForegroundHeaderSlot$slot$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ C1BO<G0V<BFM, Integer, Unit>> $currentContent;
        public final /* synthetic */ boolean $elevated;
        public final /* synthetic */ Function0<C2ae> $inPageObstacleOffset;

        /* renamed from: com.facebook.aura.header.view.HatchForegroundHeaderKt$HatchForegroundHeaderSlot$slot$1$1$1$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
            public final /* synthetic */ C1BO<G0V<BFM, Integer, Unit>> $currentContent;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass2(C1BO<? extends G0V<? super BFM, ? super Integer, Unit>> c1bo) {
                super(2);
                this.$currentContent = c1bo;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                invoke(bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }

            public final void invoke(BFM bfm, int i) {
                if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                    AnonymousClass001.A1H(bfm, this.$currentContent.getValue(), 0);
                } else {
                    bfm.Afo();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(boolean z, Function0<C2ae> function0, C1BO<? extends G0V<? super BFM, ? super Integer, Unit>> c1bo) {
            super(2);
            this.$elevated = z;
            this.$inPageObstacleOffset = function0;
            this.$currentContent = c1bo;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void invoke(BFM bfm, int i) {
            Function0<C2ae> function0;
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                AKH<Function0<C2ae>> akh = HatchFloatingChromeGeometryKt.LocalHatchFloatingChromeObstacleOffset;
                if (this.$elevated) {
                    function0 = HatchForegroundHeaderKt.NoObstacleOffset;
                } else {
                    function0 = this.$inPageObstacleOffset;
                }
                AKJ<Function0<C2ae>> akjA04 = akh.A04(function0);
                AKH<Function0<Boolean>> akh2 = HatchFloatingChromeGeometryKt.LocalHatchLeavingTab;
                Object objA6v = bfm.A6v(akh2);
                if (this.$elevated) {
                    objA6v = null;
                }
                AnonymousClass003.A0p(bfm, new AnonymousClass2(this.$currentContent), new AKJ[]{akjA04, akh2.A04(objA6v)}, 1700884172);
                return;
            }
            bfm.Afo();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchForegroundHeaderKt$HatchForegroundHeaderSlot$slot$1$1(C1BO<C2Jb> c1bo, Function0<C2ae> function0, C1BO<? extends G0V<? super BFM, ? super Integer, Unit>> c1bo2) {
        super(3);
        this.$locals = c1bo;
        this.$inPageObstacleOffset = function0;
        this.$currentContent = c1bo2;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, BFM bfm, Integer num) {
        invoke(AnonymousClass001.A1X(bool), bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z, BFM bfm, int i) {
        if ((i & 6) == 0) {
            i |= AnonymousClass004.A0n(bfm, z);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(i), bfm, i)) {
            AKT.A00(bfm, this.$locals.getValue(), B1V.A00(bfm, new AnonymousClass1(z, this.$inPageObstacleOffset, this.$currentContent), 33475468), 48);
        } else {
            bfm.Afo();
        }
    }
}
