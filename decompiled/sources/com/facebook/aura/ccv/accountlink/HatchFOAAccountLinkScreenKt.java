package com.facebook.aura.ccv.accountlink;

import X.AKL;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.C78N;
import X.C7bA;
import X.EnumC3085Bxl;
import X.G0V;
import androidx.fragment.app.FragmentActivity;
import com.facebook.aura.ccv.HatchAccountLinkingTarget;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class HatchFOAAccountLinkScreenKt {

    /* renamed from: com.facebook.aura.ccv.accountlink.HatchFOAAccountLinkScreenKt$HatchFOAAccountLinkContent$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $accountTypeWire;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, Function0<Unit> function0, int i) {
            super(2);
            this.$accountTypeWire = str;
            this.$onDismiss = function0;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchFOAAccountLinkScreenKt.HatchFOAAccountLinkContent(this.$accountTypeWire, this.$onDismiss, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void HatchFOAAccountLinkContent(String str, Function0<Unit> function0, BFM bfm, int i) {
        AnonymousClass003.A0u(str, function0);
        bfm.AgG(-1230057555);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            Object objA6v = bfm.A6v(AKL.A00);
            HatchAccountLinkingTarget hatchAccountLinkingTarget = null;
            FragmentActivity fragmentActivity = objA6v instanceof FragmentActivity ? (FragmentActivity) objA6v : null;
            Iterator<HatchAccountLinkingTarget> it = HatchAccountLinkingTarget.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                HatchAccountLinkingTarget next = it.next();
                String wireValue = next.getWireValue();
                if (wireValue != null && wireValue.equalsIgnoreCase(str)) {
                    hatchAccountLinkingTarget = next;
                    break;
                }
            }
            HatchAccountLinkingTarget hatchAccountLinkingTarget2 = hatchAccountLinkingTarget;
            EnumC3085Bxl enumC3085Bxl = EnumC3085Bxl.ON_RESUME;
            boolean zA1T = AnonymousClass001.A1T(bfm, fragmentActivity, bfm.A63(hatchAccountLinkingTarget2 != null ? hatchAccountLinkingTarget2.ordinal() : -1)) | ((iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32);
            Object objAaT = bfm.AaT();
            if (zA1T || objAaT == C78N.A00) {
                objAaT = new HatchFOAAccountLinkScreenKt$HatchFOAAccountLinkContent$1$1(hatchAccountLinkingTarget2, fragmentActivity, function0);
                bfm.Ai0(objAaT);
            }
            C7bA.A00(bfm, enumC3085Bxl, null, (Function0) objAaT, 6, 2);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, function0, i);
        }
    }
}
