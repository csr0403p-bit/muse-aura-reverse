package com.facebook.aura.library.view;

import X.AGI;
import X.AIW;
import X.AKQ;
import X.AVy;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AxM;
import X.B18;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BRg;
import X.C00x;
import X.C0924AIa;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1D3;
import X.C1D8;
import X.C1DI;
import X.C1DM;
import X.C1b8;
import X.C3cG;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.F60;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.file.utils.HatchFileUIUtils;
import com.facebook.aura.file.view.api.ContentItem;
import com.facebook.aura.file.view.api.ContentTypeDetector;
import com.facebook.aura.file.view.api.ContentViewerDataHolderKt;
import com.facebook.aura.gateway.WorkspaceUriResolver;
import com.facebook.aura.library.repo.GoalAssociation;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.SpacesModalScreenKey;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class GoalAssociationUiKt {
    public static final long ASSOCIATION_ICON_FRAME_BORDER;
    public static final C1D3 ASSOCIATION_ICON_FRAME_SHAPE = C1D8.A00(8.0f);
    public static final float ASSOCIATION_ICON_FRAME_SIZE = 36.0f;

    public static final void handleGoalAssociationClick(GoalAssociation goalAssociation, String str, AuraNavigator auraNavigator, AbstractC3358CGz abstractC3358CGz, Function0<Unit> function0, Integer num) {
        C7384Etj.A0Y(goalAssociation, 0);
        AnonymousClass005.A11(str, auraNavigator, abstractC3358CGz, 1);
        C7384Etj.A0Y(function0, 4);
        HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
        HatchSurface hatchSurface = HatchSurface.GOALS;
        HatchSubsurface hatchSubsurface = HatchSubsurface.GOALS;
        HatchScreen hatchScreen = HatchScreen.GOAL_DETAIL;
        HatchComponent hatchComponent = HatchComponent.GOAL_ASSOCIATION_ROW;
        C0924AIa c0924AIaA0u = C3cG.A0u();
        AnonymousClass001.A1C(HatchMetadataKey.GOAL_ID, str, c0924AIaA0u);
        c0924AIaA0u.put(HatchMetadataKey.ASSOCIATION_TYPE.getValue(), analyticsType(goalAssociation));
        c0924AIaA0u.put(HatchMetadataKey.ASSOCIATION_ID.getValue(), goalAssociation.getAssociationId());
        if (num != null) {
            AnonymousClass006.A1B(HatchMetadataKey.ABSOLUTE_POSITION, c0924AIaA0u, num.intValue());
        }
        hatchInteractionLogger.logClick(hatchSurface, hatchSubsurface, hatchScreen, hatchComponent, null, AIW.A0K(c0924AIaA0u), null);
        if (goalAssociation instanceof GoalAssociation.Space) {
            function0.invoke();
            auraNavigator.navigate((AuraNavKey) new SpacesModalScreenKey(((GoalAssociation.Space) goalAssociation).slug, null, false), false);
            return;
        }
        if (goalAssociation instanceof GoalAssociation.Cron) {
            return;
        }
        if (!(goalAssociation instanceof GoalAssociation.Document)) {
            throw C3cG.A0q();
        }
        function0.invoke();
        GoalAssociation.Document document = (GoalAssociation.Document) goalAssociation;
        String strResolveWorkspacePath = HatchFileUIUtils.INSTANCE.resolveWorkspacePath(document.path);
        String title = document.getTitle();
        if (title == null) {
            title = C7BY.A0R(strResolveWorkspacePath, strResolveWorkspacePath, '/');
        }
        ContentViewerDataHolderKt.navigateToContentViewer(auraNavigator, AGI.A0E(new ContentItem(title, ContentTypeDetector.INSTANCE.fromFileName(strResolveWorkspacePath), strResolveWorkspacePath, WorkspaceUriResolver.INSTANCE.resolveRawAssetUrl(strResolveWorkspacePath, abstractC3358CGz), null, null, null, null, null, false, null, null, null, null, null)), 0, false, false, null, false);
    }

    static {
        long j = B6A.A01;
        ASSOCIATION_ICON_FRAME_BORDER = 218103808 << 32;
    }

    /* renamed from: GoalAssociationLeadingIcon-942rkJo, reason: not valid java name */
    public static final void m1149GoalAssociationLeadingIcon942rkJo(GoalAssociation goalAssociation, BRg bRg, float f, C1DM c1dm, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object goalAssociationUiKt$GoalAssociationLeadingIcon$4;
        AuraIconSize auraIconSize;
        BRg bRg2 = bRg;
        C1DM c1dm2 = c1dm;
        float f2 = f;
        C7384Etj.A0Y(goalAssociation, 0);
        bfm.AgG(-1808429391);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(goalAssociation, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A06(bfm, f2);
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, c1dm2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                f2 = ASSOCIATION_ICON_FRAME_SIZE;
            }
            if (i5 != 0) {
                c1dm2 = ASSOCIATION_ICON_FRAME_SHAPE;
            }
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            String imageUrl = goalAssociation.getImageUrl();
            boolean zA65 = bfm.A65(imageUrl);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = WorkspaceUriResolver.INSTANCE.resolveRawAssetUrl(imageUrl, abstractC3358CGzA0h);
                bfm.Ai0(objAaT);
            }
            String str = (String) objAaT;
            if (str != null) {
                bfm.AgE(1150207404);
                BRg bRgA03 = C11U.A03(C10G.A07(bRg2, f2), c1dm2);
                InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA03);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V != null) {
                    AnonymousClass005.A0n(bfm, bbi, function0);
                    AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
                    AuraImageKt.m2573AuraImageXRP3Ue8(str, C10G.A01, B18.A00, null, null, false, null, 0L, false, false, false, null, null, null, null, bfm, 432, 0, 32760);
                    BBI.A0R(bbi, true);
                    bBbAAc = AnonymousClass001.A0L(bfm, bbi);
                    if (bBbAAc != null) {
                        goalAssociationUiKt$GoalAssociationLeadingIcon$4 = new GoalAssociationUiKt$GoalAssociationLeadingIcon$2(goalAssociation, bRg2, f2, c1dm2, i, i2);
                        C3cG.A1D(bBbAAc, goalAssociationUiKt$GoalAssociationLeadingIcon$4);
                    }
                    return;
                }
            } else {
                BBI bbiA0M = AnonymousClass002.A0M(bfm, 1150427473);
                int iAssociationFallbackDrawable = associationFallbackDrawable(goalAssociation);
                long jAssociationFallbackColor = associationFallbackColor(goalAssociation);
                boolean zIsSelfColoredIcon = HatchFileUIUtils.INSTANCE.isSelfColoredIcon(iAssociationFallbackDrawable);
                BRg bRgA07 = C10G.A07(bRg2, f2);
                BRg bRgA00 = BRg.A00;
                BRg bRgA072 = bRgA00;
                if (!zIsSelfColoredIcon) {
                    bRgA00 = C1b8.A00(C11U.A03(C1DI.A02(bRgA00, c1dm2, 1.0f, ASSOCIATION_ICON_FRAME_BORDER), c1dm2), 0.12f, jAssociationFallbackColor);
                }
                BRg bRgThen = bRgA07.then(bRgA00);
                InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
                int iA02 = C3cG.A02(bbiA0M.A06);
                AKQ akqA042 = BBI.A04(bbiA0M);
                BRg bRgA012 = AxM.A01(bfm, bRgThen);
                Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
                if (bbiA0M.A0V != null) {
                    AnonymousClass005.A0n(bfm, bbiA0M, function02);
                    AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA042, bRgA012, iA02);
                    AVy aVyA00 = BOf.A00(bfm, iAssociationFallbackDrawable, 0);
                    if (zIsSelfColoredIcon) {
                        jAssociationFallbackColor = B6A.A07;
                        auraIconSize = AuraIconSize.LARGE;
                        bRgA072 = C10G.A07(bRgA072, f2);
                    } else {
                        auraIconSize = AuraIconSize.TINY;
                    }
                    AuraIconKt.m2567AuraIconFHprtrg(bRgA072, aVyA00, auraIconSize, null, jAssociationFallbackColor, null, bfm, (AVy.$stable << 3) | 3072, 32);
                    BBI.A0R(bbiA0M, true);
                }
            }
            C00x.A00();
            throw F60.createAndThrow();
        }
        bfm.Afo();
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            goalAssociationUiKt$GoalAssociationLeadingIcon$4 = new GoalAssociationUiKt$GoalAssociationLeadingIcon$4(goalAssociation, bRg2, f2, c1dm2, i, i2);
            C3cG.A1D(bBbAAc, goalAssociationUiKt$GoalAssociationLeadingIcon$4);
        }
    }

    public static final String analyticsType(GoalAssociation goalAssociation) {
        if (goalAssociation instanceof GoalAssociation.Space) {
            return "space";
        }
        if (goalAssociation instanceof GoalAssociation.Document) {
            return "document";
        }
        if (goalAssociation instanceof GoalAssociation.Cron) {
            return GoalDetailScreenKt.CRON_ASSOCIATION_TYPE;
        }
        throw C3cG.A0q();
    }

    public static final long associationFallbackColor(GoalAssociation goalAssociation) {
        if (goalAssociation instanceof GoalAssociation.Space) {
            return HatchFileUIUtils.ActivityIconColors.SEARCH_GRAY;
        }
        if (goalAssociation instanceof GoalAssociation.Document) {
            return HatchFileUIUtils.ActivityIconColors.EMERALD;
        }
        if (goalAssociation instanceof GoalAssociation.Cron) {
            return HatchFileUIUtils.ActivityIconColors.REMINDER_ORANGE;
        }
        throw C3cG.A0q();
    }

    public static final int associationFallbackDrawable(GoalAssociation goalAssociation) {
        if (goalAssociation instanceof GoalAssociation.Space) {
            return R.drawable.space_filled;
        }
        if (goalAssociation instanceof GoalAssociation.Document) {
            return R.drawable.hatch_file_types_artifact_40;
        }
        if (goalAssociation instanceof GoalAssociation.Cron) {
            return R.drawable.hatch_file_types_calendar_40;
        }
        throw C3cG.A0q();
    }

    public static /* synthetic */ void handleGoalAssociationClick$default(GoalAssociation goalAssociation, String str, AuraNavigator auraNavigator, AbstractC3358CGz abstractC3358CGz, Function0 function0, Integer num, int i, Object obj) {
        if ((i & 32) != 0) {
            num = null;
        }
        handleGoalAssociationClick(goalAssociation, str, auraNavigator, abstractC3358CGz, function0, num);
    }
}
