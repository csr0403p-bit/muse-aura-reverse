package com.facebook.aura.skills.connect;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AuJ;
import X.BFM;
import X.BRg;
import X.C06G;
import X.C07C;
import X.C1YP;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import com.facebook.aura.ui.HatchSectionKt;
import com.facebook.aura.ui.HatchSectionScope;
import com.facebook.aura.vds.compose.input.AuraTextInputKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class CustomConnectorAuthScreenKt$CustomConnectorOAuthFields$1$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ String $clientId;
    public final /* synthetic */ String $clientSecret;
    public final /* synthetic */ int $fieldCount;
    public final /* synthetic */ G0U<String, Unit> $onClientIdChanged;
    public final /* synthetic */ G0U<String, Unit> $onClientSecretChanged;
    public final /* synthetic */ boolean $requiresClientSecret;

    /* renamed from: com.facebook.aura.skills.connect.CustomConnectorAuthScreenKt$CustomConnectorOAuthFields$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ String $clientId;
        public final /* synthetic */ int $fieldCount;
        public final /* synthetic */ G0U<String, Unit> $onClientIdChanged;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(int i, String str, G0U<? super String, Unit> g0u) {
            super(3);
            this.$fieldCount = i;
            this.$clientId = str;
            this.$onClientIdChanged = g0u;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, c07c), bfm, i)) {
                AuraTextInputKt.AuraTextInput(this.$clientId, null, AnonymousClass006.A0N(BRg.A00), ComposableSingletons$CustomConnectorAuthScreenKt.f278lambda$1872168108, null, null, null, null, true, 0, 0, null, null, C06G.A0b(bfm), null, false, false, false, false, HatchSectionKt.hatchSectionRowShape(0, this.$fieldCount, bfm, 6), this.$onClientIdChanged, bfm, 100666752, 0, 0, 515826);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.skills.connect.CustomConnectorAuthScreenKt$CustomConnectorOAuthFields$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ String $clientSecret;
        public final /* synthetic */ int $fieldCount;
        public final /* synthetic */ G0U<String, Unit> $onClientSecretChanged;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(int i, String str, G0U<? super String, Unit> g0u) {
            super(3);
            this.$fieldCount = i;
            this.$clientSecret = str;
            this.$onClientSecretChanged = g0u;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            C7384Etj.A0Y(c07c, 0);
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                BRg bRgA0N = AnonymousClass006.A0N(BRg.A00);
                C1YP c1yp = new C1YP();
                AuraTextInputKt.AuraTextInput(this.$clientSecret, null, bRgA0N, ComposableSingletons$CustomConnectorAuthScreenKt.f277lambda$1167019239, new AuJ(null, -1, 7, -1), null, c1yp, null, true, 0, 0, null, null, C06G.A0b(bfm), null, false, false, false, false, HatchSectionKt.hatchSectionRowShape(1, this.$fieldCount, bfm, 6), this.$onClientSecretChanged, bfm, 100691328, 0, 0, 515746);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        AnonymousClass005.A0u(hatchSectionScope, new AnonymousClass1(this.$fieldCount, this.$clientId, this.$onClientIdChanged), -219396032);
        if (this.$requiresClientSecret) {
            AnonymousClass005.A0u(hatchSectionScope, new AnonymousClass2(this.$fieldCount, this.$clientSecret, this.$onClientSecretChanged), 1025100037);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CustomConnectorAuthScreenKt$CustomConnectorOAuthFields$1$1(boolean z, int i, String str, G0U<? super String, Unit> g0u, String str2, G0U<? super String, Unit> g0u2) {
        super(1);
        this.$requiresClientSecret = z;
        this.$fieldCount = i;
        this.$clientId = str;
        this.$onClientIdChanged = g0u;
        this.$clientSecret = str2;
        this.$onClientSecretChanged = g0u2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
