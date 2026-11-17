package com.facebook.aura.nudge;

import X.AGH;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C7384Etj;
import X.G0U;
import X.Hs1;
import X.HtJ;
import android.content.Context;
import com.facebook.aura.conversation.widget.api.ConversationCardControls;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public interface ConversationNudge {

    /* renamed from: com.facebook.aura.nudge.ConversationNudge$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static void $default$Card(ConversationNudge conversationNudge, ConversationCardControls conversationCardControls, BRg bRg, BFM bfm, int i) {
            AnonymousClass003.A0x(conversationCardControls, bRg);
            bfm.AgE(670173293);
            ConversationCardKt.ConversationCard(conversationNudge.content(bfm, (i >> 6) & 14), conversationCardControls, bRg, bfm, AnonymousClass002.A07(i << 3, ConversationCardControls.$stable << 3), 0);
            AnonymousClass001.A1D(bfm);
        }

        public static void $default$onDeclined(ConversationNudge conversationNudge) {
        }

        public static void $default$onReset(ConversationNudge conversationNudge) {
        }

        public static void $default$onShown(ConversationNudge conversationNudge) {
        }

        public static /* synthetic */ void access$onDeclined$jd(ConversationNudge conversationNudge) {
        }

        public static /* synthetic */ void access$onReset$jd(ConversationNudge conversationNudge) {
        }

        public static /* synthetic */ void access$onShown$jd(ConversationNudge conversationNudge) {
        }

        @Deprecated(level = Hs1.A03, message = "Binary compatibility stub for default parameters")
        public static /* synthetic */ void $default$Card(ConversationNudge conversationNudge, ConversationCardControls conversationCardControls, BRg bRg, BFM bfm, int i, int i2) {
            C7384Etj.A0Y(conversationCardControls, 1);
            ComposeDefaultImpls.Card$default(conversationCardControls, bRg, conversationNudge, bfm, i, i2);
        }
    }

    /* loaded from: classes.dex */
    public abstract class ComposeDefaultImpls {
        public static final void Card$default(ConversationCardControls conversationCardControls, BRg bRg, ConversationNudge conversationNudge, BFM bfm, int i, int i2) {
            BRg bRg2 = bRg;
            AnonymousClass003.A0v(conversationCardControls, conversationNudge);
            bfm.AgG(-816044417);
            int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(conversationCardControls, bfm, i) ? 1 : 0) | i : i;
            int i3 = i2 & 2;
            if (i3 != 0) {
                iA05 |= 48;
            } else if ((i & 48) == 0) {
                iA05 |= AnonymousClass004.A0e(bfm, bRg2);
            }
            if ((i & 384) == 0) {
                iA05 |= AnonymousClass003.A05(AnonymousClass004.A1Z(conversationNudge, bfm, i) ? 1 : 0);
            }
            if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA05), bfm, iA05)) {
                if (i3 != 0) {
                    bRg2 = BRg.A00;
                }
                conversationNudge.Card(conversationCardControls, bRg2, bfm, AnonymousClass002.A07(iA05, ConversationCardControls.$stable | (iA05 & 14)));
            } else {
                bfm.Afo();
            }
            BBb bBbAAc = bfm.AAc();
            if (bBbAAc != null) {
                bBbAAc.A06 = new ConversationNudge$ComposeDefaultImpls$Card$default$1(conversationCardControls, bRg2, conversationNudge, i, i2);
            }
        }
    }

    public abstract class DefaultImpls {
        @Deprecated
        public static Set<NudgeSurface> getSurfaces(ConversationNudge conversationNudge) {
            return Collections.singleton(NudgeSurface.PHONE);
        }

        @Deprecated
        public static void onDeclined(ConversationNudge conversationNudge) {
        }

        @Deprecated
        public static void onReset(ConversationNudge conversationNudge) {
        }

        @Deprecated
        public static void onShown(ConversationNudge conversationNudge) {
        }

        @Deprecated
        public static void Card(ConversationNudge conversationNudge, ConversationCardControls conversationCardControls, BRg bRg, BFM bfm, int i) {
            AnonymousClass003.A0x(conversationCardControls, bRg);
            CC.$default$Card(conversationNudge, conversationCardControls, bRg, bfm, i);
        }

        @Deprecated
        public static Map<String, String> logMetadata(ConversationNudge conversationNudge) {
            return AGH.A0E();
        }

        @Deprecated(level = Hs1.A03, message = "Binary compatibility stub for default parameters")
        @Deprecated
        public static /* synthetic */ void Card(ConversationNudge conversationNudge, ConversationCardControls conversationCardControls, BRg bRg, BFM bfm, int i, int i2) {
            C7384Etj.A0Y(conversationCardControls, 1);
            ComposeDefaultImpls.Card$default(conversationCardControls, bRg, conversationNudge, bfm, i, i2);
        }
    }

    void Card(ConversationCardControls conversationCardControls, BRg bRg, BFM bfm, int i);

    @Deprecated(level = Hs1.A03, message = "Binary compatibility stub for default parameters")
    /* synthetic */ void Card(ConversationCardControls conversationCardControls, BRg bRg, BFM bfm, int i, int i2);

    NudgeContent content(BFM bfm, int i);

    String getId();

    NudgePolicy getPolicy();

    int getPriority();

    Set<NudgeSurface> getSurfaces();

    Object isEligible(Context context, AbstractC3358CGz abstractC3358CGz, HtJ<? super Boolean> htJ);

    Map<String, String> logMetadata();

    void onDeclined();

    void onReset();

    void onShown();

    Function0<Unit> rememberAction(G0U<? super NudgeOutcome, Unit> g0u, BFM bfm, int i);
}
