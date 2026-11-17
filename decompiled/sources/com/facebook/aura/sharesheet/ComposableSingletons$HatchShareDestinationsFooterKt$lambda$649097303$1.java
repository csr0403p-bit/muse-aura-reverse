package com.facebook.aura.sharesheet;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.BFM;
import X.C06G;
import X.C06c;
import X.C1062ATq;
import X.C10G;
import X.C1822Arm;
import X.C1YL;
import X.C3U4;
import X.C7384Etj;
import X.G2j;
import com.facebook.aura.partners.voice.background.VoiceCallForegroundService;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import kotlin.Unit;

/* renamed from: com.facebook.aura.sharesheet.ComposableSingletons$HatchShareDestinationsFooterKt$lambda$-649097303$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$HatchShareDestinationsFooterKt$lambda$649097303$1 extends AbstractC7559F3s implements G2j<C06c, String, BFM, Integer, Unit> {
    public static final ComposableSingletons$HatchShareDestinationsFooterKt$lambda$649097303$1 INSTANCE = new ComposableSingletons$HatchShareDestinationsFooterKt$lambda$649097303$1();

    public ComposableSingletons$HatchShareDestinationsFooterKt$lambda$649097303$1() {
        super(4);
    }

    public final void invoke(C06c c06c, String str, BFM bfm, int i) {
        int iA0e = i;
        C7384Etj.A0Y(c06c, 0);
        if ((i & 48) == 0) {
            iA0e = i | AnonymousClass004.A0e(bfm, str);
        }
        if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA0e & 145, VoiceCallForegroundService.AVATAR_TARGET_PX), bfm, iA0e)) {
            bfm.Afo();
            return;
        }
        if (str == null) {
            bfm.AgE(-1314953755);
        } else {
            C1822Arm c1822Arm = AnonymousClass006.A0k(bfm, -1314953754).footnoteRegular;
            long jA08 = C06G.A08(bfm);
            C1062ATq c1062ATq = C10G.A02;
            float f = AuraDimensKt.SpacingLarge;
            AuraTextKt.m2639AuraTextUY9GdpU(str, C3U4.A0C(c1062ATq, f, AuraDimensKt.SpacingSmall, f, 0.0f), jA08, c1822Arm, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
        }
        AnonymousClass001.A1D(bfm);
    }

    @Override // X.G2j
    public /* bridge */ /* synthetic */ Unit invoke(C06c c06c, String str, BFM bfm, Integer num) {
        invoke(c06c, str, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
