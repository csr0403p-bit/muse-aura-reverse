package com.facebook.aura.browsertask.screen;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C7384Etj;
import X.G0V;
import com.facebook.aura.agentpermission.AgentComputerApprovalBannerKt;
import com.facebook.aura.localbrowser.LocalBrowserScreenKt;
import com.facebook.aura.vmbrowser.VmBrowserViewerKt;
import kotlin.Unit;

/* loaded from: classes2.dex */
public abstract class BrowserTaskScreensKt {
    public static final void LocalBrowserTaskScreen(final String str, final boolean z, BRg bRg, BFM bfm, final int i, final int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(-1134207631);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            LocalBrowserScreenKt.LocalBrowserScreen(str, z, AgentComputerApprovalBannerKt.rememberAgentComputerApprovalBanner(bfm, 0), bRg2, bfm, (iA0d & 126) | ((iA0d << 3) & 7168), 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            final BRg bRg3 = bRg2;
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.browsertask.screen.BrowserTaskScreensKt$$ExternalSyntheticLambda0
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    String str2 = str;
                    boolean z2 = z;
                    BRg bRg4 = bRg3;
                    int i4 = i;
                    BrowserTaskScreensKt.LocalBrowserTaskScreen(str2, z2, bRg4, (BFM) obj, AnonymousClass011.A02(obj2, i4), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void RemoteBrowserTaskScreen(final String str, BRg bRg, BFM bfm, final int i, final int i2) {
        final BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(-1768980148);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            RemoteBrowserScreenKt.RemoteBrowserScreen(str, AgentComputerApprovalBannerKt.rememberAgentComputerApprovalBanner(bfm, 0), bRg2, bfm, (iA0d & 14) | ((iA0d << 3) & 896), 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.browsertask.screen.BrowserTaskScreensKt$$ExternalSyntheticLambda2
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    String str2 = str;
                    BRg bRg3 = bRg2;
                    int i4 = i;
                    BrowserTaskScreensKt.RemoteBrowserTaskScreen(str2, bRg3, (BFM) obj, AnonymousClass011.A00(i4), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void VmBrowserTaskScreen(final boolean z, BRg bRg, BFM bfm, final int i, final int i2) {
        final BRg bRg2 = bRg;
        bfm.AgG(361927468);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0n |= 48;
        } else if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 19, 18), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            VmBrowserViewerKt.VmBrowserScreen(z, AgentComputerApprovalBannerKt.rememberAgentComputerApprovalBanner(bfm, 0), bRg2, bfm, (iA0n & 14) | ((iA0n << 3) & 896), 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.browsertask.screen.BrowserTaskScreensKt$$ExternalSyntheticLambda1
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    boolean z2 = z;
                    BRg bRg3 = bRg2;
                    int i4 = i;
                    BrowserTaskScreensKt.VmBrowserTaskScreen(z2, bRg3, (BFM) obj, AnonymousClass011.A00(i4), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final Unit LocalBrowserTaskScreen$lambda$0(String str, boolean z, BRg bRg, int i, int i2, BFM bfm, int i3) {
        LocalBrowserTaskScreen(str, z, bRg, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }

    public static final Unit RemoteBrowserTaskScreen$lambda$0(String str, BRg bRg, int i, int i2, BFM bfm, int i3) {
        RemoteBrowserTaskScreen(str, bRg, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }

    public static final Unit VmBrowserTaskScreen$lambda$0(boolean z, BRg bRg, int i, int i2, BFM bfm, int i3) {
        VmBrowserTaskScreen(z, bRg, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }
}
