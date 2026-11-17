package com.facebook.aura.subscription.view;

import X.AVy;
import X.AbstractC2022Awb;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass011;
import X.B6A;
import X.BFM;
import X.BOf;
import X.BRg;
import X.BS0;
import X.C06G;
import X.C78N;
import X.G0U;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.card.AuraCardDefaults;
import com.facebook.aura.vds.compose.controls.AuraCheckboxKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HomeLinkClaimCardKt {

    /* renamed from: com.facebook.aura.subscription.view.HomeLinkClaimCardKt$HomeLinkClaimCard$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ Boolean $checked;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Boolean bool, Function0<Unit> function0) {
            super(2);
            this.$checked = bool;
            this.$onClick = function0;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass003.A16(i & 3), bfm, i)) {
                if (this.$checked == null) {
                    bfm.AgE(-270942153);
                    AuraCardDefaults.INSTANCE.m2478LeadingIcongKt5lHk(null, BOf.A00(bfm, R.drawable.circleplus_outline_24_wght400_light, 0), new B6A(C06G.A07(bfm)), bfm, (AVy.$stable << 3) | 3072, 1);
                } else {
                    bfm.AgE(-270724347);
                    boolean zBooleanValue = this.$checked.booleanValue();
                    long jA07 = C06G.A07(bfm);
                    BS0 bs0 = BRg.A00;
                    Object objAaT = bfm.AaT();
                    Object obj = C78N.A00;
                    if (objAaT == obj) {
                        objAaT = HomeLinkClaimCardKt$HomeLinkClaimCard$3$1$1.INSTANCE;
                        bfm.Ai0(objAaT);
                    }
                    BRg bRgA0X = AnonymousClass001.A0X(bs0, objAaT);
                    Object objAaT2 = bfm.AaT();
                    if (objAaT2 == obj) {
                        objAaT2 = HomeLinkClaimCardKt$HomeLinkClaimCard$3$2$1.INSTANCE;
                        bfm.Ai0(objAaT2);
                    }
                    BRg bRgA00 = AbstractC2022Awb.A00(bRgA0X, (G0U) objAaT2);
                    boolean zA65 = bfm.A65(this.$onClick);
                    Function0<Unit> function0 = this.$onClick;
                    Object objAaT3 = bfm.AaT();
                    if (zA65 || objAaT3 == obj) {
                        objAaT3 = new HomeLinkClaimCardKt$HomeLinkClaimCard$3$3$1(function0);
                        bfm.Ai0(objAaT3);
                    }
                    AuraCheckboxKt.m2528AuraCheckboxO7ixnI(bRgA00, false, zBooleanValue, (G0U) objAaT3, null, 0L, new B6A(jA07), bfm, 0, 50);
                }
                AnonymousClass001.A1D(bfm);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.subscription.view.HomeLinkClaimCardKt$HomeLinkClaimCard$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Boolean $checked;
        public final /* synthetic */ String $label;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ String $subtitle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(String str, String str2, Function0<Unit> function0, BRg bRg, Boolean bool, int i, int i2) {
            super(2);
            this.$label = str;
            this.$subtitle = str2;
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$checked = bool;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HomeLinkClaimCardKt.HomeLinkClaimCard(this.$label, this.$subtitle, this.$onClick, this.$modifier, this.$checked, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HomeLinkClaimCard(java.lang.String r56, java.lang.String r57, kotlin.jvm.functions.Function0<kotlin.Unit> r58, X.BRg r59, java.lang.Boolean r60, X.BFM r61, int r62, int r63) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.subscription.view.HomeLinkClaimCardKt.HomeLinkClaimCard(java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, X.BRg, java.lang.Boolean, X.BFM, int, int):void");
    }
}
