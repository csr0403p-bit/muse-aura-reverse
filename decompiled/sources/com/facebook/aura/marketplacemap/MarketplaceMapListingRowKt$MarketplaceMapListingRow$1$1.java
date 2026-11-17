package com.facebook.aura.marketplacemap;

import X.AbstractC1564Ale;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC0857A6e;
import com.facebook.aura.model.MarketplaceMapListing;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class MarketplaceMapListingRowKt$MarketplaceMapListingRow$1$1 extends AbstractC7559F3s implements G0U<InterfaceC0857A6e, Unit> {
    public final /* synthetic */ String $description;
    public final /* synthetic */ boolean $isSelected;
    public final /* synthetic */ MarketplaceMapListing $listing;
    public final /* synthetic */ Function0<Unit> $onClick;

    /* renamed from: com.facebook.aura.marketplacemap.MarketplaceMapListingRowKt$MarketplaceMapListingRow$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Boolean> {
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Function0<Unit> function0) {
            super(0);
            this.$onClick = function0;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            this.$onClick.invoke();
            return AnonymousClass001.A0i();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC0857A6e interfaceC0857A6e) {
        C7384Etj.A0Y(interfaceC0857A6e, 0);
        AbstractC1564Ale.A08(interfaceC0857A6e, this.$description);
        AbstractC1564Ale.A06(interfaceC0857A6e, 0);
        AbstractC1564Ale.A0E(interfaceC0857A6e, this.$isSelected);
        if (this.$listing.isUnavailable) {
            AbstractC1564Ale.A02(interfaceC0857A6e);
        } else {
            AbstractC1564Ale.A0A(interfaceC0857A6e, null, new AnonymousClass1(this.$onClick));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketplaceMapListingRowKt$MarketplaceMapListingRow$1$1(String str, boolean z, MarketplaceMapListing marketplaceMapListing, Function0<Unit> function0) {
        super(1);
        this.$description = str;
        this.$isSelected = z;
        this.$listing = marketplaceMapListing;
        this.$onClick = function0;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC0857A6e interfaceC0857A6e) {
        invoke2(interfaceC0857A6e);
        return Unit.INSTANCE;
    }
}
