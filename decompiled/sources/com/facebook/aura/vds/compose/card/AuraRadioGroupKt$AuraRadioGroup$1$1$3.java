package com.facebook.aura.vds.compose.card;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.ApQ;
import X.B1V;
import X.B6A;
import X.BFM;
import X.BO6;
import X.C07C;
import X.C0953AJg;
import X.C10543Hqv;
import X.C14P;
import X.C1822Arm;
import X.C1YL;
import X.C78N;
import X.G0U;
import X.G0V;
import X.G0W;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndBodyStyle;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndHeadlineStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraRadioGroupKt$AuraRadioGroup$1$1$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ C10543Hqv<String> $contentDescriptionValue;
    public final /* synthetic */ int $index;
    public final /* synthetic */ AuraRadioTapOption $option;
    public final /* synthetic */ SnapshotStateList<AuraRadioTapOption> $options;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraRadioGroupKt$AuraRadioGroup$1$1$3(AuraRadioTapOption auraRadioTapOption, C10543Hqv<String> c10543Hqv, SnapshotStateList<AuraRadioTapOption> snapshotStateList, int i) {
        super(2);
        this.$option = auraRadioTapOption;
        this.$contentDescriptionValue = c10543Hqv;
        this.$options = snapshotStateList;
        this.$index = i;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r56v0, types: [X.BFM, java.lang.Object] */
    public final void invoke(BFM bfm, int i) {
        String str;
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            AuraRadioTapOption auraRadioTapOption = this.$option;
            String str2 = auraRadioTapOption.title;
            AuraIconAndHeadlineStyle auraIconAndHeadlineStyle = AuraIconAndHeadlineStyle.BODY_REGULAR;
            ApQ apQ = auraRadioTapOption.subtitle;
            G0V g0vA00 = null;
            if (auraRadioTapOption.enabled) {
                str = this.$contentDescriptionValue.element;
            } else {
                str = null;
            }
            C0953AJg c0953AJgA00 = C0953AJg.A00();
            long j = B6A.A07;
            AuraCardContent auraCardContent = new AuraCardContent(str2, auraIconAndHeadlineStyle, (BO6<String, C14P>) c0953AJgA00, (B6A) null, apQ, (G0U<? super String, Unit>) null, (AuraIconAndBodyStyle) null, (B6A) null, (String) null, (C1822Arm) null, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, str, true, true, (String) null, (C1822Arm) null, j, j, (C1YL) null);
            G0V g0v = this.$option.leading;
            if (g0v == null) {
                bfm.AgE(-526406409);
                Integer num = this.$option.icon;
                if (num == null) {
                    bfm.AgE(-526406410);
                } else {
                    bfm.AgE(-526406409);
                    g0vA00 = B1V.A00(bfm, new AuraRadioGroupKt$AuraRadioGroup$1$1$3$1$1(this.$option, num.intValue()), -1752536153);
                }
                AnonymousClass006.A1N(bfm);
            } else {
                AnonymousClass003.A0l(bfm, -1125361090);
                g0vA00 = g0v;
            }
            AuraRadioTapOption auraRadioTapOption2 = this.$option;
            AuraCardType auraCardType = auraRadioTapOption2.type;
            boolean z = auraRadioTapOption2.enabled;
            boolean z2 = auraRadioTapOption2.checked;
            AuraCardStyle auraCardStyleM2500listoAWOtXo = AuraCardStyles.INSTANCE.m2500listoAWOtXo(null, 0L, null, bfm, 3072, 7);
            AuraRadioTapOption auraRadioTapOption3 = this.$option;
            G0W<C07C, BFM, Integer, Unit> g0w = auraRadioTapOption3.footerComposable;
            boolean zA1a = AnonymousClass001.A1a(AnonymousClass001.A1R(bfm, this.$options, bfm.A67(auraRadioTapOption3)), bfm, this.$index);
            AuraRadioTapOption auraRadioTapOption4 = this.$option;
            SnapshotStateList<AuraRadioTapOption> snapshotStateList = this.$options;
            int i2 = this.$index;
            Object objAaT = bfm.AaT();
            if (zA1a || objAaT == C78N.A00) {
                objAaT = new AuraRadioGroupKt$AuraRadioGroup$1$1$3$2$1(auraRadioTapOption4, snapshotStateList, i2);
                bfm.Ai0(objAaT);
            }
            Function0 function0 = (Function0) objAaT;
            Boolean boolValueOf = Boolean.valueOf(z2);
            boolean zA1a2 = AnonymousClass001.A1a(AnonymousClass001.A1R(bfm, this.$options, bfm.A67(this.$option)), bfm, this.$index);
            AuraRadioTapOption auraRadioTapOption5 = this.$option;
            SnapshotStateList<AuraRadioTapOption> snapshotStateList2 = this.$options;
            int i3 = this.$index;
            Object objAaT2 = bfm.AaT();
            if (zA1a2 || objAaT2 == C78N.A00) {
                objAaT2 = new AuraRadioGroupKt$AuraRadioGroup$1$1$3$3$1(auraRadioTapOption5, snapshotStateList2, i3);
                bfm.Ai0(objAaT2);
            }
            AuraCardKt.m2484AuraCardjQVUvHA(null, auraCardStyleM2500listoAWOtXo, auraCardContent, auraCardType, g0vA00, null, function0, boolValueOf, (G0U) objAaT2, null, z, false, null, null, 0L, false, g0w, null, bfm, AuraCardType.$stable << 9, 0, 195105);
            return;
        }
        bfm.Afo();
    }
}
