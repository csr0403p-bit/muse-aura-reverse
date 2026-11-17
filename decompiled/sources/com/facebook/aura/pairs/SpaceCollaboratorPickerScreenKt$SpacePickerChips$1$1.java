package com.facebook.aura.pairs;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.AnonymousClass037;
import X.BFM;
import X.C0CD;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G2j;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class SpaceCollaboratorPickerScreenKt$SpacePickerChips$1$1 extends AbstractC7559F3s implements G0U<C0CD, Unit> {
    public final /* synthetic */ G0U<SpacePickerPerson, Unit> $onRemove;
    public final /* synthetic */ SpacePickerUiState $state;

    /* renamed from: com.facebook.aura.pairs.SpaceCollaboratorPickerScreenKt$SpacePickerChips$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<SpacePickerPerson, Object> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Object invoke(SpacePickerPerson spacePickerPerson) {
            SpacePickerPerson spacePickerPerson2 = spacePickerPerson;
            C7384Etj.A0Y(spacePickerPerson2, 0);
            return spacePickerPerson2.id;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(SpacePickerPerson spacePickerPerson) {
            C7384Etj.A0Y(spacePickerPerson, 0);
            return spacePickerPerson.id;
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C0CD c0cd) {
        C7384Etj.A0Y(c0cd, 0);
        final AHD<SpacePickerPerson> ahd = this.$state.selected;
        final AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        final G0U<SpacePickerPerson, Unit> g0u = this.$onRemove;
        final SpaceCollaboratorPickerScreenKt$SpacePickerChips$1$1$invoke$$inlined$items$default$1 spaceCollaboratorPickerScreenKt$SpacePickerChips$1$1$invoke$$inlined$items$default$1 = new G0U() { // from class: com.facebook.aura.pairs.SpaceCollaboratorPickerScreenKt$SpacePickerChips$1$1$invoke$$inlined$items$default$1
            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return null;
            }

            @Override // X.G0U
            public final Void invoke(SpacePickerPerson spacePickerPerson) {
                return null;
            }
        };
        c0cd.APL(anonymousClass1 != null ? new G0U<Integer, Object>() { // from class: com.facebook.aura.pairs.SpaceCollaboratorPickerScreenKt$SpacePickerChips$1$1$invoke$$inlined$items$default$2
            public final Object invoke(int i) {
                return AnonymousClass006.A0p(ahd, anonymousClass1, i);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(AnonymousClass001.A0F(num));
            }
        } : null, new G0U<Integer, Object>() { // from class: com.facebook.aura.pairs.SpaceCollaboratorPickerScreenKt$SpacePickerChips$1$1$invoke$$inlined$items$default$3
            public final Object invoke(int i) {
                return AnonymousClass006.A0p(ahd, spaceCollaboratorPickerScreenKt$SpacePickerChips$1$1$invoke$$inlined$items$default$1, i);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(AnonymousClass001.A0F(num));
            }
        }, AnonymousClass001.A0M(new G2j<AnonymousClass037, Integer, BFM, Integer, Unit>() { // from class: com.facebook.aura.pairs.SpaceCollaboratorPickerScreenKt$SpacePickerChips$1$1$invoke$$inlined$items$default$4
            public final void invoke(AnonymousClass037 anonymousClass037, int i, BFM bfm, int i2) {
                int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, anonymousClass037) | i2 : i2;
                if ((i2 & 48) == 0) {
                    iA0d |= AnonymousClass004.A0E(bfm, i);
                }
                if (!AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
                    bfm.Afo();
                    return;
                }
                SpacePickerPerson spacePickerPerson = (SpacePickerPerson) ahd.get(i);
                bfm.AgE(-1578725282);
                boolean zA1J = AnonymousClass003.A1J(bfm, g0u, spacePickerPerson);
                Object objAaT = bfm.AaT();
                if (zA1J || objAaT == C78N.A00) {
                    objAaT = new SpaceCollaboratorPickerScreenKt$SpacePickerChips$1$1$2$1$1(g0u, spacePickerPerson);
                    bfm.Ai0(objAaT);
                }
                SpaceCollaboratorPickerScreenKt.SpacePickerChip(spacePickerPerson, (Function0) objAaT, null, bfm, SpacePickerPerson.$stable, 4);
                AnonymousClass002.A19(bfm);
            }

            @Override // X.G2j
            public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, Integer num, BFM bfm, Integer num2) {
                invoke(anonymousClass037, AnonymousClass001.A0F(num), bfm, AnonymousClass001.A0F(num2));
                return Unit.INSTANCE;
            }
        }, 802480018), ahd.size());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SpaceCollaboratorPickerScreenKt$SpacePickerChips$1$1(SpacePickerUiState spacePickerUiState, G0U<? super SpacePickerPerson, Unit> g0u) {
        super(1);
        this.$state = spacePickerUiState;
        this.$onRemove = g0u;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C0CD c0cd) {
        invoke2(c0cd);
        return Unit.INSTANCE;
    }
}
