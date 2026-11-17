package com.facebook.aura.settings.support;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AuJ;
import X.BFM;
import X.C07C;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import com.facebook.aura.R;
import com.facebook.aura.partners.voice.infra.VideoConfigJsonKt;
import com.facebook.aura.ui.HatchSectionKt;
import com.facebook.aura.ui.HatchSectionScope;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchContactSupportScreenKt$ContactInfoCard$1$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ String $email;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ String $name;
    public final /* synthetic */ G0U<String, Unit> $onEmailChange;
    public final /* synthetic */ G0U<String, Unit> $onNameChange;
    public final /* synthetic */ boolean $showEmailError;

    /* renamed from: com.facebook.aura.settings.support.HatchContactSupportScreenKt$ContactInfoCard$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ String $name;
        public final /* synthetic */ G0U<String, Unit> $onNameChange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(String str, boolean z, G0U<? super String, Unit> g0u) {
            super(3);
            this.$name = str;
            this.$enabled = z;
            this.$onNameChange = g0u;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, c07c), bfm, i)) {
                HatchContactSupportScreenKt.CardTextField(this.$name, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12083f), this.$enabled, true, HatchSectionKt.hatchSectionRowShape(0, 2, bfm, 54), this.$onNameChange, null, false, 0, new AuJ(null, -1, 1, 6), bfm, 805309440, VideoConfigJsonKt.SOURCE_WIDTH);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.settings.support.HatchContactSupportScreenKt$ContactInfoCard$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ String $email;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ G0U<String, Unit> $onEmailChange;
        public final /* synthetic */ boolean $showEmailError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(String str, boolean z, G0U<? super String, Unit> g0u, boolean z2) {
            super(3);
            this.$email = str;
            this.$enabled = z;
            this.$onEmailChange = g0u;
            this.$showEmailError = z2;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            C7384Etj.A0Y(c07c, 0);
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                HatchContactSupportScreenKt.CardTextField(this.$email, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12083e), this.$enabled, true, HatchSectionKt.hatchSectionRowShape(1, 2, bfm, 54), this.$onEmailChange, null, this.$showEmailError, 0, new AuJ(null, -1, 6, 6), bfm, 805309440, HatchContactSupportViewModelKt.MAX_EMAIL_LENGTH);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        AnonymousClass005.A0u(hatchSectionScope, new AnonymousClass1(this.$name, this.$enabled, this.$onNameChange), 547303441);
        AnonymousClass005.A0u(hatchSectionScope, new AnonymousClass2(this.$email, this.$enabled, this.$onEmailChange, this.$showEmailError), -1582897272);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchContactSupportScreenKt$ContactInfoCard$1$1(String str, boolean z, G0U<? super String, Unit> g0u, String str2, G0U<? super String, Unit> g0u2, boolean z2) {
        super(1);
        this.$name = str;
        this.$enabled = z;
        this.$onNameChange = g0u;
        this.$email = str2;
        this.$onEmailChange = g0u2;
        this.$showEmailError = z2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
