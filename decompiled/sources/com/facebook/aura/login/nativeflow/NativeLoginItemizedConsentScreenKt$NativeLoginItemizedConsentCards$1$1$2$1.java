package com.facebook.aura.login.nativeflow;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.ApQ;
import X.B6A;
import X.BFM;
import X.BO6;
import X.BRg;
import X.C06H;
import X.C07C;
import X.C1062ATq;
import X.C10G;
import X.C1822Arm;
import X.C1YL;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0V;
import X.G0W;
import android.content.Context;
import com.facebook.aura.vds.compose.card.AuraCardContent;
import com.facebook.aura.vds.compose.card.AuraCardKt;
import com.facebook.aura.vds.compose.card.AuraCardStyle;
import com.facebook.aura.vds.compose.card.AuraCardType;
import com.facebook.aura.vds.compose.card.SettingsKt;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndBodyStyle;
import com.facebook.aura.vds.compose.typegroup.AuraIconAndHeadlineStyle;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class NativeLoginItemizedConsentScreenKt$NativeLoginItemizedConsentCards$1$1$2$1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
    public final /* synthetic */ AHD<Boolean> $accepted;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ int $index;
    public final /* synthetic */ boolean $isLoading;
    public final /* synthetic */ HatchConsentItem $item;
    public final /* synthetic */ long $linkColor;
    public final /* synthetic */ G0V<Integer, Boolean, Unit> $onItemToggled;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NativeLoginItemizedConsentScreenKt$NativeLoginItemizedConsentCards$1$1$2$1(HatchConsentItem hatchConsentItem, long j, boolean z, Context context, AHD<Boolean> ahd, int i, G0V<? super Integer, ? super Boolean, Unit> g0v) {
        super(3);
        this.$item = hatchConsentItem;
        this.$linkColor = j;
        this.$isLoading = z;
        this.$context = context;
        this.$accepted = ahd;
        this.$index = i;
        this.$onItemToggled = g0v;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
        invoke(c07c, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(C07C c07c, BFM bfm, int i) {
        Object obj;
        C7384Etj.A0Y(c07c, 0);
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            boolean zA65 = bfm.A65(this.$item) | bfm.A64(this.$linkColor);
            HatchConsentItem hatchConsentItem = this.$item;
            long j = this.$linkColor;
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = NativeLoginItemizedConsentScreenKt.m1292sentenceText4WTKRHQ(hatchConsentItem, j);
                bfm.Ai0(objAaT);
            }
            ApQ apQ = (ApQ) objAaT;
            AuraCardType.Toggle toggle = AuraCardType.Toggle.INSTANCE;
            C1062ATq c1062ATq = C10G.A02;
            boolean zA67 = bfm.A67(this.$item);
            HatchConsentItem hatchConsentItem2 = this.$item;
            Object objAaT2 = bfm.AaT();
            if (zA67 || objAaT2 == C78N.A00) {
                objAaT2 = new NativeLoginItemizedConsentScreenKt$NativeLoginItemizedConsentCards$1$1$2$1$1$1(hatchConsentItem2);
                bfm.Ai0(objAaT2);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(c1062ATq, objAaT2, false);
            AuraCardStyle auraCardStyleCardStyleForSettings = SettingsKt.cardStyleForSettings(null, bfm, 0, 1);
            boolean z = !this.$isLoading;
            AuraIconAndHeadlineStyle auraIconAndHeadlineStyle = AuraIconAndHeadlineStyle.BODY_REGULAR;
            ApQ apQA0X = AnonymousClass005.A0X(this.$item.title);
            boolean zA672 = bfm.A67(this.$context);
            Context context = this.$context;
            Object objAaT3 = bfm.AaT();
            if (zA672 || objAaT3 == C78N.A00) {
                objAaT3 = new NativeLoginItemizedConsentScreenKt$NativeLoginItemizedConsentCards$1$1$2$1$2$1(context);
                bfm.Ai0(objAaT3);
            }
            AuraCardContent auraCardContent = new AuraCardContent(apQA0X, auraIconAndHeadlineStyle, (BO6) null, (B6A) null, apQ, (G0U) objAaT3, (AuraIconAndBodyStyle) null, (B6A) null, (String) null, (C1822Arm) null, 0, 0, 0, (String) null, false, false, (ApQ) null, (C1822Arm) null, 0L, 0L, (C1YL) null, 2080716, (C06H) null);
            AHD<Boolean> ahd = this.$accepted;
            int i2 = this.$index;
            if (i2 >= 0 && i2 < ahd.size()) {
                obj = ahd.get(i2);
            } else {
                obj = false;
            }
            Boolean bool = (Boolean) obj;
            boolean zA1a = AnonymousClass001.A1a(bfm.A65(this.$onItemToggled), bfm, this.$index);
            G0V<Integer, Boolean, Unit> g0v = this.$onItemToggled;
            int i3 = this.$index;
            Object objAaT4 = bfm.AaT();
            if (zA1a || objAaT4 == C78N.A00) {
                objAaT4 = new NativeLoginItemizedConsentScreenKt$NativeLoginItemizedConsentCards$1$1$2$1$4$1(g0v, i3);
                bfm.Ai0(objAaT4);
            }
            AuraCardKt.m2484AuraCardjQVUvHA(bRgA0Y, auraCardStyleCardStyleForSettings, auraCardContent, toggle, null, null, null, bool, (G0U) objAaT4, null, z, false, null, null, 0L, false, null, null, bfm, 3072, 0, 260720);
            return;
        }
        bfm.Afo();
    }
}
