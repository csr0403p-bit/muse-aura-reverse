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
import X.G0U;
import X.G0W;
import com.facebook.aura.ui.HatchLazySectionScope;
import com.facebook.aura.ui.HatchSectionKt;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchSecureStorageScreenKt$HatchSecureStorageScreen$3$5$1 extends AbstractC7559F3s implements G0U<C0CD, Unit> {
    public final /* synthetic */ List<SecureStorageCatalogRow> $catalogRows;
    public final /* synthetic */ G0U<CredentialCandidate, Unit> $onCredentialClick;
    public final /* synthetic */ G0U<CustomConnectorCandidate, Unit> $onCustomConnectorClick;
    public final /* synthetic */ float $topPadding;

    /* renamed from: com.facebook.aura.settings.HatchSecureStorageScreenKt$HatchSecureStorageScreen$3$5$1$1, reason: invalid class name */
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

    /* renamed from: com.facebook.aura.settings.HatchSecureStorageScreenKt$HatchSecureStorageScreen$3$5$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<HatchLazySectionScope, Unit> {
        public final /* synthetic */ List<SecureStorageCatalogRow> $catalogRows;
        public final /* synthetic */ G0U<CredentialCandidate, Unit> $onCredentialClick;
        public final /* synthetic */ G0U<CustomConnectorCandidate, Unit> $onCustomConnectorClick;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(HatchLazySectionScope hatchLazySectionScope) {
            C7384Etj.A0Y(hatchLazySectionScope, 0);
            List<SecureStorageCatalogRow> list = this.$catalogRows;
            G0U<CredentialCandidate, Unit> g0u = this.$onCredentialClick;
            G0U<CustomConnectorCandidate, Unit> g0u2 = this.$onCustomConnectorClick;
            for (SecureStorageCatalogRow secureStorageCatalogRow : list) {
                hatchLazySectionScope.item(secureStorageCatalogRow.key, "catalog_item", AnonymousClass001.A0M(new HatchSecureStorageScreenKt$HatchSecureStorageScreen$3$5$1$2$1$1(secureStorageCatalogRow, g0u, g0u2), -1007524654));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(List<? extends SecureStorageCatalogRow> list, G0U<? super CredentialCandidate, Unit> g0u, G0U<? super CustomConnectorCandidate, Unit> g0u2) {
            super(1);
            this.$catalogRows = list;
            this.$onCredentialClick = g0u;
            this.$onCustomConnectorClick = g0u2;
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
        c0cd.APJ("top_padding", "spacing", AnonymousClass001.A0M(new AnonymousClass1(this.$topPadding), 1746111799));
        HatchSectionKt.m2324HatchSectionlMAxDYE(c0cd, false, "passwords_header", "section_header", ComposableSingletons$HatchSecureStorageScreenKt.f247lambda$161226773, null, new AnonymousClass2(this.$catalogRows, this.$onCredentialClick, this.$onCustomConnectorClick));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchSecureStorageScreenKt$HatchSecureStorageScreen$3$5$1(float f, List<? extends SecureStorageCatalogRow> list, G0U<? super CredentialCandidate, Unit> g0u, G0U<? super CustomConnectorCandidate, Unit> g0u2) {
        super(1);
        this.$topPadding = f;
        this.$catalogRows = list;
        this.$onCredentialClick = g0u;
        this.$onCustomConnectorClick = g0u2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C0CD c0cd) {
        invoke2(c0cd);
        return Unit.INSTANCE;
    }
}
