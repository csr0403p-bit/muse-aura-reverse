package com.facebook.aura.commands.calendar;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C3UX;
import X.G0V;
import X.GAo;
import X.HtJ;
import android.content.Context;
import com.facebook.aura.network.transport.flipper.FlipperNoiseReporter;
import com.facebook.aura.nodes.core.NodeCommandId;
import com.facebook.aura.nodes.core.NodeCommandResponse;
import com.facebook.aura.nodes.core.NodeCommandSpec;
import com.facebook.aura.nodes.core.NodeExecutionContext;
import com.facebook.aura.nodes.registry.HatchNodeCommandContext;
import com.facebook.aura.nodes.registry.HatchNodeCommandHandler;
import com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class CalendarRemindersListHandler implements HatchNodeCommandHandler {
    public static final CalendarRemindersListHandler INSTANCE = new CalendarRemindersListHandler();

    @DebugMetadata(c = "com.facebook.aura.commands.calendar.CalendarRemindersListHandler$execute$2", f = "CalendarRemindersListHandler.kt", l = {66, HatchIdeaShareImageRenderer.TEXT_LEFT, 91, FlipperNoiseReporter.SWITCHING_PROTOCOLS_STATUS_CODE, 109, 123, 130, 136}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.commands.calendar.CalendarRemindersListHandler$execute$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super NodeCommandResponse>, Object> {
        public final /* synthetic */ HatchNodeCommandContext $commandContext;
        public final /* synthetic */ NodeExecutionContext $ctx;
        public final /* synthetic */ String $paramsJson;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$12;
        public Object L$13;
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

        /* JADX WARN: Code restructure failed: missing block: B:18:0x00a7, code lost:
        
            if (r0 == r1) goto L19;
         */
        /* JADX WARN: Removed duplicated region for block: B:41:0x012d  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0158 A[Catch: Exception -> 0x0053, TryCatch #2 {Exception -> 0x0053, blocks: (B:48:0x019b, B:49:0x019e, B:50:0x01a4, B:52:0x01aa, B:53:0x01b8, B:43:0x0152, B:45:0x0158, B:62:0x01fe, B:11:0x0045, B:10:0x0042, B:42:0x0143), top: B:76:0x0004 }] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x01aa A[Catch: Exception -> 0x0053, LOOP:0: B:50:0x01a4->B:52:0x01aa, LOOP_END, TryCatch #2 {Exception -> 0x0053, blocks: (B:48:0x019b, B:49:0x019e, B:50:0x01a4, B:52:0x01aa, B:53:0x01b8, B:43:0x0152, B:45:0x0158, B:62:0x01fe, B:11:0x0045, B:10:0x0042, B:42:0x0143), top: B:76:0x0004 }] */
        /* JADX WARN: Removed duplicated region for block: B:62:0x01fe A[Catch: Exception -> 0x0053, TRY_ENTER, TryCatch #2 {Exception -> 0x0053, blocks: (B:48:0x019b, B:49:0x019e, B:50:0x01a4, B:52:0x01aa, B:53:0x01b8, B:43:0x0152, B:45:0x0158, B:62:0x01fe, B:11:0x0045, B:10:0x0042, B:42:0x0143), top: B:76:0x0004 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0197 -> B:49:0x019e). Please report as a decompilation issue!!! */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 608
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.calendar.CalendarRemindersListHandler.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super NodeCommandResponse> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandlerRegistration
    public NodeCommandId getCommandId() {
        return NodeCommandId.CALENDAR_REMINDERS_LIST;
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
        return CalendarCommandSpecs.CALENDAR_REMINDERS_LIST;
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
