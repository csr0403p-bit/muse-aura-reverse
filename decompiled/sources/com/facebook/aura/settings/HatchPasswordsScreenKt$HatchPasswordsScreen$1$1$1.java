package com.facebook.aura.settings;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass037;
import X.B1V;
import X.BFM;
import X.BRg;
import X.C01N;
import X.C0CD;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import X.G0W;
import com.facebook.aura.R;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import com.facebook.aura.ui.HatchLazySectionScope;
import com.facebook.aura.ui.HatchSectionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchPasswordsScreenKt$HatchPasswordsScreen$1$1$1 extends AbstractC7559F3s implements G0U<C0CD, Unit> {
    public final /* synthetic */ Function0<Unit> $onOnePasswordClick;
    public final /* synthetic */ Function0<Unit> $onSecureStoreClick;
    public final /* synthetic */ float $topPadding;

    /* renamed from: com.facebook.aura.settings.HatchPasswordsScreenKt$HatchPasswordsScreen$1$1$1$1, reason: invalid class name */
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

    /* renamed from: com.facebook.aura.settings.HatchPasswordsScreenKt$HatchPasswordsScreen$1$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<HatchLazySectionScope, Unit> {
        public final /* synthetic */ Function0<Unit> $onOnePasswordClick;
        public final /* synthetic */ Function0<Unit> $onSecureStoreClick;

        /* renamed from: com.facebook.aura.settings.HatchPasswordsScreenKt$HatchPasswordsScreen$1$1$1$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
            public final /* synthetic */ Function0<Unit> $onSecureStoreClick;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Function0<Unit> function0) {
                super(2);
                this.$onSecureStoreClick = function0;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                invoke(bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }

            public final void invoke(BFM bfm, int i) {
                if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                    HatchPasswordsScreenKt.PasswordManagerRow(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120eb3), this.$onSecureStoreClick, ComposableSingletons$HatchPasswordsScreenKt.lambda$1225833456, null, bfm, 384, 8);
                } else {
                    bfm.Afo();
                }
            }
        }

        /* renamed from: com.facebook.aura.settings.HatchPasswordsScreenKt$HatchPasswordsScreen$1$1$1$2$2, reason: invalid class name and collision with other inner class name */
        public final class C03492 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
            public final /* synthetic */ Function0<Unit> $onOnePasswordClick;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03492(Function0<Unit> function0) {
                super(2);
                this.$onOnePasswordClick = function0;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                invoke(bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }

            public final void invoke(BFM bfm, int i) {
                if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                    HatchPasswordsScreenKt.PasswordManagerRow(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ea6), this.$onOnePasswordClick, ComposableSingletons$HatchPasswordsScreenKt.f243lambda$555662873, null, bfm, 384, 8);
                } else {
                    bfm.Afo();
                }
            }
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(HatchLazySectionScope hatchLazySectionScope) {
            C7384Etj.A0Y(hatchLazySectionScope, 0);
            hatchLazySectionScope.item("secure_store", "password_manager", B1V.A01(new AnonymousClass1(this.$onSecureStoreClick), 129339897, true));
            hatchLazySectionScope.item("onepassword", "password_manager", B1V.A01(new C03492(this.$onOnePasswordClick), -2018985552, true));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Function0<Unit> function0, Function0<Unit> function02) {
            super(1);
            this.$onSecureStoreClick = function0;
            this.$onOnePasswordClick = function02;
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
        c0cd.APJ("top_padding", "spacing", AnonymousClass001.A0M(new AnonymousClass1(this.$topPadding), -1098069652));
        c0cd.APJ(HatchWebPageParserKt.DESCRIPTION, HatchWebPageParserKt.DESCRIPTION, ComposableSingletons$HatchPasswordsScreenKt.f242lambda$236035869);
        HatchSectionKt.m2324HatchSectionlMAxDYE(c0cd, false, "password_managers_header", "section_header", ComposableSingletons$HatchPasswordsScreenKt.f240lambda$103552224, null, new AnonymousClass2(this.$onSecureStoreClick, this.$onOnePasswordClick));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchPasswordsScreenKt$HatchPasswordsScreen$1$1$1(float f, Function0<Unit> function0, Function0<Unit> function02) {
        super(1);
        this.$topPadding = f;
        this.$onSecureStoreClick = function0;
        this.$onOnePasswordClick = function02;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C0CD c0cd) {
        invoke2(c0cd);
        return Unit.INSTANCE;
    }
}
