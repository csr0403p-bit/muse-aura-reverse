package com.facebook.aura.nudge;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C06H;
import X.C3UX;
import X.C7384Etj;
import X.C78T;
import X.EnumC10460Hji;
import X.FGI;
import X.G0V;
import X.GAX;
import X.GAt;
import X.GBM;
import X.HtJ;
import X.Hwg;
import X.InterfaceC10560Hsz;
import android.os.SystemClock;
import com.facebook.aura.conversation.api.ConversationCardPlacement;
import com.facebook.aura.conversation.api.ConversationCardRequest;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes.dex */
public final class NudgeActionCardRequest implements ConversationCardRequest {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();

    @Deprecated
    public static final String TYPE_ID_PREFIX = "agent_";
    public final long deadlineElapsedMs;
    public final String key;
    public final String nudgeId;
    public final InterfaceC10560Hsz<NudgeOutcome> outcome;
    public final ConversationCardPlacement placement;
    public final boolean remembersDecline;
    public volatile NudgeOutcome reportedOutcome;
    public final String typeId;

    @DebugMetadata(c = "com.facebook.aura.nudge.NudgeActionCardRequest$awaitOutcome$2", f = "NudgeActionCardRequest.kt", l = {R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.nudge.NudgeActionCardRequest$awaitOutcome$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super NudgeOutcome>, Object> {
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return NudgeActionCardRequest.this.new AnonymousClass2(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C78T c78t = NudgeActionCardRequest.this.outcome;
                this.label = 1;
                obj = ((GBM) c78t).A0E(this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return obj;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super NudgeOutcome> htJ) {
            return NudgeActionCardRequest.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public NudgeActionCardRequest(String str, long j) {
        C7384Etj.A0Y(str, 0);
        this.nudgeId = str;
        this.deadlineElapsedMs = j;
        this.typeId = FGI.A0M(TYPE_ID_PREFIX, str);
        this.key = getTypeId();
        this.placement = ConversationCardPlacement.ActiveConversation.INSTANCE;
        this.outcome = new GAt(null);
    }

    public final void complete(NudgeOutcome nudgeOutcome) {
        C7384Etj.A0Y(nudgeOutcome, 0);
        if (this.reportedOutcome == null) {
            this.reportedOutcome = nudgeOutcome;
            ((GBM) this.outcome).A0R(nudgeOutcome);
        }
    }

    @Override // com.facebook.aura.conversation.api.ConversationCardRequest
    public long getDeadlineElapsedMs() {
        return this.deadlineElapsedMs;
    }

    @Override // com.facebook.aura.conversation.api.ConversationCardRequest
    public String getKey() {
        return this.key;
    }

    public final String getNudgeId() {
        return this.nudgeId;
    }

    @Override // com.facebook.aura.conversation.api.ConversationCardRequest
    public ConversationCardPlacement getPlacement() {
        return this.placement;
    }

    @Override // com.facebook.aura.conversation.api.ConversationCardRequest
    public boolean getRemembersDecline() {
        return this.remembersDecline;
    }

    public final NudgeOutcome getReportedOutcome() {
        return this.reportedOutcome;
    }

    @Override // com.facebook.aura.conversation.api.ConversationCardRequest
    public String getTypeId() {
        return this.typeId;
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final Object awaitOutcome(HtJ<? super NudgeOutcome> htJ) {
        return GAX.A01(htJ, new AnonymousClass2(null), getDeadlineElapsedMs() - SystemClock.elapsedRealtime());
    }
}
