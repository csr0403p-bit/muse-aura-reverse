package com.facebook.aura.conversation.api.inlineentity;

import X.AHD;
import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.B1V;
import X.BBb;
import X.BFM;
import X.C3cG;
import X.C7384Etj;
import X.G0V;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Iterator;
import kotlin.Unit;

/* loaded from: classes4.dex */
public abstract class ConversationInlineEntityIntegrationKt {

    /* renamed from: com.facebook.aura.conversation.api.inlineentity.ConversationInlineEntityIntegrationKt$ProvideRegisteredInlineEntities$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ int $index;
        public final /* synthetic */ AHD<ConversationInlineEntityIntegration> $integrations;
        public final /* synthetic */ boolean $isPrimaryThread;
        public final /* synthetic */ String $messageId;
        public final /* synthetic */ PreparedInlineEntityState $prepared;
        public final /* synthetic */ String $sessionId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(AHD<? extends ConversationInlineEntityIntegration> ahd, int i, PreparedInlineEntityState preparedInlineEntityState, String str, String str2, boolean z, G0V<? super BFM, ? super Integer, Unit> g0v, int i2) {
            super(2);
            this.$integrations = ahd;
            this.$index = i;
            this.$prepared = preparedInlineEntityState;
            this.$messageId = str;
            this.$sessionId = str2;
            this.$isPrimaryThread = z;
            this.$content = g0v;
            this.$$changed = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ConversationInlineEntityIntegrationKt.ProvideRegisteredInlineEntities(this.$integrations, this.$index, this.$prepared, this.$messageId, this.$sessionId, this.$isPrimaryThread, this.$content, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.conversation.api.inlineentity.ConversationInlineEntityIntegrationKt$ProvideRegisteredInlineEntities$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ int $index;
        public final /* synthetic */ AHD<ConversationInlineEntityIntegration> $integrations;
        public final /* synthetic */ boolean $isPrimaryThread;
        public final /* synthetic */ String $messageId;
        public final /* synthetic */ PreparedInlineEntityState $prepared;
        public final /* synthetic */ String $sessionId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(AHD<? extends ConversationInlineEntityIntegration> ahd, int i, PreparedInlineEntityState preparedInlineEntityState, String str, String str2, boolean z, G0V<? super BFM, ? super Integer, Unit> g0v) {
            super(2);
            this.$integrations = ahd;
            this.$index = i;
            this.$prepared = preparedInlineEntityState;
            this.$messageId = str;
            this.$sessionId = str2;
            this.$isPrimaryThread = z;
            this.$content = g0v;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                ConversationInlineEntityIntegrationKt.ProvideRegisteredInlineEntities(this.$integrations, this.$index + 1, this.$prepared, this.$messageId, this.$sessionId, this.$isPrimaryThread, this.$content, bfm, 0);
            } else {
                bfm.Afo();
            }
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.conversation.api.inlineentity.ConversationInlineEntityIntegrationKt$ProvideRegisteredInlineEntities$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ int $index;
        public final /* synthetic */ AHD<ConversationInlineEntityIntegration> $integrations;
        public final /* synthetic */ boolean $isPrimaryThread;
        public final /* synthetic */ String $messageId;
        public final /* synthetic */ PreparedInlineEntityState $prepared;
        public final /* synthetic */ String $sessionId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(AHD<? extends ConversationInlineEntityIntegration> ahd, int i, PreparedInlineEntityState preparedInlineEntityState, String str, String str2, boolean z, G0V<? super BFM, ? super Integer, Unit> g0v, int i2) {
            super(2);
            this.$integrations = ahd;
            this.$index = i;
            this.$prepared = preparedInlineEntityState;
            this.$messageId = str;
            this.$sessionId = str2;
            this.$isPrimaryThread = z;
            this.$content = g0v;
            this.$$changed = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ConversationInlineEntityIntegrationKt.ProvideRegisteredInlineEntities(this.$integrations, this.$index, this.$prepared, this.$messageId, this.$sessionId, this.$isPrimaryThread, this.$content, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void ProvideRegisteredInlineEntities(AHD<? extends ConversationInlineEntityIntegration> ahd, int i, PreparedInlineEntityState preparedInlineEntityState, String str, String str2, boolean z, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i2) {
        BBb bBbAAc;
        Object anonymousClass4;
        AHD<PreparedInlineEntityIntegration> ahd2;
        Object next;
        bfm.AgG(578324987);
        int iA05 = (i2 & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(ahd, bfm, i2) ? 1 : 0) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA05 |= AnonymousClass004.A0E(bfm, i);
        }
        if ((i2 & 384) == 0) {
            iA05 |= AnonymousClass003.A05(AnonymousClass004.A1Z(preparedInlineEntityState, bfm, i2) ? 1 : 0);
        }
        if ((i2 & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, str);
        }
        if ((i2 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0h(bfm, str2);
        }
        if ((196608 & i2) == 0) {
            iA05 |= AnonymousClass004.A0s(bfm, z);
        }
        if ((1572864 & i2) == 0) {
            iA05 |= AnonymousClass004.A0Z(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass007.A1J(iA05), bfm, iA05)) {
            ConversationInlineEntityIntegration conversationInlineEntityIntegration = (ConversationInlineEntityIntegration) AbstractC0878AGe.A0A(i, ahd);
            if (conversationInlineEntityIntegration == null) {
                bfm.AgE(1766221513);
                AnonymousClass003.A13(bfm, g0v, iA05 >> 18);
                AnonymousClass002.A19(bfm);
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass4 = new AnonymousClass1(ahd, i, preparedInlineEntityState, str, str2, z, g0v, i2);
                    C3cG.A1D(bBbAAc, anonymousClass4);
                }
                return;
            }
            AnonymousClass004.A1A(bfm, 1766250343);
            ConversationInlineEntityState conversationInlineEntityState = null;
            if (preparedInlineEntityState != null && (ahd2 = preparedInlineEntityState.integrations) != null) {
                Iterator it = ahd2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (C7384Etj.areEqual(((PreparedInlineEntityIntegration) next).integration, conversationInlineEntityIntegration)) {
                            break;
                        }
                    }
                }
                PreparedInlineEntityIntegration preparedInlineEntityIntegration = (PreparedInlineEntityIntegration) next;
                if (preparedInlineEntityIntegration != null) {
                    conversationInlineEntityState = preparedInlineEntityIntegration.state;
                }
            }
            int i3 = iA05 >> 6;
            conversationInlineEntityIntegration.ProvideInlineEntities(conversationInlineEntityState, str, str2, z, B1V.A00(bfm, new AnonymousClass3(ahd, i, preparedInlineEntityState, str, str2, z, g0v), -941047121), bfm, (i3 & 7168) | (i3 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | RuntimeInternals.IOPRIO_BACKGROUND | (i3 & 896));
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass4 = new AnonymousClass4(ahd, i, preparedInlineEntityState, str, str2, z, g0v, i2);
            C3cG.A1D(bBbAAc, anonymousClass4);
        }
    }
}
