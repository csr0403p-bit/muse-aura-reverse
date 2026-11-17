package com.facebook.aura.shortcut;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.C31u;
import X.C7462Ewq;
import X.C78N;
import X.G0V;
import X.InterfaceC7359EnW;
import android.content.Context;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.shortcut.MC;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class HomeScreenShortcutSyncKt {
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = {new C7462Ewq(HomeScreenShortcutSyncKt.class, "addToHomeShortcutEnabled", "getAddToHomeShortcutEnabled()Z", 1)};
    public static final C31u addToHomeShortcutEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android.enable_add_to_home_shortcut);

    /* renamed from: com.facebook.aura.shortcut.HomeScreenShortcutSyncKt$HomeScreenShortcutSync$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HomeScreenShortcutSyncKt.HomeScreenShortcutSync(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final boolean getAddToHomeShortcutEnabled() {
        return AnonymousClass001.A1X(C31u.A00(addToHomeShortcutEnabled$delegate, $$delegatedProperties));
    }

    public static final void HomeScreenShortcutSync(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1Q(bfm, -413497278, i), bfm, i)) {
            Context contextA0H = AnonymousClass002.A0H(bfm);
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            Unit unit = Unit.INSTANCE;
            boolean zA1M = AnonymousClass003.A1M(bfm, contextA0H, abstractC3358CGzA0h);
            Object objAaT = bfm.AaT();
            if (zA1M || objAaT == C78N.A00) {
                objAaT = new HomeScreenShortcutSyncKt$HomeScreenShortcutSync$1$1(contextA0H, abstractC3358CGzA0h, null);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A18(bfm, objAaT, unit);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(i);
        }
    }
}
