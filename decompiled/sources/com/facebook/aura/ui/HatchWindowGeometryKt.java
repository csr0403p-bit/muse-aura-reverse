package com.facebook.aura.ui;

import X.AGO;
import X.AKH;
import X.AXY;
import X.AYU;
import X.AZE;
import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.BRg;
import X.C3TG;
import X.C3UC;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import X.InterfaceC1134Abi;
import androidx.compose.ui.unit.Constraints;
import kotlin.Unit;

/* loaded from: classes3.dex */
public abstract class HatchWindowGeometryKt {
    public static final AKH<HatchWindowGeometry> LocalHatchWindowGeometry = new AGO(HatchWindowGeometryKt$LocalHatchWindowGeometry$1.INSTANCE);

    /* renamed from: com.facebook.aura.ui.HatchWindowGeometryKt$hatchWindowGeometryRoot$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<AXY, C3TG, Constraints, InterfaceC1134Abi> {
        public final /* synthetic */ boolean $isContentReady;
        public final /* synthetic */ MutableHatchWindowGeometry $windowGeometry;

        /* renamed from: com.facebook.aura.ui.HatchWindowGeometryKt$hatchWindowGeometryRoot$1$1, reason: invalid class name and collision with other inner class name */
        public final class C04101 extends AbstractC7559F3s implements G0U<AYU, Unit> {
            public final /* synthetic */ int $generation;
            public final /* synthetic */ boolean $isContentReady;
            public final /* synthetic */ AZE $placeable;
            public final /* synthetic */ MutableHatchWindowGeometry $windowGeometry;

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(AYU ayu) {
                C7384Etj.A0Y(ayu, 0);
                AYU.A04(ayu, this.$placeable, 0, 0);
                if (this.$isContentReady) {
                    AZE aze = this.$placeable;
                    if (aze.A01 <= 0 || aze.A00 <= 0) {
                        return;
                    }
                    this.$windowGeometry.markRootLayoutComplete$fbandroid_express_aura_java_com_facebook_aura_ui_ui(this.$generation);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04101(AZE aze, boolean z, MutableHatchWindowGeometry mutableHatchWindowGeometry, int i) {
                super(1);
                this.$placeable = aze;
                this.$isContentReady = z;
                this.$windowGeometry = mutableHatchWindowGeometry;
                this.$generation = i;
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Unit invoke(AYU ayu) {
                invoke2(ayu);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MutableHatchWindowGeometry mutableHatchWindowGeometry, boolean z) {
            super(3);
            this.$windowGeometry = mutableHatchWindowGeometry;
            this.$isContentReady = z;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ InterfaceC1134Abi invoke(AXY axy, C3TG c3tg, Constraints constraints) {
            return m2331invoke3p2s80s(axy, c3tg, constraints.A00);
        }

        /* renamed from: invoke-3p2s80s, reason: not valid java name */
        public final InterfaceC1134Abi m2331invoke3p2s80s(AXY axy, C3TG c3tg, long j) {
            AnonymousClass003.A0u(axy, c3tg);
            int iAGd = this.$windowGeometry.latestGeneration$delegate.AGd();
            AZE azeAQW = c3tg.AQW(j);
            return AXY.A01(axy, new C04101(azeAQW, this.$isContentReady, this.$windowGeometry, iAGd), azeAQW.A01, azeAQW.A00);
        }
    }

    public static final AKH<HatchWindowGeometry> getLocalHatchWindowGeometry() {
        return LocalHatchWindowGeometry;
    }

    public static final BRg hatchWindowGeometryRoot(BRg bRg, MutableHatchWindowGeometry mutableHatchWindowGeometry, boolean z) {
        AnonymousClass003.A0u(bRg, mutableHatchWindowGeometry);
        return C3UC.A00(bRg, new AnonymousClass1(mutableHatchWindowGeometry, z));
    }
}
