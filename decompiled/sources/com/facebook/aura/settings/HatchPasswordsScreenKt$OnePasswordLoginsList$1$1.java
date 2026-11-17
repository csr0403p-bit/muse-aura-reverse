package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass037;
import X.BFM;
import X.BRg;
import X.C01N;
import X.C0CD;
import X.C7384Etj;
import X.FGI;
import X.G0U;
import X.G0W;
import com.facebook.aura.ui.HatchLazySectionScope;
import com.facebook.aura.ui.HatchSectionKt;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchPasswordsScreenKt$OnePasswordLoginsList$1$1 extends AbstractC7559F3s implements G0U<C0CD, Unit> {
    public final /* synthetic */ List<CredentialCandidate> $logins;
    public final /* synthetic */ G0U<CredentialCandidate, Unit> $onCredentialClick;
    public final /* synthetic */ float $topPadding;

    /* renamed from: com.facebook.aura.settings.HatchPasswordsScreenKt$OnePasswordLoginsList$1$1$1, reason: invalid class name */
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

    /* renamed from: com.facebook.aura.settings.HatchPasswordsScreenKt$OnePasswordLoginsList$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<HatchLazySectionScope, Unit> {
        public final /* synthetic */ List<CredentialCandidate> $logins;
        public final /* synthetic */ G0U<CredentialCandidate, Unit> $onCredentialClick;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(HatchLazySectionScope hatchLazySectionScope) {
            C7384Etj.A0Y(hatchLazySectionScope, 0);
            List<CredentialCandidate> list = this.$logins;
            G0U<CredentialCandidate, Unit> g0u = this.$onCredentialClick;
            for (CredentialCandidate credentialCandidate : list) {
                hatchLazySectionScope.item(FGI.A0M("credential:", credentialCandidate.id), "catalog_item", AnonymousClass001.A0M(new HatchPasswordsScreenKt$OnePasswordLoginsList$1$1$2$1$1(credentialCandidate, g0u), 1006666841));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(List<CredentialCandidate> list, G0U<? super CredentialCandidate, Unit> g0u) {
            super(1);
            this.$logins = list;
            this.$onCredentialClick = g0u;
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
        c0cd.APJ("top_padding", "spacing", AnonymousClass001.A0M(new AnonymousClass1(this.$topPadding), 1211673339));
        HatchSectionKt.m2324HatchSectionlMAxDYE(c0cd, false, "used_header", "section_header", ComposableSingletons$HatchPasswordsScreenKt.f241lambda$2032001081, null, new AnonymousClass2(this.$logins, this.$onCredentialClick));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchPasswordsScreenKt$OnePasswordLoginsList$1$1(float f, List<CredentialCandidate> list, G0U<? super CredentialCandidate, Unit> g0u) {
        super(1);
        this.$topPadding = f;
        this.$logins = list;
        this.$onCredentialClick = g0u;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C0CD c0cd) {
        invoke2(c0cd);
        return Unit.INSTANCE;
    }
}
