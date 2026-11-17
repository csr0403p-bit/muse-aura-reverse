package com.facebook.aura.commands.calendar;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C3UX;
import X.C9oY;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.HzP;
import android.content.Context;
import com.facebook.aura.activation.view.AuraWaitlistConfettiKt;
import com.facebook.aura.commands.calendar.CalendarRepository;
import com.facebook.aura.commands.calendar.CalendarSearchMatcher;
import com.facebook.aura.common.video.HatchTransportHttpDataSourceKt;
import com.facebook.aura.nodes.core.NodeCommandId;
import com.facebook.aura.nodes.core.NodeCommandResponse;
import com.facebook.aura.nodes.core.NodeCommandSpec;
import com.facebook.aura.nodes.core.NodeExecutionContext;
import com.facebook.aura.nodes.registry.HatchNodeCommandContext;
import com.facebook.aura.nodes.registry.HatchNodeCommandHandler;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes3.dex */
public final class CalendarSearchHandler implements HatchNodeCommandHandler {
    public static final CalendarSearchHandler INSTANCE = new CalendarSearchHandler();

    public final class CheapCandidate extends C06G {
        public final double cheapScore;
        public final CalendarSearchMatcher.SearchableEvent event;
        public final CalendarRepository.SearchRow row;

        public static /* synthetic */ CheapCandidate copy$default(CheapCandidate cheapCandidate, CalendarRepository.SearchRow searchRow, CalendarSearchMatcher.SearchableEvent searchableEvent, double d, int i, Object obj) {
            if ((i & 1) != 0) {
                searchRow = cheapCandidate.row;
            }
            if ((i & 2) != 0) {
                searchableEvent = cheapCandidate.event;
            }
            if ((i & 4) != 0) {
                d = cheapCandidate.cheapScore;
            }
            return cheapCandidate.copy(searchRow, searchableEvent, d);
        }

        public final CalendarRepository.SearchRow component1() {
            return this.row;
        }

        public final CalendarSearchMatcher.SearchableEvent component2() {
            return this.event;
        }

        public final double component3() {
            return this.cheapScore;
        }

        public final double getCheapScore() {
            return this.cheapScore;
        }

        public final CalendarSearchMatcher.SearchableEvent getEvent() {
            return this.event;
        }

        public final CalendarRepository.SearchRow getRow() {
            return this.row;
        }

        public CheapCandidate(CalendarRepository.SearchRow searchRow, CalendarSearchMatcher.SearchableEvent searchableEvent, double d) {
            AnonymousClass003.A0u(searchRow, searchableEvent);
            this.row = searchRow;
            this.event = searchableEvent;
            this.cheapScore = d;
        }

        public final CheapCandidate copy(CalendarRepository.SearchRow searchRow, CalendarSearchMatcher.SearchableEvent searchableEvent, double d) {
            AnonymousClass003.A0u(searchRow, searchableEvent);
            return new CheapCandidate(searchRow, searchableEvent, d);
        }

        public boolean equals(Object obj) {
            return super.equals(obj);
        }

        public int hashCode() {
            return super.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.calendar.CalendarSearchHandler$execute$2", f = "CalendarSearchHandler.kt", l = {AuraWaitlistConfettiKt.StandardParticleCount, 107, 116, 131, 138, 145, 155, 164, 173, 181, 196, HatchTransportHttpDataSourceKt.HTTP_PARTIAL_CONTENT}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.commands.calendar.CalendarSearchHandler$execute$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super NodeCommandResponse>, Object> {
        public final /* synthetic */ HatchNodeCommandContext $commandContext;
        public final /* synthetic */ NodeExecutionContext $ctx;
        public final /* synthetic */ String $paramsJson;
        public int I$0;
        public long J$0;
        public long J$1;
        public long J$2;
        public long J$3;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public boolean Z$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchNodeCommandContext hatchNodeCommandContext, String str, NodeExecutionContext nodeExecutionContext, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$commandContext = hatchNodeCommandContext;
            this.$paramsJson = str;
            this.$ctx = nodeExecutionContext;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$commandContext, this.$paramsJson, this.$ctx, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x008e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0149  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0171 A[Catch: Exception -> 0x0223, TryCatch #3 {Exception -> 0x0223, blocks: (B:51:0x019a, B:52:0x019d, B:58:0x01ca, B:62:0x0217, B:56:0x01c4, B:57:0x01c7, B:61:0x0214, B:46:0x0169, B:48:0x0171, B:53:0x01a1), top: B:86:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:53:0x01a1 A[Catch: Exception -> 0x0223, TryCatch #3 {Exception -> 0x0223, blocks: (B:51:0x019a, B:52:0x019d, B:58:0x01ca, B:62:0x0217, B:56:0x01c4, B:57:0x01c7, B:61:0x0214, B:46:0x0169, B:48:0x0171, B:53:0x01a1), top: B:86:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0213  */
        /* JADX WARN: Type inference failed for: r7v4, types: [boolean, int] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                Method dump skipped, instructions count: 716
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.calendar.CalendarSearchHandler.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super NodeCommandResponse> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.calendar.CalendarSearchHandler", f = "CalendarSearchHandler.kt", l = {224, 241}, m = "searchEvents", v = 2)
    /* renamed from: com.facebook.aura.commands.calendar.CalendarSearchHandler$searchEvents$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public long J$0;
        public long J$1;
        public long J$2;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CalendarSearchHandler.this.searchEvents(null, null, 0L, 0L, 0L, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b A[LOOP:0: B:14:0x0045->B:16:0x004b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0167  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object searchEvents(com.facebook.aura.commands.calendar.CalendarRepository r18, java.lang.String r19, long r20, long r22, long r24, X.HtJ<? super java.util.List<com.facebook.aura.commands.calendar.CalendarEventPayloadJson>> r26) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.calendar.CalendarSearchHandler.searchEvents(com.facebook.aura.commands.calendar.CalendarRepository, java.lang.String, long, long, long, X.HtJ):java.lang.Object");
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandlerRegistration
    public NodeCommandId getCommandId() {
        return NodeCommandId.CALENDAR_SEARCH;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandlerRegistration
    public HatchNodeCommandHandler getHandler() {
        return this;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public /* bridge */ boolean getOnlySendsCard() {
        return false;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandlerRegistration
    public NodeCommandSpec getSpec() {
        return CalendarCommandSpecs.CALENDAR_SEARCH;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public /* bridge */ boolean isEnabled() {
        return true;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public /* bridge */ String validateParams(String str) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String stringParam(JsonObject jsonObject, String str) {
        JsonPrimitive jsonPrimitive;
        String strA04;
        Object obj = jsonObject.get(str);
        if (!(obj instanceof JsonPrimitive) || (jsonPrimitive = (JsonPrimitive) obj) == null || (strA04 = C9oY.A04(jsonPrimitive)) == null || strA04.length() <= 0) {
            return null;
        }
        return strA04;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public Object execute(AbstractC3358CGz abstractC3358CGz, HatchNodeCommandContext hatchNodeCommandContext, String str, NodeExecutionContext nodeExecutionContext, HtJ<? super NodeCommandResponse> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(hatchNodeCommandContext, str, nodeExecutionContext, null));
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public /* bridge */ Object optionalDevicePermissions(String str, Context context, HtJ<? super List<String>> htJ) {
        return null;
    }
}
