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
import com.facebook.aura.partners.voice.screen.HatchVoiceAnnouncementSheetKt;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class CalendarRemindersSetHandler implements HatchNodeCommandHandler {
    public static final CalendarRemindersSetHandler INSTANCE = new CalendarRemindersSetHandler();

    @DebugMetadata(c = "com.facebook.aura.commands.calendar.CalendarRemindersSetHandler$execute$2", f = "CalendarRemindersSetHandler.kt", l = {81, 90, 107, 117, 126, 138, 147, 165, HatchVoiceAnnouncementSheetKt.NUX_FADE_IN_DELAY_MS}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.commands.calendar.CalendarRemindersSetHandler$execute$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super NodeCommandResponse>, Object> {
        public final /* synthetic */ HatchNodeCommandContext $commandContext;
        public final /* synthetic */ NodeExecutionContext $ctx;
        public final /* synthetic */ String $paramsJson;
        public int I$0;
        public int I$1;
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

        /* JADX WARN: Path cross not found for [B:58:0x01d6, B:60:0x01da], limit reached: 94 */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00cc  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0152 A[Catch: Exception -> 0x026d, TryCatch #1 {Exception -> 0x026d, blocks: (B:53:0x019e, B:54:0x01b4, B:56:0x01ba, B:61:0x01dc, B:47:0x014e, B:49:0x0152, B:71:0x024d, B:52:0x017e, B:66:0x020f, B:75:0x025d, B:46:0x014b, B:70:0x024a, B:74:0x025a), top: B:87:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x017e A[Catch: Exception -> 0x026d, TryCatch #1 {Exception -> 0x026d, blocks: (B:53:0x019e, B:54:0x01b4, B:56:0x01ba, B:61:0x01dc, B:47:0x014e, B:49:0x0152, B:71:0x024d, B:52:0x017e, B:66:0x020f, B:75:0x025d, B:46:0x014b, B:70:0x024a, B:74:0x025a), top: B:87:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:56:0x01ba A[Catch: Exception -> 0x026d, TryCatch #1 {Exception -> 0x026d, blocks: (B:53:0x019e, B:54:0x01b4, B:56:0x01ba, B:61:0x01dc, B:47:0x014e, B:49:0x0152, B:71:0x024d, B:52:0x017e, B:66:0x020f, B:75:0x025d, B:46:0x014b, B:70:0x024a, B:74:0x025a), top: B:87:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:63:0x020c  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x020f A[Catch: Exception -> 0x026d, TryCatch #1 {Exception -> 0x026d, blocks: (B:53:0x019e, B:54:0x01b4, B:56:0x01ba, B:61:0x01dc, B:47:0x014e, B:49:0x0152, B:71:0x024d, B:52:0x017e, B:66:0x020f, B:75:0x025d, B:46:0x014b, B:70:0x024a, B:74:0x025a), top: B:87:0x000c }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x017e -> B:54:0x01b4). Please report as a decompilation issue!!! */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r25) {
            /*
                Method dump skipped, instructions count: 706
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.calendar.CalendarRemindersSetHandler.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super NodeCommandResponse> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandlerRegistration
    public NodeCommandId getCommandId() {
        return NodeCommandId.CALENDAR_REMINDERS_SET;
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
        return CalendarCommandSpecs.CALENDAR_REMINDERS_SET;
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
