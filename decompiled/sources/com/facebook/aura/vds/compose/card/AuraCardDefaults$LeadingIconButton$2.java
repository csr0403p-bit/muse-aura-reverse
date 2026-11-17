package com.facebook.aura.vds.compose.card;

import X.AVy;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.B6A;
import X.BFM;
import X.BRg;
import X.C3U4;
import X.G0V;
import X.InterfaceC1072AWd;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.icons.AuraIconButtonBackground;
import com.facebook.aura.vds.compose.icons.AuraIconButtonKt;
import com.facebook.aura.vds.compose.icons.AuraIconButtonSizeV2;
import com.facebook.aura.vds.compose.icons.AuraIconButtonStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraCardDefaults$LeadingIconButton$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ InterfaceC1072AWd $interactionSource;
    public final /* synthetic */ Function0<Unit> $onClick;
    public final /* synthetic */ String $onClickLabel;
    public final /* synthetic */ AVy $painter;
    public final /* synthetic */ long $tint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraCardDefaults$LeadingIconButton$2(AVy aVy, String str, Function0<Unit> function0, boolean z, long j, InterfaceC1072AWd interfaceC1072AWd) {
        super(2);
        this.$painter = aVy;
        this.$onClickLabel = str;
        this.$onClick = function0;
        this.$enabled = z;
        this.$tint = j;
        this.$interactionSource = interfaceC1072AWd;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            BRg bRgA09 = C3U4.A09(BRg.A00, AuraDimensKt.SpacingMicro);
            AVy aVy = this.$painter;
            AuraIconButtonSizeV2 auraIconButtonSizeV2 = AuraIconButtonSizeV2.SMALL;
            AuraIconButtonStyle auraIconButtonStyle = AuraIconButtonStyle.PRIMARY;
            AuraIconButtonBackground auraIconButtonBackground = AuraIconButtonBackground.NO_BACKGROUND;
            String str = this.$onClickLabel;
            if (str == null) {
                str = "";
            }
            AuraIconButtonKt.m2552AuraIconButtonV2imgtlEU(bRgA09, aVy, auraIconButtonSizeV2, auraIconButtonStyle, auraIconButtonBackground, null, str, this.$onClick, null, this.$enabled, new B6A(this.$tint), null, this.$interactionSource, null, bfm, (AVy.$stable << 3) | 28032, 0, 10528);
            return;
        }
        bfm.Afo();
    }
}
