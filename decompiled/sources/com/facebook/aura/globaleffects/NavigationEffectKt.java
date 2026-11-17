package com.facebook.aura.globaleffects;

import X.AbstractC1742Apf;
import X.AbstractC7559F3s;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.C0Hi;
import X.C1C3;
import X.C1er;
import X.C78N;
import X.G0V;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;

/* loaded from: classes2.dex */
public abstract class NavigationEffectKt {
    public static final long IME_DISMISS_TIMEOUT_MS = 400;

    /* renamed from: com.facebook.aura.globaleffects.NavigationEffectKt$NavigationEffect$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            NavigationEffectKt.NavigationEffect(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void NavigationEffect(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1Q(bfm, -151331943, i), bfm, i)) {
            AuraNavigator auraNavigatorA0b = AnonymousClass003.A0b(bfm);
            C0Hi c0Hi = (C0Hi) bfm.A6v(Am0.A05);
            C1C3 c1c3 = (C1C3) bfm.A6v(Am0.A0E);
            MutableState mutableStateA00 = C1er.A00(bfm, Boolean.valueOf(AbstractC1742Apf.A01(bfm)));
            boolean zA1X = AnonymousClass005.A1X(bfm, c1c3, auraNavigatorA0b, bfm.A65(mutableStateA00), bfm.A67(c0Hi));
            Object objAaT = bfm.AaT();
            if (zA1X || objAaT == C78N.A00) {
                objAaT = new NavigationEffectKt$NavigationEffect$1$1(mutableStateA00, c0Hi, c1c3, auraNavigatorA0b, null);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A18(bfm, objAaT, auraNavigatorA0b);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(i);
        }
    }
}
