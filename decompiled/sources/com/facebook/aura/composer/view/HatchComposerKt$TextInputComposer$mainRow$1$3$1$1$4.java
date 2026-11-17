package com.facebook.aura.composer.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.BFM;
import X.BRg;
import X.C78N;
import X.G2k;
import com.facebook.aura.analytics.hatch.HatchComposerEntryPoint;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchComposerKt$TextInputComposer$mainRow$1$3$1$1$4 extends AbstractC7559F3s implements G2k<String, Function0<? extends Unit>, BRg, BFM, Integer, Unit> {
    public final /* synthetic */ HatchComposerEntryPoint $entryPoint;
    public final /* synthetic */ boolean $isPrimaryThread;
    public final /* synthetic */ G2k<String, Function0<Unit>, BRg, BFM, Integer, Unit> $linkPreview;
    public final /* synthetic */ String $threadId;

    /* JADX WARN: Multi-variable type inference failed */
    public final void invoke(String str, Function0<Unit> function0, BRg bRg, BFM bfm, int i) {
        AnonymousClass005.A0x(str, function0, bRg);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg);
        }
        if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            bfm.Afo();
            return;
        }
        G2k<String, Function0<Unit>, BRg, BFM, Integer, Unit> g2k = this.$linkPreview;
        boolean zA1R = AnonymousClass001.A1R(bfm, this.$threadId, bfm.A66(this.$isPrimaryThread));
        HatchComposerEntryPoint hatchComposerEntryPoint = this.$entryPoint;
        boolean zA63 = bfm.A63(hatchComposerEntryPoint != null ? hatchComposerEntryPoint.ordinal() : -1) | zA1R | AnonymousClass001.A1O(iA0d);
        boolean z = this.$isPrimaryThread;
        String str2 = this.$threadId;
        HatchComposerEntryPoint hatchComposerEntryPoint2 = this.$entryPoint;
        Object objAaT = bfm.AaT();
        if (zA63 || objAaT == C78N.A00) {
            objAaT = new HatchComposerKt$TextInputComposer$mainRow$1$3$1$1$4$1$1(z, str2, hatchComposerEntryPoint2, function0);
            bfm.Ai0(objAaT);
        }
        g2k.invoke(str, objAaT, bRg, bfm, Integer.valueOf(iA0d & 910));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchComposerKt$TextInputComposer$mainRow$1$3$1$1$4(G2k<? super String, ? super Function0<Unit>, ? super BRg, ? super BFM, ? super Integer, Unit> g2k, boolean z, String str, HatchComposerEntryPoint hatchComposerEntryPoint) {
        super(5);
        this.$linkPreview = g2k;
        this.$isPrimaryThread = z;
        this.$threadId = str;
        this.$entryPoint = hatchComposerEntryPoint;
    }

    @Override // X.G2k
    public /* bridge */ /* synthetic */ Unit invoke(String str, Function0<? extends Unit> function0, BRg bRg, BFM bfm, Integer num) {
        invoke(str, (Function0<Unit>) function0, bRg, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
