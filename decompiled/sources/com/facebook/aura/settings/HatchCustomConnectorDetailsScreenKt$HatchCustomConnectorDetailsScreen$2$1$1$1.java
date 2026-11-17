package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.AnonymousClass037;
import X.BFM;
import X.BRg;
import X.C01N;
import X.C06G;
import X.C0CD;
import X.C1822Arm;
import X.C1DM;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0V;
import X.G0W;
import com.facebook.aura.navigation.key.SecureStorageCustomConnectorDetailsScreenKey;
import com.facebook.aura.perf.HatchConnectorQplLogger;
import com.facebook.aura.ui.HatchLazySectionScope;
import com.facebook.aura.ui.HatchSectionKt;
import com.facebook.aura.vds.compose.input.AuraTextInputKt;
import com.facebook.aura.vds.compose.theme.AuraColorsTextInput;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchCustomConnectorDetailsScreenKt$HatchCustomConnectorDetailsScreen$2$1$1$1 extends AbstractC7559F3s implements G0U<C0CD, Unit> {
    public final /* synthetic */ SecureStorageCustomConnectorDetailsScreenKey $key;
    public final /* synthetic */ String $passwordMask;
    public final /* synthetic */ float $topPadding;

    /* renamed from: com.facebook.aura.settings.HatchCustomConnectorDetailsScreenKt$HatchCustomConnectorDetailsScreen$2$1$1$1$1, reason: invalid class name */
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

    /* renamed from: com.facebook.aura.settings.HatchCustomConnectorDetailsScreenKt$HatchCustomConnectorDetailsScreen$2$1$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<HatchLazySectionScope, Unit> {
        public final /* synthetic */ SecureStorageCustomConnectorDetailsScreenKey $key;

        /* renamed from: com.facebook.aura.settings.HatchCustomConnectorDetailsScreenKt$HatchCustomConnectorDetailsScreen$2$1$1$1$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
            public final /* synthetic */ SecureStorageCustomConnectorDetailsScreenKey $key;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(SecureStorageCustomConnectorDetailsScreenKey secureStorageCustomConnectorDetailsScreenKey) {
                super(2);
                this.$key = secureStorageCustomConnectorDetailsScreenKey;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                invoke(bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }

            public final void invoke(BFM bfm, int i) {
                if (AnonymousClass001.A1b(AnonymousClass003.A16(i & 3), bfm, i)) {
                    String str = this.$key.host;
                    BRg bRgA0N = AnonymousClass006.A0N(BRg.A00);
                    C1822Arm c1822ArmA0T = C06G.A0T(bfm);
                    AuraColorsTextInput auraColorsTextInputA0b = C06G.A0b(bfm);
                    C1DM c1dmHatchSectionRowShape = HatchSectionKt.hatchSectionRowShape(0, 1, bfm, 54);
                    Object objAaT = bfm.AaT();
                    if (objAaT == C78N.A00) {
                        objAaT = HatchCustomConnectorDetailsScreenKt$HatchCustomConnectorDetailsScreen$2$1$1$1$2$1$1$1.INSTANCE;
                        bfm.Ai0(objAaT);
                    }
                    AuraTextInputKt.AuraTextInput(str, null, bRgA0N, null, null, null, null, c1822ArmA0T, true, 0, 0, null, null, auraColorsTextInputA0b, null, false, true, false, false, c1dmHatchSectionRowShape, (G0U) objAaT, bfm, 100663680, 1572864, 6, 450170);
                    return;
                }
                bfm.Afo();
            }
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(HatchLazySectionScope hatchLazySectionScope) {
            C7384Etj.A0Y(hatchLazySectionScope, 0);
            hatchLazySectionScope.item("host", "field", AnonymousClass001.A0M(new AnonymousClass1(this.$key), 1487643304));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SecureStorageCustomConnectorDetailsScreenKey secureStorageCustomConnectorDetailsScreenKey) {
            super(1);
            this.$key = secureStorageCustomConnectorDetailsScreenKey;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(HatchLazySectionScope hatchLazySectionScope) {
            invoke2(hatchLazySectionScope);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchCustomConnectorDetailsScreenKt$HatchCustomConnectorDetailsScreen$2$1$1$1$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0U<HatchLazySectionScope, Unit> {
        public final /* synthetic */ String $passwordMask;

        /* renamed from: com.facebook.aura.settings.HatchCustomConnectorDetailsScreenKt$HatchCustomConnectorDetailsScreen$2$1$1$1$3$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
            public final /* synthetic */ String $passwordMask;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(String str) {
                super(2);
                this.$passwordMask = str;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                invoke(bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }

            public final void invoke(BFM bfm, int i) {
                if (AnonymousClass001.A1b(AnonymousClass003.A16(i & 3), bfm, i)) {
                    BRg bRgA0N = AnonymousClass006.A0N(BRg.A00);
                    C1822Arm c1822ArmA0T = C06G.A0T(bfm);
                    AuraColorsTextInput auraColorsTextInputA0b = C06G.A0b(bfm);
                    C1DM c1dmHatchSectionRowShape = HatchSectionKt.hatchSectionRowShape(0, 1, bfm, 54);
                    String str = this.$passwordMask;
                    Object objAaT = bfm.AaT();
                    if (objAaT == C78N.A00) {
                        objAaT = HatchCustomConnectorDetailsScreenKt$HatchCustomConnectorDetailsScreen$2$1$1$1$3$1$1$1.INSTANCE;
                        bfm.Ai0(objAaT);
                    }
                    AuraTextInputKt.AuraTextInput(str, null, bRgA0N, null, null, null, null, c1822ArmA0T, true, 0, 0, null, null, auraColorsTextInputA0b, null, false, true, false, false, c1dmHatchSectionRowShape, (G0U) objAaT, bfm, 100663680, 1572864, 6, 450170);
                    return;
                }
                bfm.Afo();
            }
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(HatchLazySectionScope hatchLazySectionScope) {
            C7384Etj.A0Y(hatchLazySectionScope, 0);
            hatchLazySectionScope.item(HatchConnectorQplLogger.AuthType.PASSWORD, "field", AnonymousClass001.A0M(new AnonymousClass1(this.$passwordMask), 1332791199));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str) {
            super(1);
            this.$passwordMask = str;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(HatchLazySectionScope hatchLazySectionScope) {
            invoke2(hatchLazySectionScope);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C0CD c0cd) {
        C7384Etj.A0Y(c0cd, 0);
        c0cd.APJ("top_padding", "spacing", AnonymousClass001.A0M(new AnonymousClass1(this.$topPadding), 1402028507));
        HatchSectionKt.m2324HatchSectionlMAxDYE(c0cd, false, null, null, null, null, new AnonymousClass2(this.$key));
        c0cd.APJ("field_spacing", "spacing", ComposableSingletons$HatchCustomConnectorDetailsScreenKt.lambda$661349906);
        HatchSectionKt.m2324HatchSectionlMAxDYE(c0cd, false, null, null, null, null, new AnonymousClass3(this.$passwordMask));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchCustomConnectorDetailsScreenKt$HatchCustomConnectorDetailsScreen$2$1$1$1(float f, SecureStorageCustomConnectorDetailsScreenKey secureStorageCustomConnectorDetailsScreenKey, String str) {
        super(1);
        this.$topPadding = f;
        this.$key = secureStorageCustomConnectorDetailsScreenKey;
        this.$passwordMask = str;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C0CD c0cd) {
        invoke2(c0cd);
        return Unit.INSTANCE;
    }
}
