package com.facebook.aura.conversation.view;

import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.B1V;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C10G;
import X.C1D3;
import X.C78N;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.conversation.view.richcontent.CurrentChatThreadLogMetadataKt;
import com.facebook.aura.model.ScheduledTaskCreatedPresentation;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchScheduledTaskCreatedCardKt {

    /* renamed from: com.facebook.aura.conversation.view.HatchScheduledTaskCreatedCardKt$ScheduledTaskCreatedButton$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $taskId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$taskId = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchScheduledTaskCreatedCardKt.ScheduledTaskCreatedButton(this.$taskId, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: HatchScheduledTaskCreatedCard-sW7UJKQ, reason: not valid java name */
    public static final void m662HatchScheduledTaskCreatedCardsW7UJKQ(ScheduledTaskCreatedPresentation scheduledTaskCreatedPresentation, long j, C1D3 c1d3, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        AnonymousClass002.A1A(scheduledTaskCreatedPresentation, 0, c1d3);
        bfm.AgG(1021318529);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(scheduledTaskCreatedPresentation, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0N(bfm, j);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, c1d3);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            int i4 = iA05 >> 3;
            HatchInternalLinkActionCardKt.m629InternalLinkCardContainereuL9pac(j, c1d3, C10G.A08(bRg2, 302.0f), B1V.A00(bfm, new HatchScheduledTaskCreatedCardKt$HatchScheduledTaskCreatedCard$1(scheduledTaskCreatedPresentation), 1744175005), bfm, (i4 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | (i4 & 14) | 3072, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchScheduledTaskCreatedCardKt$HatchScheduledTaskCreatedCard$2(scheduledTaskCreatedPresentation, j, c1d3, bRg2, i, i2);
        }
    }

    public static final void ScheduledTaskCreatedButton(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1131447824);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Map<String, String> mapCurrentChatThreadLogMetadata = CurrentChatThreadLogMetadataKt.currentChatThreadLogMetadata(bfm, 0);
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            HatchScreen hatchScreenA0M = AnonymousClass007.A0M(bfm);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120877);
            AuraLabelButtonStyle auraLabelButtonStyleSecondary = AuraButtonStyles.INSTANCE.secondary(null, bfm, 48, 1);
            AuraButtonSize auraButtonSize = AuraButtonSize.SMALL;
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            boolean zA1Y = AnonymousClass005.A1Y(bfm, mapCurrentChatThreadLogMetadata, auraNavigatorA0b, AnonymousClass002.A1U(bfm, hatchScreenA0M), AnonymousClass003.A1B(iA0d));
            Object objAaT = bfm.AaT();
            if (zA1Y || objAaT == C78N.A00) {
                objAaT = new HatchScheduledTaskCreatedCardKt$ScheduledTaskCreatedButton$1$1(hatchScreenA0M, str, mapCurrentChatThreadLogMetadata, auraNavigatorA0b);
                bfm.Ai0(objAaT);
            }
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, bRgA0R, auraLabelButtonStyleSecondary, auraButtonSize, null, false, false, false, false, false, null, null, (Function0) objAaT, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 196608, 0, 0, 134201285);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, bRg2, i, i2);
        }
    }

    public static final void logViewTaskClick(HatchScreen hatchScreen, String str, Map<String, String> map) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.MESSAGE_LIST, hatchScreen, HatchComponent.TASK_ACTION_BUTTON, str, map, null);
    }
}
