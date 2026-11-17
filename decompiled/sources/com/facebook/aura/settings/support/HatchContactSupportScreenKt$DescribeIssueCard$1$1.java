package com.facebook.aura.settings.support;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass006;
import X.BFM;
import X.C07C;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import com.facebook.aura.R;
import com.facebook.aura.ui.HatchSectionKt;
import com.facebook.aura.ui.HatchSectionScope;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchContactSupportScreenKt$DescribeIssueCard$1$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ String $description;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ G0U<String, Unit> $onDescriptionChange;

    /* renamed from: com.facebook.aura.settings.support.HatchContactSupportScreenKt$DescribeIssueCard$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ String $description;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ G0U<String, Unit> $onDescriptionChange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(String str, boolean z, G0U<? super String, Unit> g0u) {
            super(3);
            this.$description = str;
            this.$enabled = z;
            this.$onDescriptionChange = g0u;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                HatchContactSupportScreenKt.CardTextField(this.$description, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12083a), this.$enabled, false, HatchSectionKt.hatchSectionRowShape(0, 1, bfm, 54), this.$onDescriptionChange, null, false, 5, null, bfm, 100666368, 704);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        AnonymousClass006.A1E(hatchSectionScope, new AnonymousClass1(this.$description, this.$enabled, this.$onDescriptionChange), 1761306637);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchContactSupportScreenKt$DescribeIssueCard$1$1(String str, boolean z, G0U<? super String, Unit> g0u) {
        super(1);
        this.$description = str;
        this.$enabled = z;
        this.$onDescriptionChange = g0u;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
