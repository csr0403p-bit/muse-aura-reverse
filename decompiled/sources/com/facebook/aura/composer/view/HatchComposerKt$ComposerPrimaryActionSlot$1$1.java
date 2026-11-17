package com.facebook.aura.composer.view;

import X.AbstractC07539Wl;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.B6A;
import X.BFM;
import X.BRg;
import X.C0dx;
import X.C10G;
import X.C1Cd;
import X.C1D8;
import X.C1b8;
import X.C3U4;
import X.C78N;
import X.G0W;
import X.HDi;
import X.HxS;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComposerEntryPoint;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchComposerKt$ComposerPrimaryActionSlot$1$1 extends AbstractC7559F3s implements G0W<C1Cd, BFM, Integer, Unit> {
    public final /* synthetic */ HatchComposerEntryPoint $entryPoint;
    public final /* synthetic */ C0dx $haptic;
    public final /* synthetic */ boolean $isPrimaryThread;
    public final /* synthetic */ boolean $isSendBlocked;
    public final /* synthetic */ boolean $isSendEnabled;
    public final /* synthetic */ boolean $isUploading;
    public final /* synthetic */ Function0<Unit> $onBlockedSendClick;
    public final /* synthetic */ Function0<Unit> $onSendClick;
    public final /* synthetic */ String $threadId;
    public final /* synthetic */ long $userMessageBubbleColor;
    public final /* synthetic */ long $userMessageTextColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchComposerKt$ComposerPrimaryActionSlot$1$1(boolean z, long j, long j2, boolean z2, boolean z3, String str, HatchComposerEntryPoint hatchComposerEntryPoint, Function0<Unit> function0, C0dx c0dx, Function0<Unit> function02, boolean z4) {
        super(3);
        this.$isUploading = z;
        this.$userMessageBubbleColor = j;
        this.$userMessageTextColor = j2;
        this.$isSendBlocked = z2;
        this.$isPrimaryThread = z3;
        this.$threadId = str;
        this.$entryPoint = hatchComposerEntryPoint;
        this.$onBlockedSendClick = function0;
        this.$haptic = c0dx;
        this.$onSendClick = function02;
        this.$isSendEnabled = z4;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C1Cd c1Cd, BFM bfm, Integer num) {
        invoke(c1Cd, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(C1Cd c1Cd, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, c1Cd), bfm, i)) {
            int iOrdinal = -1;
            if (this.$isUploading) {
                bfm.AgE(1681054673);
                BRg bRgA07 = C10G.A07(BRg.A00, 36.0f);
                long j = this.$userMessageBubbleColor;
                AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(AbstractC07539Wl.A00(C3U4.A09(C1b8.A03(bRgA07, C1D8.A00, HxS.A04(HDi.A0O[(int) (j & 63)], B6A.A03(j), B6A.A02(j), B6A.A01(j), 0.4f)), 8.0f), "hatch-send-button-uploading"), null, this.$userMessageTextColor, bfm, 0, 2);
            } else {
                bfm.AgE(1681395084);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120722);
                String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120723);
                BRg bRgA00 = AbstractC07539Wl.A00(BRg.A00, "hatch-send-button");
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$threadId, AnonymousClass001.A1U(bfm, this.$isPrimaryThread, bfm.A66(this.$isSendBlocked)));
                HatchComposerEntryPoint hatchComposerEntryPoint = this.$entryPoint;
                if (hatchComposerEntryPoint != null) {
                    iOrdinal = hatchComposerEntryPoint.ordinal();
                }
                boolean zA1R2 = AnonymousClass001.A1R(bfm, this.$onSendClick, AnonymousClass001.A1T(bfm, this.$haptic, AnonymousClass003.A1P(bfm, this.$onBlockedSendClick, strA01, AnonymousClass001.A1a(zA1R, bfm, iOrdinal))));
                boolean z = this.$isSendBlocked;
                boolean z2 = this.$isPrimaryThread;
                String str = this.$threadId;
                HatchComposerEntryPoint hatchComposerEntryPoint2 = this.$entryPoint;
                Function0<Unit> function0 = this.$onBlockedSendClick;
                C0dx c0dx = this.$haptic;
                Function0<Unit> function02 = this.$onSendClick;
                Object objAaT = bfm.AaT();
                if (zA1R2 || objAaT == C78N.A00) {
                    objAaT = new HatchComposerKt$ComposerPrimaryActionSlot$1$1$1$1(z, z2, str, hatchComposerEntryPoint2, function0, strA01, c0dx, function02);
                    bfm.Ai0(objAaT);
                }
                HatchComposerKt.m430ActionButtongI4cVvE(R.drawable.arrow_up_wght600_outline_24, (Function0) objAaT, this.$userMessageTextColor, this.$userMessageBubbleColor, bRgA00, strA012, 8.0f, 36.0f, this.$isSendEnabled, bfm, 14180352, 0);
            }
            AnonymousClass001.A1D(bfm);
            return;
        }
        bfm.Afo();
    }
}
