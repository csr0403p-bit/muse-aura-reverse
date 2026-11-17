package com.facebook.aura.conversation.lifecycle;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.G0V;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.HatchSidePanelController;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class ConversationResumeResetEffectKt {
    public static final long APP_RESUME_RESET_THRESHOLD_MS = 3600000;

    /* renamed from: com.facebook.aura.conversation.lifecycle.ConversationResumeResetEffectKt$ConversationResumeResetEffect$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ HatchSidePanelController $sidePanelController;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AuraNavigator auraNavigator, HatchSidePanelController hatchSidePanelController, int i, int i2) {
            super(2);
            this.$navigator = auraNavigator;
            this.$sidePanelController = hatchSidePanelController;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ConversationResumeResetEffectKt.ConversationResumeResetEffect(this.$navigator, this.$sidePanelController, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ConversationResumeResetEffect(com.facebook.aura.navigation.AuraNavigator r6, com.facebook.aura.navigation.HatchSidePanelController r7, X.BFM r8, int r9, int r10) {
        /*
            r0 = 1133244866(0x438bf1c2, float:279.88873)
            r8.AgG(r0)
            r0 = r9 & 6
            r4 = 4
            if (r0 != 0) goto Lbe
            r0 = r10 & 1
            if (r0 != 0) goto L16
            boolean r0 = X.AnonymousClass004.A1X(r6, r8, r9)
            r3 = 4
            if (r0 != 0) goto L17
        L16:
            r3 = 2
        L17:
            r3 = r3 | r9
        L18:
            r0 = r9 & 48
            r2 = 32
            if (r0 != 0) goto L2d
            r0 = r10 & 2
            if (r0 != 0) goto L2a
            boolean r1 = X.AnonymousClass004.A1Y(r7, r8, r9)
            r0 = 32
            if (r1 != 0) goto L2c
        L2a:
            r0 = 16
        L2c:
            r3 = r3 | r0
        L2d:
            r1 = r3 & 19
            r0 = 18
            r5 = 0
            boolean r0 = X.AnonymousClass002.A1P(r1, r0)
            boolean r0 = X.AnonymousClass001.A1b(r0, r8, r3)
            if (r0 == 0) goto Lba
            r8.Afy()
            r0 = r9 & 1
            if (r0 == 0) goto La3
            boolean r0 = r8.AEk()
            if (r0 != 0) goto La3
            r8.Afo()
            r0 = r10 & 1
            if (r0 == 0) goto L52
            r3 = r3 & (-15)
        L52:
            r0 = r10 & 2
            if (r0 == 0) goto L58
        L56:
            r3 = r3 & (-113(0xffffffffffffff8f, float:NaN))
        L58:
            r8.AAb()
            r0 = r3 & 14
            r0 = r0 ^ 6
            if (r0 <= r4) goto L67
            boolean r0 = r8.A67(r6)
            if (r0 != 0) goto L6c
        L67:
            r0 = r3 & 6
            r1 = 0
            if (r0 != r4) goto L6d
        L6c:
            r1 = 1
        L6d:
            r0 = r3 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            if (r0 <= r2) goto L79
            boolean r0 = r8.A67(r7)
            if (r0 != 0) goto L7d
        L79:
            r0 = r3 & 48
            if (r0 != r2) goto L7e
        L7d:
            r5 = 1
        L7e:
            r1 = r1 | r5
            java.lang.Object r0 = r8.AaT()
            if (r1 != 0) goto L89
            java.lang.Object r1 = X.C78N.A00
            if (r0 != r1) goto L92
        L89:
            r1 = 0
            com.facebook.aura.conversation.lifecycle.ConversationResumeResetEffectKt$ConversationResumeResetEffect$1$1 r0 = new com.facebook.aura.conversation.lifecycle.ConversationResumeResetEffectKt$ConversationResumeResetEffect$1$1
            r0.<init>(r6, r7, r1)
            r8.Ai0(r0)
        L92:
            X.AnonymousClass001.A1A(r8, r0, r6, r7)
        L95:
            X.BBb r1 = r8.AAc()
            if (r1 == 0) goto La2
            com.facebook.aura.conversation.lifecycle.ConversationResumeResetEffectKt$ConversationResumeResetEffect$2 r0 = new com.facebook.aura.conversation.lifecycle.ConversationResumeResetEffectKt$ConversationResumeResetEffect$2
            r0.<init>(r6, r7, r9, r10)
            r1.A06 = r0
        La2:
            return
        La3:
            r0 = r10 & 1
            if (r0 == 0) goto Lad
            com.facebook.aura.navigation.AuraNavigator r6 = X.AnonymousClass002.A0b(r8)
            r3 = r3 & (-15)
        Lad:
            r0 = r10 & 2
            if (r0 == 0) goto L58
            X.AKH<com.facebook.aura.navigation.HatchSidePanelController> r0 = com.facebook.aura.navigation.SidePanelLocalsKt.LocalSidePanelController
            java.lang.Object r7 = r8.A6v(r0)
            com.facebook.aura.navigation.HatchSidePanelController r7 = (com.facebook.aura.navigation.HatchSidePanelController) r7
            goto L56
        Lba:
            r8.Afo()
            goto L95
        Lbe:
            r3 = r9
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.lifecycle.ConversationResumeResetEffectKt.ConversationResumeResetEffect(com.facebook.aura.navigation.AuraNavigator, com.facebook.aura.navigation.HatchSidePanelController, X.BFM, int, int):void");
    }
}
