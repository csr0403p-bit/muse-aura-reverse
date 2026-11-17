package com.facebook.aura.widgets;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.AnonymousClass037;
import X.B1V;
import X.BFM;
import X.BRg;
import X.C01N;
import X.C06G;
import X.C0CD;
import X.C0v5;
import X.C1062ATq;
import X.C10G;
import X.C1822Arm;
import X.C1YD;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0W;
import X.G2j;
import com.facebook.aura.spaces.repo.SpaceCard;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class SpaceWidgetPickerScreenKt$SpaceWidgetPickerList$1$1 extends AbstractC7559F3s implements G0U<C0CD, Unit> {
    public final /* synthetic */ float $bottomPadding;
    public final /* synthetic */ G0U<SpaceCard, Unit> $onSpacePicked;
    public final /* synthetic */ AHD<SpaceCard> $spaces;
    public final /* synthetic */ float $topPadding;

    /* renamed from: com.facebook.aura.widgets.SpaceWidgetPickerScreenKt$SpaceWidgetPickerList$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ float $topPadding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(float f) {
            super(3);
            this.$topPadding = f;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                C01N.A08(bfm, BRg.A00, this.$topPadding);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.widgets.SpaceWidgetPickerScreenKt$SpaceWidgetPickerList$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<SpaceCard, Object> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Object invoke(SpaceCard spaceCard) {
            SpaceCard spaceCard2 = spaceCard;
            C7384Etj.A0Y(spaceCard2, 0);
            return spaceCard2.id;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(SpaceCard spaceCard) {
            C7384Etj.A0Y(spaceCard, 0);
            return spaceCard.id;
        }
    }

    /* renamed from: com.facebook.aura.widgets.SpaceWidgetPickerScreenKt$SpaceWidgetPickerList$1$1$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ float $bottomPadding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(float f) {
            super(3);
            this.$bottomPadding = f;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                C01N.A08(bfm, BRg.A00, this.$bottomPadding);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C0CD c0cd) {
        C7384Etj.A0Y(c0cd, 0);
        c0cd.APJ(null, null, B1V.A01(new AnonymousClass1(this.$topPadding), -1359922544, true));
        final AHD<SpaceCard> ahd = this.$spaces;
        final AnonymousClass2 anonymousClass2 = AnonymousClass2.INSTANCE;
        final G0U<SpaceCard, Unit> g0u = this.$onSpacePicked;
        final SpaceWidgetPickerScreenKt$SpaceWidgetPickerList$1$1$invoke$$inlined$items$default$1 spaceWidgetPickerScreenKt$SpaceWidgetPickerList$1$1$invoke$$inlined$items$default$1 = new G0U() { // from class: com.facebook.aura.widgets.SpaceWidgetPickerScreenKt$SpaceWidgetPickerList$1$1$invoke$$inlined$items$default$1
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return null;
            }

            @Override // X.G0U
            public final Void invoke(SpaceCard spaceCard) {
                return null;
            }
        };
        c0cd.APL(anonymousClass2 != null ? new G0U<Integer, Object>() { // from class: com.facebook.aura.widgets.SpaceWidgetPickerScreenKt$SpaceWidgetPickerList$1$1$invoke$$inlined$items$default$2
            public final Object invoke(int i) {
                return AnonymousClass006.A0p(ahd, anonymousClass2, i);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(AnonymousClass001.A0F(num));
            }
        } : null, new G0U<Integer, Object>() { // from class: com.facebook.aura.widgets.SpaceWidgetPickerScreenKt$SpaceWidgetPickerList$1$1$invoke$$inlined$items$default$3
            public final Object invoke(int i) {
                return AnonymousClass006.A0p(ahd, spaceWidgetPickerScreenKt$SpaceWidgetPickerList$1$1$invoke$$inlined$items$default$1, i);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(AnonymousClass001.A0F(num));
            }
        }, B1V.A01(new G2j<AnonymousClass037, Integer, BFM, Integer, Unit>() { // from class: com.facebook.aura.widgets.SpaceWidgetPickerScreenKt$SpaceWidgetPickerList$1$1$invoke$$inlined$items$default$4
            public final void invoke(AnonymousClass037 anonymousClass037, int i, BFM bfm, int i2) {
                int iA0d = (i2 & 6) == 0 ? i2 | AnonymousClass004.A0d(bfm, anonymousClass037) : i2;
                if ((i2 & 48) == 0) {
                    iA0d |= AnonymousClass004.A0E(bfm, i);
                }
                if (!AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
                    bfm.Afo();
                    return;
                }
                SpaceCard spaceCard = (SpaceCard) ahd.get(i);
                bfm.AgE(-397303290);
                String str = spaceCard.title;
                C1822Arm c1822ArmA0W = C06G.A0W(bfm);
                long jA0C = C06G.A0C(bfm);
                C1062ATq c1062ATq = C10G.A02;
                C1YD c1yd = new C1YD(0);
                boolean zA1J = AnonymousClass003.A1J(bfm, g0u, spaceCard);
                Object objAaT = bfm.AaT();
                if (zA1J || objAaT == C78N.A00) {
                    objAaT = new SpaceWidgetPickerScreenKt$SpaceWidgetPickerList$1$1$3$1$1(g0u, spaceCard);
                    bfm.Ai0(objAaT);
                }
                AuraTextKt.m2639AuraTextUY9GdpU(str, C3U4.A0B(C0v5.A02(c1062ATq, c1yd, objAaT, null), 20.0f, 16.0f), jA0C, c1822ArmA0W, null, null, null, false, 0, 2, 2, null, null, null, bfm, 805306368, 6, 14832);
                AnonymousClass001.A1D(bfm);
            }

            @Override // X.G2j
            public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, Integer num, BFM bfm, Integer num2) {
                invoke(anonymousClass037, AnonymousClass001.A0F(num), bfm, AnonymousClass001.A0F(num2));
                return Unit.INSTANCE;
            }
        }, 802480018, true), ahd.size());
        c0cd.APJ(null, null, B1V.A01(new AnonymousClass4(this.$bottomPadding), 963874695, true));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SpaceWidgetPickerScreenKt$SpaceWidgetPickerList$1$1(AHD<SpaceCard> ahd, float f, G0U<? super SpaceCard, Unit> g0u, float f2) {
        super(1);
        this.$spaces = ahd;
        this.$topPadding = f;
        this.$onSpacePicked = g0u;
        this.$bottomPadding = f2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C0CD c0cd) {
        invoke2(c0cd);
        return Unit.INSTANCE;
    }
}
