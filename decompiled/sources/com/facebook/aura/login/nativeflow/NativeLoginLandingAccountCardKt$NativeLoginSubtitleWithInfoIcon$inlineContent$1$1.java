package com.facebook.aura.login.nativeflow;

import X.AVy;
import X.AbstractC7559F3s;
import X.AbstractC8407FdO;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.B6A;
import X.BFM;
import X.BRg;
import X.C10G;
import X.C1DG;
import X.G0W;
import android.content.res.Resources;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.icons.AuraIconButtonBackground;
import com.facebook.aura.vds.compose.icons.AuraIconButtonKt;
import com.facebook.aura.vds.compose.icons.AuraIconButtonSizeV2;
import com.facebook.aura.vds.compose.icons.AuraIconButtonStyle;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class NativeLoginLandingAccountCardKt$NativeLoginSubtitleWithInfoIcon$inlineContent$1$1 extends AbstractC7559F3s implements G0W<String, BFM, Integer, Unit> {
    public final /* synthetic */ String $contentDescription;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ Function0<Unit> $onViewProfiles;
    public final /* synthetic */ long $secondaryText;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginLandingAccountCardKt$NativeLoginSubtitleWithInfoIcon$inlineContent$1$1(String str, Function0<Unit> function0, boolean z, long j) {
        super(3);
        this.$contentDescription = str;
        this.$onViewProfiles = function0;
        this.$enabled = z;
        this.$secondaryText = j;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(String str, BFM bfm, Integer num) throws XmlPullParserException, Resources.NotFoundException, IOException {
        invoke(str, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(String str, BFM bfm, int i) throws XmlPullParserException, Resources.NotFoundException, IOException {
        if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, str), bfm, i)) {
            AuraIconButtonKt.m2551AuraIconButtonV2X32rcYo(C10G.A06(C10G.A07(BRg.A00, NativeLoginLandingAccountCardKt.INFO_ICON_PLACEHOLDER_SIZE), 48.0f), AbstractC8407FdO.A00(bfm, R.drawable.aura_login_i_circle_outline_24), AuraIconButtonSizeV2.XM_LARGE, AuraIconButtonStyle.SECONDARY.toConfig(bfm, 6), this.$contentDescription, this.$onViewProfiles, null, this.$enabled, new B6A(this.$secondaryText), new C1DG(16.0f), AuraIconButtonBackground.NO_BACKGROUND, null, "lobster-native-auth-view-profiles", bfm, (AVy.$stable << 3) | 805306758, 390, 2112);
            return;
        }
        bfm.Afo();
    }
}
