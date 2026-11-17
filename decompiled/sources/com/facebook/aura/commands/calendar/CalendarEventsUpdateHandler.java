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
import com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class CalendarEventsUpdateHandler implements HatchNodeCommandHandler {
    public static final CalendarEventsUpdateHandler INSTANCE = new CalendarEventsUpdateHandler();

    @DebugMetadata(c = "com.facebook.aura.commands.calendar.CalendarEventsUpdateHandler$execute$2", f = "CalendarEventsUpdateHandler.kt", l = {104, 113, 123, 132, 158, 162, HatchVoiceAnnouncementSheetKt.NUX_FADE_IN_DELAY_MS, 191, 201, 207, HatchIdeaShareImageRenderer.ILLUSTRATION_SIZE, 223, 225, 264, 283}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.commands.calendar.CalendarEventsUpdateHandler$execute$2, reason: invalid class name */
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

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Path cross not found for [B:106:0x037b, B:100:0x036b], limit reached: 180 */
        /* JADX WARN: Path cross not found for [B:112:0x0388, B:87:0x0342], limit reached: 180 */
        /* JADX WARN: Path cross not found for [B:87:0x0342, B:112:0x0388], limit reached: 180 */
        /* JADX WARN: Removed duplicated region for block: B:109:0x0383  */
        /* JADX WARN: Removed duplicated region for block: B:113:0x038a A[Catch: Exception -> 0x04e1, TryCatch #1 {Exception -> 0x04e1, blocks: (B:125:0x0411, B:126:0x0414, B:54:0x021a, B:55:0x021d, B:73:0x02d7, B:77:0x0306, B:80:0x030d, B:84:0x033b, B:85:0x033e, B:87:0x0342, B:89:0x0346, B:94:0x0359, B:95:0x035b, B:97:0x035f, B:98:0x0363, B:105:0x0375, B:107:0x037f, B:119:0x03db, B:120:0x03dd, B:121:0x03ea, B:37:0x019c, B:39:0x01a2, B:41:0x01b0, B:43:0x01b4, B:45:0x01b8, B:47:0x01bc, B:49:0x01c0, B:51:0x01c4, B:122:0x03f1, B:56:0x0221, B:60:0x0283, B:62:0x0289, B:64:0x028d, B:128:0x0419, B:132:0x0441, B:148:0x049a, B:150:0x04a0, B:151:0x04aa, B:156:0x04d5, B:106:0x037b, B:101:0x036c, B:113:0x038a, B:114:0x03ae, B:116:0x03c2, B:117:0x03c6, B:134:0x0446, B:140:0x0469, B:142:0x0476, B:146:0x0495, B:141:0x0470, B:59:0x0280, B:11:0x0096, B:131:0x043e, B:14:0x00a5, B:145:0x0492, B:76:0x0303, B:83:0x0338, B:155:0x04d2, B:36:0x018c), top: B:181:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:114:0x03ae A[Catch: Exception -> 0x04e1, TryCatch #1 {Exception -> 0x04e1, blocks: (B:125:0x0411, B:126:0x0414, B:54:0x021a, B:55:0x021d, B:73:0x02d7, B:77:0x0306, B:80:0x030d, B:84:0x033b, B:85:0x033e, B:87:0x0342, B:89:0x0346, B:94:0x0359, B:95:0x035b, B:97:0x035f, B:98:0x0363, B:105:0x0375, B:107:0x037f, B:119:0x03db, B:120:0x03dd, B:121:0x03ea, B:37:0x019c, B:39:0x01a2, B:41:0x01b0, B:43:0x01b4, B:45:0x01b8, B:47:0x01bc, B:49:0x01c0, B:51:0x01c4, B:122:0x03f1, B:56:0x0221, B:60:0x0283, B:62:0x0289, B:64:0x028d, B:128:0x0419, B:132:0x0441, B:148:0x049a, B:150:0x04a0, B:151:0x04aa, B:156:0x04d5, B:106:0x037b, B:101:0x036c, B:113:0x038a, B:114:0x03ae, B:116:0x03c2, B:117:0x03c6, B:134:0x0446, B:140:0x0469, B:142:0x0476, B:146:0x0495, B:141:0x0470, B:59:0x0280, B:11:0x0096, B:131:0x043e, B:14:0x00a5, B:145:0x0492, B:76:0x0303, B:83:0x0338, B:155:0x04d2, B:36:0x018c), top: B:181:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:134:0x0446 A[Catch: Exception -> 0x04e1, TryCatch #1 {Exception -> 0x04e1, blocks: (B:125:0x0411, B:126:0x0414, B:54:0x021a, B:55:0x021d, B:73:0x02d7, B:77:0x0306, B:80:0x030d, B:84:0x033b, B:85:0x033e, B:87:0x0342, B:89:0x0346, B:94:0x0359, B:95:0x035b, B:97:0x035f, B:98:0x0363, B:105:0x0375, B:107:0x037f, B:119:0x03db, B:120:0x03dd, B:121:0x03ea, B:37:0x019c, B:39:0x01a2, B:41:0x01b0, B:43:0x01b4, B:45:0x01b8, B:47:0x01bc, B:49:0x01c0, B:51:0x01c4, B:122:0x03f1, B:56:0x0221, B:60:0x0283, B:62:0x0289, B:64:0x028d, B:128:0x0419, B:132:0x0441, B:148:0x049a, B:150:0x04a0, B:151:0x04aa, B:156:0x04d5, B:106:0x037b, B:101:0x036c, B:113:0x038a, B:114:0x03ae, B:116:0x03c2, B:117:0x03c6, B:134:0x0446, B:140:0x0469, B:142:0x0476, B:146:0x0495, B:141:0x0470, B:59:0x0280, B:11:0x0096, B:131:0x043e, B:14:0x00a5, B:145:0x0492, B:76:0x0303, B:83:0x0338, B:155:0x04d2, B:36:0x018c), top: B:181:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:140:0x0469 A[Catch: Exception -> 0x04e1, TRY_ENTER, TryCatch #1 {Exception -> 0x04e1, blocks: (B:125:0x0411, B:126:0x0414, B:54:0x021a, B:55:0x021d, B:73:0x02d7, B:77:0x0306, B:80:0x030d, B:84:0x033b, B:85:0x033e, B:87:0x0342, B:89:0x0346, B:94:0x0359, B:95:0x035b, B:97:0x035f, B:98:0x0363, B:105:0x0375, B:107:0x037f, B:119:0x03db, B:120:0x03dd, B:121:0x03ea, B:37:0x019c, B:39:0x01a2, B:41:0x01b0, B:43:0x01b4, B:45:0x01b8, B:47:0x01bc, B:49:0x01c0, B:51:0x01c4, B:122:0x03f1, B:56:0x0221, B:60:0x0283, B:62:0x0289, B:64:0x028d, B:128:0x0419, B:132:0x0441, B:148:0x049a, B:150:0x04a0, B:151:0x04aa, B:156:0x04d5, B:106:0x037b, B:101:0x036c, B:113:0x038a, B:114:0x03ae, B:116:0x03c2, B:117:0x03c6, B:134:0x0446, B:140:0x0469, B:142:0x0476, B:146:0x0495, B:141:0x0470, B:59:0x0280, B:11:0x0096, B:131:0x043e, B:14:0x00a5, B:145:0x0492, B:76:0x0303, B:83:0x0338, B:155:0x04d2, B:36:0x018c), top: B:181:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:141:0x0470 A[Catch: Exception -> 0x04e1, TryCatch #1 {Exception -> 0x04e1, blocks: (B:125:0x0411, B:126:0x0414, B:54:0x021a, B:55:0x021d, B:73:0x02d7, B:77:0x0306, B:80:0x030d, B:84:0x033b, B:85:0x033e, B:87:0x0342, B:89:0x0346, B:94:0x0359, B:95:0x035b, B:97:0x035f, B:98:0x0363, B:105:0x0375, B:107:0x037f, B:119:0x03db, B:120:0x03dd, B:121:0x03ea, B:37:0x019c, B:39:0x01a2, B:41:0x01b0, B:43:0x01b4, B:45:0x01b8, B:47:0x01bc, B:49:0x01c0, B:51:0x01c4, B:122:0x03f1, B:56:0x0221, B:60:0x0283, B:62:0x0289, B:64:0x028d, B:128:0x0419, B:132:0x0441, B:148:0x049a, B:150:0x04a0, B:151:0x04aa, B:156:0x04d5, B:106:0x037b, B:101:0x036c, B:113:0x038a, B:114:0x03ae, B:116:0x03c2, B:117:0x03c6, B:134:0x0446, B:140:0x0469, B:142:0x0476, B:146:0x0495, B:141:0x0470, B:59:0x0280, B:11:0x0096, B:131:0x043e, B:14:0x00a5, B:145:0x0492, B:76:0x0303, B:83:0x0338, B:155:0x04d2, B:36:0x018c), top: B:181:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:144:0x0490  */
        /* JADX WARN: Removed duplicated region for block: B:148:0x049a A[Catch: Exception -> 0x04e1, TryCatch #1 {Exception -> 0x04e1, blocks: (B:125:0x0411, B:126:0x0414, B:54:0x021a, B:55:0x021d, B:73:0x02d7, B:77:0x0306, B:80:0x030d, B:84:0x033b, B:85:0x033e, B:87:0x0342, B:89:0x0346, B:94:0x0359, B:95:0x035b, B:97:0x035f, B:98:0x0363, B:105:0x0375, B:107:0x037f, B:119:0x03db, B:120:0x03dd, B:121:0x03ea, B:37:0x019c, B:39:0x01a2, B:41:0x01b0, B:43:0x01b4, B:45:0x01b8, B:47:0x01bc, B:49:0x01c0, B:51:0x01c4, B:122:0x03f1, B:56:0x0221, B:60:0x0283, B:62:0x0289, B:64:0x028d, B:128:0x0419, B:132:0x0441, B:148:0x049a, B:150:0x04a0, B:151:0x04aa, B:156:0x04d5, B:106:0x037b, B:101:0x036c, B:113:0x038a, B:114:0x03ae, B:116:0x03c2, B:117:0x03c6, B:134:0x0446, B:140:0x0469, B:142:0x0476, B:146:0x0495, B:141:0x0470, B:59:0x0280, B:11:0x0096, B:131:0x043e, B:14:0x00a5, B:145:0x0492, B:76:0x0303, B:83:0x0338, B:155:0x04d2, B:36:0x018c), top: B:181:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0134 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0179  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x01a2 A[Catch: Exception -> 0x04e1, TryCatch #1 {Exception -> 0x04e1, blocks: (B:125:0x0411, B:126:0x0414, B:54:0x021a, B:55:0x021d, B:73:0x02d7, B:77:0x0306, B:80:0x030d, B:84:0x033b, B:85:0x033e, B:87:0x0342, B:89:0x0346, B:94:0x0359, B:95:0x035b, B:97:0x035f, B:98:0x0363, B:105:0x0375, B:107:0x037f, B:119:0x03db, B:120:0x03dd, B:121:0x03ea, B:37:0x019c, B:39:0x01a2, B:41:0x01b0, B:43:0x01b4, B:45:0x01b8, B:47:0x01bc, B:49:0x01c0, B:51:0x01c4, B:122:0x03f1, B:56:0x0221, B:60:0x0283, B:62:0x0289, B:64:0x028d, B:128:0x0419, B:132:0x0441, B:148:0x049a, B:150:0x04a0, B:151:0x04aa, B:156:0x04d5, B:106:0x037b, B:101:0x036c, B:113:0x038a, B:114:0x03ae, B:116:0x03c2, B:117:0x03c6, B:134:0x0446, B:140:0x0469, B:142:0x0476, B:146:0x0495, B:141:0x0470, B:59:0x0280, B:11:0x0096, B:131:0x043e, B:14:0x00a5, B:145:0x0492, B:76:0x0303, B:83:0x0338, B:155:0x04d2, B:36:0x018c), top: B:181:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:66:0x02c3  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x02c7  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x02d7 A[Catch: Exception -> 0x04e1, TRY_ENTER, TryCatch #1 {Exception -> 0x04e1, blocks: (B:125:0x0411, B:126:0x0414, B:54:0x021a, B:55:0x021d, B:73:0x02d7, B:77:0x0306, B:80:0x030d, B:84:0x033b, B:85:0x033e, B:87:0x0342, B:89:0x0346, B:94:0x0359, B:95:0x035b, B:97:0x035f, B:98:0x0363, B:105:0x0375, B:107:0x037f, B:119:0x03db, B:120:0x03dd, B:121:0x03ea, B:37:0x019c, B:39:0x01a2, B:41:0x01b0, B:43:0x01b4, B:45:0x01b8, B:47:0x01bc, B:49:0x01c0, B:51:0x01c4, B:122:0x03f1, B:56:0x0221, B:60:0x0283, B:62:0x0289, B:64:0x028d, B:128:0x0419, B:132:0x0441, B:148:0x049a, B:150:0x04a0, B:151:0x04aa, B:156:0x04d5, B:106:0x037b, B:101:0x036c, B:113:0x038a, B:114:0x03ae, B:116:0x03c2, B:117:0x03c6, B:134:0x0446, B:140:0x0469, B:142:0x0476, B:146:0x0495, B:141:0x0470, B:59:0x0280, B:11:0x0096, B:131:0x043e, B:14:0x00a5, B:145:0x0492, B:76:0x0303, B:83:0x0338, B:155:0x04d2, B:36:0x018c), top: B:181:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0336  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x0342 A[Catch: Exception -> 0x04e1, TryCatch #1 {Exception -> 0x04e1, blocks: (B:125:0x0411, B:126:0x0414, B:54:0x021a, B:55:0x021d, B:73:0x02d7, B:77:0x0306, B:80:0x030d, B:84:0x033b, B:85:0x033e, B:87:0x0342, B:89:0x0346, B:94:0x0359, B:95:0x035b, B:97:0x035f, B:98:0x0363, B:105:0x0375, B:107:0x037f, B:119:0x03db, B:120:0x03dd, B:121:0x03ea, B:37:0x019c, B:39:0x01a2, B:41:0x01b0, B:43:0x01b4, B:45:0x01b8, B:47:0x01bc, B:49:0x01c0, B:51:0x01c4, B:122:0x03f1, B:56:0x0221, B:60:0x0283, B:62:0x0289, B:64:0x028d, B:128:0x0419, B:132:0x0441, B:148:0x049a, B:150:0x04a0, B:151:0x04aa, B:156:0x04d5, B:106:0x037b, B:101:0x036c, B:113:0x038a, B:114:0x03ae, B:116:0x03c2, B:117:0x03c6, B:134:0x0446, B:140:0x0469, B:142:0x0476, B:146:0x0495, B:141:0x0470, B:59:0x0280, B:11:0x0096, B:131:0x043e, B:14:0x00a5, B:145:0x0492, B:76:0x0303, B:83:0x0338, B:155:0x04d2, B:36:0x018c), top: B:181:0x000c }] */
        /* JADX WARN: Type inference failed for: r12v4 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0216 -> B:55:0x021d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x02cc -> B:71:0x02d3). Please report as a decompilation issue!!! */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r34) {
            /*
                Method dump skipped, instructions count: 1382
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.calendar.CalendarEventsUpdateHandler.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super NodeCommandResponse> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandlerRegistration
    public NodeCommandId getCommandId() {
        return NodeCommandId.CALENDAR_EVENTS_UPDATE;
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
        return CalendarCommandSpecs.CALENDAR_EVENTS_UPDATE;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public /* bridge */ boolean isEnabled() {
        return true;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public String validateParams(String str) {
        if (str == null) {
            return "updates_json is required";
        }
        try {
            CalendarEventsUpdateHandlerKt.parseUpdateRequests(str);
            return null;
        } catch (IllegalArgumentException e) {
            String message = e.getMessage();
            return message == null ? "Invalid calendar update parameters" : message;
        }
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
