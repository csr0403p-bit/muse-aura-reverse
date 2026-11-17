package com.facebook.aura.vds.compose.typegroup;

import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.BFM;
import X.C1822Arm;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public abstract class AuraIconAndBodyKt {

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AuraIconAndBodyStyle.values().length];
            try {
                AnonymousClass002.A13(AuraIconAndBodyStyle.B1, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(AuraIconAndBodyStyle.B2, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(AuraIconAndBodyStyle.SUBTITLE, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(AuraIconAndBodyStyle.B2_EMPHASIZED, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(AuraIconAndBodyStyle.BODY_REGULAR, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d0  */
    /* renamed from: AuraIconAndBody-JMRm4Jw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m3098AuraIconAndBodyJMRm4Jw(X.ApQ r43, com.facebook.aura.vds.compose.typegroup.AuraIconAndBodyStyle r44, X.BRg r45, X.G0U<? super java.lang.String, kotlin.Unit> r46, long r47, com.facebook.aura.vds.compose.typegroup.Icon r49, X.C1YL r50, int r51, int r52, int r53, X.C1822Arm r54, X.BFM r55, int r56, int r57, int r58) {
        /*
            Method dump skipped, instructions count: 700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.typegroup.AuraIconAndBodyKt.m3098AuraIconAndBodyJMRm4Jw(X.ApQ, com.facebook.aura.vds.compose.typegroup.AuraIconAndBodyStyle, X.BRg, X.G0U, long, com.facebook.aura.vds.compose.typegroup.Icon, X.1YL, int, int, int, X.Arm, X.BFM, int, int, int):void");
    }

    public static final C1822Arm getText(AuraIconAndBodyStyle auraIconAndBodyStyle, BFM bfm, int i) {
        C1822Arm c1822Arm;
        int iOrdinal = auraIconAndBodyStyle.ordinal();
        if (iOrdinal == 0) {
            c1822Arm = AnonymousClass006.A0k(bfm, -1138240880).subheadlineRegular;
        } else if (iOrdinal == 1) {
            c1822Arm = AnonymousClass006.A0k(bfm, -1138238611).footnoteRegular;
        } else if (iOrdinal == 3) {
            c1822Arm = AnonymousClass006.A0k(bfm, -1138236243).caption1Regular;
        } else if (iOrdinal == 2) {
            c1822Arm = AnonymousClass006.A0k(bfm, -1138233712).footnoteEmphasized;
        } else {
            if (iOrdinal != 4) {
                AnonymousClass004.A1A(bfm, -1138242655);
                throw new NoWhenBranchMatchedException();
            }
            c1822Arm = AnonymousClass006.A0k(bfm, -1138231127).bodyRegular;
        }
        AnonymousClass002.A19(bfm);
        return c1822Arm;
    }
}
