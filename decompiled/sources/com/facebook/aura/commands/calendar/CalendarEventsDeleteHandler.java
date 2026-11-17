package com.facebook.aura.commands.calendar;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C3UX;
import X.G0V;
import X.GAo;
import X.HtJ;
import android.content.Context;
import com.facebook.aura.nodes.core.NodeCommandId;
import com.facebook.aura.nodes.core.NodeCommandResponse;
import com.facebook.aura.nodes.core.NodeCommandSpec;
import com.facebook.aura.nodes.core.NodeExecutionContext;
import com.facebook.aura.nodes.registry.HatchNodeCommandContext;
import com.facebook.aura.nodes.registry.HatchNodeCommandHandler;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class CalendarEventsDeleteHandler implements HatchNodeCommandHandler {
    public static final CalendarEventsDeleteHandler INSTANCE = new CalendarEventsDeleteHandler();

    @DebugMetadata(c = "com.facebook.aura.commands.calendar.CalendarEventsDeleteHandler$execute$2", f = "CalendarEventsDeleteHandler.kt", l = {74, 83, 100, 110, 119, 135, 138, 143, 152, 170, 180}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.commands.calendar.CalendarEventsDeleteHandler$execute$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super NodeCommandResponse>, Object> {
        public final /* synthetic */ HatchNodeCommandContext $commandContext;
        public final /* synthetic */ NodeExecutionContext $ctx;
        public final /* synthetic */ String $paramsJson;
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
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

        /* JADX WARN: Code restructure failed: missing block: B:108:0x01a9, code lost:
        
            r7.A06(r5.A00());
         */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00cb  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0172  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0174 A[Catch: Exception -> 0x0306, TryCatch #2 {Exception -> 0x0306, blocks: (B:55:0x0197, B:56:0x01a9, B:58:0x01af, B:60:0x01bd, B:62:0x01c1, B:66:0x01fa, B:70:0x0236, B:82:0x02ac, B:84:0x02b9, B:89:0x02e6, B:83:0x02b3, B:51:0x0174, B:53:0x018a, B:54:0x018f, B:67:0x020c, B:48:0x0169, B:74:0x025f, B:93:0x02f6, B:65:0x01f7, B:47:0x0166, B:78:0x02a0, B:88:0x02e3, B:92:0x02f3), top: B:107:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:58:0x01af A[Catch: Exception -> 0x0306, TryCatch #2 {Exception -> 0x0306, blocks: (B:55:0x0197, B:56:0x01a9, B:58:0x01af, B:60:0x01bd, B:62:0x01c1, B:66:0x01fa, B:70:0x0236, B:82:0x02ac, B:84:0x02b9, B:89:0x02e6, B:83:0x02b3, B:51:0x0174, B:53:0x018a, B:54:0x018f, B:67:0x020c, B:48:0x0169, B:74:0x025f, B:93:0x02f6, B:65:0x01f7, B:47:0x0166, B:78:0x02a0, B:88:0x02e3, B:92:0x02f3), top: B:107:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:74:0x025f A[Catch: Exception -> 0x0306, TryCatch #2 {Exception -> 0x0306, blocks: (B:55:0x0197, B:56:0x01a9, B:58:0x01af, B:60:0x01bd, B:62:0x01c1, B:66:0x01fa, B:70:0x0236, B:82:0x02ac, B:84:0x02b9, B:89:0x02e6, B:83:0x02b3, B:51:0x0174, B:53:0x018a, B:54:0x018f, B:67:0x020c, B:48:0x0169, B:74:0x025f, B:93:0x02f6, B:65:0x01f7, B:47:0x0166, B:78:0x02a0, B:88:0x02e3, B:92:0x02f3), top: B:107:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:82:0x02ac A[Catch: Exception -> 0x0306, TRY_ENTER, TryCatch #2 {Exception -> 0x0306, blocks: (B:55:0x0197, B:56:0x01a9, B:58:0x01af, B:60:0x01bd, B:62:0x01c1, B:66:0x01fa, B:70:0x0236, B:82:0x02ac, B:84:0x02b9, B:89:0x02e6, B:83:0x02b3, B:51:0x0174, B:53:0x018a, B:54:0x018f, B:67:0x020c, B:48:0x0169, B:74:0x025f, B:93:0x02f6, B:65:0x01f7, B:47:0x0166, B:78:0x02a0, B:88:0x02e3, B:92:0x02f3), top: B:107:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:83:0x02b3 A[Catch: Exception -> 0x0306, TryCatch #2 {Exception -> 0x0306, blocks: (B:55:0x0197, B:56:0x01a9, B:58:0x01af, B:60:0x01bd, B:62:0x01c1, B:66:0x01fa, B:70:0x0236, B:82:0x02ac, B:84:0x02b9, B:89:0x02e6, B:83:0x02b3, B:51:0x0174, B:53:0x018a, B:54:0x018f, B:67:0x020c, B:48:0x0169, B:74:0x025f, B:93:0x02f6, B:65:0x01f7, B:47:0x0166, B:78:0x02a0, B:88:0x02e3, B:92:0x02f3), top: B:107:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:86:0x02de A[RETURN] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                Method dump skipped, instructions count: 862
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.calendar.CalendarEventsDeleteHandler.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super NodeCommandResponse> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandlerRegistration
    public NodeCommandId getCommandId() {
        return NodeCommandId.CALENDAR_EVENTS_DELETE;
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
        return CalendarCommandSpecs.CALENDAR_EVENTS_DELETE;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public /* bridge */ boolean isEnabled() {
        return true;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public /* bridge */ String validateParams(String str) {
        return null;
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
