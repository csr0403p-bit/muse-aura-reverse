package com.facebook.aura.header.view;

import X.AOP;
import X.AbstractC7559F3s;
import X.Akx;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.C1Cd;
import X.C1eL;
import X.C3UX;
import X.C78N;
import X.C78e;
import X.EnumC04711Bv;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class HatchAvatarPlaybackStateKt {
    public static final long SCROLL_SETTLE_MS = 250;

    /* renamed from: com.facebook.aura.header.view.HatchAvatarPlaybackStateKt$PauseAvatarDuringNavigation$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchAvatarPlaybackStateKt.PauseAvatarDuringNavigation(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void PauseAvatarDuringNavigation(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1Q(bfm, 922128343, i), bfm, i)) {
            HatchAvatarPlaybackState hatchAvatarPlaybackState = AnonymousClass002.A0a(bfm).avatarPlayback;
            AOP<EnumC04711Bv> aopAM0 = ((C1Cd) bfm.A6v(C1eL.A00)).AM0();
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = new Object();
                bfm.Ai0(objAaT);
            }
            boolean zA1S = AnonymousClass004.A1S(bfm, hatchAvatarPlaybackState, objAaT, bfm.A65(aopAM0));
            Object objAaT2 = bfm.AaT();
            if (zA1S || objAaT2 == obj) {
                objAaT2 = new HatchAvatarPlaybackStateKt$PauseAvatarDuringNavigation$1$1(aopAM0, hatchAvatarPlaybackState, objAaT, null);
                bfm.Ai0(objAaT2);
            }
            C78e.A02(bfm, hatchAvatarPlaybackState, aopAM0, objAaT, (G0V) objAaT2);
            boolean zA1J = AnonymousClass003.A1J(bfm, hatchAvatarPlaybackState, objAaT);
            Object objAaT3 = bfm.AaT();
            if (zA1J || objAaT3 == obj) {
                objAaT3 = new HatchAvatarPlaybackStateKt$PauseAvatarDuringNavigation$2$1(hatchAvatarPlaybackState, objAaT);
                bfm.Ai0(objAaT3);
            }
            AnonymousClass001.A19(bfm, objAaT3, hatchAvatarPlaybackState, objAaT);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(i);
        }
    }

    public static final Akx rememberAvatarScrollConnection(BFM bfm, int i) {
        HatchAvatarPlaybackState hatchAvatarPlaybackState = AnonymousClass002.A0a(bfm).avatarPlayback;
        Object objAaT = bfm.AaT();
        Object obj = C78N.A00;
        C3UX c3ux = (C3UX) AnonymousClass004.A15(bfm, objAaT, obj);
        boolean zA1K = AnonymousClass003.A1K(bfm, hatchAvatarPlaybackState, c3ux);
        Object objAaT2 = bfm.AaT();
        if (zA1K || objAaT2 == obj) {
            objAaT2 = new AvatarScrollConnection(hatchAvatarPlaybackState, c3ux);
            bfm.Ai0(objAaT2);
        }
        AvatarScrollConnection avatarScrollConnection = (AvatarScrollConnection) objAaT2;
        boolean zA67 = bfm.A67(avatarScrollConnection);
        Object objAaT3 = bfm.AaT();
        if (zA67 || objAaT3 == obj) {
            objAaT3 = new HatchAvatarPlaybackStateKt$rememberAvatarScrollConnection$1$1(avatarScrollConnection);
            bfm.Ai0(objAaT3);
        }
        AnonymousClass001.A17(bfm, objAaT3, avatarScrollConnection);
        return avatarScrollConnection;
    }
}
